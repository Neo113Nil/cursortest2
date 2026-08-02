package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class yfd extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ zfd l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfd(zfd zfdVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = zfdVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new yfd(this.l, continuation, 0);
            case 1:
                return new yfd(this.l, continuation, 1);
            default:
                return new yfd(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((yfd) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                zfd zfdVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    jac jacVar = zfdVar.j;
                    this.k = 1;
                    jacVar.getClass();
                    obj = x97.V(dm6.b, new qdd(jacVar, null, 0), this);
                    if (obj == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    zfd.z(zfdVar, null, null, false, 11);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                zfd zfdVar2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    jac jacVar2 = zfdVar2.j;
                    this.k = 1;
                    jacVar2.getClass();
                    obj = x97.V(dm6.b, new qdd(jacVar2, null, 1), this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    zfd.z(zfdVar2, null, null, true, 11);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (this.l.o(0L, this) == nm6Var3) {
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
