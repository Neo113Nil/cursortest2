package ru.yandex.taxi.scooters.presentation.route_navigation.navigation_style;

import com.yandex.mapkit.MapKit;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/mapkit/MapKit;", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/MapKit;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.route_navigation.navigation_style.ScootersNavigationStyleProviderHolder$requestCreation$1", f = "ScootersNavigationStyleProviderHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersNavigationStyleProviderHolder$requestCreation$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onCreated;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersNavigationStyleProviderHolder$requestCreation$1(tls tlsVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$onCreated = tlsVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersNavigationStyleProviderHolder$requestCreation$1(this.$onCreated, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersNavigationStyleProviderHolder$requestCreation$1 scootersNavigationStyleProviderHolder$requestCreation$1 = (ScootersNavigationStyleProviderHolder$requestCreation$1) create((MapKit) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersNavigationStyleProviderHolder$requestCreation$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$onCreated.invoke(this.this$0.e.invoke());
        return zy11.a;
    }
}
