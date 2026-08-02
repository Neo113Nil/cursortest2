package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class y27 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ h37 b;

    public /* synthetic */ y27(h37 h37Var, int i) {
        this.a = i;
        this.b = h37Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(b37 b37Var, Continuation continuation) {
        c37 c37Var;
        Object obj;
        nm6 nm6Var;
        int i;
        y27 y27Var;
        q27 q27Var;
        y27 y27Var2;
        h37 h37Var;
        List list;
        ArrayList arrayList;
        Iterator it;
        int i2;
        boolean hasNext;
        jfk jfkVar;
        List list2;
        if (continuation instanceof c37) {
            c37Var = (c37) continuation;
            int i3 = c37Var.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c37Var.o = i3 - Integer.MIN_VALUE;
                obj = c37Var.m;
                nm6Var = nm6.a;
                i = c37Var.o;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    rn5 rn5Var = this.b.k;
                    q27 q27Var2 = b37Var.a;
                    c37Var.j = this;
                    c37Var.k = b37Var;
                    c37Var.o = 1;
                    obj = x97.V((CoroutineContext) rn5Var.g, new fzb(rn5Var, q27Var2, continuation2, 4), c37Var);
                    if (obj != nm6Var) {
                        y27Var = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b37Var = c37Var.k;
                    y27Var2 = c37Var.j;
                    qgg.h0(obj);
                    h37Var = y27Var2.b;
                    list = b37Var.b;
                    boolean z = b37Var.c;
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        rfk rfkVar = (rfk) obj2;
                        if (!(rfkVar instanceof ffk) || (list2 = ((ffk) rfkVar).f) == null || list2.isEmpty()) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.size() == 1 || z) {
                        g0c g0cVar = h37Var.l;
                        it = list.iterator();
                        i2 = 0;
                        while (true) {
                            hasNext = it.hasNext();
                            jfkVar = jfk.a;
                            if (hasNext) {
                                i2 = -1;
                                break;
                            }
                            rfk rfkVar2 = (rfk) it.next();
                            if (!Intrinsics.d(rfkVar2, jfkVar) && Intrinsics.d(o8g.w(rfkVar2), h37Var.s)) {
                                break;
                            }
                            i2++;
                        }
                        Integer valueOf = i2 == -1 ? Integer.valueOf(i2) : !Intrinsics.d(CollectionsKt.Q(list), jfkVar) ? 0 : null;
                        rfk rfkVar3 = valueOf == null ? (rfk) list.get(valueOf.intValue()) : null;
                        if (h37Var.s != null) {
                            if (rfkVar3 == null || !Intrinsics.d(o8g.w(rfkVar3), h37Var.s)) {
                                String str = h37Var.s;
                                qne y = gut.y(str != null ? str : "");
                                x60 x60Var = (x60) g0cVar;
                                x60Var.getClass();
                                x60Var.a(y);
                            } else {
                                String str2 = h37Var.s;
                                qne x = gut.x(str2 != null ? str2 : "");
                                x60 x60Var2 = (x60) g0cVar;
                                x60Var2.getClass();
                                x60Var2.a(x);
                            }
                        }
                        if (h37Var.A.getValue() != q5m.b) {
                            xdr xdrVar = h37Var.t;
                            c5b.a.getClass();
                            tpm tpmVar = new tpm();
                            xdrVar.getClass();
                            xdrVar.m(null, tpmVar);
                        }
                    } else {
                        h37Var.H((rfk) CollectionsKt.Q(arrayList), false);
                    }
                    g0c g0cVar2 = y27Var2.b.l;
                    qne A = gut.V0(dq8.SELECT).A(null);
                    x60 x60Var3 = (x60) g0cVar2;
                    x60Var3.getClass();
                    x60Var3.a(A);
                    return Unit.a;
                }
                b37Var = c37Var.k;
                y27Var = c37Var.j;
                qgg.h0(obj);
                q27Var = b37Var.a;
                c37Var.j = y27Var;
                c37Var.k = b37Var;
                c37Var.l = obj;
                c37Var.o = 2;
                if (h37.a(y27Var.b, (JSONObject) obj, q27Var, c37Var) != nm6Var) {
                    y27Var2 = y27Var;
                    h37Var = y27Var2.b;
                    list = b37Var.b;
                    boolean z2 = b37Var.c;
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                    }
                    if (arrayList.size() == 1) {
                    }
                    g0c g0cVar3 = h37Var.l;
                    it = list.iterator();
                    i2 = 0;
                    while (true) {
                        hasNext = it.hasNext();
                        jfkVar = jfk.a;
                        if (hasNext) {
                        }
                        i2++;
                    }
                    if (i2 == -1) {
                    }
                    if (valueOf == null) {
                    }
                    if (h37Var.s != null) {
                    }
                    if (h37Var.A.getValue() != q5m.b) {
                    }
                    g0c g0cVar22 = y27Var2.b.l;
                    qne A2 = gut.V0(dq8.SELECT).A(null);
                    x60 x60Var32 = (x60) g0cVar22;
                    x60Var32.getClass();
                    x60Var32.a(A2);
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        c37Var = new c37(this, continuation);
        obj = c37Var.m;
        nm6Var = nm6.a;
        i = c37Var.o;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        q27Var = b37Var.a;
        c37Var.j = y27Var;
        c37Var.k = b37Var;
        c37Var.l = obj;
        c37Var.o = 2;
        if (h37.a(y27Var.b, (JSONObject) obj, q27Var, c37Var) != nm6Var) {
        }
        return nm6Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                yl2 yl2Var = (yl2) obj;
                h37 h37Var = this.b;
                g0c g0cVar = h37Var.l;
                if (Intrinsics.d(yl2Var, vl2.a)) {
                    qne x0 = gut.x0();
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(x0);
                    Object emit = h37Var.v.emit(new opm(R.string.paymentsdk_error_top_up), continuation);
                    return emit == nm6.a ? emit : Unit.a;
                }
                if (Intrinsics.d(yl2Var, wl2.a)) {
                    qne y0 = gut.y0();
                    x60 x60Var2 = (x60) g0cVar;
                    x60Var2.getClass();
                    x60Var2.a(y0);
                    dq7 dq7Var = ca8.a;
                    Object V = x97.V(mn7.d, new g37(h37Var, null), continuation);
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
            default:
                return b((b37) obj, continuation);
        }
    }
}
