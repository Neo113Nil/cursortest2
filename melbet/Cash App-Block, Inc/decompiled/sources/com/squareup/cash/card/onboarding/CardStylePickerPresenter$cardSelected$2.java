package com.squareup.cash.card.onboarding;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardStylePickerViewEvent;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.card.onboarding.screens.CardStyleScreen;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeSelectStyle;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeStart;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.cash.StringsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStylePickerPresenter$cardSelected$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardStylePickerViewEvent.CardSelected $event;
    public final /* synthetic */ CardStylePickerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStylePickerPresenter$cardSelected$2(CardStylePickerPresenter cardStylePickerPresenter, CardStylePickerViewEvent.CardSelected cardSelected, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardStylePickerPresenter;
        this.$event = cardSelected;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardStylePickerPresenter$cardSelected$2(this.this$0, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardStylePickerPresenter$cardSelected$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LocalizedString localizedString;
        LocalizedString localizedString2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        CardStylePickerPresenter cardStylePickerPresenter = this.this$0;
        Analytics analytics = cardStylePickerPresenter.analytics;
        CardStyleScreen cardStyleScreen = cardStylePickerPresenter.args;
        List list = cardStyleScreen.cardSections;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((CardCustomizationBlocker.CardOptionSection) it.next()).options, arrayList);
        }
        CardStylePickerViewEvent.CardSelected cardSelected = this.$event;
        CardCustomizationBlocker.CardOption cardOption = (CardCustomizationBlocker.CardOption) arrayList.get(cardSelected.cardOptionIndex);
        cardStylePickerPresenter.cardStudioQueries.updateThemes(cardOption.card_theme);
        CardTheme cardTheme = cardOption.card_theme;
        analytics.track(new CashCardCustomizeSelectStyle(new Integer(cardSelected.cardOptionIndex), cardTheme != null ? cardTheme.token : null, String.valueOf(cardStyleScreen.blockersData.clientScenario), cardStyleScreen.blockersData.flowToken), null);
        analytics.track(new CashCardCustomizeStart(CashCardCustomizeStart.CustomizationType.PERSONALIZATION), null);
        CardPresentationStyle cardPresentationStyle = cardOption.presentationStyle;
        if (cardPresentationStyle == null) {
            cardPresentationStyle = CardPresentationStyle.PSEUDO_3D;
        }
        if (cardPresentationStyle == CardPresentationStyle.TRUE_3D && !cardStylePickerPresenter.filamentSupportProvider.isDeviceSupported()) {
            cardPresentationStyle = CardPresentationStyle.PSEUDO_3D;
        }
        CardPresentationStyle cardPresentationStyle2 = cardPresentationStyle;
        BetterNavigator.ScreenNavigator screenNavigator = cardStylePickerPresenter.navigator;
        BlockersData blockersData = cardStyleScreen.blockersData;
        CardCustomizationBlocker.CardPreviewText cardPreviewText = cardOption.card_preview_text;
        cardPreviewText.getClass();
        String str = cardPreviewText.title;
        str.getClass();
        CardCustomizationBlocker.CardPreviewText cardPreviewText2 = cardOption.card_preview_text;
        cardPreviewText2.getClass();
        String str2 = cardPreviewText2.app_theme_text;
        CardCustomizationBlocker.CardPreviewText cardPreviewText3 = cardOption.card_preview_text;
        cardPreviewText3.getClass();
        Color color = cardPreviewText3.app_theme_ui_text_color_override;
        CardCustomizationBlocker.CardPreviewText cardPreviewText4 = cardOption.card_preview_text;
        cardPreviewText4.getClass();
        CardCustomizationBlocker.PreviewHalfSheetContent previewHalfSheetContent = cardPreviewText4.preview_sheet;
        String translated = (previewHalfSheetContent == null || (localizedString2 = previewHalfSheetContent.title_ls) == null) ? null : StringsKt.translated(localizedString2);
        CardCustomizationBlocker.CardPreviewText cardPreviewText5 = cardOption.card_preview_text;
        cardPreviewText5.getClass();
        CardCustomizationBlocker.PreviewHalfSheetContent previewHalfSheetContent2 = cardPreviewText5.preview_sheet;
        String translated2 = (previewHalfSheetContent2 == null || (localizedString = previewHalfSheetContent2.body_ls) == null) ? null : StringsKt.translated(localizedString);
        CardCustomizationBlocker.CardPreviewText cardPreviewText6 = cardOption.card_preview_text;
        cardPreviewText6.getClass();
        CardCustomizationBlocker.PreviewHalfSheetContent previewHalfSheetContent3 = cardPreviewText6.preview_sheet;
        CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage localSheetImage = previewHalfSheetContent3 != null ? previewHalfSheetContent3.local_image : null;
        CardCustomizationBlocker.CardPreviewText cardPreviewText7 = cardOption.card_preview_text;
        cardPreviewText7.getClass();
        String str3 = cardPreviewText7.body;
        str3.getClass();
        CardCustomizationBlocker.CardPreviewText cardPreviewText8 = cardOption.card_preview_text;
        cardPreviewText8.getClass();
        String str4 = cardPreviewText8.customize_card_button_title;
        CardCustomizationBlocker.CardPreviewText cardPreviewText9 = cardOption.card_preview_text;
        cardPreviewText9.getClass();
        String str5 = cardPreviewText9.edit_customization_button_title;
        CardCustomizationBlocker.CardPreviewText cardPreviewText10 = cardOption.card_preview_text;
        cardPreviewText10.getClass();
        String str6 = cardPreviewText10.order_card_button_title;
        str6.getClass();
        CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay = cardOption.cashtag_display;
        cashtagDisplay.getClass();
        Redacted redacted = cardStyleScreen.cashtag;
        Boolean bool = cardOption.customization_eligible;
        bool.getClass();
        screenNavigator.goTo(new CardPreviewScreen(blockersData, null, null, str, str2, color, str3, str4, str5, str6, cashtagDisplay, redacted, bool.booleanValue(), cardPresentationStyle2, cardOption.card_availability != CardCustomizationBlocker.CardOption.CardAvailability.UNAVAILABLE, translated, translated2, localSheetImage, cardStyleScreen.availableStamps, cardOption.payment_method));
        return Unit.INSTANCE;
    }
}
