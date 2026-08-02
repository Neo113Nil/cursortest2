package ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance;

import defpackage.a9n0;
import defpackage.b9n0;
import defpackage.c9n0;
import defpackage.d9n0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.odz;
import defpackage.pdz;
import defpackage.qdz;
import defpackage.r0h0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.u8n0;
import defpackage.v8n0;
import defpackage.w511;
import defpackage.w8n0;
import defpackage.wnn0;
import defpackage.x8n0;
import defpackage.y8n0;
import defpackage.zls;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lwnn0;", "rideInstructionExperiment", "Lx8n0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lwnn0;)Lx8n0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance.ScootersCompletionAcceptanceUiStateInteractor$uiStateFlow$1", f = "ScootersCompletionAcceptanceUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionAcceptanceUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ d9n0 $scootersCompletionMode;
    final /* synthetic */ zuo0 $scootersSessionState;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ y8n0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionAcceptanceUiStateInteractor$uiStateFlow$1(y8n0 y8n0Var, d9n0 d9n0Var, zuo0 zuo0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = y8n0Var;
        this.$scootersCompletionMode = d9n0Var;
        this.$scootersSessionState = zuo0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersCompletionAcceptanceUiStateInteractor$uiStateFlow$1 scootersCompletionAcceptanceUiStateInteractor$uiStateFlow$1 = new ScootersCompletionAcceptanceUiStateInteractor$uiStateFlow$1(this.this$0, this.$scootersCompletionMode, this.$scootersSessionState, (Continuation) obj3);
        scootersCompletionAcceptanceUiStateInteractor$uiStateFlow$1.L$0 = (wnn0) obj2;
        return scootersCompletionAcceptanceUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? g;
        int i;
        Object obj2;
        ?? r0;
        List list;
        wnn0 wnn0Var = (wnn0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a9n0 a9n0Var = this.this$0.c;
        d9n0 d9n0Var = this.$scootersCompletionMode;
        String e = this.$scootersSessionState.e();
        a9n0Var.getClass();
        qdz qdzVar = d9n0Var.a;
        if (qdzVar.equals(odz.a)) {
            boolean z = wnn0Var.b;
            EmptyList emptyList = EmptyList.a;
            if (z) {
                Iterator it = wnn0Var.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jl40.l(((wnn0.a) obj2).a, e)) {
                        break;
                    }
                }
                wnn0.a aVar = (wnn0.a) obj2;
                if (aVar == null || (list = aVar.b) == null) {
                    r0 = 0;
                } else {
                    r0 = new ArrayList();
                    for (Object obj3 : list) {
                        if (!evu0.J((String) obj3)) {
                            r0.add(obj3);
                        }
                    }
                }
                if (r0 != 0) {
                    emptyList = r0;
                }
            }
            EmptyList emptyList2 = emptyList;
            g = new ArrayList(tcc.n(emptyList2, 10));
            Iterator it2 = emptyList2.iterator();
            while (it2.hasNext()) {
                g.add(new v8n0(((m7x0) a9n0Var.a).a((String) it2.next())));
            }
        } else {
            if (!(qdzVar instanceof pdz)) {
                w511.b();
                return null;
            }
            g = scc.g(new w8n0(null, r0h0.ic_park_scooter, true, kyh0.scooters_park_the_scooter, kyh0.scooters_park_the_scooter_warning), new w8n0(((pdz) qdzVar).a, r0h0.ic_close_lock, true, kyh0.scooters_buckle_scooter, kyh0.scooters_enter_lock_code), new w8n0(null, r0h0.ic_close_manual_lock, false, kyh0.scooters_spin_the_lock_drum, kyh0.scooters_reset_code_to_randomm));
        }
        ListBuilder listBuilder = new ListBuilder(g.size() + 1);
        listBuilder.add(new u8n0(kyh0.scooters_trip_completion));
        listBuilder.addAll((Collection) g);
        ListBuilder j = listBuilder.j();
        if (d9n0Var instanceof c9n0) {
            i = kyh0.scooters_complete_trip_dialog_take_photo;
        } else {
            if (!(d9n0Var instanceof b9n0)) {
                w511.b();
                return null;
            }
            i = kyh0.scooters_complete_trip_dialog_finish_ride;
        }
        return new x8n0(j, i, d9n0Var.a instanceof odz);
    }
}
