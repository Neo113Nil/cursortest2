package p8;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public final class y extends y8.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f39930n;

    public y(z zVar) {
        this.f39930n = zVar;
    }

    @Override // y8.c
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // y8.c
    public final void k() {
        this.f39930n.g(EnumC4856b.f39816A);
        r rVar = this.f39930n.f39938u;
        synchronized (rVar) {
            long j6 = rVar.f39884G;
            long j9 = rVar.f39883F;
            if (j6 < j9) {
                return;
            }
            rVar.f39883F = j9 + 1;
            rVar.f39885H = System.nanoTime() + 1000000000;
            l8.c.c(rVar.f39878A, u1.h.g(new StringBuilder(), rVar.f39897v, " ping"), new c6.l(3, rVar));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
