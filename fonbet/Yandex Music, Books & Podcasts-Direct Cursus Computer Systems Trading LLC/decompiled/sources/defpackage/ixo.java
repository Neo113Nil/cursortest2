package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ixo extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ lxo l;
    public /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ixo(lxo lxoVar, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = lxoVar;
        this.m = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ixo(this.l, this.m, continuation, 0);
            case 1:
                return new ixo(this.l, this.m, continuation, 1);
            case 2:
                return new ixo(this.l, this.m, continuation, 2);
            default:
                ixo ixoVar = new ixo(this.l, continuation);
                ixoVar.m = ((enj) obj).a;
                return ixoVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((ixo) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ixo) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ixo) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                long j = ((enj) obj).a;
                ixo ixoVar = new ixo(this.l, (Continuation) obj2);
                ixoVar.m = j;
                return ixoVar.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object invokeSuspend;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    iyo iyoVar = this.l.D;
                    long j = this.m;
                    this.k = 1;
                    long a = yzt.a(0.0f, 0.0f, iyoVar.d == bxj.b ? 1 : 2, j);
                    xfm xfmVar = new xfm(iyoVar, (Continuation) null);
                    qg0 qg0Var = iyoVar.b;
                    if (qg0Var == null || !(iyoVar.a.d() || iyoVar.a.c())) {
                        xfm xfmVar2 = new xfm((iyo) xfmVar.n, this);
                        xfmVar2.m = a;
                        invokeSuspend = xfmVar2.invokeSuspend(Unit.a);
                        if (invokeSuspend != nm6.a) {
                            invokeSuspend = Unit.a;
                        }
                    } else {
                        invokeSuspend = qg0Var.b(a, xfmVar, this);
                        if (invokeSuspend != nm6.a) {
                            invokeSuspend = Unit.a;
                        }
                    }
                    if (invokeSuspend == nm6Var) {
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
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    iyo iyoVar2 = this.l.D;
                    hqi hqiVar = hqi.b;
                    jxo jxoVar = new jxo(this.m, null, 0);
                    this.k = 1;
                    if (iyoVar2.e(hqiVar, jxoVar, this) == nm6Var2) {
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
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    iyo iyoVar3 = this.l.D;
                    this.k = 1;
                    iyoVar3.getClass();
                    if (Unit.a == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                long j2 = this.m;
                iyo iyoVar4 = this.l.D;
                this.k = 1;
                Object a2 = a.a(iyoVar4, j2, this);
                return a2 == nm6Var4 ? nm6Var4 : a2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixo(lxo lxoVar, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.l = lxoVar;
    }
}
