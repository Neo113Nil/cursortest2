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
public final class nog extends aur implements Function2 {
    public final /* synthetic */ int j;
    public TimeMark k;
    public ou7 l;
    public Collection m;
    public boolean n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ String q;
    public final /* synthetic */ ime r;
    public final /* synthetic */ xdh s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nog(String str, ime imeVar, xdh xdhVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.q = str;
        this.r = imeVar;
        this.s = xdhVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                nog nogVar = new nog(this.q, this.r, this.s, continuation, 0);
                nogVar.p = obj;
                return nogVar;
            default:
                nog nogVar2 = new nog(this.q, this.r, this.s, continuation, 1);
                nogVar2.p = obj;
                return nogVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nog) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c2 A[LOOP:0: B:9:0x00bc->B:11:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019d A[LOOP:1: B:37:0x0197->B:39:0x019d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.time.TimeMark] */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.time.TimeMark] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fis H;
        ou7 ou7Var;
        boolean z;
        Collection collection;
        TimeMark timeMark;
        Iterator it;
        fis H2;
        ou7 ou7Var2;
        boolean z2;
        Collection collection2;
        TimeMark timeMark2;
        Iterator it2;
        switch (this.j) {
            case 0:
                mm6 mm6Var = (mm6) this.p;
                nm6 nm6Var = nm6.a;
                int i = this.o;
                ime imeVar = this.r;
                Continuation continuation = null;
                if (i == 0) {
                    qgg.h0(obj);
                    String str = this.q;
                    if (StringsKt.U(str)) {
                        return c5b.a;
                    }
                    imeVar.getClass();
                    H = ime.H();
                    boolean h1 = gut.h1((z66) imeVar.c);
                    ou7 p = x97.p(mm6Var, null, null, new mog(h1, str, continuation, 0), 3);
                    ou7 p2 = x97.p(mm6Var, null, null, new mog(h1, str, continuation, 1), 3);
                    this.p = null;
                    this.k = H;
                    this.l = p2;
                    this.n = h1;
                    this.o = 1;
                    Object s = p.s(this);
                    if (s == nm6Var) {
                        return nm6Var;
                    }
                    ou7Var = p2;
                    obj = s;
                    z = h1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        collection = this.m;
                        timeMark = this.k;
                        qgg.h0(obj);
                        List o0 = CollectionsKt.o0(CollectionsKt.g0(collection, (Iterable) obj), new ehf(8));
                        ArrayList arrayList = new ArrayList(v75.o(o0, 10));
                        it = o0.iterator();
                        while (it.hasNext()) {
                            arrayList.add((ipg) ((Pair) it.next()).b);
                        }
                        ((h6i) imeVar.d).g(wdg.X(this.s, timeMark));
                        return arrayList;
                    }
                    z = this.n;
                    ou7 ou7Var3 = this.l;
                    ?? r4 = this.k;
                    qgg.h0(obj);
                    ou7Var = ou7Var3;
                    H = r4;
                }
                Collection collection3 = (Collection) obj;
                this.p = null;
                this.k = H;
                this.l = null;
                this.m = collection3;
                this.n = z;
                this.o = 2;
                Object H3 = ou7Var.H(this);
                if (H3 == nm6Var) {
                    return nm6Var;
                }
                collection = collection3;
                obj = H3;
                timeMark = H;
                List o02 = CollectionsKt.o0(CollectionsKt.g0(collection, (Iterable) obj), new ehf(8));
                ArrayList arrayList2 = new ArrayList(v75.o(o02, 10));
                it = o02.iterator();
                while (it.hasNext()) {
                }
                ((h6i) imeVar.d).g(wdg.X(this.s, timeMark));
                return arrayList2;
            default:
                mm6 mm6Var2 = (mm6) this.p;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.o;
                ime imeVar2 = this.r;
                Continuation continuation2 = null;
                if (i2 == 0) {
                    qgg.h0(obj);
                    String str2 = this.q;
                    if (StringsKt.U(str2)) {
                        return c5b.a;
                    }
                    imeVar2.getClass();
                    H2 = ime.H();
                    boolean h12 = gut.h1((z66) imeVar2.c);
                    ou7 p3 = x97.p(mm6Var2, null, null, new mog(h12, str2, continuation2, 3), 3);
                    ou7 p4 = x97.p(mm6Var2, null, null, new mog(h12, str2, continuation2, 2), 3);
                    this.p = null;
                    this.k = H2;
                    this.l = p4;
                    this.n = h12;
                    this.o = 1;
                    Object s2 = p3.s(this);
                    if (s2 == nm6Var2) {
                        return nm6Var2;
                    }
                    ou7Var2 = p4;
                    obj = s2;
                    z2 = h12;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        collection2 = this.m;
                        timeMark2 = this.k;
                        qgg.h0(obj);
                        List o03 = CollectionsKt.o0(CollectionsKt.g0(collection2, (Iterable) obj), new ehf(11));
                        ArrayList arrayList3 = new ArrayList(v75.o(o03, 10));
                        it2 = o03.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add((ipg) ((Pair) it2.next()).b);
                        }
                        ((h6i) imeVar2.d).g(wdg.X(this.s, timeMark2));
                        return arrayList3;
                    }
                    z2 = this.n;
                    ou7 ou7Var4 = this.l;
                    ?? r42 = this.k;
                    qgg.h0(obj);
                    ou7Var2 = ou7Var4;
                    H2 = r42;
                }
                Collection collection4 = (Collection) obj;
                this.p = null;
                this.k = H2;
                this.l = null;
                this.m = collection4;
                this.n = z2;
                this.o = 2;
                Object H4 = ou7Var2.H(this);
                if (H4 == nm6Var2) {
                    return nm6Var2;
                }
                collection2 = collection4;
                obj = H4;
                timeMark2 = H2;
                List o032 = CollectionsKt.o0(CollectionsKt.g0(collection2, (Iterable) obj), new ehf(11));
                ArrayList arrayList32 = new ArrayList(v75.o(o032, 10));
                it2 = o032.iterator();
                while (it2.hasNext()) {
                }
                ((h6i) imeVar2.d).g(wdg.X(this.s, timeMark2));
                return arrayList32;
        }
    }
}
