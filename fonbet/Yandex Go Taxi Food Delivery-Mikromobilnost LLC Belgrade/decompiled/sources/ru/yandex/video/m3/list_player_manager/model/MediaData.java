package ru.yandex.video.m3.list_player_manager.model;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.list_player_manager.model.MediaData;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001%B?\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/yandex/video/m3/list_player_manager/model/MediaData;", "", "", "Lru/yandex/video/m3/list_player_manager/model/Stream;", "streams", "", "firstFrameHash", "firstFrameUrl", "videoContentId", "", "showFirstFrameUntilPlay", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/list_player_manager/model/MediaData$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/list_player_manager/model/MediaData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getStreams", "()Ljava/util/List;", "Ljava/lang/String;", "getFirstFrameHash", "getFirstFrameUrl", "getVideoContentId", "Z", "getShowFirstFrameUntilPlay", "()Z", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaData {
    public static final int $stable = 8;
    private final String firstFrameHash;
    private final String firstFrameUrl;
    private final boolean showFirstFrameUntilPlay;
    private final List<Stream> streams;
    private final String videoContentId;

    public /* synthetic */ MediaData(List list, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, (i & 16) != 0 ? false : z);
    }

    public static /* synthetic */ MediaData copy$default(MediaData mediaData, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.list_player_manager.model.MediaData$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MediaData.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                }
            };
        }
        return mediaData.copy(tlsVar);
    }

    public final MediaData copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!MediaData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        MediaData mediaData = (MediaData) other;
        return jl40.l(this.streams, mediaData.streams) && jl40.l(this.firstFrameHash, mediaData.firstFrameHash) && jl40.l(this.firstFrameUrl, mediaData.firstFrameUrl) && jl40.l(this.videoContentId, mediaData.videoContentId) && this.showFirstFrameUntilPlay == mediaData.showFirstFrameUntilPlay;
    }

    public final String getFirstFrameHash() {
        return this.firstFrameHash;
    }

    public final String getFirstFrameUrl() {
        return this.firstFrameUrl;
    }

    public final boolean getShowFirstFrameUntilPlay() {
        return this.showFirstFrameUntilPlay;
    }

    public final List<Stream> getStreams() {
        return this.streams;
    }

    public final String getVideoContentId() {
        return this.videoContentId;
    }

    public int hashCode() {
        int hashCode = this.streams.hashCode() * 31;
        String str = this.firstFrameHash;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.firstFrameUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.videoContentId;
        return Boolean.hashCode(this.showFirstFrameUntilPlay) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaData(streams=");
        sb.append(this.streams);
        sb.append(", firstFrameHash=");
        sb.append(this.firstFrameHash);
        sb.append(", firstFrameUrl=");
        sb.append(this.firstFrameUrl);
        sb.append(", videoContentId=");
        sb.append(this.videoContentId);
        sb.append(", showFirstFrameUntilPlay=");
        return unr0.u(sb, this.showFirstFrameUntilPlay, ')');
    }

    private MediaData(List<Stream> list, String str, String str2, String str3, boolean z) {
        this.streams = list;
        this.firstFrameHash = str;
        this.firstFrameUrl = str2;
        this.videoContentId = str3;
        this.showFirstFrameUntilPlay = z;
    }

    public /* synthetic */ MediaData(List list, String str, String str2, String str3, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, z);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0006\u0010\u001e\u001a\u00020\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/model/MediaData$Builder;", "", "mediaData", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "streams", "", "Lru/yandex/video/m3/list_player_manager/model/Stream;", "(Ljava/util/List;)V", "firstFrameHash", "", "getFirstFrameHash", "()Ljava/lang/String;", "setFirstFrameHash", "(Ljava/lang/String;)V", "firstFrameUrl", "getFirstFrameUrl", "setFirstFrameUrl", "showFirstFrameUntilPlay", "", "getShowFirstFrameUntilPlay", "()Z", "setShowFirstFrameUntilPlay", "(Z)V", "getStreams", "()Ljava/util/List;", "setStreams", "videoContentId", "getVideoContentId", "setVideoContentId", "build", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String firstFrameHash;
        private String firstFrameUrl;
        private boolean showFirstFrameUntilPlay;
        private List<Stream> streams;
        private String videoContentId;

        public Builder(MediaData mediaData) {
            this(mediaData.getStreams());
            this.firstFrameHash = mediaData.getFirstFrameHash();
            this.firstFrameUrl = mediaData.getFirstFrameUrl();
            this.videoContentId = mediaData.getVideoContentId();
            this.showFirstFrameUntilPlay = mediaData.getShowFirstFrameUntilPlay();
        }

        public final MediaData build() {
            return new MediaData(this.streams, this.firstFrameHash, this.firstFrameUrl, this.videoContentId, this.showFirstFrameUntilPlay, null);
        }

        public final String getFirstFrameHash() {
            return this.firstFrameHash;
        }

        public final String getFirstFrameUrl() {
            return this.firstFrameUrl;
        }

        public final boolean getShowFirstFrameUntilPlay() {
            return this.showFirstFrameUntilPlay;
        }

        public final List<Stream> getStreams() {
            return this.streams;
        }

        public final String getVideoContentId() {
            return this.videoContentId;
        }

        public final void setFirstFrameHash(String str) {
            this.firstFrameHash = str;
        }

        public final void setFirstFrameUrl(String str) {
            this.firstFrameUrl = str;
        }

        public final void setShowFirstFrameUntilPlay(boolean z) {
            this.showFirstFrameUntilPlay = z;
        }

        public final void setStreams(List<Stream> list) {
            this.streams = list;
        }

        public final void setVideoContentId(String str) {
            this.videoContentId = str;
        }

        public Builder(List<Stream> list) {
            this.streams = list;
        }
    }
}
