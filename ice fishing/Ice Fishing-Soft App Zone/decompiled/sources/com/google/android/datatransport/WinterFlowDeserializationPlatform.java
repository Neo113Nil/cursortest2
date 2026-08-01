package com.google.android.datatransport;

import android.content.Context;
import android.os.UserManager;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationPlatform implements WinterFlowFrameworkTool, WinterFlowJSONUnitTest {
    public final Set WinterFlowArrayNetwork;
    public final WinterFlowHookInheritance WinterFlowCacheManagerAgent;
    public final Context WinterFlowHookDataSource;
    public final WinterFlowRendererTransaction WinterFlowRouterStructure;
    public final Executor WinterFlowVariableVersionControl;

    public WinterFlowDeserializationPlatform(Context context, String str, Set set, WinterFlowHookInheritance winterFlowHookInheritance, Executor executor) {
        this.WinterFlowRouterStructure = new WinterFlowRendererTransaction(new WinterFlowResponseXML(1, context, str));
        this.WinterFlowArrayNetwork = set;
        this.WinterFlowVariableVersionControl = executor;
        this.WinterFlowCacheManagerAgent = winterFlowHookInheritance;
        this.WinterFlowHookDataSource = context;
    }

    public final void WinterFlowHookDataSource() {
        if (this.WinterFlowArrayNetwork.size() <= 0) {
            WinterFlowHookProcessor.WinterFlowResponseEngine(null);
        } else if (!((UserManager) this.WinterFlowHookDataSource.getSystemService(UserManager.class)).isUserUnlocked()) {
            WinterFlowHookProcessor.WinterFlowResponseEngine(null);
        } else {
            WinterFlowHookProcessor.WinterFlowUnitTestResponse(this.WinterFlowVariableVersionControl, new WinterFlowListenerListener(this, 1));
        }
    }

    public final WinterFlowExceptionParser WinterFlowRouterStructure() {
        if (!((UserManager) this.WinterFlowHookDataSource.getSystemService(UserManager.class)).isUserUnlocked()) {
            return WinterFlowHookProcessor.WinterFlowResponseEngine("");
        }
        return WinterFlowHookProcessor.WinterFlowUnitTestResponse(this.WinterFlowVariableVersionControl, new WinterFlowListenerListener(this, 0));
    }
}
