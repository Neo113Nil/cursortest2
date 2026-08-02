package ru.yandex.taxi.linked_order.interactor;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.nly;
import defpackage.ny61;
import defpackage.oly;
import defpackage.ply;
import defpackage.qly;
import defpackage.rly;
import defpackage.sly;
import defpackage.tly;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.interactor.LinkedOrderInfoDataInteractor$expandViewEvent$1", f = "LinkedOrderInfoDataInteractor.kt", l = {54, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 58}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LinkedOrderInfoDataInteractor$expandViewEvent$1 extends SuspendLambda implements wls {
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedOrderInfoDataInteractor$expandViewEvent$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LinkedOrderInfoDataInteractor$expandViewEvent$1 linkedOrderInfoDataInteractor$expandViewEvent$1 = new LinkedOrderInfoDataInteractor$expandViewEvent$1(this.this$0, continuation);
        linkedOrderInfoDataInteractor$expandViewEvent$1.L$0 = obj;
        return linkedOrderInfoDataInteractor$expandViewEvent$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkedOrderInfoDataInteractor$expandViewEvent$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x004a, code lost:
    
        if (r13 == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tly tlyVar;
        long j;
        long j2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            tpr a = hVar.b.a(hVar.a.b);
            this.L$0 = vprVar;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(a, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                j2 = this.J$0;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.J$0 = j2;
                this.label = 3;
                return vprVar.emit(zy11Var, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            kotlin.b.b(obj);
        }
        sly slyVar = (sly) obj;
        this.this$0.getClass();
        if (jl40.l(slyVar, rly.a) || jl40.l(slyVar, qly.a)) {
            tlyVar = null;
        } else if (slyVar instanceof oly) {
            tlyVar = ((oly) slyVar).a;
        } else if (slyVar instanceof nly) {
            tlyVar = ((nly) slyVar).a;
        } else {
            if (!(slyVar instanceof ply)) {
                w511.b();
                return null;
            }
            tlyVar = ((ply) slyVar).a;
        }
        if (tlyVar != null) {
            boolean z = tlyVar.C.length() > 0 || tlyVar.D.length() > 0 || tlyVar.E.length() > 0;
            boolean z2 = tlyVar.F.length() > 0;
            if (z || z2) {
                j = tlyVar.b;
                if (j >= 0) {
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.J$0 = j;
                    this.label = 2;
                    if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                        j2 = j;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.J$0 = j2;
                        this.label = 3;
                        if (vprVar.emit(zy11Var, this) != coroutineSingletons) {
                        }
                    }
                }
            }
        }
        j = -1;
        if (j >= 0) {
        }
    }
}
