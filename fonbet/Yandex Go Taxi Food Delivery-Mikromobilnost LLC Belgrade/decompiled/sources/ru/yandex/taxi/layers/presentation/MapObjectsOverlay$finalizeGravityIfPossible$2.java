package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.g6u;
import defpackage.jse;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$finalizeGravityIfPossible$2", f = "MapObjectsOverlay.kt", l = {970, 974}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsOverlay$finalizeGravityIfPossible$2 extends SuspendLambda implements wls {
    final /* synthetic */ CameraPosition $cameraPosition;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$finalizeGravityIfPossible$2(f fVar, CameraPosition cameraPosition, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$cameraPosition = cameraPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectsOverlay$finalizeGravityIfPossible$2(this.this$0, this.$cameraPosition, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsOverlay$finalizeGravityIfPossible$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        if (defpackage.tje.k0(r3, r5, r9) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g gVar;
        jse jseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            Map map = fVar.N;
            CameraPosition cameraPosition = this.$cameraPosition;
            jse jseVar2 = fVar.G;
            g6u g6uVar = fVar.H;
            g gVar2 = fVar.c;
            GravityConvinienciesKt$finalizeGravity$mapObject$1 gravityConvinienciesKt$finalizeGravity$mapObject$1 = new GravityConvinienciesKt$finalizeGravity$mapObject$1(map, cameraPosition, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = g6uVar;
            this.L$4 = gVar2;
            this.label = 1;
            Object k0 = tje.k0(jseVar2, gravityConvinienciesKt$finalizeGravity$mapObject$1, this);
            if (k0 != coroutineSingletons) {
                gVar = gVar2;
                obj = k0;
                jseVar = g6uVar;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        gVar = (g) this.L$4;
        jseVar = (jse) this.L$3;
        kotlin.b.b(obj);
        lm00 lm00Var = (lm00) obj;
        if (lm00Var != null) {
            MapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1 mapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1 = new MapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1(lm00Var, null, gVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
