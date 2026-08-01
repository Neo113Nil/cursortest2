package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseRenderer implements Cloneable {
    public /* synthetic */ int WinterFlowRouterRouter;
    public /* synthetic */ long[] WinterFlowTransactionManagerStrategy;
    public /* synthetic */ Object[] WinterFlowUnitTestResponse;
    public /* synthetic */ boolean WinterFlowVariableVersionControl;

    public WinterFlowDatabaseRenderer(int i) {
        if (i == 0) {
            this.WinterFlowTransactionManagerStrategy = WinterFlowHandlerWebsocket.WinterFlowTransactionManagerStrategy;
            this.WinterFlowUnitTestResponse = WinterFlowHandlerWebsocket.WinterFlowUnitTestResponse;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.WinterFlowTransactionManagerStrategy = new long[i5];
        this.WinterFlowUnitTestResponse = new Object[i5];
    }

    public final void WinterFlowArrayNetwork(long j, Object obj) {
        Object obj2 = WinterFlowTestingCloud.WinterFlowVariableVersionControl;
        int WinterFlowResponseEngine = WinterFlowHandlerWebsocket.WinterFlowResponseEngine(this.WinterFlowTransactionManagerStrategy, this.WinterFlowRouterRouter, j);
        if (WinterFlowResponseEngine >= 0) {
            this.WinterFlowUnitTestResponse[WinterFlowResponseEngine] = obj;
            return;
        }
        int i = ~WinterFlowResponseEngine;
        int i2 = this.WinterFlowRouterRouter;
        if (i < i2) {
            Object[] objArr = this.WinterFlowUnitTestResponse;
            if (objArr[i] == obj2) {
                this.WinterFlowTransactionManagerStrategy[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.WinterFlowVariableVersionControl) {
            long[] jArr = this.WinterFlowTransactionManagerStrategy;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.WinterFlowUnitTestResponse;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.WinterFlowVariableVersionControl = false;
                this.WinterFlowRouterRouter = i3;
                i = ~WinterFlowHandlerWebsocket.WinterFlowResponseEngine(this.WinterFlowTransactionManagerStrategy, i3, j);
            }
        }
        int i5 = this.WinterFlowRouterRouter;
        if (i5 >= this.WinterFlowTransactionManagerStrategy.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.WinterFlowTransactionManagerStrategy = Arrays.copyOf(this.WinterFlowTransactionManagerStrategy, i9);
            this.WinterFlowUnitTestResponse = Arrays.copyOf(this.WinterFlowUnitTestResponse, i9);
        }
        int i10 = this.WinterFlowRouterRouter;
        if (i10 - i != 0) {
            long[] jArr2 = this.WinterFlowTransactionManagerStrategy;
            int i11 = i + 1;
            WinterFlowProtocolPipeline.WinterFlowFrontendBackend(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.WinterFlowUnitTestResponse;
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr3, objArr3, i11, i, this.WinterFlowRouterRouter);
        }
        this.WinterFlowTransactionManagerStrategy[i] = j;
        this.WinterFlowUnitTestResponse[i] = obj;
        this.WinterFlowRouterRouter++;
    }

    public final long WinterFlowCacheManagerAgent(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.WinterFlowRouterRouter)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.WinterFlowVariableVersionControl) {
            long[] jArr = this.WinterFlowTransactionManagerStrategy;
            Object[] objArr = this.WinterFlowUnitTestResponse;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != WinterFlowTestingCloud.WinterFlowVariableVersionControl) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.WinterFlowVariableVersionControl = false;
            this.WinterFlowRouterRouter = i3;
        }
        return this.WinterFlowTransactionManagerStrategy[i];
    }

    public final Object WinterFlowHookDataSource(long j) {
        Object obj;
        int WinterFlowResponseEngine = WinterFlowHandlerWebsocket.WinterFlowResponseEngine(this.WinterFlowTransactionManagerStrategy, this.WinterFlowRouterRouter, j);
        if (WinterFlowResponseEngine < 0 || (obj = this.WinterFlowUnitTestResponse[WinterFlowResponseEngine]) == WinterFlowTestingCloud.WinterFlowVariableVersionControl) {
            return null;
        }
        return obj;
    }

    public final void WinterFlowRouterStructure() {
        int i = this.WinterFlowRouterRouter;
        Object[] objArr = this.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.WinterFlowRouterRouter = 0;
        this.WinterFlowVariableVersionControl = false;
    }

    public final int WinterFlowTransactionManagerStrategy() {
        if (this.WinterFlowVariableVersionControl) {
            int i = this.WinterFlowRouterRouter;
            long[] jArr = this.WinterFlowTransactionManagerStrategy;
            Object[] objArr = this.WinterFlowUnitTestResponse;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != WinterFlowTestingCloud.WinterFlowVariableVersionControl) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.WinterFlowVariableVersionControl = false;
            this.WinterFlowRouterRouter = i2;
        }
        return this.WinterFlowRouterRouter;
    }

    public final Object WinterFlowUnitTestResponse(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.WinterFlowRouterRouter)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.WinterFlowVariableVersionControl) {
            long[] jArr = this.WinterFlowTransactionManagerStrategy;
            Object[] objArr = this.WinterFlowUnitTestResponse;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != WinterFlowTestingCloud.WinterFlowVariableVersionControl) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.WinterFlowVariableVersionControl = false;
            this.WinterFlowRouterRouter = i3;
        }
        return this.WinterFlowUnitTestResponse[i];
    }

    public final void WinterFlowVariableVersionControl(long j) {
        int WinterFlowResponseEngine = WinterFlowHandlerWebsocket.WinterFlowResponseEngine(this.WinterFlowTransactionManagerStrategy, this.WinterFlowRouterRouter, j);
        if (WinterFlowResponseEngine >= 0) {
            Object[] objArr = this.WinterFlowUnitTestResponse;
            Object obj = objArr[WinterFlowResponseEngine];
            Object obj2 = WinterFlowTestingCloud.WinterFlowVariableVersionControl;
            if (obj != obj2) {
                objArr[WinterFlowResponseEngine] = obj2;
                this.WinterFlowVariableVersionControl = true;
            }
        }
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        WinterFlowDatabaseRenderer winterFlowDatabaseRenderer = (WinterFlowDatabaseRenderer) clone;
        winterFlowDatabaseRenderer.WinterFlowTransactionManagerStrategy = (long[]) this.WinterFlowTransactionManagerStrategy.clone();
        winterFlowDatabaseRenderer.WinterFlowUnitTestResponse = (Object[]) this.WinterFlowUnitTestResponse.clone();
        return winterFlowDatabaseRenderer;
    }

    public final String toString() {
        if (WinterFlowTransactionManagerStrategy() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.WinterFlowRouterRouter * 28);
        sb.append('{');
        int i = this.WinterFlowRouterRouter;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(WinterFlowCacheManagerAgent(i2));
            sb.append('=');
            Object WinterFlowUnitTestResponse = WinterFlowUnitTestResponse(i2);
            if (WinterFlowUnitTestResponse != sb) {
                sb.append(WinterFlowUnitTestResponse);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ WinterFlowDatabaseRenderer() {
        this(10);
    }
}
