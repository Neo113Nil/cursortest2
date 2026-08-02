package defpackage;

import io.flutter.plugins.camerax.AspectRatio;
import io.flutter.plugins.camerax.AspectRatioStrategyFallbackRule;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class u83 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AspectRatioStrategyFallbackRule.values().length];
        b = iArr;
        try {
            iArr[AspectRatioStrategyFallbackRule.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[AspectRatioStrategyFallbackRule.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[AspectRatioStrategyFallbackRule.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[AspectRatio.values().length];
        a = iArr2;
        try {
            iArr2[AspectRatio.RATIO16TO9.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[AspectRatio.RATIO4TO3.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[AspectRatio.RATIO_DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[AspectRatio.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
