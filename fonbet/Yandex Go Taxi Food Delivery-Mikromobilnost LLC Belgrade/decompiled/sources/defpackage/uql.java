package defpackage;

import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class uql {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DividerType.values().length];
        try {
            iArr[DividerType.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DividerType.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DividerType.ICON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DividerType.ICON_MARGIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DividerType.ICON_HALF_MARGIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DividerType.MARGIN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DividerType.MARGIN_0_75.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
