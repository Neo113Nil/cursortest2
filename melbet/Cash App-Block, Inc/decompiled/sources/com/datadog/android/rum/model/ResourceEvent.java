package com.datadog.android.rum.model;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_face.zzdf;
import com.google.android.gms.internal.mlkit_vision_face.zzdg;
import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.google.android.gms.internal.mlkit_vision_face.zzdj;
import com.google.android.gms.internal.mlkit_vision_face.zzdt;
import com.google.android.gms.internal.mlkit_vision_face.zzdu;
import com.google.android.gms.internal.mlkit_vision_face.zzdw;
import com.google.android.gms.internal.mlkit_vision_face.zzdx;
import com.google.android.gms.internal.mlkit_vision_face.zzea;
import com.google.android.gms.internal.mlkit_vision_face.zzja;
import com.google.android.gms.internal.mlkit_vision_face.zzjg;
import com.google.android.gms.internal.mlkit_vision_face.zzjh;
import com.google.android.gms.internal.mlkit_vision_face.zzji;
import com.google.android.gms.internal.mlkit_vision_face.zzjk;
import com.google.android.gms.internal.mlkit_vision_face.zzjl;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.franklin.common.SyncValue;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ResourceEvent {
    public final Account account;
    public final Action action;
    public final Application application;
    public final String buildId;
    public final String buildVersion;
    public final CiTest ciTest;
    public final Connectivity connectivity;
    public final Container container;
    public final Context context;
    public final long date;
    public final Dd dd;
    public final String ddtags;
    public final Device device;
    public final Display display;
    public final Os os;
    public final Resource resource;
    public final String service;
    public final ResourceEventSession session;
    public final int source;
    public final Synthetics synthetics;
    public final Usr usr;
    public final String version;
    public final ResourceEventView view;

    public final class Account {
        public static final String[] RESERVED_PROPERTIES = {"id", "name"};
        public final Map additionalProperties;
        public final String id;
        public final String name;

        public Account(String str, String str2, Map map) {
            str.getClass();
            this.id = str;
            this.name = str2;
            this.additionalProperties = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Account)) {
                return false;
            }
            Account account = (Account) obj;
            return Intrinsics.areEqual(this.id, account.id) && Intrinsics.areEqual(this.name, account.name) && this.additionalProperties.equals(account.additionalProperties);
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.name;
            return this.additionalProperties.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Account(id=", this.id, ", name=", this.name, ", additionalProperties="), this.additionalProperties);
        }
    }

    public final class Action {
        public final List id;

        public Action(List list) {
            list.getClass();
            this.id = list;
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
            return CameraState$Type$EnumUnboxingLocalUtility.m("Action(id=", ")", this.id);
        }
    }

    public final class Application {
        public final String currentLocale;
        public final String id;

        public Application(String str, String str2) {
            str.getClass();
            this.id = str;
            this.currentLocale = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.areEqual(this.id, application.id) && Intrinsics.areEqual(this.currentLocale, application.currentLocale);
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.currentLocale;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Application(id=", this.id, ", currentLocale=", this.currentLocale, ")");
        }
    }

    public final class Cellular {
        public final String carrierName;
        public final String technology;

        public Cellular(String str, String str2) {
            this.technology = str;
            this.carrierName = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cellular)) {
                return false;
            }
            Cellular cellular = (Cellular) obj;
            return Intrinsics.areEqual(this.technology, cellular.technology) && Intrinsics.areEqual(this.carrierName, cellular.carrierName);
        }

        public final int hashCode() {
            String str = this.technology;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.carrierName;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Cellular(technology=", this.technology, ", carrierName=", this.carrierName, ")");
        }
    }

    public final class CiTest {
        public final String testExecutionId;

        public CiTest(String str) {
            str.getClass();
            this.testExecutionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CiTest) && Intrinsics.areEqual(this.testExecutionId, ((CiTest) obj).testExecutionId);
        }

        public final int hashCode() {
            return this.testExecutionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CiTest(testExecutionId=", this.testExecutionId, ")");
        }
    }

    public abstract class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        public static ResourceEvent fromJsonObject(JsonObject jsonObject) {
            ResourceEvent resourceEvent;
            int i;
            JsonObject asJsonObject;
            JsonObject asJsonObject2;
            JsonObject asJsonObject3;
            JsonObject asJsonObject4;
            JsonObject asJsonObject5;
            JsonObject asJsonObject6;
            JsonObject asJsonObject7;
            JsonObject asJsonObject8;
            JsonObject asJsonObject9;
            JsonObject asJsonObject10;
            JsonObject asJsonObject11;
            String asString;
            jsonObject.getClass();
            try {
                long asLong = jsonObject.get(InquiryField.DateField.TYPE).getAsLong();
                JsonObject asJsonObject12 = jsonObject.get("application").getAsJsonObject();
                asJsonObject12.getClass();
                Application fromJsonObject = zzdh.fromJsonObject(asJsonObject12);
                JsonElement jsonElement = jsonObject.get("service");
                String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = jsonObject.get("version");
                String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = jsonObject.get("build_version");
                String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                JsonElement jsonElement4 = jsonObject.get("build_id");
                String asString5 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                JsonElement jsonElement5 = jsonObject.get("ddtags");
                String asString6 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                JsonObject asJsonObject13 = jsonObject.get("session").getAsJsonObject();
                asJsonObject13.getClass();
                ResourceEventSession fromJsonObject2 = zzjh.fromJsonObject(asJsonObject13);
                JsonElement jsonElement6 = jsonObject.get("source");
                int i2 = 0;
                if (jsonElement6 != null && (asString = jsonElement6.getAsString()) != null) {
                    int[] values = CameraSelector$$ExternalSyntheticOutline0.values(8);
                    resourceEvent = null;
                    try {
                        int length = values.length;
                        while (i2 < length) {
                            int i3 = values[i2];
                            int i4 = length;
                            if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$20(i3).equals(asString)) {
                                i = i3;
                            } else {
                                i2++;
                                length = i4;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    } catch (IllegalStateException e) {
                        e = e;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ResourceEvent", e);
                        return resourceEvent;
                    } catch (NullPointerException e2) {
                        e = e2;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ResourceEvent", e);
                        return resourceEvent;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ResourceEvent", e);
                        return resourceEvent;
                    }
                }
                resourceEvent = null;
                i = 0;
                JsonObject asJsonObject14 = jsonObject.get("view").getAsJsonObject();
                asJsonObject14.getClass();
                ResourceEventView fromJsonObject3 = zzji.fromJsonObject(asJsonObject14);
                JsonElement jsonElement7 = jsonObject.get("usr");
                Usr fromJsonObject4 = (jsonElement7 == null || (asJsonObject11 = jsonElement7.getAsJsonObject()) == null) ? resourceEvent : zzjl.fromJsonObject(asJsonObject11);
                JsonElement jsonElement8 = jsonObject.get("account");
                Account fromJsonObject5 = (jsonElement8 == null || (asJsonObject10 = jsonElement8.getAsJsonObject()) == null) ? resourceEvent : zzdf.fromJsonObject(asJsonObject10);
                JsonElement jsonElement9 = jsonObject.get("connectivity");
                Connectivity fromJsonObject6 = (jsonElement9 == null || (asJsonObject9 = jsonElement9.getAsJsonObject()) == null) ? resourceEvent : zzdt.fromJsonObject(asJsonObject9);
                JsonElement jsonElement10 = jsonObject.get("display");
                Display fromJsonObject7 = (jsonElement10 == null || (asJsonObject8 = jsonElement10.getAsJsonObject()) == null) ? resourceEvent : zzea.fromJsonObject(asJsonObject8);
                JsonElement jsonElement11 = jsonObject.get("synthetics");
                Synthetics fromJsonObject8 = (jsonElement11 == null || (asJsonObject7 = jsonElement11.getAsJsonObject()) == null) ? resourceEvent : zzjk.fromJsonObject(asJsonObject7);
                JsonElement jsonElement12 = jsonObject.get("ci_test");
                CiTest fromJsonObject9 = (jsonElement12 == null || (asJsonObject6 = jsonElement12.getAsJsonObject()) == null) ? resourceEvent : zzdj.fromJsonObject(asJsonObject6);
                JsonElement jsonElement13 = jsonObject.get("os");
                Os fromJsonObject10 = (jsonElement13 == null || (asJsonObject5 = jsonElement13.getAsJsonObject()) == null) ? resourceEvent : zzja.fromJsonObject(asJsonObject5);
                JsonElement jsonElement14 = jsonObject.get("device");
                Device fromJsonObject11 = (jsonElement14 == null || (asJsonObject4 = jsonElement14.getAsJsonObject()) == null) ? resourceEvent : SyncValue.Value.fromJsonObject(asJsonObject4);
                JsonObject asJsonObject15 = jsonObject.get("_dd").getAsJsonObject();
                asJsonObject15.getClass();
                Dd fromJsonObject12 = zzdx.fromJsonObject(asJsonObject15);
                JsonElement jsonElement15 = jsonObject.get("context");
                Context fromJsonObject13 = (jsonElement15 == null || (asJsonObject3 = jsonElement15.getAsJsonObject()) == null) ? resourceEvent : zzdw.fromJsonObject(asJsonObject3);
                JsonElement jsonElement16 = jsonObject.get("action");
                Action fromJsonObject14 = (jsonElement16 == null || (asJsonObject2 = jsonElement16.getAsJsonObject()) == null) ? resourceEvent : zzdg.fromJsonObject(asJsonObject2);
                JsonElement jsonElement17 = jsonObject.get("container");
                Container fromJsonObject15 = (jsonElement17 == null || (asJsonObject = jsonElement17.getAsJsonObject()) == null) ? resourceEvent : zzdu.fromJsonObject(asJsonObject);
                String asString7 = jsonObject.get("type").getAsString();
                JsonObject asJsonObject16 = jsonObject.get("resource").getAsJsonObject();
                asJsonObject16.getClass();
                Resource fromJsonObject16 = zzjg.fromJsonObject(asJsonObject16);
                if (Intrinsics.areEqual(asString7, "resource")) {
                    return new ResourceEvent(asLong, fromJsonObject, asString2, asString3, asString4, asString5, asString6, fromJsonObject2, i, fromJsonObject3, fromJsonObject4, fromJsonObject5, fromJsonObject6, fromJsonObject7, fromJsonObject8, fromJsonObject9, fromJsonObject10, fromJsonObject11, fromJsonObject12, fromJsonObject13, fromJsonObject14, fromJsonObject15, fromJsonObject16);
                }
                throw new IllegalStateException("Check failed.");
            } catch (IllegalStateException e4) {
                e = e4;
                resourceEvent = null;
            } catch (NullPointerException e5) {
                e = e5;
                resourceEvent = null;
            } catch (NumberFormatException e6) {
                e = e6;
                resourceEvent = null;
            }
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewStablecoinUri.deepLinkSpecs;
        }
    }

    public final class Configuration {
        public final Number profilingSampleRate;
        public final Number sessionReplaySampleRate;
        public final Number sessionSampleRate;

        public Configuration(Number number, Number number2, Number number3) {
            number.getClass();
            this.sessionSampleRate = number;
            this.sessionReplaySampleRate = number2;
            this.profilingSampleRate = number3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return Intrinsics.areEqual(this.sessionSampleRate, configuration.sessionSampleRate) && Intrinsics.areEqual(this.sessionReplaySampleRate, configuration.sessionReplaySampleRate) && Intrinsics.areEqual(this.profilingSampleRate, configuration.profilingSampleRate);
        }

        public final int hashCode() {
            int hashCode = this.sessionSampleRate.hashCode() * 31;
            Number number = this.sessionReplaySampleRate;
            int hashCode2 = (hashCode + (number == null ? 0 : number.hashCode())) * 31;
            Number number2 = this.profilingSampleRate;
            return hashCode2 + (number2 != null ? number2.hashCode() : 0);
        }

        public final String toString() {
            return "Configuration(sessionSampleRate=" + this.sessionSampleRate + ", sessionReplaySampleRate=" + this.sessionReplaySampleRate + ", profilingSampleRate=" + this.profilingSampleRate + ")";
        }
    }

    public final class Connect {
        public final long duration;
        public final long start;

        public Connect(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connect)) {
                return false;
            }
            Connect connect = (Connect) obj;
            return this.duration == connect.duration && this.start == connect.start;
        }

        public final int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.start, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.duration, "Connect(duration=", ", start="));
        }
    }

    public final class Connectivity {
        public final Cellular cellular;
        public final int effectiveType;
        public final List interfaces;
        public final int status;

        public Connectivity(int i, List list, int i2, Cellular cellular) {
            if (i == 0) {
                throw null;
            }
            this.status = i;
            this.interfaces = list;
            this.effectiveType = i2;
            this.cellular = cellular;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connectivity)) {
                return false;
            }
            Connectivity connectivity = (Connectivity) obj;
            return this.status == connectivity.status && Intrinsics.areEqual(this.interfaces, connectivity.interfaces) && this.effectiveType == connectivity.effectiveType && Intrinsics.areEqual(this.cellular, connectivity.cellular);
        }

        public final int hashCode() {
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.status) * 31;
            List list = this.interfaces;
            int hashCode = (ordinal + (list == null ? 0 : list.hashCode())) * 31;
            int i = this.effectiveType;
            int ordinal2 = (hashCode + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 31;
            Cellular cellular = this.cellular;
            return ordinal2 + (cellular != null ? cellular.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Connectivity(status=");
            String str = "null";
            int i = this.status;
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "MAYBE" : "NOT_CONNECTED" : "CONNECTED");
            sb.append(", interfaces=");
            sb.append(this.interfaces);
            sb.append(", effectiveType=");
            int i2 = this.effectiveType;
            if (i2 == 1) {
                str = "SLOW_2G";
            } else if (i2 == 2) {
                str = "2G";
            } else if (i2 == 3) {
                str = "3G";
            } else if (i2 == 4) {
                str = "4G";
            }
            sb.append(str);
            sb.append(", cellular=");
            sb.append(this.cellular);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Container {
        public final int source;
        public final ContainerView view;

        public Container(ContainerView containerView, int i) {
            if (i == 0) {
                throw null;
            }
            this.view = containerView;
            this.source = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Container)) {
                return false;
            }
            Container container = (Container) obj;
            return this.view.equals(container.view) && this.source == container.source;
        }

        public final int hashCode() {
            return CameraSelector$$ExternalSyntheticOutline0.ordinal(this.source) + (this.view.id.hashCode() * 31);
        }

        public final String toString() {
            return "Container(view=" + this.view + ", source=" + ErrorEvent$Status$EnumUnboxingLocalUtility.stringValueOf$20(this.source) + ")";
        }
    }

    public final class ContainerView {
        public final String id;

        public ContainerView(String str) {
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContainerView) && Intrinsics.areEqual(this.id, ((ContainerView) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContainerView(id=", this.id, ")");
        }
    }

    public final class Context {
        public final LinkedHashMap additionalProperties;

        public Context(LinkedHashMap linkedHashMap) {
            this.additionalProperties = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Context) && this.additionalProperties.equals(((Context) obj).additionalProperties);
        }

        public final int hashCode() {
            return this.additionalProperties.hashCode();
        }

        public final String toString() {
            return "Context(additionalProperties=" + this.additionalProperties + ")";
        }
    }

    public final class Dd {
        public final String browserSdkVersion;
        public final Configuration configuration;
        public final Boolean discarded;
        public final String parentSpanId;
        public final Number rulePsr;
        public final String sdkName;
        public final DdSession session;
        public final String spanId;
        public final String traceId;

        public Dd(DdSession ddSession, Configuration configuration, String str, String str2, String str3, String str4, String str5, Number number, Boolean bool) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.sdkName = str2;
            this.spanId = str3;
            this.parentSpanId = str4;
            this.traceId = str5;
            this.rulePsr = number;
            this.discarded = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) obj;
            return Intrinsics.areEqual(this.session, dd.session) && Intrinsics.areEqual(this.configuration, dd.configuration) && Intrinsics.areEqual(this.browserSdkVersion, dd.browserSdkVersion) && Intrinsics.areEqual(this.sdkName, dd.sdkName) && Intrinsics.areEqual(this.spanId, dd.spanId) && Intrinsics.areEqual(this.parentSpanId, dd.parentSpanId) && Intrinsics.areEqual(this.traceId, dd.traceId) && Intrinsics.areEqual(this.rulePsr, dd.rulePsr) && Intrinsics.areEqual(this.discarded, dd.discarded);
        }

        public final int hashCode() {
            DdSession ddSession = this.session;
            int hashCode = (ddSession == null ? 0 : ddSession.hashCode()) * 31;
            Configuration configuration = this.configuration;
            int hashCode2 = (hashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
            String str = this.browserSdkVersion;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sdkName;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.spanId;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.parentSpanId;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.traceId;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Number number = this.rulePsr;
            int hashCode8 = (hashCode7 + (number == null ? 0 : number.hashCode())) * 31;
            Boolean bool = this.discarded;
            return hashCode8 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dd(session=");
            sb.append(this.session);
            sb.append(", configuration=");
            sb.append(this.configuration);
            sb.append(", browserSdkVersion=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.browserSdkVersion, ", sdkName=", this.sdkName, ", spanId=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.spanId, ", parentSpanId=", this.parentSpanId, ", traceId=");
            sb.append(this.traceId);
            sb.append(", rulePsr=");
            sb.append(this.rulePsr);
            sb.append(", discarded=");
            return Thread$State$EnumUnboxingLocalUtility.m(sb, this.discarded, ")");
        }
    }

    public final class DdSession {
        public final Plan plan;
        public final int sessionPrecondition;

        public DdSession(Plan plan, int i) {
            this.plan = plan;
            this.sessionPrecondition = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DdSession)) {
                return false;
            }
            DdSession ddSession = (DdSession) obj;
            return this.plan == ddSession.plan && this.sessionPrecondition == ddSession.sessionPrecondition;
        }

        public final int hashCode() {
            Plan plan = this.plan;
            int hashCode = (plan == null ? 0 : plan.hashCode()) * 31;
            int i = this.sessionPrecondition;
            return hashCode + (i != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i) : 0);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("DdSession(plan=");
            sb.append(this.plan);
            sb.append(", sessionPrecondition=");
            switch (this.sessionPrecondition) {
                case 1:
                    str = "USER_APP_LAUNCH";
                    break;
                case 2:
                    str = "INACTIVITY_TIMEOUT";
                    break;
                case 3:
                    str = "MAX_DURATION";
                    break;
                case 4:
                    str = "BACKGROUND_LAUNCH";
                    break;
                case 5:
                    str = "PREWARM";
                    break;
                case 6:
                    str = "FROM_NON_INTERACTIVE_SESSION";
                    break;
                case 7:
                    str = "EXPLICIT_STOP";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Device {
        public final String architecture;
        public final Number batteryLevel;
        public final String brand;
        public final Number brightnessLevel;
        public final String locale;
        public final List locales;
        public final String model;
        public final String name;
        public final Boolean powerSavingMode;
        public final String timeZone;

        /* renamed from: type, reason: collision with root package name */
        public final int f966type;

        public Device(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, Number number, Boolean bool, Number number2) {
            this.f966type = i;
            this.name = str;
            this.model = str2;
            this.brand = str3;
            this.architecture = str4;
            this.locale = str5;
            this.locales = list;
            this.timeZone = str6;
            this.batteryLevel = number;
            this.powerSavingMode = bool;
            this.brightnessLevel = number2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return false;
            }
            Device device = (Device) obj;
            return this.f966type == device.f966type && Intrinsics.areEqual(this.name, device.name) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.brand, device.brand) && Intrinsics.areEqual(this.architecture, device.architecture) && Intrinsics.areEqual(this.locale, device.locale) && Intrinsics.areEqual(this.locales, device.locales) && Intrinsics.areEqual(this.timeZone, device.timeZone) && Intrinsics.areEqual(this.batteryLevel, device.batteryLevel) && Intrinsics.areEqual(this.powerSavingMode, device.powerSavingMode) && Intrinsics.areEqual(this.brightnessLevel, device.brightnessLevel);
        }

        public final int hashCode() {
            int i = this.f966type;
            int ordinal = (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) * 31;
            String str = this.name;
            int hashCode = (ordinal + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.model;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.brand;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.architecture;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List list = this.locales;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str6 = this.timeZone;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Number number = this.batteryLevel;
            int hashCode8 = (hashCode7 + (number == null ? 0 : number.hashCode())) * 31;
            Boolean bool = this.powerSavingMode;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Number number2 = this.brightnessLevel;
            return hashCode9 + (number2 != null ? number2.hashCode() : 0);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("Device(type=");
            switch (this.f966type) {
                case 1:
                    str = "MOBILE";
                    break;
                case 2:
                    str = "DESKTOP";
                    break;
                case 3:
                    str = "TABLET";
                    break;
                case 4:
                    str = "TV";
                    break;
                case 5:
                    str = "GAMING_CONSOLE";
                    break;
                case 6:
                    str = "BOT";
                    break;
                case 7:
                    str = "OTHER";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append(str);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", model=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.model, ", brand=", this.brand, ", architecture=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.architecture, ", locale=", this.locale, ", locales=");
            Recorder$$ExternalSyntheticOutline2.m(", timeZone=", this.timeZone, ", batteryLevel=", sb, this.locales);
            sb.append(this.batteryLevel);
            sb.append(", powerSavingMode=");
            sb.append(this.powerSavingMode);
            sb.append(", brightnessLevel=");
            sb.append(this.brightnessLevel);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Display {
        public final Viewport viewport;

        public Display(Viewport viewport) {
            this.viewport = viewport;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Display) && Intrinsics.areEqual(this.viewport, ((Display) obj).viewport);
        }

        public final int hashCode() {
            Viewport viewport = this.viewport;
            if (viewport == null) {
                return 0;
            }
            return viewport.hashCode();
        }

        public final String toString() {
            return "Display(viewport=" + this.viewport + ")";
        }
    }

    public final class Dns {
        public final long duration;
        public final long start;

        public Dns(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dns)) {
                return false;
            }
            Dns dns = (Dns) obj;
            return this.duration == dns.duration && this.start == dns.start;
        }

        public final int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.start, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.duration, "Dns(duration=", ", start="));
        }
    }

    public final class Download {
        public final long duration;
        public final long start;

        public Download(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Download)) {
                return false;
            }
            Download download = (Download) obj;
            return this.duration == download.duration && this.start == download.start;
        }

        public final int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.start, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.duration, "Download(duration=", ", start="));
        }
    }

    public final class Error {
        public final String code;
        public final List locations;
        public final String message;
        public final List path;

        public Error(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
            str.getClass();
            this.message = str;
            this.code = str2;
            this.locations = arrayList;
            this.path = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.code, error.code) && Intrinsics.areEqual(this.locations, error.locations) && Intrinsics.areEqual(this.path, error.path);
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            String str = this.code;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list = this.locations;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.path;
            return hashCode3 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(message=", this.message, ", code=", this.code, ", locations=");
            m.append(this.locations);
            m.append(", path=");
            m.append(this.path);
            m.append(")");
            return m.toString();
        }
    }

    public final class FirstByte {
        public final long duration;
        public final long start;

        public FirstByte(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FirstByte)) {
                return false;
            }
            FirstByte firstByte = (FirstByte) obj;
            return this.duration == firstByte.duration && this.start == firstByte.start;
        }

        public final int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.start, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.duration, "FirstByte(duration=", ", start="));
        }
    }

    public final class Graphql {
        public final Long errorCount;
        public final List errors;
        public final String operationName;
        public final int operationType;
        public final String payload;
        public final String variables;

        public Graphql(int i, String str, String str2, String str3, Long l, ArrayList arrayList) {
            if (i == 0) {
                throw null;
            }
            this.operationType = i;
            this.operationName = str;
            this.payload = str2;
            this.variables = str3;
            this.errorCount = l;
            this.errors = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Graphql)) {
                return false;
            }
            Graphql graphql = (Graphql) obj;
            return this.operationType == graphql.operationType && Intrinsics.areEqual(this.operationName, graphql.operationName) && Intrinsics.areEqual(this.payload, graphql.payload) && Intrinsics.areEqual(this.variables, graphql.variables) && Intrinsics.areEqual(this.errorCount, graphql.errorCount) && Intrinsics.areEqual(this.errors, graphql.errors);
        }

        public final int hashCode() {
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.operationType) * 31;
            String str = this.operationName;
            int hashCode = (ordinal + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.payload;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.variables;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l = this.errorCount;
            int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            List list = this.errors;
            return hashCode4 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Graphql(operationType=");
            int i = this.operationType;
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "SUBSCRIPTION" : "MUTATION" : "QUERY");
            sb.append(", operationName=");
            sb.append(this.operationName);
            sb.append(", payload=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.payload, ", variables=", this.variables, ", errorCount=");
            sb.append(this.errorCount);
            sb.append(", errors=");
            sb.append(this.errors);
            sb.append(")");
            return sb.toString();
        }
    }

    public enum Interface {
        BLUETOOTH("bluetooth"),
        CELLULAR("cellular"),
        ETHERNET("ethernet"),
        WIFI("wifi"),
        WIMAX("wimax"),
        /* JADX INFO: Fake field, exist only in values array */
        MIXED("mixed"),
        OTHER("other"),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN("unknown"),
        /* JADX INFO: Fake field, exist only in values array */
        NONE("none");

        public final String jsonValue;

        Interface(String str) {
            this.jsonValue = str;
        }
    }

    public final class Location {
        public final long column;
        public final long line;

        public Location(long j, long j2) {
            this.line = j;
            this.column = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return this.line == location.line && this.column == location.column;
        }

        public final int hashCode() {
            return Long.hashCode(this.column) + (Long.hashCode(this.line) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.column, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.line, "Location(line=", ", column="));
        }
    }

    public final class Os {
        public final String build;
        public final String name;
        public final String version;
        public final String versionMajor;

        public Os(String str, String str2, String str3, String str4) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
            this.name = str;
            this.version = str2;
            this.build = str3;
            this.versionMajor = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Os)) {
                return false;
            }
            Os os = (Os) obj;
            return Intrinsics.areEqual(this.name, os.name) && Intrinsics.areEqual(this.version, os.version) && Intrinsics.areEqual(this.build, os.build) && Intrinsics.areEqual(this.versionMajor, os.versionMajor);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.version);
            String str = this.build;
            return this.versionMajor.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Os(name=", this.name, ", version=", this.version, ", build="), this.build, ", versionMajor=", this.versionMajor, ")");
        }
    }

    public abstract class Path {

        public final class Long extends Path {
            public final long item;

            public Long(long j) {
                this.item = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Long) && this.item == ((Long) obj).item;
            }

            public final int hashCode() {
                return java.lang.Long.hashCode(this.item);
            }

            @Override // com.datadog.android.rum.model.ResourceEvent.Path
            public final JsonPrimitive toJson() {
                return new JsonPrimitive(java.lang.Long.valueOf(this.item));
            }

            public final java.lang.String toString() {
                return Boxes$$ExternalSyntheticOutline1.m(this.item, "Long(item=", ")");
            }
        }

        public final class String extends Path {
            public final java.lang.String item;

            public String(java.lang.String str) {
                str.getClass();
                this.item = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof String) && Intrinsics.areEqual(this.item, ((String) obj).item);
            }

            public final int hashCode() {
                return this.item.hashCode();
            }

            @Override // com.datadog.android.rum.model.ResourceEvent.Path
            public final JsonPrimitive toJson() {
                return new JsonPrimitive(this.item);
            }

            public final java.lang.String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("String(item=", this.item, ")");
            }
        }

        public abstract JsonPrimitive toJson();
    }

    public enum Plan {
        /* JADX INFO: Fake field, exist only in values array */
        EF10("PLAN_1"),
        /* JADX INFO: Fake field, exist only in values array */
        EF22("PLAN_2");

        public final Integer jsonValue;

        Plan(String str) {
            this.jsonValue = r2;
        }
    }

    public final class Provider {
        public final String domain;
        public final String name;

        /* renamed from: type, reason: collision with root package name */
        public final int f967type;

        public Provider(String str, String str2, int i) {
            this.domain = str;
            this.name = str2;
            this.f967type = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Provider)) {
                return false;
            }
            Provider provider = (Provider) obj;
            return Intrinsics.areEqual(this.domain, provider.domain) && Intrinsics.areEqual(this.name, provider.name) && this.f967type == provider.f967type;
        }

        public final int hashCode() {
            String str = this.domain;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            int i = this.f967type;
            return hashCode2 + (i != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i) : 0);
        }

        public final String toString() {
            String str;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Provider(domain=", this.domain, ", name=", this.name, ", type=");
            switch (this.f967type) {
                case 1:
                    str = "AD";
                    break;
                case 2:
                    str = "ADVERTISING";
                    break;
                case 3:
                    str = "ANALYTICS";
                    break;
                case 4:
                    str = "CDN";
                    break;
                case 5:
                    str = "CONTENT";
                    break;
                case 6:
                    str = "CUSTOMER_SUCCESS";
                    break;
                case 7:
                    str = "FIRST_PARTY";
                    break;
                case 8:
                    str = "HOSTING";
                    break;
                case 9:
                    str = "MARKETING";
                    break;
                case 10:
                    str = "OTHER";
                    break;
                case 11:
                    str = "SOCIAL";
                    break;
                case 12:
                    str = "TAG_MANAGER";
                    break;
                case 13:
                    str = "UTILITY";
                    break;
                case 14:
                    str = "VIDEO";
                    break;
                default:
                    str = "null";
                    break;
            }
            m.append(str);
            m.append(")");
            return m.toString();
        }
    }

    public final class Redirect {
        public final long duration;
        public final long start;

        public Redirect(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) obj;
            return this.duration == redirect.duration && this.start == redirect.start;
        }

        public final int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.start, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.duration, "Redirect(duration=", ", start="));
        }
    }

    public final class Resource {
        public final Connect connect;
        public final Long decodedBodySize;
        public final int deliveryType;
        public final Dns dns;
        public final Download download;
        public final Long duration;
        public final Long encodedBodySize;
        public final FirstByte firstByte;
        public final Graphql graphql;
        public final String id;
        public final int method;
        public final String protocol;
        public final Provider provider;
        public final Redirect redirect;
        public final int renderBlockingStatus;
        public final Long size;
        public final Ssl ssl;
        public final Long statusCode;
        public final Long transferSize;

        /* renamed from: type, reason: collision with root package name */
        public final int f968type;
        public final String url;
        public final Worker worker;

        public Resource(String str, int i, int i2, String str2, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, int i3, Worker worker, Redirect redirect, Dns dns, Connect connect, Ssl ssl, FirstByte firstByte, Download download, String str3, int i4, Provider provider, Graphql graphql) {
            if (i == 0) {
                throw null;
            }
            str2.getClass();
            this.id = str;
            this.f968type = i;
            this.method = i2;
            this.url = str2;
            this.statusCode = l;
            this.duration = l2;
            this.size = l3;
            this.encodedBodySize = l4;
            this.decodedBodySize = l5;
            this.transferSize = l6;
            this.renderBlockingStatus = i3;
            this.worker = worker;
            this.redirect = redirect;
            this.dns = dns;
            this.connect = connect;
            this.ssl = ssl;
            this.firstByte = firstByte;
            this.download = download;
            this.protocol = str3;
            this.deliveryType = i4;
            this.provider = provider;
            this.graphql = graphql;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) obj;
            return Intrinsics.areEqual(this.id, resource.id) && this.f968type == resource.f968type && this.method == resource.method && Intrinsics.areEqual(this.url, resource.url) && Intrinsics.areEqual(this.statusCode, resource.statusCode) && Intrinsics.areEqual(this.duration, resource.duration) && Intrinsics.areEqual(this.size, resource.size) && Intrinsics.areEqual(this.encodedBodySize, resource.encodedBodySize) && Intrinsics.areEqual(this.decodedBodySize, resource.decodedBodySize) && Intrinsics.areEqual(this.transferSize, resource.transferSize) && this.renderBlockingStatus == resource.renderBlockingStatus && Intrinsics.areEqual(this.worker, resource.worker) && Intrinsics.areEqual(this.redirect, resource.redirect) && Intrinsics.areEqual(this.dns, resource.dns) && Intrinsics.areEqual(this.connect, resource.connect) && Intrinsics.areEqual(this.ssl, resource.ssl) && Intrinsics.areEqual(this.firstByte, resource.firstByte) && Intrinsics.areEqual(this.download, resource.download) && Intrinsics.areEqual(this.protocol, resource.protocol) && this.deliveryType == resource.deliveryType && Intrinsics.areEqual(this.provider, resource.provider) && Intrinsics.areEqual(this.graphql, resource.graphql);
        }

        public final int hashCode() {
            String str = this.id;
            int m = Thread$State$EnumUnboxingLocalUtility.m(this.f968type, (str == null ? 0 : str.hashCode()) * 31, 31);
            int i = this.method;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 31, 31, this.url);
            Long l = this.statusCode;
            int hashCode = (m2 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.duration;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.size;
            int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Long l4 = this.encodedBodySize;
            int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.decodedBodySize;
            int hashCode5 = (hashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
            Long l6 = this.transferSize;
            int hashCode6 = (hashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
            int i2 = this.renderBlockingStatus;
            int ordinal = (hashCode6 + (i2 == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i2))) * 31;
            Worker worker = this.worker;
            int hashCode7 = (ordinal + (worker == null ? 0 : worker.hashCode())) * 31;
            Redirect redirect = this.redirect;
            int hashCode8 = (hashCode7 + (redirect == null ? 0 : redirect.hashCode())) * 31;
            Dns dns = this.dns;
            int hashCode9 = (hashCode8 + (dns == null ? 0 : dns.hashCode())) * 31;
            Connect connect = this.connect;
            int hashCode10 = (hashCode9 + (connect == null ? 0 : connect.hashCode())) * 31;
            Ssl ssl = this.ssl;
            int hashCode11 = (hashCode10 + (ssl == null ? 0 : ssl.hashCode())) * 31;
            FirstByte firstByte = this.firstByte;
            int hashCode12 = (hashCode11 + (firstByte == null ? 0 : firstByte.hashCode())) * 31;
            Download download = this.download;
            int hashCode13 = (hashCode12 + (download == null ? 0 : download.hashCode())) * 31;
            String str2 = this.protocol;
            int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
            int i3 = this.deliveryType;
            int ordinal2 = (hashCode14 + (i3 == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i3))) * 31;
            Provider provider = this.provider;
            int hashCode15 = (ordinal2 + (provider == null ? 0 : provider.hashCode())) * 31;
            Graphql graphql = this.graphql;
            return hashCode15 + (graphql != null ? graphql.hashCode() : 0);
        }

        public final String toString() {
            String str;
            String str2;
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Resource(id=", this.id, ", type=");
            String str3 = "OTHER";
            switch (this.f968type) {
                case 1:
                    str = "DOCUMENT";
                    break;
                case 2:
                    str = "XHR";
                    break;
                case 3:
                    str = "BEACON";
                    break;
                case 4:
                    str = "FETCH";
                    break;
                case 5:
                    str = "CSS";
                    break;
                case 6:
                    str = "JS";
                    break;
                case 7:
                    str = "IMAGE";
                    break;
                case 8:
                    str = "FONT";
                    break;
                case 9:
                    str = "MEDIA";
                    break;
                case 10:
                    str = "OTHER";
                    break;
                case 11:
                    str = "NATIVE";
                    break;
                default:
                    str = "null";
                    break;
            }
            m3m.append(str);
            m3m.append(", method=");
            switch (this.method) {
                case 1:
                    str2 = "POST";
                    break;
                case 2:
                    str2 = "GET";
                    break;
                case 3:
                    str2 = "HEAD";
                    break;
                case 4:
                    str2 = "PUT";
                    break;
                case 5:
                    str2 = "DELETE";
                    break;
                case 6:
                    str2 = "PATCH";
                    break;
                case 7:
                    str2 = "TRACE";
                    break;
                case 8:
                    str2 = "OPTIONS";
                    break;
                case 9:
                    str2 = "CONNECT";
                    break;
                default:
                    str2 = "null";
                    break;
            }
            m3m.append(str2);
            m3m.append(", url=");
            Request$Priority$EnumUnboxingLocalUtility.m(this.statusCode, this.url, ", statusCode=", ", duration=", m3m);
            Thread$State$EnumUnboxingLocalUtility.m(m3m, this.duration, ", size=", this.size, ", encodedBodySize=");
            Thread$State$EnumUnboxingLocalUtility.m(m3m, this.encodedBodySize, ", decodedBodySize=", this.decodedBodySize, ", transferSize=");
            m3m.append(this.transferSize);
            m3m.append(", renderBlockingStatus=");
            int i = this.renderBlockingStatus;
            m3m.append(i != 1 ? i != 2 ? "null" : "NON_BLOCKING" : "BLOCKING");
            m3m.append(", worker=");
            m3m.append(this.worker);
            m3m.append(", redirect=");
            m3m.append(this.redirect);
            m3m.append(", dns=");
            m3m.append(this.dns);
            m3m.append(", connect=");
            m3m.append(this.connect);
            m3m.append(", ssl=");
            m3m.append(this.ssl);
            m3m.append(", firstByte=");
            m3m.append(this.firstByte);
            m3m.append(", download=");
            m3m.append(this.download);
            m3m.append(", protocol=");
            m3m.append(this.protocol);
            m3m.append(", deliveryType=");
            int i2 = this.deliveryType;
            if (i2 == 1) {
                str3 = "CACHE";
            } else if (i2 == 2) {
                str3 = "NAVIGATIONAL_PREFETCH";
            } else if (i2 != 3) {
                str3 = "null";
            }
            m3m.append(str3);
            m3m.append(", provider=");
            m3m.append(this.provider);
            m3m.append(", graphql=");
            m3m.append(this.graphql);
            m3m.append(")");
            return m3m.toString();
        }
    }

    public final class ResourceEventSession {
        public final Boolean hasReplay;
        public final String id;

        /* renamed from: type, reason: collision with root package name */
        public final int f969type;

        public ResourceEventSession(int i, Boolean bool, String str) {
            str.getClass();
            if (i == 0) {
                throw null;
            }
            this.id = str;
            this.f969type = i;
            this.hasReplay = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceEventSession)) {
                return false;
            }
            ResourceEventSession resourceEventSession = (ResourceEventSession) obj;
            return Intrinsics.areEqual(this.id, resourceEventSession.id) && this.f969type == resourceEventSession.f969type && Intrinsics.areEqual(this.hasReplay, resourceEventSession.hasReplay);
        }

        public final int hashCode() {
            int m = Thread$State$EnumUnboxingLocalUtility.m(this.f969type, this.id.hashCode() * 31, 31);
            Boolean bool = this.hasReplay;
            return m + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("ResourceEventSession(id=", this.id, ", type=");
            int i = this.f969type;
            m3m.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
            m3m.append(", hasReplay=");
            m3m.append(this.hasReplay);
            m3m.append(")");
            return m3m.toString();
        }
    }

    public final class ResourceEventView {
        public final String id;
        public final String name;
        public final String referrer;
        public final String url;

        public ResourceEventView(String str, String str2, String str3, String str4) {
            str.getClass();
            str3.getClass();
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceEventView)) {
                return false;
            }
            ResourceEventView resourceEventView = (ResourceEventView) obj;
            return Intrinsics.areEqual(this.id, resourceEventView.id) && Intrinsics.areEqual(this.referrer, resourceEventView.referrer) && Intrinsics.areEqual(this.url, resourceEventView.url) && Intrinsics.areEqual(this.name, resourceEventView.name);
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.referrer;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.url);
            String str2 = this.name;
            return m + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ResourceEventView(id=", this.id, ", referrer=", this.referrer, ", url="), this.url, ", name=", this.name, ")");
        }
    }

    public final class Ssl {
        public final long duration;
        public final long start;

        public Ssl(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ssl)) {
                return false;
            }
            Ssl ssl = (Ssl) obj;
            return this.duration == ssl.duration && this.start == ssl.start;
        }

        public final int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.start, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.duration, "Ssl(duration=", ", start="));
        }
    }

    public final class Synthetics {
        public final Boolean injected;
        public final String resultId;
        public final String testId;

        public Synthetics(String str, String str2, Boolean bool) {
            str.getClass();
            str2.getClass();
            this.testId = str;
            this.resultId = str2;
            this.injected = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Synthetics)) {
                return false;
            }
            Synthetics synthetics = (Synthetics) obj;
            return Intrinsics.areEqual(this.testId, synthetics.testId) && Intrinsics.areEqual(this.resultId, synthetics.resultId) && Intrinsics.areEqual(this.injected, synthetics.injected);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.testId.hashCode() * 31, 31, this.resultId);
            Boolean bool = this.injected;
            return m + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Synthetics(testId=", this.testId, ", resultId=", this.resultId, ", injected="), this.injected, ")");
        }
    }

    public final class Usr {
        public static final String[] RESERVED_PROPERTIES = {"id", "name", "email", "anonymous_id"};
        public final Map additionalProperties;
        public final String anonymousId;
        public final String email;
        public final String id;
        public final String name;

        public Usr(String str, String str2, String str3, String str4, Map map) {
            this.id = str;
            this.name = str2;
            this.email = str3;
            this.anonymousId = str4;
            this.additionalProperties = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Usr)) {
                return false;
            }
            Usr usr = (Usr) obj;
            return Intrinsics.areEqual(this.id, usr.id) && Intrinsics.areEqual(this.name, usr.name) && Intrinsics.areEqual(this.email, usr.email) && Intrinsics.areEqual(this.anonymousId, usr.anonymousId) && this.additionalProperties.equals(usr.additionalProperties);
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.email;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.anonymousId;
            return this.additionalProperties.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Usr(id=", this.id, ", name=", this.name, ", email=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.email, ", anonymousId=", this.anonymousId, ", additionalProperties=");
            return re$$ExternalSyntheticOutline0.m(")", m, this.additionalProperties);
        }
    }

    public final class Viewport {
        public final Number height;
        public final Number width;

        public Viewport(Number number, Number number2) {
            number.getClass();
            number2.getClass();
            this.width = number;
            this.height = number2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Viewport)) {
                return false;
            }
            Viewport viewport = (Viewport) obj;
            return Intrinsics.areEqual(this.width, viewport.width) && Intrinsics.areEqual(this.height, viewport.height);
        }

        public final int hashCode() {
            return this.height.hashCode() + (this.width.hashCode() * 31);
        }

        public final String toString() {
            return "Viewport(width=" + this.width + ", height=" + this.height + ")";
        }
    }

    public final class Worker {
        public final long duration;
        public final long start;

        public Worker(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Worker)) {
                return false;
            }
            Worker worker = (Worker) obj;
            return this.duration == worker.duration && this.start == worker.start;
        }

        public final int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.start, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.duration, "Worker(duration=", ", start="));
        }
    }

    public ResourceEvent(long j, Application application, String str, String str2, String str3, String str4, String str5, ResourceEventSession resourceEventSession, int i, ResourceEventView resourceEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, Resource resource) {
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.ddtags = str5;
        this.session = resourceEventSession;
        this.source = i;
        this.view = resourceEventView;
        this.usr = usr;
        this.account = account;
        this.connectivity = connectivity;
        this.display = display;
        this.synthetics = synthetics;
        this.ciTest = ciTest;
        this.os = os;
        this.device = device;
        this.dd = dd;
        this.context = context;
        this.action = action;
        this.container = container;
        this.resource = resource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceEvent)) {
            return false;
        }
        ResourceEvent resourceEvent = (ResourceEvent) obj;
        return this.date == resourceEvent.date && this.application.equals(resourceEvent.application) && Intrinsics.areEqual(this.service, resourceEvent.service) && Intrinsics.areEqual(this.version, resourceEvent.version) && Intrinsics.areEqual(this.buildVersion, resourceEvent.buildVersion) && Intrinsics.areEqual(this.buildId, resourceEvent.buildId) && Intrinsics.areEqual(this.ddtags, resourceEvent.ddtags) && this.session.equals(resourceEvent.session) && this.source == resourceEvent.source && this.view.equals(resourceEvent.view) && Intrinsics.areEqual(this.usr, resourceEvent.usr) && Intrinsics.areEqual(this.account, resourceEvent.account) && Intrinsics.areEqual(this.connectivity, resourceEvent.connectivity) && Intrinsics.areEqual(this.display, resourceEvent.display) && Intrinsics.areEqual(this.synthetics, resourceEvent.synthetics) && Intrinsics.areEqual(this.ciTest, resourceEvent.ciTest) && Intrinsics.areEqual(this.os, resourceEvent.os) && Intrinsics.areEqual(this.device, resourceEvent.device) && this.dd.equals(resourceEvent.dd) && Intrinsics.areEqual(this.context, resourceEvent.context) && Intrinsics.areEqual(this.action, resourceEvent.action) && Intrinsics.areEqual(this.container, resourceEvent.container) && this.resource.equals(resourceEvent.resource);
    }

    public final int hashCode() {
        int hashCode = (this.application.hashCode() + (Long.hashCode(this.date) * 31)) * 31;
        String str = this.service;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buildVersion;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buildId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ddtags;
        int hashCode6 = (this.session.hashCode() + ((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        int i = this.source;
        int hashCode7 = (this.view.hashCode() + ((hashCode6 + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 31)) * 31;
        Usr usr = this.usr;
        int hashCode8 = (hashCode7 + (usr == null ? 0 : usr.hashCode())) * 31;
        Account account = this.account;
        int hashCode9 = (hashCode8 + (account == null ? 0 : account.hashCode())) * 31;
        Connectivity connectivity = this.connectivity;
        int hashCode10 = (hashCode9 + (connectivity == null ? 0 : connectivity.hashCode())) * 31;
        Display display = this.display;
        int hashCode11 = (hashCode10 + (display == null ? 0 : display.hashCode())) * 31;
        Synthetics synthetics = this.synthetics;
        int hashCode12 = (hashCode11 + (synthetics == null ? 0 : synthetics.hashCode())) * 31;
        CiTest ciTest = this.ciTest;
        int hashCode13 = (hashCode12 + (ciTest == null ? 0 : ciTest.testExecutionId.hashCode())) * 31;
        Os os = this.os;
        int hashCode14 = (hashCode13 + (os == null ? 0 : os.hashCode())) * 31;
        Device device = this.device;
        int hashCode15 = (this.dd.hashCode() + ((hashCode14 + (device == null ? 0 : device.hashCode())) * 31)) * 31;
        Context context = this.context;
        int hashCode16 = (hashCode15 + (context == null ? 0 : context.additionalProperties.hashCode())) * 31;
        Action action = this.action;
        int hashCode17 = (hashCode16 + (action == null ? 0 : action.id.hashCode())) * 31;
        Container container = this.container;
        return this.resource.hashCode() + ((hashCode17 + (container != null ? container.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceEvent(date=");
        sb.append(this.date);
        sb.append(", application=");
        sb.append(this.application);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", service=", this.service, ", version=", this.version);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", buildVersion=", this.buildVersion, ", buildId=", this.buildId);
        sb.append(", ddtags=");
        sb.append(this.ddtags);
        sb.append(", session=");
        sb.append(this.session);
        sb.append(", source=");
        sb.append(ErrorEvent$Status$EnumUnboxingLocalUtility.stringValueOf$20(this.source));
        sb.append(", view=");
        sb.append(this.view);
        sb.append(", usr=");
        sb.append(this.usr);
        sb.append(", account=");
        sb.append(this.account);
        sb.append(", connectivity=");
        sb.append(this.connectivity);
        sb.append(", display=");
        sb.append(this.display);
        sb.append(", synthetics=");
        sb.append(this.synthetics);
        sb.append(", ciTest=");
        sb.append(this.ciTest);
        sb.append(", os=");
        sb.append(this.os);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", dd=");
        sb.append(this.dd);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", container=");
        sb.append(this.container);
        sb.append(", resource=");
        sb.append(this.resource);
        sb.append(")");
        return sb.toString();
    }
}
