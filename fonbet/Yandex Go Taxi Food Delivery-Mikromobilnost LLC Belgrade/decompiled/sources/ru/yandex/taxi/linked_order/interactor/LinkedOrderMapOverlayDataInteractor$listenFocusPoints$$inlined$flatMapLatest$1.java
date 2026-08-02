package ru.yandex.taxi.linked_order.interactor;

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
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.interactor.LinkedOrderMapOverlayDataInteractor$listenFocusPoints$$inlined$flatMapLatest$1", f = "LinkedOrderMapOverlayDataInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class LinkedOrderMapOverlayDataInteractor$listenFocusPoints$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ tpr $carPositionSourceFlow$inlined;
    final /* synthetic */ tpr $sourceDestinationSourceFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedOrderMapOverlayDataInteractor$listenFocusPoints$$inlined$flatMapLatest$1(Continuation continuation, f0 f0Var, tpr tprVar, tpr tprVar2) {
        super(3, continuation);
        this.this$0 = f0Var;
        this.$sourceDestinationSourceFlow$inlined = tprVar;
        this.$carPositionSourceFlow$inlined = tprVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinkedOrderMapOverlayDataInteractor$listenFocusPoints$$inlined$flatMapLatest$1 linkedOrderMapOverlayDataInteractor$listenFocusPoints$$inlined$flatMapLatest$1 = new LinkedOrderMapOverlayDataInteractor$listenFocusPoints$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$sourceDestinationSourceFlow$inlined, this.$carPositionSourceFlow$inlined);
        linkedOrderMapOverlayDataInteractor$listenFocusPoints$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        linkedOrderMapOverlayDataInteractor$listenFocusPoints$$inlined$flatMapLatest$1.L$1 = obj2;
        return linkedOrderMapOverlayDataInteractor$listenFocusPoints$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = i.a[((MapFocusType) obj2).ordinal()];
            if (i2 == 1) {
                g92Var = new g92(2, EmptyList.a);
            } else if (i2 == 2) {
                f0 f0Var = this.this$0;
                tpr tprVar = this.$sourceDestinationSourceFlow$inlined;
                int i3 = f0.i;
                f0Var.getClass();
                g92Var = new u(tprVar);
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                f0 f0Var2 = this.this$0;
                tpr tprVar2 = this.$carPositionSourceFlow$inlined;
                tpr tprVar3 = this.$sourceDestinationSourceFlow$inlined;
                int i4 = f0.i;
                f0Var2.getClass();
                g92Var = new m0(tprVar3, com.yandex.go.coroutines.b.j(tprVar2, 2000L), new LinkedOrderMapOverlayDataInteractor$listenFocusAllPoints$1(null, f0Var2));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
