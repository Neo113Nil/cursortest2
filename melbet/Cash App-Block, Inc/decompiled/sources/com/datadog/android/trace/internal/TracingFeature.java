package com.datadog.android.trace.internal;

import android.content.Context;
import app.cash.trifle.KeyHandle$keyPair$2;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.StorageBackedFeature;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.FeatureStorageConfiguration;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.trace.internal.data.CoreTraceWriter;
import com.datadog.trace.common.writer.NoOpWriter;
import com.datadog.trace.common.writer.Writer;
import com.google.android.filament.Box;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import com.google.mlkit.vision.text.zzd;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes4.dex */
public final class TracingFeature implements StorageBackedFeature {
    public final InternalSdkCore sdkCore;
    public final zzd spanEventMapper;
    public Writer coreTracerDataWriter = new NoOpWriter();
    public final AtomicBoolean initialized = new AtomicBoolean(false);
    public final String name = "tracing";
    public final Lazy requestFactory$delegate = LazyKt.lazy(new KeyHandle$keyPair$2(this, 29));
    public final FeatureStorageConfiguration storageConfiguration = FeatureStorageConfiguration.DEFAULT;

    public TracingFeature(InternalSdkCore internalSdkCore, zzd zzdVar) {
        this.sdkCore = internalSdkCore;
        this.spanEventMapper = zzdVar;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final String getName() {
        return this.name;
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final RequestFactory getRequestFactory() {
        return (RequestFactory) this.requestFactory$delegate.getValue();
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onInitialize(Context context) {
        context.getClass();
        InternalSdkCore internalSdkCore = this.sdkCore;
        InternalLogger internalLogger = internalSdkCore.getInternalLogger();
        this.coreTracerDataWriter = new CoreTraceWriter(internalSdkCore, new zzb(3), new zzc(this.spanEventMapper, internalLogger), new Box(internalLogger, 7), internalLogger);
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onStop() {
        this.initialized.set(false);
    }
}
