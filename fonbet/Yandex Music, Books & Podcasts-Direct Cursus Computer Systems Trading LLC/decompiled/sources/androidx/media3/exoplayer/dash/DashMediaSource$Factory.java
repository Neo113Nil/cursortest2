package androidx.media3.exoplayer.dash;

import defpackage.b97;
import defpackage.c8k;
import defpackage.es6;
import defpackage.f97;
import defpackage.hra;
import defpackage.ix6;
import defpackage.klx;
import defpackage.mvt;
import defpackage.n97;
import defpackage.onh;
import defpackage.rwd;
import defpackage.tvh;
import defpackage.va7;
import defpackage.vq1;
import defpackage.wvh;
import defpackage.x0;
import defpackage.xeg;
import defpackage.xiu;
import java.util.List;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements tvh {
    public final b97 a;
    public final va7 b;
    public hra c;
    public final rwd d;
    public xeg e;
    public final long f;
    public final long g;
    public ix6 h;

    public DashMediaSource$Factory(b97 b97Var, va7 va7Var) {
        this.a = b97Var;
        this.b = va7Var;
        this.c = new es6(4);
        this.e = new klx(19);
        this.f = 30000L;
        this.g = 5000000L;
        this.d = new rwd(19);
        b97Var.c(true);
    }

    @Override // defpackage.tvh
    public final void a(mvt mvtVar) {
        this.a.a(mvtVar);
    }

    @Override // defpackage.tvh
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.tvh
    public final void c(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.tvh
    public final wvh d(onh onhVar) {
        onhVar.b.getClass();
        c8k c8kVar = this.h;
        if (c8kVar == null) {
            c8kVar = new f97();
        }
        List list = onhVar.b.e;
        return new n97(onhVar, this.b, !list.isEmpty() ? new xiu(26, c8kVar, list) : c8kVar, this.a, this.d, this.c.v(onhVar), this.e, this.f, this.g);
    }

    @Override // defpackage.tvh
    public final tvh e(hra hraVar) {
        vq1.y(hraVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = hraVar;
        return this;
    }

    public DashMediaSource$Factory(va7 va7Var) {
        this(new x0(va7Var), va7Var);
    }
}
