package com.google.android.datatransport;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBandwidthAdapter extends WindowInsetsAnimation$Callback {
    public final HashMap WinterFlowArrayNetwork;
    public ArrayList WinterFlowCacheManagerAgent;
    public List WinterFlowHookDataSource;
    public final WinterFlowWorkerCompiler WinterFlowRouterStructure;

    public WinterFlowBandwidthAdapter(WinterFlowWorkerCompiler winterFlowWorkerCompiler) {
        super(winterFlowWorkerCompiler.WinterFlowVariableVersionControl);
        this.WinterFlowArrayNetwork = new HashMap();
        this.WinterFlowRouterStructure = winterFlowWorkerCompiler;
    }

    public final WinterFlowValidatorEngine WinterFlowRouterStructure(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.WinterFlowArrayNetwork;
        WinterFlowValidatorEngine winterFlowValidatorEngine = (WinterFlowValidatorEngine) hashMap.get(windowInsetsAnimation);
        if (winterFlowValidatorEngine != null) {
            return winterFlowValidatorEngine;
        }
        WinterFlowValidatorEngine winterFlowValidatorEngine2 = new WinterFlowValidatorEngine(0, null, 0L);
        winterFlowValidatorEngine2.WinterFlowRouterStructure = new WinterFlowRepositorySerializer(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, winterFlowValidatorEngine2);
        return winterFlowValidatorEngine2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.WinterFlowRouterStructure.WinterFlowVariableVersionControl(WinterFlowRouterStructure(windowInsetsAnimation));
        this.WinterFlowArrayNetwork.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy(WinterFlowRouterStructure(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.WinterFlowCacheManagerAgent;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.WinterFlowCacheManagerAgent = arrayList2;
            this.WinterFlowHookDataSource = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation WinterFlowTransactionAgent = WinterFlowWebsocketProcess.WinterFlowTransactionAgent(list.get(size));
            WinterFlowValidatorEngine WinterFlowRouterStructure = WinterFlowRouterStructure(WinterFlowTransactionAgent);
            fraction = WinterFlowTransactionAgent.getFraction();
            WinterFlowRouterStructure.WinterFlowRouterStructure.WinterFlowVariableVersionControl(fraction);
            this.WinterFlowCacheManagerAgent.add(WinterFlowRouterStructure);
        }
        return this.WinterFlowRouterStructure.WinterFlowUnitTestResponse(WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(windowInsets, null), this.WinterFlowHookDataSource).WinterFlowHookDataSource();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        WinterFlowCacheManagerVersionControl WinterFlowRouterRouter = this.WinterFlowRouterStructure.WinterFlowRouterRouter(WinterFlowRouterStructure(windowInsetsAnimation), new WinterFlowCacheManagerVersionControl(bounds));
        WinterFlowRouterRouter.getClass();
        WinterFlowWebsocketProcess.WinterFlowServiceUtility();
        return WinterFlowWebsocketProcess.WinterFlowSyntax(((WinterFlowVariableDataSource) WinterFlowRouterRouter.WinterFlowTransactionManagerStrategy).WinterFlowArrayNetwork(), ((WinterFlowVariableDataSource) WinterFlowRouterRouter.WinterFlowUnitTestResponse).WinterFlowArrayNetwork());
    }
}
