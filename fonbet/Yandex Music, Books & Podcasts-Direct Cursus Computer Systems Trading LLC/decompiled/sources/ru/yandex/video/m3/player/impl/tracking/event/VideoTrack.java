package ru.yandex.video.m3.player.impl.tracking.event;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.f1d;
import defpackage.vz1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;", "", CameraProperty.WIDTH, "", CameraProperty.HEIGHT, "bitrate", "(III)V", "getBitrate", "()I", "getHeight", "name", "", "getName", "()Ljava/lang/String;", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class VideoTrack {
    public static final int $stable = 0;
    private final int bitrate;
    private final int height;

    @NotNull
    private final String name;
    private final int width;

    public VideoTrack(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.bitrate = i3;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append('p');
        this.name = sb.toString();
    }

    public static /* synthetic */ VideoTrack copy$default(VideoTrack videoTrack, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = videoTrack.width;
        }
        if ((i4 & 2) != 0) {
            i2 = videoTrack.height;
        }
        if ((i4 & 4) != 0) {
            i3 = videoTrack.bitrate;
        }
        return videoTrack.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBitrate() {
        return this.bitrate;
    }

    @NotNull
    public final VideoTrack copy(int width, int height, int bitrate) {
        return new VideoTrack(width, height, bitrate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTrack)) {
            return false;
        }
        VideoTrack videoTrack = (VideoTrack) other;
        return this.width == videoTrack.width && this.height == videoTrack.height && this.bitrate == videoTrack.bitrate;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.bitrate) + f1d.a(this.height, Integer.hashCode(this.width) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VideoTrack(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", bitrate=");
        return vz1.r(sb, this.bitrate, ')');
    }
}
