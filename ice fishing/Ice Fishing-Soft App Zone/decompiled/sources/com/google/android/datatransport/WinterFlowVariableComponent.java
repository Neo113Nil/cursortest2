package com.google.android.datatransport;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVariableComponent implements WinterFlowNodeProtocol {
    public final Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowVariableComponent(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeProtocol
    public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowExceptionProxy winterFlowExceptionProxy = (WinterFlowExceptionProxy) obj;
                if (winterFlowMicroserviceProcess != WinterFlowMicroserviceProcess.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                winterFlowDecoratorVersion.WinterFlowUnitTestResponse().WinterFlowTransactionManagerStrategy(this);
                Bundle WinterFlowServiceUtility = winterFlowExceptionProxy.WinterFlowHookDataSource().WinterFlowServiceUtility("androidx.savedstate.Restarter");
                if (WinterFlowServiceUtility == null) {
                    return;
                }
                ArrayList<String> stringArrayList = WinterFlowServiceUtility.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, WinterFlowVariableComponent.class.getClassLoader()).asSubclass(WinterFlowThreadSubsystem.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(winterFlowExceptionProxy instanceof WinterFlowProviderCacheManager)) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowServiceUtility(winterFlowExceptionProxy, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                WinterFlowScriptManager WinterFlowTransactionManagerStrategy = ((WinterFlowProviderCacheManager) winterFlowExceptionProxy).WinterFlowTransactionManagerStrategy();
                                WinterFlowAlgorithmArray WinterFlowHookDataSource = winterFlowExceptionProxy.WinterFlowHookDataSource();
                                LinkedHashMap linkedHashMap = WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure;
                                LinkedHashMap linkedHashMap2 = WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure;
                                Iterator it = WinterFlowSerializerUtility.WinterFlowDatabaseSchemaUtility(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    WinterFlowTransactionVariable winterFlowTransactionVariable = (WinterFlowTransactionVariable) linkedHashMap2.get(it.next());
                                    if (winterFlowTransactionVariable != null) {
                                        WinterFlowUnitTestLibrary.WinterFlowResponseEngine(winterFlowTransactionVariable, WinterFlowHookDataSource, winterFlowExceptionProxy.WinterFlowUnitTestResponse());
                                    }
                                }
                                if (!WinterFlowSerializerUtility.WinterFlowDatabaseSchemaUtility(linkedHashMap2.keySet()).isEmpty()) {
                                    WinterFlowHookDataSource.WinterFlowConfigurationSubsystem();
                                }
                            } catch (Exception e) {
                                WinterFlowEventEmitterOrchestration.WinterFlowServerProtocol("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(WinterFlowResolverBackend.WinterFlowResponseEngine("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i3 = ComponentActivity.WinterFlowBackendCacheManager;
                if (componentActivity.WinterFlowSyntax == null) {
                    WinterFlowQueueDatabaseSchema winterFlowQueueDatabaseSchema = (WinterFlowQueueDatabaseSchema) componentActivity.getLastNonConfigurationInstance();
                    if (winterFlowQueueDatabaseSchema != null) {
                        componentActivity.WinterFlowSyntax = winterFlowQueueDatabaseSchema.WinterFlowRouterStructure;
                    }
                    if (componentActivity.WinterFlowSyntax == null) {
                        componentActivity.WinterFlowSyntax = new WinterFlowScriptManager();
                    }
                }
                componentActivity.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy(this);
                return;
            case 2:
                new HashMap();
                WinterFlowWebsocketTool[] winterFlowWebsocketToolArr = (WinterFlowWebsocketTool[]) obj;
                if (winterFlowWebsocketToolArr.length > 0) {
                    WinterFlowWebsocketTool winterFlowWebsocketTool = winterFlowWebsocketToolArr[0];
                    throw null;
                }
                if (winterFlowWebsocketToolArr.length <= 0) {
                    return;
                }
                WinterFlowWebsocketTool winterFlowWebsocketTool2 = winterFlowWebsocketToolArr[0];
                throw null;
            default:
                if (winterFlowMicroserviceProcess != WinterFlowMicroserviceProcess.ON_CREATE) {
                    WinterFlowEventEmitterOrchestration.WinterFlowServiceUtility(winterFlowMicroserviceProcess, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    winterFlowDecoratorVersion.WinterFlowUnitTestResponse().WinterFlowTransactionManagerStrategy(this);
                    ((WinterFlowXMLUtility) obj).WinterFlowHookDataSource();
                    return;
                }
        }
    }
}
