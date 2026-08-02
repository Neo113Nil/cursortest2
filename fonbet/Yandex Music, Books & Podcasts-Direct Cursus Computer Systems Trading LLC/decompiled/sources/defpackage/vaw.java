package defpackage;

import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public final class vaw implements u9l {
    public final /* synthetic */ vg7 a;

    public vaw(vg7 vg7Var) {
        this.a = vg7Var;
    }

    @Override // defpackage.u9l
    public final void J(mka mkaVar) {
        this.a.J(mkaVar);
    }

    @Override // defpackage.u9l
    public final void K(TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
        trackType.getClass();
        str.getClass();
        this.a.K(trackType, str, mediaCodecSelectorLog);
    }

    @Override // defpackage.u9l
    public final void i(mka mkaVar) {
        this.a.i(mkaVar);
    }

    @Override // defpackage.u9l
    public final void k(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        this.a.k(isbVar, mediaCodecReuseLog);
    }

    @Override // defpackage.u9l
    public final void r(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
        this.a.r(isbVar, mediaCodecReuseLog);
    }
}
