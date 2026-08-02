package defpackage;

import com.yandex.media.ynison.service.f0;
import com.yandex.media.ynison.service.g0;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class dow extends b6 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(f0 f0Var, s2i s2iVar, cg6 cg6Var) {
        cow cowVar;
        int i;
        if (cg6Var instanceof cow) {
            cowVar = (cow) cg6Var;
            int i2 = cowVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cowVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cowVar.j;
                nm6 nm6Var = nm6.a;
                i = cowVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mc4 mc4Var = (mc4) this.b;
                    mc4Var.getClass();
                    k3i k3iVar = bow.a;
                    if (k3iVar == null) {
                        synchronized (bow.class) {
                            try {
                                k3iVar = bow.a;
                                if (k3iVar == null) {
                                    yk3 b = k3i.b();
                                    b.d = j3i.a;
                                    b.e = k3i.a("ynison_redirect.YnisonRedirectService", "GetRedirectToYnison");
                                    b.a = true;
                                    f0 f = f0.f();
                                    z0c z0cVar = tym.a;
                                    b.b = new sym(f);
                                    b.c = new sym(g0.f());
                                    k3iVar = b.n();
                                    bow.a = k3iVar;
                                }
                            } finally {
                            }
                        }
                    }
                    k3i k3iVar2 = k3iVar;
                    ks3 ks3Var = (ks3) this.c;
                    ks3Var.getClass();
                    cowVar.l = 1;
                    if (k3iVar2.a != j3i.a) {
                        l1j.p(k3iVar2, "Expected a unary RPC method, but got ");
                        return null;
                    }
                    obj = zsd.E0(vut.S(new eno(new xg(mc4Var, k3iVar2, ks3Var, s2iVar, new bo4(f0Var), (Continuation) null, 3)), k3iVar2), cowVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        cowVar = new cow(this, cg6Var);
        Object obj2 = cowVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cowVar.l;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
