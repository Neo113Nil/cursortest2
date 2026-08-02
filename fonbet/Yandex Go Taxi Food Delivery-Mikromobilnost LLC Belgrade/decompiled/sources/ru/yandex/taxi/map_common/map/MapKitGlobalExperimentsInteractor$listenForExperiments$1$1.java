package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.experiments.ExternalExperimentsManager;
import com.yandex.runtime.config.ExternalExperimentalParameter;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rk00;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/mapkit/MapKit;", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/MapKit;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.MapKitGlobalExperimentsInteractor$listenForExperiments$1$1", f = "MapKitGlobalExperimentsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapKitGlobalExperimentsInteractor$listenForExperiments$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<rk00> $experiments;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapKitGlobalExperimentsInteractor$listenForExperiments$1$1(List list, Continuation continuation) {
        super(2, continuation);
        this.$experiments = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapKitGlobalExperimentsInteractor$listenForExperiments$1$1 mapKitGlobalExperimentsInteractor$listenForExperiments$1$1 = new MapKitGlobalExperimentsInteractor$listenForExperiments$1$1(this.$experiments, continuation);
        mapKitGlobalExperimentsInteractor$listenForExperiments$1$1.L$0 = obj;
        return mapKitGlobalExperimentsInteractor$listenForExperiments$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MapKitGlobalExperimentsInteractor$listenForExperiments$1$1 mapKitGlobalExperimentsInteractor$listenForExperiments$1$1 = (MapKitGlobalExperimentsInteractor$listenForExperiments$1$1) create((MapKit) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mapKitGlobalExperimentsInteractor$listenForExperiments$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MapKit mapKit = (MapKit) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ExternalExperimentsManager externalExperimentsManager = mapKit.getExternalExperimentsManager();
        ExternalExperimentsManager externalExperimentsManager2 = externalExperimentsManager.isValid() ? externalExperimentsManager : null;
        if (externalExperimentsManager2 != null) {
            List<rk00> list = this.$experiments;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (rk00 rk00Var : list) {
                arrayList.add(new ExternalExperimentalParameter(rk00Var.a, rk00Var.b, rk00Var.c));
            }
            externalExperimentsManager2.setValues(arrayList);
        }
        return zy11.a;
    }
}
