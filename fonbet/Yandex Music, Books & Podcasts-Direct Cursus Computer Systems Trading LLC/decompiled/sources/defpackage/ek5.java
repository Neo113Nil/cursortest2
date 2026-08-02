package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class ek5 extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ long l;
    public final /* synthetic */ jk5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek5(long j, jk5 jk5Var, Continuation continuation) {
        super(2, continuation);
        this.l = j;
        this.m = jk5Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ek5(this.m, this.l, continuation);
            default:
                return new ek5(this.l, this.m, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ek5) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                jk5 jk5Var = this.m;
                rhp rhpVar = jk5Var.k;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rar y = x97.y(jk5Var.h, null, null, new ek5(this.l, jk5Var, (Continuation) null), 3);
                    s9f[] s9fVarArr = jk5.n;
                    rhpVar.d(s9fVarArr[0], y);
                    r2f b = rhpVar.b(s9fVarArr[0]);
                    if (b != null) {
                        this.k = 1;
                        if (b.j0(this) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new wyo(jk5Var.l.b.invoke());
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                jk5 jk5Var2 = this.m;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ox1 ox1Var = new ox1(jk5Var2, null, 7);
                    this.k = 1;
                    obj = tyf.L(this.l, ox1Var, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Call call = (Call) obj;
                if (call != null) {
                    this.k = 2;
                    if (jk5.a(jk5Var2, call, this) == nm6Var2) {
                        return nm6Var2;
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek5(jk5 jk5Var, long j, Continuation continuation) {
        super(2, continuation);
        this.m = jk5Var;
        this.l = j;
    }
}
