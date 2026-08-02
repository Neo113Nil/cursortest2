package com.squareup.cash.db2;

import com.squareup.cash.db.WireRepeatedAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ReactionConfig {
    public final List extendedReactions;
    public final long maxEmojisPerReaction;

    public final class Adapter {
        public final WireRepeatedAdapter extendedReactionsAdapter;
    }

    public ReactionConfig(long j, List list) {
        this.maxEmojisPerReaction = j;
        this.extendedReactions = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionConfig)) {
            return false;
        }
        ReactionConfig reactionConfig = (ReactionConfig) obj;
        return this.maxEmojisPerReaction == reactionConfig.maxEmojisPerReaction && Intrinsics.areEqual(this.extendedReactions, reactionConfig.extendedReactions);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.maxEmojisPerReaction) * 31;
        List list = this.extendedReactions;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ReactionConfig(maxEmojisPerReaction=" + this.maxEmojisPerReaction + ", extendedReactions=" + this.extendedReactions + ")";
    }
}
