package ru.yandex.taxi.layers.presentation;

import defpackage.ap00;
import defpackage.jst;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pp60;
import defpackage.tls;
import defpackage.ym00;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$hide$2", f = "MapObjectsOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsOverlay$hide$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$hide$2(f fVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapObjectsOverlay$hide$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MapObjectsOverlay$hide$2 mapObjectsOverlay$hide$2 = (MapObjectsOverlay$hide$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        mapObjectsOverlay$hide$2.invokeSuspend(zy11Var);
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
        f fVar = this.this$0;
        Iterator it = fVar.M.n().iterator();
        while (it.hasNext()) {
            ap00 ap00Var = (ap00) it.next();
            Object obj2 = ap00Var.d;
            if (!(obj2 instanceof pp60)) {
                obj2 = null;
            }
            pp60 pp60Var = (pp60) obj2;
            if (pp60Var == null) {
                pp60Var = new pp60();
                ap00Var.h(pp60Var);
            }
            ym00 d = pp60Var.d();
            if (d == null) {
                jst.e.k(new IllegalStateException(), "Layers layerCollection and mapObjectsMap have to have the same set of objects");
                ap00Var.d();
            } else {
                lm00 lm00Var = (lm00) fVar.N.get(d.e());
                lm00 lm00Var2 = (lm00) fVar.N.get(d.e());
                if ((lm00Var2 != null && !lm00Var2.g) || lm00Var == null) {
                    ap00Var.d();
                }
            }
        }
        Map map = fVar.N;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((lm00) entry.getValue()).g) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        fVar.N = linkedHashMap;
        return zy11.a;
    }
}
