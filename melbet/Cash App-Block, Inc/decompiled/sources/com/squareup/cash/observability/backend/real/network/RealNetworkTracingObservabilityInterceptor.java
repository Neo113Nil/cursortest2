package com.squareup.cash.observability.backend.real.network;

import coil3.svg.internal.AndroidSvg;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.squareup.cash.observability.backend.internal.network.ObservabilityInterceptor;
import java.util.List;
import okhttp3.Interceptor;

/* loaded from: classes.dex */
public final class RealNetworkTracingObservabilityInterceptor extends ObservabilityInterceptor {
    @Override // com.squareup.cash.observability.backend.internal.network.ObservabilityInterceptor
    public final Interceptor createInterceptor(float f, List list) {
        return ((TracingInterceptor.Builder) new TracingInterceptor.Builder(list).setTraceSampler(new AndroidSvg(f))).build();
    }
}
