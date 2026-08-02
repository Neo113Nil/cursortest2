package defpackage;

import com.yandex.urbanads.internal.flex.UrbanAdsTheme;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class we21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UrbanAdsTheme.values().length];
        try {
            iArr[UrbanAdsTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UrbanAdsTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
