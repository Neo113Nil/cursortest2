package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class b4t extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ e4t l;
    public final /* synthetic */ mqs m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4t(e4t e4tVar, mqs mqsVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = e4tVar;
        this.m = mqsVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b4t(this.l, this.m, continuation, 0);
            default:
                return new b4t(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b4t) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
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
                pjc w = ((t3g) this.l.b.getValue()).w(this.m);
                z0i z0iVar = new z0i(2, 29, null);
                this.k = 1;
                Object h0 = zsd.h0(w, z0iVar, this);
                return h0 == nm6Var ? nm6Var : h0;
            default:
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
                pjc w2 = ((t3g) this.l.b.getValue()).w(this.m);
                d4t d4tVar = new d4t(2, 0, null);
                this.k = 1;
                Object h02 = zsd.h0(w2, d4tVar, this);
                return h02 == nm6Var2 ? nm6Var2 : h02;
        }
    }
}
