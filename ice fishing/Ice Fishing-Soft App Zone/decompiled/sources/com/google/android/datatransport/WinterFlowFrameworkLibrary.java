package com.google.android.datatransport;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkLibrary extends com.google.android.gms.common.internal.WinterFlowSyntaxEvent {
    public final Bundle WinterFlowArrayHelper;
    public final boolean WinterFlowBackendCacheManager;
    public final Integer WinterFlowCompilerVariable;
    public final WinterFlowSchedulerParser WinterFlowEventEmitterController;

    public WinterFlowFrameworkLibrary(Context context, Looper looper, WinterFlowSchedulerParser winterFlowSchedulerParser, Bundle bundle, WinterFlowAlgorithmPlatform winterFlowAlgorithmPlatform, WinterFlowJSONHelper winterFlowJSONHelper) {
        super(context, looper, 44, winterFlowSchedulerParser, winterFlowAlgorithmPlatform, winterFlowJSONHelper);
        this.WinterFlowBackendCacheManager = true;
        this.WinterFlowEventEmitterController = winterFlowSchedulerParser;
        this.WinterFlowArrayHelper = bundle;
        this.WinterFlowCompilerVariable = (Integer) winterFlowSchedulerParser.WinterFlowHookDataSource;
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final String WinterFlowResponseEngine() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final IInterface WinterFlowRouterStructure(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof WinterFlowBandwidthSystem ? (WinterFlowBandwidthSystem) queryLocalInterface : new WinterFlowBandwidthSystem(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final boolean WinterFlowServiceUtility() {
        return this.WinterFlowBackendCacheManager;
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final String WinterFlowSyntax() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final int WinterFlowTransactionManagerStrategy() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.WinterFlowSyntaxEvent
    public final Bundle WinterFlowVariableVersionControl() {
        WinterFlowSchedulerParser winterFlowSchedulerParser = this.WinterFlowEventEmitterController;
        boolean equals = this.WinterFlowCacheManagerAgent.getPackageName().equals((String) winterFlowSchedulerParser.WinterFlowRouterStructure);
        Bundle bundle = this.WinterFlowArrayHelper;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) winterFlowSchedulerParser.WinterFlowRouterStructure);
        }
        return bundle;
    }
}
