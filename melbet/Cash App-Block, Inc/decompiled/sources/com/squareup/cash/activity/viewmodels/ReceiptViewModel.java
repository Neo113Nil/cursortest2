package com.squareup.cash.activity.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.ReceiptSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes5.dex */
public interface ReceiptViewModel {

    public final class Loaded implements ReceiptViewModel {
        public final String amount;
        public final String amountAlternate;
        public final PaymentHistoryData.AmountTreatment amountAlternateTreatment;
        public final PaymentHistoryData.AmountTreatment amountTreatment;
        public final StackedAvatarViewModel avatar;
        public final AvatarBadgeViewModel avatarBadge;
        public final PaymentHistoryButton primaryButton;
        public final ReactionsState reactionsState;
        public final List receiptSections;
        public final PaymentHistoryButton secondaryButton;
        public final Subtitle subtitle;
        public final ReceiptSection.TimelineEntry.EventDetailsOverlay timelineDetailsOverlay;
        public final String title;
        public final Icons titleIcon;

        public Loaded(String str, Subtitle subtitle, String str2, PaymentHistoryData.AmountTreatment amountTreatment, String str3, PaymentHistoryData.AmountTreatment amountTreatment2, StackedAvatarViewModel stackedAvatarViewModel, AvatarBadgeViewModel avatarBadgeViewModel, List list, PaymentHistoryButton paymentHistoryButton, PaymentHistoryButton paymentHistoryButton2, Icons icons, ReceiptSection.TimelineEntry.EventDetailsOverlay eventDetailsOverlay, ReactionsState reactionsState) {
            list.getClass();
            reactionsState.getClass();
            this.title = str;
            this.subtitle = subtitle;
            this.amount = str2;
            this.amountTreatment = amountTreatment;
            this.amountAlternate = str3;
            this.amountAlternateTreatment = amountTreatment2;
            this.avatar = stackedAvatarViewModel;
            this.avatarBadge = avatarBadgeViewModel;
            this.receiptSections = list;
            this.primaryButton = paymentHistoryButton;
            this.secondaryButton = paymentHistoryButton2;
            this.titleIcon = icons;
            this.timelineDetailsOverlay = eventDetailsOverlay;
            this.reactionsState = reactionsState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.title.equals(loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.amount, loaded.amount) && this.amountTreatment == loaded.amountTreatment && Intrinsics.areEqual(this.amountAlternate, loaded.amountAlternate) && this.amountAlternateTreatment == loaded.amountAlternateTreatment && this.avatar.equals(loaded.avatar) && Intrinsics.areEqual(this.avatarBadge, loaded.avatarBadge) && Intrinsics.areEqual(this.receiptSections, loaded.receiptSections) && Intrinsics.areEqual(this.primaryButton, loaded.primaryButton) && Intrinsics.areEqual(this.secondaryButton, loaded.secondaryButton) && this.titleIcon == loaded.titleIcon && Intrinsics.areEqual(this.timelineDetailsOverlay, loaded.timelineDetailsOverlay) && Intrinsics.areEqual(this.reactionsState, loaded.reactionsState);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Subtitle subtitle = this.subtitle;
            int hashCode2 = (hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31;
            String str = this.amount;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            PaymentHistoryData.AmountTreatment amountTreatment = this.amountTreatment;
            int hashCode4 = (hashCode3 + (amountTreatment == null ? 0 : amountTreatment.hashCode())) * 31;
            String str2 = this.amountAlternate;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PaymentHistoryData.AmountTreatment amountTreatment2 = this.amountAlternateTreatment;
            int hashCode6 = (this.avatar.hashCode() + ((hashCode5 + (amountTreatment2 == null ? 0 : amountTreatment2.hashCode())) * 31)) * 31;
            AvatarBadgeViewModel avatarBadgeViewModel = this.avatarBadge;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (avatarBadgeViewModel == null ? 0 : avatarBadgeViewModel.hashCode())) * 31, 31, this.receiptSections);
            PaymentHistoryButton paymentHistoryButton = this.primaryButton;
            int hashCode7 = (m + (paymentHistoryButton == null ? 0 : paymentHistoryButton.hashCode())) * 31;
            PaymentHistoryButton paymentHistoryButton2 = this.secondaryButton;
            int hashCode8 = (hashCode7 + (paymentHistoryButton2 == null ? 0 : paymentHistoryButton2.hashCode())) * 31;
            Icons icons = this.titleIcon;
            int hashCode9 = (hashCode8 + (icons == null ? 0 : icons.hashCode())) * 31;
            ReceiptSection.TimelineEntry.EventDetailsOverlay eventDetailsOverlay = this.timelineDetailsOverlay;
            return this.reactionsState.hashCode() + ((hashCode9 + (eventDetailsOverlay != null ? eventDetailsOverlay.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Loaded(title=" + this.title + ", subtitle=" + this.subtitle + ", amount=" + this.amount + ", amountTreatment=" + this.amountTreatment + ", amountAlternate=" + this.amountAlternate + ", amountAlternateTreatment=" + this.amountAlternateTreatment + ", avatar=" + this.avatar + ", avatarBadge=" + this.avatarBadge + ", receiptSections=" + this.receiptSections + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", titleIcon=" + this.titleIcon + ", timelineDetailsOverlay=" + this.timelineDetailsOverlay + ", reactionsState=" + this.reactionsState + ")";
        }
    }

    public final class Loading implements ReceiptViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 429322572;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class LoadingError implements ReceiptViewModel {
        public final String message;
        public final String title;

        public LoadingError(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.message = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingError)) {
                return false;
            }
            LoadingError loadingError = (LoadingError) obj;
            return Intrinsics.areEqual(this.title, loadingError.title) && Intrinsics.areEqual(this.message, loadingError.message);
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("LoadingError(title=", this.title, ", message=", this.message, ")");
        }
    }

    public interface Subtitle {

        public final class AnnotatedText implements Subtitle {
            public final AbstractPersistentList attributes;
            public final String text;

            public AnnotatedText(String str, AbstractPersistentList abstractPersistentList) {
                abstractPersistentList.getClass();
                this.text = str;
                this.attributes = abstractPersistentList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnnotatedText)) {
                    return false;
                }
                AnnotatedText annotatedText = (AnnotatedText) obj;
                return this.text.equals(annotatedText.text) && Intrinsics.areEqual(this.attributes, annotatedText.attributes);
            }

            public final int hashCode() {
                return this.attributes.hashCode() + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return "AnnotatedText(text=" + this.text + ", attributes=" + this.attributes + ")";
            }
        }

        public final class Markdown implements Subtitle {
            public final String rawText;

            public Markdown(String str) {
                this.rawText = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Markdown) && this.rawText.equals(((Markdown) obj).rawText);
            }

            public final int hashCode() {
                return this.rawText.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Markdown(rawText=", this.rawText, ")");
            }
        }
    }
}
