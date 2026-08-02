package ru.yandex.taxi.preorder.source.userposition;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lyne;", "<anonymous>", "(Ltse;)Lyne;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$platformLbs$1", f = "CoordinateProvidersFactory.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$platformLbs$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/location/Location;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "ru.yandex.taxi.preorder.source.userposition.CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$platformLbs$1$1", f = "CoordinateProvidersFactory.kt", l = {71}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.source.userposition.CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$platformLbs$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a aVar = this.this$0;
            this.label = 1;
            Object a = a.a(aVar, "network", this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$platformLbs$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$platformLbs$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$platformLbs$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        CoordinateProvider$Source coordinateProvider$Source = CoordinateProvider$Source.PLATFORM_LBS;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, null);
        this.label = 1;
        Object j = aVar.j(coordinateProvider$Source, anonymousClass1, this);
        return j == coroutineSingletons ? coroutineSingletons : j;
    }
}
