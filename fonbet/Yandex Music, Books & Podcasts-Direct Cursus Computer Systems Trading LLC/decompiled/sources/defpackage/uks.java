package defpackage;

import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uks implements Runnable {
    public final /* synthetic */ int a;
    public final lcg b;
    public final zt3 c;

    public uks(lcg lcgVar, zt3 zt3Var, int i) {
        this.a = i;
        lcgVar.getClass();
        switch (i) {
            case 1:
                this.b = lcgVar;
                this.c = zt3Var;
                break;
            default:
                this.b = lcgVar;
                this.c = zt3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zt3 zt3Var = this.c;
        lcg lcgVar = this.b;
        switch (i) {
            case 0:
                if (lcgVar.isCancelled()) {
                    zt3Var.h(null);
                    return;
                }
                try {
                    r7o r7oVar = z7o.b;
                    boolean z = false;
                    while (true) {
                        try {
                            Object obj = lcgVar.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            zt3Var.resumeWith(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    r7o r7oVar2 = z7o.b;
                    Throwable cause = e.getCause();
                    cause.getClass();
                    zt3Var.resumeWith(new t7o(cause));
                    return;
                }
            default:
                if (lcgVar.isCancelled()) {
                    zt3Var.h(null);
                    return;
                }
                try {
                    r7o r7oVar3 = z7o.b;
                    zt3Var.resumeWith(k9.h(lcgVar));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    if (cause2 == null) {
                        Intrinsics.i();
                    }
                    r7o r7oVar4 = z7o.b;
                    zt3Var.resumeWith(qgg.J(cause2));
                    return;
                }
        }
    }
}
