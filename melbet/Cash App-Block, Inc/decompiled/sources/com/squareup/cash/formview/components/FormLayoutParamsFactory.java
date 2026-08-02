package com.squareup.cash.formview.components;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.formview.components.LocalImageType;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.cards.CardCustomizationData;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class FormLayoutParamsFactory {
    public final LocalImageFinder localImageFinder;
    public final int sideMarginPx;
    public final FormSpacings spacings;

    public FormLayoutParamsFactory(Context context) {
        context.getClass();
        this.sideMarginPx = Views.dip(context, 16);
        this.spacings = new FormSpacings(context);
        this.localImageFinder = new LocalImageFinder(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinearLayout.LayoutParams create(FormBlocker.Element element, FormBlocker.Element element2, boolean z) {
        FormBlocker.Element.SpacerElement spacerElement;
        FormBlocker.Element.LocalImageElement localImageElement;
        FormBlocker.Element.RemoteImageElement remoteImageElement;
        FormBlocker.Element.MoneyElement moneyElement;
        FormBlocker.Element.CustomizedCardElement customizedCardElement;
        FormBlocker.Element.OptionPickerElement optionPickerElement;
        FormBlocker.Element.AvatarElement avatarElement;
        FormBlocker.Element.DividerElement dividerElement;
        FormBlocker.Element.CallToActionElement callToActionElement;
        FormBlocker.Element.CaptionedTileElement captionedTileElement;
        FormBlocker.Element.HeroElement heroElement;
        FormBlocker.Element.HeroHeaderElement heroHeaderElement;
        FormBlocker.Element.SectionHeaderElement sectionHeaderElement;
        FormBlocker.Element.DetailRowElement detailRowElement;
        FormBlocker.Element.PaymentPlanSummaryElement paymentPlanSummaryElement;
        FormBlocker.Element.PaymentPlanScheduleElement paymentPlanScheduleElement;
        FormBlocker.Element.SelectableRowElement selectableRowElement;
        FormBlocker.Element.GiftCardElement giftCardElement;
        FormBlocker.Element.EmojiPickerElement emojiPickerElement;
        FormBlocker.Element.MerchantTransactionElement merchantTransactionElement;
        FormBlocker.Element.MerchantTransactionOptionPicker merchantTransactionOptionPicker;
        FormBlocker.Element.CheckBoxElement checkBoxElement;
        FormBlocker.Element.ListUnorderedElement listUnorderedElement;
        FormBlocker.Element.TimelineElement timelineElement;
        FormBlocker.Element.CustomizedCardElement customizedCardElement2;
        FormBlocker.Element.LocalImageElement localImageElement2;
        LocalImageType find;
        int spacingBetween = this.spacings.spacingBetween(element, element2);
        FormBlocker.Element.AbstractC0072Element abstractC0072Element = element2.element;
        FormBlocker.Element.CellDefaultElement cellDefaultElement = null;
        r2 = null;
        FormBlocker.Element.SpacerElement spacerElement2 = null;
        r2 = null;
        FormBlocker.Element.RemoteImageElement remoteImageElement2 = null;
        cellDefaultElement = null;
        if (abstractC0072Element != null) {
            FormBlocker.Element.AbstractC0072Element.SpacerElement spacerElement3 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SpacerElement ? (FormBlocker.Element.AbstractC0072Element.SpacerElement) abstractC0072Element : null;
            if (spacerElement3 != null) {
                spacerElement = spacerElement3.getValue();
                FormBlocker.Element.AbstractC0072Element abstractC0072Element2 = element2.element;
                if (spacerElement == null) {
                    if (abstractC0072Element2 != null) {
                        FormBlocker.Element.AbstractC0072Element.SpacerElement spacerElement4 = abstractC0072Element2 instanceof FormBlocker.Element.AbstractC0072Element.SpacerElement ? (FormBlocker.Element.AbstractC0072Element.SpacerElement) abstractC0072Element2 : null;
                        if (spacerElement4 != null) {
                            spacerElement2 = spacerElement4.getValue();
                        }
                    }
                    spacerElement2.getClass();
                    LinearLayout.LayoutParams matchParentWrapContent = matchParentWrapContent(spacingBetween);
                    matchParentWrapContent.weight = spacerElement2.proportion != null ? r9.intValue() : 1.0f;
                    return matchParentWrapContent;
                }
                if (abstractC0072Element2 != null) {
                    FormBlocker.Element.AbstractC0072Element.LocalImageElement localImageElement3 = abstractC0072Element2 instanceof FormBlocker.Element.AbstractC0072Element.LocalImageElement ? (FormBlocker.Element.AbstractC0072Element.LocalImageElement) abstractC0072Element2 : null;
                    if (localImageElement3 != null) {
                        localImageElement = localImageElement3.getValue();
                        FormBlocker.Element.AbstractC0072Element abstractC0072Element3 = element2.element;
                        if (localImageElement == null) {
                            if (abstractC0072Element3 != null) {
                                FormBlocker.Element.AbstractC0072Element.LocalImageElement localImageElement4 = abstractC0072Element3 instanceof FormBlocker.Element.AbstractC0072Element.LocalImageElement ? (FormBlocker.Element.AbstractC0072Element.LocalImageElement) abstractC0072Element3 : null;
                                if (localImageElement4 != null) {
                                    localImageElement2 = localImageElement4.getValue();
                                    localImageElement2.getClass();
                                    find = this.localImageFinder.find(localImageElement2);
                                    if (!(find instanceof LocalImageType.MooncakeIcon) || (find instanceof LocalImageType.ArcadeIcon) || (find instanceof LocalImageType.ArcadeComposable)) {
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                        setSpacing(layoutParams, spacingBetween, false);
                                        return layoutParams;
                                    }
                                    if (!(find instanceof LocalImageType.HeroImage)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                    setSpacing(layoutParams2, spacingBetween, !CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView.ScaleType[]{ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_START}).contains(((LocalImageType.HeroImage) find).scaleType));
                                    return layoutParams2;
                                }
                            }
                            localImageElement2 = null;
                            localImageElement2.getClass();
                            find = this.localImageFinder.find(localImageElement2);
                            if (find instanceof LocalImageType.MooncakeIcon) {
                            }
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                            setSpacing(layoutParams3, spacingBetween, false);
                            return layoutParams3;
                        }
                        if (abstractC0072Element3 != null) {
                            FormBlocker.Element.AbstractC0072Element.RemoteImageElement remoteImageElement3 = abstractC0072Element3 instanceof FormBlocker.Element.AbstractC0072Element.RemoteImageElement ? (FormBlocker.Element.AbstractC0072Element.RemoteImageElement) abstractC0072Element3 : null;
                            if (remoteImageElement3 != null) {
                                remoteImageElement = remoteImageElement3.getValue();
                                FormBlocker.Element.AbstractC0072Element abstractC0072Element4 = element2.element;
                                if (remoteImageElement == null) {
                                    if (abstractC0072Element4 != null) {
                                        FormBlocker.Element.AbstractC0072Element.RemoteImageElement remoteImageElement4 = abstractC0072Element4 instanceof FormBlocker.Element.AbstractC0072Element.RemoteImageElement ? (FormBlocker.Element.AbstractC0072Element.RemoteImageElement) abstractC0072Element4 : null;
                                        if (remoteImageElement4 != null) {
                                            remoteImageElement2 = remoteImageElement4.getValue();
                                        }
                                    }
                                    remoteImageElement2.getClass();
                                    Object[] objArr = z && element == null;
                                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                    setSpacing(layoutParams4, spacingBetween, objArr == true || remoteImageElement2.alignment == FormBlocker.Element.RemoteImageElement.HorizontalAlignment.FULL_BLEED);
                                    return layoutParams4;
                                }
                                if (abstractC0072Element4 != null) {
                                    FormBlocker.Element.AbstractC0072Element.MoneyElement moneyElement2 = abstractC0072Element4 instanceof FormBlocker.Element.AbstractC0072Element.MoneyElement ? (FormBlocker.Element.AbstractC0072Element.MoneyElement) abstractC0072Element4 : null;
                                    if (moneyElement2 != null) {
                                        moneyElement = moneyElement2.getValue();
                                        if (moneyElement == null) {
                                            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                                            setSpacing(layoutParams5, spacingBetween, false);
                                            return layoutParams5;
                                        }
                                        FormBlocker.Element.AbstractC0072Element abstractC0072Element5 = element2.element;
                                        if (abstractC0072Element5 != null) {
                                            FormBlocker.Element.AbstractC0072Element.CustomizedCardElement customizedCardElement3 = abstractC0072Element5 instanceof FormBlocker.Element.AbstractC0072Element.CustomizedCardElement ? (FormBlocker.Element.AbstractC0072Element.CustomizedCardElement) abstractC0072Element5 : null;
                                            if (customizedCardElement3 != null) {
                                                customizedCardElement = customizedCardElement3.getValue();
                                                FormBlocker.Element.AbstractC0072Element abstractC0072Element6 = element2.element;
                                                if (customizedCardElement == null) {
                                                    if (abstractC0072Element6 != null) {
                                                        FormBlocker.Element.AbstractC0072Element.CustomizedCardElement customizedCardElement4 = abstractC0072Element6 instanceof FormBlocker.Element.AbstractC0072Element.CustomizedCardElement ? (FormBlocker.Element.AbstractC0072Element.CustomizedCardElement) abstractC0072Element6 : null;
                                                        if (customizedCardElement4 != null) {
                                                            customizedCardElement2 = customizedCardElement4.getValue();
                                                            customizedCardElement2.getClass();
                                                            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                                            CardCustomizationData cardCustomizationData = customizedCardElement2.card_customization;
                                                            setSpacing(layoutParams6, spacingBetween, (cardCustomizationData != null ? cardCustomizationData.card_presentation_style : null) != CardPresentationStyle.LEGACY_2D);
                                                            return layoutParams6;
                                                        }
                                                    }
                                                    customizedCardElement2 = null;
                                                    customizedCardElement2.getClass();
                                                    LinearLayout.LayoutParams layoutParams62 = new LinearLayout.LayoutParams(-1, -2);
                                                    CardCustomizationData cardCustomizationData2 = customizedCardElement2.card_customization;
                                                    setSpacing(layoutParams62, spacingBetween, (cardCustomizationData2 != null ? cardCustomizationData2.card_presentation_style : null) != CardPresentationStyle.LEGACY_2D);
                                                    return layoutParams62;
                                                }
                                                if (abstractC0072Element6 != null) {
                                                    FormBlocker.Element.AbstractC0072Element.OptionPickerElement optionPickerElement2 = abstractC0072Element6 instanceof FormBlocker.Element.AbstractC0072Element.OptionPickerElement ? (FormBlocker.Element.AbstractC0072Element.OptionPickerElement) abstractC0072Element6 : null;
                                                    if (optionPickerElement2 != null) {
                                                        optionPickerElement = optionPickerElement2.getValue();
                                                        if (optionPickerElement == null) {
                                                            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                                                            layoutParams7.topMargin = spacingBetween;
                                                            return layoutParams7;
                                                        }
                                                        FormBlocker.Element.AbstractC0072Element abstractC0072Element7 = element2.element;
                                                        if (abstractC0072Element7 != null) {
                                                            FormBlocker.Element.AbstractC0072Element.AvatarElement avatarElement2 = abstractC0072Element7 instanceof FormBlocker.Element.AbstractC0072Element.AvatarElement ? (FormBlocker.Element.AbstractC0072Element.AvatarElement) abstractC0072Element7 : null;
                                                            if (avatarElement2 != null) {
                                                                avatarElement = avatarElement2.getValue();
                                                                if (avatarElement == null) {
                                                                    LinearLayout.LayoutParams matchParentWrapContent2 = matchParentWrapContent(spacingBetween);
                                                                    matchParentWrapContent2.gravity = 3;
                                                                    return matchParentWrapContent2;
                                                                }
                                                                FormBlocker.Element.AbstractC0072Element abstractC0072Element8 = element2.element;
                                                                if (abstractC0072Element8 != null) {
                                                                    FormBlocker.Element.AbstractC0072Element.DividerElement dividerElement2 = abstractC0072Element8 instanceof FormBlocker.Element.AbstractC0072Element.DividerElement ? (FormBlocker.Element.AbstractC0072Element.DividerElement) abstractC0072Element8 : null;
                                                                    if (dividerElement2 != null) {
                                                                        dividerElement = dividerElement2.getValue();
                                                                        if (dividerElement == null) {
                                                                            return matchParentWrapContent(spacingBetween);
                                                                        }
                                                                        FormBlocker.Element.AbstractC0072Element abstractC0072Element9 = element2.element;
                                                                        if (abstractC0072Element9 != null) {
                                                                            FormBlocker.Element.AbstractC0072Element.CallToActionElement callToActionElement2 = abstractC0072Element9 instanceof FormBlocker.Element.AbstractC0072Element.CallToActionElement ? (FormBlocker.Element.AbstractC0072Element.CallToActionElement) abstractC0072Element9 : null;
                                                                            if (callToActionElement2 != null) {
                                                                                callToActionElement = callToActionElement2.getValue();
                                                                                if (callToActionElement == null) {
                                                                                    LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
                                                                                    setSpacing(layoutParams8, spacingBetween, false);
                                                                                    return layoutParams8;
                                                                                }
                                                                                FormBlocker.Element.AbstractC0072Element abstractC0072Element10 = element2.element;
                                                                                if (abstractC0072Element10 != null) {
                                                                                    FormBlocker.Element.AbstractC0072Element.CaptionedTileElement captionedTileElement2 = abstractC0072Element10 instanceof FormBlocker.Element.AbstractC0072Element.CaptionedTileElement ? (FormBlocker.Element.AbstractC0072Element.CaptionedTileElement) abstractC0072Element10 : null;
                                                                                    if (captionedTileElement2 != null) {
                                                                                        captionedTileElement = captionedTileElement2.getValue();
                                                                                        if (captionedTileElement == null) {
                                                                                            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
                                                                                            setSpacing(layoutParams9, spacingBetween, false);
                                                                                            layoutParams9.gravity = 1;
                                                                                            return layoutParams9;
                                                                                        }
                                                                                        FormBlocker.Element.AbstractC0072Element abstractC0072Element11 = element2.element;
                                                                                        if (abstractC0072Element11 != null) {
                                                                                            FormBlocker.Element.AbstractC0072Element.HeroElement heroElement2 = abstractC0072Element11 instanceof FormBlocker.Element.AbstractC0072Element.HeroElement ? (FormBlocker.Element.AbstractC0072Element.HeroElement) abstractC0072Element11 : null;
                                                                                            if (heroElement2 != null) {
                                                                                                heroElement = heroElement2.getValue();
                                                                                                if (heroElement == null) {
                                                                                                    FormBlocker.Element.AbstractC0072Element abstractC0072Element12 = element2.element;
                                                                                                    if (abstractC0072Element12 != null) {
                                                                                                        FormBlocker.Element.AbstractC0072Element.HeroHeaderElement heroHeaderElement2 = abstractC0072Element12 instanceof FormBlocker.Element.AbstractC0072Element.HeroHeaderElement ? (FormBlocker.Element.AbstractC0072Element.HeroHeaderElement) abstractC0072Element12 : null;
                                                                                                        if (heroHeaderElement2 != null) {
                                                                                                            heroHeaderElement = heroHeaderElement2.getValue();
                                                                                                            if (heroHeaderElement == null) {
                                                                                                                FormBlocker.Element.AbstractC0072Element abstractC0072Element13 = element2.element;
                                                                                                                if (abstractC0072Element13 != null) {
                                                                                                                    FormBlocker.Element.AbstractC0072Element.SectionHeaderElement sectionHeaderElement2 = abstractC0072Element13 instanceof FormBlocker.Element.AbstractC0072Element.SectionHeaderElement ? (FormBlocker.Element.AbstractC0072Element.SectionHeaderElement) abstractC0072Element13 : null;
                                                                                                                    if (sectionHeaderElement2 != null) {
                                                                                                                        sectionHeaderElement = sectionHeaderElement2.getValue();
                                                                                                                        if (sectionHeaderElement == null) {
                                                                                                                            FormBlocker.Element.AbstractC0072Element abstractC0072Element14 = element2.element;
                                                                                                                            if (abstractC0072Element14 != null) {
                                                                                                                                FormBlocker.Element.AbstractC0072Element.DetailRowElement detailRowElement2 = abstractC0072Element14 instanceof FormBlocker.Element.AbstractC0072Element.DetailRowElement ? (FormBlocker.Element.AbstractC0072Element.DetailRowElement) abstractC0072Element14 : null;
                                                                                                                                if (detailRowElement2 != null) {
                                                                                                                                    detailRowElement = detailRowElement2.getValue();
                                                                                                                                    if (detailRowElement == null) {
                                                                                                                                        FormBlocker.Element.AbstractC0072Element abstractC0072Element15 = element2.element;
                                                                                                                                        if (abstractC0072Element15 != null) {
                                                                                                                                            FormBlocker.Element.AbstractC0072Element.PaymentPlanSummaryElement paymentPlanSummaryElement2 = abstractC0072Element15 instanceof FormBlocker.Element.AbstractC0072Element.PaymentPlanSummaryElement ? (FormBlocker.Element.AbstractC0072Element.PaymentPlanSummaryElement) abstractC0072Element15 : null;
                                                                                                                                            if (paymentPlanSummaryElement2 != null) {
                                                                                                                                                paymentPlanSummaryElement = paymentPlanSummaryElement2.getValue();
                                                                                                                                                if (paymentPlanSummaryElement == null) {
                                                                                                                                                    FormBlocker.Element.AbstractC0072Element abstractC0072Element16 = element2.element;
                                                                                                                                                    if (abstractC0072Element16 != null) {
                                                                                                                                                        FormBlocker.Element.AbstractC0072Element.PaymentPlanScheduleElement paymentPlanScheduleElement2 = abstractC0072Element16 instanceof FormBlocker.Element.AbstractC0072Element.PaymentPlanScheduleElement ? (FormBlocker.Element.AbstractC0072Element.PaymentPlanScheduleElement) abstractC0072Element16 : null;
                                                                                                                                                        if (paymentPlanScheduleElement2 != null) {
                                                                                                                                                            paymentPlanScheduleElement = paymentPlanScheduleElement2.getValue();
                                                                                                                                                            if (paymentPlanScheduleElement == null) {
                                                                                                                                                                FormBlocker.Element.AbstractC0072Element abstractC0072Element17 = element2.element;
                                                                                                                                                                if (abstractC0072Element17 != null) {
                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.SelectableRowElement selectableRowElement2 = abstractC0072Element17 instanceof FormBlocker.Element.AbstractC0072Element.SelectableRowElement ? (FormBlocker.Element.AbstractC0072Element.SelectableRowElement) abstractC0072Element17 : null;
                                                                                                                                                                    if (selectableRowElement2 != null) {
                                                                                                                                                                        selectableRowElement = selectableRowElement2.getValue();
                                                                                                                                                                        if (selectableRowElement == null) {
                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element abstractC0072Element18 = element2.element;
                                                                                                                                                                            if (abstractC0072Element18 != null) {
                                                                                                                                                                                FormBlocker.Element.AbstractC0072Element.GiftCardElement giftCardElement2 = abstractC0072Element18 instanceof FormBlocker.Element.AbstractC0072Element.GiftCardElement ? (FormBlocker.Element.AbstractC0072Element.GiftCardElement) abstractC0072Element18 : null;
                                                                                                                                                                                if (giftCardElement2 != null) {
                                                                                                                                                                                    giftCardElement = giftCardElement2.getValue();
                                                                                                                                                                                    if (giftCardElement == null) {
                                                                                                                                                                                        FormBlocker.Element.AbstractC0072Element abstractC0072Element19 = element2.element;
                                                                                                                                                                                        if (abstractC0072Element19 != null) {
                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.EmojiPickerElement emojiPickerElement2 = abstractC0072Element19 instanceof FormBlocker.Element.AbstractC0072Element.EmojiPickerElement ? (FormBlocker.Element.AbstractC0072Element.EmojiPickerElement) abstractC0072Element19 : null;
                                                                                                                                                                                            if (emojiPickerElement2 != null) {
                                                                                                                                                                                                emojiPickerElement = emojiPickerElement2.getValue();
                                                                                                                                                                                                if (emojiPickerElement == null) {
                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element abstractC0072Element20 = element2.element;
                                                                                                                                                                                                    if (abstractC0072Element20 != null) {
                                                                                                                                                                                                        FormBlocker.Element.AbstractC0072Element.MerchantTransactionElement merchantTransactionElement2 = abstractC0072Element20 instanceof FormBlocker.Element.AbstractC0072Element.MerchantTransactionElement ? (FormBlocker.Element.AbstractC0072Element.MerchantTransactionElement) abstractC0072Element20 : null;
                                                                                                                                                                                                        if (merchantTransactionElement2 != null) {
                                                                                                                                                                                                            merchantTransactionElement = merchantTransactionElement2.getValue();
                                                                                                                                                                                                            if (merchantTransactionElement == null) {
                                                                                                                                                                                                                FormBlocker.Element.AbstractC0072Element abstractC0072Element21 = element2.element;
                                                                                                                                                                                                                if (abstractC0072Element21 != null) {
                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.MerchantTransactionPickerElement merchantTransactionPickerElement = abstractC0072Element21 instanceof FormBlocker.Element.AbstractC0072Element.MerchantTransactionPickerElement ? (FormBlocker.Element.AbstractC0072Element.MerchantTransactionPickerElement) abstractC0072Element21 : null;
                                                                                                                                                                                                                    if (merchantTransactionPickerElement != null) {
                                                                                                                                                                                                                        merchantTransactionOptionPicker = merchantTransactionPickerElement.getValue();
                                                                                                                                                                                                                        if (merchantTransactionOptionPicker == null) {
                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element abstractC0072Element22 = element2.element;
                                                                                                                                                                                                                            if (abstractC0072Element22 != null) {
                                                                                                                                                                                                                                FormBlocker.Element.AbstractC0072Element.CheckboxElement checkboxElement = abstractC0072Element22 instanceof FormBlocker.Element.AbstractC0072Element.CheckboxElement ? (FormBlocker.Element.AbstractC0072Element.CheckboxElement) abstractC0072Element22 : null;
                                                                                                                                                                                                                                if (checkboxElement != null) {
                                                                                                                                                                                                                                    checkBoxElement = checkboxElement.getValue();
                                                                                                                                                                                                                                    if (checkBoxElement == null) {
                                                                                                                                                                                                                                        FormBlocker.Element.AbstractC0072Element abstractC0072Element23 = element2.element;
                                                                                                                                                                                                                                        if (abstractC0072Element23 != null) {
                                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.ListUnorderedElement listUnorderedElement2 = abstractC0072Element23 instanceof FormBlocker.Element.AbstractC0072Element.ListUnorderedElement ? (FormBlocker.Element.AbstractC0072Element.ListUnorderedElement) abstractC0072Element23 : null;
                                                                                                                                                                                                                                            if (listUnorderedElement2 != null) {
                                                                                                                                                                                                                                                listUnorderedElement = listUnorderedElement2.getValue();
                                                                                                                                                                                                                                                if (listUnorderedElement == null) {
                                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element abstractC0072Element24 = element2.element;
                                                                                                                                                                                                                                                    if (abstractC0072Element24 != null) {
                                                                                                                                                                                                                                                        FormBlocker.Element.AbstractC0072Element.TimelineElement timelineElement2 = abstractC0072Element24 instanceof FormBlocker.Element.AbstractC0072Element.TimelineElement ? (FormBlocker.Element.AbstractC0072Element.TimelineElement) abstractC0072Element24 : null;
                                                                                                                                                                                                                                                        if (timelineElement2 != null) {
                                                                                                                                                                                                                                                            timelineElement = timelineElement2.getValue();
                                                                                                                                                                                                                                                            if (timelineElement == null) {
                                                                                                                                                                                                                                                                FormBlocker.Element.AbstractC0072Element abstractC0072Element25 = element2.element;
                                                                                                                                                                                                                                                                if (abstractC0072Element25 != null) {
                                                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.CellDefaultElement cellDefaultElement2 = abstractC0072Element25 instanceof FormBlocker.Element.AbstractC0072Element.CellDefaultElement ? (FormBlocker.Element.AbstractC0072Element.CellDefaultElement) abstractC0072Element25 : null;
                                                                                                                                                                                                                                                                    if (cellDefaultElement2 != null) {
                                                                                                                                                                                                                                                                        cellDefaultElement = cellDefaultElement2.getValue();
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (cellDefaultElement == null) {
                                                                                                                                                                                                                                                                    return matchParentWrapContent(spacingBetween);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    timelineElement = null;
                                                                                                                                                                                                                                                    if (timelineElement == null) {
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        listUnorderedElement = null;
                                                                                                                                                                                                                                        if (listUnorderedElement == null) {
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            checkBoxElement = null;
                                                                                                                                                                                                                            if (checkBoxElement == null) {
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                merchantTransactionOptionPicker = null;
                                                                                                                                                                                                                if (merchantTransactionOptionPicker == null) {
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    merchantTransactionElement = null;
                                                                                                                                                                                                    if (merchantTransactionElement == null) {
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        emojiPickerElement = null;
                                                                                                                                                                                        if (emojiPickerElement == null) {
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            giftCardElement = null;
                                                                                                                                                                            if (giftCardElement == null) {
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                selectableRowElement = null;
                                                                                                                                                                if (selectableRowElement == null) {
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    paymentPlanScheduleElement = null;
                                                                                                                                                    if (paymentPlanScheduleElement == null) {
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        paymentPlanSummaryElement = null;
                                                                                                                                        if (paymentPlanSummaryElement == null) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
                                                                                                                                    layoutParams10.topMargin = spacingBetween;
                                                                                                                                    return layoutParams10;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            detailRowElement = null;
                                                                                                                            if (detailRowElement == null) {
                                                                                                                            }
                                                                                                                            LinearLayout.LayoutParams layoutParams102 = new LinearLayout.LayoutParams(-1, -2);
                                                                                                                            layoutParams102.topMargin = spacingBetween;
                                                                                                                            return layoutParams102;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                sectionHeaderElement = null;
                                                                                                                if (sectionHeaderElement == null) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    heroHeaderElement = null;
                                                                                                    if (heroHeaderElement == null) {
                                                                                                    }
                                                                                                }
                                                                                                LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
                                                                                                layoutParams11.topMargin = spacingBetween;
                                                                                                return layoutParams11;
                                                                                            }
                                                                                        }
                                                                                        heroElement = null;
                                                                                        if (heroElement == null) {
                                                                                        }
                                                                                        LinearLayout.LayoutParams layoutParams112 = new LinearLayout.LayoutParams(-1, -2);
                                                                                        layoutParams112.topMargin = spacingBetween;
                                                                                        return layoutParams112;
                                                                                    }
                                                                                }
                                                                                captionedTileElement = null;
                                                                                if (captionedTileElement == null) {
                                                                                }
                                                                            }
                                                                        }
                                                                        callToActionElement = null;
                                                                        if (callToActionElement == null) {
                                                                        }
                                                                    }
                                                                }
                                                                dividerElement = null;
                                                                if (dividerElement == null) {
                                                                }
                                                            }
                                                        }
                                                        avatarElement = null;
                                                        if (avatarElement == null) {
                                                        }
                                                    }
                                                }
                                                optionPickerElement = null;
                                                if (optionPickerElement == null) {
                                                }
                                            }
                                        }
                                        customizedCardElement = null;
                                        FormBlocker.Element.AbstractC0072Element abstractC0072Element62 = element2.element;
                                        if (customizedCardElement == null) {
                                        }
                                    }
                                }
                                moneyElement = null;
                                if (moneyElement == null) {
                                }
                            }
                        }
                        remoteImageElement = null;
                        FormBlocker.Element.AbstractC0072Element abstractC0072Element42 = element2.element;
                        if (remoteImageElement == null) {
                        }
                    }
                }
                localImageElement = null;
                FormBlocker.Element.AbstractC0072Element abstractC0072Element32 = element2.element;
                if (localImageElement == null) {
                }
            }
        }
        spacerElement = null;
        FormBlocker.Element.AbstractC0072Element abstractC0072Element26 = element2.element;
        if (spacerElement == null) {
        }
    }

    public final LinearLayout.LayoutParams matchParentWrapContent(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        setSpacing(layoutParams, i, false);
        return layoutParams;
    }

    public final int minSpacerHeight(FormBlocker.Element element, FormBlocker.Element element2) {
        FormBlocker.Element.AbstractC0072Element abstractC0072Element;
        FormBlocker.Element.SpacerElement spacerElement = null;
        if (element2 != null && (abstractC0072Element = element2.element) != null) {
            FormBlocker.Element.AbstractC0072Element.SpacerElement spacerElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SpacerElement ? (FormBlocker.Element.AbstractC0072Element.SpacerElement) abstractC0072Element : null;
            if (spacerElement2 != null) {
                spacerElement = spacerElement2.getValue();
            }
        }
        if (spacerElement != null) {
            a$$ExternalSyntheticBUOutline0.m$3("Not expecting adjacent spacer elements.");
            return 0;
        }
        if (element2 != null) {
            return this.spacings.spacingBetween(element, element2);
        }
        return 0;
    }

    public final void setSpacing(LinearLayout.LayoutParams layoutParams, int i, boolean z) {
        if (!z) {
            int i2 = this.sideMarginPx;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
        }
        layoutParams.topMargin = i;
    }
}
