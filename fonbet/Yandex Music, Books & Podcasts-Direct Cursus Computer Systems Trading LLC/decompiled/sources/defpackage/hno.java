package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class hno extends ino implements Iterator {
    public gno a;
    public boolean b = true;
    public final /* synthetic */ jno c;

    public hno(jno jnoVar) {
        this.c = jnoVar;
    }

    @Override // defpackage.ino
    public final void a(gno gnoVar) {
        gno gnoVar2 = this.a;
        if (gnoVar == gnoVar2) {
            gno gnoVar3 = gnoVar2.d;
            this.a = gnoVar3;
            this.b = gnoVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        gno gnoVar = this.a;
        return (gnoVar == null || gnoVar.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            gno gnoVar = this.a;
            this.a = gnoVar != null ? gnoVar.c : null;
        }
        return this.a;
    }
}
