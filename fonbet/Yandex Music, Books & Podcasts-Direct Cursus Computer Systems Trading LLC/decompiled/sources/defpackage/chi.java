package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class chi implements n3r {
    public final /* synthetic */ dhi a;

    public chi(dhi dhiVar) {
        this.a = dhiVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dhi dhiVar = this.a;
        if (Intrinsics.d(dhiVar.g, this)) {
            dhiVar.g = null;
        }
    }

    @Override // defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        dhi dhiVar = this.a;
        if (!Intrinsics.d(dhiVar.g, this)) {
            xq0.q("closed");
            return 0L;
        }
        long a = dhiVar.a(j);
        if (a == 0) {
            return -1L;
        }
        return dhiVar.a.e0(hi3Var, a);
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.a.a.i();
    }
}
