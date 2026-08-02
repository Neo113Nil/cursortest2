package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class mbk extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ vx6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbk(vx6 vx6Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = vx6Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new mbk(this.l, continuation, 0);
            case 1:
                return new mbk(this.l, continuation, 1);
            case 2:
                return new mbk(this.l, continuation, 2);
            default:
                return new mbk(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((mbk) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object H = q5g.H(this, this.l, false);
                    if (H == nm6Var) {
                        break;
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object H2 = q5g.H(this, this.l, true);
                    if (H2 == nm6Var2) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
            case 2:
                vx6 vx6Var = this.l;
                f7l f7lVar = (f7l) vx6Var.b;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SuspendCommandsExecutor", "suspend", null);
                    e6l e6lVar = (e6l) f7lVar.c.getValue();
                    e6l e6lVar2 = (e6l) f7lVar.d.getValue();
                    boolean z = !p6g.C(e6lVar) || p6g.D(e6lVar);
                    boolean z2 = !p6g.C(e6lVar2) || p6g.D(e6lVar2);
                    if (z && z2) {
                        break;
                    } else {
                        uol uolVar = (uol) vx6Var.d;
                        this.k = 1;
                        if (uolVar.p(true, this) == nm6Var3) {
                        }
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                vx6 vx6Var2 = this.l;
                f7l f7lVar2 = (f7l) vx6Var2.b;
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "UnsuspendCommandsExecutor", "unsuspend", null);
                    e6l e6lVar3 = (e6l) f7lVar2.c.getValue();
                    e6l e6lVar4 = (e6l) f7lVar2.d.getValue();
                    boolean z3 = p6g.C(e6lVar3) || !p6g.D(e6lVar3);
                    boolean z4 = p6g.C(e6lVar4) || !p6g.D(e6lVar4);
                    if (z3 && z4) {
                        break;
                    } else {
                        uol uolVar2 = (uol) vx6Var2.d;
                        this.k = 1;
                        if (uolVar2.q(true, this) == nm6Var4) {
                        }
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
