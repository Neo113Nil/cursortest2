package yads;

import defpackage.i581;
import defpackage.ny61;
import defpackage.qr71;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class k62 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ qr71 c;
    public final /* synthetic */ i581 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k62(qr71 qr71Var, i581 i581Var, Continuation continuation) {
        super(2, continuation);
        this.c = qr71Var;
        this.d = i581Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k62(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new k62(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        qr71 qr71Var = this.c;
        List singletonList = Collections.singletonList(this.d);
        this.b = 1;
        Serializable a = qr71.a(qr71Var, singletonList, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
