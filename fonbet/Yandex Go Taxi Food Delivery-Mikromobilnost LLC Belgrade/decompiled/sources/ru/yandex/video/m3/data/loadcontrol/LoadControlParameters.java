package ru.yandex.video.m3.data.loadcontrol;

import defpackage.jl40;
import defpackage.oo31;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.loadcontrol.LoadControlParameters;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0001&B;\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010$¨\u0006'"}, d2 = {"Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "", "", "playbackPositionUs", "bufferedDurationUs", "", "playbackSpeed", "", "playWhenReady", "rebuffering", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getPlaybackPositionUs$video_player_internalRelease", "()Ljava/lang/Long;", "getBufferedDurationUs$video_player_internalRelease", "Ljava/lang/Float;", "getPlaybackSpeed$video_player_internalRelease", "()Ljava/lang/Float;", "Ljava/lang/Boolean;", "getPlayWhenReady$video_player_internalRelease", "()Ljava/lang/Boolean;", "getRebuffering$video_player_internalRelease", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadControlParameters {
    public static final int $stable = 0;
    private final Long bufferedDurationUs;
    private final Boolean playWhenReady;
    private final Long playbackPositionUs;
    private final Float playbackSpeed;
    private final Boolean rebuffering;

    private LoadControlParameters(Long l, Long l2, Float f, Boolean bool, Boolean bool2) {
        this.playbackPositionUs = l;
        this.bufferedDurationUs = l2;
        this.playbackSpeed = f;
        this.playWhenReady = bool;
        this.rebuffering = bool2;
    }

    public static /* synthetic */ LoadControlParameters copy$default(LoadControlParameters loadControlParameters, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.loadcontrol.LoadControlParameters$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LoadControlParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(LoadControlParameters.Builder builder) {
                }
            };
        }
        return loadControlParameters.copy(tlsVar);
    }

    public final LoadControlParameters copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadControlParameters)) {
            return false;
        }
        LoadControlParameters loadControlParameters = (LoadControlParameters) other;
        return jl40.l(this.playbackPositionUs, loadControlParameters.playbackPositionUs) && jl40.l(this.bufferedDurationUs, loadControlParameters.bufferedDurationUs) && jl40.k(this.playbackSpeed, loadControlParameters.playbackSpeed) && jl40.l(this.playWhenReady, loadControlParameters.playWhenReady) && jl40.l(this.rebuffering, loadControlParameters.rebuffering);
    }

    /* renamed from: getBufferedDurationUs$video_player_internalRelease, reason: from getter */
    public final Long getBufferedDurationUs() {
        return this.bufferedDurationUs;
    }

    /* renamed from: getPlayWhenReady$video_player_internalRelease, reason: from getter */
    public final Boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    /* renamed from: getPlaybackPositionUs$video_player_internalRelease, reason: from getter */
    public final Long getPlaybackPositionUs() {
        return this.playbackPositionUs;
    }

    /* renamed from: getPlaybackSpeed$video_player_internalRelease, reason: from getter */
    public final Float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    /* renamed from: getRebuffering$video_player_internalRelease, reason: from getter */
    public final Boolean getRebuffering() {
        return this.rebuffering;
    }

    public int hashCode() {
        Long l = this.playbackPositionUs;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.bufferedDurationUs;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Float f = this.playbackSpeed;
        int hashCode3 = (hashCode2 + (f != null ? f.hashCode() : 0)) * 31;
        Boolean bool = this.playWhenReady;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.rebuffering;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadControlParameters(playbackPositionUs=");
        sb.append(this.playbackPositionUs);
        sb.append(", bufferedDurationUs=");
        sb.append(this.bufferedDurationUs);
        sb.append(", playbackSpeed=");
        sb.append(this.playbackSpeed);
        sb.append(", playWhenReady=");
        sb.append(this.playWhenReady);
        sb.append(", rebuffering=");
        return oo31.i(sb, this.rebuffering, ')');
    }

    public /* synthetic */ LoadControlParameters(Long l, Long l2, Float f, Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, f, bool, bool2);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012¨\u0006#"}, d2 = {"Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters$Builder;", "", "instance", "Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "(Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;)V", "()V", "bufferedDurationUs", "", "getBufferedDurationUs$video_player_internalRelease", "()Ljava/lang/Long;", "setBufferedDurationUs$video_player_internalRelease", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "playWhenReady", "", "getPlayWhenReady$video_player_internalRelease", "()Ljava/lang/Boolean;", "setPlayWhenReady$video_player_internalRelease", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "playbackPositionUs", "getPlaybackPositionUs$video_player_internalRelease", "setPlaybackPositionUs$video_player_internalRelease", "playbackSpeed", "", "getPlaybackSpeed$video_player_internalRelease", "()Ljava/lang/Float;", "setPlaybackSpeed$video_player_internalRelease", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "rebuffering", "getRebuffering$video_player_internalRelease", "setRebuffering$video_player_internalRelease", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Long bufferedDurationUs;
        private Boolean playWhenReady;
        private Long playbackPositionUs;
        private Float playbackSpeed;
        private Boolean rebuffering;

        public Builder(LoadControlParameters loadControlParameters) {
            this();
            this.playbackPositionUs = loadControlParameters.getPlaybackPositionUs();
            this.bufferedDurationUs = loadControlParameters.getBufferedDurationUs();
            this.playbackSpeed = loadControlParameters.getPlaybackSpeed();
            this.playWhenReady = loadControlParameters.getPlayWhenReady();
            this.rebuffering = loadControlParameters.getRebuffering();
        }

        public final LoadControlParameters build$video_player_internalRelease() {
            return new LoadControlParameters(this.playbackPositionUs, this.bufferedDurationUs, this.playbackSpeed, this.playWhenReady, this.rebuffering, null);
        }

        /* renamed from: getBufferedDurationUs$video_player_internalRelease, reason: from getter */
        public final Long getBufferedDurationUs() {
            return this.bufferedDurationUs;
        }

        /* renamed from: getPlayWhenReady$video_player_internalRelease, reason: from getter */
        public final Boolean getPlayWhenReady() {
            return this.playWhenReady;
        }

        /* renamed from: getPlaybackPositionUs$video_player_internalRelease, reason: from getter */
        public final Long getPlaybackPositionUs() {
            return this.playbackPositionUs;
        }

        /* renamed from: getPlaybackSpeed$video_player_internalRelease, reason: from getter */
        public final Float getPlaybackSpeed() {
            return this.playbackSpeed;
        }

        /* renamed from: getRebuffering$video_player_internalRelease, reason: from getter */
        public final Boolean getRebuffering() {
            return this.rebuffering;
        }

        public final void setBufferedDurationUs$video_player_internalRelease(Long l) {
            this.bufferedDurationUs = l;
        }

        public final void setPlayWhenReady$video_player_internalRelease(Boolean bool) {
            this.playWhenReady = bool;
        }

        public final void setPlaybackPositionUs$video_player_internalRelease(Long l) {
            this.playbackPositionUs = l;
        }

        public final void setPlaybackSpeed$video_player_internalRelease(Float f) {
            this.playbackSpeed = f;
        }

        public final void setRebuffering$video_player_internalRelease(Boolean bool) {
            this.rebuffering = bool;
        }

        public Builder() {
        }
    }
}
