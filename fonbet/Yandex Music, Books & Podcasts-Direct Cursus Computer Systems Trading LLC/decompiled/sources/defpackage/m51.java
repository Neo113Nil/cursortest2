package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class m51 extends aur implements Function1 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ ueo l;
    public Collection m;
    public final /* synthetic */ String n;
    public Iterator o;
    public int p;
    public int q;
    public int r;
    public final /* synthetic */ Object s;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m51(ueo ueoVar, b4u b4uVar, String str, Collection collection, Continuation continuation) {
        super(1, continuation);
        this.l = ueoVar;
        this.m = collection;
        this.s = b4uVar;
        this.n = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new m51(this.l, continuation, (List) this.s, (p51) this.t, this.n);
            default:
                Collection collection = this.m;
                return new m51(this.l, (b4u) this.s, this.n, collection, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((m51) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006d -> B:7:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e2 -> B:21:0x00e5). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
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
                    ArrayList H = CollectionsKt.H((List) this.s, 950);
                    ArrayList arrayList = new ArrayList();
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
                    i2 = this.r;
                    i = this.q;
                    i3 = this.p;
                    it = this.o;
                    collection = this.m;
                    qgg.h0(obj);
                    z75.t(collection, (Iterable) obj);
                    if (it.hasNext()) {
                        List list = (List) it.next();
                        this.m = collection;
                        this.o = it;
                        this.p = i3;
                        this.q = i;
                        this.r = i2;
                        this.k = 1;
                        obj = ((p51) this.t).f(this.n, list, this);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        z75.t(collection, (Iterable) obj);
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            default:
                nm6 nm6Var2 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    ArrayList H2 = CollectionsKt.H(this.m, 950);
                    ArrayList arrayList2 = new ArrayList();
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
                    i5 = this.r;
                    i4 = this.q;
                    i6 = this.p;
                    it2 = this.o;
                    collection2 = (Collection) this.t;
                    qgg.h0(obj);
                    z75.t(collection2, (Iterable) obj);
                    if (it2.hasNext()) {
                        List list2 = (List) it2.next();
                        this.t = collection2;
                        this.o = it2;
                        this.p = i6;
                        this.q = i4;
                        this.r = i5;
                        this.k = 1;
                        obj = ((b4u) this.s).f(this.n, list2, this);
                        if (obj == nm6Var2) {
                            return nm6Var2;
                        }
                        z75.t(collection2, (Iterable) obj);
                        if (it2.hasNext()) {
                            return (List) collection2;
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m51(ueo ueoVar, Continuation continuation, List list, p51 p51Var, String str) {
        super(1, continuation);
        this.l = ueoVar;
        this.s = list;
        this.t = p51Var;
        this.n = str;
    }
}
