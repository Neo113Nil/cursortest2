package com.google.android.datatransport;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionOrchestration {
    public final String WinterFlowArrayNetwork;
    public final Context WinterFlowCacheManagerAgent;
    public final WinterFlowObjectEngine WinterFlowHookDataSource;
    public final WinterFlowEventDecorator WinterFlowRouterStructure;
    public final LinkedHashSet WinterFlowTransactionManagerStrategy;
    public final WinterFlowRendererNode WinterFlowVariableVersionControl;

    public WinterFlowTransactionOrchestration(Context context, String str, Set set, WinterFlowEventDecorator winterFlowEventDecorator, WinterFlowObjectEngine winterFlowObjectEngine) {
        LinkedHashSet linkedHashSet;
        set.getClass();
        WinterFlowJavaSession winterFlowJavaSession = new WinterFlowJavaSession(10, context, str);
        this.WinterFlowRouterStructure = winterFlowEventDecorator;
        this.WinterFlowHookDataSource = winterFlowObjectEngine;
        this.WinterFlowCacheManagerAgent = context;
        this.WinterFlowArrayNetwork = str;
        this.WinterFlowVariableVersionControl = new WinterFlowRendererNode(winterFlowJavaSession);
        if (set == WinterFlowFunctionDeployment.WinterFlowRouterStructure) {
            linkedHashSet = null;
        } else {
            Set set2 = set;
            if (set2 instanceof Collection) {
                linkedHashSet = new LinkedHashSet(set2);
            } else {
                linkedHashSet = new LinkedHashSet();
                WinterFlowSerializerUtility.WinterFlowClassConsumer(set2, linkedHashSet);
            }
        }
        this.WinterFlowTransactionManagerStrategy = linkedHashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r4.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(Object obj, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowSoftwareConcurrency winterFlowSoftwareConcurrency;
        Object obj2;
        int i;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowSoftwareConcurrency) {
            winterFlowSoftwareConcurrency = (WinterFlowSoftwareConcurrency) winterFlowOrchestrationCompiler;
            int i2 = winterFlowSoftwareConcurrency.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowSoftwareConcurrency.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                obj2 = winterFlowSoftwareConcurrency.WinterFlowSyntax;
                i = winterFlowSoftwareConcurrency.WinterFlowTransactionAgent;
                boolean z = true;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                    winterFlowSoftwareConcurrency.WinterFlowRouterRouter = this;
                    winterFlowSoftwareConcurrency.WinterFlowTransactionAgent = 1;
                    obj2 = this.WinterFlowRouterStructure.WinterFlowVariableVersionControl(obj, winterFlowSoftwareConcurrency);
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (obj2 == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = winterFlowSoftwareConcurrency.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = this.WinterFlowTransactionManagerStrategy;
                WinterFlowRendererNode winterFlowRendererNode = this.WinterFlowVariableVersionControl;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) winterFlowRendererNode.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                Map<String, ?> all = ((SharedPreferences) winterFlowRendererNode.getValue()).getAll();
                all.getClass();
            }
        }
        winterFlowSoftwareConcurrency = new WinterFlowSoftwareConcurrency(this, winterFlowOrchestrationCompiler);
        obj2 = winterFlowSoftwareConcurrency.WinterFlowSyntax;
        i = winterFlowSoftwareConcurrency.WinterFlowTransactionAgent;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
