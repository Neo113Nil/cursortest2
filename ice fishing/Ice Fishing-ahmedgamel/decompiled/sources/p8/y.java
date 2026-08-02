package p8;

import com.google.android.gms.internal.ads.Wv;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public final class y extends y8.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f39977n;

    public y(z zVar) {
        this.f39977n = zVar;
    }

    @Override // y8.c
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // y8.c
    public final void k() {
        this.f39977n.f(EnumC4856b.f39863A);
        r rVar = this.f39977n.f39985u;
        synchronized (rVar) {
            long j6 = rVar.f39931G;
            long j9 = rVar.f39930F;
            if (j6 < j9) {
                return;
            }
            rVar.f39930F = j9 + 1;
            rVar.f39932H = System.nanoTime() + 1000000000;
            l8.c.c(rVar.f39925A, Wv.i(new StringBuilder(), rVar.f39944v, " ping"), new c6.l(3, rVar));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
