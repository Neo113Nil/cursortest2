package y8;

import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public final class n implements v {

    /* renamed from: n, reason: collision with root package name */
    public final FileOutputStream f41943n;

    /* renamed from: u, reason: collision with root package name */
    public final z f41944u;

    public n(FileOutputStream out, z zVar) {
        kotlin.jvm.internal.h.e(out, "out");
        this.f41943n = out;
        this.f41944u = zVar;
    }

    @Override // y8.v
    public final z L() {
        return this.f41944u;
    }

    @Override // y8.v
    public final void T(long j6, e eVar) {
        b.d(eVar.f41924u, 0L, j6);
        while (j6 > 0) {
            this.f41944u.f();
            s sVar = eVar.f41923n;
            kotlin.jvm.internal.h.b(sVar);
            int min = (int) Math.min(j6, sVar.f41960c - sVar.f41959b);
            this.f41943n.write(sVar.f41958a, sVar.f41959b, min);
            int i = sVar.f41959b + min;
            sVar.f41959b = i;
            long j9 = min;
            j6 -= j9;
            eVar.f41924u -= j9;
            if (i == sVar.f41960c) {
                eVar.f41923n = sVar.a();
                t.a(sVar);
            }
        }
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41943n.close();
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        this.f41943n.flush();
    }

    public final String toString() {
        return "sink(" + this.f41943n + ')';
    }
}
