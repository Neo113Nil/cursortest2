package ru.yandex.taxi.layers.presentation.optimalview;

import com.yandex.go.dto.response.Action$Payload;
import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.gh00;
import defpackage.jst;
import defpackage.mq00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.t4e0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.layers.domain.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.optimalview.MapObservationPresenter$zoomByObjectTypes$2", f = "MapObservationPresenter.kt", l = {120}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObservationPresenter$zoomByObjectTypes$2 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onSuccess;
    final /* synthetic */ List<Action$Payload.ObjectType> $types;
    final /* synthetic */ boolean $waitForResponse;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObservationPresenter$zoomByObjectTypes$2(c cVar, List list, boolean z, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$types = list;
        this.$waitForResponse = z;
        this.$onSuccess = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObservationPresenter$zoomByObjectTypes$2(this.this$0, this.$types, this.$waitForResponse, this.$onSuccess, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObservationPresenter$zoomByObjectTypes$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        sls slsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                List<Action$Payload.ObjectType> list = this.$types;
                boolean z = this.$waitForResponse;
                sls slsVar2 = this.$onSuccess;
                u uVar = cVar2.z;
                this.L$0 = cVar2;
                this.L$1 = slsVar2;
                this.label = 1;
                Object e = uVar.e(list, this, z);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                cVar = cVar2;
                slsVar = slsVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                slsVar = (sls) this.L$1;
                cVar = (c) this.L$0;
                kotlin.b.b(obj);
            }
            cVar.C.getClass();
            BoundingBox boundingBox = (BoundingBox) t4e0.b((List) obj).orElse(null);
            if (boundingBox != null) {
                ((mq00) cVar.Dg()).collapseForZoom();
                ((gh00) cVar.x).A(boundingBox, null);
                slsVar.invoke();
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            jst.e.j(th);
        }
        return zy11.a;
    }
}
