package com.squareup.cash.cdf.blockerflow;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BlockerAction;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BlockerFlowInteractTriggerScheduledAction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final BlockerAction blocker_action;
    public final LinkedHashMap parameters;
    public final Integer scheduled_action_delay_ms;

    public BlockerFlowInteractTriggerScheduledAction(Integer num, BlockerAction blockerAction) {
        this.scheduled_action_delay_ms = num;
        this.blocker_action = blockerAction;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "scheduled_action_delay_ms", num);
        Countries.putSafe(m, "blocker_action", blockerAction);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractTriggerScheduledAction)) {
            return false;
        }
        BlockerFlowInteractTriggerScheduledAction blockerFlowInteractTriggerScheduledAction = (BlockerFlowInteractTriggerScheduledAction) obj;
        return this.scheduled_action_delay_ms.equals(blockerFlowInteractTriggerScheduledAction.scheduled_action_delay_ms) && this.blocker_action == blockerFlowInteractTriggerScheduledAction.blocker_action;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact TriggerScheduledAction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return (this.blocker_action.hashCode() + (this.scheduled_action_delay_ms.hashCode() * 31)) * 961;
    }

    public final String toString() {
        return "BlockerFlowInteractTriggerScheduledAction(scheduled_action_delay_ms=" + this.scheduled_action_delay_ms + ", blocker_action=" + this.blocker_action + ", referrer_flow_token=null, referrer_type=null)";
    }
}
