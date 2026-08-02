package ru.rt.ebs.cryptosdk.core.verification.consumer.controllers;

import defpackage.i9e;
import defpackage.jl40;
import defpackage.m9e;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.verification.consumer.entities.exceptions.ConsumerVerificationEbsException;

/* loaded from: classes4.dex */
public final class b extends SuspendLambda implements wls {
    public Token a;
    public int b;
    public final /* synthetic */ i9e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i9e i9eVar, Continuation continuation) {
        super(2, continuation);
        this.c = i9eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Token token;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            Token consumerApiToken = this.c.b.getVerificationRequestScheme().getConsumerApiToken();
            Token sid = this.c.b.getVerificationRequestScheme().getSid();
            Token resSecret = this.c.b.getResSecret();
            m9e m9eVar = this.c.a;
            this.a = resSecret;
            this.b = 1;
            obj = m9eVar.a(consumerApiToken, sid, resSecret, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            token = resSecret;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            token = this.a;
            kotlin.b.b(obj);
        }
        Token token2 = (Token) obj;
        if (jl40.l(token2, token)) {
            throw new ConsumerVerificationEbsException("Successful verification ID replacement error");
        }
        this.c.b.setCookieVrf(token2);
        return zy11.a;
    }
}
