package y8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class k implements x {

    /* renamed from: n, reason: collision with root package name */
    public final r f41961n;

    /* renamed from: u, reason: collision with root package name */
    public final Inflater f41962u;

    /* renamed from: v, reason: collision with root package name */
    public int f41963v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41964w;

    public k(r rVar, Inflater inflater) {
        this.f41961n = rVar;
        this.f41962u = inflater;
    }

    @Override // y8.x
    public final z L() {
        return this.f41961n.f41981n.L();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f41964w) {
            return;
        }
        this.f41962u.end();
        this.f41964w = true;
        this.f41961n.close();
    }

    @Override // y8.x
    public final long d(long j6, e sink) {
        long j9;
        kotlin.jvm.internal.h.e(sink, "sink");
        while (!this.f41964w) {
            r rVar = this.f41961n;
            Inflater inflater = this.f41962u;
            try {
                s J = sink.J(1);
                int min = (int) Math.min(8192L, 8192 - J.f41986c);
                if (inflater.needsInput() && !rVar.b()) {
                    s sVar = rVar.f41982u.f41949n;
                    kotlin.jvm.internal.h.b(sVar);
                    int i = sVar.f41986c;
                    int i6 = sVar.f41985b;
                    int i9 = i - i6;
                    this.f41963v = i9;
                    inflater.setInput(sVar.f41984a, i6, i9);
                }
                int inflate = inflater.inflate(J.f41984a, J.f41986c, min);
                int i10 = this.f41963v;
                if (i10 != 0) {
                    int remaining = i10 - inflater.getRemaining();
                    this.f41963v -= remaining;
                    rVar.F(remaining);
                }
                if (inflate > 0) {
                    J.f41986c += inflate;
                    j9 = inflate;
                    sink.f41950u += j9;
                } else {
                    if (J.f41985b == J.f41986c) {
                        sink.f41949n = J.a();
                        t.a(J);
                    }
                    j9 = 0;
                }
                if (j9 > 0) {
                    return j9;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (rVar.b()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e9) {
                throw new IOException(e9);
            }
        }
        throw new IllegalStateException("closed");
    }
}
