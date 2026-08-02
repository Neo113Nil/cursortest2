package com.squareup.cash.observability.backend.real.network;

import coil3.svg.internal.AndroidSvg;
import com.datadog.android.okhttp.DatadogInterceptor;
import com.squareup.cash.observability.backend.internal.network.ObservabilityInterceptor;
import java.util.List;
import okhttp3.Interceptor;

/* loaded from: classes.dex */
public final class RealDatadogObservabilityInterceptor extends ObservabilityInterceptor {
    @Override // com.squareup.cash.observability.backend.internal.network.ObservabilityInterceptor
    public final Interceptor createInterceptor(float f, List list) {
        return ((DatadogInterceptor.Builder) new DatadogInterceptor.Builder(list).setTraceSampler(new AndroidSvg(f))).build();
    }
}
