package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v8w implements c97 {
    public final ogg a;
    public final int[] b;
    public final int c;
    public final db7 d;
    public final long e;
    public final pcl f;
    public final uk7[] g;
    public zsb h;
    public d97 i;
    public int j;
    public IOException k;
    public boolean l;

    public v8w(bz2 bz2Var, ogg oggVar, d97 d97Var, kkp kkpVar, int i, int[] iArr, zsb zsbVar, int i2, db7 db7Var, long j, boolean z, ArrayList arrayList, pcl pclVar) {
        this.a = oggVar;
        this.i = d97Var;
        this.b = iArr;
        this.h = zsbVar;
        int i3 = i2;
        this.c = i3;
        this.d = db7Var;
        this.j = i;
        this.e = j;
        pcl pclVar2 = pclVar;
        this.f = pclVar2;
        long d = d97Var.d(i);
        ArrayList k = k();
        this.g = new uk7[zsbVar.length()];
        int i4 = 0;
        while (i4 < this.g.length) {
            a0o a0oVar = (a0o) k.get(zsbVar.f(i4));
            mu2 F = kkpVar.F(a0oVar.b);
            long j2 = d;
            this.g[i4] = new uk7(j2, a0oVar, F == null ? (mu2) a0oVar.b.get(0) : F, bz2Var.r(i3, a0oVar.a, z, arrayList, pclVar2), 0L, a0oVar.b(), 1);
            i4++;
            pclVar2 = pclVar;
            d = j2;
            i3 = i2;
        }
        if (d97Var instanceof z8w) {
        }
    }

    @Override // defpackage.xk4
    public final void a() {
        for (uk7 uk7Var : this.g) {
            xk3 xk3Var = (xk3) uk7Var.b;
            if (xk3Var != null) {
                xk3Var.a.a();
            }
        }
    }

    @Override // defpackage.xk4
    public final void b() {
        IOException iOException = this.k;
        if (iOException != null) {
            throw iOException;
        }
        this.a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r3 < (((r10.H() + r8) + r11) - 1)) goto L15;
     */
    @Override // defpackage.xk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j, hap hapVar) {
        long j2;
        long j3 = j;
        uk7[] uk7VarArr = this.g;
        int length = uk7VarArr.length;
        int i = 0;
        while (i < length) {
            uk7 uk7Var = uk7VarArr[i];
            o97 o97Var = (o97) uk7Var.e;
            long j4 = uk7Var.g;
            o97 o97Var2 = (o97) uk7Var.e;
            if (o97Var != null) {
                long f = uk7Var.f();
                if (f != 0) {
                    vq1.B(o97Var2);
                    long p = o97Var2.p(j3, uk7Var.f) + j4;
                    long h = uk7Var.h(p);
                    if (h < j3) {
                        if (f != -1) {
                            vq1.B(o97Var2);
                        }
                        j2 = uk7Var.h(p + 1);
                        return hapVar.a(j3, h, j2);
                    }
                    j2 = h;
                    return hapVar.a(j3, h, j2);
                }
            }
            i++;
            j3 = j;
        }
        return j;
    }

    @Override // defpackage.xk4
    public final boolean f(long j, sk4 sk4Var, List list) {
        if (this.k != null) {
            return false;
        }
        dvt.H(this.e);
        return this.h.d(j, sk4Var, list);
    }

    @Override // defpackage.xk4
    public final int g(List list, long j) {
        return (this.k != null || this.h.length() < 2) ? list.size() : this.h.v(list, j);
    }

    @Override // defpackage.c97
    public final void j(zsb zsbVar) {
        this.h = zsbVar;
    }

    public final ArrayList k() {
        List list = this.i.b(this.j).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.b) {
            arrayList.addAll(((nj) list.get(i)).c);
        }
        return arrayList;
    }
}
