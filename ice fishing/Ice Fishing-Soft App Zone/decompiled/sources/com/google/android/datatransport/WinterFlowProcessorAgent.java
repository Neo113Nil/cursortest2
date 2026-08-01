package com.google.android.datatransport;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorAgent implements WinterFlowControllerProxy {
    public WinterFlowPipelineObject WinterFlowRouterRouter;
    public WinterFlowEventEmitterFramework WinterFlowTransactionManagerStrategy;
    public final WinterFlowObjectHandler WinterFlowUnitTestResponse = new WinterFlowObjectHandler(1.0f);
    public final Context WinterFlowVariableVersionControl;

    public WinterFlowProcessorAgent(Context context) {
        this.WinterFlowVariableVersionControl = context;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowStrategyPackage WinterFlowConsumerUserManager(WinterFlowRendererProvider winterFlowRendererProvider) {
        return WinterFlowTestingCloud.WinterFlowBatchUI(this, winterFlowRendererProvider);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        return WinterFlowTestingCloud.WinterFlowArrayHelper(this, winterFlowEncryptionMicroservice);
    }

    @Override // com.google.android.datatransport.WinterFlowControllerProxy
    public final float WinterFlowSerializerStructure() {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer;
        WinterFlowHookView winterFlowHookView;
        if (this.WinterFlowRouterRouter == null) {
            Context context = this.WinterFlowVariableVersionControl;
            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = WinterFlowDeserializationSystem.WinterFlowRouterStructure;
            synchronized (winterFlowDatabaseSchemaStructure) {
                try {
                    Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(context);
                    winterFlowTransactionManagerLayer = null;
                    if (WinterFlowUnitTestResponse == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        WinterFlowWorkerThreadPool WinterFlowRouterStructure = WinterFlowHandlerWebsocket.WinterFlowRouterStructure(-1, 6, null);
                        WinterFlowUserManagerQuery winterFlowUserManagerQuery = new WinterFlowUserManagerQuery(1, new WinterFlowViewProtocol(contentResolver, uriFor, new WinterFlowQueryInterface(WinterFlowRouterStructure, WinterFlowServerManager.WinterFlowServiceUtility(Looper.getMainLooper())), WinterFlowRouterStructure, context, null));
                        WinterFlowScriptSubsystem WinterFlowHookDataSource = WinterFlowFrameworkMechanism.WinterFlowHookDataSource();
                        WinterFlowCacheDecorator winterFlowCacheDecorator = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
                        WinterFlowUnitTestResponse = WinterFlowCacheRuntime.WinterFlowFrameworkTransaction(winterFlowUserManagerQuery, new WinterFlowEventEmitterFramework(WinterFlowTestingCloud.WinterFlowArrayHelper(WinterFlowHookDataSource, WinterFlowEventEmitterRepository.WinterFlowRouterStructure)), new WinterFlowLibraryAdapter(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(context, WinterFlowUnitTestResponse);
                    }
                    winterFlowHookView = (WinterFlowHookView) WinterFlowUnitTestResponse;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.WinterFlowUnitTestResponse.WinterFlowSyntax(((Number) winterFlowHookView.getValue()).floatValue());
            WinterFlowEventEmitterFramework winterFlowEventEmitterFramework = this.WinterFlowTransactionManagerStrategy;
            if (winterFlowEventEmitterFramework == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.WinterFlowRouterRouter = WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowEventEmitterFramework, null, new WinterFlowModuleStack(winterFlowHookView, this, winterFlowTransactionManagerLayer, 17), 3);
        }
        return this.WinterFlowUnitTestResponse.WinterFlowRouterRouter();
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final Object WinterFlowServiceUtility(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        return winterFlowEventEvent.WinterFlowVariableVersionControl(obj, this);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowThreadListener(WinterFlowRendererProvider winterFlowRendererProvider) {
        return WinterFlowTestingCloud.WinterFlowEventEmitterController(this, winterFlowRendererProvider);
    }
}
