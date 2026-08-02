package com.squareup.cash.promotionsreferrals.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes7.dex */
public interface PromotionsReferralsHomeViewModel {

    public final class Loaded implements PromotionsReferralsHomeViewModel {
        public final InvitePromotion invitePromotion;
        public final PromotionCode promotionCode;
        public final PromotionsListViewModel promotionsListViewModel;

        public final class InvitePromotion {
            public final boolean enabled;
            public final String subtitle;
            public final String title;

            public InvitePromotion(String str, String str2, boolean z) {
                str.getClass();
                this.title = str;
                this.subtitle = str2;
                this.enabled = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvitePromotion)) {
                    return false;
                }
                InvitePromotion invitePromotion = (InvitePromotion) obj;
                return Intrinsics.areEqual(this.title, invitePromotion.title) && this.subtitle.equals(invitePromotion.subtitle) && this.enabled == invitePromotion.enabled;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.enabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvitePromotion(title=", this.title, ", subtitle=", this.subtitle, ", enabled="), this.enabled, ")");
            }
        }

        public final class PromotionCode {
            public final String title;

            public PromotionCode(String str) {
                str.getClass();
                this.title = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PromotionCode) && Intrinsics.areEqual(this.title, ((PromotionCode) obj).title);
            }

            public final int hashCode() {
                return this.title.hashCode() + (Boolean.hashCode(true) * 31);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromotionCode(enabled=true, title=", this.title, ")");
            }
        }

        public final class PromotionsListViewModel {
            public final ActivePromotionsSectionViewModel activePromotionsSection;
            public final AvailablePromotionsSectionViewModel availablePromotionsSection;

            public final class ActivePromotionsSectionViewModel {
                public final ImmutableList promotions;
                public final String titleText;

                public final class ActivePromotionViewModel {
                    public final String actionUrl;
                    public final String arcadeIcon;
                    public final String subtitleText;
                    public final String titleText;
                    public final PromotionCampaignTokens tokens;

                    public ActivePromotionViewModel(String str, String str2, String str3, String str4, PromotionCampaignTokens promotionCampaignTokens) {
                        str2.getClass();
                        str4.getClass();
                        this.arcadeIcon = str;
                        this.titleText = str2;
                        this.subtitleText = str3;
                        this.actionUrl = str4;
                        this.tokens = promotionCampaignTokens;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ActivePromotionViewModel)) {
                            return false;
                        }
                        ActivePromotionViewModel activePromotionViewModel = (ActivePromotionViewModel) obj;
                        return this.arcadeIcon.equals(activePromotionViewModel.arcadeIcon) && Intrinsics.areEqual(this.titleText, activePromotionViewModel.titleText) && Intrinsics.areEqual(this.subtitleText, activePromotionViewModel.subtitleText) && Intrinsics.areEqual(this.actionUrl, activePromotionViewModel.actionUrl) && this.tokens.equals(activePromotionViewModel.tokens);
                    }

                    public final int hashCode() {
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.arcadeIcon.hashCode() * 31, 31, this.titleText);
                        String str = this.subtitleText;
                        return this.tokens.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.actionUrl);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivePromotionViewModel(arcadeIcon=", this.arcadeIcon, ", titleText=", this.titleText, ", subtitleText=");
                        Boxes$$ExternalSyntheticOutline1.m(m, this.subtitleText, ", actionUrl=", this.actionUrl, ", tokens=");
                        m.append(this.tokens);
                        m.append(")");
                        return m.toString();
                    }
                }

                public ActivePromotionsSectionViewModel(String str, AbstractPersistentList abstractPersistentList) {
                    abstractPersistentList.getClass();
                    this.titleText = str;
                    this.promotions = abstractPersistentList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ActivePromotionsSectionViewModel)) {
                        return false;
                    }
                    ActivePromotionsSectionViewModel activePromotionsSectionViewModel = (ActivePromotionsSectionViewModel) obj;
                    return Intrinsics.areEqual(this.titleText, activePromotionsSectionViewModel.titleText) && Intrinsics.areEqual(this.promotions, activePromotionsSectionViewModel.promotions);
                }

                public final int hashCode() {
                    String str = this.titleText;
                    return this.promotions.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
                }

                public final String toString() {
                    return "ActivePromotionsSectionViewModel(titleText=" + this.titleText + ", promotions=" + this.promotions + ")";
                }
            }

            public final class AvailablePromotionsSectionViewModel {
                public final ImmutableList promotions;
                public final String titleText;

                public final class AvailablePromotionViewModel {
                    public final String actionUrl;
                    public final String callToActionText;
                    public final RemoteImage image;
                    public final String subtitleText;
                    public final String titleText;
                    public final PromotionCampaignTokens tokens;

                    public AvailablePromotionViewModel(String str, String str2, String str3, String str4, RemoteImage remoteImage, PromotionCampaignTokens promotionCampaignTokens) {
                        re$$ExternalSyntheticOutline0.m1432m(str, str3, str4);
                        this.titleText = str;
                        this.subtitleText = str2;
                        this.callToActionText = str3;
                        this.actionUrl = str4;
                        this.image = remoteImage;
                        this.tokens = promotionCampaignTokens;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof AvailablePromotionViewModel)) {
                            return false;
                        }
                        AvailablePromotionViewModel availablePromotionViewModel = (AvailablePromotionViewModel) obj;
                        return Intrinsics.areEqual(this.titleText, availablePromotionViewModel.titleText) && Intrinsics.areEqual(this.subtitleText, availablePromotionViewModel.subtitleText) && Intrinsics.areEqual(this.callToActionText, availablePromotionViewModel.callToActionText) && Intrinsics.areEqual(this.actionUrl, availablePromotionViewModel.actionUrl) && this.image.equals(availablePromotionViewModel.image) && this.tokens.equals(availablePromotionViewModel.tokens);
                    }

                    public final int hashCode() {
                        int hashCode = this.titleText.hashCode() * 31;
                        String str = this.subtitleText;
                        return this.tokens.hashCode() + ((this.image.url.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.callToActionText), 31, this.actionUrl)) * 31);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvailablePromotionViewModel(titleText=", this.titleText, ", subtitleText=", this.subtitleText, ", callToActionText=");
                        Boxes$$ExternalSyntheticOutline1.m(m, this.callToActionText, ", actionUrl=", this.actionUrl, ", image=");
                        m.append(this.image);
                        m.append(", tokens=");
                        m.append(this.tokens);
                        m.append(")");
                        return m.toString();
                    }
                }

                public AvailablePromotionsSectionViewModel(String str, AbstractPersistentList abstractPersistentList) {
                    abstractPersistentList.getClass();
                    this.titleText = str;
                    this.promotions = abstractPersistentList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AvailablePromotionsSectionViewModel)) {
                        return false;
                    }
                    AvailablePromotionsSectionViewModel availablePromotionsSectionViewModel = (AvailablePromotionsSectionViewModel) obj;
                    return Intrinsics.areEqual(this.titleText, availablePromotionsSectionViewModel.titleText) && Intrinsics.areEqual(this.promotions, availablePromotionsSectionViewModel.promotions);
                }

                public final int hashCode() {
                    String str = this.titleText;
                    return this.promotions.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
                }

                public final String toString() {
                    return "AvailablePromotionsSectionViewModel(titleText=" + this.titleText + ", promotions=" + this.promotions + ")";
                }
            }

            public final class PromotionCampaignTokens {
                public final String campaignToken;
                public final String campaignVariantToken;

                public PromotionCampaignTokens(String str, String str2) {
                    this.campaignToken = str;
                    this.campaignVariantToken = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PromotionCampaignTokens)) {
                        return false;
                    }
                    PromotionCampaignTokens promotionCampaignTokens = (PromotionCampaignTokens) obj;
                    return Intrinsics.areEqual(this.campaignToken, promotionCampaignTokens.campaignToken) && Intrinsics.areEqual(this.campaignVariantToken, promotionCampaignTokens.campaignVariantToken);
                }

                public final int hashCode() {
                    String str = this.campaignToken;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.campaignVariantToken;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("PromotionCampaignTokens(campaignToken=", this.campaignToken, ", campaignVariantToken=", this.campaignVariantToken, ")");
                }
            }

            public final class RemoteImage {
                public final ImageUrl url;

                public final class ImageUrl {
                    public final String dark;
                    public final String light;

                    public ImageUrl(String str, String str2) {
                        str.getClass();
                        str2.getClass();
                        this.light = str;
                        this.dark = str2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ImageUrl)) {
                            return false;
                        }
                        ImageUrl imageUrl = (ImageUrl) obj;
                        return Intrinsics.areEqual(this.light, imageUrl.light) && Intrinsics.areEqual(this.dark, imageUrl.dark);
                    }

                    public final int hashCode() {
                        return this.dark.hashCode() + (this.light.hashCode() * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("ImageUrl(light=", this.light, ", dark=", this.dark, ")");
                    }
                }

                public RemoteImage(ImageUrl imageUrl) {
                    this.url = imageUrl;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof RemoteImage) && this.url.equals(((RemoteImage) obj).url);
                }

                public final int hashCode() {
                    return this.url.hashCode();
                }

                public final String toString() {
                    return "RemoteImage(url=" + this.url + ")";
                }
            }

            public PromotionsListViewModel(ActivePromotionsSectionViewModel activePromotionsSectionViewModel, AvailablePromotionsSectionViewModel availablePromotionsSectionViewModel) {
                this.activePromotionsSection = activePromotionsSectionViewModel;
                this.availablePromotionsSection = availablePromotionsSectionViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PromotionsListViewModel)) {
                    return false;
                }
                PromotionsListViewModel promotionsListViewModel = (PromotionsListViewModel) obj;
                return Intrinsics.areEqual(this.activePromotionsSection, promotionsListViewModel.activePromotionsSection) && Intrinsics.areEqual(this.availablePromotionsSection, promotionsListViewModel.availablePromotionsSection);
            }

            public final int hashCode() {
                ActivePromotionsSectionViewModel activePromotionsSectionViewModel = this.activePromotionsSection;
                int hashCode = (activePromotionsSectionViewModel == null ? 0 : activePromotionsSectionViewModel.hashCode()) * 31;
                AvailablePromotionsSectionViewModel availablePromotionsSectionViewModel = this.availablePromotionsSection;
                return hashCode + (availablePromotionsSectionViewModel != null ? availablePromotionsSectionViewModel.hashCode() : 0);
            }

            public final String toString() {
                return "PromotionsListViewModel(activePromotionsSection=" + this.activePromotionsSection + ", availablePromotionsSection=" + this.availablePromotionsSection + ")";
            }
        }

        public Loaded(InvitePromotion invitePromotion, PromotionCode promotionCode, PromotionsListViewModel promotionsListViewModel) {
            this.invitePromotion = invitePromotion;
            this.promotionCode = promotionCode;
            this.promotionsListViewModel = promotionsListViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.invitePromotion.equals(loaded.invitePromotion) && Intrinsics.areEqual(this.promotionCode, loaded.promotionCode) && Intrinsics.areEqual(this.promotionsListViewModel, loaded.promotionsListViewModel);
        }

        public final int hashCode() {
            int hashCode = this.invitePromotion.hashCode() * 31;
            PromotionCode promotionCode = this.promotionCode;
            int hashCode2 = (hashCode + (promotionCode == null ? 0 : promotionCode.hashCode())) * 31;
            PromotionsListViewModel promotionsListViewModel = this.promotionsListViewModel;
            return hashCode2 + (promotionsListViewModel != null ? promotionsListViewModel.hashCode() : 0);
        }

        public final String toString() {
            return "Loaded(invitePromotion=" + this.invitePromotion + ", promotionCode=" + this.promotionCode + ", promotionsListViewModel=" + this.promotionsListViewModel + ")";
        }
    }

    public final class Loading implements PromotionsReferralsHomeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 60606098;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
