package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadListener {
    public final WinterFlowWorkerInvoker WinterFlowArrayNetwork;
    public final WinterFlowWorkerInvoker WinterFlowCacheManagerAgent;
    public final WinterFlowWorkerInvoker WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;
    public final Serializable WinterFlowTransactionManagerStrategy;
    public final WinterFlowWorkerInvoker WinterFlowVariableVersionControl;

    /* JADX WARN: Multi-variable type inference failed */
    public WinterFlowThreadListener(WinterFlowThreadListener[] winterFlowThreadListenerArr) {
        int i = 0;
        this.WinterFlowRouterStructure = 0;
        this.WinterFlowTransactionManagerStrategy = winterFlowThreadListenerArr;
        int length = winterFlowThreadListenerArr.length;
        WinterFlowWorkerInvoker[] winterFlowWorkerInvokerArr = new WinterFlowWorkerInvoker[length];
        for (int i2 = 0; i2 < length; i2++) {
            winterFlowWorkerInvokerArr[i2] = ((WinterFlowThreadListener[]) this.WinterFlowTransactionManagerStrategy)[i2].WinterFlowHookDataSource();
        }
        int i3 = 1;
        this.WinterFlowHookDataSource = new WinterFlowWorkerInvoker(1, new WinterFlowIDEThreadPool(winterFlowWorkerInvokerArr, i));
        int length2 = ((WinterFlowThreadListener[]) this.WinterFlowTransactionManagerStrategy).length;
        WinterFlowWorkerInvoker[] winterFlowWorkerInvokerArr2 = new WinterFlowWorkerInvoker[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            winterFlowWorkerInvokerArr2[i4] = ((WinterFlowThreadListener[]) this.WinterFlowTransactionManagerStrategy)[i4].WinterFlowArrayNetwork();
        }
        this.WinterFlowCacheManagerAgent = new WinterFlowWorkerInvoker(0, new WinterFlowBackendCompiler(winterFlowWorkerInvokerArr2, i));
        int length3 = ((WinterFlowThreadListener[]) this.WinterFlowTransactionManagerStrategy).length;
        WinterFlowWorkerInvoker[] winterFlowWorkerInvokerArr3 = new WinterFlowWorkerInvoker[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            winterFlowWorkerInvokerArr3[i5] = ((WinterFlowThreadListener[]) this.WinterFlowTransactionManagerStrategy)[i5].WinterFlowCacheManagerAgent();
        }
        this.WinterFlowArrayNetwork = new WinterFlowWorkerInvoker(1, new WinterFlowIDEThreadPool(winterFlowWorkerInvokerArr3, i3));
        int length4 = ((WinterFlowThreadListener[]) this.WinterFlowTransactionManagerStrategy).length;
        WinterFlowWorkerInvoker[] winterFlowWorkerInvokerArr4 = new WinterFlowWorkerInvoker[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            winterFlowWorkerInvokerArr4[i6] = ((WinterFlowThreadListener[]) this.WinterFlowTransactionManagerStrategy)[i6].WinterFlowRouterStructure();
        }
        this.WinterFlowVariableVersionControl = new WinterFlowWorkerInvoker(0, new WinterFlowBackendCompiler(winterFlowWorkerInvokerArr4, i3));
    }

    public final WinterFlowWorkerInvoker WinterFlowArrayNetwork() {
        int i = this.WinterFlowRouterStructure;
        return this.WinterFlowCacheManagerAgent;
    }

    public final WinterFlowWorkerInvoker WinterFlowCacheManagerAgent() {
        int i = this.WinterFlowRouterStructure;
        return this.WinterFlowArrayNetwork;
    }

    public final WinterFlowWorkerInvoker WinterFlowHookDataSource() {
        int i = this.WinterFlowRouterStructure;
        return this.WinterFlowHookDataSource;
    }

    public final WinterFlowWorkerInvoker WinterFlowRouterStructure() {
        int i = this.WinterFlowRouterStructure;
        return this.WinterFlowVariableVersionControl;
    }

    public final String toString() {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i2 = 0;
                for (WinterFlowThreadListener winterFlowThreadListener : (WinterFlowThreadListener[]) obj) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    WinterFlowProviderRouter.WinterFlowHookDataSource(sb, winterFlowThreadListener, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return "RectRulers(" + ((String) obj) + ')';
        }
    }

    public WinterFlowThreadListener(String str) {
        this.WinterFlowRouterStructure = 1;
        this.WinterFlowTransactionManagerStrategy = str;
        this.WinterFlowHookDataSource = new WinterFlowWorkerInvoker(1, null);
        this.WinterFlowCacheManagerAgent = new WinterFlowWorkerInvoker(0, null);
        this.WinterFlowArrayNetwork = new WinterFlowWorkerInvoker(1, null);
        this.WinterFlowVariableVersionControl = new WinterFlowWorkerInvoker(0, null);
    }
}
