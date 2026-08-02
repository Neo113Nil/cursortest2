package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutinesInternalError;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes9.dex */
public abstract class qyj extends xsx0 {
    public int c;

    public qyj(int i) {
        this.c = i;
    }

    public void a(CancellationException cancellationException) {
    }

    public abstract Continuation d();

    public Throwable e(Object obj) {
        tzc tzcVar = obj instanceof tzc ? (tzc) obj : null;
        if (tzcVar != null) {
            return tzcVar.a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th) {
        d6z.I(d().get_context(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.l8x) r5.get(defpackage.seu.C);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            pyj pyjVar = (pyj) d();
            ContinuationImpl continuationImpl = pyjVar.x;
            Object obj = pyjVar.z;
            fse fseVar = continuationImpl.get_context();
            Object H = gwk0.H(fseVar, obj);
            l8x l8xVar = null;
            zx11 n0 = H != gwk0.d ? q5z.n0(continuationImpl, fseVar, H) : null;
            try {
                fse fseVar2 = continuationImpl.get_context();
                Object h = h();
                Throwable e = e(h);
                if (e == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (l8xVar != null && !l8xVar.isActive()) {
                    CancellationException I = l8xVar.I();
                    a(I);
                    continuationImpl.resumeWith(new Result.Failure(I));
                } else if (e != null) {
                    continuationImpl.resumeWith(new Result.Failure(e));
                } else {
                    continuationImpl.resumeWith(f(h));
                }
                if (n0 == null || n0.o0()) {
                    gwk0.x(fseVar, H);
                }
            } catch (Throwable th) {
                if (n0 == null || n0.o0()) {
                    gwk0.x(fseVar, H);
                }
                throw th;
            }
        } catch (DispatchException e2) {
            d6z.I(d().get_context(), e2.getCause());
        } catch (Throwable th2) {
            g(th2);
        }
    }
}
