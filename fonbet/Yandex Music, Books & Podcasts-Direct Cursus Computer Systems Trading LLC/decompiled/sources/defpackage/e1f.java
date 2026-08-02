package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e1f extends xkt {
    public int b;
    public Object c;
    public final /* synthetic */ int d;
    public final Iterator e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e1f(qop qopVar) {
        this();
        this.d = 1;
        this.f = qopVar;
        this.e = qopVar.a.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        o2g.V(this.b != 4);
        int D = ouj.D(this.b);
        if (D == 0) {
            return true;
        }
        if (D != 2) {
            this.b = 4;
            switch (this.d) {
                case 0:
                    do {
                        Iterator it = this.e;
                        if (!it.hasNext()) {
                            this.b = 3;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((olm) this.f).apply(next));
                default:
                    do {
                        Iterator it2 = this.e;
                        if (!it2.hasNext()) {
                            this.b = 3;
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                        }
                    } while (!((qop) this.f).b.contains(next));
            }
            this.c = next;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            wvs.n();
            return null;
        }
        this.b = 2;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e1f(Iterator it, olm olmVar) {
        this();
        this.d = 0;
        this.e = it;
        this.f = olmVar;
    }

    public e1f() {
        super(0);
        this.b = 2;
    }
}
