package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class tp3 implements n3r {
    public boolean a;
    public final /* synthetic */ ij3 b;
    public final /* synthetic */ yk3 c;
    public final /* synthetic */ hkn d;

    public tp3(ij3 ij3Var, yk3 yk3Var, hkn hknVar) {
        this.b = ij3Var;
        this.c = yk3Var;
        this.d = hknVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (!this.a) {
            byte[] bArr = cvt.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = cvt.u(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.a = true;
                this.c.c();
            }
        }
        this.b.close();
    }

    @Override // defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        try {
            long e0 = this.b.e0(hi3Var, j);
            hkn hknVar = this.d;
            if (e0 != -1) {
                hi3Var.I(hknVar.b, hi3Var.b - e0, e0);
                hknVar.a();
                return e0;
            }
            if (!this.a) {
                this.a = true;
                hknVar.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.a) {
                throw e;
            }
            this.a = true;
            this.c.c();
            throw e;
        }
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.b.i();
    }
}
