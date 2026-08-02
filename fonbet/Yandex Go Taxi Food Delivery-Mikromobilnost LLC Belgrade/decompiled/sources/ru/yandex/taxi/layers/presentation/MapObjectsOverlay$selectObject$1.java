package ru.yandex.taxi.layers.presentation;

import defpackage.ah00;
import defpackage.dn00;
import defpackage.gh00;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$selectObject$1", f = "MapObjectsOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectsOverlay$selectObject$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$selectObject$1(f fVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapObjectsOverlay$selectObject$1(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MapObjectsOverlay$selectObject$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        lm00 lm00Var = (lm00) this.this$0.N.get(this.$id);
        if (lm00Var == null) {
            return zy11Var;
        }
        lm00Var.g = true;
        f fVar = this.this$0;
        dn00.g(lm00Var, fVar.M, ((gh00) ((ah00) fVar.b)).e.c.getZoom());
        f fVar2 = this.this$0;
        fVar2.Qg(lm00Var, ((gh00) ((ah00) fVar2.b)).e.c.getZoom());
        return zy11Var;
    }
}
