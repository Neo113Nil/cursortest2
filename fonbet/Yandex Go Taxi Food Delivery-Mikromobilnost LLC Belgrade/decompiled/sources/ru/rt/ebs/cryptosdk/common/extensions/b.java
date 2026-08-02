package ru.rt.ebs.cryptosdk.common.extensions;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.ny61;
import defpackage.pey;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes2.dex */
public final class b extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ pey b;
    public final /* synthetic */ tls c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pey peyVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.b = peyVar;
        this.c = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.b, this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            pey peyVar = this.b;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            a aVar = new a(this.c, null);
            this.a = 1;
            if (b0.a(peyVar, state, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
