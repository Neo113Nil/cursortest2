package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class z2q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ f3q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2q(f3q f3qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = f3qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new z2q(this.l, continuation, 0);
            default:
                return new z2q(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((z2q) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    suk sukVar = (suk) this.l.c.getValue();
                    this.k = 1;
                    yuk yukVar = (yuk) sukVar;
                    yukVar.getClass();
                    Object V = x97.V(dm6.b, new d7i(yukVar, null, 8), this);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    r2f r2fVar = (r2f) this.l.b.a.get(o6c.l);
                    if (r2fVar != null) {
                        this.k = 1;
                        if (r2fVar.j0(this) == nm6Var) {
                        }
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
