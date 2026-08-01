package com.google.android.datatransport;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStackService extends ClickableSpan {
    public final WinterFlowFrameworkDataSource WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowStackService(int i, WinterFlowFrameworkDataSource winterFlowFrameworkDataSource, int i2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowFrameworkDataSource;
        this.WinterFlowUnitTestResponse = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.WinterFlowVariableVersionControl);
        this.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure.performAction(this.WinterFlowUnitTestResponse, bundle);
    }
}
