package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowSerializerMicroservice extends WinterFlowServerLayer implements Iterable, WinterFlowLoaderProcess {
    public static final /* synthetic */ int WinterFlowTransactionAgent = 0;
    public final WinterFlowMicroserviceProtocol WinterFlowResponseEngine;

    public WinterFlowSerializerMicroservice(WinterFlowParserAlgorithm winterFlowParserAlgorithm) {
        super(winterFlowParserAlgorithm);
        this.WinterFlowResponseEngine = new WinterFlowMicroserviceProtocol(this);
    }

    @Override // com.google.android.datatransport.WinterFlowServerLayer
    public final WinterFlowLoaderValidator WinterFlowArrayNetwork(WinterFlowObjectPackage winterFlowObjectPackage) {
        WinterFlowLoaderValidator WinterFlowArrayNetwork = super.WinterFlowArrayNetwork(winterFlowObjectPackage);
        WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol = this.WinterFlowResponseEngine;
        winterFlowMicroserviceProtocol.getClass();
        return winterFlowMicroserviceProtocol.WinterFlowArrayNetwork(WinterFlowArrayNetwork, winterFlowObjectPackage, false, winterFlowMicroserviceProtocol.WinterFlowRouterStructure);
    }

    public final WinterFlowLoaderValidator WinterFlowTransactionManagerStrategy(String str, boolean z, WinterFlowServerLayer winterFlowServerLayer) {
        WinterFlowLoaderValidator winterFlowLoaderValidator;
        WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol = this.WinterFlowResponseEngine;
        winterFlowMicroserviceProtocol.getClass();
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice = winterFlowMicroserviceProtocol.WinterFlowRouterStructure;
        WinterFlowLoaderValidator WinterFlowRouterStructure = winterFlowSerializerMicroservice.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = winterFlowSerializerMicroservice.iterator();
        while (true) {
            WinterFlowThreadFramework winterFlowThreadFramework = (WinterFlowThreadFramework) it;
            winterFlowLoaderValidator = null;
            if (!winterFlowThreadFramework.hasNext()) {
                break;
            }
            WinterFlowServerLayer winterFlowServerLayer2 = (WinterFlowServerLayer) winterFlowThreadFramework.next();
            if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowServerLayer2, winterFlowServerLayer)) {
                if (winterFlowServerLayer2 instanceof WinterFlowSerializerMicroservice) {
                    winterFlowLoaderValidator = ((WinterFlowSerializerMicroservice) winterFlowServerLayer2).WinterFlowTransactionManagerStrategy(str, false, winterFlowSerializerMicroservice);
                } else {
                    winterFlowServerLayer2.getClass();
                    winterFlowLoaderValidator = winterFlowServerLayer2.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(str);
                }
            }
            if (winterFlowLoaderValidator != null) {
                arrayList.add(winterFlowLoaderValidator);
            }
        }
        WinterFlowLoaderValidator winterFlowLoaderValidator2 = (WinterFlowLoaderValidator) WinterFlowSerializerUtility.WinterFlowRefactoringThreadPool(arrayList);
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice2 = winterFlowSerializerMicroservice.WinterFlowUnitTestResponse;
        if (winterFlowSerializerMicroservice2 != null && z && !winterFlowSerializerMicroservice2.equals(winterFlowServerLayer)) {
            winterFlowLoaderValidator = winterFlowSerializerMicroservice2.WinterFlowTransactionManagerStrategy(str, true, winterFlowSerializerMicroservice);
        }
        return (WinterFlowLoaderValidator) WinterFlowSerializerUtility.WinterFlowRefactoringThreadPool(WinterFlowProtocolPipeline.WinterFlowValidatorHandler(new WinterFlowLoaderValidator[]{WinterFlowRouterStructure, winterFlowLoaderValidator2, winterFlowLoaderValidator}));
    }

    public final WinterFlowLoaderValidator WinterFlowVariableVersionControl(WinterFlowObjectPackage winterFlowObjectPackage, WinterFlowServerLayer winterFlowServerLayer) {
        return this.WinterFlowResponseEngine.WinterFlowArrayNetwork(super.WinterFlowArrayNetwork(winterFlowObjectPackage), winterFlowObjectPackage, true, winterFlowServerLayer);
    }

    @Override // com.google.android.datatransport.WinterFlowServerLayer
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WinterFlowSerializerMicroservice) || !super.equals(obj)) {
            return false;
        }
        WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol = this.WinterFlowResponseEngine;
        int WinterFlowArrayNetwork = winterFlowMicroserviceProtocol.WinterFlowHookDataSource.WinterFlowArrayNetwork();
        WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol2 = ((WinterFlowSerializerMicroservice) obj).WinterFlowResponseEngine;
        if (WinterFlowArrayNetwork != winterFlowMicroserviceProtocol2.WinterFlowHookDataSource.WinterFlowArrayNetwork() || winterFlowMicroserviceProtocol.WinterFlowCacheManagerAgent != winterFlowMicroserviceProtocol2.WinterFlowCacheManagerAgent) {
            return false;
        }
        Iterator it = ((WinterFlowConfigurationFrontend) WinterFlowFrontendSubsystem.WinterFlowThreadListener(new WinterFlowSoftware(2, winterFlowMicroserviceProtocol.WinterFlowHookDataSource))).iterator();
        while (it.hasNext()) {
            WinterFlowServerLayer winterFlowServerLayer = (WinterFlowServerLayer) it.next();
            if (!winterFlowServerLayer.equals(WinterFlowCloudStack.WinterFlowThreadListener(winterFlowMicroserviceProtocol2.WinterFlowHookDataSource, winterFlowServerLayer.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowServerLayer
    public final int hashCode() {
        WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol = this.WinterFlowResponseEngine;
        int i = winterFlowMicroserviceProtocol.WinterFlowCacheManagerAgent;
        WinterFlowRequestListener winterFlowRequestListener = winterFlowMicroserviceProtocol.WinterFlowHookDataSource;
        int WinterFlowArrayNetwork = winterFlowRequestListener.WinterFlowArrayNetwork();
        for (int i2 = 0; i2 < WinterFlowArrayNetwork; i2++) {
            i = (((i * 31) + winterFlowRequestListener.WinterFlowHookDataSource(i2)) * 31) + ((WinterFlowServerLayer) winterFlowRequestListener.WinterFlowVariableVersionControl(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol = this.WinterFlowResponseEngine;
        winterFlowMicroserviceProtocol.getClass();
        return new WinterFlowThreadFramework(winterFlowMicroserviceProtocol);
    }

    @Override // com.google.android.datatransport.WinterFlowServerLayer
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol = this.WinterFlowResponseEngine;
        String str = winterFlowMicroserviceProtocol.WinterFlowVariableVersionControl;
        winterFlowMicroserviceProtocol.getClass();
        WinterFlowServerLayer WinterFlowHookDataSource = (str == null || WinterFlowFrameworkStrategy.WinterFlowArrayHelper(str)) ? null : winterFlowMicroserviceProtocol.WinterFlowHookDataSource(str, true);
        if (WinterFlowHookDataSource == null) {
            WinterFlowHookDataSource = winterFlowMicroserviceProtocol.WinterFlowRouterStructure(winterFlowMicroserviceProtocol.WinterFlowCacheManagerAgent);
        }
        sb.append(" startDestination=");
        if (WinterFlowHookDataSource == null) {
            String str2 = winterFlowMicroserviceProtocol.WinterFlowVariableVersionControl;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = winterFlowMicroserviceProtocol.WinterFlowArrayNetwork;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(winterFlowMicroserviceProtocol.WinterFlowCacheManagerAgent));
                }
            }
        } else {
            sb.append("{");
            sb.append(WinterFlowHookDataSource.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
