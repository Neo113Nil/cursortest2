package ru.yandex.taxi.layers.domain;

import defpackage.lxi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pxi0;
import defpackage.rsn;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrsn;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lrsn;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.MapObjectsRenderingInteractor$startListening$3", f = "MapObjectsRenderingInteractor.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsRenderingInteractor$startListening$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsRenderingInteractor$startListening$3(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectsRenderingInteractor$startListening$3 mapObjectsRenderingInteractor$startListening$3 = new MapObjectsRenderingInteractor$startListening$3(this.this$0, continuation);
        mapObjectsRenderingInteractor$startListening$3.L$0 = obj;
        return mapObjectsRenderingInteractor$startListening$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsRenderingInteractor$startListening$3) create((rsn) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rsn rsnVar = (rsn) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) rsnVar.a;
            String str2 = (String) rsnVar.b;
            ArrayList arrayList = new ArrayList();
            if (str != null) {
                arrayList.add(new lxi0(str));
            }
            if (str2 != null) {
                arrayList.add(new pxi0(str2));
            }
            o oVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            Set set = o.q;
            if (oVar.d(arrayList, this) == coroutineSingletons) {
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
