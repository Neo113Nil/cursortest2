package ru.yandex.taxi.cashback.sdk;

import android.location.Location;
import com.yandex.plus.home.api.location.GeoPoint;
import defpackage.hkd0;
import defpackage.jzs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/location/Location;", "userLocation", "Lhkd0;", "pinAddress", "Ljzs;", "<anonymous>", "(Landroid/location/Location;Lhkd0;)Ljzs;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.sdk.PlusSdkDataRepository$geoLocationStateFlow$1", f = "PlusSdkDataRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlusSdkDataRepository$geoLocationStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusSdkDataRepository$geoLocationStateFlow$1(Continuation continuation, t tVar) {
        super(3, continuation);
        this.this$0 = tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusSdkDataRepository$geoLocationStateFlow$1 plusSdkDataRepository$geoLocationStateFlow$1 = new PlusSdkDataRepository$geoLocationStateFlow$1((Continuation) obj3, this.this$0);
        plusSdkDataRepository$geoLocationStateFlow$1.L$0 = (Location) obj;
        plusSdkDataRepository$geoLocationStateFlow$1.L$1 = (hkd0) obj2;
        return plusSdkDataRepository$geoLocationStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Location location = (Location) this.L$0;
        hkd0 hkd0Var = (hkd0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        GeoPoint.Companion.getClass();
        GeoPoint geoPoint = location != null ? new GeoPoint(location.getLatitude(), location.getLongitude(), (int) location.getAccuracy()) : null;
        t tVar = this.this$0;
        zzs zzsVar = hkd0Var.a;
        tVar.getClass();
        return new jzs(geoPoint, new GeoPoint(zzsVar.a, zzsVar.b, zzsVar.c), hkd0Var.b);
    }
}
