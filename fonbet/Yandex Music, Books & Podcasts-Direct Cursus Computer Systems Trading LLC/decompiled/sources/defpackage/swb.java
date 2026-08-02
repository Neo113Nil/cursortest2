package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class swb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ aqi l;
    public final /* synthetic */ jub m;
    public final /* synthetic */ fvf n;
    public final /* synthetic */ Function1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swb(aqi aqiVar, jub jubVar, fvf fvfVar, Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = aqiVar;
        this.m = jubVar;
        this.n = fvfVar;
        this.o = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new swb(this.l, this.m, this.n, this.o, continuation, 0);
            default:
                return new swb(this.l, this.m, this.n, this.o, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((swb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    xqn i2 = hrg.i(obj);
                    aqi aqiVar = this.l;
                    i2.a = ((mtb) aqiVar.getValue()).d;
                    eno s0 = szf.s0(new jc(aqiVar, 10));
                    rwb rwbVar = new rwb(this.m, i2, this.n, this.o, null, 0);
                    this.k = 1;
                    if (zsd.O(s0, rwbVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
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
                    xqn i4 = hrg.i(obj);
                    aqi aqiVar2 = this.l;
                    i4.a = ((mtb) aqiVar2.getValue()).d;
                    eno s02 = szf.s0(new jc(aqiVar2, 11));
                    rwb rwbVar2 = new rwb(this.m, i4, this.n, this.o, null, 1);
                    this.k = 1;
                    if (zsd.O(s02, rwbVar2, this) == nm6Var2) {
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
