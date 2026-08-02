package ru.yandex.video.m3.ab;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.t;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.ab.interactor.AbConfigInteractor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$initDeferredInteractorInitialization$1", f = "YandexPlayerAbConfigManager.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerAbConfigManager$initDeferredInteractorInitialization$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $interactorSupplier;
    int label;
    final /* synthetic */ YandexPlayerAbConfigManager this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/video/m3/ab/interactor/AbConfigInteractor;", "interactor", "Lzy11;", "<anonymous>", "(Lru/yandex/video/m3/ab/interactor/AbConfigInteractor;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$initDeferredInteractorInitialization$1$1", f = "YandexPlayerAbConfigManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$initDeferredInteractorInitialization$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ YandexPlayerAbConfigManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(YandexPlayerAbConfigManager yandexPlayerAbConfigManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = yandexPlayerAbConfigManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(AbConfigInteractor abConfigInteractor, Continuation<? super zy11> continuation) {
            return ((AnonymousClass1) create(abConfigInteractor, continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            this.this$0.interactor = (AbConfigInteractor) this.L$0;
            this.this$0.handlePlayerLifecycleUpdate();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexPlayerAbConfigManager$initDeferredInteractorInitialization$1(tpr tprVar, YandexPlayerAbConfigManager yandexPlayerAbConfigManager, Continuation<? super YandexPlayerAbConfigManager$initDeferredInteractorInitialization$1> continuation) {
        super(2, continuation);
        this.$interactorSupplier = tprVar;
        this.this$0 = yandexPlayerAbConfigManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new YandexPlayerAbConfigManager$initDeferredInteractorInitialization$1(this.$interactorSupplier, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((YandexPlayerAbConfigManager$initDeferredInteractorInitialization$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            t T = e.T(this.$interactorSupplier, 1);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (e.k(T, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
