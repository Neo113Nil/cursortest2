package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.card.spendinginsights.backend.api.SpendingInsightsParsingErrorFactory;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsightsConfig;
import com.squareup.cash.cdf.PaymentAssetType;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes6.dex */
public abstract class zzahh {
    public static boolean isPunctuation$ui_text(int i) {
        int type2 = Character.getType(i);
        return type2 == 23 || type2 == 20 || type2 == 22 || type2 == 30 || type2 == 29 || type2 == 24 || type2 == 21;
    }

    public static final boolean isStablecoinWithdrawalRecipient(RecipientViewModel recipientViewModel) {
        Recipient recipient;
        return ((recipientViewModel == null || (recipient = recipientViewModel.recipient) == null) ? null : recipient.invoice) instanceof Recipient.CryptoRecipientPayment.Stablecoin;
    }

    public static final StablecoinWithdrawalOption stablecoinOptionOrNull(RecipientViewModel recipientViewModel) {
        Recipient recipient;
        Recipient.CryptoRecipientPayment cryptoRecipientPayment = (recipientViewModel == null || (recipient = recipientViewModel.recipient) == null) ? null : recipient.invoice;
        Recipient.CryptoRecipientPayment.Stablecoin stablecoin = cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Stablecoin ? (Recipient.CryptoRecipientPayment.Stablecoin) cryptoRecipientPayment : null;
        if (stablecoin != null) {
            return stablecoin.option;
        }
        return null;
    }

    public static final SpendingInsightsConfig.ActivitySection toActivitySection(ProtoValidationScope protoValidationScope, CardSpendingInsightsConfig.ActivitySection activitySection) {
        String str;
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            try {
                str = ProtoValidationScope.required(activitySection.title, "title");
                "title".concat(" translated_value");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, activitySection != null ? Reflection.factory.getOrCreateKotlinClass(activitySection.getClass()) : null, spendingInsightsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str = null;
            }
            Integer num = activitySection.page_size;
            try {
                ProtoValidationScope.required(num, "page_size");
            } catch (Exception e2) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, activitySection != null ? Reflection.factory.getOrCreateKotlinClass(activitySection.getClass()) : null, spendingInsightsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                num = null;
            }
            try {
                return new SpendingInsightsConfig.ActivitySection(str, num, new SpendingInsightsConfig.ActivitySection.ActivityFilter(activitySection.include_product_classifiers, activitySection.exclude_product_classifiers));
            } catch (Exception e3) {
                throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsConfig.ActivitySection.class), spendingInsightsParsingErrorFactory, null);
            }
        } catch (Exception e4) {
            throw RotateKt.toProtoParsingExceptionFor(e4, activitySection != null ? Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsConfig.ActivitySection.class) : null, spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final PaymentAssetType toPaymentAssetTypeOrNull(StablecoinWithdrawalOption stablecoinWithdrawalOption) {
        Object obj;
        stablecoinWithdrawalOption.getClass();
        EnumEntriesList enumEntriesList = PaymentAssetType.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (true) {
            if (!m.hasNext()) {
                obj = null;
                break;
            }
            obj = m.next();
            if (StringsKt__StringsJVMKt.equals(((PaymentAssetType) obj).name(), stablecoinWithdrawalOption.network.asset, true)) {
                break;
            }
        }
        return (PaymentAssetType) obj;
    }

    public static final RecipientViewModel toRecipientViewModel(StablecoinWithdrawalOption stablecoinWithdrawalOption) {
        stablecoinWithdrawalOption.getClass();
        StablecoinNetwork stablecoinNetwork = stablecoinWithdrawalOption.network;
        return new RecipientViewModel(Recorder$$ExternalSyntheticOutline2.m(stablecoinNetwork.address, "_", stablecoinNetwork.chain), new Recipient(null, false, false, Recorder$$ExternalSyntheticOutline2.m(stablecoinNetwork.address, "_", stablecoinNetwork.chain), null, null, false, false, false, null, null, null, null, null, null, false, 0L, null, null, false, null, null, null, null, null, stablecoinNetwork.chainName, null, null, false, null, null, false, false, new Recipient.CryptoRecipientPayment.Stablecoin(stablecoinNetwork.address, stablecoinWithdrawalOption), -33554441, 1), stablecoinNetwork.truncatedAddress, RecipientViewModel.Avatar.StablecoinAvatar.INSTANCE, null, null, false, false, false, null, false, 8176);
    }

    public static final SpendingInsightsConfig.RecurringPaymentInfo toRecurringPaymentInfo(ProtoValidationScope protoValidationScope, CardSpendingInsightsConfig cardSpendingInsightsConfig) {
        String reportIfNullAndContinue;
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(cardSpendingInsightsConfig, spendingInsightsParsingErrorFactory, protoValidationScope);
            String reportIfNullAndContinue2 = protoValidationScope2.reportIfNullAndContinue(cardSpendingInsightsConfig.recurring_payment_info_title, "recurring_payment_info_title", (String) null);
            if (reportIfNullAndContinue2 != null && (reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(cardSpendingInsightsConfig.recurring_payment_info_description, "recurring_payment_info_description", (String) null)) != null) {
                return new SpendingInsightsConfig.RecurringPaymentInfo(reportIfNullAndContinue2, reportIfNullAndContinue);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, cardSpendingInsightsConfig != null ? Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsConfig.class) : null, spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final SpendingInsightsConfig toSpendingInsightsConfig(HasObservability hasObservability, CardSpendingInsightsConfig cardSpendingInsightsConfig) {
        hasObservability.getClass();
        cardSpendingInsightsConfig.getClass();
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(cardSpendingInsightsConfig, spendingInsightsParsingErrorFactory, hasObservability);
            String reportIfNullAndContinue = protoValidationScope.reportIfNullAndContinue(cardSpendingInsightsConfig.preview_title, "preview_title", (String) null);
            String reportIfNullAndContinue2 = protoValidationScope.reportIfNullAndContinue(cardSpendingInsightsConfig.title, "title", (String) null);
            if (reportIfNullAndContinue2 == null) {
                reportIfNullAndContinue2 = "";
            }
            CardSpendingInsightsConfig.ActivitySection activitySection = cardSpendingInsightsConfig.activity_section;
            ProtoValidationScope.required(activitySection, "activity_section");
            return new SpendingInsightsConfig(reportIfNullAndContinue, reportIfNullAndContinue2, toActivitySection(protoValidationScope, activitySection), toRecurringPaymentInfo(protoValidationScope, cardSpendingInsightsConfig));
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsConfig.class), spendingInsightsParsingErrorFactory, null);
        }
    }
}
