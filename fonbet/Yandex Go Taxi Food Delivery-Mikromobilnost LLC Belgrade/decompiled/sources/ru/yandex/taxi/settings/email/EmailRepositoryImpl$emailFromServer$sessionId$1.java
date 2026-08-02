package ru.yandex.taxi.settings.email;

import defpackage.dvx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldvx;", "it", "", "<anonymous>", "(Ldvx;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.email.EmailRepositoryImpl$emailFromServer$sessionId$1", f = "EmailRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class EmailRepositoryImpl$emailFromServer$sessionId$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    public EmailRepositoryImpl$emailFromServer$sessionId$1() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EmailRepositoryImpl$emailFromServer$sessionId$1 emailRepositoryImpl$emailFromServer$sessionId$1 = new EmailRepositoryImpl$emailFromServer$sessionId$1(2, continuation);
        emailRepositoryImpl$emailFromServer$sessionId$1.L$0 = obj;
        return emailRepositoryImpl$emailFromServer$sessionId$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EmailRepositoryImpl$emailFromServer$sessionId$1) create((dvx) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dvx dvxVar = (dvx) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(dvxVar.a());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
