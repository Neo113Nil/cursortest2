package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class plg extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ xlg l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ plg(xlg xlgVar, long j, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = xlgVar;
        this.m = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new plg(this.l, this.m, continuation, 0);
            default:
                return new plg(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((plg) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.k = 1;
                xlg xlgVar = this.l;
                Object V = x97.V(dm6.b, new f84(xlgVar, xlgVar.h, this.m, (Continuation) null, 3), this);
                return V == nm6Var ? nm6Var : V;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.k = 1;
                xlg xlgVar2 = this.l;
                Object V2 = x97.V(dm6.b, new f84(xlgVar2, this.m, (Continuation) null, xlgVar2), this);
                return V2 == nm6Var2 ? nm6Var2 : V2;
        }
    }
}
