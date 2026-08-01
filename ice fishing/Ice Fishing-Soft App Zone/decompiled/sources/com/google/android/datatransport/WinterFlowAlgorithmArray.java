package com.google.android.datatransport;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import android.view.autofill.AutofillId;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.icewinter.flow.winter.icecatch.ColdActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAlgorithmArray implements WinterFlowViewInterface, WinterFlowBandwidthClass, WinterFlowCompilerMapper, WinterFlowAPIRefactoring, WinterFlowSoftwareStrategy, WinterFlowClassNetwork, WinterFlowListenerUtility {
    public static final Object WinterFlowRouterRouter = new Object();
    public static WinterFlowInvokerIDE WinterFlowSyntax;
    public Object WinterFlowTransactionManagerStrategy;
    public Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowAlgorithmArray(int i) {
        this.WinterFlowVariableVersionControl = i;
        switch (i) {
            case 12:
                this.WinterFlowTransactionManagerStrategy = new ArrayList();
                this.WinterFlowUnitTestResponse = new HashMap();
                new HashMap();
                break;
            case 14:
                break;
            case 18:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowDatabaseSchemaStructure();
                this.WinterFlowUnitTestResponse = new WinterFlowDatabaseSchemaStructure();
                break;
            case 20:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowJSON(new WinterFlowSchedulerStructure[16]);
                break;
            case 27:
                this.WinterFlowTransactionManagerStrategy = new LinkedHashMap();
                this.WinterFlowUnitTestResponse = new LinkedHashMap();
                break;
            default:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowConcurrencyProxy(0);
                this.WinterFlowUnitTestResponse = new WinterFlowConcurrencyProxy(0);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void WinterFlowOrchestrationSubsystem(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        if (winterFlowSchedulerStructure.WinterFlowProxyStructure > 0) {
            if (winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowArrayNetwork == WinterFlowTransactionManagerThreadPool.WinterFlowSyntax && !winterFlowSchedulerStructure.WinterFlowBandwidthObject() && !winterFlowSchedulerStructure.WinterFlowOrchestrationSubsystem() && !winterFlowSchedulerStructure.WinterFlowConfiguration && winterFlowSchedulerStructure.WinterFlowPackageIDE()) {
                WinterFlowUserManagerController winterFlowUserManagerController = winterFlowSchedulerStructure.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy;
                if ((winterFlowUserManagerController.WinterFlowRouterRouter & 256) != 0) {
                    while (winterFlowUserManagerController != null) {
                        if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 256) != 0) {
                            WinterFlowTestingEntity winterFlowTestingEntity = winterFlowUserManagerController;
                            ?? r5 = 0;
                            while (winterFlowTestingEntity != 0) {
                                if (winterFlowTestingEntity instanceof WinterFlowRuntimeEntity) {
                                    WinterFlowRuntimeEntity winterFlowRuntimeEntity = (WinterFlowRuntimeEntity) winterFlowTestingEntity;
                                    winterFlowRuntimeEntity.WinterFlowCacheManagerListener(WinterFlowCloudStack.WinterFlowUserManagerUserManager(winterFlowRuntimeEntity, 256));
                                } else if ((winterFlowTestingEntity.WinterFlowUnitTestResponse & 256) != 0 && (winterFlowTestingEntity instanceof WinterFlowTestingEntity)) {
                                    WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowTestingEntity.WinterFlowBatchUI;
                                    int i = 0;
                                    winterFlowTestingEntity = winterFlowTestingEntity;
                                    r5 = r5;
                                    while (winterFlowUserManagerController2 != null) {
                                        if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                winterFlowTestingEntity = winterFlowUserManagerController2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                }
                                                if (winterFlowTestingEntity != 0) {
                                                    r5.WinterFlowHookDataSource(winterFlowTestingEntity);
                                                    winterFlowTestingEntity = 0;
                                                }
                                                r5.WinterFlowHookDataSource(winterFlowUserManagerController2);
                                            }
                                        }
                                        winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowResponseEngine;
                                        winterFlowTestingEntity = winterFlowTestingEntity;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                winterFlowTestingEntity = WinterFlowCloudStack.WinterFlowPackageIDE(r5);
                            }
                        }
                        if ((winterFlowUserManagerController.WinterFlowRouterRouter & 256) == 0) {
                            break;
                        } else {
                            winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowResponseEngine;
                        }
                    }
                }
            }
            winterFlowSchedulerStructure.WinterFlowCacheTool = false;
            WinterFlowJSON WinterFlowResolverController = winterFlowSchedulerStructure.WinterFlowResolverController();
            Object[] objArr = WinterFlowResolverController.WinterFlowVariableVersionControl;
            int i2 = WinterFlowResolverController.WinterFlowUnitTestResponse;
            for (int i3 = 0; i3 < i2; i3++) {
                WinterFlowOrchestrationSubsystem((WinterFlowSchedulerStructure) objArr[i3]);
            }
        }
    }

    public static WinterFlowAlgorithmArray WinterFlowRouterRouter(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new WinterFlowAlgorithmArray(7, fileChannel, fileLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            fileChannel = null;
            fileLock = null;
        }
    }

    public static WinterFlowExceptionParser WinterFlowServerProtocol(Context context, Intent intent, boolean z) {
        WinterFlowInvokerIDE winterFlowInvokerIDE;
        synchronized (WinterFlowRouterRouter) {
            try {
                winterFlowInvokerIDE = WinterFlowSyntax;
                if (winterFlowInvokerIDE == null) {
                    winterFlowInvokerIDE = new WinterFlowInvokerIDE(context);
                    WinterFlowSyntax = winterFlowInvokerIDE;
                }
            } finally {
            }
        }
        if (!z) {
            return winterFlowInvokerIDE.WinterFlowHookDataSource(intent).WinterFlowCacheManagerAgent(new WinterFlowOrchestrationSession(1), new WinterFlowCompilerMechanism(20));
        }
        if (WinterFlowStackProvider.WinterFlowServerProtocol().WinterFlowVariableBandwidth(context)) {
            synchronized (WinterFlowCacheRuntime.WinterFlowServiceUtility) {
                try {
                    WinterFlowCacheRuntime.WinterFlowTransactionAgent(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        WinterFlowCacheRuntime.WinterFlowBandwidthObject.WinterFlowRouterStructure();
                    }
                    WinterFlowExceptionParser WinterFlowHookDataSource = winterFlowInvokerIDE.WinterFlowHookDataSource(intent);
                    WinterFlowHookDataSource.WinterFlowHookDataSource.WinterFlowHookDataSource(new WinterFlowProtocolMechanism(WinterFlowCacheHandler.WinterFlowRouterStructure, new WinterFlowExceptionBandwidth(8, intent)));
                    WinterFlowHookDataSource.WinterFlowThreadListener();
                } finally {
                }
            }
        } else {
            winterFlowInvokerIDE.WinterFlowHookDataSource(intent);
        }
        return WinterFlowHookProcessor.WinterFlowResponseEngine(-1);
    }

    public void WinterFlowArrayHelper(String str, WinterFlowQueueFramework winterFlowQueueFramework) {
        WinterFlowNodeGateway winterFlowNodeGateway = (WinterFlowNodeGateway) this.WinterFlowTransactionManagerStrategy;
        synchronized (winterFlowNodeGateway.WinterFlowCacheManagerAgent) {
            if (winterFlowNodeGateway.WinterFlowArrayNetwork.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            winterFlowNodeGateway.WinterFlowArrayNetwork.put(str, winterFlowQueueFramework);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowBandwidthClass
    public boolean WinterFlowArrayNetwork(CharSequence charSequence, int i, int i2, WinterFlowBackend winterFlowBackend) {
        if ((winterFlowBackend.WinterFlowCacheManagerAgent & 4) > 0) {
            return true;
        }
        if (((WinterFlowMapperTool) this.WinterFlowTransactionManagerStrategy) == null) {
            this.WinterFlowTransactionManagerStrategy = new WinterFlowMapperTool(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((WinterFlowThreadPoolProcess) this.WinterFlowUnitTestResponse).getClass();
        ((WinterFlowMapperTool) this.WinterFlowTransactionManagerStrategy).setSpan(new WinterFlowHandlerHandler(winterFlowBackend), i, i2, 33);
        return true;
    }

    public WinterFlowExceptionParser WinterFlowBackendCacheManager(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.WinterFlowTransactionManagerStrategy;
        WinterFlowOrchestrationSession winterFlowOrchestrationSession = (WinterFlowOrchestrationSession) this.WinterFlowUnitTestResponse;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? WinterFlowHookProcessor.WinterFlowUnitTestResponse(winterFlowOrchestrationSession, new Callable() { // from class: com.google.android.datatransport.WinterFlowRouterService
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                Context context2 = context;
                Intent intent2 = intent;
                WinterFlowStackProvider WinterFlowServerProtocol = WinterFlowStackProvider.WinterFlowServerProtocol();
                ((ArrayDeque) WinterFlowServerProtocol.WinterFlowRouterRouter).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (WinterFlowServerProtocol) {
                    try {
                        str = (String) WinterFlowServerProtocol.WinterFlowVariableVersionControl;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        str = context2.getPackageName() + serviceInfo.name;
                                        WinterFlowServerProtocol.WinterFlowVariableVersionControl = str;
                                    } else {
                                        str = serviceInfo.name;
                                        WinterFlowServerProtocol.WinterFlowVariableVersionControl = str;
                                    }
                                }
                                str = null;
                            }
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    i = (WinterFlowServerProtocol.WinterFlowVariableBandwidth(context2) ? WinterFlowCacheRuntime.WinterFlowCompilerDataSource(context2, intent3) : context2.startService(intent3)) == null ? 404 : -1;
                } catch (IllegalStateException e) {
                    e.toString();
                    i = 402;
                } catch (SecurityException unused) {
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }).WinterFlowArrayNetwork(winterFlowOrchestrationSession, new WinterFlowModuleClass() { // from class: com.google.android.datatransport.WinterFlowServiceProviderSoftware
            @Override // com.google.android.datatransport.WinterFlowModuleClass
            public final Object WinterFlowArrayNetwork(WinterFlowExceptionParser winterFlowExceptionParser) {
                return ((Integer) winterFlowExceptionParser.WinterFlowTransactionManagerStrategy()).intValue() != 402 ? winterFlowExceptionParser : WinterFlowAlgorithmArray.WinterFlowServerProtocol(context, intent, z2).WinterFlowCacheManagerAgent(new WinterFlowOrchestrationSession(1), new WinterFlowCompilerMechanism(19));
            }
        }) : WinterFlowServerProtocol(context, intent, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void WinterFlowBandwidthObject() {
        Object[] objArr;
        WinterFlowJSON winterFlowJSON = (WinterFlowJSON) this.WinterFlowTransactionManagerStrategy;
        Arrays.sort(winterFlowJSON.WinterFlowVariableVersionControl, 0, winterFlowJSON.WinterFlowUnitTestResponse, WinterFlowClassSystem.WinterFlowArrayNetwork);
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        WinterFlowSchedulerStructure[] winterFlowSchedulerStructureArr = (WinterFlowSchedulerStructure[]) this.WinterFlowUnitTestResponse;
        if (winterFlowSchedulerStructureArr != null) {
            int length = winterFlowSchedulerStructureArr.length;
            objArr = winterFlowSchedulerStructureArr;
        }
        objArr = new WinterFlowSchedulerStructure[Math.max(16, i)];
        this.WinterFlowUnitTestResponse = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = winterFlowJSON.WinterFlowVariableVersionControl[i2];
        }
        winterFlowJSON.WinterFlowUnitTestResponse();
        while (true) {
            i--;
            if (-1 >= i) {
                this.WinterFlowUnitTestResponse = objArr;
                return;
            }
            WinterFlowSchedulerStructure winterFlowSchedulerStructure = objArr[i];
            winterFlowSchedulerStructure.getClass();
            if (winterFlowSchedulerStructure.WinterFlowCacheTool) {
                WinterFlowOrchestrationSubsystem(winterFlowSchedulerStructure);
            }
            objArr[i] = 0;
        }
    }

    public List WinterFlowBatchUI() {
        ArrayList arrayList;
        if (((ArrayList) this.WinterFlowTransactionManagerStrategy).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.WinterFlowTransactionManagerStrategy)) {
            arrayList = new ArrayList((ArrayList) this.WinterFlowTransactionManagerStrategy);
        }
        return arrayList;
    }

    @Override // com.google.android.datatransport.WinterFlowListenerUtility
    public List WinterFlowCacheManagerAgent(Integer num) {
        List WinterFlowCacheManagerAgent = ((WinterFlowListenerUtility) this.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent(null);
        WinterFlowServiceProviderListener winterFlowServiceProviderListener = (WinterFlowServiceProviderListener) this.WinterFlowUnitTestResponse;
        int i = winterFlowServiceProviderListener.WinterFlowSerializerStructure;
        return i < 0 ? WinterFlowCacheManagerAgent : WinterFlowSerializerUtility.WinterFlowResolverListener(WinterFlowTestingCloud.WinterFlowArrayNetwork(winterFlowServiceProviderListener, num, i, Integer.valueOf(winterFlowServiceProviderListener.WinterFlowConfigurationSubsystem(winterFlowServiceProviderListener.WinterFlowHookDataSource, i))), WinterFlowCacheManagerAgent);
    }

    public void WinterFlowCompilerVariable() {
        try {
            ((FileLock) this.WinterFlowUnitTestResponse).release();
            ((FileChannel) this.WinterFlowTransactionManagerStrategy).close();
        } catch (IOException unused) {
        }
    }

    public void WinterFlowConcurrencyThread(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.WinterFlowTransactionManagerStrategy;
        WinterFlowArray winterFlowArray = new WinterFlowArray(byteArrayOutputStream, hashMap, (HashMap) this.WinterFlowUnitTestResponse);
        WinterFlowResponseSubsystem winterFlowResponseSubsystem = (WinterFlowResponseSubsystem) hashMap.get(obj.getClass());
        if (winterFlowResponseSubsystem != null) {
            winterFlowResponseSubsystem.WinterFlowRouterStructure(obj, winterFlowArray);
            return;
        }
        throw new WinterFlowArrayManager("No encoder for " + obj.getClass());
    }

    public void WinterFlowConfigurationSubsystem() {
        if (!((WinterFlowNodeGateway) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterRouter) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Can not perform this action after onSaveInstanceState");
            return;
        }
        WinterFlowManagerPlatform winterFlowManagerPlatform = (WinterFlowManagerPlatform) this.WinterFlowUnitTestResponse;
        if (winterFlowManagerPlatform == null) {
            winterFlowManagerPlatform = new WinterFlowManagerPlatform(this);
        }
        this.WinterFlowUnitTestResponse = winterFlowManagerPlatform;
        try {
            WinterFlowModuleRouter.class.getDeclaredConstructor(null);
            WinterFlowManagerPlatform winterFlowManagerPlatform2 = (WinterFlowManagerPlatform) this.WinterFlowUnitTestResponse;
            if (winterFlowManagerPlatform2 != null) {
                winterFlowManagerPlatform2.WinterFlowRouterStructure.add(WinterFlowModuleRouter.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + WinterFlowModuleRouter.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void WinterFlowConsumerUserManager(WinterFlowSchedulerEventEmitter winterFlowSchedulerEventEmitter) {
        WinterFlowSchedulerXML winterFlowSchedulerXML = (WinterFlowSchedulerXML) this.WinterFlowUnitTestResponse;
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = (WinterFlowThreadPoolProcess) this.WinterFlowTransactionManagerStrategy;
        int i = winterFlowSchedulerEventEmitter.WinterFlowHookDataSource;
        boolean z = false;
        Object[] objArr = 0;
        if (i != 0) {
            winterFlowSchedulerXML.execute(new WinterFlowSessionThreadPool(i, (int) (objArr == true ? 1 : 0), (Object) winterFlowThreadPoolProcess));
        } else {
            winterFlowSchedulerXML.execute(new WinterFlowValidatorSystem(21, winterFlowThreadPoolProcess, winterFlowSchedulerEventEmitter.WinterFlowRouterStructure, z));
        }
    }

    public WinterFlowManagerEvent WinterFlowEventEmitterController() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(WinterFlowVariableBandwidth());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = WinterFlowManagerEvent.WinterFlowRouterRouter;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i2 = WinterFlowResolverBackend.WinterFlowSerializerStructure(5)[optInt];
        if (i2 == 0) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i2 != 0) {
            return new WinterFlowManagerEvent(optString, i2, optString2, optString3, optLong2, optLong, optString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        WinterFlowCompilerMechanism.WinterFlowRouterRouter(sb, "Missing required properties:");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #6 {all -> 0x00bd, blocks: (B:61:0x00bc, B:62:0x00bf, B:63:0x00d7), top: B:59:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf A[Catch: all -> 0x00bd, TryCatch #6 {all -> 0x00bd, blocks: (B:61:0x00bc, B:62:0x00bf, B:63:0x00d7), top: B:59:0x00ba }] */
    @Override // com.google.android.datatransport.WinterFlowViewInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowDeserializationHandler WinterFlowHookDataSource(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider = (WinterFlowConsumerServiceProvider) this.WinterFlowUnitTestResponse;
        if (!str.equals(":memory:")) {
            str = ((WinterFlowConfigurationMiddleware) winterFlowConsumerServiceProvider.WinterFlowCacheManagerAgent).WinterFlowRouterStructure.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        WinterFlowConsumerVariable winterFlowConsumerVariable = new WinterFlowConsumerVariable(str, (winterFlowConsumerServiceProvider.WinterFlowRouterStructure || winterFlowConsumerServiceProvider.WinterFlowHookDataSource || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = winterFlowConsumerVariable.WinterFlowRouterStructure;
        reentrantLock.lock();
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = winterFlowConsumerVariable.WinterFlowHookDataSource;
        if (winterFlowAlgorithmArray != null) {
            try {
                winterFlowAlgorithmArray.WinterFlowMapperProtocol();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (!z) {
                        throw th;
                    }
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (winterFlowConsumerServiceProvider.WinterFlowHookDataSource) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                WinterFlowDeserializationHandler WinterFlowHookDataSource = ((WinterFlowViewInterface) this.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource(str);
                if (winterFlowConsumerServiceProvider.WinterFlowRouterStructure) {
                    WinterFlowConsumerServiceProvider.WinterFlowRouterStructure(WinterFlowHookDataSource);
                    if (((WinterFlowConfigurationMiddleware) winterFlowConsumerServiceProvider.WinterFlowCacheManagerAgent).WinterFlowTransactionManagerStrategy == WinterFlowClassView.WinterFlowTransactionManagerStrategy) {
                        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(WinterFlowHookDataSource, "PRAGMA synchronous = NORMAL");
                    } else {
                        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(WinterFlowHookDataSource, "PRAGMA synchronous = FULL");
                    }
                    ((WinterFlowRepositoryProtocol) winterFlowConsumerServiceProvider.WinterFlowArrayNetwork).WinterFlowArrayNetwork(WinterFlowHookDataSource);
                } else {
                    try {
                        winterFlowConsumerServiceProvider.WinterFlowHookDataSource = true;
                        winterFlowConsumerServiceProvider.WinterFlowHookDataSource(WinterFlowHookDataSource);
                        winterFlowConsumerServiceProvider.WinterFlowHookDataSource = false;
                    } catch (Throwable th2) {
                        winterFlowConsumerServiceProvider.WinterFlowHookDataSource = false;
                        throw th2;
                    }
                }
                if (winterFlowAlgorithmArray != null && (fileChannel2 = (FileChannel) winterFlowAlgorithmArray.WinterFlowUnitTestResponse) != null) {
                    try {
                        fileChannel2.close();
                        winterFlowAlgorithmArray.WinterFlowUnitTestResponse = null;
                    } finally {
                    }
                }
                return WinterFlowHookDataSource;
            } catch (Throwable th3) {
                if (winterFlowAlgorithmArray != null && (fileChannel = (FileChannel) winterFlowAlgorithmArray.WinterFlowUnitTestResponse) != null) {
                    try {
                        fileChannel.close();
                        winterFlowAlgorithmArray.WinterFlowUnitTestResponse = null;
                    } finally {
                    }
                }
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            if (!z) {
            }
        }
    }

    public void WinterFlowMapperProtocol() {
        String str = (String) this.WinterFlowTransactionManagerStrategy;
        if (((FileChannel) this.WinterFlowUnitTestResponse) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.WinterFlowUnitTestResponse = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.WinterFlowUnitTestResponse;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.WinterFlowUnitTestResponse = null;
            throw new IllegalStateException(WinterFlowResolverBackend.WinterFlowResponseEngine("Unable to lock file: '", str, "'."), th);
        }
    }

    public AutofillId WinterFlowResolverController(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return WinterFlowBackendSubsystem.WinterFlowHookDataSource(WinterFlowHookManager.WinterFlowArrayNetwork(this.WinterFlowTransactionManagerStrategy), ((View) this.WinterFlowUnitTestResponse).getAutofillId(), j);
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowAPIRefactoring
    public boolean WinterFlowResponseEngine(Object obj, Object obj2) {
        WinterFlowRouterManager winterFlowRouterManager = (WinterFlowRouterManager) this.WinterFlowTransactionManagerStrategy;
        return WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRouterManager.WinterFlowHookDataSource(obj), winterFlowRouterManager.WinterFlowHookDataSource(obj2));
    }

    public WinterFlowQueueFramework WinterFlowRouterAdapter(String str) {
        WinterFlowQueueFramework winterFlowQueueFramework;
        WinterFlowNodeGateway winterFlowNodeGateway = (WinterFlowNodeGateway) this.WinterFlowTransactionManagerStrategy;
        synchronized (winterFlowNodeGateway.WinterFlowCacheManagerAgent) {
            Iterator it = winterFlowNodeGateway.WinterFlowArrayNetwork.entrySet().iterator();
            do {
                winterFlowQueueFramework = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                WinterFlowQueueFramework winterFlowQueueFramework2 = (WinterFlowQueueFramework) entry.getValue();
                if (WinterFlowManagerRequest.WinterFlowThreadListener(str2, str)) {
                    winterFlowQueueFramework = winterFlowQueueFramework2;
                }
            } while (winterFlowQueueFramework == null);
        }
        return winterFlowQueueFramework;
    }

    @Override // com.google.android.datatransport.WinterFlowBandwidthClass
    public Object WinterFlowRouterStructure() {
        return (WinterFlowMapperTool) this.WinterFlowTransactionManagerStrategy;
    }

    public void WinterFlowSerializerStructure(WinterFlowManagerEvent winterFlowManagerEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", winterFlowManagerEvent.WinterFlowRouterStructure);
            jSONObject.put("Status", WinterFlowResolverBackend.WinterFlowRouterAdapter(winterFlowManagerEvent.WinterFlowHookDataSource));
            jSONObject.put("AuthToken", winterFlowManagerEvent.WinterFlowCacheManagerAgent);
            jSONObject.put("RefreshToken", winterFlowManagerEvent.WinterFlowArrayNetwork);
            jSONObject.put("TokenCreationEpochInSecs", winterFlowManagerEvent.WinterFlowTransactionManagerStrategy);
            jSONObject.put("ExpiresInSecs", winterFlowManagerEvent.WinterFlowVariableVersionControl);
            jSONObject.put("FisError", winterFlowManagerEvent.WinterFlowUnitTestResponse);
            com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = (com.google.firebase.WinterFlowSyntaxEvent) this.WinterFlowUnitTestResponse;
            winterFlowSyntaxEvent.WinterFlowRouterStructure();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", winterFlowSyntaxEvent.WinterFlowRouterStructure.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (createTempFile.renameTo(WinterFlowVariableBandwidth())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public Bundle WinterFlowServiceUtility(String str) {
        Bundle bundle;
        WinterFlowNodeGateway winterFlowNodeGateway = (WinterFlowNodeGateway) this.WinterFlowTransactionManagerStrategy;
        if (!winterFlowNodeGateway.WinterFlowUnitTestResponse) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = winterFlowNodeGateway.WinterFlowTransactionManagerStrategy;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                WinterFlowFrameworkMechanism.WinterFlowResponseEngine(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            winterFlowNodeGateway.WinterFlowTransactionManagerStrategy = null;
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory WinterFlowSingletonPlatform(String str) {
        Bundle bundle;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        Map map = (Map) this.WinterFlowUnitTestResponse;
        if (map == null) {
            Context context = (Context) this.WinterFlowTransactionManagerStrategy;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) != null) {
                bundle = serviceInfo.metaData;
                if (bundle != null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str2 : bundle.keySet()) {
                        Object obj = bundle.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(",", -1)) {
                                String trim = str3.trim();
                                if (!trim.isEmpty()) {
                                    hashMap.put(trim, str2.substring(8));
                                }
                            }
                        }
                    }
                    map = hashMap;
                }
                this.WinterFlowUnitTestResponse = map;
            }
            bundle = null;
            if (bundle != null) {
            }
            this.WinterFlowUnitTestResponse = map;
        }
        String str4 = (String) map.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    public void WinterFlowStrategyTool() {
        synchronized (this) {
            ((AtomicInteger) this.WinterFlowTransactionManagerStrategy).decrementAndGet();
            if (((AtomicInteger) this.WinterFlowTransactionManagerStrategy).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void WinterFlowSyntax(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + valueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        ((ArrayList) this.WinterFlowTransactionManagerStrategy).add(sb.toString());
    }

    public boolean WinterFlowThreadListener() {
        synchronized (this) {
            if (((AtomicBoolean) this.WinterFlowUnitTestResponse).get()) {
                return false;
            }
            ((AtomicInteger) this.WinterFlowTransactionManagerStrategy).incrementAndGet();
            return true;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAPIRefactoring
    public void WinterFlowTransactionAgent(WinterFlowCacheManagerGateway winterFlowCacheManagerGateway) {
        WinterFlowLibraryCache winterFlowLibraryCache = (WinterFlowLibraryCache) this.WinterFlowUnitTestResponse;
        winterFlowLibraryCache.WinterFlowRouterStructure();
        WinterFlowLibraryProcess winterFlowLibraryProcess = (WinterFlowLibraryProcess) winterFlowCacheManagerGateway.WinterFlowTransactionManagerStrategy;
        Object[] objArr = winterFlowLibraryProcess.WinterFlowHookDataSource;
        long[] jArr = winterFlowLibraryProcess.WinterFlowCacheManagerAgent;
        int i = winterFlowLibraryProcess.WinterFlowVariableVersionControl;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object WinterFlowHookDataSource = ((WinterFlowRouterManager) this.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource(obj);
            int WinterFlowArrayNetwork = winterFlowLibraryCache.WinterFlowArrayNetwork(WinterFlowHookDataSource);
            int i3 = WinterFlowArrayNetwork >= 0 ? winterFlowLibraryCache.WinterFlowCacheManagerAgent[WinterFlowArrayNetwork] : 0;
            if (i3 == 7) {
                winterFlowCacheManagerGateway.remove(obj);
            } else {
                winterFlowLibraryCache.WinterFlowUnitTestResponse(i3 + 1, WinterFlowHookDataSource);
            }
            i = i2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowViewInterface
    public boolean WinterFlowTransactionManagerStrategy() {
        return ((WinterFlowViewInterface) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy();
    }

    @Override // com.google.android.datatransport.WinterFlowCompilerMapper
    public Object WinterFlowUnitTestResponse(Object obj) {
        this.WinterFlowTransactionManagerStrategy = (WinterFlowAPIGateway) obj;
        ((WinterFlowControllerModule) this.WinterFlowUnitTestResponse).WinterFlowSessionManagerInterface("*/*");
        return Boolean.TRUE;
    }

    public File WinterFlowVariableBandwidth() {
        if (((File) this.WinterFlowTransactionManagerStrategy) == null) {
            synchronized (this) {
                try {
                    if (((File) this.WinterFlowTransactionManagerStrategy) == null) {
                        String str = "PersistedInstallation." + ((com.google.firebase.WinterFlowSyntaxEvent) this.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent() + ".json";
                        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = (com.google.firebase.WinterFlowSyntaxEvent) this.WinterFlowUnitTestResponse;
                        winterFlowSyntaxEvent.WinterFlowRouterStructure();
                        File file = new File(winterFlowSyntaxEvent.WinterFlowRouterStructure.getNoBackupFilesDir(), str);
                        this.WinterFlowTransactionManagerStrategy = file;
                        if (file.exists()) {
                            return (File) this.WinterFlowTransactionManagerStrategy;
                        }
                        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = (com.google.firebase.WinterFlowSyntaxEvent) this.WinterFlowUnitTestResponse;
                        winterFlowSyntaxEvent2.WinterFlowRouterStructure();
                        File file2 = new File(winterFlowSyntaxEvent2.WinterFlowRouterStructure.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.WinterFlowTransactionManagerStrategy)) {
                            new IOException("Unable to move the file from back up to non back up directory");
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowListenerUtility
    public boolean WinterFlowVariableVersionControl() {
        return ((WinterFlowListenerUtility) this.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl();
    }

    @Override // com.google.android.datatransport.WinterFlowClassNetwork
    public void cancel() {
        if (((WinterFlowFunctionEncryption) this.WinterFlowUnitTestResponse).compareAndSet(1, 1)) {
            return;
        }
        ((WinterFlowRouterHelper) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure();
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareStrategy
    public Object get() {
        switch (this.WinterFlowVariableVersionControl) {
            case 16:
                return new WinterFlowDataSource((Context) ((WinterFlowJSONDecorator) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy, (WinterFlowObjectPackage) ((WinterFlowConfigurationModule) this.WinterFlowUnitTestResponse).get());
            default:
                WinterFlowModuleFunction winterFlowModuleFunction = new WinterFlowModuleFunction(1);
                WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(29);
                Object obj = ((WinterFlowSoftwareStrategy) this.WinterFlowTransactionManagerStrategy).get();
                WinterFlowSoftwareStrategy winterFlowSoftwareStrategy = (WinterFlowSoftwareStrategy) this.WinterFlowUnitTestResponse;
                return new WinterFlowFrameworkManager(winterFlowModuleFunction, winterFlowThreadPoolProcess, WinterFlowLibraryStack.WinterFlowTransactionManagerStrategy, (WinterFlowVersionControlTransaction) obj, winterFlowSoftwareStrategy);
        }
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                return "AnimationResult(endReason=" + ((WinterFlowParserRenderer) this.WinterFlowUnitTestResponse) + ", endState=" + ((WinterFlowFunctionSubsystem) this.WinterFlowTransactionManagerStrategy) + ')';
            case 19:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.WinterFlowUnitTestResponse.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.WinterFlowTransactionManagerStrategy;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ WinterFlowAlgorithmArray(Object obj) {
        this.WinterFlowVariableVersionControl = 19;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowTransactionManagerStrategy = new ArrayList();
    }

    public WinterFlowAlgorithmArray(String str, WinterFlowEncryptionSubsystem winterFlowEncryptionSubsystem, WinterFlowCacheUtility winterFlowCacheUtility) {
        this.WinterFlowVariableVersionControl = 2;
        this.WinterFlowUnitTestResponse = str;
        this.WinterFlowTransactionManagerStrategy = winterFlowEncryptionSubsystem;
    }

    public WinterFlowAlgorithmArray(ColdActivity coldActivity) {
        this.WinterFlowVariableVersionControl = 10;
        this.WinterFlowUnitTestResponse = coldActivity.WinterFlowResponseEngine(new WinterFlowExceptionBandwidth(2, this), new WinterFlowMapperProvider(0));
    }

    public /* synthetic */ WinterFlowAlgorithmArray(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    public WinterFlowAlgorithmArray(WinterFlowNodeGateway winterFlowNodeGateway) {
        this.WinterFlowVariableVersionControl = 29;
        this.WinterFlowTransactionManagerStrategy = winterFlowNodeGateway;
    }

    public WinterFlowAlgorithmArray(String str) {
        this.WinterFlowVariableVersionControl = 11;
        this.WinterFlowTransactionManagerStrategy = str.concat(".lck");
    }

    public WinterFlowAlgorithmArray(WinterFlowObjectRuntime winterFlowObjectRuntime) {
        this.WinterFlowVariableVersionControl = 5;
        this.WinterFlowTransactionManagerStrategy = new AtomicInteger(0);
        this.WinterFlowUnitTestResponse = new AtomicBoolean(false);
    }

    public WinterFlowAlgorithmArray(WinterFlowRouterHelper winterFlowRouterHelper) {
        this.WinterFlowVariableVersionControl = 21;
        this.WinterFlowTransactionManagerStrategy = winterFlowRouterHelper;
        this.WinterFlowUnitTestResponse = new WinterFlowFunctionEncryption(0);
    }

    public WinterFlowAlgorithmArray(ExecutorService executorService) {
        this.WinterFlowVariableVersionControl = 26;
        this.WinterFlowUnitTestResponse = new WinterFlowUnitTestSystem(0);
        this.WinterFlowTransactionManagerStrategy = executorService;
    }

    public WinterFlowAlgorithmArray(Context context, int i) {
        this.WinterFlowVariableVersionControl = i;
        switch (i) {
            case 15:
                this.WinterFlowUnitTestResponse = null;
                this.WinterFlowTransactionManagerStrategy = context;
                break;
            default:
                this.WinterFlowTransactionManagerStrategy = context;
                this.WinterFlowUnitTestResponse = new WinterFlowOrchestrationSession(1);
                break;
        }
    }

    public WinterFlowAlgorithmArray(WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider, WinterFlowViewInterface winterFlowViewInterface) {
        this.WinterFlowVariableVersionControl = 3;
        winterFlowViewInterface.getClass();
        this.WinterFlowUnitTestResponse = winterFlowConsumerServiceProvider;
        this.WinterFlowTransactionManagerStrategy = winterFlowViewInterface;
    }

    public WinterFlowAlgorithmArray(com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent) {
        this.WinterFlowVariableVersionControl = 23;
        this.WinterFlowUnitTestResponse = winterFlowSyntaxEvent;
    }

    public WinterFlowAlgorithmArray(WinterFlowRouterManager winterFlowRouterManager) {
        this.WinterFlowVariableVersionControl = 13;
        this.WinterFlowTransactionManagerStrategy = winterFlowRouterManager;
        WinterFlowLibraryCache winterFlowLibraryCache = WinterFlowProtocolSoftware.WinterFlowRouterStructure;
        this.WinterFlowUnitTestResponse = new WinterFlowLibraryCache();
    }
}
