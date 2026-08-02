package ru.yandex.taxi.plus.repository;

import defpackage.jst;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ro11;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zls;
import defpackage.zpp0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.repository.SdkResponseInteractor$startTypedScreensProcessing$1", f = "SdkResponseInteractor.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class SdkResponseInteractor$startTypedScreensProcessing$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.plus.repository.SdkResponseInteractor$startTypedScreensProcessing$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements zls {
        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ((ru.yandex.taxi.plus.repository.mappers.d) this.receiver).b((ro11) obj, (Map) obj2, (Continuation) obj3);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "", "Ljmd0;", "", Constants.KEY_EXCEPTION, "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.plus.repository.SdkResponseInteractor$startTypedScreensProcessing$1$2", f = "SdkResponseInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.plus.repository.SdkResponseInteractor$startTypedScreensProcessing$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, (Continuation) obj3);
            anonymousClass2.L$0 = (vpr) obj;
            anonymousClass2.L$1 = (Throwable) obj2;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            vpr vprVar = (vpr) this.L$0;
            Throwable th = (Throwable) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                jst.e.x(th, "PlusSdk. some error occurred while processing typed screens");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (vprVar.emit(EmptyList.a, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkResponseInteractor$startTypedScreensProcessing$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkResponseInteractor$startTypedScreensProcessing$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkResponseInteractor$startTypedScreensProcessing$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            o oVar = new o(new m0(new mth(eVar.a.b, 4), eVar.b.b(), new AnonymousClass1(3, this.this$0.d, ru.yandex.taxi.plus.repository.mappers.d.class, "mapPlusSubsPromoScreens", "mapPlusSubsPromoScreens(Lru/yandex/taxi/plus/api/dto/TypedScreens;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), new AnonymousClass2(3, null));
            zpp0 zpp0Var = new zpp0(this.this$0, i2);
            this.label = 1;
            if (oVar.collect(zpp0Var, this) == coroutineSingletons) {
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
