package defpackage;

import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class kr5 implements rgl {
    public final qi3 a;
    public final g4t b;
    public final ggb c;

    public kr5(qi3 qi3Var, g4t g4tVar, ggb ggbVar) {
        this.a = qi3Var;
        this.b = g4tVar;
        this.c = ggbVar;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        this.c.P(playbackException);
    }

    @Override // defpackage.rgl
    public final void o(nqs nqsVar, nqs nqsVar2, nqs nqsVar3) {
        nqsVar.getClass();
        nqsVar2.getClass();
        nqsVar3.getClass();
        this.b.o(nqsVar, nqsVar2, nqsVar3);
    }

    @Override // defpackage.rgl
    public final void z(long j) {
        this.a.z(j);
    }
}
