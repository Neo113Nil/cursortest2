package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class alc implements pjc {
    public final /* synthetic */ pjc a;
    public final /* synthetic */ aur b;

    /* JADX WARN: Multi-variable type inference failed */
    public alc(pjc pjcVar, pyc pycVar) {
        this.a = pjcVar;
        this.b = (aur) pycVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r9v6, types: [aur, pyc] */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        zkc zkcVar;
        nm6 nm6Var;
        int i;
        alc alcVar;
        ggs ggsVar;
        ?? r2;
        xmo xmoVar;
        Throwable th;
        xmo xmoVar2;
        ?? r9;
        try {
            if (continuation instanceof zkc) {
                zkcVar = (zkc) continuation;
                int i2 = zkcVar.k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zkcVar.k = i2 - Integer.MIN_VALUE;
                    Object obj = zkcVar.j;
                    nm6Var = nm6.a;
                    i = zkcVar.k;
                    if (i != 0) {
                        qgg.h0(obj);
                        try {
                            pjc pjcVar = this.a;
                            zkcVar.m = this;
                            zkcVar.n = rjcVar;
                            zkcVar.k = 1;
                            if (pjcVar.collect(rjcVar, zkcVar) != nm6Var) {
                                alcVar = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            alcVar = this;
                            ggsVar = new ggs(th);
                            r2 = alcVar.b;
                            zkcVar.m = th;
                            zkcVar.n = null;
                            zkcVar.k = 2;
                            if (nt0.s(ggsVar, r2, th, zkcVar) != nm6Var) {
                                return nm6Var;
                            }
                            throw th;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            Throwable th3 = (Throwable) zkcVar.m;
                            qgg.h0(obj);
                            throw th3;
                        }
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xmoVar2 = (xmo) zkcVar.m;
                        try {
                            qgg.h0(obj);
                            xmoVar2.releaseIntercepted();
                            return Unit.a;
                        } catch (Throwable th4) {
                            th = th4;
                            xmoVar2.releaseIntercepted();
                            throw th;
                        }
                    }
                    rjcVar = zkcVar.n;
                    alcVar = (alc) zkcVar.m;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        ggsVar = new ggs(th);
                        r2 = alcVar.b;
                        zkcVar.m = th;
                        zkcVar.n = null;
                        zkcVar.k = 2;
                        if (nt0.s(ggsVar, r2, th, zkcVar) != nm6Var) {
                        }
                    }
                    xmoVar = new xmo(rjcVar, zkcVar.getContext());
                    r9 = alcVar.b;
                    zkcVar.m = xmoVar;
                    zkcVar.n = null;
                    zkcVar.k = 3;
                    if (r9.invoke(xmoVar, null, zkcVar) != nm6Var) {
                        xmoVar2 = xmoVar;
                        xmoVar2.releaseIntercepted();
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            r9 = alcVar.b;
            zkcVar.m = xmoVar;
            zkcVar.n = null;
            zkcVar.k = 3;
            if (r9.invoke(xmoVar, null, zkcVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th6) {
            th = th6;
            xmoVar2 = xmoVar;
            xmoVar2.releaseIntercepted();
            throw th;
        }
        zkcVar = new zkc(this, continuation);
        Object obj2 = zkcVar.j;
        nm6Var = nm6.a;
        i = zkcVar.k;
        if (i != 0) {
        }
        xmoVar = new xmo(rjcVar, zkcVar.getContext());
    }
}
