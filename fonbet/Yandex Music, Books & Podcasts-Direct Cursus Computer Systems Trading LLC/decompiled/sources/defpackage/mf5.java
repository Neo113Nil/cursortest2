package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mf5 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ lja k;
    public /* synthetic */ fba l;
    public final /* synthetic */ mqs m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf5(mqs mqsVar, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = mqsVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lja ljaVar = (lja) obj;
        fba fbaVar = (fba) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                mf5 mf5Var = new mf5(this.m, continuation, 0);
                mf5Var.k = ljaVar;
                mf5Var.l = fbaVar;
                return mf5Var.invokeSuspend(Unit.a);
            default:
                mf5 mf5Var2 = new mf5(this.m, continuation, 1);
                mf5Var2.k = ljaVar;
                mf5Var2.l = fbaVar;
                return mf5Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        mqs mqsVar = this.m;
        switch (i) {
            case 0:
                lja ljaVar = this.k;
                fba fbaVar = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return new kf5(ljaVar.a.contains(mqsVar.a), fbaVar.a.containsKey(mqsVar));
            default:
                lja ljaVar2 = this.k;
                fba fbaVar2 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return ljaVar2.a.contains(mqsVar.a) ? crp.c : fbaVar2.a.containsKey(mqsVar) ? crp.b : crp.a;
        }
    }
}
