package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.TimeMark;

/* loaded from: classes3.dex */
public final class jog extends aur implements Function2 {
    public TimeMark j;
    public gog k;
    public ou7 l;
    public Object m;
    public Object n;
    public Object o;
    public gog p;
    public Collection q;
    public boolean r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ String u;
    public final /* synthetic */ ime v;
    public final /* synthetic */ t1p w;
    public final /* synthetic */ apo x;
    public final /* synthetic */ xdh y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jog(String str, ime imeVar, t1p t1pVar, apo apoVar, xdh xdhVar, Continuation continuation) {
        super(2, continuation);
        this.u = str;
        this.v = imeVar;
        this.w = t1pVar;
        this.x = apoVar;
        this.y = xdhVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        jog jogVar = new jog(this.u, this.v, this.w, this.x, this.y, continuation);
        jogVar.t = obj;
        return jogVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jog) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x047b, code lost:
    
        if (r1 != r10) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x050c, code lost:
    
        if (r1 != r10) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0364, code lost:
    
        if (r3 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b1, code lost:
    
        if (r3 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03fb, code lost:
    
        if (r3 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x052f, code lost:
    
        if (r3 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x059b, code lost:
    
        if (r2 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05e1, code lost:
    
        if (r2 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0626, code lost:
    
        if (r2 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0692, code lost:
    
        if (r2 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x06fd, code lost:
    
        if (r2 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0841, code lost:
    
        if (r1 != r10) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0343, code lost:
    
        if (r1 != r10) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0870 A[LOOP:0: B:10:0x086a->B:12:0x0870, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x08fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x08ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d0 A[LOOP:2: B:81:0x02ca->B:83:0x02d0, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v113, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v135, types: [mu7] */
    /* JADX WARN: Type inference failed for: r3v90, types: [mu7] */
    /* JADX WARN: Type inference failed for: r5v23, types: [mu7] */
    /* JADX WARN: Type inference failed for: r6v68, types: [mu7] */
    /* JADX WARN: Type inference failed for: r7v27, types: [gog, java.lang.Object, ou7] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [gog, java.lang.Object, ou7] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v33, types: [gog, java.lang.Object, ou7] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v44, types: [gog, java.lang.Object, ou7] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v49, types: [gog, java.lang.Object, ou7] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51, types: [gog, java.lang.Object, ou7] */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53, types: [gog, java.lang.Object, ou7] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55, types: [gog, java.lang.Object, ou7] */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v82 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        TimeMark H;
        gog gogVar;
        ou7 p;
        Object s;
        gog gogVar2;
        boolean z;
        ou7 ou7Var;
        mu7 mu7Var;
        ou7 ou7Var2;
        ft2 ft2Var;
        gog gogVar3;
        int i;
        ft2 ft2Var2;
        Object a;
        int i2;
        Object a2;
        int i3;
        Object d;
        int i4;
        Object m;
        int i5;
        Object a3;
        int i6;
        Object f;
        ou7 p2;
        Object s2;
        boolean z2;
        ou7 ou7Var3;
        Object s3;
        boolean z3;
        ou7 ou7Var4;
        int i7;
        Object f2;
        int i8;
        Object f3;
        int i9;
        Object e;
        Object s4;
        boolean z4;
        ou7 ou7Var5;
        Object n;
        TimeMark timeMark;
        ArrayList arrayList;
        ?? r7;
        Collection collection;
        Object H2;
        ou7 ou7Var6;
        TimeMark timeMark2;
        ?? r72;
        ArrayList g0;
        Object H3;
        ft2 ft2Var3;
        ?? r73;
        Collection collection2;
        Object H4;
        ft2 ft2Var4;
        ?? r74;
        Collection collection3;
        Object H5;
        ft2 ft2Var5;
        ?? r75;
        Collection collection4;
        Object H6;
        mu7 mu7Var2;
        mu7 mu7Var3;
        mu7 mu7Var4;
        ?? r76;
        Collection g02;
        Object H7;
        mu7 mu7Var5;
        ?? r77;
        Object H8;
        ArrayList arrayList2;
        gog gogVar4;
        ?? r78;
        ArrayList g03;
        Object H9;
        RandomAccess randomAccess;
        Iterator it;
        p0p p0pVar;
        ft2 ft2Var6;
        boolean z5;
        boolean z6;
        boolean z7;
        ft2 ft2Var7;
        RandomAccess randomAccess2;
        ft2 ft2Var8;
        t1p t1pVar = this.w;
        l18 l18Var = l18.b;
        String str = this.u;
        ime imeVar = this.v;
        mm6 mm6Var = (mm6) this.t;
        nm6 nm6Var = nm6.a;
        switch (this.s) {
            case 0:
                obj2 = null;
                qgg.h0(obj);
                if (StringsKt.U(str)) {
                    return c5b.a;
                }
                imeVar.getClass();
                boolean z8 = t1pVar == t1p.r || gut.h1((z66) imeVar.c);
                H = ime.H();
                gogVar = gog.a;
                switch (t1pVar == null ? -1 : hog.a[t1pVar.ordinal()]) {
                    case -1:
                    case 18:
                    case 19:
                    case 20:
                        Continuation continuation = null;
                        ou7 p3 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation, 10), 3);
                        ou7 p4 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation, 1), 3);
                        p = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation, 2), 3);
                        ou7 p5 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation, 7), 3);
                        ou7 p6 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation, 11), 3);
                        this.t = null;
                        this.j = H;
                        this.k = null;
                        this.l = p4;
                        this.m = p;
                        this.n = p5;
                        this.o = p6;
                        this.p = gogVar;
                        this.r = z8;
                        this.s = 18;
                        s = p3.s(this);
                        nm6 nm6Var2 = nm6.a;
                        if (s != nm6Var) {
                            gogVar2 = gogVar;
                            z = z8;
                            ou7Var = p6;
                            mu7Var = p5;
                            ou7Var2 = p4;
                            r75 = continuation;
                            collection4 = (Collection) s;
                            this.t = r75;
                            this.j = H;
                            this.k = r75;
                            this.l = r75;
                            this.m = p;
                            this.n = mu7Var;
                            this.o = ou7Var;
                            this.p = gogVar2;
                            this.q = collection4;
                            this.r = z;
                            this.s = 19;
                            H6 = ou7Var2.H(this);
                            if (H6 != nm6Var) {
                                mu7Var2 = mu7Var;
                                mu7Var3 = ou7Var;
                                mu7Var4 = p;
                                r76 = r75;
                                timeMark2 = H;
                                g02 = CollectionsKt.g0(collection4, (Iterable) H6);
                                this.t = r76;
                                this.j = timeMark2;
                                this.k = r76;
                                this.l = r76;
                                this.m = r76;
                                this.n = mu7Var2;
                                this.o = mu7Var3;
                                this.p = gogVar2;
                                this.q = g02;
                                this.r = z;
                                this.s = 20;
                                H7 = mu7Var4.H(this);
                                if (H7 != nm6Var) {
                                    mu7Var5 = mu7Var2;
                                    r77 = r76;
                                    ArrayList g04 = CollectionsKt.g0(g02, (Iterable) H7);
                                    this.t = r77;
                                    this.j = timeMark2;
                                    this.k = r77;
                                    this.l = r77;
                                    this.m = r77;
                                    this.n = r77;
                                    this.o = mu7Var3;
                                    this.p = gogVar2;
                                    this.q = g04;
                                    this.r = z;
                                    this.s = 21;
                                    H8 = mu7Var5.H(this);
                                    if (H8 != nm6Var) {
                                        gog gogVar5 = gogVar2;
                                        arrayList2 = g04;
                                        gogVar4 = gogVar5;
                                        r78 = r77;
                                        g03 = CollectionsKt.g0(arrayList2, (Iterable) H8);
                                        this.t = r78;
                                        this.j = timeMark2;
                                        this.k = r78;
                                        this.l = r78;
                                        this.m = r78;
                                        this.n = r78;
                                        this.o = r78;
                                        this.p = gogVar4;
                                        this.q = g03;
                                        this.r = z;
                                        this.s = 22;
                                        H9 = mu7Var3.H(this);
                                        ft2Var8 = r78;
                                        break;
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    case 0:
                    default:
                        b6e.s();
                        return null;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        ft2Var = null;
                        randomAccess = c5b.a;
                        List o0 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                        ArrayList arrayList3 = new ArrayList(v75.o(o0, 10));
                        it = o0.iterator();
                        while (it.hasNext()) {
                            arrayList3.add((ipg) ((Pair) it.next()).b);
                        }
                        apo apoVar = this.x;
                        gogVar.getClass();
                        p0pVar = (p0p) apoVar.c;
                        p0pVar.getClass();
                        switch (p0pVar.ordinal()) {
                            case 0:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 26:
                                ft2Var6 = ft2Var;
                                break;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                ft2Var6 = ft2.b;
                                break;
                            case 6:
                            case 7:
                            case 8:
                                ft2Var6 = ft2.c;
                                break;
                            case 9:
                                ft2Var6 = ft2.a;
                                break;
                            case 25:
                                ft2Var6 = ft2.d;
                                break;
                            default:
                                b6e.s();
                                return obj2;
                        }
                        if (ft2Var6 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                ipg ipgVar = (ipg) next;
                                if (Intrinsics.d(ipgVar.a, (String) apoVar.b)) {
                                    int ordinal = ft2Var6.ordinal();
                                    if (ordinal != 0) {
                                        z6 = true;
                                        if (ordinal == 1) {
                                            z7 = ipgVar instanceof dpg;
                                        } else if (ordinal == 2) {
                                            z7 = (ipgVar instanceof bpg) || (ipgVar instanceof epg);
                                        } else {
                                            if (ordinal != 3) {
                                                b6e.s();
                                                return obj2;
                                            }
                                            z7 = ipgVar instanceof hpg;
                                        }
                                    } else {
                                        z6 = true;
                                        z7 = ipgVar instanceof cpg;
                                    }
                                    if (z7) {
                                        z5 = z6;
                                        if (z5) {
                                            arrayList4.add(next);
                                        }
                                    }
                                }
                                z5 = false;
                                if (z5) {
                                }
                            }
                            arrayList3 = arrayList4;
                        }
                        ((h6i) imeVar.d).g(wdg.X(this.y, H));
                        return arrayList3;
                    case 5:
                        gogVar3 = gogVar;
                        i = 10;
                        ft2Var2 = null;
                        this.t = null;
                        this.j = H;
                        this.k = gogVar3;
                        this.r = z8;
                        this.s = 1;
                        if (StringsKt.U(str)) {
                            a = c5b.a;
                            break;
                        } else {
                            j4t j4tVar = new j4t(z8, null);
                            bdt I = hag.I(g0p.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            a = j4tVar.a(g0p.a(), str, this);
                            if (a != nm6Var) {
                                a = (List) a;
                                break;
                            }
                        }
                        break;
                    case 6:
                        gogVar3 = gogVar;
                        i2 = 10;
                        ft2Var2 = null;
                        this.t = null;
                        this.j = H;
                        this.k = gogVar3;
                        this.r = z8;
                        this.s = 2;
                        if (StringsKt.U(str)) {
                            a2 = c5b.a;
                            break;
                        } else {
                            i30 i30Var = new i30(z8, null);
                            bdt I2 = hag.I(g0p.class);
                            qdc qdcVar2 = l18Var.a;
                            qdcVar2.getClass();
                            a2 = i30Var.a(g0p.a(), str, this);
                            if (a2 != nm6Var) {
                                a2 = (List) a2;
                                break;
                            }
                        }
                        break;
                    case 7:
                        gogVar3 = gogVar;
                        i3 = 10;
                        ft2Var2 = null;
                        this.t = null;
                        this.j = H;
                        this.k = gogVar3;
                        this.r = z8;
                        this.s = 3;
                        d = ime.d(imeVar, str, z8, this);
                        break;
                    case 8:
                        gogVar3 = gogVar;
                        i4 = 10;
                        ft2Var2 = null;
                        this.t = null;
                        this.j = H;
                        this.k = gogVar3;
                        this.r = z8;
                        this.s = 4;
                        m = ime.m(imeVar, str, z8, this);
                        break;
                    case 9:
                        gogVar3 = gogVar;
                        i5 = 10;
                        ft2Var2 = null;
                        this.t = null;
                        this.j = H;
                        this.k = gogVar3;
                        this.r = z8;
                        this.s = 5;
                        if (StringsKt.U(str)) {
                            a3 = c5b.a;
                            break;
                        } else {
                            icm icmVar = new icm(z8);
                            bdt I3 = hag.I(g0p.class);
                            qdc qdcVar3 = l18Var.a;
                            qdcVar3.getClass();
                            a3 = icmVar.a(g0p.a(), str, this);
                            if (a3 != nm6Var) {
                                a3 = (List) a3;
                                break;
                            }
                        }
                        break;
                    case 10:
                        gogVar3 = gogVar;
                        i6 = 10;
                        ft2Var2 = null;
                        paj pajVar = paj.c;
                        this.t = null;
                        this.j = H;
                        this.k = gogVar3;
                        this.r = z8;
                        this.s = 6;
                        f = ime.f(imeVar, str, pajVar, z8, this);
                        break;
                    case 11:
                        Continuation continuation2 = null;
                        ou7 p7 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation2, 6), 3);
                        p2 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation2, 5), 3);
                        ou7 p8 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation2, 9), 3);
                        this.t = null;
                        this.j = H;
                        this.k = null;
                        this.l = p2;
                        this.m = p8;
                        this.n = gogVar;
                        this.r = z8;
                        this.s = 7;
                        s2 = p7.s(this);
                        if (s2 != nm6Var) {
                            gogVar = gogVar;
                            z2 = z8;
                            ou7Var3 = p8;
                            r7 = continuation2;
                            collection = (Collection) s2;
                            this.t = r7;
                            this.j = H;
                            this.k = r7;
                            this.l = r7;
                            this.m = ou7Var3;
                            this.n = gogVar;
                            this.o = collection;
                            this.r = z2;
                            this.s = 8;
                            H2 = p2.H(this);
                            if (H2 != nm6Var) {
                                ou7Var6 = ou7Var3;
                                timeMark2 = H;
                                r72 = r7;
                                g0 = CollectionsKt.g0(collection, (Iterable) H2);
                                this.t = r72;
                                this.j = timeMark2;
                                this.k = r72;
                                this.l = r72;
                                this.m = r72;
                                this.n = gogVar;
                                this.o = g0;
                                this.r = z2;
                                this.s = 9;
                                H3 = ou7Var6.H(this);
                                ft2Var3 = r72;
                                break;
                            }
                        }
                        return nm6Var;
                    case 12:
                        Continuation continuation3 = null;
                        ou7 p9 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation3, 4), 3);
                        ou7 p10 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation3, 0), 3);
                        this.t = null;
                        this.j = H;
                        this.k = null;
                        this.l = p10;
                        this.m = gogVar;
                        this.r = z8;
                        this.s = 10;
                        s3 = p9.s(this);
                        if (s3 != nm6Var) {
                            gogVar = gogVar;
                            z3 = z8;
                            ou7Var4 = p10;
                            r73 = continuation3;
                            collection2 = (Collection) s3;
                            this.t = r73;
                            this.j = H;
                            this.k = r73;
                            this.l = r73;
                            this.m = gogVar;
                            this.n = collection2;
                            this.r = z3;
                            this.s = 11;
                            H4 = ou7Var4.H(this);
                            ft2Var4 = r73;
                            break;
                        }
                        return nm6Var;
                    case 13:
                        gogVar3 = gogVar;
                        i7 = 10;
                        ft2Var2 = null;
                        paj pajVar2 = paj.e;
                        this.t = null;
                        this.j = H;
                        this.k = gogVar3;
                        this.r = z8;
                        this.s = 12;
                        f2 = ime.f(imeVar, str, pajVar2, z8, this);
                        break;
                    case 14:
                        gogVar3 = gogVar;
                        i8 = 10;
                        ft2Var2 = null;
                        paj pajVar3 = paj.g;
                        this.t = null;
                        this.j = H;
                        this.k = gogVar3;
                        this.r = z8;
                        this.s = 13;
                        f3 = ime.f(imeVar, str, pajVar3, z8, this);
                        break;
                    case 15:
                        gogVar3 = gogVar;
                        i9 = 10;
                        ft2Var2 = null;
                        this.t = null;
                        this.j = H;
                        this.k = gogVar3;
                        this.r = z8;
                        this.s = 14;
                        e = ime.e(imeVar, str, z8, this);
                        break;
                    case 16:
                        Continuation continuation4 = null;
                        ou7 p11 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation4, 3), 3);
                        ou7 p12 = x97.p(mm6Var, null, null, new iog(imeVar, str, z8, continuation4, 8), 3);
                        this.t = null;
                        this.j = H;
                        this.k = null;
                        this.l = p12;
                        this.m = gogVar;
                        this.r = z8;
                        this.s = 15;
                        s4 = p11.s(this);
                        if (s4 != nm6Var) {
                            gogVar = gogVar;
                            z4 = z8;
                            ou7Var5 = p12;
                            r74 = continuation4;
                            collection3 = (Collection) s4;
                            this.t = r74;
                            this.j = H;
                            this.k = r74;
                            this.l = r74;
                            this.m = gogVar;
                            this.n = collection3;
                            this.r = z4;
                            this.s = 16;
                            H5 = ou7Var5.H(this);
                            ft2Var5 = r74;
                            break;
                        }
                        return nm6Var;
                    case 17:
                        this.t = null;
                        this.j = H;
                        this.k = gogVar;
                        this.r = z8;
                        this.s = 17;
                        n = ime.n(imeVar, str, z8, this);
                        if (n != nm6Var) {
                            timeMark = H;
                            Iterable<Pair> iterable = (Iterable) n;
                            ArrayList arrayList5 = new ArrayList(v75.o(iterable, 10));
                            for (Pair pair : iterable) {
                                arrayList5.add(new Pair(pair.a, new hpg((x1u) pair.b)));
                            }
                            H = timeMark;
                            ft2Var = null;
                            randomAccess = arrayList5;
                            List o02 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                            ArrayList arrayList32 = new ArrayList(v75.o(o02, 10));
                            it = o02.iterator();
                            while (it.hasNext()) {
                            }
                            apo apoVar2 = this.x;
                            gogVar.getClass();
                            p0pVar = (p0p) apoVar2.c;
                            p0pVar.getClass();
                            switch (p0pVar.ordinal()) {
                            }
                            if (ft2Var6 != null) {
                            }
                            ((h6i) imeVar.d).g(wdg.X(this.y, H));
                            return arrayList32;
                        }
                        return nm6Var;
                }
            case 1:
                obj2 = null;
                gogVar3 = this.k;
                TimeMark timeMark3 = this.j;
                qgg.h0(obj);
                H = timeMark3;
                i = 10;
                ft2Var2 = null;
                a = obj;
                Iterable<Pair> iterable2 = (Iterable) a;
                arrayList = new ArrayList(v75.o(iterable2, i));
                for (Pair pair2 : iterable2) {
                    arrayList.add(new Pair(pair2.a, new gpg((mqs) pair2.b)));
                }
                gogVar = gogVar3;
                randomAccess = arrayList;
                ft2Var = ft2Var2;
                List o022 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList322 = new ArrayList(v75.o(o022, 10));
                it = o022.iterator();
                while (it.hasNext()) {
                }
                apo apoVar22 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar22.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList322;
            case 2:
                obj2 = null;
                gogVar3 = this.k;
                TimeMark timeMark4 = this.j;
                qgg.h0(obj);
                H = timeMark4;
                i2 = 10;
                ft2Var2 = null;
                a2 = obj;
                Iterable<Pair> iterable3 = (Iterable) a2;
                arrayList = new ArrayList(v75.o(iterable3, i2));
                for (Pair pair3 : iterable3) {
                    arrayList.add(new Pair(pair3.a, new bpg((oq) pair3.b)));
                }
                gogVar = gogVar3;
                randomAccess = arrayList;
                ft2Var = ft2Var2;
                List o0222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList3222 = new ArrayList(v75.o(o0222, 10));
                it = o0222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList3222;
            case 3:
                obj2 = null;
                gogVar3 = this.k;
                TimeMark timeMark5 = this.j;
                qgg.h0(obj);
                H = timeMark5;
                i3 = 10;
                ft2Var2 = null;
                d = obj;
                Iterable<Pair> iterable4 = (Iterable) d;
                arrayList = new ArrayList(v75.o(iterable4, i3));
                for (Pair pair4 : iterable4) {
                    arrayList.add(new Pair(pair4.a, new cpg((c01) pair4.b)));
                }
                gogVar = gogVar3;
                randomAccess = arrayList;
                ft2Var = ft2Var2;
                List o02222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList32222 = new ArrayList(v75.o(o02222, 10));
                it = o02222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar2222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar2222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList32222;
            case 4:
                obj2 = null;
                gogVar3 = this.k;
                TimeMark timeMark6 = this.j;
                qgg.h0(obj);
                H = timeMark6;
                i4 = 10;
                ft2Var2 = null;
                m = obj;
                Iterable<Pair> iterable5 = (Iterable) m;
                arrayList = new ArrayList(v75.o(iterable5, i4));
                for (Pair pair5 : iterable5) {
                    arrayList.add(new Pair(pair5.a, new dpg((cvl) pair5.b)));
                }
                gogVar = gogVar3;
                randomAccess = arrayList;
                ft2Var = ft2Var2;
                List o022222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList322222 = new ArrayList(v75.o(o022222, 10));
                it = o022222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar22222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar22222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList322222;
            case 5:
                obj2 = null;
                gogVar3 = this.k;
                TimeMark timeMark7 = this.j;
                qgg.h0(obj);
                H = timeMark7;
                i5 = 10;
                ft2Var2 = null;
                a3 = obj;
                Iterable<Pair> iterable6 = (Iterable) a3;
                arrayList = new ArrayList(v75.o(iterable6, i5));
                for (Pair pair6 : iterable6) {
                    arrayList.add(new Pair(pair6.a, new epg((oq) pair6.b)));
                }
                gogVar = gogVar3;
                randomAccess = arrayList;
                ft2Var = ft2Var2;
                List o0222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList3222222 = new ArrayList(v75.o(o0222222, 10));
                it = o0222222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar222222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar222222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList3222222;
            case 6:
                obj2 = null;
                gogVar3 = this.k;
                TimeMark timeMark8 = this.j;
                qgg.h0(obj);
                f = obj;
                H = timeMark8;
                i6 = 10;
                ft2Var2 = null;
                Iterable<Pair> iterable7 = (Iterable) f;
                arrayList = new ArrayList(v75.o(iterable7, i6));
                for (Pair pair7 : iterable7) {
                    arrayList.add(new Pair(pair7.a, new epg((oq) pair7.b)));
                }
                gogVar = gogVar3;
                randomAccess = arrayList;
                ft2Var = ft2Var2;
                List o02222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList32222222 = new ArrayList(v75.o(o02222222, 10));
                it = o02222222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar2222222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar2222222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList32222222;
            case 7:
                obj2 = null;
                z2 = this.r;
                gog gogVar6 = (gog) this.n;
                ?? r3 = (mu7) this.m;
                ou7 ou7Var7 = this.l;
                TimeMark timeMark9 = this.j;
                qgg.h0(obj);
                p2 = ou7Var7;
                H = timeMark9;
                s2 = obj;
                ou7Var3 = r3;
                gogVar = gogVar6;
                r7 = 0;
                collection = (Collection) s2;
                this.t = r7;
                this.j = H;
                this.k = r7;
                this.l = r7;
                this.m = ou7Var3;
                this.n = gogVar;
                this.o = collection;
                this.r = z2;
                this.s = 8;
                H2 = p2.H(this);
                if (H2 != nm6Var) {
                }
                return nm6Var;
            case 8:
                obj2 = null;
                z2 = this.r;
                Collection collection5 = (Collection) this.o;
                gogVar = (gog) this.n;
                ?? r5 = (mu7) this.m;
                timeMark2 = this.j;
                qgg.h0(obj);
                ou7Var6 = r5;
                collection = collection5;
                r72 = 0;
                H2 = obj;
                g0 = CollectionsKt.g0(collection, (Iterable) H2);
                this.t = r72;
                this.j = timeMark2;
                this.k = r72;
                this.l = r72;
                this.m = r72;
                this.n = gogVar;
                this.o = g0;
                this.r = z2;
                this.s = 9;
                H3 = ou7Var6.H(this);
                ft2Var3 = r72;
                break;
            case 9:
                obj2 = null;
                ?? r1 = (Collection) this.o;
                gog gogVar7 = (gog) this.n;
                TimeMark timeMark10 = this.j;
                qgg.h0(obj);
                g0 = r1;
                timeMark2 = timeMark10;
                H3 = obj;
                gogVar = gogVar7;
                ft2Var3 = null;
                randomAccess2 = CollectionsKt.g0(g0, (Iterable) H3);
                ft2Var7 = ft2Var3;
                H = timeMark2;
                randomAccess = randomAccess2;
                ft2Var = ft2Var7;
                List o022222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList322222222 = new ArrayList(v75.o(o022222222, 10));
                it = o022222222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar22222222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar22222222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList322222222;
            case 10:
                obj2 = null;
                z3 = this.r;
                gog gogVar8 = (gog) this.m;
                ou7 ou7Var8 = this.l;
                TimeMark timeMark11 = this.j;
                qgg.h0(obj);
                ou7Var4 = ou7Var8;
                H = timeMark11;
                s3 = obj;
                gogVar = gogVar8;
                r73 = 0;
                collection2 = (Collection) s3;
                this.t = r73;
                this.j = H;
                this.k = r73;
                this.l = r73;
                this.m = gogVar;
                this.n = collection2;
                this.r = z3;
                this.s = 11;
                H4 = ou7Var4.H(this);
                ft2Var4 = r73;
                break;
            case 11:
                obj2 = null;
                Collection collection6 = (Collection) this.n;
                gog gogVar9 = (gog) this.m;
                TimeMark timeMark12 = this.j;
                qgg.h0(obj);
                collection2 = collection6;
                H = timeMark12;
                H4 = obj;
                gogVar = gogVar9;
                ft2Var4 = null;
                randomAccess = CollectionsKt.g0(collection2, (Iterable) H4);
                ft2Var = ft2Var4;
                List o0222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList3222222222 = new ArrayList(v75.o(o0222222222, 10));
                it = o0222222222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar222222222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar222222222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList3222222222;
            case 12:
                obj2 = null;
                gogVar3 = this.k;
                TimeMark timeMark13 = this.j;
                qgg.h0(obj);
                f2 = obj;
                H = timeMark13;
                i7 = 10;
                ft2Var2 = null;
                Iterable<Pair> iterable8 = (Iterable) f2;
                arrayList = new ArrayList(v75.o(iterable8, i7));
                for (Pair pair8 : iterable8) {
                    arrayList.add(new Pair(pair8.a, new epg((oq) pair8.b)));
                }
                gogVar = gogVar3;
                randomAccess = arrayList;
                ft2Var = ft2Var2;
                List o02222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList32222222222 = new ArrayList(v75.o(o02222222222, 10));
                it = o02222222222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar2222222222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar2222222222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList32222222222;
            case 13:
                obj2 = null;
                gogVar3 = this.k;
                TimeMark timeMark14 = this.j;
                qgg.h0(obj);
                f3 = obj;
                H = timeMark14;
                i8 = 10;
                ft2Var2 = null;
                Iterable<Pair> iterable9 = (Iterable) f3;
                arrayList = new ArrayList(v75.o(iterable9, i8));
                for (Pair pair9 : iterable9) {
                    arrayList.add(new Pair(pair9.a, new epg((oq) pair9.b)));
                }
                gogVar = gogVar3;
                randomAccess = arrayList;
                ft2Var = ft2Var2;
                List o022222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList322222222222 = new ArrayList(v75.o(o022222222222, 10));
                it = o022222222222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar22222222222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar22222222222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList322222222222;
            case 14:
                obj2 = null;
                gogVar3 = this.k;
                TimeMark timeMark15 = this.j;
                qgg.h0(obj);
                e = obj;
                H = timeMark15;
                i9 = 10;
                ft2Var2 = null;
                Iterable<Pair> iterable10 = (Iterable) e;
                arrayList = new ArrayList(v75.o(iterable10, i9));
                for (Pair pair10 : iterable10) {
                    arrayList.add(new Pair(pair10.a, new dpg((cvl) pair10.b)));
                }
                gogVar = gogVar3;
                randomAccess = arrayList;
                ft2Var = ft2Var2;
                List o0222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList3222222222222 = new ArrayList(v75.o(o0222222222222, 10));
                it = o0222222222222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar222222222222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar222222222222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList3222222222222;
            case 15:
                obj2 = null;
                z4 = this.r;
                gog gogVar10 = (gog) this.m;
                ou7 ou7Var9 = this.l;
                TimeMark timeMark16 = this.j;
                qgg.h0(obj);
                ou7Var5 = ou7Var9;
                H = timeMark16;
                s4 = obj;
                gogVar = gogVar10;
                r74 = 0;
                collection3 = (Collection) s4;
                this.t = r74;
                this.j = H;
                this.k = r74;
                this.l = r74;
                this.m = gogVar;
                this.n = collection3;
                this.r = z4;
                this.s = 16;
                H5 = ou7Var5.H(this);
                ft2Var5 = r74;
                break;
            case 16:
                obj2 = null;
                Collection collection7 = (Collection) this.n;
                gog gogVar11 = (gog) this.m;
                TimeMark timeMark17 = this.j;
                qgg.h0(obj);
                collection3 = collection7;
                H = timeMark17;
                H5 = obj;
                gogVar = gogVar11;
                ft2Var5 = null;
                randomAccess = CollectionsKt.g0(collection3, (Iterable) H5);
                ft2Var = ft2Var5;
                List o02222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList32222222222222 = new ArrayList(v75.o(o02222222222222, 10));
                it = o02222222222222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar2222222222222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar2222222222222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList32222222222222;
            case 17:
                obj2 = null;
                gog gogVar12 = this.k;
                timeMark = this.j;
                qgg.h0(obj);
                gogVar = gogVar12;
                n = obj;
                Iterable<Pair> iterable11 = (Iterable) n;
                ArrayList arrayList52 = new ArrayList(v75.o(iterable11, 10));
                while (r1.hasNext()) {
                }
                H = timeMark;
                ft2Var = null;
                randomAccess = arrayList52;
                List o022222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList322222222222222 = new ArrayList(v75.o(o022222222222222, 10));
                it = o022222222222222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar22222222222222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar22222222222222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList322222222222222;
            case 18:
                obj2 = null;
                z = this.r;
                gog gogVar13 = this.p;
                ?? r32 = (mu7) this.o;
                mu7Var = (mu7) this.n;
                ?? r6 = (mu7) this.m;
                ou7Var2 = this.l;
                H = this.j;
                qgg.h0(obj);
                p = r6;
                r75 = 0;
                ou7Var = r32;
                gogVar2 = gogVar13;
                s = obj;
                collection4 = (Collection) s;
                this.t = r75;
                this.j = H;
                this.k = r75;
                this.l = r75;
                this.m = p;
                this.n = mu7Var;
                this.o = ou7Var;
                this.p = gogVar2;
                this.q = collection4;
                this.r = z;
                this.s = 19;
                H6 = ou7Var2.H(this);
                if (H6 != nm6Var) {
                }
                return nm6Var;
            case 19:
                z = this.r;
                collection4 = this.q;
                gogVar2 = this.p;
                mu7Var3 = (mu7) this.o;
                mu7 mu7Var6 = (mu7) this.n;
                mu7Var4 = (mu7) this.m;
                obj2 = null;
                H = this.j;
                qgg.h0(obj);
                mu7Var2 = mu7Var6;
                r76 = 0;
                H6 = obj;
                timeMark2 = H;
                g02 = CollectionsKt.g0(collection4, (Iterable) H6);
                this.t = r76;
                this.j = timeMark2;
                this.k = r76;
                this.l = r76;
                this.m = r76;
                this.n = mu7Var2;
                this.o = mu7Var3;
                this.p = gogVar2;
                this.q = g02;
                this.r = z;
                this.s = 20;
                H7 = mu7Var4.H(this);
                if (H7 != nm6Var) {
                }
                return nm6Var;
            case 20:
                z = this.r;
                g02 = this.q;
                gogVar2 = this.p;
                mu7Var3 = (mu7) this.o;
                mu7Var5 = (mu7) this.n;
                timeMark2 = this.j;
                qgg.h0(obj);
                r77 = 0;
                obj2 = null;
                H7 = obj;
                ArrayList g042 = CollectionsKt.g0(g02, (Iterable) H7);
                this.t = r77;
                this.j = timeMark2;
                this.k = r77;
                this.l = r77;
                this.m = r77;
                this.n = r77;
                this.o = mu7Var3;
                this.p = gogVar2;
                this.q = g042;
                this.r = z;
                this.s = 21;
                H8 = mu7Var5.H(this);
                if (H8 != nm6Var) {
                }
                return nm6Var;
            case 21:
                z = this.r;
                Collection collection8 = this.q;
                gog gogVar14 = this.p;
                mu7Var3 = (mu7) this.o;
                TimeMark timeMark18 = this.j;
                qgg.h0(obj);
                arrayList2 = collection8;
                gogVar4 = gogVar14;
                r78 = 0;
                timeMark2 = timeMark18;
                obj2 = null;
                H8 = obj;
                g03 = CollectionsKt.g0(arrayList2, (Iterable) H8);
                this.t = r78;
                this.j = timeMark2;
                this.k = r78;
                this.l = r78;
                this.m = r78;
                this.n = r78;
                this.o = r78;
                this.p = gogVar4;
                this.q = g03;
                this.r = z;
                this.s = 22;
                H9 = mu7Var3.H(this);
                ft2Var8 = r78;
                break;
            case 22:
                Collection collection9 = this.q;
                gogVar4 = this.p;
                TimeMark timeMark19 = this.j;
                qgg.h0(obj);
                timeMark2 = timeMark19;
                ft2Var8 = null;
                obj2 = null;
                g03 = collection9;
                H9 = obj;
                RandomAccess g05 = CollectionsKt.g0(g03, (Iterable) H9);
                gogVar = gogVar4;
                randomAccess2 = g05;
                ft2Var7 = ft2Var8;
                H = timeMark2;
                randomAccess = randomAccess2;
                ft2Var = ft2Var7;
                List o0222222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(7));
                ArrayList arrayList3222222222222222 = new ArrayList(v75.o(o0222222222222222, 10));
                it = o0222222222222222.iterator();
                while (it.hasNext()) {
                }
                apo apoVar222222222222222 = this.x;
                gogVar.getClass();
                p0pVar = (p0p) apoVar222222222222222.c;
                p0pVar.getClass();
                switch (p0pVar.ordinal()) {
                }
                if (ft2Var6 != null) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.y, H));
                return arrayList3222222222222222;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
