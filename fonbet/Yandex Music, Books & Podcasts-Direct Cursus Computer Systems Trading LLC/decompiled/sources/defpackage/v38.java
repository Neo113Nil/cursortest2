package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public class v38 extends sx7 {
    public int m;

    public v38(ynv ynvVar) {
        super(ynvVar);
        if (ynvVar instanceof x3e) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.sx7
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            px7 px7Var = (px7) it.next();
            px7Var.a(px7Var);
        }
    }
}
