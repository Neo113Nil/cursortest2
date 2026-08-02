package com.datadog.trace.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class ResolverCacheConfig {
    public static final /* synthetic */ ResolverCacheConfig[] $VALUES;
    public static final AnonymousClass2 MEMOS;

    /* JADX INFO: Fake field, exist only in values array */
    ResolverCacheConfig EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.datadog.trace.api.ResolverCacheConfig$2] */
    static {
        ResolverCacheConfig resolverCacheConfig = new ResolverCacheConfig() { // from class: com.datadog.trace.api.ResolverCacheConfig.1
        };
        ?? r1 = new ResolverCacheConfig() { // from class: com.datadog.trace.api.ResolverCacheConfig.2
        };
        MEMOS = r1;
        $VALUES = new ResolverCacheConfig[]{resolverCacheConfig, r1, new ResolverCacheConfig() { // from class: com.datadog.trace.api.ResolverCacheConfig.3
        }, new ResolverCacheConfig() { // from class: com.datadog.trace.api.ResolverCacheConfig.4
        }, new ResolverCacheConfig() { // from class: com.datadog.trace.api.ResolverCacheConfig.5
        }};
    }

    public static ResolverCacheConfig valueOf(String str) {
        return (ResolverCacheConfig) Enum.valueOf(ResolverCacheConfig.class, str);
    }

    public static ResolverCacheConfig[] values() {
        return (ResolverCacheConfig[]) $VALUES.clone();
    }
}
