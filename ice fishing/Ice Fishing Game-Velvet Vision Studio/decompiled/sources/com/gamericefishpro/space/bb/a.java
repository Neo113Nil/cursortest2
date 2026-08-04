package com.gamericefishpro.space.bb;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.r5.f0;
import com.gamericefishpro.space.r5.g0;
import com.gamericefishpro.space.r5.j0;
import com.gamericefishpro.space.r5.m0;
import com.gamericefishpro.space.r5.n0;
import com.gamericefishpro.space.r5.o0;
import com.gamericefishpro.space.r5.u0;
import com.gamericefishpro.space.r5.y;
import com.gamericefishpro.space.t.r0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;
    public int b;
    public Serializable c;
    public AbstractCollection d;
    public final AbstractCollection e;
    public Object f;
    public Object g;

    public a(Class cls, Class[] clsArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet.add(v.a(cls));
        for (Class cls2 : clsArr) {
            com.gamericefishpro.space.hj.c.m(cls2, "Null interface");
            ((HashSet) this.d).add(v.a(cls2));
        }
    }

    public void a(l lVar) {
        if (((HashSet) this.d).contains(lVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(lVar);
    }

    public void b(m0 m0Var, boolean z) {
        RecyclerView.e(m0Var);
        m0Var.getClass();
        RecyclerView recyclerView = (RecyclerView) this.g;
        o0 o0Var = recyclerView.w0;
        if (o0Var != null) {
            n0 n0Var = o0Var.w;
            l0.l(null, n0Var != null ? (com.gamericefishpro.space.d4.b) n0Var.w.remove(null) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.D;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.s0 != null) {
                com.gamericefishpro.space.u6.l lVar = recyclerView.w;
                com.gamericefishpro.space.t.q qVar = (com.gamericefishpro.space.t.q) lVar.e;
                for (int iG = qVar.g() - 1; iG >= 0; iG--) {
                    if (m0Var == qVar.h(iG)) {
                        Object[] objArr = qVar.i;
                        Object obj = objArr[iG];
                        Object obj2 = com.gamericefishpro.space.t.r.a;
                        if (obj == obj2) {
                            break;
                        }
                        objArr[iG] = obj2;
                        qVar.d = true;
                        break;
                    }
                }
                u0 u0Var = (u0) ((r0) lVar.d).remove(m0Var);
                if (u0Var != null) {
                    u0Var.a = 0;
                    u0.b.c(u0Var);
                }
            }
        }
        m0Var.g = null;
        g0 g0VarE = e();
        g0VarE.getClass();
        ArrayList arrayList2 = g0VarE.a(0).a;
        if (((f0) g0VarE.a.get(0)).b <= arrayList2.size()) {
            return;
        }
        m0Var.l();
        arrayList2.add(m0Var);
    }

    public b c() {
        if (((e) this.g) != null) {
            return new b((String) this.c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.a, this.b, (e) this.g, (HashSet) this.f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public int d(int i) {
        RecyclerView recyclerView = (RecyclerView) this.g;
        if (i >= 0 && i < recyclerView.s0.a()) {
            return !recyclerView.s0.e ? i : recyclerView.i.i(i, 0);
        }
        StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i, "invalid position ", ". State item count is ");
        sbK.append(recyclerView.s0.a());
        sbK.append(recyclerView.p());
        throw new IndexOutOfBoundsException(sbK.toString());
    }

    public g0 e() {
        if (((g0) this.f) == null) {
            g0 g0Var = new g0();
            g0Var.a = new SparseArray();
            g0Var.b = 0;
            this.f = g0Var;
        }
        return (g0) this.f;
    }

    public View f(int i) {
        k(i, Long.MAX_VALUE).getClass();
        return null;
    }

    public void g() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.D0;
        com.gamericefishpro.space.d9.d dVar = ((RecyclerView) this.g).r0;
        dVar.getClass();
        dVar.c = 0;
    }

    public void h(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        b((m0) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public void i(View view) {
        RecyclerView recyclerView = (RecyclerView) this.g;
        m0 m0VarS = RecyclerView.s(view);
        if (m0VarS.j()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (m0VarS.i()) {
            m0VarS.c.l(m0VarS);
        } else if (m0VarS.o()) {
            m0VarS.b &= -33;
        }
        j(m0VarS);
        if (recyclerView.b0 == null || m0VarS.g()) {
            return;
        }
        recyclerView.b0.b(m0VarS);
    }

    public void j(m0 m0Var) {
        if (!m0Var.i()) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb.append(m0Var.i());
        sb.append(" isAttached:");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    public m0 k(int i, long j) {
        View view;
        y yVar;
        ArrayList arrayList;
        int size;
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.g;
        j0 j0Var = recyclerView.s0;
        if (i < 0 || i >= j0Var.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + j0Var.a() + recyclerView.p());
        }
        if (j0Var.e && (arrayList = (ArrayList) this.d) != null && (size = arrayList.size()) != 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    throw null;
                }
                m0 m0Var = (m0) ((ArrayList) this.d).get(i2);
                if (!m0Var.o() && m0Var.b() == i) {
                    m0Var.a(32);
                    break;
                }
                i2++;
            }
        }
        int size2 = arrayList2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                ArrayList arrayList4 = (ArrayList) recyclerView.v.v;
                int size3 = arrayList4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        view = null;
                        break;
                    }
                    view = (View) arrayList4.get(i4);
                    m0 m0VarS = RecyclerView.s(view);
                    if (m0VarS.b() == i && !m0VarS.f() && !m0VarS.h()) {
                        break;
                    }
                    i4++;
                }
                if (view == null) {
                    int size4 = arrayList3.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        m0 m0Var2 = (m0) arrayList3.get(i5);
                        if (!m0Var2.f() && m0Var2.b() == i && !m0Var2.d()) {
                            arrayList3.remove(i5);
                            break;
                        }
                    }
                    break;
                }
                m0 m0VarS2 = RecyclerView.s(view);
                com.gamericefishpro.space.r5.b bVar = recyclerView.v;
                com.gamericefishpro.space.n9.r0 r0Var = (com.gamericefishpro.space.n9.r0) bVar.i;
                int iIndexOfChild = ((com.gamericefishpro.space.r5.u) bVar.e).a.indexOfChild(view);
                if (iIndexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!r0Var.f(iIndexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                r0Var.b(iIndexOfChild);
                bVar.p(view);
                com.gamericefishpro.space.r5.b bVar2 = recyclerView.v;
                com.gamericefishpro.space.n9.r0 r0Var2 = (com.gamericefishpro.space.n9.r0) bVar2.i;
                int iIndexOfChild2 = ((com.gamericefishpro.space.r5.u) bVar2.e).a.indexOfChild(view);
                int iC = (iIndexOfChild2 == -1 || r0Var2.f(iIndexOfChild2)) ? -1 : iIndexOfChild2 - r0Var2.c(iIndexOfChild2);
                if (iC == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m0VarS2 + recyclerView.p());
                }
                recyclerView.v.d(iC);
                RecyclerView recyclerView2 = (RecyclerView) this.g;
                RecyclerView.s(view);
                m0 m0Var3 = null;
                if ((m0Var3.b & 12) == 0 && m0Var3.k() && (yVar = recyclerView2.b0) != null) {
                    com.gamericefishpro.space.r5.g gVar = (com.gamericefishpro.space.r5.g) yVar;
                    if (m0Var3.c().isEmpty() && gVar.g && !m0Var3.f()) {
                        if (((ArrayList) this.d) == null) {
                            this.d = new ArrayList();
                        }
                        m0Var3.c = this;
                        m0Var3.d = true;
                        ((ArrayList) this.d).add(null);
                    } else {
                        if (!m0Var3.f() && !m0Var3.h()) {
                            throw null;
                        }
                        m0Var3.c = this;
                        m0Var3.d = false;
                        ((ArrayList) this.c).add(null);
                    }
                } else {
                    if (!m0Var3.f()) {
                    }
                    m0Var3.c = this;
                    m0Var3.d = false;
                    ((ArrayList) this.c).add(null);
                }
                m0VarS2.a(8224);
                break;
            }
            m0 m0Var4 = (m0) arrayList2.get(i3);
            if (!m0Var4.o() && m0Var4.b() == i && !m0Var4.f() && (j0Var.e || !m0Var4.h())) {
                m0Var4.a(32);
                break;
            }
            i3++;
        }
        int i6 = recyclerView.i.i(i, 0);
        if (i6 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + i6 + ").state:" + j0Var.a() + recyclerView.p());
    }

    public void l(m0 m0Var) {
        if (m0Var.d) {
            ((ArrayList) this.d).remove(m0Var);
        } else {
            ((ArrayList) this.c).remove(m0Var);
        }
        m0Var.c = null;
        m0Var.d = false;
        m0Var.b &= -33;
    }

    public void m() {
        ArrayList arrayList = (ArrayList) this.e;
        this.b = this.a + 0;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            h(size);
        }
    }

    public a(v vVar, v[] vVarArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet.add(vVar);
        for (v vVar2 : vVarArr) {
            com.gamericefishpro.space.hj.c.m(vVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, vVarArr);
    }

    public a(RecyclerView recyclerView) {
        this.g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }
}
