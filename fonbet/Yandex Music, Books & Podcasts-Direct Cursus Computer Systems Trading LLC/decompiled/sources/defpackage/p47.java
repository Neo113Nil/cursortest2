package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class p47 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ e57 b;

    public /* synthetic */ p47(e57 e57Var, int i) {
        this.a = i;
        this.b = e57Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(m47 m47Var, Continuation continuation) {
        r47 r47Var;
        int i;
        p47 p47Var;
        if (continuation instanceof r47) {
            r47Var = (r47) continuation;
            int i2 = r47Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r47Var.m = i2 - Integer.MIN_VALUE;
                Object obj = r47Var.k;
                nm6 nm6Var = nm6.a;
                i = r47Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = m47Var.a;
                    wgk wgkVar = m47Var.b;
                    r47Var.j = this;
                    r47Var.m = 1;
                    if (e57.a(this.b, list, wgkVar, false) == nm6Var) {
                        return nm6Var;
                    }
                    p47Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p47Var = r47Var.j;
                    qgg.h0(obj);
                }
                g0c g0cVar = p47Var.b.l;
                qne A = gut.V0(dq8.SELECT).A(null);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(A);
                return Unit.a;
            }
        }
        r47Var = new r47(this, continuation);
        Object obj2 = r47Var.k;
        nm6 nm6Var2 = nm6.a;
        i = r47Var.m;
        if (i != 0) {
        }
        g0c g0cVar2 = p47Var.b.l;
        qne A2 = gut.V0(dq8.SELECT).A(null);
        x60 x60Var2 = (x60) g0cVar2;
        x60Var2.getClass();
        x60Var2.a(A2);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        if (defpackage.e57.a(r2, r4, r5, r11) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (defpackage.e57.G(r2.b, (org.json.JSONObject) r11, r8, r0) != r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(t47 t47Var, Continuation continuation) {
        u47 u47Var;
        int i;
        p47 p47Var;
        p47 p47Var2;
        if (continuation instanceof u47) {
            u47Var = (u47) continuation;
            int i2 = u47Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u47Var.o = i2 - Integer.MIN_VALUE;
                Object obj = u47Var.m;
                nm6 nm6Var = nm6.a;
                i = u47Var.o;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    rn5 rn5Var = this.b.k;
                    q27 q27Var = t47Var.a;
                    wgk wgkVar = t47Var.b;
                    q27 a = q27.a(q27Var, null, wgkVar != null ? wgkVar.i : null, 127);
                    u47Var.j = this;
                    u47Var.k = t47Var;
                    u47Var.o = 1;
                    obj = x97.V((CoroutineContext) rn5Var.g, new fzb(rn5Var, a, continuation2, 4), u47Var);
                    if (obj != nm6Var) {
                        p47Var = this;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    t47Var = u47Var.k;
                    p47Var = u47Var.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p47Var2 = u47Var.j;
                        qgg.h0(obj);
                        g0c g0cVar = p47Var2.b.l;
                        qne A = gut.V0(dq8.SELECT).A(null);
                        x60 x60Var = (x60) g0cVar;
                        x60Var.getClass();
                        x60Var.a(A);
                        return Unit.a;
                    }
                    t47Var = u47Var.k;
                    p47Var = u47Var.j;
                    qgg.h0(obj);
                    t47 t47Var2 = t47Var;
                    p47Var2 = p47Var;
                    e57 e57Var = p47Var2.b;
                    List list = t47Var2.c;
                    wgk wgkVar2 = t47Var2.b;
                    boolean z = t47Var2.d;
                    u47Var.j = p47Var2;
                    u47Var.k = null;
                    u47Var.l = null;
                    u47Var.o = 3;
                }
                q27 q27Var2 = t47Var.a;
                u47Var.j = p47Var;
                u47Var.k = t47Var;
                u47Var.l = obj;
                u47Var.o = 2;
            }
        }
        u47Var = new u47(this, continuation);
        Object obj2 = u47Var.m;
        nm6 nm6Var2 = nm6.a;
        i = u47Var.o;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        q27 q27Var22 = t47Var.a;
        u47Var.j = p47Var;
        u47Var.k = t47Var;
        u47Var.l = obj2;
        u47Var.o = 2;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        e57 e57Var = this.b;
        switch (i) {
            case 0:
                Object m = e57Var.H.m(yhe.a, continuation);
                return m == nm6.a ? m : Unit.a;
            case 1:
                yl2 yl2Var = (yl2) obj;
                g0c g0cVar = e57Var.l;
                if (Intrinsics.d(yl2Var, vl2.a)) {
                    qne x0 = gut.x0();
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(x0);
                    Object emit = e57Var.I.emit(new pcp(R.string.paymentsdk_error_top_up), continuation);
                    return emit == nm6.a ? emit : Unit.a;
                }
                if (Intrinsics.d(yl2Var, wl2.a)) {
                    qne y0 = gut.y0();
                    x60 x60Var2 = (x60) g0cVar;
                    x60Var2.getClass();
                    x60Var2.a(y0);
                    dq7 dq7Var = ca8.a;
                    Object V = x97.V(mn7.d, new wa2(e57Var, (Continuation) null), continuation);
                    nm6 nm6Var = nm6.a;
                    if (V != nm6Var) {
                        V = Unit.a;
                    }
                    return V == nm6Var ? V : Unit.a;
                }
                if (Intrinsics.d(yl2Var, ul2.b)) {
                    qne v0 = gut.v0();
                    x60 x60Var3 = (x60) g0cVar;
                    x60Var3.getClass();
                    x60Var3.a(v0);
                } else if (Intrinsics.d(yl2Var, ul2.d)) {
                    qne A0 = gut.A0();
                    x60 x60Var4 = (x60) g0cVar;
                    x60Var4.getClass();
                    x60Var4.a(A0);
                } else if (Intrinsics.d(yl2Var, ul2.a)) {
                    qne u0 = gut.u0();
                    x60 x60Var5 = (x60) g0cVar;
                    x60Var5.getClass();
                    x60Var5.a(u0);
                } else if (Intrinsics.d(yl2Var, ul2.c)) {
                    qne z0 = gut.z0();
                    x60 x60Var6 = (x60) g0cVar;
                    x60Var6.getClass();
                    x60Var6.a(z0);
                } else {
                    Intrinsics.d(yl2Var, ul2.e);
                }
                return Unit.a;
            case 2:
                return b((m47) obj, continuation);
            case 3:
                return c((t47) obj, continuation);
            default:
                w7o w7oVar = (w7o) obj;
                if (w7oVar instanceof s7o) {
                    xdr xdrVar = e57Var.F;
                    tcp tcpVar = new tcp(((s7o) w7oVar).a);
                    xdrVar.getClass();
                    xdrVar.m(null, tcpVar);
                } else if (w7oVar instanceof u7o) {
                    e57.H(e57Var, (en) ((u7o) w7oVar).a);
                }
                return Unit.a;
        }
    }
}
