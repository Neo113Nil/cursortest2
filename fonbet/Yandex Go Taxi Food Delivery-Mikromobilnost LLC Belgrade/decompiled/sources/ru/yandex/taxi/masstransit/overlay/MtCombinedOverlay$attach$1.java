package ru.yandex.taxi.masstransit.overlay;

import defpackage.m010;
import defpackage.mvg;
import defpackage.mz00;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x35;
import defpackage.y35;
import defpackage.ztv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.model.MtMasstransitOverlayOwner;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.MtCombinedOverlay$attach$1", f = "MtCombinedOverlay.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCombinedOverlay$attach$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCombinedOverlay$attach$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCombinedOverlay$attach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCombinedOverlay$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar2 = this.this$0;
            ztv0 ztv0Var = aVar2.x;
            this.L$0 = aVar2;
            this.label = 1;
            Object a = ((com.yandex.go.superapp.discovery.map.impl.experiments.transport.c) ztv0Var).a("selected_mode", this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            obj = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            kotlin.b.b(obj);
        }
        aVar.A = (y35) obj;
        a aVar3 = this.this$0;
        ru.yandex.taxi.masstransit.router.e c = aVar3.c.c();
        y35 y35Var = aVar3.A;
        if (y35Var == null) {
            y35.a.getClass();
            y35Var = x35.b;
        }
        c.b(y35Var, new mz00(null, null, 15), aVar3.z, MtMasstransitOverlayOwner.SUPER_APP_DISCOVERY_MAP_FEATURE);
        m010 m010Var = aVar3.w;
        y35 y35Var2 = aVar3.A;
        if (y35Var2 == null) {
            y35.a.getClass();
            y35Var2 = x35.b;
        }
        m010Var.c.c(y35Var2.b(), EmptyList.a, false);
        return zy11.a;
    }
}
