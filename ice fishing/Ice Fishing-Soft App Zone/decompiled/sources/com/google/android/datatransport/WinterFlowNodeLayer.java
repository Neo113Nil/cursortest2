package com.google.android.datatransport;

import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNodeLayer implements WinterFlowDeserializationProcess {
    public final Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final Object WinterFlowVariableVersionControl;

    public WinterFlowNodeLayer() {
        this.WinterFlowVariableVersionControl = new WeakHashMap();
        this.WinterFlowTransactionManagerStrategy = new WeakHashMap();
        this.WinterFlowUnitTestResponse = new WeakHashMap();
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationProcess
    public /* synthetic */ void WinterFlowRouterStructure(WinterFlowExceptionParser winterFlowExceptionParser) {
        WinterFlowProviderUserManager winterFlowProviderUserManager = (WinterFlowProviderUserManager) this.WinterFlowVariableVersionControl;
        String str = (String) this.WinterFlowTransactionManagerStrategy;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.WinterFlowUnitTestResponse;
        WinterFlowParserRequest winterFlowParserRequest = winterFlowProviderUserManager.WinterFlowRouterStructure;
        synchronized (winterFlowParserRequest) {
            winterFlowParserRequest.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public /* synthetic */ WinterFlowNodeLayer(WinterFlowProviderUserManager winterFlowProviderUserManager, String str, ScheduledFuture scheduledFuture) {
        this.WinterFlowVariableVersionControl = winterFlowProviderUserManager;
        this.WinterFlowTransactionManagerStrategy = str;
        this.WinterFlowUnitTestResponse = scheduledFuture;
    }
}
