package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class w1r {
    public static final float a = 400;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(rwo rwoVar, float f, vm0 vm0Var, uf7 uf7Var, Function1 function1, cg6 cg6Var) {
        t1r t1rVar;
        int i;
        float f2;
        uqn uqnVar;
        if (cg6Var instanceof t1r) {
            t1rVar = (t1r) cg6Var;
            int i2 = t1rVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t1rVar.n = i2 - Integer.MIN_VALUE;
                Object obj = t1rVar.m;
                nm6 nm6Var = nm6.a;
                i = t1rVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    uqn uqnVar2 = new uqn();
                    boolean z = ((Number) vm0Var.a()).floatValue() == 0.0f;
                    u1r u1rVar = new u1r(f, uqnVar2, rwoVar, function1, 0);
                    t1rVar.k = vm0Var;
                    t1rVar.l = uqnVar2;
                    t1rVar.j = f;
                    t1rVar.n = 1;
                    if (v5g.q(vm0Var, uf7Var, !z, u1rVar, t1rVar) == nm6Var) {
                        return nm6Var;
                    }
                    f2 = f;
                    uqnVar = uqnVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = t1rVar.j;
                    uqnVar = t1rVar.l;
                    vm0Var = t1rVar.k;
                    qgg.h0(obj);
                }
                return new qm0(new Float(f2 - uqnVar.a), vm0Var);
            }
        }
        t1rVar = new t1r(cg6Var);
        Object obj2 = t1rVar.m;
        nm6 nm6Var2 = nm6.a;
        i = t1rVar.n;
        if (i != 0) {
        }
        return new qm0(new Float(f2 - uqnVar.a), vm0Var);
    }

    public static final void b(sm0 sm0Var, rwo rwoVar, Function1 function1, float f) {
        float f2;
        try {
            f2 = rwoVar.a(f);
        } catch (CancellationException unused) {
            sm0Var.a();
            f2 = 0.0f;
        }
        function1.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            sm0Var.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(rwo rwoVar, float f, float f2, vm0 vm0Var, tm0 tm0Var, Function1 function1, cg6 cg6Var) {
        v1r v1rVar;
        int i;
        float floatValue;
        vm0 vm0Var2;
        uqn uqnVar;
        float f3 = f;
        if (cg6Var instanceof v1r) {
            v1rVar = (v1r) cg6Var;
            int i2 = v1rVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v1rVar.o = i2 - Integer.MIN_VALUE;
                v1r v1rVar2 = v1rVar;
                Object obj = v1rVar2.n;
                nm6 nm6Var = nm6.a;
                i = v1rVar2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    uqn uqnVar2 = new uqn();
                    floatValue = ((Number) vm0Var.a()).floatValue();
                    Float f4 = new Float(f3);
                    boolean z = ((Number) vm0Var.a()).floatValue() == 0.0f;
                    u1r u1rVar = new u1r(f2, uqnVar2, rwoVar, function1, 1);
                    v1rVar2.l = vm0Var;
                    v1rVar2.m = uqnVar2;
                    v1rVar2.j = f3;
                    v1rVar2.k = floatValue;
                    v1rVar2.o = 1;
                    if (v5g.r(vm0Var, f4, tm0Var, !z, u1rVar, v1rVar2) == nm6Var) {
                        return nm6Var;
                    }
                    vm0Var2 = vm0Var;
                    uqnVar = uqnVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f5 = v1rVar2.k;
                    float f6 = v1rVar2.j;
                    uqnVar = v1rVar2.m;
                    vm0Var2 = v1rVar2.l;
                    qgg.h0(obj);
                    floatValue = f5;
                    f3 = f6;
                }
                return new qm0(new Float(f3 - uqnVar.a), wdp.Z(vm0Var2, 0.0f, d(((Number) vm0Var2.a()).floatValue(), floatValue), 29));
            }
        }
        v1rVar = new v1r(cg6Var);
        v1r v1rVar22 = v1rVar;
        Object obj2 = v1rVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = v1rVar22.o;
        if (i != 0) {
        }
        return new qm0(new Float(f3 - uqnVar.a), wdp.Z(vm0Var2, 0.0f, d(((Number) vm0Var2.a()).floatValue(), floatValue), 29));
    }

    public static final float d(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }
}
