package W1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: a, reason: collision with root package name */
    public final q f1886a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f1887b;

    /* renamed from: c, reason: collision with root package name */
    public int f1888c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1889d;

    public m(q qVar, Inflater inflater) {
        this.f1886a = qVar;
        this.f1887b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1889d) {
            return;
        }
        this.f1887b.end();
        this.f1889d = true;
        this.f1886a.close();
    }

    @Override // W1.w
    public final y d() {
        return this.f1886a.f1895a.d();
    }

    @Override // W1.w
    public final long e(g sink, long j2) {
        long j3;
        kotlin.jvm.internal.i.e(sink, "sink");
        while (!this.f1889d) {
            q qVar = this.f1886a;
            Inflater inflater = this.f1887b;
            try {
                r q2 = sink.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f1900c);
                if (inflater.needsInput() && !qVar.a()) {
                    r rVar = qVar.f1896b.f1874a;
                    kotlin.jvm.internal.i.b(rVar);
                    int i2 = rVar.f1900c;
                    int i3 = rVar.f1899b;
                    int i4 = i2 - i3;
                    this.f1888c = i4;
                    inflater.setInput(rVar.f1898a, i3, i4);
                }
                int inflate = inflater.inflate(q2.f1898a, q2.f1900c, min);
                int i5 = this.f1888c;
                if (i5 != 0) {
                    int remaining = i5 - inflater.getRemaining();
                    this.f1888c -= remaining;
                    qVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f1900c += inflate;
                    j3 = inflate;
                    sink.f1875b += j3;
                } else {
                    if (q2.f1899b == q2.f1900c) {
                        sink.f1874a = q2.a();
                        s.a(q2);
                    }
                    j3 = 0;
                }
                if (j3 > 0) {
                    return j3;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (qVar.a()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        }
        throw new IllegalStateException("closed");
    }
}
