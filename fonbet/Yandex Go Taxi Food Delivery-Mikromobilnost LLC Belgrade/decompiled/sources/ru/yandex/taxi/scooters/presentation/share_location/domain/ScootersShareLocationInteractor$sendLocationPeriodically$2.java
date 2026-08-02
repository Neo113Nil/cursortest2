package ru.yandex.taxi.scooters.presentation.share_location.domain;

import android.location.Location;
import defpackage.bms;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Landroid/location/Location;", "fromLbs", "fromGps", "fromNetwork"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.share_location.domain.ScootersShareLocationInteractor$sendLocationPeriodically$2", f = "ScootersShareLocationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersShareLocationInteractor$sendLocationPeriodically$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ScootersShareLocationInteractor$sendLocationPeriodically$2 scootersShareLocationInteractor$sendLocationPeriodically$2 = new ScootersShareLocationInteractor$sendLocationPeriodically$2(4, (Continuation) obj4);
        scootersShareLocationInteractor$sendLocationPeriodically$2.L$0 = (Location) obj;
        scootersShareLocationInteractor$sendLocationPeriodically$2.L$1 = (Location) obj2;
        scootersShareLocationInteractor$sendLocationPeriodically$2.L$2 = (Location) obj3;
        return scootersShareLocationInteractor$sendLocationPeriodically$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Location location = (Location) this.L$0;
        Location location2 = (Location) this.L$1;
        Location location3 = (Location) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return j73.A(new Location[]{location, location2, location3});
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
