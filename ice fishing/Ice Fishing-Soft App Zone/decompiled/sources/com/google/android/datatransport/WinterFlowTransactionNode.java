package com.google.android.datatransport;

import android.text.Layout;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowTransactionNode {
    public static final Layout.Alignment WinterFlowHookDataSource;
    public static final Layout.Alignment WinterFlowRouterStructure;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (WinterFlowManagerRequest.WinterFlowThreadListener(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        WinterFlowRouterStructure = alignment;
        WinterFlowHookDataSource = alignment2;
    }
}
