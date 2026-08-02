package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p1w implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1w b;

    public /* synthetic */ p1w(t1w t1wVar, int i) {
        this.a = i;
        this.b = t1wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Continuation continuation) {
        q1w q1wVar;
        int i;
        t1w t1wVar;
        k1w k1wVar;
        if (continuation instanceof q1w) {
            q1wVar = (q1w) continuation;
            int i2 = q1wVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q1wVar.l = i2 - Integer.MIN_VALUE;
                Object obj = q1wVar.j;
                nm6 nm6Var = nm6.a;
                i = q1wVar.l;
                t1wVar = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    j0q j0qVar = t1wVar.x;
                    q0w q0wVar = q0w.e;
                    q1wVar.l = 1;
                    if (j0qVar.emit(q0wVar, q1wVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                k1wVar = (k1w) t1wVar.C.getValue();
                if (!k1wVar.b.isEmpty() || k1wVar.a.isEmpty() || k1wVar.c == null) {
                    xdr xdrVar = t1wVar.w;
                    xdrVar.getClass();
                    xdrVar.m(null, b1w.a);
                }
                return Unit.a;
            }
        }
        q1wVar = new q1w(this, continuation);
        Object obj2 = q1wVar.j;
        nm6 nm6Var2 = nm6.a;
        i = q1wVar.l;
        t1wVar = this.b;
        if (i != 0) {
        }
        k1wVar = (k1w) t1wVar.C.getValue();
        if (!k1wVar.b.isEmpty()) {
        }
        xdr xdrVar2 = t1wVar.w;
        xdrVar2.getClass();
        xdrVar2.m(null, b1w.a);
        return Unit.a;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                t1w t1wVar = this.b;
                syv syvVar = t1wVar.l;
                syvVar.i = false;
                syvVar.j = false;
                syvVar.k = false;
                p0w K = t1wVar.K();
                K.getClass();
                str.getClass();
                nmb a = K.a();
                String j = k5r.j(K, a);
                LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
                m.put("hash", j);
                dfi.p(1, "genre_tab", str, "_meta", m);
                a.C("Wizard.Showed", m);
                return Unit.a;
            case 1:
                boolean z = ((x66) obj).a;
                t1w t1wVar2 = this.b;
                xdr xdrVar = t1wVar2.w;
                if (!z) {
                    Object emit = t1wVar2.x.emit(q0w.d, continuation);
                    return emit == nm6.a ? emit : Unit.a;
                }
                if (xdrVar.getValue() instanceof b1w) {
                    xdrVar.getClass();
                    xdrVar.m(null, d1w.a);
                    t1wVar2.t0(null, false);
                }
                return Unit.a;
            case 2:
                return b(continuation);
            default:
                h1w h1wVar = (h1w) obj;
                if (!Intrinsics.d(h1wVar, d1w.a)) {
                    if (!Intrinsics.d(h1wVar, b1w.a) && !Intrinsics.d(h1wVar, c1w.a) && !Intrinsics.d(h1wVar, e1w.a) && !Intrinsics.d(h1wVar, f1w.a) && !Intrinsics.d(h1wVar, g1w.a)) {
                        b6e.s();
                        return null;
                    }
                    t1w t1wVar3 = this.b;
                    if (t1wVar3.A.getValue() instanceof z0w) {
                        t1wVar3.u0();
                    }
                }
                return Unit.a;
        }
    }
}
