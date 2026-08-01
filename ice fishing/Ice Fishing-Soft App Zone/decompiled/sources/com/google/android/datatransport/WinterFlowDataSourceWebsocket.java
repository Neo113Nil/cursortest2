package com.google.android.datatransport;

import android.content.Context;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceWebsocket {
    public static volatile WinterFlowDataSourceObject WinterFlowVariableVersionControl;
    public final WinterFlowJSONProxy WinterFlowArrayNetwork;
    public final WinterFlowDatabaseSchemaBatch WinterFlowCacheManagerAgent;
    public final WinterFlowFunctionProcessor WinterFlowHookDataSource;
    public final WinterFlowFunctionProcessor WinterFlowRouterStructure;

    public WinterFlowDataSourceWebsocket(WinterFlowFunctionProcessor winterFlowFunctionProcessor, WinterFlowFunctionProcessor winterFlowFunctionProcessor2, WinterFlowDatabaseSchemaBatch winterFlowDatabaseSchemaBatch, WinterFlowJSONProxy winterFlowJSONProxy, WinterFlowStackProvider winterFlowStackProvider) {
        this.WinterFlowRouterStructure = winterFlowFunctionProcessor;
        this.WinterFlowHookDataSource = winterFlowFunctionProcessor2;
        this.WinterFlowCacheManagerAgent = winterFlowDatabaseSchemaBatch;
        this.WinterFlowArrayNetwork = winterFlowJSONProxy;
        ((Executor) winterFlowStackProvider.WinterFlowVariableVersionControl).execute(new WinterFlowServerConcurrency(12, winterFlowStackProvider));
    }

    public static void WinterFlowHookDataSource(Context context) {
        if (WinterFlowVariableVersionControl == null) {
            synchronized (WinterFlowDataSourceWebsocket.class) {
                try {
                    if (WinterFlowVariableVersionControl == null) {
                        WinterFlowUIMiddleware winterFlowUIMiddleware = new WinterFlowUIMiddleware();
                        context.getClass();
                        winterFlowUIMiddleware.WinterFlowRouterStructure = context;
                        WinterFlowVariableVersionControl = winterFlowUIMiddleware.WinterFlowRouterStructure();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static WinterFlowDataSourceWebsocket WinterFlowRouterStructure() {
        WinterFlowDataSourceObject winterFlowDataSourceObject = WinterFlowVariableVersionControl;
        if (winterFlowDataSourceObject != null) {
            return (WinterFlowDataSourceWebsocket) winterFlowDataSourceObject.WinterFlowResponseEngine.get();
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Not initialized!");
        return null;
    }

    public final WinterFlowNodePlatform WinterFlowCacheManagerAgent(WinterFlowCacheTransaction winterFlowCacheTransaction) {
        Set unmodifiableSet = winterFlowCacheTransaction instanceof WinterFlowCacheTransaction ? Collections.unmodifiableSet(WinterFlowCacheTransaction.WinterFlowArrayNetwork) : Collections.singleton(new WinterFlowFrontendCache("proto"));
        WinterFlowObjectPackage WinterFlowRouterStructure = WinterFlowViewNode.WinterFlowRouterStructure();
        winterFlowCacheTransaction.getClass();
        WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy = "cct";
        String str = winterFlowCacheTransaction.WinterFlowRouterStructure;
        String str2 = winterFlowCacheTransaction.WinterFlowHookDataSource;
        if (str2 == null) {
            str2 = "";
        }
        WinterFlowRouterStructure.WinterFlowUnitTestResponse = ("1$" + str + "\\" + str2).getBytes(Charset.forName(Constants.ENCODING));
        return new WinterFlowNodePlatform(unmodifiableSet, WinterFlowRouterStructure.WinterFlowArrayNetwork(), this);
    }
}
