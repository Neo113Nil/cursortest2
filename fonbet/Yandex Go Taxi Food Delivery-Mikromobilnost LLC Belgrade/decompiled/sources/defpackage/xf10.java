package defpackage;

import androidx.media3.common.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public class xf10 {
    public final int a;
    public final sf10 b;
    public final CopyOnWriteArrayList c;

    public xf10() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void a(c9e c9eVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            wf10 wf10Var = (wf10) it.next();
            tw21.a0(wf10Var.a, new p500(16, c9eVar, wf10Var.b));
        }
    }

    public final void b(int i, a aVar, int i2, Object obj, long j) {
        a(new h2r(14, this, new he10(1, i, aVar, i2, obj, tw21.l0(j), -9223372036854775807L)));
    }

    public final void c(uwy uwyVar, int i, int i2, a aVar, int i3, Object obj, long j, long j2) {
        a(new vf10(this, uwyVar, new he10(i, i2, aVar, i3, obj, tw21.l0(j), tw21.l0(j2)), 1));
    }

    public final void d(uwy uwyVar, int i) {
        e(uwyVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(uwy uwyVar, int i, int i2, a aVar, int i3, Object obj, long j, long j2) {
        a(new vf10(this, uwyVar, new he10(i, i2, aVar, i3, obj, tw21.l0(j), tw21.l0(j2)), 0));
    }

    public final void f(uwy uwyVar, int i, int i2, a aVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        a(new a5h(this, uwyVar, new he10(i, i2, aVar, i3, obj, tw21.l0(j), tw21.l0(j2)), iOException, z));
    }

    public final void g(uwy uwyVar, int i, IOException iOException, boolean z) {
        f(uwyVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void h(uwy uwyVar, int i, int i2, a aVar, int i3, Object obj, long j, long j2, int i4) {
        a(new z4h(this, uwyVar, new he10(i, i2, aVar, i3, obj, tw21.l0(j), tw21.l0(j2)), i4, 2));
    }

    public final void i(int i, long j, long j2) {
        he10 he10Var = new he10(1, i, null, 3, null, tw21.l0(j), tw21.l0(j2));
        sf10 sf10Var = this.b;
        sf10Var.getClass();
        a(new t26(14, this, sf10Var, he10Var));
    }

    public xf10(CopyOnWriteArrayList copyOnWriteArrayList, int i, sf10 sf10Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = sf10Var;
    }
}
