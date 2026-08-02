package ru.yandex.taxi.surge.interactor;

import com.yandex.go.zone.dto.objects.ServiceLevelWidget$Invisible;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeAlert;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeBalance;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import defpackage.bms;
import defpackage.dow0;
import defpackage.fnx0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lfnx0;", "tariffSelection", "", "", "", "selection", "Ldow0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lfnx0;Ljava/util/Map;)Ldow0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgeInfoStateInteractor$stateFlowForCurrentTariff$1", f = "SurgeInfoStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateInteractor$stateFlowForCurrentTariff$1 extends SuspendLambda implements bms {
    final /* synthetic */ String $origin;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateInteractor$stateFlowForCurrentTariff$1(q qVar, String str, Continuation continuation) {
        super(4, continuation);
        this.this$0 = qVar;
        this.$origin = str;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SurgeInfoStateInteractor$stateFlowForCurrentTariff$1 surgeInfoStateInteractor$stateFlowForCurrentTariff$1 = new SurgeInfoStateInteractor$stateFlowForCurrentTariff$1(this.this$0, this.$origin, (Continuation) obj4);
        surgeInfoStateInteractor$stateFlowForCurrentTariff$1.L$0 = (ThemeType) obj;
        surgeInfoStateInteractor$stateFlowForCurrentTariff$1.L$1 = (fnx0) obj2;
        surgeInfoStateInteractor$stateFlowForCurrentTariff$1.L$2 = (Map) obj3;
        return surgeInfoStateInteractor$stateFlowForCurrentTariff$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ThemeType themeType = (ThemeType) this.L$0;
        fnx0 fnx0Var = (fnx0) this.L$1;
        Map map = (Map) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f5 f5Var = fnx0Var.c.w0;
        if (f5Var instanceof ServiceLevelWidget$SurgeBalance) {
            return new dow0(((ServiceLevelWidget$SurgeBalance) f5Var).c, q.b(this.this$0, fnx0Var), themeType, map, this.$origin);
        }
        if (f5Var instanceof ServiceLevelWidget$Invisible) {
            return new dow0(((ServiceLevelWidget$Invisible) f5Var).a, q.b(this.this$0, fnx0Var), themeType, map, this.$origin);
        }
        if (f5Var instanceof ServiceLevelWidget$SurgeAlert) {
            return new dow0(((ServiceLevelWidget$SurgeAlert) f5Var).c, q.b(this.this$0, fnx0Var), themeType, map, this.$origin);
        }
        if (jl40.l(f5Var, e5.INSTANCE)) {
            return null;
        }
        w511.b();
        return null;
    }
}
