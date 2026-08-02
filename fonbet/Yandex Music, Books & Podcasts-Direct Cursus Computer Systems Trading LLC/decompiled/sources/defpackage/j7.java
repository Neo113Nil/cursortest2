package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class j7 implements Iterator, j9f {
    public final /* synthetic */ int a;
    public final Iterator b;

    public j7(xlk xlkVar) {
        this.a = 3;
        bat[] batVarArr = new bat[8];
        for (int i = 0; i < 8; i++) {
            batVarArr[i] = new dat(this);
        }
        this.b = new ylk(xlkVar, batVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            case 1:
                return this.b.hasNext();
            case 2:
                return this.b.hasNext();
            default:
                return ((ylk) this.b).c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return ((Map.Entry) this.b.next()).getKey();
            case 1:
                return ((Map.Entry) this.b.next()).getValue();
            case 2:
                return (ozt) this.b.next();
            default:
                return (Map.Entry) ((ylk) this.b).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((ylk) this.b).remove();
                return;
        }
    }

    public /* synthetic */ j7(Iterator it, int i) {
        this.a = i;
        this.b = it;
    }

    public j7(mzt mztVar) {
        this.a = 2;
        this.b = mztVar.j.iterator();
    }
}
