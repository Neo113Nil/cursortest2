package com.datadog.android.telemetry.model;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.mlkit.vision.text.zzc;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TelemetryErrorEvent {
    public final Action action;
    public final Application application;
    public final long date;
    public final zzc dd;
    public final Number effectiveSampleRate;
    public final List experimentalFeatures;
    public final String service;
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

    public final class Error {
        public final String kind;
        public final String stack;

        public Error(String str, String str2) {
            this.stack = str;
            this.kind = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.stack, error.stack) && Intrinsics.areEqual(this.kind, error.kind);
        }

        public final int hashCode() {
            String str = this.stack;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.kind;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Error(stack=", this.stack, ", kind=", this.kind, ")");
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
        public static final String[] RESERVED_PROPERTIES = {"device", "os", "type", "status", "message", BreadcrumbHelper.Category.ERROR};
        public final LinkedHashMap additionalProperties;
        public final Device device;
        public final Error error;
        public final String message;
        public final Os os;

        public Telemetry(Device device, Os os, String str, Error error, LinkedHashMap linkedHashMap) {
            str.getClass();
            this.device = device;
            this.os = os;
            this.message = str;
            this.error = error;
            this.additionalProperties = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Telemetry)) {
                return false;
            }
            Telemetry telemetry = (Telemetry) obj;
            return Intrinsics.areEqual(this.device, telemetry.device) && Intrinsics.areEqual(this.os, telemetry.os) && Intrinsics.areEqual(this.message, telemetry.message) && Intrinsics.areEqual(this.error, telemetry.error) && this.additionalProperties.equals(telemetry.additionalProperties);
        }

        public final int hashCode() {
            Device device = this.device;
            int hashCode = (device == null ? 0 : device.hashCode()) * 31;
            Os os = this.os;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (os == null ? 0 : os.hashCode())) * 31, 31, this.message);
            Error error = this.error;
            return this.additionalProperties.hashCode() + ((m + (error != null ? error.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Telemetry(device=" + this.device + ", os=" + this.os + ", message=" + this.message + ", error=" + this.error + ", additionalProperties=" + this.additionalProperties + ")";
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

    public TelemetryErrorEvent(zzc zzcVar, long j, String str, int i, String str2, Application application, Session session, View view, Action action, Number number, ArrayList arrayList, Telemetry telemetry) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        str2.getClass();
        this.dd = zzcVar;
        this.date = j;
        this.service = str;
        this.source = i;
        this.version = str2;
        this.application = application;
        this.session = session;
        this.view = view;
        this.action = action;
        this.effectiveSampleRate = number;
        this.experimentalFeatures = arrayList;
        this.telemetry = telemetry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TelemetryErrorEvent) {
            TelemetryErrorEvent telemetryErrorEvent = (TelemetryErrorEvent) obj;
            if (this.dd == telemetryErrorEvent.dd && this.date == telemetryErrorEvent.date && Intrinsics.areEqual(this.service, telemetryErrorEvent.service) && this.source == telemetryErrorEvent.source && Intrinsics.areEqual(this.version, telemetryErrorEvent.version) && Intrinsics.areEqual(this.application, telemetryErrorEvent.application) && Intrinsics.areEqual(this.session, telemetryErrorEvent.session) && Intrinsics.areEqual(this.view, telemetryErrorEvent.view) && Intrinsics.areEqual(this.action, telemetryErrorEvent.action) && Intrinsics.areEqual(this.effectiveSampleRate, telemetryErrorEvent.effectiveSampleRate) && Intrinsics.areEqual(this.experimentalFeatures, telemetryErrorEvent.experimentalFeatures) && this.telemetry.equals(telemetryErrorEvent.telemetry)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Thread$State$EnumUnboxingLocalUtility.m(this.source, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.dd.hashCode() * 31, 31, this.date), 31, this.service), 31), 31, this.version);
        Application application = this.application;
        int hashCode = (m + (application == null ? 0 : application.id.hashCode())) * 31;
        Session session = this.session;
        int hashCode2 = (hashCode + (session == null ? 0 : session.id.hashCode())) * 31;
        View view = this.view;
        int hashCode3 = (hashCode2 + (view == null ? 0 : view.id.hashCode())) * 31;
        Action action = this.action;
        int hashCode4 = (hashCode3 + (action == null ? 0 : action.id.hashCode())) * 31;
        Number number = this.effectiveSampleRate;
        int hashCode5 = (hashCode4 + (number == null ? 0 : number.hashCode())) * 31;
        List list = this.experimentalFeatures;
        return this.telemetry.hashCode() + ((hashCode5 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("format_version", (Number) 2L);
        jsonObject.add("_dd", jsonObject2);
        jsonObject.addProperty("type", "telemetry");
        jsonObject.addProperty(InquiryField.DateField.TYPE, Long.valueOf(this.date));
        jsonObject.addProperty("service", this.service);
        jsonObject.add("source", new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$21(this.source)));
        jsonObject.addProperty("version", this.version);
        Application application = this.application;
        if (application != null) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("id", application.id);
            jsonObject.add("application", jsonObject3);
        }
        Session session = this.session;
        if (session != null) {
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("id", session.id);
            jsonObject.add("session", jsonObject4);
        }
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
        Number number = this.effectiveSampleRate;
        if (number != null) {
            jsonObject.addProperty("effective_sample_rate", number);
        }
        List list = this.experimentalFeatures;
        if (list != null) {
            JsonArray jsonArray = new JsonArray(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jsonArray.add((String) it.next());
            }
            jsonObject.add("experimental_features", jsonArray);
        }
        JsonObject jsonObject7 = new JsonObject();
        Telemetry telemetry = this.telemetry;
        Device device = telemetry.device;
        if (device != null) {
            JsonObject jsonObject8 = new JsonObject();
            String str = device.architecture;
            if (str != null) {
                jsonObject8.addProperty("architecture", str);
            }
            String str2 = device.brand;
            if (str2 != null) {
                jsonObject8.addProperty("brand", str2);
            }
            String str3 = device.model;
            if (str3 != null) {
                jsonObject8.addProperty("model", str3);
            }
            jsonObject7.add("device", jsonObject8);
        }
        Os os = telemetry.os;
        if (os != null) {
            JsonObject jsonObject9 = new JsonObject();
            String str4 = os.build;
            if (str4 != null) {
                jsonObject9.addProperty("build", str4);
            }
            String str5 = os.name;
            if (str5 != null) {
                jsonObject9.addProperty("name", str5);
            }
            String str6 = os.version;
            if (str6 != null) {
                jsonObject9.addProperty("version", str6);
            }
            jsonObject7.add("os", jsonObject9);
        }
        jsonObject7.addProperty("type", "log");
        jsonObject7.addProperty("status", BreadcrumbHelper.Category.ERROR);
        jsonObject7.addProperty("message", telemetry.message);
        Error error = telemetry.error;
        if (error != null) {
            JsonObject jsonObject10 = new JsonObject();
            String str7 = error.stack;
            if (str7 != null) {
                jsonObject10.addProperty("stack", str7);
            }
            String str8 = error.kind;
            if (str8 != null) {
                jsonObject10.addProperty("kind", str8);
            }
            jsonObject7.add(BreadcrumbHelper.Category.ERROR, jsonObject10);
        }
        for (Map.Entry entry : telemetry.additionalProperties.entrySet()) {
            String str9 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!ArraysKt___ArraysKt.contains(Telemetry.RESERVED_PROPERTIES, str9)) {
                jsonObject7.add(str9, JsonSerializer.toJsonElement(value));
            }
        }
        jsonObject.add("telemetry", jsonObject7);
        return jsonObject;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TelemetryErrorEvent(dd=");
        sb.append(this.dd);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", source=");
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
        sb.append(", experimentalFeatures=");
        sb.append(this.experimentalFeatures);
        sb.append(", telemetry=");
        sb.append(this.telemetry);
        sb.append(")");
        return sb.toString();
    }
}
