package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ler implements Iterator, j9f {
    public final u2r a;
    public final Iterator b;
    public int c;
    public Map.Entry d;
    public Map.Entry e;
    public final /* synthetic */ int f;

    public ler(u2r u2rVar, Iterator it, int i) {
        this.f = i;
        this.a = u2rVar;
        this.b = it;
        this.c = u2rVar.c().d;
        a();
    }

    public final void a() {
        this.d = this.e;
        Iterator it = this.b;
        this.e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                a();
                if (this.d == null) {
                    e7o.n();
                    break;
                } else {
                    break;
                }
            case 1:
                Map.Entry entry = this.e;
                if (entry == null) {
                    e7o.n();
                    break;
                } else {
                    a();
                    break;
                }
            default:
                Map.Entry entry2 = this.e;
                if (entry2 == null) {
                    e7o.n();
                    break;
                } else {
                    a();
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        u2r u2rVar = this.a;
        if (u2rVar.c().d != this.c) {
            xq0.i();
            return;
        }
        Map.Entry entry = this.d;
        if (entry == null) {
            e7o.n();
            return;
        }
        u2rVar.remove(entry.getKey());
        this.d = null;
        this.c = u2rVar.c().d;
    }
}
