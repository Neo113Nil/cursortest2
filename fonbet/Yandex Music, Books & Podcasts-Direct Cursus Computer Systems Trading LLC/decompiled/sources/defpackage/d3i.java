package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes4.dex */
public final class d3i implements so3 {
    public final liq a;
    public final HashMap b = new HashMap();

    public d3i(liq liqVar) {
        this.a = liqVar;
    }

    @Override // defpackage.so3
    public final qc6 a(String str) {
        tk7 tk7Var;
        str.getClass();
        qc6 a = this.a.a(str);
        a.getClass();
        tk7 tk7Var2 = tk7.c;
        if (a != tk7Var2) {
            return a;
        }
        synchronized (this) {
            tk7Var = (tk7) this.b.get(str);
        }
        if (tk7Var != null) {
            return tk7Var;
        }
        tk7Var2.getClass();
        return tk7Var2;
    }

    @Override // defpackage.so3
    public final void b(jq3 jq3Var) {
        jq3Var.getClass();
        this.a.b(jq3Var);
    }

    @Override // defpackage.so3
    public final Set c() {
        return this.a.c();
    }

    @Override // defpackage.so3
    public final long d() {
        return this.a.d();
    }

    @Override // defpackage.so3
    public final long e(long j, long j2, String str) {
        str.getClass();
        return this.a.e(j, j2, str);
    }

    @Override // defpackage.so3
    public final jq3 f(long j, long j2, String str) {
        str.getClass();
        return this.a.f(j, j2, str);
    }

    @Override // defpackage.so3
    public final jq3 g(long j, long j2, String str) {
        str.getClass();
        return this.a.g(j, j2, str);
    }

    @Override // defpackage.so3
    public final long h(long j, long j2, String str) {
        str.getClass();
        return this.a.h(j, j2, str);
    }

    @Override // defpackage.so3
    public final File i(long j, long j2, String str) {
        str.getClass();
        return this.a.i(j, j2, str);
    }

    @Override // defpackage.so3
    public final void j(File file, long j) {
        file.getClass();
        this.a.j(file, j);
    }

    @Override // defpackage.so3
    public final void k(String str) {
        str.getClass();
        this.a.k(str);
        synchronized (this) {
        }
    }

    @Override // defpackage.so3
    public final void l(String str, rc6 rc6Var) {
        str.getClass();
        rc6Var.getClass();
        this.a.l(str, rc6Var);
        synchronized (this) {
            try {
                tk7 tk7Var = (tk7) this.b.get(str);
                if (tk7Var == null) {
                    tk7Var = tk7.c;
                    tk7Var.getClass();
                }
                this.b.put(str, tk7Var.c(rc6Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
