package ru.yandex.video.m3.player.utils;

import defpackage.tls;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.utils.UtilsKt;
import ru.yandex.video.m3.player.utils.DeviceSpecificPlayingInfo;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/utils/DeviceSpecificPlayingInfo;", "Ljava/io/Serializable;", "Lru/yandex/video/m3/player/utils/MediaInfo;", "mediaInfo", "Lru/yandex/video/m3/player/utils/DRMInfo;", "drmInfo", "<init>", "(Lru/yandex/video/m3/player/utils/MediaInfo;Lru/yandex/video/m3/player/utils/DRMInfo;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/utils/DeviceSpecificPlayingInfo$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/utils/DeviceSpecificPlayingInfo;", "", "toStringInfo$video_player_internalRelease", "()Ljava/lang/String;", "toStringInfo", "Lru/yandex/video/m3/player/utils/MediaInfo;", "getMediaInfo", "()Lru/yandex/video/m3/player/utils/MediaInfo;", "Lru/yandex/video/m3/player/utils/DRMInfo;", "getDrmInfo", "()Lru/yandex/video/m3/player/utils/DRMInfo;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceSpecificPlayingInfo implements Serializable {
    public static final int $stable = 8;
    private final DRMInfo drmInfo;
    private final MediaInfo mediaInfo;

    private DeviceSpecificPlayingInfo(MediaInfo mediaInfo, DRMInfo dRMInfo) {
        this.mediaInfo = mediaInfo;
        this.drmInfo = dRMInfo;
    }

    public static /* synthetic */ DeviceSpecificPlayingInfo copy$default(DeviceSpecificPlayingInfo deviceSpecificPlayingInfo, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.utils.DeviceSpecificPlayingInfo$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DeviceSpecificPlayingInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DeviceSpecificPlayingInfo.Builder builder) {
                }
            };
        }
        return deviceSpecificPlayingInfo.copy(tlsVar);
    }

    public final DeviceSpecificPlayingInfo copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public final DRMInfo getDrmInfo() {
        return this.drmInfo;
    }

    public final MediaInfo getMediaInfo() {
        return this.mediaInfo;
    }

    public final String toStringInfo$video_player_internalRelease() {
        return "Drm Info:\n" + UtilsKt.toStringInfo(this.drmInfo) + "\nMediaInfo:\n" + UtilsKt.toStringInfo(this.mediaInfo);
    }

    public /* synthetic */ DeviceSpecificPlayingInfo(MediaInfo mediaInfo, DRMInfo dRMInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(mediaInfo, dRMInfo);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/utils/DeviceSpecificPlayingInfo$Builder;", "", "deviceSpecificPlayingInfo", "Lru/yandex/video/m3/player/utils/DeviceSpecificPlayingInfo;", "(Lru/yandex/video/m3/player/utils/DeviceSpecificPlayingInfo;)V", "mediaInfo", "Lru/yandex/video/m3/player/utils/MediaInfo;", "drmInfo", "Lru/yandex/video/m3/player/utils/DRMInfo;", "(Lru/yandex/video/m3/player/utils/MediaInfo;Lru/yandex/video/m3/player/utils/DRMInfo;)V", "getDrmInfo", "()Lru/yandex/video/m3/player/utils/DRMInfo;", "setDrmInfo", "(Lru/yandex/video/m3/player/utils/DRMInfo;)V", "getMediaInfo", "()Lru/yandex/video/m3/player/utils/MediaInfo;", "setMediaInfo", "(Lru/yandex/video/m3/player/utils/MediaInfo;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private DRMInfo drmInfo;
        private MediaInfo mediaInfo;

        public Builder(DeviceSpecificPlayingInfo deviceSpecificPlayingInfo) {
            this(deviceSpecificPlayingInfo.getMediaInfo(), deviceSpecificPlayingInfo.getDrmInfo());
        }

        public final DeviceSpecificPlayingInfo build$video_player_internalRelease() {
            return new DeviceSpecificPlayingInfo(this.mediaInfo, this.drmInfo, null);
        }

        public final DRMInfo getDrmInfo() {
            return this.drmInfo;
        }

        public final MediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        public final void setDrmInfo(DRMInfo dRMInfo) {
            this.drmInfo = dRMInfo;
        }

        public final void setMediaInfo(MediaInfo mediaInfo) {
            this.mediaInfo = mediaInfo;
        }

        public Builder(MediaInfo mediaInfo, DRMInfo dRMInfo) {
            this.mediaInfo = mediaInfo;
            this.drmInfo = dRMInfo;
        }
    }
}
