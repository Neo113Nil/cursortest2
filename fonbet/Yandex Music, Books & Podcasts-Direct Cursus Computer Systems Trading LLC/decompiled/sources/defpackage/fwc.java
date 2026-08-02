package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class fwc implements vsr {
    public final Context a;
    public final String b;
    public final ssr c;
    public final boolean d;
    public final boolean e;
    public final jyr f;
    public boolean g;

    public fwc(Context context, String str, ssr ssrVar, boolean z, boolean z2) {
        context.getClass();
        ssrVar.getClass();
        this.a = context;
        this.b = str;
        this.c = ssrVar;
        this.d = z;
        this.e = z2;
        this.f = btf.b(new ita(19, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        jyr jyrVar = this.f;
        if (jyrVar.isInitialized()) {
            ((ewc) jyrVar.getValue()).close();
        }
    }

    @Override // defpackage.vsr
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.vsr
    public final rsr getReadableDatabase() {
        return ((ewc) this.f.getValue()).a(false);
    }

    @Override // defpackage.vsr
    public final rsr getWritableDatabase() {
        return ((ewc) this.f.getValue()).a(true);
    }

    @Override // defpackage.vsr
    public final void setWriteAheadLoggingEnabled(boolean z) {
        jyr jyrVar = this.f;
        if (jyrVar.isInitialized()) {
            ((ewc) jyrVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.g = z;
    }
}
