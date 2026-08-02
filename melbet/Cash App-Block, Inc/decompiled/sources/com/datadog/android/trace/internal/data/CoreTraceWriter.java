package com.datadog.android.trace.internal.data;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.event.EventMapper;
import com.datadog.android.trace.internal.DatadogTracerAdapter;
import com.datadog.trace.common.writer.Writer;
import com.fillr.n;
import com.google.android.filament.Box;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptySet;

/* loaded from: classes4.dex */
public final class CoreTraceWriter implements Writer {
    public static final Set DROP_SAMPLING_PRIORITIES = ArraysKt___ArraysKt.toSet(new Integer[]{0, -1});
    public final zzb ddSpanToSpanEventMapper;
    public final EventMapper eventMapper;
    public final InternalLogger internalLogger;
    public final n.b rumContextPropagator;
    public final InternalSdkCore sdkCore;
    public final Box serializer;

    public CoreTraceWriter(InternalSdkCore internalSdkCore, zzb zzbVar, zzc zzcVar, Box box, InternalLogger internalLogger) {
        n.b bVar = new n.b(new DatadogTracerAdapter.AnonymousClass1(internalSdkCore, 3), 12);
        this.sdkCore = internalSdkCore;
        this.ddSpanToSpanEventMapper = zzbVar;
        this.eventMapper = zzcVar;
        this.serializer = box;
        this.internalLogger = internalLogger;
        this.rumContextPropagator = bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.datadog.trace.common.writer.Writer
    public final void write(ArrayList arrayList) {
        SdkFeature feature = this.sdkCore.getFeature("tracing");
        if (feature != null) {
            feature.withWriteContext(EmptySet.INSTANCE, new CoreTraceWriter$write$1(0, arrayList, this));
        }
    }
}
