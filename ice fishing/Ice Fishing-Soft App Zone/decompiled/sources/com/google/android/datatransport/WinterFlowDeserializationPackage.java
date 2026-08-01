package com.google.android.datatransport;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationPackage extends ClickableSpan {
    public final WinterFlowSessionScheduler WinterFlowVariableVersionControl;

    public WinterFlowDeserializationPackage(WinterFlowSessionScheduler winterFlowSessionScheduler) {
        this.WinterFlowVariableVersionControl = winterFlowSessionScheduler;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.WinterFlowVariableVersionControl.getClass();
    }
}
