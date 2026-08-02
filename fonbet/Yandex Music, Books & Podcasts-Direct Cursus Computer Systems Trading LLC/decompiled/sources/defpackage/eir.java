package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class eir implements vdr {
    public final xr7 a;

    public eir(xr7 xr7Var) {
        this.a = xr7Var;
    }

    @Override // defpackage.u0q
    public final List b() {
        return t75.c(this.a.f.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        dir dirVar;
        int i;
        sa8 sa8Var;
        if (continuation instanceof dir) {
            dirVar = (dir) continuation;
            int i2 = dirVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dirVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dirVar.k;
                nm6 nm6Var = nm6.a;
                i = dirVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    xdr a = ydr.a(this.a.f.c);
                    xr7 xr7Var = this.a;
                    sa8 c = xr7Var.f.c(zdg.A(new hxo(13, a)));
                    try {
                        dirVar.j = c;
                        dirVar.m = 1;
                        a.collect(rjcVar, dirVar);
                        return nm6Var;
                    } catch (Throwable th) {
                        th = th;
                        sa8Var = c;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sa8Var = dirVar.j;
                    try {
                        qgg.h0(obj);
                        throw new fif();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                sa8Var.a.invoke(sa8Var);
                throw th;
            }
        }
        dirVar = new dir(this, continuation);
        Object obj2 = dirVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dirVar.m;
        if (i != 0) {
        }
        sa8Var.a.invoke(sa8Var);
        throw th;
    }

    @Override // defpackage.vdr
    public final Object getValue() {
        return this.a.f.c;
    }
}
