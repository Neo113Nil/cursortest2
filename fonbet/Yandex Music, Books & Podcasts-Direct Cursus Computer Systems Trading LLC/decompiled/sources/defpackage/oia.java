package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class oia extends aur implements uyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public /* synthetic */ Object n;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oia(int i, Continuation continuation) {
        super(6, continuation);
        this.j = i;
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.j) {
            case 0:
                oia oiaVar = new oia(0, (Continuation) obj6);
                oiaVar.k = (List) obj;
                oiaVar.l = (List) obj2;
                oiaVar.m = (List) obj3;
                oiaVar.n = (List) obj4;
                oiaVar.o = (List) obj5;
                return oiaVar.invokeSuspend(Unit.a);
            default:
                oia oiaVar2 = new oia(1, (Continuation) obj6);
                oiaVar2.k = (vcu) obj;
                oiaVar2.l = (sy1) obj2;
                oiaVar2.m = (zpr) obj3;
                oiaVar2.n = (jg7) obj4;
                oiaVar2.o = (jg7) obj5;
                return oiaVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                List list = (List) this.k;
                List list2 = (List) this.l;
                List list3 = (List) this.m;
                List list4 = (List) this.n;
                List list5 = (List) this.o;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return new jia(!list.isEmpty() ? list : null, !list2.isEmpty() ? list2 : null, !list3.isEmpty() ? list3 : null, !list4.isEmpty() ? list4 : null, !list5.isEmpty() ? list5 : null);
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return new f3t((vcu) this.k, (sy1) this.l, (zpr) this.m, (jg7) this.n, (jg7) this.o);
        }
    }
}
