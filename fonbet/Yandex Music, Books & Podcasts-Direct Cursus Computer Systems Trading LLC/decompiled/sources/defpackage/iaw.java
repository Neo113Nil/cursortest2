package defpackage;

import android.net.Uri;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.IOException;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class iaw extends fr5 {
    public final b7q k;
    public final g7q l;
    public final ncl m;
    public final onh n;
    public final zss o;
    public final jyr p;
    public final jyr q;
    public js2 r;
    public final jyr s;
    public final tf6 t;
    public IOException u;
    public final gm5 v;

    public iaw(b7q b7qVar, g7q g7qVar, ncl nclVar, onh onhVar, zss zssVar) {
        this.k = b7qVar;
        this.l = g7qVar;
        this.m = nclVar;
        this.n = onhVar;
        this.o = zssVar;
        this.p = b7qVar.b(hag.I(vts.class), true);
        this.q = b7qVar.b(hag.I(xol.class), true);
        b7qVar.b(hag.I(tcl.class), true);
        this.s = btf.b(new p9w(29));
        this.t = gld.e(saf.p());
        this.v = hld.j();
    }

    @Override // defpackage.fr5
    public final void D(Object obj, wvh wvhVar, sis sisVar) {
        sisVar.getClass();
        y(sisVar);
    }

    public final void F(boolean z, long j, long j2) {
        x97.y(this.t, this.v.X() ? mal.b() : (bsd) mal.d.getValue(), null, new haw(this, z, j, j2, null), 2);
    }

    @Override // defpackage.wvh
    public final onh f() {
        return this.n;
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j) {
        zi7Var.getClass();
        js2 js2Var = this.r;
        js2Var.getClass();
        woh n = js2Var.n(uvhVar, zi7Var, j);
        n.getClass();
        return n;
    }

    @Override // defpackage.fr5, defpackage.wvh
    public final void p() {
        Uri uri;
        IOException iOException = this.u;
        if (iOException != null) {
            throw iOException;
        }
        try {
            super.p();
        } catch (NullPointerException e) {
            gnh gnhVar = this.n.b;
            kaw W = (gnhVar == null || (uri = gnhVar.a) == null) ? null : v3g.W(uri);
            Assertions.throwOrSkip("YandexMusicTrackMediaSource", new FailedAssertionException("NPE in DefaultHlsPlaylistTracker: mediaItem=" + W + " scope=" + gld.T((mm6) this.s.getValue()) + " delegate=" + this.r, e));
        }
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        wohVar.getClass();
        js2 js2Var = this.r;
        js2Var.getClass();
        js2Var.s(wohVar);
    }

    @Override // defpackage.js2
    public final void x(t6t t6tVar) {
        this.j = t6tVar;
        this.i = dvt.p(null);
        x97.y((mm6) this.s.getValue(), null, null, new y6v(this, (Continuation) null, 21), 3);
    }

    @Override // defpackage.fr5, defpackage.js2
    public final void z() {
        Uri uri;
        super.z();
        gld.L((mm6) this.s.getValue(), null);
        gld.L(this.t, null);
        this.r = null;
        this.u = null;
        gnh gnhVar = this.n.b;
        if (gnhVar == null || (uri = gnhVar.a) == null) {
            xq0.x("Uri null on releaseSourceInternal");
            return;
        }
        kaw W = v3g.W(uri);
        zvs zvsVar = W.a;
        String str = W.g;
        zss zssVar = this.o;
        zssVar.getClass();
        zvsVar.getClass();
        if (zssVar.b.remove(new yss(zvsVar, str))) {
            ssg.a(3, "TrackContentLocker", "releaseTrack: " + zvsVar + ", playableId: " + str, null);
            zssVar.a.b.O(zvsVar);
        }
    }
}
