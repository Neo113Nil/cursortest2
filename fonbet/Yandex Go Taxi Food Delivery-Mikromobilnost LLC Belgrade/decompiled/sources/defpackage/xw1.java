package defpackage;

import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.OptionType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class xw1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OptionType.values().length];
        try {
            iArr[OptionType.ALTPIN_B.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptionType.ORIGINAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
