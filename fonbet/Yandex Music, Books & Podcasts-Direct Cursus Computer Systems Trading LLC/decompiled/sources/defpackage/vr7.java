package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class vr7 implements xk4 {
    public final ogg a;
    public final int b;
    public final xk3[] c;
    public final db7 d;
    public zsb e;
    public n9r f;
    public int g;
    public yy2 h;

    public vr7(ogg oggVar, n9r n9rVar, int i, zsb zsbVar, db7 db7Var, mvt mvtVar, boolean z) {
        lvs[] lvsVarArr;
        this.a = oggVar;
        this.f = n9rVar;
        this.b = i;
        this.e = zsbVar;
        this.d = db7Var;
        m9r m9rVar = n9rVar.f[i];
        this.c = new xk3[zsbVar.length()];
        for (int i2 = 0; i2 < this.c.length; i2++) {
            int f = zsbVar.f(i2);
            dsc dscVar = m9rVar.j[f];
            if (dscVar.r != null) {
                l9r l9rVar = n9rVar.e;
                l9rVar.getClass();
                lvsVarArr = l9rVar.c;
            } else {
                lvsVarArr = null;
            }
            lvs[] lvsVarArr2 = lvsVarArr;
            int i3 = m9rVar.a;
            int i4 = i3 == 2 ? 4 : 0;
            long j = m9rVar.c;
            long j2 = n9rVar.g;
            this.c[i2] = new xk3(new jvc(mvtVar, !z ? 35 : 3, null, new oqs(f, i3, j, -9223372036854775807L, j2, j2, dscVar, 0, lvsVarArr2, i4, null, null), qsn.e, null), m9rVar.a, dscVar);
        }
    }

    @Override // defpackage.xk4
    public final void a() {
        for (xk3 xk3Var : this.c) {
            xk3Var.a.a();
        }
    }

    @Override // defpackage.xk4
    public final void b() {
        yy2 yy2Var = this.h;
        if (yy2Var != null) {
            throw yy2Var;
        }
        this.a.b();
    }

    @Override // defpackage.xk4
    public final long c(long j, hap hapVar) {
        m9r m9rVar = this.f.f[this.b];
        int e = dvt.e(m9rVar.o, j, true);
        long[] jArr = m9rVar.o;
        long j2 = jArr[e];
        return hapVar.a(j, j2, (j2 >= j || e >= m9rVar.k - 1) ? j2 : jArr[e + 1]);
    }

    @Override // defpackage.xk4
    public final boolean e(sk4 sk4Var, boolean z, j4x j4xVar, xeg xegVar) {
        mdr L = xegVar.L(wxf.r(this.e), j4xVar);
        if (!z || L == null || L.a != 2) {
            return false;
        }
        zsb zsbVar = this.e;
        return zsbVar.h(zsbVar.o(sk4Var.d), L.b);
    }

    @Override // defpackage.xk4
    public final boolean f(long j, sk4 sk4Var, List list) {
        if (this.h != null) {
            return false;
        }
        return this.e.d(j, sk4Var, list);
    }

    @Override // defpackage.xk4
    public final int g(List list, long j) {
        return (this.h != null || this.e.length() < 2) ? list.size() : this.e.v(list, j);
    }

    @Override // defpackage.xk4
    public final void i(dhg dhgVar, long j, List list, bz2 bz2Var) {
        List list2;
        int b;
        long c;
        zsb zsbVar;
        if (this.h != null) {
            return;
        }
        m9r[] m9rVarArr = this.f.f;
        int i = this.b;
        m9r m9rVar = m9rVarArr[i];
        int i2 = m9rVar.k;
        long[] jArr = m9rVar.o;
        if (i2 == 0) {
            bz2Var.b = !r4.d;
            return;
        }
        if (list.isEmpty()) {
            b = dvt.e(jArr, j, true);
            list2 = list;
        } else {
            list2 = list;
            b = (int) (((dih) list2.get(list.size() - 1)).b() - this.g);
            if (b < 0) {
                this.h = new yy2();
                return;
            }
        }
        if (b >= m9rVar.k) {
            bz2Var.b = !this.f.d;
            return;
        }
        long j2 = dhgVar.a;
        long j3 = j - j2;
        n9r n9rVar = this.f;
        if (n9rVar.d) {
            m9r m9rVar2 = n9rVar.f[i];
            int i3 = m9rVar2.k - 1;
            c = (m9rVar2.c(i3) + m9rVar2.o[i3]) - j2;
        } else {
            c = -9223372036854775807L;
        }
        int length = this.e.length();
        eih[] eihVarArr = new eih[length];
        int i4 = 0;
        while (true) {
            zsbVar = this.e;
            if (i4 >= length) {
                break;
            }
            zsbVar.f(i4);
            eihVarArr[i4] = new vk7(m9rVar, b);
            i4++;
        }
        zsbVar.m(j2, j3, c, list2, eihVarArr);
        long j4 = jArr[b];
        long c2 = m9rVar.c(b) + j4;
        long j5 = list.isEmpty() ? j : -9223372036854775807L;
        int i5 = this.g + b;
        int b2 = this.e.b();
        xk3 xk3Var = this.c[b2];
        Uri a = m9rVar.a(this.e.f(b2), b);
        SystemClock.elapsedRealtime();
        dsc s = this.e.s();
        int t = this.e.t();
        Object j6 = this.e.j();
        Map map = Collections.EMPTY_MAP;
        vq1.C(a, "The uri must be set.");
        bz2Var.c = new hb6(this.d, new nb7(a, 0L, 1, null, map, 0L, -1L, null, 0), s, t, j6, j4, c2, j5, -9223372036854775807L, i5, 1, j4, xk3Var);
    }

    @Override // defpackage.xk4
    public final void d(sk4 sk4Var) {
    }
}
