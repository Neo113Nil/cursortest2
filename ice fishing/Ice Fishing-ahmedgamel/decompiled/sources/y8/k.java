package y8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class k implements x {

    /* renamed from: n, reason: collision with root package name */
    public final r f41935n;

    /* renamed from: u, reason: collision with root package name */
    public final Inflater f41936u;

    /* renamed from: v, reason: collision with root package name */
    public int f41937v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41938w;

    public k(r rVar, Inflater inflater) {
        this.f41935n = rVar;
        this.f41936u = inflater;
    }

    @Override // y8.x
    public final z L() {
        return this.f41935n.f41955n.L();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f41938w) {
            return;
        }
        this.f41936u.end();
        this.f41938w = true;
        this.f41935n.close();
    }

    @Override // y8.x
    public final long d(long j6, e sink) {
        long j9;
        kotlin.jvm.internal.h.e(sink, "sink");
        while (!this.f41938w) {
            r rVar = this.f41935n;
            Inflater inflater = this.f41936u;
            try {
                s J = sink.J(1);
                int min = (int) Math.min(8192L, 8192 - J.f41960c);
                if (inflater.needsInput() && !rVar.b()) {
                    s sVar = rVar.f41956u.f41923n;
                    kotlin.jvm.internal.h.b(sVar);
                    int i = sVar.f41960c;
                    int i4 = sVar.f41959b;
                    int i6 = i - i4;
                    this.f41937v = i6;
                    inflater.setInput(sVar.f41958a, i4, i6);
                }
                int inflate = inflater.inflate(J.f41958a, J.f41960c, min);
                int i9 = this.f41937v;
                if (i9 != 0) {
                    int remaining = i9 - inflater.getRemaining();
                    this.f41937v -= remaining;
                    rVar.F(remaining);
                }
                if (inflate > 0) {
                    J.f41960c += inflate;
                    j9 = inflate;
                    sink.f41924u += j9;
                } else {
                    if (J.f41959b == J.f41960c) {
                        sink.f41923n = J.a();
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
