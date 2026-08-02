package defpackage;

import com.yandex.go.summary.ui.model.common.tooltip.TooltipAlignment;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class wpv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TooltipAlignment.values().length];
        try {
            iArr[TooltipAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TooltipAlignment.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TooltipAlignment.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
