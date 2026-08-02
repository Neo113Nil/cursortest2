package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.source.b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ulq extends js2 {
    public final nb7 h;
    public final va7 i;
    public final dsc j;
    public final xeg l;
    public final b n;
    public final onh o;
    public t6t p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public ulq(mnh mnhVar, va7 va7Var, xeg xegVar) {
        dnh dnhVar;
        gnh gnhVar;
        this.i = va7Var;
        this.l = xegVar;
        boolean z = true;
        xmh xmhVar = new xmh();
        bnh bnhVar = new bnh();
        List list = Collections.EMPTY_LIST;
        qsn qsnVar = qsn.e;
        dnh dnhVar2 = new dnh();
        jnh jnhVar = jnh.d;
        Uri uri = Uri.EMPTY;
        String uri2 = mnhVar.a.toString();
        uri2.getClass();
        yde v = yde.v(yde.y(mnhVar));
        if (((Uri) bnhVar.e) != null && ((UUID) bnhVar.d) == null) {
            z = false;
        }
        vq1.A(z);
        if (uri != null) {
            cnh cnhVar = ((UUID) bnhVar.d) != null ? new cnh(bnhVar) : null;
            dnhVar = dnhVar2;
            gnhVar = new gnh(uri, null, cnhVar, null, list, null, v, -9223372036854775807L);
        } else {
            dnhVar = dnhVar2;
            gnhVar = null;
        }
        onh onhVar = new onh(uri2, new anh(xmhVar), gnhVar, new fnh(dnhVar), hoh.K, jnhVar);
        this.o = onhVar;
        bsc bscVar = new bsc();
        bscVar.m = l5i.p((String) ezf.A(mnhVar.b, "text/x-unknown"));
        bscVar.d = mnhVar.c;
        bscVar.e = mnhVar.d;
        bscVar.f = mnhVar.e;
        bscVar.b = mnhVar.f;
        String str = mnhVar.g;
        bscVar.a = str != null ? str : null;
        this.j = new dsc(bscVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = mnhVar.a;
        vq1.C(uri3, "The uri must be set.");
        this.h = new nb7(uri3, 0L, 1, null, map, 0L, -1L, null, 1);
        this.n = new b(-9223372036854775807L, true, false, onhVar);
    }

    @Override // defpackage.wvh
    public final onh f() {
        return this.o;
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j) {
        return new tlq(this.h, this.i, this.p, this.j, this.k, this.l, t(uvhVar), this.m, null);
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        ((tlq) wohVar).i.P(null);
    }

    @Override // defpackage.js2
    public final void x(t6t t6tVar) {
        this.p = t6tVar;
        y(this.n);
    }

    @Override // defpackage.wvh
    public final void p() {
    }

    @Override // defpackage.js2
    public final void z() {
    }
}
