package com.squareup.cash.activity.viewmodels;

import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ActivityItemViewEvent {

    public final class AvatarClicked implements ActivityItemViewEvent {
        public static final AvatarClicked INSTANCE = new AvatarClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AvatarClicked);
        }

        public final int hashCode() {
            return -1812612895;
        }

        public final String toString() {
            return "AvatarClicked";
        }
    }

    public interface ButtonClicked extends ActivityItemViewEvent {
    }

    public final class InlineButtonClicked implements ButtonClicked {
        public static final InlineButtonClicked INSTANCE = new InlineButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InlineButtonClicked);
        }

        public final int hashCode() {
            return 30621839;
        }

        public final String toString() {
            return "InlineButtonClicked";
        }
    }

    public final class ItemClicked implements ActivityItemViewEvent {
        public static final ItemClicked INSTANCE = new ItemClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ItemClicked);
        }

        public final int hashCode() {
            return -672173401;
        }

        public final String toString() {
            return "ItemClicked";
        }
    }

    public final class PaymentHistoryButtonClicked implements ButtonClicked {
        public final PaymentHistoryButton button;

        public PaymentHistoryButtonClicked(PaymentHistoryButton paymentHistoryButton) {
            paymentHistoryButton.getClass();
            this.button = paymentHistoryButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentHistoryButtonClicked) && Intrinsics.areEqual(this.button, ((PaymentHistoryButtonClicked) obj).button);
        }

        public final int hashCode() {
            return this.button.hashCode();
        }

        public final String toString() {
            return "PaymentHistoryButtonClicked(button=" + this.button + ")";
        }
    }

    public final class ReactionSelected implements ActivityItemViewEvent {
        public final String reaction;

        public ReactionSelected(String str) {
            str.getClass();
            this.reaction = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReactionSelected) && Intrinsics.areEqual(this.reaction, ((ReactionSelected) obj).reaction);
        }

        public final int hashCode() {
            return this.reaction.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReactionSelected(reaction=", this.reaction, ")");
        }
    }

    public final class ReactionSelectorDismissed implements ActivityItemViewEvent {
        public static final ReactionSelectorDismissed INSTANCE = new ReactionSelectorDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReactionSelectorDismissed);
        }

        public final int hashCode() {
            return 2026712116;
        }

        public final String toString() {
            return "ReactionSelectorDismissed";
        }
    }

    public final class VisibilityChanged implements ActivityItemViewEvent {
        public final Visibility visibility;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Visibility {
            public static final /* synthetic */ Visibility[] $VALUES;
            public static final Visibility FullyVisible;
            public static final Visibility Hidden;
            public static final Visibility PartiallyVisible;

            static {
                Visibility visibility = new Visibility("Hidden", 0);
                Hidden = visibility;
                Visibility visibility2 = new Visibility("PartiallyVisible", 1);
                PartiallyVisible = visibility2;
                Visibility visibility3 = new Visibility("FullyVisible", 2);
                FullyVisible = visibility3;
                $VALUES = new Visibility[]{visibility, visibility2, visibility3};
            }

            public static Visibility valueOf(String str) {
                return (Visibility) Enum.valueOf(Visibility.class, str);
            }

            public static Visibility[] values() {
                return (Visibility[]) $VALUES.clone();
            }
        }

        public VisibilityChanged(Visibility visibility) {
            this.visibility = visibility;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VisibilityChanged) && this.visibility == ((VisibilityChanged) obj).visibility;
        }

        public final int hashCode() {
            return this.visibility.hashCode();
        }

        public final String toString() {
            return "VisibilityChanged(visibility=" + this.visibility + ")";
        }
    }
}
