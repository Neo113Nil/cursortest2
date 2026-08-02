package com.squareup.cash.afterpayapplet.viewmodels;

import com.squareup.cash.card.onboarding.StyledCardViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface FooterImageContent {

    public final class CardThumbnail implements FooterImageContent {
        public final CardThumbnailDisplayStyle displayStyle;
        public final StyledCardViewModel styledCardViewModel;

        public CardThumbnail(CardThumbnailDisplayStyle cardThumbnailDisplayStyle, StyledCardViewModel styledCardViewModel) {
            this.displayStyle = cardThumbnailDisplayStyle;
            this.styledCardViewModel = styledCardViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardThumbnail)) {
                return false;
            }
            CardThumbnail cardThumbnail = (CardThumbnail) obj;
            return this.displayStyle == cardThumbnail.displayStyle && Intrinsics.areEqual(this.styledCardViewModel, cardThumbnail.styledCardViewModel);
        }

        public final int hashCode() {
            int hashCode = this.displayStyle.hashCode() * 31;
            StyledCardViewModel styledCardViewModel = this.styledCardViewModel;
            return hashCode + (styledCardViewModel == null ? 0 : styledCardViewModel.hashCode());
        }

        public final String toString() {
            return "CardThumbnail(displayStyle=" + this.displayStyle + ", styledCardViewModel=" + this.styledCardViewModel + ")";
        }
    }

    public final class Image implements FooterImageContent {
        public final RemoteImage remoteImage;

        public Image(RemoteImage remoteImage) {
            this.remoteImage = remoteImage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && this.remoteImage.equals(((Image) obj).remoteImage);
        }

        public final int hashCode() {
            return this.remoteImage.url.hashCode();
        }

        public final String toString() {
            return "Image(remoteImage=" + this.remoteImage + ")";
        }
    }
}
