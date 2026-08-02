package defpackage;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class axh implements heg, ux7 {
    public final int a;
    public final int b;
    public final li3 c;
    public final int d;
    public final float e;
    public final zi7 f;
    public final h4b g;
    public final long h;
    public final long i;
    public int j;
    public volatile jeg k;

    public axh(li3 li3Var) {
        zi7 zi7Var = new zi7();
        h4b h4bVar = new h4b(20);
        this.a = 1000;
        this.b = 2000;
        this.c = li3Var;
        this.d = Integer.MAX_VALUE;
        this.e = 0.3f;
        this.f = zi7Var;
        this.g = h4bVar;
        this.h = 1000 * 1000;
        this.i = 2000 * 1000;
        axh axhVar = (axh) new ybg(7, this).s;
        this.k = new jeg(0L, Long.valueOf(axhVar.a), Long.valueOf(axhVar.b), null, null, null, null, null, null);
    }

    @Override // defpackage.ux7
    public final void a(paw pawVar) {
        this.c.a(pawVar);
    }

    @Override // defpackage.heg
    public final boolean b(ndl ndlVar) {
        return false;
    }

    @Override // defpackage.heg
    public final void c(geg gegVar, yvs yvsVar, zsb[] zsbVarArr) {
        int i;
        yvsVar.getClass();
        zsbVarArr.getClass();
        List<zsb> w = xz0.w(zsbVarArr);
        ArrayList arrayList = new ArrayList(v75.o(w, 10));
        for (zsb zsbVar : w) {
            zsbVar.getClass();
            arrayList.add(Integer.valueOf(zsbVar.n().c));
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (intValue == -2) {
                i = 0;
            } else if (intValue == 0) {
                i = 36438016;
            } else if (intValue == 1) {
                i = 3538944;
            } else if (intValue != 2) {
                i = SQLiteDatabase.OPEN_SHAREDCACHE;
                if (intValue != 3 && intValue != 5 && intValue != 6) {
                    xq0.x(k5r.i(intValue, "Not support trackType: "));
                    return;
                }
            } else {
                i = 32768000;
            }
            i2 += i;
        }
        this.j = i2;
        m();
    }

    @Override // defpackage.heg
    public final zi7 d() {
        return this.f;
    }

    @Override // defpackage.ux7
    public final void e(paw pawVar) {
        this.c.e(pawVar);
    }

    @Override // defpackage.heg
    public final long g(ndl ndlVar) {
        return 0 * 1000;
    }

    @Override // defpackage.heg
    public final void h(ndl ndlVar) {
        n(true);
    }

    @Override // defpackage.heg
    public final void i(ndl ndlVar) {
        n(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.heg
    public final boolean k(geg gegVar) {
        boolean z;
        Double d;
        int m = m();
        li3 li3Var = this.c;
        qxp qxpVar = li3Var.a;
        ozw ozwVar = new ozw(Double.valueOf((li3Var.d.a != null ? r3.b.a() : 0L) / 1000.0d), Double.valueOf(li3Var.c.a / 1000.0d));
        Map map = (Map) qxpVar.a;
        map.getClass();
        Set keySet = map.keySet();
        keySet.getClass();
        hdo hdoVar = hdo.a;
        hdoVar.getClass();
        Iterator it = CollectionsKt.o0(keySet, hdoVar).iterator();
        do {
            z = false;
            d = null;
            Object obj = null;
            d = null;
            if (!it.hasNext()) {
                break;
            }
            mi3[] mi3VarArr = (mi3[]) map.get(Integer.valueOf(((Number) it.next()).intValue()));
            if (mi3VarArr != null) {
                ArrayList arrayList = new ArrayList();
                for (mi3 mi3Var : mi3VarArr) {
                    Double a = mi3Var.a(ozwVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (it2.hasNext()) {
                        double doubleValue = ((Number) obj).doubleValue();
                        do {
                            Object next = it2.next();
                            double doubleValue2 = ((Number) next).doubleValue();
                            if (Double.compare(doubleValue, doubleValue2) > 0) {
                                obj = next;
                                doubleValue = doubleValue2;
                            }
                        } while (it2.hasNext());
                    }
                }
                d = (Double) obj;
            }
        } while (d == null);
        this.k = this.k.a(new zf0((long) ((d != null ? d.doubleValue() : 30.0d) * 1000.0d), 3));
        long j = gegVar.c;
        Object[] objArr = this.f.a() < m;
        Object[] objArr2 = j < this.h;
        Object[] objArr3 = j < this.k.a * ((long) 1000);
        if ((objArr != false || objArr2 != false) && objArr3 != false) {
            z = true;
        }
        this.k = this.k.a(new zwh(gegVar, z, 0));
        return z;
    }

    @Override // defpackage.heg
    public final boolean l(geg gegVar) {
        long j = gegVar.e ? this.i : this.h;
        boolean z = j <= 0 || dvt.K(gegVar.d, gegVar.c) >= j;
        this.k = this.k.a(new zwh(gegVar, z, 1));
        return z;
    }

    public final int m() {
        Runtime runtime = (Runtime) this.g.a;
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        zi7 zi7Var = this.f;
        int a = (int) ((maxMemory + zi7Var.a()) * this.e);
        int i = this.j;
        int d = yhn.d(a, i, Math.max(i, this.d));
        zi7Var.b(d);
        return d;
    }

    public final void n(boolean z) {
        if (z) {
            zi7 zi7Var = this.f;
            synchronized (zi7Var) {
                if (zi7Var.a) {
                    zi7Var.b(0);
                }
            }
        }
    }

    @Override // defpackage.heg
    public final void j(ndl ndlVar) {
    }
}
