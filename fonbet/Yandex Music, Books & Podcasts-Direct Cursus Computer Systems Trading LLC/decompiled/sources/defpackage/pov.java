package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class pov {
    public final Context a;
    public final vnv b;
    public final lmv c;
    public final mm6 d;
    public final xdr e;
    public final xdr f;
    public final xdr g;
    public final xdr h;
    public final eps i;
    public final j0q j;
    public final j0q k;

    public pov(Context context, vnv vnvVar, oq7 oq7Var, xdr xdrVar, lmv lmvVar, cnv cnvVar, tf6 tf6Var, bca bcaVar) {
        vnvVar.getClass();
        oq7Var.getClass();
        xdrVar.getClass();
        lmvVar.getClass();
        tf6Var.getClass();
        bcaVar.getClass();
        this.a = context;
        this.b = vnvVar;
        this.c = lmvVar;
        this.d = tf6Var;
        xdr a = ydr.a(a0g.z());
        this.e = a;
        Continuation continuation = null;
        xdr a2 = ydr.a(null);
        this.f = a2;
        xdr a3 = ydr.a(Boolean.FALSE);
        this.g = a3;
        xdr a4 = ydr.a(Boolean.valueOf(qv0.a()));
        this.h = a4;
        xdr xdrVar2 = vnvVar.p;
        tf6Var.getClass();
        xdrVar2.getClass();
        eps epsVar = new eps();
        epsVar.a = tf6Var;
        epsVar.b = xdrVar2;
        epsVar.c = a3;
        epsVar.d = new j0q();
        epsVar.e = new j0q();
        rlv z = a0g.z();
        plv.a.getClass();
        nlv nlvVar = mlv.b;
        nlvVar.getClass();
        epsVar.f = ydr.a(new uov(z.b, nlvVar));
        epsVar.g = new ConcurrentHashMap();
        int i = 10;
        u21 u21Var = new u21(i, a4, a, new re7(epsVar, continuation, 7));
        int i2 = 0;
        ox6.B(u21Var, tf6Var, new zmv(epsVar, i2));
        int i3 = 2;
        int i4 = 1;
        ox6.B(zsd.u0(xdrVar2, a3), tf6Var, new zmv(epsVar, i4));
        ssg.a(4, "WidgetManager", "[init] WidgetManager was initialized", null);
        this.i = epsVar;
        this.j = (j0q) epsVar.d;
        this.k = (j0q) epsVar.e;
        f7l f7lVar = oq7Var.a;
        int i5 = 3;
        ox6.B(ox6.C(new u21(i, xdrVar, f7lVar.c, new hk4(i5, i, continuation)), 500L, new dcb(25)), tf6Var, new jov(this, i5));
        ox6.B(new u21(i, ox6.C(new e7v(oq7Var.b.f, i5), 500L, new ulv(i5)), new bca(a2, 18), new hk4(i5, 9, continuation)), tf6Var, new jov(this, i2));
        if (Intrinsics.d(f7lVar.c.getValue(), b6l.a)) {
            x97.y(tf6Var, null, null, new kov(this, continuation, i2), 3);
        }
        ox6.B(new e7v(bcaVar, 4), tf6Var, new jov(this, i4));
        ox6.B(cnvVar.e, tf6Var, new jov(this, i3));
        ssg.a(4, "WidgetSharedViewModel", "[init] WidgetSharedViewModel was initialized", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(pov povVar, cg6 cg6Var) {
        mov movVar;
        int i;
        slv slvVar;
        xdr xdrVar = povVar.e;
        if (cg6Var instanceof mov) {
            movVar = (mov) cg6Var;
            int i2 = movVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                movVar.l = i2 - Integer.MIN_VALUE;
                Object obj = movVar.j;
                nm6 nm6Var = nm6.a;
                i = movVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    rlv z = a0g.z();
                    xdrVar.getClass();
                    xdrVar.m(null, z);
                    lmv lmvVar = povVar.c;
                    Context context = povVar.a;
                    movVar.l = 1;
                    obj = lmvVar.b(context, movVar);
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
                slvVar = (slv) obj;
                if (slvVar != null) {
                    ssg.a(5, "WidgetSharedViewModel", "[restoreFirstPlayable] first playable data was null", null);
                    return Unit.a;
                }
                xdrVar.getClass();
                xdrVar.m(null, slvVar);
                ssg.a(4, "WidgetSharedViewModel", "[restoreFirstPlayable] first playable data was restored", null);
                return Unit.a;
            }
        }
        movVar = new mov(povVar, cg6Var);
        Object obj2 = movVar.j;
        nm6 nm6Var2 = nm6.a;
        i = movVar.l;
        if (i != 0) {
        }
        slvVar = (slv) obj2;
        if (slvVar != null) {
        }
    }

    public final void b() {
        eps epsVar = this.i;
        x97.y((mm6) epsVar.a, null, null, new zts(epsVar, null, 28), 3);
    }
}
