package ru.rt.ebs.cryptosdk.presentation.esiaAuth;

import defpackage.cbo;
import defpackage.ebo;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wt41;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Optional;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.models.EsiaAuthenticationUrl;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow;

/* loaded from: classes4.dex */
public final class g extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ ebo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ebo eboVar, Continuation continuation) {
        super(2, continuation);
        this.b = eboVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            IFlow Z = this.b.Z();
            this.a = 1;
            obj = Z.getValue(EsiaAuthenticationUrl.class, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        Optional optional = (Optional) obj;
        if (optional.hasValue()) {
            this.b.F.clearSession();
            this.b.F.setEsiaRedirectUrl(((EsiaAuthenticationUrl) optional.extractValue()).getRedirectUrl());
            ebo eboVar = this.b;
            cbo a = cbo.a((cbo) eboVar.a0(), new wt41(((EsiaAuthenticationUrl) optional.extractValue()).getEsiaUrl()));
            r0 r0Var = (r0) eboVar.c0();
            r0Var.getClass();
            r0Var.m(null, a);
        }
        return zy11.a;
    }
}
