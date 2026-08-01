package com.google.android.datatransport;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.icewinter.flow.winter.icecatch.R;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowHandlerArray {
    public static final WinterFlowPipelineHelper WinterFlowRouterStructure = new WinterFlowPipelineHelper(0, new WinterFlowDeploymentEngine(20));

    public static WinterFlowArrayDeserialization WinterFlowRouterStructure(WinterFlowResolverLibrary winterFlowResolverLibrary) {
        WinterFlowArrayDeserialization winterFlowArrayDeserialization = (WinterFlowArrayDeserialization) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowRouterStructure);
        Object obj = null;
        if (winterFlowArrayDeserialization == null) {
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(1208426157);
            View view = (View) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowTransactionManagerStrategy);
            view.getClass();
            while (true) {
                if (view == null) {
                    winterFlowArrayDeserialization = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                WinterFlowArrayDeserialization winterFlowArrayDeserialization2 = tag instanceof WinterFlowArrayDeserialization ? (WinterFlowArrayDeserialization) tag : null;
                if (winterFlowArrayDeserialization2 != null) {
                    winterFlowArrayDeserialization = winterFlowArrayDeserialization2;
                    break;
                }
                Object WinterFlowCacheManagerAgent = WinterFlowProtocolNetwork.WinterFlowCacheManagerAgent(view);
                view = WinterFlowCacheManagerAgent instanceof View ? (View) WinterFlowCacheManagerAgent : null;
            }
        } else {
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(1208423708);
        }
        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        if (winterFlowArrayDeserialization != null) {
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(1208423789);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            return winterFlowArrayDeserialization;
        }
        winterFlowResolverLibrary.WinterFlowCompilerDataSource(1208428160);
        Context context = (Context) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowHookDataSource);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof WinterFlowArrayDeserialization) {
                obj = context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        WinterFlowArrayDeserialization winterFlowArrayDeserialization3 = (WinterFlowArrayDeserialization) obj;
        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        return winterFlowArrayDeserialization3;
    }
}
