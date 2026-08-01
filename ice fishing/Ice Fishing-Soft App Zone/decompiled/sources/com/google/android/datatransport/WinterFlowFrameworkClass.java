package com.google.android.datatransport;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkClass extends com.google.android.gms.common.internal.WinterFlowSyntaxEvent {
    public final WinterFlowDecoratorDeserialization WinterFlowBackendCacheManager;

    public WinterFlowFrameworkClass(Context context, Looper looper, WinterFlowSchedulerParser winterFlowSchedulerParser, WinterFlowDecoratorDeserialization winterFlowDecoratorDeserialization, WinterFlowCacheTransactionManager winterFlowCacheTransactionManager, WinterFlowCacheTransactionManager winterFlowCacheTransactionManager2) {
        super(context, looper, 270, winterFlowSchedulerParser, winterFlowCacheTransactionManager, winterFlowCacheTransactionManager2);
        this.WinterFlowBackendCacheManager = winterFlowDecoratorDeserialization;
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final WinterFlowDebugDatabaseSchema[] WinterFlowArrayNetwork() {
        return WinterFlowCloudStack.WinterFlowResponseEngine;
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final String WinterFlowResponseEngine() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final IInterface WinterFlowRouterStructure(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof WinterFlowIDERuntime ? (WinterFlowIDERuntime) queryLocalInterface : new WinterFlowIDERuntime(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final String WinterFlowSyntax() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final boolean WinterFlowTransactionAgent() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final int WinterFlowTransactionManagerStrategy() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final Bundle WinterFlowVariableVersionControl() {
        this.WinterFlowBackendCacheManager.getClass();
        return new Bundle();
    }
}
