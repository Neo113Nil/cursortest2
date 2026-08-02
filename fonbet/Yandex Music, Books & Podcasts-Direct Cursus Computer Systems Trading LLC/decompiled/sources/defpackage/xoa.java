package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class xoa extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ dna m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ aqi p;
    public final /* synthetic */ mm6 q;
    public final /* synthetic */ aqi r;
    public final /* synthetic */ Function0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoa(boolean z, dna dnaVar, Function2 function2, Function1 function1, aqi aqiVar, mm6 mm6Var, aqi aqiVar2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.l = z;
        this.m = dnaVar;
        this.n = function2;
        this.o = function1;
        this.p = aqiVar;
        this.q = mm6Var;
        this.r = aqiVar2;
        this.s = function0;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        xoa xoaVar = new xoa(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, continuation);
        xoaVar.k = obj;
        return xoaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xoa) create((pfm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            pfm pfmVar = (pfm) this.k;
            if (!this.l) {
                return Unit.a;
            }
            Function1 function1 = this.o;
            aqi aqiVar = this.p;
            mm6 mm6Var = this.q;
            aqi aqiVar2 = this.r;
            ak0 ak0Var = new ak0(function1, aqiVar, mm6Var, aqiVar2);
            Function0 function0 = this.s;
            woa woaVar = new woa(function0, aqiVar2, mm6Var, aqiVar, 0);
            woa woaVar2 = new woa(function0, aqiVar2, mm6Var, aqiVar, 1);
            this.j = 1;
            if (this.m.e(pfmVar, ak0Var, woaVar, woaVar2, this.n, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
