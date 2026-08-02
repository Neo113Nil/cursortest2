package defpackage;

import ru.yandex.taxi.address.models.SourcePicker;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class w9l0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SourcePicker.values().length];
        try {
            iArr[SourcePicker.A_FROM_HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SourcePicker.A_FROM_SUMMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SourcePicker.B_FROM_HOME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SourcePicker.B_FROM_SUMMARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SourcePicker.ADDITIONAL_FROM_SUMMARY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
