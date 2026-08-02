package kotlinx.coroutines.flow;

import defpackage.hnr0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class t0 implements hnr0 {
    public final hnr0 a;
    public final wls b;

    public t0(hnr0 hnr0Var, wls wlsVar) {
        this.a = hnr0Var;
        this.b = wlsVar;
    }

    @Override // defpackage.hnr0
    public final List b() {
        return this.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SubscribedSharedFlow$collect$1 subscribedSharedFlow$collect$1;
        int i;
        if (continuation instanceof SubscribedSharedFlow$collect$1) {
            subscribedSharedFlow$collect$1 = (SubscribedSharedFlow$collect$1) continuation;
            int i2 = subscribedSharedFlow$collect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                subscribedSharedFlow$collect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = subscribedSharedFlow$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = subscribedSharedFlow$collect$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s0 s0Var = new s0(vprVar, this.b);
                    subscribedSharedFlow$collect$1.L$0 = null;
                    subscribedSharedFlow$collect$1.label = 1;
                    if (this.a.collect(s0Var, subscribedSharedFlow$collect$1) == coroutineSingletons) {
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
        subscribedSharedFlow$collect$1 = new SubscribedSharedFlow$collect$1(this, continuation);
        Object obj2 = subscribedSharedFlow$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = subscribedSharedFlow$collect$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }
}
