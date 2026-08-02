package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class fno extends ino implements Iterator {
    public gno a;
    public gno b;
    public final /* synthetic */ int c;

    public fno(gno gnoVar, gno gnoVar2, int i) {
        this.c = i;
        this.a = gnoVar2;
        this.b = gnoVar;
    }

    @Override // defpackage.ino
    public final void a(gno gnoVar) {
        gno gnoVar2;
        gno gnoVar3 = null;
        if (this.a == gnoVar && gnoVar == this.b) {
            this.b = null;
            this.a = null;
        }
        gno gnoVar4 = this.a;
        if (gnoVar4 == gnoVar) {
            switch (this.c) {
                case 0:
                    gnoVar2 = gnoVar4.d;
                    break;
                default:
                    gnoVar2 = gnoVar4.c;
                    break;
            }
            this.a = gnoVar2;
        }
        gno gnoVar5 = this.b;
        if (gnoVar5 == gnoVar) {
            gno gnoVar6 = this.a;
            if (gnoVar5 != gnoVar6 && gnoVar6 != null) {
                gnoVar3 = b(gnoVar5);
            }
            this.b = gnoVar3;
        }
    }

    public final gno b(gno gnoVar) {
        switch (this.c) {
            case 0:
                return gnoVar.c;
            default:
                return gnoVar.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        gno gnoVar = this.b;
        gno gnoVar2 = this.a;
        this.b = (gnoVar == gnoVar2 || gnoVar2 == null) ? null : b(gnoVar);
        return gnoVar;
    }
}
