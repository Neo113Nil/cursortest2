package app.cash.local.viewmodels.pos;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes3.dex */
public abstract class LocalPosBrandOnboardingViewModel {

    public final class CallToAction {
        public final String label;
        public final Style style;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Style {
            public static final /* synthetic */ Style[] $VALUES;
            public static final Style LABEL;
            public static final Style PROMINENT_BUTTON;
            public static final Style REGULAR_BUTTON;

            static {
                Style style = new Style("PROMINENT_BUTTON", 0);
                PROMINENT_BUTTON = style;
                Style style2 = new Style("REGULAR_BUTTON", 1);
                REGULAR_BUTTON = style2;
                Style style3 = new Style("LABEL", 2);
                LABEL = style3;
                $VALUES = new Style[]{style, style2, style3};
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public CallToAction(String str, Style style) {
            str.getClass();
            this.label = str;
            this.style = style;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CallToAction)) {
                return false;
            }
            CallToAction callToAction = (CallToAction) obj;
            return Intrinsics.areEqual(this.label, callToAction.label) && this.style == callToAction.style;
        }

        public final int hashCode() {
            return this.style.hashCode() + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return "CallToAction(label=" + this.label + ", style=" + this.style + ")";
        }
    }

    public final class CardModel extends LocalPosBrandOnboardingViewModel {
        public final String body;
        public final BrandCard brandCardContent;
        public final CallToAction callToAction;
        public final LocalColor cardBackgroundColor;
        public final LocalColor cardForegroundColor;
        public final LocalColor cardOutlineColor;
        public final Duration flipDelay;
        public final POSBrandOnboarding.HowItWorks howItWorks;
        public final long initialDelay;
        public final LocalCashCard localCashContent;
        public final String title;

        public final class BrandCard {
            public final LocalImage brandImage;
            public final String brandName;

            public BrandCard(String str, LocalImage localImage) {
                str.getClass();
                localImage.getClass();
                this.brandName = str;
                this.brandImage = localImage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BrandCard)) {
                    return false;
                }
                BrandCard brandCard = (BrandCard) obj;
                return Intrinsics.areEqual(this.brandName, brandCard.brandName) && Intrinsics.areEqual(this.brandImage, brandCard.brandImage);
            }

            public final int hashCode() {
                return this.brandImage.hashCode() + (this.brandName.hashCode() * 31);
            }

            public final String toString() {
                return "BrandCard(brandName=" + this.brandName + ", brandImage=" + this.brandImage + ")";
            }
        }

        public final class LocalCashCard {
            public final String localCashAmount;
            public final String title;

            public LocalCashCard(String str, String str2) {
                this.title = str;
                this.localCashAmount = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LocalCashCard)) {
                    return false;
                }
                LocalCashCard localCashCard = (LocalCashCard) obj;
                return Intrinsics.areEqual(this.title, localCashCard.title) && this.localCashAmount.equals(localCashCard.localCashAmount);
            }

            public final int hashCode() {
                String str = this.title;
                return this.localCashAmount.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("LocalCashCard(title=", this.title, ", localCashAmount=", this.localCashAmount, ")");
            }
        }

        public CardModel(BrandCard brandCard, LocalCashCard localCashCard, LocalColor localColor, LocalColor localColor2, LocalColor localColor3, String str, String str2, POSBrandOnboarding.HowItWorks howItWorks, long j, Duration duration, CallToAction callToAction) {
            this.brandCardContent = brandCard;
            this.localCashContent = localCashCard;
            this.cardForegroundColor = localColor;
            this.cardBackgroundColor = localColor2;
            this.cardOutlineColor = localColor3;
            this.title = str;
            this.body = str2;
            this.howItWorks = howItWorks;
            this.initialDelay = j;
            this.flipDelay = duration;
            this.callToAction = callToAction;
        }

        /* renamed from: copy-j88AKJc$default, reason: not valid java name */
        public static CardModel m1297copyj88AKJc$default(CardModel cardModel, CallToAction callToAction, int i) {
            return new CardModel(cardModel.brandCardContent, (i & 2) != 0 ? cardModel.localCashContent : null, cardModel.cardForegroundColor, cardModel.cardBackgroundColor, cardModel.cardOutlineColor, null, null, null, cardModel.initialDelay, (i & 512) != 0 ? cardModel.flipDelay : null, callToAction);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardModel)) {
                return false;
            }
            CardModel cardModel = (CardModel) obj;
            return this.brandCardContent.equals(cardModel.brandCardContent) && Intrinsics.areEqual(this.localCashContent, cardModel.localCashContent) && Intrinsics.areEqual(this.cardForegroundColor, cardModel.cardForegroundColor) && Intrinsics.areEqual(this.cardBackgroundColor, cardModel.cardBackgroundColor) && Intrinsics.areEqual(this.cardOutlineColor, cardModel.cardOutlineColor) && Intrinsics.areEqual(this.title, cardModel.title) && Intrinsics.areEqual(this.body, cardModel.body) && Intrinsics.areEqual(this.howItWorks, cardModel.howItWorks) && Duration.m4166equalsimpl0(this.initialDelay, cardModel.initialDelay) && Intrinsics.areEqual(this.flipDelay, cardModel.flipDelay) && this.callToAction.equals(cardModel.callToAction);
        }

        @Override // app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel
        public final CallToAction getCallToAction() {
            return this.callToAction;
        }

        @Override // app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel
        public final boolean getHideToolbar() {
            return false;
        }

        public final int hashCode() {
            int hashCode = this.brandCardContent.hashCode() * 31;
            LocalCashCard localCashCard = this.localCashContent;
            int hashCode2 = (hashCode + (localCashCard == null ? 0 : localCashCard.hashCode())) * 31;
            LocalColor localColor = this.cardForegroundColor;
            int hashCode3 = (hashCode2 + (localColor == null ? 0 : localColor.hashCode())) * 31;
            LocalColor localColor2 = this.cardBackgroundColor;
            int hashCode4 = (hashCode3 + (localColor2 == null ? 0 : localColor2.hashCode())) * 31;
            LocalColor localColor3 = this.cardOutlineColor;
            int hashCode5 = (hashCode4 + (localColor3 == null ? 0 : localColor3.hashCode())) * 31;
            String str = this.title;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.body;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            POSBrandOnboarding.HowItWorks howItWorks = this.howItWorks;
            int hashCode8 = (hashCode7 + (howItWorks == null ? 0 : howItWorks.hashCode())) * 31;
            Duration.Companion companion = Duration.Companion;
            int m = Recorder$$ExternalSyntheticOutline2.m(hashCode8, 31, this.initialDelay);
            Duration duration = this.flipDelay;
            return Boolean.hashCode(false) + ((this.callToAction.hashCode() + ((m + (duration == null ? 0 : Long.hashCode(duration.rawValue))) * 31)) * 31);
        }

        public final String toString() {
            return "CardModel(brandCardContent=" + this.brandCardContent + ", localCashContent=" + this.localCashContent + ", cardForegroundColor=" + this.cardForegroundColor + ", cardBackgroundColor=" + this.cardBackgroundColor + ", cardOutlineColor=" + this.cardOutlineColor + ", title=" + this.title + ", body=" + this.body + ", howItWorks=" + this.howItWorks + ", initialDelay=" + Duration.m4177toStringimpl(this.initialDelay) + ", flipDelay=" + this.flipDelay + ", callToAction=" + this.callToAction + ", hideToolbar=false)";
        }
    }

    public final class LegalConsentModel extends LocalPosBrandOnboardingViewModel {
        public final CallToAction callToAction;
        public final POSBrandOnboarding.LegalConsent legalConsent;

        public LegalConsentModel(POSBrandOnboarding.LegalConsent legalConsent, CallToAction callToAction) {
            this.legalConsent = legalConsent;
            this.callToAction = callToAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LegalConsentModel)) {
                return false;
            }
            LegalConsentModel legalConsentModel = (LegalConsentModel) obj;
            return Intrinsics.areEqual(this.legalConsent, legalConsentModel.legalConsent) && this.callToAction.equals(legalConsentModel.callToAction);
        }

        @Override // app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel
        public final CallToAction getCallToAction() {
            return this.callToAction;
        }

        @Override // app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel
        public final boolean getHideToolbar() {
            return false;
        }

        public final int hashCode() {
            POSBrandOnboarding.LegalConsent legalConsent = this.legalConsent;
            int hashCode = legalConsent == null ? 0 : legalConsent.hashCode();
            return Boolean.hashCode(false) + ((this.callToAction.hashCode() + (hashCode * 31)) * 31);
        }

        public final String toString() {
            return "LegalConsentModel(legalConsent=" + this.legalConsent + ", callToAction=" + this.callToAction + ", hideToolbar=false)";
        }
    }

    public abstract CallToAction getCallToAction();

    public abstract boolean getHideToolbar();
}
