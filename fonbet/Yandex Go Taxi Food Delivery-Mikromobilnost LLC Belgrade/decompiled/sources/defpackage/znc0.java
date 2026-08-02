package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkComparePredicateModel$CompareType;
import com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel$HorizontalGravity;
import com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel$VerticalGravity;
import com.yandex.plus.home.datasource.openapi.models.NetworkLineWidgetGroupModel$Orientation;
import com.yandex.plus.home.datasource.openapi.models.NetworkNotificationModel$Position;
import com.yandex.plus.home.datasource.openapi.models.NetworkStyledTextItemModel$TextStyle;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class znc0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[NetworkLineWidgetGroupModel$Orientation.values().length];
        try {
            iArr[NetworkLineWidgetGroupModel$Orientation.IN_ROW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkLineWidgetGroupModel$Orientation.IN_COLUMN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[NetworkComparePredicateModel$CompareType.values().length];
        try {
            iArr2[NetworkComparePredicateModel$CompareType.EQUALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[NetworkComparePredicateModel$CompareType.GREATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NetworkComparePredicateModel$CompareType.GREATER_OR_EQUALS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[NetworkComparePredicateModel$CompareType.LESSER.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[NetworkComparePredicateModel$CompareType.LESSER_OR_EQUALS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[NetworkNotificationModel$Position.values().length];
        try {
            iArr3[NetworkNotificationModel$Position.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[NetworkNotificationModel$Position.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[NetworkDisplayRulesModel$HorizontalGravity.values().length];
        try {
            iArr4[NetworkDisplayRulesModel$HorizontalGravity.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[NetworkDisplayRulesModel$HorizontalGravity.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[NetworkDisplayRulesModel$HorizontalGravity.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
        int[] iArr5 = new int[NetworkDisplayRulesModel$VerticalGravity.values().length];
        try {
            iArr5[NetworkDisplayRulesModel$VerticalGravity.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[NetworkDisplayRulesModel$VerticalGravity.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[NetworkDisplayRulesModel$VerticalGravity.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        e = iArr5;
        int[] iArr6 = new int[NetworkStyledTextItemModel$TextStyle.values().length];
        try {
            iArr6[NetworkStyledTextItemModel$TextStyle.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr6[NetworkStyledTextItemModel$TextStyle.ITALIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        f = iArr6;
    }
}
