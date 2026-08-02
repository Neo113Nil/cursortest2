package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.driving.AvoidanceFlags;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.directions.driving.VehicleType;
import defpackage.mvg;
import defpackage.nlm;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vqy;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.MapkitDrivingRouterImpl$query$1", f = "MapkitDrivingRouterImpl.kt", l = {196}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MapkitDrivingRouterImpl$query$1 extends SuspendLambda implements wls {
    final /* synthetic */ Integer $alternativeCount;
    final /* synthetic */ Boolean $avoidTolls;
    final /* synthetic */ Double $azimuth;
    final /* synthetic */ nlm $callback;
    final /* synthetic */ List<zzs> $normalizedRoute;
    final /* synthetic */ VehicleType $vehicleType;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapkitDrivingRouterImpl$query$1(List list, nlm nlmVar, o oVar, Boolean bool, Double d, Integer num, VehicleType vehicleType, Continuation continuation) {
        super(2, continuation);
        this.$normalizedRoute = list;
        this.$callback = nlmVar;
        this.this$0 = oVar;
        this.$avoidTolls = bool;
        this.$azimuth = d;
        this.$alternativeCount = num;
        this.$vehicleType = vehicleType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapkitDrivingRouterImpl$query$1(this.$normalizedRoute, this.$callback, this.this$0, this.$avoidTolls, this.$azimuth, this.$alternativeCount, this.$vehicleType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapkitDrivingRouterImpl$query$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006f -> B:5:0x0072). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        o oVar;
        Collection collection;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<zzs> list = this.$normalizedRoute;
            o oVar2 = this.this$0;
            ArrayList arrayList = new ArrayList();
            it = list.iterator();
            oVar = oVar2;
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$5;
            collection = (Collection) this.L$3;
            oVar = (o) this.L$1;
            kotlin.b.b(obj);
            Object b = obj;
            RequestPoint requestPoint = (RequestPoint) b;
            if (requestPoint != null) {
                collection.add(requestPoint);
            }
            if (it.hasNext()) {
                zzs zzsVar = (zzs) it.next();
                this.L$0 = null;
                this.L$1 = oVar;
                this.L$2 = null;
                this.L$3 = collection;
                this.L$4 = null;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.label = 1;
                b = o.b(oVar, zzsVar, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                RequestPoint requestPoint2 = (RequestPoint) b;
                if (requestPoint2 != null) {
                }
                if (it.hasNext()) {
                    List list2 = (List) collection;
                    if (list2.size() != this.$normalizedRoute.size()) {
                        this.$callback.d(new IOException("Can't build a drive route - some points have invalid coordinates"));
                    } else {
                        o oVar3 = this.this$0;
                        Boolean bool = this.$avoidTolls;
                        Double d = this.$azimuth;
                        Integer num = this.$alternativeCount;
                        VehicleType vehicleType = this.$vehicleType;
                        oVar3.getClass();
                        oVar3.b.b(new vqy(oVar3, list2, new DrivingOptions(d, num, null, null, null, bool != null ? new AvoidanceFlags(bool.booleanValue(), false, false, false, false, false, false, false) : null, EmptyList.a), new VehicleOptions(vehicleType, null, null, null, null, null, null, null, null, null, null), 1), true);
                    }
                    return zy11.a;
                }
            }
        }
    }
}
