package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProtocolInterface {
    public final WinterFlowOrchestrationValidator WinterFlowArrayNetwork;
    public final WinterFlowIDEFramework WinterFlowCacheManagerAgent;
    public final WinterFlowHandlerPlatform WinterFlowHookDataSource;
    public final LinkedHashSet WinterFlowResponseEngine;
    public WinterFlowControllerDebug WinterFlowRouterRouter;
    public final WinterFlowHandlerPlatform WinterFlowRouterStructure = WinterFlowTestingCloud.WinterFlowCacheManagerAgent(WinterFlowFunctionModule.WinterFlowSingletonPlatform);
    public boolean WinterFlowServerProtocol;
    public boolean WinterFlowServiceUtility;
    public final LinkedHashSet WinterFlowSyntax;
    public boolean WinterFlowThreadListener;
    public final LinkedHashSet WinterFlowTransactionAgent;
    public WinterFlowStackIDE WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public final WinterFlowOrchestrationValidator WinterFlowVariableVersionControl;

    public WinterFlowProtocolInterface() {
        WinterFlowHandlerPlatform WinterFlowCacheManagerAgent = WinterFlowTestingCloud.WinterFlowCacheManagerAgent(new WinterFlowClassHelper());
        this.WinterFlowHookDataSource = WinterFlowCacheManagerAgent;
        this.WinterFlowCacheManagerAgent = new WinterFlowIDEFramework(WinterFlowCacheManagerAgent);
        this.WinterFlowArrayNetwork = new WinterFlowOrchestrationValidator();
        this.WinterFlowVariableVersionControl = new WinterFlowOrchestrationValidator();
        this.WinterFlowSyntax = new LinkedHashSet();
        this.WinterFlowResponseEngine = new LinkedHashSet();
        this.WinterFlowTransactionAgent = new LinkedHashSet();
    }

    public final WinterFlowStackIDE WinterFlowCacheManagerAgent(int i) {
        Object obj;
        Object obj2;
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = this.WinterFlowVariableVersionControl;
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator2 = this.WinterFlowArrayNetwork;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = winterFlowOrchestrationValidator2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((WinterFlowStackIDE) obj).WinterFlowHookDataSource) {
                    break;
                }
            }
            WinterFlowStackIDE winterFlowStackIDE = (WinterFlowStackIDE) obj;
            if (winterFlowStackIDE != null) {
                return winterFlowStackIDE;
            }
            Iterator it2 = winterFlowOrchestrationValidator.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((WinterFlowStackIDE) next).WinterFlowHookDataSource) {
                    obj3 = next;
                    break;
                }
            }
            return (WinterFlowStackIDE) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = winterFlowOrchestrationValidator2.iterator();
            while (it3.hasNext()) {
                ((WinterFlowStackIDE) it3.next()).getClass();
            }
            Iterator it4 = winterFlowOrchestrationValidator.iterator();
            while (it4.hasNext()) {
                ((WinterFlowStackIDE) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = winterFlowOrchestrationValidator2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((WinterFlowStackIDE) obj2).WinterFlowHookDataSource) {
                break;
            }
        }
        WinterFlowStackIDE winterFlowStackIDE2 = (WinterFlowStackIDE) obj2;
        if (winterFlowStackIDE2 != null) {
            return winterFlowStackIDE2;
        }
        Iterator it6 = winterFlowOrchestrationValidator.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((WinterFlowStackIDE) next2).WinterFlowHookDataSource) {
                obj3 = next2;
                break;
            }
        }
        return (WinterFlowStackIDE) obj3;
    }

    public final void WinterFlowHookDataSource() {
        boolean z;
        boolean z2;
        WinterFlowClassHelper winterFlowClassHelper;
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = this.WinterFlowArrayNetwork;
        if (!winterFlowOrchestrationValidator.isEmpty()) {
            Iterator it = winterFlowOrchestrationValidator.iterator();
            while (it.hasNext()) {
                if (((WinterFlowStackIDE) it.next()).WinterFlowHookDataSource) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator2 = this.WinterFlowVariableVersionControl;
        if (!winterFlowOrchestrationValidator2.isEmpty()) {
            Iterator it2 = winterFlowOrchestrationValidator2.iterator();
            while (it2.hasNext()) {
                if (((WinterFlowStackIDE) it2.next()).WinterFlowHookDataSource) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.WinterFlowThreadListener != z;
        boolean z5 = this.WinterFlowServerProtocol != z2;
        boolean z6 = this.WinterFlowServiceUtility != z3;
        LinkedHashSet linkedHashSet = this.WinterFlowTransactionAgent;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((WinterFlowControllerDebug) it3.next()).WinterFlowHookDataSource(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.WinterFlowResponseEngine;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((WinterFlowControllerDebug) it4.next()).WinterFlowHookDataSource(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.WinterFlowSyntax;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((WinterFlowControllerDebug) it5.next()).WinterFlowHookDataSource(z3);
            }
        }
        this.WinterFlowThreadListener = z;
        this.WinterFlowServerProtocol = z2;
        this.WinterFlowServiceUtility = z3;
        WinterFlowStackIDE winterFlowStackIDE = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowStackIDE == null) {
            winterFlowStackIDE = WinterFlowCacheManagerAgent(0);
        }
        WinterFlowStackIDE winterFlowStackIDE2 = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowStackIDE2 == null) {
            winterFlowStackIDE2 = WinterFlowCacheManagerAgent(0);
        }
        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowStackIDE2, winterFlowStackIDE)) {
            if (winterFlowStackIDE2 == null) {
                winterFlowClassHelper = new WinterFlowClassHelper();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = winterFlowOrchestrationValidator.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((WinterFlowStackIDE) it6.next()).WinterFlowHookDataSource;
                }
                Iterator<E> it7 = winterFlowOrchestrationValidator2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((WinterFlowStackIDE) it7.next()).WinterFlowHookDataSource;
                }
                WinterFlowTestingCloud winterFlowTestingCloud = winterFlowStackIDE2.WinterFlowRouterStructure;
                WinterFlowUserManagerResolver WinterFlowBatchUI = WinterFlowUnitTestLibrary.WinterFlowBatchUI();
                WinterFlowEventEmitterNode.WinterFlowVariableInterface(WinterFlowBatchUI, arrayList);
                WinterFlowBatchUI.add(winterFlowTestingCloud);
                WinterFlowEventEmitterNode.WinterFlowVariableInterface(WinterFlowBatchUI, WinterFlowDataSourceEngine.WinterFlowVariableVersionControl);
                winterFlowClassHelper = new WinterFlowClassHelper(arrayList.size(), WinterFlowUnitTestLibrary.WinterFlowServerProtocol(WinterFlowBatchUI));
            }
            WinterFlowHandlerPlatform winterFlowHandlerPlatform = this.WinterFlowHookDataSource;
            if (WinterFlowManagerRequest.WinterFlowThreadListener((WinterFlowClassHelper) winterFlowHandlerPlatform.getValue(), winterFlowClassHelper)) {
                return;
            }
            winterFlowHandlerPlatform.WinterFlowTransactionAgent(null, winterFlowClassHelper);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((WinterFlowControllerDebug) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((WinterFlowControllerDebug) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((WinterFlowControllerDebug) it10.next()).getClass();
            }
        }
    }

    public final void WinterFlowRouterStructure(WinterFlowStackProvider winterFlowStackProvider, WinterFlowControllerDebug winterFlowControllerDebug, int i) {
        winterFlowStackProvider.getClass();
        if (winterFlowControllerDebug.WinterFlowRouterStructure == null) {
            (i != 0 ? i != 1 ? this.WinterFlowSyntax : this.WinterFlowResponseEngine : this.WinterFlowTransactionAgent).add(winterFlowControllerDebug);
            winterFlowControllerDebug.WinterFlowRouterStructure = winterFlowStackProvider;
            ((WinterFlowClassHelper) this.WinterFlowCacheManagerAgent.WinterFlowVariableVersionControl.getValue()).getClass();
            winterFlowControllerDebug.WinterFlowHookDataSource(i != 0 ? i != 1 ? this.WinterFlowServiceUtility : this.WinterFlowServerProtocol : this.WinterFlowThreadListener);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(winterFlowControllerDebug);
        WinterFlowStackProvider winterFlowStackProvider2 = winterFlowControllerDebug.WinterFlowRouterStructure;
        sb.append("' is already added to dispatcher ");
        sb.append(winterFlowStackProvider2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
