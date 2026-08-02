package androidx.media3.exoplayer.smoothstreaming;

import defpackage.c8k;
import defpackage.es6;
import defpackage.f4m;
import defpackage.hra;
import defpackage.ix6;
import defpackage.klx;
import defpackage.mvt;
import defpackage.onh;
import defpackage.r0o;
import defpackage.rwd;
import defpackage.tvh;
import defpackage.u9r;
import defpackage.va7;
import defpackage.vq1;
import defpackage.wvh;
import defpackage.xeg;
import defpackage.xiu;
import java.util.List;

/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements tvh {
    public final r0o a;
    public final va7 b;
    public final rwd c;
    public hra d;
    public xeg e;
    public final long f;
    public ix6 g;

    public SsMediaSource$Factory(r0o r0oVar, va7 va7Var) {
        this.a = r0oVar;
        this.b = va7Var;
        this.d = new es6(4);
        this.e = new klx(19);
        this.f = 30000L;
        this.c = new rwd(19);
        r0oVar.b = true;
    }

    @Override // defpackage.tvh
    public final void a(mvt mvtVar) {
        this.a.d = mvtVar;
    }

    @Override // defpackage.tvh
    public final void c(boolean z) {
        this.a.b = z;
    }

    @Override // defpackage.tvh
    public final wvh d(onh onhVar) {
        onhVar.b.getClass();
        c8k c8kVar = this.g;
        if (c8kVar == null) {
            c8kVar = new f4m(14);
        }
        List list = onhVar.b.e;
        return new u9r(onhVar, this.b, !list.isEmpty() ? new xiu(26, c8kVar, list) : c8kVar, this.a, this.c, this.d.v(onhVar), this.e, this.f);
    }

    @Override // defpackage.tvh
    public final tvh e(hra hraVar) {
        vq1.y(hraVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = hraVar;
        return this;
    }

    public SsMediaSource$Factory(va7 va7Var) {
        this(new r0o(va7Var), va7Var);
    }
}
