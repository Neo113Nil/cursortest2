package com.google.android.datatransport;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowProviderAdapter {
    public final Rect[][] WinterFlowArrayNetwork;
    public final Rect[][] WinterFlowCacheManagerAgent;
    public WinterFlowVariableDataSource[] WinterFlowHookDataSource;
    public final WinterFlowWebsocketInterface WinterFlowRouterStructure;

    public WinterFlowProviderAdapter(WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
        this.WinterFlowCacheManagerAgent = new Rect[10][];
        this.WinterFlowArrayNetwork = new Rect[10][];
        this.WinterFlowRouterStructure = winterFlowWebsocketInterface;
        WinterFlowCacheManagerAgent(winterFlowWebsocketInterface);
    }

    public void WinterFlowArrayNetwork(int i, WinterFlowVariableDataSource winterFlowVariableDataSource) {
        if (this.WinterFlowHookDataSource == null) {
            this.WinterFlowHookDataSource = new WinterFlowVariableDataSource[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.WinterFlowHookDataSource[WinterFlowProviderRouter.WinterFlowServiceUtility(i2)] = winterFlowVariableDataSource;
            }
        }
    }

    public void WinterFlowCacheManagerAgent(WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> WinterFlowTransactionManagerStrategy = winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy(i);
            int WinterFlowServiceUtility = WinterFlowProviderRouter.WinterFlowServiceUtility(i);
            this.WinterFlowCacheManagerAgent[WinterFlowServiceUtility] = (Rect[]) WinterFlowTransactionManagerStrategy.toArray(new Rect[WinterFlowTransactionManagerStrategy.size()]);
            if (i != 8) {
                List<Rect> WinterFlowUnitTestResponse = winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowUnitTestResponse(i);
                this.WinterFlowArrayNetwork[WinterFlowServiceUtility] = (Rect[]) WinterFlowUnitTestResponse.toArray(new Rect[WinterFlowUnitTestResponse.size()]);
            }
        }
    }

    public abstract WinterFlowWebsocketInterface WinterFlowHookDataSource();

    public abstract void WinterFlowRouterRouter(WinterFlowVariableDataSource winterFlowVariableDataSource);

    public final void WinterFlowRouterStructure() {
        WinterFlowVariableDataSource[] winterFlowVariableDataSourceArr = this.WinterFlowHookDataSource;
        if (winterFlowVariableDataSourceArr != null) {
            WinterFlowVariableDataSource winterFlowVariableDataSource = winterFlowVariableDataSourceArr[0];
            WinterFlowVariableDataSource winterFlowVariableDataSource2 = winterFlowVariableDataSourceArr[1];
            WinterFlowWebsocketInterface winterFlowWebsocketInterface = this.WinterFlowRouterStructure;
            if (winterFlowVariableDataSource2 == null) {
                winterFlowVariableDataSource2 = winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowSyntax(2);
            }
            if (winterFlowVariableDataSource == null) {
                winterFlowVariableDataSource = winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowSyntax(1);
            }
            WinterFlowRouterRouter(WinterFlowVariableDataSource.WinterFlowRouterStructure(winterFlowVariableDataSource, winterFlowVariableDataSource2));
            WinterFlowVariableDataSource winterFlowVariableDataSource3 = this.WinterFlowHookDataSource[WinterFlowProviderRouter.WinterFlowServiceUtility(16)];
            if (winterFlowVariableDataSource3 != null) {
                WinterFlowUnitTestResponse(winterFlowVariableDataSource3);
            }
            WinterFlowVariableDataSource winterFlowVariableDataSource4 = this.WinterFlowHookDataSource[WinterFlowProviderRouter.WinterFlowServiceUtility(32)];
            if (winterFlowVariableDataSource4 != null) {
                WinterFlowVariableVersionControl(winterFlowVariableDataSource4);
            }
            WinterFlowVariableDataSource winterFlowVariableDataSource5 = this.WinterFlowHookDataSource[WinterFlowProviderRouter.WinterFlowServiceUtility(64)];
            if (winterFlowVariableDataSource5 != null) {
                WinterFlowSyntax(winterFlowVariableDataSource5);
            }
        }
    }

    public abstract void WinterFlowTransactionManagerStrategy(WinterFlowVariableDataSource winterFlowVariableDataSource);

    public WinterFlowProviderAdapter() {
        this(new WinterFlowWebsocketInterface((WinterFlowWebsocketInterface) null));
    }

    public void WinterFlowSyntax(WinterFlowVariableDataSource winterFlowVariableDataSource) {
    }

    public void WinterFlowUnitTestResponse(WinterFlowVariableDataSource winterFlowVariableDataSource) {
    }

    public void WinterFlowVariableVersionControl(WinterFlowVariableDataSource winterFlowVariableDataSource) {
    }
}
