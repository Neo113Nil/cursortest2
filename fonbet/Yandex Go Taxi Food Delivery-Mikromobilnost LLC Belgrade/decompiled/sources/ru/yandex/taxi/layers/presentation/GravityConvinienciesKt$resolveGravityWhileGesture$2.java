package ru.yandex.taxi.layers.presentation;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.dn00;
import defpackage.f4c0;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pp60;
import defpackage.tse;
import defpackage.wls;
import defpackage.ym00;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Pair;", "Llm00;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.GravityConvinienciesKt$resolveGravityWhileGesture$2", f = "GravityConviniencies.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class GravityConvinienciesKt$resolveGravityWhileGesture$2 extends SuspendLambda implements wls {
    final /* synthetic */ CameraPosition $cameraPos;
    final /* synthetic */ Map<String, lm00> $this_resolveGravityWhileGesture;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GravityConvinienciesKt$resolveGravityWhileGesture$2(Map map, CameraPosition cameraPosition, Continuation continuation) {
        super(2, continuation);
        this.$this_resolveGravityWhileGesture = map;
        this.$cameraPos = cameraPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GravityConvinienciesKt$resolveGravityWhileGesture$2(this.$this_resolveGravityWhileGesture, this.$cameraPos, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GravityConvinienciesKt$resolveGravityWhileGesture$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GravityState gravityState;
        f4c0 g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        lm00 a = a.a(this.$this_resolveGravityWhileGesture, this.$cameraPos.getZoom(), ru.yandex.taxi.map.utils.a.E(this.$cameraPos.getTarget(), null));
        Iterator<T> it = this.$this_resolveGravityWhileGesture.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ym00 b = dn00.b((lm00) next, MapObjectComponentType.BODY);
            if (b == null || (g = b.g()) == null) {
                gravityState = null;
            } else {
                Object obj3 = g.d;
                if (!(obj3 instanceof pp60)) {
                    obj3 = null;
                }
                pp60 pp60Var = (pp60) obj3;
                if (pp60Var == null) {
                    pp60Var = oyr.c(g);
                }
                gravityState = pp60Var.c();
            }
            if (gravityState == GravityState.UP) {
                obj2 = next;
                break;
            }
        }
        return new Pair(a, (lm00) obj2);
    }
}
