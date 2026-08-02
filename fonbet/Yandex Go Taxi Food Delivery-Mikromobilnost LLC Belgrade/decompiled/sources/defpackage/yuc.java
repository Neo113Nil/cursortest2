package defpackage;

import ru.yandex.taxi.design.CompanionTextStyle;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class yuc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CompanionTextStyle.values().length];
        try {
            iArr[CompanionTextStyle.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CompanionTextStyle.STRONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CompanionTextStyle.ROBUST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CompanionTextStyle.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CompanionTextStyle.MEDIUM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
