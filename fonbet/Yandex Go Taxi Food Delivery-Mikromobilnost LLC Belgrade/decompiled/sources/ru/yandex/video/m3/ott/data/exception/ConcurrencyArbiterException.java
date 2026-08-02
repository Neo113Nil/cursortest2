package ru.yandex.video.m3.ott.data.exception;

import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.dto.Ott;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "TooManyStreams", "TooManyStreamsSoft", "Unknown", "Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException$TooManyStreams;", "Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException$TooManyStreamsSoft;", "Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException$Unknown;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ConcurrencyArbiterException extends RuntimeException {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException$TooManyStreams;", "Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException;", "arbiterConfig", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "(Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;)V", "getArbiterConfig", "()Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TooManyStreams extends ConcurrencyArbiterException {
        public static final int $stable = 8;
        private final Ott.ConcurrencyArbiterConfig arbiterConfig;

        public TooManyStreams(Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig) {
            super(null);
            this.arbiterConfig = concurrencyArbiterConfig;
        }

        public static /* synthetic */ TooManyStreams copy$default(TooManyStreams tooManyStreams, Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                concurrencyArbiterConfig = tooManyStreams.arbiterConfig;
            }
            return tooManyStreams.copy(concurrencyArbiterConfig);
        }

        /* renamed from: component1, reason: from getter */
        public final Ott.ConcurrencyArbiterConfig getArbiterConfig() {
            return this.arbiterConfig;
        }

        public final TooManyStreams copy(Ott.ConcurrencyArbiterConfig arbiterConfig) {
            return new TooManyStreams(arbiterConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TooManyStreams) && jl40.l(this.arbiterConfig, ((TooManyStreams) other).arbiterConfig);
        }

        public final Ott.ConcurrencyArbiterConfig getArbiterConfig() {
            return this.arbiterConfig;
        }

        public int hashCode() {
            return this.arbiterConfig.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "TooManyStreams(arbiterConfig=" + this.arbiterConfig + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException$TooManyStreamsSoft;", "Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException;", "arbiterConfig", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "(Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;)V", "getArbiterConfig", "()Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TooManyStreamsSoft extends ConcurrencyArbiterException {
        public static final int $stable = 8;
        private final Ott.ConcurrencyArbiterConfig arbiterConfig;

        public TooManyStreamsSoft(Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig) {
            super(null);
            this.arbiterConfig = concurrencyArbiterConfig;
        }

        public static /* synthetic */ TooManyStreamsSoft copy$default(TooManyStreamsSoft tooManyStreamsSoft, Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                concurrencyArbiterConfig = tooManyStreamsSoft.arbiterConfig;
            }
            return tooManyStreamsSoft.copy(concurrencyArbiterConfig);
        }

        /* renamed from: component1, reason: from getter */
        public final Ott.ConcurrencyArbiterConfig getArbiterConfig() {
            return this.arbiterConfig;
        }

        public final TooManyStreamsSoft copy(Ott.ConcurrencyArbiterConfig arbiterConfig) {
            return new TooManyStreamsSoft(arbiterConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TooManyStreamsSoft) && jl40.l(this.arbiterConfig, ((TooManyStreamsSoft) other).arbiterConfig);
        }

        public final Ott.ConcurrencyArbiterConfig getArbiterConfig() {
            return this.arbiterConfig;
        }

        public int hashCode() {
            return this.arbiterConfig.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "TooManyStreamsSoft(arbiterConfig=" + this.arbiterConfig + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException$Unknown;", "Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends ConcurrencyArbiterException {
        public static final int $stable = 0;

        public Unknown() {
            super(null);
        }
    }

    public /* synthetic */ ConcurrencyArbiterException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConcurrencyArbiterException() {
    }
}
