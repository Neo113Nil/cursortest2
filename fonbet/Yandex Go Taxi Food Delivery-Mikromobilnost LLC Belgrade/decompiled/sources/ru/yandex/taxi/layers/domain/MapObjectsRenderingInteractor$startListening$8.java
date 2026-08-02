package ru.yandex.taxi.layers.domain;

import com.yandex.mapkit.geometry.Point;
import defpackage.fkp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rxi0;
import defpackage.wls;
import defpackage.zlp;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfkp;", "feature", "Lzy11;", "<anonymous>", "(Lfkp;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.MapObjectsRenderingInteractor$startListening$8", f = "MapObjectsRenderingInteractor.kt", l = {HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectsRenderingInteractor$startListening$8 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsRenderingInteractor$startListening$8(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectsRenderingInteractor$startListening$8 mapObjectsRenderingInteractor$startListening$8 = new MapObjectsRenderingInteractor$startListening$8(this.this$0, continuation);
        mapObjectsRenderingInteractor$startListening$8.L$0 = obj;
        return mapObjectsRenderingInteractor$startListening$8;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsRenderingInteractor$startListening$8) create((fkp) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zlp zlpVar;
        zzs zzsVar;
        fkp fkpVar = (fkp) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (fkpVar != null && (zlpVar = fkpVar.c) != null && (zzsVar = zlpVar.a) != null) {
                o oVar = this.this$0;
                List singletonList = Collections.singletonList(new rxi0(new Point(zzsVar.a, zzsVar.b)));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Set set = o.q;
                if (oVar.d(singletonList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
