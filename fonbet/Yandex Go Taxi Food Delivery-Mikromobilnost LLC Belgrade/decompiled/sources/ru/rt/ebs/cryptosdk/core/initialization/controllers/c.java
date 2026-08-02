package ru.rt.ebs.cryptosdk.core.initialization.controllers;

import defpackage.ny61;
import defpackage.uwv;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.rt.ebs.cryptosdk.core.registration.controllers.IRegistrationController;

/* loaded from: classes4.dex */
public final class c extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ uwv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uwv uwvVar, Continuation continuation) {
        super(2, continuation);
        this.b = uwvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                IRegistrationController iRegistrationController = this.b.d;
                this.a = 1;
                if (iRegistrationController.updateRegistration(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.b.j = true;
            return zy11.a;
        } catch (Exception e) {
            if (EbsException.INSTANCE.isDeinitializationException(e)) {
                this.b.flushRegistration();
            }
            throw e;
        }
    }
}
