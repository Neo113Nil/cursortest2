package ru.yandex.taxi.polling;

import android.location.Location;
import com.yandex.go.g;
import defpackage.adz;
import defpackage.jqr;
import defpackage.kbn;
import defpackage.ldz;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.k;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$2", f = "LocationsFlowRepository.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationsFlowRepository$internalStartCollect$2 extends SuspendLambda implements wls {
    final /* synthetic */ kbn $config;
    final /* synthetic */ Long $maxCountCoordinates;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "it", "Lzy11;", "<anonymous>", "(Landroid/location/Location;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$2$1", f = "LocationsFlowRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ kbn $config;
        final /* synthetic */ CoordinateProvider$Source $source;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, CoordinateProvider$Source coordinateProvider$Source, kbn kbnVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$source = coordinateProvider$Source;
            this.$config = kbnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$source, this.$config, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((Location) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Location location = (Location) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e.c(this.this$0, this.$source, location, this.$config);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationsFlowRepository$internalStartCollect$2(e eVar, kbn kbnVar, Long l, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$config = kbnVar;
        this.$maxCountCoordinates = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationsFlowRepository$internalStartCollect$2(this.this$0, this.$config, this.$maxCountCoordinates, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationsFlowRepository$internalStartCollect$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.d dVar = new com.yandex.go.d(new mth(((g) ((adz) this.this$0.d.get())).i, 6));
            CoordinateProvider$Source coordinateProvider$Source = CoordinateProvider$Source.RIDETECH_LOCATION_SDK;
            e eVar = this.this$0;
            k a = e.a(eVar, new jqr(dVar, new AnonymousClass1(eVar, coordinateProvider$Source, this.$config, null), 3), coordinateProvider$Source);
            ldz ldzVar = new ldz(this.this$0, coordinateProvider$Source, this.$maxCountCoordinates, 0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (a.collect(ldzVar, this) == coroutineSingletons) {
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
