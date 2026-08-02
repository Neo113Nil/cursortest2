package ru.yandex.taxi.preorder.source.userposition.misc;

import android.location.Location;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wwg;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroid/location/Location;", "bestWeHave", "current"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.misc.LocationRepositoryMisc$takeBestLocation$1", f = "LocationRepositoryMisc.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LocationRepositoryMisc$takeBestLocation$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LocationRepositoryMisc$takeBestLocation$1 locationRepositoryMisc$takeBestLocation$1 = new LocationRepositoryMisc$takeBestLocation$1(3, (Continuation) obj3);
        locationRepositoryMisc$takeBestLocation$1.L$0 = (Location) obj;
        locationRepositoryMisc$takeBestLocation$1.L$1 = (Location) obj2;
        return locationRepositoryMisc$takeBestLocation$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Location location = (Location) this.L$0;
        Location location2 = (Location) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return wwg.u(location2, location) ? location2 : location;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
