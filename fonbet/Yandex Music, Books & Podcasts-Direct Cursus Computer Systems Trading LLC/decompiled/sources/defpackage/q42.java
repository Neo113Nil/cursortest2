package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class q42 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ w42 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q42(w42 w42Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = w42Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                q42 q42Var = new q42(this.m, continuation, 0);
                q42Var.l = obj;
                return q42Var;
            case 1:
                q42 q42Var2 = new q42(this.m, continuation, 1);
                q42Var2.l = obj;
                return q42Var2;
            case 2:
                q42 q42Var3 = new q42(this.m, continuation, 2);
                q42Var3.l = obj;
                return q42Var3;
            default:
                q42 q42Var4 = new q42(this.m, continuation, 3);
                q42Var4.l = obj;
                return q42Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((q42) create(num, continuation)).invokeSuspend(Unit.a);
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
                y42 y42Var = this.m.b;
                this.l = null;
                this.k = 1;
                Object c = y42Var.c(num, this);
                return c == nm6Var ? nm6Var : c;
            case 1:
                Integer num2 = (Integer) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                y42 y42Var2 = this.m.b;
                this.l = null;
                this.k = 1;
                Object f = y42Var2.f(num2, this);
                return f == nm6Var2 ? nm6Var2 : f;
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
                y42 y42Var3 = this.m.b;
                this.l = null;
                this.k = 1;
                Serializable g = y42Var3.g(num3, this);
                return g == nm6Var3 ? nm6Var3 : g;
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
                y42 y42Var4 = this.m.b;
                this.l = null;
                this.k = 1;
                Object i5 = y42Var4.i(num4, this);
                return i5 == nm6Var4 ? nm6Var4 : i5;
        }
    }
}
