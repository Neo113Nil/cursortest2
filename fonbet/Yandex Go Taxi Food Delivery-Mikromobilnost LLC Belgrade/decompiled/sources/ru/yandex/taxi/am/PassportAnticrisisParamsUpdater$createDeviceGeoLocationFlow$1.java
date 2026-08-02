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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroid/location/Location;", "", "location", "minDistanceMeters"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.PassportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$1", f = "PassportAnticrisisParamsUpdater.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PassportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PassportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$1 passportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$1 = new PassportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$1(3, (Continuation) obj3);
        passportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$1.L$0 = (Location) obj;
        passportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$1.L$1 = (Integer) obj2;
        return passportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Location location = (Location) this.L$0;
        Integer num = (Integer) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(location, num);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
