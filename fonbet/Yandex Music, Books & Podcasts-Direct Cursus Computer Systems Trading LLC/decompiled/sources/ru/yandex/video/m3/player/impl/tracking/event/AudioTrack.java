package ru.yandex.video.m3.player.impl.tracking.event;

import androidx.annotation.Keep;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.vz1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/AudioTrack;", "", ConnectableDevice.KEY_ID, "", "bitrate", "", "(Ljava/lang/String;I)V", "getBitrate", "()I", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class AudioTrack {
    public static final int $stable = 0;
    private final int bitrate;
    private final String id;

    public AudioTrack(String str, int i) {
        this.id = str;
        this.bitrate = i;
    }

    public static /* synthetic */ AudioTrack copy$default(AudioTrack audioTrack, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = audioTrack.id;
        }
        if ((i2 & 2) != 0) {
            i = audioTrack.bitrate;
        }
        return audioTrack.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBitrate() {
        return this.bitrate;
    }

    @NotNull
    public final AudioTrack copy(String id, int bitrate) {
        return new AudioTrack(id, bitrate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioTrack)) {
            return false;
        }
        AudioTrack audioTrack = (AudioTrack) other;
        return Intrinsics.d(this.id, audioTrack.id) && this.bitrate == audioTrack.bitrate;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        return Integer.hashCode(this.bitrate) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AudioTrack(id=");
        sb.append(this.id);
        sb.append(", bitrate=");
        return vz1.r(sb, this.bitrate, ')');
    }
}
