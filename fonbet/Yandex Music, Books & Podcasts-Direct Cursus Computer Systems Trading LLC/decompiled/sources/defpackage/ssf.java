package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ssf extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public final /* synthetic */ tsf l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssf(tsf tsfVar, int i, Continuation continuation) {
        super(2, continuation);
        this.l = tsfVar;
        this.k = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ssf(this.l, this.k, continuation);
            default:
                return new ssf(this.l, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((ssf) create((rwo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ssf) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        tsf tsfVar = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                int i2 = this.k;
                nsf nsfVar = tsfVar.d;
                if (nsfVar.b.h() != i2 || nsfVar.c.h() != 0) {
                    b bVar = tsfVar.m;
                    bVar.e();
                    bVar.b = null;
                    bVar.c = -1;
                }
                nsfVar.a(i2, 0);
                nsfVar.e = null;
                mpf mpfVar = tsfVar.j;
                if (mpfVar != null) {
                    mpfVar.l();
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (tsf.j(tsfVar, 0, this) == nm6Var2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssf(tsf tsfVar, Continuation continuation) {
        super(2, continuation);
        this.l = tsfVar;
    }
}
