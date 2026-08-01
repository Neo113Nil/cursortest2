package com.google.android.datatransport;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.google.android.gms.common.ConnectionResult;
import com.icewinter.flow.winter.icecatch.data.cpp.ID;
import com.icewinter.flow.winter.icecatch.data.cpp.StaticIdProvider;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowConfigurationModule implements WinterFlowGatewayHandler, WinterFlowSoftwareStrategy, OnGoogleAdIdReadListener, WinterFlowBandwidthClass, WinterFlowDebugModule, WinterFlowUserManager, WinterFlowWidgetCache {
    public static final Object WinterFlowRouterRouter = new Object();
    public static volatile WinterFlowConfigurationModule WinterFlowSyntax;
    public static volatile WinterFlowConfigurationModule WinterFlowUnitTestResponse;
    public Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowConfigurationModule(int i) {
        this.WinterFlowVariableVersionControl = i;
        switch (i) {
            case 1:
                this.WinterFlowTransactionManagerStrategy = new ConcurrentHashMap();
                break;
            case 2:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowSyntaxEntity(this);
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                this.WinterFlowTransactionManagerStrategy = new AtomicReference(null);
                break;
            case 21:
                WinterFlowDeploymentBandwidth winterFlowDeploymentBandwidth = new WinterFlowDeploymentBandwidth();
                this.WinterFlowTransactionManagerStrategy = winterFlowDeploymentBandwidth;
                if (!winterFlowDeploymentBandwidth.WinterFlowTransactionManagerStrategy) {
                    if (winterFlowDeploymentBandwidth.WinterFlowUnitTestResponse) {
                        WinterFlowListenerScheduler.WinterFlowRouterStructure("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    winterFlowDeploymentBandwidth.WinterFlowRouterStructure();
                    winterFlowDeploymentBandwidth.WinterFlowUnitTestResponse = true;
                    break;
                }
                break;
            case 23:
                this.WinterFlowTransactionManagerStrategy = WinterFlowProtocolPipeline.WinterFlowModuleAgent(new String[]{"googlepay://", "tez://", "intent://"});
                break;
            case 25:
                this.WinterFlowTransactionManagerStrategy = Build.VERSION.SDK_INT >= 28 ? new WinterFlowAlgorithmDebug(17) : new WinterFlowThreadPoolProcess(18);
                break;
            case 29:
                this.WinterFlowTransactionManagerStrategy = new LinkedHashMap();
                break;
            default:
                this.WinterFlowTransactionManagerStrategy = new HashSet();
                break;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.ArrayList WinterFlowBandwidthObject(com.google.android.datatransport.WinterFlowConfigurationModule r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.WinterFlowConfigurationModule.WinterFlowBandwidthObject(com.google.android.datatransport.WinterFlowConfigurationModule, java.lang.String):java.util.ArrayList");
    }

    public static WinterFlowConfigurationModule WinterFlowServerProtocol() {
        if (WinterFlowSyntax == null) {
            synchronized (WinterFlowRouterRouter) {
                try {
                    if (WinterFlowSyntax == null) {
                        WinterFlowSyntax = new WinterFlowConfigurationModule(1);
                    }
                } finally {
                }
            }
        }
        WinterFlowConfigurationModule winterFlowConfigurationModule = WinterFlowSyntax;
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(winterFlowConfigurationModule);
        return winterFlowConfigurationModule;
    }

    public static WinterFlowPipelineComponent WinterFlowSingletonPlatform(WinterFlowConfigurationModule winterFlowConfigurationModule, int i) {
        WinterFlowNetworkSession winterFlowNetworkSession = (WinterFlowNetworkSession) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy;
        WinterFlowJSONModule WinterFlowVariableVersionControl = WinterFlowWorkerVersionControl.WinterFlowVariableVersionControl();
        WinterFlowObjectSession WinterFlowVariableVersionControl2 = WinterFlowVariableVersionControl != null ? WinterFlowVariableVersionControl.WinterFlowVariableVersionControl() : null;
        WinterFlowJSONModule WinterFlowResponseEngine = WinterFlowWorkerVersionControl.WinterFlowResponseEngine(WinterFlowVariableVersionControl);
        try {
            WinterFlowFrameworkLoader winterFlowFrameworkLoader = (WinterFlowFrameworkLoader) winterFlowNetworkSession.WinterFlowTransactionManagerStrategy.getValue();
            WinterFlowWorkerVersionControl.WinterFlowBandwidthObject(WinterFlowVariableVersionControl, WinterFlowResponseEngine, WinterFlowVariableVersionControl2);
            WinterFlowStrategyService winterFlowStrategyService = winterFlowNetworkSession.WinterFlowOrchestrationSubsystem;
            long j = winterFlowFrameworkLoader.WinterFlowResponseEngine;
            boolean z = winterFlowNetworkSession.WinterFlowArrayNetwork;
            WinterFlowInterfaceSoftware winterFlowInterfaceSoftware = new WinterFlowInterfaceSoftware(i, winterFlowFrameworkLoader);
            WinterFlowViewSystem winterFlowViewSystem = winterFlowStrategyService.WinterFlowCacheManagerAgent;
            if (winterFlowViewSystem == null) {
                return WinterFlowSessionManagerProcess.WinterFlowThreadListener;
            }
            WinterFlowObjectPackage winterFlowObjectPackage = winterFlowStrategyService.WinterFlowHookDataSource;
            WinterFlowProviderConcurrency winterFlowProviderConcurrency = (WinterFlowProviderConcurrency) winterFlowViewSystem.WinterFlowArrayNetwork;
            boolean z2 = winterFlowProviderConcurrency instanceof WinterFlowSessionInheritance;
            WinterFlowServerJava winterFlowServerJava = new WinterFlowServerJava(winterFlowViewSystem, i, winterFlowObjectPackage, winterFlowInterfaceSoftware);
            winterFlowServerJava.WinterFlowRouterRouter = new WinterFlowHandlerConsumer(j);
            if (!z2) {
                winterFlowProviderConcurrency.WinterFlowRouterStructure(winterFlowServerJava);
            } else if (z) {
                WinterFlowSessionInheritance winterFlowSessionInheritance = (WinterFlowSessionInheritance) winterFlowProviderConcurrency;
                winterFlowSessionInheritance.WinterFlowTransactionManagerStrategy.add(new WinterFlowHandlerDeserialization(1, winterFlowServerJava));
                if (!winterFlowSessionInheritance.WinterFlowUnitTestResponse) {
                    winterFlowSessionInheritance.WinterFlowUnitTestResponse = true;
                    winterFlowSessionInheritance.WinterFlowVariableVersionControl.post(winterFlowSessionInheritance);
                }
            } else {
                WinterFlowSessionInheritance winterFlowSessionInheritance2 = (WinterFlowSessionInheritance) winterFlowProviderConcurrency;
                winterFlowSessionInheritance2.WinterFlowTransactionManagerStrategy.add(new WinterFlowHandlerDeserialization(0, winterFlowServerJava));
                if (!winterFlowSessionInheritance2.WinterFlowUnitTestResponse) {
                    winterFlowSessionInheritance2.WinterFlowUnitTestResponse = true;
                    winterFlowSessionInheritance2.WinterFlowVariableVersionControl.post(winterFlowSessionInheritance2);
                }
            }
            WinterFlowTestingCloud.WinterFlowCompilerHandler("compose:lazy:schedule_prefetch:index", i);
            return winterFlowServerJava;
        } catch (Throwable th) {
            WinterFlowWorkerVersionControl.WinterFlowBandwidthObject(WinterFlowVariableVersionControl, WinterFlowResponseEngine, WinterFlowVariableVersionControl2);
            throw th;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowBandwidthClass
    public boolean WinterFlowArrayNetwork(CharSequence charSequence, int i, int i2, WinterFlowBackend winterFlowBackend) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.WinterFlowTransactionManagerStrategy)) {
            return true;
        }
        winterFlowBackend.WinterFlowCacheManagerAgent = (winterFlowBackend.WinterFlowCacheManagerAgent & 3) | 4;
        return false;
    }

    public void WinterFlowBatchUI(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.WinterFlowTransactionManagerStrategy;
        if ((serviceConnection instanceof WinterFlowConfigurationDatabase) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowUserManager
    public Object WinterFlowCacheManagerAgent(WinterFlowEventEvent winterFlowEventEvent, WinterFlowNodeInheritance winterFlowNodeInheritance) {
        return ((WinterFlowUserManager) this.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent(new WinterFlowExceptionTesting(winterFlowEventEvent, null, 0), winterFlowNodeInheritance);
    }

    public void WinterFlowConcurrencyThread(float f, float f2, long j) {
        WinterFlowJavaLayer WinterFlowTransactionAgent = ((WinterFlowObjectPackage) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionAgent();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        WinterFlowTransactionAgent.WinterFlowRouterRouter(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        WinterFlowTransactionAgent.WinterFlowCacheManagerAgent(f, f2);
        WinterFlowTransactionAgent.WinterFlowRouterRouter(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // com.google.android.datatransport.WinterFlowGatewayHandler
    public void WinterFlowHookDataSource(ConnectionResult connectionResult) {
        boolean z = connectionResult.WinterFlowTransactionManagerStrategy == 0;
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = (com.google.android.gms.common.internal.WinterFlowSyntaxEvent) this.WinterFlowTransactionManagerStrategy;
        if (z) {
            winterFlowSyntaxEvent.WinterFlowUnitTestResponse(null, winterFlowSyntaxEvent.WinterFlowResolverController);
            return;
        }
        WinterFlowConcurrencyProcess winterFlowConcurrencyProcess = winterFlowSyntaxEvent.WinterFlowBandwidthObject;
        if (winterFlowConcurrencyProcess != null) {
            ((WinterFlowJSONHelper) winterFlowConcurrencyProcess.WinterFlowVariableVersionControl).WinterFlowArrayNetwork(connectionResult);
        }
    }

    public boolean WinterFlowOrchestrationSubsystem(int i, int i2, Bundle bundle) {
        return false;
    }

    public WinterFlowFrameworkDataSource WinterFlowResponseEngine(int i) {
        return null;
    }

    public boolean WinterFlowRouterAdapter(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.WinterFlowTransactionManagerStrategy;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((WinterFlowFrontendIDE.WinterFlowRouterStructure(context).WinterFlowRouterStructure.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof WinterFlowConfigurationDatabase) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }

    public void WinterFlowRouterRouter() {
        ((WinterFlowExceptionScheduler) this.WinterFlowTransactionManagerStrategy).getClass();
    }

    public long WinterFlowServiceUtility() {
        WinterFlowUISoftware winterFlowUISoftware = (WinterFlowUISoftware) this.WinterFlowTransactionManagerStrategy;
        long j = ((WinterFlowSyntaxNode) winterFlowUISoftware.WinterFlowResolverController.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource;
        if (j != 16) {
            return j;
        }
        WinterFlowResponseManager winterFlowResponseManager = (WinterFlowResponseManager) WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread(winterFlowUISoftware, WinterFlowSingletonProxy.WinterFlowRouterStructure);
        if (winterFlowResponseManager != null) {
            long j2 = winterFlowResponseManager.WinterFlowRouterStructure;
            if (j2 != 16) {
                return j2;
            }
        }
        return ((WinterFlowInheritanceSubsystem) WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread(winterFlowUISoftware, WinterFlowSoftwareLayer.WinterFlowRouterStructure)).WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetCache
    public void WinterFlowSyntax(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.WinterFlowTransactionManagerStrategy).setResultCode(i);
    }

    public void WinterFlowThreadListener(float f, float f2, float f3, float f4) {
        WinterFlowObjectPackage winterFlowObjectPackage = (WinterFlowObjectPackage) this.WinterFlowTransactionManagerStrategy;
        WinterFlowJavaLayer WinterFlowTransactionAgent = winterFlowObjectPackage.WinterFlowTransactionAgent();
        float intBitsToFloat = Float.intBitsToFloat((int) (winterFlowObjectPackage.WinterFlowThreadListener() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (winterFlowObjectPackage.WinterFlowThreadListener() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            WinterFlowThreadSessionManager.WinterFlowRouterStructure("Width and height must be greater than or equal to zero");
        }
        winterFlowObjectPackage.WinterFlowArrayHelper(floatToRawIntBits);
        WinterFlowTransactionAgent.WinterFlowRouterRouter(f, f2);
    }

    public WinterFlowBatchCacheManager WinterFlowTransactionAgent() {
        WinterFlowIDEEngine WinterFlowRouterStructure = WinterFlowIDEEngine.WinterFlowRouterStructure();
        if (WinterFlowRouterStructure.WinterFlowHookDataSource() == 1) {
            return new WinterFlowEncryptionArray(true);
        }
        WinterFlowResolverSubsystem WinterFlowSerializerStructure = WinterFlowDecoratorUI.WinterFlowSerializerStructure(Boolean.FALSE);
        WinterFlowFunctionGateway winterFlowFunctionGateway = new WinterFlowFunctionGateway(WinterFlowSerializerStructure, this);
        WinterFlowRouterStructure.WinterFlowRouterStructure.writeLock().lock();
        try {
            if (WinterFlowRouterStructure.WinterFlowCacheManagerAgent != 1 && WinterFlowRouterStructure.WinterFlowCacheManagerAgent != 2) {
                WinterFlowRouterStructure.WinterFlowHookDataSource.add(winterFlowFunctionGateway);
                WinterFlowRouterStructure.WinterFlowRouterStructure.writeLock().unlock();
                return WinterFlowSerializerStructure;
            }
            WinterFlowRouterStructure.WinterFlowArrayNetwork.post(new WinterFlowSessionThreadPool(Arrays.asList(winterFlowFunctionGateway), WinterFlowRouterStructure.WinterFlowCacheManagerAgent, (Throwable) null));
            WinterFlowRouterStructure.WinterFlowRouterStructure.writeLock().unlock();
            return WinterFlowSerializerStructure;
        } catch (Throwable th) {
            WinterFlowRouterStructure.WinterFlowRouterStructure.writeLock().unlock();
            throw th;
        }
    }

    public WinterFlowFrameworkDataSource WinterFlowUnitTestResponse(int i) {
        return null;
    }

    public void WinterFlowVariableBandwidth(float f, float f2) {
        ((WinterFlowObjectPackage) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionAgent().WinterFlowRouterRouter(f, f2);
    }

    @Override // com.google.android.datatransport.WinterFlowUserManager
    public WinterFlowEventProvider WinterFlowVariableVersionControl() {
        return ((WinterFlowUserManager) this.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl();
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareStrategy
    public Object get() {
        switch (this.WinterFlowVariableVersionControl) {
            case 9:
                return new WinterFlowObjectPackage((Context) ((WinterFlowJSONDecorator) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy, (Object) new WinterFlowModuleFunction(1), (Object) new WinterFlowThreadPoolProcess(29), 7);
            default:
                String packageName = ((Context) ((WinterFlowSoftwareStrategy) this.WinterFlowTransactionManagerStrategy).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }

    @Override // com.adjust.sdk.OnGoogleAdIdReadListener
    public void onGoogleAdIdRead(String str) {
        WinterFlowEventCloud winterFlowEventCloud = (WinterFlowEventCloud) this.WinterFlowTransactionManagerStrategy;
        if (!(winterFlowEventCloud.WinterFlowRouterAdapter() instanceof WinterFlowWorkerNetwork)) {
            winterFlowEventCloud = null;
        }
        if (winterFlowEventCloud != null) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(str, StaticIdProvider.INSTANCE.provide(ID.APP_GOOGLE_BLANK_ID))) {
                str = null;
            }
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                String uuid = UUID.randomUUID().toString();
                sb.append(uuid);
                sb.append(uuid);
                str = sb.toString();
            }
            winterFlowEventCloud.WinterFlowSyntax(str);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowBandwidthClass
    public Object WinterFlowRouterStructure() {
        return this;
    }

    public /* synthetic */ WinterFlowConfigurationModule(int i, boolean z) {
        this.WinterFlowVariableVersionControl = i;
    }

    public WinterFlowConfigurationModule(com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent) {
        this.WinterFlowVariableVersionControl = 6;
        Objects.requireNonNull(winterFlowSyntaxEvent);
        this.WinterFlowTransactionManagerStrategy = winterFlowSyntaxEvent;
    }

    public /* synthetic */ WinterFlowConfigurationModule(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    public WinterFlowConfigurationModule(boolean z) {
        this.WinterFlowVariableVersionControl = 4;
        this.WinterFlowTransactionManagerStrategy = new AtomicBoolean(z);
    }

    public WinterFlowConfigurationModule(View view) {
        this.WinterFlowVariableVersionControl = 18;
        this.WinterFlowTransactionManagerStrategy = view;
        WinterFlowHandlerWebsocket.WinterFlowCompilerVariable(WinterFlowArrayInterface.WinterFlowTransactionManagerStrategy, new WinterFlowRouterEngine(5, this));
    }

    public WinterFlowConfigurationModule(WinterFlowDecoratorMechanism winterFlowDecoratorMechanism) {
        this.WinterFlowVariableVersionControl = 22;
        this.WinterFlowTransactionManagerStrategy = new CopyOnWriteArrayList();
        new HashMap();
    }

    public void WinterFlowTransactionManagerStrategy(int i, WinterFlowFrameworkDataSource winterFlowFrameworkDataSource, String str, Bundle bundle) {
    }
}
