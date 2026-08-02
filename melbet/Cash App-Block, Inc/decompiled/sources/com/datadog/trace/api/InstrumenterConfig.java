package com.datadog.trace.api;

import com.datadog.trace.api.ResolverCacheConfig;
import com.datadog.trace.bootstrap.config.provider.ConfigConverter;
import com.datadog.trace.bootstrap.config.provider.ConfigProvider;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes4.dex */
public final class InstrumenterConfig {
    public static final InstrumenterConfig INSTANCE = new InstrumenterConfig(ConfigConverter.INSTANCE);
    public final ConfigProvider configProvider;
    public final HashSet excludedClassLoaders;
    public final ArrayList excludedClasses;
    public final String excludedClassesFile;
    public final ArrayList excludedCodeSources;
    public final String httpURLConnectionClassName;
    public final boolean integrationsEnabled;
    public final boolean internalExitOnFailure;
    public final String jdbcConnectionClassName;
    public final String jdbcPreparedStatementClassName;
    public final boolean logs128bTraceIdEnabled;
    public final Map measureMethods;
    public final boolean profilingEnabled;
    public final ResolverCacheConfig resolverCacheConfig;
    public final String resolverCacheDir;
    public final boolean resolverNamesAreUnique;
    public final int resolverResetInterval;
    public final boolean resolverUseLoadClass;
    public final Boolean resolverUseUrlCaches;
    public final boolean runtimeContextFieldInjection;
    public final boolean serialVersionUIDFieldInjection;
    public final boolean telemetryEnabled;
    public final boolean traceAnnotationAsync;
    public final String traceAnnotations;
    public final boolean traceEnabled;
    public final ArrayList traceExecutors;
    public final boolean traceExecutorsAll;
    public final Map traceMethods;
    public final boolean traceOtelEnabled;

    public InstrumenterConfig(ConfigProvider configProvider) {
        Enum valueOf;
        this.configProvider = configProvider;
        this.integrationsEnabled = configProvider.getBoolean(new String[0], "integrations.enabled", true);
        this.traceEnabled = configProvider.getBoolean(new String[0], "trace.enabled", true);
        this.traceOtelEnabled = configProvider.getBoolean(new String[0], "trace.otel.enabled", false);
        this.logs128bTraceIdEnabled = configProvider.getBoolean(new String[0], "trace.128.bit.traceid.logging.enabled", false);
        this.profilingEnabled = configProvider.getBoolean(new String[0], "profiling.enabled", false);
        this.telemetryEnabled = configProvider.getBoolean(new String[0], "instrumentation.telemetry.enabled", true);
        this.traceExecutorsAll = configProvider.getBoolean(new String[0], "trace.executors.all", false);
        this.traceExecutors = new ArrayList(configProvider.getList("trace.executors"));
        new HashSet(configProvider.getList("trace.thread-pool-executors.exclude"));
        this.jdbcPreparedStatementClassName = configProvider.getString("trace.jdbc.prepared.statement.class.name", "", new String[0]);
        this.jdbcConnectionClassName = configProvider.getString("trace.jdbc.connection.class.name", "", new String[0]);
        this.httpURLConnectionClassName = configProvider.getString("trace.http.url.connection.class.name", "", new String[0]);
        configProvider.getBoolean(new String[0], "profiling.directallocation.enabled", false);
        this.excludedClasses = new ArrayList(configProvider.getList("trace.classes.exclude"));
        this.excludedClassesFile = configProvider.getString("trace.classes.exclude.file");
        this.excludedClassLoaders = new HashSet(configProvider.getList("trace.classloaders.exclude"));
        this.excludedCodeSources = new ArrayList(configProvider.getList("trace.codesources.exclude"));
        String string2 = configProvider.getString("resolver.cache.config");
        if (string2 != null) {
            try {
                valueOf = Enum.valueOf(ResolverCacheConfig.class, string2);
            } catch (Exception unused) {
            }
            this.resolverCacheConfig = (ResolverCacheConfig) valueOf;
            this.resolverCacheDir = configProvider.getString("resolver.cache.dir");
            this.resolverNamesAreUnique = configProvider.getBoolean(new String[0], "resolver.names.are.unique", false);
            this.resolverUseLoadClass = configProvider.getBoolean(new String[0], "resolver.use.loadclass", true);
            this.resolverUseUrlCaches = (Boolean) configProvider.get("resolver.use.url.caches", null, Boolean.class, new String[0]);
            this.resolverResetInterval = configProvider.getInteger(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, "resolver.reset.interval", new String[0]);
            this.runtimeContextFieldInjection = configProvider.getBoolean(new String[0], "trace.runtime.context.field.injection", true);
            this.serialVersionUIDFieldInjection = configProvider.getBoolean(new String[0], "trace.serialversionuid.field.injection", true);
            BitSet bitSet = ConfigDefaults.DEFAULT_HTTP_SERVER_ERROR_STATUSES;
            this.traceAnnotations = configProvider.getString("trace.annotations", null, new String[0]);
            this.traceAnnotationAsync = configProvider.getBoolean(new String[0], "trace.annotation.async", false);
            this.traceMethods = Functions.parse(configProvider.getString("trace.methods", null, new String[0]));
            this.measureMethods = Functions.parse(configProvider.getString("measure.methods", "", new String[0]));
            this.internalExitOnFailure = configProvider.getBoolean(new String[0], "trace.internal.exit.on.failure", false);
        }
        ConfigCollector configCollector = ConfigCollector.INSTANCE;
        ResolverCacheConfig.AnonymousClass2 anonymousClass2 = ResolverCacheConfig.MEMOS;
        configCollector.put("resolver.cache.config", 4, String.valueOf(anonymousClass2));
        valueOf = anonymousClass2;
        this.resolverCacheConfig = (ResolverCacheConfig) valueOf;
        this.resolverCacheDir = configProvider.getString("resolver.cache.dir");
        this.resolverNamesAreUnique = configProvider.getBoolean(new String[0], "resolver.names.are.unique", false);
        this.resolverUseLoadClass = configProvider.getBoolean(new String[0], "resolver.use.loadclass", true);
        this.resolverUseUrlCaches = (Boolean) configProvider.get("resolver.use.url.caches", null, Boolean.class, new String[0]);
        this.resolverResetInterval = configProvider.getInteger(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, "resolver.reset.interval", new String[0]);
        this.runtimeContextFieldInjection = configProvider.getBoolean(new String[0], "trace.runtime.context.field.injection", true);
        this.serialVersionUIDFieldInjection = configProvider.getBoolean(new String[0], "trace.serialversionuid.field.injection", true);
        BitSet bitSet2 = ConfigDefaults.DEFAULT_HTTP_SERVER_ERROR_STATUSES;
        this.traceAnnotations = configProvider.getString("trace.annotations", null, new String[0]);
        this.traceAnnotationAsync = configProvider.getBoolean(new String[0], "trace.annotation.async", false);
        this.traceMethods = Functions.parse(configProvider.getString("trace.methods", null, new String[0]));
        this.measureMethods = Functions.parse(configProvider.getString("measure.methods", "", new String[0]));
        this.internalExitOnFailure = configProvider.getBoolean(new String[0], "trace.internal.exit.on.failure", false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumenterConfig{integrationsEnabled=");
        sb.append(this.integrationsEnabled);
        sb.append(", traceEnabled=");
        sb.append(this.traceEnabled);
        sb.append(", traceOtelEnabled=");
        sb.append(this.traceOtelEnabled);
        sb.append(", logs128bTraceIdEnabled=");
        sb.append(this.logs128bTraceIdEnabled);
        sb.append(", profilingEnabled=");
        sb.append(this.profilingEnabled);
        sb.append(", telemetryEnabled=");
        sb.append(this.telemetryEnabled);
        sb.append(", traceExecutorsAll=");
        sb.append(this.traceExecutorsAll);
        sb.append(", traceExecutors=");
        sb.append(this.traceExecutors);
        sb.append(", jdbcPreparedStatementClassName='");
        sb.append(this.jdbcPreparedStatementClassName);
        sb.append("', jdbcConnectionClassName='");
        sb.append(this.jdbcConnectionClassName);
        sb.append("', httpURLConnectionClassName='");
        sb.append(this.httpURLConnectionClassName);
        sb.append("', excludedClasses=");
        sb.append(this.excludedClasses);
        sb.append(", excludedClassesFile=");
        sb.append(this.excludedClassesFile);
        sb.append(", excludedClassLoaders=");
        sb.append(this.excludedClassLoaders);
        sb.append(", excludedCodeSources=");
        sb.append(this.excludedCodeSources);
        sb.append(", resolverCacheConfig=");
        sb.append(this.resolverCacheConfig);
        sb.append(", resolverCacheDir=");
        sb.append(this.resolverCacheDir);
        sb.append(", resolverNamesAreUnique=");
        sb.append(this.resolverNamesAreUnique);
        sb.append(", resolverUseLoadClass=");
        sb.append(this.resolverUseLoadClass);
        sb.append(", resolverUseUrlCaches=");
        sb.append(this.resolverUseUrlCaches);
        sb.append(", resolverResetInterval=");
        sb.append(this.resolverResetInterval);
        sb.append(", runtimeContextFieldInjection=");
        sb.append(this.runtimeContextFieldInjection);
        sb.append(", serialVersionUIDFieldInjection=");
        sb.append(this.serialVersionUIDFieldInjection);
        sb.append(", traceAnnotations='");
        sb.append(this.traceAnnotations);
        sb.append("', traceAnnotationAsync=");
        sb.append(this.traceAnnotationAsync);
        sb.append(", traceMethods='");
        sb.append(this.traceMethods);
        sb.append("', measureMethods= '");
        sb.append(this.measureMethods);
        sb.append("', internalExitOnFailure=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.internalExitOnFailure, '}');
    }
}
