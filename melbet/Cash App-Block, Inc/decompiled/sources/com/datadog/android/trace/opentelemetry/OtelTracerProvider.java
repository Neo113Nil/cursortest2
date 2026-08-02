package com.datadog.android.trace.opentelemetry;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.paging.LoadState;
import androidx.room.util.DBUtil;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.trace.DatadogTracing;
import com.datadog.android.trace.TracingHeaderType;
import com.datadog.android.trace.api.tracer.DatadogTracer;
import com.datadog.android.trace.api.tracer.DatadogTracerBuilder;
import com.datadog.android.trace.internal.DatadogTracerBuilderAdapter;
import com.datadog.opentelemetry.trace.OtelTracer;
import com.stripe.android.core.model.StripeJsonUtils;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerProvider;
import java.util.LinkedHashMap;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class OtelTracerProvider implements TracerProvider {
    public final DatadogTracer datadogTracer;
    public final InternalLogger internalLogger;
    public final LinkedHashMap tracers;

    /* loaded from: classes4.dex */
    public final class Builder {
        public final DatadogTracerBuilder builderDelegate;
        public final InternalSdkCore sdkCore;
        public String serviceName;

        public Builder() {
            InternalSdkCore datadog = Datadog.getInstance(null);
            this.sdkCore = datadog;
            DatadogTracerBuilder withTracingHeadersTypes = DatadogTracing.newTracerBuilder(datadog).withPartialFlushMinSpans().withTracingHeadersTypes(ArraysKt___ArraysKt.toSet(new TracingHeaderType[]{TracingHeaderType.DATADOG, TracingHeaderType.TRACECONTEXT}));
            DatadogTracerBuilderAdapter datadogTracerBuilderAdapter = withTracingHeadersTypes instanceof DatadogTracerBuilderAdapter ? (DatadogTracerBuilderAdapter) withTracingHeadersTypes : null;
            if (datadogTracerBuilderAdapter != null) {
                LoadState fromName = LoadState.fromName("SECURE_RANDOM", true);
                fromName.getClass();
                datadogTracerBuilderAdapter.delegate.idGenerationStrategy = fromName;
            }
            this.builderDelegate = withTracingHeadersTypes;
            this.serviceName = "";
        }
    }

    static {
        StripeJsonUtils.executeIfJavaFunctionPackageExists$default(null, null, OtelTracerProvider$get$1.INSTANCE$1);
    }

    public OtelTracerProvider(DatadogTracer datadogTracer, InternalLogger internalLogger) {
        datadogTracer.getClass();
        internalLogger.getClass();
        this.datadogTracer = datadogTracer;
        this.internalLogger = internalLogger;
        this.tracers = new LinkedHashMap();
    }

    @Override // io.opentelemetry.api.trace.TracerProvider
    public final Tracer get() {
        LinkedHashMap linkedHashMap = this.tracers;
        Tracer tracer = (Tracer) linkedHashMap.get("CashAppTracer");
        if (tracer != null) {
            DBUtil.log$default(this.internalLogger, 2, InternalLogger.Target.USER, new OtelTracerProvider$get$1(0, 0), null, false, 56);
            return tracer;
        }
        int i = 12;
        int i2 = 0;
        boolean z = false;
        while (i2 <= i) {
            boolean z2 = Intrinsics.compare((int) "CashAppTracer".charAt(!z ? i2 : i), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                i--;
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        OtelTracer otelTracer = new OtelTracer("CashAppTracer".subSequence(i2, i + 1).toString().length() == 0 ? "android" : "CashAppTracer", this.datadogTracer, this.internalLogger);
        linkedHashMap.put("CashAppTracer", otelTracer);
        return otelTracer;
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m("OtelTracerProvider/", super.toString());
    }
}
