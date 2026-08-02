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
import kotlin.text.StringsKt;
import kotlin.time.TimeMark;

/* loaded from: classes3.dex */
public final class tog extends aur implements Function2 {
    public TimeMark j;
    public ou7 k;
    public Object l;
    public mu7 m;
    public Collection n;
    public boolean o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ String r;
    public final /* synthetic */ ime s;
    public final /* synthetic */ t1p t;
    public final /* synthetic */ xdh u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tog(String str, ime imeVar, t1p t1pVar, xdh xdhVar, Continuation continuation) {
        super(2, continuation);
        this.r = str;
        this.s = imeVar;
        this.t = t1pVar;
        this.u = xdhVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        tog togVar = new tog(this.r, this.s, this.t, this.u, continuation);
        togVar.q = obj;
        return togVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tog) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x043d A[LOOP:0: B:10:0x0437->B:12:0x043d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0128 A[LOOP:1: B:31:0x0122->B:33:0x0128, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016e A[LOOP:2: B:38:0x0168->B:40:0x016e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0298 A[LOOP:3: B:62:0x0292->B:64:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d9 A[LOOP:4: B:68:0x02d3->B:70:0x02d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0347 A[LOOP:6: B:85:0x0341->B:87:0x0347, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r0v20, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r0v22, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r0v48, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r0v51, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r1v16, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r1v35, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r4v33, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r4v36, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r4v39, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r6v19, types: [kotlin.time.TimeMark] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fis H;
        mu7 mu7Var;
        boolean z;
        TimeMark timeMark;
        ou7 ou7Var;
        mu7 mu7Var2;
        fis fisVar;
        fis fisVar2;
        ou7 ou7Var2;
        boolean z2;
        ou7 ou7Var3;
        boolean z3;
        ou7 ou7Var4;
        boolean z4;
        Iterator it;
        ArrayList arrayList;
        Object H2;
        Collection collection;
        fis fisVar3;
        Object H3;
        Collection collection2;
        fis fisVar4;
        Object H4;
        Collection collection3;
        fis fisVar5;
        RandomAccess randomAccess;
        Object H5;
        Collection collection4;
        mu7 mu7Var3;
        mu7 mu7Var4;
        Collection g0;
        ?? r6;
        Object H6;
        Collection collection5;
        fis fisVar6;
        Iterator it2;
        RandomAccess randomAccess2;
        fis fisVar7;
        mm6 mm6Var = (mm6) this.q;
        nm6 nm6Var = nm6.a;
        int i = this.p;
        ime imeVar = this.s;
        Continuation continuation = null;
        switch (i) {
            case 0:
                qgg.h0(obj);
                String str = this.r;
                if (StringsKt.U(str)) {
                    return c5b.a;
                }
                imeVar.getClass();
                z66 z66Var = (z66) imeVar.c;
                H = ime.H();
                boolean h1 = gut.h1(z66Var);
                t1p t1pVar = this.t;
                switch (t1pVar == null ? -1 : rog.a[t1pVar.ordinal()]) {
                    case -1:
                    case 12:
                        ou7 p = x97.p(mm6Var, null, null, new sog(imeVar, str, continuation, 0), 3);
                        ou7 p2 = x97.p(mm6Var, null, null, new iog(imeVar, str, h1, continuation, 13), 3);
                        ou7 p3 = x97.p(mm6Var, null, null, new iog(imeVar, str, h1, continuation, 17), 3);
                        ou7 p4 = x97.p(mm6Var, null, null, new iog(imeVar, str, h1, continuation, 14), 3);
                        this.q = null;
                        this.j = H;
                        this.k = p2;
                        this.l = p3;
                        this.m = p4;
                        this.o = h1;
                        this.p = 12;
                        obj = p.s(this);
                        if (obj != nm6Var) {
                            mu7Var = p4;
                            z = h1;
                            timeMark = H;
                            ou7Var = p2;
                            mu7Var2 = p3;
                            Collection collection6 = (Collection) obj;
                            this.q = null;
                            this.j = timeMark;
                            this.k = null;
                            this.l = mu7Var2;
                            this.m = mu7Var;
                            this.n = collection6;
                            this.o = z;
                            this.p = 13;
                            H5 = ou7Var.H(this);
                            if (H5 != nm6Var) {
                                mu7 mu7Var5 = mu7Var;
                                collection4 = collection6;
                                obj = H5;
                                mu7Var3 = mu7Var2;
                                mu7Var4 = mu7Var5;
                                g0 = CollectionsKt.g0(collection4, (Iterable) obj);
                                this.q = null;
                                this.j = timeMark;
                                this.k = null;
                                this.l = null;
                                this.m = mu7Var4;
                                this.n = g0;
                                this.o = z;
                                this.p = 14;
                                obj = mu7Var3.H(this);
                                if (obj != nm6Var) {
                                    r6 = timeMark;
                                    ArrayList g02 = CollectionsKt.g0(g0, (Iterable) obj);
                                    this.q = null;
                                    this.j = r6;
                                    this.k = null;
                                    this.l = null;
                                    this.m = null;
                                    this.n = g02;
                                    this.o = z;
                                    this.p = 15;
                                    H6 = mu7Var4.H(this);
                                    if (H6 != nm6Var) {
                                        collection5 = g02;
                                        obj = H6;
                                        fisVar6 = r6;
                                        fisVar7 = fisVar6;
                                        randomAccess2 = CollectionsKt.g0(collection5, (Iterable) obj);
                                        H = fisVar7;
                                        randomAccess = randomAccess2;
                                        List o0 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                                        ArrayList arrayList2 = new ArrayList(v75.o(o0, 10));
                                        it2 = o0.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add((ipg) ((Pair) it2.next()).b);
                                        }
                                        ((h6i) imeVar.d).g(wdg.X(this.u, H));
                                        return arrayList2;
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    case 0:
                    default:
                        randomAccess = c5b.a;
                        List o02 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                        ArrayList arrayList22 = new ArrayList(v75.o(o02, 10));
                        it2 = o02.iterator();
                        while (it2.hasNext()) {
                        }
                        ((h6i) imeVar.d).g(wdg.X(this.u, H));
                        return arrayList22;
                    case 1:
                        this.q = null;
                        this.j = H;
                        this.o = h1;
                        this.p = 1;
                        obj = ime.P(str, gut.h1(z66Var), this);
                        if (obj != nm6Var) {
                            fisVar = H;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : (Iterable) obj) {
                                mqs mqsVar = (mqs) ((Pair) obj2).b;
                                mqsVar.getClass();
                                if (!a4g.D(gys.MyMusic, mqsVar)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            ?? arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                arrayList4.add(new Pair(pair.a, new gpg((mqs) pair.b)));
                            }
                            H = fisVar;
                            randomAccess = arrayList4;
                            List o022 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                            ArrayList arrayList222 = new ArrayList(v75.o(o022, 10));
                            it2 = o022.iterator();
                            while (it2.hasNext()) {
                            }
                            ((h6i) imeVar.d).g(wdg.X(this.u, H));
                            return arrayList222;
                        }
                        return nm6Var;
                    case 2:
                    case 3:
                        this.q = null;
                        this.j = H;
                        this.o = h1;
                        this.p = 2;
                        obj = ime.e(imeVar, str, h1, this);
                        if (obj != nm6Var) {
                            fisVar2 = H;
                            Iterable<Pair> iterable = (Iterable) obj;
                            arrayList = new ArrayList(v75.o(iterable, 10));
                            for (Pair pair2 : iterable) {
                                arrayList.add(new Pair(pair2.a, new dpg((cvl) pair2.b)));
                            }
                            H = fisVar2;
                            randomAccess = arrayList;
                            List o0222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                            ArrayList arrayList2222 = new ArrayList(v75.o(o0222, 10));
                            it2 = o0222.iterator();
                            while (it2.hasNext()) {
                            }
                            ((h6i) imeVar.d).g(wdg.X(this.u, H));
                            return arrayList2222;
                        }
                        return nm6Var;
                    case 4:
                        this.q = null;
                        this.j = H;
                        this.o = h1;
                        this.p = 3;
                        obj = ime.b(imeVar, str, h1, this);
                        if (obj != nm6Var) {
                            fisVar2 = H;
                            Iterable<Pair> iterable2 = (Iterable) obj;
                            arrayList = new ArrayList(v75.o(iterable2, 10));
                            for (Pair pair3 : iterable2) {
                                arrayList.add(new Pair(pair3.a, new cpg((c01) pair3.b)));
                            }
                            H = fisVar2;
                            randomAccess = arrayList;
                            List o02222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                            ArrayList arrayList22222 = new ArrayList(v75.o(o02222, 10));
                            it2 = o02222.iterator();
                            while (it2.hasNext()) {
                            }
                            ((h6i) imeVar.d).g(wdg.X(this.u, H));
                            return arrayList22222;
                        }
                        return nm6Var;
                    case 5:
                        ou7 p5 = x97.p(mm6Var, null, null, new iog(imeVar, str, h1, continuation, 16), 3);
                        ou7 p6 = x97.p(mm6Var, null, null, new iog(imeVar, str, h1, continuation, 12), 3);
                        this.q = null;
                        this.j = H;
                        this.k = p6;
                        this.o = h1;
                        this.p = 4;
                        obj = p5.s(this);
                        if (obj != nm6Var) {
                            ou7Var2 = p6;
                            z2 = h1;
                            Collection collection7 = (Collection) obj;
                            this.q = null;
                            this.j = H;
                            this.k = null;
                            this.l = collection7;
                            this.o = z2;
                            this.p = 5;
                            H2 = ou7Var2.H(this);
                            if (H2 != nm6Var) {
                                collection = collection7;
                                obj = H2;
                                fisVar3 = H;
                                fisVar7 = fisVar3;
                                randomAccess2 = CollectionsKt.g0(collection, (Iterable) obj);
                                H = fisVar7;
                                randomAccess = randomAccess2;
                                List o022222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                                ArrayList arrayList222222 = new ArrayList(v75.o(o022222, 10));
                                it2 = o022222.iterator();
                                while (it2.hasNext()) {
                                }
                                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                                return arrayList222222;
                            }
                        }
                        return nm6Var;
                    case 6:
                    case 7:
                        ou7 p7 = x97.p(mm6Var, null, null, new iog(imeVar, str, h1, continuation, 18), 3);
                        ou7 p8 = x97.p(mm6Var, null, null, new sog(imeVar, str, continuation, 1), 3);
                        this.q = null;
                        this.j = H;
                        this.k = p8;
                        this.o = h1;
                        this.p = 6;
                        obj = p7.s(this);
                        if (obj != nm6Var) {
                            ou7Var3 = p8;
                            z3 = h1;
                            Collection collection8 = (Collection) obj;
                            this.q = null;
                            this.j = H;
                            this.k = null;
                            this.l = collection8;
                            this.o = z3;
                            this.p = 7;
                            H3 = ou7Var3.H(this);
                            if (H3 != nm6Var) {
                                collection2 = collection8;
                                obj = H3;
                                fisVar4 = H;
                                fisVar7 = fisVar4;
                                randomAccess2 = CollectionsKt.g0(collection2, (Iterable) obj);
                                H = fisVar7;
                                randomAccess = randomAccess2;
                                List o0222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                                ArrayList arrayList2222222 = new ArrayList(v75.o(o0222222, 10));
                                it2 = o0222222.iterator();
                                while (it2.hasNext()) {
                                }
                                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                                return arrayList2222222;
                            }
                        }
                        return nm6Var;
                    case 8:
                    case 9:
                        ou7 p9 = x97.p(mm6Var, null, null, new iog(imeVar, str, h1, continuation, 15), 3);
                        ou7 p10 = x97.p(mm6Var, null, null, new sog(imeVar, str, continuation, 2), 3);
                        this.q = null;
                        this.j = H;
                        this.k = p10;
                        this.o = h1;
                        this.p = 8;
                        obj = p9.s(this);
                        if (obj != nm6Var) {
                            ou7Var4 = p10;
                            z4 = h1;
                            Collection collection9 = (Collection) obj;
                            this.q = null;
                            this.j = H;
                            this.k = null;
                            this.l = collection9;
                            this.o = z4;
                            this.p = 9;
                            H4 = ou7Var4.H(this);
                            if (H4 != nm6Var) {
                                collection3 = collection9;
                                obj = H4;
                                fisVar5 = H;
                                fisVar7 = fisVar5;
                                randomAccess2 = CollectionsKt.g0(collection3, (Iterable) obj);
                                H = fisVar7;
                                randomAccess = randomAccess2;
                                List o02222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                                ArrayList arrayList22222222 = new ArrayList(v75.o(o02222222, 10));
                                it2 = o02222222.iterator();
                                while (it2.hasNext()) {
                                }
                                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                                return arrayList22222222;
                            }
                        }
                        return nm6Var;
                    case 10:
                        paj pajVar = paj.f;
                        this.q = null;
                        this.j = H;
                        this.o = h1;
                        this.p = 10;
                        obj = ime.f(imeVar, str, pajVar, h1, this);
                        if (obj != nm6Var) {
                            fisVar2 = H;
                            Iterable<Pair> iterable3 = (Iterable) obj;
                            arrayList = new ArrayList(v75.o(iterable3, 10));
                            for (Pair pair4 : iterable3) {
                                arrayList.add(new Pair(pair4.a, new bpg((oq) pair4.b)));
                            }
                            H = fisVar2;
                            randomAccess = arrayList;
                            List o022222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                            ArrayList arrayList222222222 = new ArrayList(v75.o(o022222222, 10));
                            it2 = o022222222.iterator();
                            while (it2.hasNext()) {
                            }
                            ((h6i) imeVar.d).g(wdg.X(this.u, H));
                            return arrayList222222222;
                        }
                        return nm6Var;
                    case 11:
                        paj pajVar2 = paj.h;
                        this.q = null;
                        this.j = H;
                        this.o = h1;
                        this.p = 11;
                        obj = ime.f(imeVar, str, pajVar2, h1, this);
                        if (obj != nm6Var) {
                            fisVar2 = H;
                            Iterable<Pair> iterable4 = (Iterable) obj;
                            arrayList = new ArrayList(v75.o(iterable4, 10));
                            for (Pair pair5 : iterable4) {
                                arrayList.add(new Pair(pair5.a, new epg((oq) pair5.b)));
                            }
                            H = fisVar2;
                            randomAccess = arrayList;
                            List o0222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                            ArrayList arrayList2222222222 = new ArrayList(v75.o(o0222222222, 10));
                            it2 = o0222222222.iterator();
                            while (it2.hasNext()) {
                            }
                            ((h6i) imeVar.d).g(wdg.X(this.u, H));
                            return arrayList2222222222;
                        }
                        return nm6Var;
                }
            case 1:
                ?? r0 = this.j;
                qgg.h0(obj);
                fisVar = r0;
                ArrayList arrayList32 = new ArrayList();
                while (r15.hasNext()) {
                }
                ?? arrayList42 = new ArrayList(v75.o(arrayList32, 10));
                it = arrayList32.iterator();
                while (it.hasNext()) {
                }
                H = fisVar;
                randomAccess = arrayList42;
                List o02222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                ArrayList arrayList22222222222 = new ArrayList(v75.o(o02222222222, 10));
                it2 = o02222222222.iterator();
                while (it2.hasNext()) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                return arrayList22222222222;
            case 2:
                ?? r02 = this.j;
                qgg.h0(obj);
                fisVar2 = r02;
                Iterable<Pair> iterable5 = (Iterable) obj;
                arrayList = new ArrayList(v75.o(iterable5, 10));
                while (r15.hasNext()) {
                }
                H = fisVar2;
                randomAccess = arrayList;
                List o022222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                ArrayList arrayList222222222222 = new ArrayList(v75.o(o022222222222, 10));
                it2 = o022222222222.iterator();
                while (it2.hasNext()) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                return arrayList222222222222;
            case 3:
                ?? r03 = this.j;
                qgg.h0(obj);
                fisVar2 = r03;
                Iterable<Pair> iterable22 = (Iterable) obj;
                arrayList = new ArrayList(v75.o(iterable22, 10));
                while (r15.hasNext()) {
                }
                H = fisVar2;
                randomAccess = arrayList;
                List o0222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                ArrayList arrayList2222222222222 = new ArrayList(v75.o(o0222222222222, 10));
                it2 = o0222222222222.iterator();
                while (it2.hasNext()) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                return arrayList2222222222222;
            case 4:
                z2 = this.o;
                ou7 ou7Var5 = this.k;
                ?? r4 = this.j;
                qgg.h0(obj);
                ou7Var2 = ou7Var5;
                H = r4;
                Collection collection72 = (Collection) obj;
                this.q = null;
                this.j = H;
                this.k = null;
                this.l = collection72;
                this.o = z2;
                this.p = 5;
                H2 = ou7Var2.H(this);
                if (H2 != nm6Var) {
                }
                return nm6Var;
            case 5:
                collection = (Collection) this.l;
                ?? r1 = this.j;
                qgg.h0(obj);
                fisVar3 = r1;
                fisVar7 = fisVar3;
                randomAccess2 = CollectionsKt.g0(collection, (Iterable) obj);
                H = fisVar7;
                randomAccess = randomAccess2;
                List o02222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                ArrayList arrayList22222222222222 = new ArrayList(v75.o(o02222222222222, 10));
                it2 = o02222222222222.iterator();
                while (it2.hasNext()) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                return arrayList22222222222222;
            case 6:
                z3 = this.o;
                ou7 ou7Var6 = this.k;
                ?? r42 = this.j;
                qgg.h0(obj);
                ou7Var3 = ou7Var6;
                H = r42;
                Collection collection82 = (Collection) obj;
                this.q = null;
                this.j = H;
                this.k = null;
                this.l = collection82;
                this.o = z3;
                this.p = 7;
                H3 = ou7Var3.H(this);
                if (H3 != nm6Var) {
                }
                return nm6Var;
            case 7:
                collection2 = (Collection) this.l;
                ?? r12 = this.j;
                qgg.h0(obj);
                fisVar4 = r12;
                fisVar7 = fisVar4;
                randomAccess2 = CollectionsKt.g0(collection2, (Iterable) obj);
                H = fisVar7;
                randomAccess = randomAccess2;
                List o022222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                ArrayList arrayList222222222222222 = new ArrayList(v75.o(o022222222222222, 10));
                it2 = o022222222222222.iterator();
                while (it2.hasNext()) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                return arrayList222222222222222;
            case 8:
                z4 = this.o;
                ou7 ou7Var7 = this.k;
                ?? r43 = this.j;
                qgg.h0(obj);
                ou7Var4 = ou7Var7;
                H = r43;
                Collection collection92 = (Collection) obj;
                this.q = null;
                this.j = H;
                this.k = null;
                this.l = collection92;
                this.o = z4;
                this.p = 9;
                H4 = ou7Var4.H(this);
                if (H4 != nm6Var) {
                }
                return nm6Var;
            case 9:
                collection3 = (Collection) this.l;
                ?? r13 = this.j;
                qgg.h0(obj);
                fisVar5 = r13;
                fisVar7 = fisVar5;
                randomAccess2 = CollectionsKt.g0(collection3, (Iterable) obj);
                H = fisVar7;
                randomAccess = randomAccess2;
                List o0222222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                ArrayList arrayList2222222222222222 = new ArrayList(v75.o(o0222222222222222, 10));
                it2 = o0222222222222222.iterator();
                while (it2.hasNext()) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                return arrayList2222222222222222;
            case 10:
                ?? r04 = this.j;
                qgg.h0(obj);
                fisVar2 = r04;
                Iterable<Pair> iterable32 = (Iterable) obj;
                arrayList = new ArrayList(v75.o(iterable32, 10));
                while (r15.hasNext()) {
                }
                H = fisVar2;
                randomAccess = arrayList;
                List o02222222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                ArrayList arrayList22222222222222222 = new ArrayList(v75.o(o02222222222222222, 10));
                it2 = o02222222222222222.iterator();
                while (it2.hasNext()) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                return arrayList22222222222222222;
            case 11:
                ?? r05 = this.j;
                qgg.h0(obj);
                fisVar2 = r05;
                Iterable<Pair> iterable42 = (Iterable) obj;
                arrayList = new ArrayList(v75.o(iterable42, 10));
                while (r15.hasNext()) {
                }
                H = fisVar2;
                randomAccess = arrayList;
                List o022222222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                ArrayList arrayList222222222222222222 = new ArrayList(v75.o(o022222222222222222, 10));
                it2 = o022222222222222222.iterator();
                while (it2.hasNext()) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                return arrayList222222222222222222;
            case 12:
                z = this.o;
                mu7Var = this.m;
                mu7Var2 = (mu7) this.l;
                ou7Var = this.k;
                timeMark = this.j;
                qgg.h0(obj);
                Collection collection62 = (Collection) obj;
                this.q = null;
                this.j = timeMark;
                this.k = null;
                this.l = mu7Var2;
                this.m = mu7Var;
                this.n = collection62;
                this.o = z;
                this.p = 13;
                H5 = ou7Var.H(this);
                if (H5 != nm6Var) {
                }
                return nm6Var;
            case 13:
                z = this.o;
                collection4 = this.n;
                mu7Var4 = this.m;
                mu7Var3 = (mu7) this.l;
                timeMark = this.j;
                qgg.h0(obj);
                g0 = CollectionsKt.g0(collection4, (Iterable) obj);
                this.q = null;
                this.j = timeMark;
                this.k = null;
                this.l = null;
                this.m = mu7Var4;
                this.n = g0;
                this.o = z;
                this.p = 14;
                obj = mu7Var3.H(this);
                if (obj != nm6Var) {
                }
                return nm6Var;
            case 14:
                z = this.o;
                g0 = this.n;
                mu7Var4 = this.m;
                r6 = this.j;
                qgg.h0(obj);
                ArrayList g022 = CollectionsKt.g0(g0, (Iterable) obj);
                this.q = null;
                this.j = r6;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = g022;
                this.o = z;
                this.p = 15;
                H6 = mu7Var4.H(this);
                if (H6 != nm6Var) {
                }
                return nm6Var;
            case 15:
                collection5 = this.n;
                ?? r14 = this.j;
                qgg.h0(obj);
                fisVar6 = r14;
                fisVar7 = fisVar6;
                randomAccess2 = CollectionsKt.g0(collection5, (Iterable) obj);
                H = fisVar7;
                randomAccess = randomAccess2;
                List o0222222222222222222 = CollectionsKt.o0((Iterable) randomAccess, new ehf(10));
                ArrayList arrayList2222222222222222222 = new ArrayList(v75.o(o0222222222222222222, 10));
                it2 = o0222222222222222222.iterator();
                while (it2.hasNext()) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.u, H));
                return arrayList2222222222222222222;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
