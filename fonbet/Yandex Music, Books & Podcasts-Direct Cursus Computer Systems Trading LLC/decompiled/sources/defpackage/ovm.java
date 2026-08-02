package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ovm implements ika {
    public final Executor a;
    public final nb7 b;
    public final jp3 c;
    public final pq3 d;
    public final ssm e;
    public hka f;
    public volatile cx6 g;
    public volatile boolean h;

    public ovm(onh onhVar, ip3 ip3Var, Executor executor) {
        this.a = executor;
        gnh gnhVar = onhVar.b;
        gnhVar.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = gnhVar.a;
        String str = gnhVar.f;
        vq1.C(uri, "The uri must be set.");
        nb7 nb7Var = new nb7(uri, 0L, 1, null, map, 0L, -1L, str, 4);
        this.b = nb7Var;
        jp3 c = ip3Var.c();
        this.c = c;
        this.d = new pq3(c, nb7Var, null, new uvg(27, this));
        this.e = ip3Var.g;
    }

    @Override // defpackage.ika
    public final void cancel() {
        this.h = true;
        cx6 cx6Var = this.g;
        if (cx6Var != null) {
            cx6Var.cancel(true);
        }
    }

    @Override // defpackage.ika
    public final void remove() {
        jp3 jp3Var = this.c;
        jp3Var.a.k(jp3Var.e.f(this.b));
    }

    @Override // defpackage.ika
    public final void t(hka hkaVar) {
        this.f = hkaVar;
        ssm ssmVar = this.e;
        if (ssmVar != null) {
            ssmVar.a(-4000);
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.h) {
                    break;
                }
                this.g = new cx6(this, 1);
                ssm ssmVar2 = this.e;
                if (ssmVar2 != null) {
                    ssmVar2.b();
                }
                this.a.execute(this.g);
                try {
                    this.g.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof rsm)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i = dvt.a;
                        throw cause;
                    }
                }
            } catch (Throwable th) {
                cx6 cx6Var = this.g;
                cx6Var.getClass();
                cx6Var.c();
                ssm ssmVar3 = this.e;
                if (ssmVar3 != null) {
                    ssmVar3.d(-4000);
                }
                throw th;
            }
        }
        cx6 cx6Var2 = this.g;
        cx6Var2.getClass();
        cx6Var2.c();
        ssm ssmVar4 = this.e;
        if (ssmVar4 != null) {
            ssmVar4.d(-4000);
        }
    }

    public ovm(onh onhVar, ip3 ip3Var) {
        this(onhVar, ip3Var, new gx0(1));
    }
}
