package ru.yandex.taxi.layers.presentation;

import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ym00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$visibilityListener$1$1", f = "MapObjectsOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectsOverlay$visibilityListener$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ ym00 $component;
    final /* synthetic */ boolean $isVisible;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$visibilityListener$1$1(f fVar, ym00 ym00Var, boolean z, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$component = ym00Var;
        this.$isVisible = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapObjectsOverlay$visibilityListener$1$1(this.this$0, this.$component, this.$isVisible, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MapObjectsOverlay$visibilityListener$1$1 mapObjectsOverlay$visibilityListener$1$1 = (MapObjectsOverlay$visibilityListener$1$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        mapObjectsOverlay$visibilityListener$1$1.invokeSuspend(zy11Var);
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
        lm00 lm00Var = (lm00) this.this$0.N.get(this.$component.e());
        if (lm00Var != null) {
            f fVar = this.this$0;
            fVar.c.Lg(this.$isVisible, this.$component, lm00Var);
        }
        return zy11.a;
    }
}
