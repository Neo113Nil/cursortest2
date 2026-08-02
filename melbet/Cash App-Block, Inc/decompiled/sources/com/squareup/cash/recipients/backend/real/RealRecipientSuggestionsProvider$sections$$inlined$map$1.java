package com.squareup.cash.recipients.backend.real;

import com.squareup.cash.profile.presenters.UnsupportedSettingPresenter$models$$inlined$CollectEffect$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes7.dex */
public final class RealRecipientSuggestionsProvider$sections$$inlined$map$1 implements Flow {
    public final /* synthetic */ boolean $includeUnknownContacts$inlined;
    public final /* synthetic */ ChannelFlowTransformLatest $this_unsafeTransform$inlined;

    public RealRecipientSuggestionsProvider$sections$$inlined$map$1(ChannelFlowTransformLatest channelFlowTransformLatest, boolean z) {
        this.$this_unsafeTransform$inlined = channelFlowTransformLatest;
        this.$includeUnknownContacts$inlined = z;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new UnsupportedSettingPresenter$models$$inlined$CollectEffect$1$1(flowCollector, this.$includeUnknownContacts$inlined), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }
}
