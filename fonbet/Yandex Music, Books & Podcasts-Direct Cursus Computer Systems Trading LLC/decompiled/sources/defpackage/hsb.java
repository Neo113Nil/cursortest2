package defpackage;

import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public final class hsb {
    public static final hsb e = new hsb("", TrackType.Video, new kjr(0, 0, 0), new dsc(new bsc()), StreamType.Unknown, false);
    public final TrackType a;
    public final kjr b;
    public final dsc c;
    public final boolean d;

    public hsb(String str, TrackType trackType, kjr kjrVar, dsc dscVar, StreamType streamType, boolean z) {
        trackType.getClass();
        streamType.getClass();
        this.a = trackType;
        this.b = kjrVar;
        this.c = dscVar;
        this.d = z;
    }

    public final String toString() {
        return p6g.r(this);
    }
}
