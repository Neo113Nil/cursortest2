package defpackage;

/* loaded from: classes.dex */
public final class zm50 {
    public final hz40 a = do40.b();
    public final hz40 b = do40.b();

    public final void a(kb30 kb30Var) {
        Object d = this.b.d(kb30Var);
        if (d != null) {
            boolean z = d instanceof xy40;
            int i = 27;
            hz40 hz40Var = this.a;
            if (!z) {
                do40.d(hz40Var, (ib30) d, new x240(i, kb30Var));
                return;
            }
            mp60 mp60Var = (mp60) d;
            Object[] objArr = mp60Var.a;
            int i2 = mp60Var.b;
            for (int i3 = 0; i3 < i2; i3++) {
                do40.d(hz40Var, (ib30) objArr[i3], new x240(i, kb30Var));
            }
        }
    }
}
