package com.datadog.android.rum.model;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.google.android.gms.internal.mlkit_vision_common.zzlr;
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import com.google.android.gms.internal.mlkit_vision_face.zzdc;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.franklin.app.GetFlowRequest;
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
public final class LongTaskEvent {
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
    public final LongTask longTask;
    public final Os os;
    public final String service;
    public final LongTaskEventSession session;
    public final int source;
    public final Synthetics synthetics;
    public final Usr usr;
    public final String version;
    public final LongTaskEventView view;

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
        public static LongTaskEvent fromJsonObject(JsonObject jsonObject) {
            LongTaskEvent longTaskEvent;
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
                Application fromJsonObject = zzle.fromJsonObject(asJsonObject12);
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
                LongTaskEventSession fromJsonObject2 = ColoredButton.Action.fromJsonObject(asJsonObject13);
                JsonElement jsonElement6 = jsonObject.get("source");
                int i2 = 0;
                if (jsonElement6 != null && (asString = jsonElement6.getAsString()) != null) {
                    int[] values = CameraSelector$$ExternalSyntheticOutline0.values(8);
                    longTaskEvent = null;
                    try {
                        int length = values.length;
                        while (i2 < length) {
                            int i3 = values[i2];
                            int i4 = length;
                            if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$9(i3).equals(asString)) {
                                i = i3;
                            } else {
                                i2++;
                                length = i4;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    } catch (IllegalStateException e) {
                        e = e;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTaskEvent", e);
                        return longTaskEvent;
                    } catch (NullPointerException e2) {
                        e = e2;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTaskEvent", e);
                        return longTaskEvent;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTaskEvent", e);
                        return longTaskEvent;
                    }
                }
                longTaskEvent = null;
                i = 0;
                JsonObject asJsonObject14 = jsonObject.get("view").getAsJsonObject();
                asJsonObject14.getClass();
                LongTaskEventView fromJsonObject3 = zzlt.fromJsonObject(asJsonObject14);
                JsonElement jsonElement7 = jsonObject.get("usr");
                Usr fromJsonObject4 = (jsonElement7 == null || (asJsonObject11 = jsonElement7.getAsJsonObject()) == null) ? longTaskEvent : GetFlowRequest.Input.fromJsonObject(asJsonObject11);
                JsonElement jsonElement8 = jsonObject.get("account");
                Account fromJsonObject5 = (jsonElement8 == null || (asJsonObject10 = jsonElement8.getAsJsonObject()) == null) ? longTaskEvent : zzlc.fromJsonObject(asJsonObject10);
                JsonElement jsonElement9 = jsonObject.get("connectivity");
                Connectivity fromJsonObject6 = (jsonElement9 == null || (asJsonObject9 = jsonElement9.getAsJsonObject()) == null) ? longTaskEvent : ChatMessage.Body.fromJsonObject(asJsonObject9);
                JsonElement jsonElement10 = jsonObject.get("display");
                Display fromJsonObject7 = (jsonElement10 == null || (asJsonObject8 = jsonElement10.getAsJsonObject()) == null) ? longTaskEvent : zzlq.fromJsonObject(asJsonObject8);
                JsonElement jsonElement11 = jsonObject.get("synthetics");
                Synthetics fromJsonObject8 = (jsonElement11 == null || (asJsonObject7 = jsonElement11.getAsJsonObject()) == null) ? longTaskEvent : zzdc.fromJsonObject(asJsonObject7);
                JsonElement jsonElement12 = jsonObject.get("ci_test");
                CiTest fromJsonObject9 = (jsonElement12 == null || (asJsonObject6 = jsonElement12.getAsJsonObject()) == null) ? longTaskEvent : zzlg.fromJsonObject(asJsonObject6);
                JsonElement jsonElement13 = jsonObject.get("os");
                Os fromJsonObject10 = (jsonElement13 == null || (asJsonObject5 = jsonElement13.getAsJsonObject()) == null) ? longTaskEvent : zzlu.fromJsonObject(asJsonObject5);
                JsonElement jsonElement14 = jsonObject.get("device");
                Device fromJsonObject11 = (jsonElement14 == null || (asJsonObject4 = jsonElement14.getAsJsonObject()) == null) ? longTaskEvent : zzlp.fromJsonObject(asJsonObject4);
                JsonObject asJsonObject15 = jsonObject.get("_dd").getAsJsonObject();
                asJsonObject15.getClass();
                Dd fromJsonObject12 = zzln.fromJsonObject(asJsonObject15);
                JsonElement jsonElement15 = jsonObject.get("context");
                Context fromJsonObject13 = (jsonElement15 == null || (asJsonObject3 = jsonElement15.getAsJsonObject()) == null) ? longTaskEvent : zzlm.fromJsonObject(asJsonObject3);
                JsonElement jsonElement16 = jsonObject.get("action");
                Action fromJsonObject14 = (jsonElement16 == null || (asJsonObject2 = jsonElement16.getAsJsonObject()) == null) ? longTaskEvent : zzld.fromJsonObject(asJsonObject2);
                JsonElement jsonElement17 = jsonObject.get("container");
                Container fromJsonObject15 = (jsonElement17 == null || (asJsonObject = jsonElement17.getAsJsonObject()) == null) ? longTaskEvent : zzlk.fromJsonObject(asJsonObject);
                String asString7 = jsonObject.get("type").getAsString();
                JsonObject asJsonObject16 = jsonObject.get("long_task").getAsJsonObject();
                asJsonObject16.getClass();
                LongTask fromJsonObject16 = zzlr.fromJsonObject(asJsonObject16);
                if (Intrinsics.areEqual(asString7, "long_task")) {
                    return new LongTaskEvent(asLong, fromJsonObject, asString2, asString3, asString4, asString5, asString6, fromJsonObject2, i, fromJsonObject3, fromJsonObject4, fromJsonObject5, fromJsonObject6, fromJsonObject7, fromJsonObject8, fromJsonObject9, fromJsonObject10, fromJsonObject11, fromJsonObject12, fromJsonObject13, fromJsonObject14, fromJsonObject15, fromJsonObject16);
                }
                throw new IllegalStateException("Check failed.");
            } catch (IllegalStateException e4) {
                e = e4;
                longTaskEvent = null;
            } catch (NullPointerException e5) {
                e = e5;
                longTaskEvent = null;
            } catch (NumberFormatException e6) {
                e = e6;
                longTaskEvent = null;
            }
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewScanChecks.deepLinkSpecs;
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
            return "Container(view=" + this.view + ", source=" + ErrorEvent$Status$EnumUnboxingLocalUtility.stringValueOf$9(this.source) + ")";
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
        public final Profiling profiling;
        public final String sdkName;
        public final DdSession session;

        public Dd(DdSession ddSession, Configuration configuration, String str, String str2, Boolean bool, Profiling profiling) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.sdkName = str2;
            this.discarded = bool;
            this.profiling = profiling;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) obj;
            return Intrinsics.areEqual(this.session, dd.session) && Intrinsics.areEqual(this.configuration, dd.configuration) && Intrinsics.areEqual(this.browserSdkVersion, dd.browserSdkVersion) && Intrinsics.areEqual(this.sdkName, dd.sdkName) && Intrinsics.areEqual(this.discarded, dd.discarded) && Intrinsics.areEqual(this.profiling, dd.profiling);
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
            Boolean bool = this.discarded;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Profiling profiling = this.profiling;
            return hashCode5 + (profiling != null ? profiling.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dd(session=");
            sb.append(this.session);
            sb.append(", configuration=");
            sb.append(this.configuration);
            sb.append(", browserSdkVersion=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.browserSdkVersion, ", sdkName=", this.sdkName, ", discarded=");
            sb.append(this.discarded);
            sb.append(", profiling=");
            sb.append(this.profiling);
            sb.append(")");
            return sb.toString();
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
        public final int f964type;

        public Device(int i, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, Number number, Boolean bool, Number number2) {
            this.f964type = i;
            this.name = str;
            this.model = str2;
            this.brand = str3;
            this.architecture = str4;
            this.locale = str5;
            this.locales = arrayList;
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
            return this.f964type == device.f964type && Intrinsics.areEqual(this.name, device.name) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.brand, device.brand) && Intrinsics.areEqual(this.architecture, device.architecture) && Intrinsics.areEqual(this.locale, device.locale) && Intrinsics.areEqual(this.locales, device.locales) && Intrinsics.areEqual(this.timeZone, device.timeZone) && Intrinsics.areEqual(this.batteryLevel, device.batteryLevel) && Intrinsics.areEqual(this.powerSavingMode, device.powerSavingMode) && Intrinsics.areEqual(this.brightnessLevel, device.brightnessLevel);
        }

        public final int hashCode() {
            int i = this.f964type;
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
            switch (this.f964type) {
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

    public final class LongTask {
        public final Long blockingDuration;
        public final long duration;
        public final int entryType;
        public final Number firstUiEventTimestamp;
        public final String id;
        public final Boolean isFrozenFrame;
        public final Number renderStart;
        public final List scripts;
        public final Number startTime;
        public final Number styleAndLayoutStart;

        public LongTask(String str, Number number, int i, long j, Long l, Number number2, Number number3, Number number4, Boolean bool, ArrayList arrayList) {
            this.id = str;
            this.startTime = number;
            this.entryType = i;
            this.duration = j;
            this.blockingDuration = l;
            this.renderStart = number2;
            this.styleAndLayoutStart = number3;
            this.firstUiEventTimestamp = number4;
            this.isFrozenFrame = bool;
            this.scripts = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LongTask)) {
                return false;
            }
            LongTask longTask = (LongTask) obj;
            return Intrinsics.areEqual(this.id, longTask.id) && Intrinsics.areEqual(this.startTime, longTask.startTime) && this.entryType == longTask.entryType && this.duration == longTask.duration && Intrinsics.areEqual(this.blockingDuration, longTask.blockingDuration) && Intrinsics.areEqual(this.renderStart, longTask.renderStart) && Intrinsics.areEqual(this.styleAndLayoutStart, longTask.styleAndLayoutStart) && Intrinsics.areEqual(this.firstUiEventTimestamp, longTask.firstUiEventTimestamp) && Intrinsics.areEqual(this.isFrozenFrame, longTask.isFrozenFrame) && Intrinsics.areEqual(this.scripts, longTask.scripts);
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Number number = this.startTime;
            int hashCode2 = (hashCode + (number == null ? 0 : number.hashCode())) * 31;
            int i = this.entryType;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 31, 31, this.duration);
            Long l = this.blockingDuration;
            int hashCode3 = (m + (l == null ? 0 : l.hashCode())) * 31;
            Number number2 = this.renderStart;
            int hashCode4 = (hashCode3 + (number2 == null ? 0 : number2.hashCode())) * 31;
            Number number3 = this.styleAndLayoutStart;
            int hashCode5 = (hashCode4 + (number3 == null ? 0 : number3.hashCode())) * 31;
            Number number4 = this.firstUiEventTimestamp;
            int hashCode6 = (hashCode5 + (number4 == null ? 0 : number4.hashCode())) * 31;
            Boolean bool = this.isFrozenFrame;
            int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            List list = this.scripts;
            return hashCode7 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LongTask(id=");
            sb.append(this.id);
            sb.append(", startTime=");
            sb.append(this.startTime);
            sb.append(", entryType=");
            int i = this.entryType;
            sb.append(i != 1 ? i != 2 ? "null" : "LONG_ANIMATION_FRAME" : "LONG_TASK");
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", blockingDuration=");
            sb.append(this.blockingDuration);
            sb.append(", renderStart=");
            sb.append(this.renderStart);
            sb.append(", styleAndLayoutStart=");
            sb.append(this.styleAndLayoutStart);
            sb.append(", firstUiEventTimestamp=");
            sb.append(this.firstUiEventTimestamp);
            sb.append(", isFrozenFrame=");
            sb.append(this.isFrozenFrame);
            sb.append(", scripts=");
            sb.append(this.scripts);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class LongTaskEventSession {
        public final Boolean hasReplay;
        public final String id;

        /* renamed from: type, reason: collision with root package name */
        public final int f965type;

        public LongTaskEventSession(int i, Boolean bool, String str) {
            str.getClass();
            if (i == 0) {
                throw null;
            }
            this.id = str;
            this.f965type = i;
            this.hasReplay = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LongTaskEventSession)) {
                return false;
            }
            LongTaskEventSession longTaskEventSession = (LongTaskEventSession) obj;
            return Intrinsics.areEqual(this.id, longTaskEventSession.id) && this.f965type == longTaskEventSession.f965type && Intrinsics.areEqual(this.hasReplay, longTaskEventSession.hasReplay);
        }

        public final int hashCode() {
            int m = Thread$State$EnumUnboxingLocalUtility.m(this.f965type, this.id.hashCode() * 31, 31);
            Boolean bool = this.hasReplay;
            return m + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("LongTaskEventSession(id=", this.id, ", type=");
            int i = this.f965type;
            m3m.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
            m3m.append(", hasReplay=");
            m3m.append(this.hasReplay);
            m3m.append(")");
            return m3m.toString();
        }
    }

    public final class LongTaskEventView {
        public final String id;
        public final String name;
        public final String referrer;
        public final String url;

        public LongTaskEventView(String str, String str2, String str3, String str4) {
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
            if (!(obj instanceof LongTaskEventView)) {
                return false;
            }
            LongTaskEventView longTaskEventView = (LongTaskEventView) obj;
            return Intrinsics.areEqual(this.id, longTaskEventView.id) && Intrinsics.areEqual(this.referrer, longTaskEventView.referrer) && Intrinsics.areEqual(this.url, longTaskEventView.url) && Intrinsics.areEqual(this.name, longTaskEventView.name);
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.referrer;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.url);
            String str2 = this.name;
            return m + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LongTaskEventView(id=", this.id, ", referrer=", this.referrer, ", url="), this.url, ", name=", this.name, ")");
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

    public final class Profiling {
        public final int errorReason;
        public final int status;

        public Profiling(int i, int i2) {
            this.status = i;
            this.errorReason = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Profiling)) {
                return false;
            }
            Profiling profiling = (Profiling) obj;
            return this.status == profiling.status && this.errorReason == profiling.errorReason;
        }

        public final int hashCode() {
            int i = this.status;
            int ordinal = (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) * 31;
            int i2 = this.errorReason;
            return ordinal + (i2 != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i2) : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Profiling(status=");
            String str = "null";
            int i = this.status;
            sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "ERROR" : "STOPPED" : "RUNNING" : "STARTING");
            sb.append(", errorReason=");
            int i2 = this.errorReason;
            if (i2 == 1) {
                str = "NOT_SUPPORTED_BY_BROWSER";
            } else if (i2 == 2) {
                str = "FAILED_TO_LAZY_LOAD";
            } else if (i2 == 3) {
                str = "MISSING_DOCUMENT_POLICY_HEADER";
            } else if (i2 == 4) {
                str = "UNEXPECTED_EXCEPTION";
            }
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Script {
        public final Long duration;
        public final Number executionStart;
        public final Long forcedStyleAndLayoutDuration;
        public final String invoker;
        public final int invokerType;
        public final Long pauseDuration;
        public final Long sourceCharPosition;
        public final String sourceFunctionName;
        public final String sourceUrl;
        public final Number startTime;
        public final String windowAttribution;

        public Script(Long l, Long l2, Long l3, Number number, Number number2, String str, String str2, Long l4, String str3, int i, String str4) {
            this.duration = l;
            this.pauseDuration = l2;
            this.forcedStyleAndLayoutDuration = l3;
            this.startTime = number;
            this.executionStart = number2;
            this.sourceUrl = str;
            this.sourceFunctionName = str2;
            this.sourceCharPosition = l4;
            this.invoker = str3;
            this.invokerType = i;
            this.windowAttribution = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Script)) {
                return false;
            }
            Script script = (Script) obj;
            return Intrinsics.areEqual(this.duration, script.duration) && Intrinsics.areEqual(this.pauseDuration, script.pauseDuration) && Intrinsics.areEqual(this.forcedStyleAndLayoutDuration, script.forcedStyleAndLayoutDuration) && Intrinsics.areEqual(this.startTime, script.startTime) && Intrinsics.areEqual(this.executionStart, script.executionStart) && Intrinsics.areEqual(this.sourceUrl, script.sourceUrl) && Intrinsics.areEqual(this.sourceFunctionName, script.sourceFunctionName) && Intrinsics.areEqual(this.sourceCharPosition, script.sourceCharPosition) && Intrinsics.areEqual(this.invoker, script.invoker) && this.invokerType == script.invokerType && Intrinsics.areEqual(this.windowAttribution, script.windowAttribution);
        }

        public final int hashCode() {
            Long l = this.duration;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.pauseDuration;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.forcedStyleAndLayoutDuration;
            int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Number number = this.startTime;
            int hashCode4 = (hashCode3 + (number == null ? 0 : number.hashCode())) * 31;
            Number number2 = this.executionStart;
            int hashCode5 = (hashCode4 + (number2 == null ? 0 : number2.hashCode())) * 31;
            String str = this.sourceUrl;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sourceFunctionName;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l4 = this.sourceCharPosition;
            int hashCode8 = (hashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
            String str3 = this.invoker;
            int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
            int i = this.invokerType;
            int ordinal = (hashCode9 + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 31;
            String str4 = this.windowAttribution;
            return ordinal + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("Script(duration=");
            sb.append(this.duration);
            sb.append(", pauseDuration=");
            sb.append(this.pauseDuration);
            sb.append(", forcedStyleAndLayoutDuration=");
            sb.append(this.forcedStyleAndLayoutDuration);
            sb.append(", startTime=");
            sb.append(this.startTime);
            sb.append(", executionStart=");
            sb.append(this.executionStart);
            sb.append(", sourceUrl=");
            sb.append(this.sourceUrl);
            sb.append(", sourceFunctionName=");
            Request$Priority$EnumUnboxingLocalUtility.m(this.sourceCharPosition, this.sourceFunctionName, ", sourceCharPosition=", ", invoker=", sb);
            sb.append(this.invoker);
            sb.append(", invokerType=");
            switch (this.invokerType) {
                case 1:
                    str = "USER_CALLBACK";
                    break;
                case 2:
                    str = "EVENT_LISTENER";
                    break;
                case 3:
                    str = "RESOLVE_PROMISE";
                    break;
                case 4:
                    str = "REJECT_PROMISE";
                    break;
                case 5:
                    str = "CLASSIC_SCRIPT";
                    break;
                case 6:
                    str = "MODULE_SCRIPT";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append(str);
            sb.append(", windowAttribution=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.windowAttribution, ")");
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

    public LongTaskEvent(long j, Application application, String str, String str2, String str3, String str4, String str5, LongTaskEventSession longTaskEventSession, int i, LongTaskEventView longTaskEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, LongTask longTask) {
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.ddtags = str5;
        this.session = longTaskEventSession;
        this.source = i;
        this.view = longTaskEventView;
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
        this.longTask = longTask;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongTaskEvent)) {
            return false;
        }
        LongTaskEvent longTaskEvent = (LongTaskEvent) obj;
        return this.date == longTaskEvent.date && this.application.equals(longTaskEvent.application) && Intrinsics.areEqual(this.service, longTaskEvent.service) && Intrinsics.areEqual(this.version, longTaskEvent.version) && Intrinsics.areEqual(this.buildVersion, longTaskEvent.buildVersion) && Intrinsics.areEqual(this.buildId, longTaskEvent.buildId) && Intrinsics.areEqual(this.ddtags, longTaskEvent.ddtags) && this.session.equals(longTaskEvent.session) && this.source == longTaskEvent.source && this.view.equals(longTaskEvent.view) && Intrinsics.areEqual(this.usr, longTaskEvent.usr) && Intrinsics.areEqual(this.account, longTaskEvent.account) && Intrinsics.areEqual(this.connectivity, longTaskEvent.connectivity) && Intrinsics.areEqual(this.display, longTaskEvent.display) && Intrinsics.areEqual(this.synthetics, longTaskEvent.synthetics) && Intrinsics.areEqual(this.ciTest, longTaskEvent.ciTest) && Intrinsics.areEqual(this.os, longTaskEvent.os) && Intrinsics.areEqual(this.device, longTaskEvent.device) && this.dd.equals(longTaskEvent.dd) && Intrinsics.areEqual(this.context, longTaskEvent.context) && Intrinsics.areEqual(this.action, longTaskEvent.action) && Intrinsics.areEqual(this.container, longTaskEvent.container) && this.longTask.equals(longTaskEvent.longTask);
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
        return this.longTask.hashCode() + ((hashCode17 + (container != null ? container.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongTaskEvent(date=");
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
        sb.append(ErrorEvent$Status$EnumUnboxingLocalUtility.stringValueOf$9(this.source));
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
        sb.append(", longTask=");
        sb.append(this.longTask);
        sb.append(")");
        return sb.toString();
    }
}
