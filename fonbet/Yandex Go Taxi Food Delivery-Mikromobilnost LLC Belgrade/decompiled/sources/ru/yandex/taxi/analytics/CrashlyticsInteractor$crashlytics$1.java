package ru.yandex.taxi.analytics;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lkotlin/jvm/internal/EnhancedNullability;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.analytics.CrashlyticsInteractor$crashlytics$1", f = "CrashlyticsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class CrashlyticsInteractor$crashlytics$1 extends SuspendLambda implements tls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CrashlyticsInteractor$crashlytics$1(1, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CrashlyticsInteractor$crashlytics$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return FirebaseCrashlytics.getInstance();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
