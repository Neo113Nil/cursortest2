package J1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, E1.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f357b;

    /* renamed from: d, reason: collision with root package name */
    public Object f359d;
    public final /* synthetic */ f e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f356a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f358c = -1;

    public c(d dVar) {
        this.e = dVar;
        this.f357b = new m((l) dVar.f361b);
    }

    public void a() {
        Object next;
        do {
            Iterator it = this.f357b;
            if (!it.hasNext()) {
                this.f358c = 0;
                return;
            } else {
                next = it.next();
                ((d) this.e).getClass();
            }
        } while (((Boolean) k.f371b.g(next)).booleanValue());
        this.f359d = next;
        this.f358c = 1;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [C1.l, D1.j] */
    public void b() {
        Iterator it = this.f357b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((l) this.e).f374c.g(next)).booleanValue()) {
                this.f358c = 1;
                this.f359d = next;
                return;
            }
        }
        this.f358c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f356a) {
            case 0:
                if (this.f358c == -1) {
                    a();
                }
                if (this.f358c == 1) {
                }
                break;
            default:
                if (this.f358c == -1) {
                    b();
                }
                if (this.f358c == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f356a) {
            case 0:
                if (this.f358c == -1) {
                    a();
                }
                if (this.f358c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f359d;
                this.f359d = null;
                this.f358c = -1;
                return obj;
            default:
                if (this.f358c == -1) {
                    b();
                }
                if (this.f358c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f359d;
                this.f359d = null;
                this.f358c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f356a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(l lVar) {
        this.e = lVar;
        this.f357b = ((f) lVar.f373b).iterator();
    }
}
