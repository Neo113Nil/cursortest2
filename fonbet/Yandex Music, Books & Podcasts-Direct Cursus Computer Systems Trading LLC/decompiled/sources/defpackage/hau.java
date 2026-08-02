package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes4.dex */
public final class hau implements rgl {
    public psb a;
    public final /* synthetic */ dcu b;
    public final /* synthetic */ jtm c;

    public hau(dcu dcuVar, jtm jtmVar) {
        this.b = dcuVar;
        this.c = jtmVar;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        ssg.a(3, null, "VideoCover: onPlayerError " + playbackException + StringUtil.SPACE + Thread.currentThread(), null);
        this.a = null;
        this.c.setValue(new mbu(playbackException));
    }

    @Override // defpackage.rgl
    public final void R(psb psbVar) {
        ssg.a(3, null, "VideoCover: onHidedPlayerReady " + Thread.currentThread(), null);
        this.a = psbVar;
    }

    @Override // defpackage.rgl
    public final void U() {
        ssg.a(3, null, "VideoCover: onLoadingStart " + Thread.currentThread(), null);
        this.c.setValue(nbu.a);
    }

    @Override // defpackage.rgl
    public final void g0() {
        ssg.a(3, null, "VideoCover: onLoadingFinished " + Thread.currentThread(), null);
        psb psbVar = this.a;
        if (psbVar != null) {
            psbVar.w0(this.b.a);
            psbVar.d();
            this.c.setValue(new obu(psbVar));
        }
    }
}
