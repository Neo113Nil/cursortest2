package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lgi implements ca7, ba7 {
    public final ArrayList a;
    public final chm b;
    public int c;
    public nsm d;
    public ba7 e;
    public List f;
    public boolean g;

    public lgi(ArrayList arrayList, chm chmVar) {
        this.b = chmVar;
        if (arrayList.isEmpty()) {
            xq0.x("Must not be empty.");
            throw null;
        }
        this.a = arrayList;
        this.c = 0;
    }

    @Override // defpackage.ca7
    public final Class a() {
        return ((ca7) this.a.get(0)).a();
    }

    @Override // defpackage.ca7
    public final void b() {
        List list = this.f;
        if (list != null) {
            this.b.c(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ca7) it.next()).b();
        }
    }

    @Override // defpackage.ba7
    public final void c(Exception exc) {
        List list = this.f;
        w1g.s(list, "Argument must not be null");
        list.add(exc);
        f();
    }

    @Override // defpackage.ca7
    public final void cancel() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ca7) it.next()).cancel();
        }
    }

    @Override // defpackage.ca7
    public final void d(nsm nsmVar, ba7 ba7Var) {
        this.d = nsmVar;
        this.e = ba7Var;
        this.f = (List) this.b.f();
        ((ca7) this.a.get(this.c)).d(nsmVar, this);
        if (this.g) {
            cancel();
        }
    }

    @Override // defpackage.ca7
    public final int e() {
        return ((ca7) this.a.get(0)).e();
    }

    public final void f() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            d(this.d, this.e);
        } else {
            w1g.r(this.f);
            this.e.c(new lld("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.ba7
    public final void g(Object obj) {
        if (obj != null) {
            this.e.g(obj);
        } else {
            f();
        }
    }
}
