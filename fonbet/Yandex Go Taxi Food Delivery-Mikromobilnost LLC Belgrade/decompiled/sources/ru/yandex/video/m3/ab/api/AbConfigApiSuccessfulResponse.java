package ru.yandex.video.m3.ab.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ab.config.internal.InternalAbConfig;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApiSuccessfulResponse;", "", "()V", "KeepConfig", "NewConfig", "Lru/yandex/video/m3/ab/api/AbConfigApiSuccessfulResponse$KeepConfig;", "Lru/yandex/video/m3/ab/api/AbConfigApiSuccessfulResponse$NewConfig;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AbConfigApiSuccessfulResponse {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApiSuccessfulResponse$KeepConfig;", "Lru/yandex/video/m3/ab/api/AbConfigApiSuccessfulResponse;", "updateTimestamp", "", "(J)V", "getUpdateTimestamp", "()J", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KeepConfig extends AbConfigApiSuccessfulResponse {
        public static final int $stable = 0;
        private final long updateTimestamp;

        public KeepConfig(long j) {
            super(null);
            this.updateTimestamp = j;
        }

        public final long getUpdateTimestamp() {
            return this.updateTimestamp;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApiSuccessfulResponse$NewConfig;", "Lru/yandex/video/m3/ab/api/AbConfigApiSuccessfulResponse;", "internalAbConfig", "Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "etag", "", "fetchTimestamp", "", "(Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;Ljava/lang/String;J)V", "getEtag", "()Ljava/lang/String;", "getFetchTimestamp", "()J", "getInternalAbConfig", "()Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NewConfig extends AbConfigApiSuccessfulResponse {
        public static final int $stable = 8;
        private final String etag;
        private final long fetchTimestamp;
        private final InternalAbConfig internalAbConfig;

        public NewConfig(InternalAbConfig internalAbConfig, String str, long j) {
            super(null);
            this.internalAbConfig = internalAbConfig;
            this.etag = str;
            this.fetchTimestamp = j;
        }

        public final String getEtag() {
            return this.etag;
        }

        public final long getFetchTimestamp() {
            return this.fetchTimestamp;
        }

        public final InternalAbConfig getInternalAbConfig() {
            return this.internalAbConfig;
        }
    }

    public /* synthetic */ AbConfigApiSuccessfulResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbConfigApiSuccessfulResponse() {
    }
}
