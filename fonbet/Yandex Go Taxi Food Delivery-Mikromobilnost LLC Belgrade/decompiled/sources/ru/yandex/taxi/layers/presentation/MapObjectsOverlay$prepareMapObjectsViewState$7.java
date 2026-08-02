package ru.yandex.taxi.layers.presentation;

import android.animation.ValueAnimator;
import com.yandex.mapkit.Animation;
import defpackage.dn00;
import defpackage.f4c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pp60;
import defpackage.tse;
import defpackage.wls;
import defpackage.ym00;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$prepareMapObjectsViewState$7", f = "MapObjectsOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsOverlay$prepareMapObjectsViewState$7 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$prepareMapObjectsViewState$7(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectsOverlay$prepareMapObjectsViewState$7(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MapObjectsOverlay$prepareMapObjectsViewState$7 mapObjectsOverlay$prepareMapObjectsViewState$7 = (MapObjectsOverlay$prepareMapObjectsViewState$7) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mapObjectsOverlay$prepareMapObjectsViewState$7.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        HashSet hashSet = this.this$0.W;
        Set<f4c0> N0 = kotlin.collections.a.N0(hashSet);
        hashSet.clear();
        for (f4c0 f4c0Var : N0) {
            if (f4c0Var.f != null) {
                Object obj2 = f4c0Var.d;
                if (!(obj2 instanceof pp60)) {
                    obj2 = null;
                }
                pp60 pp60Var = (pp60) obj2;
                if (pp60Var == null) {
                    pp60Var = oyr.c(f4c0Var);
                }
                ValueAnimator a = pp60Var.a();
                if (a != null) {
                    a.cancel();
                }
                Object obj3 = f4c0Var.d;
                if (!(obj3 instanceof pp60)) {
                    obj3 = null;
                }
                pp60 pp60Var2 = (pp60) obj3;
                if (pp60Var2 == null) {
                    pp60Var2 = oyr.c(f4c0Var);
                }
                pp60Var2.f(null);
                Object obj4 = f4c0Var.d;
                if (!(obj4 instanceof pp60)) {
                    obj4 = null;
                }
                pp60 pp60Var3 = (pp60) obj4;
                if (pp60Var3 == null) {
                    pp60Var3 = oyr.c(f4c0Var);
                }
                ym00 d = pp60Var3.d();
                boolean z = true;
                if (d != null) {
                    Animation animation = dn00.a;
                    z = true ^ d.g().b;
                }
                f4c0Var.A(z ? 0.0f : 1.0f);
                f4c0Var.i(!z);
            }
        }
        return zy11.a;
    }
}
