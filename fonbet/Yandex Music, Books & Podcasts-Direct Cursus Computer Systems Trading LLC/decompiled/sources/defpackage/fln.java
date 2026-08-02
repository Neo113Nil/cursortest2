package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes5.dex */
public final class fln extends f8s {
    public final /* synthetic */ gln e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fln(String str, gln glnVar, long j) {
        super(str, true);
        this.e = glnVar;
        this.f = j;
    }

    @Override // defpackage.f8s
    public final long a() {
        gln glnVar = this.e;
        synchronized (glnVar) {
            try {
                if (!glnVar.t) {
                    wcv wcvVar = glnVar.j;
                    if (wcvVar != null) {
                        int i = glnVar.v ? glnVar.u : -1;
                        glnVar.u++;
                        glnVar.v = true;
                        if (i != -1) {
                            StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                            sb.append(glnVar.c);
                            sb.append("ms (after ");
                            glnVar.c(new SocketTimeoutException(f1d.i(sb, i - 1, " successful ping/pongs)")), null);
                        } else {
                            try {
                                pn3 pn3Var = pn3.d;
                                pn3Var.getClass();
                                wcvVar.a(9, pn3Var);
                            } catch (IOException e) {
                                glnVar.c(e, null);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f;
    }
}
