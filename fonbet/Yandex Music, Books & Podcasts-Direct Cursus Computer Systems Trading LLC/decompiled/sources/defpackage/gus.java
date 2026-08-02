package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class gus extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ueo l;
    public final /* synthetic */ List m;
    public MainDatabase n;
    public Collection o;
    public Iterator p;
    public int q;
    public int r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gus(ueo ueoVar, Continuation continuation, List list, int i) {
        super(1, continuation);
        this.j = i;
        this.l = ueoVar;
        this.m = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new gus(this.l, continuation, this.m, 0);
            default:
                return new gus(this.l, continuation, this.m, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((gus) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009a -> B:7:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01c6 -> B:39:0x01c9). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        int i;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
        MainDatabase mainDatabase2;
        int i4;
        Iterator it2;
        Collection collection2;
        int i5;
        int i6;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase3 = (MainDatabase) this.l;
                    ArrayList H = CollectionsKt.H(this.m, 950);
                    ArrayList arrayList = new ArrayList();
                    mainDatabase = mainDatabase3;
                    i = 0;
                    it = H.iterator();
                    collection = arrayList;
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.s;
                    i2 = this.r;
                    i3 = this.q;
                    it = this.p;
                    collection = this.o;
                    mainDatabase = this.n;
                    qgg.h0(obj);
                    Object G = obj;
                    z75.t(collection, (Iterable) G);
                    if (it.hasNext()) {
                        List list = (List) it.next();
                        v3t T = mainDatabase.T();
                        this.n = mainDatabase;
                        this.o = collection;
                        this.p = it;
                        this.q = i3;
                        this.r = i2;
                        this.s = i;
                        this.k = 1;
                        T.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append("SELECT original_id FROM track WHERE original_id IN (");
                        swf.x(list.size(), sb);
                        sb.append(")");
                        G = up6.G(T.a, true, false, new i20(sb.toString(), list, 9), this);
                        if (G == nm6Var) {
                            return nm6Var;
                        }
                        z75.t(collection, (Iterable) G);
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            default:
                nm6 nm6Var2 = nm6.a;
                int i8 = this.k;
                List list2 = this.m;
                if (i8 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase4 = (MainDatabase) this.l;
                    ArrayList H2 = CollectionsKt.H(list2, 950);
                    ArrayList arrayList2 = new ArrayList();
                    mainDatabase2 = mainDatabase4;
                    i4 = 0;
                    it2 = H2.iterator();
                    collection2 = arrayList2;
                    i5 = 0;
                    i6 = 0;
                    if (it2.hasNext()) {
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = this.s;
                    i5 = this.r;
                    i6 = this.q;
                    it2 = this.p;
                    collection2 = this.o;
                    mainDatabase2 = this.n;
                    qgg.h0(obj);
                    Object G2 = obj;
                    Iterable<ers> iterable = (Iterable) G2;
                    ArrayList arrayList3 = new ArrayList(v75.o(iterable, 10));
                    for (ers ersVar : iterable) {
                        arrayList3.add(new Pair(ersVar.a, Boolean.valueOf(dg2.valueOf(ersVar.b) == dg2.b)));
                    }
                    z75.t(collection2, arrayList3);
                    if (it2.hasNext()) {
                        List list3 = (List) it2.next();
                        v3t T2 = mainDatabase2.T();
                        this.n = mainDatabase2;
                        this.o = collection2;
                        this.p = it2;
                        this.q = i6;
                        this.r = i5;
                        this.s = i4;
                        this.k = 1;
                        T2.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SELECT original_id, available FROM track WHERE original_id IN (");
                        swf.x(list3.size(), sb2);
                        sb2.append(")");
                        G2 = up6.G(T2.a, true, false, new i20(sb2.toString(), list3, 10), this);
                        if (G2 == nm6Var2) {
                            return nm6Var2;
                        }
                        Iterable<ers> iterable2 = (Iterable) G2;
                        ArrayList arrayList32 = new ArrayList(v75.o(iterable2, 10));
                        while (r4.hasNext()) {
                        }
                        z75.t(collection2, arrayList32);
                        if (it2.hasNext()) {
                            List<Pair> list4 = (List) collection2;
                            int a = tah.a(v75.o(list4, 10));
                            if (a < 16) {
                                a = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                            for (Pair pair : list4) {
                                linkedHashMap.put(pair.a, pair.b);
                            }
                            List list5 = list2;
                            ArrayList arrayList4 = new ArrayList(v75.o(list5, 10));
                            Iterator it3 = list5.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add((Boolean) linkedHashMap.get((String) it3.next()));
                            }
                            return arrayList4;
                        }
                    }
                }
        }
    }
}
