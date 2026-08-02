package com.squareup.cash.payments.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PersonalizedPaymentsReactionsState {

    public final class PendingReaction implements PersonalizedPaymentsReactionsState {
        public final String reaction;

        public PendingReaction(String str) {
            str.getClass();
            this.reaction = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingReaction) && Intrinsics.areEqual(this.reaction, ((PendingReaction) obj).reaction);
        }

        public final int hashCode() {
            return this.reaction.hashCode();
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionBarVisible() {
            return false;
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionButtonVisible() {
            return true;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PendingReaction(reaction=", this.reaction, ")");
        }
    }

    public final class ReactionsAvailable implements PersonalizedPaymentsReactionsState {
        public static final ReactionsAvailable INSTANCE = new ReactionsAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReactionsAvailable);
        }

        public final int hashCode() {
            return 261764601;
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionBarVisible() {
            return false;
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionButtonVisible() {
            return true;
        }

        public final String toString() {
            return "ReactionsAvailable";
        }
    }

    public final class ReactionsDisabled implements PersonalizedPaymentsReactionsState {
        public static final ReactionsDisabled INSTANCE = new ReactionsDisabled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReactionsDisabled);
        }

        public final int hashCode() {
            return -1636603572;
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionBarVisible() {
            return false;
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionButtonVisible() {
            return false;
        }

        public final String toString() {
            return "ReactionsDisabled";
        }
    }

    public final class ShowingExistingReactions implements PersonalizedPaymentsReactionsState {
        public final List existingReactions;

        public ShowingExistingReactions(List list) {
            list.getClass();
            this.existingReactions = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowingExistingReactions) && Intrinsics.areEqual(this.existingReactions, ((ShowingExistingReactions) obj).existingReactions);
        }

        public final int hashCode() {
            return this.existingReactions.hashCode();
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionBarVisible() {
            return false;
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionButtonVisible() {
            return true;
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ShowingExistingReactions(existingReactions=", ")", this.existingReactions);
        }
    }

    public final class ShowingExtendedReactions implements PersonalizedPaymentsReactionsState {
        public final List extendedReactions;

        public ShowingExtendedReactions(List list) {
            this.extendedReactions = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowingExtendedReactions) && this.extendedReactions.equals(((ShowingExtendedReactions) obj).extendedReactions);
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final List getExtendedReactionsList() {
            return this.extendedReactions;
        }

        public final int hashCode() {
            return this.extendedReactions.hashCode();
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionBarVisible() {
            return false;
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionButtonVisible() {
            return true;
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ShowingExtendedReactions(extendedReactions=", ")", this.extendedReactions);
        }
    }

    public final class ShowingQuickReactions implements PersonalizedPaymentsReactionsState {
        public final List quickReactions;

        public ShowingQuickReactions(List list) {
            list.getClass();
            this.quickReactions = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowingQuickReactions) && Intrinsics.areEqual(this.quickReactions, ((ShowingQuickReactions) obj).quickReactions);
        }

        public final int hashCode() {
            return this.quickReactions.hashCode();
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionBarVisible() {
            return true;
        }

        @Override // com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState
        public final boolean isReactionButtonVisible() {
            return true;
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ShowingQuickReactions(quickReactions=", ")", this.quickReactions);
        }
    }

    default List getExtendedReactionsList() {
        return null;
    }

    boolean isReactionBarVisible();

    boolean isReactionButtonVisible();
}
