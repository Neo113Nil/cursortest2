package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import android.os.Build;
import android.util.Size;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.AutoValue_ImmutableImageInfo;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.AutoValue_Packet;
import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewView;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.CueEncoder;
import androidx.media3.ui.PlayerView;
import androidx.room.CoroutinesRoom;
import androidx.room.TransactorKt;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.toolbox.HurlStack;
import com.bumptech.glide.GlideBuilder$1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import net.oneformapp.ProfileStore_;
import utils.AnyUtilsKt;
import utils.StringUtilsKt;
import xyz.block.genie.expressions.EvalHelpersKt;

/* loaded from: classes3.dex */
public final class ProcessingNode {
    public CueEncoder mBitmap2JpegBytes;
    public final Executor mBlockingExecutor;
    public final CameraCharacteristics mCameraCharacteristics;
    public Toolbar.AnonymousClass1 mDngImage2Disk;
    public final boolean mHasIncorrectJpegMetadataQuirk;
    public CoroutinesRoom.Companion mImage2Bitmap;
    public Recorder.AnonymousClass6 mImage2JpegBytes;
    public CoroutinesRoom.Companion mInput2Packet;
    public AutoValue_ProcessingNode_In mInputEdge;
    public HurlStack mJpegBytes2CroppedBitmap;
    public GlideBuilder$1 mJpegBytes2Disk;
    public Transition.AnonymousClass1 mJpegBytes2Image;
    public CueEncoder mJpegImage2Result;
    public final Quirks mQuirks;

    public ProcessingNode(Executor executor, CameraCharacteristics cameraCharacteristics) {
        Quirks quirks = DeviceQuirks.sQuirks;
        if (DeviceQuirks.sQuirks.get(LowMemoryQuirk.class) != null) {
            this.mBlockingExecutor = new SequentialExecutor(executor);
        } else {
            this.mBlockingExecutor = executor;
        }
        this.mCameraCharacteristics = cameraCharacteristics;
        this.mQuirks = quirks;
        this.mHasIncorrectJpegMetadataQuirk = quirks.contains(IncorrectJpegMetadataQuirk.class);
    }

    public final ImageProxy processInMemoryCapture(AutoValue_ProcessingNode_InputPacket autoValue_ProcessingNode_InputPacket) {
        StringUtilsKt.d("ProcessingNode", "processInMemoryCapture: request ID = " + autoValue_ProcessingNode_InputPacket.processingRequest.mRequestId);
        ProcessingRequest processingRequest = autoValue_ProcessingNode_InputPacket.processingRequest;
        AutoValue_Packet autoValue_Packet = (AutoValue_Packet) this.mInput2Packet.apply(autoValue_ProcessingNode_InputPacket);
        ArrayList arrayList = this.mInputEdge.outputFormats;
        TransactorKt.checkArgument(!arrayList.isEmpty());
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if ((autoValue_Packet.f846format == 35 || this.mHasIncorrectJpegMetadataQuirk) && intValue == 256) {
            AutoValue_Packet autoValue_Packet2 = (AutoValue_Packet) this.mImage2JpegBytes.apply(new AutoValue_Image2JpegBytes_In(autoValue_Packet, processingRequest.mJpegQuality));
            Size size = autoValue_Packet2.size;
            this.mJpegBytes2Image.getClass();
            ProfileStore_ profileStore_ = new ProfileStore_(AnyUtilsKt.createIsolatedReader(size.getWidth(), size.getHeight(), 256, 2));
            ImageProxy convertJpegBytesToImage = ImageProcessingUtil.convertJpegBytesToImage(profileStore_, (byte[]) autoValue_Packet2.data);
            profileStore_.safeClose();
            Objects.requireNonNull(convertJpegBytesToImage);
            Exif exif = autoValue_Packet2.exif;
            Objects.requireNonNull(exif);
            Rect rect = autoValue_Packet2.cropRect;
            int i = autoValue_Packet2.rotationDegrees;
            Matrix matrix = autoValue_Packet2.sensorToBufferTransform;
            CameraCaptureResult cameraCaptureResult = autoValue_Packet2.cameraCaptureResult;
            ForwardingImageProxy forwardingImageProxy = (ForwardingImageProxy) convertJpegBytesToImage;
            Size size2 = new Size(forwardingImageProxy.getWidth(), forwardingImageProxy.getHeight());
            forwardingImageProxy.getFormat();
            autoValue_Packet = new AutoValue_Packet(convertJpegBytesToImage, exif, forwardingImageProxy.getFormat(), size2, rect, i, matrix, cameraCaptureResult);
        }
        this.mJpegImage2Result.getClass();
        ImageProxy imageProxy = (ImageProxy) autoValue_Packet.data;
        SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy, autoValue_Packet.size, new AutoValue_ImmutableImageInfo(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), autoValue_Packet.rotationDegrees, autoValue_Packet.sensorToBufferTransform, imageProxy.getImageInfo().getFlashState()));
        settableImageProxy.setCropRect(autoValue_Packet.cropRect);
        if (arrayList.size() > 1) {
            processingRequest.mTakePictureRequest.markFormatProcessStatusInSimultaneousCapture(settableImageProxy.getFormat());
        }
        return settableImageProxy;
    }

    public final CoroutinesRoom.Companion processOnDiskCapture(AutoValue_ProcessingNode_InputPacket autoValue_ProcessingNode_InputPacket) {
        StringUtilsKt.d("ProcessingNode", "processOnDiskCapture: request ID = " + autoValue_ProcessingNode_InputPacket.processingRequest.mRequestId);
        ArrayList arrayList = this.mInputEdge.outputFormats;
        TransactorKt.checkArgument(arrayList.isEmpty() ^ true);
        Integer num = (Integer) arrayList.get(0);
        int intValue = num.intValue();
        TransactorKt.checkArgument("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: " + num, ImageUtil.isJpegFormats(intValue) || intValue == 32);
        ProcessingRequest processingRequest = autoValue_ProcessingNode_InputPacket.processingRequest;
        UseCaseGroup useCaseGroup = processingRequest.mOutputFileOptions;
        AutoValue_TakePictureRequest autoValue_TakePictureRequest = processingRequest.mTakePictureRequest;
        int i = processingRequest.mJpegQuality;
        TransactorKt.checkArgument("OutputFileOptions cannot be empty", useCaseGroup != null);
        AutoValue_Packet autoValue_Packet = (AutoValue_Packet) this.mInput2Packet.apply(autoValue_ProcessingNode_InputPacket);
        AutoValue_Packet autoValue_Packet2 = null;
        if (arrayList.size() > 1) {
            TransactorKt.checkArgument("The number of OutputFileOptions for simultaneous capture should be at least two", false);
            if (autoValue_Packet.f846format != 32) {
                throw null;
            }
            Objects.requireNonNull(useCaseGroup);
            CoroutinesRoom.Companion saveRawToDisk = saveRawToDisk(autoValue_Packet, useCaseGroup);
            autoValue_TakePictureRequest.markFormatProcessStatusInSimultaneousCapture(32);
            return saveRawToDisk;
        }
        if (intValue == 32) {
            Objects.requireNonNull(useCaseGroup);
            return saveRawToDisk(autoValue_Packet, useCaseGroup);
        }
        Objects.requireNonNull(useCaseGroup);
        AutoValue_Packet autoValue_Packet3 = (AutoValue_Packet) this.mImage2JpegBytes.apply(new AutoValue_Image2JpegBytes_In(autoValue_Packet, i));
        if (TransformUtils.hasCropping(autoValue_Packet3.cropRect, autoValue_Packet3.size)) {
            TransactorKt.checkState(null, ImageUtil.isJpegFormats(autoValue_Packet3.f846format));
            this.mJpegBytes2CroppedBitmap.getClass();
            Rect rect = autoValue_Packet3.cropRect;
            byte[] bArr = (byte[]) autoValue_Packet3.data;
            try {
                Bitmap decodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
                Exif exif = autoValue_Packet3.exif;
                Objects.requireNonNull(exif);
                Rect rect2 = new Rect(0, 0, decodeRegion.getWidth(), decodeRegion.getHeight());
                int i2 = autoValue_Packet3.rotationDegrees;
                Matrix matrix = autoValue_Packet3.sensorToBufferTransform;
                RectF rectF = TransformUtils.NORMALIZED_RECT;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                CameraCaptureResult cameraCaptureResult = autoValue_Packet3.cameraCaptureResult;
                Size size = new Size(decodeRegion.getWidth(), decodeRegion.getHeight());
                if (cameraCaptureResult != null) {
                    this.mBitmap2JpegBytes.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    decodeRegion.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                    autoValue_Packet2 = new AutoValue_Packet(byteArrayOutputStream.toByteArray(), exif, (Build.VERSION.SDK_INT < 34 || !PlayerView.Api34.hasGainmap(decodeRegion)) ? 256 : 4101, size, rect2, i2, matrix2, cameraCaptureResult);
                } else {
                    a$$ExternalSyntheticBUOutline0.m$2("Null cameraCaptureResult");
                }
                autoValue_Packet3 = autoValue_Packet2;
            } catch (IOException e) {
                throw new ImageCaptureException(1, "Failed to decode JPEG.", e);
            }
        }
        GlideBuilder$1 glideBuilder$1 = this.mJpegBytes2Disk;
        Objects.requireNonNull(useCaseGroup);
        glideBuilder$1.getClass();
        File createTempFile = EvalHelpersKt.createTempFile(useCaseGroup);
        byte[] bArr2 = (byte[]) autoValue_Packet3.data;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                fileOutputStream.write(bArr2, 0, new PreviewView.AnonymousClass1(9).getValidDataLength(bArr2));
                fileOutputStream.close();
                Exif exif2 = autoValue_Packet3.exif;
                Objects.requireNonNull(exif2);
                int i3 = autoValue_Packet3.rotationDegrees;
                try {
                    Exif.AnonymousClass1 anonymousClass1 = Exif.DATE_FORMAT;
                    Exif exif3 = new Exif(new ExifInterface(createTempFile.toString()));
                    exif2.copyToCroppedImage(exif3);
                    if (exif3.getRotation() == 0 && i3 != 0) {
                        exif3.rotate(i3);
                    }
                    exif3.save();
                    EvalHelpersKt.moveFileToTarget(createTempFile, useCaseGroup);
                    return new CoroutinesRoom.Companion(3);
                } catch (IOException e2) {
                    throw new ImageCaptureException(1, "Failed to update Exif data", e2);
                }
            } finally {
            }
        } catch (IOException e3) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e3);
        }
    }

    public final CoroutinesRoom.Companion saveRawToDisk(AutoValue_Packet autoValue_Packet, UseCaseGroup useCaseGroup) {
        int i = 0;
        if (this.mDngImage2Disk == null) {
            CameraCharacteristics cameraCharacteristics = this.mCameraCharacteristics;
            if (cameraCharacteristics == null) {
                throw new ImageCaptureException(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (autoValue_Packet.cameraCaptureResult.getCaptureResult() == null) {
                throw new ImageCaptureException(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CaptureResult captureResult = autoValue_Packet.cameraCaptureResult.getCaptureResult();
            Objects.requireNonNull(captureResult);
            DngCreator dngCreator = new DngCreator(cameraCharacteristics, captureResult);
            Toolbar.AnonymousClass1 anonymousClass1 = new Toolbar.AnonymousClass1();
            anonymousClass1.this$0 = dngCreator;
            this.mDngImage2Disk = anonymousClass1;
        }
        Toolbar.AnonymousClass1 anonymousClass12 = this.mDngImage2Disk;
        ImageProxy imageProxy = (ImageProxy) autoValue_Packet.data;
        int i2 = autoValue_Packet.rotationDegrees;
        Objects.requireNonNull(useCaseGroup);
        if (imageProxy == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null imageProxy");
            return null;
        }
        anonymousClass12.getClass();
        File createTempFile = EvalHelpersKt.createTempFile(useCaseGroup);
        DngCreator dngCreator2 = (DngCreator) anonymousClass12.this$0;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    if (i2 == 0) {
                        i = 1;
                    } else if (i2 == 90) {
                        i = 6;
                    } else if (i2 == 180) {
                        i = 3;
                    } else if (i2 == 270) {
                        i = 8;
                    }
                    try {
                        dngCreator2.setOrientation(i);
                        dngCreator2.writeImage(fileOutputStream, imageProxy.getImage());
                        fileOutputStream.close();
                        imageProxy.close();
                        EvalHelpersKt.moveFileToTarget(createTempFile, useCaseGroup);
                        return new CoroutinesRoom.Companion(3);
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IllegalStateException e) {
                    throw new ImageCaptureException(1, "Not enough metadata information has been set to write a well-formatted DNG file", e);
                }
            } catch (IOException e2) {
                throw new ImageCaptureException(1, "Failed to write to temp file", e2);
            } catch (IllegalArgumentException e3) {
                throw new ImageCaptureException(1, "Image with an unsupported format was used", e3);
            }
        } catch (Throwable th3) {
            imageProxy.close();
            throw th3;
        }
    }
}
