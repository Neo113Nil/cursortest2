package com.datadog.android.trace;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.android.Datadog;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.trace.internal.TracingFeature;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.core.exception.APIConnectionException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes4.dex */
public abstract class Trace {
    public static APIConnectionException create(String str, IOException iOException) {
        List split$default;
        iOException.getClass();
        String str2 = null;
        if (str != null) {
            Set set = APIConnectionException.SENSITIVE_PARAM_NAMES;
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6);
            if (indexOf$default >= 0 && indexOf$default != str.length() - 1) {
                String substring = str.substring(0, indexOf$default);
                split$default = StringsKt__StringsKt.split$default(str.substring(indexOf$default + 1), new String[]{"&"}, false, 0, 6, null);
                str = Recorder$$ExternalSyntheticOutline2.m(substring, "?", CollectionsKt.joinToString$default(split$default, "&", null, null, 0, null, new StripePaymentController$$ExternalSyntheticLambda1(29), 30));
            }
        } else {
            str = null;
        }
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("(", str, ")");
        if (str != null && !StringsKt.isBlank(str)) {
            str2 = m;
        }
        return new APIConnectionException(Boxes$$ExternalSyntheticOutline1.m("IOException during API request to ", CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{"Stripe", str2}), " ", null, null, 0, null, null, 62), ": ", iOException.getMessage(), ". Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://status.stripe.com/, or let us know at support@stripe.com."), iOException);
    }

    public static void enable$default(TraceConfiguration traceConfiguration) {
        InternalSdkCore datadog = Datadog.getInstance(null);
        datadog.registerFeature(new TracingFeature(datadog, traceConfiguration.eventMapper));
    }

    /* renamed from: provideResendCodeButtonDelay-UwyO8pc, reason: not valid java name */
    public static long m1912provideResendCodeButtonDelayUwyO8pc() {
        Duration.Companion companion = Duration.Companion;
        return DurationKt.toDuration(60, DurationUnit.SECONDS);
    }

    public static EmptyMap provideTaxesHeaders() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }
}
