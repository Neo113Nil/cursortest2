package com.datadog.android.telemetry.model;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.mlkit.vision.text.zza;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TelemetryConfigurationEvent {
    public final Action action;
    public final Application application;
    public final long date;
    public final zza dd;
    public final Float effectiveSampleRate;
    public final Session session;
    public final int source;
    public final Telemetry telemetry;
    public final String version;
    public final View view;

    public final class Action {
        public final String id;

        public Action(String str) {
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Action) && Intrinsics.areEqual(this.id, ((Action) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Action(id=", this.id, ")");
        }
    }

    public final class Application {
        public final String id;

        public Application(String str) {
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.areEqual(this.id, ((Application) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Application(id=", this.id, ")");
        }
    }

    public final class Configuration {
        public final Long batchProcessingLevel;
        public final Long batchSize;
        public final Long batchUploadFrequency;
        public final String imagePrivacyLevel;
        public final Long invTimeThresholdMs;
        public final Boolean isMainProcess;
        public final Long mobileVitalsUpdatePeriod;
        public final Long numberOfDisplays;
        public final ArrayList selectedTracingPropagators;
        public final Long sessionReplaySampleRate;
        public final Long sessionSampleRate;
        public final Boolean startRecordingImmediately;
        public final Long telemetrySampleRate;
        public final String textAndInputPrivacyLevel;
        public final Long tnsTimeThresholdMs;
        public final String touchPrivacyLevel;
        public final Long traceSampleRate;
        public final String tracerApi;
        public final String tracerApiVersion;
        public final Boolean trackBackgroundEvents;
        public final Boolean trackErrors;
        public final Boolean trackFrustrations;
        public final Boolean trackInteractions;
        public final Boolean trackNativeLongTasks;
        public final Boolean trackNetworkRequests;
        public final Boolean useProxy;
        public final Boolean useTracing;
        public final int viewTrackingStrategy;

        public Configuration(Long l, Long l2, Long l3, Long l4, Boolean bool, Boolean bool2, ArrayList arrayList, String str, String str2, String str3, Boolean bool3, Boolean bool4, Long l5, int i, Boolean bool5, Long l6, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Long l7, Long l8, Long l9, String str4, String str5, Boolean bool10, Long l10, Long l11) {
            this.sessionSampleRate = l;
            this.telemetrySampleRate = l2;
            this.traceSampleRate = l3;
            this.sessionReplaySampleRate = l4;
            this.startRecordingImmediately = bool;
            this.useProxy = bool2;
            this.selectedTracingPropagators = arrayList;
            this.textAndInputPrivacyLevel = str;
            this.imagePrivacyLevel = str2;
            this.touchPrivacyLevel = str3;
            this.trackFrustrations = bool3;
            this.trackInteractions = bool4;
            this.numberOfDisplays = l5;
            this.viewTrackingStrategy = i;
            this.trackBackgroundEvents = bool5;
            this.mobileVitalsUpdatePeriod = l6;
            this.trackErrors = bool6;
            this.trackNetworkRequests = bool7;
            this.useTracing = bool8;
            this.trackNativeLongTasks = bool9;
            this.batchSize = l7;
            this.batchUploadFrequency = l8;
            this.batchProcessingLevel = l9;
            this.tracerApi = str4;
            this.tracerApiVersion = str5;
            this.isMainProcess = bool10;
            this.invTimeThresholdMs = l10;
            this.tnsTimeThresholdMs = l11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            if (!Intrinsics.areEqual(this.sessionSampleRate, configuration.sessionSampleRate) || !Intrinsics.areEqual(this.telemetrySampleRate, configuration.telemetrySampleRate) || !Intrinsics.areEqual(this.traceSampleRate, configuration.traceSampleRate) || !Intrinsics.areEqual(this.sessionReplaySampleRate, configuration.sessionReplaySampleRate) || !Intrinsics.areEqual(this.startRecordingImmediately, configuration.startRecordingImmediately) || !this.useProxy.equals(configuration.useProxy) || !Intrinsics.areEqual(this.selectedTracingPropagators, configuration.selectedTracingPropagators) || !Intrinsics.areEqual(this.textAndInputPrivacyLevel, configuration.textAndInputPrivacyLevel) || !Intrinsics.areEqual(this.imagePrivacyLevel, configuration.imagePrivacyLevel) || !Intrinsics.areEqual(this.touchPrivacyLevel, configuration.touchPrivacyLevel) || !Intrinsics.areEqual(this.trackFrustrations, configuration.trackFrustrations) || !this.trackInteractions.equals(configuration.trackInteractions) || !Intrinsics.areEqual(this.numberOfDisplays, configuration.numberOfDisplays)) {
                return false;
            }
            Object obj2 = Boolean.FALSE;
            if (!obj2.equals(obj2) || this.viewTrackingStrategy != configuration.viewTrackingStrategy || !Intrinsics.areEqual(this.trackBackgroundEvents, configuration.trackBackgroundEvents) || !Intrinsics.areEqual(this.mobileVitalsUpdatePeriod, configuration.mobileVitalsUpdatePeriod) || !this.trackErrors.equals(configuration.trackErrors) || !this.trackNetworkRequests.equals(configuration.trackNetworkRequests) || !this.useTracing.equals(configuration.useTracing) || !this.trackNativeLongTasks.equals(configuration.trackNativeLongTasks) || !this.batchSize.equals(configuration.batchSize) || !this.batchUploadFrequency.equals(configuration.batchUploadFrequency) || !this.batchProcessingLevel.equals(configuration.batchProcessingLevel) || !Intrinsics.areEqual(this.tracerApi, configuration.tracerApi) || !Intrinsics.areEqual(this.tracerApiVersion, configuration.tracerApiVersion) || !this.isMainProcess.equals(configuration.isMainProcess) || !Intrinsics.areEqual(this.invTimeThresholdMs, configuration.invTimeThresholdMs) || !Intrinsics.areEqual(this.tnsTimeThresholdMs, configuration.tnsTimeThresholdMs)) {
                return false;
            }
            Object obj3 = Boolean.TRUE;
            return obj3.equals(obj3) && obj2.equals(obj2);
        }

        public final int hashCode() {
            Long l = this.sessionSampleRate;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.telemetrySampleRate;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 29791;
            Long l3 = this.traceSampleRate;
            int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 923521;
            Long l4 = this.sessionReplaySampleRate;
            int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 29791;
            Boolean bool = this.startRecordingImmediately;
            int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.useProxy, (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, -997072353);
            ArrayList arrayList = this.selectedTracingPropagators;
            int hashCode5 = (m + (arrayList == null ? 0 : arrayList.hashCode())) * 961;
            String str = this.textAndInputPrivacyLevel;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.imagePrivacyLevel;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.touchPrivacyLevel;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 28629151;
            Boolean bool2 = this.trackFrustrations;
            int m2 = ViewEvent$State$EnumUnboxingLocalUtility.m(this.trackInteractions, (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 961, 29791);
            Long l5 = this.numberOfDisplays;
            int hashCode9 = (m2 + (l5 == null ? 0 : l5.hashCode())) * 29791;
            Boolean bool3 = Boolean.FALSE;
            int m3 = ViewEvent$State$EnumUnboxingLocalUtility.m(bool3, hashCode9, 31);
            int i = this.viewTrackingStrategy;
            int ordinal = (m3 + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 29791;
            Boolean bool4 = this.trackBackgroundEvents;
            int hashCode10 = (ordinal + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Long l6 = this.mobileVitalsUpdatePeriod;
            int m4 = ViewEvent$State$EnumUnboxingLocalUtility.m(this.batchProcessingLevel, ViewEvent$State$EnumUnboxingLocalUtility.m(this.batchUploadFrequency, ViewEvent$State$EnumUnboxingLocalUtility.m(this.batchSize, ViewEvent$State$EnumUnboxingLocalUtility.m(this.trackNativeLongTasks, ViewEvent$State$EnumUnboxingLocalUtility.m(this.useTracing, ViewEvent$State$EnumUnboxingLocalUtility.m(this.trackNetworkRequests, ViewEvent$State$EnumUnboxingLocalUtility.m(this.trackErrors, (hashCode10 + (l6 == null ? 0 : l6.hashCode())) * 31, 31), 31), 29791), 28629151), 31), 31), -1807454463);
            String str4 = this.tracerApi;
            int hashCode11 = (m4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.tracerApiVersion;
            int m5 = ViewEvent$State$EnumUnboxingLocalUtility.m(this.isMainProcess, (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 29791, 31);
            Long l7 = this.invTimeThresholdMs;
            int hashCode12 = (m5 + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l8 = this.tnsTimeThresholdMs;
            return ViewEvent$State$EnumUnboxingLocalUtility.m(bool3, ViewEvent$State$EnumUnboxingLocalUtility.m(Boolean.TRUE, (hashCode12 + (l8 != null ? l8.hashCode() : 0)) * 961, 31), 923521);
        }

        public final String toString() {
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            StringBuilder sb = new StringBuilder("Configuration(sessionSampleRate=");
            sb.append(this.sessionSampleRate);
            sb.append(", telemetrySampleRate=");
            sb.append(this.telemetrySampleRate);
            sb.append(", telemetryConfigurationSampleRate=null, telemetryUsageSampleRate=null, traceSampleRate=");
            String str = "null";
            ViewEvent$State$EnumUnboxingLocalUtility.m(this.traceSampleRate, ", traceContextInjection=", "null", ", premiumSampleRate=null, replaySampleRate=null, sessionReplaySampleRate=", sb);
            ViewEvent$State$EnumUnboxingLocalUtility.m(this.sessionReplaySampleRate, ", trackingConsent=", "null", ", startSessionReplayRecordingManually=null, startRecordingImmediately=", sb);
            Thread$State$EnumUnboxingLocalUtility.m(sb, this.startRecordingImmediately, ", useProxy=", this.useProxy, ", useBeforeSend=null, silentMultipleInit=null, trackSessionAcrossSubdomains=null, trackResources=null, trackLongTask=null, trackBfcacheViews=null, useCrossSiteSessionCookie=null, usePartitionedCrossSiteSessionCookie=null, useSecureSessionCookie=null, allowFallbackToLocalStorage=null, sessionPersistence=");
            sb.append("null");
            sb.append(", storeContextsAcrossPages=null, allowUntrustedEvents=null, actionNameAttribute=null, useAllowedTracingOrigins=null, useAllowedTracingUrls=null, selectedTracingPropagators=");
            sb.append(this.selectedTracingPropagators);
            sb.append(", defaultPrivacyLevel=null, textAndInputPrivacyLevel=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.textAndInputPrivacyLevel, ", imagePrivacyLevel=", this.imagePrivacyLevel, ", touchPrivacyLevel=");
            Thread$State$EnumUnboxingLocalUtility.m(sb, this.touchPrivacyLevel, ", enablePrivacyForActionName=null, useExcludedActivityUrls=null, useWorkerUrl=null, compressIntakeRequests=null, trackFrustrations=", this.trackFrustrations, ", trackViewsManually=null, trackInteractions=");
            sb.append(this.trackInteractions);
            sb.append(", trackUserInteractions=null, forwardErrorsToLogs=null, numberOfDisplays=");
            sb.append(this.numberOfDisplays);
            sb.append(", forwardConsoleLogs=null, forwardReports=null, useLocalEncryption=");
            sb.append(bool);
            sb.append(", viewTrackingStrategy=");
            int i = this.viewTrackingStrategy;
            if (i == 1) {
                str = "ACTIVITYVIEWTRACKINGSTRATEGY";
            } else if (i == 2) {
                str = "FRAGMENTVIEWTRACKINGSTRATEGY";
            } else if (i == 3) {
                str = "MIXEDVIEWTRACKINGSTRATEGY";
            } else if (i == 4) {
                str = "NAVIGATIONVIEWTRACKINGSTRATEGY";
            }
            sb.append(str);
            sb.append(", swiftuiViewTrackingEnabled=null, swiftuiActionTrackingEnabled=null, trackBackgroundEvents=");
            sb.append(this.trackBackgroundEvents);
            sb.append(", mobileVitalsUpdatePeriod=");
            sb.append(this.mobileVitalsUpdatePeriod);
            sb.append(", trackErrors=");
            Thread$State$EnumUnboxingLocalUtility.m(sb, this.trackErrors, ", trackNetworkRequests=", this.trackNetworkRequests, ", useTracing=");
            Thread$State$EnumUnboxingLocalUtility.m(sb, this.useTracing, ", trackNativeViews=null, trackNativeErrors=null, trackNativeLongTasks=", this.trackNativeLongTasks, ", trackCrossPlatformLongTasks=null, useFirstPartyHosts=null, initializationType=null, trackFlutterPerformance=null, batchSize=");
            Thread$State$EnumUnboxingLocalUtility.m(sb, this.batchSize, ", batchUploadFrequency=", this.batchUploadFrequency, ", batchProcessingLevel=");
            ViewEvent$State$EnumUnboxingLocalUtility.m(this.batchProcessingLevel, ", backgroundTasksEnabled=null, reactVersion=null, reactNativeVersion=null, dartVersion=null, unityVersion=null, appHangThreshold=null, usePciIntake=null, tracerApi=", this.tracerApi, ", tracerApiVersion=", sb);
            Thread$State$EnumUnboxingLocalUtility.m(sb, this.tracerApiVersion, ", sendLogsAfterSessionExpiration=null, plugins=null, isMainProcess=", this.isMainProcess, ", invTimeThresholdMs=");
            Thread$State$EnumUnboxingLocalUtility.m(sb, this.invTimeThresholdMs, ", tnsTimeThresholdMs=", this.tnsTimeThresholdMs, ", trackFeatureFlagsForEvents=null, trackAnonymousUser=");
            sb.append(bool2);
            sb.append(", useAllowedTrackingOrigins=");
            sb.append(bool);
            sb.append(", sdkVersion=null, source=null, variant=null, remoteConfigurationId=null)");
            return sb.toString();
        }
    }

    public final class Device {
        public final String architecture;
        public final String brand;
        public final String model;

        public Device(String str, String str2, String str3) {
            this.architecture = str;
            this.brand = str2;
            this.model = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return false;
            }
            Device device = (Device) obj;
            return Intrinsics.areEqual(this.architecture, device.architecture) && Intrinsics.areEqual(this.brand, device.brand) && Intrinsics.areEqual(this.model, device.model);
        }

        public final int hashCode() {
            String str = this.architecture;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.brand;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.model;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Device(architecture=", this.architecture, ", brand=", this.brand, ", model="), this.model, ")");
        }
    }

    public final class Os {
        public final String build;
        public final String name;
        public final String version;

        public Os(String str, String str2, String str3) {
            this.build = str;
            this.name = str2;
            this.version = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Os)) {
                return false;
            }
            Os os = (Os) obj;
            return Intrinsics.areEqual(this.build, os.build) && Intrinsics.areEqual(this.name, os.name) && Intrinsics.areEqual(this.version, os.version);
        }

        public final int hashCode() {
            String str = this.build;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.version;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Os(build=", this.build, ", name=", this.name, ", version="), this.version, ")");
        }
    }

    public enum SelectedTracingPropagator {
        DATADOG("datadog"),
        B3("b3"),
        B3MULTI("b3multi"),
        TRACECONTEXT("tracecontext");

        public final String jsonValue;

        SelectedTracingPropagator(String str) {
            this.jsonValue = str;
        }
    }

    public final class Session {
        public final String id;

        public Session(String str) {
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Session) && Intrinsics.areEqual(this.id, ((Session) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Session(id=", this.id, ")");
        }
    }

    public final class Telemetry {
        public static final String[] RESERVED_PROPERTIES = {"device", "os", "type", BreadcrumbHelper.Category.CONFIGURATION};
        public final Map additionalProperties;
        public final Configuration configuration;
        public final Device device;
        public final Os os;

        /* renamed from: type, reason: collision with root package name */
        public final String f975type;

        public Telemetry(Device device, Os os, Configuration configuration) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.device = device;
            this.os = os;
            this.configuration = configuration;
            this.additionalProperties = linkedHashMap;
            this.f975type = BreadcrumbHelper.Category.CONFIGURATION;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Telemetry)) {
                return false;
            }
            Telemetry telemetry = (Telemetry) obj;
            return Intrinsics.areEqual(this.device, telemetry.device) && Intrinsics.areEqual(this.os, telemetry.os) && Intrinsics.areEqual(this.configuration, telemetry.configuration) && Intrinsics.areEqual(this.additionalProperties, telemetry.additionalProperties);
        }

        public final int hashCode() {
            Device device = this.device;
            int hashCode = (device == null ? 0 : device.hashCode()) * 31;
            Os os = this.os;
            return this.additionalProperties.hashCode() + ((this.configuration.hashCode() + ((hashCode + (os != null ? os.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            return "Telemetry(device=" + this.device + ", os=" + this.os + ", configuration=" + this.configuration + ", additionalProperties=" + this.additionalProperties + ")";
        }
    }

    public final class View {
        public final String id;

        public View(String str) {
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof View) && Intrinsics.areEqual(this.id, ((View) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("View(id=", this.id, ")");
        }
    }

    public TelemetryConfigurationEvent(zza zzaVar, long j, int i, String str, Application application, Session session, View view, Action action, Float f, Telemetry telemetry) {
        if (i == 0) {
            throw null;
        }
        str.getClass();
        this.dd = zzaVar;
        this.date = j;
        this.source = i;
        this.version = str;
        this.application = application;
        this.session = session;
        this.view = view;
        this.action = action;
        this.effectiveSampleRate = f;
        this.telemetry = telemetry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TelemetryConfigurationEvent) {
            TelemetryConfigurationEvent telemetryConfigurationEvent = (TelemetryConfigurationEvent) obj;
            if (this.dd == telemetryConfigurationEvent.dd && this.date == telemetryConfigurationEvent.date && this.source == telemetryConfigurationEvent.source && Intrinsics.areEqual(this.version, telemetryConfigurationEvent.version) && this.application.equals(telemetryConfigurationEvent.application) && this.session.equals(telemetryConfigurationEvent.session) && Intrinsics.areEqual(this.view, telemetryConfigurationEvent.view) && Intrinsics.areEqual(this.action, telemetryConfigurationEvent.action) && this.effectiveSampleRate.equals(telemetryConfigurationEvent.effectiveSampleRate) && this.telemetry.equals(telemetryConfigurationEvent.telemetry)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Thread$State$EnumUnboxingLocalUtility.m(this.source, (((Long.hashCode(this.date) + (this.dd.hashCode() * 31)) * 31) + 391076367) * 31, 31), 31, this.version), 31, this.application.id), 31, this.session.id);
        View view = this.view;
        int hashCode = (m + (view == null ? 0 : view.id.hashCode())) * 31;
        Action action = this.action;
        int hashCode2 = action != null ? action.id.hashCode() : 0;
        return this.telemetry.hashCode() + ((this.effectiveSampleRate.hashCode() + ((hashCode + hashCode2) * 31)) * 961);
    }

    public final JsonObject toJson() {
        String str;
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("format_version", (Number) 2L);
        jsonObject.add("_dd", jsonObject2);
        jsonObject.addProperty("type", "telemetry");
        jsonObject.addProperty(InquiryField.DateField.TYPE, Long.valueOf(this.date));
        jsonObject.addProperty("service", "dd-sdk-android");
        jsonObject.add("source", new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$18(this.source)));
        jsonObject.addProperty("version", this.version);
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("id", this.application.id);
        jsonObject.add("application", jsonObject3);
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("id", this.session.id);
        jsonObject.add("session", jsonObject4);
        View view = this.view;
        if (view != null) {
            JsonObject jsonObject5 = new JsonObject();
            jsonObject5.addProperty("id", view.id);
            jsonObject.add("view", jsonObject5);
        }
        Action action = this.action;
        if (action != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("id", action.id);
            jsonObject.add("action", jsonObject6);
        }
        jsonObject.addProperty("effective_sample_rate", this.effectiveSampleRate);
        JsonObject jsonObject7 = new JsonObject();
        Telemetry telemetry = this.telemetry;
        Device device = telemetry.device;
        if (device != null) {
            JsonObject jsonObject8 = new JsonObject();
            String str2 = device.architecture;
            if (str2 != null) {
                jsonObject8.addProperty("architecture", str2);
            }
            String str3 = device.brand;
            if (str3 != null) {
                jsonObject8.addProperty("brand", str3);
            }
            String str4 = device.model;
            if (str4 != null) {
                jsonObject8.addProperty("model", str4);
            }
            jsonObject7.add("device", jsonObject8);
        }
        Os os = telemetry.os;
        if (os != null) {
            JsonObject jsonObject9 = new JsonObject();
            String str5 = os.build;
            if (str5 != null) {
                jsonObject9.addProperty("build", str5);
            }
            String str6 = os.name;
            if (str6 != null) {
                jsonObject9.addProperty("name", str6);
            }
            String str7 = os.version;
            if (str7 != null) {
                jsonObject9.addProperty("version", str7);
            }
            jsonObject7.add("os", jsonObject9);
        }
        jsonObject7.addProperty("type", telemetry.f975type);
        Configuration configuration = telemetry.configuration;
        configuration.getClass();
        JsonObject jsonObject10 = new JsonObject();
        Long l = configuration.sessionSampleRate;
        if (l != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l, jsonObject10, "session_sample_rate");
        }
        Long l2 = configuration.telemetrySampleRate;
        if (l2 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l2, jsonObject10, "telemetry_sample_rate");
        }
        Long l3 = configuration.traceSampleRate;
        if (l3 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l3, jsonObject10, "trace_sample_rate");
        }
        Long l4 = configuration.sessionReplaySampleRate;
        if (l4 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l4, jsonObject10, "session_replay_sample_rate");
        }
        Boolean bool = configuration.startRecordingImmediately;
        if (bool != null) {
            jsonObject10.addProperty("start_recording_immediately", bool);
        }
        jsonObject10.addProperty("use_proxy", configuration.useProxy);
        ArrayList arrayList = configuration.selectedTracingPropagators;
        if (arrayList != null) {
            JsonArray jsonArray = new JsonArray(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jsonArray.add(new JsonPrimitive(((SelectedTracingPropagator) it.next()).jsonValue));
            }
            jsonObject10.add("selected_tracing_propagators", jsonArray);
        }
        String str8 = configuration.textAndInputPrivacyLevel;
        if (str8 != null) {
            jsonObject10.addProperty("text_and_input_privacy_level", str8);
        }
        String str9 = configuration.imagePrivacyLevel;
        if (str9 != null) {
            jsonObject10.addProperty("image_privacy_level", str9);
        }
        String str10 = configuration.touchPrivacyLevel;
        if (str10 != null) {
            jsonObject10.addProperty("touch_privacy_level", str10);
        }
        Boolean bool2 = configuration.trackFrustrations;
        if (bool2 != null) {
            jsonObject10.addProperty("track_frustrations", bool2);
        }
        jsonObject10.addProperty("track_interactions", configuration.trackInteractions);
        Long l5 = configuration.numberOfDisplays;
        if (l5 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l5, jsonObject10, "number_of_displays");
        }
        Boolean bool3 = Boolean.FALSE;
        jsonObject10.addProperty("use_local_encryption", bool3);
        int i = configuration.viewTrackingStrategy;
        if (i != 0) {
            if (i == 1) {
                str = "ActivityViewTrackingStrategy";
            } else if (i == 2) {
                str = "FragmentViewTrackingStrategy";
            } else if (i == 3) {
                str = "MixedViewTrackingStrategy";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "NavigationViewTrackingStrategy";
            }
            jsonObject10.add("view_tracking_strategy", new JsonPrimitive(str));
        }
        Boolean bool4 = configuration.trackBackgroundEvents;
        if (bool4 != null) {
            jsonObject10.addProperty("track_background_events", bool4);
        }
        Long l6 = configuration.mobileVitalsUpdatePeriod;
        if (l6 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l6, jsonObject10, "mobile_vitals_update_period");
        }
        jsonObject10.addProperty("track_errors", configuration.trackErrors);
        jsonObject10.addProperty("track_network_requests", configuration.trackNetworkRequests);
        jsonObject10.addProperty("use_tracing", configuration.useTracing);
        jsonObject10.addProperty("track_native_long_tasks", configuration.trackNativeLongTasks);
        RumErrorSource$EnumUnboxingLocalUtility.m(configuration.batchSize, jsonObject10, "batch_size");
        RumErrorSource$EnumUnboxingLocalUtility.m(configuration.batchUploadFrequency, jsonObject10, "batch_upload_frequency");
        RumErrorSource$EnumUnboxingLocalUtility.m(configuration.batchProcessingLevel, jsonObject10, "batch_processing_level");
        String str11 = configuration.tracerApi;
        if (str11 != null) {
            jsonObject10.addProperty("tracer_api", str11);
        }
        String str12 = configuration.tracerApiVersion;
        if (str12 != null) {
            jsonObject10.addProperty("tracer_api_version", str12);
        }
        jsonObject10.addProperty("is_main_process", configuration.isMainProcess);
        Long l7 = configuration.invTimeThresholdMs;
        if (l7 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l7, jsonObject10, "inv_time_threshold_ms");
        }
        Long l8 = configuration.tnsTimeThresholdMs;
        if (l8 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l8, jsonObject10, "tns_time_threshold_ms");
        }
        jsonObject10.addProperty("track_anonymous_user", Boolean.TRUE);
        jsonObject10.addProperty("use_allowed_tracking_origins", bool3);
        jsonObject7.add(BreadcrumbHelper.Category.CONFIGURATION, jsonObject10);
        for (Map.Entry entry : telemetry.additionalProperties.entrySet()) {
            String str13 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!ArraysKt___ArraysKt.contains(Telemetry.RESERVED_PROPERTIES, str13)) {
                jsonObject7.add(str13, JsonSerializer.toJsonElement(value));
            }
        }
        jsonObject.add("telemetry", jsonObject7);
        return jsonObject;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TelemetryConfigurationEvent(dd=");
        sb.append(this.dd);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", service=dd-sdk-android, source=");
        switch (this.source) {
            case 1:
                str = "ANDROID";
                break;
            case 2:
                str = "IOS";
                break;
            case 3:
                str = "BROWSER";
                break;
            case 4:
                str = "FLUTTER";
                break;
            case 5:
                str = "REACT_NATIVE";
                break;
            case 6:
                str = "UNITY";
                break;
            case 7:
                str = "KOTLIN_MULTIPLATFORM";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", application=");
        sb.append(this.application);
        sb.append(", session=");
        sb.append(this.session);
        sb.append(", view=");
        sb.append(this.view);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", effectiveSampleRate=");
        sb.append(this.effectiveSampleRate);
        sb.append(", experimentalFeatures=null, telemetry=");
        sb.append(this.telemetry);
        sb.append(")");
        return sb.toString();
    }
}
