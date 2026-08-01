package com.google.android.datatransport;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterEngine extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowRouterEngine(int i, Object obj) {
        super(0);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0217  */
    @Override // com.google.android.datatransport.WinterFlowObjectUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure() {
        WinterFlowTransactionBackend winterFlowTransactionBackend;
        Context context = null;
        boolean z = false;
        switch (this.WinterFlowTransactionManagerStrategy) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowHandlerInvoker winterFlowHandlerInvoker = (WinterFlowHandlerInvoker) this.WinterFlowUnitTestResponse;
                Object WinterFlowSyntax = winterFlowHandlerInvoker.WinterFlowRouterStructure.WinterFlowSyntax();
                WinterFlowTransactionRequest winterFlowTransactionRequest = WinterFlowTransactionRequest.WinterFlowUnitTestResponse;
                if (WinterFlowSyntax == winterFlowTransactionRequest && winterFlowHandlerInvoker.WinterFlowArrayNetwork.getValue() == winterFlowTransactionRequest) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return (WinterFlowVersionParser) this.WinterFlowUnitTestResponse;
            case 2:
                WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption = (WinterFlowTransactionManagerEncryption) this.WinterFlowUnitTestResponse;
                boolean WinterFlowRouterStructure = WinterFlowJavaEntity.WinterFlowRouterStructure(0L, 0L);
                View view = winterFlowTransactionManagerEncryption.WinterFlowRouterStructure;
                if (!WinterFlowRouterStructure) {
                    return new WinterFlowTestingCache(0L, WinterFlowUnitTestLibrary.WinterFlowHookDataSource(view.getContext()).WinterFlowOrchestrationSubsystem(WinterFlowServerManager.WinterFlowUserManagerUserManager(0L)));
                }
                Context context2 = view.getContext();
                Context context3 = context2;
                while (context3 instanceof ContextWrapper) {
                    if ((context3 instanceof Activity) || (context3 instanceof InputMethodService) || (context3 instanceof Application)) {
                        context = context3;
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) context3;
                        if (contextWrapper.getBaseContext() != null) {
                            context3 = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        Configuration configuration = context2.getResources().getConfiguration();
                        WinterFlowServiceProviderUI WinterFlowHookDataSource = WinterFlowUnitTestLibrary.WinterFlowHookDataSource(context2);
                        long WinterFlowArrayNetwork = WinterFlowCacheRuntime.WinterFlowArrayNetwork(configuration.screenWidthDp, configuration.screenHeightDp);
                        long WinterFlowCacheTool = WinterFlowHookDataSource.WinterFlowCacheTool(WinterFlowArrayNetwork);
                        return new WinterFlowTestingCache((((int) Float.intBitsToFloat((int) (WinterFlowCacheTool >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (WinterFlowCacheTool & 4294967295L))) & 4294967295L), WinterFlowArrayNetwork);
                    }
                    WinterFlowFunctionSyntax.WinterFlowRouterStructure.getClass();
                    WinterFlowServiceProviderPlatform winterFlowServiceProviderPlatform = WinterFlowRepositoryCloud.WinterFlowHookDataSource;
                    winterFlowServiceProviderPlatform.getClass();
                    ContextWrapper contextWrapper2 = (ContextWrapper) context;
                    int i = Build.VERSION.SDK_INT;
                    WinterFlowThreadPoolStructure WinterFlowVariableVersionControl = (i >= 34 ? WinterFlowProviderUI.WinterFlowTransactionManagerStrategy : i >= 30 ? WinterFlowJavaProcessor.WinterFlowTransactionManagerStrategy : WinterFlowCacheUtility.WinterFlowFrontendBackend).WinterFlowVariableVersionControl(contextWrapper2, winterFlowServiceProviderPlatform.WinterFlowHookDataSource);
                    long height = (WinterFlowVariableVersionControl.WinterFlowRouterStructure().height() & 4294967295L) | (WinterFlowVariableVersionControl.WinterFlowRouterStructure().width() << 32);
                    return new WinterFlowTestingCache(height, WinterFlowUnitTestLibrary.WinterFlowHookDataSource(context).WinterFlowOrchestrationSubsystem(WinterFlowServerManager.WinterFlowUserManagerUserManager(height)));
                }
                if (context != null) {
                }
                break;
            case 3:
                Object obj = WinterFlowBackendCacheManager.WinterFlowArrayNetwork;
                File file = (File) this.WinterFlowUnitTestResponse;
                synchronized (obj) {
                    WinterFlowBackendCacheManager.WinterFlowCacheManagerAgent.remove(file.getAbsolutePath());
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 4:
                ((WinterFlowDeploymentWidget) this.WinterFlowUnitTestResponse).WinterFlowUserManagerConcurrency();
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                Object systemService = ((View) ((WinterFlowConfigurationModule) this.WinterFlowUnitTestResponse).WinterFlowTransactionManagerStrategy).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowUICompiler winterFlowUICompiler = ((WinterFlowSchedulerStructure) this.WinterFlowUnitTestResponse).WinterFlowSoftwareEngine;
                winterFlowUICompiler.WinterFlowOrchestrationSubsystem.WinterFlowCompilerVariable = true;
                WinterFlowClassOrchestration winterFlowClassOrchestration = winterFlowUICompiler.WinterFlowConcurrencyThread;
                if (winterFlowClassOrchestration != null) {
                    winterFlowClassOrchestration.WinterFlowMapperProtocol = true;
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowSchedulerProcessor winterFlowSchedulerProcessor = (WinterFlowSchedulerProcessor) this.WinterFlowUnitTestResponse;
                if (!((Boolean) winterFlowSchedulerProcessor.WinterFlowUnitTestResponse.getValue()).booleanValue() && (winterFlowTransactionBackend = winterFlowSchedulerProcessor.WinterFlowCacheManagerAgent) != null) {
                    winterFlowTransactionBackend.WinterFlowServerProtocol();
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                WinterFlowDeploymentBandwidth winterFlowDeploymentBandwidth = (WinterFlowDeploymentBandwidth) ((WinterFlowEventEmitterNetwork) this.WinterFlowUnitTestResponse).WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
                if (!winterFlowDeploymentBandwidth.WinterFlowTransactionManagerStrategy) {
                    if (winterFlowDeploymentBandwidth.WinterFlowUnitTestResponse) {
                        WinterFlowListenerScheduler.WinterFlowRouterStructure("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    winterFlowDeploymentBandwidth.WinterFlowRouterStructure();
                    winterFlowDeploymentBandwidth.WinterFlowUnitTestResponse = true;
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 9:
                return ((WinterFlowDebugEvent) this.WinterFlowUnitTestResponse).WinterFlowArrayNetwork;
            case 10:
                return ((WinterFlowMapperWebsocket) this.WinterFlowUnitTestResponse).WinterFlowValidatorNetwork();
            case 11:
                File file2 = (File) ((WinterFlowJavaSession) this.WinterFlowUnitTestResponse).WinterFlowRouterStructure();
                String name = file2.getName();
                name.getClass();
                int lastIndexOf = name.lastIndexOf(46, name.length() - 1);
                if (!(lastIndexOf != -1 ? name.substring(lastIndexOf + 1, name.length()) : "").equals("preferences_pb")) {
                    WinterFlowEventEmitterOrchestration.WinterFlowSyntax("File extension for file: ", file2, " does not match required extension for Preferences file: preferences_pb");
                    return null;
                }
                File absoluteFile = file2.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 12:
                WinterFlowInterfaceManager winterFlowInterfaceManager = (WinterFlowInterfaceManager) this.WinterFlowUnitTestResponse;
                winterFlowInterfaceManager.WinterFlowRouterRouter = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    winterFlowInterfaceManager.WinterFlowRouterStructure();
                    Trace.endSection();
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 13:
                WinterFlowSessionUI WinterFlowRouterStructure2 = ((WinterFlowLibraryAgent) this.WinterFlowUnitTestResponse).WinterFlowRouterStructure();
                WinterFlowSchedulerStructure winterFlowSchedulerStructure = WinterFlowRouterStructure2.WinterFlowVariableVersionControl;
                if (WinterFlowRouterStructure2.WinterFlowSingletonPlatform != ((WinterFlowDecoratorLayer) winterFlowSchedulerStructure.WinterFlowServiceUtility()).WinterFlowVariableVersionControl.WinterFlowUnitTestResponse) {
                    WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = WinterFlowRouterStructure2.WinterFlowResponseEngine;
                    Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
                    long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ((WinterFlowSchedulerProcessor) objArr[(i2 << 3) + i4]).WinterFlowArrayNetwork = true;
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    if (winterFlowSchedulerStructure.WinterFlowServerProtocol != null) {
                        if (!winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowVariableVersionControl) {
                            WinterFlowSchedulerStructure.WinterFlowCacheTool(winterFlowSchedulerStructure, false, 7);
                        }
                    } else if (!winterFlowSchedulerStructure.WinterFlowOrchestrationSubsystem()) {
                        WinterFlowSchedulerStructure.WinterFlowConfiguration(winterFlowSchedulerStructure, false, 7);
                    }
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 14:
                return new BaseInputConnection(((WinterFlowPipelinePipeline) this.WinterFlowUnitTestResponse).WinterFlowRouterStructure, false);
            default:
                WinterFlowFrontendQuery winterFlowFrontendQuery = (WinterFlowFrontendQuery) this.WinterFlowUnitTestResponse;
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                winterFlowFrontendQuery.WinterFlowRouterRouter.setValue(winterFlowAlgorithmSession);
                return winterFlowAlgorithmSession;
        }
    }
}
