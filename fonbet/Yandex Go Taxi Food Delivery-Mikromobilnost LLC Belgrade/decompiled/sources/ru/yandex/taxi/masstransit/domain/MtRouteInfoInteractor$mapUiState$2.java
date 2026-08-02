package ru.yandex.taxi.masstransit.domain;

import defpackage.avj0;
import defpackage.dwh0;
import defpackage.hz30;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.nk31;
import defpackage.ny61;
import defpackage.q0l0;
import defpackage.q2h0;
import defpackage.q47;
import defpackage.r2v0;
import defpackage.scc;
import defpackage.su30;
import defpackage.tse;
import defpackage.ubo;
import defpackage.vv30;
import defpackage.wls;
import defpackage.wv30;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwv30;", "<anonymous>", "(Ltse;)Lwv30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtRouteInfoInteractor$mapUiState$2", f = "MtRouteInfoInteractor.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRouteInfoInteractor$mapUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ ru.yandex.taxi.masstransit.experiment.f $config;
    final /* synthetic */ String $iconTag;
    final /* synthetic */ su30 $route;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRouteInfoInteractor$mapUiState$2(f0 f0Var, su30 su30Var, ru.yandex.taxi.masstransit.experiment.f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f0Var;
        this.$route = su30Var;
        this.$config = fVar;
        this.$iconTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRouteInfoInteractor$mapUiState$2(this.this$0, this.$route, this.$config, this.$iconTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtRouteInfoInteractor$mapUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String i;
        vv30 vv30Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            i = ((avj0) this.this$0.d).i(kyh0.mt_on_map_modal_title, this.$route.f.b);
            f0 f0Var = this.this$0;
            su30 su30Var = this.$route;
            f0Var.getClass();
            List<hz30> list = su30Var.a;
            ubo uboVar = su30Var.g;
            ArrayList arrayList = new ArrayList();
            for (hz30 hz30Var : list) {
                nk31 nk31Var = hz30Var instanceof nk31 ? (nk31) hz30Var : null;
                String str = nk31Var != null ? nk31Var.a : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            ArrayList o0 = kotlin.collections.a.o0(kotlin.collections.a.m0(arrayList, Collections.singletonList(uboVar.a.a)), uboVar.b.a);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = o0.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                String str2 = (String) next;
                ycc.r(i3 == scc.f(o0) ? Collections.singletonList(new r2v0(2, null, str2)) : scc.g(new r2v0(2, null, str2), new r2v0(1, Integer.valueOf(q2h0.ic_stops_divider), null)), arrayList2);
                i3 = i4;
            }
            vv30 vv30Var2 = new vv30(arrayList2, ((avj0) f0Var.d).f(dwh0.mass_transit_route_stops, o0.size()));
            String a = this.$config.a(this.$route);
            f0 f0Var2 = this.this$0;
            q0l0 q0l0Var = this.$config.g;
            this.L$0 = i;
            this.L$1 = vv30Var2;
            this.L$2 = null;
            this.label = 1;
            obj = f0.a(f0Var2, q0l0Var, a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            vv30Var = vv30Var2;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vv30 vv30Var3 = (vv30) this.L$1;
            i = (String) this.L$0;
            kotlin.b.b(obj);
            vv30Var = vv30Var3;
        }
        String str3 = i;
        q47 q47Var = (q47) obj;
        String str4 = this.$iconTag;
        return new wv30(str4.length() == 0 ? null : str4, str3, vv30Var, q47Var, this.$route.e);
    }
}
