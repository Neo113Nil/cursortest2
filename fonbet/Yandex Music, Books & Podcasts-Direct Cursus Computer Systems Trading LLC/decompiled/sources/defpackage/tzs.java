package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes4.dex */
public final class tzs implements f8l {
    public final /* synthetic */ ExoPlayer a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ kvm c;
    public final /* synthetic */ tqn d;
    public final /* synthetic */ ltm e;

    public tzs(ExoPlayer exoPlayer, Long l, kvm kvmVar, tqn tqnVar, ltm ltmVar) {
        this.a = exoPlayer;
        this.b = l;
        this.c = kvmVar;
        this.d = tqnVar;
        this.e = ltmVar;
    }

    @Override // defpackage.f8l
    public final void X(boolean z) {
        if (z) {
            lco.u(this.a, this.b, this.c, this.d, this.e);
        }
    }

    @Override // defpackage.f8l
    public final void p(int i) {
        if (i == 3) {
            lco.u(this.a, this.b, this.c, this.d, this.e);
        }
    }

    @Override // defpackage.f8l
    public final void u(int i, g8l g8lVar, g8l g8lVar2) {
        g8lVar.getClass();
        g8lVar2.getClass();
        if (i == 1) {
            lco.u(this.a, this.b, this.c, this.d, this.e);
        }
    }
}
