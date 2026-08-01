package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNetworkHelper implements Iterator, WinterFlowLoaderProcess {
    public final Object WinterFlowRouterRouter;
    public int WinterFlowTransactionManagerStrategy;
    public Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowNetworkHelper(WinterFlowProcessorDeserialization winterFlowProcessorDeserialization) {
        this.WinterFlowVariableVersionControl = 2;
        this.WinterFlowRouterRouter = winterFlowProcessorDeserialization;
        this.WinterFlowTransactionManagerStrategy = -1;
        this.WinterFlowUnitTestResponse = WinterFlowConfigurationException.WinterFlowVariableVersionControl(new WinterFlowTestingHandler(winterFlowProcessorDeserialization, this, null));
    }

    public void WinterFlowRouterStructure() {
        Object WinterFlowUnitTestResponse;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowThreadPoolView winterFlowThreadPoolView = (WinterFlowThreadPoolView) this.WinterFlowRouterRouter;
        if (i == -2) {
            WinterFlowUnitTestResponse = ((WinterFlowObjectUI) winterFlowThreadPoolView.WinterFlowHookDataSource).WinterFlowRouterStructure();
        } else {
            WinterFlowObjectSession winterFlowObjectSession = winterFlowThreadPoolView.WinterFlowCacheManagerAgent;
            Object obj = this.WinterFlowUnitTestResponse;
            obj.getClass();
            WinterFlowUnitTestResponse = winterFlowObjectSession.WinterFlowUnitTestResponse(obj);
        }
        this.WinterFlowUnitTestResponse = WinterFlowUnitTestResponse;
        this.WinterFlowTransactionManagerStrategy = WinterFlowUnitTestResponse == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.WinterFlowTransactionManagerStrategy < 0) {
                    WinterFlowRouterStructure();
                }
                return this.WinterFlowTransactionManagerStrategy == 1;
            case 1:
                return ((WinterFlowAPIProcess) this.WinterFlowUnitTestResponse).hasNext();
            case 2:
                return ((WinterFlowAPIProcess) this.WinterFlowUnitTestResponse).hasNext();
            default:
                return this.WinterFlowTransactionManagerStrategy < ((Map) this.WinterFlowRouterRouter).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.WinterFlowTransactionManagerStrategy < 0) {
                    WinterFlowRouterStructure();
                }
                if (this.WinterFlowTransactionManagerStrategy == 0) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    return null;
                }
                Object obj2 = this.WinterFlowUnitTestResponse;
                obj2.getClass();
                this.WinterFlowTransactionManagerStrategy = -1;
                return obj2;
            case 1:
                return ((WinterFlowAPIProcess) this.WinterFlowUnitTestResponse).next();
            case 2:
                return ((WinterFlowAPIProcess) this.WinterFlowUnitTestResponse).next();
            default:
                if (hasNext()) {
                    obj = this.WinterFlowUnitTestResponse;
                    this.WinterFlowTransactionManagerStrategy++;
                    Object obj3 = ((Map) this.WinterFlowRouterRouter).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.WinterFlowUnitTestResponse = ((WinterFlowRendererView) obj3).WinterFlowHookDataSource;
                } else {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowRouterRouter;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.WinterFlowTransactionManagerStrategy;
                if (i2 != -1) {
                    ((WinterFlowConsumerDecorator) obj).WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter(i2);
                    this.WinterFlowTransactionManagerStrategy = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.WinterFlowTransactionManagerStrategy;
                if (i3 != -1) {
                    ((WinterFlowProcessorDeserialization) obj).WinterFlowTransactionManagerStrategy.WinterFlowThreadListener(i3);
                    this.WinterFlowTransactionManagerStrategy = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public WinterFlowNetworkHelper(WinterFlowThreadPoolView winterFlowThreadPoolView) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowRouterRouter = winterFlowThreadPoolView;
        this.WinterFlowTransactionManagerStrategy = -2;
    }

    public WinterFlowNetworkHelper(Object obj, Map map) {
        this.WinterFlowVariableVersionControl = 3;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowRouterRouter = map;
    }

    public WinterFlowNetworkHelper(WinterFlowConsumerDecorator winterFlowConsumerDecorator) {
        this.WinterFlowVariableVersionControl = 1;
        this.WinterFlowRouterRouter = winterFlowConsumerDecorator;
        this.WinterFlowTransactionManagerStrategy = -1;
        this.WinterFlowUnitTestResponse = WinterFlowConfigurationException.WinterFlowVariableVersionControl(new WinterFlowThreadPoolComponent(winterFlowConsumerDecorator, this, null));
    }
}
