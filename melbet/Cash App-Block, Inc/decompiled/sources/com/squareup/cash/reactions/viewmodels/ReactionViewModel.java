package com.squareup.cash.reactions.viewmodels;

import com.squareup.cash.db2.ReactionConfig;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ReactionViewModel {

    public final class DisplayAdditional implements ReactionViewModel {
        public final ReactionConfig config;

        public DisplayAdditional(ReactionConfig reactionConfig) {
            reactionConfig.getClass();
            this.config = reactionConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayAdditional) && Intrinsics.areEqual(this.config, ((DisplayAdditional) obj).config);
        }

        public final int hashCode() {
            return this.config.hashCode();
        }

        public final String toString() {
            return "DisplayAdditional(config=" + this.config + ")";
        }
    }

    public final class Loaded implements ReactionViewModel {
        public final ArrayList availableReactions;
        public final ReactionConfig config;
        public final boolean showExtendedPicker;

        public Loaded(ArrayList arrayList, boolean z, ReactionConfig reactionConfig) {
            reactionConfig.getClass();
            this.availableReactions = arrayList;
            this.showExtendedPicker = z;
            this.config = reactionConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.availableReactions.equals(loaded.availableReactions) && this.showExtendedPicker == loaded.showExtendedPicker && Intrinsics.areEqual(this.config, loaded.config);
        }

        public final int hashCode() {
            return this.config.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.availableReactions.hashCode() * 31, 31, this.showExtendedPicker);
        }

        public final String toString() {
            return "Loaded(availableReactions=" + this.availableReactions + ", showExtendedPicker=" + this.showExtendedPicker + ", config=" + this.config + ")";
        }
    }
}
