package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class qw5 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ xxq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw5(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xxq xxqVar = (xxq) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                qw5 qw5Var = new qw5(3, 0, continuation);
                qw5Var.k = xxqVar;
                return qw5Var.invokeSuspend(Unit.a);
            case 1:
                qw5 qw5Var2 = new qw5(3, 1, continuation);
                qw5Var2.k = xxqVar;
                return qw5Var2.invokeSuspend(Unit.a);
            case 2:
                qw5 qw5Var3 = new qw5(3, 2, continuation);
                qw5Var3.k = xxqVar;
                return qw5Var3.invokeSuspend(Unit.a);
            case 3:
                qw5 qw5Var4 = new qw5(3, 3, continuation);
                qw5Var4.k = xxqVar;
                return qw5Var4.invokeSuspend(Unit.a);
            default:
                qw5 qw5Var5 = new qw5(3, 4, continuation);
                qw5Var5.k = xxqVar;
                return qw5Var5.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                xxq xxqVar = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return xxqVar;
            case 1:
                xxq xxqVar2 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return xxqVar2;
            case 2:
                xxq xxqVar3 = this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return xxqVar3;
            case 3:
                xxq xxqVar4 = this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return xxqVar4;
            default:
                xxq xxqVar5 = this.k;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                return xxqVar5;
        }
    }
}
