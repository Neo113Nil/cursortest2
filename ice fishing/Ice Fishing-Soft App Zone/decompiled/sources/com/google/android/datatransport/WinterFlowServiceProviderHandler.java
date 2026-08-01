package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderHandler implements Iterator, WinterFlowLoaderProcess {
    public Object WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowHookTool WinterFlowSyntax;
    public final Iterator WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl = 1;
    public int WinterFlowUnitTestResponse = -1;

    public WinterFlowServiceProviderHandler(WinterFlowThreadPoolView winterFlowThreadPoolView) {
        this.WinterFlowSyntax = winterFlowThreadPoolView;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowAlgorithmEngine((WinterFlowProcessorFramework) winterFlowThreadPoolView.WinterFlowHookDataSource);
    }

    public void WinterFlowHookDataSource() {
        Iterator it = this.WinterFlowTransactionManagerStrategy;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((WinterFlowProcessorFramework) this.WinterFlowSyntax).WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse(next)).booleanValue()) {
                this.WinterFlowUnitTestResponse = 1;
                this.WinterFlowRouterRouter = next;
                return;
            }
        }
        this.WinterFlowUnitTestResponse = 0;
    }

    public void WinterFlowRouterStructure() {
        Object next;
        WinterFlowThreadPoolView winterFlowThreadPoolView = (WinterFlowThreadPoolView) this.WinterFlowSyntax;
        do {
            Iterator it = this.WinterFlowTransactionManagerStrategy;
            if (!it.hasNext()) {
                this.WinterFlowUnitTestResponse = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((WinterFlowSessionManagerAgent) winterFlowThreadPoolView.WinterFlowCacheManagerAgent).WinterFlowUnitTestResponse(next)).booleanValue());
        this.WinterFlowRouterRouter = next;
        this.WinterFlowUnitTestResponse = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.WinterFlowUnitTestResponse == -1) {
                    WinterFlowRouterStructure();
                }
                if (this.WinterFlowUnitTestResponse == 1) {
                }
                break;
            default:
                if (this.WinterFlowUnitTestResponse == -1) {
                    WinterFlowHookDataSource();
                }
                if (this.WinterFlowUnitTestResponse == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.WinterFlowUnitTestResponse == -1) {
                    WinterFlowRouterStructure();
                }
                if (this.WinterFlowUnitTestResponse == 0) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    break;
                } else {
                    Object obj = this.WinterFlowRouterRouter;
                    this.WinterFlowRouterRouter = null;
                    this.WinterFlowUnitTestResponse = -1;
                    break;
                }
            default:
                if (this.WinterFlowUnitTestResponse == -1) {
                    WinterFlowHookDataSource();
                }
                if (this.WinterFlowUnitTestResponse == 0) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    break;
                } else {
                    Object obj2 = this.WinterFlowRouterRouter;
                    this.WinterFlowRouterRouter = null;
                    this.WinterFlowUnitTestResponse = -1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public WinterFlowServiceProviderHandler(WinterFlowProcessorFramework winterFlowProcessorFramework) {
        this.WinterFlowSyntax = winterFlowProcessorFramework;
        this.WinterFlowTransactionManagerStrategy = winterFlowProcessorFramework.WinterFlowHookDataSource.iterator();
    }
}
