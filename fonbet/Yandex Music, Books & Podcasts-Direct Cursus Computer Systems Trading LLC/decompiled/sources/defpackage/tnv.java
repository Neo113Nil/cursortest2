package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class tnv extends aur implements tyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnv(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.j) {
            case 0:
                tnv tnvVar = new tnv(5, 0, (Continuation) obj5);
                tnvVar.k = (List) obj;
                tnvVar.l = (List) obj2;
                tnvVar.m = (List) obj3;
                tnvVar.n = (List) obj4;
                return tnvVar.invokeSuspend(Unit.a);
            default:
                tnv tnvVar2 = new tnv(5, 1, (Continuation) obj5);
                tnvVar2.k = (tk2) obj;
                tnvVar2.l = (cgg) obj2;
                tnvVar2.m = (rn3) obj3;
                tnvVar2.n = (pi3) obj4;
                return tnvVar2.invokeSuspend(Unit.a);
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
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return CollectionsKt.g0(CollectionsKt.g0(CollectionsKt.g0(list, list2), list3), list4);
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return new azd((tk2) this.k, (cgg) this.l, (rn3) this.m, (pi3) this.n);
        }
    }
}
