package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.cc7;
import defpackage.ey4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.TrackingViewModel$launchTrackingTaskUpdating$$inlined$flatMapLatest$1", f = "TrackingViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class TrackingViewModel$launchTrackingTaskUpdating$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingViewModel$launchTrackingTaskUpdating$$inlined$flatMapLatest$1(Continuation continuation, k kVar) {
        super(3, continuation);
        this.this$0 = kVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackingViewModel$launchTrackingTaskUpdating$$inlined$flatMapLatest$1 trackingViewModel$launchTrackingTaskUpdating$$inlined$flatMapLatest$1 = new TrackingViewModel$launchTrackingTaskUpdating$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        trackingViewModel$launchTrackingTaskUpdating$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        trackingViewModel$launchTrackingTaskUpdating$$inlined$flatMapLatest$1.L$1 = obj2;
        return trackingViewModel$launchTrackingTaskUpdating$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            Set set = (Set) this.L$1;
            ArrayList arrayList = new ArrayList(tcc.n(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(new ey4(new cc7(this.this$0.H.b, (String) it.next(), 13), 23));
            }
            kotlinx.coroutines.flow.internal.h J = kotlinx.coroutines.flow.e.J(arrayList);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(J, vprVar, this) == coroutineSingletons) {
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
