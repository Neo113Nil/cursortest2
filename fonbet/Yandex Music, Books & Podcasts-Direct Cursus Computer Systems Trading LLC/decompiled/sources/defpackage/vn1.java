package defpackage;

import android.content.Context;
import com.yandex.music.shared.wave.domain.offline.OfflineProlongationException;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.experiments.impl.cache.b;
import com.yandex.plus.home.plaque.plugin.internal.defaults.c;
import com.yandex.plus.home.plaque.repository.api.model.d;
import com.yandex.plus.home.plaque.repository.graphql.cache.a;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w1;
import com.yandex.plus.home.plaque.repository.graphql.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vn1 extends aur implements Function2 {
    public final /* synthetic */ int j = 3;
    public Object k;
    public int l;
    public boolean m;
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vn1(boolean z, hxu hxuVar, q4q q4qVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.m = z;
        this.n = hxuVar;
        this.o = q4qVar;
        this.p = (aur) function1;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                vn1 vn1Var = new vn1((wn1) this.n, (List) this.o, this.m, (mwk) this.p, continuation);
                vn1Var.k = obj;
                return vn1Var;
            case 1:
                return new vn1((m37) this.n, (u9o) this.o, (Context) this.p, this.m, continuation);
            case 2:
                vn1 vn1Var2 = new vn1(this.m, (hxu) this.n, (q4q) this.o, (Function1) this.p, continuation);
                vn1Var2.k = obj;
                return vn1Var2;
            default:
                vn1 vn1Var3 = new vn1((g) this.p, continuation);
                vn1Var3.o = obj;
                return vn1Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((vn1) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((vn1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((vn1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((vn1) create((vat) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0208, code lost:
    
        if (r1 == r9) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c4, code lost:
    
        if (r2 == r9) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v28, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        Object b;
        Continuation continuation;
        ou7 ou7Var;
        Object n;
        Object c;
        Map map;
        boolean booleanValue;
        boolean z;
        w1 w1Var;
        c cVar;
        Object f;
        Object V;
        Map map2;
        Object G;
        Object D;
        d dVar;
        Object q;
        Object E;
        switch (this.j) {
            case 0:
                List<String> list = (List) this.o;
                wn1 wn1Var = (wn1) this.n;
                vjg vjgVar = wn1Var.d;
                xdr xdrVar = wn1Var.j;
                rjc rjcVar = (rjc) this.k;
                nm6 nm6Var = nm6.a;
                int i = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    ym1 ym1Var = (ym1) wn1Var.i.getValue();
                    boolean z2 = this.m;
                    this.k = rjcVar;
                    this.l = 1;
                    a = ym1Var.a(list, z2, this);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                rj6 rj6Var = (rj6) a;
                Continuation continuation2 = null;
                if (rj6Var instanceof pj6) {
                    an1 an1Var = new an1(list.size(), false);
                    xdrVar.getClass();
                    xdrVar.m(null, an1Var);
                    c73 c73Var = new c73(vjgVar);
                    this.k = null;
                    this.l = 2;
                    if (rjcVar.emit(c73Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (!(rj6Var instanceof qj6)) {
                        b6e.s();
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str : list) {
                        Iterator it = ((sm1) ((qj6) rj6Var).a).a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (Intrinsics.d(((tm1) obj2).a.a, str)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null) {
                            dfi.r(hrg.q("Artist with id ", str, " not found in entities"), "ArtistsInfoBlockVM");
                        }
                        tm1 tm1Var = (tm1) obj2;
                        if (tm1Var != null) {
                            arrayList.add(tm1Var);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        an1 an1Var2 = new an1(list.size(), false);
                        xdrVar.getClass();
                        xdrVar.m(null, an1Var2);
                        c73 c73Var2 = new c73(vjgVar);
                        this.k = null;
                        this.l = 3;
                        if (rjcVar.emit(c73Var2, this) == nm6Var) {
                            return nm6Var;
                        }
                        return Unit.a;
                    }
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        tm1 tm1Var2 = (tm1) it2.next();
                        om1 om1Var = wn1Var.f;
                        String str2 = tm1Var2.a.a;
                        om1Var.getClass();
                        str2.getClass();
                        arrayList2.add(new u21(2, ((mc1) ((dc1) om1Var.a.getValue())).d(str2), wn1Var, tm1Var2));
                    }
                    mwk mwkVar = (mwk) this.p;
                    pjc[] pjcVarArr = (pjc[]) CollectionsKt.w0(arrayList2).toArray(new pjc[0]);
                    gl glVar = new gl(5, wn1Var, rjcVar);
                    this.k = null;
                    this.l = 4;
                    Object y = tt0.y(glVar, new l1(continuation2, mwkVar, 3), this, new tn1(pjcVarArr, 0), pjcVarArr);
                    if (y != nm6.a) {
                        y = Unit.a;
                    }
                    if (y == nm6Var) {
                        return nm6Var;
                    }
                }
                return Unit.a;
            case 1:
                u9o u9oVar = (u9o) this.o;
                m37 m37Var = (m37) this.n;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.l = 1;
                    b = m37Var.k.b(u9oVar instanceof s9o, this);
                    if (b == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                Context context = (Context) this.p;
                boolean z3 = this.m;
                rv8 rv8Var = (rv8) b;
                this.k = b;
                this.l = 2;
                ArrayList j = u75.j(new Pair("isLightTheme", String.valueOf(z3)), new Pair("result_screen_screen_type", u9oVar.j()), new Pair("result_screen_has_back_button", String.valueOf(u9oVar.k())), new Pair("result_screen_has_close_button", String.valueOf(u9oVar.l())), new Pair("result_screen_title_text", m37.a(u9oVar.i(), context)), new Pair("result_screen_subtitle_text", m37.a(u9oVar.h(), context)), new Pair("result_screen_main_button_text", m37.a(u9oVar.g(), context)), new Pair("result_screen_complementary_button_text", m37.a(u9oVar.e(), context)));
                q9o f2 = u9oVar.f();
                if (f2 != null) {
                    j.add(new Pair("result_screen_identifier", f2.d()));
                }
                Object emit = m37Var.l.emit(new hw8(rv8Var, j), this);
                if (emit != nm6Var2) {
                    emit = Unit.a;
                }
                if (emit == nm6Var2) {
                    return nm6Var2;
                }
                return Unit.a;
            case 2:
                ?? r1 = (aur) this.p;
                q4q q4qVar = (q4q) this.o;
                hxu hxuVar = (hxu) this.n;
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.l;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            qgg.h0(obj);
                            c = obj;
                            return (qxu) c;
                        }
                        if (i3 == 3) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    n = obj;
                    qxu qxuVar = (qxu) n;
                    if (hxuVar.h.b != null) {
                        l18 l18Var = l18.b;
                        bdt I = hag.I(byb.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        if (Intrinsics.d(((s5v) ((byb) qdcVar.C(I)).b(s5v.class)).b(), "on1") && !(qxuVar instanceof mxu)) {
                            ssg.a(3, "WaveProlongationOperation", "Apply interim forced offline prolongation and continue online prolongation", null);
                            this.k = null;
                            this.l = 2;
                            c = hxu.c(hxuVar, qxuVar, r1, this);
                            break;
                        }
                    }
                    return qxuVar;
                }
                qgg.h0(obj);
                if (this.m) {
                    ssg.a(3, "WaveProlongationOperation", "Offline prolongation is force launched!", null);
                    cvu cvuVar = hxuVar.h;
                    s9p s9pVar = q4qVar.getId().a;
                    s9pVar.getClass();
                    vuu b2 = cvuVar.b();
                    boolean m = b2 != null ? wxf.m(b2, s9pVar) : false;
                    if (!m) {
                        if (!m) {
                            return new lxu(new OfflineProlongationException("Forced offline prolongation is failed!"));
                        }
                        b6e.s();
                        return null;
                    }
                    this.k = null;
                    this.l = 1;
                    n = hxuVar.n(q4qVar, true, this);
                    break;
                } else {
                    ou7 p = x97.p(mm6Var, null, null, new x77(r1, null, 6), 3);
                    vuu b3 = hxuVar.h.b();
                    if (!hxu.b(hxuVar, q4qVar) || b3 == null) {
                        continuation = null;
                        ou7Var = null;
                    } else {
                        continuation = null;
                        ou7Var = x97.p(mm6Var, null, null, new h0t(b3, hxuVar, q4qVar, continuation, 17), 3);
                    }
                    acp acpVar = new acp(getContext());
                    acpVar.g(p.G(), new ocu(ou7Var, hxuVar, q4qVar, continuation, 3));
                    if (ou7Var != null) {
                        acpVar.g(ou7Var.G(), new h0t(hxuVar, p, continuation, 16));
                    }
                    this.k = continuation;
                    this.l = 3;
                    Object d = acpVar.d(this);
                    if (d != nm6Var3) {
                        return d;
                    }
                }
                return nm6Var3;
            default:
                g gVar = (g) this.p;
                j jVar = gVar.s;
                vat vatVar = (vat) this.o;
                nm6 nm6Var4 = nm6.a;
                Continuation continuation3 = null;
                switch (this.l) {
                    case 0:
                        qgg.h0(obj);
                        w1 w1Var2 = (w1) vatVar.a;
                        map = (Map) vatVar.b;
                        booleanValue = ((Boolean) vatVar.c).booleanValue();
                        if (w1Var2 == null) {
                            cVar = gVar.d;
                            this.o = null;
                            this.n = map;
                            this.k = cVar;
                            this.m = booleanValue;
                            this.l = 1;
                            f = g.f(gVar, this);
                            if (f == nm6Var4) {
                                return nm6Var4;
                            }
                            this.o = null;
                            this.n = map;
                            this.k = null;
                            this.m = booleanValue;
                            this.l = 2;
                            V = x97.V(cVar.b, new b(cVar, (a) f, continuation3, 10), this);
                            if (V == nm6Var4) {
                                return nm6Var4;
                            }
                            boolean z4 = booleanValue;
                            w1Var = (w1) V;
                            z = z4;
                            map2 = map;
                            if (w1Var != null) {
                                if (z) {
                                    this.o = null;
                                    this.n = map2;
                                    this.k = w1Var;
                                    this.m = z;
                                    this.l = 3;
                                    D = jVar.D(w1Var, map2, this);
                                    if (D == nm6Var4) {
                                        return nm6Var4;
                                    }
                                    dVar = (d) D;
                                    if (dVar != null) {
                                        return dVar;
                                    }
                                } else {
                                    this.o = null;
                                    this.n = map2;
                                    this.k = w1Var;
                                    this.m = z;
                                    this.l = 4;
                                    G = jVar.G(w1Var, map2, this);
                                    if (G == nm6Var4) {
                                        return nm6Var4;
                                    }
                                    dVar = (d) G;
                                    if (dVar != null) {
                                    }
                                }
                            }
                            if (!z) {
                                this.o = null;
                                this.n = null;
                                this.k = null;
                                this.m = z;
                                this.l = 5;
                                E = jVar.E(w1Var, map2, this);
                                if (E == nm6Var4) {
                                    return nm6Var4;
                                }
                                return (d) E;
                            }
                            this.o = null;
                            this.n = null;
                            this.k = null;
                            this.m = z;
                            this.l = 6;
                            zt3 zt3Var = new zt3(1, qxe.b(this));
                            zt3Var.s();
                            q = zt3Var.q();
                            if (q == nm6Var4) {
                                return nm6Var4;
                            }
                            return (d) q;
                        }
                        z = booleanValue;
                        w1Var = w1Var2;
                        map2 = map;
                        if (w1Var != null) {
                        }
                        if (!z) {
                        }
                    case 1:
                        boolean z5 = this.m;
                        c cVar2 = (c) this.k;
                        Map map3 = (Map) this.n;
                        qgg.h0(obj);
                        map = map3;
                        cVar = cVar2;
                        booleanValue = z5;
                        f = obj;
                        this.o = null;
                        this.n = map;
                        this.k = null;
                        this.m = booleanValue;
                        this.l = 2;
                        V = x97.V(cVar.b, new b(cVar, (a) f, continuation3, 10), this);
                        if (V == nm6Var4) {
                        }
                        boolean z42 = booleanValue;
                        w1Var = (w1) V;
                        z = z42;
                        map2 = map;
                        if (w1Var != null) {
                        }
                        if (!z) {
                        }
                        break;
                    case 2:
                        boolean z6 = this.m;
                        Map map4 = (Map) this.n;
                        qgg.h0(obj);
                        map = map4;
                        booleanValue = z6;
                        V = obj;
                        boolean z422 = booleanValue;
                        w1Var = (w1) V;
                        z = z422;
                        map2 = map;
                        if (w1Var != null) {
                        }
                        if (!z) {
                        }
                        break;
                    case 3:
                        z = this.m;
                        w1Var = (w1) this.k;
                        map2 = (Map) this.n;
                        qgg.h0(obj);
                        D = obj;
                        dVar = (d) D;
                        if (dVar != null) {
                        }
                        if (!z) {
                        }
                        break;
                    case 4:
                        z = this.m;
                        w1Var = (w1) this.k;
                        map2 = (Map) this.n;
                        qgg.h0(obj);
                        G = obj;
                        dVar = (d) G;
                        if (dVar != null) {
                        }
                        if (!z) {
                        }
                        break;
                    case 5:
                        qgg.h0(obj);
                        E = obj;
                        return (d) E;
                    case 6:
                        qgg.h0(obj);
                        q = obj;
                        return (d) q;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn1(m37 m37Var, u9o u9oVar, Context context, boolean z, Continuation continuation) {
        super(2, continuation);
        this.n = m37Var;
        this.o = u9oVar;
        this.p = context;
        this.m = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.p = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn1(wn1 wn1Var, List list, boolean z, mwk mwkVar, Continuation continuation) {
        super(2, continuation);
        this.n = wn1Var;
        this.o = list;
        this.m = z;
        this.p = mwkVar;
    }
}
