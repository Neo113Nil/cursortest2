package ru.yandex.taxi.polling;

import android.location.Location;
import defpackage.jqr;
import defpackage.kbn;
import defpackage.ldz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.yow;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.k;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$5", f = "LocationsFlowRepository.kt", l = {HProv.PP_CACHE_SIZE, HProv.PP_NK_SYNC, 122}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationsFlowRepository$internalStartCollect$5 extends SuspendLambda implements wls {
    final /* synthetic */ kbn $config;
    final /* synthetic */ Long $maxCountCoordinates;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$5$1", f = "LocationsFlowRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$5$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(1, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
            return Boolean.TRUE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.TRUE;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "it", "Lzy11;", "<anonymous>", "(Landroid/location/Location;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$5$3", f = "LocationsFlowRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.polling.LocationsFlowRepository$internalStartCollect$5$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ kbn $config;
        final /* synthetic */ CoordinateProvider$Source $source;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(e eVar, CoordinateProvider$Source coordinateProvider$Source, kbn kbnVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$source = coordinateProvider$Source;
            this.$config = kbnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$source, this.$config, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((Location) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass3.invokeSuspend(zy11Var);
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
    public LocationsFlowRepository$internalStartCollect$5(e eVar, kbn kbnVar, Long l, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$config = kbnVar;
        this.$maxCountCoordinates = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationsFlowRepository$internalStartCollect$5(this.this$0, this.$config, this.$maxCountCoordinates, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationsFlowRepository$internalStartCollect$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r12 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoordinateProvider$Source coordinateProvider$Source;
        e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        int i2 = 3;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.preorder.source.userposition.repository.b bVar = (ru.yandex.taxi.preorder.source.userposition.repository.b) this.this$0.b.get();
            this.L$0 = null;
            this.label = 1;
            obj = bVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                eVar = (e) this.L$3;
                coordinateProvider$Source = (CoordinateProvider$Source) this.L$2;
                kotlin.b.b(obj);
                k a = e.a(eVar, new jqr((tpr) obj, new AnonymousClass3(this.this$0, coordinateProvider$Source, this.$config, null), 3), coordinateProvider$Source);
                ldz ldzVar = new ldz(this.this$0, coordinateProvider$Source, this.$maxCountCoordinates, i2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                return a.collect(ldzVar, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            kotlin.b.b(obj);
        }
        ru.yandex.taxi.preorder.source.userposition.repository.e eVar2 = (ru.yandex.taxi.preorder.source.userposition.repository.e) obj;
        if (eVar2 != null) {
            CoordinateProvider$Source coordinateProvider$Source2 = CoordinateProvider$Source.FUSED;
            e eVar3 = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, null);
            yow yowVar = new yow(24, this.$config);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = coordinateProvider$Source2;
            this.L$3 = eVar3;
            this.label = 2;
            obj = ru.yandex.taxi.preorder.source.userposition.repository.e.d(eVar2, anonymousClass1, yowVar, this, 4);
            if (obj != coroutineSingletons) {
                coordinateProvider$Source = coordinateProvider$Source2;
                eVar = eVar3;
                k a2 = e.a(eVar, new jqr((tpr) obj, new AnonymousClass3(this.this$0, coordinateProvider$Source, this.$config, null), 3), coordinateProvider$Source);
                ldz ldzVar2 = new ldz(this.this$0, coordinateProvider$Source, this.$maxCountCoordinates, i2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                if (a2.collect(ldzVar2, this) != coroutineSingletons) {
                }
            }
        }
    }
}
