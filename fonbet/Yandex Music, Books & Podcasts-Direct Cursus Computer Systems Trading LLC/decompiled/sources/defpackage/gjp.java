package defpackage;

import io.grpc.internal.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class gjp implements ujp {
    @Override // defpackage.mjr
    public final void t(ljr ljrVar) {
        while (true) {
            uhe uheVar = (uhe) ljrVar;
            InputStream next = uheVar.next();
            if (next == null) {
                return;
            }
            try {
                next.close();
            } catch (IOException e) {
                while (true) {
                    InputStream next2 = uheVar.next();
                    if (next2 == null) {
                        b6e.q(e);
                        return;
                    } else {
                        try {
                            next2.close();
                        } catch (IOException e2) {
                            b.w.log(Level.WARNING, "Exception closing stream", (Throwable) e2);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.mjr
    public final void onReady() {
    }

    @Override // defpackage.ujp
    public final void q() {
    }

    @Override // defpackage.ujp
    public final void s(sgr sgrVar) {
    }
}
