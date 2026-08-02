package ru.yandex.taxi.preorder.summary.selector.analytics;

import com.yandex.go.taxi.tariffs.analytics.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.fnx0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qze0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wu1;
import defpackage.x4e;
import defpackage.zax0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.selector.analytics.PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2", f = "PreselectedTariffAnalyticsReporter.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(e.p(new m0(((k) this.this$0.b).j.a(), ((k) this.this$0.a).j.b(), new PreselectedTariffAnalyticsReporter$sendPreselectedTariff$2$tariffSelection$1(3, null)), 300L), 6);
            this.label = 1;
            obj = e.y(mthVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        fnx0 fnx0Var = (fnx0) obj;
        a aVar = this.this$0;
        c cVar = aVar.e;
        if (!cVar.d) {
            zax0 zax0Var = aVar.c.a;
            pex0 pex0Var = fnx0Var.c;
            String str = pex0Var.b;
            String str2 = fnx0Var.d;
            wu1 wu1Var = pex0Var.O;
            String a = wu1Var != null ? wu1Var.a() : null;
            String a2 = pex0Var.J0.b.a();
            List list = pex0Var.A0;
            qze0 qze0Var = pex0Var.m;
            Set keySet = qze0Var != null ? qze0Var.i.keySet() : null;
            if (keySet == null) {
                keySet = EmptySet.a;
            }
            HashMap h = kotlin.collections.b.h(new Pair("preselected_tariff", str), new Pair("vertical_id", str2), new Pair("offer_id", a2), new Pair("faster_tariff_list", list), new Pair("cheaper_tariff_list", kotlin.collections.a.J0(keySet)));
            if (a != null) {
                h.put("alt_type", a);
            }
            x4e.B(zax0Var.a, "Tariff.PreSelected", h, 2);
            cVar.a(true);
        }
        return zy11.a;
    }
}
