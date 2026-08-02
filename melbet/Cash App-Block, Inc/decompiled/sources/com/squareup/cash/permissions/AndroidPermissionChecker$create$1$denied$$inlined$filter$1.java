package com.squareup.cash.permissions;

import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$8$$inlined$map$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class AndroidPermissionChecker$create$1$denied$$inlined$filter$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ String receiver$inlined;

    public /* synthetic */ AndroidPermissionChecker$create$1$denied$$inlined$filter$1(Flow flow, String str, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.receiver$inlined = str;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.receiver$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, str, 10), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flow.collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, str, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect3 = flow.collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, str, 11), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
