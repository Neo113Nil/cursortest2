package defpackage;

import java.io.EOFException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes9.dex */
public final class usv implements y9t0 {
    public final jci0 a;
    public final Inflater b;
    public int c;
    public boolean w;

    public usv(y9t0 y9t0Var, Inflater inflater) {
        this(new jci0(y9t0Var), inflater);
    }

    public final long a(yp6 yp6Var, long j) {
        Inflater inflater = this.b;
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.w) {
            ny61.r("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                t7q0 a0 = yp6Var.a0(1);
                int min = (int) Math.min(j, 8192 - a0.c);
                boolean needsInput = inflater.needsInput();
                jci0 jci0Var = this.a;
                if (needsInput && !jci0Var.I1()) {
                    t7q0 t7q0Var = jci0Var.b.a;
                    int i = t7q0Var.c;
                    int i2 = t7q0Var.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(t7q0Var.a, i2, i3);
                }
                int inflate = inflater.inflate(a0.a, a0.c, min);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.c -= remaining;
                    jci0Var.skip(remaining);
                }
                if (inflate > 0) {
                    a0.c += inflate;
                    long j2 = inflate;
                    yp6Var.b += j2;
                    return j2;
                }
                if (a0.b == a0.c) {
                    yp6Var.a = a0.a();
                    p8q0.a(a0);
                }
            } catch (DataFormatException e) {
                kbs.r(e);
                return 0L;
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.w) {
            return;
        }
        this.b.end();
        this.w = true;
        this.a.close();
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        do {
            long a = a(yp6Var, j);
            if (a > 0) {
                return a;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.I1());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.a.a.timeout();
    }

    public usv(jci0 jci0Var, Inflater inflater) {
        this.a = jci0Var;
        this.b = inflater;
    }
}
