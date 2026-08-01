package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.datatransport.WinterFlowAdapterLayer;
import com.google.android.datatransport.WinterFlowAlgorithmPlatform;
import com.google.android.datatransport.WinterFlowBandwidthComponent;
import com.google.android.datatransport.WinterFlowBandwidthRefactoring;
import com.google.android.datatransport.WinterFlowClassComponent;
import com.google.android.datatransport.WinterFlowConcurrencyProcess;
import com.google.android.datatransport.WinterFlowDebugDatabaseSchema;
import com.google.android.datatransport.WinterFlowDeserializationDebug;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowGatewayHandler;
import com.google.android.datatransport.WinterFlowHandlerFunction;
import com.google.android.datatransport.WinterFlowJSONDecorator;
import com.google.android.datatransport.WinterFlowJSONHelper;
import com.google.android.datatransport.WinterFlowListenerEvent;
import com.google.android.datatransport.WinterFlowManagerProcess;
import com.google.android.datatransport.WinterFlowNodeSerializer;
import com.google.android.datatransport.WinterFlowObjectRenderer;
import com.google.android.datatransport.WinterFlowProcessorAdapter;
import com.google.android.datatransport.WinterFlowProxyProtocol;
import com.google.android.datatransport.WinterFlowSchedulerParser;
import com.google.android.datatransport.WinterFlowSingletonQuery;
import com.google.android.datatransport.WinterFlowThreadPoolSubsystem;
import com.google.android.datatransport.WinterFlowTransactionWorker;
import com.google.android.datatransport.WinterFlowUnitTestLibrary;
import com.google.android.datatransport.WinterFlowVariableNetwork;
import com.google.android.datatransport.WinterFlowWidgetComponent;
import com.google.android.datatransport.WinterFlowWidgetDebug;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSyntaxEvent {
    public static final WinterFlowDebugDatabaseSchema[] WinterFlowConsumerUserManager = new WinterFlowDebugDatabaseSchema[0];
    public final WinterFlowTransactionWorker WinterFlowArrayNetwork;
    public final WinterFlowConcurrencyProcess WinterFlowBandwidthObject;
    public ConnectionResult WinterFlowBatchUI;
    public final Context WinterFlowCacheManagerAgent;
    public final String WinterFlowConcurrencyThread;
    public WinterFlowSingletonQuery WinterFlowHookDataSource;
    public final AtomicInteger WinterFlowMapperProtocol;
    public final int WinterFlowOrchestrationSubsystem;
    public final Set WinterFlowResolverController;
    public IInterface WinterFlowResponseEngine;
    public boolean WinterFlowRouterAdapter;
    public WinterFlowProxyProtocol WinterFlowRouterRouter;
    public volatile String WinterFlowRouterStructure;
    public volatile WinterFlowListenerEvent WinterFlowSerializerStructure;
    public WinterFlowObjectRenderer WinterFlowServerProtocol;
    public final WinterFlowNodeSerializer WinterFlowServiceUtility;
    public volatile String WinterFlowSingletonPlatform;
    public WinterFlowGatewayHandler WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public final ArrayList WinterFlowTransactionAgent;
    public final Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public volatile WinterFlowJSONDecorator WinterFlowVariableBandwidth;
    public final WinterFlowVariableNetwork WinterFlowVariableVersionControl;

    public WinterFlowSyntaxEvent(Context context, Looper looper, int i, WinterFlowSchedulerParser winterFlowSchedulerParser, WinterFlowAlgorithmPlatform winterFlowAlgorithmPlatform, WinterFlowJSONHelper winterFlowJSONHelper) {
        WinterFlowTransactionWorker winterFlowTransactionWorker;
        synchronized (WinterFlowTransactionWorker.WinterFlowUnitTestResponse) {
            try {
                winterFlowTransactionWorker = WinterFlowTransactionWorker.WinterFlowRouterRouter;
                if (winterFlowTransactionWorker == null) {
                    winterFlowTransactionWorker = new WinterFlowTransactionWorker(context.getApplicationContext(), context.getMainLooper());
                    WinterFlowTransactionWorker.WinterFlowRouterRouter = winterFlowTransactionWorker;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object obj = WinterFlowWidgetDebug.WinterFlowCacheManagerAgent;
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(winterFlowAlgorithmPlatform);
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(winterFlowJSONHelper);
        WinterFlowNodeSerializer winterFlowNodeSerializer = new WinterFlowNodeSerializer(winterFlowAlgorithmPlatform);
        WinterFlowConcurrencyProcess winterFlowConcurrencyProcess = new WinterFlowConcurrencyProcess(winterFlowJSONHelper);
        String str = (String) winterFlowSchedulerParser.WinterFlowVariableVersionControl;
        this.WinterFlowRouterStructure = null;
        this.WinterFlowTransactionManagerStrategy = new Object();
        this.WinterFlowUnitTestResponse = new Object();
        this.WinterFlowTransactionAgent = new ArrayList();
        this.WinterFlowThreadListener = 1;
        this.WinterFlowBatchUI = null;
        this.WinterFlowRouterAdapter = false;
        this.WinterFlowSerializerStructure = null;
        this.WinterFlowMapperProtocol = new AtomicInteger(0);
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(context, "Context must not be null");
        this.WinterFlowCacheManagerAgent = context;
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(looper, "Looper must not be null");
        this.WinterFlowArrayNetwork = winterFlowTransactionWorker;
        this.WinterFlowVariableVersionControl = new WinterFlowVariableNetwork(this, looper);
        this.WinterFlowOrchestrationSubsystem = i;
        this.WinterFlowServiceUtility = winterFlowNodeSerializer;
        this.WinterFlowBandwidthObject = winterFlowConcurrencyProcess;
        this.WinterFlowConcurrencyThread = str;
        Set set = (Set) winterFlowSchedulerParser.WinterFlowArrayNetwork;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.WinterFlowResolverController = set;
    }

    public WinterFlowDebugDatabaseSchema[] WinterFlowArrayNetwork() {
        return WinterFlowConsumerUserManager;
    }

    public final /* synthetic */ boolean WinterFlowBandwidthObject(int i, int i2, IInterface iInterface) {
        synchronized (this.WinterFlowTransactionManagerStrategy) {
            try {
                if (this.WinterFlowThreadListener != i) {
                    return false;
                }
                WinterFlowOrchestrationSubsystem(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void WinterFlowCacheManagerAgent(String str) {
        this.WinterFlowRouterStructure = str;
        WinterFlowHookDataSource();
    }

    public final void WinterFlowHookDataSource() {
        this.WinterFlowMapperProtocol.incrementAndGet();
        ArrayList arrayList = this.WinterFlowTransactionAgent;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    WinterFlowProcessorAdapter winterFlowProcessorAdapter = (WinterFlowProcessorAdapter) arrayList.get(i);
                    synchronized (winterFlowProcessorAdapter) {
                        winterFlowProcessorAdapter.WinterFlowRouterStructure = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.WinterFlowUnitTestResponse) {
            this.WinterFlowRouterRouter = null;
        }
        WinterFlowOrchestrationSubsystem(1, null);
    }

    public final void WinterFlowOrchestrationSubsystem(int i, IInterface iInterface) {
        WinterFlowSingletonQuery winterFlowSingletonQuery;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.WinterFlowTransactionManagerStrategy) {
            try {
                this.WinterFlowThreadListener = i;
                this.WinterFlowResponseEngine = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    WinterFlowObjectRenderer winterFlowObjectRenderer = this.WinterFlowServerProtocol;
                    if (winterFlowObjectRenderer != null) {
                        WinterFlowTransactionWorker winterFlowTransactionWorker = this.WinterFlowArrayNetwork;
                        String str = (String) this.WinterFlowHookDataSource.WinterFlowVariableVersionControl;
                        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(str);
                        this.WinterFlowHookDataSource.getClass();
                        if (this.WinterFlowConcurrencyThread == null) {
                            this.WinterFlowCacheManagerAgent.getClass();
                        }
                        winterFlowTransactionWorker.WinterFlowHookDataSource(str, winterFlowObjectRenderer, this.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy);
                        this.WinterFlowServerProtocol = null;
                    }
                } else if (i == 2 || i == 3) {
                    WinterFlowObjectRenderer winterFlowObjectRenderer2 = this.WinterFlowServerProtocol;
                    if (winterFlowObjectRenderer2 != null && (winterFlowSingletonQuery = this.WinterFlowHookDataSource) != null) {
                        new StringBuilder(String.valueOf((String) winterFlowSingletonQuery.WinterFlowVariableVersionControl).length() + 70 + "com.google.android.gms".length());
                        WinterFlowTransactionWorker winterFlowTransactionWorker2 = this.WinterFlowArrayNetwork;
                        String str2 = (String) this.WinterFlowHookDataSource.WinterFlowVariableVersionControl;
                        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(str2);
                        this.WinterFlowHookDataSource.getClass();
                        if (this.WinterFlowConcurrencyThread == null) {
                            this.WinterFlowCacheManagerAgent.getClass();
                        }
                        winterFlowTransactionWorker2.WinterFlowHookDataSource(str2, winterFlowObjectRenderer2, this.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy);
                        this.WinterFlowMapperProtocol.incrementAndGet();
                    }
                    WinterFlowObjectRenderer winterFlowObjectRenderer3 = new WinterFlowObjectRenderer(this, this.WinterFlowMapperProtocol.get());
                    this.WinterFlowServerProtocol = winterFlowObjectRenderer3;
                    String WinterFlowResponseEngine = WinterFlowResponseEngine();
                    boolean WinterFlowTransactionAgent = WinterFlowTransactionAgent();
                    this.WinterFlowHookDataSource = new WinterFlowSingletonQuery((Object) WinterFlowResponseEngine, WinterFlowTransactionAgent);
                    if (WinterFlowTransactionAgent && WinterFlowTransactionManagerStrategy() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.WinterFlowHookDataSource.WinterFlowVariableVersionControl)));
                    }
                    WinterFlowTransactionWorker winterFlowTransactionWorker3 = this.WinterFlowArrayNetwork;
                    String str3 = (String) this.WinterFlowHookDataSource.WinterFlowVariableVersionControl;
                    WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(str3);
                    this.WinterFlowHookDataSource.getClass();
                    String str4 = this.WinterFlowConcurrencyThread;
                    if (str4 == null) {
                        str4 = this.WinterFlowCacheManagerAgent.getClass().getName();
                    }
                    ConnectionResult WinterFlowRouterStructure = winterFlowTransactionWorker3.WinterFlowRouterStructure(new WinterFlowHandlerFunction(str3, this.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy), winterFlowObjectRenderer3, str4);
                    if (!(WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy == 0)) {
                        new StringBuilder(String.valueOf((String) this.WinterFlowHookDataSource.WinterFlowVariableVersionControl).length() + 34 + "com.google.android.gms".length());
                        int i2 = WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (WinterFlowRouterStructure.WinterFlowUnitTestResponse != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", WinterFlowRouterStructure.WinterFlowUnitTestResponse);
                        }
                        int i3 = this.WinterFlowMapperProtocol.get();
                        WinterFlowWidgetComponent winterFlowWidgetComponent = new WinterFlowWidgetComponent(this, i2, bundle);
                        WinterFlowVariableNetwork winterFlowVariableNetwork = this.WinterFlowVariableVersionControl;
                        winterFlowVariableNetwork.sendMessage(winterFlowVariableNetwork.obtainMessage(7, i3, -1, winterFlowWidgetComponent));
                    }
                } else if (i == 4) {
                    WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public abstract String WinterFlowResponseEngine();

    public final IInterface WinterFlowRouterRouter() {
        IInterface iInterface;
        synchronized (this.WinterFlowTransactionManagerStrategy) {
            try {
                if (this.WinterFlowThreadListener == 5) {
                    throw new DeadObjectException();
                }
                if (!WinterFlowServerProtocol()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.WinterFlowResponseEngine;
                WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract IInterface WinterFlowRouterStructure(IBinder iBinder);

    public final boolean WinterFlowServerProtocol() {
        boolean z;
        synchronized (this.WinterFlowTransactionManagerStrategy) {
            z = this.WinterFlowThreadListener == 4;
        }
        return z;
    }

    public boolean WinterFlowServiceUtility() {
        return false;
    }

    public abstract String WinterFlowSyntax();

    public final boolean WinterFlowThreadListener() {
        boolean z;
        synchronized (this.WinterFlowTransactionManagerStrategy) {
            int i = this.WinterFlowThreadListener;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean WinterFlowTransactionAgent() {
        return WinterFlowTransactionManagerStrategy() >= 211700000;
    }

    public abstract int WinterFlowTransactionManagerStrategy();

    public final void WinterFlowUnitTestResponse(WinterFlowBandwidthRefactoring winterFlowBandwidthRefactoring, Set set) {
        String attributionTag;
        String attributionTag2;
        Bundle WinterFlowVariableVersionControl = WinterFlowVariableVersionControl();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.WinterFlowSingletonPlatform;
        } else if (this.WinterFlowVariableBandwidth == null) {
            attributionTag2 = this.WinterFlowSingletonPlatform;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.WinterFlowVariableBandwidth.WinterFlowTransactionManagerStrategy;
            if (attributionSource == null) {
                attributionTag2 = this.WinterFlowSingletonPlatform;
            } else {
                attributionTag = attributionSource.getAttributionTag();
                attributionTag2 = attributionTag == null ? this.WinterFlowSingletonPlatform : attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag2;
        int i = this.WinterFlowOrchestrationSubsystem;
        int i2 = WinterFlowClassComponent.WinterFlowRouterStructure;
        Scope[] scopeArr = WinterFlowManagerProcess.WinterFlowVariableBandwidth;
        Bundle bundle = new Bundle();
        WinterFlowDebugDatabaseSchema[] winterFlowDebugDatabaseSchemaArr = WinterFlowManagerProcess.WinterFlowBatchUI;
        WinterFlowManagerProcess winterFlowManagerProcess = new WinterFlowManagerProcess(6, i, i2, null, null, scopeArr, bundle, null, winterFlowDebugDatabaseSchemaArr, winterFlowDebugDatabaseSchemaArr, true, 0, false, str);
        winterFlowManagerProcess.WinterFlowRouterRouter = this.WinterFlowCacheManagerAgent.getPackageName();
        winterFlowManagerProcess.WinterFlowTransactionAgent = WinterFlowVariableVersionControl;
        if (set != null) {
            winterFlowManagerProcess.WinterFlowResponseEngine = (Scope[]) set.toArray(new Scope[0]);
        }
        if (WinterFlowServiceUtility()) {
            winterFlowManagerProcess.WinterFlowServerProtocol = new Account("<<default account>>", "com.google");
            if (winterFlowBandwidthRefactoring != null) {
                winterFlowManagerProcess.WinterFlowSyntax = ((WinterFlowBandwidthComponent) winterFlowBandwidthRefactoring).WinterFlowCacheManagerAgent;
            }
        }
        winterFlowManagerProcess.WinterFlowThreadListener = WinterFlowConsumerUserManager;
        winterFlowManagerProcess.WinterFlowServiceUtility = WinterFlowArrayNetwork();
        if (this instanceof WinterFlowDeserializationDebug) {
            winterFlowManagerProcess.WinterFlowConcurrencyThread = true;
        }
        try {
            try {
                synchronized (this.WinterFlowUnitTestResponse) {
                    try {
                        WinterFlowProxyProtocol winterFlowProxyProtocol = this.WinterFlowRouterRouter;
                        if (winterFlowProxyProtocol != null) {
                            winterFlowProxyProtocol.WinterFlowRouterStructure(new WinterFlowAdapterLayer(this, this.WinterFlowMapperProtocol.get()), winterFlowManagerProcess);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i3 = this.WinterFlowMapperProtocol.get();
                WinterFlowThreadPoolSubsystem winterFlowThreadPoolSubsystem = new WinterFlowThreadPoolSubsystem(this, 8, null, null);
                WinterFlowVariableNetwork winterFlowVariableNetwork = this.WinterFlowVariableVersionControl;
                winterFlowVariableNetwork.sendMessage(winterFlowVariableNetwork.obtainMessage(1, i3, -1, winterFlowThreadPoolSubsystem));
            }
        } catch (DeadObjectException unused2) {
            int i4 = this.WinterFlowMapperProtocol.get();
            WinterFlowVariableNetwork winterFlowVariableNetwork2 = this.WinterFlowVariableVersionControl;
            winterFlowVariableNetwork2.sendMessage(winterFlowVariableNetwork2.obtainMessage(6, i4, 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    public Bundle WinterFlowVariableVersionControl() {
        return new Bundle();
    }
}
