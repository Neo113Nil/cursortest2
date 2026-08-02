package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes4.dex */
public final class rbu implements rgl {
    public psb a;
    public final /* synthetic */ sbu b;

    public rbu(sbu sbuVar) {
        dcu dcuVar = dcu.One;
        this.b = sbuVar;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        ssg.a(3, null, "VideoCover: onPlayerError " + playbackException + StringUtil.SPACE + Thread.currentThread(), null);
        this.a = null;
        this.b.c.setValue(new mbu(playbackException));
    }

    @Override // defpackage.rgl
    public final void R(psb psbVar) {
        ssg.a(3, null, "VideoCover: onHidedPlayerReady " + Thread.currentThread(), null);
        this.a = psbVar;
    }

    @Override // defpackage.rgl
    public final void U() {
        ssg.a(3, null, "VideoCover: onLoadingStart " + Thread.currentThread(), null);
        this.b.c.setValue(nbu.a);
    }

    @Override // defpackage.rgl
    public final void g0() {
        ssg.a(3, null, "VideoCover: onLoadingFinished " + Thread.currentThread(), null);
        psb psbVar = this.a;
        if (psbVar != null) {
            dcu dcuVar = dcu.One;
            psbVar.w0(1);
            psbVar.d();
            this.b.c.setValue(new obu(psbVar));
        }
    }
}
