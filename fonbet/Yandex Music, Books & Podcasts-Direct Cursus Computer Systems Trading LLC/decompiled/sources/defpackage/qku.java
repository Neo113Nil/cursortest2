package defpackage;

import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class qku implements rgl {
    public final paw a;
    public final ihs b;

    public qku(paw pawVar, ihs ihsVar) {
        pawVar.getClass();
        this.a = pawVar;
        this.b = ihsVar;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        this.b.d();
    }

    @Override // defpackage.rgl
    public final void U() {
        this.b.d();
    }

    @Override // defpackage.rgl
    public final void a() {
        this.b.c();
    }

    @Override // defpackage.rgl
    public final void e() {
        this.b.d();
    }

    @Override // defpackage.rgl
    public final void f() {
        this.b.d();
    }

    @Override // defpackage.rgl
    public final void g0() {
        paw pawVar = this.a;
        if (!pawVar.e() || pawVar.i()) {
            return;
        }
        this.b.c();
    }
}
