package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.Location;
import defpackage.eci0;
import defpackage.f92;
import defpackage.g92;
import defpackage.igz;
import defpackage.j10;
import defpackage.jqr;
import defpackage.ka2;
import defpackage.la2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tpr;
import defpackage.wls;
import defpackage.wsr0;
import defpackage.x6f0;
import defpackage.xsr0;
import defpackage.y6f0;
import defpackage.zy11;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Landroid/location/Location;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1", f = "AndroidDiscardedLocationFiltrationAndLogging.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1 extends SuspendLambda implements wls {
    final /* synthetic */ la2 $config;
    final /* synthetic */ sls $getNowElapsedRealtimeNs;
    final /* synthetic */ igz $log;
    final /* synthetic */ AndroidLocationProviderType $providerType;
    final /* synthetic */ tpr $this_filterAndLogDiscarded;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((x6f0) ((y6f0) this.receiver)).y.o((Location) obj, (Continuation) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1(tpr tprVar, la2 la2Var, sls slsVar, AndroidLocationProviderType androidLocationProviderType, igz igzVar, Continuation continuation) {
        super(2, continuation);
        this.$this_filterAndLogDiscarded = tprVar;
        this.$config = la2Var;
        this.$getNowElapsedRealtimeNs = slsVar;
        this.$providerType = androidLocationProviderType;
        this.$log = igzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1 androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1 = new AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1(this.$this_filterAndLogDiscarded, this.$config, this.$getNowElapsedRealtimeNs, this.$providerType, this.$log, continuation);
        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1.L$0 = obj;
        return androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1 androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1 = (AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1) create((y6f0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j10 j10Var = new j10(this.$this_filterAndLogDiscarded, this.$config, this.$getNowElapsedRealtimeNs, 1);
        xsr0.a.getClass();
        eci0 O = kotlinx.coroutines.flow.e.O(j10Var, y6f0Var, wsr0.c, 1);
        kotlinx.coroutines.flow.e.H(y6f0Var, new jqr(new f92(O, 0), new AnonymousClass2(2, y6f0Var, y6f0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3));
        ka2 ka2Var = this.$config.d;
        if (ka2Var != null) {
            AndroidLocationProviderType androidLocationProviderType = this.$providerType;
            igz igzVar = this.$log;
            DecimalFormat decimalFormat = e.a;
            kotlinx.coroutines.flow.e.H(y6f0Var, new jqr(new g92(0, ru.yandex.taxi.locationsdk.common_utils.a.a(new f92(O, 1), ka2Var.a)), new AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$3(ka2Var, igzVar, androidLocationProviderType, null), 3));
        }
        return zy11.a;
    }
}
