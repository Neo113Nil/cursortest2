package com.datadog.android.telemetry.model;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.mlkit.vision.text.zzb;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TelemetryDebugEvent {
    public final Action action;
    public final Application application;
    public final long date;
    public final zzb dd;
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
        public static final String[] RESERVED_PROPERTIES = {"device", "os", "type", "status", "message"};
        public final LinkedHashMap additionalProperties;
        public final Device device;
        public final String message;
        public final Os os;

        public Telemetry(Device device, Os os, String str, LinkedHashMap linkedHashMap) {
            str.getClass();
            this.device = device;
            this.os = os;
            this.message = str;
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
            return Intrinsics.areEqual(this.device, telemetry.device) && Intrinsics.areEqual(this.os, telemetry.os) && Intrinsics.areEqual(this.message, telemetry.message) && this.additionalProperties.equals(telemetry.additionalProperties);
        }

        public final int hashCode() {
            Device device = this.device;
            int hashCode = (device == null ? 0 : device.hashCode()) * 31;
            Os os = this.os;
            return this.additionalProperties.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (os != null ? os.hashCode() : 0)) * 31, 31, this.message);
        }

        public final String toString() {
            return "Telemetry(device=" + this.device + ", os=" + this.os + ", message=" + this.message + ", additionalProperties=" + this.additionalProperties + ")";
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

    public TelemetryDebugEvent(zzb zzbVar, long j, String str, int i, String str2, Application application, Session session, View view, Action action, Number number, ArrayList arrayList, Telemetry telemetry) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        str2.getClass();
        this.dd = zzbVar;
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
        if (obj instanceof TelemetryDebugEvent) {
            TelemetryDebugEvent telemetryDebugEvent = (TelemetryDebugEvent) obj;
            if (this.dd == telemetryDebugEvent.dd && this.date == telemetryDebugEvent.date && Intrinsics.areEqual(this.service, telemetryDebugEvent.service) && this.source == telemetryDebugEvent.source && Intrinsics.areEqual(this.version, telemetryDebugEvent.version) && Intrinsics.areEqual(this.application, telemetryDebugEvent.application) && Intrinsics.areEqual(this.session, telemetryDebugEvent.session) && Intrinsics.areEqual(this.view, telemetryDebugEvent.view) && Intrinsics.areEqual(this.action, telemetryDebugEvent.action) && Intrinsics.areEqual(this.effectiveSampleRate, telemetryDebugEvent.effectiveSampleRate) && Intrinsics.areEqual(this.experimentalFeatures, telemetryDebugEvent.experimentalFeatures) && this.telemetry.equals(telemetryDebugEvent.telemetry)) {
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

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TelemetryDebugEvent(dd=");
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
