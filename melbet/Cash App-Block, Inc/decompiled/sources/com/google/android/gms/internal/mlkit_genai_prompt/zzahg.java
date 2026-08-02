package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.compose.ui.draw.RotateKt;
import androidx.core.net.UriKt;
import androidx.media3.common.util.TimedValueQueue;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.spendinginsights.backend.api.SpendingInsightsParsingErrorFactory;
import com.squareup.cash.card.spendinginsights.backend.api.model.ColoredText;
import com.squareup.cash.cdf.asset.EntryPoint;
import com.squareup.cash.cdf.asset.PersonalizationOrigin;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.payments.presenters.RecipientMapper;
import com.squareup.cash.payments.presenters.UtilsKt;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.ColoredString;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class zzahg {
    public static final int getWordEnd(TimedValueQueue timedValueQueue, int i) {
        int i2;
        int nextBoundary;
        if (timedValueQueue.isAfterPunctuation(timedValueQueue.nextBoundary(i))) {
            timedValueQueue.checkOffsetIsValid(i);
            i2 = i;
            while (i2 != -1 && (timedValueQueue.isOnPunctuation(i2) || !timedValueQueue.isAfterPunctuation(i2))) {
                i2 = timedValueQueue.nextBoundary(i2);
            }
        } else {
            timedValueQueue.checkOffsetIsValid(i);
            if (timedValueQueue.isAfterLetterOrDigitOrEmoji(i)) {
                if (!timedValueQueue.isBoundary(i) || timedValueQueue.isOnLetterOrDigitOrEmoji(i)) {
                    nextBoundary = timedValueQueue.nextBoundary(i);
                    i2 = nextBoundary;
                } else {
                    i2 = i;
                }
            } else if (timedValueQueue.isOnLetterOrDigitOrEmoji(i)) {
                nextBoundary = timedValueQueue.nextBoundary(i);
                i2 = nextBoundary;
            } else {
                i2 = -1;
            }
        }
        return i2 == -1 ? i : i2;
    }

    public static final int getWordStart(TimedValueQueue timedValueQueue, int i) {
        int i2;
        int prevBoundary;
        if (timedValueQueue.isOnPunctuation(timedValueQueue.prevBoundary(i))) {
            timedValueQueue.checkOffsetIsValid(i);
            i2 = i;
            while (i2 != -1 && (!timedValueQueue.isOnPunctuation(i2) || timedValueQueue.isAfterPunctuation(i2))) {
                i2 = timedValueQueue.prevBoundary(i2);
            }
        } else {
            timedValueQueue.checkOffsetIsValid(i);
            if (timedValueQueue.isOnLetterOrDigitOrEmoji(i)) {
                if (!timedValueQueue.isBoundary(i) || timedValueQueue.isAfterLetterOrDigitOrEmoji(i)) {
                    prevBoundary = timedValueQueue.prevBoundary(i);
                    i2 = prevBoundary;
                } else {
                    i2 = i;
                }
            } else if (timedValueQueue.isAfterLetterOrDigitOrEmoji(i)) {
                prevBoundary = timedValueQueue.prevBoundary(i);
                i2 = prevBoundary;
            } else {
                i2 = -1;
            }
        }
        return i2 == -1 ? i : i2;
    }

    public static final void goToProfileScreen(BetterNavigator.ScreenNavigator screenNavigator, UUID uuid, Recipient recipient, CustomerProfileViewOpen.EntryPoint entryPoint, ProfileScreens.ProfileScreen.Action action, GetProfileDetailsContext getProfileDetailsContext) {
        ProfileScreens.ProfileScreen.ProfileAnalytics profileAnalytics;
        Screen profileFor;
        uuid.getClass();
        recipient.getClass();
        LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
        ProfileScreens.ProfileScreen.Customer buildCustomerFromRecipient = UriKt.buildCustomerFromRecipient(recipient);
        ProfileScreens.ProfileScreen.BackNavigationAction backNavigationAction = ProfileScreens.ProfileScreen.BackNavigationAction.BACK;
        Recipient.Analytics analytics = recipient.analytics;
        if (analytics != null) {
            profileAnalytics = new ProfileScreens.ProfileScreen.ProfileAnalytics(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, analytics.isC4bBusiness, analytics.isMultipleAccountHolder, analytics.isFirstLinkedAccount, analytics.accountHolderToken);
        } else {
            profileAnalytics = null;
        }
        profileFor = ProfileLauncher.profileFor(buildCustomerFromRecipient, action, (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : backNavigationAction, uuid, getProfileDetailsContext, entryPoint, ActivityScreen.INSTANCE, (r22 & 128) == 0, (r22 & 256) != 0 ? null : profileAnalytics, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
        screenNavigator.goTo(profileFor);
    }

    public static void openPersonalizePayments$default(Navigator navigator, UUID uuid, Money money, Money money2, Orientation orientation, CashInstrumentType cashInstrumentType, InstrumentSelection instrumentSelection, List list, Profile profile, BalanceSnapshot balanceSnapshot, List list2, InstrumentLinkingConfig instrumentLinkingConfig, boolean z, String str, MoneyFormatter moneyFormatter, RealNetworkInfo realNetworkInfo, AndroidStringManager androidStringManager, String str2, Analytics analytics, String str3, String str4, AppCreationActivity appCreationActivity, String str5, PersonalizationOrigin personalizationOrigin, BlockersData.MoneybotContext moneybotContext, int i) {
        boolean z2;
        boolean z3;
        InstrumentSelectionData instrumentSelectionData;
        EntryPoint entryPoint = EntryPoint.AMOUNT_FIRST;
        boolean z4 = (i & 16777216) == 0;
        InstrumentSelectionData instrumentSelectionData2 = null;
        PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion personalizePaymentQuestion = (i & 33554432) != 0 ? null : PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.INSTANCE;
        BlockersData.MoneybotContext moneybotContext2 = (i & 67108864) != 0 ? null : moneybotContext;
        navigator.getClass();
        uuid.getClass();
        money.getClass();
        money2.getClass();
        orientation.getClass();
        list.getClass();
        profile.getClass();
        list2.getClass();
        instrumentLinkingConfig.getClass();
        str.getClass();
        moneyFormatter.getClass();
        str2.getClass();
        appCreationActivity.getClass();
        SelectPaymentInstrumentOption.ExistingOption determineSelectedInstrument$default = GoogleMapKt.determineSelectedInstrument$default(list, profile, orientation, cashInstrumentType, money, balanceSnapshot, list2, instrumentLinkingConfig, z, instrumentSelection);
        List list3 = list;
        boolean z5 = !list3.isEmpty();
        boolean z6 = list.size() > 1;
        boolean z7 = orientation == Orientation.CASH;
        List list4 = list3;
        List list5 = list4;
        if (!list5.isEmpty()) {
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                if (!((Recipient) it.next()).isCashCustomer) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        if (!list5.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                Region region = ((Recipient) it2.next()).region;
                if (region == null) {
                    region = Region.USA;
                }
                if (region != Region.USA) {
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        boolean isZero = Moneys.isZero(money2);
        boolean isNetworkAvailable = realNetworkInfo.isNetworkAvailable();
        boolean z8 = Moneys.compareTo(money2, new Money(Long.valueOf((long) Moneys.displayDivisor(money2.currency_code)), (CurrencyCode) null, 6)) < 0;
        CurrencyCode currencyCode = money2.currency_code;
        if (currencyCode == null) {
            currencyCode = CurrencyCode.USD;
        }
        CurrencyCode currencyCode2 = currencyCode;
        List list6 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
        Iterator it3 = list6.iterator();
        while (it3.hasNext()) {
            arrayList.add(RecipientMapper.transform((Recipient) it3.next()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add(zzahi.forPayment((com.squareup.cash.db.contacts.Recipient) it4.next()));
        }
        RedactedParcelableList redactedParcelableList = new RedactedParcelableList(arrayList2);
        RedactedString redactedString = new RedactedString(str);
        if (determineSelectedInstrument$default != null) {
            if (determineSelectedInstrument$default instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
                instrumentSelectionData = new InstrumentSelectionData(((SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) determineSelectedInstrument$default).balance.token, null, CashInstrumentType.CASH_BALANCE, null);
            } else if (!(determineSelectedInstrument$default instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            } else {
                SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument existingInstrument = (SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) determineSelectedInstrument$default;
                Instrument instrument = existingInstrument.instrument;
                instrumentSelectionData = new InstrumentSelectionData(instrument.token, instrument.cardBrand, instrument.cashInstrumentType, existingInstrument.creditCardFee);
            }
            instrumentSelectionData2 = instrumentSelectionData;
        }
        PaymentScreens.PersonalizePayment personalizePayment = new PaymentScreens.PersonalizePayment(uuid, money2, redactedParcelableList, redactedString, instrumentSelectionData2, false, str3, str4, appCreationActivity, str5, (Screen) PaymentScreens$HomeScreens$Home.INSTANCE, instrumentLinkingConfig.credit_card_linking_enabled, instrumentLinkingConfig.credit_card_fee_bps, instrumentLinkingConfig.cash_balance_enabled, ClientScenario.PAYMENT_FLOW, str2, moneybotContext2, z4, personalizationOrigin, PKIFailureInfo.signerNotTrusted);
        String uuid2 = uuid.toString();
        uuid2.getClass();
        UtilsKt.showPersonalizePayments(str2, z5, z6, z7, z2, z3, isZero, isNetworkAvailable, z8, currencyCode2, navigator, androidStringManager, moneyFormatter, personalizePayment, analytics, entryPoint, uuid2, personalizationOrigin, personalizePaymentQuestion);
    }

    public static final ColoredText toColoredText(ProtoValidationScope protoValidationScope, ColoredString coloredString) {
        coloredString.getClass();
        try {
            LocalizedString localizedString = coloredString.text;
            if (localizedString == null) {
                throw new IllegalArgumentException("text");
            }
            String str = localizedString.translated_value;
            if (str == null) {
                throw new IllegalArgumentException("text translated_value".toString());
            }
            Color color = coloredString.color;
            if (color != null) {
                return new ColoredText(color, str);
            }
            throw new IllegalArgumentException("color");
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ColoredString.class), SpendingInsightsParsingErrorFactory.INSTANCE, null);
        }
    }
}
