package ru.rt.ebs.cryptosdk.core.network.entities.models.https.client;

import defpackage.qwu;
import defpackage.tse;
import defpackage.wls;
import defpackage.xwu;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class a extends SuspendLambda implements wls {
    public final /* synthetic */ qwu a;
    public final /* synthetic */ xwu b;
    public final /* synthetic */ Class c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qwu qwuVar, xwu xwuVar, Class cls, Continuation continuation) {
        super(2, continuation);
        this.a = qwuVar;
        this.b = xwuVar;
        this.c = cls;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.a, this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.b.b(obj);
        return this.a.e(this.b, this.c);
    }
}
