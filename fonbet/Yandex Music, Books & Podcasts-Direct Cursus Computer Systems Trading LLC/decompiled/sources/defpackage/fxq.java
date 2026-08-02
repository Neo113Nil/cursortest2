package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fxq implements Iterable, j9f {
    public int b;
    public int d;
    public int e;
    public boolean g;
    public int h;
    public HashMap j;
    public soi k;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public final Object f = new Object();
    public ArrayList i = new ArrayList();

    public final int a(w80 w80Var) {
        if (this.g) {
            pq5.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!w80Var.a()) {
            llm.a("Anchor refers to a group that was removed");
        }
        return w80Var.a;
    }

    public final void g() {
        this.j = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new pqd(this, 0, this.b);
    }

    public final exq m() {
        if (this.g) {
            xq0.q("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new exq(this);
    }

    public final oxq o() {
        if (this.g) {
            pq5.c("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            pq5.c("Cannot start a writer when a reader is pending");
        }
        this.g = true;
        this.h++;
        return new oxq(this);
    }

    public final boolean q(w80 w80Var) {
        int d;
        return w80Var.a() && (d = hxq.d(this.i, w80Var.a, this.b)) >= 0 && Intrinsics.d(this.i.get(d), w80Var);
    }
}
