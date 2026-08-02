package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class nm7 extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public uqn k;
    public int l;
    public final /* synthetic */ float m;
    public final /* synthetic */ rwo n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm7(s1r s1rVar, float f, Function1 function1, rwo rwoVar, Continuation continuation) {
        super(2, continuation);
        this.o = s1rVar;
        this.m = f;
        this.p = function1;
        this.n = rwoVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new nm7(this.m, (om7) this.p, this.n, continuation);
            default:
                return new nm7((s1r) this.o, this.m, (Function1) this.p, this.n, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nm7) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r1 == r8) goto L22;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        vm0 vm0Var;
        uqn uqnVar;
        uqn uqnVar2;
        Object b;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    f = this.m;
                    if (Math.abs(f) > 1.0f) {
                        uqn uqnVar3 = new uqn();
                        uqnVar3.a = f;
                        uqn uqnVar4 = new uqn();
                        vm0 J = wdp.J(0.0f, f, 28);
                        try {
                            om7 om7Var = (om7) this.p;
                            uf7 uf7Var = om7Var.a;
                            lj0 lj0Var = new lj0(uqnVar4, this.n, uqnVar3, om7Var);
                            this.k = uqnVar3;
                            this.o = J;
                            this.l = 1;
                            if (v5g.q(J, uf7Var, false, lj0Var, this) == nm6Var) {
                                return nm6Var;
                            }
                            uqnVar = uqnVar3;
                        } catch (CancellationException unused) {
                            vm0Var = J;
                            uqnVar = uqnVar3;
                            uqnVar.a = ((Number) vm0Var.a()).floatValue();
                            f = uqnVar.a;
                            return new Float(f);
                        }
                    }
                    return new Float(f);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vm0Var = (vm0) this.o;
                uqnVar = this.k;
                try {
                    qgg.h0(obj);
                } catch (CancellationException unused2) {
                    uqnVar.a = ((Number) vm0Var.a()).floatValue();
                    f = uqnVar.a;
                    return new Float(f);
                }
                f = uqnVar.a;
                return new Float(f);
            default:
                Function1 function1 = (Function1) this.p;
                s1r s1rVar = (s1r) this.o;
                y1r y1rVar = s1rVar.a;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    uf7 uf7Var2 = s1rVar.b;
                    float f2 = this.m;
                    float r = y1rVar.r(f2, ghh.m(uf7Var2, 0.0f, f2));
                    if (Float.isNaN(r)) {
                        vme.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    uqnVar2 = new uqn();
                    float signum = Math.signum(f2) * Math.abs(r);
                    uqnVar2.a = signum;
                    function1.invoke(new Float(signum));
                    float f3 = uqnVar2.a;
                    p1r p1rVar = new p1r(uqnVar2, function1, 1);
                    this.k = uqnVar2;
                    this.l = 1;
                    b = s1r.b(s1rVar, this.n, f3, this.m, p1rVar, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uqn uqnVar5 = this.k;
                    qgg.h0(obj);
                    uqnVar2 = uqnVar5;
                    b = obj;
                }
                vm0 vm0Var2 = (vm0) b;
                float l = y1rVar.l(((Number) vm0Var2.a()).floatValue());
                if (Float.isNaN(l)) {
                    vme.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                uqnVar2.a = l;
                vm0 Z = wdp.Z(vm0Var2, 0.0f, 0.0f, 30);
                tm0 tm0Var = s1rVar.c;
                p1r p1rVar2 = new p1r(uqnVar2, function1, 0);
                this.k = null;
                this.l = 2;
                Object c = w1r.c(this.n, l, l, Z, tm0Var, p1rVar2, this);
                if (c != nm6Var2) {
                    return c;
                }
                return nm6Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm7(float f, om7 om7Var, rwo rwoVar, Continuation continuation) {
        super(2, continuation);
        this.m = f;
        this.p = om7Var;
        this.n = rwoVar;
    }
}
