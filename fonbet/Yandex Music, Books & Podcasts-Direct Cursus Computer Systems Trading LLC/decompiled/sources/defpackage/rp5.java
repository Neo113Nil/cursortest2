package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rp5 extends aur implements Function2 {
    public boolean j;
    public int k;
    public /* synthetic */ float l;
    public final /* synthetic */ sp5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp5(sp5 sp5Var, Continuation continuation) {
        super(2, continuation);
        this.m = sp5Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        rp5 rp5Var = new rp5(this.m, continuation);
        rp5Var.l = ((Number) obj).floatValue();
        return rp5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rp5) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            float f = this.l;
            sp5 sp5Var = this.m;
            Object g = sp5Var.a.d.a.g(hfp.e);
            if (g == null) {
                g = null;
            }
            Function2 function2 = (Function2) g;
            if (function2 == null) {
                throw ouj.f("Required value was null.");
            }
            boolean z2 = ((cwo) sp5Var.a.d.g(ufp.t)).c;
            if (z2) {
                f = -f;
            }
            enj enjVar = new enj((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.j = z2;
            this.k = 1;
            obj = function2.invoke(enjVar, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
            z = z2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.j;
            qgg.h0(obj);
        }
        long j = ((enj) obj).a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
