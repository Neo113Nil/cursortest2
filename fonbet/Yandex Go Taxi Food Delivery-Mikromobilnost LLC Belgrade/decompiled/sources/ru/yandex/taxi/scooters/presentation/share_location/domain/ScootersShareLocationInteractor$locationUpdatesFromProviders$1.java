package ru.yandex.taxi.scooters.presentation.share_location.domain;

import android.location.LocationListener;
import defpackage.mvg;
import defpackage.nao0;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Landroid/location/Location;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.share_location.domain.ScootersShareLocationInteractor$locationUpdatesFromProviders$1", f = "ScootersShareLocationInteractor.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersShareLocationInteractor$locationUpdatesFromProviders$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $intervalMs;
    final /* synthetic */ String $provider;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersShareLocationInteractor$locationUpdatesFromProviders$1(d dVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$provider = str;
        this.$intervalMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersShareLocationInteractor$locationUpdatesFromProviders$1 scootersShareLocationInteractor$locationUpdatesFromProviders$1 = new ScootersShareLocationInteractor$locationUpdatesFromProviders$1(this.this$0, this.$provider, this.$intervalMs, continuation);
        scootersShareLocationInteractor$locationUpdatesFromProviders$1.L$0 = obj;
        return scootersShareLocationInteractor$locationUpdatesFromProviders$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersShareLocationInteractor$locationUpdatesFromProviders$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            LocationListener a = ru.yandex.taxi.preorder.source.userposition.misc.a.a(y6f0Var);
            if (this.this$0.c.isProviderEnabled(this.$provider)) {
                this.this$0.c.requestLocationUpdates(this.$provider, this.$intervalMs / 2, 1.0f, a);
            }
            nao0 nao0Var = new nao0(7, this.this$0, a);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, nao0Var, this) == coroutineSingletons) {
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
