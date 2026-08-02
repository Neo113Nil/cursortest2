package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class pt4 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ jap l;
    public final /* synthetic */ poi m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt4(jap japVar, poi poiVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = japVar;
        this.m = poiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new pt4(this.l, this.m, continuation, 0);
            case 1:
                return new pt4(this.l, this.m, continuation, 1);
            case 2:
                return new pt4(this.l, this.m, continuation, 2);
            default:
                return new pt4(this.l, this.m, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((pt4) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new nt4(this.l, 0));
                    ot4 ot4Var = new ot4(this.m, 0);
                    this.k = 1;
                    if (s0.collect(ot4Var, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    eno s02 = szf.s0(new nt4(this.l, 1));
                    ot4 ot4Var2 = new ot4(this.m, 1);
                    this.k = 1;
                    if (s02.collect(ot4Var2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    eno s03 = szf.s0(new nt4(this.l, 3));
                    ot4 ot4Var3 = new ot4(this.m, 3);
                    this.k = 1;
                    if (s03.collect(ot4Var3, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    eno s04 = szf.s0(new nt4(this.l, 4));
                    ot4 ot4Var4 = new ot4(this.m, 4);
                    this.k = 1;
                    if (s04.collect(ot4Var4, this) == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
