package com.squareup.cash.activity.viewmodels;

import com.squareup.cash.db2.ReactionConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ReactionsState {

    public final class Hidden implements ReactionsState {
        public static final Hidden INSTANCE = new Hidden();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Hidden);
        }

        public final int hashCode() {
            return -1103518817;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    public final class Shown implements ReactionsState {
        public final List availableReactions;
        public final ReactionConfig reactionConfig;

        public Shown(List list, ReactionConfig reactionConfig) {
            list.getClass();
            reactionConfig.getClass();
            this.availableReactions = list;
            this.reactionConfig = reactionConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shown)) {
                return false;
            }
            Shown shown = (Shown) obj;
            return Intrinsics.areEqual(this.availableReactions, shown.availableReactions) && Intrinsics.areEqual(this.reactionConfig, shown.reactionConfig);
        }

        public final int hashCode() {
            return this.reactionConfig.hashCode() + (this.availableReactions.hashCode() * 31);
        }

        public final String toString() {
            return "Shown(availableReactions=" + this.availableReactions + ", reactionConfig=" + this.reactionConfig + ")";
        }
    }
}
