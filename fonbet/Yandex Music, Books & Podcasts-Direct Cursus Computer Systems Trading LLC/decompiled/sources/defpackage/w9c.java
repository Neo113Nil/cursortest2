package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class w9c extends tce {
    public final cak a;
    public final lac b;
    public final String c;
    public final Closeable d;
    public boolean e;
    public ikn f;

    public w9c(cak cakVar, lac lacVar, String str, Closeable closeable) {
        this.a = cakVar;
        this.b = lacVar;
        this.c = str;
        this.d = closeable;
    }

    @Override // defpackage.tce
    public final synchronized cak a() {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        return this.a;
    }

    @Override // defpackage.tce
    public final cak b() {
        return a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.e = true;
            ikn iknVar = this.f;
            if (iknVar != null) {
                k.a(iknVar);
            }
            Closeable closeable = this.d;
            if (closeable != null) {
                k.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.tce
    public final vnj g() {
        return null;
    }

    @Override // defpackage.tce
    public final synchronized ij3 o() {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        ikn iknVar = this.f;
        if (iknVar != null) {
            return iknVar;
        }
        ikn u = fxf.u(this.b.l(this.a));
        this.f = u;
        return u;
    }
}
