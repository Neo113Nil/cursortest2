package defpackage;

import com.ybsdk.widgets.common.rangedatepicker.MonthHeaderState;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class qf7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MonthHeaderState.values().length];
        try {
            iArr[MonthHeaderState.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MonthHeaderState.SELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
