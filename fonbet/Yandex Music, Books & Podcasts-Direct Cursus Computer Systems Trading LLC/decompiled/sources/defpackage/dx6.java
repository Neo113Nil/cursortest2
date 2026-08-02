package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public final class dx6 implements ika {
    public final nb7 a;
    public final uw6 b;
    public final pq3 c;
    public hka d;
    public volatile cx6 e;
    public volatile boolean f;

    public dx6(onh onhVar, tw6 tw6Var) {
        gnh gnhVar = onhVar.b;
        gnhVar.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = gnhVar.a;
        String str = gnhVar.f;
        vq1.C(uri, "The uri must be set.");
        nb7 nb7Var = new nb7(uri, 0L, 1, null, map, 0L, -1L, str, 4);
        this.a = nb7Var;
        zk7 zk7Var = tw6Var.f;
        uw6 b = tw6Var.b(zk7Var != null ? zk7Var.a() : null, -4000);
        this.b = b;
        this.c = new pq3(b, nb7Var, new n(24, this));
    }

    @Override // defpackage.ika
    public final void cancel() {
        this.f = true;
        cx6 cx6Var = this.e;
        if (cx6Var != null) {
            cx6Var.cancel(true);
        }
    }

    @Override // defpackage.ika
    public final void remove() {
        uw6 uw6Var = this.b;
        uw6Var.a.k(uw6Var.f.f(this.a));
    }

    @Override // defpackage.ika
    public final void t(hka hkaVar) {
        this.d = hkaVar;
        int i = 0;
        boolean z = false;
        while (!z) {
            try {
                if (this.f) {
                    break;
                }
                this.e = new cx6(this, i);
                this.e.run();
                try {
                    this.e.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof rsm)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i2 = dvt.a;
                        throw cause;
                    }
                }
            } finally {
                cx6 cx6Var = this.e;
                cx6Var.getClass();
                cx6Var.c();
            }
        }
    }
}
