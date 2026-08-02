package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e3g extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ t3g l;
    public final /* synthetic */ x1u m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3g(t3g t3gVar, x1u x1uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = t3gVar;
        this.m = x1uVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new e3g(this.l, this.m, continuation, 0);
            case 1:
                return new e3g(this.l, this.m, continuation, 1);
            default:
                return new e3g(this.l, this.m, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((e3g) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    c5u c5uVar = this.l.c().e;
                    j1g j1gVar = j1g.c;
                    this.k = 1;
                    if (u4u.a(c5uVar, this.m, j1gVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    c5u c5uVar2 = this.l.c().e;
                    j1g j1gVar2 = j1g.a;
                    this.k = 1;
                    if (u4u.a(c5uVar2, this.m, j1gVar2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    c5u c5uVar3 = this.l.c().e;
                    j1g j1gVar3 = j1g.b;
                    this.k = 1;
                    if (u4u.a(c5uVar3, this.m, j1gVar3, this) == nm6Var3) {
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
