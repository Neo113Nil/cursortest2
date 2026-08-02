package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.ym00;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$showAdvertClusterization$1$job$1", f = "MapObjectsOverlay.kt", l = {521}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectsOverlay$showAdvertClusterization$1$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ ym00 $bodyComponent;
    final /* synthetic */ CameraPosition $cameraPosition;
    final /* synthetic */ tpr $flow;
    final /* synthetic */ String $id;
    final /* synthetic */ Set<String> $intersectedObjects;
    final /* synthetic */ boolean $isSelectedHost;
    final /* synthetic */ Map<String, Set<String>> $mapObjectOverlaps;
    final /* synthetic */ Set<String> $overlapIds;
    final /* synthetic */ List<String> $previewIds;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$showAdvertClusterization$1$job$1(tpr tprVar, f fVar, String str, CameraPosition cameraPosition, ym00 ym00Var, List list, boolean z, Set set, Set set2, Map map, Continuation continuation) {
        super(2, continuation);
        this.$flow = tprVar;
        this.this$0 = fVar;
        this.$id = str;
        this.$cameraPosition = cameraPosition;
        this.$bodyComponent = ym00Var;
        this.$previewIds = list;
        this.$isSelectedHost = z;
        this.$overlapIds = set;
        this.$intersectedObjects = set2;
        this.$mapObjectOverlaps = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectsOverlay$showAdvertClusterization$1$job$1(this.$flow, this.this$0, this.$id, this.$cameraPosition, this.$bodyComponent, this.$previewIds, this.$isSelectedHost, this.$overlapIds, this.$intersectedObjects, this.$mapObjectOverlaps, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsOverlay$showAdvertClusterization$1$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$flow;
            e eVar = new e(this.this$0, this.$id, this.$cameraPosition, this.$bodyComponent, this.$previewIds, this.$isSelectedHost, this.$overlapIds, this.$intersectedObjects, this.$mapObjectOverlaps);
            this.label = 1;
            if (tprVar.collect(eVar, this) == coroutineSingletons) {
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
