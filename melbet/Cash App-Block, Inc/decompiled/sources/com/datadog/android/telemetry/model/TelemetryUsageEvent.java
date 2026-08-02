package com.datadog.android.telemetry.model;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.mlkit.vision.text.zzd;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TelemetryUsageEvent {
    public final Action action;
    public final Application application;
    public final long date;
    public final zzd dd;
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
        public static final String[] RESERVED_PROPERTIES = {"device", "os", "type", "usage"};
        public final LinkedHashMap additionalProperties;
        public final Device device;
        public final Os os;
        public final TelemetryUsageEvent$Usage$AddViewLoadingTime usage;

        public Telemetry(Device device, Os os, TelemetryUsageEvent$Usage$AddViewLoadingTime telemetryUsageEvent$Usage$AddViewLoadingTime, LinkedHashMap linkedHashMap) {
            this.device = device;
            this.os = os;
            this.usage = telemetryUsageEvent$Usage$AddViewLoadingTime;
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
            return this.device.equals(telemetry.device) && this.os.equals(telemetry.os) && this.usage.equals(telemetry.usage) && this.additionalProperties.equals(telemetry.additionalProperties);
        }

        public final int hashCode() {
            return this.additionalProperties.hashCode() + ((this.usage.hashCode() + ((this.os.hashCode() + (this.device.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Telemetry(device=" + this.device + ", os=" + this.os + ", usage=" + this.usage + ", additionalProperties=" + this.additionalProperties + ")";
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

    public TelemetryUsageEvent(zzd zzdVar, long j, int i, String str, Application application, Session session, View view, Action action, Float f, Telemetry telemetry) {
        if (i == 0) {
            throw null;
        }
        str.getClass();
        this.dd = zzdVar;
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
        if (obj instanceof TelemetryUsageEvent) {
            TelemetryUsageEvent telemetryUsageEvent = (TelemetryUsageEvent) obj;
            if (this.dd == telemetryUsageEvent.dd && this.date == telemetryUsageEvent.date && this.source == telemetryUsageEvent.source && Intrinsics.areEqual(this.version, telemetryUsageEvent.version) && this.application.equals(telemetryUsageEvent.application) && this.session.equals(telemetryUsageEvent.session) && Intrinsics.areEqual(this.view, telemetryUsageEvent.view) && Intrinsics.areEqual(this.action, telemetryUsageEvent.action) && this.effectiveSampleRate.equals(telemetryUsageEvent.effectiveSampleRate) && this.telemetry.equals(telemetryUsageEvent.telemetry)) {
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

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TelemetryUsageEvent(dd=");
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
