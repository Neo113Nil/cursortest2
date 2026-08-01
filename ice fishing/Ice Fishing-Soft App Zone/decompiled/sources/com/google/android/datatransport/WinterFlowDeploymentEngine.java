package com.google.android.datatransport;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Method;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDeploymentEngine implements WinterFlowObjectUI {
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDeploymentEngine(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        Class<?> returnType;
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowQueueTool winterFlowQueueTool = WinterFlowOrchestrationFramework.WinterFlowVariableVersionControl;
                return Integer.valueOf(WinterFlowOrchestrationFramework.WinterFlowVariableVersionControl.WinterFlowArrayNetwork().nextInt(2147418112) + 65536);
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                return null;
            case 3:
                return WinterFlowSessionManagerFrontend.WinterFlowCacheManagerAgent(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            case 4:
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return null;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowSessionManagerEntity.WinterFlowHookDataSource("Unexpected call to default provider");
                throw new WinterFlowServerSystem();
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return Boolean.TRUE;
            case 9:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 10:
                try {
                    Method method = (Method) WinterFlowSchedulerSyntax.WinterFlowUnitTestResponse.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 11:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 12:
                WinterFlowPipelineHelper winterFlowPipelineHelper = WinterFlowAlgorithmUserManager.WinterFlowRouterStructure;
                return WinterFlowDatabaseResolver.WinterFlowRouterStructure;
            case 13:
                return null;
            case 14:
            case 15:
                return winterFlowAlgorithmSession;
            case 16:
                return new WinterFlowNetworkSession(0, 0);
            case 17:
                return null;
            case 18:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 19:
            case 20:
                return null;
            case 21:
                WinterFlowPipelineHelper winterFlowPipelineHelper2 = WinterFlowEncryptionRequest.WinterFlowRouterStructure;
                return WinterFlowCacheUtility.WinterFlowCacheManagerListener;
            case 22:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 23:
                return Boolean.FALSE;
            case 24:
                return WinterFlowPipelineHook.WinterFlowRouterStructure;
            case 25:
                return new JSONObject();
            case 26:
                return new WinterFlowBandwidthProtocol();
            case 27:
                return new WinterFlowJavaInterface();
            case 28:
                WinterFlowFunctionComponent winterFlowFunctionComponent = new WinterFlowFunctionComponent(0);
                winterFlowFunctionComponent.WinterFlowRouterStructure(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowEncryptionInheritance.class), new WinterFlowInterfaceSoftware(21));
                return winterFlowFunctionComponent.WinterFlowHookDataSource();
            default:
                return new WinterFlowSessionService();
        }
    }
}
