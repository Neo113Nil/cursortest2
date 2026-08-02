package ru.yandex.taxi.scooters.presentation.route_navigation;

import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.Type;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.el00;
import defpackage.euo0;
import defpackage.iyn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wto0;
import defpackage.zgz;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.map_common.map.s;
import ru.yandex.taxi.scooters.data.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationPresenter$attachView$1", f = "ScootersRouteNavigationPresenter.kt", l = {MSException.ERROR_INVALID_PASSWORD, 101, Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersRouteNavigationPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ wto0 $mvpView;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRouteNavigationPresenter$attachView$1(a aVar, wto0 wto0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$mvpView = wto0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersRouteNavigationPresenter$attachView$1 scootersRouteNavigationPresenter$attachView$1 = new ScootersRouteNavigationPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
        scootersRouteNavigationPresenter$attachView$1.L$0 = obj;
        return scootersRouteNavigationPresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersRouteNavigationPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.yandex.mapkit.navigation.transport.Navigation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.yandex.mapkit.navigation.transport.Navigation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.yandex.taxi.scooters.presentation.route_navigation.domain.a] */
    /* JADX WARN: Type inference failed for: r2v4, types: [wto0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r0;
        ?? r10;
        Route route;
        Navigation navigation;
        Throwable th;
        k kVar;
        String sessionId;
        zzs zzsVar;
        Object obj2 = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            try {
                try {
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th2) {
                zgz.a(null, new IllegalStateException(th2));
                r10 = obj2;
                route = null;
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th3) {
            zgz.a(null, new IllegalStateException(th3));
            r0 = 0;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.scooters.presentation.route_navigation.domain.a aVar = this.this$0.G;
            this.L$0 = obj2;
            this.label = 1;
            obj = new s((el00) aVar.d.a.a.get(), Type.SCOOTER).a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    route = (Route) this.L$2;
                    navigation = (Navigation) this.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        zgz.a("Error occurred while saving scooters destination", th);
                        navigation.startGuidance(route);
                        a aVar2 = this.this$0;
                        tje.N(aVar2.Jg(), null, null, new ScootersRouteNavigationPresenter$startListenFocusType$$inlined$collectLatestIn$1(new m0(aVar2.H.b(), aVar2.B.M2(), new ScootersRouteNavigationPresenter$startListenFocusType$1(aVar2, navigation, null)), null), 3);
                        a aVar3 = this.this$0;
                        tje.N(aVar3.Jg(), null, null, new ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1(aVar3, null), 3);
                        return zy11Var;
                    }
                    navigation.startGuidance(route);
                    a aVar22 = this.this$0;
                    tje.N(aVar22.Jg(), null, null, new ScootersRouteNavigationPresenter$startListenFocusType$$inlined$collectLatestIn$1(new m0(aVar22.H.b(), aVar22.B.M2(), new ScootersRouteNavigationPresenter$startListenFocusType$1(aVar22, navigation, null)), null), 3);
                    a aVar32 = this.this$0;
                    tje.N(aVar32.Jg(), null, null, new ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1(aVar32, null), 3);
                    return zy11Var;
                }
                Object obj3 = (Navigation) this.L$1;
                kotlin.b.b(obj);
                obj2 = obj3;
                Object obj4 = obj2;
                route = (Route) obj;
                r10 = obj4;
                if (route != null) {
                    this.this$0.M.invoke(new IllegalStateException("There is no route to show on the map"));
                    return zy11Var;
                }
                this.$mvpView.yg(r10);
                this.$mvpView.ma();
                euo0 euo0Var = this.this$0.I;
                iyn iynVar = new iyn(r10);
                r0 r0Var = euo0Var.a;
                r0Var.getClass();
                r0Var.m(null, iynVar);
                a aVar4 = this.this$0;
                try {
                    kVar = aVar4.J;
                    sessionId = aVar4.N.getSessionId();
                    zzsVar = aVar4.L;
                    this.L$0 = null;
                    this.L$1 = r10;
                    this.L$2 = route;
                    this.label = 3;
                } catch (Throwable th5) {
                    navigation = r10;
                    th = th5;
                    zgz.a("Error occurred while saving scooters destination", th);
                    navigation.startGuidance(route);
                    a aVar222 = this.this$0;
                    tje.N(aVar222.Jg(), null, null, new ScootersRouteNavigationPresenter$startListenFocusType$$inlined$collectLatestIn$1(new m0(aVar222.H.b(), aVar222.B.M2(), new ScootersRouteNavigationPresenter$startListenFocusType$1(aVar222, navigation, null)), null), 3);
                    a aVar322 = this.this$0;
                    tje.N(aVar322.Jg(), null, null, new ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1(aVar322, null), 3);
                    return zy11Var;
                }
                if (kVar.c(zzsVar, sessionId, this) != coroutineSingletons) {
                    navigation = r10;
                    navigation.startGuidance(route);
                    a aVar2222 = this.this$0;
                    tje.N(aVar2222.Jg(), null, null, new ScootersRouteNavigationPresenter$startListenFocusType$$inlined$collectLatestIn$1(new m0(aVar2222.H.b(), aVar2222.B.M2(), new ScootersRouteNavigationPresenter$startListenFocusType$1(aVar2222, navigation, null)), null), 3);
                    a aVar3222 = this.this$0;
                    tje.N(aVar3222.Jg(), null, null, new ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1(aVar3222, null), 3);
                    return zy11Var;
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        r0 = (Navigation) obj;
        if (r0 == 0) {
            this.this$0.M.invoke(new IllegalStateException("Unable to create navigation"));
            return zy11Var;
        }
        r0.resume();
        a aVar5 = this.this$0;
        aVar5.F.a = r0;
        ?? r2 = aVar5.G;
        String sessionId2 = aVar5.N.getSessionId();
        zzs zzsVar2 = aVar5.L;
        this.L$0 = null;
        this.L$1 = r0;
        this.label = 2;
        obj = r2.a(r0, sessionId2, zzsVar2, this);
        obj2 = r0;
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        Object obj42 = obj2;
        route = (Route) obj;
        r10 = obj42;
        if (route != null) {
        }
    }
}
