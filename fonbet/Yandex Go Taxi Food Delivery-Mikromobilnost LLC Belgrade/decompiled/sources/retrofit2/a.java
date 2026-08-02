package retrofit2;

import defpackage.dvw;
import defpackage.j1;
import defpackage.j18;
import defpackage.mc3;
import defpackage.na3;
import defpackage.ny61;
import defpackage.pmx;
import defpackage.qmx;
import defpackage.uyj;
import defpackage.vut;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public abstract class a {
    public static final Object a(Call call, Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        j18Var.w(new pmx(call, 0));
        call.k0(new qmx(j18Var));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public static final Object b(Call call, Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        j18Var.w(new j1(14, call));
        call.k0(new mc3(j18Var, 4));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public static final Object c(Call call, Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        j18Var.w(new pmx(call, 1));
        call.k0(new vut(j18Var));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons d(Throwable th, Continuation continuation) {
        KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        int i;
        if (continuation instanceof KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (KotlinExtensions$suspendAndThrow$1) continuation;
            int i2 = kotlinExtensions$suspendAndThrow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kotlinExtensions$suspendAndThrow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kotlinExtensions$suspendAndThrow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kotlinExtensions$suspendAndThrow$1.label;
                if (i != 0) {
                    b.b(obj);
                    kotlinExtensions$suspendAndThrow$1.L$0 = th;
                    kotlinExtensions$suspendAndThrow$1.label = 1;
                    uyj.a.o(kotlinExtensions$suspendAndThrow$1.get_context(), new na3(kotlinExtensions$suspendAndThrow$1, th, false, 3));
                    return coroutineSingletons;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                ny61.A();
                return null;
            }
        }
        kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(continuation);
        Object obj2 = kotlinExtensions$suspendAndThrow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kotlinExtensions$suspendAndThrow$1.label;
        if (i != 0) {
        }
    }
}
