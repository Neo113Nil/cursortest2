package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class c82 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ h82 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c82(h82 h82Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = h82Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                c82 c82Var = new c82(this.m, continuation, 0);
                c82Var.l = obj;
                return c82Var;
            case 1:
                c82 c82Var2 = new c82(this.m, continuation, 1);
                c82Var2.l = obj;
                return c82Var2;
            case 2:
                c82 c82Var3 = new c82(this.m, continuation, 2);
                c82Var3.l = obj;
                return c82Var3;
            default:
                c82 c82Var4 = new c82(this.m, continuation, 3);
                c82Var4.l = obj;
                return c82Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((c82) create(num, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Integer num = (Integer) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                i82 i82Var = this.m.b;
                this.l = null;
                this.k = 1;
                Serializable c = i82Var.c(num, this);
                return c == nm6Var ? nm6Var : c;
            case 1:
                Integer num2 = (Integer) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                    } else {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        obj = null;
                    }
                    return obj;
                }
                qgg.h0(obj);
                i82 i82Var2 = this.m.b;
                this.l = null;
                this.k = 1;
                String a = i82Var2.a();
                a.getClass();
                Serializable e = ((sca) i82Var2.a.i.getValue()).e(a, null, Boolean.TRUE, num2, this);
                return e == nm6Var2 ? nm6Var2 : e;
            case 2:
                Integer num3 = (Integer) this.l;
                nm6 nm6Var3 = nm6.a;
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
                i82 i82Var3 = this.m.b;
                this.l = null;
                this.k = 1;
                String a2 = i82Var3.a();
                a2.getClass();
                Serializable e2 = ((oga) i82Var3.a.h.getValue()).e(a2, Boolean.TRUE, num3, this);
                return e2 == nm6Var3 ? nm6Var3 : e2;
            default:
                Integer num4 = (Integer) this.l;
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                i82 i82Var4 = this.m.b;
                this.l = null;
                this.k = 1;
                Object f = i82Var4.f(num4, this);
                return f == nm6Var4 ? nm6Var4 : f;
        }
    }
}
