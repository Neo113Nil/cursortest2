package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class s5r implements Iterator, xfx {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object w;
    public final /* synthetic */ qrq0 x;

    public s5r(t5r t5rVar) {
        this.a = 0;
        this.x = t5rVar;
        this.b = t5rVar.a.iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        t5r t5rVar = (t5r) this.x;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) t5rVar.c.invoke(next)).booleanValue() != t5rVar.b);
        this.w = next;
        this.c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.w;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.w = null;
                return false;
            }
            Object next = it3.next();
            e2r e2rVar = (e2r) this.x;
            it = (Iterator) ((tls) e2rVar.d).invoke(((tls) e2rVar.c).invoke(next));
        } while (!it.hasNext());
        this.w = it;
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
                    ny61.p();
                    break;
                } else {
                    Object obj = this.w;
                    this.w = null;
                    this.c = -1;
                    break;
                }
            default:
                int i = this.c;
                if (i == 2) {
                    ny61.p();
                    break;
                } else if (i == 0 && !b()) {
                    ny61.p();
                    break;
                } else {
                    this.c = 0;
                    break;
                }
        }
        return null;
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

    public s5r(e2r e2rVar) {
        this.a = 1;
        this.x = e2rVar;
        this.b = ((qrq0) e2rVar.b).iterator();
    }
}
