package defpackage;

import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dp0 implements Closeable {
    public final yk3 a;
    public final fx6 b;
    public final f2j c;
    public final ArrayList d;
    public final pob e;
    public final a46 f;
    public final c0j g;

    public dp0(yk3 yk3Var, fx6 fx6Var, f2j f2jVar, ArrayList arrayList, x4b x4bVar) {
        this.a = yk3Var;
        this.b = fx6Var;
        this.c = f2jVar;
        this.d = arrayList;
        this.e = x4bVar;
        mn7 mn7Var = da8.a;
        this.f = new a46(mn7Var, gld.e(mn7Var));
        this.g = new c0j(yk3Var, f2jVar, mn7Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gld.L(this.f.a, null);
        this.a.a();
        this.c.a();
    }
}
