package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class pog extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pog(boolean z, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = z;
        this.m = str;
        this.n = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new pog(this.l, this.m, this.n, continuation, 0);
            default:
                return new pog(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((pog) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    i30 i30Var = new i30(this.l, this.m);
                    String str = this.n;
                    this.k = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    obj = i30Var.a(g0p.a(), str, this);
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
                    arrayList.add(new Pair(pair.a, new bpg((oq) pair.b)));
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    j4t j4tVar = new j4t(this.l, this.m);
                    String str2 = this.n;
                    this.k = 1;
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(g0p.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    obj = j4tVar.a(g0p.a(), str2, this);
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
                    arrayList2.add(new Pair(pair2.a, new gpg((mqs) pair2.b)));
                }
                break;
        }
        return null;
    }
}
