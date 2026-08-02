package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes6.dex */
public final class knm implements zbl {
    public final ExoPlayer a;
    public final lnm b;
    public boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile Long f;
    public final Object g;
    public final chs h;

    public knm(ExoPlayer exoPlayer, lnm lnmVar) {
        exoPlayer.getClass();
        this.a = exoPlayer;
        this.b = lnmVar;
        this.g = new Object();
        this.h = new chs();
    }

    @Override // defpackage.zbl
    public final void a() {
        this.d = true;
    }

    @Override // defpackage.zbl
    public final void e() {
        v();
        this.d = false;
    }

    @Override // defpackage.zbl
    public final void f() {
        v();
        this.d = false;
    }

    @Override // defpackage.zbl
    public final void n(boolean z) {
        if (!this.d && z && this.a.c() == 2) {
            o();
        }
        this.e = z;
    }

    public final void o() {
        synchronized (this.g) {
            if (!this.c) {
                this.b.a.a(-3999);
                this.c = true;
            }
        }
    }

    @Override // defpackage.zbl
    public final void onStop(boolean z) {
        v();
        this.d = false;
    }

    public final void v() {
        synchronized (this.g) {
            if (this.c) {
                this.b.a.d(-3999);
                this.c = false;
            }
        }
    }

    @Override // defpackage.zbl
    public final void z(long j) {
        if (this.e && this.d) {
            if (this.a.t0() == this.a.getDuration()) {
                v();
                return;
            }
            if (j <= 3000) {
                o();
            } else if (j <= 6000) {
                this.h.a("PreloadPriorityControllerImpl", "checkBufferDelta", null, new Object[0]);
                Long l = this.f;
                if (l != null) {
                    long longValue = l.longValue();
                    if ((longValue > j || j - longValue > 1900) && longValue <= j) {
                        v();
                    } else {
                        o();
                    }
                }
            } else if (j > 6000) {
                v();
            }
            this.f = Long.valueOf(j);
        }
    }
}
