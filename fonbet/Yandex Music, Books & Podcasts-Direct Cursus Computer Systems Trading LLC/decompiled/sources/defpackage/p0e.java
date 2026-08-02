package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p0e implements aoo {
    public final int a;
    public final t0e b;
    public int c = -1;

    public p0e(t0e t0eVar, int i) {
        this.b = t0eVar;
        this.a = i;
    }

    public final void a() {
        vq1.v(this.c == -1);
        t0e t0eVar = this.b;
        t0eVar.p();
        t0eVar.K.getClass();
        int[] iArr = t0eVar.K;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (t0eVar.J.contains(t0eVar.I.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = t0eVar.Y;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.c = i2;
    }

    @Override // defpackage.aoo
    public final void b() {
        int i = this.c;
        t0e t0eVar = this.b;
        if (i == -2) {
            t0eVar.p();
            throw new pg5(hrg.q("Unable to bind a sample queue to TrackGroup with MIME type ", t0eVar.I.a(this.a).d[0].n, "."));
        }
        if (i == -1) {
            t0eVar.C();
        } else if (i != -3) {
            t0eVar.C();
            t0eVar.v[i].v();
        }
    }

    public final boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.aoo
    public final boolean p() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i = this.c;
        t0e t0eVar = this.b;
        return !t0eVar.A() && t0eVar.v[i].t(t0eVar.z0);
    }

    @Override // defpackage.aoo
    public final int q(qdc qdcVar, qg7 qg7Var, int i) {
        dsc dscVar;
        if (this.c == -3) {
            qg7Var.b(4);
            return -4;
        }
        if (c()) {
            int i2 = this.c;
            t0e t0eVar = this.b;
            ArrayList arrayList = t0eVar.n;
            if (!t0eVar.A()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((ozd) arrayList.get(i4)).k;
                        int length = t0eVar.v.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (t0eVar.Y[i6] && t0eVar.v[i6].x() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    dvt.d0(0, i4, arrayList);
                    ozd ozdVar = (ozd) arrayList.get(0);
                    dsc dscVar2 = ozdVar.d;
                    if (!dscVar2.equals(t0eVar.G)) {
                        t0eVar.k.y(t0eVar.b, dscVar2, ozdVar.e, ozdVar.f, ozdVar.g);
                    }
                    t0eVar.G = dscVar2;
                }
                if (arrayList.isEmpty() || ((ozd) arrayList.get(0)).K) {
                    int y = t0eVar.v[i2].y(qdcVar, qg7Var, i, t0eVar.z0);
                    if (y == -5) {
                        dsc dscVar3 = (dsc) qdcVar.c;
                        dscVar3.getClass();
                        if (i2 == t0eVar.B) {
                            int s = zc4.s(t0eVar.v[i2].x());
                            while (i3 < arrayList.size() && ((ozd) arrayList.get(i3)).k != s) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                dscVar = ((ozd) arrayList.get(i3)).d;
                            } else {
                                dscVar = t0eVar.F;
                                dscVar.getClass();
                            }
                            dscVar3 = dscVar3.d(dscVar);
                        }
                        qdcVar.c = dscVar3;
                    }
                    return y;
                }
            }
        }
        return -3;
    }

    @Override // defpackage.aoo
    public final int x(long j) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i = this.c;
        t0e t0eVar = this.b;
        if (t0eVar.A()) {
            return 0;
        }
        s0e s0eVar = t0eVar.v[i];
        int r = s0eVar.r(j, t0eVar.z0);
        ArrayList arrayList = t0eVar.n;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = vz1.m(arrayList, 1);
            }
            obj = null;
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            obj = null;
        }
        ozd ozdVar = (ozd) obj;
        if (ozdVar != null && !ozdVar.K) {
            r = Math.min(r, ozdVar.g(i) - s0eVar.p());
        }
        s0eVar.D(r);
        return r;
    }
}
