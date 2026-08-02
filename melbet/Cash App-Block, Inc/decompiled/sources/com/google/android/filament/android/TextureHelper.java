package com.google.android.filament.android;

import android.graphics.Bitmap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;

/* loaded from: classes6.dex */
public abstract class TextureHelper {

    /* renamed from: com.google.android.filament.android.TextureHelper$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.HARDWARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static native void nSetBitmap(long j, long j2, int i, int i2, int i3, int i4, int i5, Bitmap bitmap, int i6);

    public static void setBitmap(Engine engine, Texture texture, Bitmap bitmap) {
        int i;
        int width = texture.getWidth();
        int height = texture.getHeight();
        int i2 = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[bitmap.getConfig().ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            i3 = 3;
            if (i2 == 3) {
                i = 2;
            } else if (i2 == 5) {
                i3 = 4;
            } else if (i2 == 6) {
                i = 5;
            }
            if (i != 2 || i == 5) {
                a$$ExternalSyntheticBUOutline0.m$3("Unsupported config: ARGB_4444 or HARDWARE");
            } else {
                nSetBitmap(texture.getNativeObject(), engine.getNativeObject(), 0, 0, 0, width, height, bitmap, i);
                return;
            }
        }
        i = i3;
        if (i != 2) {
        }
        a$$ExternalSyntheticBUOutline0.m$3("Unsupported config: ARGB_4444 or HARDWARE");
    }
}
