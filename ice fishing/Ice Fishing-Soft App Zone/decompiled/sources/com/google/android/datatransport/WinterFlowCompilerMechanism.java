package com.google.android.datatransport;

import android.os.Bundle;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowCompilerMechanism implements WinterFlowClassNetwork, WinterFlowAlgorithmSystem, WinterFlowInterfaceScript, WinterFlowObjectNode, WinterFlowModuleClass {
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public static /* synthetic */ void WinterFlowCacheManagerAgent(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void WinterFlowResponseEngine(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void WinterFlowRouterRouter(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void WinterFlowSyntax(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void WinterFlowTransactionAgent(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void WinterFlowTransactionManagerStrategy(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void WinterFlowVariableVersionControl(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // com.google.android.datatransport.WinterFlowModuleClass
    public Object WinterFlowArrayNetwork(WinterFlowExceptionParser winterFlowExceptionParser) {
        int i;
        Object obj;
        switch (this.WinterFlowVariableVersionControl) {
            case 19:
                i = 403;
                break;
            case 20:
                i = -1;
                break;
            default:
                synchronized (winterFlowExceptionParser.WinterFlowRouterStructure) {
                    if (!winterFlowExceptionParser.WinterFlowCacheManagerAgent) {
                        throw new IllegalStateException("Task is not yet complete");
                    }
                    if (winterFlowExceptionParser.WinterFlowArrayNetwork) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    boolean isInstance = IOException.class.isInstance(winterFlowExceptionParser.WinterFlowTransactionManagerStrategy);
                    Exception exc = winterFlowExceptionParser.WinterFlowTransactionManagerStrategy;
                    if (isInstance) {
                        throw ((Throwable) IOException.class.cast(exc));
                    }
                    if (exc != null) {
                        throw new WinterFlowDataSourceRouter(exc);
                    }
                    obj = winterFlowExceptionParser.WinterFlowVariableVersionControl;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i);
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
    public double WinterFlowHookDataSource(double d) {
        switch (this.WinterFlowVariableVersionControl) {
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                float[] fArr = WinterFlowIDEStructure.WinterFlowRouterStructure;
                return WinterFlowIDEStructure.WinterFlowHookDataSource(WinterFlowIDEStructure.WinterFlowCacheManagerAgent, d);
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                float[] fArr2 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                return WinterFlowIDEStructure.WinterFlowRouterStructure(WinterFlowIDEStructure.WinterFlowCacheManagerAgent, d);
            case 9:
                float[] fArr3 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                return WinterFlowIDEStructure.WinterFlowArrayNetwork(WinterFlowIDEStructure.WinterFlowArrayNetwork, d);
            default:
                float[] fArr4 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                return WinterFlowIDEStructure.WinterFlowCacheManagerAgent(WinterFlowIDEStructure.WinterFlowArrayNetwork, d);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceScript
    public Object WinterFlowUnitTestResponse(WinterFlowRequestEngine winterFlowRequestEngine) {
        WinterFlowDatabaseSchemaBandwidth lambda$getComponents$0;
        switch (this.WinterFlowVariableVersionControl) {
            case 11:
                Set WinterFlowCacheManagerAgent = winterFlowRequestEngine.WinterFlowCacheManagerAgent(WinterFlowValidatorProcess.WinterFlowRouterStructure(WinterFlowConfigurationDeserialization.class));
                WinterFlowConfigurationModule winterFlowConfigurationModule = WinterFlowConfigurationModule.WinterFlowUnitTestResponse;
                if (winterFlowConfigurationModule == null) {
                    synchronized (WinterFlowConfigurationModule.class) {
                        try {
                            winterFlowConfigurationModule = WinterFlowConfigurationModule.WinterFlowUnitTestResponse;
                            if (winterFlowConfigurationModule == null) {
                                winterFlowConfigurationModule = new WinterFlowConfigurationModule(0);
                                WinterFlowConfigurationModule.WinterFlowUnitTestResponse = winterFlowConfigurationModule;
                            }
                        } finally {
                        }
                    }
                }
                return new WinterFlowListenerSystem(WinterFlowCacheManagerAgent, winterFlowConfigurationModule);
            case 12:
            case 13:
            case 14:
            default:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(winterFlowRequestEngine);
                return lambda$getComponents$0;
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.WinterFlowRouterStructure.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.WinterFlowCacheManagerAgent.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.WinterFlowHookDataSource.get();
            case 18:
                WinterFlowRendererTransaction winterFlowRendererTransaction = ExecutorsRegistrar.WinterFlowRouterStructure;
                return WinterFlowProcessorModule.WinterFlowVariableVersionControl;
        }
    }

    public /* synthetic */ WinterFlowCompilerMechanism(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowClassNetwork
    public void cancel() {
    }

    @Override // com.google.android.datatransport.WinterFlowObjectNode
    public float WinterFlowRouterStructure(float f) {
        return f;
    }
}
