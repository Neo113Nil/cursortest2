package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class lzd {
    public final vm7 a;
    public final db7 b;
    public final db7 c;
    public final f4m d;
    public final Uri[] e;
    public final dsc[] f;
    public final ym7 g;
    public final xvs h;
    public final List i;
    public final ndl k;
    public boolean l;
    public yy2 n;
    public Uri o;
    public boolean p;
    public zsb q;
    public boolean s;
    public final qec j = new qec(1);
    public byte[] m = dvt.c;
    public long r = -9223372036854775807L;

    public lzd(vm7 vm7Var, ym7 ym7Var, Uri[] uriArr, dsc[] dscVarArr, sld sldVar, t6t t6tVar, f4m f4mVar, List list, ndl ndlVar) {
        this.a = vm7Var;
        this.g = ym7Var;
        this.e = uriArr;
        this.f = dscVarArr;
        this.d = f4mVar;
        this.i = list;
        this.k = ndlVar;
        db7 a = ((va7) sldVar.b).a();
        this.b = a;
        if (t6tVar != null) {
            a.q(t6tVar);
        }
        this.c = ((va7) sldVar.b).a();
        this.h = new xvs("", dscVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((dscVarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        xvs xvsVar = this.h;
        int[] Y = zc4.Y(arrayList);
        jzd jzdVar = new jzd(0, xvsVar, Y);
        jzdVar.g = jzdVar.o(xvsVar.d[Y[0]]);
        this.q = jzdVar;
    }

    public final eih[] a(ozd ozdVar, long j) {
        List list;
        lzd lzdVar = this;
        ozd ozdVar2 = ozdVar;
        int b = ozdVar2 == null ? -1 : lzdVar.h.b(ozdVar2.d);
        int length = lzdVar.q.length();
        eih[] eihVarArr = new eih[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int f = lzdVar.q.f(i);
            Uri uri = lzdVar.e[f];
            ym7 ym7Var = lzdVar.g;
            if (ym7Var.c(uri)) {
                xzd a = ym7Var.a(z, uri);
                a.getClass();
                long j2 = a.h - ym7Var.n;
                Pair c = lzdVar.c(ozdVar2, f != b ? true : z, a, j2, j);
                long longValue = ((Long) c.first).longValue();
                int intValue = ((Integer) c.second).intValue();
                long j3 = a.k;
                yde ydeVar = a.s;
                yde ydeVar2 = a.r;
                int i2 = (int) (longValue - j3);
                if (i2 < 0 || ydeVar2.size() < i2) {
                    ude udeVar = yde.b;
                    list = qsn.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < ydeVar2.size()) {
                        if (intValue != -1) {
                            uzd uzdVar = (uzd) ydeVar2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(uzdVar);
                            } else if (intValue < uzdVar.m.size()) {
                                yde ydeVar3 = uzdVar.m;
                                arrayList.addAll(ydeVar3.subList(intValue, ydeVar3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(ydeVar2.subList(i2, ydeVar2.size()));
                        intValue = 0;
                    }
                    if (a.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < ydeVar.size()) {
                            arrayList.addAll(ydeVar.subList(intValue, ydeVar.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
                eihVarArr[i] = new izd(list, j2);
            } else {
                eihVarArr[i] = eih.l0;
            }
            i++;
            lzdVar = this;
            ozdVar2 = ozdVar;
            z = false;
        }
        return eihVarArr;
    }

    public final int b(ozd ozdVar) {
        int i = ozdVar.o;
        if (i == -1) {
            return 1;
        }
        xzd a = this.g.a(false, this.e[this.h.b(ozdVar.d)]);
        a.getClass();
        yde ydeVar = a.r;
        int i2 = (int) (ozdVar.j - a.k);
        if (i2 < 0) {
            return 1;
        }
        yde ydeVar2 = i2 < ydeVar.size() ? ((uzd) ydeVar.get(i2)).m : a.s;
        if (i >= ydeVar2.size()) {
            return 2;
        }
        szd szdVar = (szd) ydeVar2.get(i);
        if (szdVar.m) {
            return 0;
        }
        return Objects.equals(Uri.parse(p1g.M(a.a, szdVar.a)), ozdVar.b.a) ? 1 : 2;
    }

    public final Pair c(ozd ozdVar, boolean z, xzd xzdVar, long j, long j2) {
        boolean z2 = true;
        if (ozdVar != null) {
            long j3 = ozdVar.j;
            int i = ozdVar.o;
            if (!z) {
                if (!ozdVar.H) {
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i));
                }
                if (i == -1) {
                    j3 = ozdVar.b();
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i != -1 ? i + 1 : -1));
            }
        }
        long j4 = xzdVar.u;
        yde ydeVar = xzdVar.s;
        long j5 = xzdVar.k;
        yde ydeVar2 = xzdVar.r;
        long j6 = j4 + j;
        if (ozdVar != null && !this.p) {
            j2 = ozdVar.g;
        }
        if (!xzdVar.o && j2 >= j6) {
            return new Pair(Long.valueOf(j5 + ydeVar2.size()), -1);
        }
        long j7 = j2 - j;
        Long valueOf = Long.valueOf(j7);
        int i2 = 0;
        if (this.g.m && ozdVar != null) {
            z2 = false;
        }
        int c = dvt.c(ydeVar2, valueOf, z2);
        long j8 = c + j5;
        if (c >= 0) {
            uzd uzdVar = (uzd) ydeVar2.get(c);
            yde ydeVar3 = j7 < uzdVar.e + uzdVar.c ? uzdVar.m : ydeVar;
            while (true) {
                if (i2 >= ydeVar3.size()) {
                    break;
                }
                szd szdVar = (szd) ydeVar3.get(i2);
                if (j7 >= szdVar.e + szdVar.c) {
                    i2++;
                } else if (szdVar.l) {
                    j8 += ydeVar3 == ydeVar ? 1L : 0L;
                    r1 = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j8), Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hzd d(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        qec qecVar = this.j;
        byte[] bArr = (byte[]) ((xxc) qecVar.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        nb7 nb7Var = new nb7(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        dsc dscVar = this.f[i];
        int t = this.q.t();
        Object j = this.q.j();
        byte[] bArr2 = this.m;
        hzd hzdVar = new hzd(this.c, nb7Var, 3, dscVar, t, j, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = dvt.c;
        }
        hzdVar.j = bArr2;
        return hzdVar;
    }
}
