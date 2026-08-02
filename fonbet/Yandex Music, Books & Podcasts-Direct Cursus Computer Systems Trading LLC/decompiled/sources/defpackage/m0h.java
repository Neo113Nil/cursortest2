package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class m0h extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ q0h l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0h(q0h q0hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = q0hVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new m0h(this.l, continuation, 0);
            case 1:
                return new m0h(this.l, continuation, 1);
            default:
                return new m0h(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((m0h) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                q0h q0hVar = this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    pjc b0 = zsd.b0(new njf(new bca(((frt) q0hVar.f.getValue()).j(), 18), q0hVar, 6));
                    otd otdVar = new otd(23, q0hVar);
                    this.k = 1;
                    if (b0.collect(otdVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    q0h q0hVar2 = this.l;
                    this.k = 1;
                    if (q0h.a(q0hVar2, false, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                try {
                    if (i3 == 0) {
                        qgg.h0(obj);
                        q0h q0hVar3 = this.l;
                        this.k = 1;
                        if (q0h.a(q0hVar3, true, this) == nm6Var3) {
                            return nm6Var3;
                        }
                    } else {
                        if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    this.l.i = false;
                    return Unit.a;
                } catch (Throwable th) {
                    this.l.i = false;
                    throw th;
                }
        }
    }
}
