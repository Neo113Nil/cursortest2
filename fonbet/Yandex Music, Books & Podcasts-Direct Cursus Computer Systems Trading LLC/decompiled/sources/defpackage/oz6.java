package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class oz6 extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public boolean l;
    public final /* synthetic */ boolean m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz6(CoroutineContext coroutineContext, ueo ueoVar, boolean z, boolean z2, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.n = coroutineContext;
        this.o = ueoVar;
        this.l = z;
        this.m = z2;
        this.p = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new oz6((CoroutineContext) this.n, (ueo) this.o, this.l, this.m, (Function1) this.p, continuation);
            case 1:
                oz6 oz6Var = new oz6((sdr) this.o, this.l, (fvf) this.p, this.m, continuation);
                oz6Var.n = obj;
                return oz6Var;
            default:
                return new oz6((x3l) this.p, this.m, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((oz6) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((oz6) create((jtm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((oz6) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        x3l x3lVar;
        qqi qqiVar;
        boolean z;
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
                CoroutineContext coroutineContext = (CoroutineContext) this.n;
                nz6 nz6Var = new nz6((ueo) this.o, this.l, this.m, (Function1) this.p, (Continuation) null);
                this.k = 1;
                Object V = x97.V(coroutineContext, nz6Var, this);
                return V == nm6Var ? nm6Var : V;
            case 1:
                jtm jtmVar = (jtm) this.n;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    final sdr sdrVar = (sdr) this.o;
                    final boolean z2 = this.l;
                    final fvf fvfVar = (fvf) this.p;
                    final boolean z3 = this.m;
                    eno s0 = szf.s0(new Function0() { // from class: twb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(sdr.this.getValue() == ptb.a && (z2 || fvfVar.h() > 0) && !z3);
                        }
                    });
                    iwb iwbVar = new iwb(jtmVar, 1);
                    this.n = null;
                    this.k = 1;
                    if (s0.collect(iwbVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    x3lVar = (x3l) this.p;
                    qqi qqiVar2 = x3lVar.h;
                    this.n = qqiVar2;
                    this.o = x3lVar;
                    boolean z4 = this.m;
                    this.l = z4;
                    this.k = 1;
                    if (qqiVar2.a(this) == nm6Var3) {
                        return nm6Var3;
                    }
                    qqiVar = qqiVar2;
                    z = z4;
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = this.l;
                    x3lVar = (x3l) this.o;
                    qqiVar = (qqi) this.n;
                    qgg.h0(obj);
                }
                try {
                    (z ? x3lVar.a : x3lVar.c).l(null);
                    qqiVar.b(null);
                    return Unit.a;
                } catch (Throwable th) {
                    qqiVar.b(null);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz6(sdr sdrVar, boolean z, fvf fvfVar, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.o = sdrVar;
        this.l = z;
        this.p = fvfVar;
        this.m = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz6(x3l x3lVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.p = x3lVar;
        this.m = z;
    }
}
