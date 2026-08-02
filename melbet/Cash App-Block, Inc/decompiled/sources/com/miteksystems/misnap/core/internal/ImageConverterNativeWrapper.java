package com.miteksystems.misnap.core.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Size;
import com.appsflyer.AppsFlyerProperties;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010!\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0082 ¢\u0006\u0004\b!\u0010\"J8\u0010#\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0082 ¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/miteksystems/misnap/core/internal/ImageConverterNativeWrapper;", "", "", "image", "", "forceGray", "Lcom/miteksystems/misnap/core/internal/DecodedImage;", "decodeJpg", "([BZ)Lcom/miteksystems/misnap/core/internal/DecodedImage;", "", "width", "height", "rgbaFrameToGrayscale", "([BII)Lcom/miteksystems/misnap/core/internal/DecodedImage;", "grayscaleToRgba", "([BII)[B", "Ljava/nio/ByteBuffer;", "yBuffer", "uBuffer", "vBuffer", "yRowStride", "uvRowStride", "uvPixStride", "yuv420888ToNv21", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIII)[B", "nv21", "calculateLumaFromNv21", "([BII)I", AppsFlyerProperties.CHANNEL, "padding", "pixelStride", "arrayOffset", "arraySize", "stripSingleChannelByteArrayPadding", "([BIIIIII)[B", "stripSingleChannelByteBufferPadding", "(Ljava/nio/ByteBuffer;IIII)[B", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ImageConverterNativeWrapper {
    public static final Object b = new Object();

    public static FrameWrapper a(ImageConverterNativeWrapper imageConverterNativeWrapper, byte[] bArr) {
        FrameWrapper frameWrapper;
        imageConverterNativeWrapper.getClass();
        synchronized (b) {
            try {
                DecodedImage decodeJpg = imageConverterNativeWrapper.decodeJpg(bArr, false);
                if (decodeJpg.getData().length == 0) {
                    FrameWrapper a = imageConverterNativeWrapper.a(bArr);
                    frameWrapper = new FrameWrapper(a.a, a.b, a.c, a.d);
                } else {
                    frameWrapper = new FrameWrapper(new Size(decodeJpg.getWidth(), decodeJpg.getHeight()), SVG$Unit$EnumUnboxingLocalUtility.getA(decodeJpg.getBytesPerPixel() == 1 ? 3 : 6), 0, decodeJpg.getData());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return frameWrapper;
    }

    private final native int calculateLumaFromNv21(byte[] nv21, int width, int height);

    private final native DecodedImage decodeJpg(byte[] image, boolean forceGray);

    private final native byte[] grayscaleToRgba(byte[] image, int width, int height);

    private final native DecodedImage rgbaFrameToGrayscale(byte[] image, int width, int height);

    private final native byte[] stripSingleChannelByteArrayPadding(byte[] channel, int width, int height, int padding, int pixelStride, int arrayOffset, int arraySize);

    private final native byte[] stripSingleChannelByteBufferPadding(ByteBuffer channel, int width, int height, int padding, int pixelStride);

    private final native byte[] yuv420888ToNv21(ByteBuffer yBuffer, ByteBuffer uBuffer, ByteBuffer vBuffer, int yRowStride, int uvRowStride, int uvPixStride, int width, int height);

    public final FrameWrapper a(byte[] bArr) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        decodeByteArray.getClass();
        Size size = new Size(decodeByteArray.getWidth(), decodeByteArray.getHeight());
        ByteBuffer allocate = ByteBuffer.allocate(decodeByteArray.getHeight() * decodeByteArray.getWidth() * 4);
        allocate.order(ByteOrder.nativeOrder());
        decodeByteArray.copyPixelsToBuffer(allocate);
        allocate.rewind();
        byte[] array2 = allocate.array();
        array2.getClass();
        FrameWrapper frameWrapper = new FrameWrapper(size, 5, 0, array2);
        decodeByteArray.recycle();
        return frameWrapper;
    }
}
