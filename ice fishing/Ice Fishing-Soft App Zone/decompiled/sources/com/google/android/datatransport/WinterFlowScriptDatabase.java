package com.google.android.datatransport;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptDatabase extends WinterFlowRouterGateway implements Set, Collection, WinterFlowLoaderProcess {
    public static final WinterFlowScriptDatabase WinterFlowRouterRouter;
    public final Object WinterFlowTransactionManagerStrategy;
    public final WinterFlowUIRouter WinterFlowUnitTestResponse;
    public final Object WinterFlowVariableVersionControl;

    static {
        WinterFlowCacheUtility winterFlowCacheUtility = WinterFlowCacheUtility.WinterFlowCompilerVariable;
        WinterFlowRouterRouter = new WinterFlowScriptDatabase(winterFlowCacheUtility, winterFlowCacheUtility, WinterFlowUIRouter.WinterFlowUnitTestResponse);
    }

    public WinterFlowScriptDatabase(Object obj, Object obj2, WinterFlowUIRouter winterFlowUIRouter) {
        this.WinterFlowVariableVersionControl = obj;
        this.WinterFlowTransactionManagerStrategy = obj2;
        this.WinterFlowUnitTestResponse = winterFlowUIRouter;
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.WinterFlowUnitTestResponse.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new WinterFlowNetworkHelper(this.WinterFlowVariableVersionControl, this.WinterFlowUnitTestResponse);
    }
}
