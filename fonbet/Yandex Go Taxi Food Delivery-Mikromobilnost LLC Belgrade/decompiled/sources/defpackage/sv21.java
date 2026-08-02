package defpackage;

import ru.yandex.taxi.requirements.ui.selector.usual.OptionViewType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class sv21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OptionViewType.values().length];
        try {
            iArr[OptionViewType.RADIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptionViewType.CHECKBOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OptionViewType.SPINNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
