package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class fnv extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ gnv l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fnv(gnv gnvVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = gnvVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new fnv(this.l, continuation, 0);
            default:
                return new fnv(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((fnv) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                pjc b = ((t35) this.l.h.getValue()).d.a.b(null);
                this.k = 1;
                Object g0 = zsd.g0(b, this);
                return g0 == nm6Var ? nm6Var : g0;
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
                pjc b2 = ((t35) this.l.h.getValue()).d.a.b(null);
                this.k = 1;
                Object g02 = zsd.g0(b2, this);
                return g02 == nm6Var2 ? nm6Var2 : g02;
        }
    }
}
