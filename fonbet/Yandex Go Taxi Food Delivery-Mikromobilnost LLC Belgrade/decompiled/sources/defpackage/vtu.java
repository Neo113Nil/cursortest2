package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes9.dex */
public final class vtu extends stu {
    public long x;
    public final /* synthetic */ xtu y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtu(xtu xtuVar, kwu kwuVar, long j) {
        super(xtuVar, kwuVar);
        this.y = xtuVar;
        this.x = j;
        if (j == 0) {
            a(meu.b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.c) {
            return;
        }
        if (this.x != 0) {
            try {
                z = bg61.h(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.y.b.b();
                a(xtu.f);
            }
        }
        this.c = true;
    }

    @Override // defpackage.stu, defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            ny61.r("closed");
            return 0L;
        }
        long j2 = this.x;
        if (j2 == 0) {
            return -1L;
        }
        long read = super.read(yp6Var, Math.min(j2, j));
        if (read == -1) {
            this.y.b.b();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(xtu.f);
            throw protocolException;
        }
        long j3 = this.x - read;
        this.x = j3;
        if (j3 == 0) {
            a(meu.b);
        }
        return read;
    }
}
