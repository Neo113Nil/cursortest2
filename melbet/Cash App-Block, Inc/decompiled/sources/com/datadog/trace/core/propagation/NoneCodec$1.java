package com.datadog.trace.core.propagation;

import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import com.datadog.trace.core.DDSpanContext;
import com.datadog.trace.core.propagation.HttpCodec;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final class NoneCodec$1 implements HttpCodec.Injector {
    @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
    public final void inject(DDSpanContext dDSpanContext, Request.Builder builder, ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2) {
    }
}
