package ru.yandex.taxi.masstransit.router;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qn00;
import defpackage.rn00;
import defpackage.siu0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.router.MtMasstransitModeLifecycleListener$onLaunch$2", f = "MtMasstransitModeLifecycleListener.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtMasstransitModeLifecycleListener$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<List<siu0>> $stopsScales;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMasstransitModeLifecycleListener$onLaunch$2(e eVar, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$stopsScales = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtMasstransitModeLifecycleListener$onLaunch$2(this.this$0, this.$stopsScales, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtMasstransitModeLifecycleListener$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rn00 rn00Var;
        MapObjectType mapObjectType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            rn00 rn00Var2 = eVar.l;
            MapObjectType mapObjectType2 = MapObjectType.STOP;
            ru.yandex.taxi.masstransit.domain.d dVar = eVar.k;
            List<siu0> list = this.$stopsScales.element;
            this.L$0 = rn00Var2;
            this.L$1 = mapObjectType2;
            this.label = 1;
            obj = dVar.c(list, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            rn00Var = rn00Var2;
            mapObjectType = mapObjectType2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mapObjectType = (MapObjectType) this.L$1;
            rn00Var = (rn00) this.L$0;
            kotlin.b.b(obj);
        }
        rn00Var.a.put(mapObjectType, (qn00) obj);
        return zy11.a;
    }
}
