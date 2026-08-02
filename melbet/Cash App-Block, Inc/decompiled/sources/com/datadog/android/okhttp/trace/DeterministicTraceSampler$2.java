package com.datadog.android.okhttp.trace;

import com.datadog.android.trace.GlobalDatadogTracer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DeterministicTraceSampler$2 extends Lambda implements Function0 {
    public static final DeterministicTraceSampler$2 INSTANCE;
    public static final DeterministicTraceSampler$2 INSTANCE$1;
    public static final DeterministicTraceSampler$2 INSTANCE$2;
    public static final DeterministicTraceSampler$2 INSTANCE$3;
    public static final DeterministicTraceSampler$2 INSTANCE$4;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new DeterministicTraceSampler$2(i, 1);
        INSTANCE$1 = new DeterministicTraceSampler$2(i, 2);
        INSTANCE$2 = new DeterministicTraceSampler$2(i, 3);
        INSTANCE$3 = new DeterministicTraceSampler$2(i, 4);
        INSTANCE$4 = new DeterministicTraceSampler$2(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeterministicTraceSampler$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return Float.valueOf(100.0f);
            case 1:
                return GlobalDatadogTracer.INSTANCE.getOrNull();
            case 2:
                return "Failed to update intercepted OkHttp request";
            case 3:
                return "You added a TracingInterceptor to your OkHttpClient, but you did not specify any first party hosts. Your requests won't be traced.\nTo set a list of known hosts, you can use the Configuration.Builder::setFirstPartyHosts() method.";
            case 4:
                return "You added a TracingInterceptor to your OkHttpClient, but you didn't register any AgentTracer.TracerAPI. We automatically created a local tracer for you.";
            default:
                return "You added a TracingInterceptor to your OkHttpClient, but you did not enable the TracingFeature. Your requests won't be traced.";
        }
    }
}
