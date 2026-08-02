package ru.yandex.taxi.layers.presentation.mapnotification;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a$\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000j\u0002`\u0004\u0012\u0004\u0012\u00020\u00060\u00002\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/go/layers/api/model/params/Mode;", "", "Lfm00;", "Lru/yandex/taxi/layers/presentation/mapnotification/ModeAndNotifications;", "modeAndNotifications", "Lru/yandex/taxi/layers/presentation/mapnotification/MapNotificationsMuteRepository$NotificationVisibility;", "notificationVisibility", "<anonymous>", "(Lkotlin/Pair;Lru/yandex/taxi/layers/presentation/mapnotification/MapNotificationsMuteRepository$NotificationVisibility;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationInteractor$listenMapNotificationEventsFlow$1", f = "MapNotificationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapNotificationInteractor$listenMapNotificationEventsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MapNotificationInteractor$listenMapNotificationEventsFlow$1 mapNotificationInteractor$listenMapNotificationEventsFlow$1 = new MapNotificationInteractor$listenMapNotificationEventsFlow$1(3, (Continuation) obj3);
        mapNotificationInteractor$listenMapNotificationEventsFlow$1.L$0 = (Pair) obj;
        mapNotificationInteractor$listenMapNotificationEventsFlow$1.L$1 = (MapNotificationsMuteRepository.NotificationVisibility) obj2;
        return mapNotificationInteractor$listenMapNotificationEventsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        MapNotificationsMuteRepository.NotificationVisibility notificationVisibility = (MapNotificationsMuteRepository.NotificationVisibility) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(pair, notificationVisibility);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
