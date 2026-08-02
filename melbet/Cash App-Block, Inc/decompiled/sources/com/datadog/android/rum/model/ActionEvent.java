package com.datadog.android.rum.model;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_common.zzij;
import com.google.android.gms.internal.mlkit_vision_common.zzik;
import com.google.android.gms.internal.mlkit_vision_common.zzim;
import com.google.android.gms.internal.mlkit_vision_common.zzir;
import com.google.android.gms.internal.mlkit_vision_common.zzis;
import com.google.android.gms.internal.mlkit_vision_common.zziu;
import com.google.android.gms.internal.mlkit_vision_common.zzja;
import com.google.android.gms.internal.mlkit_vision_common.zzjb;
import com.google.android.gms.internal.mlkit_vision_common.zzjc;
import com.google.android.gms.internal.mlkit_vision_common.zzje;
import com.google.android.gms.internal.mlkit_vision_common.zzjh;
import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import com.google.android.gms.internal.mlkit_vision_common.zzjk;
import com.google.android.gms.internal.mlkit_vision_common.zzjs;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.marketdata.model.News;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ActionEvent {
    public final Account account;
    public final ActionEventAction action;
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
    public final String service;
    public final ActionEventSession session;
    public final int source;
    public final Synthetics synthetics;
    public final Usr usr;
    public final String version;
    public final ActionEventView view;

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

    public final class ActionEventAction {
        public final Crash crash;
        public final Error error;
        public final Frustration frustration;
        public final String id;
        public final Long loadingTime;
        public final LongTask longTask;
        public final Resource resource;
        public final ActionEventActionTarget target;

        /* renamed from: type, reason: collision with root package name */
        public final ActionEventActionType f955type;

        public ActionEventAction(ActionEventActionType actionEventActionType, String str, Long l, ActionEventActionTarget actionEventActionTarget, Frustration frustration, Error error, Crash crash, LongTask longTask, Resource resource) {
            this.f955type = actionEventActionType;
            this.id = str;
            this.loadingTime = l;
            this.target = actionEventActionTarget;
            this.frustration = frustration;
            this.error = error;
            this.crash = crash;
            this.longTask = longTask;
            this.resource = resource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionEventAction)) {
                return false;
            }
            ActionEventAction actionEventAction = (ActionEventAction) obj;
            return this.f955type == actionEventAction.f955type && Intrinsics.areEqual(this.id, actionEventAction.id) && Intrinsics.areEqual(this.loadingTime, actionEventAction.loadingTime) && Intrinsics.areEqual(this.target, actionEventAction.target) && Intrinsics.areEqual(this.frustration, actionEventAction.frustration) && Intrinsics.areEqual(this.error, actionEventAction.error) && Intrinsics.areEqual(this.crash, actionEventAction.crash) && Intrinsics.areEqual(this.longTask, actionEventAction.longTask) && Intrinsics.areEqual(this.resource, actionEventAction.resource);
        }

        public final int hashCode() {
            int hashCode = this.f955type.hashCode() * 31;
            String str = this.id;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.loadingTime;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            ActionEventActionTarget actionEventActionTarget = this.target;
            int hashCode4 = (hashCode3 + (actionEventActionTarget == null ? 0 : actionEventActionTarget.name.hashCode())) * 31;
            Frustration frustration = this.frustration;
            int hashCode5 = (hashCode4 + (frustration == null ? 0 : frustration.f958type.hashCode())) * 31;
            Error error = this.error;
            int hashCode6 = (hashCode5 + (error == null ? 0 : Long.hashCode(error.count))) * 31;
            Crash crash = this.crash;
            int hashCode7 = (hashCode6 + (crash == null ? 0 : Long.hashCode(crash.count))) * 31;
            LongTask longTask = this.longTask;
            int hashCode8 = (hashCode7 + (longTask == null ? 0 : Long.hashCode(longTask.count))) * 31;
            Resource resource = this.resource;
            return hashCode8 + (resource != null ? Long.hashCode(resource.count) : 0);
        }

        public final String toString() {
            return "ActionEventAction(type=" + this.f955type + ", id=" + this.id + ", loadingTime=" + this.loadingTime + ", target=" + this.target + ", frustration=" + this.frustration + ", error=" + this.error + ", crash=" + this.crash + ", longTask=" + this.longTask + ", resource=" + this.resource + ")";
        }
    }

    public final class ActionEventActionTarget {
        public String name;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionEventActionTarget) && Intrinsics.areEqual(this.name, ((ActionEventActionTarget) obj).name);
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionEventActionTarget(name=", this.name, ")");
        }
    }

    public enum ActionEventActionType {
        CUSTOM("custom"),
        CLICK("click"),
        TAP("tap"),
        SCROLL("scroll"),
        SWIPE("swipe"),
        /* JADX INFO: Fake field, exist only in values array */
        APPLICATION_START("application_start"),
        BACK("back");

        public final String jsonValue;

        ActionEventActionType(String str) {
            this.jsonValue = str;
        }
    }

    public final class ActionEventSession {
        public final Boolean hasReplay;
        public final String id;

        /* renamed from: type, reason: collision with root package name */
        public final int f956type;

        public ActionEventSession(int i, Boolean bool, String str) {
            str.getClass();
            if (i == 0) {
                throw null;
            }
            this.id = str;
            this.f956type = i;
            this.hasReplay = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionEventSession)) {
                return false;
            }
            ActionEventSession actionEventSession = (ActionEventSession) obj;
            return Intrinsics.areEqual(this.id, actionEventSession.id) && this.f956type == actionEventSession.f956type && Intrinsics.areEqual(this.hasReplay, actionEventSession.hasReplay);
        }

        public final int hashCode() {
            int m = Thread$State$EnumUnboxingLocalUtility.m(this.f956type, this.id.hashCode() * 31, 31);
            Boolean bool = this.hasReplay;
            return m + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("ActionEventSession(id=", this.id, ", type=");
            int i = this.f956type;
            m3m.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
            m3m.append(", hasReplay=");
            m3m.append(this.hasReplay);
            m3m.append(")");
            return m3m.toString();
        }
    }

    public final class ActionEventView {
        public final String id;
        public final Boolean inForeground;
        public final String name;
        public final String referrer;
        public final String url;

        public ActionEventView(Boolean bool, String str, String str2, String str3, String str4) {
            str.getClass();
            str3.getClass();
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
            this.inForeground = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionEventView)) {
                return false;
            }
            ActionEventView actionEventView = (ActionEventView) obj;
            return Intrinsics.areEqual(this.id, actionEventView.id) && Intrinsics.areEqual(this.referrer, actionEventView.referrer) && Intrinsics.areEqual(this.url, actionEventView.url) && Intrinsics.areEqual(this.name, actionEventView.name) && Intrinsics.areEqual(this.inForeground, actionEventView.inForeground);
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.referrer;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.url);
            String str2 = this.name;
            int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.inForeground;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionEventView(id=", this.id, ", referrer=", this.referrer, ", url=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.url, ", name=", this.name, ", inForeground=");
            return Thread$State$EnumUnboxingLocalUtility.m(m, this.inForeground, ")");
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
        public static ActionEvent fromJsonObject(JsonObject jsonObject) {
            ActionEvent actionEvent;
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
            String asString;
            jsonObject.getClass();
            try {
                long asLong = jsonObject.get(InquiryField.DateField.TYPE).getAsLong();
                JsonObject asJsonObject11 = jsonObject.get("application").getAsJsonObject();
                asJsonObject11.getClass();
                Application fromJsonObject = zzis.fromJsonObject(asJsonObject11);
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
                JsonObject asJsonObject12 = jsonObject.get("session").getAsJsonObject();
                asJsonObject12.getClass();
                ActionEventSession fromJsonObject2 = zzim.fromJsonObject(asJsonObject12);
                JsonElement jsonElement6 = jsonObject.get("source");
                int i2 = 0;
                if (jsonElement6 != null && (asString = jsonElement6.getAsString()) != null) {
                    int[] values = CameraSelector$$ExternalSyntheticOutline0.values(8);
                    actionEvent = null;
                    try {
                        int length = values.length;
                        while (i2 < length) {
                            int i3 = values[i2];
                            int i4 = length;
                            if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$1(i3).equals(asString)) {
                                i = i3;
                            } else {
                                i2++;
                                length = i4;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    } catch (IllegalStateException e) {
                        e = e;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEvent", e);
                        return actionEvent;
                    } catch (NullPointerException e2) {
                        e = e2;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEvent", e);
                        return actionEvent;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEvent", e);
                        return actionEvent;
                    }
                }
                actionEvent = null;
                i = 0;
                JsonObject asJsonObject13 = jsonObject.get("view").getAsJsonObject();
                asJsonObject13.getClass();
                ActionEventView fromJsonObject3 = zzir.fromJsonObject(asJsonObject13);
                JsonElement jsonElement7 = jsonObject.get("usr");
                Usr fromJsonObject4 = (jsonElement7 == null || (asJsonObject10 = jsonElement7.getAsJsonObject()) == null) ? actionEvent : Usr.Companion.fromJsonObject(asJsonObject10);
                JsonElement jsonElement8 = jsonObject.get("account");
                Account fromJsonObject5 = (jsonElement8 == null || (asJsonObject9 = jsonElement8.getAsJsonObject()) == null) ? actionEvent : zzij.fromJsonObject(asJsonObject9);
                JsonElement jsonElement9 = jsonObject.get("connectivity");
                Connectivity fromJsonObject6 = (jsonElement9 == null || (asJsonObject8 = jsonElement9.getAsJsonObject()) == null) ? actionEvent : zzjb.fromJsonObject(asJsonObject8);
                JsonElement jsonElement10 = jsonObject.get("display");
                Display fromJsonObject7 = (jsonElement10 == null || (asJsonObject7 = jsonElement10.getAsJsonObject()) == null) ? actionEvent : News.Action.fromJsonObject(asJsonObject7);
                JsonElement jsonElement11 = jsonObject.get("synthetics");
                Synthetics fromJsonObject8 = (jsonElement11 == null || (asJsonObject6 = jsonElement11.getAsJsonObject()) == null) ? actionEvent : zzjs.fromJsonObject(asJsonObject6);
                JsonElement jsonElement12 = jsonObject.get("ci_test");
                CiTest fromJsonObject9 = (jsonElement12 == null || (asJsonObject5 = jsonElement12.getAsJsonObject()) == null) ? actionEvent : zziu.fromJsonObject(asJsonObject5);
                JsonElement jsonElement13 = jsonObject.get("os");
                Os fromJsonObject10 = (jsonElement13 == null || (asJsonObject4 = jsonElement13.getAsJsonObject()) == null) ? actionEvent : Os.Companion.fromJsonObject(asJsonObject4);
                JsonElement jsonElement14 = jsonObject.get("device");
                Device fromJsonObject11 = (jsonElement14 == null || (asJsonObject3 = jsonElement14.getAsJsonObject()) == null) ? actionEvent : zzjk.fromJsonObject(asJsonObject3);
                JsonObject asJsonObject14 = jsonObject.get("_dd").getAsJsonObject();
                asJsonObject14.getClass();
                Dd fromJsonObject12 = Dd.Companion.fromJsonObject(asJsonObject14);
                JsonElement jsonElement15 = jsonObject.get("context");
                Context fromJsonObject13 = (jsonElement15 == null || (asJsonObject2 = jsonElement15.getAsJsonObject()) == null) ? actionEvent : zzje.fromJsonObject(asJsonObject2);
                JsonElement jsonElement16 = jsonObject.get("container");
                Container fromJsonObject14 = (jsonElement16 == null || (asJsonObject = jsonElement16.getAsJsonObject()) == null) ? actionEvent : zzjc.fromJsonObject(asJsonObject);
                String asString7 = jsonObject.get("type").getAsString();
                JsonObject asJsonObject15 = jsonObject.get("action").getAsJsonObject();
                asJsonObject15.getClass();
                ActionEventAction fromJsonObject15 = zzik.fromJsonObject(asJsonObject15);
                if (Intrinsics.areEqual(asString7, "action")) {
                    return new ActionEvent(asLong, fromJsonObject, asString2, asString3, asString4, asString5, asString6, fromJsonObject2, i, fromJsonObject3, fromJsonObject4, fromJsonObject5, fromJsonObject6, fromJsonObject7, fromJsonObject8, fromJsonObject9, fromJsonObject10, fromJsonObject11, fromJsonObject12, fromJsonObject13, fromJsonObject14, fromJsonObject15);
                }
                throw new IllegalStateException("Check failed.");
            } catch (IllegalStateException e4) {
                e = e4;
                actionEvent = null;
            } catch (NullPointerException e5) {
                e = e5;
                actionEvent = null;
            } catch (NumberFormatException e6) {
                e = e6;
                actionEvent = null;
            }
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewOffersCollection.deepLinkSpecs;
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
            return "Container(view=" + this.view + ", source=" + RumErrorSource$EnumUnboxingLocalUtility.stringValueOf$10(this.source) + ")";
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

    public final class Crash {
        public final long count;

        public Crash(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Crash) && this.count == ((Crash) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "Crash(count=", ")");
        }
    }

    public final class Dd {
        public final DdAction action;
        public final String browserSdkVersion;
        public final Configuration configuration;
        public final String sdkName;
        public final DdSession session;

        public abstract class Companion {
            public static Dd fromJsonObject(JsonObject jsonObject) {
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                JsonObject asJsonObject3;
                jsonObject.getClass();
                try {
                    long asLong = jsonObject.get("format_version").getAsLong();
                    JsonElement jsonElement = jsonObject.get("session");
                    DdSession fromJsonObject = (jsonElement == null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) ? null : zzjj.fromJsonObject(asJsonObject3);
                    JsonElement jsonElement2 = jsonObject.get(BreadcrumbHelper.Category.CONFIGURATION);
                    Configuration fromJsonObject2 = (jsonElement2 == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) ? null : zzja.fromJsonObject(asJsonObject2);
                    JsonElement jsonElement3 = jsonObject.get("browser_sdk_version");
                    String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = jsonObject.get("sdk_name");
                    String asString2 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    JsonElement jsonElement5 = jsonObject.get("action");
                    DdAction fromJsonObject3 = (jsonElement5 == null || (asJsonObject = jsonElement5.getAsJsonObject()) == null) ? null : zzjh.fromJsonObject(asJsonObject);
                    if (asLong == 2) {
                        return new Dd(fromJsonObject, fromJsonObject2, asString, asString2, fromJsonObject3);
                    }
                    throw new IllegalStateException("Check failed.");
                } catch (IllegalStateException e) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e);
                    return null;
                } catch (NullPointerException e2) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e3);
                    return null;
                }
            }

            public static EmptyList getDeepLinkSpecs() {
                return ClientRoute.ViewPayCashtag.deepLinkSpecs;
            }
        }

        public Dd(DdSession ddSession, Configuration configuration, String str, String str2, DdAction ddAction) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.sdkName = str2;
            this.action = ddAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) obj;
            return Intrinsics.areEqual(this.session, dd.session) && Intrinsics.areEqual(this.configuration, dd.configuration) && Intrinsics.areEqual(this.browserSdkVersion, dd.browserSdkVersion) && Intrinsics.areEqual(this.sdkName, dd.sdkName) && Intrinsics.areEqual(this.action, dd.action);
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
            DdAction ddAction = this.action;
            return hashCode4 + (ddAction != null ? ddAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dd(session=");
            sb.append(this.session);
            sb.append(", configuration=");
            sb.append(this.configuration);
            sb.append(", browserSdkVersion=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.browserSdkVersion, ", sdkName=", this.sdkName, ", action=");
            sb.append(this.action);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class DdAction {
        public final int nameSource;
        public final Position position;
        public final DdActionTarget target;

        public DdAction(Position position, DdActionTarget ddActionTarget, int i) {
            this.position = position;
            this.target = ddActionTarget;
            this.nameSource = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DdAction)) {
                return false;
            }
            DdAction ddAction = (DdAction) obj;
            return Intrinsics.areEqual(this.position, ddAction.position) && Intrinsics.areEqual(this.target, ddAction.target) && this.nameSource == ddAction.nameSource;
        }

        public final int hashCode() {
            Position position = this.position;
            int hashCode = (position == null ? 0 : position.hashCode()) * 31;
            DdActionTarget ddActionTarget = this.target;
            int hashCode2 = (hashCode + (ddActionTarget == null ? 0 : ddActionTarget.hashCode())) * 31;
            int i = this.nameSource;
            return hashCode2 + (i != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i) : 0);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("DdAction(position=");
            sb.append(this.position);
            sb.append(", target=");
            sb.append(this.target);
            sb.append(", nameSource=");
            switch (this.nameSource) {
                case 1:
                    str = "CUSTOM_ATTRIBUTE";
                    break;
                case 2:
                    str = "MASK_PLACEHOLDER";
                    break;
                case 3:
                    str = "STANDARD_ATTRIBUTE";
                    break;
                case 4:
                    str = "TEXT_CONTENT";
                    break;
                case 5:
                    str = "MASK_DISALLOWED";
                    break;
                case 6:
                    str = "BLANK";
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

    public final class DdActionTarget {
        public final Long height;
        public final String selector;
        public final Long width;

        public DdActionTarget(Long l, String str, Long l2) {
            this.selector = str;
            this.width = l;
            this.height = l2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DdActionTarget)) {
                return false;
            }
            DdActionTarget ddActionTarget = (DdActionTarget) obj;
            return Intrinsics.areEqual(this.selector, ddActionTarget.selector) && Intrinsics.areEqual(this.width, ddActionTarget.width) && Intrinsics.areEqual(this.height, ddActionTarget.height);
        }

        public final int hashCode() {
            String str = this.selector;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.width;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.height;
            return hashCode2 + (l2 != null ? l2.hashCode() : 0);
        }

        public final String toString() {
            return Thread$State$EnumUnboxingLocalUtility.m(RumErrorSource$EnumUnboxingLocalUtility.m(this.width, "DdActionTarget(selector=", this.selector, ", width=", ", height="), this.height, ")");
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
        public final int f957type;

        public Device(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, Number number, Boolean bool, Number number2) {
            this.f957type = i;
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
            return this.f957type == device.f957type && Intrinsics.areEqual(this.name, device.name) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.brand, device.brand) && Intrinsics.areEqual(this.architecture, device.architecture) && Intrinsics.areEqual(this.locale, device.locale) && Intrinsics.areEqual(this.locales, device.locales) && Intrinsics.areEqual(this.timeZone, device.timeZone) && Intrinsics.areEqual(this.batteryLevel, device.batteryLevel) && Intrinsics.areEqual(this.powerSavingMode, device.powerSavingMode) && Intrinsics.areEqual(this.brightnessLevel, device.brightnessLevel);
        }

        public final int hashCode() {
            int i = this.f957type;
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
            switch (this.f957type) {
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

    public final class Error {
        public final long count;

        public Error(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.count == ((Error) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "Error(count=", ")");
        }
    }

    public final class Frustration {

        /* renamed from: type, reason: collision with root package name */
        public final ArrayList f958type;

        public Frustration(ArrayList arrayList) {
            this.f958type = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Frustration) && this.f958type.equals(((Frustration) obj).f958type);
        }

        public final int hashCode() {
            return this.f958type.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Frustration(type=", ")", this.f958type);
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
        public final long count;

        public LongTask(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LongTask) && this.count == ((LongTask) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "LongTask(count=", ")");
        }
    }

    public final class Os {
        public final String build;
        public final String name;
        public final String version;
        public final String versionMajor;

        public abstract class Companion {
            public static Os fromJsonObject(JsonObject jsonObject) {
                try {
                    String asString = jsonObject.get("name").getAsString();
                    String asString2 = jsonObject.get("version").getAsString();
                    JsonElement jsonElement = jsonObject.get("build");
                    String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
                    String asString4 = jsonObject.get("version_major").getAsString();
                    asString.getClass();
                    asString2.getClass();
                    asString4.getClass();
                    return new Os(asString, asString2, asString3, asString4);
                } catch (IllegalStateException e) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e);
                    return null;
                } catch (NullPointerException e2) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e3);
                    return null;
                }
            }

            public static List getDeepLinkSpecs() {
                return ClientRoute.ViewPaychecksHome.deepLinkSpecs;
            }
        }

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

    public final class Position {
        public final long x;
        public final long y;

        public Position(long j, long j2) {
            this.x = j;
            this.y = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Position)) {
                return false;
            }
            Position position = (Position) obj;
            return this.x == position.x && this.y == position.y;
        }

        public final int hashCode() {
            return Long.hashCode(this.y) + (Long.hashCode(this.x) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.y, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.x, "Position(x=", ", y="));
        }
    }

    public final class Resource {
        public final long count;

        public Resource(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resource) && this.count == ((Resource) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "Resource(count=", ")");
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

    public enum Type {
        /* JADX INFO: Fake field, exist only in values array */
        RAGE_CLICK("rage_click"),
        /* JADX INFO: Fake field, exist only in values array */
        DEAD_CLICK("dead_click"),
        /* JADX INFO: Fake field, exist only in values array */
        ERROR_CLICK("error_click"),
        /* JADX INFO: Fake field, exist only in values array */
        RAGE_TAP("rage_tap"),
        ERROR_TAP("error_tap");

        public final String jsonValue;

        Type(String str) {
            this.jsonValue = str;
        }
    }

    public final class Usr {
        public static final String[] RESERVED_PROPERTIES = {"id", "name", "email", "anonymous_id"};
        public final Map additionalProperties;
        public final String anonymousId;
        public final String email;
        public final String id;
        public final String name;

        public abstract class Companion {
            public static Usr fromJsonObject(JsonObject jsonObject) {
                try {
                    JsonElement jsonElement = jsonObject.get("id");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = jsonObject.get("name");
                    String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = jsonObject.get("email");
                    String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = jsonObject.get("anonymous_id");
                    String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                        if (!ArraysKt___ArraysKt.contains(Usr.RESERVED_PROPERTIES, entry.getKey())) {
                            String key = entry.getKey();
                            key.getClass();
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new Usr(asString, asString2, asString3, asString4, linkedHashMap);
                } catch (IllegalStateException e) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e);
                    return null;
                } catch (NullPointerException e2) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e3);
                    return null;
                }
            }

            public static List getDeepLinkSpecs() {
                return ClientRoute.ViewPaymentPersonalization.deepLinkSpecs;
            }
        }

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

    public ActionEvent(long j, Application application, String str, String str2, String str3, String str4, String str5, ActionEventSession actionEventSession, int i, ActionEventView actionEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, ActionEventAction actionEventAction) {
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.ddtags = str5;
        this.session = actionEventSession;
        this.source = i;
        this.view = actionEventView;
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
        this.container = container;
        this.action = actionEventAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionEvent)) {
            return false;
        }
        ActionEvent actionEvent = (ActionEvent) obj;
        return this.date == actionEvent.date && this.application.equals(actionEvent.application) && Intrinsics.areEqual(this.service, actionEvent.service) && Intrinsics.areEqual(this.version, actionEvent.version) && Intrinsics.areEqual(this.buildVersion, actionEvent.buildVersion) && Intrinsics.areEqual(this.buildId, actionEvent.buildId) && Intrinsics.areEqual(this.ddtags, actionEvent.ddtags) && this.session.equals(actionEvent.session) && this.source == actionEvent.source && this.view.equals(actionEvent.view) && Intrinsics.areEqual(this.usr, actionEvent.usr) && Intrinsics.areEqual(this.account, actionEvent.account) && Intrinsics.areEqual(this.connectivity, actionEvent.connectivity) && Intrinsics.areEqual(this.display, actionEvent.display) && Intrinsics.areEqual(this.synthetics, actionEvent.synthetics) && Intrinsics.areEqual(this.ciTest, actionEvent.ciTest) && Intrinsics.areEqual(this.os, actionEvent.os) && Intrinsics.areEqual(this.device, actionEvent.device) && this.dd.equals(actionEvent.dd) && Intrinsics.areEqual(this.context, actionEvent.context) && Intrinsics.areEqual(this.container, actionEvent.container) && this.action.equals(actionEvent.action);
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
        Container container = this.container;
        return this.action.hashCode() + ((hashCode16 + (container != null ? container.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionEvent(date=");
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
        sb.append(RumErrorSource$EnumUnboxingLocalUtility.stringValueOf$10(this.source));
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
        sb.append(", container=");
        sb.append(this.container);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(")");
        return sb.toString();
    }
}
