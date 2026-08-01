package com.google.android.datatransport;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerEventEmitter extends View {
    public final /* synthetic */ WinterFlowInvokerManager WinterFlowVariableVersionControl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowConsumerEventEmitter(WinterFlowInvokerManager winterFlowInvokerManager, Context context) {
        super(context);
        this.WinterFlowVariableVersionControl = winterFlowInvokerManager;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.WinterFlowVariableVersionControl.run();
    }
}
