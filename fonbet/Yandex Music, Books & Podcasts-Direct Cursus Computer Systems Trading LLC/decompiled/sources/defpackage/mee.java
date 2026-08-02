package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class mee extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ nee l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mee(nee neeVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = neeVar;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new mee(this.l, this.m, continuation, 0);
            default:
                return new mee(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((mee) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    lge lgeVar = (lge) this.l.c.getValue();
                    this.k = 1;
                    if (lgeVar.e(this.m, true, this) == nm6Var) {
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
                Continuation continuation = null;
                nee neeVar = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    vdr c = neeVar.a.c();
                    xc xcVar = new xc(2, 23, continuation);
                    this.k = 1;
                    if (zsd.h0(c, xcVar, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                if (((lge) neeVar.c.getValue()).c(false)) {
                    rar rarVar = neeVar.f;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    neeVar.f = x97.y(neeVar.b, null, null, new mee(neeVar, this.m, continuation, 0), 3);
                }
                break;
        }
        return Unit.a;
    }
}
