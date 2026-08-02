package defpackage;

import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class v39 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CashbackBadgeStyle.values().length];
        try {
            iArr[CashbackBadgeStyle.LIGHT_GRADIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CashbackBadgeStyle.DARK_GRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CashbackBadgeStyle.LIGHT_GRAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CashbackBadgeStyle.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CashbackBadgeStyle.DARK_GRADIENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
