package com.google.android.datatransport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrontendTesting implements WinterFlowProcessorConsumer, WinterFlowDecoratorRuntime {
    public int WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl;

    public WinterFlowFrontendTesting(int i, int i2, WinterFlowObjectNode winterFlowObjectNode) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = new WinterFlowStackProvider((WinterFlowSingletonProcess) new WinterFlowCacheService(i, i2, winterFlowObjectNode));
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public void WinterFlowArrayNetwork() {
        ((WinterFlowProcessorConsumer) this.WinterFlowUnitTestResponse).WinterFlowArrayNetwork();
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public WinterFlowConfigurationResponse WinterFlowBandwidthObject(long j, WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        return ((WinterFlowStackProvider) this.WinterFlowUnitTestResponse).WinterFlowBandwidthObject(j, winterFlowConfigurationResponse, winterFlowConfigurationResponse2, winterFlowConfigurationResponse3);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public void WinterFlowCacheManagerAgent(Object obj) {
        this.WinterFlowTransactionManagerStrategy++;
        ((WinterFlowProcessorConsumer) this.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(obj);
    }

    public synchronized int WinterFlowConcurrencyThread() {
        PackageInfo packageInfo;
        if (this.WinterFlowVariableVersionControl == 0) {
            try {
                packageInfo = WinterFlowFrontendIDE.WinterFlowRouterStructure((Context) this.WinterFlowUnitTestResponse).WinterFlowRouterStructure.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.WinterFlowVariableVersionControl = packageInfo.versionCode;
            }
        }
        return this.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public void WinterFlowHookDataSource(int i, Object obj) {
        ((WinterFlowProcessorConsumer) this.WinterFlowUnitTestResponse).WinterFlowHookDataSource(i + (this.WinterFlowTransactionManagerStrategy == 0 ? this.WinterFlowVariableVersionControl : 0), obj);
    }

    public synchronized int WinterFlowOrchestrationSubsystem() {
        int i = this.WinterFlowTransactionManagerStrategy;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.WinterFlowUnitTestResponse;
        PackageManager packageManager = context.getPackageManager();
        if (WinterFlowFrontendIDE.WinterFlowRouterStructure(context).WinterFlowRouterStructure.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            this.WinterFlowTransactionManagerStrategy = 2;
            return 2;
        }
        this.WinterFlowTransactionManagerStrategy = 2;
        return 2;
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public Object WinterFlowResponseEngine() {
        return ((WinterFlowProcessorConsumer) this.WinterFlowUnitTestResponse).WinterFlowResponseEngine();
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public void WinterFlowRouterRouter(int i, int i2, int i3) {
        int i4 = this.WinterFlowTransactionManagerStrategy == 0 ? this.WinterFlowVariableVersionControl : 0;
        ((WinterFlowProcessorConsumer) this.WinterFlowUnitTestResponse).WinterFlowRouterRouter(i + i4, i2 + i4, i3);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public void WinterFlowServerProtocol(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        ((WinterFlowProcessorConsumer) this.WinterFlowUnitTestResponse).WinterFlowServerProtocol(winterFlowEventEvent, obj);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public void WinterFlowServiceUtility() {
        if (this.WinterFlowTransactionManagerStrategy <= 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("OffsetApplier up called with no corresponding down");
        }
        this.WinterFlowTransactionManagerStrategy--;
        ((WinterFlowProcessorConsumer) this.WinterFlowUnitTestResponse).WinterFlowServiceUtility();
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public WinterFlowConfigurationResponse WinterFlowSyntax(long j, WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        return ((WinterFlowStackProvider) this.WinterFlowUnitTestResponse).WinterFlowSyntax(j, winterFlowConfigurationResponse, winterFlowConfigurationResponse2, winterFlowConfigurationResponse3);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public void WinterFlowTransactionAgent(int i, int i2) {
        ((WinterFlowProcessorConsumer) this.WinterFlowUnitTestResponse).WinterFlowTransactionAgent(i + (this.WinterFlowTransactionManagerStrategy == 0 ? this.WinterFlowVariableVersionControl : 0), i2);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public void WinterFlowTransactionManagerStrategy(int i, Object obj) {
        ((WinterFlowProcessorConsumer) this.WinterFlowUnitTestResponse).WinterFlowTransactionManagerStrategy(i + (this.WinterFlowTransactionManagerStrategy == 0 ? this.WinterFlowVariableVersionControl : 0), obj);
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public long WinterFlowVariableVersionControl(WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        return (this.WinterFlowTransactionManagerStrategy + this.WinterFlowVariableVersionControl) * 1000000;
    }

    public WinterFlowFrontendTesting(WinterFlowProcessorConsumer winterFlowProcessorConsumer, int i) {
        this.WinterFlowUnitTestResponse = winterFlowProcessorConsumer;
        this.WinterFlowVariableVersionControl = i;
    }

    public WinterFlowFrontendTesting(Context context) {
        this.WinterFlowTransactionManagerStrategy = 0;
        this.WinterFlowUnitTestResponse = context;
    }
}
