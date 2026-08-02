package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wxq implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ uxq d;

    public wxq(uxq uxqVar) {
        this.d = uxqVar;
    }

    public final Iterator a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        uxq uxqVar = this.d;
        return i < uxqVar.b || (!uxqVar.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        uxq uxqVar = this.d;
        return i < uxqVar.b ? (vxq) uxqVar.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            xq0.q("remove() was called before next()");
            return;
        }
        this.b = false;
        int i = uxq.g;
        uxq uxqVar = this.d;
        uxqVar.b();
        int i2 = this.a;
        if (i2 >= uxqVar.b) {
            a().remove();
        } else {
            this.a = i2 - 1;
            uxqVar.h(i2);
        }
    }
}
