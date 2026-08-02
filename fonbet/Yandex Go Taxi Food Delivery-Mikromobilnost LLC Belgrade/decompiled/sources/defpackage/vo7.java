package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class vo7 extends uo7 {
    public final ArrayList a = new ArrayList();

    public vo7(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uo7 uo7Var = (uo7) it.next();
            if (!(uo7Var instanceof wo7)) {
                this.a.add(uo7Var);
            }
        }
    }

    @Override // defpackage.uo7
    public final void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uo7) it.next()).a(i);
        }
    }

    @Override // defpackage.uo7
    public final void b(int i, ap7 ap7Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uo7) it.next()).b(i, ap7Var);
        }
    }

    @Override // defpackage.uo7
    public final void c(int i, xo7 xo7Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uo7) it.next()).c(i, xo7Var);
        }
    }

    @Override // defpackage.uo7
    public final void d(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uo7) it.next()).d(i, i2);
        }
    }

    @Override // defpackage.uo7
    public final void e(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uo7) it.next()).e(i);
        }
    }
}
