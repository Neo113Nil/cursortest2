package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r7l extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ s7l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7l(s7l s7lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = s7lVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r7l(this.l, continuation, 0);
            default:
                return new r7l(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r7l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                s7l s7lVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    k1l k1lVar = s7lVar.a;
                    this.k = 1;
                    Object D = k1lVar.h.D(this);
                    if (D != obj2) {
                        D = Unit.a;
                    }
                    if (D == obj2) {
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                f7l f7lVar = s7lVar.b;
                this.k = 2;
                Object V = x97.V(dm6.b(), new g2l(f7lVar, null, 2), this);
                if (V != obj2) {
                    V = Unit.a;
                }
                if (V == obj2) {
                }
                break;
            default:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    f7l f7lVar2 = this.l.b;
                    this.k = 1;
                    if (f7lVar2.a(this) == nm6Var) {
                    }
                } else if (i2 != 1) {
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
