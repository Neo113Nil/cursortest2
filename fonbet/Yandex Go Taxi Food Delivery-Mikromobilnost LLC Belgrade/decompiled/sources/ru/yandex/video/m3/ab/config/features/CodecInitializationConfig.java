package ru.yandex.video.m3.ab.config.features;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.internal.features.CodecInitializationRemoteFlag;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/ab/config/features/CodecInitializationConfig;", "", "codecInitializationRemoteFlag", "Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;", "(Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;)V", "retriesCount", "", "getRetriesCount", "()I", "shouldTryInitCodecsWithRetries", "", "getShouldTryInitCodecsWithRetries", "()Z", "timeoutMs", "", "getTimeoutMs", "()J", "useIncrementalCodecInitTimeout", "getUseIncrementalCodecInitTimeout", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CodecInitializationConfig {
    public static final int $stable = 0;
    private final int retriesCount;
    private final boolean shouldTryInitCodecsWithRetries;
    private final long timeoutMs;
    private final boolean useIncrementalCodecInitTimeout;

    public CodecInitializationConfig(CodecInitializationRemoteFlag codecInitializationRemoteFlag) {
        this.shouldTryInitCodecsWithRetries = codecInitializationRemoteFlag.getShouldTryInitCodecsWithRetries();
        this.retriesCount = codecInitializationRemoteFlag.getRetriesCount();
        this.timeoutMs = codecInitializationRemoteFlag.getTimeoutMs();
        this.useIncrementalCodecInitTimeout = codecInitializationRemoteFlag.getUseIncrementalCodecInitTimeout();
    }

    public final int getRetriesCount() {
        return this.retriesCount;
    }

    public final boolean getShouldTryInitCodecsWithRetries() {
        return this.shouldTryInitCodecsWithRetries;
    }

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final boolean getUseIncrementalCodecInitTimeout() {
        return this.useIncrementalCodecInitTimeout;
    }
}
