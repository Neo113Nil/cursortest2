package com.datadog.android.trace.internal;

import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.trace.TracingHeaderType;
import com.datadog.android.trace.api.tracer.DatadogTracer;
import com.datadog.android.trace.api.tracer.DatadogTracerBuilder;
import com.datadog.trace.api.Config;
import com.datadog.trace.api.InstrumenterConfig;
import com.datadog.trace.bootstrap.config.provider.ConfigProvider;
import com.datadog.trace.core.CoreTracer;
import com.datadog.trace.core.scopemanager.ContinuableScopeManager;
import com.datadog.trace.core.scopemanager.ScopeStack;
import com.fillr.e;
import com.google.mlkit.vision.text.zza;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class DatadogTracerBuilderAdapter implements DatadogTracerBuilder {
    public final CoreTracer.CoreTracerBuilder delegate;
    public final LinkedHashMap globalTags;
    public Double sampleRate;
    public final InternalSdkCore sdkCore;
    public boolean sdkV2OTelCompatible;
    public String serviceName;
    public Set tracingHeadersTypes;

    public DatadogTracerBuilderAdapter(InternalSdkCore internalSdkCore, String str, CoreTracer.CoreTracerBuilder coreTracerBuilder) {
        internalSdkCore.getClass();
        str.getClass();
        this.sdkCore = internalSdkCore;
        this.serviceName = str;
        this.delegate = coreTracerBuilder;
        this.globalTags = new LinkedHashMap();
        this.tracingHeadersTypes = ArraysKt___ArraysKt.toSet(new TracingHeaderType[]{TracingHeaderType.DATADOG, TracingHeaderType.TRACECONTEXT});
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final DatadogTracer build() {
        Config config;
        Properties properties = new Properties();
        String joinToString$default = CollectionsKt.joinToString$default(this.tracingHeadersTypes, ",", null, null, 0, null, null, 62);
        properties.setProperty("propagation.style.extract", joinToString$default);
        properties.setProperty("propagation.style.inject", joinToString$default);
        properties.setProperty("service.name", this.serviceName);
        properties.setProperty("trace.rate.limit", String.valueOf(Integer.MAX_VALUE));
        properties.setProperty("trace.partial.flush.min.spans", String.valueOf(5));
        properties.setProperty("trace.URLAsResourceNameRule.enabled", "false");
        properties.setProperty("v2.compatibility.enabled", String.valueOf(this.sdkV2OTelCompatible));
        Double d = this.sampleRate;
        if (d != null) {
            properties.setProperty("trace.sample.rate", String.valueOf(d.doubleValue() / 100.0d));
        }
        LinkedHashMap linkedHashMap = this.globalTags;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(entry.getKey() + ":" + entry.getValue());
        }
        properties.setProperty("tags", CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62));
        Config config2 = Config.INSTANCE;
        if (properties.isEmpty()) {
            config = Config.INSTANCE;
        } else {
            ConfigProvider configProvider = new ConfigProvider(new ConfigProvider[]{new ConfigProvider(properties)});
            config = new Config(configProvider, new InstrumenterConfig(configProvider));
        }
        CoreTracer.CoreTracerBuilder coreTracerBuilder = this.delegate;
        coreTracerBuilder.config(config);
        CoreTracer coreTracer = new CoreTracer(coreTracerBuilder.config, coreTracerBuilder.serviceName, coreTracerBuilder.writer, coreTracerBuilder.idGenerationStrategy, coreTracerBuilder.sampler, coreTracerBuilder.injector, coreTracerBuilder.localRootSpanTags, coreTracerBuilder.defaultSpanTags, coreTracerBuilder.serviceNameMappings, coreTracerBuilder.taggedHeaders, coreTracerBuilder.baggageMapping, coreTracerBuilder.partialFlushMinSpans, coreTracerBuilder.strictTraceWrites, coreTracerBuilder.injectBaggageAsTags, coreTracerBuilder.internalLogger);
        InternalSdkCore internalSdkCore = this.sdkCore;
        internalSdkCore.getClass();
        DatadogTracerAdapter datadogTracerAdapter = new DatadogTracerAdapter(internalSdkCore, coreTracer, new zza(3));
        e eVar = new e();
        ContinuableScopeManager continuableScopeManager = coreTracer.scopeManager;
        if (continuableScopeManager != null) {
            continuableScopeManager.scopeListeners.add(eVar);
            continuableScopeManager.log.debug("Added scope listener {}", eVar);
            ((ScopeStack) continuableScopeManager.tlsScopeStack.get()).getClass();
        }
        return datadogTracerAdapter;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final DatadogTracerBuilder setBundleWithRumEnabled() {
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final DatadogTracerBuilder withPartialFlushMinSpans() {
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final DatadogTracerBuilder withSampleRate(double d) {
        this.sampleRate = Double.valueOf(d);
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final DatadogTracerBuilder withServiceName(String str) {
        this.serviceName = str;
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final DatadogTracerBuilder withTag(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.globalTags.put(str, str2);
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final DatadogTracerBuilder withTracingHeadersTypes(Set set) {
        set.getClass();
        this.tracingHeadersTypes = set;
        return this;
    }
}
