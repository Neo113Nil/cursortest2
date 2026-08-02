package ru.yandex.taxi.logistics.sdk.delivery_sdd_slots_selector.ui;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.n6y;
import defpackage.ny61;
import defpackage.qws0;
import defpackage.scc;
import defpackage.t6y;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_sdd_slots_selector.ui.DeliverySddSlotsScreenKt$DeliverySddSlotsScreen$3$1", f = "DeliverySddSlotsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliverySddSlotsScreenKt$DeliverySddSlotsScreen$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $onShown;
    final /* synthetic */ qws0 $slotsState;
    final /* synthetic */ androidx.compose.foundation.lazy.b $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverySddSlotsScreenKt$DeliverySddSlotsScreen$3$1(qws0 qws0Var, androidx.compose.foundation.lazy.b bVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$slotsState = qws0Var;
        this.$state = bVar;
        this.$onShown = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliverySddSlotsScreenKt$DeliverySddSlotsScreen$3$1(this.$slotsState, this.$state, this.$onShown, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliverySddSlotsScreenKt$DeliverySddSlotsScreen$3$1 deliverySddSlotsScreenKt$DeliverySddSlotsScreen$3$1 = (DeliverySddSlotsScreenKt$DeliverySddSlotsScreen$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliverySddSlotsScreenKt$DeliverySddSlotsScreen$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List list;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!this.$slotsState.b) {
            n6y n6yVar = (n6y) kotlin.collections.a.b0(this.$state.j().k);
            int i = 0;
            if (n6yVar != null) {
                t6y t6yVar = (t6y) n6yVar;
                if (this.$state.j().m - t6yVar.o >= t6yVar.p / 2) {
                    z = true;
                    list = this.$state.j().k;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((t6y) ((n6y) it.next())).l, "slot") && (i = i + 1) < 0) {
                                scc.l();
                                throw null;
                            }
                        }
                    }
                    wls wlsVar = this.$onShown;
                    Integer num = new Integer(this.$slotsState.a.size());
                    if (!z) {
                        i--;
                    }
                    wlsVar.invoke(num, new Integer(i));
                }
            }
            z = false;
            list = this.$state.j().k;
            if (list instanceof Collection) {
            }
            it = list.iterator();
            while (it.hasNext()) {
            }
            wls wlsVar2 = this.$onShown;
            Integer num2 = new Integer(this.$slotsState.a.size());
            if (!z) {
            }
            wlsVar2.invoke(num2, new Integer(i));
        }
        return zy11.a;
    }
}
