package com.google.android.datatransport;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionManagerStack implements Handler.Callback {
    public static WinterFlowTransactionManagerStack WinterFlowSingletonPlatform;
    public WinterFlowConsumerStrategy WinterFlowArrayNetwork;
    public WinterFlowTransactionManagerParser WinterFlowCacheManagerAgent;
    public boolean WinterFlowHookDataSource;
    public final ConcurrentHashMap WinterFlowResponseEngine;
    public final AtomicInteger WinterFlowRouterRouter;
    public long WinterFlowRouterStructure;
    public final WinterFlowRepositoryDatabase WinterFlowServerProtocol;
    public volatile boolean WinterFlowServiceUtility;
    public final AtomicInteger WinterFlowSyntax;
    public final WinterFlowWidgetInterface WinterFlowThreadListener;
    public final WinterFlowRepositoryDatabase WinterFlowTransactionAgent;
    public final WinterFlowWidgetDebug WinterFlowTransactionManagerStrategy;
    public final WinterFlowNodeSerializer WinterFlowUnitTestResponse;
    public final Context WinterFlowVariableVersionControl;
    public static final Status WinterFlowBandwidthObject = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status WinterFlowOrchestrationSubsystem = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object WinterFlowConcurrencyThread = new Object();

    public WinterFlowTransactionManagerStack(Context context, Looper looper) {
        WinterFlowWidgetDebug winterFlowWidgetDebug = WinterFlowWidgetDebug.WinterFlowArrayNetwork;
        this.WinterFlowRouterStructure = 10000L;
        this.WinterFlowHookDataSource = false;
        this.WinterFlowRouterRouter = new AtomicInteger(1);
        this.WinterFlowSyntax = new AtomicInteger(0);
        this.WinterFlowResponseEngine = new ConcurrentHashMap(5, 0.75f, 1);
        this.WinterFlowTransactionAgent = new WinterFlowRepositoryDatabase(0);
        this.WinterFlowServerProtocol = new WinterFlowRepositoryDatabase(0);
        this.WinterFlowServiceUtility = true;
        this.WinterFlowVariableVersionControl = context;
        WinterFlowWidgetInterface winterFlowWidgetInterface = new WinterFlowWidgetInterface(looper, this);
        Looper.getMainLooper();
        this.WinterFlowThreadListener = winterFlowWidgetInterface;
        this.WinterFlowTransactionManagerStrategy = winterFlowWidgetDebug;
        this.WinterFlowUnitTestResponse = new WinterFlowNodeSerializer(10);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = WinterFlowInvokerComponent.WinterFlowMapperProtocol;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            WinterFlowInvokerComponent.WinterFlowMapperProtocol = bool;
        }
        if (bool.booleanValue()) {
            this.WinterFlowServiceUtility = false;
        }
        winterFlowWidgetInterface.sendMessage(winterFlowWidgetInterface.obtainMessage(6));
    }

    public static WinterFlowTransactionManagerStack WinterFlowCacheManagerAgent(Context context) {
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack;
        HandlerThread handlerThread;
        synchronized (WinterFlowConcurrencyThread) {
            winterFlowTransactionManagerStack = WinterFlowSingletonPlatform;
            if (winterFlowTransactionManagerStack == null) {
                synchronized (WinterFlowTransactionWorker.WinterFlowUnitTestResponse) {
                    try {
                        handlerThread = WinterFlowTransactionWorker.WinterFlowSyntax;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            WinterFlowTransactionWorker.WinterFlowSyntax = handlerThread2;
                            handlerThread2.start();
                            handlerThread = WinterFlowTransactionWorker.WinterFlowSyntax;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = WinterFlowWidgetDebug.WinterFlowCacheManagerAgent;
                WinterFlowTransactionManagerStack winterFlowTransactionManagerStack2 = new WinterFlowTransactionManagerStack(applicationContext, looper);
                WinterFlowSingletonPlatform = winterFlowTransactionManagerStack2;
                winterFlowTransactionManagerStack = winterFlowTransactionManagerStack2;
            }
        }
        return winterFlowTransactionManagerStack;
    }

    public static Status WinterFlowHookDataSource(WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth, ConnectionResult connectionResult) {
        String str = (String) winterFlowRepositoryBandwidth.WinterFlowHookDataSource.WinterFlowUnitTestResponse;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(str.length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), connectionResult.WinterFlowUnitTestResponse, connectionResult);
    }

    public final boolean WinterFlowArrayNetwork() {
        int i;
        if (this.WinterFlowHookDataSource) {
            return false;
        }
        WinterFlowQueryScript winterFlowQueryScript = (WinterFlowQueryScript) WinterFlowJSONDecorator.WinterFlowRouterRouter().WinterFlowTransactionManagerStrategy;
        if (winterFlowQueryScript != null && !winterFlowQueryScript.WinterFlowTransactionManagerStrategy) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final WinterFlowCacheTransactionManager WinterFlowRouterStructure(WinterFlowConsumerStrategy winterFlowConsumerStrategy) {
        WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth = winterFlowConsumerStrategy.WinterFlowTransactionManagerStrategy;
        ConcurrentHashMap concurrentHashMap = this.WinterFlowResponseEngine;
        WinterFlowCacheTransactionManager winterFlowCacheTransactionManager = (WinterFlowCacheTransactionManager) concurrentHashMap.get(winterFlowRepositoryBandwidth);
        if (winterFlowCacheTransactionManager == null) {
            winterFlowCacheTransactionManager = new WinterFlowCacheTransactionManager(this, winterFlowConsumerStrategy);
            concurrentHashMap.put(winterFlowRepositoryBandwidth, winterFlowCacheTransactionManager);
        }
        if (winterFlowCacheTransactionManager.WinterFlowArrayNetwork.WinterFlowServiceUtility()) {
            this.WinterFlowServerProtocol.add(winterFlowRepositoryBandwidth);
        }
        winterFlowCacheTransactionManager.WinterFlowConcurrencyThread();
        return winterFlowCacheTransactionManager;
    }

    public final void WinterFlowTransactionManagerStrategy(ConnectionResult connectionResult, int i) {
        if (WinterFlowVariableVersionControl(connectionResult, i)) {
            return;
        }
        WinterFlowWidgetInterface winterFlowWidgetInterface = this.WinterFlowThreadListener;
        winterFlowWidgetInterface.sendMessage(winterFlowWidgetInterface.obtainMessage(5, i, 0, connectionResult));
    }

    public final boolean WinterFlowVariableVersionControl(ConnectionResult connectionResult, int i) {
        boolean z;
        PendingIntent activity;
        Boolean bool;
        WinterFlowWidgetDebug winterFlowWidgetDebug = this.WinterFlowTransactionManagerStrategy;
        Context context = this.WinterFlowVariableVersionControl;
        winterFlowWidgetDebug.getClass();
        synchronized (WinterFlowCacheRuntime.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = WinterFlowCacheRuntime.WinterFlowRouterStructure;
            if (context2 != null && (bool = WinterFlowCacheRuntime.WinterFlowHookDataSource) != null && context2 == applicationContext) {
                z = bool.booleanValue();
            }
            WinterFlowCacheRuntime.WinterFlowHookDataSource = null;
            boolean isInstantApp = applicationContext.getPackageManager().isInstantApp();
            WinterFlowCacheRuntime.WinterFlowHookDataSource = Boolean.valueOf(isInstantApp);
            WinterFlowCacheRuntime.WinterFlowRouterStructure = applicationContext;
            z = isInstantApp;
        }
        if (!z) {
            int i2 = connectionResult.WinterFlowTransactionManagerStrategy;
            if (i2 == 0 || (activity = connectionResult.WinterFlowUnitTestResponse) == null) {
                Intent WinterFlowRouterStructure = winterFlowWidgetDebug.WinterFlowRouterStructure(i2, context, null);
                activity = WinterFlowRouterStructure != null ? PendingIntent.getActivity(context, 0, WinterFlowRouterStructure, 201326592) : null;
            }
            if (activity != null) {
                int i3 = connectionResult.WinterFlowTransactionManagerStrategy;
                int i4 = GoogleApiActivity.WinterFlowTransactionManagerStrategy;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                winterFlowWidgetDebug.WinterFlowTransactionManagerStrategy(context, i3, PendingIntent.getActivity(context, 0, intent, WinterFlowSerializerUnitTest.WinterFlowRouterStructure | 134217728));
                Integer num = connectionResult.WinterFlowSyntax;
                WinterFlowQueryLoader winterFlowQueryLoader = new WinterFlowQueryLoader(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), connectionResult.WinterFlowTransactionManagerStrategy, false);
                WinterFlowConsumerStrategy winterFlowConsumerStrategy = winterFlowWidgetDebug.WinterFlowHookDataSource;
                if (winterFlowConsumerStrategy == null) {
                    winterFlowConsumerStrategy = new WinterFlowConsumerStrategy(context, WinterFlowConsumerStrategy.WinterFlowResponseEngine, WinterFlowEventEmitterLayer.WinterFlowRouterStructure, WinterFlowMiddlewareSubsystem.WinterFlowHookDataSource);
                    winterFlowWidgetDebug.WinterFlowHookDataSource = winterFlowConsumerStrategy;
                }
                WinterFlowStrategyVersionControl winterFlowStrategyVersionControl = new WinterFlowStrategyVersionControl();
                winterFlowStrategyVersionControl.WinterFlowHookDataSource = 0;
                winterFlowStrategyVersionControl.WinterFlowArrayNetwork = new WinterFlowDebugDatabaseSchema[]{WinterFlowCloudStack.WinterFlowSyntax};
                winterFlowStrategyVersionControl.WinterFlowRouterStructure = false;
                winterFlowStrategyVersionControl.WinterFlowCacheManagerAgent = new WinterFlowConcurrencyProcess(winterFlowQueryLoader);
                winterFlowConsumerStrategy.WinterFlowHookDataSource(2, winterFlowStrategyVersionControl.WinterFlowRouterStructure());
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04c5 A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        WinterFlowCacheTransactionManager winterFlowCacheTransactionManager;
        boolean z;
        boolean isIsolated;
        WinterFlowDebugDatabaseSchema[] WinterFlowRouterStructure;
        boolean z2;
        WinterFlowWidgetInterface winterFlowWidgetInterface = this.WinterFlowThreadListener;
        ConcurrentHashMap concurrentHashMap = this.WinterFlowResponseEngine;
        int i = message.what;
        switch (i) {
            case 1:
                this.WinterFlowRouterStructure = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                winterFlowWidgetInterface.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    winterFlowWidgetInterface.sendMessageDelayed(winterFlowWidgetInterface.obtainMessage(12, (WinterFlowRepositoryBandwidth) it.next()), this.WinterFlowRouterStructure);
                }
                return true;
            case 2:
                message.obj.getClass();
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                return false;
            case 3:
                for (WinterFlowCacheTransactionManager winterFlowCacheTransactionManager2 : concurrentHashMap.values()) {
                    WinterFlowUnitTestLibrary.WinterFlowServiceUtility(winterFlowCacheTransactionManager2.WinterFlowBandwidthObject.WinterFlowThreadListener);
                    winterFlowCacheTransactionManager2.WinterFlowThreadListener = null;
                    winterFlowCacheTransactionManager2.WinterFlowConcurrencyThread();
                }
                return true;
            case 4:
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                WinterFlowCompilerDataSource winterFlowCompilerDataSource = (WinterFlowCompilerDataSource) message.obj;
                WinterFlowConsumerStrategy winterFlowConsumerStrategy = winterFlowCompilerDataSource.WinterFlowCacheManagerAgent;
                WinterFlowProviderHandler winterFlowProviderHandler = winterFlowCompilerDataSource.WinterFlowRouterStructure;
                WinterFlowCacheTransactionManager winterFlowCacheTransactionManager3 = (WinterFlowCacheTransactionManager) concurrentHashMap.get(winterFlowConsumerStrategy.WinterFlowTransactionManagerStrategy);
                if (winterFlowCacheTransactionManager3 == null) {
                    winterFlowCacheTransactionManager3 = WinterFlowRouterStructure(winterFlowConsumerStrategy);
                }
                if (!winterFlowCacheTransactionManager3.WinterFlowArrayNetwork.WinterFlowServiceUtility() || this.WinterFlowSyntax.get() == winterFlowCompilerDataSource.WinterFlowHookDataSource) {
                    winterFlowCacheTransactionManager3.WinterFlowBandwidthObject(winterFlowProviderHandler);
                    return true;
                }
                winterFlowProviderHandler.WinterFlowArrayNetwork(WinterFlowBandwidthObject);
                winterFlowCacheTransactionManager3.WinterFlowOrchestrationSubsystem();
                return true;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        winterFlowCacheTransactionManager = (WinterFlowCacheTransactionManager) it2.next();
                        if (winterFlowCacheTransactionManager.WinterFlowSyntax == i2) {
                        }
                    } else {
                        winterFlowCacheTransactionManager = null;
                    }
                }
                if (winterFlowCacheTransactionManager == null) {
                    new StringBuilder(String.valueOf(i2).length() + 65);
                    new Exception();
                    return true;
                }
                int i3 = connectionResult.WinterFlowTransactionManagerStrategy;
                if (i3 != 13) {
                    winterFlowCacheTransactionManager.WinterFlowResponseEngine(WinterFlowHookDataSource(winterFlowCacheTransactionManager.WinterFlowVariableVersionControl, connectionResult));
                    return true;
                }
                this.WinterFlowTransactionManagerStrategy.getClass();
                int i4 = WinterFlowEncryptionHandler.WinterFlowCacheManagerAgent;
                String WinterFlowRouterStructure2 = ConnectionResult.WinterFlowRouterStructure(i3);
                String str = connectionResult.WinterFlowRouterRouter;
                StringBuilder sb = new StringBuilder(WinterFlowRouterStructure2.length() + 69 + String.valueOf(str).length());
                sb.append("Error resolution was canceled by the user, original error message: ");
                sb.append(WinterFlowRouterStructure2);
                sb.append(": ");
                sb.append(str);
                winterFlowCacheTransactionManager.WinterFlowResponseEngine(new Status(17, sb.toString(), null, null));
                return true;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context = this.WinterFlowVariableVersionControl;
                if (context.getApplicationContext() instanceof Application) {
                    WinterFlowConfigurationIDE.WinterFlowRouterStructure((Application) context.getApplicationContext());
                    WinterFlowConfigurationIDE winterFlowConfigurationIDE = WinterFlowConfigurationIDE.WinterFlowSyntax;
                    WinterFlowSingletonManager winterFlowSingletonManager = new WinterFlowSingletonManager(this);
                    winterFlowConfigurationIDE.getClass();
                    synchronized (winterFlowConfigurationIDE) {
                        winterFlowConfigurationIDE.WinterFlowUnitTestResponse.add(winterFlowSingletonManager);
                    }
                    AtomicBoolean atomicBoolean = winterFlowConfigurationIDE.WinterFlowVariableVersionControl;
                    AtomicBoolean atomicBoolean2 = winterFlowConfigurationIDE.WinterFlowTransactionManagerStrategy;
                    if (!atomicBoolean2.get()) {
                        Boolean bool = WinterFlowWorkerVersionControl.WinterFlowCacheManagerAgent;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                isIsolated = Process.isIsolated();
                                bool = Boolean.valueOf(isIsolated);
                            } else {
                                try {
                                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                                    Object[] objArr = new Object[0];
                                    if (invoke == null) {
                                        throw new WinterFlowServerSystem(WinterFlowHookProcessor.WinterFlowSerializerStructure("expected a non-null reference", objArr));
                                    }
                                    bool = (Boolean) invoke;
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            WinterFlowWorkerVersionControl.WinterFlowCacheManagerAgent = bool;
                        }
                        if (bool.booleanValue()) {
                            z = true;
                            if (!z) {
                                this.WinterFlowRouterStructure = 300000L;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean.set(true);
                            }
                        }
                    }
                    z = atomicBoolean.get();
                    if (!z) {
                    }
                }
                return true;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowRouterStructure((WinterFlowConsumerStrategy) message.obj);
                return true;
            case 9:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                WinterFlowCacheTransactionManager winterFlowCacheTransactionManager4 = (WinterFlowCacheTransactionManager) concurrentHashMap.get(message.obj);
                WinterFlowUnitTestLibrary.WinterFlowServiceUtility(winterFlowCacheTransactionManager4.WinterFlowBandwidthObject.WinterFlowThreadListener);
                if (!winterFlowCacheTransactionManager4.WinterFlowTransactionAgent) {
                    return true;
                }
                winterFlowCacheTransactionManager4.WinterFlowConcurrencyThread();
                return true;
            case 10:
                WinterFlowRepositoryDatabase winterFlowRepositoryDatabase = this.WinterFlowServerProtocol;
                winterFlowRepositoryDatabase.getClass();
                WinterFlowRendererComponent winterFlowRendererComponent = new WinterFlowRendererComponent(winterFlowRepositoryDatabase);
                while (winterFlowRendererComponent.hasNext()) {
                    WinterFlowCacheTransactionManager winterFlowCacheTransactionManager5 = (WinterFlowCacheTransactionManager) concurrentHashMap.remove((WinterFlowRepositoryBandwidth) winterFlowRendererComponent.next());
                    if (winterFlowCacheTransactionManager5 != null) {
                        winterFlowCacheTransactionManager5.WinterFlowOrchestrationSubsystem();
                    }
                }
                winterFlowRepositoryDatabase.clear();
                return true;
            case 11:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                WinterFlowCacheTransactionManager winterFlowCacheTransactionManager6 = (WinterFlowCacheTransactionManager) concurrentHashMap.get(message.obj);
                WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = winterFlowCacheTransactionManager6.WinterFlowBandwidthObject;
                WinterFlowUnitTestLibrary.WinterFlowServiceUtility(winterFlowTransactionManagerStack.WinterFlowThreadListener);
                boolean z3 = winterFlowCacheTransactionManager6.WinterFlowTransactionAgent;
                if (!z3) {
                    return true;
                }
                if (z3) {
                    WinterFlowTransactionManagerStack winterFlowTransactionManagerStack2 = winterFlowCacheTransactionManager6.WinterFlowBandwidthObject;
                    WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth = winterFlowCacheTransactionManager6.WinterFlowVariableVersionControl;
                    winterFlowTransactionManagerStack2.WinterFlowThreadListener.removeMessages(11, winterFlowRepositoryBandwidth);
                    winterFlowTransactionManagerStack2.WinterFlowThreadListener.removeMessages(9, winterFlowRepositoryBandwidth);
                    winterFlowCacheTransactionManager6.WinterFlowTransactionAgent = false;
                }
                winterFlowCacheTransactionManager6.WinterFlowResponseEngine(winterFlowTransactionManagerStack.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource(winterFlowTransactionManagerStack.WinterFlowVariableVersionControl, WinterFlowClassComponent.WinterFlowRouterStructure) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                winterFlowCacheTransactionManager6.WinterFlowArrayNetwork.WinterFlowCacheManagerAgent("Timing out connection while resuming.");
                return true;
            case 12:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                WinterFlowCacheTransactionManager winterFlowCacheTransactionManager7 = (WinterFlowCacheTransactionManager) concurrentHashMap.get(message.obj);
                WinterFlowUnitTestLibrary.WinterFlowServiceUtility(winterFlowCacheTransactionManager7.WinterFlowBandwidthObject.WinterFlowThreadListener);
                com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = winterFlowCacheTransactionManager7.WinterFlowArrayNetwork;
                if (winterFlowSyntaxEvent.WinterFlowServerProtocol() && winterFlowCacheTransactionManager7.WinterFlowRouterRouter.isEmpty()) {
                    WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = winterFlowCacheTransactionManager7.WinterFlowTransactionManagerStrategy;
                    if (((Map) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy).isEmpty() && ((Map) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse).isEmpty()) {
                        winterFlowSyntaxEvent.WinterFlowCacheManagerAgent("Timing out service connection.");
                        return true;
                    }
                    winterFlowCacheTransactionManager7.WinterFlowTransactionAgent();
                }
                return true;
            case 14:
                message.obj.getClass();
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                return false;
            case 15:
                WinterFlowCloudHelper winterFlowCloudHelper = (WinterFlowCloudHelper) message.obj;
                if (!concurrentHashMap.containsKey(winterFlowCloudHelper.WinterFlowRouterStructure)) {
                    return true;
                }
                WinterFlowCacheTransactionManager winterFlowCacheTransactionManager8 = (WinterFlowCacheTransactionManager) concurrentHashMap.get(winterFlowCloudHelper.WinterFlowRouterStructure);
                if (!winterFlowCacheTransactionManager8.WinterFlowServerProtocol.contains(winterFlowCloudHelper) || winterFlowCacheTransactionManager8.WinterFlowTransactionAgent) {
                    return true;
                }
                if (winterFlowCacheTransactionManager8.WinterFlowArrayNetwork.WinterFlowServerProtocol()) {
                    winterFlowCacheTransactionManager8.WinterFlowUnitTestResponse();
                    return true;
                }
                winterFlowCacheTransactionManager8.WinterFlowConcurrencyThread();
                return true;
            case 16:
                WinterFlowCloudHelper winterFlowCloudHelper2 = (WinterFlowCloudHelper) message.obj;
                if (!concurrentHashMap.containsKey(winterFlowCloudHelper2.WinterFlowRouterStructure)) {
                    return true;
                }
                WinterFlowCacheTransactionManager winterFlowCacheTransactionManager9 = (WinterFlowCacheTransactionManager) concurrentHashMap.get(winterFlowCloudHelper2.WinterFlowRouterStructure);
                if (!winterFlowCacheTransactionManager9.WinterFlowServerProtocol.remove(winterFlowCloudHelper2)) {
                    return true;
                }
                WinterFlowTransactionManagerStack winterFlowTransactionManagerStack3 = winterFlowCacheTransactionManager9.WinterFlowBandwidthObject;
                winterFlowTransactionManagerStack3.WinterFlowThreadListener.removeMessages(15, winterFlowCloudHelper2);
                winterFlowTransactionManagerStack3.WinterFlowThreadListener.removeMessages(16, winterFlowCloudHelper2);
                WinterFlowDebugDatabaseSchema winterFlowDebugDatabaseSchema = winterFlowCloudHelper2.WinterFlowHookDataSource;
                LinkedList<WinterFlowDatabaseResponse> linkedList = winterFlowCacheTransactionManager9.WinterFlowCacheManagerAgent;
                ArrayList arrayList = new ArrayList(linkedList.size());
                for (WinterFlowDatabaseResponse winterFlowDatabaseResponse : linkedList) {
                    if (winterFlowDatabaseResponse != null && (WinterFlowRouterStructure = winterFlowDatabaseResponse.WinterFlowRouterStructure(winterFlowCacheTransactionManager9)) != null) {
                        int length = WinterFlowRouterStructure.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            if (!WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(WinterFlowRouterStructure[i5], winterFlowDebugDatabaseSchema)) {
                                i5++;
                            } else if (i5 >= 0) {
                                arrayList.add(winterFlowDatabaseResponse);
                            }
                        }
                    }
                }
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    WinterFlowDatabaseResponse winterFlowDatabaseResponse2 = (WinterFlowDatabaseResponse) arrayList.get(i6);
                    linkedList.remove(winterFlowDatabaseResponse2);
                    winterFlowDatabaseResponse2.WinterFlowVariableVersionControl(new WinterFlowDatabaseFrontend(winterFlowDebugDatabaseSchema));
                }
                return true;
            case 17:
                WinterFlowTransactionManagerParser winterFlowTransactionManagerParser = this.WinterFlowCacheManagerAgent;
                if (winterFlowTransactionManagerParser == null) {
                    return true;
                }
                if (winterFlowTransactionManagerParser.WinterFlowVariableVersionControl > 0 || WinterFlowArrayNetwork()) {
                    WinterFlowConsumerStrategy winterFlowConsumerStrategy2 = this.WinterFlowArrayNetwork;
                    if (winterFlowConsumerStrategy2 == null) {
                        WinterFlowConsumerStrategy winterFlowConsumerStrategy3 = new WinterFlowConsumerStrategy(this.WinterFlowVariableVersionControl, WinterFlowConsumerStrategy.WinterFlowTransactionAgent, WinterFlowDecoratorDeserialization.WinterFlowHookDataSource, WinterFlowMiddlewareSubsystem.WinterFlowHookDataSource);
                        this.WinterFlowArrayNetwork = winterFlowConsumerStrategy3;
                        winterFlowConsumerStrategy2 = winterFlowConsumerStrategy3;
                    }
                    WinterFlowStrategyVersionControl winterFlowStrategyVersionControl = new WinterFlowStrategyVersionControl();
                    winterFlowStrategyVersionControl.WinterFlowHookDataSource = 0;
                    winterFlowStrategyVersionControl.WinterFlowArrayNetwork = new WinterFlowDebugDatabaseSchema[]{WinterFlowCloudStack.WinterFlowRouterRouter};
                    winterFlowStrategyVersionControl.WinterFlowRouterStructure = false;
                    winterFlowStrategyVersionControl.WinterFlowCacheManagerAgent = new WinterFlowNodeSerializer(winterFlowTransactionManagerParser);
                    winterFlowConsumerStrategy2.WinterFlowHookDataSource(2, winterFlowStrategyVersionControl.WinterFlowRouterStructure());
                }
                this.WinterFlowCacheManagerAgent = null;
                return true;
            case 18:
                WinterFlowEventEmitterUtility winterFlowEventEmitterUtility = (WinterFlowEventEmitterUtility) message.obj;
                long j = winterFlowEventEmitterUtility.WinterFlowCacheManagerAgent;
                WinterFlowTestingFramework winterFlowTestingFramework = winterFlowEventEmitterUtility.WinterFlowRouterStructure;
                int i7 = winterFlowEventEmitterUtility.WinterFlowHookDataSource;
                if (j == 0) {
                    WinterFlowTransactionManagerParser winterFlowTransactionManagerParser2 = new WinterFlowTransactionManagerParser(i7, Arrays.asList(winterFlowTestingFramework));
                    WinterFlowConsumerStrategy winterFlowConsumerStrategy4 = this.WinterFlowArrayNetwork;
                    if (winterFlowConsumerStrategy4 == null) {
                        WinterFlowConsumerStrategy winterFlowConsumerStrategy5 = new WinterFlowConsumerStrategy(this.WinterFlowVariableVersionControl, WinterFlowConsumerStrategy.WinterFlowTransactionAgent, WinterFlowDecoratorDeserialization.WinterFlowHookDataSource, WinterFlowMiddlewareSubsystem.WinterFlowHookDataSource);
                        this.WinterFlowArrayNetwork = winterFlowConsumerStrategy5;
                        winterFlowConsumerStrategy4 = winterFlowConsumerStrategy5;
                    }
                    WinterFlowStrategyVersionControl winterFlowStrategyVersionControl2 = new WinterFlowStrategyVersionControl();
                    winterFlowStrategyVersionControl2.WinterFlowHookDataSource = 0;
                    winterFlowStrategyVersionControl2.WinterFlowArrayNetwork = new WinterFlowDebugDatabaseSchema[]{WinterFlowCloudStack.WinterFlowRouterRouter};
                    winterFlowStrategyVersionControl2.WinterFlowRouterStructure = false;
                    winterFlowStrategyVersionControl2.WinterFlowCacheManagerAgent = new WinterFlowNodeSerializer(winterFlowTransactionManagerParser2);
                    winterFlowConsumerStrategy4.WinterFlowHookDataSource(2, winterFlowStrategyVersionControl2.WinterFlowRouterStructure());
                    return true;
                }
                WinterFlowTransactionManagerParser winterFlowTransactionManagerParser3 = this.WinterFlowCacheManagerAgent;
                if (winterFlowTransactionManagerParser3 != null) {
                    List list = winterFlowTransactionManagerParser3.WinterFlowTransactionManagerStrategy;
                    if (winterFlowTransactionManagerParser3.WinterFlowVariableVersionControl != i7 || (list != null && list.size() >= winterFlowEventEmitterUtility.WinterFlowArrayNetwork)) {
                        winterFlowWidgetInterface.removeMessages(17);
                        WinterFlowTransactionManagerParser winterFlowTransactionManagerParser4 = this.WinterFlowCacheManagerAgent;
                        if (winterFlowTransactionManagerParser4 != null) {
                            if (winterFlowTransactionManagerParser4.WinterFlowVariableVersionControl > 0 || WinterFlowArrayNetwork()) {
                                WinterFlowConsumerStrategy winterFlowConsumerStrategy6 = this.WinterFlowArrayNetwork;
                                if (winterFlowConsumerStrategy6 == null) {
                                    z2 = true;
                                    WinterFlowConsumerStrategy winterFlowConsumerStrategy7 = new WinterFlowConsumerStrategy(this.WinterFlowVariableVersionControl, WinterFlowConsumerStrategy.WinterFlowTransactionAgent, WinterFlowDecoratorDeserialization.WinterFlowHookDataSource, WinterFlowMiddlewareSubsystem.WinterFlowHookDataSource);
                                    this.WinterFlowArrayNetwork = winterFlowConsumerStrategy7;
                                    winterFlowConsumerStrategy6 = winterFlowConsumerStrategy7;
                                } else {
                                    z2 = true;
                                }
                                WinterFlowStrategyVersionControl winterFlowStrategyVersionControl3 = new WinterFlowStrategyVersionControl();
                                winterFlowStrategyVersionControl3.WinterFlowHookDataSource = 0;
                                winterFlowStrategyVersionControl3.WinterFlowArrayNetwork = new WinterFlowDebugDatabaseSchema[]{WinterFlowCloudStack.WinterFlowRouterRouter};
                                winterFlowStrategyVersionControl3.WinterFlowRouterStructure = false;
                                winterFlowStrategyVersionControl3.WinterFlowCacheManagerAgent = new WinterFlowNodeSerializer(winterFlowTransactionManagerParser4);
                                winterFlowConsumerStrategy6.WinterFlowHookDataSource(2, winterFlowStrategyVersionControl3.WinterFlowRouterStructure());
                            } else {
                                z2 = true;
                            }
                            this.WinterFlowCacheManagerAgent = null;
                            if (this.WinterFlowCacheManagerAgent == null) {
                                return z2;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(winterFlowTestingFramework);
                            this.WinterFlowCacheManagerAgent = new WinterFlowTransactionManagerParser(i7, arrayList2);
                            winterFlowWidgetInterface.sendMessageDelayed(winterFlowWidgetInterface.obtainMessage(17), j);
                            return z2;
                        }
                    } else {
                        WinterFlowTransactionManagerParser winterFlowTransactionManagerParser5 = this.WinterFlowCacheManagerAgent;
                        List list2 = winterFlowTransactionManagerParser5.WinterFlowTransactionManagerStrategy;
                        if (list2 == null) {
                            list2 = new ArrayList();
                            winterFlowTransactionManagerParser5.WinterFlowTransactionManagerStrategy = list2;
                        }
                        list2.add(winterFlowTestingFramework);
                    }
                }
                z2 = true;
                if (this.WinterFlowCacheManagerAgent == null) {
                }
                break;
            case 19:
                this.WinterFlowHookDataSource = false;
                return true;
            default:
                new StringBuilder(String.valueOf(i).length() + 20);
                return false;
        }
    }
}
