package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class u9p extends aur implements Function2 {
    public final /* synthetic */ int j;
    public float k;
    public int l;
    public final /* synthetic */ uol m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9p(uol uolVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = uolVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new u9p(this.m, continuation, 0);
            default:
                return new u9p(this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((u9p) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.l;
                uol uolVar = this.m;
                if (i == 0) {
                    qgg.h0(obj);
                    this.l = 1;
                    obj = uolVar.f(this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f = this.k;
                        qgg.h0(obj);
                        return new Float(yhn.c((f / ((Number) obj).longValue()) - 0.005f, 0.0f, 1.0f));
                    }
                    qgg.h0(obj);
                }
                float longValue = ((Number) obj).longValue();
                this.k = longValue;
                this.l = 2;
                Object a = uolVar.a(this);
                if (a == nm6Var) {
                    return nm6Var;
                }
                f = longValue;
                obj = a;
                return new Float(yhn.c((f / ((Number) obj).longValue()) - 0.005f, 0.0f, 1.0f));
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.l;
                uol uolVar2 = this.m;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.l = 1;
                    obj = uolVar2.f(this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f2 = this.k;
                        qgg.h0(obj);
                        return new Float(yhn.c((f2 / ((Number) obj).longValue()) + 0.005f, 0.0f, 1.0f));
                    }
                    qgg.h0(obj);
                }
                float longValue2 = ((Number) obj).longValue();
                this.k = longValue2;
                this.l = 2;
                Object a2 = uolVar2.a(this);
                if (a2 == nm6Var2) {
                    return nm6Var2;
                }
                f2 = longValue2;
                obj = a2;
                return new Float(yhn.c((f2 / ((Number) obj).longValue()) + 0.005f, 0.0f, 1.0f));
        }
    }
}
