package ru.yandex.tankerapp.geocoding.domain;

import android.location.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.geocoding.domain.GeocodingManager$placeMarkFromCoordinates$2$addresses$1", f = "GeocodingManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class GeocodingManager$placeMarkFromCoordinates$2$addresses$1 extends SuspendLambda implements wls {
    final /* synthetic */ double $lat;
    final /* synthetic */ double $lon;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeocodingManager$placeMarkFromCoordinates$2$addresses$1(a aVar, double d, double d2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$lat = d;
        this.$lon = d2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GeocodingManager$placeMarkFromCoordinates$2$addresses$1 geocodingManager$placeMarkFromCoordinates$2$addresses$1 = new GeocodingManager$placeMarkFromCoordinates$2$addresses$1(this.this$0, this.$lat, this.$lon, continuation);
        geocodingManager$placeMarkFromCoordinates$2$addresses$1.L$0 = obj;
        return geocodingManager$placeMarkFromCoordinates$2$addresses$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GeocodingManager$placeMarkFromCoordinates$2$addresses$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            failure = this.this$0.c().getFromLocation(this.$lat, this.$lon, 5);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        List<Address> list = (List) (failure instanceof Result.Failure ? null : failure);
        return list == null ? EmptyList.a : list;
    }
}
