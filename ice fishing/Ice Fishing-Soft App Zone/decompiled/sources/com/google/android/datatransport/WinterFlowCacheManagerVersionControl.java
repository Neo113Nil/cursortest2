package com.google.android.datatransport;

import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.common.api.Status;
import com.icewinter.flow.winter.icecatch.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheManagerVersionControl implements WinterFlowLoaderConsumer, WinterFlowDeserializationProcess, WinterFlowEventPipeline, WinterFlowModuleClass {
    public final Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowCacheManagerVersionControl(int i) {
        this.WinterFlowVariableVersionControl = i;
        switch (i) {
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowJSON(new Reference[16]);
                this.WinterFlowUnitTestResponse = new ReferenceQueue();
                break;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowAlgorithmDebug(26);
                this.WinterFlowUnitTestResponse = new WinterFlowThreadNode(16);
                break;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                this.WinterFlowTransactionManagerStrategy = Collections.synchronizedMap(new WeakHashMap());
                this.WinterFlowUnitTestResponse = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowModuleClass
    public Object WinterFlowArrayNetwork(WinterFlowExceptionParser winterFlowExceptionParser) {
        WinterFlowProviderUserManager winterFlowProviderUserManager = (WinterFlowProviderUserManager) this.WinterFlowTransactionManagerStrategy;
        Bundle bundle = (Bundle) this.WinterFlowUnitTestResponse;
        if (!winterFlowExceptionParser.WinterFlowRouterRouter()) {
            return winterFlowExceptionParser;
        }
        Bundle bundle2 = (Bundle) winterFlowExceptionParser.WinterFlowTransactionManagerStrategy();
        if (bundle2 == null || !bundle2.containsKey("google.messenger")) {
            return winterFlowExceptionParser;
        }
        WinterFlowExceptionParser WinterFlowHookDataSource = winterFlowProviderUserManager.WinterFlowHookDataSource(bundle);
        WinterFlowRuntimeService winterFlowRuntimeService = WinterFlowRuntimeService.WinterFlowTransactionManagerStrategy;
        WinterFlowExceptionParser winterFlowExceptionParser2 = new WinterFlowExceptionParser();
        WinterFlowHookDataSource.WinterFlowHookDataSource.WinterFlowHookDataSource(new WinterFlowProtocolMechanism(winterFlowRuntimeService, WinterFlowModuleFunction.WinterFlowTransactionManagerStrategy, winterFlowExceptionParser2));
        WinterFlowHookDataSource.WinterFlowThreadListener();
        return winterFlowExceptionParser2;
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderConsumer
    public Object WinterFlowCacheManagerAgent(Object obj) {
        return ((WinterFlowObjectSession) this.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderConsumer
    public Object WinterFlowHookDataSource(WinterFlowWebsocketPipeline winterFlowWebsocketPipeline, Object obj) {
        return ((WinterFlowEventEvent) this.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl(winterFlowWebsocketPipeline, obj);
    }

    public void WinterFlowRouterRouter(Bundle bundle) {
        WinterFlowNodeGateway winterFlowNodeGateway = (WinterFlowNodeGateway) this.WinterFlowTransactionManagerStrategy;
        Bundle WinterFlowOrchestrationSubsystem = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
        Bundle bundle2 = winterFlowNodeGateway.WinterFlowTransactionManagerStrategy;
        if (bundle2 != null) {
            WinterFlowOrchestrationSubsystem.putAll(bundle2);
        }
        synchronized (winterFlowNodeGateway.WinterFlowCacheManagerAgent) {
            for (Map.Entry entry : winterFlowNodeGateway.WinterFlowArrayNetwork.entrySet()) {
                String str = (String) entry.getKey();
                Bundle WinterFlowRouterStructure = ((WinterFlowQueueFramework) entry.getValue()).WinterFlowRouterStructure();
                str.getClass();
                WinterFlowRouterStructure.getClass();
                WinterFlowOrchestrationSubsystem.putBundle(str, WinterFlowRouterStructure);
            }
        }
        if (WinterFlowOrchestrationSubsystem.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", WinterFlowOrchestrationSubsystem);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationProcess
    public void WinterFlowRouterStructure(WinterFlowExceptionParser winterFlowExceptionParser) {
        ((Map) ((WinterFlowCacheManagerVersionControl) this.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse).remove((WinterFlowArrayEngine) this.WinterFlowTransactionManagerStrategy);
    }

    public void WinterFlowSyntax(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.WinterFlowTransactionManagerStrategy;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.WinterFlowUnitTestResponse;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                return;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((WinterFlowArrayEngine) entry2.getKey()).WinterFlowHookDataSource(new WinterFlowInheritanceOrchestration(status));
            }
        }
    }

    public void WinterFlowTransactionManagerStrategy() {
        ((WinterFlowNodeGateway) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure();
    }

    public void WinterFlowUnitTestResponse(Bundle bundle) {
        WinterFlowNodeGateway winterFlowNodeGateway = (WinterFlowNodeGateway) this.WinterFlowTransactionManagerStrategy;
        WinterFlowExceptionProxy winterFlowExceptionProxy = winterFlowNodeGateway.WinterFlowRouterStructure;
        if (!winterFlowNodeGateway.WinterFlowVariableVersionControl) {
            winterFlowNodeGateway.WinterFlowRouterStructure();
        }
        if (winterFlowExceptionProxy.WinterFlowUnitTestResponse().WinterFlowSyntax.compareTo(WinterFlowDatabaseProtocol.WinterFlowRouterRouter) >= 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowServiceUtility(winterFlowExceptionProxy.WinterFlowUnitTestResponse().WinterFlowSyntax, "performRestore cannot be called when owner is ");
            return;
        }
        if (winterFlowNodeGateway.WinterFlowUnitTestResponse) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                WinterFlowFrameworkMechanism.WinterFlowResponseEngine("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        winterFlowNodeGateway.WinterFlowTransactionManagerStrategy = bundle2;
        winterFlowNodeGateway.WinterFlowUnitTestResponse = true;
    }

    public String WinterFlowVariableVersionControl(String str) {
        String str2 = (String) this.WinterFlowUnitTestResponse;
        Resources resources = (Resources) this.WinterFlowTransactionManagerStrategy;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // com.google.android.datatransport.WinterFlowEventPipeline
    public void accept(Object obj, Object obj2) {
        int i;
        WinterFlowConsumerStrategy winterFlowConsumerStrategy = (WinterFlowConsumerStrategy) this.WinterFlowTransactionManagerStrategy;
        WinterFlowDeserializationDebug winterFlowDeserializationDebug = (WinterFlowDeserializationDebug) obj;
        WinterFlowServiceProviderObject winterFlowServiceProviderObject = new WinterFlowServiceProviderObject(winterFlowConsumerStrategy, (WinterFlowArrayEngine) obj2);
        Context context = winterFlowConsumerStrategy.WinterFlowRouterStructure;
        try {
            i = WinterFlowFrontendIDE.WinterFlowRouterStructure(context).WinterFlowRouterStructure.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = 0;
        }
        WinterFlowLibraryController winterFlowLibraryController = (WinterFlowLibraryController) this.WinterFlowUnitTestResponse;
        winterFlowLibraryController.WinterFlowResponseEngine = i;
        WinterFlowFrontendDataSource winterFlowFrontendDataSource = (WinterFlowFrontendDataSource) winterFlowDeserializationDebug.WinterFlowRouterRouter();
        WinterFlowLibraryService winterFlowLibraryService = new WinterFlowLibraryService(-1, -1, 0, true);
        Parcelable.Creator<WinterFlowEventProtocol> creator = WinterFlowEventProtocol.CREATOR;
        WinterFlowEventProtocol winterFlowEventProtocol = new WinterFlowEventProtocol(winterFlowLibraryService, false);
        winterFlowEventProtocol.WinterFlowUnitTestResponse = false;
        boolean z = winterFlowEventProtocol.WinterFlowUnitTestResponse;
        WinterFlowEventProtocol winterFlowEventProtocol2 = new WinterFlowEventProtocol(winterFlowEventProtocol.WinterFlowVariableVersionControl, true);
        winterFlowEventProtocol2.WinterFlowUnitTestResponse = z;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i2 = WinterFlowParserDatabaseSchema.WinterFlowRouterStructure;
        obtain.writeStrongBinder(winterFlowServiceProviderObject);
        obtain.writeInt(1);
        winterFlowLibraryController.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        winterFlowEventProtocol2.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            winterFlowFrontendDataSource.WinterFlowCacheManagerAgent.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return "Bounds{lower=" + ((WinterFlowVariableDataSource) this.WinterFlowTransactionManagerStrategy) + " upper=" + ((WinterFlowVariableDataSource) this.WinterFlowUnitTestResponse) + "}";
            default:
                return super.toString();
        }
    }

    public WinterFlowCacheManagerVersionControl(WinterFlowDeploymentSystem winterFlowDeploymentSystem, AlertDialog alertDialog) {
        this.WinterFlowVariableVersionControl = 9;
        this.WinterFlowTransactionManagerStrategy = alertDialog;
        this.WinterFlowUnitTestResponse = winterFlowDeploymentSystem;
    }

    public WinterFlowCacheManagerVersionControl(Context context) {
        this.WinterFlowVariableVersionControl = 3;
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(context);
        Resources resources = context.getResources();
        this.WinterFlowTransactionManagerStrategy = resources;
        this.WinterFlowUnitTestResponse = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public WinterFlowCacheManagerVersionControl(IBinder iBinder) {
        this.WinterFlowVariableVersionControl = 12;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.WinterFlowTransactionManagerStrategy = new Messenger(iBinder);
            this.WinterFlowUnitTestResponse = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.WinterFlowUnitTestResponse = new WinterFlowResponseHandler(iBinder);
            this.WinterFlowTransactionManagerStrategy = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            throw new RemoteException();
        }
    }

    public WinterFlowCacheManagerVersionControl(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl, WinterFlowArrayEngine winterFlowArrayEngine) {
        this.WinterFlowVariableVersionControl = 10;
        this.WinterFlowTransactionManagerStrategy = winterFlowArrayEngine;
        Objects.requireNonNull(winterFlowCacheManagerVersionControl);
        this.WinterFlowUnitTestResponse = winterFlowCacheManagerVersionControl;
    }

    public WinterFlowCacheManagerVersionControl(WinterFlowNodeGateway winterFlowNodeGateway) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowTransactionManagerStrategy = winterFlowNodeGateway;
        this.WinterFlowUnitTestResponse = new WinterFlowAlgorithmArray(winterFlowNodeGateway);
    }

    public /* synthetic */ WinterFlowCacheManagerVersionControl(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    public WinterFlowCacheManagerVersionControl(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.WinterFlowVariableVersionControl = 7;
        lowerBound = bounds.getLowerBound();
        this.WinterFlowTransactionManagerStrategy = WinterFlowVariableDataSource.WinterFlowCacheManagerAgent(lowerBound);
        upperBound = bounds.getUpperBound();
        this.WinterFlowUnitTestResponse = WinterFlowVariableDataSource.WinterFlowCacheManagerAgent(upperBound);
    }
}
