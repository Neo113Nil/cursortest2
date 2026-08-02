package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.DelegatePlaybackParameters;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/data/DelegatePlaybackParameters;", "", "", "mediaSourceUriString", "", "startPosition", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/DelegatePlaybackParameters$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/DelegatePlaybackParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getMediaSourceUriString", "Ljava/lang/Long;", "getStartPosition", "()Ljava/lang/Long;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DelegatePlaybackParameters {
    public static final int $stable = 0;
    private final String mediaSourceUriString;
    private final Long startPosition;

    private DelegatePlaybackParameters(String str, Long l) {
        this.mediaSourceUriString = str;
        this.startPosition = l;
    }

    public static /* synthetic */ DelegatePlaybackParameters copy$default(DelegatePlaybackParameters delegatePlaybackParameters, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.DelegatePlaybackParameters$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DelegatePlaybackParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DelegatePlaybackParameters.Builder builder) {
                }
            };
        }
        return delegatePlaybackParameters.copy(tlsVar);
    }

    public final DelegatePlaybackParameters copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DelegatePlaybackParameters.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DelegatePlaybackParameters delegatePlaybackParameters = (DelegatePlaybackParameters) other;
        return jl40.l(this.startPosition, delegatePlaybackParameters.startPosition) && jl40.l(this.mediaSourceUriString, delegatePlaybackParameters.mediaSourceUriString);
    }

    public final String getMediaSourceUriString() {
        return this.mediaSourceUriString;
    }

    public final Long getStartPosition() {
        return this.startPosition;
    }

    public int hashCode() {
        Long l = this.startPosition;
        return this.mediaSourceUriString.hashCode() + ((l != null ? l.hashCode() : 0) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DelegatePlaybackParameters(mediaSourceUriString='");
        sb.append(this.mediaSourceUriString);
        sb.append("', startPosition=");
        return qv10.q(sb, this.startPosition, ')');
    }

    public /* synthetic */ DelegatePlaybackParameters(String str, Long l, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\r\u0010\u0013\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/data/DelegatePlaybackParameters$Builder;", "", "playbackParameters", "Lru/yandex/video/m3/data/DelegatePlaybackParameters;", "(Lru/yandex/video/m3/data/DelegatePlaybackParameters;)V", "mediaSourceUriString", "", "startPosition", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getMediaSourceUriString", "()Ljava/lang/String;", "setMediaSourceUriString", "(Ljava/lang/String;)V", "getStartPosition", "()Ljava/lang/Long;", "setStartPosition", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String mediaSourceUriString;
        private Long startPosition;

        public Builder(DelegatePlaybackParameters delegatePlaybackParameters) {
            this(delegatePlaybackParameters.getMediaSourceUriString(), delegatePlaybackParameters.getStartPosition());
        }

        public final DelegatePlaybackParameters build$video_player_internalRelease() {
            return new DelegatePlaybackParameters(this.mediaSourceUriString, this.startPosition, null);
        }

        public final String getMediaSourceUriString() {
            return this.mediaSourceUriString;
        }

        public final Long getStartPosition() {
            return this.startPosition;
        }

        public final void setMediaSourceUriString(String str) {
            this.mediaSourceUriString = str;
        }

        public final void setStartPosition(Long l) {
            this.startPosition = l;
        }

        public Builder(String str, Long l) {
            this.mediaSourceUriString = str;
            this.startPosition = l;
        }
    }
}
