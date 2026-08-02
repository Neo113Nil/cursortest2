package ru.yandex.taxi.am;

import android.location.Location;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\n"}, d2 = {"<anonymous>", "Landroid/location/Location;", "lastEmittedLocation", "<destruct>", "Lkotlin/Pair;", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.PassportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$2", f = "PassportAnticrisisParamsUpdater.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PassportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PassportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$2 passportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$2 = new PassportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$2(3, (Continuation) obj3);
        passportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$2.L$0 = (Location) obj;
        passportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$2.L$1 = (Pair) obj2;
        return passportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Location location = (Location) this.L$0;
        Pair pair = (Pair) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Location location2 = (Location) pair.getFirst();
        Integer num = (Integer) pair.getSecond();
        if (num == null) {
            return null;
        }
        return (location == null || location.distanceTo(location2) >= ((float) num.intValue())) ? location2 : location;
    }
}
