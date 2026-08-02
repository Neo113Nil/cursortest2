package defpackage;

/* loaded from: classes.dex */
public final class i42 implements vsr, ew7 {
    public final vsr a;
    public final a42 b;
    public final f42 c;

    public i42(vsr vsrVar, a42 a42Var) {
        vsrVar.getClass();
        this.a = vsrVar;
        this.b = a42Var;
        this.c = new f42(a42Var);
        if (vsrVar instanceof i42) {
            xq0.x("Failed requirement.");
            throw null;
        }
        a42Var.d = vsrVar;
    }

    @Override // defpackage.ew7
    public final vsr a() {
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.vsr
    public final String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override // defpackage.vsr
    public final rsr getReadableDatabase() {
        f42 f42Var = this.c;
        a42 a42Var = f42Var.a;
        try {
            a42Var.e().getClass();
            return f42Var;
        } finally {
            a42Var.c();
        }
    }

    @Override // defpackage.vsr
    public final rsr getWritableDatabase() {
        f42 f42Var = this.c;
        a42 a42Var = f42Var.a;
        try {
            a42Var.e().getClass();
            return f42Var;
        } finally {
            a42Var.c();
        }
    }

    @Override // defpackage.vsr
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}
