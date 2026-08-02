package defpackage;

import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.e0;
import com.yandex.media.ynison.service.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jsw {
    public static final String f = f1d.g("YnisonShared:", "Interceptor");
    public final gsw a;
    public final phw b;
    public final amw c;
    public final biw d;
    public final xdr e = ydr.a(null);

    public jsw(gsw gswVar, phw phwVar, amw amwVar, slw slwVar, biw biwVar, rgw rgwVar) {
        this.a = gswVar;
        this.b = phwVar;
        this.c = amwVar;
        this.d = biwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(orw orwVar, cg6 cg6Var) {
        hsw hswVar;
        int i;
        xdr xdrVar;
        ohw ohwVar;
        Object n;
        boolean y;
        if (cg6Var instanceof hsw) {
            hswVar = (hsw) cg6Var;
            int i2 = hswVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hswVar.n = i2 - Integer.MIN_VALUE;
                Object obj = hswVar.l;
                nm6 nm6Var = nm6.a;
                i = hswVar.n;
                xdrVar = this.e;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (orwVar == null) {
                        return new fs(15, continuation);
                    }
                    ohwVar = (ohw) xdrVar.getValue();
                    if (ohwVar == null) {
                        return new fs(15, orwVar);
                    }
                    hswVar.j = orwVar;
                    hswVar.k = ohwVar;
                    hswVar.n = 1;
                    g4q g4qVar = this.c.b().a;
                    vdr vdrVar = g4qVar != null ? (vdr) zdg.p(g4qVar, new qcm()) : null;
                    if (vdrVar == null) {
                        n = this.a.a(hswVar);
                    } else {
                        n = ((pqw) vdrVar.getValue()).d.n();
                        n.getClass();
                    }
                    if (n == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ohw ohwVar2 = hswVar.k;
                    orw orwVar2 = hswVar.j;
                    qgg.h0(obj);
                    ohwVar = ohwVar2;
                    orwVar = orwVar2;
                    n = obj;
                }
                a0 a0Var = (a0) n;
                boolean isEmpty = a0Var.j().A().isEmpty();
                x j = a0Var.j();
                j.getClass();
                e0 e0Var = orwVar.a;
                x j2 = e0Var.n().j();
                j2.getClass();
                y = j.r() != j2.r() ? ngg.y(zdg.M(j), zdg.M(j)) : false;
                String str = ohwVar.b;
                zsw zswVar = ohwVar.c;
                boolean d = Intrinsics.d(str, e0Var.j().g());
                boolean z = zswVar.a == (e0Var.n().k().m() ^ true);
                if ((y && !isEmpty) || !d || !z) {
                    this.b.a("override", ohwVar.b, zswVar);
                    return new eno(new wzv(this, orwVar, continuation, 15));
                }
                ssg.a(2, f, "transition: done", null);
                xdrVar.l(null);
                return new fs(15, orwVar);
            }
        }
        hswVar = new hsw(this, cg6Var);
        Object obj2 = hswVar.l;
        nm6 nm6Var2 = nm6.a;
        i = hswVar.n;
        xdrVar = this.e;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        a0 a0Var2 = (a0) n;
        boolean isEmpty2 = a0Var2.j().A().isEmpty();
        x j3 = a0Var2.j();
        j3.getClass();
        e0 e0Var2 = orwVar.a;
        x j22 = e0Var2.n().j();
        j22.getClass();
        if (j3.r() != j22.r()) {
        }
        String str2 = ohwVar.b;
        zsw zswVar2 = ohwVar.c;
        boolean d2 = Intrinsics.d(str2, e0Var2.j().g());
        if (zswVar2.a == (e0Var2.n().k().m() ^ true)) {
        }
        if (y) {
        }
        ssg.a(2, f, "transition: done", null);
        xdrVar.l(null);
        return new fs(15, orwVar);
    }
}
