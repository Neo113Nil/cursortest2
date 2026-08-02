package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.nio.ByteBuffer;
import java.util.Locale;
import net.oneformapp.ProfileStore_;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public abstract class ImageProcessingUtil {
    public static int sImageCount;

    public final class NV21ImageProxy extends ForwardingImageProxy {
        public final int mHeight;
        public final ImageProxy.PlaneProxy[] mPlanes;
        public final int mWidth;

        public NV21ImageProxy(ImageProxy imageProxy, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
            super(imageProxy);
            this.mPlanes = new ImageProxy.PlaneProxy[]{new NV21PlaneProxy(i, byteBuffer), new NV21PlaneProxy(byteBuffer2, i), new NV21PlaneProxy(byteBuffer3, i)};
            this.mWidth = i;
            this.mHeight = i2;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final int getHeight() {
            return this.mHeight;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final ImageProxy.PlaneProxy[] getPlanes() {
            return this.mPlanes;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final int getWidth() {
            return this.mWidth;
        }
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void applyPixelShiftForYUV(ImageProxy imageProxy) {
        if (!isSupportedYUVFormat(imageProxy)) {
            StringUtilsKt.e("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        if (nativeShiftPixel(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, width, height, pixelStride, pixelStride2, pixelStride2) != 0) {
            StringUtilsKt.e("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static ImageProxy convertJpegBytesToImage(ProfileStore_ profileStore_, byte[] bArr) {
        TransactorKt.checkArgument(profileStore_.getImageFormat() == 256);
        bArr.getClass();
        Surface surface = profileStore_.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            StringUtilsKt.e("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        ImageProxy acquireLatestImage = profileStore_.acquireLatestImage();
        if (acquireLatestImage == null) {
            StringUtilsKt.e("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return acquireLatestImage;
    }

    public static Bitmap convertYUVToBitmap(ImageProxy imageProxy) {
        if (imageProxy.getFormat() != 35) {
            a$$ExternalSyntheticBUOutline0.m$3("Input image format must be YUV_420_888");
            return null;
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        Bitmap createBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, createBitmap, createBitmap.getRowBytes(), width, height) == 0) {
            return createBitmap;
        }
        a$$ExternalSyntheticBUOutline0.m("YUV to RGB conversion failed");
        return null;
    }

    public static SingleCloseImageProxy convertYUVToRGB(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ByteBuffer byteBuffer, int i, boolean z) {
        if (!isSupportedYUVFormat(imageProxy)) {
            StringUtilsKt.e("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!isSupportedRotationDegrees(i)) {
            StringUtilsKt.e("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = imageReaderProxy.getSurface();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        if (nativeConvertAndroid420ToABGR(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, surface, byteBuffer, width, height, z ? pixelStride : 0, z ? pixelStride2 : 0, z ? pixelStride2 : 0, i) != 0) {
            StringUtilsKt.e("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            StringUtilsKt.d("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - currentTimeMillis) + "], image count: " + sImageCount);
            sImageCount = sImageCount + 1;
        }
        ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (acquireLatestImage == null) {
            StringUtilsKt.e("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(acquireLatestImage);
        singleCloseImageProxy.addOnImageCloseListener(new ImageProcessingUtil$$ExternalSyntheticLambda0(acquireLatestImage, imageProxy, 0));
        return singleCloseImageProxy;
    }

    public static void copyBitmapToByteBuffer(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void copyByteBufferToBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean isSupportedRotationDegrees(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    public static boolean isSupportedYUVFormat(ImageProxy imageProxy) {
        return imageProxy.getFormat() == 35 && imageProxy.getPlanes().length == 3;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static SingleCloseImageProxy rotateYUV(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        SingleCloseImageProxy singleCloseImageProxy;
        if (!isSupportedYUVFormat(imageProxy)) {
            StringUtilsKt.e("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!isSupportedRotationDegrees(i)) {
            StringUtilsKt.e("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i > 0) {
            int width = imageProxy.getWidth();
            int height = imageProxy.getHeight();
            int rowStride = imageProxy.getPlanes()[0].getRowStride();
            int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
            int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
            int pixelStride = imageProxy.getPlanes()[1].getPixelStride();
            Image dequeueInputImage = imageWriter.dequeueInputImage();
            if (dequeueInputImage != null) {
                singleCloseImageProxy = null;
                if (nativeRotateYUV(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, dequeueInputImage.getPlanes()[0].getBuffer(), dequeueInputImage.getPlanes()[0].getRowStride(), dequeueInputImage.getPlanes()[0].getPixelStride(), dequeueInputImage.getPlanes()[1].getBuffer(), dequeueInputImage.getPlanes()[1].getRowStride(), dequeueInputImage.getPlanes()[1].getPixelStride(), dequeueInputImage.getPlanes()[2].getBuffer(), dequeueInputImage.getPlanes()[2].getRowStride(), dequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
                    imageWriter.queueInputImage(dequeueInputImage);
                    ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
                    if (acquireLatestImage == null) {
                        StringUtilsKt.e("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                        return null;
                    }
                    SingleCloseImageProxy singleCloseImageProxy2 = new SingleCloseImageProxy(acquireLatestImage);
                    singleCloseImageProxy2.addOnImageCloseListener(new ImageProcessingUtil$$ExternalSyntheticLambda0(acquireLatestImage, imageProxy, 1));
                    return singleCloseImageProxy2;
                }
                StringUtilsKt.e("ImageProcessingUtil", "rotate YUV failure");
                return singleCloseImageProxy;
            }
        }
        singleCloseImageProxy = null;
        StringUtilsKt.e("ImageProcessingUtil", "rotate YUV failure");
        return singleCloseImageProxy;
    }

    public static SingleCloseImageProxy rotateYUVAndConvertToNV21(ImageProxy imageProxy, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        if (!isSupportedYUVFormat(imageProxy)) {
            StringUtilsKt.e("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!isSupportedRotationDegrees(i)) {
            StringUtilsKt.e("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i == 0 && imageProxy.getPlanes().length == 3 && imageProxy.getPlanes()[1].getPixelStride() == 2 && nativeGetYUVImageVUOff(imageProxy.getPlanes()[2].getBuffer(), imageProxy.getPlanes()[1].getBuffer()) == -1) {
            return null;
        }
        int i2 = i % EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        int width = i2 == 0 ? imageProxy.getWidth() : imageProxy.getHeight();
        int height = i2 == 0 ? imageProxy.getHeight() : imageProxy.getWidth();
        ByteBuffer nativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(imageProxy.getPlanes()[0].getBuffer(), imageProxy.getPlanes()[0].getRowStride(), imageProxy.getPlanes()[1].getBuffer(), imageProxy.getPlanes()[1].getRowStride(), imageProxy.getPlanes()[2].getBuffer(), imageProxy.getPlanes()[2].getRowStride(), imageProxy.getPlanes()[2].getPixelStride(), byteBuffer4, width, 1, nativeNewDirectByteBuffer, width, 2, byteBuffer5, width, 2, byteBuffer, byteBuffer2, byteBuffer3, imageProxy.getWidth(), imageProxy.getHeight(), i) == 0) {
            return new SingleCloseImageProxy(new NV21ImageProxy(imageProxy, byteBuffer4, nativeNewDirectByteBuffer, byteBuffer5, width, height));
        }
        StringUtilsKt.e("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    public static void writeJpegBytesToSurface(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            StringUtilsKt.e("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    public final class NV21PlaneProxy implements ImageProxy.PlaneProxy {
        public final /* synthetic */ int $r8$classId = 1;
        public final ByteBuffer mByteBuffer;
        public final int mRowStride;

        public NV21PlaneProxy(int i, ByteBuffer byteBuffer) {
            this.mRowStride = i;
            this.mByteBuffer = byteBuffer;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final ByteBuffer getBuffer() {
            switch (this.$r8$classId) {
            }
            return this.mByteBuffer;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final int getPixelStride() {
            switch (this.$r8$classId) {
                case 0:
                    return 2;
                default:
                    return 1;
            }
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final int getRowStride() {
            switch (this.$r8$classId) {
            }
            return this.mRowStride;
        }

        public NV21PlaneProxy(ByteBuffer byteBuffer, int i) {
            this.mByteBuffer = byteBuffer;
            this.mRowStride = i;
        }
    }
}
