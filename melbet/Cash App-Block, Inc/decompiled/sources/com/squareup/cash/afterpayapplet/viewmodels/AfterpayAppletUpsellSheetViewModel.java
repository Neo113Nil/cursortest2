package com.squareup.cash.afterpayapplet.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public final class AfterpayAppletUpsellSheetViewModel {
    public final List analyticsDismissEvent;
    public final List analyticsViewEvent;
    public final String body;
    public final CtaButton ctaButton;
    public final String footer;
    public final CtaButton secondaryButton;
    public final String title;
    public final TopContent topContent;

    public final class AvatarItem {
        public final List analyticsTapEvent;
        public final List analyticsViewEvent;
        public final UiAvatar avatar;
        public final EngagedItemToken engagedItemToken;
        public final Tap tapAction;

        public AvatarItem(List list, ArrayList arrayList, Tap tap, UiAvatar uiAvatar, EngagedItemToken engagedItemToken) {
            this.analyticsViewEvent = list;
            this.analyticsTapEvent = arrayList;
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
            return Intrinsics.areEqual(this.analyticsViewEvent, avatarItem.analyticsViewEvent) && Intrinsics.areEqual(this.analyticsTapEvent, avatarItem.analyticsTapEvent) && Intrinsics.areEqual(this.tapAction, avatarItem.tapAction) && Intrinsics.areEqual(this.avatar, avatarItem.avatar) && Intrinsics.areEqual(this.engagedItemToken, avatarItem.engagedItemToken);
        }

        public final int hashCode() {
            List list = this.analyticsViewEvent;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List list2 = this.analyticsTapEvent;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            Tap tap = this.tapAction;
            int hashCode3 = (hashCode2 + (tap == null ? 0 : tap.hashCode())) * 31;
            UiAvatar uiAvatar = this.avatar;
            int hashCode4 = (hashCode3 + (uiAvatar == null ? 0 : uiAvatar.hashCode())) * 31;
            EngagedItemToken engagedItemToken = this.engagedItemToken;
            return hashCode4 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("AvatarItem(analyticsViewEvent=", ", analyticsTapEvent=", ", tapAction=", this.analyticsViewEvent, this.analyticsTapEvent);
            m.append(this.tapAction);
            m.append(", avatar=");
            m.append(this.avatar);
            m.append(", engagedItemToken=");
            m.append(this.engagedItemToken);
            m.append(")");
            return m.toString();
        }
    }

    public final class CtaButton {
        public final ButtonProminence prominence;
        public final Tap tapAction;
        public final String text;

        public CtaButton(String str, Tap tap, ButtonProminence buttonProminence) {
            buttonProminence.getClass();
            this.text = str;
            this.tapAction = tap;
            this.prominence = buttonProminence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CtaButton)) {
                return false;
            }
            CtaButton ctaButton = (CtaButton) obj;
            return this.text.equals(ctaButton.text) && this.tapAction.equals(ctaButton.tapAction) && this.prominence == ctaButton.prominence;
        }

        public final int hashCode() {
            return this.prominence.hashCode() + ((this.tapAction.hashCode() + (this.text.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "CtaButton(text=" + this.text + ", tapAction=" + this.tapAction + ", prominence=" + this.prominence + ")";
        }
    }

    public interface TopContent {

        public final class AvatarCarousel implements TopContent {
            public final ArrayList avatars;

            public AvatarCarousel(ArrayList arrayList) {
                this.avatars = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AvatarCarousel) && this.avatars.equals(((AvatarCarousel) obj).avatars);
            }

            public final int hashCode() {
                return this.avatars.hashCode();
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("AvatarCarousel(avatars=", ")", this.avatars);
            }
        }

        public final class ImageHero implements TopContent {
            public final Image image;

            public ImageHero(Image image) {
                this.image = image;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ImageHero) && this.image.equals(((ImageHero) obj).image);
            }

            public final int hashCode() {
                return this.image.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "ImageHero(image=", ")");
            }
        }

        public final class SingleAvatar implements TopContent {
            public final UiAvatar avatar;

            public SingleAvatar(UiAvatar uiAvatar) {
                this.avatar = uiAvatar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SingleAvatar) && this.avatar.equals(((SingleAvatar) obj).avatar);
            }

            public final int hashCode() {
                return this.avatar.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.avatar, "SingleAvatar(avatar=", ")");
            }
        }
    }

    public AfterpayAppletUpsellSheetViewModel(String str, String str2, String str3, CtaButton ctaButton, TopContent topContent, List list, List list2, CtaButton ctaButton2) {
        this.title = str;
        this.body = str2;
        this.footer = str3;
        this.ctaButton = ctaButton;
        this.topContent = topContent;
        this.analyticsViewEvent = list;
        this.analyticsDismissEvent = list2;
        this.secondaryButton = ctaButton2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletUpsellSheetViewModel)) {
            return false;
        }
        AfterpayAppletUpsellSheetViewModel afterpayAppletUpsellSheetViewModel = (AfterpayAppletUpsellSheetViewModel) obj;
        return this.title.equals(afterpayAppletUpsellSheetViewModel.title) && Intrinsics.areEqual(this.body, afterpayAppletUpsellSheetViewModel.body) && Intrinsics.areEqual(this.footer, afterpayAppletUpsellSheetViewModel.footer) && Intrinsics.areEqual(this.ctaButton, afterpayAppletUpsellSheetViewModel.ctaButton) && Intrinsics.areEqual(this.topContent, afterpayAppletUpsellSheetViewModel.topContent) && Intrinsics.areEqual(this.analyticsViewEvent, afterpayAppletUpsellSheetViewModel.analyticsViewEvent) && Intrinsics.areEqual(this.analyticsDismissEvent, afterpayAppletUpsellSheetViewModel.analyticsDismissEvent) && Intrinsics.areEqual(this.secondaryButton, afterpayAppletUpsellSheetViewModel.secondaryButton);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.body;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.footer;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CtaButton ctaButton = this.ctaButton;
        int hashCode4 = (hashCode3 + (ctaButton == null ? 0 : ctaButton.hashCode())) * 31;
        TopContent topContent = this.topContent;
        int hashCode5 = (hashCode4 + (topContent == null ? 0 : topContent.hashCode())) * 31;
        List list = this.analyticsViewEvent;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.analyticsDismissEvent;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CtaButton ctaButton2 = this.secondaryButton;
        return hashCode7 + (ctaButton2 != null ? ctaButton2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayAppletUpsellSheetViewModel(title=", this.title, ", body=", this.body, ", footer=");
        m.append(this.footer);
        m.append(", ctaButton=");
        m.append(this.ctaButton);
        m.append(", topContent=");
        m.append(this.topContent);
        m.append(", analyticsViewEvent=");
        m.append(this.analyticsViewEvent);
        m.append(", analyticsDismissEvent=");
        m.append(this.analyticsDismissEvent);
        m.append(", secondaryButton=");
        m.append(this.secondaryButton);
        m.append(")");
        return m.toString();
    }
}
