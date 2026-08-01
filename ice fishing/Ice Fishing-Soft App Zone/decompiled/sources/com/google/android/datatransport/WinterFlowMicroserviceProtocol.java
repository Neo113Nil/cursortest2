package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMicroserviceProtocol {
    public String WinterFlowArrayNetwork;
    public int WinterFlowCacheManagerAgent;
    public final WinterFlowRequestListener WinterFlowHookDataSource = new WinterFlowRequestListener();
    public final WinterFlowSerializerMicroservice WinterFlowRouterStructure;
    public String WinterFlowVariableVersionControl;

    public WinterFlowMicroserviceProtocol(WinterFlowSerializerMicroservice winterFlowSerializerMicroservice) {
        this.WinterFlowRouterStructure = winterFlowSerializerMicroservice;
    }

    public final WinterFlowLoaderValidator WinterFlowArrayNetwork(WinterFlowLoaderValidator winterFlowLoaderValidator, WinterFlowObjectPackage winterFlowObjectPackage, boolean z, WinterFlowServerLayer winterFlowServerLayer) {
        WinterFlowLoaderValidator winterFlowLoaderValidator2;
        ArrayList arrayList = new ArrayList();
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice = this.WinterFlowRouterStructure;
        Iterator it = winterFlowSerializerMicroservice.iterator();
        while (true) {
            WinterFlowThreadFramework winterFlowThreadFramework = (WinterFlowThreadFramework) it;
            if (!winterFlowThreadFramework.hasNext()) {
                break;
            }
            WinterFlowServerLayer winterFlowServerLayer2 = (WinterFlowServerLayer) winterFlowThreadFramework.next();
            winterFlowLoaderValidator2 = WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowServerLayer2, winterFlowServerLayer) ? null : winterFlowServerLayer2.WinterFlowArrayNetwork(winterFlowObjectPackage);
            if (winterFlowLoaderValidator2 != null) {
                arrayList.add(winterFlowLoaderValidator2);
            }
        }
        WinterFlowLoaderValidator winterFlowLoaderValidator3 = (WinterFlowLoaderValidator) WinterFlowSerializerUtility.WinterFlowRefactoringThreadPool(arrayList);
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice2 = winterFlowSerializerMicroservice.WinterFlowUnitTestResponse;
        if (winterFlowSerializerMicroservice2 != null && z && !winterFlowSerializerMicroservice2.equals(winterFlowServerLayer)) {
            winterFlowLoaderValidator2 = winterFlowSerializerMicroservice2.WinterFlowVariableVersionControl(winterFlowObjectPackage, winterFlowSerializerMicroservice);
        }
        return (WinterFlowLoaderValidator) WinterFlowSerializerUtility.WinterFlowRefactoringThreadPool(WinterFlowProtocolPipeline.WinterFlowValidatorHandler(new WinterFlowLoaderValidator[]{winterFlowLoaderValidator, winterFlowLoaderValidator3, winterFlowLoaderValidator2}));
    }

    public final WinterFlowServerLayer WinterFlowCacheManagerAgent(int i, WinterFlowServerLayer winterFlowServerLayer, WinterFlowServerLayer winterFlowServerLayer2, boolean z) {
        WinterFlowRequestListener winterFlowRequestListener = this.WinterFlowHookDataSource;
        WinterFlowServerLayer winterFlowServerLayer3 = (WinterFlowServerLayer) WinterFlowCloudStack.WinterFlowThreadListener(winterFlowRequestListener, i);
        if (winterFlowServerLayer2 != null) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowServerLayer3, winterFlowServerLayer2) && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowServerLayer3.WinterFlowUnitTestResponse, winterFlowServerLayer2.WinterFlowUnitTestResponse)) {
                return winterFlowServerLayer3;
            }
            winterFlowServerLayer3 = null;
        } else if (winterFlowServerLayer3 != null) {
            return winterFlowServerLayer3;
        }
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice = this.WinterFlowRouterStructure;
        if (z) {
            Iterator it = ((WinterFlowConfigurationFrontend) WinterFlowFrontendSubsystem.WinterFlowThreadListener(new WinterFlowSoftware(2, winterFlowRequestListener))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    winterFlowServerLayer3 = null;
                    break;
                }
                WinterFlowServerLayer winterFlowServerLayer4 = (WinterFlowServerLayer) it.next();
                winterFlowServerLayer3 = (!(winterFlowServerLayer4 instanceof WinterFlowSerializerMicroservice) || winterFlowServerLayer4.equals(winterFlowServerLayer)) ? null : ((WinterFlowSerializerMicroservice) winterFlowServerLayer4).WinterFlowResponseEngine.WinterFlowCacheManagerAgent(i, winterFlowSerializerMicroservice, winterFlowServerLayer2, true);
                if (winterFlowServerLayer3 != null) {
                    break;
                }
            }
        }
        if (winterFlowServerLayer3 != null) {
            return winterFlowServerLayer3;
        }
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice2 = winterFlowSerializerMicroservice.WinterFlowUnitTestResponse;
        if (winterFlowSerializerMicroservice2 == null || winterFlowSerializerMicroservice2.equals(winterFlowServerLayer)) {
            return null;
        }
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice3 = winterFlowSerializerMicroservice.WinterFlowUnitTestResponse;
        winterFlowSerializerMicroservice3.getClass();
        return winterFlowSerializerMicroservice3.WinterFlowResponseEngine.WinterFlowCacheManagerAgent(i, winterFlowSerializerMicroservice, winterFlowServerLayer2, z);
    }

    public final WinterFlowServerLayer WinterFlowHookDataSource(String str, boolean z) {
        Object obj;
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice;
        str.getClass();
        Iterator it = ((WinterFlowConfigurationFrontend) WinterFlowFrontendSubsystem.WinterFlowThreadListener(new WinterFlowSoftware(2, this.WinterFlowHookDataSource))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            WinterFlowServerLayer winterFlowServerLayer = (WinterFlowServerLayer) obj;
            String str2 = (String) winterFlowServerLayer.WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl;
            if ((str2 == null ? str == null : str2.equals(str)) || winterFlowServerLayer.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(str) != null) {
                break;
            }
        }
        WinterFlowServerLayer winterFlowServerLayer2 = (WinterFlowServerLayer) obj;
        if (winterFlowServerLayer2 != null) {
            return winterFlowServerLayer2;
        }
        if (!z || (winterFlowSerializerMicroservice = this.WinterFlowRouterStructure.WinterFlowUnitTestResponse) == null) {
            return null;
        }
        WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol = winterFlowSerializerMicroservice.WinterFlowResponseEngine;
        winterFlowMicroserviceProtocol.getClass();
        if (WinterFlowFrameworkStrategy.WinterFlowArrayHelper(str)) {
            return null;
        }
        return winterFlowMicroserviceProtocol.WinterFlowHookDataSource(str, true);
    }

    public final WinterFlowServerLayer WinterFlowRouterStructure(int i) {
        return WinterFlowCacheManagerAgent(i, this.WinterFlowRouterStructure, null, false);
    }
}
