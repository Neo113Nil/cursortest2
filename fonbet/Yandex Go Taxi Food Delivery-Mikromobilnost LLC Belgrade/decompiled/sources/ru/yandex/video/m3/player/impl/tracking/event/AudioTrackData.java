package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/AudioTrackData;", "", "id", "", "name", "bitrate", "", "lang", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getBitrate", "()I", "getId", "()Ljava/lang/String;", "getLang", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AudioTrackData {
    public static final int $stable = 0;
    private final int bitrate;
    private final transient String id;
    private final String lang;
    private final String name;

    public AudioTrackData(String str, String str2, int i, String str3) {
        this.id = str;
        this.name = str2;
        this.bitrate = i;
        this.lang = str3;
    }

    public static /* synthetic */ AudioTrackData copy$default(AudioTrackData audioTrackData, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = audioTrackData.id;
        }
        if ((i2 & 2) != 0) {
            str2 = audioTrackData.name;
        }
        if ((i2 & 4) != 0) {
            i = audioTrackData.bitrate;
        }
        if ((i2 & 8) != 0) {
            str3 = audioTrackData.lang;
        }
        return audioTrackData.copy(str, str2, i, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBitrate() {
        return this.bitrate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    public final AudioTrackData copy(String id, String name, int bitrate, String lang) {
        return new AudioTrackData(id, name, bitrate, lang);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioTrackData)) {
            return false;
        }
        AudioTrackData audioTrackData = (AudioTrackData) other;
        return jl40.l(this.id, audioTrackData.id) && jl40.l(this.name, audioTrackData.name) && this.bitrate == audioTrackData.bitrate && jl40.l(this.lang, audioTrackData.lang);
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int b = oyr.b(this.bitrate, unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.name), 31);
        String str2 = this.lang;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioTrackData(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", lang=");
        return b64.p(sb, this.lang, ')');
    }
}
