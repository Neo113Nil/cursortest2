package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "Lru/yandex/video/m3/player/ui/debug/model/TrackData;", "title", "", "bitrate", "", "language", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLanguage", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "equals", "", "other", "", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AudioTrackData implements TrackData {
    public static final int $stable = 0;
    private final Integer bitrate;
    private final String language;
    private final String title;

    public AudioTrackData(String str, Integer num, String str2) {
        this.title = str;
        this.bitrate = num;
        this.language = str2;
    }

    public static /* synthetic */ AudioTrackData copy$default(AudioTrackData audioTrackData, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioTrackData.title;
        }
        if ((i & 2) != 0) {
            num = audioTrackData.bitrate;
        }
        if ((i & 4) != 0) {
            str2 = audioTrackData.language;
        }
        return audioTrackData.copy(str, num, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getBitrate() {
        return this.bitrate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final AudioTrackData copy(String title, Integer bitrate, String language) {
        return new AudioTrackData(title, bitrate, language);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioTrackData)) {
            return false;
        }
        AudioTrackData audioTrackData = (AudioTrackData) other;
        return jl40.l(this.title, audioTrackData.title) && jl40.l(this.bitrate, audioTrackData.bitrate) && jl40.l(this.language, audioTrackData.language);
    }

    @Override // ru.yandex.video.m3.player.ui.debug.model.TrackData
    public Integer getBitrate() {
        return this.bitrate;
    }

    public final String getLanguage() {
        return this.language;
    }

    @Override // ru.yandex.video.m3.player.ui.debug.model.TrackData
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.bitrate;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.language;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioTrackData(title=");
        sb.append(this.title);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", language=");
        return b64.p(sb, this.language, ')');
    }
}
