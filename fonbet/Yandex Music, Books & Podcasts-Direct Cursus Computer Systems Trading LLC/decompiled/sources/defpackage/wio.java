package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public final class wio implements woh {
    public final zi7 a;
    public final Handler b = dvt.p(null);
    public final m97 c;
    public final rio d;
    public final ArrayList e;
    public final ArrayList f;
    public final kpm g;
    public final aio h;
    public voh i;
    public qsn j;
    public IOException k;
    public pg5 l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;

    public wio(zi7 zi7Var, aio aioVar, Uri uri, kpm kpmVar, String str, SocketFactory socketFactory) {
        this.a = zi7Var;
        this.h = aioVar;
        this.g = kpmVar;
        m97 m97Var = new m97(1, this);
        this.c = m97Var;
        this.d = new rio(m97Var, m97Var, str, uri, socketFactory);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.n = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    public static void b(wio wioVar) {
        ArrayList arrayList = wioVar.e;
        wioVar.p = true;
        for (int i = 0; i < arrayList.size(); i++) {
            wioVar.p &= ((vio) arrayList.get(i)).d;
        }
    }

    public static void d(wio wioVar) {
        ArrayList arrayList = wioVar.e;
        if (wioVar.r || wioVar.s) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((vio) arrayList.get(i2)).c.s() == null) {
                return;
            }
        }
        wioVar.s = true;
        yde v = yde.v(arrayList);
        hld.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = 0;
        while (i < v.size()) {
            zno znoVar = ((vio) v.get(i)).c;
            String num = Integer.toString(i);
            dsc s = znoVar.s();
            s.getClass();
            xvs xvsVar = new xvs(num, s);
            int i4 = i3 + 1;
            int e = pde.e(objArr.length, i4);
            if (e > objArr.length) {
                objArr = Arrays.copyOf(objArr, e);
            }
            objArr[i3] = xvsVar;
            i++;
            i3 = i4;
        }
        wioVar.j = yde.t(i3, objArr);
        voh vohVar = wioVar.i;
        vohVar.getClass();
        vohVar.g(wioVar);
    }

    public static void g(wio wioVar) {
        ArrayList arrayList = wioVar.f;
        ArrayList arrayList2 = wioVar.e;
        wioVar.v = true;
        rio rioVar = wioVar.d;
        rioVar.getClass();
        try {
            rioVar.close();
            bjo bjoVar = new bjo(new atn(rioVar));
            rioVar.i = bjoVar;
            bjoVar.a(rioVar.g(rioVar.h));
            rioVar.k = null;
            rioVar.q = false;
            rioVar.n = null;
        } catch (IOException e) {
            rioVar.b.c(new pg5(e));
        }
        aio b = wioVar.h.b();
        if (b == null) {
            wioVar.l = new pg5("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList2.size(); i++) {
            vio vioVar = (vio) arrayList2.get(i);
            boolean z = vioVar.d;
            uio uioVar = vioVar.a;
            if (z) {
                arrayList3.add(vioVar);
            } else {
                vio vioVar2 = new vio(wioVar, uioVar.a, i, b);
                arrayList3.add(vioVar2);
                uio uioVar2 = vioVar2.a;
                vioVar2.b.X(uioVar2.b, wioVar.c, 0);
                if (arrayList.contains(uioVar)) {
                    arrayList4.add(uioVar2);
                }
            }
        }
        yde v = yde.v(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList.clear();
        arrayList.addAll(arrayList4);
        for (int i2 = 0; i2 < v.size(); i2++) {
            ((vio) v.get(i2)).a();
        }
    }

    @Override // defpackage.woh
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        for (int i = 0; i < zsbVarArr.length; i++) {
            if (aooVarArr[i] != null && (zsbVarArr[i] == null || !zArr[i])) {
                aooVarArr[i] = null;
            }
        }
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        int i2 = 0;
        while (true) {
            int length = zsbVarArr.length;
            arrayList = this.e;
            if (i2 >= length) {
                break;
            }
            zsb zsbVar = zsbVarArr[i2];
            if (zsbVar != null) {
                xvs n = zsbVar.n();
                qsn qsnVar = this.j;
                qsnVar.getClass();
                int indexOf = qsnVar.indexOf(n);
                vio vioVar = (vio) arrayList.get(indexOf);
                vioVar.getClass();
                arrayList2.add(vioVar.a);
                if (this.j.contains(n) && aooVarArr[i2] == null) {
                    aooVarArr[i2] = new j4x(this, indexOf, 17);
                    zArr2[i2] = true;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            vio vioVar2 = (vio) arrayList.get(i3);
            if (!arrayList2.contains(vioVar2.a)) {
                vioVar2.a();
            }
        }
        this.t = true;
        if (j != 0) {
            this.m = j;
            this.n = j;
            this.o = j;
        }
        o();
        return j;
    }

    @Override // defpackage.ahp
    public final long e() {
        return r();
    }

    @Override // defpackage.ahp
    public final boolean f() {
        if (this.p) {
            return false;
        }
        int i = this.d.o;
        return i == 2 || i == 1;
    }

    @Override // defpackage.woh
    public final long h(long j) {
        if (r() == 0 && !this.v) {
            this.o = j;
            return j;
        }
        s(j, false);
        this.m = j;
        if (j()) {
            rio rioVar = this.d;
            int i = rioVar.o;
            if (i != 1) {
                if (i != 2) {
                    e7o.n();
                    return 0L;
                }
                this.n = j;
                rioVar.o(j);
                return j;
            }
        } else {
            ArrayList arrayList = this.e;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((vio) arrayList.get(i2)).c.C(j, false)) {
                    i2++;
                } else {
                    this.n = j;
                    if (this.p) {
                        for (int i3 = 0; i3 < this.e.size(); i3++) {
                            vio vioVar = (vio) this.e.get(i3);
                            vq1.A(vioVar.d);
                            vioVar.d = false;
                            b(vioVar.f);
                            vioVar.b.X(vioVar.a.b, vioVar.f.c, 0);
                        }
                        boolean z = this.v;
                        rio rioVar2 = this.d;
                        if (z) {
                            rioVar2.z(dvt.m0(j));
                        } else {
                            rioVar2.o(j);
                        }
                    } else {
                        this.d.o(j);
                    }
                    for (int i4 = 0; i4 < this.e.size(); i4++) {
                        vio vioVar2 = (vio) this.e.get(i4);
                        if (!vioVar2.d) {
                            dio dioVar = vioVar2.a.b.h;
                            dioVar.getClass();
                            synchronized (dioVar.e) {
                                dioVar.k = true;
                            }
                            vioVar2.c.A(false);
                            vioVar2.c.t = j;
                        }
                    }
                }
            }
        }
        return j;
    }

    @Override // defpackage.woh
    public final long i() {
        if (!this.q) {
            return -9223372036854775807L;
        }
        this.q = false;
        return 0L;
    }

    public final boolean j() {
        return this.n != -9223372036854775807L;
    }

    @Override // defpackage.woh
    public final void k() {
        IOException iOException = this.k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        rio rioVar = this.d;
        this.i = vohVar;
        try {
            rioVar.getClass();
            try {
                rioVar.i.a(rioVar.g(rioVar.h));
                x0 x0Var = rioVar.g;
                x0Var.c0(x0Var.F(4, rioVar.k, vsn.g, rioVar.h));
            } catch (IOException e) {
                dvt.g(rioVar.i);
                throw e;
            }
        } catch (IOException e2) {
            this.k = e2;
            dvt.g(rioVar);
        }
    }

    @Override // defpackage.woh
    public final yvs m() {
        vq1.A(this.s);
        qsn qsnVar = this.j;
        qsnVar.getClass();
        return new yvs((xvs[]) qsnVar.toArray(new xvs[0]));
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        return f();
    }

    public final void o() {
        ArrayList arrayList;
        boolean z = true;
        int i = 0;
        while (true) {
            arrayList = this.f;
            if (i >= arrayList.size()) {
                break;
            }
            z &= ((uio) arrayList.get(i)).c != null;
            i++;
        }
        if (z && this.t) {
            rio rioVar = this.d;
            rioVar.e.addAll(arrayList);
            rioVar.b();
        }
    }

    @Override // defpackage.ahp
    public final long r() {
        if (!this.p) {
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                long j = this.m;
                if (j != -9223372036854775807L) {
                    return j;
                }
                boolean z = true;
                long j2 = Long.MAX_VALUE;
                for (int i = 0; i < arrayList.size(); i++) {
                    vio vioVar = (vio) arrayList.get(i);
                    if (!vioVar.d) {
                        j2 = Math.min(j2, vioVar.c.n());
                        z = false;
                    }
                }
                if (z || j2 == Long.MIN_VALUE) {
                    return 0L;
                }
                return j2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
        if (j()) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return;
            }
            vio vioVar = (vio) arrayList.get(i);
            if (!vioVar.d) {
                vioVar.c.g(j, z, true);
            }
            i++;
        }
    }

    @Override // defpackage.ahp
    public final void t(long j) {
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        return j;
    }
}
