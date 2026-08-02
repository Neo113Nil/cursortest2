package com.datadog.android.rum.model;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_common.zzjv;
import com.google.android.gms.internal.mlkit_vision_common.zzjw;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.postcard.CardModule;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class ErrorEvent {
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
    public final Error error;
    public final Context featureFlags;
    public final Freeze freeze;
    public final Os os;
    public final String service;
    public final ErrorEventSession session;
    public final int source;
    public final Synthetics synthetics;
    public final Usr usr;
    public final String version;
    public final ErrorEventView view;

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

    public final class BinaryImage {
        public final String arch;
        public final boolean isSystem;
        public final String loadAddress;
        public final String maxAddress;
        public final String name;
        public final String uuid;

        public BinaryImage(String str, String str2, String str3, String str4, String str5, boolean z) {
            str.getClass();
            str2.getClass();
            this.uuid = str;
            this.name = str2;
            this.isSystem = z;
            this.loadAddress = str3;
            this.maxAddress = str4;
            this.arch = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BinaryImage)) {
                return false;
            }
            BinaryImage binaryImage = (BinaryImage) obj;
            return Intrinsics.areEqual(this.uuid, binaryImage.uuid) && Intrinsics.areEqual(this.name, binaryImage.name) && this.isSystem == binaryImage.isSystem && Intrinsics.areEqual(this.loadAddress, binaryImage.loadAddress) && Intrinsics.areEqual(this.maxAddress, binaryImage.maxAddress) && Intrinsics.areEqual(this.arch, binaryImage.arch);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.uuid.hashCode() * 31, 31, this.name), 31, this.isSystem);
            String str = this.loadAddress;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.maxAddress;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.arch;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BinaryImage(uuid=", this.uuid, ", name=", this.name, ", isSystem=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.isSystem, ", loadAddress=", this.loadAddress, ", maxAddress=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.maxAddress, ", arch=", this.arch, ")");
        }
    }

    public final class Cause {
        public final String message;
        public final int source;
        public final String stack;

        /* renamed from: type, reason: collision with root package name */
        public final String f959type;

        public Cause(String str, String str2, String str3, int i) {
            str.getClass();
            if (i == 0) {
                throw null;
            }
            this.message = str;
            this.f959type = str2;
            this.stack = str3;
            this.source = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cause)) {
                return false;
            }
            Cause cause = (Cause) obj;
            return Intrinsics.areEqual(this.message, cause.message) && Intrinsics.areEqual(this.f959type, cause.f959type) && Intrinsics.areEqual(this.stack, cause.stack) && this.source == cause.source;
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            String str = this.f959type;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.stack;
            return CameraSelector$$ExternalSyntheticOutline0.ordinal(this.source) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Cause(message=", this.message, ", type=", this.f959type, ", stack=");
            m.append(this.stack);
            m.append(", source=");
            m.append(RumErrorSource$EnumUnboxingLocalUtility.stringValueOf$22(this.source));
            m.append(")");
            return m.toString();
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
        public static ErrorEvent fromJsonObject(JsonObject jsonObject) {
            ErrorEvent errorEvent;
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
            JsonObject asJsonObject12;
            JsonObject asJsonObject13;
            String asString;
            jsonObject.getClass();
            try {
                long asLong = jsonObject.get(InquiryField.DateField.TYPE).getAsLong();
                JsonObject asJsonObject14 = jsonObject.get("application").getAsJsonObject();
                asJsonObject14.getClass();
                Application fromJsonObject = zzjx.fromJsonObject(asJsonObject14);
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
                JsonObject asJsonObject15 = jsonObject.get("session").getAsJsonObject();
                asJsonObject15.getClass();
                ErrorEventSession fromJsonObject2 = zzko.fromJsonObject(asJsonObject15);
                JsonElement jsonElement6 = jsonObject.get("source");
                int i2 = 0;
                if (jsonElement6 != null && (asString = jsonElement6.getAsString()) != null) {
                    int[] values = CameraSelector$$ExternalSyntheticOutline0.values(8);
                    errorEvent = null;
                    try {
                        int length = values.length;
                        while (i2 < length) {
                            int i3 = values[i2];
                            int i4 = length;
                            if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$12(i3).equals(asString)) {
                                i = i3;
                            } else {
                                i2++;
                                length = i4;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    } catch (IllegalStateException e) {
                        e = e;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ErrorEvent", e);
                        return errorEvent;
                    } catch (NullPointerException e2) {
                        e = e2;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ErrorEvent", e);
                        return errorEvent;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ErrorEvent", e);
                        return errorEvent;
                    }
                }
                errorEvent = null;
                i = 0;
                JsonObject asJsonObject16 = jsonObject.get("view").getAsJsonObject();
                asJsonObject16.getClass();
                ErrorEventView fromJsonObject3 = zzkp.fromJsonObject(asJsonObject16);
                JsonElement jsonElement7 = jsonObject.get("usr");
                Usr fromJsonObject4 = (jsonElement7 == null || (asJsonObject13 = jsonElement7.getAsJsonObject()) == null) ? errorEvent : Usr.Companion.fromJsonObject(asJsonObject13);
                JsonElement jsonElement8 = jsonObject.get("account");
                Account fromJsonObject5 = (jsonElement8 == null || (asJsonObject12 = jsonElement8.getAsJsonObject()) == null) ? errorEvent : zzjv.fromJsonObject(asJsonObject12);
                JsonElement jsonElement9 = jsonObject.get("connectivity");
                Connectivity fromJsonObject6 = (jsonElement9 == null || (asJsonObject11 = jsonElement9.getAsJsonObject()) == null) ? errorEvent : zzke.fromJsonObject(asJsonObject11);
                JsonElement jsonElement10 = jsonObject.get("display");
                Display fromJsonObject7 = (jsonElement10 == null || (asJsonObject10 = jsonElement10.getAsJsonObject()) == null) ? errorEvent : zzkm.fromJsonObject(asJsonObject10);
                JsonElement jsonElement11 = jsonObject.get("synthetics");
                Synthetics fromJsonObject8 = (jsonElement11 == null || (asJsonObject9 = jsonElement11.getAsJsonObject()) == null) ? errorEvent : zzkv.fromJsonObject(asJsonObject9);
                JsonElement jsonElement12 = jsonObject.get("ci_test");
                CiTest fromJsonObject9 = (jsonElement12 == null || (asJsonObject8 = jsonElement12.getAsJsonObject()) == null) ? errorEvent : zzkb.fromJsonObject(asJsonObject8);
                JsonElement jsonElement13 = jsonObject.get("os");
                Os fromJsonObject10 = (jsonElement13 == null || (asJsonObject7 = jsonElement13.getAsJsonObject()) == null) ? errorEvent : Os.Companion.fromJsonObject(asJsonObject7);
                JsonElement jsonElement14 = jsonObject.get("device");
                Device fromJsonObject11 = (jsonElement14 == null || (asJsonObject6 = jsonElement14.getAsJsonObject()) == null) ? errorEvent : zzkl.fromJsonObject(asJsonObject6);
                JsonObject asJsonObject17 = jsonObject.get("_dd").getAsJsonObject();
                asJsonObject17.getClass();
                Dd fromJsonObject12 = Dd.Companion.fromJsonObject(asJsonObject17);
                JsonElement jsonElement15 = jsonObject.get("context");
                Context fromJsonObject13 = (jsonElement15 == null || (asJsonObject5 = jsonElement15.getAsJsonObject()) == null) ? errorEvent : zzkh.fromJsonObject(asJsonObject5);
                JsonElement jsonElement16 = jsonObject.get("action");
                Action fromJsonObject14 = (jsonElement16 == null || (asJsonObject4 = jsonElement16.getAsJsonObject()) == null) ? errorEvent : zzjw.fromJsonObject(asJsonObject4);
                JsonElement jsonElement17 = jsonObject.get("container");
                Container fromJsonObject15 = (jsonElement17 == null || (asJsonObject3 = jsonElement17.getAsJsonObject()) == null) ? errorEvent : zzkf.fromJsonObject(asJsonObject3);
                String asString7 = jsonObject.get("type").getAsString();
                JsonObject asJsonObject18 = jsonObject.get(BreadcrumbHelper.Category.ERROR).getAsJsonObject();
                asJsonObject18.getClass();
                Error fromJsonObject16 = CardModule.Type.fromJsonObject(asJsonObject18);
                JsonElement jsonElement18 = jsonObject.get("freeze");
                Freeze fromJsonObject17 = (jsonElement18 == null || (asJsonObject2 = jsonElement18.getAsJsonObject()) == null) ? errorEvent : zzkq.fromJsonObject(asJsonObject2);
                JsonElement jsonElement19 = jsonObject.get("feature_flags");
                Context fromJsonObject18 = (jsonElement19 == null || (asJsonObject = jsonElement19.getAsJsonObject()) == null) ? errorEvent : zzkh.fromJsonObject(asJsonObject);
                if (Intrinsics.areEqual(asString7, BreadcrumbHelper.Category.ERROR)) {
                    return new ErrorEvent(asLong, fromJsonObject, asString2, asString3, asString4, asString5, asString6, fromJsonObject2, i, fromJsonObject3, fromJsonObject4, fromJsonObject5, fromJsonObject6, fromJsonObject7, fromJsonObject8, fromJsonObject9, fromJsonObject10, fromJsonObject11, fromJsonObject12, fromJsonObject13, fromJsonObject14, fromJsonObject15, fromJsonObject16, fromJsonObject17, fromJsonObject18);
                }
                throw new IllegalStateException("Check failed.");
            } catch (IllegalStateException e4) {
                e = e4;
                errorEvent = null;
            } catch (NullPointerException e5) {
                e = e5;
                errorEvent = null;
            } catch (NumberFormatException e6) {
                e = e6;
                errorEvent = null;
            }
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewPoolsList.deepLinkSpecs;
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
            return "Container(view=" + this.view + ", source=" + RumErrorSource$EnumUnboxingLocalUtility.stringValueOf$21(this.source) + ")";
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
        public final Map additionalProperties;

        public Context(Map map) {
            this.additionalProperties = map;
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

        public final JsonObject toJson() {
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry entry : this.additionalProperties.entrySet()) {
                jsonObject.add((String) entry.getKey(), JsonSerializer.toJsonElement(entry.getValue()));
            }
            return jsonObject;
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Context(additionalProperties=", ")", this.additionalProperties);
        }
    }

    public final class Csp {
        public final int disposition;

        public abstract class Companion {
            public static Csp fromJsonObject(JsonObject jsonObject) {
                String asString;
                try {
                    JsonElement jsonElement = jsonObject.get("disposition");
                    int i = 0;
                    if (jsonElement != null && (asString = jsonElement.getAsString()) != null) {
                        int[] values = CameraSelector$$ExternalSyntheticOutline0.values(2);
                        int length = values.length;
                        while (i < length) {
                            int i2 = values[i];
                            if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$9(i2).equals(asString)) {
                                i = i2;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    return new Csp(i);
                } catch (IllegalStateException e) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Csp", e);
                    return null;
                } catch (NullPointerException e2) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Csp", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Csp", e3);
                    return null;
                }
            }

            public static List getDeepLinkSpecs() {
                return ClientRoute.ViewProfileSwitcher.deepLinkSpecs;
            }
        }

        public Csp(int i) {
            this.disposition = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Csp) && this.disposition == ((Csp) obj).disposition;
        }

        public final int hashCode() {
            int i = this.disposition;
            if (i == 0) {
                return 0;
            }
            return CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Csp(disposition=");
            int i = this.disposition;
            sb.append(i != 1 ? i != 2 ? "null" : "REPORT" : "ENFORCE");
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Dd {
        public final String browserSdkVersion;
        public final Configuration configuration;
        public final String sdkName;
        public final DdSession session;

        public abstract class Companion {
            public static Dd fromJsonObject(JsonObject jsonObject) {
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                jsonObject.getClass();
                try {
                    long asLong = jsonObject.get("format_version").getAsLong();
                    JsonElement jsonElement = jsonObject.get("session");
                    DdSession fromJsonObject = (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) ? null : zzkk.fromJsonObject(asJsonObject2);
                    JsonElement jsonElement2 = jsonObject.get(BreadcrumbHelper.Category.CONFIGURATION);
                    Configuration fromJsonObject2 = (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) ? null : zzkd.fromJsonObject(asJsonObject);
                    JsonElement jsonElement3 = jsonObject.get("browser_sdk_version");
                    String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = jsonObject.get("sdk_name");
                    String asString2 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    if (asLong == 2) {
                        return new Dd(fromJsonObject, fromJsonObject2, asString, asString2);
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

            public static List getDeepLinkSpecs() {
                return ClientRoute.ViewProfileWithAccountSwitchOnboarding.deepLinkSpecs;
            }
        }

        public Dd(DdSession ddSession, Configuration configuration, String str, String str2) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.sdkName = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) obj;
            return Intrinsics.areEqual(this.session, dd.session) && Intrinsics.areEqual(this.configuration, dd.configuration) && Intrinsics.areEqual(this.browserSdkVersion, dd.browserSdkVersion) && Intrinsics.areEqual(this.sdkName, dd.sdkName);
        }

        public final int hashCode() {
            DdSession ddSession = this.session;
            int hashCode = (ddSession == null ? 0 : ddSession.hashCode()) * 31;
            Configuration configuration = this.configuration;
            int hashCode2 = (hashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
            String str = this.browserSdkVersion;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sdkName;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dd(session=");
            sb.append(this.session);
            sb.append(", configuration=");
            sb.append(this.configuration);
            sb.append(", browserSdkVersion=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.browserSdkVersion, ", sdkName=", this.sdkName, ")");
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

    public final class ErrorEventSession {
        public final Boolean hasReplay;
        public final String id;

        /* renamed from: type, reason: collision with root package name */
        public final int f962type;

        public ErrorEventSession(int i, Boolean bool, String str) {
            str.getClass();
            if (i == 0) {
                throw null;
            }
            this.id = str;
            this.f962type = i;
            this.hasReplay = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorEventSession)) {
                return false;
            }
            ErrorEventSession errorEventSession = (ErrorEventSession) obj;
            return Intrinsics.areEqual(this.id, errorEventSession.id) && this.f962type == errorEventSession.f962type && Intrinsics.areEqual(this.hasReplay, errorEventSession.hasReplay);
        }

        public final int hashCode() {
            int m = Thread$State$EnumUnboxingLocalUtility.m(this.f962type, this.id.hashCode() * 31, 31);
            Boolean bool = this.hasReplay;
            return m + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("ErrorEventSession(id=", this.id, ", type=");
            int i = this.f962type;
            m3m.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
            m3m.append(", hasReplay=");
            m3m.append(this.hasReplay);
            m3m.append(")");
            return m3m.toString();
        }
    }

    public final class Freeze {
        public final long duration;

        public Freeze(long j) {
            this.duration = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Freeze) && this.duration == ((Freeze) obj).duration;
        }

        public final int hashCode() {
            return Long.hashCode(this.duration);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.duration, "Freeze(duration=", ")");
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

    public final class Meta {
        public final String codeType;
        public final String exceptionCodes;
        public final String exceptionType;
        public final String incidentIdentifier;
        public final String parentProcess;
        public final String path;
        public final String process;

        public abstract class Companion {
            public static Meta fromJsonObject(JsonObject jsonObject) {
                try {
                    JsonElement jsonElement = jsonObject.get("code_type");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = jsonObject.get("parent_process");
                    String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = jsonObject.get("incident_identifier");
                    String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = jsonObject.get("process");
                    String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    JsonElement jsonElement5 = jsonObject.get("exception_type");
                    String asString5 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                    JsonElement jsonElement6 = jsonObject.get("exception_codes");
                    String asString6 = jsonElement6 != null ? jsonElement6.getAsString() : null;
                    JsonElement jsonElement7 = jsonObject.get("path");
                    return new Meta(asString, asString2, asString3, asString4, asString5, asString6, jsonElement7 != null ? jsonElement7.getAsString() : null);
                } catch (IllegalStateException e) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Meta", e);
                    return null;
                } catch (NullPointerException e2) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Meta", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Meta", e3);
                    return null;
                }
            }

            public static List getDeepLinkSpecs() {
                return ClientRoute.ViewRecurringDeposits.deepLinkSpecs;
            }
        }

        public Meta(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.codeType = str;
            this.parentProcess = str2;
            this.incidentIdentifier = str3;
            this.process = str4;
            this.exceptionType = str5;
            this.exceptionCodes = str6;
            this.path = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) obj;
            return Intrinsics.areEqual(this.codeType, meta.codeType) && Intrinsics.areEqual(this.parentProcess, meta.parentProcess) && Intrinsics.areEqual(this.incidentIdentifier, meta.incidentIdentifier) && Intrinsics.areEqual(this.process, meta.process) && Intrinsics.areEqual(this.exceptionType, meta.exceptionType) && Intrinsics.areEqual(this.exceptionCodes, meta.exceptionCodes) && Intrinsics.areEqual(this.path, meta.path);
        }

        public final int hashCode() {
            String str = this.codeType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.parentProcess;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.incidentIdentifier;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.process;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.exceptionType;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.exceptionCodes;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.path;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Meta(codeType=", this.codeType, ", parentProcess=", this.parentProcess, ", incidentIdentifier=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.incidentIdentifier, ", process=", this.process, ", exceptionType=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.exceptionType, ", exceptionCodes=", this.exceptionCodes, ", path=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.path, ")");
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

            public static EmptyList getDeepLinkSpecs() {
                return ClientRoute.ViewRequestCashtag.deepLinkSpecs;
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

    public final class Provider {
        public final String domain;
        public final String name;

        /* renamed from: type, reason: collision with root package name */
        public final int f963type;

        public Provider(String str, String str2, int i) {
            this.domain = str;
            this.name = str2;
            this.f963type = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Provider)) {
                return false;
            }
            Provider provider = (Provider) obj;
            return Intrinsics.areEqual(this.domain, provider.domain) && Intrinsics.areEqual(this.name, provider.name) && this.f963type == provider.f963type;
        }

        public final int hashCode() {
            String str = this.domain;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            int i = this.f963type;
            return hashCode2 + (i != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i) : 0);
        }

        public final String toString() {
            String str;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Provider(domain=", this.domain, ", name=", this.name, ", type=");
            switch (this.f963type) {
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

    public final class Resource {
        public final int method;
        public final Provider provider;
        public final long statusCode;
        public final String url;

        public Resource(int i, long j, String str, Provider provider) {
            if (i == 0) {
                throw null;
            }
            str.getClass();
            this.method = i;
            this.statusCode = j;
            this.url = str;
            this.provider = provider;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) obj;
            return this.method == resource.method && this.statusCode == resource.statusCode && Intrinsics.areEqual(this.url, resource.url) && Intrinsics.areEqual(this.provider, resource.provider);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(CameraSelector$$ExternalSyntheticOutline0.ordinal(this.method) * 31, 31, this.statusCode), 31, this.url);
            Provider provider = this.provider;
            return m + (provider == null ? 0 : provider.hashCode());
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("Resource(method=");
            switch (this.method) {
                case 1:
                    str = "POST";
                    break;
                case 2:
                    str = "GET";
                    break;
                case 3:
                    str = "HEAD";
                    break;
                case 4:
                    str = "PUT";
                    break;
                case 5:
                    str = "DELETE";
                    break;
                case 6:
                    str = "PATCH";
                    break;
                case 7:
                    str = "TRACE";
                    break;
                case 8:
                    str = "OPTIONS";
                    break;
                case 9:
                    str = "CONNECT";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append(str);
            sb.append(", statusCode=");
            sb.append(this.statusCode);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", provider=");
            sb.append(this.provider);
            sb.append(")");
            return sb.toString();
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

    public final class Thread {
        public final boolean crashed;
        public final String name;
        public final String stack;
        public final String state;

        public Thread(String str, boolean z, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.crashed = z;
            this.stack = str2;
            this.state = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Thread)) {
                return false;
            }
            Thread thread = (Thread) obj;
            return Intrinsics.areEqual(this.name, thread.name) && this.crashed == thread.crashed && Intrinsics.areEqual(this.stack, thread.stack) && Intrinsics.areEqual(this.state, thread.state);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.crashed), 31, this.stack);
            String str = this.state;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("Thread(name=", this.name, ", crashed=", ", stack=", this.crashed), this.stack, ", state=", this.state, ")");
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

            public static EmptyList getDeepLinkSpecs() {
                return ClientRoute.ViewRequestSms.deepLinkSpecs;
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

    public /* synthetic */ ErrorEvent(long j, Application application, String str, String str2, String str3, String str4, String str5, ErrorEventSession errorEventSession, int i, ErrorEventView errorEventView, Usr usr, Account account, Connectivity connectivity, Synthetics synthetics, Os os, Device device, Dd dd, Context context, Action action, Error error, Context context2, int i2) {
        this(j, application, str, str2, (i2 & 16) != 0 ? null : str3, str4, str5, errorEventSession, i, errorEventView, usr, account, connectivity, null, (i2 & 16384) != 0 ? null : synthetics, null, os, device, dd, context, (1048576 & i2) != 0 ? null : action, null, error, null, (i2 & 16777216) != 0 ? null : context2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorEvent)) {
            return false;
        }
        ErrorEvent errorEvent = (ErrorEvent) obj;
        return this.date == errorEvent.date && Intrinsics.areEqual(this.application, errorEvent.application) && Intrinsics.areEqual(this.service, errorEvent.service) && Intrinsics.areEqual(this.version, errorEvent.version) && Intrinsics.areEqual(this.buildVersion, errorEvent.buildVersion) && Intrinsics.areEqual(this.buildId, errorEvent.buildId) && Intrinsics.areEqual(this.ddtags, errorEvent.ddtags) && Intrinsics.areEqual(this.session, errorEvent.session) && this.source == errorEvent.source && Intrinsics.areEqual(this.view, errorEvent.view) && Intrinsics.areEqual(this.usr, errorEvent.usr) && Intrinsics.areEqual(this.account, errorEvent.account) && Intrinsics.areEqual(this.connectivity, errorEvent.connectivity) && Intrinsics.areEqual(this.display, errorEvent.display) && Intrinsics.areEqual(this.synthetics, errorEvent.synthetics) && Intrinsics.areEqual(this.ciTest, errorEvent.ciTest) && Intrinsics.areEqual(this.os, errorEvent.os) && Intrinsics.areEqual(this.device, errorEvent.device) && Intrinsics.areEqual(this.dd, errorEvent.dd) && Intrinsics.areEqual(this.context, errorEvent.context) && Intrinsics.areEqual(this.action, errorEvent.action) && Intrinsics.areEqual(this.container, errorEvent.container) && Intrinsics.areEqual(this.error, errorEvent.error) && Intrinsics.areEqual(this.freeze, errorEvent.freeze) && Intrinsics.areEqual(this.featureFlags, errorEvent.featureFlags);
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
        int hashCode18 = (this.error.hashCode() + ((hashCode17 + (container == null ? 0 : container.hashCode())) * 31)) * 31;
        Freeze freeze = this.freeze;
        int hashCode19 = (hashCode18 + (freeze == null ? 0 : Long.hashCode(freeze.duration))) * 31;
        Context context2 = this.featureFlags;
        return hashCode19 + (context2 != null ? context2.additionalProperties.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorEvent(date=");
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
        sb.append(RumErrorSource$EnumUnboxingLocalUtility.stringValueOf$21(this.source));
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
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", freeze=");
        sb.append(this.freeze);
        sb.append(", featureFlags=");
        sb.append(this.featureFlags);
        sb.append(")");
        return sb.toString();
    }

    public final class DdSession {
        public final Plan plan;
        public final int sessionPrecondition;

        public /* synthetic */ DdSession(int i, int i2) {
            this((Plan) null, (i2 & 2) != 0 ? 0 : i);
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

        public DdSession(Plan plan, int i) {
            this.plan = plan;
            this.sessionPrecondition = i;
        }
    }

    public final class ErrorEventView {
        public final String id;
        public final Boolean inForeground;
        public final String name;
        public final String referrer;
        public final String url;

        public ErrorEventView(Boolean bool, String str, String str2, String str3, String str4) {
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
            if (!(obj instanceof ErrorEventView)) {
                return false;
            }
            ErrorEventView errorEventView = (ErrorEventView) obj;
            return Intrinsics.areEqual(this.id, errorEventView.id) && Intrinsics.areEqual(this.referrer, errorEventView.referrer) && Intrinsics.areEqual(this.url, errorEventView.url) && Intrinsics.areEqual(this.name, errorEventView.name) && Intrinsics.areEqual(this.inForeground, errorEventView.inForeground);
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
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorEventView(id=", this.id, ", referrer=", this.referrer, ", url=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.url, ", name=", this.name, ", inForeground=");
            return Thread$State$EnumUnboxingLocalUtility.m(m, this.inForeground, ")");
        }

        public /* synthetic */ ErrorEventView(String str, int i, String str2, String str3, String str4) {
            this((Boolean) null, str, (i & 2) != 0 ? null : str2, str3, str4);
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
        public final int f960type;

        public /* synthetic */ Device(int i, String str, String str2, String str3, String str4, List list, String str5, Number number, Boolean bool, Number number2, int i2) {
            this(i, str, str2, str3, str4, (String) null, (i2 & 64) != 0 ? null : list, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : number, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : number2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return false;
            }
            Device device = (Device) obj;
            return this.f960type == device.f960type && Intrinsics.areEqual(this.name, device.name) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.brand, device.brand) && Intrinsics.areEqual(this.architecture, device.architecture) && Intrinsics.areEqual(this.locale, device.locale) && Intrinsics.areEqual(this.locales, device.locales) && Intrinsics.areEqual(this.timeZone, device.timeZone) && Intrinsics.areEqual(this.batteryLevel, device.batteryLevel) && Intrinsics.areEqual(this.powerSavingMode, device.powerSavingMode) && Intrinsics.areEqual(this.brightnessLevel, device.brightnessLevel);
        }

        public final int hashCode() {
            int i = this.f960type;
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
            switch (this.f960type) {
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

        public Device(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, Number number, Boolean bool, Number number2) {
            this.f960type = i;
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
    }

    public final class Error {
        public final List binaryImages;
        public final int category;
        public final List causes;
        public final Csp csp;
        public final String fingerprint;
        public final int handling;
        public final String handlingStack;
        public final String id;
        public final Boolean isCrash;
        public final String message;
        public final Meta meta;
        public final Resource resource;
        public final int source;
        public final int sourceType;
        public final String stack;
        public final List threads;
        public final Long timeSinceAppStart;

        /* renamed from: type, reason: collision with root package name */
        public final String f961type;
        public final Boolean wasTruncated;

        public /* synthetic */ Error(String str, String str2, int i, String str3, Boolean bool, String str4, String str5, int i2, int i3, Resource resource, ArrayList arrayList, Long l, int i4) {
            this(str, str2, i, str3, null, bool, (i4 & 64) != 0 ? null : str4, str5, i2, 0, null, i3, (i4 & 4096) != 0 ? null : resource, (i4 & PKIFailureInfo.certRevoked) != 0 ? null : arrayList, null, null, null, null, (i4 & PKIFailureInfo.transactionIdInUse) != 0 ? null : l);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.id, error.id) && Intrinsics.areEqual(this.message, error.message) && this.source == error.source && Intrinsics.areEqual(this.stack, error.stack) && Intrinsics.areEqual(this.causes, error.causes) && Intrinsics.areEqual(this.isCrash, error.isCrash) && Intrinsics.areEqual(this.fingerprint, error.fingerprint) && Intrinsics.areEqual(this.f961type, error.f961type) && this.category == error.category && this.handling == error.handling && Intrinsics.areEqual(this.handlingStack, error.handlingStack) && this.sourceType == error.sourceType && Intrinsics.areEqual(this.resource, error.resource) && Intrinsics.areEqual(this.threads, error.threads) && Intrinsics.areEqual(this.binaryImages, error.binaryImages) && Intrinsics.areEqual(this.wasTruncated, error.wasTruncated) && Intrinsics.areEqual(this.meta, error.meta) && Intrinsics.areEqual(this.csp, error.csp) && Intrinsics.areEqual(this.timeSinceAppStart, error.timeSinceAppStart);
        }

        public final int hashCode() {
            String str = this.id;
            int m = Thread$State$EnumUnboxingLocalUtility.m(this.source, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message), 31);
            String str2 = this.stack;
            int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.causes;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isCrash;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.fingerprint;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f961type;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            int i = this.category;
            int ordinal = (hashCode5 + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 31;
            int i2 = this.handling;
            int ordinal2 = (ordinal + (i2 == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i2))) * 31;
            String str5 = this.handlingStack;
            int hashCode6 = (ordinal2 + (str5 == null ? 0 : str5.hashCode())) * 31;
            int i3 = this.sourceType;
            int ordinal3 = (hashCode6 + (i3 == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i3))) * 31;
            Resource resource = this.resource;
            int hashCode7 = (ordinal3 + (resource == null ? 0 : resource.hashCode())) * 31;
            List list2 = this.threads;
            int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.binaryImages;
            int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Boolean bool2 = this.wasTruncated;
            int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Meta meta = this.meta;
            int hashCode11 = (hashCode10 + (meta == null ? 0 : meta.hashCode())) * 31;
            Csp csp = this.csp;
            int hashCode12 = (hashCode11 + (csp == null ? 0 : csp.hashCode())) * 31;
            Long l = this.timeSinceAppStart;
            return hashCode12 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            String str;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(id=", this.id, ", message=", this.message, ", source=");
            m.append(RumErrorSource$EnumUnboxingLocalUtility.stringValueOf$22(this.source));
            m.append(", stack=");
            m.append(this.stack);
            m.append(", causes=");
            m.append(this.causes);
            m.append(", isCrash=");
            m.append(this.isCrash);
            m.append(", fingerprint=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.fingerprint, ", type=", this.f961type, ", category=");
            String str2 = "null";
            switch (this.category) {
                case 1:
                    str = "ANR";
                    break;
                case 2:
                    str = "APP_HANG";
                    break;
                case 3:
                    str = "EXCEPTION";
                    break;
                case 4:
                    str = "WATCHDOG_TERMINATION";
                    break;
                case 5:
                    str = "MEMORY_WARNING";
                    break;
                case 6:
                    str = "NETWORK";
                    break;
                default:
                    str = "null";
                    break;
            }
            m.append(str);
            m.append(", handling=");
            int i = this.handling;
            m.append(i != 1 ? i != 2 ? "null" : "UNHANDLED" : "HANDLED");
            m.append(", handlingStack=");
            m.append(this.handlingStack);
            m.append(", sourceType=");
            switch (this.sourceType) {
                case 1:
                    str2 = "ANDROID";
                    break;
                case 2:
                    str2 = "BROWSER";
                    break;
                case 3:
                    str2 = "IOS";
                    break;
                case 4:
                    str2 = "REACT_NATIVE";
                    break;
                case 5:
                    str2 = "FLUTTER";
                    break;
                case 6:
                    str2 = "ROKU";
                    break;
                case 7:
                    str2 = "NDK";
                    break;
                case 8:
                    str2 = "IOS_IL2CPP";
                    break;
                case 9:
                    str2 = "NDK_IL2CPP";
                    break;
            }
            m.append(str2);
            m.append(", resource=");
            m.append(this.resource);
            m.append(", threads=");
            m.append(this.threads);
            m.append(", binaryImages=");
            m.append(this.binaryImages);
            m.append(", wasTruncated=");
            m.append(this.wasTruncated);
            m.append(", meta=");
            m.append(this.meta);
            m.append(", csp=");
            m.append(this.csp);
            m.append(", timeSinceAppStart=");
            return Thread$State$EnumUnboxingLocalUtility.m(m, this.timeSinceAppStart, ")");
        }

        public Error(String str, String str2, int i, String str3, ArrayList arrayList, Boolean bool, String str4, String str5, int i2, int i3, String str6, int i4, Resource resource, List list, ArrayList arrayList2, Boolean bool2, Meta meta, Csp csp, Long l) {
            str2.getClass();
            if (i != 0) {
                this.id = str;
                this.message = str2;
                this.source = i;
                this.stack = str3;
                this.causes = arrayList;
                this.isCrash = bool;
                this.fingerprint = str4;
                this.f961type = str5;
                this.category = i2;
                this.handling = i3;
                this.handlingStack = str6;
                this.sourceType = i4;
                this.resource = resource;
                this.threads = list;
                this.binaryImages = arrayList2;
                this.wasTruncated = bool2;
                this.meta = meta;
                this.csp = csp;
                this.timeSinceAppStart = l;
                return;
            }
            throw null;
        }
    }

    public ErrorEvent(long j, Application application, String str, String str2, String str3, String str4, String str5, ErrorEventSession errorEventSession, int i, ErrorEventView errorEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, Error error, Freeze freeze, Context context2) {
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.ddtags = str5;
        this.session = errorEventSession;
        this.source = i;
        this.view = errorEventView;
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
        this.error = error;
        this.freeze = freeze;
        this.featureFlags = context2;
    }
}
