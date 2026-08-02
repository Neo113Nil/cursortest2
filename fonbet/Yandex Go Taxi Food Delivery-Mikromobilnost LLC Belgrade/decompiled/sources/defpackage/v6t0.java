package defpackage;

import com.yandex.go.taxi.summary.api.model.TariffCardMode;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class v6t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TariffCardMode.values().length];
        try {
            iArr[TariffCardMode.LATE_INIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TariffCardMode.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
