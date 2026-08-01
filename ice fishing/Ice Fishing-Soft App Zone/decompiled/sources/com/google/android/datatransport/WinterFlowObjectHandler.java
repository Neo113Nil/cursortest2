package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectHandler extends WinterFlowThreadVersionControl implements Parcelable, WinterFlowTransactionUnitTest, WinterFlowBatchCacheManager, WinterFlowThreadPoolGateway {
    public static final Parcelable.Creator<WinterFlowObjectHandler> CREATOR = new WinterFlowStackFramework(5);
    public WinterFlowPackageModule WinterFlowTransactionManagerStrategy;

    public WinterFlowObjectHandler(float f) {
        WinterFlowJSONModule WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
        WinterFlowPackageModule winterFlowPackageModule = new WinterFlowPackageModule(WinterFlowRouterRouter.WinterFlowUnitTestResponse(), f);
        if (!(WinterFlowRouterRouter instanceof WinterFlowSerializerScheduler)) {
            winterFlowPackageModule.WinterFlowHookDataSource = new WinterFlowPackageModule(1L, f);
        }
        this.WinterFlowTransactionManagerStrategy = winterFlowPackageModule;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final WinterFlowOrchestrationInvoker WinterFlowArrayNetwork(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker, WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker2, WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker3) {
        if (((WinterFlowPackageModule) winterFlowOrchestrationInvoker2).WinterFlowCacheManagerAgent == ((WinterFlowPackageModule) winterFlowOrchestrationInvoker3).WinterFlowCacheManagerAgent) {
            return winterFlowOrchestrationInvoker2;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final void WinterFlowCacheManagerAgent(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker) {
        this.WinterFlowTransactionManagerStrategy = (WinterFlowPackageModule) winterFlowOrchestrationInvoker;
    }

    public final float WinterFlowRouterRouter() {
        return ((WinterFlowPackageModule) WinterFlowVersionProtocol.WinterFlowVariableBandwidth(this.WinterFlowTransactionManagerStrategy, this)).WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final WinterFlowOrchestrationInvoker WinterFlowRouterStructure() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    public final void WinterFlowSyntax(float f) {
        WinterFlowJSONModule WinterFlowRouterRouter;
        WinterFlowPackageModule winterFlowPackageModule = (WinterFlowPackageModule) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy);
        if (winterFlowPackageModule.WinterFlowCacheManagerAgent == f) {
            return;
        }
        WinterFlowPackageModule winterFlowPackageModule2 = this.WinterFlowTransactionManagerStrategy;
        synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
            WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
            ((WinterFlowPackageModule) WinterFlowVersionProtocol.WinterFlowServiceUtility(winterFlowPackageModule2, this, WinterFlowRouterRouter, winterFlowPackageModule)).WinterFlowCacheManagerAgent = f;
        }
        WinterFlowVersionProtocol.WinterFlowServerProtocol(WinterFlowRouterRouter, this);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionUnitTest
    public final WinterFlowSessionManagerProcess WinterFlowVariableVersionControl() {
        return WinterFlowSessionManagerProcess.WinterFlowResolverController;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchCacheManager
    public final Object getValue() {
        return Float.valueOf(WinterFlowRouterRouter());
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolGateway
    public final void setValue(Object obj) {
        WinterFlowSyntax(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((WinterFlowPackageModule) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy)).WinterFlowCacheManagerAgent + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(WinterFlowRouterRouter());
    }
}
