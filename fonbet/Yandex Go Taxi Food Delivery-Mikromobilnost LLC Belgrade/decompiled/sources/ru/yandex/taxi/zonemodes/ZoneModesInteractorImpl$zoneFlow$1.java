package ru.yandex.taxi.zonemodes;

import defpackage.gd61;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lgd61;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zonemodes.ZoneModesInteractorImpl$zoneFlow$1", f = "ZoneModesInteractorImpl.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class ZoneModesInteractorImpl$zoneFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneModesInteractorImpl$zoneFlow$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoneModesInteractorImpl$zoneFlow$1 zoneModesInteractorImpl$zoneFlow$1 = new ZoneModesInteractorImpl$zoneFlow$1(this.this$0, continuation);
        zoneModesInteractorImpl$zoneFlow$1.L$0 = obj;
        return zoneModesInteractorImpl$zoneFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneModesInteractorImpl$zoneFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gd61 gd61Var = new gd61(null, this.this$0.b.g());
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(gd61Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
