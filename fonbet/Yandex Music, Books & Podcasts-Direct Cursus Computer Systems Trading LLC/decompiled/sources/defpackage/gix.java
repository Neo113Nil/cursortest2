package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class gix extends wun {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gix(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wun
    public void a() {
        switch (this.a) {
            case 1:
                ((mmx) this.b).c();
                break;
        }
    }

    @Override // defpackage.wun
    public void b() {
        switch (this.a) {
            case 1:
                ((mmx) this.b).c();
                break;
        }
    }

    @Override // defpackage.wun
    public void c() {
        switch (this.a) {
            case 1:
                ((mmx) this.b).c();
                break;
        }
    }

    @Override // defpackage.wun
    public void d() {
        switch (this.a) {
            case 1:
                ((mmx) this.b).c();
                break;
        }
    }

    @Override // defpackage.wun
    public final void f() {
        switch (this.a) {
            case 0:
                wmh wmhVar = (wmh) this.b;
                long g = wmhVar.g();
                if (g != wmhVar.a) {
                    wmhVar.a = g;
                    wmhVar.e();
                    if (wmhVar.a != 0) {
                        wmhVar.f();
                        break;
                    }
                }
                break;
            case 1:
                ((mmx) this.b).c();
                break;
            default:
                p84 p84Var = (p84) this.b;
                xun xunVar = p84Var.j;
                owh e = xunVar != null ? xunVar.e() : null;
                knn knnVar = p84Var.l;
                if (knnVar != null && e != null) {
                    mox x = ((tao) knnVar.b).x();
                    jsg jsgVar = new jsg(e);
                    q03 q03Var = new q03();
                    q03Var.c = jsgVar.b;
                    q03Var.a = System.currentTimeMillis();
                    q03 q03Var2 = x.m;
                    if (q03Var2 == null || q03Var2.c != 2) {
                        q03Var.b = x.h;
                        x.m = q03Var;
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.wun
    public void g(String str, long j, int i, long j2, long j3) {
        switch (this.a) {
            case 2:
                knn knnVar = ((p84) this.b).l;
                if (knnVar != null) {
                    mox x = ((tao) knnVar.b).x();
                    o4x o4xVar = new o4x(str);
                    o4xVar.b = j;
                    o4xVar.c = i;
                    o4xVar.d = j2;
                    o4xVar.e = j3;
                    q4x q4xVar = new q4x(o4xVar);
                    q4xVar.f = x.h;
                    x.d.add(q4xVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wun
    public void h(int[] iArr) {
        switch (this.a) {
            case 0:
                wmh wmhVar = (wmh) this.b;
                ArrayList c = d94.c(iArr);
                if (!((ArrayList) wmhVar.d).equals(c)) {
                    wmhVar.j();
                    ((dhx) wmhVar.f).evictAll();
                    ((ArrayList) wmhVar.g).clear();
                    wmhVar.d = c;
                    wmh.d(wmhVar);
                    wmhVar.i();
                    wmhVar.h();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wun
    public void i(int[] iArr, int i) {
        int i2;
        switch (this.a) {
            case 0:
                wmh wmhVar = (wmh) this.b;
                if (i == 0) {
                    i2 = ((ArrayList) wmhVar.d).size();
                } else {
                    i2 = ((SparseIntArray) wmhVar.e).get(i, -1);
                    if (i2 == -1) {
                        ((wmh) this.b).f();
                        return;
                    }
                }
                ((wmh) this.b).j();
                ((ArrayList) ((wmh) this.b).d).addAll(i2, d94.c(iArr));
                wmh.d((wmh) this.b);
                wmh wmhVar2 = (wmh) this.b;
                synchronized (((Set) wmhVar2.m)) {
                    Iterator it = ((Set) wmhVar2.m).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((wmh) this.b).h();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.wun
    public void j(cph[] cphVarArr) {
        switch (this.a) {
            case 0:
                HashSet hashSet = new HashSet();
                wmh wmhVar = (wmh) this.b;
                SparseIntArray sparseIntArray = (SparseIntArray) wmhVar.e;
                ArrayList arrayList = (ArrayList) wmhVar.g;
                arrayList.clear();
                for (cph cphVar : cphVarArr) {
                    int i = cphVar.b;
                    ((dhx) wmhVar.f).put(Integer.valueOf(i), cphVar);
                    int i2 = sparseIntArray.get(i, -1);
                    if (i2 == -1) {
                        wmhVar.f();
                        break;
                    } else {
                        hashSet.add(Integer.valueOf(i2));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i3 = sparseIntArray.get(((Integer) it.next()).intValue(), -1);
                    if (i3 != -1) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                wmhVar.j();
                d94.e(arrayList2);
                wmh.c(wmhVar);
                wmhVar.h();
                break;
        }
    }

    @Override // defpackage.wun
    public void k(int[] iArr) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    ((dhx) ((wmh) this.b).f).remove(Integer.valueOf(i));
                    int i2 = ((SparseIntArray) ((wmh) this.b).e).get(i, -1);
                    wmh wmhVar = (wmh) this.b;
                    if (i2 == -1) {
                        wmhVar.f();
                        return;
                    } else {
                        ((SparseIntArray) wmhVar.e).delete(i);
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                ((wmh) this.b).j();
                ((ArrayList) ((wmh) this.b).d).removeAll(d94.c(iArr));
                wmh.d((wmh) this.b);
                wmh wmhVar2 = (wmh) this.b;
                d94.e(arrayList);
                synchronized (((Set) wmhVar2.m)) {
                    Iterator it = ((Set) wmhVar2.m).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((wmh) this.b).h();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.wun
    public void l(ArrayList arrayList, ArrayList arrayList2, int i) {
        switch (this.a) {
            case 0:
                ArrayList arrayList3 = new ArrayList();
                if (i == 0) {
                    ((ArrayList) ((wmh) this.b).d).size();
                } else {
                    boolean isEmpty = arrayList2.isEmpty();
                    wmh wmhVar = (wmh) this.b;
                    if (isEmpty) {
                        msg msgVar = (msg) wmhVar.b;
                        Log.w(msgVar.a, msgVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                    } else if (((SparseIntArray) wmhVar.e).get(i, -1) == -1) {
                        wmh wmhVar2 = (wmh) this.b;
                        ((SparseIntArray) wmhVar2.e).get(((Integer) arrayList2.get(0)).intValue(), -1);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    int i2 = ((SparseIntArray) ((wmh) this.b).e).get(((Integer) it.next()).intValue(), -1);
                    if (i2 == -1) {
                        ((wmh) this.b).f();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i2));
                }
                ((wmh) this.b).j();
                wmh wmhVar3 = (wmh) this.b;
                wmhVar3.d = arrayList;
                wmh.d(wmhVar3);
                wmh wmhVar4 = (wmh) this.b;
                synchronized (((Set) wmhVar4.m)) {
                    Iterator it2 = ((Set) wmhVar4.m).iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((wmh) this.b).h();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.wun
    public void m(int[] iArr) {
        switch (this.a) {
            case 0:
                wmh wmhVar = (wmh) this.b;
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    ((dhx) wmhVar.f).remove(Integer.valueOf(i));
                    int i2 = ((SparseIntArray) wmhVar.e).get(i, -1);
                    if (i2 == -1) {
                        wmhVar.f();
                        break;
                    } else {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                Collections.sort(arrayList);
                wmhVar.j();
                d94.e(arrayList);
                wmh.c(wmhVar);
                wmhVar.h();
                break;
        }
    }

    @Override // defpackage.wun
    public void n() {
        switch (this.a) {
            case 0:
                ((wmh) this.b).f();
                break;
        }
    }
}
