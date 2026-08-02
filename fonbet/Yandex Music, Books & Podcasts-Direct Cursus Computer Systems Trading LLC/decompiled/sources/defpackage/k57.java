package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class k57 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ y57 b;

    public /* synthetic */ k57(y57 y57Var, int i) {
        this.a = i;
        this.b = y57Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(g57 g57Var, Continuation continuation) {
        m57 m57Var;
        int i;
        k57 k57Var;
        if (continuation instanceof m57) {
            m57Var = (m57) continuation;
            int i2 = m57Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m57Var.m = i2 - Integer.MIN_VALUE;
                Object obj = m57Var.k;
                nm6 nm6Var = nm6.a;
                i = m57Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = g57Var.a;
                    wgk wgkVar = g57Var.b;
                    m57Var.j = this;
                    m57Var.m = 1;
                    if (y57.a(this.b, list, wgkVar, false) == nm6Var) {
                        return nm6Var;
                    }
                    k57Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k57Var = m57Var.j;
                    qgg.h0(obj);
                }
                g0c g0cVar = k57Var.b.k;
                qne A = gut.V0(dq8.SELECT).A(null);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(A);
                return Unit.a;
            }
        }
        m57Var = new m57(this, continuation);
        Object obj2 = m57Var.k;
        nm6 nm6Var2 = nm6.a;
        i = m57Var.m;
        if (i != 0) {
        }
        g0c g0cVar2 = k57Var.b.k;
        qne A2 = gut.V0(dq8.SELECT).A(null);
        x60 x60Var2 = (x60) g0cVar2;
        x60Var2.getClass();
        x60Var2.a(A2);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (defpackage.y57.a(r2, r4, r5, r11) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (defpackage.y57.G(r2.b, (org.json.JSONObject) r11, r8, r0) != r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(mjj mjjVar, Continuation continuation) {
        n57 n57Var;
        int i;
        k57 k57Var;
        k57 k57Var2;
        if (continuation instanceof n57) {
            n57Var = (n57) continuation;
            int i2 = n57Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n57Var.o = i2 - Integer.MIN_VALUE;
                Object obj = n57Var.m;
                nm6 nm6Var = nm6.a;
                i = n57Var.o;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    mjjVar.getClass();
                    rn5 rn5Var = this.b.v;
                    q27 q27Var = mjjVar.a;
                    wgk wgkVar = mjjVar.b;
                    q27 a = q27.a(q27Var, null, wgkVar != null ? wgkVar.i : null, 127);
                    n57Var.j = this;
                    n57Var.k = mjjVar;
                    n57Var.o = 1;
                    obj = x97.V((CoroutineContext) rn5Var.g, new fzb(rn5Var, a, continuation2, 4), n57Var);
                    if (obj != nm6Var) {
                        k57Var = this;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    mjjVar = n57Var.k;
                    k57Var = n57Var.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k57Var2 = n57Var.j;
                        qgg.h0(obj);
                        g0c g0cVar = k57Var2.b.k;
                        qne A = gut.V0(dq8.SELECT).A(null);
                        x60 x60Var = (x60) g0cVar;
                        x60Var.getClass();
                        x60Var.a(A);
                        return Unit.a;
                    }
                    mjjVar = n57Var.k;
                    k57Var = n57Var.j;
                    qgg.h0(obj);
                    mjj mjjVar2 = mjjVar;
                    k57Var2 = k57Var;
                    y57 y57Var = k57Var2.b;
                    ArrayList arrayList = mjjVar2.c;
                    wgk wgkVar2 = mjjVar2.b;
                    boolean z = mjjVar2.d;
                    n57Var.j = k57Var2;
                    n57Var.k = null;
                    n57Var.l = null;
                    n57Var.o = 3;
                }
                q27 q27Var2 = mjjVar.a;
                n57Var.j = k57Var;
                n57Var.k = mjjVar;
                n57Var.l = obj;
                n57Var.o = 2;
            }
        }
        n57Var = new n57(this, continuation);
        Object obj2 = n57Var.m;
        nm6 nm6Var2 = nm6.a;
        i = n57Var.o;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        q27 q27Var22 = mjjVar.a;
        n57Var.j = k57Var;
        n57Var.k = mjjVar;
        n57Var.l = obj2;
        n57Var.o = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        if (r9.emit(r2, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(w7o w7oVar, Continuation continuation) {
        l57 l57Var;
        int i;
        k57 k57Var;
        if (continuation instanceof l57) {
            l57Var = (l57) continuation;
            int i2 = l57Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l57Var.n = i2 - Integer.MIN_VALUE;
                Object obj = l57Var.l;
                nm6 nm6Var = nm6.a;
                i = l57Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = w7oVar instanceof s7o;
                    y57 y57Var = this.b;
                    if (z) {
                        xdr xdrVar = y57Var.y;
                        tcp tcpVar = new tcp(((s7o) w7oVar).a);
                        xdrVar.getClass();
                        xdrVar.m(null, tcpVar);
                    } else if (w7oVar instanceof u7o) {
                        u7o u7oVar = (u7o) w7oVar;
                        mgk mgkVar = (mgk) u7oVar.a;
                        y57Var.v0 = mgkVar;
                        x0q x0qVar = y57Var.J;
                        l57Var.j = this;
                        l57Var.k = u7oVar;
                        l57Var.n = 1;
                        if (x0qVar.emit(mgkVar, l57Var) != nm6Var) {
                            k57Var = this;
                        }
                        return nm6Var;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w7oVar = l57Var.k;
                k57Var = l57Var.j;
                qgg.h0(obj);
                x0q x0qVar2 = k57Var.b.L;
                u7o u7oVar2 = (u7o) w7oVar;
                g57 g57Var = new g57(o8g.p(((mgk) u7oVar2.a).d()), ((mgk) u7oVar2.a).f());
                l57Var.j = null;
                l57Var.k = null;
                l57Var.n = 2;
            }
        }
        l57Var = new l57(this, continuation);
        Object obj2 = l57Var.l;
        nm6 nm6Var2 = nm6.a;
        i = l57Var.n;
        if (i != 0) {
        }
        x0q x0qVar22 = k57Var.b.L;
        u7o u7oVar22 = (u7o) w7oVar;
        g57 g57Var2 = new g57(o8g.p(((mgk) u7oVar22.a).d()), ((mgk) u7oVar22.a).f());
        l57Var.j = null;
        l57Var.k = null;
        l57Var.n = 2;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        yop yopVar;
        mgk H;
        int i = this.a;
        Continuation continuation2 = null;
        y57 y57Var = this.b;
        switch (i) {
            case 0:
                Object m = y57Var.A.m(yhe.a, continuation);
                if (m != nm6.a) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                yl2 yl2Var = (yl2) obj;
                if (!(yl2Var instanceof vl2)) {
                    if (!(yl2Var instanceof wl2)) {
                        break;
                    } else {
                        Object K = y57.K(y57Var, continuation);
                        if (K != nm6.a) {
                            break;
                        }
                    }
                } else {
                    Object emit = y57Var.B.emit(new pcp(R.string.paymentsdk_error_top_up), continuation);
                    if (emit != nm6.a) {
                        break;
                    }
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                w7o w7oVar = (w7o) obj;
                if (w7oVar instanceof s7o) {
                    bfk bfkVar = ((s7o) w7oVar).a;
                    atn atnVar = y57Var.n;
                    atnVar.getClass();
                    bfkVar.getClass();
                    xqn xqnVar = new xqn();
                    xqnVar.a = new s7o(bfkVar);
                    if (bfkVar.f == yek.f) {
                        ((x60) ((g0c) atnVar.c)).a(gut.i0());
                        sdk sdkVar = (sdk) atnVar.b;
                        tdk tdkVar = sdkVar instanceof tdk ? (tdk) sdkVar : null;
                        if (tdkVar != null) {
                            rdk rdkVar = tdkVar.g;
                            if (rdkVar == null || (H = rdkVar.H()) == null) {
                                yopVar = null;
                            } else {
                                ogk ogkVar = H.a;
                                j03 j03Var = ogkVar.a;
                                yopVar = mif.a(j03Var.c, new xz2(j03Var, ogkVar.f, ogkVar.e, true), null, 5);
                                ogkVar.g = yopVar;
                            }
                            if (yopVar != null) {
                                mif.b(mif.b(yopVar, new afg(25, atnVar, xqnVar), null, 5), lhb.x0, new lma(atnVar, xqnVar, bfkVar), 1);
                            }
                        }
                    }
                    w7o w7oVar2 = (w7o) xqnVar.a;
                    if (w7oVar2 instanceof s7o) {
                        xdr xdrVar = y57Var.y;
                        tcp tcpVar = new tcp(bfkVar);
                        xdrVar.getClass();
                        xdrVar.m(null, tcpVar);
                    } else if (w7oVar2 instanceof u7o) {
                        x97.y(ot0.F(y57Var), null, null, new bv6(y57Var, w7oVar2, continuation2, 15), 3);
                    }
                } else if (w7oVar instanceof u7o) {
                    y57.H(y57Var, (en) ((u7o) w7oVar).a);
                }
                break;
            default:
                w7o w7oVar3 = (w7o) obj;
                if (w7oVar3 instanceof s7o) {
                    xdr xdrVar2 = y57Var.y;
                    tcp tcpVar2 = new tcp(((s7o) w7oVar3).a);
                    xdrVar2.getClass();
                    xdrVar2.m(null, tcpVar2);
                } else if (w7oVar3 instanceof u7o) {
                    y57.H(y57Var, (en) ((u7o) w7oVar3).a);
                }
                break;
        }
        return Unit.a;
    }
}
