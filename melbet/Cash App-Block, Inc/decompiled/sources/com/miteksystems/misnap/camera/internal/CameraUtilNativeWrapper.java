package com.miteksystems.misnap.camera.internal;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import com.appsflyer.AppsFlyerProperties;
import com.miteksystems.misnap.core.Frame;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001JF\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJn\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/miteksystems/misnap/camera/internal/CameraUtilNativeWrapper;", "", "Ljava/nio/ByteBuffer;", AppsFlyerProperties.CHANNEL, "", "width", "height", "rotationDegrees", "", "Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "frameInfos", "Landroidx/camera/core/ImageProxy;", "proxy", "Lcom/miteksystems/misnap/camera/internal/CameraFrame;", "process", "(Ljava/nio/ByteBuffer;III[Lcom/miteksystems/misnap/core/Frame$FrameInfo;Landroidx/camera/core/ImageProxy;)Lcom/miteksystems/misnap/camera/internal/CameraFrame;", "yBuffer", "uBuffer", "vBuffer", "yRowStride", "uvRowStride", "uvPixStride", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII[Lcom/miteksystems/misnap/core/Frame$FrameInfo;Landroidx/camera/core/ImageProxy;)Lcom/miteksystems/misnap/camera/internal/CameraFrame;", "camera_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CameraUtilNativeWrapper {
    private final native CameraFrame process(ByteBuffer channel, int width, int height, int rotationDegrees, Frame.FrameInfo[] frameInfos, ImageProxy proxy);

    private final native CameraFrame process(ByteBuffer yBuffer, ByteBuffer uBuffer, ByteBuffer vBuffer, int yRowStride, int uvRowStride, int uvPixStride, int width, int height, int rotationDegrees, Frame.FrameInfo[] frameInfos, ImageProxy proxy);

    public final /* synthetic */ CameraFrame a(ImageProxy imageProxy) {
        imageProxy.getClass();
        int format2 = imageProxy.getFormat();
        if (format2 == 35) {
            ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
            buffer.getClass();
            ByteBuffer buffer2 = imageProxy.getPlanes()[1].getBuffer();
            buffer2.getClass();
            ByteBuffer buffer3 = imageProxy.getPlanes()[2].getBuffer();
            buffer3.getClass();
            return process(buffer, buffer2, buffer3, imageProxy.getPlanes()[0].getRowStride(), imageProxy.getPlanes()[1].getRowStride(), imageProxy.getPlanes()[1].getPixelStride(), imageProxy.getWidth(), imageProxy.getHeight(), imageProxy.getImageInfo().getRotationDegrees(), new Frame.FrameInfo[]{new Frame.FrameInfo.TimingFrameInfo(imageProxy.getImageInfo().getTimestamp())}, imageProxy);
        }
        if (format2 == 256) {
            ByteBuffer buffer4 = imageProxy.getPlanes()[0].getBuffer();
            buffer4.getClass();
            return process(buffer4, imageProxy.getWidth(), imageProxy.getHeight(), imageProxy.getImageInfo().getRotationDegrees(), new Frame.FrameInfo[]{new Frame.FrameInfo.TimingFrameInfo(imageProxy.getImageInfo().getTimestamp())}, imageProxy);
        }
        Log.e("CameraUtil", "Unsupported image format: " + imageProxy.getFormat());
        return new CameraFrame(new Size(imageProxy.getWidth(), imageProxy.getHeight()), imageProxy.getFormat(), imageProxy.getImageInfo().getRotationDegrees(), new byte[0], new Frame.FrameInfo[]{new Frame.FrameInfo.TimingFrameInfo(imageProxy.getImageInfo().getTimestamp())}, imageProxy, null, 64, null);
    }
}
