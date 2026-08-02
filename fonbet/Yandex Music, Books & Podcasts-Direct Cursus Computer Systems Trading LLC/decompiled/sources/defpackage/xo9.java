package defpackage;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class xo9 {
    public final int A;
    public final ogu a;
    public final View b;
    public final v1s c;
    public final xxo d;
    public final ngu e;
    public final mgu f;
    public final String i;
    public final ep9 j;
    public final View o;
    public final boolean p;
    public e23 q;
    public final p0a r;
    public final hp8 s;
    public final ep9 t;
    public final wo9 u;
    public pm9 v;
    public final xc9 w;
    public final LinkedHashMap x;
    public final LinkedHashMap y;
    public Object z;
    public final xy0 g = new xy0(0);
    public final xy0 h = new xy0(0);
    public final pq2 k = new pq2(this);
    public boolean l = false;
    public n m = null;
    public boolean n = false;

    public xo9(ogu oguVar, lp9 lp9Var, ogp ogpVar, y19 y19Var, boolean z, e23 e23Var, c5p c5pVar, p0a p0aVar, hp8 hp8Var, ep9 ep9Var, wo9 wo9Var, pm9 pm9Var, xc9 xc9Var) {
        jua juaVar;
        this.a = oguVar;
        this.b = lp9Var;
        this.j = ep9Var;
        znk znkVar = new znk(7, this);
        this.i = "DIV2.TAB_ITEM_VIEW";
        v1s v1sVar = (v1s) hyf.E(R.id.base_tabbed_title_container_scroller, lp9Var);
        this.c = v1sVar;
        v1sVar.setHost(znkVar);
        v1sVar.setTypefaceProvider((ky9) c5pVar.b);
        v1sVar.K = oguVar;
        v1sVar.L = "DIV2.TAB_HEADER_VIEW";
        xxo xxoVar = (xxo) hyf.E(R.id.div_tabs_pager_container, lp9Var);
        this.d = xxoVar;
        int layoutDirection = xxoVar.getResources().getConfiguration().getLayoutDirection();
        WeakHashMap weakHashMap = wdu.a;
        xxoVar.setLayoutDirection(layoutDirection);
        xxoVar.setAdapter(null);
        ArrayList arrayList = xxoVar.z0;
        if (arrayList != null) {
            arrayList.clear();
        }
        xxoVar.M0.clear();
        xxoVar.b(new sq2(this));
        xfu customPageChangeListener = v1sVar.getCustomPageChangeListener();
        if (customPageChangeListener != null) {
            xxoVar.b(customPageChangeListener);
        }
        xxoVar.b(ep9Var);
        xxoVar.b(wo9Var);
        xxoVar.setScrollEnabled(true);
        xxoVar.setEdgeScrollEnabled(false);
        xxoVar.z(new ozw(9, this));
        ngu nguVar = (ngu) hyf.E(R.id.div_tabs_container_helper, lp9Var);
        this.e = nguVar;
        ViewGroup viewGroup = (ViewGroup) oguVar.a("DIV2.TAB_ITEM_VIEW");
        oq2 oq2Var = new oq2(this);
        oq2 oq2Var2 = new oq2(this);
        switch (y19Var.a) {
            case 20:
                juaVar = new jua(viewGroup, oq2Var, oq2Var2, 0);
                break;
            default:
                juaVar = new jua(viewGroup, oq2Var, oq2Var2, 1);
                break;
        }
        this.f = juaVar;
        nguVar.setHeightCalculator(juaVar);
        this.o = lp9Var;
        this.p = z;
        this.q = e23Var;
        this.r = p0aVar;
        this.s = hp8Var;
        this.t = ep9Var;
        this.u = wo9Var;
        this.v = pm9Var;
        this.w = xc9Var;
        this.x = new LinkedHashMap();
        this.y = new LinkedHashMap();
        this.z = c5b.a;
        this.A = -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final pm9 a(int i) {
        Object obj = this.z.get(i);
        LinkedHashMap linkedHashMap = this.y;
        Object obj2 = linkedHashMap.get(obj);
        if (obj2 == null) {
            obj2 = this.v.b((String) this.z.get(i));
            linkedHashMap.put(obj, obj2);
        }
        return (pm9) obj2;
    }

    public final void b() {
        for (Map.Entry entry : this.x.entrySet()) {
            ViewGroup viewGroup = (ViewGroup) entry.getKey();
            n1s n1sVar = (n1s) entry.getValue();
            pm9 a = a(n1sVar.a);
            this.s.b(this.q, n1sVar.c, n1sVar.b, a);
            viewGroup.requestLayout();
        }
    }

    public final void c(n nVar) {
        or2 or2Var;
        or2 or2Var2;
        this.z = wvo.K(nVar.m(), rk9.J, gd9.t);
        xzb xzbVar = this.q.b;
        a0c A = a0g.A(this.o);
        int min = Math.min(this.d.getCurrentItem(), nVar.m().size() - 1);
        this.h.clear();
        this.m = nVar;
        if (this.d.getAdapter() != null) {
            this.n = true;
            try {
                pq2 pq2Var = this.k;
                synchronized (pq2Var) {
                    try {
                        DataSetObserver dataSetObserver = pq2Var.b;
                        if (dataSetObserver != null) {
                            dataSetObserver.onChanged();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                pq2Var.a.notifyChanged();
            } finally {
                this.n = false;
            }
        }
        List m = nVar.m();
        v1s v1sVar = this.c;
        v1sVar.J = m;
        v1sVar.j();
        int size = m.size();
        int i = (min < 0 || min >= size) ? 0 : min;
        int i2 = 0;
        while (i2 < size) {
            or2 h = v1sVar.h();
            xj9 xj9Var = (xj9) m.get(i2);
            h.a = (String) xj9Var.a.b.a(xj9Var.c);
            b2s b2sVar = h.d;
            if (b2sVar != null) {
                or2 or2Var3 = b2sVar.p;
                b2sVar.setText(or2Var3 == null ? null : or2Var3.a);
            }
            b2s b2sVar2 = h.d;
            uo9 uo9Var = v1sVar.v0;
            if (uo9Var == null) {
                or2Var2 = h;
            } else {
                szb szbVar = uo9Var.k;
                szb szbVar2 = uo9Var.m;
                or2Var2 = h;
                woe.r(b2sVar2, szbVar, uo9Var.l, null, null, xzbVar, A);
                woe.s(b2sVar2, uo9Var.t, uo9Var.k, null, null, xzbVar, A);
                woe.t(b2sVar2, uo9Var.u, uo9Var.l, null, null, xzbVar, A);
                ix8 ix8Var = uo9Var.v;
                xzb xzbVar2 = xzbVar;
                ak0 ak0Var = new ak0(ix8Var, b2sVar2, xzbVar2, b2sVar2.getResources().getDisplayMetrics(), 12);
                xzbVar = xzbVar2;
                szb szbVar3 = ix8Var.f;
                szb szbVar4 = ix8Var.b;
                A.i(szbVar3.c(xzbVar, ak0Var));
                A.i(ix8Var.a.c(xzbVar, ak0Var));
                szb szbVar5 = ix8Var.e;
                if (szbVar5 == null && szbVar4 == null) {
                    A.i(ix8Var.c.c(xzbVar, ak0Var));
                    A.i(ix8Var.d.c(xzbVar, ak0Var));
                } else {
                    A.i(szbVar5 != null ? szbVar5.c(xzbVar, ak0Var) : null);
                    A.i(szbVar4 != null ? szbVar4.c(xzbVar, ak0Var) : null);
                }
                ak0Var.invoke(null);
                dp9 dp9Var = new dp9(uo9Var, xzbVar, b2sVar2, 1);
                szb szbVar6 = uo9Var.p;
                if (szbVar6 == null) {
                    szbVar6 = szbVar2;
                }
                A.i(szbVar6.c(xzbVar, dp9Var));
                szb szbVar7 = uo9Var.q;
                if (szbVar7 != null) {
                    A.i(szbVar7.c(xzbVar, dp9Var));
                }
                dp9Var.invoke(null);
                dp9 dp9Var2 = new dp9(uo9Var, xzbVar, b2sVar2, 0);
                szb szbVar8 = uo9Var.c;
                if (szbVar8 != null) {
                    szbVar2 = szbVar8;
                }
                A.i(szbVar2.c(xzbVar, dp9Var2));
                szb szbVar9 = uo9Var.d;
                if (szbVar9 != null) {
                    A.i(szbVar9.c(xzbVar, dp9Var2));
                }
                dp9Var2.invoke(null);
            }
            v1sVar.b(or2Var2, i2 == i);
            i2++;
        }
        if (this.d.getAdapter() == null) {
            this.d.setAdapter(this.k);
        } else if (!m.isEmpty() && min != -1) {
            this.d.setCurrentItem(min);
            v1s v1sVar2 = this.c;
            if (v1sVar2.getSelectedTabPosition() != min && (or2Var = (or2) v1sVar2.a.get(min)) != null) {
                qr2 qr2Var = or2Var.c;
                if (qr2Var == null) {
                    xq0.x("Tab not attached to a TabLayout");
                    return;
                }
                qr2Var.k(or2Var, true);
            }
        }
        mgu mguVar = this.f;
        if (mguVar != null) {
            ((jua) mguVar).c.clear();
        }
        ngu nguVar = this.e;
        if (nguVar != null) {
            nguVar.requestLayout();
        }
        this.x.clear();
    }
}
