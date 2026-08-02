package com.bugsnag.android.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.DeliveryParams;
import com.bugsnag.android.EndpointConfiguration;
import com.bugsnag.android.ErrorTypes;
import com.bugsnag.android.Event;
import com.bugsnag.android.EventInternal;
import com.bugsnag.android.EventPayload;
import com.bugsnag.android.Logger;
import com.bugsnag.android.ThreadSendPolicy;
import com.bugsnag.android.UnknownConnectivity;
import com.bugsnag.android.internal.dag.Provider;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ImmutableConfig {
    public final String apiKey;
    public final ApplicationInfo appInfo;
    public final String appType;
    public final boolean autoDetectErrors;
    public final boolean autoTrackSessions;
    public final Provider buildUuid;
    public final DeliveryParams delivery;
    public final Collection discardClasses;
    public final ErrorTypes enabledErrorTypes;
    public final EndpointConfiguration endpoints;
    public final boolean generateAnonymousId;
    public final long launchDurationMillis;
    public final Logger logger;
    public final int maxBreadcrumbs;
    public final int maxPersistedEvents;
    public final int maxPersistedSessions;
    public final int maxReportedThreads;
    public final int maxStringValueLength;
    public final PackageInfo packageInfo;
    public final boolean persistUser;
    public final Lazy persistenceDirectory;
    public final Collection projectPackages;
    public final Collection redactedKeys;
    public final String releaseStage;
    public final boolean sendLaunchCrashesSynchronously;
    public final ThreadSendPolicy sendThreads;
    public final Set telemetry;
    public final long threadCollectionTimeLimitMillis;
    public final Integer versionCode;

    public ImmutableConfig(String str, boolean z, ErrorTypes errorTypes, boolean z2, ThreadSendPolicy threadSendPolicy, Collection collection, Collection collection2, Set set, String str2, Provider provider, Integer num, String str3, DeliveryParams deliveryParams, EndpointConfiguration endpointConfiguration, boolean z3, long j, Logger logger, int i, int i2, int i3, int i4, int i5, long j2, Lazy lazy, boolean z4, boolean z5, PackageInfo packageInfo, ApplicationInfo applicationInfo, Collection collection3) {
        this.apiKey = str;
        this.autoDetectErrors = z;
        this.enabledErrorTypes = errorTypes;
        this.autoTrackSessions = z2;
        this.sendThreads = threadSendPolicy;
        this.discardClasses = collection;
        this.projectPackages = collection2;
        this.telemetry = set;
        this.releaseStage = str2;
        this.buildUuid = provider;
        this.versionCode = num;
        this.appType = str3;
        this.delivery = deliveryParams;
        this.endpoints = endpointConfiguration;
        this.persistUser = z3;
        this.launchDurationMillis = j;
        this.logger = logger;
        this.maxBreadcrumbs = i;
        this.maxPersistedEvents = i2;
        this.maxPersistedSessions = i3;
        this.maxReportedThreads = i4;
        this.maxStringValueLength = i5;
        this.threadCollectionTimeLimitMillis = j2;
        this.persistenceDirectory = lazy;
        this.sendLaunchCrashesSynchronously = z4;
        this.generateAnonymousId = z5;
        this.packageInfo = packageInfo;
        this.appInfo = applicationInfo;
        this.redactedKeys = collection3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableConfig)) {
            return false;
        }
        ImmutableConfig immutableConfig = (ImmutableConfig) obj;
        return this.apiKey.equals(immutableConfig.apiKey) && this.autoDetectErrors == immutableConfig.autoDetectErrors && this.enabledErrorTypes.equals(immutableConfig.enabledErrorTypes) && this.autoTrackSessions == immutableConfig.autoTrackSessions && this.sendThreads == immutableConfig.sendThreads && Intrinsics.areEqual(this.discardClasses, immutableConfig.discardClasses) && Intrinsics.areEqual(this.projectPackages, immutableConfig.projectPackages) && Intrinsics.areEqual(this.telemetry, immutableConfig.telemetry) && Intrinsics.areEqual(this.releaseStage, immutableConfig.releaseStage) && Intrinsics.areEqual(this.buildUuid, immutableConfig.buildUuid) && Intrinsics.areEqual(this.versionCode, immutableConfig.versionCode) && Intrinsics.areEqual(this.appType, immutableConfig.appType) && Intrinsics.areEqual(this.delivery, immutableConfig.delivery) && this.endpoints.equals(immutableConfig.endpoints) && this.persistUser == immutableConfig.persistUser && this.launchDurationMillis == immutableConfig.launchDurationMillis && Intrinsics.areEqual(this.logger, immutableConfig.logger) && this.maxBreadcrumbs == immutableConfig.maxBreadcrumbs && this.maxPersistedEvents == immutableConfig.maxPersistedEvents && this.maxPersistedSessions == immutableConfig.maxPersistedSessions && this.maxReportedThreads == immutableConfig.maxReportedThreads && this.maxStringValueLength == immutableConfig.maxStringValueLength && this.threadCollectionTimeLimitMillis == immutableConfig.threadCollectionTimeLimitMillis && Intrinsics.areEqual(this.persistenceDirectory, immutableConfig.persistenceDirectory) && this.sendLaunchCrashesSynchronously == immutableConfig.sendLaunchCrashesSynchronously && this.generateAnonymousId == immutableConfig.generateAnonymousId && Intrinsics.areEqual(this.packageInfo, immutableConfig.packageInfo) && Intrinsics.areEqual(this.appInfo, immutableConfig.appInfo) && Intrinsics.areEqual(this.redactedKeys, immutableConfig.redactedKeys);
    }

    public final DeliveryParams getErrorApiDeliveryParams(EventPayload eventPayload) {
        Set set;
        EventInternal eventInternal;
        String str = this.endpoints.notify;
        Pair pair = new Pair("Bugsnag-Payload-Version", "4.0");
        String str2 = eventPayload.apiKey;
        if (str2 == null) {
            str2 = "";
        }
        LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(pair, new Pair("Bugsnag-Api-Key", str2), new Pair("Bugsnag-Sent-At", DateUtils.toIso8601(new Date())), new Pair("Content-Type", "application/json"));
        Event event = eventPayload.event;
        if (event == null || (eventInternal = event.impl) == null) {
            File file = eventPayload.eventFile;
            if (file == null || (set = UnknownConnectivity.fromFile(file, eventPayload.config).getErrorTypes()) == null) {
                set = EmptySet.INSTANCE;
            }
        } else {
            set = eventInternal.getErrorTypesFromStackframes$bugsnag_android_core_release();
        }
        if (!set.isEmpty()) {
            mutableMapOf.put("Bugsnag-Stacktrace-Types", Bugsnag.serializeErrorTypeHeader(set));
        }
        return new DeliveryParams(str, MapsKt__MapsKt.toMap(mutableMapOf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.apiKey.hashCode() * 31;
        boolean z = this.autoDetectErrors;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.enabledErrorTypes.hashCode() + ((hashCode + i) * 31)) * 31;
        boolean z2 = this.autoTrackSessions;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.projectPackages.hashCode() + ((this.discardClasses.hashCode() + ((this.sendThreads.hashCode() + ((hashCode2 + i2) * 31)) * 31)) * 961)) * 961, 31, this.telemetry);
        String str = this.releaseStage;
        int hashCode3 = (m + (str == null ? 0 : str.hashCode())) * 31;
        Provider provider = this.buildUuid;
        int hashCode4 = (hashCode3 + (provider == null ? 0 : provider.hashCode())) * 961;
        Integer num = this.versionCode;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.appType;
        int hashCode6 = (this.endpoints.hashCode() + ((this.delivery.hashCode() + ((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        boolean z3 = this.persistUser;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        int hashCode7 = (this.persistenceDirectory.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxStringValueLength, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxReportedThreads, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxPersistedSessions, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxPersistedEvents, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxBreadcrumbs, (this.logger.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode6 + i3) * 31, 31, this.launchDurationMillis)) * 31, 31), 31), 31), 31), 31), 31, this.threadCollectionTimeLimitMillis)) * 31;
        boolean z4 = this.sendLaunchCrashesSynchronously;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode7 + i4) * 961;
        boolean z5 = this.generateAnonymousId;
        int i6 = (i5 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        PackageInfo packageInfo = this.packageInfo;
        int hashCode8 = (i6 + (packageInfo == null ? 0 : packageInfo.hashCode())) * 31;
        ApplicationInfo applicationInfo = this.appInfo;
        return this.redactedKeys.hashCode() + ((hashCode8 + (applicationInfo != null ? applicationInfo.hashCode() : 0)) * 31);
    }

    public final boolean shouldDiscardByErrorClass$bugsnag_android_core_release(String str) {
        if (str != null && str.length() != 0) {
            Collection collection = this.discardClasses;
            if ((collection instanceof Collection) && collection.isEmpty()) {
                return false;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((Pattern) it.next()).matcher(str.toString()).matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean shouldDiscardError(Throwable th) {
        Throwable th2 = th;
        boolean z = false;
        for (int i = 0; th != null && i < 100; i++) {
            if (shouldDiscardByErrorClass$bugsnag_android_core_release(th.getClass().getName())) {
                return true;
            }
            th = th.getCause();
            if (z) {
                th2 = th2 != null ? th2.getCause() : null;
                if (th == th2) {
                    break;
                }
            }
            z = !z;
        }
        return false;
    }

    public final String toString() {
        return "ImmutableConfig(apiKey=" + this.apiKey + ", autoDetectErrors=" + this.autoDetectErrors + ", enabledErrorTypes=" + this.enabledErrorTypes + ", autoTrackSessions=" + this.autoTrackSessions + ", sendThreads=" + this.sendThreads + ", discardClasses=" + this.discardClasses + ", enabledReleaseStages=null, projectPackages=" + this.projectPackages + ", enabledBreadcrumbTypes=null, telemetry=" + this.telemetry + ", releaseStage=" + this.releaseStage + ", buildUuid=" + this.buildUuid + ", appVersion=null, versionCode=" + this.versionCode + ", appType=" + this.appType + ", delivery=" + this.delivery + ", endpoints=" + this.endpoints + ", persistUser=" + this.persistUser + ", launchDurationMillis=" + this.launchDurationMillis + ", logger=" + this.logger + ", maxBreadcrumbs=" + this.maxBreadcrumbs + ", maxPersistedEvents=" + this.maxPersistedEvents + ", maxPersistedSessions=" + this.maxPersistedSessions + ", maxReportedThreads=" + this.maxReportedThreads + ", maxStringValueLength=" + this.maxStringValueLength + ", threadCollectionTimeLimitMillis=" + this.threadCollectionTimeLimitMillis + ", persistenceDirectory=" + this.persistenceDirectory + ", sendLaunchCrashesSynchronously=" + this.sendLaunchCrashesSynchronously + ", attemptDeliveryOnCrash=false, generateAnonymousId=" + this.generateAnonymousId + ", packageInfo=" + this.packageInfo + ", appInfo=" + this.appInfo + ", redactedKeys=" + this.redactedKeys + ')';
    }
}
