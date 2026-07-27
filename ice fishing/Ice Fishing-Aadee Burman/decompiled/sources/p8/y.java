package p8;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public final class y extends y8.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f39927n;

    public y(z zVar) {
        this.f39927n = zVar;
    }

    @Override // y8.c
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // y8.c
    public final void k() {
        this.f39927n.g(EnumC4856b.f39813A);
        r rVar = this.f39927n.f39935u;
        synchronized (rVar) {
            long j6 = rVar.f39881G;
            long j9 = rVar.f39880F;
            if (j6 < j9) {
                return;
            }
            rVar.f39880F = j9 + 1;
            rVar.f39882H = System.nanoTime() + 1000000000;
            l8.c.c(rVar.f39875A, u1.h.g(new StringBuilder(), rVar.f39894v, " ping"), new c6.l(3, rVar));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
