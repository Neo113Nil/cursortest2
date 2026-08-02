package ru.yandex.taxi.settings.profile.rating;

import defpackage.n150;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PassengerRatingInfoPresenter$attachView$$inlined$map$1$2$1 passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PassengerRatingInfoPresenter$attachView$$inlined$map$1$2$1) {
            passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1 = (PassengerRatingInfoPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = ((n150) obj).b;
                    if (str == null) {
                        str = "";
                    }
                    passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1 = new PassengerRatingInfoPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passengerRatingInfoPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
