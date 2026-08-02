package com.squareup.cash.cdf.activityrecord;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ActivityRecordViewEmojiReaction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EmojiReactionEntryPoint entry_point;
    public final Boolean is_treehouse;
    public final LinkedHashMap parameters;
    public final String reaction;

    public ActivityRecordViewEmojiReaction(String str, EmojiReactionEntryPoint emojiReactionEntryPoint, Boolean bool) {
        this.reaction = str;
        this.entry_point = emojiReactionEntryPoint;
        this.is_treehouse = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "ActivityRecord", "cdf_action", "View");
        Countries.putSafe(m, "reaction", str);
        Countries.putSafe(m, "entry_point", emojiReactionEntryPoint);
        Countries.putSafe(m, "is_treehouse", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRecordViewEmojiReaction)) {
            return false;
        }
        ActivityRecordViewEmojiReaction activityRecordViewEmojiReaction = (ActivityRecordViewEmojiReaction) obj;
        return Intrinsics.areEqual(this.reaction, activityRecordViewEmojiReaction.reaction) && this.entry_point == activityRecordViewEmojiReaction.entry_point && Intrinsics.areEqual(this.is_treehouse, activityRecordViewEmojiReaction.is_treehouse);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityRecord View EmojiReaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.reaction;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        EmojiReactionEntryPoint emojiReactionEntryPoint = this.entry_point;
        int hashCode2 = (hashCode + (emojiReactionEntryPoint == null ? 0 : emojiReactionEntryPoint.hashCode())) * 31;
        Boolean bool = this.is_treehouse;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityRecordViewEmojiReaction(reaction=");
        sb.append(this.reaction);
        sb.append(", entry_point=");
        sb.append(this.entry_point);
        sb.append(", is_treehouse=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_treehouse, ")");
    }
}
