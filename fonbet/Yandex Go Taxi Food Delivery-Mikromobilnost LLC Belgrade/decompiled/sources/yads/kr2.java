package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import defpackage.k171;
import defpackage.wls;
import defpackage.z271;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class kr2 extends SuspendLambda implements wls {
    public final /* synthetic */ k171 b;
    public final /* synthetic */ z271 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr2(k171 k171Var, z271 z271Var, Continuation continuation) {
        super(2, continuation);
        this.b = k171Var;
        this.c = z271Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new kr2(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        kr2 kr2Var = new kr2(this.b, this.c, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        kr2Var.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        new CallbackStackTraceMarker(new cp3(this.b, this.c.a));
        return zy11.a;
    }
}
