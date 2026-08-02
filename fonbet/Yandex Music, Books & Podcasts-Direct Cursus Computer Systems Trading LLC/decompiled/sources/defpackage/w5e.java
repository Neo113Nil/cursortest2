package defpackage;

import java.net.SocketTimeoutException;

/* loaded from: classes5.dex */
public final class w5e extends mt1 {
    public final /* synthetic */ x5e m;

    public w5e(x5e x5eVar) {
        this.m = x5eVar;
    }

    @Override // defpackage.mt1
    public final void k() {
        this.m.e(9);
        o5e o5eVar = this.m.b;
        synchronized (o5eVar) {
            long j = o5eVar.n;
            long j2 = o5eVar.m;
            if (j < j2) {
                return;
            }
            o5eVar.m = j2 + 1;
            o5eVar.o = System.nanoTime() + 1000000000;
            o5eVar.h.c(new h78(su4.o(new StringBuilder(), o5eVar.c, " ping"), o5eVar, 1), 0L);
        }
    }

    public final void l() {
        if (j()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
