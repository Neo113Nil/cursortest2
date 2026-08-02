package ru.yandex.taxi.linked_order.map;

import defpackage.apy;
import defpackage.cpy;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.map.LinkedOrderRouteProgressTracker$listenRoute$$inlined$flatMapLatest$1", f = "LinkedOrderRouteProgressTracker.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class LinkedOrderRouteProgressTracker$listenRoute$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ tpr $carGeometrySourceFlow$inlined;
    final /* synthetic */ tpr $mapSourceFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ cpy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedOrderRouteProgressTracker$listenRoute$$inlined$flatMapLatest$1(Continuation continuation, cpy cpyVar, tpr tprVar, tpr tprVar2) {
        super(3, continuation);
        this.this$0 = cpyVar;
        this.$mapSourceFlow$inlined = tprVar;
        this.$carGeometrySourceFlow$inlined = tprVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinkedOrderRouteProgressTracker$listenRoute$$inlined$flatMapLatest$1 linkedOrderRouteProgressTracker$listenRoute$$inlined$flatMapLatest$1 = new LinkedOrderRouteProgressTracker$listenRoute$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$mapSourceFlow$inlined, this.$carGeometrySourceFlow$inlined);
        linkedOrderRouteProgressTracker$listenRoute$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        linkedOrderRouteProgressTracker$listenRoute$$inlined$flatMapLatest$1.L$1 = obj2;
        return linkedOrderRouteProgressTracker$listenRoute$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr X;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            switch (apy.a[((LinkedOrderStatusDto) obj2).ordinal()]) {
                case 1:
                    cpy cpyVar = this.this$0;
                    tpr tprVar = this.$mapSourceFlow$inlined;
                    tpr tprVar2 = this.$carGeometrySourceFlow$inlined;
                    cpyVar.getClass();
                    X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(new h(tprVar, true), LinkedOrderRouteProgressTracker$listenRouteParams$2.a), new LinkedOrderRouteProgressTracker$listenRouteParams$$inlined$flatMapLatest$1(tprVar2, cpyVar, null));
                    break;
                case 2:
                    cpy cpyVar2 = this.this$0;
                    tpr tprVar3 = this.$mapSourceFlow$inlined;
                    tpr tprVar4 = this.$carGeometrySourceFlow$inlined;
                    cpyVar2.getClass();
                    X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(new h(tprVar3, false), LinkedOrderRouteProgressTracker$listenRouteParams$2.a), new LinkedOrderRouteProgressTracker$listenRouteParams$$inlined$flatMapLatest$1(tprVar4, cpyVar2, null));
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    X = new g92(2, EmptyList.a);
                    break;
                default:
                    w511.b();
                    return null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(X, vprVar, this) == coroutineSingletons) {
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
