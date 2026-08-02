package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class apa extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bpa m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ apa(bpa bpaVar, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = bpaVar;
        this.n = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                apa apaVar = new apa(this.m, this.n, continuation, 0);
                apaVar.l = obj;
                return apaVar;
            default:
                apa apaVar2 = new apa(this.m, this.n, continuation, 1);
                apaVar2.l = obj;
                return apaVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((apa) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        long j = this.n;
        bpa bpaVar = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.l;
                    pyc pycVar = bpaVar.B;
                    enj enjVar = new enj(j);
                    this.k = 1;
                    if (pycVar.invoke(mm6Var, enjVar, this) == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var2 = (mm6) this.l;
                    pyc pycVar2 = bpaVar.C;
                    long f = yzt.f(bpaVar.D ? -1.0f : 1.0f, j);
                    bxj bxjVar = bpaVar.z;
                    kr3 kr3Var = zoa.a;
                    Float f2 = new Float(bxjVar == bxj.a ? yzt.c(f) : yzt.b(f));
                    this.k = 1;
                    if (pycVar2.invoke(mm6Var2, f2, this) == nm6Var2) {
                        break;
                    }
                } else if (i3 != 1) {
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
