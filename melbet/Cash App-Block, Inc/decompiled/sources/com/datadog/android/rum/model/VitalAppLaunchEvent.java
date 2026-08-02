package com.datadog.android.rum.model;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.wire.MoshiJsonIntegration;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class VitalAppLaunchEvent {
    public final Application application;
    public final String buildId;
    public final String buildVersion;
    public final Connectivity connectivity;
    public final Context context;
    public final long date;
    public final Dd dd;
    public final String ddtags;
    public final Device device;
    public final Os os;
    public final String service;
    public final VitalAppLaunchEventSession session;
    public final int source;
    public final Synthetics synthetics;
    public final Usr usr;
    public final String version;
    public final VitalAppLaunchEventView view;
    public final Vital vital;

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

    public final class Configuration {
        public final Float sessionSampleRate;

        public Configuration(Float f) {
            this.sessionSampleRate = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Configuration) && this.sessionSampleRate.equals(((Configuration) obj).sessionSampleRate);
        }

        public final int hashCode() {
            return this.sessionSampleRate.hashCode() * 961;
        }

        public final String toString() {
            return "Configuration(sessionSampleRate=" + this.sessionSampleRate + ", sessionReplaySampleRate=null, profilingSampleRate=null)";
        }
    }

    public final class Connectivity {
        public final Cellular cellular;
        public final List interfaces;
        public final int status;

        public Connectivity(int i, List list, Cellular cellular) {
            if (i == 0) {
                throw null;
            }
            this.status = i;
            this.interfaces = list;
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
            return this.status == connectivity.status && Intrinsics.areEqual(this.interfaces, connectivity.interfaces) && Intrinsics.areEqual(this.cellular, connectivity.cellular);
        }

        public final int hashCode() {
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.status) * 31;
            List list = this.interfaces;
            int hashCode = (ordinal + (list == null ? 0 : list.hashCode())) * 961;
            Cellular cellular = this.cellular;
            return hashCode + (cellular != null ? cellular.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Connectivity(status=");
            int i = this.status;
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "MAYBE" : "NOT_CONNECTED" : "CONNECTED");
            sb.append(", interfaces=");
            sb.append(this.interfaces);
            sb.append(", effectiveType=");
            sb.append("null");
            sb.append(", cellular=");
            sb.append(this.cellular);
            sb.append(")");
            return sb.toString();
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
        public final Configuration configuration;
        public final Profiling profiling;
        public final DdSession session;

        public Dd(DdSession ddSession, Configuration configuration, Profiling profiling) {
            this.session = ddSession;
            this.configuration = configuration;
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
            return this.session.equals(dd.session) && this.configuration.equals(dd.configuration) && this.profiling.equals(dd.profiling);
        }

        public final int hashCode() {
            return this.profiling.hashCode() + ((this.configuration.hashCode() + (this.session.hashCode() * 31)) * 29791);
        }

        public final String toString() {
            return "Dd(session=" + this.session + ", configuration=" + this.configuration + ", browserSdkVersion=null, sdkName=null, profiling=" + this.profiling + ")";
        }
    }

    public final class DdSession {
        public final int sessionPrecondition;

        public DdSession(int i) {
            this.sessionPrecondition = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DdSession) && this.sessionPrecondition == ((DdSession) obj).sessionPrecondition;
        }

        public final int hashCode() {
            int i = this.sessionPrecondition;
            if (i == 0) {
                return 0;
            }
            return CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("DdSession(plan=null, sessionPrecondition=");
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
        public final Float batteryLevel;
        public final String brand;
        public final Number brightnessLevel;
        public final List locales;
        public final String model;
        public final String name;
        public final Boolean powerSavingMode;
        public final String timeZone;

        /* renamed from: type, reason: collision with root package name */
        public final int f972type;

        public Device(int i, String str, String str2, String str3, String str4, List list, String str5, Float f, Boolean bool, Number number) {
            this.f972type = i;
            this.name = str;
            this.model = str2;
            this.brand = str3;
            this.architecture = str4;
            this.locales = list;
            this.timeZone = str5;
            this.batteryLevel = f;
            this.powerSavingMode = bool;
            this.brightnessLevel = number;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return false;
            }
            Device device = (Device) obj;
            return this.f972type == device.f972type && Intrinsics.areEqual(this.name, device.name) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.brand, device.brand) && Intrinsics.areEqual(this.architecture, device.architecture) && Intrinsics.areEqual(this.locales, device.locales) && Intrinsics.areEqual(this.timeZone, device.timeZone) && Intrinsics.areEqual((Object) this.batteryLevel, (Object) device.batteryLevel) && Intrinsics.areEqual(this.powerSavingMode, device.powerSavingMode) && Intrinsics.areEqual(this.brightnessLevel, device.brightnessLevel);
        }

        public final int hashCode() {
            int i = this.f972type;
            int ordinal = (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) * 31;
            String str = this.name;
            int hashCode = (ordinal + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.model;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.brand;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.architecture;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 961;
            List list = this.locales;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str5 = this.timeZone;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Float f = this.batteryLevel;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            Boolean bool = this.powerSavingMode;
            int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            Number number = this.brightnessLevel;
            return hashCode8 + (number != null ? number.hashCode() : 0);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("Device(type=");
            switch (this.f972type) {
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
            NavAction$$ExternalSyntheticOutline0.m(this.architecture, ", locale=null, locales=", ", timeZone=", sb, this.locales);
            sb.append(this.timeZone);
            sb.append(", batteryLevel=");
            sb.append(this.batteryLevel);
            sb.append(", powerSavingMode=");
            sb.append(this.powerSavingMode);
            sb.append(", brightnessLevel=");
            sb.append(this.brightnessLevel);
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

    public final class Os {
        public final String name;
        public final String version;
        public final String versionMajor;

        public Os(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.name = str;
            this.version = str2;
            this.versionMajor = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Os)) {
                return false;
            }
            Os os = (Os) obj;
            return Intrinsics.areEqual(this.name, os.name) && Intrinsics.areEqual(this.version, os.version) && Intrinsics.areEqual(this.versionMajor, os.versionMajor);
        }

        public final int hashCode() {
            return this.versionMajor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 961, this.version);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Os(name=", this.name, ", version=", this.version, ", build=null, versionMajor="), this.versionMajor, ")");
        }
    }

    public final class Profiling {
        public final int status;

        public Profiling(int i) {
            this.status = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Profiling) && this.status == ((Profiling) obj).status;
        }

        public final int hashCode() {
            int i = this.status;
            return (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) * 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Profiling(status=");
            int i = this.status;
            sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "ERROR" : "STOPPED" : "RUNNING" : "STARTING");
            sb.append(", errorReason=");
            sb.append("null");
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Synthetics {
        public final String resultId;
        public final String testId;

        public Synthetics(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.testId = str;
            this.resultId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Synthetics)) {
                return false;
            }
            Synthetics synthetics = (Synthetics) obj;
            return Intrinsics.areEqual(this.testId, synthetics.testId) && Intrinsics.areEqual(this.resultId, synthetics.resultId);
        }

        public final int hashCode() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.testId.hashCode() * 31, 31, this.resultId);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Synthetics(testId=", this.testId, ", resultId=", this.resultId, ", injected=null)");
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

    public final class Vital {
        public final int appLaunchMetric;
        public final Long duration;
        public final Boolean hasSavedInstanceStateBundle;
        public final String id;
        public final String name;
        public final int startupType;

        public Vital(String str, String str2, int i, Long l, int i2, Boolean bool) {
            str.getClass();
            if (i == 0) {
                throw null;
            }
            this.id = str;
            this.name = str2;
            this.appLaunchMetric = i;
            this.duration = l;
            this.startupType = i2;
            this.hasSavedInstanceStateBundle = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vital)) {
                return false;
            }
            Vital vital = (Vital) obj;
            return Intrinsics.areEqual(this.id, vital.id) && this.name.equals(vital.name) && this.appLaunchMetric == vital.appLaunchMetric && this.duration.equals(vital.duration) && this.startupType == vital.startupType && this.hasSavedInstanceStateBundle.equals(vital.hasSavedInstanceStateBundle);
        }

        public final int hashCode() {
            int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.duration, Thread$State$EnumUnboxingLocalUtility.m(this.appLaunchMetric, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 961, this.name), 31), 31);
            int i = this.startupType;
            return this.hasSavedInstanceStateBundle.hashCode() + ((m + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 961);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Vital(id=", this.id, ", name=", this.name, ", description=null, appLaunchMetric=");
            String str = "null";
            int i = this.appLaunchMetric;
            m.append(i != 1 ? i != 2 ? "null" : "TTFD" : "TTID");
            m.append(", duration=");
            m.append(this.duration);
            m.append(", startupType=");
            int i2 = this.startupType;
            if (i2 == 1) {
                str = "COLD_START";
            } else if (i2 == 2) {
                str = "WARM_START";
            }
            m.append(str);
            m.append(", isPrewarmed=null, hasSavedInstanceStateBundle=");
            m.append(this.hasSavedInstanceStateBundle);
            m.append(")");
            return m.toString();
        }
    }

    public final class VitalAppLaunchEventSession {
        public final String id;

        /* renamed from: type, reason: collision with root package name */
        public final int f973type;

        public VitalAppLaunchEventSession(String str, int i) {
            str.getClass();
            if (i == 0) {
                throw null;
            }
            this.id = str;
            this.f973type = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VitalAppLaunchEventSession)) {
                return false;
            }
            VitalAppLaunchEventSession vitalAppLaunchEventSession = (VitalAppLaunchEventSession) obj;
            return Intrinsics.areEqual(this.id, vitalAppLaunchEventSession.id) && this.f973type == vitalAppLaunchEventSession.f973type;
        }

        public final int hashCode() {
            return Thread$State$EnumUnboxingLocalUtility.m(this.f973type, this.id.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("VitalAppLaunchEventSession(id=", this.id, ", type=");
            int i = this.f973type;
            m3m.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
            m3m.append(", hasReplay=null)");
            return m3m.toString();
        }
    }

    public final class VitalAppLaunchEventView {
        public final String id;
        public final String name;
        public final String url;

        public VitalAppLaunchEventView(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.url = str2;
            this.name = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VitalAppLaunchEventView)) {
                return false;
            }
            VitalAppLaunchEventView vitalAppLaunchEventView = (VitalAppLaunchEventView) obj;
            return Intrinsics.areEqual(this.id, vitalAppLaunchEventView.id) && Intrinsics.areEqual(this.url, vitalAppLaunchEventView.url) && Intrinsics.areEqual(this.name, vitalAppLaunchEventView.name);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 961, 31, this.url);
            String str = this.name;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VitalAppLaunchEventView(id=", this.id, ", referrer=null, url=", this.url, ", name="), this.name, ")");
        }
    }

    public VitalAppLaunchEvent(long j, Application application, String str, String str2, String str3, String str4, String str5, VitalAppLaunchEventSession vitalAppLaunchEventSession, int i, VitalAppLaunchEventView vitalAppLaunchEventView, Usr usr, MoshiJsonIntegration moshiJsonIntegration, Connectivity connectivity, Synthetics synthetics, Os os, Device device, Dd dd, Context context, Vital vital) {
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.ddtags = str5;
        this.session = vitalAppLaunchEventSession;
        this.source = i;
        this.view = vitalAppLaunchEventView;
        this.usr = usr;
        this.connectivity = connectivity;
        this.synthetics = synthetics;
        this.os = os;
        this.device = device;
        this.dd = dd;
        this.context = context;
        this.vital = vital;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VitalAppLaunchEvent)) {
            return false;
        }
        VitalAppLaunchEvent vitalAppLaunchEvent = (VitalAppLaunchEvent) obj;
        return this.date == vitalAppLaunchEvent.date && this.application.equals(vitalAppLaunchEvent.application) && Intrinsics.areEqual(this.service, vitalAppLaunchEvent.service) && Intrinsics.areEqual(this.version, vitalAppLaunchEvent.version) && Intrinsics.areEqual(this.buildVersion, vitalAppLaunchEvent.buildVersion) && Intrinsics.areEqual(this.buildId, vitalAppLaunchEvent.buildId) && Intrinsics.areEqual(this.ddtags, vitalAppLaunchEvent.ddtags) && this.session.equals(vitalAppLaunchEvent.session) && this.source == vitalAppLaunchEvent.source && Intrinsics.areEqual(this.view, vitalAppLaunchEvent.view) && Intrinsics.areEqual(this.usr, vitalAppLaunchEvent.usr) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.connectivity, vitalAppLaunchEvent.connectivity) && Intrinsics.areEqual(this.synthetics, vitalAppLaunchEvent.synthetics) && Intrinsics.areEqual(this.os, vitalAppLaunchEvent.os) && Intrinsics.areEqual(this.device, vitalAppLaunchEvent.device) && this.dd.equals(vitalAppLaunchEvent.dd) && Intrinsics.areEqual(this.context, vitalAppLaunchEvent.context) && this.vital.equals(vitalAppLaunchEvent.vital);
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
        int ordinal = (hashCode6 + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 31;
        VitalAppLaunchEventView vitalAppLaunchEventView = this.view;
        int hashCode7 = (ordinal + (vitalAppLaunchEventView == null ? 0 : vitalAppLaunchEventView.hashCode())) * 31;
        Usr usr = this.usr;
        int hashCode8 = (hashCode7 + (usr == null ? 0 : usr.hashCode())) * 961;
        Connectivity connectivity = this.connectivity;
        int hashCode9 = (hashCode8 + (connectivity == null ? 0 : connectivity.hashCode())) * 961;
        Synthetics synthetics = this.synthetics;
        int hashCode10 = (hashCode9 + (synthetics == null ? 0 : synthetics.hashCode())) * 961;
        Os os = this.os;
        int hashCode11 = (hashCode10 + (os == null ? 0 : os.hashCode())) * 31;
        Device device = this.device;
        int hashCode12 = (this.dd.hashCode() + ((hashCode11 + (device == null ? 0 : device.hashCode())) * 31)) * 31;
        Context context = this.context;
        return this.vital.hashCode() + ((hashCode12 + (context != null ? context.additionalProperties.hashCode() : 0)) * 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("VitalAppLaunchEvent(date=");
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
                str = "ROKU";
                break;
            case 7:
                str = "UNITY";
                break;
            case 8:
                str = "KOTLIN_MULTIPLATFORM";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", view=");
        sb.append(this.view);
        sb.append(", usr=");
        sb.append(this.usr);
        sb.append(", account=");
        sb.append((Object) null);
        sb.append(", connectivity=");
        sb.append(this.connectivity);
        sb.append(", display=null, synthetics=");
        sb.append(this.synthetics);
        sb.append(", ciTest=null, os=");
        sb.append(this.os);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", dd=");
        sb.append(this.dd);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", container=null, vital=");
        sb.append(this.vital);
        sb.append(")");
        return sb.toString();
    }
}
