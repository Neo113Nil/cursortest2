package com.datadog.trace.core;

import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.paging.LoadState;
import com.android.volley.Response;
import com.datadog.android.api.InternalLogger;
import com.datadog.trace.api.Config;
import com.datadog.trace.api.ConfigCollector;
import com.datadog.trace.api.DynamicConfig;
import com.datadog.trace.api.DynamicConfig.Builder;
import com.datadog.trace.api.EndpointCheckpointer;
import com.datadog.trace.api.EndpointCheckpointerHolder;
import com.datadog.trace.api.Functions;
import com.datadog.trace.api.InstrumenterConfig;
import com.datadog.trace.api.NoOpStatsDClient;
import com.datadog.trace.api.TracePropagationStyle;
import com.datadog.trace.api.naming.NamingSchema;
import com.datadog.trace.api.naming.SpanNaming$Singleton;
import com.datadog.trace.api.time.SystemTimeSource;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;
import com.datadog.trace.common.metrics.NoOpMetricsAggregator;
import com.datadog.trace.common.sampling.Sampler;
import com.datadog.trace.common.sampling.SpanSamplingRules;
import com.datadog.trace.common.sampling.TraceSamplingRules;
import com.datadog.trace.common.writer.Writer;
import com.datadog.trace.core.PendingTraceBuffer;
import com.datadog.trace.core.propagation.B3HttpCodec;
import com.datadog.trace.core.propagation.B3HttpCodec$$ExternalSyntheticLambda0;
import com.datadog.trace.core.propagation.HttpCodec;
import com.datadog.trace.core.propagation.NoneCodec$2;
import com.datadog.trace.core.propagation.TagContextExtractor;
import com.datadog.trace.core.propagation.W3CHttpCodec$Injector;
import com.datadog.trace.core.scopemanager.ContinuableScopeManager;
import com.datadog.trace.core.taginterceptor.TagInterceptor;
import com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda0;
import com.datadog.trace.monitor.NoOpRecording;
import com.datadog.trace.util.PidHelper;
import com.datadog.trace.util.Strings;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.tasks.zzb;
import com.google.gson.stream.JsonReader;
import com.google.mlkit.vision.text.zzc;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class CoreTracer implements EndpointCheckpointer {
    public final boolean allowInferredServices;
    public final long clockSyncPeriod;
    public volatile long counterDrift;
    public final Map defaultSpanTags;
    public final boolean disableSamplingMechanismValidation;
    public final DynamicConfig dynamicConfig;
    public final EndpointCheckpointerHolder endpointCheckpointer;
    public final LoadState idGenerationStrategy;
    public final Config initialConfig;
    public final Sampler initialSampler;
    public final InternalLogger internalLogger;
    public volatile long lastSyncTicks;
    public final Map localRootSpanTags;
    public final zbc log;
    public final NoOpMetricsAggregator metricsAggregator;
    public final int partialFlushMinSpans;
    public final PendingTraceBuffer pendingTraceBuffer;
    public final Response pendingTraceFactory;
    public final TagContext.HttpHeaders profilingContextIntegration;
    public final Box propagation;
    public final Sniffer propagationTagsFactory;
    public final ContinuableScopeManager scopeManager;
    public final String serviceName;
    public final SimpleDecoder.AnonymousClass1 shutdownCallback;
    public final long startNanoTicks;
    public final long startTimeNano;
    public final NoOpStatsDClient statsDClient;
    public final TagInterceptor tagInterceptor;
    public final SystemTimeSource timeSource;
    public final NoOpRecording traceWriteTimer;
    public final Writer writer;

    public final class ConfigSnapshot {
        public final Map baggageMapping;
        public final boolean dataStreamsEnabled;
        public final boolean logsInjectionEnabled;
        public final Map requestHeaderTags;
        public final Map responseHeaderTags;
        public final boolean runtimeMetricsEnabled;
        public final Sampler sampler;
        public final Map serviceMapping;
        public final List spanSamplingRules;
        public final Double traceSampleRate;
        public final List traceSamplingRules;

        public ConfigSnapshot(DynamicConfig.Builder builder, ConfigSnapshot configSnapshot) {
            this.runtimeMetricsEnabled = builder.runtimeMetricsEnabled;
            this.logsInjectionEnabled = builder.logsInjectionEnabled;
            this.dataStreamsEnabled = builder.dataStreamsEnabled;
            Map map = builder.serviceMapping;
            this.serviceMapping = map == null ? Collections.EMPTY_MAP : map;
            Map map2 = builder.requestHeaderTags;
            this.requestHeaderTags = map2 == null ? Collections.EMPTY_MAP : map2;
            Map map3 = builder.responseHeaderTags;
            this.responseHeaderTags = map3 == null ? Collections.EMPTY_MAP : map3;
            Map map4 = builder.baggageMapping;
            this.baggageMapping = map4 == null ? Collections.EMPTY_MAP : map4;
            Double d = builder.traceSampleRate;
            this.traceSampleRate = d;
            this.spanSamplingRules = builder.spanSamplingRules;
            this.traceSamplingRules = builder.traceSamplingRules;
            if (configSnapshot == null) {
                this.sampler = CoreTracer.this.initialSampler;
            } else if (Objects.equals(d, configSnapshot.traceSampleRate)) {
                this.sampler = configSnapshot.sampler;
            } else {
                this.sampler = Sampler.Builder.forConfig(CoreTracer.this.initialConfig, this);
            }
        }

        public final String toString() {
            return "DynamicConfig{debugEnabled=false, runtimeMetricsEnabled=" + this.runtimeMetricsEnabled + ", logsInjectionEnabled=" + this.logsInjectionEnabled + ", dataStreamsEnabled=" + this.dataStreamsEnabled + ", serviceMapping=" + this.serviceMapping + ", requestHeaderTags=" + this.requestHeaderTags + ", responseHeaderTags=" + this.responseHeaderTags + ", baggageMapping=" + this.baggageMapping + ", spanSamplingRules=" + this.spanSamplingRules + ", traceSamplingRules=" + this.traceSamplingRules + ", traceSampleRate=" + this.traceSampleRate + '}';
        }
    }

    public final class CoreTracerBuilder {
        public HashMap baggageMapping;
        public Config config;
        public HashMap defaultSpanTags;
        public LoadState idGenerationStrategy;
        public boolean injectBaggageAsTags;
        public W3CHttpCodec$Injector injector;
        public InternalLogger internalLogger;
        public HashMap localRootSpanTags;
        public int partialFlushMinSpans;
        public Sampler sampler;
        public String serviceName;
        public HashMap serviceNameMappings;
        public boolean strictTraceWrites;
        public HashMap taggedHeaders;
        public Writer writer;

        public final void config(Config config) {
            String str;
            this.config = config;
            String str2 = config.serviceName;
            HashMap hashMap = config.baggageMapping;
            this.serviceName = str2;
            String str3 = null;
            this.sampler = Sampler.Builder.forConfig(config, null);
            Map singletonMap = Collections.singletonMap("runtime-id", config.runtimeIdEnabled ? Config.RuntimeIdHolder.runtimeId : "");
            HashMap hashMap2 = new HashMap(singletonMap.size() + 2);
            hashMap2.putAll(singletonMap);
            hashMap2.put("language", "jvm");
            hashMap2.put("_dd.trace_span_attribute_schema", Integer.valueOf(SpanNaming$Singleton.INSTANCE.peekLength));
            hashMap2.put("_dd.profiling.enabled", Integer.valueOf((config.profilingEnabled && config.instrumenterConfig.profilingEnabled) ? 1 : 0));
            if (config.reportHostName && (str = Config.HostNameHolder.hostName) != null && !str.isEmpty()) {
                hashMap2.put("_dd.hostname", str);
            }
            if (config.azureAppServices) {
                HashMap hashMap3 = new HashMap();
                String env = Config.getEnv("WEBSITE_SITE_NAME");
                if (env != null) {
                    hashMap3.put("aas.site.name", env);
                }
                if (Config.getEnv("FUNCTIONS_WORKER_RUNTIME") == null && Config.getEnv("FUNCTIONS_EXTENSIONS_VERSION") == null) {
                    hashMap3.put("aas.site.kind", "app");
                    hashMap3.put("aas.site.type", "app");
                } else {
                    hashMap3.put("aas.site.kind", "functionapp");
                    hashMap3.put("aas.site.type", "function");
                }
                String env2 = Config.getEnv("WEBSITE_RESOURCE_GROUP");
                if (env2 != null) {
                    hashMap3.put("aas.resource.group", env2);
                }
                String env3 = Config.getEnv("WEBSITE_OWNER_NAME");
                int indexOf = env3 == null ? -1 : env3.indexOf(Marker.ANY_NON_NULL_MARKER);
                if (indexOf > 0) {
                    str3 = env3.substring(0, indexOf);
                    hashMap3.put("aas.subscription.id", str3);
                }
                if (str3 != null && env != null && env2 != null) {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("/subscriptions/", str3, "/resourcegroups/", env2, "/providers/microsoft.web/sites/");
                    m.append(env);
                    hashMap3.put("aas.resource.id", m.toString().toLowerCase(Locale.ROOT));
                }
                String env4 = Config.getEnv("WEBSITE_INSTANCE_ID");
                if (env4 == null) {
                    env4 = "unknown";
                }
                hashMap3.put("aas.environment.instance_id", env4);
                String env5 = Config.getEnv("COMPUTERNAME");
                if (env5 == null) {
                    env5 = "unknown";
                }
                hashMap3.put("aas.environment.instance_name", env5);
                String env6 = Config.getEnv("WEBSITE_OS");
                if (env6 == null) {
                    env6 = "unknown";
                }
                hashMap3.put("aas.environment.os", env6);
                String env7 = Config.getEnv("DD_AAS_JAVA_EXTENSION_VERSION");
                if (env7 == null) {
                    env7 = "unknown";
                }
                hashMap3.put("aas.environment.extension_version", env7);
                String property = System.getProperty("java.vm.name", "unknown");
                if (property != null) {
                    ConfigCollector.INSTANCE.put("java.vm.name", 3, property);
                }
                hashMap3.put("aas.environment.runtime", property);
                hashMap2.putAll(hashMap3);
            }
            hashMap2.putAll(Collections.singletonMap("process_id", Long.valueOf(PidHelper.PID_AS_LONG)));
            this.localRootSpanTags = new HashMap(Collections.unmodifiableMap(hashMap2));
            Map map = config.tags;
            int size = map.size();
            HashMap hashMap4 = config.spanTags;
            HashMap hashMap5 = new HashMap(hashMap4.size() + size + 1, 1.0f);
            hashMap5.putAll(map);
            hashMap5.putAll(hashMap4);
            this.defaultSpanTags = new HashMap(Collections.unmodifiableMap(hashMap5));
            this.serviceNameMappings = new HashMap(config.serviceMapping);
            this.taggedHeaders = new HashMap(config.requestHeaderTags);
            this.baggageMapping = new HashMap(hashMap);
            this.partialFlushMinSpans = config.partialFlushMinSpans;
            this.strictTraceWrites = config.traceStrictWritesEnabled;
            this.injectBaggageAsTags = config.injectBaggageAsTagsEnabled;
            this.injector = new W3CHttpCodec$Injector(new ArrayList(HttpCodec.createInjectors(config, config.tracePropagationStylesToInject, CoreTracer.invertMap(hashMap)).values()), 4);
        }
    }

    public CoreTracer(Config config, String str, Writer writer, LoadState loadState, Sampler sampler, W3CHttpCodec$Injector w3CHttpCodec$Injector, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, HashMap hashMap5, int i, boolean z, boolean z2, InternalLogger internalLogger) {
        TagContext.HttpHeaders httpHeaders = TagContext.HttpHeaders.INSTANCE$2;
        int i2 = 4;
        this.log = new zbc(i2, "CoreTracer", internalLogger);
        this.timeSource = SystemTimeSource.INSTANCE;
        this.startTimeNano = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        long nanoTime = System.nanoTime();
        this.startNanoTicks = nanoTime;
        this.clockSyncPeriod = Math.max(1000000L, TimeUnit.SECONDS.toNanos(config.clockSyncPeriod));
        this.lastSyncTicks = nanoTime;
        Functions.LowerCase lowerCase = Functions.LowerCase.NO_OP;
        EndpointCheckpointerHolder endpointCheckpointerHolder = new EndpointCheckpointerHolder();
        endpointCheckpointerHolder.endpointCheckpointer = lowerCase;
        this.endpointCheckpointer = endpointCheckpointerHolder;
        this.serviceName = str;
        this.initialConfig = config;
        this.initialSampler = sampler;
        String str2 = config.traceSamplingRules;
        TraceSamplingRules deserialize = str2 == null ? TraceSamplingRules.EMPTY : TraceSamplingRules.deserialize(str2);
        String str3 = config.spanSamplingRules;
        String str4 = config.spanSamplingRulesFile;
        SpanSamplingRules spanSamplingRules = SpanSamplingRules.EMPTY;
        if (str3 != null) {
            try {
                spanSamplingRules = SpanSamplingRules.filterOutNullRules(SpanSamplingRules.deserializeRules(new JsonReader(new StringReader(str3))));
            } catch (Throwable unused) {
                SpanSamplingRules.log.getClass();
            }
        } else if (str4 != null) {
            zzc zzcVar = SpanSamplingRules.log;
            try {
                JsonReader jsonReader = new JsonReader(new FileReader(str4));
                try {
                    spanSamplingRules = SpanSamplingRules.filterOutNullRules(SpanSamplingRules.deserializeRules(jsonReader));
                    jsonReader.close();
                } finally {
                }
            } catch (FileNotFoundException unused2) {
                zzcVar.getClass();
            } catch (IOException unused3) {
                zzcVar.getClass();
            } catch (Throwable unused4) {
                zzcVar.getClass();
            }
        }
        ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, 25);
        DynamicConfig dynamicConfig = new DynamicConfig();
        dynamicConfig.snapshotFactory = exoPlayerImplInternal$$ExternalSyntheticLambda2;
        DynamicConfig.Builder builder = dynamicConfig.new Builder();
        builder.runtimeMetricsEnabled = config.runtimeMetricsEnabled;
        builder.logsInjectionEnabled = config.logsInjectionEnabled;
        builder.dataStreamsEnabled = config.dataStreamsEnabled;
        Set<Map.Entry> entrySet = hashMap3.entrySet();
        int i3 = 3;
        HashMap hashMap6 = new HashMap((entrySet.size() * 4) / 3);
        for (Map.Entry entry : entrySet) {
            hashMap6.put(Strings.trim((String) entry.getKey()), Strings.trim((String) entry.getValue()));
        }
        builder.serviceMapping = new HashMap(hashMap6);
        Config config2 = Config.INSTANCE;
        if (!config2.requestHeaderTags.equals(hashMap4) || config2.responseHeaderTags.equals(hashMap4)) {
            Set entrySet2 = hashMap4.entrySet();
            builder.requestHeaderTags = DynamicConfig.cleanMapping(entrySet2, DynamicConfig.REQUEST_TAG);
            builder.responseHeaderTags = DynamicConfig.cleanMapping(entrySet2, DynamicConfig.RESPONSE_TAG);
        } else {
            builder.requestHeaderTags = config2.requestHeaderTags;
            builder.responseHeaderTags = config2.responseHeaderTags;
        }
        Set<Map.Entry> entrySet3 = hashMap5.entrySet();
        HashMap hashMap7 = new HashMap((entrySet3.size() * 4) / 3);
        for (Map.Entry entry2 : entrySet3) {
            hashMap7.put(Strings.trim((String) entry2.getKey()).toLowerCase(Locale.ROOT), Strings.trim((String) entry2.getValue()));
        }
        builder.baggageMapping = new HashMap(hashMap7);
        builder.traceSampleRate = config.traceSampleRate;
        builder.spanSamplingRules = spanSamplingRules.rules;
        builder.traceSamplingRules = deserialize.rules;
        ConfigSnapshot configSnapshot = DynamicConfig.this.currentSnapshot;
        ConfigSnapshot configSnapshot2 = ((CoreTracer) DynamicConfig.this.snapshotFactory.f$0).new ConfigSnapshot(builder, configSnapshot);
        DynamicConfig dynamicConfig2 = DynamicConfig.this;
        if (configSnapshot == null) {
            dynamicConfig2.currentSnapshot = configSnapshot2;
        } else {
            dynamicConfig2.currentSnapshot = configSnapshot2;
            HashMap hashMap8 = new HashMap();
            hashMap8.put("trace.debug", Boolean.FALSE);
            hashMap8.put("runtime.metrics.enabled", Boolean.valueOf(configSnapshot2.runtimeMetricsEnabled));
            hashMap8.put("logs.injection", Boolean.valueOf(configSnapshot2.logsInjectionEnabled));
            hashMap8.put("data.streams.enabled", Boolean.valueOf(configSnapshot2.dataStreamsEnabled));
            hashMap8.put("service.mapping", configSnapshot2.serviceMapping);
            hashMap8.put("trace.request_header.tags", configSnapshot2.requestHeaderTags);
            hashMap8.put("trace.response_header.tags", configSnapshot2.responseHeaderTags);
            hashMap8.put("trace.header.baggage", configSnapshot2.baggageMapping);
            Double d = configSnapshot2.traceSampleRate;
            if (d != null) {
                hashMap8.put("trace.sample.rate", d);
            }
            ConfigCollector.INSTANCE.putAll(hashMap8);
        }
        this.dynamicConfig = DynamicConfig.this;
        InstrumenterConfig.INSTANCE.getClass();
        this.defaultSpanTags = hashMap2;
        this.partialFlushMinSpans = i;
        this.idGenerationStrategy = loadState == null ? Config.INSTANCE.idGenerationStrategy : loadState;
        this.statsDClient = NoOpStatsDClient.NO_OP;
        this.traceWriteTimer = NoOpRecording.NO_OP;
        this.scopeManager = new ContinuableScopeManager(internalLogger);
        int i4 = 0;
        this.disableSamplingMechanismValidation = config.configProvider.getBoolean(new String[0], "trace.sampling.mechanism.validation.disabled", false);
        this.writer = writer;
        PendingTraceBuffer discardingPendingTraceBuffer = z ? new PendingTraceBuffer.DiscardingPendingTraceBuffer(internalLogger) : new PendingTraceBuffer.DelayingPendingTraceBuffer(this.timeSource, config);
        this.pendingTraceBuffer = discardingPendingTraceBuffer;
        this.pendingTraceFactory = new Response(this, discardingPendingTraceBuffer, this.timeSource, z);
        discardingPendingTraceBuffer.start();
        writer.getClass();
        this.metricsAggregator = NoOpMetricsAggregator.INSTANCE;
        CoreTracer$$ExternalSyntheticLambda1 coreTracer$$ExternalSyntheticLambda1 = new CoreTracer$$ExternalSyntheticLambda1(this);
        ArrayList arrayList = new ArrayList();
        Iterator it = config.tracePropagationStylesToExtract.iterator();
        while (true) {
            int i5 = 1;
            if (!it.hasNext()) {
                int size = arrayList.size();
                this.propagation = new Box(size != 0 ? size != 1 ? new HttpCodec.CompoundExtractor(arrayList, config.tracePropagationExtractFirst) : (HttpCodec.Extractor) arrayList.get(0) : NoneCodec$2.INSTANCE, w3CHttpCodec$Injector, HttpCodec.createInjectors(config, EnumSet.allOf(TracePropagationStyle.class), invertMap(hashMap5)));
                this.tagInterceptor = new TagInterceptor(new zzb(config));
                SimpleDecoder.AnonymousClass1 anonymousClass1 = new SimpleDecoder.AnonymousClass1(this);
                this.shutdownCallback = anonymousClass1;
                try {
                    Runtime.getRuntime().addShutdownHook(anonymousClass1);
                } catch (IllegalStateException unused5) {
                }
                this.propagationTagsFactory = new Sniffer(config.xDatadogTagsMaxLength, 15);
                this.profilingContextIntegration = httpHeaders;
                this.allowInferredServices = ((NamingSchema) SpanNaming$Singleton.INSTANCE.scratch).allowInferredServices();
                this.localRootSpanTags = hashMap;
                this.internalLogger = internalLogger;
                return;
            }
            switch (((TracePropagationStyle) it.next()).ordinal()) {
                case 0:
                    arrayList.add(new TagContextExtractor(coreTracer$$ExternalSyntheticLambda1, new B3HttpCodec$$ExternalSyntheticLambda0(config, 2)));
                    break;
                case 1:
                    String str5 = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
                    arrayList.add(new TagContextExtractor(coreTracer$$ExternalSyntheticLambda1, new B3HttpCodec$$ExternalSyntheticLambda0(config, i4)));
                    break;
                case 2:
                    String str6 = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
                    arrayList.add(new TagContextExtractor(coreTracer$$ExternalSyntheticLambda1, new B3HttpCodec$$ExternalSyntheticLambda0(config, i5)));
                    break;
                case 3:
                    arrayList.add(new TagContextExtractor(coreTracer$$ExternalSyntheticLambda1, new B3HttpCodec$$ExternalSyntheticLambda0(config, i3)));
                    break;
                case 4:
                    arrayList.add(new TagContextExtractor(coreTracer$$ExternalSyntheticLambda1, new B3HttpCodec$$ExternalSyntheticLambda0(config, 5)));
                    break;
                case 5:
                    arrayList.add(new TagContextExtractor(coreTracer$$ExternalSyntheticLambda1, new B3HttpCodec$$ExternalSyntheticLambda0(config, i2)));
                    break;
                case 6:
                    arrayList.add(HttpCodec.EXTRACTOR);
                    break;
            }
        }
    }

    public static Map invertMap(Map map) {
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getValue(), entry.getKey());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final void finalize() {
        SimpleDecoder.AnonymousClass1 anonymousClass1 = this.shutdownCallback;
        if (anonymousClass1 != null) {
            try {
                anonymousClass1.run();
                Runtime.getRuntime().removeShutdownHook(anonymousClass1);
            } catch (IllegalStateException unused) {
            } catch (Exception e) {
                zbc zbcVar = this.log;
                InternalLogger internalLogger = (InternalLogger) zbcVar.zba;
                ((zzlj) internalLogger).log(5, Arrays.asList(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (Function0) new DatadogCoreTracerLogger$$ExternalSyntheticLambda0(zbcVar, 0), (Throwable) e, false, (Map) null);
            }
        }
    }

    @Override // com.datadog.trace.api.EndpointCheckpointer
    public final void onRootSpanFinished(DDSpan dDSpan) {
        this.endpointCheckpointer.onRootSpanFinished(dDSpan);
    }

    @Override // com.datadog.trace.api.EndpointCheckpointer
    public final void onRootSpanStarted(DDSpan dDSpan) {
        this.endpointCheckpointer.onRootSpanStarted(dDSpan);
    }
}
