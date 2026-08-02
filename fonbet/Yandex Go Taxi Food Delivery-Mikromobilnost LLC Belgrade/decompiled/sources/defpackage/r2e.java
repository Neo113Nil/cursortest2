package defpackage;

import ru.yandex.taxi.altpins.models.OptionType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class r2e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OptionType.values().length];
        try {
            iArr[OptionType.ALTPIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptionType.ORIGINAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
