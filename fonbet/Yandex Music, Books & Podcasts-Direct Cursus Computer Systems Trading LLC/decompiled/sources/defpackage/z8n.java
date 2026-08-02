package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class z8n extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ b9n l;
    public final /* synthetic */ String m;
    public final /* synthetic */ List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8n(b9n b9nVar, String str, List list, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = b9nVar;
        this.m = str;
        this.n = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new z8n(this.l, this.m, this.n, continuation, 0);
            default:
                return new z8n(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((z8n) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                rus a = this.l.a.a();
                this.k = 1;
                Object e = a.e(this, this.m, this.n);
                return e == nm6Var ? nm6Var : e;
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
                rus a2 = this.l.a.a();
                this.k = 1;
                Object e2 = a2.e(this, this.m, this.n);
                return e2 == nm6Var2 ? nm6Var2 : e2;
        }
    }
}
