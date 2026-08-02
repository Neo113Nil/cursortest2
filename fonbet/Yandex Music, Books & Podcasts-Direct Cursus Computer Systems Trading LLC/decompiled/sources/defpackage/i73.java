package defpackage;

import java.io.File;
import java.util.Set;

/* loaded from: classes4.dex */
public final class i73 implements so3 {
    public final rjn a;
    public final l73 b;

    public i73(rjn rjnVar, l73 l73Var) {
        this.a = rjnVar;
        this.b = l73Var;
    }

    @Override // defpackage.so3
    public final qc6 a(String str) {
        str.getClass();
        return this.a.a(str);
    }

    @Override // defpackage.so3
    public final void b(jq3 jq3Var) {
        jq3Var.getClass();
    }

    @Override // defpackage.so3
    public final Set c() {
        rjn.m();
        throw null;
    }

    @Override // defpackage.so3
    public final long d() {
        rjn.m();
        throw null;
    }

    @Override // defpackage.so3
    public final long e(long j, long j2, String str) {
        str.getClass();
        return this.a.a.e(j, j2, str);
    }

    @Override // defpackage.so3
    public final jq3 f(long j, long j2, String str) {
        str.getClass();
        l73 l73Var = this.b;
        synchronized (l73Var.a) {
            while (!l73Var.b) {
                l73Var.a.wait(5000L);
            }
        }
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
        return this.a.a.h(j, j2, str);
    }

    @Override // defpackage.so3
    public final File i(long j, long j2, String str) {
        str.getClass();
        rjn.m();
        throw null;
    }

    @Override // defpackage.so3
    public final void j(File file, long j) {
        file.getClass();
        rjn.m();
        throw null;
    }

    @Override // defpackage.so3
    public final void k(String str) {
        str.getClass();
        rjn.m();
        throw null;
    }

    @Override // defpackage.so3
    public final void l(String str, rc6 rc6Var) {
        str.getClass();
        rc6Var.getClass();
        this.a.l(str, rc6Var);
    }
}
