package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class uiv extends aur implements pyc {
    public /* synthetic */ float j;
    public final /* synthetic */ mm6 k;
    public final /* synthetic */ fk0 l;
    public final /* synthetic */ uf7 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uiv(mm6 mm6Var, fk0 fk0Var, uf7 uf7Var, Continuation continuation) {
        super(3, continuation);
        this.k = mm6Var;
        this.l = fk0Var;
        this.m = uf7Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        fk0 fk0Var = this.l;
        uf7 uf7Var = this.m;
        uiv uivVar = new uiv(this.k, fk0Var, uf7Var, (Continuation) obj3);
        uivVar.j = floatValue;
        return uivVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        float f = this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        x97.y(this.k, null, null, new zp5(this.l, f, this.m, null, 4), 3);
        return Unit.a;
    }
}
