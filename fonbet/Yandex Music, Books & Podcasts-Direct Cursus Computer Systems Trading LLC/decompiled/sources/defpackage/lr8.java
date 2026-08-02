package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class lr8 extends qon implements a0c {
    public final ArrayList d;
    public final ArrayList e = new ArrayList();
    public final ArrayList f;
    public boolean g;
    public final ArrayList h;
    public final e23 i;
    public final pm9 j;
    public ArrayList k;

    public lr8(e23 e23Var, pm9 pm9Var, List list) {
        this.d = CollectionsKt.y0(list);
        List<k79> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (k79 k79Var : list2) {
            arrayList.add(Boolean.valueOf(((k1a) k79Var.a.d().getVisibility().a(k79Var.b)) == k1a.VISIBLE));
        }
        this.f = new ArrayList(arrayList);
        this.h = new ArrayList();
        y();
        this.i = e23Var;
        this.j = pm9Var;
        this.k = wvo.K(list, gd9.u, gd9.v);
    }

    @Override // defpackage.qon
    public int c() {
        return u().size();
    }

    @Override // defpackage.qon
    public final int f(int i) {
        k79 k79Var = (k79) CollectionsKt.S(u(), i);
        if (k79Var == null) {
            return 0;
        }
        szb m = k79Var.a.d().m();
        String str = m != null ? (String) m.a(k79Var.b) : null;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.a0c
    public final List getSubscriptions() {
        return this.h;
    }

    @Override // defpackage.qon
    public final void o(opn opnVar) {
        e23 G;
        xr8 xr8Var = (xr8) opnVar;
        View child = xr8Var.u.getChild();
        if (child == null || (G = bg3.G(child)) == null) {
            return;
        }
        vq2.P(child, new al(16, xr8Var.w, G));
    }

    public final ArrayList u() {
        boolean z = this.g;
        ArrayList arrayList = this.e;
        if (!z) {
            arrayList.clear();
            Iterator it = this.d.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    u75.n();
                    throw null;
                }
                k79 k79Var = ((Boolean) this.f.get(i)).booleanValue() ? (k79) next : null;
                if (k79Var != null) {
                    arrayList.add(k79Var);
                }
                i = i2;
            }
            this.g = true;
        }
        return arrayList;
    }

    public void v(int i) {
        this.a.e(i, 1);
    }

    public void w(int i) {
        this.a.f(i, 1);
    }

    @Override // defpackage.qon
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void j(xr8 xr8Var, int i) {
        zzb zzbVar;
        k79 k79Var = (k79) u().get(i);
        pm9 b = this.j.b((String) this.k.get(this.d.indexOf(k79Var)));
        e23 e23Var = this.i;
        qjo runtimeStore$div_release = e23Var.a.getRuntimeStore$div_release();
        jc8 jc8Var = k79Var.a;
        xzb xzbVar = k79Var.b;
        d0c j = runtimeStore$div_release.j(b, jc8Var, xzbVar, e23Var.b);
        if (j != null && (zzbVar = j.a) != null) {
            xzbVar = zzbVar;
        }
        xr8Var.t(e23Var.a(xzbVar), k79Var.a, i, b);
    }

    public final void y() {
        l();
        int i = 0;
        for (Object obj : this.d) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            k79 k79Var = (k79) obj;
            i(k79Var.a.d().getVisibility().c(k79Var.b, new wk8(this, i, 9)));
            i = i2;
        }
    }
}
