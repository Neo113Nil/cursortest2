package y8;

import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public final class n implements v {

    /* renamed from: n, reason: collision with root package name */
    public final FileOutputStream f41972n;

    /* renamed from: u, reason: collision with root package name */
    public final z f41973u;

    public n(FileOutputStream out, z zVar) {
        kotlin.jvm.internal.h.e(out, "out");
        this.f41972n = out;
        this.f41973u = zVar;
    }

    @Override // y8.v
    public final z L() {
        return this.f41973u;
    }

    @Override // y8.v
    public final void T(long j6, e eVar) {
        b.d(eVar.f41953u, 0L, j6);
        while (j6 > 0) {
            this.f41973u.f();
            s sVar = eVar.f41952n;
            kotlin.jvm.internal.h.b(sVar);
            int min = (int) Math.min(j6, sVar.f41989c - sVar.f41988b);
            this.f41972n.write(sVar.f41987a, sVar.f41988b, min);
            int i = sVar.f41988b + min;
            sVar.f41988b = i;
            long j9 = min;
            j6 -= j9;
            eVar.f41953u -= j9;
            if (i == sVar.f41989c) {
                eVar.f41952n = sVar.a();
                t.a(sVar);
            }
        }
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41972n.close();
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        this.f41972n.flush();
    }

    public final String toString() {
        return "sink(" + this.f41972n + ')';
    }
}
