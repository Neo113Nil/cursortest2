package com.google.android.datatransport;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowEventEmitterOrchestration implements WinterFlowFunctionEngine, WinterFlowAlgorithmSystem, WinterFlowFrontendDatabase, WinterFlowInterfaceScript {
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowEventEmitterOrchestration(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    public static /* synthetic */ void WinterFlowArrayNetwork(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void WinterFlowBandwidthObject(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void WinterFlowBatchUI(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void WinterFlowConcurrencyThread(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void WinterFlowOrchestrationSubsystem(String str, Object obj, Object obj2) {
        throw new WinterFlowServerSystem(str + obj + obj2);
    }

    public static /* synthetic */ void WinterFlowResponseEngine(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void WinterFlowRouterAdapter(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void WinterFlowRouterRouter(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void WinterFlowRouterStructure() {
        throw new WinterFlowServerSystem();
    }

    public static /* synthetic */ void WinterFlowServerProtocol(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void WinterFlowServiceUtility(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void WinterFlowSingletonPlatform(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void WinterFlowSyntax(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void WinterFlowThreadListener() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void WinterFlowTransactionAgent(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void WinterFlowTransactionManagerStrategy(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void WinterFlowVariableBandwidth() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void WinterFlowVariableVersionControl(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    @Override // com.google.android.datatransport.WinterFlowFunctionEngine
    public boolean WinterFlowCacheManagerAgent() {
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceScript
    public Object WinterFlowUnitTestResponse(WinterFlowRequestEngine winterFlowRequestEngine) {
        WinterFlowMiddlewareView lambda$getComponents$0;
        WinterFlowMiddlewareView lambda$getComponents$1;
        WinterFlowMiddlewareView lambda$getComponents$2;
        switch (this.WinterFlowVariableVersionControl) {
            case 23:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(winterFlowRequestEngine);
                return lambda$getComponents$0;
            case 24:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(winterFlowRequestEngine);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(winterFlowRequestEngine);
                return lambda$getComponents$2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendDatabase
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                WinterFlowObjectPackage WinterFlowRouterStructure = WinterFlowViewNode.WinterFlowRouterStructure();
                WinterFlowRouterStructure.WinterFlowResolverController(rawQuery.getString(1));
                WinterFlowRouterStructure.WinterFlowRouterRouter = WinterFlowProxyCompiler.WinterFlowHookDataSource(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                WinterFlowRouterStructure.WinterFlowUnitTestResponse = string == null ? null : Base64.decode(string, 0);
                arrayList.add(WinterFlowRouterStructure.WinterFlowArrayNetwork());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
    public double WinterFlowHookDataSource(double d) {
        return d;
    }
}
