package ru.yandex.taxi.scooters.presentation.route_navigation;

import com.yandex.mapkit.navigation.transport.Navigation;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.scooters.domain.ScootersDetailedOrderFocusInteractor$FocusType;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/scooters/domain/ScootersDetailedOrderFocusInteractor$FocusType;", "focusType", "Lcom/yandex/mapkit/ScreenRect;", "<unused var>", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/scooters/domain/ScootersDetailedOrderFocusInteractor$FocusType;Lcom/yandex/mapkit/ScreenRect;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationPresenter$startListenFocusType$1", f = "ScootersRouteNavigationPresenter.kt", l = {HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersRouteNavigationPresenter$startListenFocusType$1 extends SuspendLambda implements zls {
    final /* synthetic */ Navigation $navigation;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRouteNavigationPresenter$startListenFocusType$1(a aVar, Navigation navigation, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$navigation = navigation;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersRouteNavigationPresenter$startListenFocusType$1 scootersRouteNavigationPresenter$startListenFocusType$1 = new ScootersRouteNavigationPresenter$startListenFocusType$1(this.this$0, this.$navigation, (Continuation) obj3);
        scootersRouteNavigationPresenter$startListenFocusType$1.L$0 = (ScootersDetailedOrderFocusInteractor$FocusType) obj;
        return scootersRouteNavigationPresenter$startListenFocusType$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScootersDetailedOrderFocusInteractor$FocusType scootersDetailedOrderFocusInteractor$FocusType = (ScootersDetailedOrderFocusInteractor$FocusType) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            Navigation navigation = this.$navigation;
            this.L$0 = null;
            this.label = 1;
            if (a.Mg(aVar, navigation, scootersDetailedOrderFocusInteractor$FocusType, this) == coroutineSingletons) {
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
