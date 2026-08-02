package com.datadog.android.trace;

import androidx.camera.video.Recorder;
import com.datadog.android.trace.internal.TracingFeature;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DatadogTracing$newTracerBuilder$1 extends Lambda implements Function0 {
    public static final DatadogTracing$newTracerBuilder$1 INSTANCE;
    public static final DatadogTracing$newTracerBuilder$1 INSTANCE$1;
    public static final DatadogTracing$newTracerBuilder$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new DatadogTracing$newTracerBuilder$1(i, 0);
        INSTANCE$1 = new DatadogTracing$newTracerBuilder$1(i, 1);
        INSTANCE$2 = new DatadogTracing$newTracerBuilder$1(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatadogTracing$newTracerBuilder$1(TracingFeature tracingFeature) {
        super(0);
        this.$r8$classId = 3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "You're trying to create an DatadogTracer instance, but either the SDK was not initialized or the Tracing feature was not registered. No tracing data will be sent.";
            case 1:
                return "The Tracing feature is not implementing the InternalCoreWriterProvider interface. No tracing data will be sent.";
            case 2:
                return "Default service name is missing during DatadogTracerBuilder creation, did you initialize SDK?";
            default:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("You're trying to create an DatadogTracer instance, but provided ", Recorder.AnonymousClass6.class.getCanonicalName(), " writer wrapper is not supported.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DatadogTracing$newTracerBuilder$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }
}
