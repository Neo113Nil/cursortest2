package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowWorkerSession {
    public WinterFlowParserClass WinterFlowRouterRouter;
    public int WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public WinterFlowTestingAgent[] WinterFlowVariableVersionControl;

    public abstract WinterFlowTestingAgent WinterFlowArrayNetwork();

    public final WinterFlowTestingAgent WinterFlowCacheManagerAgent() {
        WinterFlowTestingAgent winterFlowTestingAgent;
        WinterFlowParserClass winterFlowParserClass;
        synchronized (this) {
            try {
                WinterFlowTestingAgent[] winterFlowTestingAgentArr = this.WinterFlowVariableVersionControl;
                if (winterFlowTestingAgentArr == null) {
                    winterFlowTestingAgentArr = WinterFlowVariableVersionControl();
                    this.WinterFlowVariableVersionControl = winterFlowTestingAgentArr;
                } else if (this.WinterFlowTransactionManagerStrategy >= winterFlowTestingAgentArr.length) {
                    Object[] copyOf = Arrays.copyOf(winterFlowTestingAgentArr, winterFlowTestingAgentArr.length * 2);
                    this.WinterFlowVariableVersionControl = (WinterFlowTestingAgent[]) copyOf;
                    winterFlowTestingAgentArr = (WinterFlowTestingAgent[]) copyOf;
                }
                int i = this.WinterFlowUnitTestResponse;
                do {
                    winterFlowTestingAgent = winterFlowTestingAgentArr[i];
                    if (winterFlowTestingAgent == null) {
                        winterFlowTestingAgent = WinterFlowArrayNetwork();
                        winterFlowTestingAgentArr[i] = winterFlowTestingAgent;
                    }
                    i++;
                    if (i >= winterFlowTestingAgentArr.length) {
                        i = 0;
                    }
                } while (!winterFlowTestingAgent.WinterFlowRouterStructure(this));
                this.WinterFlowUnitTestResponse = i;
                this.WinterFlowTransactionManagerStrategy++;
                winterFlowParserClass = this.WinterFlowRouterRouter;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (winterFlowParserClass != null) {
            winterFlowParserClass.WinterFlowMapperProtocol(1);
        }
        return winterFlowTestingAgent;
    }

    public final void WinterFlowTransactionManagerStrategy(WinterFlowTestingAgent winterFlowTestingAgent) {
        WinterFlowParserClass winterFlowParserClass;
        int i;
        WinterFlowTransactionManagerLayer[] WinterFlowHookDataSource;
        synchronized (this) {
            try {
                int i2 = this.WinterFlowTransactionManagerStrategy - 1;
                this.WinterFlowTransactionManagerStrategy = i2;
                winterFlowParserClass = this.WinterFlowRouterRouter;
                if (i2 == 0) {
                    this.WinterFlowUnitTestResponse = 0;
                }
                winterFlowTestingAgent.getClass();
                WinterFlowHookDataSource = winterFlowTestingAgent.WinterFlowHookDataSource(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer : WinterFlowHookDataSource) {
            if (winterFlowTransactionManagerLayer != null) {
                winterFlowTransactionManagerLayer.WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
            }
        }
        if (winterFlowParserClass != null) {
            winterFlowParserClass.WinterFlowMapperProtocol(-1);
        }
    }

    public final WinterFlowParserClass WinterFlowUnitTestResponse() {
        WinterFlowParserClass winterFlowParserClass;
        synchronized (this) {
            winterFlowParserClass = this.WinterFlowRouterRouter;
            if (winterFlowParserClass == null) {
                int i = this.WinterFlowTransactionManagerStrategy;
                winterFlowParserClass = new WinterFlowParserClass(1, Integer.MAX_VALUE, WinterFlowDataSourceHandler.WinterFlowTransactionManagerStrategy);
                winterFlowParserClass.WinterFlowConcurrencyThread(Integer.valueOf(i));
                this.WinterFlowRouterRouter = winterFlowParserClass;
            }
        }
        return winterFlowParserClass;
    }

    public abstract WinterFlowTestingAgent[] WinterFlowVariableVersionControl();
}
