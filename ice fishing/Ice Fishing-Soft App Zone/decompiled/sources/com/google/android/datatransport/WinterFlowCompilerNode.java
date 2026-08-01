package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowCompilerNode implements Runnable, Comparable, WinterFlowVersionControlView {
    public int WinterFlowTransactionManagerStrategy = -1;
    public long WinterFlowVariableVersionControl;
    private volatile Object _heap;

    public WinterFlowCompilerNode(long j) {
        this.WinterFlowVariableVersionControl = j;
    }

    public final void WinterFlowArrayNetwork(WinterFlowThreadLayer winterFlowThreadLayer) {
        if (this._heap != WinterFlowHandlerWebsocket.WinterFlowRouterRouter) {
            this._heap = winterFlowThreadLayer;
        } else {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Failed requirement.");
        }
    }

    public final int WinterFlowHookDataSource(long j, WinterFlowThreadLayer winterFlowThreadLayer, WinterFlowProviderController winterFlowProviderController) {
        synchronized (this) {
            if (this._heap == WinterFlowHandlerWebsocket.WinterFlowRouterRouter) {
                return 2;
            }
            synchronized (winterFlowThreadLayer) {
                try {
                    WinterFlowCompilerNode[] winterFlowCompilerNodeArr = winterFlowThreadLayer.WinterFlowRouterStructure;
                    WinterFlowCompilerNode winterFlowCompilerNode = winterFlowCompilerNodeArr != null ? winterFlowCompilerNodeArr[0] : null;
                    int i = WinterFlowProviderController.WinterFlowServiceUtility;
                    if (WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(winterFlowProviderController, WinterFlowProviderController.WinterFlowServerProtocol) != 0) {
                        return 1;
                    }
                    if (winterFlowCompilerNode == null) {
                        winterFlowThreadLayer.WinterFlowCacheManagerAgent = j;
                    } else {
                        long j2 = winterFlowCompilerNode.WinterFlowVariableVersionControl;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = winterFlowThreadLayer.WinterFlowCacheManagerAgent;
                        if (j - j3 > 0) {
                            winterFlowThreadLayer.WinterFlowCacheManagerAgent = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.WinterFlowVariableVersionControl - j < 0) {
                        this.WinterFlowVariableVersionControl = j;
                    }
                    winterFlowThreadLayer.WinterFlowRouterStructure(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlView
    public final void WinterFlowRouterStructure() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowHandlerWebsocket.WinterFlowRouterRouter;
                if (obj == winterFlowJSONDecorator) {
                    return;
                }
                WinterFlowThreadLayer winterFlowThreadLayer = obj instanceof WinterFlowThreadLayer ? (WinterFlowThreadLayer) obj : null;
                if (winterFlowThreadLayer != null) {
                    synchronized (winterFlowThreadLayer) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof WinterFlowEventResolver ? (WinterFlowEventResolver) obj2 : null) != null) {
                            winterFlowThreadLayer.WinterFlowCacheManagerAgent(this.WinterFlowTransactionManagerStrategy);
                        }
                    }
                }
                this._heap = winterFlowJSONDecorator;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.WinterFlowVariableVersionControl - ((WinterFlowCompilerNode) obj).WinterFlowVariableVersionControl;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.WinterFlowVariableVersionControl + ']';
    }
}
