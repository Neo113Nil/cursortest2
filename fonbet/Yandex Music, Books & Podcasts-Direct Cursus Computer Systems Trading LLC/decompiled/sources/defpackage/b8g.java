package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b8g implements Iterator {
    public d8g a;
    public d8g b = null;
    public int c;
    public final /* synthetic */ e8g d;
    public final /* synthetic */ int e;

    public b8g(e8g e8gVar, int i) {
        this.e = i;
        this.d = e8gVar;
        this.a = e8gVar.c.d;
        this.c = e8gVar.e;
    }

    public final Object a() {
        return b();
    }

    public final d8g b() {
        d8g d8gVar = this.a;
        e8g e8gVar = this.d;
        if (d8gVar == e8gVar.c) {
            wvs.n();
            return null;
        }
        if (e8gVar.e != this.c) {
            xq0.i();
            return null;
        }
        this.a = d8gVar.d;
        this.b = d8gVar;
        return d8gVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        d8g d8gVar = this.b;
        if (d8gVar == null) {
            e7o.n();
            return;
        }
        e8g e8gVar = this.d;
        e8gVar.c(d8gVar, true);
        this.b = null;
        this.c = e8gVar.e;
    }
}
