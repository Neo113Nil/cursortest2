package ru.yandex.taxi.settings.profile.rating;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;

    public f(r0 r0Var) {
        this.a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PassengerRatingInfoPresenter$attachView$$inlined$map$1$1 passengerRatingInfoPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof PassengerRatingInfoPresenter$attachView$$inlined$map$1$1) {
            passengerRatingInfoPresenter$attachView$$inlined$map$1$1 = (PassengerRatingInfoPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = passengerRatingInfoPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passengerRatingInfoPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passengerRatingInfoPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passengerRatingInfoPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    passengerRatingInfoPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    passengerRatingInfoPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    passengerRatingInfoPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    passengerRatingInfoPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, passengerRatingInfoPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        passengerRatingInfoPresenter$attachView$$inlined$map$1$1 = new PassengerRatingInfoPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = passengerRatingInfoPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passengerRatingInfoPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
