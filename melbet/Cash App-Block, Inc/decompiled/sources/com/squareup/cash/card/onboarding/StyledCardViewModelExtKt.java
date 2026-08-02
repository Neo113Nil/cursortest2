package com.squareup.cash.card.onboarding;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.PaymentMethod;
import com.squareup.util.android.StringsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class StyledCardViewModelExtKt {
    public static final CardModelView.ViewModel toInteractiveCardViewModel(StyledCardViewModel styledCardViewModel) {
        styledCardViewModel.getClass();
        CardTheme cardTheme = styledCardViewModel.theme;
        String str = cardTheme.ink_color;
        Timber.Forest forest = Timber.Forest;
        Integer safeParseColor = StringsKt.safeParseColor(str, new CardStudioViewKt$ThemedCard$1$4$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 26));
        safeParseColor.getClass();
        int intValue = safeParseColor.intValue();
        CardTheme.Identifier identifier = cardTheme.id;
        Integer safeParseColor2 = StringsKt.safeParseColor(cardTheme.card_color, new CardStudioViewKt$ThemedCard$1$4$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 23));
        safeParseColor2.getClass();
        int intValue2 = safeParseColor2.intValue();
        Integer safeParseColor3 = StringsKt.safeParseColor(cardTheme.card_info_text_color, null);
        int intValue3 = safeParseColor3 != null ? safeParseColor3.intValue() : intValue;
        Integer safeParseColor4 = StringsKt.safeParseColor(cardTheme.mag_stripe_color, new CardStudioViewKt$ThemedCard$1$4$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 24));
        int intValue4 = safeParseColor4 != null ? safeParseColor4.intValue() : -12303292;
        Integer safeParseColor5 = StringsKt.safeParseColor(cardTheme.mag_stripe_back_color, new CardStudioViewKt$ThemedCard$1$4$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 25));
        int intValue5 = safeParseColor5 != null ? safeParseColor5.intValue() : CardModelView.DEFAULT_MAG_BACK_COLOR;
        CardTheme.BackgroundImage backgroundImage = cardTheme.background_image;
        CustomizationDetails customizationDetails = styledCardViewModel.showCustomization ? styledCardViewModel.customizationDetails : null;
        String str2 = styledCardViewModel.showCashtag ? styledCardViewModel.cashtag : null;
        CardTheme.CardCustomizationMargin cardCustomizationMargin = cardTheme.card_customization_margin;
        CardTheme.Font font = cardTheme.font;
        PaymentMethod paymentMethod = styledCardViewModel.paymentMethod;
        String str3 = styledCardViewModel.cardHolderName;
        if (str3 == null) {
            str3 = "Reese Hills";
        }
        String str4 = str3;
        String str5 = styledCardViewModel.cardNumber;
        if (str5 == null) {
            str5 = "4000 1234 5678 9010";
        }
        String str6 = str5;
        String str7 = styledCardViewModel.cardCVV;
        if (str7 == null) {
            str7 = "123";
        }
        String str8 = str7;
        String str9 = styledCardViewModel.cardExpiration;
        if (str9 == null) {
            str9 = "11/27";
        }
        return new CardModelView.ViewModel(intValue2, intValue, intValue3, identifier, backgroundImage, font, customizationDetails, cardCustomizationMargin, str2, intValue4, intValue5, str4, str6, str8, str9, paymentMethod, null, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -268206112, 2047);
    }
}
