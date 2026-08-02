package ru.yandex.taxi.layers.presentation;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sm00;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$availabilityListener$1$1", f = "MapObjectsOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectsOverlay$availabilityListener$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ lm00 $it;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$availabilityListener$1$1(f fVar, lm00 lm00Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$it = lm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapObjectsOverlay$availabilityListener$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MapObjectsOverlay$availabilityListener$1$1 mapObjectsOverlay$availabilityListener$1$1 = (MapObjectsOverlay$availabilityListener$1$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        mapObjectsOverlay$availabilityListener$1$1.invokeSuspend(zy11Var);
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
        g gVar = this.this$0.c;
        lm00 lm00Var = this.$it;
        LayersAnalyticEventEmmiter layersAnalyticEventEmmiter = gVar.y.a;
        String str = lm00Var.a;
        MapObjectType mapObjectType = lm00Var.c;
        sm00 sm00Var = lm00Var.h;
        ru.yandex.taxi.layers.a aVar = (ru.yandex.taxi.layers.a) layersAnalyticEventEmmiter.a.get(mapObjectType);
        if (aVar != null) {
            aVar.a(str, MapObjectComponentType.BODY, LayersAnalyticEventEmmiter.Event.AVAILABLE, sm00Var);
        }
        return zy11.a;
    }
}
