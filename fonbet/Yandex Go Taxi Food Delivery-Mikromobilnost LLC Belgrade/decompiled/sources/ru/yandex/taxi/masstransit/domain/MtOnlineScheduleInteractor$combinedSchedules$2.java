package ru.yandex.taxi.masstransit.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.sy30;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.ty30;
import defpackage.v4r0;
import defpackage.vy30;
import defpackage.w211;
import defpackage.wls;
import defpackage.wy30;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "Lw211;", "Lwy30;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtOnlineScheduleInteractor$combinedSchedules$2", f = "MtOnlineScheduleInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtOnlineScheduleInteractor$combinedSchedules$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $stopId;
    final /* synthetic */ List<w211> $transportIds;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtOnlineScheduleInteractor$combinedSchedules$2(q qVar, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$stopId = str;
        this.$transportIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtOnlineScheduleInteractor$combinedSchedules$2 mtOnlineScheduleInteractor$combinedSchedules$2 = new MtOnlineScheduleInteractor$combinedSchedules$2(this.this$0, this.$stopId, this.$transportIds, continuation);
        mtOnlineScheduleInteractor$combinedSchedules$2.L$0 = obj;
        return mtOnlineScheduleInteractor$combinedSchedules$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtOnlineScheduleInteractor$combinedSchedules$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        long j;
        Map map;
        int d;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long d2 = this.this$0.c.d();
            qoh h2 = tje.h(tseVar, null, null, new MtOnlineScheduleInteractor$combinedSchedules$2$fullAsync$1(this.this$0, this.$stopId, d2, null), 3);
            h = tje.h(tseVar, null, null, new MtOnlineScheduleInteractor$combinedSchedules$2$onlineAsync$1(this.this$0, this.$stopId, this.$transportIds, d2, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.J$0 = d2;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                j = d2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = (Map) this.L$3;
            kotlin.b.b(obj);
            Map map2 = (Map) obj;
            LinkedHashSet h3 = v4r0.h(map.keySet(), map2.keySet());
            q qVar = this.this$0;
            d = gw00.d(tcc.n(h3, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Object obj2 : h3) {
                w211 w211Var = (w211) obj2;
                wy30 wy30Var = (wy30) map.get(w211Var);
                wy30 wy30Var2 = (wy30) map2.get(w211Var);
                qVar.getClass();
                if (wy30Var2 instanceof ty30) {
                    if (wy30Var instanceof vy30) {
                        vy30 vy30Var = (vy30) wy30Var;
                        ty30 ty30Var = (ty30) wy30Var2;
                        wy30Var = new sy30(vy30Var.a, vy30Var.c, vy30Var.b, ty30Var.c, ty30Var.d);
                    } else if (!((ty30) wy30Var2).c.isEmpty() || wy30Var == null) {
                        wy30Var = wy30Var2;
                    }
                }
                linkedHashMap.put(obj2, wy30Var);
            }
            return linkedHashMap;
        }
        j = this.J$0;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        Map map3 = (Map) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = map3;
        this.J$0 = j;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            map = map3;
            obj = k;
            Map map22 = (Map) obj;
            LinkedHashSet h32 = v4r0.h(map.keySet(), map22.keySet());
            q qVar2 = this.this$0;
            d = gw00.d(tcc.n(h32, 10));
            if (d < 16) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
            while (r1.hasNext()) {
            }
            return linkedHashMap2;
        }
        return coroutineSingletons;
    }
}
