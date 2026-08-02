package ru.yandex.taxi.masstransit.threadvariants;

import defpackage.avj0;
import defpackage.dzy0;
import defpackage.evu0;
import defpackage.ey20;
import defpackage.ff30;
import defpackage.hj40;
import defpackage.jgy;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.lyy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oob1;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sy30;
import defpackage.tcc;
import defpackage.tis0;
import defpackage.ty30;
import defpackage.tyy0;
import defpackage.up2;
import defpackage.uy30;
import defpackage.vy30;
import defpackage.w1u;
import defpackage.w211;
import defpackage.w511;
import defpackage.wls;
import defpackage.wy30;
import defpackage.zy11;
import defpackage.zyy0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072(\u0010\u0006\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000j\u0002`\u00040\u0000j\u0002`\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "Lw211;", "Lwy30;", "Lru/yandex/taxi/masstransit/model/MtTransportSchedules;", "Lru/yandex/taxi/masstransit/model/MtOnlineSchedule;", "it", "Ley20;", "<anonymous>", "(Ljava/util/Map;)Ley20;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.threadvariants.MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2", f = "MtThreadVariantsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ zyy0 $state;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2(b bVar, zyy0 zyy0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$state = zyy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2 mtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2 = new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2(this.this$0, this.$state, continuation);
        mtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2.L$0 = obj;
        return mtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2) create((Map) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        tyy0 tyy0Var;
        String str;
        Map map = (Map) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        dzy0 dzy0Var = this.this$0.b;
        zyy0 zyy0Var = this.$state;
        dzy0Var.getClass();
        hj40 hj40Var = zyy0Var.a;
        String str2 = hj40Var != null ? hj40Var.c : null;
        if (str2 == null) {
            str2 = "";
        }
        List<w1u> x0 = kotlin.collections.a.x0(zyy0Var.b, new ff30(1, str2, map));
        ArrayList arrayList = new ArrayList(tcc.n(x0, 10));
        for (w1u w1uVar : x0) {
            String str3 = w1uVar.e;
            w211 w211Var = w1uVar.f;
            if (str3 == null) {
                str3 = hj40Var != null ? hj40Var.c : null;
                if (str3 == null) {
                    str3 = "";
                }
            }
            Map map2 = (Map) map.get(str3);
            wy30 wy30Var = map2 != null ? (wy30) map2.get(w211Var) : null;
            tis0 t = wy30Var != null ? dzy0Var.c.t(wy30Var, 0, null) : null;
            if (wy30Var instanceof ty30) {
                list = ((ty30) wy30Var).c;
            } else if (wy30Var instanceof vy30) {
                list = ((vy30) wy30Var).c;
            } else if (wy30Var instanceof sy30) {
                list = ((sy30) wy30Var).c();
            } else if (wy30Var instanceof uy30) {
                list = EmptyList.a;
            } else {
                if (wy30Var != null) {
                    w511.b();
                    return null;
                }
                list = null;
            }
            if (t == null || list == null || evu0.J((String) t.c)) {
                tyy0Var = null;
            } else {
                String d = wy30Var != null ? jgy.d(wy30Var) : null;
                if (d == null) {
                    d = "";
                }
                tyy0Var = new tyy0(hj40Var, w1uVar, d);
            }
            MtTransportType mtTransportType = w1uVar.d.b;
            String str4 = w1uVar.a;
            String str5 = w1uVar.c;
            String str6 = t != null ? (String) t.c : "";
            String str7 = (t == null || (str = (String) t.w) == null) ? "" : str;
            boolean z = wy30Var != null && ((wy30Var instanceof ty30) || (wy30Var instanceof sy30));
            kdc kdcVar = w1uVar.h;
            arrayList.add(new lyy0(mtTransportType, str4, str5, str6, str7, z, kdcVar, new up2(rzo.d(s8o.m(kdcVar, dzy0Var.a))), tyy0Var, w211Var.b, w211Var.a));
        }
        if (arrayList.isEmpty()) {
            return dzy0Var.a(zyy0Var);
        }
        oob1.c(hj40Var != null ? hj40Var.c : null, arrayList);
        String h = ((avj0) dzy0Var.b).h(kyh0.mt_travel_options);
        String str8 = hj40Var != null ? hj40Var.a : null;
        return new ey20(dzy0Var.b(h, str8 != null ? str8 : ""), arrayList, null, 12);
    }
}
