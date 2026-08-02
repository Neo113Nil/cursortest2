package com.squareup.cash.data.contacts;

import app.cash.badging.backend.Badger$collect$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class RealContactRepository$recents$$inlined$mapItems$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowQuery$mapToList$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ RealContactRepository$recents$$inlined$mapItems$1(FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowQuery$mapToList$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowQuery$mapToList$$inlined$map$1.collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 26), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 11), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
