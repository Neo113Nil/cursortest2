package y8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class k implements x {

    /* renamed from: n, reason: collision with root package name */
    public final r f41964n;

    /* renamed from: u, reason: collision with root package name */
    public final Inflater f41965u;

    /* renamed from: v, reason: collision with root package name */
    public int f41966v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41967w;

    public k(r rVar, Inflater inflater) {
        this.f41964n = rVar;
        this.f41965u = inflater;
    }

    @Override // y8.x
    public final z L() {
        return this.f41964n.f41984n.L();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f41967w) {
            return;
        }
        this.f41965u.end();
        this.f41967w = true;
        this.f41964n.close();
    }

    @Override // y8.x
    public final long d(long j6, e sink) {
        long j9;
        kotlin.jvm.internal.h.e(sink, "sink");
        while (!this.f41967w) {
            r rVar = this.f41964n;
            Inflater inflater = this.f41965u;
            try {
                s J = sink.J(1);
                int min = (int) Math.min(8192L, 8192 - J.f41989c);
                if (inflater.needsInput() && !rVar.b()) {
                    s sVar = rVar.f41985u.f41952n;
                    kotlin.jvm.internal.h.b(sVar);
                    int i = sVar.f41989c;
                    int i6 = sVar.f41988b;
                    int i9 = i - i6;
                    this.f41966v = i9;
                    inflater.setInput(sVar.f41987a, i6, i9);
                }
                int inflate = inflater.inflate(J.f41987a, J.f41989c, min);
                int i10 = this.f41966v;
                if (i10 != 0) {
                    int remaining = i10 - inflater.getRemaining();
                    this.f41966v -= remaining;
                    rVar.F(remaining);
                }
                if (inflate > 0) {
                    J.f41989c += inflate;
                    j9 = inflate;
                    sink.f41953u += j9;
                } else {
                    if (J.f41988b == J.f41989c) {
                        sink.f41952n = J.a();
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
