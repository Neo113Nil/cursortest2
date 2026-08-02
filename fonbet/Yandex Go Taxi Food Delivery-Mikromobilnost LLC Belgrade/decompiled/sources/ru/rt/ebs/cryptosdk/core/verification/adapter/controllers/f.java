package ru.rt.ebs.cryptosdk.core.verification.adapter.controllers;

import defpackage.k70;
import defpackage.ny61;
import defpackage.wls;
import defpackage.z70;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.EbsToken;

/* loaded from: classes4.dex */
public final class f extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ k70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k70 k70Var, Continuation continuation) {
        super(2, continuation);
        this.b = k70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            Token sid = this.b.b.getVerificationRequestScheme().getSid();
            IKeyStorage iKeyStorage = this.b.a.b;
            EbsToken ebsToken = new EbsToken(iKeyStorage.getString("adapter.ebs_token_token", ""), iKeyStorage.getString("adapter.ebs_token_expired_at", ""));
            k70 k70Var = this.b;
            z70 z70Var = k70Var.a;
            String cookieAdapterValue = k70Var.b.getCookieAdapterValue();
            this.a = 1;
            obj = z70Var.d(sid, ebsToken, cookieAdapterValue, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.b.b.setResSecret((Token) obj);
        return zy11.a;
    }
}
