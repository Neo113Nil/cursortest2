package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import android.graphics.PointF;
import com.yandex.mapkit.maps.core.geometry.FloatPointKt;
import defpackage.g8c;
import defpackage.gzb0;
import defpackage.i2c0;
import defpackage.mvg;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.qzb0;
import defpackage.sub0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltse;", "", "Lqzb0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.PinProcessorGo$runClusterFlow$visibleTreeSeeds$1", f = "PinProcessorGo.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinProcessorGo$runClusterFlow$visibleTreeSeeds$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<mwb0, gzb0> $clusterIconBoxes;
    final /* synthetic */ Map<mwb0, PointF> $clusterScreenPoints;
    final /* synthetic */ Set<mwb0> $coveredLeafIds;
    final /* synthetic */ List<qzb0> $treeSeeds;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProcessorGo$runClusterFlow$visibleTreeSeeds$1(List list, Set set, b bVar, Map map, Map map2, Continuation continuation) {
        super(2, continuation);
        this.$treeSeeds = list;
        this.$coveredLeafIds = set;
        this.this$0 = bVar;
        this.$clusterScreenPoints = map;
        this.$clusterIconBoxes = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinProcessorGo$runClusterFlow$visibleTreeSeeds$1(this.$treeSeeds, this.$coveredLeafIds, this.this$0, this.$clusterScreenPoints, this.$clusterIconBoxes, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinProcessorGo$runClusterFlow$visibleTreeSeeds$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        gzb0 gzb0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<qzb0> list = this.$treeSeeds;
        Set<mwb0> set = this.$coveredLeafIds;
        b bVar = this.this$0;
        Map<mwb0, PointF> map = this.$clusterScreenPoints;
        Map<mwb0, gzb0> map2 = this.$clusterIconBoxes;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            qzb0 qzb0Var = (qzb0) obj2;
            mwb0 mwb0Var = qzb0Var.a;
            if (mwb0Var instanceof g8c) {
                PointF a = bVar.k.a(qzb0Var.c);
                if (a != null) {
                    map.put(mwb0Var, a);
                    sub0 sub0Var = bVar.j;
                    PlacemarkType placemarkType = PlacemarkType.ICON;
                    i2c0 c = sub0Var.c(mwb0Var, placemarkType, null);
                    int i = c.a;
                    int i2 = c.b;
                    if (i == 0 || i2 == 0) {
                        gzb0Var = null;
                    } else {
                        PointF a2 = sub0Var.a(mwb0Var, placemarkType, null);
                        float f = i;
                        float f2 = i2;
                        gzb0Var = new gzb0(FloatPointKt.obtainX(a) - (FloatPointKt.obtainX(a2) * f), FloatPointKt.obtainY(a) - (FloatPointKt.obtainY(a2) * f2), f, f2);
                    }
                    if (gzb0Var != null) {
                        map2.put(mwb0Var, gzb0Var);
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = set.contains(mwb0Var);
            }
            if (z) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
