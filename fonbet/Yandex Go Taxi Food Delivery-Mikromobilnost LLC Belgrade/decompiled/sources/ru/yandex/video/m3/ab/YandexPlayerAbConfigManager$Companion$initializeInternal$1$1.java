package ru.yandex.video.m3.ab;

import android.content.Context;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tls;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ab.YandexPlayerAbConfigManager;
import ru.yandex.video.m3.ab.interactor.DefaultAbConfigInteractor;
import ru.yandex.video.m3.ab.interactor.DefaultAbConfigInteractorBuilder;
import ru.yandex.video.m3.ab.interactor.DefaultAbConfigInteractorBuilderKt;
import ru.yandex.video.m3.ab.util.VsidToAbConfigHolder;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/video/m3/ab/interactor/AbConfigInteractor;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$Companion$initializeInternal$1$1", f = "YandexPlayerAbConfigManager.kt", l = {355}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerAbConfigManager$Companion$initializeInternal$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ YandexPlayerAbConfigManager.InitializationParameters $initializationParameters;
    final /* synthetic */ sbx $json;
    final /* synthetic */ VsidToAbConfigHolder $vsidToConfigHolder;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexPlayerAbConfigManager$Companion$initializeInternal$1$1(Context context, YandexPlayerAbConfigManager.InitializationParameters initializationParameters, sbx sbxVar, VsidToAbConfigHolder vsidToAbConfigHolder, Continuation<? super YandexPlayerAbConfigManager$Companion$initializeInternal$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$initializationParameters = initializationParameters;
        this.$json = sbxVar;
        this.$vsidToConfigHolder = vsidToAbConfigHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        YandexPlayerAbConfigManager$Companion$initializeInternal$1$1 yandexPlayerAbConfigManager$Companion$initializeInternal$1$1 = new YandexPlayerAbConfigManager$Companion$initializeInternal$1$1(this.$context, this.$initializationParameters, this.$json, this.$vsidToConfigHolder, continuation);
        yandexPlayerAbConfigManager$Companion$initializeInternal$1$1.L$0 = obj;
        return yandexPlayerAbConfigManager$Companion$initializeInternal$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((YandexPlayerAbConfigManager$Companion$initializeInternal$1$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            final Context context = this.$context;
            final YandexPlayerAbConfigManager.InitializationParameters initializationParameters = this.$initializationParameters;
            final sbx sbxVar = this.$json;
            final VsidToAbConfigHolder vsidToAbConfigHolder = this.$vsidToConfigHolder;
            DefaultAbConfigInteractor DefaultAbConfigInteractor = DefaultAbConfigInteractorBuilderKt.DefaultAbConfigInteractor(new tls() { // from class: ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$Companion$initializeInternal$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(DefaultAbConfigInteractorBuilder defaultAbConfigInteractorBuilder) {
                    defaultAbConfigInteractorBuilder.setContext$video_player_internalRelease(context);
                    defaultAbConfigInteractorBuilder.setOkHttpClientProvider$video_player_internalRelease(initializationParameters.getOkHttpClientProvider());
                    defaultAbConfigInteractorBuilder.setJson$video_player_internalRelease(sbxVar);
                    defaultAbConfigInteractorBuilder.setVsidToConfigHolder$video_player_internalRelease(vsidToAbConfigHolder);
                    defaultAbConfigInteractorBuilder.setUpdateStrategy$video_player_internalRelease(initializationParameters.getUpdateAbConfigStrategy());
                    defaultAbConfigInteractorBuilder.setDeviceId$video_player_internalRelease(initializationParameters.getDeviceId());
                    defaultAbConfigInteractorBuilder.setAbConfigUpdatePollingMs$video_player_internalRelease(initializationParameters.getAbConfigUpdatePollingMs());
                    defaultAbConfigInteractorBuilder.setTestingParameters$video_player_internalRelease(initializationParameters.getTestingParameters());
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DefaultAbConfigInteractorBuilder) obj2);
                    return zy11.a;
                }
            });
            this.label = 1;
            if (vprVar.emit(DefaultAbConfigInteractor, this) == coroutineSingletons) {
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
