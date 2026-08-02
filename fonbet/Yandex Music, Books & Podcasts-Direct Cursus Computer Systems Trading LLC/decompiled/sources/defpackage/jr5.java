package defpackage;

import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public final class jr5 implements u9l {
    public final ed6 a;
    public final rk2 b;
    public final lg7 c;
    public final rqa d;
    public final xra e;
    public final fgg f;
    public final sgu g;

    public jr5(ed6 ed6Var, rk2 rk2Var, lg7 lg7Var, rqa rqaVar, xra xraVar, fgg fggVar, sgu sguVar) {
        this.a = ed6Var;
        this.b = rk2Var;
        this.c = lg7Var;
        this.d = rqaVar;
        this.e = xraVar;
        this.f = fggVar;
        this.g = sguVar;
    }

    @Override // defpackage.u9l
    public final void B(long j, long j2) {
        this.f.B(j, j2);
    }

    @Override // defpackage.u9l
    public final void F(long j) {
        this.b.F(j);
    }

    @Override // defpackage.u9l
    public final void G(long j, TrackType trackType) {
        this.f.G(j, trackType);
    }

    @Override // defpackage.u9l
    public final void I(LoadError loadError) {
        this.f.I(loadError);
    }

    @Override // defpackage.u9l
    public final void K(TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
        trackType.getClass();
        str.getClass();
        this.c.K(trackType, str, mediaCodecSelectorLog);
    }

    @Override // defpackage.u9l
    public final void c(int i, long j, long j2) {
        this.f.c(i, j, j2);
    }

    @Override // defpackage.u9l
    public final void h(int i) {
        this.e.h(i);
    }

    @Override // defpackage.u9l
    public final void j(PreparingParams preparingParams) {
        preparingParams.getClass();
        this.a.j(preparingParams);
    }

    @Override // defpackage.u9l
    public final void k(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        this.c.k(isbVar, mediaCodecReuseLog);
    }

    @Override // defpackage.u9l
    public final void o0(Size size) {
        this.g.o0(size);
    }

    @Override // defpackage.u9l
    public final void r(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        this.c.r(isbVar, mediaCodecReuseLog);
    }

    @Override // defpackage.u9l
    public final void s(VideoType videoType, StreamType streamType) {
        this.a.s(videoType, streamType);
    }

    @Override // defpackage.u9l
    public final void y(DrmType drmType) {
        drmType.getClass();
        this.d.y(drmType);
    }
}
