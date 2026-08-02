package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class mog extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mog(boolean z, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = z;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new mog(this.l, this.m, continuation, 0);
            case 1:
                return new mog(this.l, this.m, continuation, 1);
            case 2:
                return new mog(this.l, this.m, continuation, 2);
            default:
                return new mog(this.l, this.m, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((mog) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    z0j z0jVar = new z0j(this.l, paj.c);
                    String str = this.m;
                    this.k = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    obj = z0jVar.a0(g0p.a(), str, this);
                    if (obj != nm6Var) {
                        obj = (List) obj;
                    }
                    if (obj == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                for (Pair pair : iterable) {
                    arrayList.add(new Pair(pair.a, new epg((oq) pair.b)));
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    kj3 kj3Var = new kj3(zdj.c, this.l, true);
                    String str2 = this.m;
                    this.k = 1;
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(g0p.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    obj = kj3Var.b(g0p.a(), str2, this);
                    if (obj != nm6Var2) {
                        obj = (List) obj;
                    }
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable2 = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                for (Pair pair2 : iterable2) {
                    arrayList2.add(new Pair(pair2.a, new fpg((mqs) pair2.b)));
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    kj3 kj3Var2 = new kj3(zdj.b, this.l, true);
                    String str3 = this.m;
                    this.k = 1;
                    l18 l18Var3 = l18.b;
                    bdt I3 = hag.I(g0p.class);
                    qdc qdcVar3 = l18Var3.a;
                    qdcVar3.getClass();
                    obj = kj3Var2.b(g0p.a(), str3, this);
                    if (obj != nm6Var3) {
                        obj = (List) obj;
                    }
                    if (obj == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable3 = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(v75.o(iterable3, 10));
                for (Pair pair3 : iterable3) {
                    arrayList3.add(new Pair(pair3.a, new fpg((mqs) pair3.b)));
                }
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    z0j z0jVar2 = new z0j(this.l, paj.b);
                    String str4 = this.m;
                    this.k = 1;
                    l18 l18Var4 = l18.b;
                    bdt I4 = hag.I(g0p.class);
                    qdc qdcVar4 = l18Var4.a;
                    qdcVar4.getClass();
                    obj = z0jVar2.a0(g0p.a(), str4, this);
                    if (obj != nm6Var4) {
                        obj = (List) obj;
                    }
                    if (obj == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Iterable<Pair> iterable4 = (Iterable) obj;
                ArrayList arrayList4 = new ArrayList(v75.o(iterable4, 10));
                for (Pair pair4 : iterable4) {
                    arrayList4.add(new Pair(pair4.a, new epg((oq) pair4.b)));
                }
                break;
        }
        return null;
    }
}
