package defpackage;

import com.ybsdk.widgets.common.rangedatepicker.SelectionMode;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class r6i0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SelectionMode.values().length];
        try {
            iArr[SelectionMode.START_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectionMode.END_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
