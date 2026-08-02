package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.StartFromCacheInfo;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001!B1\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006\""}, d2 = {"Lru/yandex/video/m3/data/StartFromCacheInfo;", "", "", "preloaderVsid", "", "isManifestFromCache", "", "videoCachePositionMs", "audioCachePositionMs", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/StartFromCacheInfo$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/StartFromCacheInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getPreloaderVsid", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/Long;", "getVideoCachePositionMs", "()Ljava/lang/Long;", "getAudioCachePositionMs", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartFromCacheInfo {
    public static final int $stable = 0;
    private final Long audioCachePositionMs;
    private final Boolean isManifestFromCache;
    private final String preloaderVsid;
    private final Long videoCachePositionMs;

    private StartFromCacheInfo(String str, Boolean bool, Long l, Long l2) {
        this.preloaderVsid = str;
        this.isManifestFromCache = bool;
        this.videoCachePositionMs = l;
        this.audioCachePositionMs = l2;
    }

    public static /* synthetic */ StartFromCacheInfo copy$default(StartFromCacheInfo startFromCacheInfo, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.StartFromCacheInfo$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((StartFromCacheInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(StartFromCacheInfo.Builder builder) {
                }
            };
        }
        return startFromCacheInfo.copy(tlsVar);
    }

    public final StartFromCacheInfo copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!StartFromCacheInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        StartFromCacheInfo startFromCacheInfo = (StartFromCacheInfo) other;
        return jl40.l(this.isManifestFromCache, startFromCacheInfo.isManifestFromCache) && jl40.l(this.videoCachePositionMs, startFromCacheInfo.videoCachePositionMs) && jl40.l(this.audioCachePositionMs, startFromCacheInfo.audioCachePositionMs) && jl40.l(this.preloaderVsid, startFromCacheInfo.preloaderVsid);
    }

    public final Long getAudioCachePositionMs() {
        return this.audioCachePositionMs;
    }

    public final String getPreloaderVsid() {
        return this.preloaderVsid;
    }

    public final Long getVideoCachePositionMs() {
        return this.videoCachePositionMs;
    }

    public int hashCode() {
        Boolean bool = this.isManifestFromCache;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Long l = this.videoCachePositionMs;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.audioCachePositionMs;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.preloaderVsid;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: isManifestFromCache, reason: from getter */
    public final Boolean getIsManifestFromCache() {
        return this.isManifestFromCache;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartFromCacheInfo(preloaderVsid=");
        sb.append(this.preloaderVsid);
        sb.append(", isManifestFromCache=");
        sb.append(this.isManifestFromCache);
        sb.append(", videoCachePositionMs=");
        sb.append(this.videoCachePositionMs);
        sb.append(", audioCachePositionMs=");
        return qv10.q(sb, this.audioCachePositionMs, ')');
    }

    public /* synthetic */ StartFromCacheInfo(String str, Boolean bool, Long l, Long l2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, l, l2);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\r\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001dR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/data/StartFromCacheInfo$Builder;", "", "startFromCacheInfo", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "(Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "preloaderVsid", "", "isManifestFromCache", "", "videoCachePositionMs", "", "audioCachePositionMs", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)V", "getAudioCachePositionMs", "()Ljava/lang/Long;", "setAudioCachePositionMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "setManifestFromCache", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPreloaderVsid", "()Ljava/lang/String;", "setPreloaderVsid", "(Ljava/lang/String;)V", "getVideoCachePositionMs", "setVideoCachePositionMs", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Long audioCachePositionMs;
        private Boolean isManifestFromCache;
        private String preloaderVsid;
        private Long videoCachePositionMs;

        public Builder(StartFromCacheInfo startFromCacheInfo) {
            this(startFromCacheInfo.getPreloaderVsid(), startFromCacheInfo.getIsManifestFromCache(), startFromCacheInfo.getVideoCachePositionMs(), startFromCacheInfo.getAudioCachePositionMs());
        }

        public final StartFromCacheInfo build$video_player_internalRelease() {
            return new StartFromCacheInfo(this.preloaderVsid, this.isManifestFromCache, this.videoCachePositionMs, this.audioCachePositionMs, null);
        }

        public final Long getAudioCachePositionMs() {
            return this.audioCachePositionMs;
        }

        public final String getPreloaderVsid() {
            return this.preloaderVsid;
        }

        public final Long getVideoCachePositionMs() {
            return this.videoCachePositionMs;
        }

        /* renamed from: isManifestFromCache, reason: from getter */
        public final Boolean getIsManifestFromCache() {
            return this.isManifestFromCache;
        }

        public final void setAudioCachePositionMs(Long l) {
            this.audioCachePositionMs = l;
        }

        public final void setManifestFromCache(Boolean bool) {
            this.isManifestFromCache = bool;
        }

        public final void setPreloaderVsid(String str) {
            this.preloaderVsid = str;
        }

        public final void setVideoCachePositionMs(Long l) {
            this.videoCachePositionMs = l;
        }

        public Builder(String str, Boolean bool, Long l, Long l2) {
            this.preloaderVsid = str;
            this.isManifestFromCache = bool;
            this.videoCachePositionMs = l;
            this.audioCachePositionMs = l2;
        }
    }
}
