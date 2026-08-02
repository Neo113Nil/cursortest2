package com.squareup.cash.payments.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PersonalizePaymentRecipientViewEvent {

    public final class Close implements PersonalizePaymentRecipientViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -89813560;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CloseDialog implements PersonalizePaymentRecipientViewEvent {
        public static final CloseDialog INSTANCE = new CloseDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseDialog);
        }

        public final int hashCode() {
            return 1197801776;
        }

        public final String toString() {
            return "CloseDialog";
        }
    }

    public final class DismissOverlay implements PersonalizePaymentRecipientViewEvent {
        public static final DismissOverlay INSTANCE = new DismissOverlay();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissOverlay);
        }

        public final int hashCode() {
            return 1805661334;
        }

        public final String toString() {
            return "DismissOverlay";
        }
    }

    public final class ExistingReactionTapped implements PersonalizePaymentRecipientViewEvent {
        public static final ExistingReactionTapped INSTANCE = new ExistingReactionTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExistingReactionTapped);
        }

        public final int hashCode() {
            return -1587524944;
        }

        public final String toString() {
            return "ExistingReactionTapped";
        }
    }

    public final class HideMoreReactions implements PersonalizePaymentRecipientViewEvent {
        public static final HideMoreReactions INSTANCE = new HideMoreReactions();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HideMoreReactions);
        }

        public final int hashCode() {
            return 1094067523;
        }

        public final String toString() {
            return "HideMoreReactions";
        }
    }

    public final class OnCanvasDrawn implements PersonalizePaymentRecipientViewEvent {
        public final CanvasDetails canvasDetails;

        public OnCanvasDrawn(CanvasDetails canvasDetails) {
            this.canvasDetails = canvasDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCanvasDrawn) && this.canvasDetails.equals(((OnCanvasDrawn) obj).canvasDetails);
        }

        public final int hashCode() {
            return this.canvasDetails.hashCode();
        }

        public final String toString() {
            return "OnCanvasDrawn(canvasDetails=" + this.canvasDetails + ")";
        }
    }

    public final class ReactionTapped implements PersonalizePaymentRecipientViewEvent {
        public final String reaction;

        public ReactionTapped(String str) {
            str.getClass();
            this.reaction = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReactionTapped) && Intrinsics.areEqual(this.reaction, ((ReactionTapped) obj).reaction);
        }

        public final int hashCode() {
            return this.reaction.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReactionTapped(reaction=", this.reaction, ")");
        }
    }

    public final class ReceiptTapped implements PersonalizePaymentRecipientViewEvent {
        public static final ReceiptTapped INSTANCE = new ReceiptTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReceiptTapped);
        }

        public final int hashCode() {
            return -903913804;
        }

        public final String toString() {
            return "ReceiptTapped";
        }
    }

    public final class ReloadResources implements PersonalizePaymentRecipientViewEvent {
        public static final ReloadResources INSTANCE = new ReloadResources();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReloadResources);
        }

        public final int hashCode() {
            return 1079788636;
        }

        public final String toString() {
            return "ReloadResources";
        }
    }

    public final class ReplyButtonTapped implements PersonalizePaymentRecipientViewEvent {
        public static final ReplyButtonTapped INSTANCE = new ReplyButtonTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReplyButtonTapped);
        }

        public final int hashCode() {
            return 1294196792;
        }

        public final String toString() {
            return "ReplyButtonTapped";
        }
    }

    public final class ShowMoreReactions implements PersonalizePaymentRecipientViewEvent {
        public static final ShowMoreReactions INSTANCE = new ShowMoreReactions();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowMoreReactions);
        }

        public final int hashCode() {
            return -1795780760;
        }

        public final String toString() {
            return "ShowMoreReactions";
        }
    }

    public final class TextMeasured implements PersonalizePaymentRecipientViewEvent {
        public final Size size;
        public final Text text;

        public TextMeasured(Text text, Size size) {
            text.getClass();
            this.text = text;
            this.size = size;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextMeasured)) {
                return false;
            }
            TextMeasured textMeasured = (TextMeasured) obj;
            return Intrinsics.areEqual(this.text, textMeasured.text) && this.size.equals(textMeasured.size);
        }

        public final int hashCode() {
            return this.size.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return "TextMeasured(text=" + this.text + ", size=" + this.size + ")";
        }
    }
}
