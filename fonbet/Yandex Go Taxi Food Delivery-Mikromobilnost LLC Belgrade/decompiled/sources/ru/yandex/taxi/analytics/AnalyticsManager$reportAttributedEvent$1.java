package ru.yandex.taxi.analytics;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.AnalyticsManager$reportAttributedEvent$1", f = "AnalyticsManager.kt", l = {HProv.PP_ENUM_LOG, 142}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AnalyticsManager$reportAttributedEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, Object> $attrs;
    final /* synthetic */ String $event;
    final /* synthetic */ String $orderId;
    final /* synthetic */ Pair<String, String> $perfClassParams;
    final /* synthetic */ String $screenName;
    final /* synthetic */ Map<String, Object> $startupParams;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsManager$reportAttributedEvent$1(j jVar, String str, String str2, Map map, String str3, Map map2, Pair pair, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$event = str;
        this.$screenName = str2;
        this.$attrs = map;
        this.$orderId = str3;
        this.$startupParams = map2;
        this.$perfClassParams = pair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsManager$reportAttributedEvent$1(this.this$0, this.$event, this.$screenName, this.$attrs, this.$orderId, this.$startupParams, this.$perfClassParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsManager$reportAttributedEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (r1.c(r10, r9) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map<String, Object> map;
        Pair<String, String> pair;
        Map mapBuilder;
        String str;
        Map map2;
        Map map3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Map<String, Object> map4 = this.$attrs;
            j jVar = this.this$0;
            String str2 = this.$orderId;
            map = this.$startupParams;
            pair = this.$perfClassParams;
            mapBuilder = new MapBuilder();
            if (map4 != null) {
                mapBuilder.putAll(map4);
            }
            g gVar = (g) jVar.g.get();
            this.L$0 = map;
            this.L$1 = pair;
            this.L$2 = mapBuilder;
            this.L$3 = mapBuilder;
            this.L$4 = "CommonParams";
            this.L$5 = mapBuilder;
            this.label = 1;
            obj = gVar.b(str2, this);
            if (obj != coroutineSingletons) {
                str = "CommonParams";
                map2 = mapBuilder;
                map3 = map2;
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
        map2 = (Map) this.L$5;
        str = (String) this.L$4;
        map3 = (Map) this.L$3;
        mapBuilder = (Map) this.L$2;
        pair = (Pair) this.L$1;
        map = (Map) this.L$0;
        kotlin.b.b(obj);
        map2.put(str, obj);
        if (map != null) {
            map3.putAll(map);
        }
        if (pair != null) {
            map3.put(pair.c(), pair.f());
        }
        this.this$0.m.h(this.$event, ((MapBuilder) mapBuilder).j());
        String str3 = this.$screenName;
        if (str3 != null) {
            CrashlyticsInteractor crashlyticsInteractor = this.this$0.f;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
