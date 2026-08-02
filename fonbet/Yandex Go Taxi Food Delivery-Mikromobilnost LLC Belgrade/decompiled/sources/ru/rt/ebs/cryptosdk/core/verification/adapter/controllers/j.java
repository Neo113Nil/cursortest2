package ru.rt.ebs.cryptosdk.core.verification.adapter.controllers;

import defpackage.k70;
import defpackage.ny61;
import defpackage.wls;
import defpackage.z70;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.models.EsiaAuthenticationUrl;

/* loaded from: classes4.dex */
public final class j extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ k70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k70 k70Var, Continuation continuation) {
        super(2, continuation);
        this.b = k70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new j(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            String string = this.b.a.b.getString("adapter.ebs_redirect_url", "");
            String string2 = this.b.a.b.getString("adapter.esia_authentication_cookie", "");
            z70 z70Var = this.b.a;
            this.a = 1;
            obj = z70Var.b(string, string2, this);
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
        EsiaAuthenticationUrl esiaAuthenticationUrl = (EsiaAuthenticationUrl) obj;
        this.b.a.b.putString("adapter.ext_esia_authentication_url_esia_url", esiaAuthenticationUrl.getEsiaUrl()).putString("adapter.ext_esia_authentication_url_reirect_url", esiaAuthenticationUrl.getRedirectUrl()).save();
        return zy11.a;
    }
}
