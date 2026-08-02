package defpackage;

import ru.yandex.taxi.masstransit.ui.stopsline.LineState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class xhy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LineState.values().length];
        try {
            iArr[LineState.SECONDARY_TO_MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LineState.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LineState.SECONDARY_TO_NONE_POINT_MAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LineState.SECONDARY_POINT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LineState.MAIN_TO_NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LineState.MAIN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[LineState.MAIN_POINT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[LineState.MAIN_TO_SECONDARY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[LineState.NONE_TO_SECONDARY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[LineState.NONE_TO_MAIN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
    }
}
