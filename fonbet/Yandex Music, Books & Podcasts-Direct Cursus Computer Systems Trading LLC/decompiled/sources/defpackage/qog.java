package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.time.TimeMark;

/* loaded from: classes3.dex */
public final class qog extends aur implements Function2 {
    public TimeMark j;
    public ou7 k;
    public Collection l;
    public boolean m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ String p;
    public final /* synthetic */ ime q;
    public final /* synthetic */ t1p r;
    public final /* synthetic */ String s;
    public final /* synthetic */ xdh t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qog(String str, ime imeVar, t1p t1pVar, String str2, xdh xdhVar, Continuation continuation) {
        super(2, continuation);
        this.p = str;
        this.q = imeVar;
        this.r = t1pVar;
        this.s = str2;
        this.t = xdhVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        qog qogVar = new qog(this.p, this.q, this.r, this.s, this.t, continuation);
        qogVar.o = obj;
        return qogVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qog) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x018e, code lost:
    
        if (r3 == r10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (r1 == r10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        if (r1 == r10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0175, code lost:
    
        if (r1 == r10) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r1v39, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r3v21, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r4v26, types: [kotlin.time.TimeMark] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fis H;
        boolean z;
        ou7 ou7Var;
        ou7 p;
        Object s;
        Object a;
        Object a2;
        Iterable iterable;
        ArrayList arrayList;
        Collection collection;
        Object H2;
        l18 l18Var = l18.b;
        ime imeVar = this.q;
        String str = this.s;
        String str2 = this.p;
        mm6 mm6Var = (mm6) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.n;
        if (i == 0) {
            qgg.h0(obj);
            if (StringsKt.U(str2)) {
                return c5b.a;
            }
            imeVar.getClass();
            H = ime.H();
            boolean h1 = gut.h1((z66) imeVar.c);
            t1p t1pVar = this.r;
            int i2 = t1pVar == null ? -1 : oog.a[t1pVar.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    j4t j4tVar = new j4t(h1, str);
                    this.o = null;
                    this.j = H;
                    this.m = h1;
                    this.n = 1;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    a = j4tVar.a(g0p.a(), str2, this);
                    if (a != nm6Var) {
                        a = (List) a;
                    }
                } else if (i2 == 2) {
                    i30 i30Var = new i30(h1, str);
                    this.o = null;
                    this.j = H;
                    this.m = h1;
                    this.n = 2;
                    bdt I2 = hag.I(g0p.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    a2 = i30Var.a(g0p.a(), str2, this);
                    if (a2 != nm6Var) {
                        a2 = (List) a2;
                    }
                } else if (i2 != 3) {
                    iterable = c5b.a;
                }
                return nm6Var;
            }
            z = h1;
            ou7Var = null;
            ou7 p2 = x97.p(mm6Var, null, null, new pog(z, str, str2, ou7Var, 1), 3);
            p = x97.p(mm6Var, null, null, new pog(z, str, str2, ou7Var, 0), 3);
            this.o = null;
            this.j = H;
            this.k = p;
            this.m = z;
            this.n = 3;
            s = p2.s(this);
        } else if (i == 1) {
            ?? r1 = this.j;
            qgg.h0(obj);
            H = r1;
            a = obj;
            Iterable<Pair> iterable2 = (Iterable) a;
            arrayList = new ArrayList(v75.o(iterable2, 10));
            for (Pair pair : iterable2) {
                arrayList.add(new Pair(pair.a, new gpg((mqs) pair.b)));
            }
            iterable = arrayList;
        } else if (i == 2) {
            ?? r12 = this.j;
            qgg.h0(obj);
            H = r12;
            a2 = obj;
            Iterable<Pair> iterable3 = (Iterable) a2;
            arrayList = new ArrayList(v75.o(iterable3, 10));
            for (Pair pair2 : iterable3) {
                arrayList.add(new Pair(pair2.a, new bpg((oq) pair2.b)));
            }
            iterable = arrayList;
        } else if (i == 3) {
            boolean z2 = this.m;
            p = this.k;
            ?? r4 = this.j;
            qgg.h0(obj);
            H = r4;
            ou7Var = null;
            z = z2;
            s = obj;
            collection = (Collection) s;
            this.o = ou7Var;
            this.j = H;
            this.k = ou7Var;
            this.l = collection;
            this.m = z;
            this.n = 4;
            H2 = p.H(this);
        } else {
            if (i != 4) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            collection = this.l;
            ?? r3 = this.j;
            qgg.h0(obj);
            H = r3;
            H2 = obj;
            iterable = CollectionsKt.g0(collection, (Iterable) H2);
        }
        List o0 = CollectionsKt.o0(iterable, new ehf(9));
        ArrayList arrayList2 = new ArrayList(v75.o(o0, 10));
        Iterator it = o0.iterator();
        while (it.hasNext()) {
            arrayList2.add((ipg) ((Pair) it.next()).b);
        }
        ((h6i) imeVar.d).g(wdg.X(this.t, H));
        return arrayList2;
    }
}
