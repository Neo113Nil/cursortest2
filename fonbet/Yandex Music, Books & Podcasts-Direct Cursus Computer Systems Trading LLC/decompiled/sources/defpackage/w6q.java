package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class w6q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ a7q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6q(a7q a7qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = a7qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new w6q(this.l, continuation, 0);
            default:
                return new w6q(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((w6q) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object a;
        int i = this.j;
        int i2 = 3;
        a7q a7qVar = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                kv6 kv6Var = a7qVar.a;
                this.k = 1;
                mal.a();
                zt3 zt3Var = new zt3(1, qxe.b(this));
                zt3Var.s();
                tqn tqnVar = new tqn();
                ypl yplVar = new ypl(tqnVar, kv6Var, zt3Var);
                kv6Var.j0(yplVar);
                if (kv6Var.c() != 3 || kv6Var.V().p() || tqnVar.a) {
                    zt3Var.u(new kw1(1, kv6Var, yplVar));
                } else {
                    tqnVar.a = true;
                    kv6Var.x0(yplVar);
                    if (zt3Var.w()) {
                        r7o r7oVar = z7o.b;
                        zt3Var.resumeWith(new Long(kv6Var.J0()));
                    }
                }
                Object q = zt3Var.q();
                return q == nm6Var ? nm6Var : q;
            default:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    jyr jyrVar = a7qVar.i;
                    this.k = 1;
                    v2q v2qVar = (v2q) ((jmf) jyrVar.getValue()).a.get();
                    u2q u2qVar = v2qVar instanceof u2q ? (u2q) v2qVar : null;
                    if (u2qVar == null) {
                        ssg.a(7, "SharedPlayerImpl", "Can't re-prepare track, last playable is not a track " + ((v2q) ((jmf) jyrVar.getValue()).a.get()), null);
                        a = Unit.a;
                    } else {
                        a = a7qVar.r.a(new ck0(a7qVar, u2qVar, continuation, i2), this);
                        if (a != nm6Var2) {
                            a = Unit.a;
                        }
                    }
                    if (a == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
