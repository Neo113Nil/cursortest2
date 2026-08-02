package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class trd extends i7 implements szl {
    public List a = EmptyList.a;
    public boolean b;
    public l1o c;

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        if (neoVar instanceof czl) {
            if (this.a.isEmpty()) {
                this.b = true;
                this.c = l1oVar;
                return;
            }
            this.b = false;
        }
        if (neoVar instanceof ezl) {
            this.b = false;
            this.c = null;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((szl) it.next()).a(neoVar, l1oVar);
        }
    }

    @Override // defpackage.szl
    public final void b(t9 t9Var) {
    }

    @Override // defpackage.i7, defpackage.i3m
    public final void dispose() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((szl) it.next()).dispose();
        }
        this.a = EmptyList.a;
        this.b = false;
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(ywl ywlVar) {
        l1o l1oVar;
        Object obj;
        kwi0 kwi0Var = (kwi0) ywlVar.c.b(qoi0.a(kwi0.class));
        List list = kwi0Var != null ? kwi0Var.a : null;
        if (list == null) {
            list = EmptyList.a;
        }
        List<t9> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (t9 t9Var : list2) {
            Iterator it = this.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((szl) obj).getClass() == t9Var.getClass()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            szl szlVar = (szl) obj;
            if (szlVar != 0) {
                t9Var.getClass();
                if (Boolean.FALSE.equals(Boolean.TRUE)) {
                    szlVar.b(t9Var);
                    t9Var = szlVar;
                }
            }
            arrayList.add(t9Var);
        }
        for (szl szlVar2 : this.a) {
            if (!arrayList.contains(szlVar2)) {
                szlVar2.dispose();
            }
        }
        this.a = arrayList;
        if (!this.b || arrayList.isEmpty() || (l1oVar = this.c) == null) {
            return;
        }
        this.b = false;
        this.c = null;
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((szl) it2.next()).a(czl.a, l1oVar);
        }
    }

    @Override // defpackage.i7, defpackage.i3m
    public final void onDocumentApplied(l1o l1oVar, ywl ywlVar) {
        e(ywlVar);
    }

    @Override // defpackage.i7, defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar) {
        e(ywlVar);
    }

    @Override // defpackage.i7, defpackage.i3m
    public final void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list, ywl ywlVar) {
        if (ywlVar != null) {
            e(ywlVar);
        }
    }
}
