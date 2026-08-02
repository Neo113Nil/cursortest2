package defpackage;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class za30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MotionSchemeKeyTokens.values().length];
        try {
            iArr[MotionSchemeKeyTokens.DefaultSpatial.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MotionSchemeKeyTokens.FastSpatial.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MotionSchemeKeyTokens.SlowSpatial.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MotionSchemeKeyTokens.DefaultEffects.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MotionSchemeKeyTokens.FastEffects.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MotionSchemeKeyTokens.SlowEffects.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
