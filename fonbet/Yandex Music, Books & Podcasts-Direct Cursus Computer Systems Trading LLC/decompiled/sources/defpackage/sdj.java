package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class sdj extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ List l;
    public /* synthetic */ List m;
    public final /* synthetic */ udj n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sdj(udj udjVar, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.n = udjVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                sdj sdjVar = new sdj(this.n, continuation, 0);
                sdjVar.l = list;
                sdjVar.m = list2;
                return sdjVar.invokeSuspend(Unit.a);
            default:
                sdj sdjVar2 = new sdj(this.n, continuation, 1);
                sdjVar2.l = list;
                sdjVar2.m = list2;
                return sdjVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List o0;
        Object obj3;
        List o02;
        switch (this.j) {
            case 0:
                List list = this.l;
                List list2 = this.m;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    udj udjVar = this.n;
                    ((md4) udjVar.q.getValue()).getClass();
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
                    int ordinal = (vbcVar != null ? md4.a(vbcVar) : nd4.a).ordinal();
                    if (ordinal == 0) {
                        o0 = CollectionsKt.o0(list2, new ehf(20));
                    } else if (ordinal == 1) {
                        o0 = CollectionsKt.o0(list2, new ehf(19));
                    } else {
                        b6e.s();
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    Object V = x97.V(dm6.b, new seg(udjVar, o0, (Continuation) null, 8), this);
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
                    udj udjVar2 = this.n;
                    ((zdb) udjVar2.p.getValue()).getClass();
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
                    int ordinal2 = (vbcVar2 != null ? zdb.a(vbcVar2) : aeb.a).ordinal();
                    if (ordinal2 == 0) {
                        o02 = CollectionsKt.o0(list4, new ehf(23));
                    } else if (ordinal2 == 1) {
                        o02 = CollectionsKt.o0(list4, new ehf(22));
                    } else if (ordinal2 == 2) {
                        o02 = CollectionsKt.o0(list4, new eh(12, new ehf(21)));
                    } else {
                        b6e.s();
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    Object V2 = x97.V(dm6.b, new seg(udjVar2, o02, (Continuation) null, 8), this);
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
