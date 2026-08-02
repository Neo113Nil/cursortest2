package kotlinx.coroutines.flow;

import defpackage.k0v0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes4.dex */
public final class o0 implements tpr {
    public final /* synthetic */ k0v0 a;

    public o0(k0v0 k0v0Var) {
        this.a = k0v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        StartedLazily$command$$inlined$unsafeFlow$1$1 startedLazily$command$$inlined$unsafeFlow$1$1;
        int i;
        if (continuation instanceof StartedLazily$command$$inlined$unsafeFlow$1$1) {
            startedLazily$command$$inlined$unsafeFlow$1$1 = (StartedLazily$command$$inlined$unsafeFlow$1$1) continuation;
            int i2 = startedLazily$command$$inlined$unsafeFlow$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startedLazily$command$$inlined$unsafeFlow$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startedLazily$command$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startedLazily$command$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p0 p0Var = new p0(vprVar, new Ref$BooleanRef());
                    startedLazily$command$$inlined$unsafeFlow$1$1.L$0 = null;
                    startedLazily$command$$inlined$unsafeFlow$1$1.L$1 = null;
                    startedLazily$command$$inlined$unsafeFlow$1$1.L$2 = null;
                    startedLazily$command$$inlined$unsafeFlow$1$1.L$3 = null;
                    startedLazily$command$$inlined$unsafeFlow$1$1.I$0 = 0;
                    startedLazily$command$$inlined$unsafeFlow$1$1.label = 1;
                    if (n0.m(this.a, p0Var, startedLazily$command$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        startedLazily$command$$inlined$unsafeFlow$1$1 = new StartedLazily$command$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj2 = startedLazily$command$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startedLazily$command$$inlined$unsafeFlow$1$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }
}
