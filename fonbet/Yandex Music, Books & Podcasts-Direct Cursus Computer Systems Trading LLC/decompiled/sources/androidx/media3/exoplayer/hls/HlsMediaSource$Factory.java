package androidx.media3.exoplayer.hls;

import defpackage.aaw;
import defpackage.es6;
import defpackage.gra;
import defpackage.hra;
import defpackage.klx;
import defpackage.l0e;
import defpackage.mvt;
import defpackage.onh;
import defpackage.pt0;
import defpackage.rj7;
import defpackage.rwd;
import defpackage.sld;
import defpackage.tvh;
import defpackage.va7;
import defpackage.vm7;
import defpackage.vq1;
import defpackage.xeg;
import defpackage.ym7;
import defpackage.yzd;
import java.util.List;

/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements tvh {
    public final sld a;
    public vm7 b;
    public mvt c;
    public l0e e;
    public final rwd g;
    public xeg i;
    public hra h = new es6(4);
    public final rj7 f = ym7.o;
    public final int k = 1;
    public final long l = -9223372036854775807L;
    public final boolean j = true;
    public boolean d = true;

    public HlsMediaSource$Factory(va7 va7Var) {
        this.a = new sld(26, va7Var);
        int i = 19;
        this.e = new aaw(i);
        this.i = new klx(i);
        this.g = new rwd(i);
    }

    @Override // defpackage.tvh
    public final void a(mvt mvtVar) {
        this.c = mvtVar;
    }

    @Override // defpackage.tvh
    public final void c(boolean z) {
        this.d = z;
    }

    @Override // defpackage.tvh
    public final tvh e(hra hraVar) {
        vq1.y(hraVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.h = hraVar;
        return this;
    }

    @Override // defpackage.tvh
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final yzd d(onh onhVar) {
        onhVar.b.getClass();
        if (this.b == null) {
            this.b = new vm7(true);
        }
        mvt mvtVar = this.c;
        if (mvtVar != null) {
            this.b.c = mvtVar;
        }
        vm7 vm7Var = this.b;
        vm7Var.a = this.d;
        vm7Var.getClass();
        l0e l0eVar = this.e;
        List list = onhVar.b.e;
        if (!list.isEmpty()) {
            l0eVar = new pt0(l0eVar, list);
        }
        gra v = this.h.v(onhVar);
        xeg xegVar = this.i;
        this.f.getClass();
        sld sldVar = this.a;
        return new yzd(onhVar, sldVar, vm7Var, this.g, v, xegVar, new ym7(sldVar, xegVar, l0eVar), this.l, this.j, this.k);
    }

    @Override // defpackage.tvh
    public final void b() {
    }
}
