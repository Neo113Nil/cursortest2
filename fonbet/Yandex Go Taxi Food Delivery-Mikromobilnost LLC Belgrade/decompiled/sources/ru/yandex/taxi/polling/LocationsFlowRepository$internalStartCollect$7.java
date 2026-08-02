package ru.yandex.taxi.polling;

import android.location.Location;
import defpackage.f8y;
import defpackage.jqr;
import defpackage.kbn;
import defpackage.ldz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.k;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.location.g;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$7", f = "LocationsFlowRepository.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationsFlowRepository$internalStartCollect$7 extends SuspendLambda implements wls {
    final /* synthetic */ kbn $config;
    final /* synthetic */ Long $maxCountCoordinates;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "it", "Lzy11;", "<anonymous>", "(Landroid/location/Location;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$7$1", f = "LocationsFlowRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$7$1, reason: invalid class name */
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
    public LocationsFlowRepository$internalStartCollect$7(e eVar, kbn kbnVar, Long l, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$config = kbnVar;
        this.$maxCountCoordinates = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationsFlowRepository$internalStartCollect$7(this.this$0, this.$config, this.$maxCountCoordinates, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationsFlowRepository$internalStartCollect$7) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (r10.collect(r1, r9) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e eVar;
        CoordinateProvider$Source coordinateProvider$Source;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CoordinateProvider$Source coordinateProvider$Source2 = CoordinateProvider$Source.LBS;
            eVar = this.this$0;
            f8y f8yVar = (f8y) eVar.e.get();
            this.L$0 = coordinateProvider$Source2;
            this.L$1 = eVar;
            this.label = 1;
            g gVar = (g) f8yVar;
            gVar.getClass();
            Object b = g.b(gVar, "LocationsFlowRepository", this);
            if (b != coroutineSingletons) {
                coordinateProvider$Source = coordinateProvider$Source2;
                obj = b;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        eVar = (e) this.L$1;
        coordinateProvider$Source = (CoordinateProvider$Source) this.L$0;
        kotlin.b.b(obj);
        k a = e.a(eVar, new jqr((tpr) obj, new AnonymousClass1(this.this$0, coordinateProvider$Source, this.$config, null), 3), coordinateProvider$Source);
        ldz ldzVar = new ldz(this.this$0, coordinateProvider$Source, this.$maxCountCoordinates, 5);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
