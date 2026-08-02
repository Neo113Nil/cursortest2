package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class q1q extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ z1q k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1q(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z1q z1qVar = (z1q) obj;
        switch (this.j) {
            case 0:
                q1q q1qVar = new q1q(3, 0, (Continuation) obj3);
                q1qVar.k = z1qVar;
                return q1qVar.invokeSuspend(Unit.a);
            default:
                q1q q1qVar2 = new q1q(3, 1, (Continuation) obj3);
                q1qVar2.k = z1qVar;
                return q1qVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                z1q z1qVar = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                z1qVar.b();
                break;
            default:
                z1q z1qVar2 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ced cedVar = z1qVar2.e.c;
                if (((t1q) cedVar.r.k.getValue()).b != null) {
                    x97.y(z1qVar2.h, null, null, new w1q(cedVar, null, z1qVar2, 0), 3);
                }
                break;
        }
        return Unit.a;
    }
}
