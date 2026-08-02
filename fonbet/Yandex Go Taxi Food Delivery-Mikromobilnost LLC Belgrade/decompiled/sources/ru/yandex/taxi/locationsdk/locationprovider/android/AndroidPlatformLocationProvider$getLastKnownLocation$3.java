package ru.yandex.taxi.locationsdk.locationprovider.android;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.bb2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbb2;", "it", "Landroid/location/Location;", "<anonymous>", "(Lbb2;)Landroid/location/Location;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.locationprovider.android.AndroidPlatformLocationProvider$getLastKnownLocation$3", f = "AndroidPlatformLocationProvider.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidPlatformLocationProvider$getLastKnownLocation$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidPlatformLocationProvider$getLastKnownLocation$3 androidPlatformLocationProvider$getLastKnownLocation$3 = new AndroidPlatformLocationProvider$getLastKnownLocation$3(2, continuation);
        androidPlatformLocationProvider$getLastKnownLocation$3.L$0 = obj;
        return androidPlatformLocationProvider$getLastKnownLocation$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidPlatformLocationProvider$getLastKnownLocation$3) create((bb2) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bb2 bb2Var = (bb2) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.L$0 = null;
        this.label = 1;
        Object b = ((ru.yandex.taxi.locationsdk.locationprovider.android.gms.a) bb2Var).b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
