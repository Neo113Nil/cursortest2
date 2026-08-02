package ru.yandex.video.m3.player.report.dto;

import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/report/dto/Record;", "", "()V", "timestampMs", "", "getTimestampMs", "()J", "Assert", "BasicLog", "Error", "Log", "SpanLog", "Lru/yandex/video/m3/player/report/dto/Record$Assert;", "Lru/yandex/video/m3/player/report/dto/Record$Error;", "Lru/yandex/video/m3/player/report/dto/Record$Log;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class Record {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/player/report/dto/Record$Assert;", "Lru/yandex/video/m3/player/report/dto/Record;", "tag", "", Constants.KEY_MESSAGE, "timestampMs", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getTag", "getTimestampMs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Assert extends Record {
        public static final int $stable = 0;
        private final String message;
        private final String tag;
        private final long timestampMs;

        public Assert(String str, String str2, long j) {
            super(null);
            this.tag = str;
            this.message = str2;
            this.timestampMs = j;
        }

        public static /* synthetic */ Assert copy$default(Assert r0, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.tag;
            }
            if ((i & 2) != 0) {
                str2 = r0.message;
            }
            if ((i & 4) != 0) {
                j = r0.timestampMs;
            }
            return r0.copy(str, str2, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public final Assert copy(String tag, String message, long timestampMs) {
            return new Assert(tag, message, timestampMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Assert)) {
                return false;
            }
            Assert r6 = (Assert) other;
            return jl40.l(this.tag, r6.tag) && jl40.l(this.message, r6.message) && this.timestampMs == r6.timestampMs;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getTag() {
            return this.tag;
        }

        @Override // ru.yandex.video.m3.player.report.dto.Record
        public long getTimestampMs() {
            return this.timestampMs;
        }

        public int hashCode() {
            return Long.hashCode(this.timestampMs) + unr0.b(this.tag.hashCode() * 31, 31, this.message);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Assert(tag=");
            sb.append(this.tag);
            sb.append(", message=");
            sb.append(this.message);
            sb.append(", timestampMs=");
            return b64.o(sb, this.timestampMs, ')');
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/report/dto/Record$BasicLog;", "Lru/yandex/video/m3/player/report/dto/Record$Log;", Constants.KEY_MESSAGE, "", "timestampMs", "", "(Ljava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getTimestampMs", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BasicLog extends Log {
        public static final int $stable = 0;
        private final String message;
        private final long timestampMs;

        public BasicLog(String str, long j) {
            super(null);
            this.message = str;
            this.timestampMs = j;
        }

        public static /* synthetic */ BasicLog copy$default(BasicLog basicLog, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = basicLog.message;
            }
            if ((i & 2) != 0) {
                j = basicLog.timestampMs;
            }
            return basicLog.copy(str, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public final BasicLog copy(String message, long timestampMs) {
            return new BasicLog(message, timestampMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BasicLog)) {
                return false;
            }
            BasicLog basicLog = (BasicLog) other;
            return jl40.l(this.message, basicLog.message) && this.timestampMs == basicLog.timestampMs;
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // ru.yandex.video.m3.player.report.dto.Record
        public long getTimestampMs() {
            return this.timestampMs;
        }

        public int hashCode() {
            return Long.hashCode(this.timestampMs) + (this.message.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BasicLog(message=");
            sb.append(this.message);
            sb.append(", timestampMs=");
            return b64.o(sb, this.timestampMs, ')');
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0014\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/report/dto/Record$Error;", "Lru/yandex/video/m3/player/report/dto/Record;", "tag", "", "region", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "timestampMs", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;J)V", "getError", "()Ljava/lang/Exception;", "getRegion", "()Ljava/lang/String;", "getTag", "getTimestampMs", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error extends Record {
        public static final int $stable = 8;
        private final Exception error;
        private final String region;
        private final String tag;
        private final long timestampMs;

        public Error(String str, String str2, Exception exc, long j) {
            super(null);
            this.tag = str;
            this.region = str2;
            this.error = exc;
            this.timestampMs = j;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, Exception exc, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.tag;
            }
            if ((i & 2) != 0) {
                str2 = error.region;
            }
            if ((i & 4) != 0) {
                exc = error.error;
            }
            if ((i & 8) != 0) {
                j = error.timestampMs;
            }
            Exception exc2 = exc;
            return error.copy(str, str2, exc2, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        /* renamed from: component3, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        /* renamed from: component4, reason: from getter */
        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public final Error copy(String tag, String region, Exception error, long timestampMs) {
            return new Error(tag, region, error, timestampMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return jl40.l(this.tag, error.tag) && jl40.l(this.region, error.region) && jl40.l(this.error, error.error) && this.timestampMs == error.timestampMs;
        }

        public final Exception getError() {
            return this.error;
        }

        public final String getRegion() {
            return this.region;
        }

        public final String getTag() {
            return this.tag;
        }

        @Override // ru.yandex.video.m3.player.report.dto.Record
        public long getTimestampMs() {
            return this.timestampMs;
        }

        public int hashCode() {
            return Long.hashCode(this.timestampMs) + ((this.error.hashCode() + unr0.b(this.tag.hashCode() * 31, 31, this.region)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Error(tag=");
            sb.append(this.tag);
            sb.append(", region=");
            sb.append(this.region);
            sb.append(", error=");
            sb.append(this.error);
            sb.append(", timestampMs=");
            return b64.o(sb, this.timestampMs, ')');
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/report/dto/Record$SpanLog;", "Lru/yandex/video/m3/player/report/dto/Record$Log;", "region", "", "startMs", "", "endMs", "durationMs", "interruptionReason", "(Ljava/lang/String;JJJLjava/lang/String;)V", "getDurationMs", "()J", "getEndMs", "getInterruptionReason", "()Ljava/lang/String;", "getRegion", "getStartMs", "timestampMs", "getTimestampMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SpanLog extends Log {
        public static final int $stable = 0;
        private final long durationMs;
        private final long endMs;
        private final String interruptionReason;
        private final String region;
        private final long startMs;

        public SpanLog(String str, long j, long j2, long j3, String str2) {
            super(null);
            this.region = str;
            this.startMs = j;
            this.endMs = j2;
            this.durationMs = j3;
            this.interruptionReason = str2;
        }

        public static /* synthetic */ SpanLog copy$default(SpanLog spanLog, String str, long j, long j2, long j3, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = spanLog.region;
            }
            if ((i & 2) != 0) {
                j = spanLog.startMs;
            }
            if ((i & 4) != 0) {
                j2 = spanLog.endMs;
            }
            if ((i & 8) != 0) {
                j3 = spanLog.durationMs;
            }
            if ((i & 16) != 0) {
                str2 = spanLog.interruptionReason;
            }
            String str3 = str2;
            long j4 = j3;
            return spanLog.copy(str, j, j2, j4, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartMs() {
            return this.startMs;
        }

        /* renamed from: component3, reason: from getter */
        public final long getEndMs() {
            return this.endMs;
        }

        /* renamed from: component4, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        /* renamed from: component5, reason: from getter */
        public final String getInterruptionReason() {
            return this.interruptionReason;
        }

        public final SpanLog copy(String region, long startMs, long endMs, long durationMs, String interruptionReason) {
            return new SpanLog(region, startMs, endMs, durationMs, interruptionReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpanLog)) {
                return false;
            }
            SpanLog spanLog = (SpanLog) other;
            return jl40.l(this.region, spanLog.region) && this.startMs == spanLog.startMs && this.endMs == spanLog.endMs && this.durationMs == spanLog.durationMs && jl40.l(this.interruptionReason, spanLog.interruptionReason);
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public final long getEndMs() {
            return this.endMs;
        }

        public final String getInterruptionReason() {
            return this.interruptionReason;
        }

        public final String getRegion() {
            return this.region;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        @Override // ru.yandex.video.m3.player.report.dto.Record
        public long getTimestampMs() {
            return this.startMs;
        }

        public int hashCode() {
            int c = qv10.c(qv10.c(qv10.c(this.region.hashCode() * 31, 31, this.startMs), 31, this.endMs), 31, this.durationMs);
            String str = this.interruptionReason;
            return c + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SpanLog(region=");
            sb.append(this.region);
            sb.append(", startMs=");
            sb.append(this.startMs);
            sb.append(", endMs=");
            sb.append(this.endMs);
            sb.append(", durationMs=");
            sb.append(this.durationMs);
            sb.append(", interruptionReason=");
            return b64.p(sb, this.interruptionReason, ')');
        }
    }

    public /* synthetic */ Record(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getTimestampMs();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/report/dto/Record$Log;", "Lru/yandex/video/m3/player/report/dto/Record;", "()V", "Lru/yandex/video/m3/player/report/dto/Record$BasicLog;", "Lru/yandex/video/m3/player/report/dto/Record$SpanLog;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Log extends Record {
        public static final int $stable = 0;

        private Log() {
            super(null);
        }

        public /* synthetic */ Log(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Record() {
    }
}
