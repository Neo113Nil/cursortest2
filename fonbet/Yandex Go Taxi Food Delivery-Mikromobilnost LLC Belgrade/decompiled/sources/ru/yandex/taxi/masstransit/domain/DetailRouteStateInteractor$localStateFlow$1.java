package ru.yandex.taxi.masstransit.domain;

import defpackage.bms;
import defpackage.fc30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1j;
import defpackage.rw30;
import defpackage.su30;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002(\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0002`\u00060\u0002j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "themeType", "", "", "Lw211;", "Lwy30;", "Lru/yandex/taxi/masstransit/model/MtTransportSchedules;", "Lru/yandex/taxi/masstransit/model/MtOnlineSchedule;", "schedules", "Lfc30;", "icons", "Lrw30;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Ljava/util/Map;Lfc30;)Lrw30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.DetailRouteStateInteractor$localStateFlow$1", f = "DetailRouteStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DetailRouteStateInteractor$localStateFlow$1 extends SuspendLambda implements bms {
    final /* synthetic */ o1j $configs;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRouteStateInteractor$localStateFlow$1(o1j o1jVar, Continuation continuation) {
        super(4, continuation);
        this.$configs = o1jVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        DetailRouteStateInteractor$localStateFlow$1 detailRouteStateInteractor$localStateFlow$1 = new DetailRouteStateInteractor$localStateFlow$1(this.$configs, (Continuation) obj4);
        detailRouteStateInteractor$localStateFlow$1.L$0 = (ThemeType) obj;
        detailRouteStateInteractor$localStateFlow$1.L$1 = (Map) obj2;
        detailRouteStateInteractor$localStateFlow$1.L$2 = (fc30) obj3;
        return detailRouteStateInteractor$localStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ThemeType themeType = (ThemeType) this.L$0;
        Map map = (Map) this.L$1;
        fc30 fc30Var = (fc30) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        o1j o1jVar = this.$configs;
        su30 su30Var = o1jVar.a;
        ru.yandex.taxi.masstransit.experiment.f fVar = o1jVar.b;
        return new rw30(su30Var, map, themeType, fc30Var, fVar, o1jVar.c, fVar.i, o1jVar.d);
    }
}
