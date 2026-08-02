package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class r0b extends aur implements pyc {
    public int j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ vx6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0b(vx6 vx6Var, Continuation continuation) {
        super(3, continuation);
        this.l = vx6Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        r0b r0bVar = new r0b(this.l, (Continuation) obj3);
        r0bVar.k = booleanValue;
        return r0bVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z = this.k;
        Object obj2 = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            if (z) {
                yza yzaVar = (yza) this.l.d;
                this.k = z;
                this.j = 1;
                Object a = lmm.a(yzaVar.b(), new tza(2, null), this);
                if (a != obj2) {
                    a = Unit.a;
                }
                if (a == obj2) {
                    return obj2;
                }
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
