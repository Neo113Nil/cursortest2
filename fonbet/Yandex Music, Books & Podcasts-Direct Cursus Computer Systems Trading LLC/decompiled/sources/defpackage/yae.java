package defpackage;

import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class yae implements so3 {
    public final so3 a;
    public final xol b;
    public boolean c;
    public jq3 d;

    public yae(so3 so3Var, xol xolVar) {
        this.a = so3Var;
        this.b = xolVar;
    }

    @Override // defpackage.so3
    public final qc6 a(String str) {
        str.getClass();
        qc6 tk7Var = new tk7(Collections.EMPTY_MAP);
        if (!this.c) {
            try {
                tk7Var = this.a.a(str);
            } catch (InterruptedIOException e) {
                throw e;
            } catch (InterruptedException e2) {
                throw e2;
            } catch (Exception e3) {
                this.b.c(e3);
                this.c = true;
                m();
            }
        }
        tk7Var.getClass();
        return tk7Var;
    }

    @Override // defpackage.so3
    public final void b(jq3 jq3Var) {
        jq3Var.getClass();
        boolean z = this.c;
        if (!z && !z) {
            try {
                this.a.b(jq3Var);
            } catch (InterruptedIOException e) {
                throw e;
            } catch (InterruptedException e2) {
                throw e2;
            } catch (Exception e3) {
                this.b.c(e3);
                this.c = true;
                m();
            }
        }
        this.d = null;
    }

    @Override // defpackage.so3
    public final Set c() {
        Collection linkedHashSet = new LinkedHashSet();
        if (!this.c) {
            try {
                Collection c = this.a.c();
                c.getClass();
                linkedHashSet = c;
            } catch (InterruptedIOException e) {
                throw e;
            } catch (InterruptedException e2) {
                throw e2;
            } catch (Exception e3) {
                this.b.c(e3);
                this.c = true;
                m();
            }
        }
        return (Set) linkedHashSet;
    }

    @Override // defpackage.so3
    public final long d() {
        if (this.c) {
            return 0L;
        }
        try {
            return this.a.d();
        } catch (InterruptedIOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            this.b.c(e3);
            this.c = true;
            m();
            return 0L;
        }
    }

    @Override // defpackage.so3
    public final long e(long j, long j2, String str) {
        str.getClass();
        if (this.c) {
            return 0L;
        }
        try {
            return this.a.e(j, j2, str);
        } catch (InterruptedIOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            this.b.c(e3);
            this.c = true;
            m();
            return 0L;
        }
    }

    @Override // defpackage.so3
    public final jq3 f(long j, long j2, String str) {
        str.getClass();
        jq3 jq3Var = new jq3(str, 0L, -1L, -9223372036854775807L, null);
        if (this.c) {
            return jq3Var;
        }
        try {
            jq3 f = this.a.f(j, j2, str);
            this.d = f;
            f.getClass();
            return f;
        } catch (InterruptedIOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            this.b.c(e3);
            this.c = true;
            m();
            return jq3Var;
        }
    }

    @Override // defpackage.so3
    public final jq3 g(long j, long j2, String str) {
        str.getClass();
        if (this.c) {
            return null;
        }
        try {
            jq3 g = this.a.g(j, j2, str);
            this.d = g;
            return g;
        } catch (InterruptedIOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            this.b.c(e3);
            this.c = true;
            m();
            return null;
        }
    }

    @Override // defpackage.so3
    public final long h(long j, long j2, String str) {
        str.getClass();
        if (this.c) {
            return 0L;
        }
        try {
            return this.a.h(j, j2, str);
        } catch (InterruptedIOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            this.b.c(e3);
            this.c = true;
            m();
            return 0L;
        }
    }

    @Override // defpackage.so3
    public final File i(long j, long j2, String str) {
        str.getClass();
        File file = new File("/dev/null");
        if (this.c) {
            return file;
        }
        try {
            File i = this.a.i(j, j2, str);
            i.getClass();
            return i;
        } catch (InterruptedIOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            this.b.c(e3);
            this.c = true;
            m();
            return file;
        }
    }

    @Override // defpackage.so3
    public final void j(File file, long j) {
        file.getClass();
        if (this.c) {
            return;
        }
        try {
            this.a.j(file, j);
        } catch (InterruptedIOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            this.b.c(e3);
            this.c = true;
            m();
        }
    }

    @Override // defpackage.so3
    public final void k(String str) {
        str.getClass();
        boolean z = this.c;
        if (z || z) {
            return;
        }
        try {
            this.a.k(str);
        } catch (InterruptedIOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            this.b.c(e3);
            this.c = true;
            m();
        }
    }

    @Override // defpackage.so3
    public final void l(String str, rc6 rc6Var) {
        str.getClass();
        rc6Var.getClass();
        boolean z = this.c;
        if (z || z) {
            return;
        }
        try {
            this.a.l(str, rc6Var);
        } catch (InterruptedIOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            this.b.c(e3);
            this.c = true;
            m();
        }
    }

    public final void m() {
        try {
            jq3 jq3Var = this.d;
            this.d = null;
            if (jq3Var == null || !(!jq3Var.d)) {
                return;
            }
            this.a.b(jq3Var);
        } catch (Exception unused) {
        }
    }
}
