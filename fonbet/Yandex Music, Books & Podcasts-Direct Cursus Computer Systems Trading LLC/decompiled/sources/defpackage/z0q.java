package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class z0q extends o9 {
    public long a;
    public zt3 b;

    @Override // defpackage.o9
    public final boolean a(n9 n9Var) {
        x0q x0qVar = (x0q) n9Var;
        if (this.a >= 0) {
            return false;
        }
        long j = x0qVar.i;
        if (j < x0qVar.j) {
            x0qVar.j = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.o9
    public final Continuation[] b(n9 n9Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((x0q) n9Var).w(j);
    }
}
