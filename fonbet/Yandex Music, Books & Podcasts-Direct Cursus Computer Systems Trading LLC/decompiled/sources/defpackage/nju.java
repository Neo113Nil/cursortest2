package defpackage;

import com.yandex.passport.internal.impl.q0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class nju extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ q0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nju(q0 q0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = q0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new nju(this.l, continuation, 0);
            default:
                return new nju(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nju) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (!((Boolean) ((xdr) ((bqi) ((rju) ((byb) qdcVar.C(I)).b(rju.class)).e.getValue())).getValue()).booleanValue()) {
                        break;
                    } else {
                        q0 q0Var = this.l;
                        this.k = 1;
                        if (q0Var.a(true, true, this) == nm6Var) {
                        }
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
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    q0 q0Var2 = this.l;
                    this.k = 1;
                    if (q0Var2.a(true, true, this) == nm6Var2) {
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
