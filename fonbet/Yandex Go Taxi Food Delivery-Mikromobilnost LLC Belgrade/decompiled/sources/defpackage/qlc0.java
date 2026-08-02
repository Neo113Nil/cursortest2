package defpackage;

import com.yandex.plus.core.graphql.type.ARG_CHECKING_PREDICATE_TYPE;
import com.yandex.plus.core.graphql.type.COMMON_PREDICATE_TYPE;
import com.yandex.plus.core.graphql.type.COMPARISON_PREDICATE_TYPE;
import com.yandex.plus.core.graphql.type.CORNER_SETTINGS;
import com.yandex.plus.core.graphql.type.ELEMENT_LEVEL_TYPE;
import com.yandex.plus.core.graphql.type.GRADIENT_TYPE;
import com.yandex.plus.core.graphql.type.HORIZONTAL_RULE;
import com.yandex.plus.core.graphql.type.HorizontalAlignment;
import com.yandex.plus.core.graphql.type.PLAQUE_NOTIFICATION_POSITION;
import com.yandex.plus.core.graphql.type.UNIFYING_PREDICATE_TYPE;
import com.yandex.plus.core.graphql.type.VERTICAL_RULE;
import com.yandex.plus.core.graphql.type.VerticalAlignment;
import com.yandex.plus.core.graphql.type.WIDGET_TYPE;
import com.yandex.plus.core.graphql.type.WIDTH_TYPE;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class qlc0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;
    public static final /* synthetic */ int[] i;
    public static final /* synthetic */ int[] j;
    public static final /* synthetic */ int[] k;
    public static final /* synthetic */ int[] l;
    public static final /* synthetic */ int[] m;
    public static final /* synthetic */ int[] n;

    static {
        int[] iArr = new int[WIDGET_TYPE.values().length];
        try {
            iArr[WIDGET_TYPE.BALANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WIDGET_TYPE.BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WIDGET_TYPE.ICON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WIDGET_TYPE.SPACER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WIDGET_TYPE.SWITCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WIDGET_TYPE.TEXT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[WIDGET_TYPE.UNKNOWN__.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[ELEMENT_LEVEL_TYPE.values().length];
        try {
            iArr2[ELEMENT_LEVEL_TYPE.WIDGET.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ELEMENT_LEVEL_TYPE.WIDGET_GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ELEMENT_LEVEL_TYPE.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
        int[] iArr3 = new int[PLAQUE_NOTIFICATION_POSITION.values().length];
        try {
            iArr3[PLAQUE_NOTIFICATION_POSITION.BOTTOM_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[PLAQUE_NOTIFICATION_POSITION.BOTTOM_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[PLAQUE_NOTIFICATION_POSITION.TOP_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[PLAQUE_NOTIFICATION_POSITION.TOP_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[PLAQUE_NOTIFICATION_POSITION.UNKNOWN__.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        c = iArr3;
        int[] iArr4 = new int[HorizontalAlignment.values().length];
        try {
            iArr4[HorizontalAlignment.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[HorizontalAlignment.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[HorizontalAlignment.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[HorizontalAlignment.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        d = iArr4;
        int[] iArr5 = new int[VerticalAlignment.values().length];
        try {
            iArr5[VerticalAlignment.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[VerticalAlignment.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[VerticalAlignment.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[VerticalAlignment.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused23) {
        }
        e = iArr5;
        int[] iArr6 = new int[HORIZONTAL_RULE.values().length];
        try {
            iArr6[HORIZONTAL_RULE.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr6[HORIZONTAL_RULE.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[HORIZONTAL_RULE.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[HORIZONTAL_RULE.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused27) {
        }
        f = iArr6;
        int[] iArr7 = new int[VERTICAL_RULE.values().length];
        try {
            iArr7[VERTICAL_RULE.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr7[VERTICAL_RULE.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr7[VERTICAL_RULE.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr7[VERTICAL_RULE.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused31) {
        }
        g = iArr7;
        int[] iArr8 = new int[WIDTH_TYPE.values().length];
        try {
            iArr8[WIDTH_TYPE.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr8[WIDTH_TYPE.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr8[WIDTH_TYPE.FIX.ordinal()] = 3;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr8[WIDTH_TYPE.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused35) {
        }
        h = iArr8;
        int[] iArr9 = new int[GRADIENT_TYPE.values().length];
        try {
            iArr9[GRADIENT_TYPE.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr9[GRADIENT_TYPE.RADIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr9[GRADIENT_TYPE.TRANSPARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr9[GRADIENT_TYPE.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused39) {
        }
        i = iArr9;
        int[] iArr10 = new int[CORNER_SETTINGS.values().length];
        try {
            iArr10[CORNER_SETTINGS.FIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr10[CORNER_SETTINGS.HALF_HEIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr10[CORNER_SETTINGS.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused42) {
        }
        j = iArr10;
        int[] iArr11 = new int[COMMON_PREDICATE_TYPE.values().length];
        try {
            iArr11[COMMON_PREDICATE_TYPE.ARG_CHECKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr11[COMMON_PREDICATE_TYPE.BOOLEAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr11[COMMON_PREDICATE_TYPE.COMPARISON.ordinal()] = 3;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr11[COMMON_PREDICATE_TYPE.CONTAINS.ordinal()] = 4;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr11[COMMON_PREDICATE_TYPE.IN_SET.ordinal()] = 5;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr11[COMMON_PREDICATE_TYPE.NOT.ordinal()] = 6;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr11[COMMON_PREDICATE_TYPE.UNIFYING.ordinal()] = 7;
        } catch (NoSuchFieldError unused49) {
        }
        k = iArr11;
        int[] iArr12 = new int[ARG_CHECKING_PREDICATE_TYPE.values().length];
        try {
            iArr12[ARG_CHECKING_PREDICATE_TYPE.BOOL.ordinal()] = 1;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr12[ARG_CHECKING_PREDICATE_TYPE.IS_NULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr12[ARG_CHECKING_PREDICATE_TYPE.NOT_NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr12[ARG_CHECKING_PREDICATE_TYPE.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused53) {
        }
        l = iArr12;
        int[] iArr13 = new int[COMPARISON_PREDICATE_TYPE.values().length];
        try {
            iArr13[COMPARISON_PREDICATE_TYPE.EQ.ordinal()] = 1;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr13[COMPARISON_PREDICATE_TYPE.GT.ordinal()] = 2;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr13[COMPARISON_PREDICATE_TYPE.GTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr13[COMPARISON_PREDICATE_TYPE.LT.ordinal()] = 4;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr13[COMPARISON_PREDICATE_TYPE.LTE.ordinal()] = 5;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr13[COMPARISON_PREDICATE_TYPE.UNKNOWN__.ordinal()] = 6;
        } catch (NoSuchFieldError unused59) {
        }
        m = iArr13;
        int[] iArr14 = new int[UNIFYING_PREDICATE_TYPE.values().length];
        try {
            iArr14[UNIFYING_PREDICATE_TYPE.ALL_OF.ordinal()] = 1;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr14[UNIFYING_PREDICATE_TYPE.ANY_OF.ordinal()] = 2;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr14[UNIFYING_PREDICATE_TYPE.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused62) {
        }
        n = iArr14;
    }
}
