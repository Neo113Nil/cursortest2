package ru.yandex.taxi.locationsdk.locationprovider.android;

import android.location.Location;
import android.location.LocationManager;
import defpackage.ca2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s9z;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls9z;", "it", "Landroid/location/Location;", "<anonymous>", "(Ls9z;)Landroid/location/Location;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.locationprovider.android.AndroidPlatformLocationProvider$getLastKnownLocation$2", f = "AndroidPlatformLocationProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidPlatformLocationProvider$getLastKnownLocation$2 extends SuspendLambda implements wls {
    final /* synthetic */ ca2 $request;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformLocationProvider$getLastKnownLocation$2(ca2 ca2Var, Continuation continuation) {
        super(2, continuation);
        this.$request = ca2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidPlatformLocationProvider$getLastKnownLocation$2 androidPlatformLocationProvider$getLastKnownLocation$2 = new AndroidPlatformLocationProvider$getLastKnownLocation$2(this.$request, continuation);
        androidPlatformLocationProvider$getLastKnownLocation$2.L$0 = obj;
        return androidPlatformLocationProvider$getLastKnownLocation$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidPlatformLocationProvider$getLastKnownLocation$2) create((s9z) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        s9z s9zVar = (s9z) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        AndroidLocationProviderType androidLocationProviderType = this.$request.a;
        s9zVar.getClass();
        try {
            LocationManager a = s9zVar.a();
            failure = a != null ? a.getLastKnownLocation(vng.c(androidLocationProviderType)) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            s9zVar.b.b("LocationManagerAdapter", a2, new Pair[0]);
        }
        return (Location) (failure instanceof Result.Failure ? null : failure);
    }
}
