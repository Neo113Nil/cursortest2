package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class fv6 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv6(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                fv6 fv6Var = new fv6(2, 0, continuation);
                fv6Var.k = ((Number) obj).floatValue();
                return fv6Var;
            case 1:
                fv6 fv6Var2 = new fv6(2, 1, continuation);
                fv6Var2.k = ((Number) obj).floatValue();
                return fv6Var2;
            default:
                fv6 fv6Var3 = new fv6(2, 2, continuation);
                fv6Var3.k = ((Number) obj).floatValue();
                return fv6Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.j;
        float floatValue = ((Number) obj).floatValue();
        Continuation continuation = (Continuation) obj2;
        switch (i) {
        }
        return ((fv6) create(Float.valueOf(floatValue), continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                float f = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(f == 1.0f);
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(this.k > 0.0f);
            default:
                float f2 = this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(!(f2 == 0.0f));
        }
    }
}
