package com.squareup.cash.observability.backend.real;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.api.BugsnagClient$ErrorContext$ActiveScreen;
import com.squareup.cash.observability.types.MetadataKey;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.MapBuilder;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class LogOnlyBugsnagClient implements BugsnagClient {
    public final ConcurrentLinkedQueue breadcrumbs = new ConcurrentLinkedQueue();

    public final void addBreadcrumb(String str, Map map, BugsnagClient.BreadcrumbType breadcrumbType) {
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ofEpochMilli.getClass();
        String instant = ofEpochMilli.toString();
        instant.getClass();
        BugsnagClient.Breadcrumb breadcrumb = new BugsnagClient.Breadcrumb(str, map, instant, breadcrumbType);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.breadcrumbs;
        concurrentLinkedQueue.add(breadcrumb);
        while (concurrentLinkedQueue.size() > 100) {
            concurrentLinkedQueue.poll();
        }
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void addFeatureFlag(String str, String str2) {
        str2.getClass();
        Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m("addFeatureFlag(", str, ", ", str2, ")"), new Object[0]);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void addMetadata(SyncValueSpec syncValueSpec, MetadataKey metadataKey, String str) {
        metadataKey.getClass();
        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("addMetadata(", (String) syncValueSpec.valueName, ", ", metadataKey.getBugsnagName(), ", "), str, ")"), new Object[0]);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void clearMetadata(SyncValueSpec syncValueSpec, MetadataKey metadataKey) {
        metadataKey.getClass();
        Timber.Forest.d(CameraSelector$$ExternalSyntheticOutline0.m("clearMetadata(", (String) syncValueSpec.valueName, ", ", metadataKey.getBugsnagName()), new Object[0]);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final List getBreadcrumbs() {
        Timber.Forest.d("getBreadcrumbs()", new Object[0]);
        return CollectionsKt.toList(this.breadcrumbs);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final boolean lastRunCrashed() {
        Timber.Forest.d("lastRunCrashed", new Object[0]);
        return false;
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void leaveManualBreadcrumb(String str, Map map) {
        map.getClass();
        Timber.Forest.d("leaveManualBreadcrumb(" + str + ", " + map + ")", new Object[0]);
        addBreadcrumb(str, map, BugsnagClient.BreadcrumbType.MANUAL);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void leaveNavigationBreadcrumb(String str, MapBuilder mapBuilder) {
        Timber.Forest.d("leaveNavigationBreadcrumb(" + str + ", " + mapBuilder + ")", new Object[0]);
        addBreadcrumb(str, mapBuilder, BugsnagClient.BreadcrumbType.NAVIGATION);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void notify(ReportedError reportedError, RealBrazeManager$$ExternalSyntheticLambda0 realBrazeManager$$ExternalSyntheticLambda0) {
        reportedError.getClass();
        Timber.Forest.w(reportedError);
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void setErrorContext(BugsnagClient$ErrorContext$ActiveScreen bugsnagClient$ErrorContext$ActiveScreen) {
    }

    @Override // com.squareup.cash.observability.backend.api.BugsnagClient
    public final void setUserIdentifier(String str) {
        Timber.Forest.d("setUserIdentifier: ".concat(str), new Object[0]);
    }
}
