package com.squareup.cash.afterpayapplet.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.UpsellSheet;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomeContentViewModel implements AfterpayAppletHomeViewModel, AfterpayAppletItemViewed {
    public final TappableIcon headerInfoIcon;
    public final String homeScreenTitleText;
    public final AbstractPersistentList homeSections;
    public final List impressionEvent;
    public final boolean isRefreshing;
    public final DisplayMessage onDisplayMessage;
    public final String scrollToId;

    public final class DisplayMessage {
        public final String clientRouteUrl;
        public final String messageId;
        public final UpsellSheet upsellSheet;

        public DisplayMessage(String str, String str2, UpsellSheet upsellSheet) {
            this.messageId = str;
            this.clientRouteUrl = str2;
            this.upsellSheet = upsellSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayMessage)) {
                return false;
            }
            DisplayMessage displayMessage = (DisplayMessage) obj;
            return Intrinsics.areEqual(this.messageId, displayMessage.messageId) && Intrinsics.areEqual(this.clientRouteUrl, displayMessage.clientRouteUrl) && Intrinsics.areEqual(this.upsellSheet, displayMessage.upsellSheet);
        }

        public final int hashCode() {
            String str = this.messageId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.clientRouteUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UpsellSheet upsellSheet = this.upsellSheet;
            return hashCode2 + (upsellSheet != null ? upsellSheet.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisplayMessage(messageId=", this.messageId, ", clientRouteUrl=", this.clientRouteUrl, ", upsellSheet=");
            m.append(this.upsellSheet);
            m.append(")");
            return m.toString();
        }
    }

    public AfterpayAppletHomeContentViewModel(String str, TappableIcon tappableIcon, boolean z, AbstractPersistentList abstractPersistentList, DisplayMessage displayMessage, String str2, List list) {
        abstractPersistentList.getClass();
        this.homeScreenTitleText = str;
        this.headerInfoIcon = tappableIcon;
        this.isRefreshing = z;
        this.homeSections = abstractPersistentList;
        this.onDisplayMessage = displayMessage;
        this.scrollToId = str2;
        this.impressionEvent = list;
    }

    public static AfterpayAppletHomeContentViewModel copy$default(AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel, boolean z, AbstractPersistentList abstractPersistentList, String str, int i) {
        String str2 = afterpayAppletHomeContentViewModel.homeScreenTitleText;
        TappableIcon tappableIcon = afterpayAppletHomeContentViewModel.headerInfoIcon;
        if ((i & 4) != 0) {
            z = afterpayAppletHomeContentViewModel.isRefreshing;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            abstractPersistentList = afterpayAppletHomeContentViewModel.homeSections;
        }
        AbstractPersistentList abstractPersistentList2 = abstractPersistentList;
        DisplayMessage displayMessage = afterpayAppletHomeContentViewModel.onDisplayMessage;
        if ((i & 64) != 0) {
            str = afterpayAppletHomeContentViewModel.scrollToId;
        }
        List list = afterpayAppletHomeContentViewModel.impressionEvent;
        str2.getClass();
        abstractPersistentList2.getClass();
        return new AfterpayAppletHomeContentViewModel(str2, tappableIcon, z2, abstractPersistentList2, displayMessage, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletHomeContentViewModel)) {
            return false;
        }
        AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel = (AfterpayAppletHomeContentViewModel) obj;
        return Intrinsics.areEqual(this.homeScreenTitleText, afterpayAppletHomeContentViewModel.homeScreenTitleText) && Intrinsics.areEqual(this.headerInfoIcon, afterpayAppletHomeContentViewModel.headerInfoIcon) && this.isRefreshing == afterpayAppletHomeContentViewModel.isRefreshing && Intrinsics.areEqual(this.homeSections, afterpayAppletHomeContentViewModel.homeSections) && Intrinsics.areEqual(this.onDisplayMessage, afterpayAppletHomeContentViewModel.onDisplayMessage) && Intrinsics.areEqual(this.scrollToId, afterpayAppletHomeContentViewModel.scrollToId) && Intrinsics.areEqual(this.impressionEvent, afterpayAppletHomeContentViewModel.impressionEvent);
    }

    @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
    public final List getImpressionEvent() {
        return this.impressionEvent;
    }

    public final int hashCode() {
        int hashCode = this.homeScreenTitleText.hashCode() * 31;
        TappableIcon tappableIcon = this.headerInfoIcon;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.homeSections.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (tappableIcon == null ? 0 : tappableIcon.hashCode())) * 31, 31, this.isRefreshing)) * 31, 31, false);
        DisplayMessage displayMessage = this.onDisplayMessage;
        int hashCode2 = (m + (displayMessage == null ? 0 : displayMessage.hashCode())) * 31;
        String str = this.scrollToId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.impressionEvent;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AfterpayAppletHomeContentViewModel(homeScreenTitleText=");
        sb.append(this.homeScreenTitleText);
        sb.append(", headerInfoIcon=");
        sb.append(this.headerInfoIcon);
        sb.append(", isRefreshing=");
        sb.append(this.isRefreshing);
        sb.append(", homeSections=");
        sb.append(this.homeSections);
        sb.append(", showUpsellSheet=false, onDisplayMessage=");
        sb.append(this.onDisplayMessage);
        sb.append(", scrollToId=");
        sb.append(this.scrollToId);
        sb.append(", impressionEvent=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.impressionEvent, ")");
    }

    public final class HomeSection implements AfterpayAppletItemViewed {
        public final SectionContent content;
        public final String id;
        public final List impressionEvent;
        public final boolean showDivider;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class AppletCreditLineType {
            public static final /* synthetic */ AppletCreditLineType[] $VALUES;
            public static final AppletCreditLineType CREDIT_ALL;
            public static final AppletCreditLineType CREDIT_INN;
            public static final AppletCreditLineType CREDIT_ONN;
            public static final AppletCreditLineType CREDIT_RETRO;

            static {
                AppletCreditLineType appletCreditLineType = new AppletCreditLineType("CREDIT_INN", 0);
                CREDIT_INN = appletCreditLineType;
                AppletCreditLineType appletCreditLineType2 = new AppletCreditLineType("CREDIT_RETRO", 1);
                CREDIT_RETRO = appletCreditLineType2;
                AppletCreditLineType appletCreditLineType3 = new AppletCreditLineType("CREDIT_ONN", 2);
                CREDIT_ONN = appletCreditLineType3;
                AppletCreditLineType appletCreditLineType4 = new AppletCreditLineType("CREDIT_ALL", 3);
                CREDIT_ALL = appletCreditLineType4;
                $VALUES = new AppletCreditLineType[]{appletCreditLineType, appletCreditLineType2, appletCreditLineType3, appletCreditLineType4};
            }

            public static AppletCreditLineType valueOf(String str) {
                return (AppletCreditLineType) Enum.valueOf(AppletCreditLineType.class, str);
            }

            public static AppletCreditLineType[] values() {
                return (AppletCreditLineType[]) $VALUES.clone();
            }
        }

        public final class ButtonModel {
            public final ButtonProminence buttonProminence;
            public final String buttonText;
            public final String iconId;
            public final Tap tapAction;

            public ButtonModel(String str, String str2, Tap tap, ButtonProminence buttonProminence) {
                buttonProminence.getClass();
                this.buttonText = str;
                this.iconId = str2;
                this.tapAction = tap;
                this.buttonProminence = buttonProminence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ButtonModel)) {
                    return false;
                }
                ButtonModel buttonModel = (ButtonModel) obj;
                return this.buttonText.equals(buttonModel.buttonText) && Intrinsics.areEqual(this.iconId, buttonModel.iconId) && this.tapAction.equals(buttonModel.tapAction) && this.buttonProminence == buttonModel.buttonProminence;
            }

            public final int hashCode() {
                int hashCode = this.buttonText.hashCode() * 31;
                String str = this.iconId;
                return this.buttonProminence.hashCode() + ((this.tapAction.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ButtonModel(buttonText=", this.buttonText, ", iconId=", this.iconId, ", tapAction=");
                m.append(this.tapAction);
                m.append(", buttonProminence=");
                m.append(this.buttonProminence);
                m.append(")");
                return m.toString();
            }
        }

        public interface CreditSectionHeader {

            public final class DefaultCreditHeader implements CreditSectionHeader {
                public final String actionText;
                public final AppletCreditLineType appletCreditLineType;
                public final String subtitleText;
                public final Tap tapAction;
                public final String titleText;

                public DefaultCreditHeader(String str, String str2, Tap tap, String str3, AppletCreditLineType appletCreditLineType) {
                    this.titleText = str;
                    this.subtitleText = str2;
                    this.tapAction = tap;
                    this.actionText = str3;
                    this.appletCreditLineType = appletCreditLineType;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DefaultCreditHeader)) {
                        return false;
                    }
                    DefaultCreditHeader defaultCreditHeader = (DefaultCreditHeader) obj;
                    return this.titleText.equals(defaultCreditHeader.titleText) && Intrinsics.areEqual(this.subtitleText, defaultCreditHeader.subtitleText) && Intrinsics.areEqual(this.tapAction, defaultCreditHeader.tapAction) && Intrinsics.areEqual(this.actionText, defaultCreditHeader.actionText) && this.appletCreditLineType == defaultCreditHeader.appletCreditLineType;
                }

                public final int hashCode() {
                    int hashCode = this.titleText.hashCode() * 31;
                    String str = this.subtitleText;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Tap tap = this.tapAction;
                    int hashCode3 = (hashCode2 + (tap == null ? 0 : tap.hashCode())) * 31;
                    String str2 = this.actionText;
                    int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    AppletCreditLineType appletCreditLineType = this.appletCreditLineType;
                    return hashCode4 + (appletCreditLineType != null ? appletCreditLineType.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DefaultCreditHeader(titleText=", this.titleText, ", subtitleText=", this.subtitleText, ", tapAction=");
                    m.append(this.tapAction);
                    m.append(", actionText=");
                    m.append(this.actionText);
                    m.append(", appletCreditLineType=");
                    m.append(this.appletCreditLineType);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class FadedCreditHeader implements CreditSectionHeader {
                public final String subtitleText;
                public final String titleText;

                public FadedCreditHeader(String str, String str2) {
                    this.titleText = str;
                    this.subtitleText = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof FadedCreditHeader)) {
                        return false;
                    }
                    FadedCreditHeader fadedCreditHeader = (FadedCreditHeader) obj;
                    return this.titleText.equals(fadedCreditHeader.titleText) && this.subtitleText.equals(fadedCreditHeader.subtitleText);
                }

                public final int hashCode() {
                    return this.subtitleText.hashCode() + (this.titleText.hashCode() * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("FadedCreditHeader(titleText=", this.titleText, ", subtitleText=", this.subtitleText, ")");
                }
            }
        }

        public final class Header {
            public final SectionDisplayEffect displayEffect;
            public final String subtitleText;
            public final Tap tapAction;
            public final String titleText;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class SectionDisplayEffect {
                public static final /* synthetic */ SectionDisplayEffect[] $VALUES;
                public static final SectionDisplayEffect DEFAULT_EFFECT;
                public static final SectionDisplayEffect FADED_EFFECT;

                static {
                    SectionDisplayEffect sectionDisplayEffect = new SectionDisplayEffect("DEFAULT_EFFECT", 0);
                    DEFAULT_EFFECT = sectionDisplayEffect;
                    SectionDisplayEffect sectionDisplayEffect2 = new SectionDisplayEffect("FADED_EFFECT", 1);
                    FADED_EFFECT = sectionDisplayEffect2;
                    $VALUES = new SectionDisplayEffect[]{sectionDisplayEffect, sectionDisplayEffect2};
                }

                public static SectionDisplayEffect valueOf(String str) {
                    return (SectionDisplayEffect) Enum.valueOf(SectionDisplayEffect.class, str);
                }

                public static SectionDisplayEffect[] values() {
                    return (SectionDisplayEffect[]) $VALUES.clone();
                }
            }

            public Header(String str, SectionDisplayEffect sectionDisplayEffect, String str2, Tap tap) {
                this.titleText = str;
                this.displayEffect = sectionDisplayEffect;
                this.subtitleText = str2;
                this.tapAction = tap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Header)) {
                    return false;
                }
                Header header = (Header) obj;
                return Intrinsics.areEqual(this.titleText, header.titleText) && this.displayEffect == header.displayEffect && Intrinsics.areEqual(this.subtitleText, header.subtitleText) && Intrinsics.areEqual(this.tapAction, header.tapAction);
            }

            public final int hashCode() {
                int hashCode = (this.displayEffect.hashCode() + (this.titleText.hashCode() * 31)) * 31;
                String str = this.subtitleText;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Tap tap = this.tapAction;
                return hashCode2 + (tap != null ? tap.hashCode() : 0);
            }

            public final String toString() {
                return "Header(titleText=" + this.titleText + ", displayEffect=" + this.displayEffect + ", subtitleText=" + this.subtitleText + ", tapAction=" + this.tapAction + ")";
            }
        }

        public final class MoneyBarSectionHeader implements CreditSectionHeader {
            public final String actionText;
            public final String amount;
            public final TappableIcon infoIcon;
            public final boolean isEnabled;
            public final ProgressBar progressBar;
            public final String progressEndText;
            public final String progressStartText;
            public final Tap tapAction;
            public final String titleText;

            public final class ProgressBar {
                public final AppletCreditLineType creditLineType;
                public final boolean isMoneyBarAnimationEnabled;
                public final float progress;

                public ProgressBar(AppletCreditLineType appletCreditLineType, float f, boolean z) {
                    this.creditLineType = appletCreditLineType;
                    this.progress = f;
                    this.isMoneyBarAnimationEnabled = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ProgressBar)) {
                        return false;
                    }
                    ProgressBar progressBar = (ProgressBar) obj;
                    return this.creditLineType == progressBar.creditLineType && Float.compare(this.progress, progressBar.progress) == 0 && this.isMoneyBarAnimationEnabled == progressBar.isMoneyBarAnimationEnabled;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.isMoneyBarAnimationEnabled) + CameraState$Type$EnumUnboxingLocalUtility.m(this.progress, this.creditLineType.hashCode() * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ProgressBar(creditLineType=");
                    sb.append(this.creditLineType);
                    sb.append(", progress=");
                    sb.append(this.progress);
                    sb.append(", isMoneyBarAnimationEnabled=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isMoneyBarAnimationEnabled, ")");
                }
            }

            public MoneyBarSectionHeader(String str, String str2, ProgressBar progressBar, String str3, String str4, String str5, Tap tap, TappableIcon tappableIcon, boolean z) {
                re$$ExternalSyntheticOutline0.m1432m(str2, str3, str4);
                this.titleText = str;
                this.amount = str2;
                this.progressBar = progressBar;
                this.progressStartText = str3;
                this.progressEndText = str4;
                this.actionText = str5;
                this.tapAction = tap;
                this.infoIcon = tappableIcon;
                this.isEnabled = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MoneyBarSectionHeader)) {
                    return false;
                }
                MoneyBarSectionHeader moneyBarSectionHeader = (MoneyBarSectionHeader) obj;
                return Intrinsics.areEqual(this.titleText, moneyBarSectionHeader.titleText) && Intrinsics.areEqual(this.amount, moneyBarSectionHeader.amount) && Intrinsics.areEqual(this.progressBar, moneyBarSectionHeader.progressBar) && Intrinsics.areEqual(this.progressStartText, moneyBarSectionHeader.progressStartText) && Intrinsics.areEqual(this.progressEndText, moneyBarSectionHeader.progressEndText) && Intrinsics.areEqual(this.actionText, moneyBarSectionHeader.actionText) && Intrinsics.areEqual(this.tapAction, moneyBarSectionHeader.tapAction) && Intrinsics.areEqual(this.infoIcon, moneyBarSectionHeader.infoIcon) && this.isEnabled == moneyBarSectionHeader.isEnabled;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.progressBar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.titleText.hashCode() * 31, 31, this.amount)) * 31, 31, this.progressStartText), 31, this.progressEndText);
                String str = this.actionText;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                Tap tap = this.tapAction;
                int hashCode2 = (hashCode + (tap == null ? 0 : tap.hashCode())) * 31;
                TappableIcon tappableIcon = this.infoIcon;
                return Boolean.hashCode(this.isEnabled) + ((hashCode2 + (tappableIcon != null ? tappableIcon.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneyBarSectionHeader(titleText=", this.titleText, ", amount=", this.amount, ", progressBar=");
                m.append(this.progressBar);
                m.append(", progressStartText=");
                m.append(this.progressStartText);
                m.append(", progressEndText=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.progressEndText, ", actionText=", this.actionText, ", tapAction=");
                m.append(this.tapAction);
                m.append(", infoIcon=");
                m.append(this.infoIcon);
                m.append(", isEnabled=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isEnabled, ")");
            }
        }

        public HomeSection(String str, boolean z, SectionContent sectionContent, List list) {
            this.id = str;
            this.showDivider = z;
            this.content = sectionContent;
            this.impressionEvent = list;
        }

        public static HomeSection copy$default(HomeSection homeSection, SectionContent sectionContent) {
            return new HomeSection(homeSection.id, homeSection.showDivider, sectionContent, homeSection.impressionEvent);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeSection)) {
                return false;
            }
            HomeSection homeSection = (HomeSection) obj;
            return Intrinsics.areEqual(this.id, homeSection.id) && this.showDivider == homeSection.showDivider && Intrinsics.areEqual(this.content, homeSection.content) && Intrinsics.areEqual(this.impressionEvent, homeSection.impressionEvent);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
        public final List getImpressionEvent() {
            return this.impressionEvent;
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (this.content.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.showDivider)) * 31;
            List list = this.impressionEvent;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("HomeSection(id=", this.id, ", showDivider=", ", content=", this.showDivider);
            m1540m.append(this.content);
            m1540m.append(", impressionEvent=");
            m1540m.append(this.impressionEvent);
            m1540m.append(")");
            return m1540m.toString();
        }

        public /* synthetic */ HomeSection(boolean z, SectionContent sectionContent) {
            this(null, z, sectionContent, null);
        }

        public interface SectionContent {

            public interface AfterpayCardContent {

                public final class CarouselTile {
                    public final AfterpayAppletAnalyticsEventsSpec analytics;
                    public final UiAvatar avatar;
                    public final EngagedItemToken engagedItemToken;
                    public final RemoteImage image;
                    public final String name;
                    public final boolean showDimmer;
                    public final Tap tapAction;

                    public CarouselTile(UiAvatar uiAvatar, String str, RemoteImage remoteImage, Tap tap, boolean z, EngagedItemToken engagedItemToken, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec) {
                        this.avatar = uiAvatar;
                        this.name = str;
                        this.image = remoteImage;
                        this.tapAction = tap;
                        this.showDimmer = z;
                        this.engagedItemToken = engagedItemToken;
                        this.analytics = afterpayAppletAnalyticsEventsSpec;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof CarouselTile)) {
                            return false;
                        }
                        CarouselTile carouselTile = (CarouselTile) obj;
                        return Intrinsics.areEqual(this.avatar, carouselTile.avatar) && this.name.equals(carouselTile.name) && this.image.equals(carouselTile.image) && Intrinsics.areEqual(this.tapAction, carouselTile.tapAction) && this.showDimmer == carouselTile.showDimmer && Intrinsics.areEqual(this.engagedItemToken, carouselTile.engagedItemToken) && Intrinsics.areEqual(this.analytics, carouselTile.analytics);
                    }

                    public final int hashCode() {
                        UiAvatar uiAvatar = this.avatar;
                        int hashCode = (this.image.url.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((uiAvatar == null ? 0 : uiAvatar.hashCode()) * 31, 31, this.name)) * 31;
                        Tap tap = this.tapAction;
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (tap == null ? 0 : tap.hashCode())) * 31, 31, this.showDimmer);
                        EngagedItemToken engagedItemToken = this.engagedItemToken;
                        int hashCode2 = (m + (engagedItemToken == null ? 0 : engagedItemToken.hashCode())) * 31;
                        AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = this.analytics;
                        return hashCode2 + (afterpayAppletAnalyticsEventsSpec != null ? afterpayAppletAnalyticsEventsSpec.hashCode() : 0);
                    }

                    public final String toString() {
                        return "CarouselTile(avatar=" + this.avatar + ", name=" + this.name + ", image=" + this.image + ", tapAction=" + this.tapAction + ", showDimmer=" + this.showDimmer + ", engagedItemToken=" + this.engagedItemToken + ", analytics=" + this.analytics + ")";
                    }
                }

                public final class ImageTextContent implements AfterpayCardContent {
                    public final CashCardThumbnail cashCard;
                    public final RemoteImage image;
                    public final String subtitle;
                    public final Tap tapAction;
                    public final String title;

                    public ImageTextContent(CashCardThumbnail cashCardThumbnail, RemoteImage remoteImage, String str, String str2, Tap tap) {
                        this.cashCard = cashCardThumbnail;
                        this.image = remoteImage;
                        this.title = str;
                        this.subtitle = str2;
                        this.tapAction = tap;
                    }

                    public static ImageTextContent copy$default(ImageTextContent imageTextContent, CashCardThumbnail cashCardThumbnail, int i) {
                        if ((i & 1) != 0) {
                            cashCardThumbnail = imageTextContent.cashCard;
                        }
                        CashCardThumbnail cashCardThumbnail2 = cashCardThumbnail;
                        RemoteImage remoteImage = (i & 2) != 0 ? imageTextContent.image : null;
                        String str = imageTextContent.title;
                        String str2 = imageTextContent.subtitle;
                        Tap tap = imageTextContent.tapAction;
                        imageTextContent.getClass();
                        return new ImageTextContent(cashCardThumbnail2, remoteImage, str, str2, tap);
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ImageTextContent)) {
                            return false;
                        }
                        ImageTextContent imageTextContent = (ImageTextContent) obj;
                        return Intrinsics.areEqual(this.cashCard, imageTextContent.cashCard) && Intrinsics.areEqual(this.image, imageTextContent.image) && Intrinsics.areEqual(this.title, imageTextContent.title) && Intrinsics.areEqual(this.subtitle, imageTextContent.subtitle) && Intrinsics.areEqual(this.tapAction, imageTextContent.tapAction);
                    }

                    public final int hashCode() {
                        CashCardThumbnail cashCardThumbnail = this.cashCard;
                        int hashCode = (cashCardThumbnail == null ? 0 : cashCardThumbnail.hashCode()) * 31;
                        RemoteImage remoteImage = this.image;
                        int hashCode2 = (hashCode + (remoteImage == null ? 0 : remoteImage.url.hashCode())) * 31;
                        String str = this.title;
                        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.subtitle;
                        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        Tap tap = this.tapAction;
                        return hashCode4 + (tap != null ? tap.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("ImageTextContent(cashCard=");
                        sb.append(this.cashCard);
                        sb.append(", image=");
                        sb.append(this.image);
                        sb.append(", title=");
                        Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", tapAction=");
                        sb.append(this.tapAction);
                        sb.append(")");
                        return sb.toString();
                    }
                }

                public final class InlineButton {
                    public final String accessibilityText;
                    public final Tap.Url buttonTapAction;
                    public final String iconId;
                    public final ButtonProminence prominence;
                    public final String text;

                    public InlineButton(String str, String str2, ButtonProminence buttonProminence, String str3, Tap.Url url) {
                        buttonProminence.getClass();
                        this.text = str;
                        this.iconId = str2;
                        this.prominence = buttonProminence;
                        this.accessibilityText = str3;
                        this.buttonTapAction = url;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof InlineButton)) {
                            return false;
                        }
                        InlineButton inlineButton = (InlineButton) obj;
                        return this.text.equals(inlineButton.text) && Intrinsics.areEqual(this.iconId, inlineButton.iconId) && this.prominence == inlineButton.prominence && Intrinsics.areEqual(this.accessibilityText, inlineButton.accessibilityText) && this.buttonTapAction.equals(inlineButton.buttonTapAction);
                    }

                    public final int hashCode() {
                        int hashCode = this.text.hashCode() * 31;
                        String str = this.iconId;
                        int hashCode2 = (this.prominence.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                        String str2 = this.accessibilityText;
                        return this.buttonTapAction.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InlineButton(text=", this.text, ", iconId=", this.iconId, ", prominence=");
                        m.append(this.prominence);
                        m.append(", accessibilityText=");
                        m.append(this.accessibilityText);
                        m.append(", buttonTapAction=");
                        m.append(this.buttonTapAction);
                        m.append(")");
                        return m.toString();
                    }
                }

                public final class TileCarousel implements AfterpayCardContent {
                    public final AbstractPersistentList carouselTiles;

                    public TileCarousel(AbstractPersistentList abstractPersistentList) {
                        abstractPersistentList.getClass();
                        this.carouselTiles = abstractPersistentList;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof TileCarousel) && Intrinsics.areEqual(this.carouselTiles, ((TileCarousel) obj).carouselTiles);
                    }

                    public final int hashCode() {
                        return this.carouselTiles.hashCode();
                    }

                    public final String toString() {
                        return "TileCarousel(carouselTiles=" + this.carouselTiles + ")";
                    }
                }

                public final class TransactionList implements AfterpayCardContent {
                    public final AbstractPersistentList transactions;

                    public TransactionList(AbstractPersistentList abstractPersistentList) {
                        abstractPersistentList.getClass();
                        this.transactions = abstractPersistentList;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof TransactionList) && Intrinsics.areEqual(this.transactions, ((TransactionList) obj).transactions);
                    }

                    public final int hashCode() {
                        return this.transactions.hashCode();
                    }

                    public final String toString() {
                        return "TransactionList(transactions=" + this.transactions + ")";
                    }
                }

                public final class TransactionRowViewModel {
                    public final String amount;
                    public final StackedAvatarViewModel avatar;
                    public final String id;
                    public final List impressionEventSpec;
                    public final InlineButton inlineButton;
                    public final String merchantName;
                    public final String subtitle;
                    public final Tap.Url tapAction;

                    public TransactionRowViewModel(String str, String str2, String str3, String str4, StackedAvatarViewModel stackedAvatarViewModel, Tap.Url url, InlineButton inlineButton, List list, int i) {
                        inlineButton = (i & 128) != 0 ? null : inlineButton;
                        list = (i & 256) != 0 ? null : list;
                        re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
                        this.id = str;
                        this.merchantName = str2;
                        this.subtitle = str3;
                        this.amount = str4;
                        this.avatar = stackedAvatarViewModel;
                        this.tapAction = url;
                        this.inlineButton = inlineButton;
                        this.impressionEventSpec = list;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof TransactionRowViewModel)) {
                            return false;
                        }
                        TransactionRowViewModel transactionRowViewModel = (TransactionRowViewModel) obj;
                        return Intrinsics.areEqual(this.id, transactionRowViewModel.id) && Intrinsics.areEqual(this.merchantName, transactionRowViewModel.merchantName) && this.subtitle.equals(transactionRowViewModel.subtitle) && Intrinsics.areEqual(this.amount, transactionRowViewModel.amount) && this.avatar.equals(transactionRowViewModel.avatar) && Intrinsics.areEqual(this.tapAction, transactionRowViewModel.tapAction) && Intrinsics.areEqual(this.inlineButton, transactionRowViewModel.inlineButton) && Intrinsics.areEqual(this.impressionEventSpec, transactionRowViewModel.impressionEventSpec);
                    }

                    public final int hashCode() {
                        int hashCode = (this.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.merchantName), 31, this.subtitle), 31, this.amount)) * 31;
                        Tap.Url url = this.tapAction;
                        int hashCode2 = (hashCode + (url == null ? 0 : url.hashCode())) * 961;
                        InlineButton inlineButton = this.inlineButton;
                        int hashCode3 = (hashCode2 + (inlineButton == null ? 0 : inlineButton.hashCode())) * 31;
                        List list = this.impressionEventSpec;
                        return hashCode3 + (list != null ? list.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TransactionRowViewModel(id=", this.id, ", merchantName=", this.merchantName, ", subtitle=");
                        Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", amount=", this.amount, ", avatar=");
                        m.append(this.avatar);
                        m.append(", tapAction=");
                        m.append(this.tapAction);
                        m.append(", icon_id=null, inlineButton=");
                        m.append(this.inlineButton);
                        m.append(", impressionEventSpec=");
                        m.append(this.impressionEventSpec);
                        m.append(")");
                        return m.toString();
                    }
                }
            }

            public final class AfterpayCardSection implements SectionContent {
                public final AfterpayCardContent content;
                public final CardFooter footer;
                public final AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader header;

                public AfterpayCardSection(AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, AfterpayCardContent afterpayCardContent, CardFooter cardFooter) {
                    this.header = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
                    this.content = afterpayCardContent;
                    this.footer = cardFooter;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AfterpayCardSection)) {
                        return false;
                    }
                    AfterpayCardSection afterpayCardSection = (AfterpayCardSection) obj;
                    return Intrinsics.areEqual(this.header, afterpayCardSection.header) && Intrinsics.areEqual(this.content, afterpayCardSection.content) && Intrinsics.areEqual(this.footer, afterpayCardSection.footer);
                }

                public final int hashCode() {
                    AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader = this.header;
                    int hashCode = (afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader == null ? 0 : afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.hashCode()) * 31;
                    AfterpayCardContent afterpayCardContent = this.content;
                    int hashCode2 = (hashCode + (afterpayCardContent == null ? 0 : afterpayCardContent.hashCode())) * 31;
                    CardFooter cardFooter = this.footer;
                    return hashCode2 + (cardFooter != null ? cardFooter.hashCode() : 0);
                }

                public final String toString() {
                    return "AfterpayCardSection(header=" + this.header + ", content=" + this.content + ", footer=" + this.footer + ")";
                }
            }

            public final class AfterpayHeroUpsell implements SectionContent {
                public final String body;
                public final String ctaButtonTitle;
                public final String disclaimer;
                public final RemoteImage image;
                public final String title;

                public AfterpayHeroUpsell(String str, String str2, RemoteImage remoteImage, String str3, String str4) {
                    this.title = str;
                    this.body = str2;
                    this.image = remoteImage;
                    this.disclaimer = str3;
                    this.ctaButtonTitle = str4;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AfterpayHeroUpsell)) {
                        return false;
                    }
                    AfterpayHeroUpsell afterpayHeroUpsell = (AfterpayHeroUpsell) obj;
                    return this.title.equals(afterpayHeroUpsell.title) && this.body.equals(afterpayHeroUpsell.body) && this.image.equals(afterpayHeroUpsell.image) && this.disclaimer.equals(afterpayHeroUpsell.disclaimer) && this.ctaButtonTitle.equals(afterpayHeroUpsell.ctaButtonTitle);
                }

                public final int hashCode() {
                    return this.ctaButtonTitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.image.url.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body)) * 31, 31, this.disclaimer);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayHeroUpsell(title=", this.title, ", body=", this.body, ", image=");
                    m.append(this.image);
                    m.append(", disclaimer=");
                    m.append(this.disclaimer);
                    m.append(", ctaButtonTitle=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.ctaButtonTitle, ")");
                }
            }

            public final class AvatarText implements SectionContent {
                public final List avatars;
                public final String subtitleText;
                public final Tap tapAction;
                public final String titleText;

                public AvatarText(List list, String str, String str2, Tap tap) {
                    list.getClass();
                    this.avatars = list;
                    this.titleText = str;
                    this.subtitleText = str2;
                    this.tapAction = tap;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AvatarText)) {
                        return false;
                    }
                    AvatarText avatarText = (AvatarText) obj;
                    return Intrinsics.areEqual(this.avatars, avatarText.avatars) && this.titleText.equals(avatarText.titleText) && this.subtitleText.equals(avatarText.subtitleText) && Intrinsics.areEqual(this.tapAction, avatarText.tapAction);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatars.hashCode() * 31, 31, this.titleText), 31, this.subtitleText);
                    Tap tap = this.tapAction;
                    return m + (tap == null ? 0 : tap.hashCode());
                }

                public final String toString() {
                    StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("AvatarText(avatars=", ", titleText=", this.titleText, ", subtitleText=", this.avatars);
                    m.append(this.subtitleText);
                    m.append(", tapAction=");
                    m.append(this.tapAction);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class BannerSection implements SectionContent {
                public final StackedAvatarViewModel.Avatar avatar;
                public final String buttonText;
                public final String subtitleText;
                public final Tap tapAction;
                public final String titleText;

                public BannerSection(StackedAvatarViewModel.Avatar avatar, String str, String str2, String str3, Tap tap) {
                    this.avatar = avatar;
                    this.titleText = str;
                    this.subtitleText = str2;
                    this.buttonText = str3;
                    this.tapAction = tap;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BannerSection)) {
                        return false;
                    }
                    BannerSection bannerSection = (BannerSection) obj;
                    return Intrinsics.areEqual(this.avatar, bannerSection.avatar) && this.titleText.equals(bannerSection.titleText) && this.subtitleText.equals(bannerSection.subtitleText) && Intrinsics.areEqual(this.buttonText, bannerSection.buttonText) && Intrinsics.areEqual(this.tapAction, bannerSection.tapAction);
                }

                public final int hashCode() {
                    StackedAvatarViewModel.Avatar avatar = this.avatar;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((avatar == null ? 0 : avatar.hashCode()) * 31, 31, this.titleText), 31, this.subtitleText);
                    String str = this.buttonText;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    Tap tap = this.tapAction;
                    return hashCode + (tap != null ? tap.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("BannerSection(avatar=");
                    sb.append(this.avatar);
                    sb.append(", titleText=");
                    sb.append(this.titleText);
                    sb.append(", subtitleText=");
                    Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitleText, ", buttonText=", this.buttonText, ", tapAction=");
                    sb.append(this.tapAction);
                    sb.append(")");
                    return sb.toString();
                }
            }

            public interface CardFooter {

                public final class AvatarTextFooter implements CardFooter {
                    public final List avatars;
                    public final String subtitleText;
                    public final Tap tapAction;
                    public final String titleText;

                    public AvatarTextFooter(List list, String str, String str2, Tap tap) {
                        list.getClass();
                        this.avatars = list;
                        this.titleText = str;
                        this.subtitleText = str2;
                        this.tapAction = tap;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof AvatarTextFooter)) {
                            return false;
                        }
                        AvatarTextFooter avatarTextFooter = (AvatarTextFooter) obj;
                        return Intrinsics.areEqual(this.avatars, avatarTextFooter.avatars) && this.titleText.equals(avatarTextFooter.titleText) && this.subtitleText.equals(avatarTextFooter.subtitleText) && Intrinsics.areEqual(this.tapAction, avatarTextFooter.tapAction);
                    }

                    public final int hashCode() {
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatars.hashCode() * 31, 31, this.titleText), 31, this.subtitleText);
                        Tap tap = this.tapAction;
                        return m + (tap == null ? 0 : tap.hashCode());
                    }

                    public final String toString() {
                        StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("AvatarTextFooter(avatars=", ", titleText=", this.titleText, ", subtitleText=", this.avatars);
                        m.append(this.subtitleText);
                        m.append(", tapAction=");
                        m.append(this.tapAction);
                        m.append(")");
                        return m.toString();
                    }
                }

                public final class ButtonFooter implements CardFooter {
                    public final ButtonModel button;
                    public final String titleText;

                    public ButtonFooter(String str, ButtonModel buttonModel) {
                        this.titleText = str;
                        this.button = buttonModel;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ButtonFooter)) {
                            return false;
                        }
                        ButtonFooter buttonFooter = (ButtonFooter) obj;
                        return this.titleText.equals(buttonFooter.titleText) && Intrinsics.areEqual(this.button, buttonFooter.button);
                    }

                    public final int hashCode() {
                        int hashCode = this.titleText.hashCode() * 31;
                        ButtonModel buttonModel = this.button;
                        return hashCode + (buttonModel == null ? 0 : buttonModel.hashCode());
                    }

                    public final String toString() {
                        return "ButtonFooter(titleText=" + this.titleText + ", button=" + this.button + ")";
                    }
                }

                public final class TappableFooter implements CardFooter {
                    public final FooterImageContent imageContent;
                    public final String subtitleText;
                    public final Tap tapAction;
                    public final String titleText;

                    public TappableFooter(FooterImageContent footerImageContent, String str, String str2, Tap tap) {
                        str.getClass();
                        this.imageContent = footerImageContent;
                        this.titleText = str;
                        this.subtitleText = str2;
                        this.tapAction = tap;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof TappableFooter)) {
                            return false;
                        }
                        TappableFooter tappableFooter = (TappableFooter) obj;
                        return Intrinsics.areEqual(this.imageContent, tappableFooter.imageContent) && Intrinsics.areEqual(this.titleText, tappableFooter.titleText) && Intrinsics.areEqual(this.subtitleText, tappableFooter.subtitleText) && Intrinsics.areEqual(this.tapAction, tappableFooter.tapAction);
                    }

                    public final int hashCode() {
                        FooterImageContent footerImageContent = this.imageContent;
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((footerImageContent == null ? 0 : footerImageContent.hashCode()) * 31, 31, this.titleText);
                        String str = this.subtitleText;
                        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                        Tap tap = this.tapAction;
                        return hashCode + (tap != null ? tap.hashCode() : 0);
                    }

                    public final String toString() {
                        return "TappableFooter(imageContent=" + this.imageContent + ", titleText=" + this.titleText + ", subtitleText=" + this.subtitleText + ", tapAction=" + this.tapAction + ")";
                    }
                }
            }

            public final class CashCardThumbnail {
                public final CardThumbnailDisplayStyle displayStyle;
                public final StyledCardViewModel styledCardViewModel;

                public CashCardThumbnail(CardThumbnailDisplayStyle cardThumbnailDisplayStyle, StyledCardViewModel styledCardViewModel) {
                    this.displayStyle = cardThumbnailDisplayStyle;
                    this.styledCardViewModel = styledCardViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CashCardThumbnail)) {
                        return false;
                    }
                    CashCardThumbnail cashCardThumbnail = (CashCardThumbnail) obj;
                    return this.displayStyle == cashCardThumbnail.displayStyle && Intrinsics.areEqual(this.styledCardViewModel, cashCardThumbnail.styledCardViewModel);
                }

                public final int hashCode() {
                    int hashCode = this.displayStyle.hashCode() * 31;
                    StyledCardViewModel styledCardViewModel = this.styledCardViewModel;
                    return hashCode + (styledCardViewModel == null ? 0 : styledCardViewModel.hashCode());
                }

                public final String toString() {
                    return "CashCardThumbnail(displayStyle=" + this.displayStyle + ", styledCardViewModel=" + this.styledCardViewModel + ")";
                }
            }

            public final class IconText implements SectionContent {
                public final String subtitleText;
                public final Tap tapAction;
                public final TintedIcon tintedIcon;
                public final String titleText;

                public IconText(TintedIcon tintedIcon, String str, String str2, Tap tap) {
                    this.tintedIcon = tintedIcon;
                    this.titleText = str;
                    this.subtitleText = str2;
                    this.tapAction = tap;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof IconText)) {
                        return false;
                    }
                    IconText iconText = (IconText) obj;
                    return this.tintedIcon.equals(iconText.tintedIcon) && this.titleText.equals(iconText.titleText) && Intrinsics.areEqual(this.subtitleText, iconText.subtitleText) && Intrinsics.areEqual(this.tapAction, iconText.tapAction);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.tintedIcon.hashCode() * 31, 31, this.titleText);
                    String str = this.subtitleText;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    Tap tap = this.tapAction;
                    return hashCode + (tap != null ? tap.hashCode() : 0);
                }

                public final String toString() {
                    return "IconText(tintedIcon=" + this.tintedIcon + ", titleText=" + this.titleText + ", subtitleText=" + this.subtitleText + ", tapAction=" + this.tapAction + ")";
                }
            }

            public final class ImageText implements SectionContent {
                public final ButtonModel button;
                public final RemoteImage image;
                public final String subtitleText;
                public final String titleText;

                public ImageText(RemoteImage remoteImage, String str, String str2, ButtonModel buttonModel) {
                    this.image = remoteImage;
                    this.titleText = str;
                    this.subtitleText = str2;
                    this.button = buttonModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ImageText)) {
                        return false;
                    }
                    ImageText imageText = (ImageText) obj;
                    return Intrinsics.areEqual(this.image, imageText.image) && this.titleText.equals(imageText.titleText) && Intrinsics.areEqual(this.subtitleText, imageText.subtitleText) && Intrinsics.areEqual(this.button, imageText.button);
                }

                public final int hashCode() {
                    RemoteImage remoteImage = this.image;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((remoteImage == null ? 0 : remoteImage.url.hashCode()) * 31, 31, this.titleText);
                    String str = this.subtitleText;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    ButtonModel buttonModel = this.button;
                    return hashCode + (buttonModel != null ? buttonModel.hashCode() : 0);
                }

                public final String toString() {
                    return "ImageText(image=" + this.image + ", titleText=" + this.titleText + ", subtitleText=" + this.subtitleText + ", button=" + this.button + ")";
                }
            }

            public final class Legal implements SectionContent {
                public final String iconId;
                public final String legalText;

                public Legal(String str, String str2) {
                    this.legalText = str;
                    this.iconId = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Legal)) {
                        return false;
                    }
                    Legal legal = (Legal) obj;
                    return this.legalText.equals(legal.legalText) && Intrinsics.areEqual(this.iconId, legal.iconId);
                }

                public final int hashCode() {
                    int hashCode = this.legalText.hashCode() * 31;
                    String str = this.iconId;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Legal(legalText=", this.legalText, ", iconId=", this.iconId, ")");
                }
            }

            public final class MoneyBarSection implements SectionContent {
                public final SectionContent content;
                public final MoneyBarSectionHeader moneyBarSectionHeader;

                public MoneyBarSection(MoneyBarSectionHeader moneyBarSectionHeader, SectionContent sectionContent) {
                    this.moneyBarSectionHeader = moneyBarSectionHeader;
                    this.content = sectionContent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof MoneyBarSection)) {
                        return false;
                    }
                    MoneyBarSection moneyBarSection = (MoneyBarSection) obj;
                    return this.moneyBarSectionHeader.equals(moneyBarSection.moneyBarSectionHeader) && Intrinsics.areEqual(this.content, moneyBarSection.content);
                }

                public final int hashCode() {
                    int hashCode = this.moneyBarSectionHeader.hashCode() * 31;
                    SectionContent sectionContent = this.content;
                    return hashCode + (sectionContent == null ? 0 : sectionContent.hashCode());
                }

                public final String toString() {
                    return "MoneyBarSection(moneyBarSectionHeader=" + this.moneyBarSectionHeader + ", content=" + this.content + ")";
                }
            }

            public final class PageHeader implements SectionContent {
                public final AvatarCarousel avatarCarousel;
                public final ButtonModel button;
                public final RemoteImage image;
                public final String subtitleText;
                public final Tap tapAction;
                public final String titleText;

                public final class AvatarCarousel {
                    public final ArrayList avatarItems;

                    public final class AvatarItem {
                        public final List analyticsViewEvent;
                        public final UiAvatar avatar;
                        public final EngagedItemToken engagedItemToken;
                        public final Tap tapAction;

                        public AvatarItem(List list, Tap tap, UiAvatar uiAvatar, EngagedItemToken engagedItemToken) {
                            this.analyticsViewEvent = list;
                            this.tapAction = tap;
                            this.avatar = uiAvatar;
                            this.engagedItemToken = engagedItemToken;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof AvatarItem)) {
                                return false;
                            }
                            AvatarItem avatarItem = (AvatarItem) obj;
                            return Intrinsics.areEqual(this.analyticsViewEvent, avatarItem.analyticsViewEvent) && Intrinsics.areEqual(this.tapAction, avatarItem.tapAction) && Intrinsics.areEqual(this.avatar, avatarItem.avatar) && Intrinsics.areEqual(this.engagedItemToken, avatarItem.engagedItemToken);
                        }

                        public final int hashCode() {
                            List list = this.analyticsViewEvent;
                            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                            Tap tap = this.tapAction;
                            int hashCode2 = (hashCode + (tap == null ? 0 : tap.hashCode())) * 31;
                            UiAvatar uiAvatar = this.avatar;
                            int hashCode3 = (hashCode2 + (uiAvatar == null ? 0 : uiAvatar.hashCode())) * 31;
                            EngagedItemToken engagedItemToken = this.engagedItemToken;
                            return hashCode3 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0);
                        }

                        public final String toString() {
                            return "AvatarItem(analyticsViewEvent=" + this.analyticsViewEvent + ", tapAction=" + this.tapAction + ", avatar=" + this.avatar + ", engagedItemToken=" + this.engagedItemToken + ")";
                        }
                    }

                    public AvatarCarousel(ArrayList arrayList) {
                        this.avatarItems = arrayList;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof AvatarCarousel) && this.avatarItems.equals(((AvatarCarousel) obj).avatarItems);
                    }

                    public final int hashCode() {
                        return this.avatarItems.hashCode();
                    }

                    public final String toString() {
                        return Request$Priority$EnumUnboxingLocalUtility.m("AvatarCarousel(avatarItems=", ")", this.avatarItems);
                    }
                }

                public PageHeader(String str, String str2, ButtonModel buttonModel, Tap tap, AvatarCarousel avatarCarousel, RemoteImage remoteImage) {
                    this.titleText = str;
                    this.subtitleText = str2;
                    this.button = buttonModel;
                    this.tapAction = tap;
                    this.avatarCarousel = avatarCarousel;
                    this.image = remoteImage;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PageHeader)) {
                        return false;
                    }
                    PageHeader pageHeader = (PageHeader) obj;
                    return Intrinsics.areEqual(this.titleText, pageHeader.titleText) && Intrinsics.areEqual(this.subtitleText, pageHeader.subtitleText) && Intrinsics.areEqual(this.button, pageHeader.button) && Intrinsics.areEqual(this.tapAction, pageHeader.tapAction) && Intrinsics.areEqual(this.avatarCarousel, pageHeader.avatarCarousel) && Intrinsics.areEqual(this.image, pageHeader.image);
                }

                public final int hashCode() {
                    int hashCode = this.titleText.hashCode() * 31;
                    String str = this.subtitleText;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    ButtonModel buttonModel = this.button;
                    int hashCode3 = (hashCode2 + (buttonModel == null ? 0 : buttonModel.hashCode())) * 31;
                    Tap tap = this.tapAction;
                    int hashCode4 = (hashCode3 + (tap == null ? 0 : tap.hashCode())) * 31;
                    AvatarCarousel avatarCarousel = this.avatarCarousel;
                    int hashCode5 = (hashCode4 + (avatarCarousel == null ? 0 : avatarCarousel.avatarItems.hashCode())) * 31;
                    RemoteImage remoteImage = this.image;
                    return hashCode5 + (remoteImage != null ? remoteImage.url.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PageHeader(titleText=", this.titleText, ", subtitleText=", this.subtitleText, ", button=");
                    m.append(this.button);
                    m.append(", tapAction=");
                    m.append(this.tapAction);
                    m.append(", avatarCarousel=");
                    m.append(this.avatarCarousel);
                    m.append(", image=");
                    m.append(this.image);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class PaymentManagement implements SectionContent {
                public final NextDueRow nextDueRow;
                public final OverDueRow overDueRow;
                public final ButtonModel paymentButton;
                public final Header sectionHeader;
                public final TotalOwedRow totalOwedRow;

                public final class NextDueRow {
                    public final String moneyText;
                    public final String prefixText;

                    public NextDueRow(String str, String str2) {
                        this.prefixText = str;
                        this.moneyText = str2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof NextDueRow)) {
                            return false;
                        }
                        NextDueRow nextDueRow = (NextDueRow) obj;
                        return this.prefixText.equals(nextDueRow.prefixText) && Intrinsics.areEqual(this.moneyText, nextDueRow.moneyText);
                    }

                    public final int hashCode() {
                        int hashCode = this.prefixText.hashCode() * 31;
                        String str = this.moneyText;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("NextDueRow(prefixText=", this.prefixText, ", moneyText=", this.moneyText, ")");
                    }
                }

                public final class OverDueRow {
                    public final String moneyText;
                    public final String prefixText;

                    public OverDueRow(String str, String str2) {
                        this.prefixText = str;
                        this.moneyText = str2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof OverDueRow)) {
                            return false;
                        }
                        OverDueRow overDueRow = (OverDueRow) obj;
                        return this.prefixText.equals(overDueRow.prefixText) && Intrinsics.areEqual(this.moneyText, overDueRow.moneyText);
                    }

                    public final int hashCode() {
                        int hashCode = this.prefixText.hashCode() * 31;
                        String str = this.moneyText;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("OverDueRow(prefixText=", this.prefixText, ", moneyText=", this.moneyText, ")");
                    }
                }

                public final class TotalOwedRow {
                    public final String moneyText;
                    public final String prefixText;

                    public TotalOwedRow(String str, String str2) {
                        this.prefixText = str;
                        this.moneyText = str2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof TotalOwedRow)) {
                            return false;
                        }
                        TotalOwedRow totalOwedRow = (TotalOwedRow) obj;
                        return this.prefixText.equals(totalOwedRow.prefixText) && Intrinsics.areEqual(this.moneyText, totalOwedRow.moneyText);
                    }

                    public final int hashCode() {
                        int hashCode = this.prefixText.hashCode() * 31;
                        String str = this.moneyText;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("TotalOwedRow(prefixText=", this.prefixText, ", moneyText=", this.moneyText, ")");
                    }
                }

                public PaymentManagement(Header header, TotalOwedRow totalOwedRow, NextDueRow nextDueRow, OverDueRow overDueRow, ButtonModel buttonModel) {
                    this.sectionHeader = header;
                    this.totalOwedRow = totalOwedRow;
                    this.nextDueRow = nextDueRow;
                    this.overDueRow = overDueRow;
                    this.paymentButton = buttonModel;
                }

                public static PaymentManagement copy$default(PaymentManagement paymentManagement, ButtonModel buttonModel) {
                    return new PaymentManagement(paymentManagement.sectionHeader, paymentManagement.totalOwedRow, paymentManagement.nextDueRow, paymentManagement.overDueRow, buttonModel);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PaymentManagement)) {
                        return false;
                    }
                    PaymentManagement paymentManagement = (PaymentManagement) obj;
                    return this.sectionHeader.equals(paymentManagement.sectionHeader) && this.totalOwedRow.equals(paymentManagement.totalOwedRow) && Intrinsics.areEqual(this.nextDueRow, paymentManagement.nextDueRow) && Intrinsics.areEqual(this.overDueRow, paymentManagement.overDueRow) && Intrinsics.areEqual(this.paymentButton, paymentManagement.paymentButton);
                }

                public final int hashCode() {
                    int hashCode = (this.totalOwedRow.hashCode() + (this.sectionHeader.hashCode() * 31)) * 31;
                    NextDueRow nextDueRow = this.nextDueRow;
                    int hashCode2 = (hashCode + (nextDueRow == null ? 0 : nextDueRow.hashCode())) * 31;
                    OverDueRow overDueRow = this.overDueRow;
                    int hashCode3 = (hashCode2 + (overDueRow == null ? 0 : overDueRow.hashCode())) * 31;
                    ButtonModel buttonModel = this.paymentButton;
                    return hashCode3 + (buttonModel != null ? buttonModel.hashCode() : 0);
                }

                public final String toString() {
                    return "PaymentManagement(sectionHeader=" + this.sectionHeader + ", totalOwedRow=" + this.totalOwedRow + ", nextDueRow=" + this.nextDueRow + ", overDueRow=" + this.overDueRow + ", paymentButton=" + this.paymentButton + ")";
                }
            }

            public final class PrepurchaseToggleSection implements SectionContent {
                public final boolean isToggleLoading;
                public final StyledCardViewModel styledCardViewModel;
                public final ToggleState toggleState;
                public final ToggleStateContent turnedOffContent;
                public final ToggleStateContent turnedOnContent;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* loaded from: classes4.dex */
                public final class ToggleState {
                    public static final /* synthetic */ ToggleState[] $VALUES;
                    public static final ToggleState DISABLED;
                    public static final ToggleState TURNED_OFF;
                    public static final ToggleState TURNED_ON;

                    static {
                        ToggleState toggleState = new ToggleState("TURNED_ON", 0);
                        TURNED_ON = toggleState;
                        ToggleState toggleState2 = new ToggleState("TURNED_OFF", 1);
                        TURNED_OFF = toggleState2;
                        ToggleState toggleState3 = new ToggleState("DISABLED", 2);
                        DISABLED = toggleState3;
                        $VALUES = new ToggleState[]{toggleState, toggleState2, toggleState3};
                    }

                    public static ToggleState valueOf(String str) {
                        return (ToggleState) Enum.valueOf(ToggleState.class, str);
                    }

                    public static ToggleState[] values() {
                        return (ToggleState[]) $VALUES.clone();
                    }
                }

                public final class ToggleStateContent {
                    public final String footerLabel;
                    public final AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader header;

                    public ToggleStateContent(AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, String str) {
                        this.header = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
                        this.footerLabel = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ToggleStateContent)) {
                            return false;
                        }
                        ToggleStateContent toggleStateContent = (ToggleStateContent) obj;
                        return this.header.equals(toggleStateContent.header) && this.footerLabel.equals(toggleStateContent.footerLabel);
                    }

                    public final int hashCode() {
                        return this.footerLabel.hashCode() + (this.header.hashCode() * 31);
                    }

                    public final String toString() {
                        return "ToggleStateContent(header=" + this.header + ", footerLabel=" + this.footerLabel + ")";
                    }
                }

                public PrepurchaseToggleSection(ToggleStateContent toggleStateContent, ToggleStateContent toggleStateContent2, StyledCardViewModel styledCardViewModel, ToggleState toggleState, boolean z) {
                    this.turnedOnContent = toggleStateContent;
                    this.turnedOffContent = toggleStateContent2;
                    this.styledCardViewModel = styledCardViewModel;
                    this.toggleState = toggleState;
                    this.isToggleLoading = z;
                }

                public static PrepurchaseToggleSection copy$default(PrepurchaseToggleSection prepurchaseToggleSection, StyledCardViewModel styledCardViewModel, ToggleState toggleState, boolean z, int i) {
                    ToggleStateContent toggleStateContent = prepurchaseToggleSection.turnedOnContent;
                    ToggleStateContent toggleStateContent2 = prepurchaseToggleSection.turnedOffContent;
                    if ((i & 4) != 0) {
                        styledCardViewModel = prepurchaseToggleSection.styledCardViewModel;
                    }
                    StyledCardViewModel styledCardViewModel2 = styledCardViewModel;
                    if ((i & 8) != 0) {
                        toggleState = prepurchaseToggleSection.toggleState;
                    }
                    ToggleState toggleState2 = toggleState;
                    if ((i & 16) != 0) {
                        z = prepurchaseToggleSection.isToggleLoading;
                    }
                    prepurchaseToggleSection.getClass();
                    return new PrepurchaseToggleSection(toggleStateContent, toggleStateContent2, styledCardViewModel2, toggleState2, z);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PrepurchaseToggleSection)) {
                        return false;
                    }
                    PrepurchaseToggleSection prepurchaseToggleSection = (PrepurchaseToggleSection) obj;
                    return this.turnedOnContent.equals(prepurchaseToggleSection.turnedOnContent) && this.turnedOffContent.equals(prepurchaseToggleSection.turnedOffContent) && Intrinsics.areEqual(this.styledCardViewModel, prepurchaseToggleSection.styledCardViewModel) && this.toggleState == prepurchaseToggleSection.toggleState && this.isToggleLoading == prepurchaseToggleSection.isToggleLoading;
                }

                public final int hashCode() {
                    int hashCode = (this.turnedOffContent.hashCode() + (this.turnedOnContent.hashCode() * 31)) * 31;
                    StyledCardViewModel styledCardViewModel = this.styledCardViewModel;
                    int hashCode2 = (hashCode + (styledCardViewModel == null ? 0 : styledCardViewModel.hashCode())) * 31;
                    ToggleState toggleState = this.toggleState;
                    return Boolean.hashCode(this.isToggleLoading) + ((hashCode2 + (toggleState != null ? toggleState.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("PrepurchaseToggleSection(turnedOnContent=");
                    sb.append(this.turnedOnContent);
                    sb.append(", turnedOffContent=");
                    sb.append(this.turnedOffContent);
                    sb.append(", styledCardViewModel=");
                    sb.append(this.styledCardViewModel);
                    sb.append(", toggleState=");
                    sb.append(this.toggleState);
                    sb.append(", isToggleLoading=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isToggleLoading, ")");
                }
            }

            public interface RetroTransactionSection extends SectionContent {

                public final class EligibleTransactions implements RetroTransactionSection {
                    public final List retroTransaction;
                    public final CreditSectionHeader sectionHeader;

                    public EligibleTransactions(CreditSectionHeader creditSectionHeader, List list) {
                        list.getClass();
                        this.retroTransaction = list;
                        this.sectionHeader = creditSectionHeader;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof EligibleTransactions)) {
                            return false;
                        }
                        EligibleTransactions eligibleTransactions = (EligibleTransactions) obj;
                        return Intrinsics.areEqual(this.retroTransaction, eligibleTransactions.retroTransaction) && this.sectionHeader.equals(eligibleTransactions.sectionHeader);
                    }

                    @Override // com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection
                    public final CreditSectionHeader getSectionHeader() {
                        return this.sectionHeader;
                    }

                    public final int hashCode() {
                        return this.sectionHeader.hashCode() + (this.retroTransaction.hashCode() * 31);
                    }

                    public final String toString() {
                        return "EligibleTransactions(retroTransaction=" + this.retroTransaction + ", sectionHeader=" + this.sectionHeader + ")";
                    }
                }

                public final class EmptyEligibleTransactions implements RetroTransactionSection {
                    public final List lineItem;
                    public final CreditSectionHeader sectionHeader;

                    public EmptyEligibleTransactions(CreditSectionHeader creditSectionHeader, List list) {
                        list.getClass();
                        this.sectionHeader = creditSectionHeader;
                        this.lineItem = list;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof EmptyEligibleTransactions)) {
                            return false;
                        }
                        EmptyEligibleTransactions emptyEligibleTransactions = (EmptyEligibleTransactions) obj;
                        return this.sectionHeader.equals(emptyEligibleTransactions.sectionHeader) && Intrinsics.areEqual(this.lineItem, emptyEligibleTransactions.lineItem);
                    }

                    @Override // com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection
                    public final CreditSectionHeader getSectionHeader() {
                        return this.sectionHeader;
                    }

                    public final int hashCode() {
                        return this.lineItem.hashCode() + (this.sectionHeader.hashCode() * 31);
                    }

                    public final String toString() {
                        return "EmptyEligibleTransactions(sectionHeader=" + this.sectionHeader + ", lineItem=" + this.lineItem + ")";
                    }
                }

                CreditSectionHeader getSectionHeader();
            }

            public final class StandaloneCreditSectionHeader implements SectionContent {
                public final SectionContent content;
                public final CreditSectionHeader header;

                public StandaloneCreditSectionHeader(CreditSectionHeader creditSectionHeader, SectionContent sectionContent) {
                    this.header = creditSectionHeader;
                    this.content = sectionContent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof StandaloneCreditSectionHeader)) {
                        return false;
                    }
                    StandaloneCreditSectionHeader standaloneCreditSectionHeader = (StandaloneCreditSectionHeader) obj;
                    return this.header.equals(standaloneCreditSectionHeader.header) && Intrinsics.areEqual(this.content, standaloneCreditSectionHeader.content);
                }

                public final int hashCode() {
                    int hashCode = this.header.hashCode() * 31;
                    SectionContent sectionContent = this.content;
                    return hashCode + (sectionContent == null ? 0 : sectionContent.hashCode());
                }

                public final String toString() {
                    return "StandaloneCreditSectionHeader(header=" + this.header + ", content=" + this.content + ")";
                }
            }

            public final class StandaloneHeader implements SectionContent {
                public final SectionContent content;
                public final Header header;

                public StandaloneHeader(Header header, SectionContent sectionContent) {
                    this.header = header;
                    this.content = sectionContent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof StandaloneHeader)) {
                        return false;
                    }
                    StandaloneHeader standaloneHeader = (StandaloneHeader) obj;
                    return this.header.equals(standaloneHeader.header) && Intrinsics.areEqual(this.content, standaloneHeader.content);
                }

                public final int hashCode() {
                    int hashCode = this.header.hashCode() * 31;
                    SectionContent sectionContent = this.content;
                    return hashCode + (sectionContent == null ? 0 : sectionContent.hashCode());
                }

                public final String toString() {
                    return "StandaloneHeader(header=" + this.header + ", content=" + this.content + ")";
                }
            }

            public final class TextLines implements SectionContent {
                public final List lineItems;

                public TextLines(List list) {
                    list.getClass();
                    this.lineItems = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof TextLines) && Intrinsics.areEqual(this.lineItems, ((TextLines) obj).lineItems);
                }

                public final int hashCode() {
                    return this.lineItems.hashCode();
                }

                public final String toString() {
                    return CameraState$Type$EnumUnboxingLocalUtility.m("TextLines(lineItems=", ")", this.lineItems);
                }
            }

            public interface HeroBalanceSection extends SectionContent {

                public final class NoBalance implements HeroBalanceSection {
                    public final String balance;
                    public final String firstLabel;
                    public final String secondLabel;
                    public final Tap tapAction;

                    public NoBalance(String str, String str2, String str3, Tap tap) {
                        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                        this.balance = str;
                        this.firstLabel = str2;
                        this.secondLabel = str3;
                        this.tapAction = tap;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof NoBalance)) {
                            return false;
                        }
                        NoBalance noBalance = (NoBalance) obj;
                        return Intrinsics.areEqual(this.balance, noBalance.balance) && Intrinsics.areEqual(this.firstLabel, noBalance.firstLabel) && Intrinsics.areEqual(this.secondLabel, noBalance.secondLabel) && this.tapAction.equals(noBalance.tapAction);
                    }

                    public final int hashCode() {
                        return this.tapAction.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.balance.hashCode() * 31, 31, this.firstLabel), 31, this.secondLabel);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NoBalance(balance=", this.balance, ", firstLabel=", this.firstLabel, ", secondLabel=");
                        m.append(this.secondLabel);
                        m.append(", tapAction=");
                        m.append(this.tapAction);
                        m.append(")");
                        return m.toString();
                    }
                }

                public final class PaymentCalendar implements HeroBalanceSection {
                    public final List dates;
                    public final String formattedZeroBalance;
                    public final boolean isLoadingMoreDates;
                    public final ButtonModel primaryButton;
                    public final Tap secondaryButtonTapAction;
                    public final String secondaryButtonText;

                    public interface DateTreatment {

                        public final class Disabled implements DateTreatment {
                            public static final Disabled INSTANCE = new Disabled();

                            public final boolean equals(Object obj) {
                                return this == obj || (obj instanceof Disabled);
                            }

                            public final int hashCode() {
                                return 1583600888;
                            }

                            public final String toString() {
                                return "Disabled";
                            }
                        }

                        public final class Overdue implements DateTreatment {
                            public final Money amount;
                            public final String amountFormatted;
                            public final AfterpayAppletAnalyticsEventsSpec analyticTapEvent;
                            public final AfterpayAppletAnalyticsEventsSpec analyticViewEvent;

                            public Overdue(Money money, String str, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2) {
                                money.getClass();
                                str.getClass();
                                this.amount = money;
                                this.amountFormatted = str;
                                this.analyticViewEvent = afterpayAppletAnalyticsEventsSpec;
                                this.analyticTapEvent = afterpayAppletAnalyticsEventsSpec2;
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof Overdue)) {
                                    return false;
                                }
                                Overdue overdue = (Overdue) obj;
                                return Intrinsics.areEqual(this.amount, overdue.amount) && Intrinsics.areEqual(this.amountFormatted, overdue.amountFormatted) && Intrinsics.areEqual(this.analyticViewEvent, overdue.analyticViewEvent) && Intrinsics.areEqual(this.analyticTapEvent, overdue.analyticTapEvent);
                            }

                            public final int hashCode() {
                                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amount.hashCode() * 31, 31, this.amountFormatted);
                                AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = this.analyticViewEvent;
                                int hashCode = (m + (afterpayAppletAnalyticsEventsSpec == null ? 0 : afterpayAppletAnalyticsEventsSpec.hashCode())) * 31;
                                AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2 = this.analyticTapEvent;
                                return hashCode + (afterpayAppletAnalyticsEventsSpec2 != null ? afterpayAppletAnalyticsEventsSpec2.hashCode() : 0);
                            }

                            public final String toString() {
                                return "Overdue(amount=" + this.amount + ", amountFormatted=" + this.amountFormatted + ", analyticViewEvent=" + this.analyticViewEvent + ", analyticTapEvent=" + this.analyticTapEvent + ")";
                            }
                        }

                        public final class PaymentDue implements DateTreatment {
                            public final Money amount;
                            public final String amountFormatted;
                            public final AfterpayAppletAnalyticsEventsSpec analyticTapEvent;
                            public final AfterpayAppletAnalyticsEventsSpec analyticViewEvent;

                            public PaymentDue(Money money, String str, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2) {
                                money.getClass();
                                str.getClass();
                                this.amount = money;
                                this.amountFormatted = str;
                                this.analyticViewEvent = afterpayAppletAnalyticsEventsSpec;
                                this.analyticTapEvent = afterpayAppletAnalyticsEventsSpec2;
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof PaymentDue)) {
                                    return false;
                                }
                                PaymentDue paymentDue = (PaymentDue) obj;
                                return Intrinsics.areEqual(this.amount, paymentDue.amount) && Intrinsics.areEqual(this.amountFormatted, paymentDue.amountFormatted) && Intrinsics.areEqual(this.analyticViewEvent, paymentDue.analyticViewEvent) && Intrinsics.areEqual(this.analyticTapEvent, paymentDue.analyticTapEvent);
                            }

                            public final int hashCode() {
                                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amount.hashCode() * 31, 31, this.amountFormatted);
                                AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = this.analyticViewEvent;
                                int hashCode = (m + (afterpayAppletAnalyticsEventsSpec == null ? 0 : afterpayAppletAnalyticsEventsSpec.hashCode())) * 31;
                                AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2 = this.analyticTapEvent;
                                return hashCode + (afterpayAppletAnalyticsEventsSpec2 != null ? afterpayAppletAnalyticsEventsSpec2.hashCode() : 0);
                            }

                            public final String toString() {
                                return "PaymentDue(amount=" + this.amount + ", amountFormatted=" + this.amountFormatted + ", analyticViewEvent=" + this.analyticViewEvent + ", analyticTapEvent=" + this.analyticTapEvent + ")";
                            }
                        }

                        public final class Regular implements DateTreatment {
                            public static final Regular INSTANCE = new Regular();

                            public final boolean equals(Object obj) {
                                return this == obj || (obj instanceof Regular);
                            }

                            public final int hashCode() {
                                return -949402208;
                            }

                            public final String toString() {
                                return "Regular";
                            }
                        }

                        public final class Today implements DateTreatment {
                            public static final Today INSTANCE = new Today();

                            public final boolean equals(Object obj) {
                                return this == obj || (obj instanceof Today);
                            }

                            public final int hashCode() {
                                return 1779922501;
                            }

                            public final String toString() {
                                return "Today";
                            }
                        }
                    }

                    public PaymentCalendar(List list, ButtonModel buttonModel, Tap.Url url, int i) {
                        this((i & 1) != 0 ? EmptyList.INSTANCE : list, false, (i & 4) != 0 ? null : buttonModel, (i & 8) != 0 ? null : "View payment history", (i & 16) != 0 ? null : url, null);
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof PaymentCalendar)) {
                            return false;
                        }
                        PaymentCalendar paymentCalendar = (PaymentCalendar) obj;
                        return Intrinsics.areEqual(this.dates, paymentCalendar.dates) && this.isLoadingMoreDates == paymentCalendar.isLoadingMoreDates && Intrinsics.areEqual(this.primaryButton, paymentCalendar.primaryButton) && Intrinsics.areEqual(this.secondaryButtonText, paymentCalendar.secondaryButtonText) && Intrinsics.areEqual(this.secondaryButtonTapAction, paymentCalendar.secondaryButtonTapAction) && Intrinsics.areEqual(this.formattedZeroBalance, paymentCalendar.formattedZeroBalance);
                    }

                    public final int hashCode() {
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.dates.hashCode() * 31, 31, this.isLoadingMoreDates);
                        ButtonModel buttonModel = this.primaryButton;
                        int hashCode = (m + (buttonModel == null ? 0 : buttonModel.hashCode())) * 31;
                        String str = this.secondaryButtonText;
                        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                        Tap tap = this.secondaryButtonTapAction;
                        int hashCode3 = (hashCode2 + (tap == null ? 0 : tap.hashCode())) * 31;
                        String str2 = this.formattedZeroBalance;
                        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
                    }

                    public final String toString() {
                        return "PaymentCalendar(dates=" + this.dates + ", isLoadingMoreDates=" + this.isLoadingMoreDates + ", primaryButton=" + this.primaryButton + ", secondaryButtonText=" + this.secondaryButtonText + ", secondaryButtonTapAction=" + this.secondaryButtonTapAction + ", formattedZeroBalance=" + this.formattedZeroBalance + ")";
                    }

                    public final class CalendarDate {
                        public final Money amountDue;
                        public final String amountDueFormatted;
                        public final String contentDescription;
                        public final long dateMs;
                        public final String dayAbbreviation;
                        public final int dayOfMonth;
                        public final String formattedTimeUntilDue;
                        public final String monthAbbreviation;
                        public final List treatments;

                        public CalendarDate(int i, String str, List list, Money money, String str2, String str3, String str4, long j, String str5) {
                            list.getClass();
                            str3.getClass();
                            this.dayOfMonth = i;
                            this.dayAbbreviation = str;
                            this.treatments = list;
                            this.amountDue = money;
                            this.amountDueFormatted = str2;
                            this.formattedTimeUntilDue = str3;
                            this.monthAbbreviation = str4;
                            this.dateMs = j;
                            this.contentDescription = str5;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof CalendarDate)) {
                                return false;
                            }
                            CalendarDate calendarDate = (CalendarDate) obj;
                            return this.dayOfMonth == calendarDate.dayOfMonth && Intrinsics.areEqual(this.dayAbbreviation, calendarDate.dayAbbreviation) && Intrinsics.areEqual(this.treatments, calendarDate.treatments) && Intrinsics.areEqual(this.amountDue, calendarDate.amountDue) && Intrinsics.areEqual(this.amountDueFormatted, calendarDate.amountDueFormatted) && Intrinsics.areEqual(this.formattedTimeUntilDue, calendarDate.formattedTimeUntilDue) && Intrinsics.areEqual(this.monthAbbreviation, calendarDate.monthAbbreviation) && this.dateMs == calendarDate.dateMs && Intrinsics.areEqual(this.contentDescription, calendarDate.contentDescription);
                        }

                        public final int hashCode() {
                            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.dayOfMonth) * 31, 31, this.dayAbbreviation), 31, this.treatments);
                            Money money = this.amountDue;
                            return this.contentDescription.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (money == null ? 0 : money.hashCode())) * 31, 31, this.amountDueFormatted), 31, this.formattedTimeUntilDue), 31, this.monthAbbreviation), 31, this.dateMs);
                        }

                        public final String toString() {
                            StringBuilder m = re$$ExternalSyntheticOutline0.m("CalendarDate(dayOfMonth=", this.dayOfMonth, ", dayAbbreviation=", this.dayAbbreviation, ", treatments=");
                            m.append(this.treatments);
                            m.append(", amountDue=");
                            m.append(this.amountDue);
                            m.append(", amountDueFormatted=");
                            Boxes$$ExternalSyntheticOutline1.m(m, this.amountDueFormatted, ", formattedTimeUntilDue=", this.formattedTimeUntilDue, ", monthAbbreviation=");
                            m.append(this.monthAbbreviation);
                            m.append(", dateMs=");
                            m.append(this.dateMs);
                            return Recorder$$ExternalSyntheticOutline2.m(m, ", contentDescription=", this.contentDescription, ")");
                        }

                        public /* synthetic */ CalendarDate(int i, String str, String str2, String str3, List list) {
                            this(i, str, list, null, "", "", str2, 0L, str3);
                        }
                    }

                    public PaymentCalendar(List list, boolean z, ButtonModel buttonModel, String str, Tap tap, String str2) {
                        list.getClass();
                        this.dates = list;
                        this.isLoadingMoreDates = z;
                        this.primaryButton = buttonModel;
                        this.secondaryButtonText = str;
                        this.secondaryButtonTapAction = tap;
                        this.formattedZeroBalance = str2;
                    }
                }
            }
        }
    }
}
