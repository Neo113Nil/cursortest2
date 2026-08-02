package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class t9j extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ List l;
    public /* synthetic */ List m;
    public final /* synthetic */ v9j n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9j(v9j v9jVar, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.n = v9jVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                t9j t9jVar = new t9j(this.n, continuation, 0);
                t9jVar.l = list;
                t9jVar.m = list2;
                return t9jVar.invokeSuspend(Unit.a);
            default:
                t9j t9jVar2 = new t9j(this.n, continuation, 1);
                t9jVar2.l = list;
                t9jVar2.m = list2;
                return t9jVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List o0;
        Object obj3;
        switch (this.j) {
            case 0:
                List list = this.l;
                List list2 = this.m;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    v9j v9jVar = this.n;
                    ((lz1) v9jVar.p.getValue()).getClass();
                    list.getClass();
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((vbc) obj2).b()) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    vbc vbcVar = (vbc) obj2;
                    int ordinal = (vbcVar != null ? lz1.a(vbcVar) : wv1.a).ordinal();
                    if (ordinal == 0) {
                        o0 = CollectionsKt.o0(list2, new ehf(16));
                    } else if (ordinal == 1) {
                        o0 = CollectionsKt.o0(list2, new ehf(15));
                    } else {
                        b6e.s();
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    Object V = x97.V(dm6.b, new seg(v9jVar, o0, (Continuation) null, 7), this);
                    return V == nm6Var ? nm6Var : V;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                List list3 = this.l;
                List list4 = this.m;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    v9j v9jVar2 = this.n;
                    ((jcm) v9jVar2.q.getValue()).getClass();
                    list3.getClass();
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (((vbc) obj3).b()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    vbc vbcVar2 = (vbc) obj3;
                    int ordinal2 = (vbcVar2 != null ? jcm.a(vbcVar2) : kcm.a).ordinal();
                    if (ordinal2 == 0) {
                        list4 = CollectionsKt.o0(list4, new ehf(18));
                    } else if (ordinal2 == 1) {
                        list4 = CollectionsKt.o0(list4, new ehf(17));
                    } else if (ordinal2 == 2) {
                        su4.s(2, null, "sorting is not implemented", null);
                    } else {
                        b6e.s();
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    Object V2 = x97.V(dm6.b, new seg(v9jVar2, list4, (Continuation) null, 7), this);
                    return V2 == nm6Var2 ? nm6Var2 : V2;
                }
                if (i2 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
