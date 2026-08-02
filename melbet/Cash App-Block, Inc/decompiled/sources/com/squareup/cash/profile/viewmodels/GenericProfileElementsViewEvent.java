package com.squareup.cash.profile.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewEvent$ViewAll;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class GenericProfileElementsViewEvent {

    /* loaded from: classes6.dex */
    public final class AddOrRemoveAsFavoriteClicked extends GenericProfileElementsViewEvent {
        public final Color accentColor;
        public final String customerId;
        public final Character monogram;
        public final String name;
        public final Image photo;

        public AddOrRemoveAsFavoriteClicked(String str, String str2, Color color, Image image, Character ch) {
            str.getClass();
            this.customerId = str;
            this.name = str2;
            this.accentColor = color;
            this.photo = image;
            this.monogram = ch;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddOrRemoveAsFavoriteClicked)) {
                return false;
            }
            AddOrRemoveAsFavoriteClicked addOrRemoveAsFavoriteClicked = (AddOrRemoveAsFavoriteClicked) obj;
            return Intrinsics.areEqual(this.customerId, addOrRemoveAsFavoriteClicked.customerId) && this.name.equals(addOrRemoveAsFavoriteClicked.name) && Intrinsics.areEqual(this.accentColor, addOrRemoveAsFavoriteClicked.accentColor) && Intrinsics.areEqual(this.photo, addOrRemoveAsFavoriteClicked.photo) && Intrinsics.areEqual(this.monogram, addOrRemoveAsFavoriteClicked.monogram);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customerId.hashCode() * 31, 31, this.name);
            Color color = this.accentColor;
            int hashCode = (m + (color == null ? 0 : color.hashCode())) * 31;
            Image image = this.photo;
            int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
            Character ch = this.monogram;
            return hashCode2 + (ch != null ? ch.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddOrRemoveAsFavoriteClicked(customerId=", this.customerId, ", name=", this.name, ", accentColor=");
            m.append(this.accentColor);
            m.append(", photo=");
            m.append(this.photo);
            m.append(", monogram=");
            m.append(this.monogram);
            m.append(")");
            return m.toString();
        }
    }

    public final class BlockButtonClicked extends GenericProfileElementsViewEvent {
        public final GenericProfileElement.ButtonElement.BlockAction action;

        public BlockButtonClicked(GenericProfileElement.ButtonElement.BlockAction blockAction) {
            blockAction.getClass();
            this.action = blockAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlockButtonClicked) && Intrinsics.areEqual(this.action, ((BlockButtonClicked) obj).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return "BlockButtonClicked(action=" + this.action + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class FavoritesListAddClicked extends GenericProfileElementsViewEvent {
        public static final FavoritesListAddClicked INSTANCE = new FavoritesListAddClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FavoritesListAddClicked);
        }

        public final int hashCode() {
            return -1470274991;
        }

        public final String toString() {
            return "FavoritesListAddClicked";
        }
    }

    /* loaded from: classes6.dex */
    public final class FavoritesListFavoriteClicked extends GenericProfileElementsViewEvent {
        public final Recipient recipient;

        public FavoritesListFavoriteClicked(Recipient recipient) {
            recipient.getClass();
            this.recipient = recipient;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FavoritesListFavoriteClicked) && Intrinsics.areEqual(this.recipient, ((FavoritesListFavoriteClicked) obj).recipient);
        }

        public final int hashCode() {
            return this.recipient.hashCode();
        }

        public final String toString() {
            return "FavoritesListFavoriteClicked(recipient=" + this.recipient + ")";
        }
    }

    public final class FavoritesListViewAllClicked extends GenericProfileElementsViewEvent {
        public static final FavoritesListViewAllClicked INSTANCE = new FavoritesListViewAllClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FavoritesListViewAllClicked);
        }

        public final int hashCode() {
            return 889720918;
        }

        public final String toString() {
            return "FavoritesListViewAllClicked";
        }
    }

    /* loaded from: classes6.dex */
    public final class PaymentHistoryViewEvent extends GenericProfileElementsViewEvent {
        public final ProfilePaymentHistoryViewEvent$ViewAll event;

        public PaymentHistoryViewEvent(ProfilePaymentHistoryViewEvent$ViewAll profilePaymentHistoryViewEvent$ViewAll) {
            profilePaymentHistoryViewEvent$ViewAll.getClass();
            this.event = profilePaymentHistoryViewEvent$ViewAll;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentHistoryViewEvent) && Intrinsics.areEqual(this.event, ((PaymentHistoryViewEvent) obj).event);
        }

        public final int hashCode() {
            this.event.getClass();
            return -850825642;
        }

        public final String toString() {
            return "PaymentHistoryViewEvent(event=" + this.event + ")";
        }
    }

    public final class ReportProfileClicked extends GenericProfileElementsViewEvent {
        public static final ReportProfileClicked INSTANCE = new ReportProfileClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReportProfileClicked);
        }

        public final int hashCode() {
            return -620035140;
        }

        public final String toString() {
            return "ReportProfileClicked";
        }
    }

    /* loaded from: classes6.dex */
    public final class ReportProfileResult extends GenericProfileElementsViewEvent {
        public final boolean success;

        public ReportProfileResult(boolean z) {
            this.success = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReportProfileResult) && this.success == ((ReportProfileResult) obj).success;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.success);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ReportProfileResult(success=", ")", this.success);
        }
    }
}
