package com.squareup.cash.observability.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import coil3.size.SizeKt;
import com.datadog.android.Datadog;
import com.datadog.android.rum.RumMonitor;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.MetadataSection$AdditionalInfoSection;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.observability.types.ThrowableScribe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealErrorReporter implements ErrorReporter {
    public final BugsnagClient bugsnagClient;
    public final RealDatadogClient datadogClient;
    public final ThrowableScribe throwableScribe;

    public RealErrorReporter(RealDatadogClient realDatadogClient, BugsnagClient bugsnagClient, ThrowableScribe throwableScribe) {
        this.datadogClient = realDatadogClient;
        this.bugsnagClient = bugsnagClient;
        this.throwableScribe = throwableScribe;
    }

    @Override // com.squareup.cash.observability.types.ErrorReporter
    public final void annotateException(Throwable th, Map map) {
        map.getClass();
        WeakThrowableScribe weakThrowableScribe = (WeakThrowableScribe) this.throwableScribe;
        WeakHashMap weakHashMap = weakThrowableScribe.annotations;
        Map map2 = (Map) weakHashMap.get(th);
        if (map2 == null) {
            map2 = EmptyMap.INSTANCE;
            map2.getClass();
        }
        LinkedHashSet intersect = CollectionsKt.intersect(map2.keySet(), map.keySet());
        int i = 10;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(intersect, 10));
        int i2 = 16;
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it = intersect.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object value = MapsKt__MapsKt.getValue(map2, next);
            Map map3 = (Map) MapsKt__MapsKt.getValue(map, next);
            Map map4 = (Map) value;
            String str = (String) next;
            LinkedHashSet intersect2 = CollectionsKt.intersect(map4.keySet(), map3.keySet());
            int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(intersect2, i));
            if (mapCapacity2 < i2) {
                mapCapacity2 = i2;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2);
            Iterator it2 = intersect2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                Object value2 = MapsKt__MapsKt.getValue(map4, next2);
                Object value3 = MapsKt__MapsKt.getValue(map3, next2);
                weakThrowableScribe.onConflict.invoke(new Pair(str, (String) next2), value2, value3);
                linkedHashMap2.put(next2, value3);
                it = it;
                it2 = it2;
                weakThrowableScribe = weakThrowableScribe;
            }
            linkedHashMap.put(next, MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(map4, map3), linkedHashMap2));
            weakThrowableScribe = weakThrowableScribe;
            i = 10;
            i2 = 16;
        }
        weakHashMap.put(th, MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(map2, map), linkedHashMap));
    }

    @Override // com.squareup.cash.observability.types.ErrorReporter
    public final void report(ReportedError reportedError, SampleStrategy sampleStrategy) {
        reportedError.getClass();
        sampleStrategy.getClass();
        if (reportedError.getTargets().contains(ReportedError.ErrorReportingTarget.LOGS)) {
            Timber.Forest.e(reportedError.getMessage(), new Object[0], reportedError);
        }
        if (reportedError.getTargets().contains(ReportedError.ErrorReportingTarget.BUGSNAG) && sampleStrategy.shouldCollectEvent(reportedError)) {
            this.bugsnagClient.notify(reportedError, new RealBrazeManager$$ExternalSyntheticLambda0(reportedError, 26));
        }
        Set targets = reportedError.getTargets();
        ReportedError.ErrorReportingTarget errorReportingTarget = ReportedError.ErrorReportingTarget.DATADOG;
        if (targets.contains(errorReportingTarget)) {
            String message = reportedError.getMessage();
            if (message == null) {
                message = "Non-fatal error for features: " + reportedError.getFeatures();
            }
            Map metadata = reportedError.getMetadata();
            MetadataSection$AdditionalInfoSection metadataSection$AdditionalInfoSection = MetadataSection$AdditionalInfoSection.INSTANCE;
            Map addFeaturesFromError = SizeKt.addFeaturesFromError(metadata, reportedError, errorReportingTarget);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : addFeaturesFromError.entrySet()) {
                String str = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry2 : map.entrySet()) {
                    arrayList2.add(new Pair(Recorder$$ExternalSyntheticOutline2.m(str, "_", (String) entry2.getKey()), entry2.getValue()));
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList);
            }
            Map map2 = MapsKt__MapsKt.toMap(arrayList);
            map2.getClass();
            if (Datadog.isInitialized()) {
                ((RumMonitor) this.datadogClient.rumMonitor.invoke()).addError(message, 4, reportedError, map2);
            }
        }
    }
}
