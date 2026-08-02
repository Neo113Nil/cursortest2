package ru.yandex.taxi.layers.domain;

import defpackage.hcc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zp00;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Ljava/lang/Object;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.MapObjectsRenderingInteractor$startListening$9", f = "MapObjectsRenderingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsRenderingInteractor$startListening$9 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsRenderingInteractor$startListening$9(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectsRenderingInteractor$startListening$9(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MapObjectsRenderingInteractor$startListening$9 mapObjectsRenderingInteractor$startListening$9 = (MapObjectsRenderingInteractor$startListening$9) create(obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mapObjectsRenderingInteractor$startListening$9.invokeSuspend(zy11Var);
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
        o oVar = this.this$0;
        Set set = o.q;
        zp00 zp00Var = oVar.i;
        zp00Var.i.clear();
        zp00Var.j = false;
        zp00Var.h = null;
        oVar.e.a(null);
        ((hcc0) oVar.l).a();
        return zy11.a;
    }
}
