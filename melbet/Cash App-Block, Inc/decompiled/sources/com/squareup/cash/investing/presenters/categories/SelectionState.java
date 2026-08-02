package com.squareup.cash.investing.presenters.categories;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SelectionState {

    public final class GroupedSingleSelect implements SelectionState {
        public final Map groups;

        public GroupedSingleSelect(Map map) {
            map.getClass();
            this.groups = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GroupedSingleSelect) && Intrinsics.areEqual(this.groups, ((GroupedSingleSelect) obj).groups);
        }

        public final int hashCode() {
            return this.groups.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("GroupedSingleSelect(groups=", ")", this.groups);
        }
    }

    public final class MultiSelect implements SelectionState {
        public final Set tokens;

        public MultiSelect(Set set) {
            set.getClass();
            this.tokens = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiSelect) && Intrinsics.areEqual(this.tokens, ((MultiSelect) obj).tokens);
        }

        public final int hashCode() {
            return this.tokens.hashCode();
        }

        public final String toString() {
            return "MultiSelect(tokens=" + this.tokens + ")";
        }
    }
}
