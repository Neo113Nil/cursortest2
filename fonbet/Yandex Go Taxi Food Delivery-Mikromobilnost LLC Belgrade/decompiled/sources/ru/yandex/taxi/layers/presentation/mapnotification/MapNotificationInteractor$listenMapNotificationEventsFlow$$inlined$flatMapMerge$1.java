package ru.yandex.taxi.layers.presentation.mapnotification;

import com.yandex.go.layers.api.model.params.Mode;
import defpackage.biu;
import defpackage.fm00;
import defpackage.g92;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tcc;
import defpackage.wls;
import defpackage.z6s0;
import defpackage.zy11;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.g;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationInteractor$listenMapNotificationEventsFlow$$inlined$flatMapMerge$1", f = "MapNotificationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class MapNotificationInteractor$listenMapNotificationEventsFlow$$inlined$flatMapMerge$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapNotificationInteractor$listenMapNotificationEventsFlow$$inlined$flatMapMerge$1(Continuation continuation, c cVar) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapNotificationInteractor$listenMapNotificationEventsFlow$$inlined$flatMapMerge$1 mapNotificationInteractor$listenMapNotificationEventsFlow$$inlined$flatMapMerge$1 = new MapNotificationInteractor$listenMapNotificationEventsFlow$$inlined$flatMapMerge$1(continuation, this.this$0);
        mapNotificationInteractor$listenMapNotificationEventsFlow$$inlined$flatMapMerge$1.L$0 = obj;
        return mapNotificationInteractor$listenMapNotificationEventsFlow$$inlined$flatMapMerge$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapNotificationInteractor$listenMapNotificationEventsFlow$$inlined$flatMapMerge$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g92Var;
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Pair pair = (Pair) obj2;
        Pair pair2 = (Pair) pair.getFirst();
        MapNotificationsMuteRepository.NotificationVisibility notificationVisibility = (MapNotificationsMuteRepository.NotificationVisibility) pair.getSecond();
        e eVar = this.this$0.e;
        Mode mode = (Mode) pair2.c();
        List list = (List) pair2.f();
        synchronized (eVar) {
            try {
                if (mode != eVar.c) {
                    eVar.b.clear();
                    eVar.c = mode;
                }
                if (!list.isEmpty() && notificationVisibility != MapNotificationsMuteRepository.NotificationVisibility.MUTE) {
                    List list2 = list;
                    int d = gw00.d(tcc.n(list2, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (Object obj3 : list2) {
                        linkedHashMap.put(((fm00) obj3).b(), obj3);
                    }
                    if (eVar.a.isEmpty()) {
                        Map k = kotlin.collections.b.k(linkedHashMap, eVar.b);
                        eVar.a = k;
                        g92Var = new g92(2, new z6s0(k.values()));
                    } else {
                        Map k2 = kotlin.collections.b.k(kotlin.collections.b.k(linkedHashMap, kotlin.collections.a.U(eVar.a.keySet(), linkedHashMap.keySet())), eVar.b);
                        Map k3 = kotlin.collections.b.k(eVar.a, linkedHashMap.keySet());
                        LinkedList linkedList = new LinkedList();
                        if (!k2.isEmpty()) {
                            linkedList.add(new z6s0(k2.values()));
                        }
                        if (!k3.isEmpty()) {
                            linkedList.add(new biu(k3.values()));
                        }
                        eVar.a = linkedHashMap;
                        g92Var = new g(linkedList);
                    }
                }
                if (eVar.a.isEmpty()) {
                    g92Var = pvn.a;
                } else {
                    Collection values = eVar.a.values();
                    eVar.a = kotlin.collections.b.f();
                    g92Var = new g92(2, new biu(values));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g92Var;
    }
}
