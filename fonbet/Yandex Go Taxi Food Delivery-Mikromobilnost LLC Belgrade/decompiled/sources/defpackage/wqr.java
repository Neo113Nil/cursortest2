package defpackage;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class wqr {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FlowLayoutOverflow$OverflowType.values().length];
        try {
            iArr[FlowLayoutOverflow$OverflowType.ExpandIndicator.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
