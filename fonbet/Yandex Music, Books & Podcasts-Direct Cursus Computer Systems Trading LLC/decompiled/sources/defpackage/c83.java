package defpackage;

import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;

/* loaded from: classes4.dex */
public final class c83 implements x73 {
    public static final c83 a = new c83();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // defpackage.x73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap g(Bitmap bitmap, float f) {
        Image image;
        ImageReader imageReader;
        RenderNode renderNode;
        HardwareRenderer hardwareRenderer;
        HardwareBuffer hardwareBuffer = null;
        try {
            imageReader = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            image = null;
            imageReader = null;
            renderNode = null;
        }
        try {
            renderNode = new RenderNode("BlurEffect");
            try {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            image = null;
            renderNode = null;
            hardwareRenderer = renderNode;
            if (hardwareBuffer != null) {
                hardwareBuffer.close();
            }
            if (image != null) {
                image.close();
            }
            if (imageReader != null) {
                imageReader.close();
            }
            if (renderNode != null) {
                renderNode.discardDisplayList();
            }
            if (hardwareRenderer != 0) {
                hardwareRenderer.destroy();
            }
            throw th;
        }
        try {
            hardwareRenderer = new HardwareRenderer();
            try {
                hardwareRenderer.setSurface(imageReader.getSurface());
                hardwareRenderer.setContentRoot(renderNode);
                renderNode.setPosition(0, 0, imageReader.getWidth(), imageReader.getHeight());
                RenderEffect createBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP);
                createBlurEffect.getClass();
                renderNode.setRenderEffect(createBlurEffect);
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.getClass();
                beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                renderNode.endRecording();
                hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                image = imageReader.acquireNextImage();
                if (image == null) {
                    throw new RuntimeException("No Image");
                }
                try {
                    HardwareBuffer hardwareBuffer2 = image.getHardwareBuffer();
                    if (hardwareBuffer2 == null) {
                        throw new RuntimeException("No HardwareBuffer");
                    }
                    try {
                        Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer2, null);
                        if (wrapHardwareBuffer == null) {
                            throw new RuntimeException("Create Bitmap Failed");
                        }
                        hardwareBuffer2.close();
                        image.close();
                        imageReader.close();
                        renderNode.discardDisplayList();
                        hardwareRenderer.destroy();
                        return wrapHardwareBuffer;
                    } catch (Throwable th5) {
                        th = th5;
                        hardwareBuffer = hardwareBuffer2;
                        if (hardwareBuffer != null) {
                        }
                        if (image != null) {
                        }
                        if (imageReader != null) {
                        }
                        if (renderNode != null) {
                        }
                        if (hardwareRenderer != 0) {
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                image = null;
            }
        } catch (Throwable th8) {
            th = th8;
            image = null;
            hardwareRenderer = 0;
            if (hardwareBuffer != null) {
            }
            if (image != null) {
            }
            if (imageReader != null) {
            }
            if (renderNode != null) {
            }
            if (hardwareRenderer != 0) {
            }
            throw th;
        }
    }
}
