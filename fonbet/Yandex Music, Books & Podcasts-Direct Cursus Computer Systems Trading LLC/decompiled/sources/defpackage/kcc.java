package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public final class kcc implements Iterator, j9f {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ Sequence e;

    public kcc(lcc lccVar) {
        this.a = 0;
        this.e = lccVar;
        this.b = lccVar.a.iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        lcc lccVar = (lcc) this.e;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) lccVar.c.invoke(next)).booleanValue() != lccVar.b);
        this.d = next;
        this.c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.d = null;
                return false;
            }
            Object next = it3.next();
            lhc lhcVar = (lhc) this.e;
            it = (Iterator) lhcVar.c.invoke(lhcVar.b.invoke(next));
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            default:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    wvs.n();
                    return null;
                }
                Object obj = this.d;
                this.d = null;
                this.c = -1;
                return obj;
            default:
                int i = this.c;
                if (i == 2) {
                    wvs.n();
                } else {
                    if (i != 0 || b()) {
                        this.c = 0;
                        Iterator it = (Iterator) this.d;
                        it.getClass();
                        return it.next();
                    }
                    wvs.n();
                }
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public kcc(lhc lhcVar) {
        this.a = 1;
        this.e = lhcVar;
        this.b = lhcVar.a.iterator();
    }
}
