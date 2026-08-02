package com.squareup.cash.persona.backend;

import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.persona.backend.PersonaDidvInquiryLauncher;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.android.SimpleActivityForResultLauncher;
import com.withpersona.sdk2.inquiry.Environment;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.Fields;
import com.withpersona.sdk2.inquiry.Inquiry;
import com.withpersona.sdk2.inquiry.InquiryResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes9.dex */
public final class RealPersonaDidvInquiryLauncher implements PersonaDidvInquiryLauncher {
    public final String environment;
    public final RealObservabilityManager observabilityManager;
    public final SimpleActivityForResultLauncher personaActivityForResultLauncher;
    public final SessionManager sessionManager;

    public RealPersonaDidvInquiryLauncher(SimpleActivityForResultLauncher simpleActivityForResultLauncher, RealObservabilityManager realObservabilityManager, SessionManager sessionManager, String str) {
        this.personaActivityForResultLauncher = simpleActivityForResultLauncher;
        this.observabilityManager = realObservabilityManager;
        this.sessionManager = sessionManager;
        this.environment = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launchInquiry(String str, PersonaDidvInquiryLauncher.Inquiry inquiry, String str2, boolean z, String str3, boolean z2, ContinuationImpl continuationImpl) {
        RealPersonaDidvInquiryLauncher$launchInquiry$1 realPersonaDidvInquiryLauncher$launchInquiry$1;
        int i;
        Throwable th;
        Inquiry build;
        SpanTracking spanTracking;
        InquiryResponse inquiryResponse;
        if (continuationImpl instanceof RealPersonaDidvInquiryLauncher$launchInquiry$1) {
            realPersonaDidvInquiryLauncher$launchInquiry$1 = (RealPersonaDidvInquiryLauncher$launchInquiry$1) continuationImpl;
            int i2 = realPersonaDidvInquiryLauncher$launchInquiry$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPersonaDidvInquiryLauncher$launchInquiry$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPersonaDidvInquiryLauncher$launchInquiry$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPersonaDidvInquiryLauncher$launchInquiry$1.label;
                RealObservabilityManager realObservabilityManager = this.observabilityManager;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    th = null;
                    SpanTracking startTrackingRootSpan$default = RealObservabilityManager.startTrackingRootSpan$default(realObservabilityManager, "persona_didv_inquiry", MapsKt__MapsKt.mapOf(new Pair("flow_type", str2 == null ? "" : str2), new Pair("fallback_mode_enabled", String.valueOf(z)), new Pair("has_flow_token", String.valueOf(str != null))), 8);
                    Environment environment = this.environment.equals("Production") ? Environment.PRODUCTION : Environment.SANDBOX;
                    if (!z) {
                        String str4 = inquiry.inquiryId;
                        if (str4 == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Inquiry ID must be provided when auto fallback is disabled");
                            return null;
                        }
                        build = Inquiry.INSTANCE.fromInquiry(str4).sessionToken(inquiry.sessionToken).build();
                    } else {
                        if (str == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Flow token must be provided when auto fallback is enabled");
                            return null;
                        }
                        if (str2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Flow type must be provided when auto fallback is enabled");
                            return null;
                        }
                        if (str3 == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Fallback template ID must be provided when auto fallback is enabled");
                            return null;
                        }
                        Fields.Builder builder = new Fields.Builder();
                        builder.field("flow_id", str);
                        builder.field("flow_type", str2);
                        if (z2) {
                            builder.field("biometric_consent_collected", true);
                        }
                        build = Inquiry.INSTANCE.fromTemplate(str3).fields(builder.build()).environment(environment).referenceId(PlatformKt.activeAccountTokenOrNull(this.sessionManager)).fallbackMode(FallbackMode.ALWAYS).build();
                    }
                    SimpleActivityForResultLauncher simpleActivityForResultLauncher = this.personaActivityForResultLauncher;
                    simpleActivityForResultLauncher.tryLaunch(build);
                    realPersonaDidvInquiryLauncher$launchInquiry$1.L$4 = startTrackingRootSpan$default;
                    realPersonaDidvInquiryLauncher$launchInquiry$1.label = 1;
                    Object result = simpleActivityForResultLauncher.getResult(realPersonaDidvInquiryLauncher$launchInquiry$1);
                    if (result == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = result;
                    spanTracking = startTrackingRootSpan$default;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    spanTracking = realPersonaDidvInquiryLauncher$launchInquiry$1.L$4;
                    SafeTrace.throwOnFailure(obj);
                    th = null;
                }
                inquiryResponse = (InquiryResponse) obj;
                if (!(inquiryResponse instanceof InquiryResponse.Complete)) {
                    InquiryResponse.Complete complete = (InquiryResponse.Complete) inquiryResponse;
                    SpanTracking.spanEnded$default(spanTracking, MapsKt__MapsKt.mapOf(new Pair("result", "complete"), new Pair("inquiry_id", complete.getInquiryId()), new Pair("status", complete.getStatus())), 1);
                    return new PersonaDidvInquiryLauncher.InquiryResult.Complete(complete.getInquiryId(), complete.getStatus());
                }
                if (inquiryResponse instanceof InquiryResponse.Cancel) {
                    Pair pair = new Pair("result", "cancel");
                    InquiryResponse.Cancel cancel = (InquiryResponse.Cancel) inquiryResponse;
                    String inquiryId = cancel.getInquiryId();
                    SpanTracking.spanEnded$default(spanTracking, MapsKt__MapsKt.mapOf(pair, new Pair("inquiry_id", inquiryId != null ? inquiryId : "")), 1);
                    return new PersonaDidvInquiryLauncher.InquiryResult.Cancel(cancel.getInquiryId(), cancel.getSessionToken());
                }
                if (!(inquiryResponse instanceof InquiryResponse.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Pair pair2 = new Pair("result", BreadcrumbHelper.Category.ERROR);
                InquiryResponse.Error error = (InquiryResponse.Error) inquiryResponse;
                Pair pair3 = new Pair("error_message", error.getDebugMessage());
                String cause = error.getCause();
                SpanTracking.spanEnded$default(spanTracking, MapsKt__MapsKt.mapOf(pair2, pair3, new Pair("error_cause", cause != null ? cause : ""), new Pair("error_code", error.getErrorCode().toString())), 1);
                String str5 = error.getDebugMessage() + ", caused by: " + error.getCause() + ", error code: " + error.getErrorCode();
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                realObservabilityManager.reportError(str5, th, emptyMap);
                Timber.Forest.e(error.getDebugMessage() + ", caused by: " + error.getCause() + ", error code: " + error.getErrorCode(), new Object[0]);
                return new PersonaDidvInquiryLauncher.InquiryResult.Error(error.getDebugMessage());
            }
        }
        realPersonaDidvInquiryLauncher$launchInquiry$1 = new RealPersonaDidvInquiryLauncher$launchInquiry$1(this, continuationImpl);
        Object obj2 = realPersonaDidvInquiryLauncher$launchInquiry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPersonaDidvInquiryLauncher$launchInquiry$1.label;
        RealObservabilityManager realObservabilityManager2 = this.observabilityManager;
        if (i != 0) {
        }
        inquiryResponse = (InquiryResponse) obj2;
        if (!(inquiryResponse instanceof InquiryResponse.Complete)) {
        }
    }
}
