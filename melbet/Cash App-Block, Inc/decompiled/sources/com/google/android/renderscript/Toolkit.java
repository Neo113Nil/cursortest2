package com.google.android.renderscript;

import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import okio.Path$$ExternalSyntheticBUOutline0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/renderscript/Toolkit;", "", "", "createNative", "()J", "nativeHandle", "Landroid/graphics/Bitmap;", "inputBitmap", "outputBitmap", "", "coefficients", "Lcom/google/android/renderscript/Range2d;", "restriction", "", "nativeConvolveBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V", "renderscript-toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Toolkit {
    public static final Toolkit INSTANCE;
    public static final long nativeHandle;

    static {
        Toolkit toolkit = new Toolkit();
        INSTANCE = toolkit;
        try {
            System.loadLibrary("renderscript-toolkit");
            nativeHandle = toolkit.createNative();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static Bitmap convolve$default(Bitmap bitmap, float[] fArr) {
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2 && bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            a$$ExternalSyntheticBUOutline0.m("RenderScript Toolkit. convolve supports only ARGB_8888 and ALPHA_8 bitmaps. ", bitmap.getConfig(), " provided.");
            return null;
        }
        if (ToolkitKt.vectorSize(bitmap) * bitmap.getWidth() != bitmap.getRowBytes()) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(ToolkitKt.vectorSize(bitmap), ".", Recorder$$ExternalSyntheticOutline2.m107m(bitmap.getRowBytes(), bitmap.getWidth(), "RenderScript Toolkit convolve. Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=", ", width={", ", and vectorSize=")));
            return null;
        }
        if (fArr.length != 9 && fArr.length != 25) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(fArr.length, "RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. ", " coefficients provided."));
            return null;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config3 = bitmap.getConfig();
        if (config3 != null) {
            config2 = config3;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config2);
        createBitmap.getClass();
        INSTANCE.nativeConvolveBitmap(nativeHandle, bitmap, createBitmap, fArr, null);
        return createBitmap;
    }

    private final native long createNative();

    private final native void nativeConvolveBitmap(long nativeHandle2, Bitmap inputBitmap, Bitmap outputBitmap, float[] coefficients, Range2d restriction);
}
