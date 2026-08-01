package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowPipelineService extends WinterFlowDeserializationNetwork {
    public final WinterFlowObjectUI WinterFlowHookDataSource;
    public final boolean WinterFlowRouterStructure;

    public WinterFlowPipelineService(boolean z, WinterFlowObjectUI winterFlowObjectUI) {
        this.WinterFlowRouterStructure = z;
        this.WinterFlowHookDataSource = winterFlowObjectUI;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        return new WinterFlowDataSourceConsumer(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        boolean z;
        boolean z2;
        WinterFlowLibraryDeployment winterFlowLibraryDeployment;
        WinterFlowDataSourceConsumer winterFlowDataSourceConsumer = (WinterFlowDataSourceConsumer) winterFlowUserManagerController;
        WinterFlowDeploymentMechanism winterFlowDeploymentMechanism = winterFlowDataSourceConsumer.WinterFlowConsumerUserManager;
        boolean z3 = true;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowDataSourceConsumer.WinterFlowSoftwareProtocol, null)) {
            z = false;
        } else {
            winterFlowDataSourceConsumer.WinterFlowWidgetProcess();
            winterFlowDataSourceConsumer.WinterFlowSoftwareProtocol = null;
            winterFlowDataSourceConsumer.WinterFlowRouterAdapter = null;
            z = true;
        }
        if (!winterFlowDataSourceConsumer.WinterFlowSerializerStructure) {
            winterFlowDataSourceConsumer.WinterFlowSerializerStructure = true;
            winterFlowDataSourceConsumer.WinterFlowEventEmitterController();
            z = true;
        }
        boolean z4 = winterFlowDataSourceConsumer.WinterFlowMapperProtocol;
        boolean z5 = this.WinterFlowRouterStructure;
        if (z4 != z5) {
            if (z5) {
                winterFlowDataSourceConsumer.WinterFlowValidatorNetwork(winterFlowDeploymentMechanism);
            } else {
                winterFlowDataSourceConsumer.WinterFlowUIPlatform(winterFlowDeploymentMechanism);
                winterFlowDataSourceConsumer.WinterFlowWidgetProcess();
            }
            WinterFlowFrameworkMechanism.WinterFlowRouterRouter(winterFlowDataSourceConsumer);
            winterFlowDataSourceConsumer.WinterFlowMapperProtocol = z5;
        }
        winterFlowDataSourceConsumer.WinterFlowResolverController = this.WinterFlowHookDataSource;
        boolean z6 = winterFlowDataSourceConsumer.WinterFlowUserManagerUserManager;
        WinterFlowJSONDecorator winterFlowJSONDecorator = winterFlowDataSourceConsumer.WinterFlowSoftwareProtocol;
        if (z6 != (winterFlowJSONDecorator == null)) {
            z2 = winterFlowJSONDecorator == null;
            winterFlowDataSourceConsumer.WinterFlowUserManagerUserManager = z2;
            if (z2 || winterFlowDataSourceConsumer.WinterFlowArrayHelper != null) {
                z6 = z2;
            }
            if (z3 && ((winterFlowLibraryDeployment = winterFlowDataSourceConsumer.WinterFlowArrayHelper) != null || !z2)) {
                if (winterFlowLibraryDeployment != null) {
                    winterFlowDataSourceConsumer.WinterFlowUIPlatform(winterFlowLibraryDeployment);
                }
                winterFlowDataSourceConsumer.WinterFlowArrayHelper = null;
                winterFlowDataSourceConsumer.WinterFlowRepositoryAlgorithm();
            }
            winterFlowDeploymentMechanism.WinterFlowWidgetProcess(winterFlowDataSourceConsumer.WinterFlowRouterAdapter);
        }
        z2 = z6;
        z3 = z;
        if (z3) {
            if (winterFlowLibraryDeployment != null) {
            }
            winterFlowDataSourceConsumer.WinterFlowArrayHelper = null;
            winterFlowDataSourceConsumer.WinterFlowRepositoryAlgorithm();
        }
        winterFlowDeploymentMechanism.WinterFlowWidgetProcess(winterFlowDataSourceConsumer.WinterFlowRouterAdapter);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowPipelineService.class != obj.getClass()) {
            return false;
        }
        WinterFlowPipelineService winterFlowPipelineService = (WinterFlowPipelineService) obj;
        return this.WinterFlowRouterStructure == winterFlowPipelineService.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowPipelineService.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() + WinterFlowSingletonMapper.WinterFlowRouterStructure(Boolean.hashCode(true) * 31, 29791, this.WinterFlowRouterStructure);
    }
}
