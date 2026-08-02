package com.squareup.cash.observability.backend.real.bugsnag;

import android.app.Application;
import com.bugsnag.android.Breadcrumb;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.Client;
import com.bugsnag.android.ContextState;
import com.bugsnag.android.FeatureFlagState;
import com.bugsnag.android.LastRunInfo;
import com.bugsnag.android.MetadataState;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.User;
import com.bugsnag.android.UserState;
import com.bugsnag.android.internal.StateObserver;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.api.BugsnagClient$ErrorContext$ActiveScreen;
import com.squareup.cash.observability.types.MetadataKey;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.observability.types.ThrowableScribe;
import com.squareup.cash.session.backend.SetupTeardownRunner$run$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final class RealBugsnagClient implements BugsnagClient {
    public Analytics analytics;
    public Application context;
    public boolean hasSetUpAdditionalMetadata;
    public final CoroutineScope scope;
    public ThrowableScribe throwableScribe;

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BreadcrumbType.values().length];
            try {
                iArr[BreadcrumbType.NAVIGATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BreadcrumbType.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BreadcrumbType.PROCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BreadcrumbType.LOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BreadcrumbType.USER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BreadcrumbType.STATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BreadcrumbType.ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BreadcrumbType.MANUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealBugsnagClient(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.scope = coroutineScope;
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void addFeatureFlag(String str, String str2) {
        str2.getClass();
        FeatureFlagState featureFlagState = Bugsnag.getClient().featureFlagState;
        featureFlagState.featureFlags.addFeatureFlag(str, str2);
        if (featureFlagState.getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        StateEvent.AddFeatureFlag addFeatureFlag = new StateEvent.AddFeatureFlag(str, str2);
        Iterator<T> it = featureFlagState.getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((StateObserver) it.next()).onStateChange(addFeatureFlag);
        }
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void addMetadata(SyncValueSpec syncValueSpec, MetadataKey metadataKey, String str) {
        metadataKey.getClass();
        String str2 = (String) syncValueSpec.valueName;
        String bugsnagName = metadataKey.getBugsnagName();
        Client client = Bugsnag.getClient();
        client.getClass();
        if (bugsnagName == null) {
            client.logNull("addMetadata");
            return;
        }
        MetadataState metadataState = client.metadataState;
        metadataState.metadata.addMetadata(str2, bugsnagName, str);
        metadataState.notifyMetadataAdded(str2, bugsnagName, str);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void clearMetadata(SyncValueSpec syncValueSpec, MetadataKey metadataKey) {
        metadataKey.getClass();
        String str = (String) syncValueSpec.valueName;
        String bugsnagName = metadataKey.getBugsnagName();
        Client client = Bugsnag.getClient();
        client.getClass();
        if (bugsnagName == null) {
            client.logNull("clearMetadata");
            return;
        }
        MetadataState metadataState = client.metadataState;
        Map map = metadataState.metadata.store;
        Map map2 = (Map) map.get(str);
        if (map2 != null) {
            map2.remove(bugsnagName);
        }
        if (map2 == null || map2.isEmpty()) {
            map.remove(str);
        }
        metadataState.notifyClear(str, bugsnagName);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final List getBreadcrumbs() {
        Map map;
        BugsnagClient.BreadcrumbType breadcrumbType;
        List<Breadcrumb> copy = Bugsnag.getClient().breadcrumbState.copy();
        copy.getClass();
        List<Breadcrumb> list = copy;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Breadcrumb breadcrumb : list) {
            String message = breadcrumb.getMessage();
            message.getClass();
            Map<String, Object> metadata = breadcrumb.getMetadata();
            if (metadata != null) {
                map = MapsKt__MapsKt.toMap(metadata);
            } else {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
            String date = breadcrumb.getTimestamp().toString();
            date.getClass();
            switch (WhenMappings.$EnumSwitchMapping$0[breadcrumb.getType().ordinal()]) {
                case 1:
                    breadcrumbType = BugsnagClient.BreadcrumbType.NAVIGATION;
                    break;
                case 2:
                    breadcrumbType = BugsnagClient.BreadcrumbType.REQUEST;
                    break;
                case 3:
                    breadcrumbType = BugsnagClient.BreadcrumbType.PROCESS;
                    break;
                case 4:
                    breadcrumbType = BugsnagClient.BreadcrumbType.LOG;
                    break;
                case 5:
                    breadcrumbType = BugsnagClient.BreadcrumbType.USER;
                    break;
                case 6:
                    breadcrumbType = BugsnagClient.BreadcrumbType.STATE;
                    break;
                case 7:
                    breadcrumbType = BugsnagClient.BreadcrumbType.ERROR;
                    break;
                case 8:
                    breadcrumbType = BugsnagClient.BreadcrumbType.MANUAL;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
            arrayList.add(new BugsnagClient.Breadcrumb(message, map, date, breadcrumbType));
        }
        return arrayList;
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final boolean lastRunCrashed() {
        LastRunInfo lastRunInfo = Bugsnag.getClient().lastRunInfo;
        if (lastRunInfo != null) {
            return lastRunInfo.crashed || lastRunInfo.crashedDuringLaunch;
        }
        return false;
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void leaveManualBreadcrumb(String str, Map map) {
        map.getClass();
        Bugsnag.getClient().leaveBreadcrumb(BreadcrumbType.MANUAL, str, map);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void leaveNavigationBreadcrumb(String str, MapBuilder mapBuilder) {
        Bugsnag.getClient().leaveBreadcrumb(BreadcrumbType.NAVIGATION, str, mapBuilder);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void notify(ReportedError reportedError, RealBrazeManager$$ExternalSyntheticLambda0 realBrazeManager$$ExternalSyntheticLambda0) {
        reportedError.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(this.scope, DefaultIoScheduler.INSTANCE, null, new SetupTeardownRunner$run$2(reportedError, this, realBrazeManager$$ExternalSyntheticLambda0, null, 3), 2);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void setErrorContext(BugsnagClient$ErrorContext$ActiveScreen bugsnagClient$ErrorContext$ActiveScreen) {
        String canonicalName = bugsnagClient$ErrorContext$ActiveScreen.screen.getClass().getCanonicalName();
        ContextState contextState = Bugsnag.getClient().contextState;
        contextState.manualContext = canonicalName;
        contextState.automaticContext = "__BUGSNAG_MANUAL_CONTEXT__";
        contextState.emitObservableEvent();
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void setUserIdentifier(String str) {
        UserState userState = (UserState) Bugsnag.getClient().userState.get();
        userState.user = new User(str, null, null);
        userState.emitObservableEvent();
    }
}
