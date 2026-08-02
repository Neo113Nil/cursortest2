package defpackage;

import android.content.Context;
import com.yandex.music.shared.network.api.converter.ConvertedResultContext$Companion$ConvertedResultContextException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class r72 extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public int l;
    public int m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r72(au7 au7Var, Continuation continuation, au7 au7Var2, mln mlnVar) {
        super(2, continuation);
        this.o = au7Var;
        this.p = au7Var2;
        this.q = mlnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r72((s72) this.o, (String) this.s, continuation);
            case 1:
                return new r72((au7) this.o, continuation, (au7) this.p, (mln) this.q);
            case 2:
                r72 r72Var = new r72((pkd) this.q, (Context) this.r, (int[]) this.s, continuation);
                r72Var.p = obj;
                return r72Var;
            default:
                r72 r72Var2 = new r72((y1h) this.s, continuation);
                r72Var2.r = obj;
                return r72Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r72) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:3|(9:(1:(1:(3:8|9|10)(2:12|13))(13:14|15|16|17|18|19|20|(1:22)(2:29|(1:31)(2:32|33))|23|24|(3:28|9|10)|26|27))(4:40|41|42|43)|36|20|(0)(0)|23|24|(0)|26|27)(4:59|60|61|(3:63|26|27)(1:64))|44|45|46|47|(8:49|18|19|20|(0)(0)|23|24|(0))|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0299, code lost:
    
        if ((defpackage.u75.g(r11.a.a.f()) - r11.b.a) >= 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /* JADX WARN: Type inference failed for: r11v19, types: [r2f] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x046a -> B:144:0x046c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01b7 -> B:66:0x01bd). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object V;
        s72 s72Var;
        Iterator it;
        ArrayList arrayList;
        int i;
        int i2;
        Object V2;
        Object V3;
        oqi oqiVar;
        int i3;
        oqi oqiVar2;
        int i4;
        fwu fwuVar;
        eu7 eu7Var;
        Boolean bool;
        eu7 x;
        au7 au7Var;
        pkd pkdVar;
        Context context;
        int length;
        int[] iArr;
        rar y;
        sj6 sj6Var;
        Object a;
        int i5;
        y1h y1hVar;
        y1h y1hVar2;
        r2f r2fVar;
        g1h g1hVar;
        Object obj2;
        v1h s1hVar;
        y1h y1hVar3;
        int i6 = 1;
        int i7 = 0;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                s72 s72Var2 = (s72) this.o;
                String str = (String) this.s;
                nm6 nm6Var = nm6.a;
                int i8 = this.m;
                int i9 = 4;
                if (i8 == 0) {
                    qgg.h0(obj);
                    ((ee2) s72Var2.e.getValue()).getClass();
                    str.getClass();
                    if (c.v(str, "wave_entity_prefix_", false)) {
                        za2 c = s72Var2.c();
                        this.m = 1;
                        c.getClass();
                        V3 = x97.V(dm6.b, new ya2(c, str, (Continuation) null), this);
                        if (V3 == nm6Var) {
                            return nm6Var;
                        }
                        return (List) V3;
                    }
                    e72[] e72VarArr = e72.a;
                    if (c.v(str, "PERSONAL_PLAYLISTS", false) || c.v(str, "EDITORIAL_COMPILATION", false) || c.v(str, "RECENTLY_PLAYED", false)) {
                        za2 c2 = s72Var2.c();
                        this.m = 2;
                        c2.getClass();
                        V = x97.V(dm6.b, new ra2(c2, str, null, i7), this);
                        if (V == nm6Var) {
                            return nm6Var;
                        }
                        return (List) V;
                    }
                    bd0[] bd0VarArr = bd0.a;
                    if (c.v(str, "NEW_RELEASES", false)) {
                        za2 c3 = s72Var2.c();
                        this.m = 3;
                        c3.getClass();
                        V2 = x97.V(dm6.b, new ra2(c3, str, null, i6), this);
                        if (V2 == nm6Var) {
                            return nm6Var;
                        }
                        return (List) V2;
                    }
                    if (c.v(str, "WAVES_FOR_YOU_SECTION", false)) {
                        Set set = s72Var2.c.b;
                        set.getClass();
                        Set set2 = set;
                        ArrayList arrayList2 = new ArrayList(v75.o(set2, 10));
                        s72Var = s72Var2;
                        it = set2.iterator();
                        arrayList = arrayList2;
                        i = 0;
                        i2 = 0;
                        if (it.hasNext()) {
                        }
                    }
                    return null;
                }
                if (i8 == 1) {
                    qgg.h0(obj);
                    V3 = obj;
                    return (List) V3;
                }
                if (i8 == 2) {
                    qgg.h0(obj);
                    V = obj;
                    return (List) V;
                }
                if (i8 == 3) {
                    qgg.h0(obj);
                    V2 = obj;
                    return (List) V2;
                }
                if (i8 != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = this.l;
                int i11 = this.k;
                Collection collection = (Collection) this.q;
                Iterator it2 = (Iterator) this.r;
                Collection collection2 = (Collection) this.p;
                s72 s72Var3 = (s72) this.n;
                qgg.h0(obj);
                int i12 = i10;
                it = it2;
                arrayList = collection2;
                s72Var = s72Var3;
                Object b = obj;
                collection.add((List) b);
                i = i11;
                i2 = i12;
                i9 = 4;
                if (it.hasNext()) {
                    hou houVar = (hou) it.next();
                    qa2 qa2Var = (qa2) s72Var.g.getValue();
                    this.n = s72Var;
                    ArrayList arrayList3 = arrayList;
                    this.p = arrayList3;
                    this.r = it;
                    this.q = arrayList3;
                    this.k = i;
                    this.l = i2;
                    this.m = i9;
                    int i13 = i;
                    e12 e12Var = qa2Var.a;
                    int i14 = i2;
                    String str2 = houVar.b;
                    String g = f1d.g("wave_entity_prefix_", houVar.a);
                    y02 y02Var = y02.a;
                    Continuation continuation2 = null;
                    i12 = i14;
                    b = e12Var.b(str2, g, y02Var, y02Var, y02Var, 3, new qi(houVar, continuation2, 12), new l1(qa2Var, continuation2, 5), this);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    i11 = i13;
                    collection = arrayList;
                    collection.add((List) b);
                    i = i11;
                    i2 = i12;
                    i9 = 4;
                    if (it.hasNext()) {
                        return v75.p(arrayList);
                    }
                }
                break;
            case 1:
                h1b h1bVar = h1b.f;
                mln mlnVar = (mln) this.q;
                au7 au7Var2 = (au7) this.p;
                xdr xdrVar = (xdr) au7Var2.o;
                nm6 nm6Var2 = nm6.a;
                int i15 = this.l;
                try {
                    if (i15 == 0) {
                        qgg.h0(obj);
                        qqi qqiVar = (qqi) ((au7) this.o).m;
                        this.n = qqiVar;
                        this.k = 0;
                        this.l = 1;
                        if (qqiVar.a(this) != nm6Var2) {
                            oqiVar = qqiVar;
                            i3 = 0;
                        }
                        return nm6Var2;
                    }
                    if (i15 != 1) {
                        if (i15 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = this.m;
                        eu7Var = (eu7) this.s;
                        fwuVar = (fwu) this.r;
                        oqiVar2 = (oqi) this.n;
                        try {
                            qgg.h0(obj);
                            x = i4w.x(eu7Var, i4);
                            if (x.equals(fwuVar.a.a) || mlnVar.equals(h1bVar)) {
                                fwuVar = au7Var2.f(x, fwuVar.a.b, fwuVar.b, false, a3l.a);
                                au7Var = au7Var2;
                                xdrVar.getClass();
                                xdrVar.m(null, fwuVar);
                            } else {
                                au7Var = au7Var2;
                            }
                            au7.g(au7Var, fwuVar.a.a, fwuVar.b, false, null, null, null, 124);
                            bool = Boolean.TRUE;
                            oqiVar = oqiVar2;
                            oqiVar.b(null);
                            return bool;
                        } catch (Throwable th) {
                            th = th;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    i3 = this.k;
                    oqiVar = (oqi) this.n;
                    qgg.h0(obj);
                    ssg.a(3, "DefaultWavePlayback", "rebuildQueueAsync(mode=" + mlnVar + ")", null);
                    Object value = xdrVar.getValue();
                    fwu fwuVar2 = value instanceof fwu ? (fwu) value : null;
                    if (fwuVar2 != null) {
                        if (mlnVar.equals(h1bVar)) {
                            au7Var2.a++;
                        }
                        eu7 eu7Var2 = fwuVar2.a.a;
                        if (mlnVar instanceof lln) {
                            jzs jzsVar = (jzs) eu7Var2.b();
                            sfo j = au7.j(jzsVar, au7.k(fwuVar2.b.getId()));
                            if (j != null) {
                                ((mmo) au7Var2.c).v0(j, jzsVar, (lln) mlnVar);
                                break;
                            } else {
                                bool = Boolean.FALSE;
                            }
                        } else if (!mlnVar.equals(h1bVar)) {
                            throw new x7j();
                        }
                        i6 = 0;
                        jac jacVar = (jac) au7Var2.b;
                        this.n = oqiVar;
                        this.r = fwuVar2;
                        this.s = eu7Var2;
                        this.k = i3;
                        this.m = i6;
                        this.l = 2;
                        if (jacVar.c(this) != nm6Var2) {
                            i4 = i6;
                            fwuVar = fwuVar2;
                            oqiVar2 = oqiVar;
                            eu7Var = eu7Var2;
                            x = i4w.x(eu7Var, i4);
                            if (x.equals(fwuVar.a.a)) {
                            }
                            fwuVar = au7Var2.f(x, fwuVar.a.b, fwuVar.b, false, a3l.a);
                            au7Var = au7Var2;
                            xdrVar.getClass();
                            xdrVar.m(null, fwuVar);
                            au7.g(au7Var, fwuVar.a.a, fwuVar.b, false, null, null, null, 124);
                            bool = Boolean.TRUE;
                            oqiVar = oqiVar2;
                        }
                        return nm6Var2;
                    }
                    bool = Boolean.FALSE;
                    oqiVar.b(null);
                    return bool;
                } catch (Throwable th2) {
                    th = th2;
                    oqiVar2 = oqiVar;
                    oqiVar2.b(null);
                    throw th;
                }
            case 2:
                Context context2 = (Context) this.r;
                pkd pkdVar2 = (pkd) this.q;
                nm6 nm6Var3 = nm6.a;
                int i16 = this.m;
                if (i16 == 0) {
                    qgg.h0(obj);
                    pkd.a(pkdVar2, (mm6) this.p, context2);
                    int[] iArr2 = (int[]) this.s;
                    pkdVar = pkdVar2;
                    context = context2;
                    length = iArr2.length;
                    iArr = iArr2;
                    pkd pkdVar3 = pkdVar;
                    if (i7 < length) {
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = this.l;
                    int i17 = this.k;
                    Context context3 = (Context) this.o;
                    pkd pkdVar4 = (pkd) this.n;
                    iArr = (int[]) this.p;
                    qgg.h0(obj);
                    pkdVar = pkdVar4;
                    i7 = i17 + 1;
                    context = context3;
                    pkd pkdVar32 = pkdVar;
                    if (i7 < length) {
                        int i18 = iArr[i7];
                        pv0 b2 = pkdVar32.b();
                        this.p = iArr;
                        this.n = pkdVar32;
                        this.o = context;
                        this.k = i7;
                        this.l = length;
                        this.m = 1;
                        if (b2.e(context, i18, this) == nm6Var3) {
                            return nm6Var3;
                        }
                        context3 = context;
                        i17 = i7;
                        pkdVar4 = pkdVar32;
                        pkdVar = pkdVar4;
                        i7 = i17 + 1;
                        context = context3;
                        pkd pkdVar322 = pkdVar;
                        if (i7 < length) {
                            return Unit.a;
                        }
                    }
                }
            default:
                y1h y1hVar4 = (y1h) this.s;
                l1h l1hVar = y1hVar4.k;
                mm6 mm6Var = (mm6) this.r;
                nm6 nm6Var4 = nm6.a;
                int i19 = this.m;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            if (i19 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            s1hVar = (v1h) this.p;
                            qgg.h0(obj);
                            y1hVar3 = y1hVar4;
                            y1hVar3.m.l(s1hVar);
                            return Unit.a;
                        }
                        g1hVar = (g1h) this.p;
                        r2fVar = (r2f) this.n;
                        try {
                            qgg.h0(obj);
                            y1hVar2 = y1hVar4;
                            try {
                                obj2 = new qj6(g1hVar);
                            } catch (ConvertedResultContext$Companion$ConvertedResultContextException e) {
                                e = e;
                            }
                        } catch (ConvertedResultContext$Companion$ConvertedResultContextException e2) {
                            e = e2;
                            y1hVar2 = y1hVar4;
                        }
                        if (obj2 instanceof qj6) {
                            s1hVar = new u1h(l1hVar, (g1h) ((qj6) obj2).a);
                        } else {
                            if (!(obj2 instanceof pj6)) {
                                b6e.s();
                                return null;
                            }
                            s1hVar = new s1h(l1hVar);
                        }
                        this.r = null;
                        this.n = null;
                        this.o = null;
                        this.p = s1hVar;
                        this.q = null;
                        this.m = 3;
                        if (saf.C(r2fVar, this) != nm6Var4) {
                            y1hVar3 = y1hVar2;
                            y1hVar3.m.l(s1hVar);
                            return Unit.a;
                        }
                        return nm6Var4;
                    }
                    int i20 = this.l;
                    int i21 = this.k;
                    sj6 sj6Var2 = (sj6) this.q;
                    y1hVar = (y1h) this.o;
                    ?? r11 = (r2f) this.n;
                    try {
                        qgg.h0(obj);
                        i7 = i21;
                        sj6Var = sj6Var2;
                        y = r11;
                        i5 = i20;
                        a = obj;
                    } catch (ConvertedResultContext$Companion$ConvertedResultContextException e3) {
                        e = e3;
                        y1hVar2 = y1hVar4;
                        r2fVar = r11;
                    }
                    obj2 = e.a;
                    if (obj2 instanceof qj6) {
                    }
                    this.r = null;
                    this.n = null;
                    this.o = null;
                    this.p = s1hVar;
                    this.q = null;
                    this.m = 3;
                    if (saf.C(r2fVar, this) != nm6Var4) {
                    }
                    return nm6Var4;
                }
                qgg.h0(obj);
                y = x97.y(mm6Var, null, null, new jmd(y1hVar4, continuation, 21), 3);
                try {
                    tj6.a.getClass();
                    sj6Var = qee.e;
                    n3h n3hVar = (n3h) y1hVar4.l.b.getValue();
                    String str3 = l1hVar.a;
                    r2h r2hVar = r2h.TEXT;
                    Long l = new Long(l1hVar.e);
                    this.r = null;
                    this.n = y;
                    this.o = y1hVar4;
                    this.p = null;
                    this.q = sj6Var;
                    this.k = 0;
                    this.l = 0;
                    this.m = 1;
                    a = n3hVar.a(str3, r2hVar, l, this);
                } catch (ConvertedResultContext$Companion$ConvertedResultContextException e4) {
                    e = e4;
                    y1hVar2 = y1hVar4;
                    r2fVar = y;
                    obj2 = e.a;
                    if (obj2 instanceof qj6) {
                    }
                    this.r = null;
                    this.n = null;
                    this.o = null;
                    this.p = s1hVar;
                    this.q = null;
                    this.m = 3;
                    if (saf.C(r2fVar, this) != nm6Var4) {
                    }
                    return nm6Var4;
                }
                if (a == nm6Var4) {
                    return nm6Var4;
                }
                i5 = 0;
                y1hVar = y1hVar4;
                sj6Var.getClass();
                g1hVar = (g1h) tj6.a((rj6) a);
                n3h n3hVar2 = (n3h) y1hVar.l.b.getValue();
                g1hVar.getClass();
                y1hVar2 = y1hVar4;
                i3h i3hVar = new i3h(new h3h(g1hVar.a, new f3h(g1hVar.b, g1hVar.c, g1hVar.d.a, g1hVar.f)));
                this.r = null;
                this.n = y;
                this.o = null;
                this.p = g1hVar;
                this.q = null;
                this.k = i7;
                this.l = i5;
                this.m = 2;
                if (n3hVar2.c(i3hVar, this) != nm6Var4) {
                    r2fVar = y;
                    obj2 = new qj6(g1hVar);
                    if (obj2 instanceof qj6) {
                    }
                    this.r = null;
                    this.n = null;
                    this.o = null;
                    this.p = s1hVar;
                    this.q = null;
                    this.m = 3;
                    if (saf.C(r2fVar, this) != nm6Var4) {
                    }
                }
                return nm6Var4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r72(s72 s72Var, String str, Continuation continuation) {
        super(2, continuation);
        this.o = s72Var;
        this.s = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r72(pkd pkdVar, Context context, int[] iArr, Continuation continuation) {
        super(2, continuation);
        this.q = pkdVar;
        this.r = context;
        this.s = iArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r72(y1h y1hVar, Continuation continuation) {
        super(2, continuation);
        this.s = y1hVar;
    }
}
