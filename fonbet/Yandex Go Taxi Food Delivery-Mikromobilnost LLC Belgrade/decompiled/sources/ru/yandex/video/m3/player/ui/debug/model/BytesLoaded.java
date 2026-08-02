package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.b64;
import defpackage.qv10;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.MediaStreamTrack;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004\u0012\f\b\u0002\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\bJ\r\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0011\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003JA\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "", "total", "", "Lru/yandex/video/m3/player/ui/debug/util/Bytes;", MediaStreamTrack.VIDEO_TRACK_KIND, MediaStreamTrack.AUDIO_TRACK_KIND, "subtitles", "(JJJJ)V", "getAudio", "()J", "getSubtitles", "getTotal", "getVideo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BytesLoaded {
    public static final int $stable = 0;
    private final long audio;
    private final long subtitles;
    private final long total;
    private final long video;

    public /* synthetic */ BytesLoaded(long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4);
    }

    public static /* synthetic */ BytesLoaded copy$default(BytesLoaded bytesLoaded, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bytesLoaded.total;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = bytesLoaded.video;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = bytesLoaded.audio;
        }
        return bytesLoaded.copy(j5, j6, j3, (i & 8) != 0 ? bytesLoaded.subtitles : j4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTotal() {
        return this.total;
    }

    /* renamed from: component2, reason: from getter */
    public final long getVideo() {
        return this.video;
    }

    /* renamed from: component3, reason: from getter */
    public final long getAudio() {
        return this.audio;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSubtitles() {
        return this.subtitles;
    }

    public final BytesLoaded copy(long total, long video, long audio, long subtitles) {
        return new BytesLoaded(total, video, audio, subtitles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BytesLoaded)) {
            return false;
        }
        BytesLoaded bytesLoaded = (BytesLoaded) other;
        return this.total == bytesLoaded.total && this.video == bytesLoaded.video && this.audio == bytesLoaded.audio && this.subtitles == bytesLoaded.subtitles;
    }

    public final long getAudio() {
        return this.audio;
    }

    public final long getSubtitles() {
        return this.subtitles;
    }

    public final long getTotal() {
        return this.total;
    }

    public final long getVideo() {
        return this.video;
    }

    public int hashCode() {
        return Long.hashCode(this.subtitles) + qv10.c(qv10.c(Long.hashCode(this.total) * 31, 31, this.video), 31, this.audio);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BytesLoaded(total=");
        sb.append(this.total);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", audio=");
        sb.append(this.audio);
        sb.append(", subtitles=");
        return b64.o(sb, this.subtitles, ')');
    }

    public BytesLoaded(long j, long j2, long j3, long j4) {
        this.total = j;
        this.video = j2;
        this.audio = j3;
        this.subtitles = j4;
    }

    public BytesLoaded() {
        this(0L, 0L, 0L, 0L, 15, null);
    }
}
