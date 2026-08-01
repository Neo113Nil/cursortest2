package com.google.android.datatransport;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheTransactionManager implements WinterFlowAlgorithmPlatform, WinterFlowJSONHelper {
    public final com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowArrayNetwork;
    public final /* synthetic */ WinterFlowTransactionManagerStack WinterFlowBandwidthObject;
    public final WinterFlowManagerStructure WinterFlowResponseEngine;
    public final int WinterFlowSyntax;
    public boolean WinterFlowTransactionAgent;
    public final WinterFlowCacheManagerVersionControl WinterFlowTransactionManagerStrategy;
    public final WinterFlowRepositoryBandwidth WinterFlowVariableVersionControl;
    public final LinkedList WinterFlowCacheManagerAgent = new LinkedList();
    public final HashSet WinterFlowUnitTestResponse = new HashSet();
    public final HashMap WinterFlowRouterRouter = new HashMap();
    public final ArrayList WinterFlowServerProtocol = new ArrayList();
    public ConnectionResult WinterFlowThreadListener = null;
    public int WinterFlowServiceUtility = 0;

    public WinterFlowCacheTransactionManager(WinterFlowTransactionManagerStack winterFlowTransactionManagerStack, WinterFlowConsumerStrategy winterFlowConsumerStrategy) {
        this.WinterFlowBandwidthObject = winterFlowTransactionManagerStack;
        Looper looper = winterFlowTransactionManagerStack.WinterFlowThreadListener.getLooper();
        WinterFlowObjectPackage WinterFlowRouterStructure = winterFlowConsumerStrategy.WinterFlowRouterStructure();
        WinterFlowSchedulerParser winterFlowSchedulerParser = new WinterFlowSchedulerParser((WinterFlowRepositoryDatabase) WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy, (String) WinterFlowRouterStructure.WinterFlowUnitTestResponse, (String) WinterFlowRouterStructure.WinterFlowRouterRouter);
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowSyntax = ((WinterFlowEncryptionSubsystem) winterFlowConsumerStrategy.WinterFlowArrayNetwork.WinterFlowTransactionManagerStrategy).WinterFlowSyntax(winterFlowConsumerStrategy.WinterFlowRouterStructure, looper, winterFlowSchedulerParser, winterFlowConsumerStrategy.WinterFlowVariableVersionControl, this, this);
        WinterFlowJSONDecorator winterFlowJSONDecorator = winterFlowConsumerStrategy.WinterFlowCacheManagerAgent;
        if (winterFlowJSONDecorator == null || !(WinterFlowSyntax instanceof com.google.android.gms.common.internal.WinterFlowSyntaxEvent)) {
            String str = winterFlowConsumerStrategy.WinterFlowHookDataSource;
            if (str != null && (WinterFlowSyntax instanceof com.google.android.gms.common.internal.WinterFlowSyntaxEvent)) {
                WinterFlowSyntax.WinterFlowSingletonPlatform = str;
            }
        } else {
            WinterFlowSyntax.WinterFlowVariableBandwidth = winterFlowJSONDecorator;
        }
        this.WinterFlowArrayNetwork = WinterFlowSyntax;
        this.WinterFlowVariableVersionControl = winterFlowConsumerStrategy.WinterFlowTransactionManagerStrategy;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowCacheManagerVersionControl(8);
        this.WinterFlowSyntax = winterFlowConsumerStrategy.WinterFlowUnitTestResponse;
        if (!WinterFlowSyntax.WinterFlowServiceUtility()) {
            this.WinterFlowResponseEngine = null;
            return;
        }
        Context context = winterFlowTransactionManagerStack.WinterFlowVariableVersionControl;
        WinterFlowWidgetInterface winterFlowWidgetInterface = winterFlowTransactionManagerStack.WinterFlowThreadListener;
        WinterFlowObjectPackage WinterFlowRouterStructure2 = winterFlowConsumerStrategy.WinterFlowRouterStructure();
        this.WinterFlowResponseEngine = new WinterFlowManagerStructure(context, winterFlowWidgetInterface, new WinterFlowSchedulerParser((WinterFlowRepositoryDatabase) WinterFlowRouterStructure2.WinterFlowTransactionManagerStrategy, (String) WinterFlowRouterStructure2.WinterFlowUnitTestResponse, (String) WinterFlowRouterStructure2.WinterFlowRouterRouter));
    }

    @Override // com.google.android.datatransport.WinterFlowJSONHelper
    public final void WinterFlowArrayNetwork(ConnectionResult connectionResult) {
        WinterFlowServiceUtility(connectionResult, null);
    }

    public final void WinterFlowBandwidthObject(WinterFlowDatabaseResponse winterFlowDatabaseResponse) {
        WinterFlowUnitTestLibrary.WinterFlowServiceUtility(this.WinterFlowBandwidthObject.WinterFlowThreadListener);
        boolean WinterFlowServerProtocol = this.WinterFlowArrayNetwork.WinterFlowServerProtocol();
        LinkedList linkedList = this.WinterFlowCacheManagerAgent;
        if (WinterFlowServerProtocol) {
            if (WinterFlowRouterRouter(winterFlowDatabaseResponse)) {
                WinterFlowTransactionAgent();
                return;
            } else {
                linkedList.add(winterFlowDatabaseResponse);
                return;
            }
        }
        linkedList.add(winterFlowDatabaseResponse);
        ConnectionResult connectionResult = this.WinterFlowThreadListener;
        if (connectionResult == null || connectionResult.WinterFlowTransactionManagerStrategy == 0 || connectionResult.WinterFlowUnitTestResponse == null) {
            WinterFlowConcurrencyThread();
        } else {
            WinterFlowServiceUtility(connectionResult, null);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmPlatform
    public final void WinterFlowCacheManagerAgent() {
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowBandwidthObject;
        if (Looper.myLooper() == winterFlowTransactionManagerStack.WinterFlowThreadListener.getLooper()) {
            WinterFlowHookDataSource();
        } else {
            winterFlowTransactionManagerStack.WinterFlowThreadListener.post(new WinterFlowDeploymentSystem(10, this));
        }
    }

    public final void WinterFlowConcurrencyThread() {
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowBandwidthObject;
        WinterFlowUnitTestLibrary.WinterFlowServiceUtility(winterFlowTransactionManagerStack.WinterFlowThreadListener);
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowArrayNetwork;
        if (winterFlowSyntaxEvent.WinterFlowServerProtocol() || winterFlowSyntaxEvent.WinterFlowThreadListener()) {
            return;
        }
        try {
            int WinterFlowCacheManagerAgent = winterFlowTransactionManagerStack.WinterFlowUnitTestResponse.WinterFlowCacheManagerAgent(winterFlowTransactionManagerStack.WinterFlowVariableVersionControl, winterFlowSyntaxEvent);
            if (WinterFlowCacheManagerAgent != 0) {
                ConnectionResult connectionResult = new ConnectionResult(WinterFlowCacheManagerAgent, null, null);
                new StringBuilder(winterFlowSyntaxEvent.getClass().getName().length() + 35 + connectionResult.toString().length());
                WinterFlowServiceUtility(connectionResult, null);
                return;
            }
            WinterFlowConfiguration winterFlowConfiguration = new WinterFlowConfiguration(winterFlowTransactionManagerStack, winterFlowSyntaxEvent, this.WinterFlowVariableVersionControl);
            if (winterFlowSyntaxEvent.WinterFlowServiceUtility()) {
                WinterFlowManagerStructure winterFlowManagerStructure = this.WinterFlowResponseEngine;
                WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(winterFlowManagerStructure);
                WinterFlowFrameworkLibrary winterFlowFrameworkLibrary = winterFlowManagerStructure.WinterFlowSyntax;
                if (winterFlowFrameworkLibrary != null) {
                    winterFlowFrameworkLibrary.WinterFlowHookDataSource();
                }
                WinterFlowSchedulerParser winterFlowSchedulerParser = winterFlowManagerStructure.WinterFlowRouterRouter;
                winterFlowSchedulerParser.WinterFlowHookDataSource = Integer.valueOf(System.identityHashCode(winterFlowManagerStructure));
                WinterFlowMiddlewareInterface winterFlowMiddlewareInterface = winterFlowManagerStructure.WinterFlowTransactionManagerStrategy;
                Context context = winterFlowManagerStructure.WinterFlowArrayNetwork;
                Handler handler = winterFlowManagerStructure.WinterFlowVariableVersionControl;
                winterFlowManagerStructure.WinterFlowSyntax = (WinterFlowFrameworkLibrary) winterFlowMiddlewareInterface.WinterFlowSyntax(context, handler.getLooper(), winterFlowSchedulerParser, (WinterFlowProtocolUserManager) winterFlowSchedulerParser.WinterFlowTransactionManagerStrategy, winterFlowManagerStructure, winterFlowManagerStructure);
                winterFlowManagerStructure.WinterFlowResponseEngine = winterFlowConfiguration;
                Set set = winterFlowManagerStructure.WinterFlowUnitTestResponse;
                if (set == null || set.isEmpty()) {
                    handler.post(new WinterFlowDeploymentSystem(winterFlowManagerStructure));
                } else {
                    WinterFlowFrameworkLibrary winterFlowFrameworkLibrary2 = winterFlowManagerStructure.WinterFlowSyntax;
                    winterFlowFrameworkLibrary2.getClass();
                    winterFlowFrameworkLibrary2.WinterFlowSyntax = new WinterFlowConfigurationModule(winterFlowFrameworkLibrary2);
                    winterFlowFrameworkLibrary2.WinterFlowOrchestrationSubsystem(2, null);
                }
            }
            try {
                winterFlowSyntaxEvent.WinterFlowSyntax = winterFlowConfiguration;
                winterFlowSyntaxEvent.WinterFlowOrchestrationSubsystem(2, null);
            } catch (SecurityException e) {
                WinterFlowServiceUtility(new ConnectionResult(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            WinterFlowServiceUtility(new ConnectionResult(10, null, null), e2);
        }
    }

    public final void WinterFlowHookDataSource() {
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowBandwidthObject;
        WinterFlowUnitTestLibrary.WinterFlowServiceUtility(winterFlowTransactionManagerStack.WinterFlowThreadListener);
        this.WinterFlowThreadListener = null;
        WinterFlowServerProtocol(ConnectionResult.WinterFlowResponseEngine);
        if (this.WinterFlowTransactionAgent) {
            WinterFlowWidgetInterface winterFlowWidgetInterface = winterFlowTransactionManagerStack.WinterFlowThreadListener;
            WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth = this.WinterFlowVariableVersionControl;
            winterFlowWidgetInterface.removeMessages(11, winterFlowRepositoryBandwidth);
            winterFlowTransactionManagerStack.WinterFlowThreadListener.removeMessages(9, winterFlowRepositoryBandwidth);
            this.WinterFlowTransactionAgent = false;
        }
        Iterator it = this.WinterFlowRouterRouter.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
        } else {
            WinterFlowUnitTestResponse();
            WinterFlowTransactionAgent();
        }
    }

    public final void WinterFlowOrchestrationSubsystem() {
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowBandwidthObject;
        WinterFlowUnitTestLibrary.WinterFlowServiceUtility(winterFlowTransactionManagerStack.WinterFlowThreadListener);
        Status status = WinterFlowTransactionManagerStack.WinterFlowBandwidthObject;
        WinterFlowResponseEngine(status);
        this.WinterFlowTransactionManagerStrategy.WinterFlowSyntax(false, status);
        for (WinterFlowUnitTestListener winterFlowUnitTestListener : (WinterFlowUnitTestListener[]) this.WinterFlowRouterRouter.keySet().toArray(new WinterFlowUnitTestListener[0])) {
            WinterFlowBandwidthObject(new WinterFlowServerException(new WinterFlowArrayEngine()));
        }
        WinterFlowServerProtocol(new ConnectionResult(4, null, null));
        if (this.WinterFlowArrayNetwork.WinterFlowServerProtocol()) {
            winterFlowTransactionManagerStack.WinterFlowThreadListener.post(new WinterFlowDeploymentSystem(11, new WinterFlowConcurrencyProcess(this)));
        }
    }

    public final void WinterFlowResponseEngine(Status status) {
        WinterFlowUnitTestLibrary.WinterFlowServiceUtility(this.WinterFlowBandwidthObject.WinterFlowThreadListener);
        WinterFlowSyntax(status, null, false);
    }

    public final boolean WinterFlowRouterRouter(WinterFlowDatabaseResponse winterFlowDatabaseResponse) {
        if (winterFlowDatabaseResponse == null) {
            WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = this.WinterFlowTransactionManagerStrategy;
            com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowArrayNetwork;
            winterFlowDatabaseResponse.WinterFlowTransactionManagerStrategy(winterFlowCacheManagerVersionControl, winterFlowSyntaxEvent.WinterFlowServiceUtility());
            try {
                winterFlowDatabaseResponse.WinterFlowUnitTestResponse(this);
                return true;
            } catch (DeadObjectException unused) {
                WinterFlowRouterStructure(1);
                winterFlowSyntaxEvent.WinterFlowCacheManagerAgent("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        WinterFlowDebugDatabaseSchema[] WinterFlowRouterStructure = winterFlowDatabaseResponse.WinterFlowRouterStructure(this);
        WinterFlowDebugDatabaseSchema winterFlowDebugDatabaseSchema = null;
        if (WinterFlowRouterStructure != null && WinterFlowRouterStructure.length != 0) {
            WinterFlowListenerEvent winterFlowListenerEvent = this.WinterFlowArrayNetwork.WinterFlowSerializerStructure;
            WinterFlowDebugDatabaseSchema[] winterFlowDebugDatabaseSchemaArr = winterFlowListenerEvent == null ? null : winterFlowListenerEvent.WinterFlowTransactionManagerStrategy;
            if (winterFlowDebugDatabaseSchemaArr == null) {
                winterFlowDebugDatabaseSchemaArr = new WinterFlowDebugDatabaseSchema[0];
            }
            WinterFlowUnitTestSystem winterFlowUnitTestSystem = new WinterFlowUnitTestSystem(winterFlowDebugDatabaseSchemaArr.length);
            for (WinterFlowDebugDatabaseSchema winterFlowDebugDatabaseSchema2 : winterFlowDebugDatabaseSchemaArr) {
                winterFlowUnitTestSystem.put(winterFlowDebugDatabaseSchema2.WinterFlowVariableVersionControl, Long.valueOf(winterFlowDebugDatabaseSchema2.WinterFlowRouterStructure()));
            }
            for (WinterFlowDebugDatabaseSchema winterFlowDebugDatabaseSchema3 : WinterFlowRouterStructure) {
                Long l = (Long) winterFlowUnitTestSystem.get(winterFlowDebugDatabaseSchema3.WinterFlowVariableVersionControl);
                if (l == null || l.longValue() < winterFlowDebugDatabaseSchema3.WinterFlowRouterStructure()) {
                    winterFlowDebugDatabaseSchema = winterFlowDebugDatabaseSchema3;
                    break;
                }
            }
        }
        if (winterFlowDebugDatabaseSchema == null) {
            WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl2 = this.WinterFlowTransactionManagerStrategy;
            com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = this.WinterFlowArrayNetwork;
            winterFlowDatabaseResponse.WinterFlowTransactionManagerStrategy(winterFlowCacheManagerVersionControl2, winterFlowSyntaxEvent2.WinterFlowServiceUtility());
            try {
                winterFlowDatabaseResponse.WinterFlowUnitTestResponse(this);
                return true;
            } catch (DeadObjectException unused2) {
                WinterFlowRouterStructure(1);
                winterFlowSyntaxEvent2.WinterFlowCacheManagerAgent("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        new StringBuilder(this.WinterFlowArrayNetwork.getClass().getName().length() + 53 + String.valueOf(winterFlowDebugDatabaseSchema.WinterFlowVariableVersionControl).length() + 2 + String.valueOf(winterFlowDebugDatabaseSchema.WinterFlowRouterStructure()).length() + 2);
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowBandwidthObject;
        if (!winterFlowTransactionManagerStack.WinterFlowServiceUtility || !winterFlowDatabaseResponse.WinterFlowHookDataSource(this)) {
            winterFlowDatabaseResponse.WinterFlowVariableVersionControl(new WinterFlowDatabaseFrontend(winterFlowDebugDatabaseSchema));
            return true;
        }
        int WinterFlowCacheManagerAgent = winterFlowDatabaseResponse.WinterFlowCacheManagerAgent(this);
        WinterFlowCloudHelper winterFlowCloudHelper = new WinterFlowCloudHelper(this.WinterFlowVariableVersionControl, winterFlowDebugDatabaseSchema);
        ArrayList arrayList = this.WinterFlowServerProtocol;
        int indexOf = arrayList.indexOf(winterFlowCloudHelper);
        if (indexOf >= 0) {
            WinterFlowCloudHelper winterFlowCloudHelper2 = (WinterFlowCloudHelper) arrayList.get(indexOf);
            winterFlowTransactionManagerStack.WinterFlowThreadListener.removeMessages(15, winterFlowCloudHelper2);
            winterFlowTransactionManagerStack.WinterFlowThreadListener.sendMessageDelayed(Message.obtain(winterFlowTransactionManagerStack.WinterFlowThreadListener, 15, winterFlowCloudHelper2), 5000L);
            return false;
        }
        arrayList.add(winterFlowCloudHelper);
        winterFlowTransactionManagerStack.WinterFlowThreadListener.sendMessageDelayed(Message.obtain(winterFlowTransactionManagerStack.WinterFlowThreadListener, 15, winterFlowCloudHelper), 5000L);
        winterFlowTransactionManagerStack.WinterFlowThreadListener.sendMessageDelayed(Message.obtain(winterFlowTransactionManagerStack.WinterFlowThreadListener, 16, winterFlowCloudHelper), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(WinterFlowCacheManagerAgent));
        if (WinterFlowTransactionManagerStrategy(connectionResult)) {
            new StringBuilder(String.valueOf(winterFlowDebugDatabaseSchema.WinterFlowVariableVersionControl).length() + 61 + String.valueOf(winterFlowDebugDatabaseSchema.WinterFlowRouterStructure()).length());
            return false;
        }
        if (winterFlowTransactionManagerStack.WinterFlowVariableVersionControl(connectionResult, this.WinterFlowSyntax)) {
            new StringBuilder(String.valueOf(winterFlowDebugDatabaseSchema.WinterFlowVariableVersionControl).length() + 55 + String.valueOf(winterFlowDebugDatabaseSchema.WinterFlowRouterStructure()).length());
        }
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmPlatform
    public final void WinterFlowRouterStructure(int i) {
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowBandwidthObject;
        if (Looper.myLooper() == winterFlowTransactionManagerStack.WinterFlowThreadListener.getLooper()) {
            WinterFlowVariableVersionControl(i);
        } else {
            winterFlowTransactionManagerStack.WinterFlowThreadListener.post(new WinterFlowSessionThreadPool(i, 2, this));
        }
    }

    public final void WinterFlowServerProtocol(ConnectionResult connectionResult) {
        HashSet hashSet = this.WinterFlowUnitTestResponse;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            return;
        }
        if (WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(connectionResult, ConnectionResult.WinterFlowResponseEngine)) {
            com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowArrayNetwork;
            if (!winterFlowSyntaxEvent.WinterFlowServerProtocol() || winterFlowSyntaxEvent.WinterFlowHookDataSource == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final void WinterFlowServiceUtility(ConnectionResult connectionResult, RuntimeException runtimeException) {
        WinterFlowFrameworkLibrary winterFlowFrameworkLibrary;
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowBandwidthObject;
        WinterFlowUnitTestLibrary.WinterFlowServiceUtility(winterFlowTransactionManagerStack.WinterFlowThreadListener);
        WinterFlowManagerStructure winterFlowManagerStructure = this.WinterFlowResponseEngine;
        if (winterFlowManagerStructure != null && (winterFlowFrameworkLibrary = winterFlowManagerStructure.WinterFlowSyntax) != null) {
            winterFlowFrameworkLibrary.WinterFlowHookDataSource();
        }
        WinterFlowUnitTestLibrary.WinterFlowServiceUtility(this.WinterFlowBandwidthObject.WinterFlowThreadListener);
        this.WinterFlowThreadListener = null;
        SparseIntArray sparseIntArray = (SparseIntArray) winterFlowTransactionManagerStack.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        WinterFlowServerProtocol(connectionResult);
        if ((this.WinterFlowArrayNetwork instanceof WinterFlowFrameworkClass) && connectionResult.WinterFlowTransactionManagerStrategy != 24) {
            winterFlowTransactionManagerStack.WinterFlowHookDataSource = true;
            WinterFlowWidgetInterface winterFlowWidgetInterface = winterFlowTransactionManagerStack.WinterFlowThreadListener;
            winterFlowWidgetInterface.sendMessageDelayed(winterFlowWidgetInterface.obtainMessage(19), 300000L);
        }
        int i = connectionResult.WinterFlowTransactionManagerStrategy;
        if (i == 4) {
            WinterFlowResponseEngine(WinterFlowTransactionManagerStack.WinterFlowOrchestrationSubsystem);
            return;
        }
        if (i == 25) {
            WinterFlowResponseEngine(WinterFlowTransactionManagerStack.WinterFlowHookDataSource(this.WinterFlowVariableVersionControl, connectionResult));
            return;
        }
        LinkedList linkedList = this.WinterFlowCacheManagerAgent;
        if (linkedList.isEmpty()) {
            this.WinterFlowThreadListener = connectionResult;
            return;
        }
        if (runtimeException != null) {
            WinterFlowUnitTestLibrary.WinterFlowServiceUtility(winterFlowTransactionManagerStack.WinterFlowThreadListener);
            WinterFlowSyntax(null, runtimeException, false);
            return;
        }
        boolean z = winterFlowTransactionManagerStack.WinterFlowServiceUtility;
        WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth = this.WinterFlowVariableVersionControl;
        if (!z) {
            WinterFlowResponseEngine(WinterFlowTransactionManagerStack.WinterFlowHookDataSource(winterFlowRepositoryBandwidth, connectionResult));
            return;
        }
        WinterFlowSyntax(WinterFlowTransactionManagerStack.WinterFlowHookDataSource(winterFlowRepositoryBandwidth, connectionResult), null, true);
        if (linkedList.isEmpty() || WinterFlowTransactionManagerStrategy(connectionResult) || winterFlowTransactionManagerStack.WinterFlowVariableVersionControl(connectionResult, this.WinterFlowSyntax)) {
            return;
        }
        if (connectionResult.WinterFlowTransactionManagerStrategy == 18) {
            this.WinterFlowTransactionAgent = true;
        }
        if (!this.WinterFlowTransactionAgent) {
            WinterFlowResponseEngine(WinterFlowTransactionManagerStack.WinterFlowHookDataSource(winterFlowRepositoryBandwidth, connectionResult));
        } else {
            WinterFlowWidgetInterface winterFlowWidgetInterface2 = winterFlowTransactionManagerStack.WinterFlowThreadListener;
            winterFlowWidgetInterface2.sendMessageDelayed(Message.obtain(winterFlowWidgetInterface2, 9, winterFlowRepositoryBandwidth), 5000L);
        }
    }

    public final void WinterFlowSyntax(Status status, Exception exc, boolean z) {
        WinterFlowUnitTestLibrary.WinterFlowServiceUtility(this.WinterFlowBandwidthObject.WinterFlowThreadListener);
        if ((status == null) == (exc == null)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Status XOR exception should be null");
            return;
        }
        Iterator it = this.WinterFlowCacheManagerAgent.iterator();
        while (it.hasNext()) {
            WinterFlowDatabaseResponse winterFlowDatabaseResponse = (WinterFlowDatabaseResponse) it.next();
            if (!z || winterFlowDatabaseResponse.WinterFlowRouterStructure == 2) {
                if (status != null) {
                    winterFlowDatabaseResponse.WinterFlowArrayNetwork(status);
                } else {
                    winterFlowDatabaseResponse.WinterFlowVariableVersionControl(exc);
                }
                it.remove();
            }
        }
    }

    public final void WinterFlowThreadListener(ConnectionResult connectionResult) {
        WinterFlowUnitTestLibrary.WinterFlowServiceUtility(this.WinterFlowBandwidthObject.WinterFlowThreadListener);
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowArrayNetwork;
        String name = winterFlowSyntaxEvent.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        winterFlowSyntaxEvent.WinterFlowCacheManagerAgent(sb.toString());
        WinterFlowServiceUtility(connectionResult, null);
    }

    public final void WinterFlowTransactionAgent() {
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowBandwidthObject;
        WinterFlowWidgetInterface winterFlowWidgetInterface = winterFlowTransactionManagerStack.WinterFlowThreadListener;
        WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth = this.WinterFlowVariableVersionControl;
        winterFlowWidgetInterface.removeMessages(12, winterFlowRepositoryBandwidth);
        WinterFlowWidgetInterface winterFlowWidgetInterface2 = winterFlowTransactionManagerStack.WinterFlowThreadListener;
        winterFlowWidgetInterface2.sendMessageDelayed(winterFlowWidgetInterface2.obtainMessage(12, winterFlowRepositoryBandwidth), winterFlowTransactionManagerStack.WinterFlowRouterStructure);
    }

    public final boolean WinterFlowTransactionManagerStrategy(ConnectionResult connectionResult) {
        synchronized (WinterFlowTransactionManagerStack.WinterFlowConcurrencyThread) {
            this.WinterFlowBandwidthObject.getClass();
        }
        return false;
    }

    public final void WinterFlowUnitTestResponse() {
        LinkedList linkedList = this.WinterFlowCacheManagerAgent;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            WinterFlowDatabaseResponse winterFlowDatabaseResponse = (WinterFlowDatabaseResponse) arrayList.get(i);
            if (!this.WinterFlowArrayNetwork.WinterFlowServerProtocol()) {
                return;
            }
            if (WinterFlowRouterRouter(winterFlowDatabaseResponse)) {
                linkedList.remove(winterFlowDatabaseResponse);
            }
        }
    }

    public final void WinterFlowVariableVersionControl(int i) {
        WinterFlowUnitTestLibrary.WinterFlowServiceUtility(this.WinterFlowBandwidthObject.WinterFlowThreadListener);
        this.WinterFlowThreadListener = null;
        this.WinterFlowTransactionAgent = true;
        String str = this.WinterFlowArrayNetwork.WinterFlowRouterStructure;
        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = this.WinterFlowTransactionManagerStrategy;
        winterFlowCacheManagerVersionControl.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        winterFlowCacheManagerVersionControl.WinterFlowSyntax(true, new Status(20, sb.toString(), null, null));
        WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth = this.WinterFlowVariableVersionControl;
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowBandwidthObject;
        WinterFlowWidgetInterface winterFlowWidgetInterface = winterFlowTransactionManagerStack.WinterFlowThreadListener;
        winterFlowWidgetInterface.sendMessageDelayed(Message.obtain(winterFlowWidgetInterface, 9, winterFlowRepositoryBandwidth), 5000L);
        WinterFlowWidgetInterface winterFlowWidgetInterface2 = winterFlowTransactionManagerStack.WinterFlowThreadListener;
        winterFlowWidgetInterface2.sendMessageDelayed(Message.obtain(winterFlowWidgetInterface2, 11, winterFlowRepositoryBandwidth), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) winterFlowTransactionManagerStack.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.WinterFlowRouterRouter.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
        }
    }
}
