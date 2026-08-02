package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class y3m extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ List l;
    public final /* synthetic */ b4m m;
    public final /* synthetic */ String n;
    public MainDatabase o;
    public Iterator p;
    public Collection q;
    public Iterator r;
    public List s;
    public Collection t;
    public int u;
    public int v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3m(ueo ueoVar, Continuation continuation, List list, b4m b4mVar, String str) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = list;
        this.m = b4mVar;
        this.n = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new y3m(this.k, continuation, this.l, this.m, this.n);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((y3m) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00fa -> B:6:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a0 -> B:27:0x00a1). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        Iterator it;
        Collection collection;
        int i;
        int i2;
        int i3;
        List list;
        Iterator it2;
        int i4;
        int i5;
        y3m y3mVar = this;
        nm6 nm6Var = nm6.a;
        int i6 = y3mVar.j;
        b4m b4mVar = y3mVar.m;
        List list2 = y3mVar.l;
        if (i6 == 0) {
            qgg.h0(obj);
            MainDatabase mainDatabase2 = (MainDatabase) y3mVar.k;
            List list3 = list2;
            ArrayList arrayList = new ArrayList(v75.o(list3, 10));
            mainDatabase = mainDatabase2;
            it = list3.iterator();
            collection = arrayList;
            i = 0;
            i2 = 0;
            i3 = 0;
            if (it.hasNext()) {
            }
        } else if (i6 == 1) {
            i = y3mVar.w;
            i2 = y3mVar.v;
            i3 = y3mVar.u;
            collection = y3mVar.t;
            it = y3mVar.r;
            Collection collection2 = y3mVar.q;
            mainDatabase = y3mVar.o;
            qgg.h0(obj);
            Object a = obj;
            collection.add((t3m) a);
            collection = collection2;
            if (it.hasNext()) {
                stl stlVar = (stl) it.next();
                cvl cvlVar = stlVar.a;
                boolean z = stlVar.b;
                y3mVar.o = mainDatabase;
                y3mVar.p = null;
                Collection collection3 = collection;
                y3mVar.q = collection3;
                y3mVar.r = it;
                y3mVar.s = null;
                y3mVar.t = collection3;
                y3mVar.u = i3;
                y3mVar.v = i2;
                y3mVar.w = i;
                y3mVar.j = 1;
                a = b4m.a(b4mVar, mainDatabase, cvlVar, z, y3mVar);
                if (a != nm6Var) {
                    collection2 = collection;
                    collection.add((t3m) a);
                    collection = collection2;
                    if (it.hasNext()) {
                        list = (List) collection;
                        it2 = CollectionsKt.B0(list).iterator();
                        i4 = i3;
                        i5 = 0;
                        if (it2.hasNext()) {
                        }
                    }
                }
                return nm6Var;
            }
        } else {
            if (i6 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = y3mVar.v;
            int i8 = y3mVar.u;
            List list4 = y3mVar.s;
            Iterator it3 = y3mVar.p;
            MainDatabase mainDatabase3 = y3mVar.o;
            qgg.h0(obj);
            i5 = i7;
            b4m b4mVar2 = b4mVar;
            it2 = it3;
            mainDatabase = mainDatabase3;
            i4 = i8;
            list = list4;
            y3mVar = this;
            b4mVar = b4mVar2;
            if (it2.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) it2.next();
                int i9 = indexedValue.a;
                long j = ((t3m) indexedValue.b).a;
                List list5 = ((stl) list2.get(i9)).c;
                y3mVar.o = mainDatabase;
                y3mVar.p = it2;
                y3mVar.q = null;
                y3mVar.r = null;
                y3mVar.s = list;
                y3mVar.t = null;
                y3mVar.u = i4;
                y3mVar.v = i5;
                y3mVar.w = 0;
                y3mVar.j = 2;
                b4mVar2 = b4mVar;
                MainDatabase mainDatabase4 = mainDatabase;
                if (b4m.b(b4mVar2, mainDatabase4, j, list5, y3mVar) != nm6Var) {
                    mainDatabase = mainDatabase4;
                    y3mVar = this;
                    b4mVar = b4mVar2;
                    if (it2.hasNext()) {
                        vz0 B0 = CollectionsKt.B0(list2);
                        ArrayList arrayList2 = new ArrayList(v75.o(B0, 10));
                        Iterator it4 = B0.iterator();
                        while (true) {
                            ora oraVar = (ora) it4;
                            if (!oraVar.b.hasNext()) {
                                return arrayList2;
                            }
                            IndexedValue indexedValue2 = (IndexedValue) oraVar.next();
                            int i10 = indexedValue2.a;
                            stl stlVar2 = (stl) indexedValue2.b;
                            t3m t3mVar = (t3m) list.get(i10);
                            long j2 = t3mVar.a;
                            boolean z2 = t3mVar.b;
                            cvl cvlVar2 = stlVar2.a;
                            if (z2 && cvlVar2.k != j2) {
                                cvlVar2 = cvl.a(cvlVar2, null, null, 0, 0, j2, null, null, null, null, null, null, null, null, null, null, 134216703);
                            }
                            arrayList2.add(cvlVar2);
                        }
                    }
                }
                return nm6Var;
            }
        }
    }
}
