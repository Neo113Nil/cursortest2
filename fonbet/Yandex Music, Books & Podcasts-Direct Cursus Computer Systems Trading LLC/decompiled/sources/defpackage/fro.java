package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class fro extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ x3n m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fro(x3n x3nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = x3nVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                fro froVar = new fro(this.m, continuation, 0);
                froVar.l = obj;
                return froVar;
            default:
                fro froVar2 = new fro(this.m, continuation, 1);
                froVar2.l = obj;
                return froVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ltm ltmVar = (ltm) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((fro) create(ltmVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ltm ltmVar = (ltm) this.l;
                    x3n x3nVar = this.m;
                    String string = ((SharedPreferences) x3nVar.c).getString("com.yandex.payment.LAST_USED_BANK_SCHEME", null);
                    ((tdk) ((sdk) x3nVar.b)).b(new nnd(28, ltmVar, string));
                    xuj xujVar = xuj.v0;
                    this.k = 1;
                    if (y7g.q(ltmVar, xujVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ltm ltmVar2 = (ltm) this.l;
                    sdk sdkVar = (sdk) this.m.b;
                    vtm vtmVar = new vtm(ltmVar2);
                    rl2 rl2Var = (rl2) ((rzm) ((tdk) sdkVar).f.O).get();
                    rl2Var.getClass();
                    mif.b(rl2Var.b.K(kgj.sub), new pl2(vtmVar, 0), new pl2(vtmVar, 1), 1);
                    xuj xujVar2 = xuj.w0;
                    this.k = 1;
                    if (y7g.q(ltmVar2, xujVar2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
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
