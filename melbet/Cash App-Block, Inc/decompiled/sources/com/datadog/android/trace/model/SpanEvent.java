package com.datadog.android.trace.model;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.trace.Trace;
import com.google.mlkit.vision.text.zzd;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.GenericStripeException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.StripeException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class SpanEvent {
    public final long duration;
    public final long error;
    public final Meta meta;
    public final Metrics metrics;
    public final String name;
    public final String parentId;
    public final String resource;
    public final String service;
    public final String spanId;
    public final long start;
    public final String traceId;

    /* loaded from: classes8.dex */
    public abstract class Account {
        public static final void AccessibleAndroidView(Function1 function1, Modifier modifier, Function1 function12, Function1 function13, Composer composer, int i) {
            Function1 function14;
            Function1 function15;
            function1.getClass();
            function13.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-762280906);
            int i2 = i | (gapComposer.changed(modifier) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changedInstance(function13) ? 2048 : 1024);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new FlowStarter$$ExternalSyntheticLambda0(24);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function16 = (Function1) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default("");
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState = (MutableState) rememberedValue2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(6, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Modifier semantics = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue3);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    function14 = function1;
                    rememberedValue4 = new ComposeDialogKt$$ExternalSyntheticLambda3(4, function14);
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    function14 = function1;
                }
                Function1 function17 = (Function1) rememberedValue4;
                boolean z = (i2 & 7168) == 2048;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(function13, function16, mutableState, 21);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                AndroidView_androidKt.AndroidView(function17, null, (Function1) rememberedValue5, gapComposer, 0, 2);
                gapComposer.end(true);
                function15 = function16;
            } else {
                function14 = function1;
                gapComposer.skipToGroupEnd();
                function15 = function12;
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(function14, i, modifier, function15, function13, 21);
            }
        }

        public static StripeException create(Throwable th) {
            th.getClass();
            if (th instanceof StripeException) {
                return (StripeException) th;
            }
            if (th instanceof JSONException) {
                return new APIException(0, 7, null, null, th.getMessage(), th);
            }
            if (th instanceof IOException) {
                Set set = APIConnectionException.SENSITIVE_PARAM_NAMES;
                return Trace.create(null, (IOException) th);
            }
            if (th instanceof IllegalArgumentException) {
                return new InvalidRequestException(0, 7, null, null, th.getMessage(), th);
            }
            Class<?> cls = th.getClass();
            return new GenericStripeException((StringsKt__StringsJVMKt.startsWith(cls.getName(), "android.", false) || StringsKt__StringsJVMKt.startsWith(cls.getName(), "java.", false)) ? cls.getName() : null, th);
        }
    }

    public final class Application {
        public final String id;

        public Application(String str) {
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.areEqual(this.id, ((Application) obj).id);
        }

        public final int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Application(id=", this.id, ")");
        }
    }

    public final class Client {
        public final String connectivity;
        public final String downlinkKbps;
        public final String signalStrength;
        public final SimCarrier simCarrier;
        public final String uplinkKbps;

        public Client(SimCarrier simCarrier, String str, String str2, String str3, String str4) {
            this.simCarrier = simCarrier;
            this.signalStrength = str;
            this.downlinkKbps = str2;
            this.uplinkKbps = str3;
            this.connectivity = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Client)) {
                return false;
            }
            Client client = (Client) obj;
            return Intrinsics.areEqual(this.simCarrier, client.simCarrier) && Intrinsics.areEqual(this.signalStrength, client.signalStrength) && Intrinsics.areEqual(this.downlinkKbps, client.downlinkKbps) && Intrinsics.areEqual(this.uplinkKbps, client.uplinkKbps) && Intrinsics.areEqual(this.connectivity, client.connectivity);
        }

        public final int hashCode() {
            SimCarrier simCarrier = this.simCarrier;
            int hashCode = (simCarrier == null ? 0 : simCarrier.hashCode()) * 31;
            String str = this.signalStrength;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.downlinkKbps;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.uplinkKbps;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectivity;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Client(simCarrier=");
            sb.append(this.simCarrier);
            sb.append(", signalStrength=");
            sb.append(this.signalStrength);
            sb.append(", downlinkKbps=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.downlinkKbps, ", uplinkKbps=", this.uplinkKbps, ", connectivity=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.connectivity, ")");
        }
    }

    public final class Dd {
        public final Application application;
        public final Session session;
        public final String source;
        public final View view;

        public Dd(String str, Application application, Session session, View view) {
            this.source = str;
            this.application = application;
            this.session = session;
            this.view = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) obj;
            return Intrinsics.areEqual(this.source, dd.source) && Intrinsics.areEqual(this.application, dd.application) && Intrinsics.areEqual(this.session, dd.session) && Intrinsics.areEqual(this.view, dd.view);
        }

        public final int hashCode() {
            String str = this.source;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Application application = this.application;
            int hashCode2 = (hashCode + (application == null ? 0 : application.hashCode())) * 31;
            Session session = this.session;
            int hashCode3 = (hashCode2 + (session == null ? 0 : session.hashCode())) * 31;
            View view = this.view;
            return hashCode3 + (view != null ? view.hashCode() : 0);
        }

        public final String toString() {
            return "Dd(source=" + this.source + ", application=" + this.application + ", session=" + this.session + ", view=" + this.view + ")";
        }
    }

    public final class Device {
        public final String architecture;
        public final String brand;
        public final String model;
        public final String name;

        /* renamed from: type, reason: collision with root package name */
        public final int f976type;

        public Device(String str, int i, String str2, String str3, String str4) {
            this.f976type = i;
            this.name = str;
            this.model = str2;
            this.brand = str3;
            this.architecture = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return false;
            }
            Device device = (Device) obj;
            return this.f976type == device.f976type && Intrinsics.areEqual(this.name, device.name) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.brand, device.brand) && Intrinsics.areEqual(this.architecture, device.architecture);
        }

        public final int hashCode() {
            int i = this.f976type;
            int ordinal = (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) * 31;
            String str = this.name;
            int hashCode = (ordinal + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.model;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.brand;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.architecture;
            return (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 887503681;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("Device(type=");
            switch (this.f976type) {
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
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.architecture, ", locale=null, locales=null, timeZone=null, batteryLevel=null, powerSavingMode=null, brightnessLevel=null)");
        }
    }

    public final class Meta {
        public static final String[] RESERVED_PROPERTIES = {"version", "_dd", "span", "tracer", "usr", "account", "network", "device", "os"};
        public final Map additionalProperties;
        public final Dd dd;
        public final Device device;
        public final Network network;
        public final Os os;
        public final zzd span;
        public final Tracer tracer;
        public final Usr usr;
        public final String version;

        public Meta(String str, Dd dd, zzd zzdVar, Tracer tracer, Usr usr, Account account, Network network, Device device, Os os, Map map) {
            str.getClass();
            this.version = str;
            this.dd = dd;
            this.span = zzdVar;
            this.tracer = tracer;
            this.usr = usr;
            this.network = network;
            this.device = device;
            this.os = os;
            this.additionalProperties = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Meta) {
                Meta meta = (Meta) obj;
                if (Intrinsics.areEqual(this.version, meta.version) && this.dd.equals(meta.dd) && this.span == meta.span && this.tracer.equals(meta.tracer) && this.usr.equals(meta.usr) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.network, meta.network) && this.device.equals(meta.device) && this.os.equals(meta.os) && this.additionalProperties.equals(meta.additionalProperties)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.usr.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.span.hashCode() + ((this.dd.hashCode() + (this.version.hashCode() * 31)) * 31)) * 31, 31, this.tracer.version)) * 961;
            Network network = this.network;
            return this.additionalProperties.hashCode() + ((this.os.hashCode() + ((this.device.hashCode() + ((hashCode + (network == null ? 0 : network.client.hashCode())) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Meta(version=" + this.version + ", dd=" + this.dd + ", span=" + this.span + ", tracer=" + this.tracer + ", usr=" + this.usr + ", account=" + ((Object) null) + ", network=" + this.network + ", device=" + this.device + ", os=" + this.os + ", additionalProperties=" + this.additionalProperties + ")";
        }
    }

    public final class Metrics {
        public static final String[] RESERVED_PROPERTIES = {"_top_level"};
        public final Map additionalProperties;
        public final Long topLevel;

        public Metrics(Long l, Map map) {
            this.topLevel = l;
            this.additionalProperties = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metrics)) {
                return false;
            }
            Metrics metrics = (Metrics) obj;
            return Intrinsics.areEqual(this.topLevel, metrics.topLevel) && this.additionalProperties.equals(metrics.additionalProperties);
        }

        public final int hashCode() {
            Long l = this.topLevel;
            return this.additionalProperties.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
        }

        public final String toString() {
            return "Metrics(topLevel=" + this.topLevel + ", additionalProperties=" + this.additionalProperties + ")";
        }
    }

    public final class Network {
        public final Client client;

        public Network(Client client) {
            this.client = client;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Network) && this.client.equals(((Network) obj).client);
        }

        public final int hashCode() {
            return this.client.hashCode();
        }

        public final String toString() {
            return "Network(client=" + this.client + ")";
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

    public final class Session {
        public final String id;

        public Session(String str) {
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Session) && Intrinsics.areEqual(this.id, ((Session) obj).id);
        }

        public final int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Session(id=", this.id, ")");
        }
    }

    public final class SimCarrier {
        public final String id;
        public final String name;

        public SimCarrier(String str, String str2) {
            this.id = str;
            this.name = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimCarrier)) {
                return false;
            }
            SimCarrier simCarrier = (SimCarrier) obj;
            return Intrinsics.areEqual(this.id, simCarrier.id) && Intrinsics.areEqual(this.name, simCarrier.name);
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("SimCarrier(id=", this.id, ", name=", this.name, ")");
        }
    }

    public final class Tracer {
        public final String version;

        public Tracer(String str) {
            str.getClass();
            this.version = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Tracer) && Intrinsics.areEqual(this.version, ((Tracer) obj).version);
        }

        public final int hashCode() {
            return this.version.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Tracer(version=", this.version, ")");
        }
    }

    public final class Usr {
        public static final String[] RESERVED_PROPERTIES = {"id", "name", "email"};
        public final Map additionalProperties;
        public final String email;
        public final String id;
        public final String name;

        public Usr(String str, String str2, String str3, Map map) {
            this.id = str;
            this.name = str2;
            this.email = str3;
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
            return Intrinsics.areEqual(this.id, usr.id) && Intrinsics.areEqual(this.name, usr.name) && Intrinsics.areEqual(this.email, usr.email) && this.additionalProperties.equals(usr.additionalProperties);
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.email;
            return this.additionalProperties.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Usr(id=", this.id, ", name=", this.name, ", email=");
            m.append(this.email);
            m.append(", additionalProperties=");
            m.append(this.additionalProperties);
            m.append(")");
            return m.toString();
        }
    }

    public final class View {
        public final String id;

        public View(String str) {
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof View) && Intrinsics.areEqual(this.id, ((View) obj).id);
        }

        public final int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("View(id=", this.id, ")");
        }
    }

    public SpanEvent(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, Metrics metrics, Meta meta) {
        re$$ExternalSyntheticOutline0.m1432m(str4, str5, str6);
        this.traceId = str;
        this.spanId = str2;
        this.parentId = str3;
        this.resource = str4;
        this.name = str5;
        this.service = str6;
        this.duration = j;
        this.start = j2;
        this.error = j3;
        this.metrics = metrics;
        this.meta = meta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanEvent)) {
            return false;
        }
        SpanEvent spanEvent = (SpanEvent) obj;
        return this.traceId.equals(spanEvent.traceId) && this.spanId.equals(spanEvent.spanId) && this.parentId.equals(spanEvent.parentId) && Intrinsics.areEqual(this.resource, spanEvent.resource) && Intrinsics.areEqual(this.name, spanEvent.name) && Intrinsics.areEqual(this.service, spanEvent.service) && this.duration == spanEvent.duration && this.start == spanEvent.start && this.error == spanEvent.error && this.metrics.equals(spanEvent.metrics) && this.meta.equals(spanEvent.meta);
    }

    public final int hashCode() {
        return this.meta.hashCode() + ((this.metrics.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.traceId.hashCode() * 31, 31, this.spanId), 31, this.parentId), 31, this.resource), 31, this.name), 31, this.service), 31, this.duration), 31, this.start), 31, this.error)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SpanEvent(traceId=", this.traceId, ", spanId=", this.spanId, ", parentId=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.parentId, ", resource=", this.resource, ", name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.name, ", service=", this.service, ", duration=");
        m.append(this.duration);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.start, ", start=", ", error=", m);
        m.append(this.error);
        m.append(", metrics=");
        m.append(this.metrics);
        m.append(", meta=");
        m.append(this.meta);
        m.append(")");
        return m.toString();
    }
}
