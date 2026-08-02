package ru.yandex.taxi.routeselector.presentation;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.e1c0;
import defpackage.f1c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPinV2StateRepository$stateFullInfoFlow$1", f = "RouteSelectorPinV2StateRepository.kt", l = {67, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorPinV2StateRepository$stateFullInfoFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorPinV2StateRepository$stateFullInfoFlow$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteSelectorPinV2StateRepository$stateFullInfoFlow$1 routeSelectorPinV2StateRepository$stateFullInfoFlow$1 = new RouteSelectorPinV2StateRepository$stateFullInfoFlow$1(this.this$0, continuation);
        routeSelectorPinV2StateRepository$stateFullInfoFlow$1.L$0 = obj;
        return routeSelectorPinV2StateRepository$stateFullInfoFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteSelectorPinV2StateRepository$stateFullInfoFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r8, r0, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r8 == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f1c0 f1c0Var = this.this$0.c;
            this.L$0 = vprVar;
            this.label = 1;
            obj = f1c0Var.a(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        }
        l lVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = vprVar;
        this.label = 2;
        obj = l.c(lVar, (e1c0) obj, this);
    }
}
