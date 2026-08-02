package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import com.yandex.plus.home.dailyquests.repository.rest.c;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.d0;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.l;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.x;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f51 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public int m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f51(g51 g51Var, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.o = g51Var;
        this.r = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new f51((g51) this.o, (String) this.r, continuation);
            case 1:
                f51 f51Var = new f51(continuation, (o62) this.o);
                f51Var.n = obj;
                return f51Var;
            case 2:
                return new f51((x3l) this.q, (g4q) this.r, continuation, 2);
            default:
                return new f51((c) this.q, (Long) this.r, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((f51) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:10:0x0023, B:20:0x00a1, B:22:0x00a7, B:26:0x00bc, B:30:0x00c3, B:31:0x00c8, B:38:0x008c), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:10:0x0023, B:20:0x00a1, B:22:0x00a7, B:26:0x00bc, B:30:0x00c3, B:31:0x00c8, B:38:0x008c), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d4 A[Catch: all -> 0x00fa, TRY_ENTER, TryCatch #2 {all -> 0x00fa, blocks: (B:53:0x00f5, B:55:0x01d4, B:59:0x01d9), top: B:52:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d9 A[Catch: all -> 0x00fa, TRY_LEAVE, TryCatch #2 {all -> 0x00fa, blocks: (B:53:0x00f5, B:55:0x01d4, B:59:0x01d9), top: B:52:0x00f5 }] */
    /* JADX WARN: Type inference failed for: r13v8, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v28, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v34, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        g51 g51Var;
        int i;
        String str;
        String str2;
        int i2;
        Object G;
        String str3;
        g51 g51Var2;
        Object f;
        Object b2;
        List list;
        int i3;
        Object j;
        Object b3;
        List list2;
        Object V;
        Iterator it;
        int i4;
        Object V2;
        Iterator it2;
        int i5;
        List list3;
        qqi qqiVar;
        x3l x3lVar;
        g4q g4qVar;
        int i6;
        ?? r2;
        ?? r3;
        int i7;
        qqi qqiVar2;
        yan yanVar;
        Long l;
        c cVar;
        oqi oqiVar;
        int i8;
        Object c;
        y yVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i9 = this.m;
                if (i9 == 0) {
                    qgg.h0(obj);
                    g51 g51Var3 = (g51) this.o;
                    String str4 = (String) this.r;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str5 = ((frt) qdcVar.C(I)).c().a;
                    str5.getClass();
                    i5h i5hVar = (i5h) g51Var3.b.getValue();
                    this.n = g51Var3;
                    this.p = str4;
                    this.q = str5;
                    this.k = 0;
                    this.l = 0;
                    this.m = 1;
                    b = i5hVar.b(str5, this);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    g51Var = g51Var3;
                    i = 0;
                    str = str4;
                    str2 = str5;
                    i2 = 0;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            f = obj;
                            return (List) f;
                        }
                        i = this.l;
                        int i10 = this.k;
                        str3 = (String) this.p;
                        g51Var2 = (g51) this.n;
                        qgg.h0(obj);
                        i2 = i10;
                        G = obj;
                        this.n = null;
                        this.p = null;
                        this.k = i2;
                        this.l = i;
                        this.m = 3;
                        f = g51Var2.a.f(str3, (List) G, this);
                        if (f == nm6Var) {
                            return nm6Var;
                        }
                        return (List) f;
                    }
                    i = this.l;
                    i2 = this.k;
                    String str6 = (String) this.q;
                    String str7 = (String) this.p;
                    g51Var = (g51) this.n;
                    qgg.h0(obj);
                    str = str7;
                    str2 = str6;
                    b = obj;
                }
                yq v = ((MainDatabase) b).v();
                this.n = g51Var;
                this.p = str2;
                this.q = null;
                this.k = i2;
                this.l = i;
                this.m = 2;
                G = up6.G(v.a, true, false, new wq(str, 0), this);
                if (G == nm6Var) {
                    return nm6Var;
                }
                str3 = str2;
                g51Var2 = g51Var;
                this.n = null;
                this.p = null;
                this.k = i2;
                this.l = i;
                this.m = 3;
                f = g51Var2.a.f(str3, (List) G, this);
                if (f == nm6Var) {
                }
                return (List) f;
            case 1:
                mss mssVar = mss.a;
                o62 o62Var = (o62) this.o;
                raa raaVar = o62Var.c;
                c72 c72Var = o62Var.d;
                Object obj2 = this.n;
                nm6 nm6Var2 = nm6.a;
                switch (this.k) {
                    case 0:
                        qgg.h0(obj);
                        List list4 = (List) obj2;
                        this.n = null;
                        this.p = list4;
                        this.l = 0;
                        this.k = 1;
                        b2 = ((z22) c72Var).b(this);
                        if (b2 == nm6Var2) {
                            return nm6Var2;
                        }
                        list = list4;
                        i3 = 0;
                        if (!((Boolean) b2).booleanValue()) {
                            this.n = null;
                            this.p = null;
                            this.l = i3;
                            this.k = 2;
                            b3 = o62.b(o62Var, list, this);
                            if (b3 == nm6Var2) {
                                return nm6Var2;
                            }
                            list2 = (List) b3;
                            if (!list2.isEmpty()) {
                                o62.a(o62Var, list2);
                            }
                            return Unit.a;
                        }
                        this.n = null;
                        this.p = list;
                        this.l = i3;
                        this.k = 3;
                        j = ((z22) c72Var).j(this);
                        if (j == nm6Var2) {
                            return nm6Var2;
                        }
                        if (((Boolean) j).booleanValue()) {
                            a72 d = o62Var.d();
                            this.n = null;
                            this.p = null;
                            this.l = i3;
                            this.k = 8;
                            d.getClass();
                            V = x97.V(dm6.a, new ox1(null, d), this);
                            if (V == nm6Var2) {
                                return nm6Var2;
                            }
                            list3 = (List) V;
                            if (!list3.isEmpty()) {
                                List list5 = list3;
                                ArrayList arrayList = new ArrayList(v75.o(list5, 10));
                                Iterator it3 = list5.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(((y62) it3.next()).a);
                                }
                                o62.a(o62Var, arrayList);
                            }
                            return Unit.a;
                        }
                        it = list.iterator();
                        i4 = 0;
                        while (it.hasNext()) {
                            zvs zvsVar = new zvs(((y62) it.next()).a);
                            kss kssVar = kss.a;
                            this.n = null;
                            this.p = null;
                            this.q = it;
                            this.r = null;
                            this.l = i3;
                            this.m = i4;
                            this.k = 4;
                            if (((taa) raaVar).h(zvsVar, kssVar, mssVar, this) == nm6Var2) {
                                return nm6Var2;
                            }
                        }
                        if (((z22) c72Var).g()) {
                            a72 d2 = o62Var.d();
                            css cssVar = css.h;
                            this.n = null;
                            this.p = null;
                            this.q = null;
                            this.r = null;
                            this.l = i3;
                            this.k = 5;
                            d2.getClass();
                            V2 = x97.V(dm6.a, new qi((Continuation) null, d2, cssVar, 11), this);
                            if (V2 == nm6Var2) {
                                return nm6Var2;
                            }
                            it2 = ((List) V2).iterator();
                            i5 = 0;
                            while (it2.hasNext()) {
                                zvs zvsVar2 = new zvs(((y62) it2.next()).a);
                                oss ossVar = oss.a;
                                this.n = null;
                                this.p = null;
                                this.q = null;
                                this.r = it2;
                                this.l = i3;
                                this.m = i5;
                                this.k = 6;
                                if (((taa) raaVar).h(zvsVar2, ossVar, mssVar, this) == nm6Var2) {
                                    return nm6Var2;
                                }
                            }
                        }
                        this.n = null;
                        this.p = null;
                        this.q = null;
                        this.r = null;
                        this.l = i3;
                        this.k = 7;
                        if (((z22) c72Var).i(false, this) == nm6Var2) {
                            return nm6Var2;
                        }
                        return Unit.a;
                    case 1:
                        i3 = this.l;
                        List list6 = (List) this.p;
                        qgg.h0(obj);
                        list = list6;
                        b2 = obj;
                        if (!((Boolean) b2).booleanValue()) {
                        }
                        break;
                    case 2:
                        qgg.h0(obj);
                        b3 = obj;
                        list2 = (List) b3;
                        if (!list2.isEmpty()) {
                        }
                        return Unit.a;
                    case 3:
                        i3 = this.l;
                        List list7 = (List) this.p;
                        qgg.h0(obj);
                        list = list7;
                        j = obj;
                        if (((Boolean) j).booleanValue()) {
                        }
                        break;
                    case 4:
                        int i11 = this.m;
                        int i12 = this.l;
                        it = (Iterator) this.q;
                        qgg.h0(obj);
                        i4 = i11;
                        i3 = i12;
                        while (it.hasNext()) {
                        }
                        if (((z22) c72Var).g()) {
                        }
                        this.n = null;
                        this.p = null;
                        this.q = null;
                        this.r = null;
                        this.l = i3;
                        this.k = 7;
                        if (((z22) c72Var).i(false, this) == nm6Var2) {
                        }
                        return Unit.a;
                    case 5:
                        int i13 = this.l;
                        qgg.h0(obj);
                        i3 = i13;
                        V2 = obj;
                        it2 = ((List) V2).iterator();
                        i5 = 0;
                        while (it2.hasNext()) {
                        }
                        this.n = null;
                        this.p = null;
                        this.q = null;
                        this.r = null;
                        this.l = i3;
                        this.k = 7;
                        if (((z22) c72Var).i(false, this) == nm6Var2) {
                        }
                        return Unit.a;
                    case 6:
                        i5 = this.m;
                        i3 = this.l;
                        it2 = (Iterator) this.r;
                        qgg.h0(obj);
                        while (it2.hasNext()) {
                        }
                        this.n = null;
                        this.p = null;
                        this.q = null;
                        this.r = null;
                        this.l = i3;
                        this.k = 7;
                        if (((z22) c72Var).i(false, this) == nm6Var2) {
                        }
                        return Unit.a;
                    case 7:
                        qgg.h0(obj);
                        return Unit.a;
                    case 8:
                        qgg.h0(obj);
                        V = obj;
                        list3 = (List) V;
                        if (!list3.isEmpty()) {
                        }
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 2:
                ecn ecnVar = ecn.a;
                nm6 nm6Var3 = nm6.a;
                int i14 = this.m;
                try {
                    if (i14 == 0) {
                        qgg.h0(obj);
                        x3l x3lVar2 = (x3l) this.q;
                        qqiVar = x3lVar2.g;
                        g4q g4qVar2 = (g4q) this.r;
                        this.n = qqiVar;
                        this.o = x3lVar2;
                        this.p = g4qVar2;
                        this.k = 0;
                        this.m = 1;
                        if (qqiVar.a(this) == nm6Var3) {
                            return nm6Var3;
                        }
                        x3lVar = x3lVar2;
                        g4qVar = g4qVar2;
                        i6 = 0;
                    } else {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i7 = this.l;
                            r2 = (oqi) this.n;
                            try {
                                qgg.h0(obj);
                                qqiVar2 = r2;
                                yanVar = i7 == 0 ? yan.a : yan.b;
                                qqiVar = qqiVar2;
                                qqiVar.b(null);
                                return yanVar;
                            } catch (Throwable th) {
                                th = th;
                                r2.b(null);
                                throw th;
                            }
                        }
                        int i15 = this.k;
                        g4q g4qVar3 = (g4q) this.p;
                        x3l x3lVar3 = (x3l) this.o;
                        ?? r13 = (oqi) this.n;
                        qgg.h0(obj);
                        i6 = i15;
                        qqiVar = r13;
                        x3lVar = x3lVar3;
                        g4qVar = g4qVar3;
                    }
                    g4q g4qVar4 = (g4q) x3lVar.a.getValue();
                    g4q g4qVar5 = (g4q) x3lVar.c.getValue();
                    if (g4qVar4 != null || g4qVar5 != null) {
                        String str8 = x3l.i;
                        ssg.a(2, str8, "stop(queueToStop=" + g4qVar + ")", null);
                        if (g4qVar4 != g4qVar) {
                            ssg.a(5, str8, "queue stop skip primary: " + g4qVar4 + " !== " + g4qVar, null);
                            r3 = 0;
                        } else {
                            r3 = 1;
                        }
                        if (g4qVar5 == g4qVar || r3 != 0) {
                            if (r3 != 0) {
                                if (g4qVar4 != null) {
                                    g4qVar4.a(ecnVar);
                                }
                            } else if (g4qVar5 != null) {
                                g4qVar5.a(ecnVar);
                            }
                            l8j l8jVar = l8j.c;
                            oz6 oz6Var = new oz6(x3lVar, r3, null);
                            this.n = qqiVar;
                            this.o = null;
                            this.p = null;
                            this.k = i6;
                            this.l = r3;
                            this.m = 2;
                            if (x97.V(l8jVar, oz6Var, this) == nm6Var3) {
                                return nm6Var3;
                            }
                            i7 = r3;
                            qqiVar2 = qqiVar;
                            yanVar = i7 == 0 ? yan.a : yan.b;
                            qqiVar = qqiVar2;
                            qqiVar.b(null);
                            return yanVar;
                        }
                        ssg.a(5, str8, "queue stop skip completely: " + g4qVar5 + " !== " + g4qVar, null);
                    }
                    yanVar = null;
                    qqiVar.b(null);
                    return yanVar;
                } catch (Throwable th2) {
                    th = th2;
                    r2 = qqiVar;
                    r2.b(null);
                    throw th;
                }
            default:
                nm6 nm6Var4 = nm6.a;
                ?? r22 = this.m;
                int i16 = 0;
                try {
                    if (r22 == 0) {
                        qgg.h0(obj);
                        c cVar2 = (c) this.q;
                        qqi qqiVar3 = cVar2.i;
                        l = (Long) this.r;
                        this.n = qqiVar3;
                        this.o = cVar2;
                        this.p = l;
                        this.k = 0;
                        this.m = 1;
                        if (qqiVar3.a(this) == nm6Var4) {
                            return nm6Var4;
                        }
                        cVar = cVar2;
                        oqiVar = qqiVar3;
                        i8 = 0;
                    } else {
                        if (r22 != 1) {
                            if (r22 != 2) {
                                if (r22 != 3) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                oqiVar = (oqi) this.n;
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return Unit.a;
                            }
                            i16 = this.l;
                            int i17 = this.k;
                            Long l2 = (Long) this.p;
                            c cVar3 = (c) this.o;
                            oqi oqiVar2 = (oqi) this.n;
                            try {
                                qgg.h0(obj);
                                i8 = i17;
                                oqiVar = oqiVar2;
                                cVar = cVar3;
                                l = l2;
                                c = obj;
                                yVar = (y) c;
                                if (!(yVar instanceof l)) {
                                    d0 d0Var = cVar.a;
                                    this.n = oqiVar;
                                    this.o = null;
                                    this.p = null;
                                    this.k = i8;
                                    this.l = i16;
                                    this.m = 3;
                                    if (d0Var.b(l, this) == nm6Var4) {
                                        return nm6Var4;
                                    }
                                } else if (!(yVar instanceof x) && yVar != null) {
                                    throw new x7j();
                                }
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th3) {
                                th = th3;
                                r22 = oqiVar2;
                                r22.b(null);
                                throw th;
                            }
                        }
                        int i18 = this.k;
                        Long l3 = (Long) this.p;
                        cVar = (c) this.o;
                        oqi oqiVar3 = (oqi) this.n;
                        qgg.h0(obj);
                        i8 = i18;
                        oqiVar = oqiVar3;
                        l = l3;
                    }
                    d0 d0Var2 = cVar.a;
                    this.n = oqiVar;
                    this.o = cVar;
                    this.p = l;
                    this.k = i8;
                    this.l = 0;
                    this.m = 2;
                    c = d0Var2.c(l, this);
                    if (c == nm6Var4) {
                        return nm6Var4;
                    }
                    yVar = (y) c;
                    if (!(yVar instanceof l)) {
                    }
                    oqiVar.b(null);
                    return Unit.a;
                } catch (Throwable th4) {
                    th = th4;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f51(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.q = obj;
        this.r = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f51(Continuation continuation, o62 o62Var) {
        super(2, continuation);
        this.j = 1;
        this.o = o62Var;
    }
}
