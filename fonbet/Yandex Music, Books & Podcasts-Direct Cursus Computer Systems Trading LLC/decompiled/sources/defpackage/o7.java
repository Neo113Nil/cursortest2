package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class o7 implements Iterator {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public o7(x7 x7Var) {
        this.d = x7Var;
        Collection collection = x7Var.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        x7 x7Var = (x7) this.d;
        x7Var.g();
        if (x7Var.b == ((Collection) this.c)) {
            return;
        }
        xq0.i();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.b.next();
                this.c = (Collection) entry.getValue();
                return ((p7) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                o2g.U("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                this.b.remove();
                ((p7) this.d).d.e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                o2g.U("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                this.b.remove();
                ((q7) this.d).b.e -= collection.size();
                collection.clear();
                this.c = null;
                break;
            default:
                this.b.remove();
                x7 x7Var = (x7) this.d;
                y7 y7Var = x7Var.e;
                y7Var.e--;
                x7Var.m();
                break;
        }
    }

    public o7(x7 x7Var, ListIterator listIterator) {
        this.d = x7Var;
        this.c = x7Var.b;
        this.b = listIterator;
    }

    public o7(q7 q7Var, Iterator it) {
        this.b = it;
        this.d = q7Var;
    }

    public o7(p7 p7Var) {
        this.d = p7Var;
        this.b = p7Var.c.entrySet().iterator();
    }
}
