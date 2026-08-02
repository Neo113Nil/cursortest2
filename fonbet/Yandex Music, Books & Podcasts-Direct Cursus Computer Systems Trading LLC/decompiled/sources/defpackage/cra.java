package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class cra {
    public final int a;
    public final uvh b;
    public final CopyOnWriteArrayList c;

    public cra(CopyOnWriteArrayList copyOnWriteArrayList, int i, uvh uvhVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = uvhVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dra, java.lang.Object] */
    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bra braVar = (bra) it.next();
            dvt.c0(braVar.a, new ara(this, braVar.b, 3));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dra, java.lang.Object] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bra braVar = (bra) it.next();
            dvt.c0(braVar.a, new ara(this, braVar.b, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dra, java.lang.Object] */
    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bra braVar = (bra) it.next();
            dvt.c0(braVar.a, new ara(this, braVar.b, 2));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bra braVar = (bra) it.next();
            dvt.c0(braVar.a, new e02(this, braVar.b, i, 4));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bra braVar = (bra) it.next();
            dvt.c0(braVar.a, new cy1(16, this, braVar.b, exc));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dra, java.lang.Object] */
    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bra braVar = (bra) it.next();
            dvt.c0(braVar.a, new ara(this, braVar.b, 0));
        }
    }
}
