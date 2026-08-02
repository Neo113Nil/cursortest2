package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class tw01 implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;

    public tw01(Iterator it, int i) {
        this.a = i;
        switch (i) {
            case 1:
                it.getClass();
                this.b = it;
                break;
            default:
                it.getClass();
                this.b = it;
                break;
        }
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return a(this.b.next());
            default:
                return b(this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                break;
            default:
                this.b.remove();
                break;
        }
    }
}
