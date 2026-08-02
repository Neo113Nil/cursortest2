package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class y5u implements rgl {
    public final /* synthetic */ a6u a;

    public y5u(a6u a6uVar) {
        this.a = a6uVar;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        ssg.a(3, "VideoClipPlayer", "onPlayerError " + playbackException, null);
        a6u a6uVar = this.a;
        ((g4u) a6uVar.c.getValue()).a.l(null);
        qld.J(new x5u(a6uVar, 2));
    }

    @Override // defpackage.rgl
    public final void R(psb psbVar) {
        a6u a6uVar = this.a;
        k5r.v("onHidedPlayerReady ", a6uVar.g, 3, "VideoClipPlayer", null);
        ((g4u) a6uVar.c.getValue()).a.l(psbVar);
    }

    @Override // defpackage.rgl
    public final void a() {
        ssg.a(3, "VideoClipPlayer", "onResumePlayback", null);
    }

    @Override // defpackage.rgl
    public final void e() {
        ssg.a(3, "VideoClipPlayer", "onPlaybackEnded", null);
        a6u.y(this.a, tnl.e);
    }

    @Override // defpackage.rgl
    public final void f() {
        ssg.a(3, "VideoClipPlayer", "onPausePlayback", null);
    }

    @Override // defpackage.rgl
    public final void l() {
        ssg.a(3, "VideoClipPlayer", "onFirstFrame", null);
    }

    @Override // defpackage.rgl
    public final void v() {
        gbw gbwVar;
        a6u a6uVar = this.a;
        boolean z = a6uVar.g;
        w1f w1fVar = a6uVar.e;
        ssg.a(3, "VideoClipPlayer", hrg.t("onReadyForFirstPlayback(playWhenReady=", z, ", muted=", ((AtomicBoolean) w1fVar.b).get(), ")"), null);
        if (((AtomicBoolean) w1fVar.b).get() && (gbwVar = a6uVar.d) != null) {
            gbwVar.t(0.0f);
        }
        boolean z2 = a6uVar.g;
        if (z2) {
            gbw gbwVar2 = a6uVar.d;
            if (gbwVar2 != null) {
                gbwVar2.d();
            }
        } else if (z2) {
            b6e.s();
            return;
        } else {
            gbw gbwVar3 = a6uVar.d;
            if (gbwVar3 != null) {
                gbwVar3.b();
            }
        }
        a6u.y(a6uVar, tnl.d);
    }
}
