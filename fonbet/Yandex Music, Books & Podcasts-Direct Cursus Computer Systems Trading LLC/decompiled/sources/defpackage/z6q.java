package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class z6q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ a7q k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6q(a7q a7qVar, float f, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = a7qVar;
        this.l = f;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new z6q(this.k, this.l, continuation, 0);
            default:
                return new z6q(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((z6q) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        float f = this.l;
        a7q a7qVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                kv6 kv6Var = a7qVar.a;
                kv6Var.k1().r(new p0l(f));
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (a7qVar.b.a(f)) {
                    a7qVar.a.t(f);
                }
                break;
        }
        return Unit.a;
    }
}
