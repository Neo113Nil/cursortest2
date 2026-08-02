package ru.rt.ebs.cryptosdk.presentation.base;

import defpackage.ny61;
import defpackage.sls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class m extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ sls c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new m(this.b, this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.b;
            this.a = 1;
            if (a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.c.invoke();
        return zy11.a;
    }
}
