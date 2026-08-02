package defpackage;

import ru.yandex.taxi.banners.PromoBannerActivationStatus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class yq4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PromoBannerActivationStatus.values().length];
        try {
            iArr[PromoBannerActivationStatus.ACTIVATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PromoBannerActivationStatus.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
