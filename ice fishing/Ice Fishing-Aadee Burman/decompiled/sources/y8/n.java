package y8;

import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public final class n implements v {

    /* renamed from: n, reason: collision with root package name */
    public final FileOutputStream f41969n;

    /* renamed from: u, reason: collision with root package name */
    public final z f41970u;

    public n(FileOutputStream out, z zVar) {
        kotlin.jvm.internal.h.e(out, "out");
        this.f41969n = out;
        this.f41970u = zVar;
    }

    @Override // y8.v
    public final z L() {
        return this.f41970u;
    }

    @Override // y8.v
    public final void T(long j6, e eVar) {
        b.d(eVar.f41950u, 0L, j6);
        while (j6 > 0) {
            this.f41970u.f();
            s sVar = eVar.f41949n;
            kotlin.jvm.internal.h.b(sVar);
            int min = (int) Math.min(j6, sVar.f41986c - sVar.f41985b);
            this.f41969n.write(sVar.f41984a, sVar.f41985b, min);
            int i = sVar.f41985b + min;
            sVar.f41985b = i;
            long j9 = min;
            j6 -= j9;
            eVar.f41950u -= j9;
            if (i == sVar.f41986c) {
                eVar.f41949n = sVar.a();
                t.a(sVar);
            }
        }
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41969n.close();
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        this.f41969n.flush();
    }

    public final String toString() {
        return "sink(" + this.f41969n + ')';
    }
}
