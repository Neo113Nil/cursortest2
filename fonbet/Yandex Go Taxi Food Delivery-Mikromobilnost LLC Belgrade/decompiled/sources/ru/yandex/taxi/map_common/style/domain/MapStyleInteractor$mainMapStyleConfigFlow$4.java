package ru.yandex.taxi.map_common.style.domain;

import defpackage.bms;
import defpackage.js00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.style.source.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "modeStyleName", "forcedStyleName", "", "Ljs00;", "styles", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljs00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.style.domain.MapStyleInteractor$mainMapStyleConfigFlow$4", f = "MapStyleInteractor.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapStyleInteractor$mainMapStyleConfigFlow$4 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapStyleInteractor$mainMapStyleConfigFlow$4(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        MapStyleInteractor$mainMapStyleConfigFlow$4 mapStyleInteractor$mainMapStyleConfigFlow$4 = new MapStyleInteractor$mainMapStyleConfigFlow$4(this.this$0, (Continuation) obj4);
        mapStyleInteractor$mainMapStyleConfigFlow$4.L$0 = (String) obj;
        mapStyleInteractor$mainMapStyleConfigFlow$4.L$1 = (String) obj2;
        mapStyleInteractor$mainMapStyleConfigFlow$4.L$2 = (Map) obj3;
        return mapStyleInteractor$mainMapStyleConfigFlow$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        Map map = (Map) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (map.containsKey(str2)) {
                return (js00) kotlin.collections.b.g(str2, map);
            }
            if (map.containsKey(str)) {
                return (js00) kotlin.collections.b.g(str, map);
            }
            if (map.get("default") != null) {
                return (js00) kotlin.collections.b.g("default", map);
            }
            a aVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = ((e) aVar.a).a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (js00) obj;
    }
}
