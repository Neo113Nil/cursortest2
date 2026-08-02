package ru.yandex.taxi.am.early_authorization;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "shouldAuthorize"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.early_authorization.EarlyAuthorizationInteractor$awaitEarlyLoginReady$5", f = "EarlyAuthorizationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EarlyAuthorizationInteractor$awaitEarlyLoginReady$5 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EarlyAuthorizationInteractor$awaitEarlyLoginReady$5 earlyAuthorizationInteractor$awaitEarlyLoginReady$5 = new EarlyAuthorizationInteractor$awaitEarlyLoginReady$5(2, continuation);
        earlyAuthorizationInteractor$awaitEarlyLoginReady$5.Z$0 = ((Boolean) obj).booleanValue();
        return earlyAuthorizationInteractor$awaitEarlyLoginReady$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((EarlyAuthorizationInteractor$awaitEarlyLoginReady$5) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(z);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
