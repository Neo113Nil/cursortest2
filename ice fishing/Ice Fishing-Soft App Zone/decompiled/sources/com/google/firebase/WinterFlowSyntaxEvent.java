package com.google.firebase;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import com.google.android.datatransport.WinterFlowAlgorithmArray;
import com.google.android.datatransport.WinterFlowClassInterface;
import com.google.android.datatransport.WinterFlowConfigurationIDE;
import com.google.android.datatransport.WinterFlowControllerCache;
import com.google.android.datatransport.WinterFlowDeserializationNode;
import com.google.android.datatransport.WinterFlowDeserializationPlatform;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowExceptionProcessor;
import com.google.android.datatransport.WinterFlowHandlerWebsocket;
import com.google.android.datatransport.WinterFlowHookInheritance;
import com.google.android.datatransport.WinterFlowMapperEngine;
import com.google.android.datatransport.WinterFlowObjectClass;
import com.google.android.datatransport.WinterFlowParserNode;
import com.google.android.datatransport.WinterFlowProcessorModule;
import com.google.android.datatransport.WinterFlowProcessorService;
import com.google.android.datatransport.WinterFlowQueueManager;
import com.google.android.datatransport.WinterFlowRendererTransaction;
import com.google.android.datatransport.WinterFlowResponseXML;
import com.google.android.datatransport.WinterFlowServiceProviderEngine;
import com.google.android.datatransport.WinterFlowSessionManagerProcess;
import com.google.android.datatransport.WinterFlowSingletonSessionManager;
import com.google.android.datatransport.WinterFlowUnitTestLibrary;
import com.google.android.datatransport.WinterFlowUnitTestSystem;
import com.google.android.datatransport.WinterFlowWorkerVersionControl;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxEvent {
    public static final Object WinterFlowResponseEngine = new Object();
    public static final WinterFlowUnitTestSystem WinterFlowTransactionAgent = new WinterFlowUnitTestSystem(0);
    public final WinterFlowDeserializationNode WinterFlowArrayNetwork;
    public final WinterFlowMapperEngine WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final WinterFlowHookInheritance WinterFlowRouterRouter;
    public final Context WinterFlowRouterStructure;
    public final WinterFlowRendererTransaction WinterFlowUnitTestResponse;
    public final AtomicBoolean WinterFlowVariableVersionControl = new AtomicBoolean(false);
    public final AtomicBoolean WinterFlowTransactionManagerStrategy = new AtomicBoolean();
    public final CopyOnWriteArrayList WinterFlowSyntax = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public WinterFlowSyntaxEvent(Context context, String str, WinterFlowMapperEngine winterFlowMapperEngine) {
        ?? arrayList;
        int i = 0;
        new CopyOnWriteArrayList();
        this.WinterFlowRouterStructure = context;
        WinterFlowUnitTestLibrary.WinterFlowBandwidthObject(str);
        this.WinterFlowHookDataSource = str;
        this.WinterFlowCacheManagerAgent = winterFlowMapperEngine;
        WinterFlowSingletonSessionManager winterFlowSingletonSessionManager = FirebaseInitProvider.WinterFlowVariableVersionControl;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new WinterFlowObjectClass(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        WinterFlowProcessorModule winterFlowProcessorModule = WinterFlowProcessorModule.WinterFlowVariableVersionControl;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new WinterFlowObjectClass(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new WinterFlowObjectClass(i2, new ExecutorsRegistrar()));
        arrayList4.add(WinterFlowQueueManager.WinterFlowHookDataSource(context, Context.class, new Class[0]));
        arrayList4.add(WinterFlowQueueManager.WinterFlowHookDataSource(this, WinterFlowSyntaxEvent.class, new Class[0]));
        arrayList4.add(WinterFlowQueueManager.WinterFlowHookDataSource(winterFlowMapperEngine, WinterFlowMapperEngine.class, new Class[0]));
        WinterFlowSessionManagerProcess winterFlowSessionManagerProcess = new WinterFlowSessionManagerProcess(29);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.WinterFlowTransactionManagerStrategy.get()) {
            arrayList4.add(WinterFlowQueueManager.WinterFlowHookDataSource(winterFlowSingletonSessionManager, WinterFlowSingletonSessionManager.class, new Class[0]));
        }
        WinterFlowProcessorModule winterFlowProcessorModule2 = WinterFlowProcessorModule.WinterFlowVariableVersionControl;
        WinterFlowDeserializationNode winterFlowDeserializationNode = new WinterFlowDeserializationNode();
        winterFlowDeserializationNode.WinterFlowVariableVersionControl = new HashMap();
        winterFlowDeserializationNode.WinterFlowTransactionManagerStrategy = new HashMap();
        winterFlowDeserializationNode.WinterFlowUnitTestResponse = new HashMap();
        winterFlowDeserializationNode.WinterFlowRouterRouter = new HashSet();
        winterFlowDeserializationNode.WinterFlowResponseEngine = new AtomicReference();
        WinterFlowProcessorService winterFlowProcessorService = new WinterFlowProcessorService();
        winterFlowDeserializationNode.WinterFlowSyntax = winterFlowProcessorService;
        winterFlowDeserializationNode.WinterFlowTransactionAgent = winterFlowSessionManagerProcess;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(WinterFlowQueueManager.WinterFlowHookDataSource(winterFlowProcessorService, WinterFlowProcessorService.class, WinterFlowExceptionProcessor.class, WinterFlowServiceProviderEngine.class));
        arrayList5.add(WinterFlowQueueManager.WinterFlowHookDataSource(winterFlowDeserializationNode, WinterFlowDeserializationNode.class, new Class[0]));
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList4.get(i3);
            i3++;
            WinterFlowQueueManager winterFlowQueueManager = (WinterFlowQueueManager) obj;
            if (winterFlowQueueManager != null) {
                arrayList5.add(winterFlowQueueManager);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList6.add(obj2);
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (winterFlowDeserializationNode) {
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((WinterFlowHookInheritance) it2.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((WinterFlowSessionManagerProcess) winterFlowDeserializationNode.WinterFlowTransactionAgent).WinterFlowServiceUtility(componentRegistrar));
                        it2.remove();
                    }
                } catch (WinterFlowControllerCache unused2) {
                    it2.remove();
                }
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object[] array = ((WinterFlowQueueManager) it3.next()).WinterFlowHookDataSource.toArray();
                int length = array.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        Object obj3 = array[i5];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) winterFlowDeserializationNode.WinterFlowRouterRouter).contains(obj3.toString())) {
                                it3.remove();
                                break;
                            }
                            ((HashSet) winterFlowDeserializationNode.WinterFlowRouterRouter).add(obj3.toString());
                        }
                        i5++;
                    }
                }
            }
            if (((HashMap) winterFlowDeserializationNode.WinterFlowVariableVersionControl).isEmpty()) {
                WinterFlowHandlerWebsocket.WinterFlowConcurrencyThread(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) winterFlowDeserializationNode.WinterFlowVariableVersionControl).keySet());
                arrayList8.addAll(arrayList5);
                WinterFlowHandlerWebsocket.WinterFlowConcurrencyThread(arrayList8);
            }
            int size3 = arrayList5.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                WinterFlowQueueManager winterFlowQueueManager2 = (WinterFlowQueueManager) obj4;
                ((HashMap) winterFlowDeserializationNode.WinterFlowVariableVersionControl).put(winterFlowQueueManager2, new WinterFlowRendererTransaction(new WinterFlowResponseXML(i, winterFlowDeserializationNode, winterFlowQueueManager2)));
            }
            arrayList7.addAll(winterFlowDeserializationNode.WinterFlowSyntax(arrayList5));
            arrayList7.addAll(winterFlowDeserializationNode.WinterFlowResponseEngine());
            winterFlowDeserializationNode.WinterFlowRouterRouter();
        }
        int size4 = arrayList7.size();
        while (i < size4) {
            Object obj5 = arrayList7.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) winterFlowDeserializationNode.WinterFlowResponseEngine).get();
        if (bool != null) {
            winterFlowDeserializationNode.WinterFlowUnitTestResponse((HashMap) winterFlowDeserializationNode.WinterFlowVariableVersionControl, bool.booleanValue());
        }
        this.WinterFlowArrayNetwork = winterFlowDeserializationNode;
        Trace.endSection();
        this.WinterFlowUnitTestResponse = new WinterFlowRendererTransaction(new WinterFlowResponseXML(2, this, context));
        this.WinterFlowRouterRouter = winterFlowDeserializationNode.WinterFlowArrayNetwork(WinterFlowDeserializationPlatform.class);
        WinterFlowParserNode winterFlowParserNode = new WinterFlowParserNode(this);
        WinterFlowRouterStructure();
        if (this.WinterFlowVariableVersionControl.get()) {
            WinterFlowConfigurationIDE.WinterFlowSyntax.WinterFlowVariableVersionControl.get();
        }
        this.WinterFlowSyntax.add(winterFlowParserNode);
        Trace.endSection();
    }

    public static WinterFlowSyntaxEvent WinterFlowHookDataSource() {
        WinterFlowSyntaxEvent winterFlowSyntaxEvent;
        synchronized (WinterFlowResponseEngine) {
            try {
                winterFlowSyntaxEvent = (WinterFlowSyntaxEvent) WinterFlowTransactionAgent.get("[DEFAULT]");
                if (winterFlowSyntaxEvent == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + WinterFlowWorkerVersionControl.WinterFlowTransactionManagerStrategy() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((WinterFlowDeserializationPlatform) winterFlowSyntaxEvent.WinterFlowRouterRouter.get()).WinterFlowHookDataSource();
            } catch (Throwable th) {
                throw th;
            }
        }
        return winterFlowSyntaxEvent;
    }

    public static WinterFlowSyntaxEvent WinterFlowVariableVersionControl(Context context, WinterFlowMapperEngine winterFlowMapperEngine) {
        WinterFlowSyntaxEvent winterFlowSyntaxEvent;
        AtomicReference atomicReference = WinterFlowClassInterface.WinterFlowRouterStructure;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = WinterFlowClassInterface.WinterFlowRouterStructure;
            if (atomicReference2.get() == null) {
                WinterFlowClassInterface winterFlowClassInterface = new WinterFlowClassInterface();
                while (true) {
                    if (atomicReference2.compareAndSet(null, winterFlowClassInterface)) {
                        WinterFlowConfigurationIDE.WinterFlowRouterStructure(application);
                        WinterFlowConfigurationIDE winterFlowConfigurationIDE = WinterFlowConfigurationIDE.WinterFlowSyntax;
                        winterFlowConfigurationIDE.getClass();
                        synchronized (winterFlowConfigurationIDE) {
                            winterFlowConfigurationIDE.WinterFlowUnitTestResponse.add(winterFlowClassInterface);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (WinterFlowResponseEngine) {
            WinterFlowUnitTestSystem winterFlowUnitTestSystem = WinterFlowTransactionAgent;
            String str = "FirebaseApp name [DEFAULT] already exists!";
            if (winterFlowUnitTestSystem.containsKey("[DEFAULT]")) {
                throw new IllegalStateException(str);
            }
            WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(context, "Application context cannot be null.");
            winterFlowSyntaxEvent = new WinterFlowSyntaxEvent(context, "[DEFAULT]", winterFlowMapperEngine);
            winterFlowUnitTestSystem.put("[DEFAULT]", winterFlowSyntaxEvent);
        }
        winterFlowSyntaxEvent.WinterFlowArrayNetwork();
        return winterFlowSyntaxEvent;
    }

    public final void WinterFlowArrayNetwork() {
        HashMap hashMap;
        if (!((UserManager) this.WinterFlowRouterStructure.getSystemService(UserManager.class)).isUserUnlocked()) {
            WinterFlowRouterStructure();
            Context context = this.WinterFlowRouterStructure;
            AtomicReference atomicReference = FirebaseApp$UserUnlockReceiver.WinterFlowHookDataSource;
            if (atomicReference.get() == null) {
                FirebaseApp$UserUnlockReceiver firebaseApp$UserUnlockReceiver = new FirebaseApp$UserUnlockReceiver(context);
                while (!atomicReference.compareAndSet(null, firebaseApp$UserUnlockReceiver)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(firebaseApp$UserUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        WinterFlowRouterStructure();
        WinterFlowDeserializationNode winterFlowDeserializationNode = this.WinterFlowArrayNetwork;
        WinterFlowRouterStructure();
        boolean equals = "[DEFAULT]".equals(this.WinterFlowHookDataSource);
        AtomicReference atomicReference2 = (AtomicReference) winterFlowDeserializationNode.WinterFlowResponseEngine;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (winterFlowDeserializationNode) {
                    hashMap = new HashMap((HashMap) winterFlowDeserializationNode.WinterFlowVariableVersionControl);
                }
                winterFlowDeserializationNode.WinterFlowUnitTestResponse(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((WinterFlowDeserializationPlatform) this.WinterFlowRouterRouter.get()).WinterFlowHookDataSource();
    }

    public final String WinterFlowCacheManagerAgent() {
        StringBuilder sb = new StringBuilder();
        WinterFlowRouterStructure();
        byte[] bytes = this.WinterFlowHookDataSource.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        WinterFlowRouterStructure();
        byte[] bytes2 = this.WinterFlowCacheManagerAgent.WinterFlowHookDataSource.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void WinterFlowRouterStructure() {
        if (this.WinterFlowTransactionManagerStrategy.get()) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("FirebaseApp was deleted");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowSyntaxEvent)) {
            return false;
        }
        WinterFlowSyntaxEvent winterFlowSyntaxEvent = (WinterFlowSyntaxEvent) obj;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        return this.WinterFlowHookDataSource.equals(winterFlowSyntaxEvent.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode();
    }

    public final String toString() {
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = new WinterFlowAlgorithmArray((Object) this);
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowHookDataSource, "name");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowCacheManagerAgent, "options");
        return winterFlowAlgorithmArray.toString();
    }
}
