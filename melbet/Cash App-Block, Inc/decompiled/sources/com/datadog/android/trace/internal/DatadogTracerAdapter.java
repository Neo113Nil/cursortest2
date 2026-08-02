package com.datadog.android.trace.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.PausedCompositionImpl;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.SdkFeature$$ExternalSyntheticLambda0;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.trace.api.propagation.DatadogPropagation;
import com.datadog.android.trace.api.span.DatadogSpanBuilder;
import com.datadog.android.trace.api.tracer.DatadogTracer;
import com.datadog.trace.core.CoreTracer;
import com.fillr.n;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.mlkit.vision.text.zza;
import java.util.Set;
import java.util.concurrent.Future;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DatadogTracerAdapter implements DatadogTracer {
    public final boolean bundleWithRumEnabled;
    public final CoreTracer delegate;
    public final n.b rumContextPropagator;
    public final InternalSdkCore sdkCore;
    public final zza spanLogger;

    /* renamed from: com.datadog.android.trace.internal.DatadogTracerAdapter$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ InternalSdkCore $sdkCore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(InternalSdkCore internalSdkCore, int i) {
            super(0);
            this.$r8$classId = i;
            this.$sdkCore = internalSdkCore;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            InternalSdkCore internalSdkCore = this.$sdkCore;
            switch (i) {
                case 0:
                    return internalSdkCore;
                case 1:
                    long appStartTimeNs = internalSdkCore.getAppStartTimeNs();
                    return new Time(((appStartTimeNs - System.nanoTime()) / 1000000) + System.currentTimeMillis(), appStartTimeNs);
                case 2:
                    internalSdkCore.getTimeProvider().getClass();
                    return Long.valueOf(System.nanoTime());
                default:
                    return internalSdkCore;
            }
        }
    }

    public DatadogTracerAdapter(InternalSdkCore internalSdkCore, CoreTracer coreTracer, zza zzaVar) {
        n.b bVar = new n.b(new AnonymousClass1(internalSdkCore, 0), 12);
        internalSdkCore.getClass();
        this.sdkCore = internalSdkCore;
        this.delegate = coreTracer;
        this.bundleWithRumEnabled = true;
        this.spanLogger = zzaVar;
        this.rumContextPropagator = bVar;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final DatadogSpanBuilder buildSpan() {
        CoreTracer coreTracer = this.delegate;
        coreTracer.getClass();
        return wrapSpan(new PausedCompositionImpl(coreTracer, "datadog", "okhttp.request", coreTracer));
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final DatadogPropagation propagate() {
        InternalLogger internalLogger = this.sdkCore.getInternalLogger();
        Box box = this.delegate.propagation;
        box.getClass();
        return new Box(internalLogger, box);
    }

    public final zbc wrapSpan(PausedCompositionImpl pausedCompositionImpl) {
        SdkFeature feature;
        zbc zbcVar = new zbc(pausedCompositionImpl, this.spanLogger);
        if (this.bundleWithRumEnabled) {
            n.b bVar = this.rumContextPropagator;
            bVar.getClass();
            InternalSdkCore internalSdkCore = (InternalSdkCore) ((Function0) bVar.b).invoke();
            if (internalSdkCore != null && (feature = internalSdkCore.getFeature("rum")) != null) {
                Set of = SetsKt__SetsJVMKt.setOf("rum");
                of.getClass();
                Future submitSafe = zzho.submitSafe(feature.coreFeature.getContextExecutorService$dd_sdk_android_core_release(), Recorder$$ExternalSyntheticOutline2.m("getContextFuture-", feature.wrappedFeature.getName()), feature.internalLogger, new SdkFeature$$ExternalSyntheticLambda0(feature, of, 1));
                if (submitSafe != null) {
                    zbcVar.withTag(submitSafe, "_dd.datadog_initial_context");
                }
            }
        }
        return zbcVar;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final DatadogSpanBuilder buildSpan(String str) {
        CoreTracer coreTracer = this.delegate;
        coreTracer.getClass();
        return wrapSpan(new PausedCompositionImpl(coreTracer, str, "internal", coreTracer));
    }
}
