package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$showAdvertClusterization$1$job$1$1$1", f = "MapObjectsOverlay.kt", l = {534, 535}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectsOverlay$showAdvertClusterization$1$job$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ CameraPosition $cameraPosition;
    final /* synthetic */ Set<String> $intersectedObjects;
    final /* synthetic */ Map<String, Set<String>> $mapObjectOverlaps;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$showAdvertClusterization$1$job$1$1$1(CameraPosition cameraPosition, Map map, Set set, Continuation continuation, f fVar) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$cameraPosition = cameraPosition;
        this.$intersectedObjects = set;
        this.$mapObjectOverlaps = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = this.this$0;
        return new MapObjectsOverlay$showAdvertClusterization$1$job$1$1$1(this.$cameraPosition, this.$mapObjectOverlaps, this.$intersectedObjects, continuation, fVar);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsOverlay$showAdvertClusterization$1$job$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (kotlinx.coroutines.a.i(50, r10) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        f fVar = this.this$0;
        CameraPosition cameraPosition = this.$cameraPosition;
        Set<String> set = this.$intersectedObjects;
        Map<String, Set<String>> map = this.$mapObjectOverlaps;
        this.label = 2;
        Object k0 = tje.k0(fVar.H, new MapObjectsOverlay$resolveClusterVisibility$2(cameraPosition, map, set, null, fVar), this);
        if (k0 != coroutineSingletons) {
            k0 = zy11Var;
        }
        return k0 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
