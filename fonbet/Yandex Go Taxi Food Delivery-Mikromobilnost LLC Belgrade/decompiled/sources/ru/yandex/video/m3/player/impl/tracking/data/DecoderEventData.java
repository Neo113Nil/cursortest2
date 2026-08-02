package ru.yandex.video.m3.player.impl.tracking.data;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001:\u00012B_\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00002\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b\u000b\u0010+R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b\f\u0010+R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b,\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b\u0010\u00101¨\u00063"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "", "name", "", "inits", "releases", "Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;", "formatData", "lastFormatData", "", "isExpected", "isForeground", "reuses", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "reuseLog", "isHardwareAccelerated", "<init>", "(Ljava/lang/String;IILru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;ZZILru/yandex/video/m3/data/MediaCodecReuseLog;Ljava/lang/Boolean;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", CA20Status.STATUS_USER_I, "getInits", "getReleases", "Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;", "getFormatData", "()Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;", "getLastFormatData", "Z", "()Z", "getReuses", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "getReuseLog", "()Lru/yandex/video/m3/data/MediaCodecReuseLog;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DecoderEventData extends DefaultEventData {
    public static final int $stable = 8;
    private final TrackFormatData formatData;
    private final int inits;
    private final boolean isExpected;
    private final boolean isForeground;
    private final Boolean isHardwareAccelerated;
    private final TrackFormatData lastFormatData;
    private final String name;
    private final int releases;
    private final MediaCodecReuseLog reuseLog;
    private final int reuses;

    private DecoderEventData(String str, int i, int i2, TrackFormatData trackFormatData, TrackFormatData trackFormatData2, boolean z, boolean z2, int i3, MediaCodecReuseLog mediaCodecReuseLog, Boolean bool) {
        super(null, 1, null);
        MediaCodecReuseLog.DecoderReuseMethod reuseMethod;
        this.name = str;
        this.inits = i;
        this.releases = i2;
        this.formatData = trackFormatData;
        this.lastFormatData = trackFormatData2;
        this.isExpected = z;
        this.isForeground = z2;
        this.reuses = i3;
        this.reuseLog = mediaCodecReuseLog;
        this.isHardwareAccelerated = bool;
        StringBuilder sb = new StringBuilder("{\n\"decoderName\": \"");
        sb.append(str);
        sb.append("\",\n\"isHardwareAccelerated\": \"");
        sb.append(bool);
        sb.append("\",\n\"decoderReuseMethod\": \"");
        String name = (mediaCodecReuseLog == null || (reuseMethod = mediaCodecReuseLog.getReuseMethod()) == null) ? null : reuseMethod.name();
        sb.append(name == null ? "" : name);
        sb.append("\",\n\"decoderDiscardString\": \"");
        String discardReason = mediaCodecReuseLog != null ? mediaCodecReuseLog.getDiscardReason() : null;
        sb.append(discardReason != null ? discardReason : "");
        sb.append("\"\n }");
        setDetails(sb.toString());
    }

    public static /* synthetic */ DecoderEventData copy$default(DecoderEventData decoderEventData, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DecoderEventData.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DecoderEventData.Builder builder) {
                }
            };
        }
        return decoderEventData.copy(tlsVar);
    }

    public final DecoderEventData copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DecoderEventData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DecoderEventData decoderEventData = (DecoderEventData) other;
        return this.inits == decoderEventData.inits && this.releases == decoderEventData.releases && this.isExpected == decoderEventData.isExpected && this.isForeground == decoderEventData.isForeground && this.reuses == decoderEventData.reuses && jl40.l(this.isHardwareAccelerated, decoderEventData.isHardwareAccelerated) && jl40.l(this.name, decoderEventData.name) && jl40.l(this.formatData, decoderEventData.formatData) && jl40.l(this.lastFormatData, decoderEventData.lastFormatData) && jl40.l(this.reuseLog, decoderEventData.reuseLog) && jl40.l(getDetails(), decoderEventData.getDetails());
    }

    public final TrackFormatData getFormatData() {
        return this.formatData;
    }

    public final int getInits() {
        return this.inits;
    }

    public final TrackFormatData getLastFormatData() {
        return this.lastFormatData;
    }

    public final String getName() {
        return this.name;
    }

    public final int getReleases() {
        return this.releases;
    }

    public final MediaCodecReuseLog getReuseLog() {
        return this.reuseLog;
    }

    public final int getReuses() {
        return this.reuses;
    }

    public int hashCode() {
        int e = (unr0.e(unr0.e(((this.inits * 31) + this.releases) * 31, 31, this.isExpected), 31, this.isForeground) + this.reuses) * 31;
        Boolean bool = this.isHardwareAccelerated;
        int hashCode = (this.formatData.hashCode() + unr0.b((e + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.name)) * 31;
        TrackFormatData trackFormatData = this.lastFormatData;
        int hashCode2 = (hashCode + (trackFormatData != null ? trackFormatData.hashCode() : 0)) * 31;
        MediaCodecReuseLog mediaCodecReuseLog = this.reuseLog;
        int hashCode3 = (hashCode2 + (mediaCodecReuseLog != null ? mediaCodecReuseLog.hashCode() : 0)) * 31;
        String details = getDetails();
        return hashCode3 + (details != null ? details.hashCode() : 0);
    }

    /* renamed from: isExpected, reason: from getter */
    public final boolean getIsExpected() {
        return this.isExpected;
    }

    /* renamed from: isForeground, reason: from getter */
    public final boolean getIsForeground() {
        return this.isForeground;
    }

    /* renamed from: isHardwareAccelerated, reason: from getter */
    public final Boolean getIsHardwareAccelerated() {
        return this.isHardwareAccelerated;
    }

    public String toString() {
        return "DecoderEventData(name='" + this.name + "', inits=" + this.inits + ", releases=" + this.releases + ", formatData=" + this.formatData + ", lastFormatData=" + this.lastFormatData + ", expected=" + this.isExpected + ", foreground=" + this.isForeground + ", reuses=" + this.reuses + ", reuseLog=" + this.reuseLog + ", isHardwareAccelerated=" + this.isHardwareAccelerated + ", details=" + getDetails() + ')';
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B1\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bB\u000f\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0015J\r\u0010<\u001a\u00020\rH\u0000¢\u0006\u0002\b=R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001e\u0010$\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001e\u0010&\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData$Builder;", "", "name", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/tracks/TrackType;", "decoderCounter", "Lru/yandex/video/m3/player/DecoderCounter;", "trackFormat", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "lastTrackFormat", "(Ljava/lang/String;Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/DecoderCounter;Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/player/tracks/TrackFormat;)V", "decoderEventData", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "(Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;)V", "inits", "", "releases", "formatData", "Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;", "lastFormatData", "(Ljava/lang/String;IILru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;)V", "getFormatData", "()Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;", "setFormatData", "(Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;)V", "getInits", "()I", "setInits", "(I)V", "isExpected", "", "()Ljava/lang/Boolean;", "setExpected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isForeground", "setForeground", "isHardwareAccelerated", "setHardwareAccelerated", "getLastFormatData", "setLastFormatData", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getReleases", "setReleases", "reuseLog", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "getReuseLog", "()Lru/yandex/video/m3/data/MediaCodecReuseLog;", "setReuseLog", "(Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "reuses", "getReuses", "()Ljava/lang/Integer;", "setReuses", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private TrackFormatData formatData;
        private int inits;
        private Boolean isExpected;
        private Boolean isForeground;
        private Boolean isHardwareAccelerated;
        private TrackFormatData lastFormatData;
        private String name;
        private int releases;
        private MediaCodecReuseLog reuseLog;
        private Integer reuses;

        public Builder(DecoderEventData decoderEventData) {
            this(decoderEventData.getName(), decoderEventData.getInits(), decoderEventData.getReleases(), decoderEventData.getFormatData(), decoderEventData.getLastFormatData());
            this.isExpected = Boolean.valueOf(decoderEventData.getIsExpected());
            this.isForeground = Boolean.valueOf(decoderEventData.getIsForeground());
            this.reuses = Integer.valueOf(decoderEventData.getReuses());
            this.reuseLog = decoderEventData.getReuseLog();
            this.isHardwareAccelerated = decoderEventData.getIsHardwareAccelerated();
        }

        public final DecoderEventData build$video_player_internalRelease() {
            String str = this.name;
            int i = this.inits;
            int i2 = this.releases;
            TrackFormatData trackFormatData = this.formatData;
            TrackFormatData trackFormatData2 = this.lastFormatData;
            Boolean bool = this.isExpected;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            Boolean bool2 = this.isForeground;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Integer num = this.reuses;
            return new DecoderEventData(str, i, i2, trackFormatData, trackFormatData2, booleanValue, booleanValue2, num != null ? num.intValue() : 0, this.reuseLog, this.isHardwareAccelerated, null);
        }

        public final TrackFormatData getFormatData() {
            return this.formatData;
        }

        public final int getInits() {
            return this.inits;
        }

        public final TrackFormatData getLastFormatData() {
            return this.lastFormatData;
        }

        public final String getName() {
            return this.name;
        }

        public final int getReleases() {
            return this.releases;
        }

        public final MediaCodecReuseLog getReuseLog() {
            return this.reuseLog;
        }

        public final Integer getReuses() {
            return this.reuses;
        }

        /* renamed from: isExpected, reason: from getter */
        public final Boolean getIsExpected() {
            return this.isExpected;
        }

        /* renamed from: isForeground, reason: from getter */
        public final Boolean getIsForeground() {
            return this.isForeground;
        }

        /* renamed from: isHardwareAccelerated, reason: from getter */
        public final Boolean getIsHardwareAccelerated() {
            return this.isHardwareAccelerated;
        }

        public final void setExpected(Boolean bool) {
            this.isExpected = bool;
        }

        public final void setForeground(Boolean bool) {
            this.isForeground = bool;
        }

        public final void setFormatData(TrackFormatData trackFormatData) {
            this.formatData = trackFormatData;
        }

        public final void setHardwareAccelerated(Boolean bool) {
            this.isHardwareAccelerated = bool;
        }

        public final void setInits(int i) {
            this.inits = i;
        }

        public final void setLastFormatData(TrackFormatData trackFormatData) {
            this.lastFormatData = trackFormatData;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setReleases(int i) {
            this.releases = i;
        }

        public final void setReuseLog(MediaCodecReuseLog mediaCodecReuseLog) {
            this.reuseLog = mediaCodecReuseLog;
        }

        public final void setReuses(Integer num) {
            this.reuses = num;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder(String str, TrackType trackType, DecoderCounter decoderCounter, TrackFormat trackFormat, TrackFormat trackFormat2) {
            this(str, r3, r4, r5, trackFormat2 != null ? DecoderEventDataKt.toTrackFormatData(trackFormat2, trackType) : null);
            TrackFormatData trackFormatData;
            int initCount = decoderCounter.getInitCount();
            int releaseCount = decoderCounter.getReleaseCount();
            trackFormatData = DecoderEventDataKt.toTrackFormatData(trackFormat, trackType);
        }

        public Builder(String str, int i, int i2, TrackFormatData trackFormatData, TrackFormatData trackFormatData2) {
            this.name = str;
            this.inits = i;
            this.releases = i2;
            this.formatData = trackFormatData;
            this.lastFormatData = trackFormatData2;
        }
    }

    public /* synthetic */ DecoderEventData(String str, int i, int i2, TrackFormatData trackFormatData, TrackFormatData trackFormatData2, boolean z, boolean z2, int i3, MediaCodecReuseLog mediaCodecReuseLog, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, trackFormatData, trackFormatData2, z, z2, i3, mediaCodecReuseLog, bool);
    }
}
