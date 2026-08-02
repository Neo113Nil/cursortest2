package defpackage;

import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.d0;
import com.yandex.media.ynison.service.m0;
import com.yandex.media.ynison.service.n0;
import com.yandex.media.ynison.service.x;
import com.yandex.plus.home.plaque.plugin.internal.defaults.c;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w1;
import com.yandex.plus.home.plaque.repository.graphql.g;
import com.yandex.plus.log.api.b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class wa2 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(g gVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.j = 4;
        this.r = gVar;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new wa2((za2) this.p, continuation);
            case 1:
                wa2 wa2Var = new wa2((e57) this.r, continuation);
                wa2Var.q = obj;
                return wa2Var;
            case 2:
                return new wa2((String[]) this.q, (aqi) this.r, continuation, 2);
            case 3:
                return new wa2((ccw) this.q, (rbw) this.r, continuation, 3);
            default:
                return new wa2((g) this.r, this.m, this.n, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((wa2) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0499, code lost:
    
        if (r1.emit(r2, r28) == r9) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0485, code lost:
    
        if (kotlin.Unit.a == r9) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0445, code lost:
    
        if (kotlin.Unit.a == r9) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03a7, code lost:
    
        if (r15 != r9) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x040e, code lost:
    
        if (r2 == r9) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0369, code lost:
    
        if (kotlin.Unit.a == r9) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        if (r6 != r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        if (r3 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02df  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x040e -> B:110:0x0321). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x044c -> B:116:0x044d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0453 -> B:117:0x044f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0533 -> B:161:0x0537). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x02d5 -> B:83:0x02d9). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Collection collection;
        int i;
        int i2;
        int i3;
        tqn tqnVar;
        e57 e57Var;
        int i4;
        int i5;
        int i6;
        tqn tqnVar2;
        Object obj2;
        int i7;
        wgk wgkVar;
        Object V;
        String str;
        tqn tqnVar3;
        String[] strArr;
        aqi aqiVar;
        int length;
        int i8;
        int i9;
        ccw ccwVar;
        String str2;
        rbw rbwVar;
        int i10;
        int i11;
        int i12;
        ccw ccwVar2;
        String str3;
        Object h;
        Object f;
        c cVar;
        w1 w1Var;
        Object V2;
        x0q x0qVar;
        Object obj3;
        Object obj4;
        int i13 = 3;
        int i14 = 0;
        switch (this.j) {
            case 0:
                za2 za2Var = (za2) this.p;
                nm6 nm6Var = nm6.a;
                int i15 = this.n;
                if (i15 == 0) {
                    qgg.h0(obj);
                    ArrayList b = bb2.b(b72.h, b72.f, b72.g, b72.e, b72.d, b72.c, b72.b);
                    ArrayList arrayList = new ArrayList();
                    it = b.iterator();
                    collection = arrayList;
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i16 = this.m;
                    i = this.l;
                    int i17 = this.k;
                    it = (Iterator) this.r;
                    collection = (Collection) this.q;
                    za2 za2Var2 = (za2) this.o;
                    qgg.h0(obj);
                    i3 = i17;
                    i2 = i16;
                    za2Var = za2Var2;
                    Object b2 = obj;
                    List list = (List) b2;
                    if (list != null) {
                        collection.add(list);
                    }
                    if (it.hasNext()) {
                        drf drfVar = (drf) it.next();
                        this.o = za2Var;
                        this.q = collection;
                        this.r = it;
                        this.k = i3;
                        this.l = i;
                        this.m = i2;
                        this.n = 1;
                        b2 = za2.b(za2Var, drfVar, this);
                        if (b2 == nm6Var) {
                            return nm6Var;
                        }
                        List list2 = (List) b2;
                        if (list2 != null) {
                        }
                        if (it.hasNext()) {
                            ArrayList p = v75.p((List) collection);
                            if (p.isEmpty()) {
                                return null;
                            }
                            return p;
                        }
                    }
                }
            case 1:
                e57 e57Var2 = (e57) this.r;
                xdr xdrVar = e57Var2.X;
                nm6 nm6Var2 = nm6.a;
                wgk wgkVar2 = null;
                switch (this.n) {
                    case 0:
                        qgg.h0(obj);
                        mm6 mm6Var = (mm6) this.q;
                        q5m q5mVar = q5m.b;
                        this.q = mm6Var;
                        this.n = 1;
                        xdrVar.getClass();
                        xdrVar.m(null, q5mVar);
                        break;
                    case 1:
                        qgg.h0(obj);
                        tqnVar = new tqn();
                        e57Var = e57Var2;
                        i4 = 10;
                        i5 = 0;
                        if (i5 < i4) {
                            wgkVar = wgkVar2;
                            if (!tqnVar.a) {
                                g0c g0cVar = e57Var2.l;
                                qne D0 = gut.D0();
                                x60 x60Var = (x60) g0cVar;
                                x60Var.getClass();
                                x60Var.a(D0);
                                q5m q5mVar2 = q5m.c;
                                this.q = wgkVar;
                                this.o = wgkVar;
                                this.p = wgkVar;
                                this.n = 6;
                                xdrVar.getClass();
                                xdrVar.m(wgkVar, q5mVar2);
                                break;
                            }
                            return Unit.a;
                        }
                        this.q = tqnVar;
                        this.o = e57Var;
                        this.p = wgkVar2;
                        this.k = i4;
                        this.l = i5;
                        this.m = i5;
                        this.n = 2;
                        if (y2x.o(1000L, this) != nm6Var2) {
                            tqnVar2 = tqnVar;
                            i6 = i5;
                            e8w e8wVar = e8w.a;
                            this.q = tqnVar2;
                            this.o = e57Var;
                            this.k = i4;
                            this.l = i5;
                            this.m = i6;
                            this.n = i13;
                            obj2 = e8wVar.b(this);
                            break;
                        }
                        return nm6Var2;
                    case 2:
                        i6 = this.m;
                        i5 = this.l;
                        i4 = this.k;
                        e57Var = (e57) this.o;
                        tqnVar2 = (tqn) this.q;
                        qgg.h0(obj);
                        e8w e8wVar2 = e8w.a;
                        this.q = tqnVar2;
                        this.o = e57Var;
                        this.k = i4;
                        this.l = i5;
                        this.m = i6;
                        this.n = i13;
                        obj2 = e8wVar2.b(this);
                        break;
                    case 3:
                        i6 = this.m;
                        i5 = this.l;
                        i4 = this.k;
                        e57Var = (e57) this.o;
                        tqnVar2 = (tqn) this.q;
                        qgg.h0(obj);
                        obj2 = obj;
                        z7o z7oVar = (z7o) obj2;
                        if (z7oVar != null) {
                            Object obj5 = z7oVar.a;
                            i7 = i13;
                            if (!(obj5 instanceof t7o)) {
                                bm2 bm2Var = (bm2) obj5;
                                mgk mgkVar = e57Var.w;
                                wgk f2 = mgkVar != null ? mgkVar.f() : wgkVar2;
                                qdc qdcVar = e57Var.q;
                                BigDecimal bigDecimal = (f2 == null || (str = f2.a) == null) ? BigDecimal.ZERO : new BigDecimal(str);
                                bigDecimal.getClass();
                                String str4 = f2 != null ? f2.b : null;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                bm2 bm2Var2 = new bm2(bigDecimal, str4);
                                this.q = tqnVar2;
                                this.o = e57Var;
                                this.p = obj5;
                                this.k = i4;
                                this.l = i5;
                                this.m = i6;
                                this.n = 4;
                                wgkVar = null;
                                V = x97.V((a) qdcVar.c, new n71(bm2Var, bm2Var2, qdcVar, (Continuation) null, 13), this);
                                break;
                            } else {
                                wgkVar = wgkVar2;
                                r7o r7oVar = z7o.b;
                                tqnVar = tqnVar2;
                                i5++;
                                wgkVar2 = wgkVar;
                                i13 = i7;
                                if (i5 < i4) {
                                }
                            }
                        } else {
                            i7 = i13;
                            wgkVar = wgkVar2;
                            tqnVar = tqnVar2;
                            i5++;
                            wgkVar2 = wgkVar;
                            i13 = i7;
                            if (i5 < i4) {
                            }
                        }
                        break;
                    case 4:
                        i6 = this.m;
                        i5 = this.l;
                        i4 = this.k;
                        e57Var = (e57) this.o;
                        tqnVar2 = (tqn) this.q;
                        qgg.h0(obj);
                        V = obj;
                        i7 = 3;
                        wgkVar = null;
                        tqnVar3 = tqnVar2;
                        if (Intrinsics.d(((sqr) V).a, BigDecimal.ZERO)) {
                            g0c g0cVar2 = e57Var.l;
                            qne E0 = gut.E0(i6 + 1);
                            x60 x60Var2 = (x60) g0cVar2;
                            x60Var2.getClass();
                            x60Var2.a(E0);
                            tqnVar3.a = true;
                            xdr xdrVar2 = e57Var.X;
                            q5m q5mVar3 = q5m.c;
                            this.q = tqnVar3;
                            this.o = wgkVar;
                            this.p = wgkVar;
                            this.n = 5;
                            xdrVar2.getClass();
                            xdrVar2.m(wgkVar, q5mVar3);
                            break;
                        } else {
                            tqnVar2 = tqnVar3;
                            r7o r7oVar2 = z7o.b;
                            tqnVar = tqnVar2;
                            i5++;
                            wgkVar2 = wgkVar;
                            i13 = i7;
                            if (i5 < i4) {
                            }
                        }
                        break;
                    case 5:
                        tqnVar3 = (tqn) this.q;
                        qgg.h0(obj);
                        wgkVar = null;
                        tqnVar = tqnVar3;
                        if (!tqnVar.a) {
                        }
                        return Unit.a;
                    case 6:
                        qgg.h0(obj);
                        x0q x0qVar2 = e57Var2.I;
                        pcp pcpVar = new pcp(R.string.paymentsdk_error_create_card);
                        this.n = 7;
                        break;
                    case 7:
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i18 = this.n;
                if (i18 == 0) {
                    qgg.h0(obj);
                    String[] strArr2 = (String[]) this.q;
                    strArr = strArr2;
                    aqiVar = (aqi) this.r;
                    length = strArr2.length;
                    i8 = 0;
                    i9 = 0;
                    if (i9 < length) {
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = this.m;
                    int i19 = this.l;
                    int i20 = this.k;
                    aqi aqiVar2 = (aqi) this.p;
                    String[] strArr3 = (String[]) this.o;
                    qgg.h0(obj);
                    String[] strArr4 = strArr3;
                    aqi aqiVar3 = aqiVar2;
                    int i21 = i20;
                    i9 = i19 + 1;
                    i8 = i21;
                    aqiVar = aqiVar3;
                    strArr = strArr4;
                    if (i9 < length) {
                        String str5 = strArr[i9];
                        float f3 = qzv.a;
                        aqiVar.setValue(str5);
                        this.o = strArr;
                        this.p = aqiVar;
                        this.k = i8;
                        this.l = i9;
                        this.m = length;
                        this.n = 1;
                        if (y2x.o(5000L, this) == nm6Var3) {
                            return nm6Var3;
                        }
                        strArr4 = strArr;
                        aqiVar3 = aqiVar;
                        i21 = i8;
                        i19 = i9;
                        i9 = i19 + 1;
                        i8 = i21;
                        aqiVar = aqiVar3;
                        strArr = strArr4;
                        if (i9 < length) {
                            return Unit.a;
                        }
                    }
                }
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i22 = this.n;
                if (i22 == 0) {
                    qgg.h0(obj);
                    ccwVar = (ccw) this.q;
                    rbw rbwVar2 = (rbw) this.r;
                    if (!ccwVar.e.get()) {
                        ssg.a(6, ccw.l, "skip sending updateFullState, cause Ynison instance was closed", null);
                        return Unit.a;
                    }
                    str2 = "updateFullState";
                    rbwVar = rbwVar2;
                    i10 = 0;
                    i11 = 0;
                    i12 = 1;
                    ccwVar2 = ccwVar;
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = (String) this.p;
                        ccwVar = (ccw) this.o;
                        qgg.h0(obj);
                        String str6 = ccw.l;
                        ccwVar.d().getClass();
                        str3.getClass();
                        return Unit.a;
                    }
                    int i23 = this.m;
                    int i24 = this.l;
                    int i25 = this.k;
                    String str7 = (String) this.p;
                    ccw ccwVar3 = (ccw) this.o;
                    qgg.h0(obj);
                    i12 = i24;
                    i11 = i25;
                    str2 = str7;
                    ccwVar2 = null;
                    i10 = i23;
                    ccwVar = ccwVar3;
                    rbwVar = null;
                }
                a5n I = d0.I();
                I.i(String.valueOf(UUID.randomUUID()));
                boolean z = false;
                I.h(ccw.b(ccwVar).a);
                x j = rbwVar.a.j();
                j.getClass();
                if (j.r() >= 0) {
                    z = true;
                }
                if (j.z() <= 0 || !z) {
                    I.h(0L);
                }
                a0 H = u7g.H(rbwVar.a);
                if (((Boolean) ((dfw) ccwVar2.a.g).invoke()).booleanValue() && !u7g.Q(H, lil.a)) {
                    H = u7g.G(u7g.L(u7g.J(H)));
                }
                m0 m0Var = rbwVar.b;
                boolean z2 = rbwVar.c;
                m0Var.getClass();
                mnt k = n0.k();
                k.d();
                n0.h((n0) k.b, H);
                k.d();
                n0.f((n0) k.b, m0Var);
                k.d();
                n0.g((n0) k.b, z2);
                n0 n0Var = (n0) k.b();
                I.d();
                d0.j((d0) I.b, n0Var);
                if (rbwVar.d) {
                    I.d();
                    d0.f((d0) I.b, z4n.INTERCEPT_IF_NO_ONE_ACTIVE);
                }
                d0 d0Var = (d0) I.b();
                if (((Boolean) ((dfw) ccwVar.a.c).invoke()).booleanValue()) {
                    qee.q(d0Var);
                }
                String str8 = ccw.l;
                String p2 = d0Var.p();
                njs b3 = ccw.b(ccwVar);
                StringBuilder m = f1d.m("--> ", str2, " with id=", p2, " at timestamp=");
                m.append(b3);
                ssg.a(3, str8, m.toString(), null);
                if (i11 != 0) {
                    ccwVar.h.add(d0Var.p());
                }
                x0q x0qVar3 = ccwVar.g;
                this.o = ccwVar;
                this.p = str2;
                this.k = i11;
                this.l = i12;
                this.m = i10;
                this.n = 2;
                if (x0qVar3.emit(d0Var, this) == nm6Var4) {
                    return nm6Var4;
                }
                str3 = str2;
                String str62 = ccw.l;
                ccwVar.d().getClass();
                str3.getClass();
                return Unit.a;
            default:
                g gVar = (g) this.r;
                nm6 nm6Var5 = nm6.a;
                int i26 = this.l;
                Continuation continuation = null;
                if (i26 == 0) {
                    qgg.h0(obj);
                    b bVar = gVar.m;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "GraphQLPlaqueRepository", "updatePlaqueConfiguration()");
                    }
                    com.yandex.plus.home.benchmark.b bVar2 = (com.yandex.plus.home.benchmark.b) gVar.i.invoke();
                    int i27 = this.m;
                    int i28 = this.n;
                    this.l = 1;
                    h = g.h(gVar, bVar2, i27, i28, this);
                    break;
                } else if (i26 == 1) {
                    qgg.h0(obj);
                    h = ((z7o) obj).a;
                } else if (i26 == 2) {
                    i14 = this.k;
                    c cVar2 = (c) this.q;
                    w1 w1Var2 = (w1) this.p;
                    Object obj6 = this.o;
                    qgg.h0(obj);
                    cVar = cVar2;
                    w1Var = w1Var2;
                    h = obj6;
                    f = obj;
                    this.o = h;
                    this.p = null;
                    this.q = null;
                    this.k = i14;
                    this.l = 3;
                    V2 = x97.V(cVar.b, new v24(cVar, (com.yandex.plus.home.plaque.repository.graphql.cache.a) f, w1Var, continuation, 22), this);
                    if (V2 != nm6Var5) {
                        V2 = Unit.a;
                        break;
                    }
                } else {
                    if (i26 != 3) {
                        if (i26 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj4 = this.o;
                        qgg.h0(obj);
                        xdr xdrVar3 = gVar.q;
                        Boolean bool = Boolean.TRUE;
                        xdrVar3.getClass();
                        xdrVar3.m(null, bool);
                        r7o r7oVar3 = z7o.b;
                        return Boolean.valueOf(!(obj4 instanceof t7o));
                    }
                    h = this.o;
                    qgg.h0(obj);
                    x0qVar = gVar.o;
                    r7o r7oVar4 = z7o.b;
                    obj3 = !(h instanceof t7o) ? null : h;
                    this.o = h;
                    this.p = null;
                    this.l = 4;
                    if (x0qVar.emit(obj3, this) != nm6Var5) {
                        obj4 = h;
                        xdr xdrVar32 = gVar.q;
                        Boolean bool2 = Boolean.TRUE;
                        xdrVar32.getClass();
                        xdrVar32.m(null, bool2);
                        r7o r7oVar32 = z7o.b;
                        return Boolean.valueOf(!(obj4 instanceof t7o));
                    }
                    return nm6Var5;
                }
                r7o r7oVar5 = z7o.b;
                if (!(h instanceof t7o)) {
                    w1 w1Var3 = (w1) h;
                    c5b c5bVar = c5b.a;
                    List list3 = w1Var3.a;
                    List list4 = w1Var3.c;
                    List list5 = w1Var3.e;
                    list3.getClass();
                    c5bVar.getClass();
                    list4.getClass();
                    list5.getClass();
                    w1 w1Var4 = new w1(list3, c5bVar, list4, c5bVar, list5);
                    c cVar3 = gVar.d;
                    this.o = h;
                    this.p = w1Var4;
                    this.q = cVar3;
                    this.k = 0;
                    this.l = 2;
                    f = g.f(gVar, this);
                    if (f != nm6Var5) {
                        cVar = cVar3;
                        w1Var = w1Var4;
                        this.o = h;
                        this.p = null;
                        this.q = null;
                        this.k = i14;
                        this.l = 3;
                        V2 = x97.V(cVar.b, new v24(cVar, (com.yandex.plus.home.plaque.repository.graphql.cache.a) f, w1Var, continuation, 22), this);
                        if (V2 != nm6Var5) {
                        }
                    }
                    return nm6Var5;
                }
                x0qVar = gVar.o;
                r7o r7oVar42 = z7o.b;
                if (!(h instanceof t7o)) {
                }
                this.o = h;
                this.p = null;
                this.l = 4;
                if (x0qVar.emit(obj3, this) != nm6Var5) {
                }
                return nm6Var5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(e57 e57Var, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.r = e57Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(za2 za2Var, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.p = za2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wa2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.q = obj;
        this.r = obj2;
    }
}
