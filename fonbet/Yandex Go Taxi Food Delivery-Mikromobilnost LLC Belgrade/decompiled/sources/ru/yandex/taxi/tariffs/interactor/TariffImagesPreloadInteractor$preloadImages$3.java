package ru.yandex.taxi.tariffs.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.onq0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.tariffs.interactor.TariffImagesPreloadInteractor$preloadImages$3", f = "TariffImagesPreloadInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class TariffImagesPreloadInteractor$preloadImages$3 extends SuspendLambda implements wls {
    final /* synthetic */ long $delay;
    final /* synthetic */ Map<String, String> $imagesForLoad;
    final /* synthetic */ onq0 $semaphore;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.tariffs.interactor.TariffImagesPreloadInteractor$preloadImages$3$1", f = "TariffImagesPreloadInteractor.kt", l = {PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, 199, 200}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.tariffs.interactor.TariffImagesPreloadInteractor$preloadImages$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ long $delay;
        final /* synthetic */ String $errorMessage;
        final /* synthetic */ String $imageUrl;
        final /* synthetic */ onq0 $semaphore;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(onq0 onq0Var, f fVar, String str, String str2, long j, Continuation continuation) {
            super(2, continuation);
            this.$semaphore = onq0Var;
            this.this$0 = fVar;
            this.$imageUrl = str;
            this.$errorMessage = str2;
            this.$delay = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$semaphore, this.this$0, this.$imageUrl, this.$errorMessage, this.$delay, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:0|1|(1:(3:(1:(5:6|7|8|9|10)(2:16|17))(7:18|19|20|21|22|(3:25|9|10)|24)|14|15)(1:32))(3:38|(1:40)|24)|33|34|(2:36|24)(4:37|22|(0)|24)) */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        
            r12 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        
            r11 = r13;
            r13 = r12;
            r12 = r11;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            f fVar;
            String str;
            String str2;
            long j;
            long j2;
            Throwable th;
            Object obj3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                obj2 = this.$semaphore;
                fVar = this.this$0;
                String str3 = this.$imageUrl;
                String str4 = this.$errorMessage;
                long j3 = this.$delay;
                this.L$0 = obj2;
                this.L$1 = fVar;
                this.L$2 = str3;
                this.L$3 = str4;
                this.J$0 = j3;
                this.label = 1;
                if (((kotlinx.coroutines.sync.b) obj2).b(this) != coroutineSingletons) {
                    str = str3;
                    str2 = str4;
                    j = j3;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    j2 = this.J$0;
                    onq0 onq0Var = (onq0) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        obj2 = onq0Var;
                        this.L$0 = obj2;
                        this.label = 3;
                        if (kotlinx.coroutines.a.j(j2, this) != coroutineSingletons) {
                            obj3 = obj2;
                            ((kotlinx.coroutines.sync.b) obj3).f();
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        obj3 = onq0Var;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = (onq0) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        ((kotlinx.coroutines.sync.b) obj3).f();
                        return zy11.a;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                ((kotlinx.coroutines.sync.b) obj3).f();
                throw th;
            }
            j = this.J$0;
            str2 = (String) this.L$3;
            str = (String) this.L$2;
            fVar = (f) this.L$1;
            onq0 onq0Var2 = (onq0) this.L$0;
            kotlin.b.b(obj);
            obj2 = onq0Var2;
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.J$0 = j;
            this.label = 2;
            if (f.d(fVar, str, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            j2 = j;
            this.L$0 = obj2;
            this.label = 3;
            if (kotlinx.coroutines.a.j(j2, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffImagesPreloadInteractor$preloadImages$3(Map map, onq0 onq0Var, f fVar, long j, Continuation continuation) {
        super(2, continuation);
        this.$imagesForLoad = map;
        this.$semaphore = onq0Var;
        this.this$0 = fVar;
        this.$delay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TariffImagesPreloadInteractor$preloadImages$3 tariffImagesPreloadInteractor$preloadImages$3 = new TariffImagesPreloadInteractor$preloadImages$3(this.$imagesForLoad, this.$semaphore, this.this$0, this.$delay, continuation);
        tariffImagesPreloadInteractor$preloadImages$3.L$0 = obj;
        return tariffImagesPreloadInteractor$preloadImages$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TariffImagesPreloadInteractor$preloadImages$3 tariffImagesPreloadInteractor$preloadImages$3 = (TariffImagesPreloadInteractor$preloadImages$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tariffImagesPreloadInteractor$preloadImages$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        for (Map.Entry<String, String> entry : this.$imagesForLoad.entrySet()) {
            tje.N(tseVar, null, null, new AnonymousClass1(this.$semaphore, this.this$0, entry.getKey(), entry.getValue(), this.$delay, null), 3);
        }
        return zy11.a;
    }
}
