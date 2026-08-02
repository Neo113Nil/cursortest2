package defpackage;

/* loaded from: classes3.dex */
public final class a5h implements vsr {
    public final /* synthetic */ vsr a;
    public final /* synthetic */ vsr b;
    public final /* synthetic */ e1n c;
    public final /* synthetic */ jyr d;
    public final /* synthetic */ xdh e;

    public a5h(vsr vsrVar, e1n e1nVar, jyr jyrVar, xdh xdhVar) {
        this.b = vsrVar;
        this.c = e1nVar;
        this.d = jyrVar;
        this.e = xdhVar;
        this.a = vsrVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.vsr
    public final String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override // defpackage.vsr
    public final rsr getReadableDatabase() {
        return new vdh(new a7n(this.b.getReadableDatabase(), this.c, this.d), this.e);
    }

    @Override // defpackage.vsr
    public final rsr getWritableDatabase() {
        return new vdh(new a7n(this.b.getWritableDatabase(), this.c, this.d), this.e);
    }

    @Override // defpackage.vsr
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}
