package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a5e extends x4e {
    public long d;
    public final /* synthetic */ rd2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5e(rd2 rd2Var, long j) {
        super(rd2Var);
        this.e = rd2Var;
        this.d = j;
        if (j == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.b) {
            return;
        }
        if (this.d != 0) {
            byte[] bArr = cvt.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = cvt.u(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                ((okn) this.e.d).k();
                a();
            }
        }
        this.b = true;
    }

    @Override // defpackage.x4e, defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.b) {
            xq0.q("closed");
            return 0L;
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long e0 = super.e0(hi3Var, Math.min(j2, j));
        if (e0 == -1) {
            ((okn) this.e.d).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j3 = this.d - e0;
        this.d = j3;
        if (j3 == 0) {
            a();
        }
        return e0;
    }
}
