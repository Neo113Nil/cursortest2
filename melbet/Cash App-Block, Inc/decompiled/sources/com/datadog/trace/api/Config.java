package com.datadog.trace.api;

import androidx.paging.LoadState;
import com.datadog.trace.bootstrap.config.provider.ConfigConverter;
import com.datadog.trace.bootstrap.config.provider.ConfigProvider;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class Config {
    public static final Config INSTANCE;
    public final String DBMPropagationMode;
    public final boolean agentConfiguredUsingDefault;
    public final String agentHost;
    public final int agentPort;
    public final int agentTimeout;
    public final String agentUrl;
    public final boolean awsPropagationEnabled;
    public final boolean azureAppServices;
    public final HashMap baggageMapping;
    public final boolean clientIpEnabled;
    public final int clockSyncPeriod;
    public final String configFileStatus;
    public final ConfigProvider configProvider;
    public final boolean crashTrackingAgentless;
    public final HashMap crashTrackingTags;
    public final boolean dataStreamsEnabled;
    public final boolean dbClientSplitByHost;
    public final boolean dbClientSplitByInstance;
    public final boolean dbClientSplitByInstanceTypeSuffix;
    public final boolean debugEnabled;
    public final List dogStatsDArgs;
    public final boolean elasticsearchBodyAndParamsEnabled;
    public final boolean elasticsearchBodyEnabled;
    public final boolean elasticsearchParamsEnabled;
    public final BitSet grpcClientErrorStatuses;
    public final HashSet grpcIgnoredInboundMethods;
    public final HashSet grpcIgnoredOutboundMethods;
    public final BitSet grpcServerErrorStatuses;
    public final boolean healthMetricsEnabled;
    public final String healthMetricsStatsdHost;
    public final Integer healthMetricsStatsdPort;
    public final BitSet httpClientErrorStatuses;
    public final LinkedHashMap httpClientPathResourceNameMapping;
    public final boolean httpClientSplitByDomain;
    public final boolean httpClientTagQueryString;
    public final boolean httpResourceRemoveTrailingSlash;
    public final boolean httpServerDecodedResourcePreserveSpaces;
    public final BitSet httpServerErrorStatuses;
    public final LinkedHashMap httpServerPathResourceNameMapping;
    public final boolean httpServerRawQueryString;
    public final boolean httpServerRawResource;
    public final boolean httpServerRouteBasedNaming;
    public final boolean httpServerTagQueryString;
    public final boolean hystrixMeasuredEnabled;
    public final boolean hystrixTagsEnabled;
    public final LoadState idGenerationStrategy;
    public final boolean igniteCacheIncludeKeys;
    public final boolean injectBaggageAsTagsEnabled;
    public final InstrumenterConfig instrumenterConfig;
    public final boolean integrationSynapseLegacyOperationName;
    public final boolean jaxRsExceptionAsErrorsEnabled;
    public final HashSet jmsPropagationDisabledQueues;
    public final HashSet jmsPropagationDisabledTopics;
    public final boolean jmsPropagationEnabled;
    public final boolean kafkaClientBase64DecodingEnabled;
    public final HashSet kafkaClientPropagationDisabledTopics;
    public final boolean kafkaClientPropagationEnabled;
    public final boolean logExtractHeaderNames;
    public final boolean logsInjectionEnabled;
    public final boolean longRunningTraceEnabled;
    public final long longRunningTraceFlushInterval;
    public final boolean messageBrokerSplitByDestination;
    public final HashSet noProxyHosts;
    public final int partialFlushMinSpans;
    public final HashMap peerServiceComponentOverrides;
    public final boolean peerServiceDefaultsEnabled;
    public final boolean perfMetricsEnabled;
    public final boolean prioritySamplingEnabled;
    public final String prioritySamplingForce;
    public final boolean profilingAgentless;
    public final boolean profilingEnabled;
    public final int profilingExceptionHistogramMaxCollectionSize;
    public final int profilingExceptionHistogramTopItems;
    public final int profilingExceptionSampleLimit;
    public final boolean profilingExcludeAgentThreads;
    public final String profilingProxyHost;
    public final String profilingProxyPassword;
    public final int profilingProxyPort;
    public final String profilingProxyUsername;
    public final int profilingStartDelay;
    public final boolean profilingStartForceFirst;
    public final HashMap profilingTags;
    public final String profilingTemplateOverrideFile;
    public final String profilingUploadCompression;
    public final int profilingUploadPeriod;
    public final int profilingUploadTimeout;
    public final String profilingUrl;
    public final HashSet rabbitPropagationDisabledExchanges;
    public final HashSet rabbitPropagationDisabledQueues;
    public final boolean rabbitPropagationEnabled;
    public final boolean remoteConfigEnabled;
    public final boolean remoteConfigIntegrityCheckEnabled;
    public final long remoteConfigMaxPayloadSize;
    public final float remoteConfigPollIntervalSeconds;
    public final String remoteConfigUrl;
    public final boolean removeIntegrationServiceNamesEnabled;
    public final boolean reportHostName;
    public final HashMap requestHeaderTags;
    public final boolean requestHeaderTagsCommaAllowed;
    public final Map responseHeaderTags;
    public final String rootContextServiceName;
    public final boolean runtimeIdEnabled;
    public final boolean runtimeMetricsEnabled;
    public final String runtimeVersion;
    public final int scopeDepthLimit;
    public final boolean scopeInheritAsyncPropagation;
    public final int scopeIterationKeepAlive;
    public final boolean scopeStrictMode;
    public final HashMap serviceMapping;
    public final String serviceName;
    public final boolean serviceNameSetByUser;
    public final boolean servletAsyncTimeoutError;
    public final boolean servletPrincipalEnabled;
    public final String site;
    public final int spanAttributeSchemaVersion;
    public final String spanSamplingRules;
    public final String spanSamplingRulesFile;
    public final HashMap spanTags;
    public final boolean sparkTaskHistogramEnabled;
    public final HashSet splitByTags;
    public final boolean sqsPropagationEnabled;
    public final boolean startupLogsEnabled;
    public final Map tags;
    public final boolean telemetryDebugRequestsEnabled;
    public final boolean telemetryMetricsEnabled;
    public final boolean trace128bitTraceIdGenerationEnabled;
    public final List traceAgentArgs;
    public final boolean traceAgentV05Enabled;
    public final boolean traceAnalyticsEnabled;
    public final String traceClientIpHeader;
    public final float traceFlushIntervalSeconds;
    public final boolean tracePropagationExtractFirst;
    public final boolean tracePropagationStyleB3PaddingEnabled;
    public final Set tracePropagationStylesToExtract;
    public final Set tracePropagationStylesToInject;
    public final int traceRateLimit;
    public final boolean traceResolverEnabled;
    public final Double traceSampleRate;
    public final HashMap traceSamplingOperationRules;
    public final String traceSamplingRules;
    public final HashMap traceSamplingServiceRules;
    public final boolean traceStrictWritesEnabled;
    public final boolean tracerMetricsBufferingEnabled;
    public final boolean tracerMetricsEnabled;
    public final int tracerMetricsMaxAggregates;
    public final int tracerMetricsMaxPending;
    public final boolean triageEnabled;
    public final String writerType;
    public final int xDatadogTagsMaxLength;

    public abstract class HostNameHolder {
        public static final String hostName;

        static {
            String str;
            String env = Config.getEnv("HOSTNAME");
            if (env == null || env.isEmpty()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("hostname").getInputStream()));
                    try {
                        env = bufferedReader.readLine();
                        bufferedReader.close();
                    } finally {
                    }
                } catch (Throwable unused) {
                }
                if (env == null || env.isEmpty()) {
                    try {
                        str = InetAddress.getLocalHost().getHostName();
                    } catch (UnknownHostException unused2) {
                        str = null;
                    }
                } else {
                    str = env.trim();
                }
            } else {
                str = env.trim();
            }
            hostName = str;
        }
    }

    public abstract class RuntimeIdHolder {
        public static final String runtimeId = UUID.randomUUID().toString();
    }

    static {
        Pattern.compile(":");
        INSTANCE = new Config(ConfigConverter.INSTANCE, InstrumenterConfig.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x06de, code lost:
    
        if ("arm64".equalsIgnoreCase(r4) == false) goto L182;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x050e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Config(ConfigProvider configProvider, InstrumenterConfig instrumenterConfig) {
        String str;
        String str2;
        int i;
        boolean z;
        int i2;
        Set parseStringIntoSetOfNonEmptyStrings;
        Set unmodifiableSet;
        Set parseStringIntoSetOfNonEmptyStrings2;
        int i3;
        Set unmodifiableSet2;
        Set parseStringIntoSetOfNonEmptyStrings3;
        Set unmodifiableSet3;
        float f;
        float f2;
        String string2;
        String string3;
        boolean z2;
        long longValue;
        boolean z3;
        String property;
        System.currentTimeMillis();
        this.configProvider = configProvider;
        this.instrumenterConfig = instrumenterConfig;
        ConfigProvider[] configProviderArr = (ConfigProvider[]) configProvider.sources;
        int length = configProviderArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                str = "no config file present";
                break;
            }
            ConfigProvider configProvider2 = configProviderArr[i4];
            if (configProvider2 != null && (str = ((Properties) configProvider2.sources).getProperty("_dd.config.file.status")) != null) {
                break;
            } else {
                i4++;
            }
        }
        this.configFileStatus = str;
        this.runtimeIdEnabled = configProvider.getBoolean(new String[0], "runtime-id.enabled", true);
        this.runtimeVersion = System.getProperty("java.version", "unknown");
        this.site = configProvider.getString("site", "datadoghq.com", new String[0]);
        String string4 = configProvider.getString("service", null, "service.name");
        if (string4 == null) {
            this.serviceNameSetByUser = false;
            this.serviceName = configProvider.getString("service", "unnamed-java-app", "service.name");
        } else {
            this.serviceNameSetByUser = true;
            this.serviceName = string4;
        }
        this.rootContextServiceName = configProvider.getString("trace.servlet.root-context.service.name", "root-servlet", new String[0]);
        this.integrationSynapseLegacyOperationName = configProvider.getBoolean(new String[0], "integration.synapse.legacy-operation-name", false);
        this.writerType = configProvider.getString("writer.type", "DDAgentWriter", new String[0]);
        this.injectBaggageAsTagsEnabled = configProvider.getBoolean(new String[0], "writer.baggage.inject", true);
        boolean z4 = configProvider.getBoolean(new String[0], "trace.secure-random", false);
        this.elasticsearchBodyEnabled = configProvider.getBoolean(new String[0], "trace.elasticsearch.body.enabled", false);
        this.elasticsearchParamsEnabled = configProvider.getBoolean(new String[0], "trace.elasticsearch.params.enabled", true);
        this.elasticsearchBodyAndParamsEnabled = configProvider.getBoolean(new String[0], "trace.elasticsearch.body-and-params.enabled", false);
        String string5 = configProvider.getString("id.generation.strategy");
        boolean z5 = configProvider.getBoolean(new String[0], "trace.128.bit.traceid.generation.enabled", true);
        this.trace128bitTraceIdGenerationEnabled = z5;
        string5 = z4 ? "SECURE_RANDOM" : string5;
        string5 = string5 == null ? "RANDOM" : string5;
        LoadState fromName = LoadState.fromName(string5, z5);
        if (fromName == null) {
            fromName = LoadState.fromName("RANDOM", z5);
            string5 = "RANDOM";
        }
        if (!string5.equals("RANDOM")) {
            string5.equals("SECURE_RANDOM");
        }
        this.idGenerationStrategy = fromName;
        String string6 = configProvider.getString("trace.agent.url");
        if (string6 != null) {
            try {
                URI uri = new URI(string6);
                str2 = uri.getHost();
                try {
                    i = uri.getPort();
                } catch (URISyntaxException e) {
                    e = e;
                    e.getMessage();
                    i = -1;
                    if (str2 != null) {
                    }
                    if (i < 0) {
                    }
                    if (str2 != null) {
                    }
                    if (i >= 0) {
                    }
                    if (z) {
                    }
                    this.agentConfiguredUsingDefault = str2 != null && i < 0 && configProvider.getString("trace.pipe.name") == null;
                    int i5 = 10;
                    this.agentTimeout = configProvider.getInteger(10, "trace.agent.timeout", new String[0]);
                    this.noProxyHosts = new HashSet(ConfigConverter.parseList(configProvider.getString("proxy.no_proxy"), " "));
                    this.prioritySamplingEnabled = configProvider.getBoolean(new String[0], "priority.sampling", true);
                    BitSet bitSet = ConfigDefaults.DEFAULT_HTTP_SERVER_ERROR_STATUSES;
                    this.prioritySamplingForce = configProvider.getString("priority.sampling.force", null, new String[0]);
                    this.traceResolverEnabled = configProvider.getBoolean(new String[0], "trace.resolver.enabled", true);
                    this.serviceMapping = configProvider.getMergedMap("service.mapping");
                    HashMap hashMap = new HashMap(configProvider.getMergedMap("trace.global.tags"));
                    hashMap.putAll(configProvider.getMergedMap("tags"));
                    String[] strArr = {"env", "version"};
                    HashMap hashMap2 = new HashMap(hashMap);
                    while (i2 < 2) {
                    }
                    this.tags = Collections.unmodifiableMap(hashMap2);
                    this.spanTags = configProvider.getMergedMap("trace.span.tags");
                    configProvider.getString("primary.tag");
                    if (this.configProvider.isEnabled(Collections.singletonList("trace.header.tags"), "", ".legacy.parsing.enabled", false)) {
                    }
                    this.requestHeaderTagsCommaAllowed = configProvider.getBoolean(new String[0], "trace.request_header.tags.comma.allowed", true);
                    this.baggageMapping = configProvider.getMergedMap("trace.header.baggage");
                    Matcher matcher = Pattern.compile("^v?(0|[1-9]\\d*)$").matcher(this.configProvider.getString("trace.span.attribute.schema", "v0", new String[0]));
                    if (matcher.matches()) {
                    }
                    this.spanAttributeSchemaVersion = (r7 >= 0 || r7 > 1) ? 0 : r7;
                    this.peerServiceDefaultsEnabled = configProvider.getBoolean(new String[0], "trace.peer.service.defaults.enabled", false);
                    this.peerServiceComponentOverrides = configProvider.getMergedMap("trace.peer.service.component.overrides");
                    this.removeIntegrationServiceNamesEnabled = configProvider.getBoolean(new String[0], "trace.remove.integration-service-names.enabled", false);
                    configProvider.getMergedMap("trace.peer.service.mapping");
                    this.httpServerPathResourceNameMapping = configProvider.getOrderedMap("trace.http.server.path-resource-name-mapping");
                    this.httpClientPathResourceNameMapping = configProvider.getOrderedMap("trace.http.client.path-resource-name-mapping");
                    this.httpResourceRemoveTrailingSlash = configProvider.getBoolean(new String[0], "trace.http.resource.remove-trailing-slash", false);
                    this.httpServerErrorStatuses = configProvider.getIntegerRange("http.server.error.statuses", ConfigDefaults.DEFAULT_HTTP_SERVER_ERROR_STATUSES);
                    this.httpClientErrorStatuses = configProvider.getIntegerRange("http.client.error.statuses", ConfigDefaults.DEFAULT_HTTP_CLIENT_ERROR_STATUSES);
                    this.httpServerTagQueryString = configProvider.getBoolean(new String[0], "http.server.tag.query-string", true);
                    this.httpServerRawQueryString = configProvider.getBoolean(new String[0], "http.server.raw.query-string", true);
                    this.httpServerRawResource = configProvider.getBoolean(new String[0], "http.server.raw.resource", false);
                    this.httpServerDecodedResourcePreserveSpaces = configProvider.getBoolean(new String[0], "http.server.decoded.resource.preserve-spaces", true);
                    this.httpServerRouteBasedNaming = configProvider.getBoolean(new String[0], "http.server.route-based-naming", true);
                    this.httpClientTagQueryString = configProvider.getBoolean(new String[0], "http.client.tag.query-string", false);
                    configProvider.getBoolean(new String[0], "http.client.tag.headers", true);
                    this.httpClientSplitByDomain = configProvider.getBoolean(new String[0], "trace.http.client.split-by-domain", false);
                    this.dbClientSplitByInstance = configProvider.getBoolean(new String[0], "trace.db.client.split-by-instance", false);
                    this.dbClientSplitByInstanceTypeSuffix = configProvider.getBoolean(new String[0], "trace.db.client.split-by-instance.type.suffix", false);
                    this.dbClientSplitByHost = configProvider.getBoolean(new String[0], "trace.db.client.split-by-host", false);
                    this.DBMPropagationMode = configProvider.getString("dbm.propagation.mode", "disabled", new String[0]);
                    this.splitByTags = new HashSet(configProvider.getList("trace.split-by-tags"));
                    configProvider.getBoolean(new String[0], "spring-data.repository.interface.resource-name", true);
                    this.scopeDepthLimit = configProvider.getInteger(100, "trace.scope.depth.limit", new String[0]);
                    this.scopeStrictMode = configProvider.getBoolean(new String[0], "trace.scope.strict.mode", false);
                    this.scopeInheritAsyncPropagation = configProvider.getBoolean(new String[0], "trace.scope.inherit.async.propagation", true);
                    this.scopeIterationKeepAlive = configProvider.getInteger(30, "trace.scope.iteration.keep.alive", new String[0]);
                    this.partialFlushMinSpans = configProvider.getBoolean(new String[0], "trace.partial.flush.enabled", true) ? 0 : configProvider.getInteger(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, "trace.partial.flush.min.spans", new String[0]);
                    this.traceStrictWritesEnabled = configProvider.getBoolean(new String[0], "trace.strict.writes.enabled", false);
                    this.logExtractHeaderNames = configProvider.getBoolean(new String[0], "propagation.extract.log_header_names.enabled", false);
                    this.tracePropagationStyleB3PaddingEnabled = this.configProvider.isEnabled(Collections.singletonList("trace.propagation.style"), "", ".b3.padding.enabled", true);
                    parseStringIntoSetOfNonEmptyStrings = parseStringIntoSetOfNonEmptyStrings(this.configProvider.getString("trace.propagation.style", "", new String[0]), false);
                    if (parseStringIntoSetOfNonEmptyStrings.isEmpty()) {
                    }
                    parseStringIntoSetOfNonEmptyStrings2 = parseStringIntoSetOfNonEmptyStrings(this.configProvider.getString("trace.propagation.style.extract", "", new String[0]), false);
                    if (parseStringIntoSetOfNonEmptyStrings2.isEmpty()) {
                    }
                    parseStringIntoSetOfNonEmptyStrings3 = parseStringIntoSetOfNonEmptyStrings(this.configProvider.getString("trace.propagation.style.inject", "", new String[0]), false);
                    if (parseStringIntoSetOfNonEmptyStrings3.isEmpty()) {
                    }
                    if (!unmodifiableSet2.isEmpty()) {
                    }
                    if (!unmodifiableSet3.isEmpty()) {
                    }
                    this.tracePropagationStylesToExtract = unmodifiableSet2.isEmpty() ? ConfigDefaults.DEFAULT_TRACE_PROPAGATION_STYLE : unmodifiableSet2;
                    this.tracePropagationStylesToInject = unmodifiableSet.isEmpty() ? ConfigDefaults.DEFAULT_TRACE_PROPAGATION_STYLE : unmodifiableSet;
                    this.tracePropagationExtractFirst = configProvider.getBoolean(new String[0], "trace.propagation.extract.first", false);
                    this.clockSyncPeriod = configProvider.getInteger(30, "trace.clock.sync.period", new String[0]);
                    this.logsInjectionEnabled = configProvider.getBoolean(new String[0], "logs.injection", true);
                    configProvider.getString("dogstatsd.pipe.name");
                    configProvider.getInteger(15, "dogstatsd.start-delay", new String[0]);
                    boolean z6 = configProvider.getBoolean(new String[0], "runtime.metrics.enabled", true);
                    this.runtimeMetricsEnabled = z6;
                    this.healthMetricsEnabled = !z6 && configProvider.getBoolean(new String[0], "trace.health.metrics.enabled", true);
                    this.healthMetricsStatsdHost = configProvider.getString("trace.health.metrics.statsd.host");
                    this.healthMetricsStatsdPort = (Integer) configProvider.get("trace.health.metrics.statsd.port", null, Integer.class, new String[0]);
                    this.perfMetricsEnabled = !z6 && configProvider.getBoolean(new String[0], "trace.perf.metrics.enabled", false);
                    this.tracerMetricsEnabled = configProvider.getBoolean(new String[0], "trace.tracer.metrics.enabled", false);
                    this.tracerMetricsBufferingEnabled = configProvider.getBoolean(new String[0], "trace.tracer.metrics.buffering.enabled", false);
                    this.tracerMetricsMaxAggregates = configProvider.getInteger(2048, "trace.tracer.metrics.max.aggregates", new String[0]);
                    this.tracerMetricsMaxPending = configProvider.getInteger(2048, "trace.tracer.metrics.max.pending", new String[0]);
                    this.reportHostName = configProvider.getBoolean(new String[0], "trace.report-hostname", false);
                    this.traceAgentV05Enabled = configProvider.getBoolean(new String[0], "trace.agent.v0.5.enabled", false);
                    this.traceAnalyticsEnabled = configProvider.getBoolean(new String[0], "trace.analytics.enabled", false);
                    String string7 = configProvider.getString("trace.client-ip-header");
                    this.traceClientIpHeader = string7 != null ? string7.toLowerCase(Locale.ROOT) : string7;
                    configProvider.getBoolean(new String[0], "trace.client-ip.resolver.enabled", true);
                    configProvider.getBoolean(new String[0], "trace.git.metadata.enabled", true);
                    this.traceSamplingServiceRules = configProvider.getMergedMap("trace.sampling.service.rules");
                    this.traceSamplingOperationRules = configProvider.getMergedMap("trace.sampling.operation.rules");
                    this.traceSamplingRules = configProvider.getString("trace.sampling.rules");
                    this.traceSampleRate = (Double) configProvider.get("trace.sample.rate", null, Double.class, new String[0]);
                    this.traceRateLimit = configProvider.getInteger(100, "trace.rate.limit", new String[0]);
                    this.spanSamplingRules = configProvider.getString("span.sampling.rules");
                    this.spanSamplingRulesFile = configProvider.getString("span.sampling.rules.file");
                    this.profilingEnabled = configProvider.getBoolean(new String[0], "profiling.enabled", instrumenterConfig.profilingEnabled);
                    this.profilingAgentless = configProvider.getBoolean(new String[0], "profiling.agentless", false);
                    if (!Platform.isJavaVersion(18)) {
                        if (!System.getProperty("java.vm.name").contains("J9")) {
                            property = System.getProperty("os.arch");
                            if (!"aarch64".equalsIgnoreCase(property)) {
                            }
                            z3 = false;
                            configProvider.getBoolean(new String[0], "profiling.ddprof.enabled", z3);
                        }
                        if (!Platform.RUNTIME.vendorVersion.toLowerCase(Locale.US).contains("graalvm")) {
                        }
                        z3 = false;
                        configProvider.getBoolean(new String[0], "profiling.ddprof.enabled", z3);
                    }
                    this.profilingUrl = configProvider.getString("profiling.url");
                    this.profilingTags = configProvider.getMergedMap("profiling.tags");
                    this.profilingStartDelay = configProvider.getInteger(i3, "profiling.start-delay", new String[0]);
                    this.profilingStartForceFirst = configProvider.getBoolean(new String[0], "profiling.start-force-first", false);
                    this.profilingUploadPeriod = configProvider.getInteger(60, "profiling.upload.period", new String[0]);
                    this.profilingTemplateOverrideFile = configProvider.getString("profiling.jfr-template-override-file");
                    this.profilingUploadTimeout = configProvider.getInteger(30, "profiling.upload.timeout", new String[0]);
                    this.profilingUploadCompression = configProvider.getString("profiling.upload.compression", "on", new String[0]);
                    this.profilingProxyHost = configProvider.getString("profiling.proxy.host");
                    this.profilingProxyPort = configProvider.getInteger(8080, "profiling.proxy.port", new String[0]);
                    this.profilingProxyUsername = configProvider.getString("profiling.proxy.username");
                    this.profilingProxyPassword = configProvider.getString("profiling.proxy.password");
                    this.profilingExceptionSampleLimit = configProvider.getInteger(10000, "profiling.exception.sample.limit", new String[0]);
                    configProvider.getInteger(2000, "profiling.direct.allocation.sample.limit", new String[0]);
                    this.profilingExceptionHistogramTopItems = configProvider.getInteger(50, "profiling.exception.histogram.top-items", new String[0]);
                    this.profilingExceptionHistogramMaxCollectionSize = configProvider.getInteger(10000, "profiling.exception.histogram.max-collection-size", new String[0]);
                    this.profilingExcludeAgentThreads = configProvider.getBoolean(new String[0], "profiling.exclude.agent-threads", true);
                    configProvider.getBoolean(new String[0], "profiling.exception.record.message", true);
                    configProvider.getBoolean(new String[0], "profiling.upload.summary-on-413", false);
                    this.crashTrackingAgentless = configProvider.getBoolean(new String[0], "crashtracking.agentless", false);
                    this.crashTrackingTags = configProvider.getMergedMap("crashtracking.tags");
                    f = configProvider.getFloat("telemetry.heartbeat.interval", 60.0f);
                    if (f >= 0.1d) {
                    }
                    ((Long) configProvider.get("telemetry.extended.heartbeat.interval", 86400L, Long.class, new String[0])).longValue();
                    f2 = configProvider.getFloat("telemetry.metrics.interval", 10.0f);
                    if (f2 >= 0.1d) {
                    }
                    this.telemetryMetricsEnabled = configProvider.getBoolean(new String[0], "telemetry.metrics.enabled", true);
                    configProvider.getBoolean(new String[0], "telemetry.dependency-collection.enabled", true);
                    configProvider.getBoolean(new String[0], "telemetry.log-collection.enabled", false);
                    this.clientIpEnabled = configProvider.getBoolean(new String[0], "trace.client-ip.enabled", false);
                    this.remoteConfigEnabled = configProvider.getBoolean(new String[0], "remote_config.enabled", true);
                    this.remoteConfigIntegrityCheckEnabled = configProvider.getBoolean(new String[0], "remote_config.integrity_check.enabled", false);
                    this.remoteConfigUrl = configProvider.getString("remote_config.url");
                    this.remoteConfigPollIntervalSeconds = configProvider.getFloat("remote_config.poll_interval.seconds", 5.0f);
                    this.remoteConfigMaxPayloadSize = configProvider.getInteger(5120, "remote_config.max.payload.size", new String[0]) * 1024;
                    configProvider.getString("rc.targets.key.id", "5c4ece41241a1bb513f6e3e5df74ab7d5183dfffbd71bfd43127920d880569fd", new String[0]);
                    configProvider.getString("rc.targets.key", "e3f1f98c9da02a93bb547f448b472d727e14b22455235796fe49863856252508", new String[0]);
                    this.awsPropagationEnabled = isPropagationEnabled("aws", "aws-sdk");
                    this.sqsPropagationEnabled = isPropagationEnabled("sqs");
                    this.kafkaClientPropagationEnabled = isPropagationEnabled("kafka", "kafka.client");
                    this.kafkaClientPropagationDisabledTopics = new HashSet(configProvider.getList("kafka.client.propagation.disabled.topics"));
                    this.kafkaClientBase64DecodingEnabled = configProvider.getBoolean(new String[0], "kafka.client.base64.decoding.enabled", false);
                    this.jmsPropagationEnabled = isPropagationEnabled("jms");
                    this.jmsPropagationDisabledTopics = new HashSet(configProvider.getList("jms.propagation.disabled.topics"));
                    this.jmsPropagationDisabledQueues = new HashSet(configProvider.getList("jms.propagation.disabled.queues"));
                    configProvider.getInteger(3600, "jms.unacknowledged.max.age", new String[0]);
                    this.rabbitPropagationEnabled = isPropagationEnabled("rabbit", "rabbitmq");
                    this.rabbitPropagationDisabledQueues = new HashSet(configProvider.getList("rabbit.propagation.disabled.queues"));
                    this.rabbitPropagationDisabledExchanges = new HashSet(configProvider.getList("rabbit.propagation.disabled.exchanges"));
                    configProvider.getBoolean(new String[0], "rabbit.include.routingkey.in.resource", true);
                    this.messageBrokerSplitByDestination = configProvider.getBoolean(new String[0], "message.broker.split-by-destination", false);
                    this.grpcIgnoredInboundMethods = new HashSet(configProvider.getList("trace.grpc.ignored.inbound.methods"));
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(configProvider.getList("trace.grpc.ignored.outbound.methods"));
                    if (InstrumenterConfig.INSTANCE.configProvider.isEnabled(Collections.singleton("google-pubsub"), "integration.", ".enabled", true)) {
                    }
                    this.grpcIgnoredOutboundMethods = new HashSet(arrayList);
                    configProvider.getBoolean(new String[0], "trace.grpc.server.trim-package-resource", false);
                    this.grpcServerErrorStatuses = configProvider.getIntegerRange("grpc.server.error.statuses", ConfigDefaults.DEFAULT_GRPC_SERVER_ERROR_STATUSES);
                    this.grpcClientErrorStatuses = configProvider.getIntegerRange("grpc.client.error.statuses", ConfigDefaults.DEFAULT_GRPC_CLIENT_ERROR_STATUSES);
                    this.hystrixTagsEnabled = configProvider.getBoolean(new String[0], "hystrix.tags.enabled", false);
                    this.hystrixMeasuredEnabled = configProvider.getBoolean(new String[0], "hystrix.measured.enabled", false);
                    this.igniteCacheIncludeKeys = configProvider.getBoolean(new String[0], "ignite.cache.include_keys", false);
                    configProvider.getString("trace.obfuscation.query.string.regexp", null, "obfuscation.query.string.regexp");
                    configProvider.getBoolean(new String[0], "trace.play.report-http-status", false);
                    this.servletPrincipalEnabled = configProvider.getBoolean(new String[0], "trace.servlet.principal.enabled", false);
                    this.xDatadogTagsMaxLength = configProvider.getInteger(512, "trace.x-datadog-tags.max.length", new String[0]);
                    this.servletAsyncTimeoutError = configProvider.getBoolean(new String[0], "trace.servlet.async-timeout.error", true);
                    boolean z7 = configProvider.getBoolean(new String[0], "trace.debug", false);
                    this.debugEnabled = z7;
                    this.triageEnabled = configProvider.getBoolean(new String[0], "trace.triage", z7);
                    this.startupLogsEnabled = configProvider.getBoolean(new String[0], "trace.startup.logs", true);
                    this.dataStreamsEnabled = configProvider.getBoolean(new String[0], "data.streams.enabled", false);
                    configProvider.getFloat("data.streams.bucket_duration.seconds", 10.0f);
                    this.azureAppServices = configProvider.getBoolean(new String[0], "azure.app.services", false);
                    configProvider.getString("trace.agent.path");
                    string2 = configProvider.getString("trace.agent.args");
                    if (string2 != null) {
                    }
                    configProvider.getString("dogstatsd.path");
                    string3 = configProvider.getString("dogstatsd.args");
                    if (string3 != null) {
                    }
                    z2 = configProvider.getBoolean(new String[0], "trace.experimental.long-running.enabled", false);
                    long j = 300;
                    longValue = ((Long) configProvider.get("trace.experimental.long-running.flush.interval", 300L, Long.class, new String[0])).longValue();
                    if (z2) {
                    }
                    j = longValue;
                    this.longRunningTraceEnabled = z2;
                    this.longRunningTraceFlushInterval = j;
                    this.sparkTaskHistogramEnabled = configProvider.getBoolean(new String[0], "spark.task-histogram.enabled", true);
                    this.jaxRsExceptionAsErrorsEnabled = configProvider.getBoolean(new String[0], "trace.jax-rs.exception-as-error.enabled", true);
                    this.traceFlushIntervalSeconds = configProvider.getFloat("trace.flush.interval", 1.0f);
                    this.telemetryDebugRequestsEnabled = configProvider.getBoolean(new String[0], "telemetry.debug.requests.enabled", false);
                    configProvider.getBoolean(new String[0], "profiling.timeline.events.enabled", false);
                }
            } catch (URISyntaxException e2) {
                e = e2;
                str2 = null;
            }
        } else {
            i = -1;
            str2 = null;
        }
        if (str2 != null) {
            str2 = configProvider.getString("agent.host");
            z = true;
        } else {
            z = false;
        }
        if (i < 0) {
            i = configProvider.getInteger(-1, "trace.agent.port", "agent.port");
            z = true;
        }
        if (str2 != null) {
            this.agentHost = "localhost";
        } else {
            this.agentHost = str2;
        }
        if (i >= 0) {
            this.agentPort = 8126;
        } else {
            this.agentPort = i;
        }
        if (z) {
            this.agentUrl = string6;
        } else {
            this.agentUrl = "http://" + this.agentHost + ":" + this.agentPort;
        }
        this.agentConfiguredUsingDefault = str2 != null && i < 0 && configProvider.getString("trace.pipe.name") == null;
        int i52 = 10;
        this.agentTimeout = configProvider.getInteger(10, "trace.agent.timeout", new String[0]);
        this.noProxyHosts = new HashSet(ConfigConverter.parseList(configProvider.getString("proxy.no_proxy"), " "));
        this.prioritySamplingEnabled = configProvider.getBoolean(new String[0], "priority.sampling", true);
        BitSet bitSet2 = ConfigDefaults.DEFAULT_HTTP_SERVER_ERROR_STATUSES;
        this.prioritySamplingForce = configProvider.getString("priority.sampling.force", null, new String[0]);
        this.traceResolverEnabled = configProvider.getBoolean(new String[0], "trace.resolver.enabled", true);
        this.serviceMapping = configProvider.getMergedMap("service.mapping");
        HashMap hashMap3 = new HashMap(configProvider.getMergedMap("trace.global.tags"));
        hashMap3.putAll(configProvider.getMergedMap("tags"));
        String[] strArr2 = {"env", "version"};
        HashMap hashMap22 = new HashMap(hashMap3);
        for (i2 = 0; i2 < 2; i2++) {
            String str3 = strArr2[i2];
            String string8 = this.configProvider.getString(str3);
            if (string8 != null) {
                hashMap22.put(str3, string8);
            }
        }
        this.tags = Collections.unmodifiableMap(hashMap22);
        this.spanTags = configProvider.getMergedMap("trace.span.tags");
        configProvider.getString("primary.tag");
        if (this.configProvider.isEnabled(Collections.singletonList("trace.header.tags"), "", ".legacy.parsing.enabled", false)) {
            this.requestHeaderTags = configProvider.getMergedMapWithOptionalMappings("http.request.headers.", "trace.header.tags", "trace.request_header.tags");
            this.responseHeaderTags = configProvider.getMergedMapWithOptionalMappings("http.response.headers.", "trace.header.tags", "trace.response_header.tags");
        } else {
            this.requestHeaderTags = configProvider.getMergedMap("trace.header.tags");
            this.responseHeaderTags = Collections.EMPTY_MAP;
            String string9 = configProvider.getString("trace.request_header.tags");
            if (string9 != null && !string9.isEmpty()) {
                "dd.".concat("trace.request_header.tags");
                "dd.".concat("trace.header.tags");
            }
            String string10 = configProvider.getString("trace.response_header.tags");
            if (string10 != null && !string10.isEmpty()) {
                "dd.".concat("trace.response_header.tags");
                "dd.".concat("trace.header.tags");
            }
        }
        this.requestHeaderTagsCommaAllowed = configProvider.getBoolean(new String[0], "trace.request_header.tags.comma.allowed", true);
        this.baggageMapping = configProvider.getMergedMap("trace.header.baggage");
        Matcher matcher2 = Pattern.compile("^v?(0|[1-9]\\d*)$").matcher(this.configProvider.getString("trace.span.attribute.schema", "v0", new String[0]));
        int parseInt = matcher2.matches() ? Integer.parseInt(matcher2.group(1)) : -1;
        this.spanAttributeSchemaVersion = (parseInt >= 0 || parseInt > 1) ? 0 : parseInt;
        this.peerServiceDefaultsEnabled = configProvider.getBoolean(new String[0], "trace.peer.service.defaults.enabled", false);
        this.peerServiceComponentOverrides = configProvider.getMergedMap("trace.peer.service.component.overrides");
        this.removeIntegrationServiceNamesEnabled = configProvider.getBoolean(new String[0], "trace.remove.integration-service-names.enabled", false);
        configProvider.getMergedMap("trace.peer.service.mapping");
        this.httpServerPathResourceNameMapping = configProvider.getOrderedMap("trace.http.server.path-resource-name-mapping");
        this.httpClientPathResourceNameMapping = configProvider.getOrderedMap("trace.http.client.path-resource-name-mapping");
        this.httpResourceRemoveTrailingSlash = configProvider.getBoolean(new String[0], "trace.http.resource.remove-trailing-slash", false);
        this.httpServerErrorStatuses = configProvider.getIntegerRange("http.server.error.statuses", ConfigDefaults.DEFAULT_HTTP_SERVER_ERROR_STATUSES);
        this.httpClientErrorStatuses = configProvider.getIntegerRange("http.client.error.statuses", ConfigDefaults.DEFAULT_HTTP_CLIENT_ERROR_STATUSES);
        this.httpServerTagQueryString = configProvider.getBoolean(new String[0], "http.server.tag.query-string", true);
        this.httpServerRawQueryString = configProvider.getBoolean(new String[0], "http.server.raw.query-string", true);
        this.httpServerRawResource = configProvider.getBoolean(new String[0], "http.server.raw.resource", false);
        this.httpServerDecodedResourcePreserveSpaces = configProvider.getBoolean(new String[0], "http.server.decoded.resource.preserve-spaces", true);
        this.httpServerRouteBasedNaming = configProvider.getBoolean(new String[0], "http.server.route-based-naming", true);
        this.httpClientTagQueryString = configProvider.getBoolean(new String[0], "http.client.tag.query-string", false);
        configProvider.getBoolean(new String[0], "http.client.tag.headers", true);
        this.httpClientSplitByDomain = configProvider.getBoolean(new String[0], "trace.http.client.split-by-domain", false);
        this.dbClientSplitByInstance = configProvider.getBoolean(new String[0], "trace.db.client.split-by-instance", false);
        this.dbClientSplitByInstanceTypeSuffix = configProvider.getBoolean(new String[0], "trace.db.client.split-by-instance.type.suffix", false);
        this.dbClientSplitByHost = configProvider.getBoolean(new String[0], "trace.db.client.split-by-host", false);
        this.DBMPropagationMode = configProvider.getString("dbm.propagation.mode", "disabled", new String[0]);
        this.splitByTags = new HashSet(configProvider.getList("trace.split-by-tags"));
        configProvider.getBoolean(new String[0], "spring-data.repository.interface.resource-name", true);
        this.scopeDepthLimit = configProvider.getInteger(100, "trace.scope.depth.limit", new String[0]);
        this.scopeStrictMode = configProvider.getBoolean(new String[0], "trace.scope.strict.mode", false);
        this.scopeInheritAsyncPropagation = configProvider.getBoolean(new String[0], "trace.scope.inherit.async.propagation", true);
        this.scopeIterationKeepAlive = configProvider.getInteger(30, "trace.scope.iteration.keep.alive", new String[0]);
        this.partialFlushMinSpans = configProvider.getBoolean(new String[0], "trace.partial.flush.enabled", true) ? 0 : configProvider.getInteger(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, "trace.partial.flush.min.spans", new String[0]);
        this.traceStrictWritesEnabled = configProvider.getBoolean(new String[0], "trace.strict.writes.enabled", false);
        this.logExtractHeaderNames = configProvider.getBoolean(new String[0], "propagation.extract.log_header_names.enabled", false);
        this.tracePropagationStyleB3PaddingEnabled = this.configProvider.isEnabled(Collections.singletonList("trace.propagation.style"), "", ".b3.padding.enabled", true);
        parseStringIntoSetOfNonEmptyStrings = parseStringIntoSetOfNonEmptyStrings(this.configProvider.getString("trace.propagation.style", "", new String[0]), false);
        if (parseStringIntoSetOfNonEmptyStrings.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = parseStringIntoSetOfNonEmptyStrings.iterator();
            while (it.hasNext()) {
                try {
                    linkedHashSet.add(TracePropagationStyle.valueOfDisplayName((String) it.next()));
                } catch (IllegalArgumentException unused) {
                    "dd.".concat("trace.propagation.style");
                }
            }
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        } else {
            unmodifiableSet = Collections.EMPTY_SET;
        }
        parseStringIntoSetOfNonEmptyStrings2 = parseStringIntoSetOfNonEmptyStrings(this.configProvider.getString("trace.propagation.style.extract", "", new String[0]), false);
        if (parseStringIntoSetOfNonEmptyStrings2.isEmpty()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = parseStringIntoSetOfNonEmptyStrings2.iterator();
            while (it2.hasNext()) {
                int i6 = i52;
                try {
                    linkedHashSet2.add(TracePropagationStyle.valueOfDisplayName((String) it2.next()));
                } catch (IllegalArgumentException unused2) {
                    "dd.".concat("trace.propagation.style.extract");
                }
                i52 = i6;
            }
            i3 = i52;
            unmodifiableSet2 = Collections.unmodifiableSet(linkedHashSet2);
        } else {
            unmodifiableSet2 = Collections.EMPTY_SET;
            i3 = 10;
        }
        parseStringIntoSetOfNonEmptyStrings3 = parseStringIntoSetOfNonEmptyStrings(this.configProvider.getString("trace.propagation.style.inject", "", new String[0]), false);
        if (parseStringIntoSetOfNonEmptyStrings3.isEmpty()) {
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            Iterator it3 = parseStringIntoSetOfNonEmptyStrings3.iterator();
            while (it3.hasNext()) {
                try {
                    linkedHashSet3.add(TracePropagationStyle.valueOfDisplayName((String) it3.next()));
                } catch (IllegalArgumentException unused3) {
                    "dd.".concat("trace.propagation.style.inject");
                }
            }
            unmodifiableSet3 = Collections.unmodifiableSet(linkedHashSet3);
        } else {
            unmodifiableSet3 = Collections.EMPTY_SET;
        }
        if (!unmodifiableSet2.isEmpty()) {
            unmodifiableSet2 = unmodifiableSet;
        } else if (!unmodifiableSet.isEmpty()) {
            "dd.".concat("trace.propagation.style");
            "dd.".concat("trace.propagation.style.extract");
        }
        if (!unmodifiableSet3.isEmpty()) {
            if (!unmodifiableSet.isEmpty()) {
                "dd.".concat("trace.propagation.style");
                "dd.".concat("trace.propagation.style.inject");
            }
            unmodifiableSet = unmodifiableSet3;
        }
        this.tracePropagationStylesToExtract = unmodifiableSet2.isEmpty() ? ConfigDefaults.DEFAULT_TRACE_PROPAGATION_STYLE : unmodifiableSet2;
        this.tracePropagationStylesToInject = unmodifiableSet.isEmpty() ? ConfigDefaults.DEFAULT_TRACE_PROPAGATION_STYLE : unmodifiableSet;
        this.tracePropagationExtractFirst = configProvider.getBoolean(new String[0], "trace.propagation.extract.first", false);
        this.clockSyncPeriod = configProvider.getInteger(30, "trace.clock.sync.period", new String[0]);
        this.logsInjectionEnabled = configProvider.getBoolean(new String[0], "logs.injection", true);
        configProvider.getString("dogstatsd.pipe.name");
        configProvider.getInteger(15, "dogstatsd.start-delay", new String[0]);
        boolean z62 = configProvider.getBoolean(new String[0], "runtime.metrics.enabled", true);
        this.runtimeMetricsEnabled = z62;
        this.healthMetricsEnabled = !z62 && configProvider.getBoolean(new String[0], "trace.health.metrics.enabled", true);
        this.healthMetricsStatsdHost = configProvider.getString("trace.health.metrics.statsd.host");
        this.healthMetricsStatsdPort = (Integer) configProvider.get("trace.health.metrics.statsd.port", null, Integer.class, new String[0]);
        this.perfMetricsEnabled = !z62 && configProvider.getBoolean(new String[0], "trace.perf.metrics.enabled", false);
        this.tracerMetricsEnabled = configProvider.getBoolean(new String[0], "trace.tracer.metrics.enabled", false);
        this.tracerMetricsBufferingEnabled = configProvider.getBoolean(new String[0], "trace.tracer.metrics.buffering.enabled", false);
        this.tracerMetricsMaxAggregates = configProvider.getInteger(2048, "trace.tracer.metrics.max.aggregates", new String[0]);
        this.tracerMetricsMaxPending = configProvider.getInteger(2048, "trace.tracer.metrics.max.pending", new String[0]);
        this.reportHostName = configProvider.getBoolean(new String[0], "trace.report-hostname", false);
        this.traceAgentV05Enabled = configProvider.getBoolean(new String[0], "trace.agent.v0.5.enabled", false);
        this.traceAnalyticsEnabled = configProvider.getBoolean(new String[0], "trace.analytics.enabled", false);
        String string72 = configProvider.getString("trace.client-ip-header");
        this.traceClientIpHeader = string72 != null ? string72.toLowerCase(Locale.ROOT) : string72;
        configProvider.getBoolean(new String[0], "trace.client-ip.resolver.enabled", true);
        configProvider.getBoolean(new String[0], "trace.git.metadata.enabled", true);
        this.traceSamplingServiceRules = configProvider.getMergedMap("trace.sampling.service.rules");
        this.traceSamplingOperationRules = configProvider.getMergedMap("trace.sampling.operation.rules");
        this.traceSamplingRules = configProvider.getString("trace.sampling.rules");
        this.traceSampleRate = (Double) configProvider.get("trace.sample.rate", null, Double.class, new String[0]);
        this.traceRateLimit = configProvider.getInteger(100, "trace.rate.limit", new String[0]);
        this.spanSamplingRules = configProvider.getString("span.sampling.rules");
        this.spanSamplingRulesFile = configProvider.getString("span.sampling.rules.file");
        this.profilingEnabled = configProvider.getBoolean(new String[0], "profiling.enabled", instrumenterConfig.profilingEnabled);
        this.profilingAgentless = configProvider.getBoolean(new String[0], "profiling.agentless", false);
        if (!Platform.isJavaVersion(18) && !Platform.isJavaVersion(16) && !Platform.isJavaVersion(15) && !Platform.isJavaVersion(14) && !Platform.isJavaVersion(13) && !Platform.isJavaVersion(12) && !Platform.isJavaVersion(i3) && !Platform.isJavaVersion(9)) {
            if (!System.getProperty("java.vm.name").contains("J9") && Platform.isJavaVersion(8)) {
                property = System.getProperty("os.arch");
                if (!"aarch64".equalsIgnoreCase(property)) {
                }
                z3 = false;
                configProvider.getBoolean(new String[0], "profiling.ddprof.enabled", z3);
            }
            if (!Platform.RUNTIME.vendorVersion.toLowerCase(Locale.US).contains("graalvm")) {
                z3 = System.getProperty("java.vm.name").contains("J9") || !Platform.isJavaVersion(18) || Platform.isJavaVersionAtLeast(17, 5) || (Platform.isJavaVersion(11) && Platform.isJavaVersionAtLeast(11, 17)) || (Platform.isJavaVersion(8) && Platform.isJavaVersionAtLeast(8, 352));
                if (z3 && System.getProperty("java.vm.name").contains("J9")) {
                    z3 &= ((Platform.isJavaVersion(11) && Platform.isJavaVersionAtLeast(11, 18)) || (Platform.isJavaVersion(17) && Platform.isJavaVersionAtLeast(17, 6))) ? false : true;
                }
                configProvider.getBoolean(new String[0], "profiling.ddprof.enabled", z3);
            }
            z3 = false;
            configProvider.getBoolean(new String[0], "profiling.ddprof.enabled", z3);
        }
        this.profilingUrl = configProvider.getString("profiling.url");
        this.profilingTags = configProvider.getMergedMap("profiling.tags");
        this.profilingStartDelay = configProvider.getInteger(i3, "profiling.start-delay", new String[0]);
        this.profilingStartForceFirst = configProvider.getBoolean(new String[0], "profiling.start-force-first", false);
        this.profilingUploadPeriod = configProvider.getInteger(60, "profiling.upload.period", new String[0]);
        this.profilingTemplateOverrideFile = configProvider.getString("profiling.jfr-template-override-file");
        this.profilingUploadTimeout = configProvider.getInteger(30, "profiling.upload.timeout", new String[0]);
        this.profilingUploadCompression = configProvider.getString("profiling.upload.compression", "on", new String[0]);
        this.profilingProxyHost = configProvider.getString("profiling.proxy.host");
        this.profilingProxyPort = configProvider.getInteger(8080, "profiling.proxy.port", new String[0]);
        this.profilingProxyUsername = configProvider.getString("profiling.proxy.username");
        this.profilingProxyPassword = configProvider.getString("profiling.proxy.password");
        this.profilingExceptionSampleLimit = configProvider.getInteger(10000, "profiling.exception.sample.limit", new String[0]);
        configProvider.getInteger(2000, "profiling.direct.allocation.sample.limit", new String[0]);
        this.profilingExceptionHistogramTopItems = configProvider.getInteger(50, "profiling.exception.histogram.top-items", new String[0]);
        this.profilingExceptionHistogramMaxCollectionSize = configProvider.getInteger(10000, "profiling.exception.histogram.max-collection-size", new String[0]);
        this.profilingExcludeAgentThreads = configProvider.getBoolean(new String[0], "profiling.exclude.agent-threads", true);
        configProvider.getBoolean(new String[0], "profiling.exception.record.message", true);
        configProvider.getBoolean(new String[0], "profiling.upload.summary-on-413", false);
        this.crashTrackingAgentless = configProvider.getBoolean(new String[0], "crashtracking.agentless", false);
        this.crashTrackingTags = configProvider.getMergedMap("crashtracking.tags");
        f = configProvider.getFloat("telemetry.heartbeat.interval", 60.0f);
        if (f >= 0.1d) {
            int i7 = (f > 3600.0f ? 1 : (f == 3600.0f ? 0 : -1));
        }
        ((Long) configProvider.get("telemetry.extended.heartbeat.interval", 86400L, Long.class, new String[0])).longValue();
        f2 = configProvider.getFloat("telemetry.metrics.interval", 10.0f);
        if (f2 >= 0.1d) {
            int i8 = (f2 > 3600.0f ? 1 : (f2 == 3600.0f ? 0 : -1));
        }
        this.telemetryMetricsEnabled = configProvider.getBoolean(new String[0], "telemetry.metrics.enabled", true);
        configProvider.getBoolean(new String[0], "telemetry.dependency-collection.enabled", true);
        configProvider.getBoolean(new String[0], "telemetry.log-collection.enabled", false);
        this.clientIpEnabled = configProvider.getBoolean(new String[0], "trace.client-ip.enabled", false);
        this.remoteConfigEnabled = configProvider.getBoolean(new String[0], "remote_config.enabled", true);
        this.remoteConfigIntegrityCheckEnabled = configProvider.getBoolean(new String[0], "remote_config.integrity_check.enabled", false);
        this.remoteConfigUrl = configProvider.getString("remote_config.url");
        this.remoteConfigPollIntervalSeconds = configProvider.getFloat("remote_config.poll_interval.seconds", 5.0f);
        this.remoteConfigMaxPayloadSize = configProvider.getInteger(5120, "remote_config.max.payload.size", new String[0]) * 1024;
        configProvider.getString("rc.targets.key.id", "5c4ece41241a1bb513f6e3e5df74ab7d5183dfffbd71bfd43127920d880569fd", new String[0]);
        configProvider.getString("rc.targets.key", "e3f1f98c9da02a93bb547f448b472d727e14b22455235796fe49863856252508", new String[0]);
        this.awsPropagationEnabled = isPropagationEnabled("aws", "aws-sdk");
        this.sqsPropagationEnabled = isPropagationEnabled("sqs");
        this.kafkaClientPropagationEnabled = isPropagationEnabled("kafka", "kafka.client");
        this.kafkaClientPropagationDisabledTopics = new HashSet(configProvider.getList("kafka.client.propagation.disabled.topics"));
        this.kafkaClientBase64DecodingEnabled = configProvider.getBoolean(new String[0], "kafka.client.base64.decoding.enabled", false);
        this.jmsPropagationEnabled = isPropagationEnabled("jms");
        this.jmsPropagationDisabledTopics = new HashSet(configProvider.getList("jms.propagation.disabled.topics"));
        this.jmsPropagationDisabledQueues = new HashSet(configProvider.getList("jms.propagation.disabled.queues"));
        configProvider.getInteger(3600, "jms.unacknowledged.max.age", new String[0]);
        this.rabbitPropagationEnabled = isPropagationEnabled("rabbit", "rabbitmq");
        this.rabbitPropagationDisabledQueues = new HashSet(configProvider.getList("rabbit.propagation.disabled.queues"));
        this.rabbitPropagationDisabledExchanges = new HashSet(configProvider.getList("rabbit.propagation.disabled.exchanges"));
        configProvider.getBoolean(new String[0], "rabbit.include.routingkey.in.resource", true);
        this.messageBrokerSplitByDestination = configProvider.getBoolean(new String[0], "message.broker.split-by-destination", false);
        this.grpcIgnoredInboundMethods = new HashSet(configProvider.getList("trace.grpc.ignored.inbound.methods"));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(configProvider.getList("trace.grpc.ignored.outbound.methods"));
        if (InstrumenterConfig.INSTANCE.configProvider.isEnabled(Collections.singleton("google-pubsub"), "integration.", ".enabled", true)) {
            List asList = Arrays.asList("google.pubsub.v1.Subscriber/ModifyAckDeadline", "google.pubsub.v1.Subscriber/Acknowledge", "google.pubsub.v1.Subscriber/Pull", "google.pubsub.v1.Subscriber/StreamingPull", "google.pubsub.v1.Publisher/Publish");
            if (configProvider.getString("trace.google-pubsub.ignored.grpc.methods") != null) {
                asList = ConfigConverter.parseList(configProvider.getString("trace.google-pubsub.ignored.grpc.methods"), ",");
            } else if (asList != null) {
                ConfigCollector.INSTANCE.put("trace.google-pubsub.ignored.grpc.methods", 4, String.join(",", asList));
            }
            arrayList2.addAll(asList);
        }
        this.grpcIgnoredOutboundMethods = new HashSet(arrayList2);
        configProvider.getBoolean(new String[0], "trace.grpc.server.trim-package-resource", false);
        this.grpcServerErrorStatuses = configProvider.getIntegerRange("grpc.server.error.statuses", ConfigDefaults.DEFAULT_GRPC_SERVER_ERROR_STATUSES);
        this.grpcClientErrorStatuses = configProvider.getIntegerRange("grpc.client.error.statuses", ConfigDefaults.DEFAULT_GRPC_CLIENT_ERROR_STATUSES);
        this.hystrixTagsEnabled = configProvider.getBoolean(new String[0], "hystrix.tags.enabled", false);
        this.hystrixMeasuredEnabled = configProvider.getBoolean(new String[0], "hystrix.measured.enabled", false);
        this.igniteCacheIncludeKeys = configProvider.getBoolean(new String[0], "ignite.cache.include_keys", false);
        configProvider.getString("trace.obfuscation.query.string.regexp", null, "obfuscation.query.string.regexp");
        configProvider.getBoolean(new String[0], "trace.play.report-http-status", false);
        this.servletPrincipalEnabled = configProvider.getBoolean(new String[0], "trace.servlet.principal.enabled", false);
        this.xDatadogTagsMaxLength = configProvider.getInteger(512, "trace.x-datadog-tags.max.length", new String[0]);
        this.servletAsyncTimeoutError = configProvider.getBoolean(new String[0], "trace.servlet.async-timeout.error", true);
        boolean z72 = configProvider.getBoolean(new String[0], "trace.debug", false);
        this.debugEnabled = z72;
        this.triageEnabled = configProvider.getBoolean(new String[0], "trace.triage", z72);
        this.startupLogsEnabled = configProvider.getBoolean(new String[0], "trace.startup.logs", true);
        this.dataStreamsEnabled = configProvider.getBoolean(new String[0], "data.streams.enabled", false);
        configProvider.getFloat("data.streams.bucket_duration.seconds", 10.0f);
        this.azureAppServices = configProvider.getBoolean(new String[0], "azure.app.services", false);
        configProvider.getString("trace.agent.path");
        string2 = configProvider.getString("trace.agent.args");
        if (string2 != null) {
            this.traceAgentArgs = Collections.EMPTY_LIST;
        } else {
            this.traceAgentArgs = Collections.unmodifiableList(new ArrayList(parseStringIntoSetOfNonEmptyStrings(string2, true)));
        }
        configProvider.getString("dogstatsd.path");
        string3 = configProvider.getString("dogstatsd.args");
        if (string3 != null) {
            this.dogStatsDArgs = Collections.EMPTY_LIST;
        } else {
            this.dogStatsDArgs = Collections.unmodifiableList(new ArrayList(parseStringIntoSetOfNonEmptyStrings(string3, true)));
        }
        z2 = configProvider.getBoolean(new String[0], "trace.experimental.long-running.enabled", false);
        long j2 = 300;
        longValue = ((Long) configProvider.get("trace.experimental.long-running.flush.interval", 300L, Long.class, new String[0])).longValue();
        if (z2 || (longValue >= 20 && longValue <= 450)) {
            j2 = longValue;
        }
        this.longRunningTraceEnabled = z2;
        this.longRunningTraceFlushInterval = j2;
        this.sparkTaskHistogramEnabled = configProvider.getBoolean(new String[0], "spark.task-histogram.enabled", true);
        this.jaxRsExceptionAsErrorsEnabled = configProvider.getBoolean(new String[0], "trace.jax-rs.exception-as-error.enabled", true);
        this.traceFlushIntervalSeconds = configProvider.getFloat("trace.flush.interval", 1.0f);
        this.telemetryDebugRequestsEnabled = configProvider.getBoolean(new String[0], "telemetry.debug.requests.enabled", false);
        configProvider.getBoolean(new String[0], "profiling.timeline.events.enabled", false);
    }

    public static String getEnv(String str) {
        String str2 = System.getenv(str);
        if (str2 != null) {
            ConfigCollector.INSTANCE.put(str, 1, str2);
        }
        return str2;
    }

    public static Set parseStringIntoSetOfNonEmptyStrings(String str, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == ',' || (z && Character.isWhitespace(charAt))) {
                if ((i - i2) - 1 > 0) {
                    linkedHashSet.add(str.substring(i2, i));
                }
                i2 = i + 1;
            }
            i++;
        }
        if ((i - i2) - 1 > 0) {
            linkedHashSet.add(str.substring(i2));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public final boolean isPropagationEnabled(String... strArr) {
        return this.configProvider.isEnabled(Arrays.asList(strArr), "", ".propagation.enabled", true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config{instrumenterConfig=");
        sb.append(this.instrumenterConfig);
        sb.append(", runtimeId='");
        sb.append(this.runtimeIdEnabled ? RuntimeIdHolder.runtimeId : "");
        sb.append("', runtimeVersion='");
        sb.append(this.runtimeVersion);
        sb.append(", site='");
        sb.append(this.site);
        sb.append("', hostName='");
        sb.append(HostNameHolder.hostName);
        sb.append("', serviceName='");
        sb.append(this.serviceName);
        sb.append("', serviceNameSetByUser=");
        sb.append(this.serviceNameSetByUser);
        sb.append(", rootContextServiceName=");
        sb.append(this.rootContextServiceName);
        sb.append(", integrationSynapseLegacyOperationName=");
        sb.append(this.integrationSynapseLegacyOperationName);
        sb.append(", writerType='");
        sb.append(this.writerType);
        sb.append("', agentConfiguredUsingDefault=");
        sb.append(this.agentConfiguredUsingDefault);
        sb.append(", agentUrl='");
        sb.append(this.agentUrl);
        sb.append("', agentHost='");
        sb.append(this.agentHost);
        sb.append("', agentPort=");
        sb.append(this.agentPort);
        sb.append("', agentTimeout=");
        sb.append(this.agentTimeout);
        sb.append(", noProxyHosts=");
        sb.append(this.noProxyHosts);
        sb.append(", prioritySamplingEnabled=");
        sb.append(this.prioritySamplingEnabled);
        sb.append(", prioritySamplingForce='");
        sb.append(this.prioritySamplingForce);
        sb.append("', traceResolverEnabled=");
        sb.append(this.traceResolverEnabled);
        sb.append(", serviceMapping=");
        sb.append(this.serviceMapping);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", spanTags=");
        sb.append(this.spanTags);
        sb.append(", requestHeaderTags=");
        sb.append(this.requestHeaderTags);
        sb.append(", responseHeaderTags=");
        sb.append(this.responseHeaderTags);
        sb.append(", baggageMapping=");
        sb.append(this.baggageMapping);
        sb.append(", httpServerErrorStatuses=");
        sb.append(this.httpServerErrorStatuses);
        sb.append(", httpClientErrorStatuses=");
        sb.append(this.httpClientErrorStatuses);
        sb.append(", httpServerTagQueryString=");
        sb.append(this.httpServerTagQueryString);
        sb.append(", httpServerRawQueryString=");
        sb.append(this.httpServerRawQueryString);
        sb.append(", httpServerRawResource=");
        sb.append(this.httpServerRawResource);
        sb.append(", httpServerRouteBasedNaming=");
        sb.append(this.httpServerRouteBasedNaming);
        sb.append(", httpServerPathResourceNameMapping=");
        sb.append(this.httpServerPathResourceNameMapping);
        sb.append(", httpClientPathResourceNameMapping=");
        sb.append(this.httpClientPathResourceNameMapping);
        sb.append(", httpClientTagQueryString=");
        sb.append(this.httpClientTagQueryString);
        sb.append(", httpClientSplitByDomain=");
        sb.append(this.httpClientSplitByDomain);
        sb.append(", httpResourceRemoveTrailingSlash");
        sb.append(this.httpResourceRemoveTrailingSlash);
        sb.append(", dbClientSplitByInstance=");
        sb.append(this.dbClientSplitByInstance);
        sb.append(", dbClientSplitByInstanceTypeSuffix=");
        sb.append(this.dbClientSplitByInstanceTypeSuffix);
        sb.append(", dbClientSplitByHost=");
        sb.append(this.dbClientSplitByHost);
        sb.append(", DBMPropagationMode=");
        sb.append(this.DBMPropagationMode);
        sb.append(", splitByTags=");
        sb.append(this.splitByTags);
        sb.append(", scopeDepthLimit=");
        sb.append(this.scopeDepthLimit);
        sb.append(", scopeStrictMode=");
        sb.append(this.scopeStrictMode);
        sb.append(", scopeInheritAsyncPropagation=");
        sb.append(this.scopeInheritAsyncPropagation);
        sb.append(", scopeIterationKeepAlive=");
        sb.append(this.scopeIterationKeepAlive);
        sb.append(", partialFlushMinSpans=");
        sb.append(this.partialFlushMinSpans);
        sb.append(", traceStrictWritesEnabled=");
        sb.append(this.traceStrictWritesEnabled);
        sb.append(", tracePropagationStylesToExtract=");
        sb.append(this.tracePropagationStylesToExtract);
        sb.append(", tracePropagationStylesToInject=");
        sb.append(this.tracePropagationStylesToInject);
        sb.append(", tracePropagationExtractFirst=");
        sb.append(this.tracePropagationExtractFirst);
        sb.append(", clockSyncPeriod=");
        sb.append(this.clockSyncPeriod);
        sb.append(", healthMetricsEnabled=");
        sb.append(this.healthMetricsEnabled);
        sb.append(", healthMetricsStatsdHost='");
        sb.append(this.healthMetricsStatsdHost);
        sb.append("', healthMetricsStatsdPort=");
        sb.append(this.healthMetricsStatsdPort);
        sb.append(", perfMetricsEnabled=");
        sb.append(this.perfMetricsEnabled);
        sb.append(", tracerMetricsEnabled=");
        sb.append(this.tracerMetricsEnabled);
        sb.append(", tracerMetricsBufferingEnabled=");
        sb.append(this.tracerMetricsBufferingEnabled);
        sb.append(", tracerMetricsMaxAggregates=");
        sb.append(this.tracerMetricsMaxAggregates);
        sb.append(", tracerMetricsMaxPending=");
        sb.append(this.tracerMetricsMaxPending);
        sb.append(", reportHostName=");
        sb.append(this.reportHostName);
        sb.append(", traceAnalyticsEnabled=");
        sb.append(this.traceAnalyticsEnabled);
        sb.append(", traceSamplingServiceRules=");
        sb.append(this.traceSamplingServiceRules);
        sb.append(", traceSamplingOperationRules=");
        sb.append(this.traceSamplingOperationRules);
        sb.append(", traceSamplingJsonRules=");
        sb.append(this.traceSamplingRules);
        sb.append(", traceSampleRate=");
        sb.append(this.traceSampleRate);
        sb.append(", traceRateLimit=");
        sb.append(this.traceRateLimit);
        sb.append(", spanSamplingRules=");
        sb.append(this.spanSamplingRules);
        sb.append(", spanSamplingRulesFile=");
        sb.append(this.spanSamplingRulesFile);
        sb.append(", profilingAgentless=");
        sb.append(this.profilingAgentless);
        sb.append(", profilingUrl='");
        sb.append(this.profilingUrl);
        sb.append("', profilingTags=");
        sb.append(this.profilingTags);
        sb.append(", profilingStartDelay=");
        sb.append(this.profilingStartDelay);
        sb.append(", profilingStartForceFirst=");
        sb.append(this.profilingStartForceFirst);
        sb.append(", profilingUploadPeriod=");
        sb.append(this.profilingUploadPeriod);
        sb.append(", profilingTemplateOverrideFile='");
        sb.append(this.profilingTemplateOverrideFile);
        sb.append("', profilingUploadTimeout=");
        sb.append(this.profilingUploadTimeout);
        sb.append(", profilingUploadCompression='");
        sb.append(this.profilingUploadCompression);
        sb.append("', profilingProxyHost='");
        sb.append(this.profilingProxyHost);
        sb.append("', profilingProxyPort=");
        sb.append(this.profilingProxyPort);
        sb.append(", profilingProxyUsername='");
        sb.append(this.profilingProxyUsername);
        sb.append("', profilingProxyPassword=");
        sb.append(this.profilingProxyPassword == null ? "null" : "****");
        sb.append(", profilingExceptionSampleLimit=");
        sb.append(this.profilingExceptionSampleLimit);
        sb.append(", profilingExceptionHistogramTopItems=");
        sb.append(this.profilingExceptionHistogramTopItems);
        sb.append(", profilingExceptionHistogramMaxCollectionSize=");
        sb.append(this.profilingExceptionHistogramMaxCollectionSize);
        sb.append(", profilingExcludeAgentThreads=");
        sb.append(this.profilingExcludeAgentThreads);
        sb.append(", crashTrackingTags=");
        sb.append(this.crashTrackingTags);
        sb.append(", crashTrackingAgentless=");
        sb.append(this.crashTrackingAgentless);
        sb.append(", remoteConfigEnabled=");
        sb.append(this.remoteConfigEnabled);
        sb.append(", remoteConfigUrl=");
        sb.append(this.remoteConfigUrl);
        sb.append(", remoteConfigPollIntervalSeconds=");
        sb.append(this.remoteConfigPollIntervalSeconds);
        sb.append(", remoteConfigMaxPayloadSize=");
        sb.append(this.remoteConfigMaxPayloadSize);
        sb.append(", remoteConfigIntegrityCheckEnabled=");
        sb.append(this.remoteConfigIntegrityCheckEnabled);
        sb.append(", awsPropagationEnabled=");
        sb.append(this.awsPropagationEnabled);
        sb.append(", sqsPropagationEnabled=");
        sb.append(this.sqsPropagationEnabled);
        sb.append(", kafkaClientPropagationEnabled=");
        sb.append(this.kafkaClientPropagationEnabled);
        sb.append(", kafkaClientPropagationDisabledTopics=");
        sb.append(this.kafkaClientPropagationDisabledTopics);
        sb.append(", kafkaClientBase64DecodingEnabled=");
        sb.append(this.kafkaClientBase64DecodingEnabled);
        sb.append(", jmsPropagationEnabled=");
        sb.append(this.jmsPropagationEnabled);
        sb.append(", jmsPropagationDisabledTopics=");
        sb.append(this.jmsPropagationDisabledTopics);
        sb.append(", jmsPropagationDisabledQueues=");
        sb.append(this.jmsPropagationDisabledQueues);
        sb.append(", rabbitPropagationEnabled=");
        sb.append(this.rabbitPropagationEnabled);
        sb.append(", rabbitPropagationDisabledQueues=");
        sb.append(this.rabbitPropagationDisabledQueues);
        sb.append(", rabbitPropagationDisabledExchanges=");
        sb.append(this.rabbitPropagationDisabledExchanges);
        sb.append(", messageBrokerSplitByDestination=");
        sb.append(this.messageBrokerSplitByDestination);
        sb.append(", hystrixTagsEnabled=");
        sb.append(this.hystrixTagsEnabled);
        sb.append(", hystrixMeasuredEnabled=");
        sb.append(this.hystrixMeasuredEnabled);
        sb.append(", igniteCacheIncludeKeys=");
        sb.append(this.igniteCacheIncludeKeys);
        sb.append(", servletPrincipalEnabled=");
        sb.append(this.servletPrincipalEnabled);
        sb.append(", servletAsyncTimeoutError=");
        sb.append(this.servletAsyncTimeoutError);
        sb.append(", datadogTagsLimit=");
        sb.append(this.xDatadogTagsMaxLength);
        sb.append(", traceAgentV05Enabled=");
        sb.append(this.traceAgentV05Enabled);
        sb.append(", debugEnabled=");
        sb.append(this.debugEnabled);
        sb.append(", triageEnabled=");
        sb.append(this.triageEnabled);
        sb.append(", startLogsEnabled=");
        sb.append(this.startupLogsEnabled);
        sb.append(", configFile='");
        sb.append(this.configFileStatus);
        sb.append("', idGenerationStrategy=");
        sb.append(this.idGenerationStrategy);
        sb.append(", trace128bitTraceIdGenerationEnabled=");
        sb.append(this.trace128bitTraceIdGenerationEnabled);
        sb.append(", grpcIgnoredInboundMethods=");
        sb.append(this.grpcIgnoredInboundMethods);
        sb.append(", grpcIgnoredOutboundMethods=");
        sb.append(this.grpcIgnoredOutboundMethods);
        sb.append(", grpcServerErrorStatuses=");
        sb.append(this.grpcServerErrorStatuses);
        sb.append(", grpcClientErrorStatuses=");
        sb.append(this.grpcClientErrorStatuses);
        sb.append(", clientIpEnabled=");
        sb.append(this.clientIpEnabled);
        sb.append(", longRunningTraceEnabled=");
        sb.append(this.longRunningTraceEnabled);
        sb.append(", longRunningTraceFlushInterval=");
        sb.append(this.longRunningTraceFlushInterval);
        sb.append(", elasticsearchBodyEnabled=");
        sb.append(this.elasticsearchBodyEnabled);
        sb.append(", elasticsearchParamsEnabled=");
        sb.append(this.elasticsearchParamsEnabled);
        sb.append(", elasticsearchBodyAndParamsEnabled=");
        sb.append(this.elasticsearchBodyAndParamsEnabled);
        sb.append(", traceFlushInterval=");
        sb.append(this.traceFlushIntervalSeconds);
        sb.append(", injectBaggageAsTagsEnabled=");
        sb.append(this.injectBaggageAsTagsEnabled);
        sb.append(", logsInjectionEnabled=");
        sb.append(this.logsInjectionEnabled);
        sb.append(", sparkTaskHistogramEnabled=");
        sb.append(this.sparkTaskHistogramEnabled);
        sb.append(", jaxRsExceptionAsErrorsEnabled=");
        sb.append(this.jaxRsExceptionAsErrorsEnabled);
        sb.append(", peerServiceDefaultsEnabled=");
        sb.append(this.peerServiceDefaultsEnabled);
        sb.append(", peerServiceComponentOverrides=");
        sb.append(this.peerServiceComponentOverrides);
        sb.append(", removeIntegrationServiceNamesEnabled=");
        sb.append(this.removeIntegrationServiceNamesEnabled);
        sb.append(", spanAttributeSchemaVersion=");
        sb.append(this.spanAttributeSchemaVersion);
        sb.append(", telemetryDebugRequestsEnabled=");
        sb.append(this.telemetryDebugRequestsEnabled);
        sb.append(", telemetryMetricsEnabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.telemetryMetricsEnabled, '}');
    }
}
