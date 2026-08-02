package com.squareup.cash.data.blockers;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.screen.Screen;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.card.onboarding.screens.CardStyleScreen;
import com.squareup.cash.card.onboarding.screens.PaymentDeviceCustomizationScreen;
import com.squareup.cash.card.onboarding.screens.TagOrderConfirmationScreen;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeStart;
import com.squareup.cash.cdf.cashcard.CashCardOrderStart;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.requestsponsorship.screens.SelectDependentScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.family.requestsponsorship.screens.SponsorSelectionDetailsScreen;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.booklet.MoneyTabBookletScreen;
import com.squareup.cash.observability.protovalidation.EmptyObservability;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.paychecks.backend.api.mapper.EditDistributionConfigurationMappersKt;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.paychecks.screens.SetPaycheckMultipleAllocationScreen;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckBlockerScreen;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingBlockerScreen;
import com.squareup.cash.phoneplans.WirelessProviderListBlockerScreen;
import com.squareup.cash.recurringpayments.screens.CreateOrEditRecurringPaymentScreen;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.security.screens.PasswordScreenData;
import com.squareup.cash.security.screens.SetPasswordScreen;
import com.squareup.cash.security.screens.VerifyPasswordScreen;
import com.squareup.cash.transfers.data.RecurringTransferData;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.screens.ScheduledReloadConfirmationScreen;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.whimsicard.app.Stamp;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.ActivityPickerBlocker;
import com.squareup.protos.franklin.api.AddMoneyBlocker;
import com.squareup.protos.franklin.api.AtmPickerAmountBlocker;
import com.squareup.protos.franklin.api.AuthorizeDigitalWalletPaymentBlocker;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CalendarBlocker;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.CreditFirstTimeBorrowBlocker;
import com.squareup.protos.franklin.api.CreditMultiStepLoadingBlocker;
import com.squareup.protos.franklin.api.EmailVerificationBlocker;
import com.squareup.protos.franklin.api.FileCategory;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.GpsLocationConsentBlocker;
import com.squareup.protos.franklin.api.IdentityVerificationBlocker;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.api.InstrumentVerificationBlocker;
import com.squareup.protos.franklin.api.ManagedAccountLoginQrCodeProviderBlocker;
import com.squareup.protos.franklin.api.MoneyTabBookletBlocker;
import com.squareup.protos.franklin.api.PasscodeCreationBlocker;
import com.squareup.protos.franklin.api.PasscodeVerificationBlocker;
import com.squareup.protos.franklin.api.PasswordCreationBlocker;
import com.squareup.protos.franklin.api.PasswordVerificationBlocker;
import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;
import com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlocker;
import com.squareup.protos.franklin.api.PaymentPlanDataBlocker;
import com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker;
import com.squareup.protos.franklin.api.PhonePlanNewLineLoadingBlocker;
import com.squareup.protos.franklin.api.PhoneVerificationBlocker;
import com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import com.squareup.protos.franklin.api.RequestPushNotificationsBlocker;
import com.squareup.protos.franklin.api.RewardCodeBlocker;
import com.squareup.protos.franklin.api.ScheduledTransactionBlocker;
import com.squareup.protos.franklin.api.SelectAllowlistCustomerBlocker;
import com.squareup.protos.franklin.api.SelectDependentsBlocker;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.protos.franklin.api.SelectSponsorsBlocker;
import com.squareup.protos.franklin.api.SelectionBlocker;
import com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker;
import com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker;
import com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker;
import com.squareup.protos.franklin.api.TagConfirmationBlocker;
import com.squareup.protos.franklin.api.TaxWebViewBlocker;
import com.squareup.protos.franklin.api.ThreeDsAuthenticationBlocker;
import com.squareup.protos.franklin.api.TransferOptionSelectionBlocker;
import com.squareup.protos.franklin.api.U13CelebrationBlocker;
import com.squareup.protos.franklin.api.WebviewBlocker;
import com.squareup.protos.franklin.api.WirelessProviderListBlocker;
import com.squareup.protos.franklin.blockers.CashAppLocalOrderBlocker;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentBlocker;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentSuccessBlocker;
import com.squareup.protos.franklin.blockers.EarnerUpsellBlocker;
import com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker;
import com.squareup.protos.franklin.blockers.OnboardingInternalRouteBlocker;
import com.squareup.protos.franklin.blockers.PersonaDidvBlocker;
import com.squareup.protos.franklin.blockers.TreehouseBlocker;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.EmailVerificationBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.IdentityVerificationBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.InstrumentVerificationBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.NameBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.PasscodeCreationBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.PasscodeVerificationBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.PhoneNumberBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.PhoneVerificationBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.SelectionBlockerSupplement;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.cash.StringsKt;
import com.squareup.wire.MoshiJsonIntegration;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealBlockersDescriptorNavigator implements BlockersDescriptorNavigator {
    public final Analytics analytics;
    public final ProductionAttributionEventEmitter attributionEventEmitter;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final boolean hasCamera;
    public final RealJurisdictionConfigManager jurisdictionConfigManager;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/data/blockers/RealBlockersDescriptorNavigator$UnknownBlockerError", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final class UnknownBlockerError extends ReportedError {
        public final Set features;
        public final String groupingDescriptor;
        public final String message;

        public UnknownBlockerError(BlockerDescriptor blockerDescriptor) {
            blockerDescriptor.getClass();
            this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Flows.INSTANCE);
            this.groupingDescriptor = Recorder$$ExternalSyntheticOutline2.m("Unknown blocker: ", blockerDescriptor.id);
            this.message = Recorder$$ExternalSyntheticOutline2.m("Unsupported blocker received: ", blockerDescriptor.id);
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return this.features;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final String getGroupingDescriptor() {
            return this.groupingDescriptor;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[BlockersData.Style.values().length];
            try {
                iArr[BlockersData.Style.FULLSCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockersData.Style.DIALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CashInstrumentType.values().length];
            try {
                iArr2[CashInstrumentType.CREDIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CashInstrumentType.DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FileCategory.values().length];
            try {
                iArr3[FileCategory.DEBIT_CARD_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[FileCategory.DEBIT_CARD_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[FileCategory.GOVERNMENT_ISSUED_ID_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[FileCategory.GOVERNMENT_ISSUED_ID_FRONT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BlockerDescriptor.PresentationMode.values().length];
            try {
                iArr4[BlockerDescriptor.PresentationMode.REQUIRES_FULLSCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ClientScenario.values().length];
            try {
                iArr5[ClientScenario.INVITE_FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[ClientScenario.ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[ClientScenario.REPORT_MISSING_BOOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[BlockerDescriptor.DismissActionDisplayBehavior.values().length];
            try {
                iArr6[BlockerDescriptor.DismissActionDisplayBehavior.CLIENT_CONTROLLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[BlockerDescriptor.DismissActionDisplayBehavior.SERVER_CONTROLLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public RealBlockersDescriptorNavigator(AndroidPackageManager androidPackageManager, Analytics analytics, ProductionAttributionEventEmitter productionAttributionEventEmitter, FeatureFlagManager featureFlagManager, BlockerFlowListener blockerFlowListener, RealJurisdictionConfigManager realJurisdictionConfigManager, ErrorReporter errorReporter) {
        this.analytics = analytics;
        this.attributionEventEmitter = productionAttributionEventEmitter;
        this.featureFlagManager = featureFlagManager;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.jurisdictionConfigManager = realJurisdictionConfigManager;
        this.errorReporter = errorReporter;
        this.hasCamera = androidPackageManager.context.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    public static BlockerAction dismissActionOrDefault(BlockerDescriptor blockerDescriptor, BlockerAction.EndFlowAction.Result result) {
        BlockerAction blockerAction = blockerDescriptor.dismiss_action;
        if (blockerAction != null) {
            return blockerAction;
        }
        return BlockersOneofExtensionsKt.BlockerAction$default(new BlockerAction.EndFlowAction(result, null, null, 6, null), null, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isCancellable(BlockerDescriptor blockerDescriptor, ClientScenario clientScenario) {
        BlockerDescriptor.DismissActionDisplayBehavior dismissActionDisplayBehavior = blockerDescriptor.dismiss_action_display_behavior;
        int i = dismissActionDisplayBehavior == null ? -1 : WhenMappings.$EnumSwitchMapping$5[dismissActionDisplayBehavior.ordinal()];
        if (i == -1 || i == 1) {
            int i2 = clientScenario != null ? WhenMappings.$EnumSwitchMapping$4[clientScenario.ordinal()] : -1;
            return (i2 == 1 || i2 == 2 || i2 == 3) ? false : true;
        }
        if (i != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return false;
        }
        if (blockerDescriptor.dismiss_action != null) {
        }
    }

    public final BlockersScreens asScreen(CardCustomizationBlocker cardCustomizationBlocker, BlockersData blockersData) {
        Object obj;
        RedactedString redactedString;
        BlockersData blockersData2;
        List<CardCustomizationBlocker.CardOptionSection> list;
        LocalizedString localizedString;
        LocalizedString localizedString2;
        CashCardOrderStart cashCardOrderStart = new CashCardOrderStart();
        Analytics analytics = this.analytics;
        analytics.track(cashCardOrderStart, null);
        List<Stamp> list2 = cardCustomizationBlocker.available_stamps;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String str = ((Stamp) it.next()).identifier;
            str.getClass();
            arrayList.add(str);
        }
        List list3 = CollectionsKt.toList(arrayList);
        List<CardCustomizationBlocker.CardOptionSection> list4 = cardCustomizationBlocker.card_option_sections;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((CardCustomizationBlocker.CardOptionSection) it2.next()).options, arrayList2);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            CardCustomizationBlocker.CardOption cardOption = (CardCustomizationBlocker.CardOption) obj;
            String str2 = cardCustomizationBlocker.selected_card_option_identifier;
            if (str2 != null && Intrinsics.areEqual(cardOption.external_identifier, str2)) {
                break;
            }
        }
        CardCustomizationBlocker.CardOption cardOption2 = (CardCustomizationBlocker.CardOption) obj;
        String str3 = cardCustomizationBlocker.style_picker_title_text;
        str3.getClass();
        String str4 = cardCustomizationBlocker.style_picker_short_title_text;
        str4.getClass();
        String str5 = cardCustomizationBlocker.customization_prompt_text;
        str5.getClass();
        String str6 = cardCustomizationBlocker.cashtag_toggle_text;
        str6.getClass();
        String str7 = cardCustomizationBlocker.customization_title_text;
        str7.getClass();
        String str8 = cardCustomizationBlocker.stamp_added_text;
        str8.getClass();
        String str9 = cardCustomizationBlocker.return_to_draw_mode_text;
        str9.getClass();
        String str10 = cardCustomizationBlocker.too_much_ink_message;
        Float f = cardCustomizationBlocker.maximum_ink_coverage;
        f.getClass();
        float floatValue = f.floatValue();
        List<CardCustomizationBlocker.CardOptionSection> list5 = cardCustomizationBlocker.card_option_sections;
        String str11 = cardCustomizationBlocker.formatted_cashtag;
        if (str11 != null) {
            redactedString = new RedactedString(str11);
            list = list5;
            blockersData2 = blockersData;
        } else {
            redactedString = null;
            blockersData2 = blockersData;
            list = list5;
        }
        CardStyleScreen cardStyleScreen = new CardStyleScreen(blockersData2, str3, str4, str5, str6, str7, str8, str9, str10, floatValue, list, redactedString, list3);
        if (cardOption2 == null) {
            return cardStyleScreen;
        }
        analytics.track(new CashCardCustomizeStart(CashCardCustomizeStart.CustomizationType.PERSONALIZATION), null);
        CardCustomizationBlocker.CardPreviewText cardPreviewText = cardOption2.card_preview_text;
        cardPreviewText.getClass();
        String str12 = cardPreviewText.title;
        str12.getClass();
        CardCustomizationBlocker.CardPreviewText cardPreviewText2 = cardOption2.card_preview_text;
        cardPreviewText2.getClass();
        String str13 = cardPreviewText2.app_theme_text;
        CardCustomizationBlocker.CardPreviewText cardPreviewText3 = cardOption2.card_preview_text;
        cardPreviewText3.getClass();
        Color color = cardPreviewText3.app_theme_ui_text_color_override;
        CardCustomizationBlocker.CardPreviewText cardPreviewText4 = cardOption2.card_preview_text;
        cardPreviewText4.getClass();
        CardCustomizationBlocker.PreviewHalfSheetContent previewHalfSheetContent = cardPreviewText4.preview_sheet;
        String translated = (previewHalfSheetContent == null || (localizedString2 = previewHalfSheetContent.title_ls) == null) ? null : StringsKt.translated(localizedString2);
        CardCustomizationBlocker.CardPreviewText cardPreviewText5 = cardOption2.card_preview_text;
        cardPreviewText5.getClass();
        CardCustomizationBlocker.PreviewHalfSheetContent previewHalfSheetContent2 = cardPreviewText5.preview_sheet;
        String translated2 = (previewHalfSheetContent2 == null || (localizedString = previewHalfSheetContent2.body_ls) == null) ? null : StringsKt.translated(localizedString);
        CardCustomizationBlocker.CardPreviewText cardPreviewText6 = cardOption2.card_preview_text;
        cardPreviewText6.getClass();
        CardCustomizationBlocker.PreviewHalfSheetContent previewHalfSheetContent3 = cardPreviewText6.preview_sheet;
        CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage localSheetImage = previewHalfSheetContent3 != null ? previewHalfSheetContent3.local_image : null;
        CardCustomizationBlocker.CardPreviewText cardPreviewText7 = cardOption2.card_preview_text;
        cardPreviewText7.getClass();
        String str14 = cardPreviewText7.body;
        str14.getClass();
        CardCustomizationBlocker.CardPreviewText cardPreviewText8 = cardOption2.card_preview_text;
        cardPreviewText8.getClass();
        String str15 = cardPreviewText8.customize_card_button_title;
        CardCustomizationBlocker.CardPreviewText cardPreviewText9 = cardOption2.card_preview_text;
        cardPreviewText9.getClass();
        String str16 = cardPreviewText9.edit_customization_button_title;
        CardCustomizationBlocker.CardPreviewText cardPreviewText10 = cardOption2.card_preview_text;
        cardPreviewText10.getClass();
        String str17 = cardPreviewText10.order_card_button_title;
        str17.getClass();
        CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay = cardOption2.cashtag_display;
        cashtagDisplay.getClass();
        String str18 = cardCustomizationBlocker.formatted_cashtag;
        RedactedString redactedString2 = str18 != null ? new RedactedString(str18) : null;
        Boolean bool = cardOption2.customization_eligible;
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        CardPresentationStyle cardPresentationStyle = cardOption2.presentationStyle;
        if (cardPresentationStyle == null) {
            cardPresentationStyle = CardPresentationStyle.PSEUDO_3D;
        }
        return new CardPreviewScreen(blockersData, cardStyleScreen, cardOption2, str12, str13, color, str14, str15, str16, str17, cashtagDisplay, redactedString2, booleanValue, cardPresentationStyle, cardOption2.card_availability != CardCustomizationBlocker.CardOption.CardAvailability.UNAVAILABLE, translated, translated2, localSheetImage, list3, cardOption2.payment_method);
    }

    @Override // com.squareup.cash.data.blockers.BlockersDataNavigator
    public final boolean canGoBack(Screen screen, BlockersData blockersData) {
        screen.getClass();
        return BlockersNavigationUtil.canGoBack(screen, blockersData);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if ((r2 instanceof com.squareup.cash.favorites.screens.ListFavorites) == false) goto L23;
     */
    @Override // com.squareup.cash.data.blockers.BlockersDataNavigator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Screen getBack(Screen screen, BlockersData blockersData) {
        ClientScenario clientScenario;
        screen.getClass();
        blockersData.getClass();
        if (!(screen instanceof BlockersScreens.StatusResultScreen) && ((!(screen instanceof BlockersScreens.SelectionScreen) || blockersData.clientScenario != ClientScenario.REQUEST_PHYSICAL_CARD) && blockersData.flow != BlockersData.Flow.SERVER_FLOW && (clientScenario = blockersData.clientScenario) != ClientScenario.EXCHANGE_EQUITY && clientScenario != ClientScenario.EXCHANGE_CURRENCY)) {
            if (clientScenario == ClientScenario.PAYMENT_FLOW) {
                Screen screen2 = blockersData.exitScreen;
                if (!(screen2 instanceof ActivityScreen)) {
                    if (!(screen2 instanceof GlobalSearchScreen)) {
                    }
                }
            }
            if (clientScenario == ClientScenario.RECOVER_ACCOUNT || clientScenario == ClientScenario.RECOVER_ALIAS_ACCOUNT) {
                return new BlockersScreens.ConfirmExitOnboardingFlowScreen(blockersData);
            }
            return null;
        }
        return blockersData.exitScreen;
    }

    @Override // com.squareup.cash.data.blockers.BlockersDataNavigator
    public final Screen getNext(Screen screen, BlockersData blockersData) {
        blockersData.getClass();
        List nextBlockers = blockersData.getNextBlockers();
        BlockersData.Flow flow = blockersData.flow;
        Screen screen2 = (Screen) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(CollectionsKt.asSequence(nextBlockers), new MoleculeKt$$ExternalSyntheticLambda1(7, blockersData, this, screen)));
        if (screen2 != null) {
            return screen2;
        }
        if (!(screen instanceof BlockersScreens.StatusResultScreen)) {
            TransferData transferData = blockersData.transferData;
            TransferType transferType = transferData != null ? transferData.f1215type : null;
            TransferType transferType2 = TransferType.ADD_CASH;
            ProductionAttributionEventEmitter productionAttributionEventEmitter = this.attributionEventEmitter;
            if (transferType == transferType2) {
                productionAttributionEventEmitter.trackEvent("Successful Money Movement", MapsKt__MapsKt.mutableMapOf(new Pair("type", "cash-in")));
            } else {
                ClientScenario clientScenario = blockersData.clientScenario;
                if (clientScenario == ClientScenario.REQUEST_PHYSICAL_CARD) {
                    productionAttributionEventEmitter.trackEvent("Cash Card Order", new LinkedHashMap());
                } else if (clientScenario == ClientScenario.EXCHANGE_EQUITY) {
                    productionAttributionEventEmitter.trackEvent("Successful Money Movement", MapsKt__MapsKt.mutableMapOf(new Pair("type", "equities")));
                } else if (clientScenario == ClientScenario.EXCHANGE_CURRENCY) {
                    productionAttributionEventEmitter.trackEvent("Successful Money Movement", MapsKt__MapsKt.mutableMapOf(new Pair("type", "btc")));
                } else if (clientScenario == ClientScenario.PAYMENT_FLOW) {
                    productionAttributionEventEmitter.trackEvent("Successful Money Movement", MapsKt__MapsKt.mutableMapOf(new Pair("type", "p2p")));
                } else {
                    Timber.Forest.v("Unknown flow completed (clientScenario=" + clientScenario + ")", new Object[0]);
                }
            }
            this.blockerFlowAnalytics.onFlowCompleted(blockersData);
            StatusResult statusResult = blockersData.statusResult;
            if (statusResult != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[blockersData.style.ordinal()];
                if (i == 1) {
                    return new BlockersScreens.StatusResultFullScreen(blockersData, flow, statusResult);
                }
                if (i == 2) {
                    return new BlockersScreens.StatusResultDialog(blockersData, flow, statusResult);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return flow == BlockersData.Flow.ONBOARDING ? new BlockersScreens.WelcomeScreen(blockersData) : blockersData.exitScreenOnSuccess;
    }

    @Override // com.squareup.cash.data.blockers.BlockersDataNavigator
    public final Screen getSkip(Screen screen, BlockersData blockersData) {
        screen.getClass();
        blockersData.getClass();
        BlockerDescriptor blockerDescriptor = (BlockerDescriptor) CollectionsKt.first(blockersData.getNextBlockers());
        return Intrinsics.areEqual(blockerDescriptor.remote_skip, Boolean.TRUE) ? new BlockersScreens.RemoteSkipScreen(screen, blockersData) : getNext(screen, blockersData.skipBlocker(new StampsConfigQueries$$ExternalSyntheticLambda0(blockerDescriptor, 2)));
    }

    public static BlockersScreens.CashAppPayGrant asScreen(PayWithCashAuthorizationBlocker payWithCashAuthorizationBlocker, BlockersData blockersData, BlockerAction blockerAction) {
        if (blockersData.showAsHalfSheet) {
            PayWithCashAuthorizationBlocker.Avatar avatar = payWithCashAuthorizationBlocker.avatar;
            String str = payWithCashAuthorizationBlocker.title;
            String str2 = payWithCashAuthorizationBlocker.subtitle;
            Money money = null;
            PayWithCashAuthorizationBlocker.Interstitial interstitial = payWithCashAuthorizationBlocker.on_display_interstitial;
            FormBlocker.Element.CallToActionElement callToActionElement = payWithCashAuthorizationBlocker.call_to_action_element;
            FormBlocker.Element.MoneyElement moneyElement = payWithCashAuthorizationBlocker.money_element;
            if (moneyElement != null) {
                money = moneyElement.amount;
            }
            return new BlockersScreens.CashAppPayGrantSheet(blockersData, avatar, str, str2, interstitial, money, callToActionElement, payWithCashAuthorizationBlocker.footer, blockerAction, payWithCashAuthorizationBlocker.auto_dismiss_delay_ms, payWithCashAuthorizationBlocker.auto_dismiss_action);
        }
        Money money2 = null;
        PayWithCashAuthorizationBlocker.Avatar avatar2 = payWithCashAuthorizationBlocker.avatar;
        String str3 = payWithCashAuthorizationBlocker.title;
        String str4 = payWithCashAuthorizationBlocker.subtitle;
        PayWithCashAuthorizationBlocker.Interstitial interstitial2 = payWithCashAuthorizationBlocker.on_display_interstitial;
        FormBlocker.Element.CallToActionElement callToActionElement2 = payWithCashAuthorizationBlocker.call_to_action_element;
        FormBlocker.Element.MoneyElement moneyElement2 = payWithCashAuthorizationBlocker.money_element;
        if (moneyElement2 != null) {
            money2 = moneyElement2.amount;
        }
        return new BlockersScreens.CashAppPayGrantScreen(blockersData, avatar2, str3, str4, interstitial2, money2, callToActionElement2, payWithCashAuthorizationBlocker.footer, blockerAction, payWithCashAuthorizationBlocker.auto_dismiss_delay_ms, payWithCashAuthorizationBlocker.auto_dismiss_action);
    }

    public static BlockersScreens.EarnerEnrollmentBlockerScreenArgs asScreen(BlockersData blockersData, EarnerEnrollmentBlocker earnerEnrollmentBlocker) {
        if (blockersData.showAsHalfSheet) {
            return new BlockersScreens.EarnerEnrollmentBlockerSheet(blockersData, earnerEnrollmentBlocker);
        }
        return new BlockersScreens.EarnerEnrollmentBlockerScreen(blockersData, earnerEnrollmentBlocker);
    }

    public static BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs asScreen(BlockersData blockersData, EarnerEnrollmentSuccessBlocker earnerEnrollmentSuccessBlocker) {
        if (blockersData.showAsHalfSheet) {
            return new BlockersScreens.EarnerEnrollmentSuccessBlockerSheet(blockersData, earnerEnrollmentSuccessBlocker);
        }
        return new BlockersScreens.EarnerEnrollmentSuccessBlockerScreen(blockersData, earnerEnrollmentSuccessBlocker);
    }

    public static BlockersScreens.EarnerUpsellBlockerScreenArgs asScreen(BlockersData blockersData, EarnerUpsellBlocker earnerUpsellBlocker) {
        if (blockersData.showAsHalfSheet) {
            return new BlockersScreens.EarnerUpsellBlockerSheet(blockersData, earnerUpsellBlocker);
        }
        return new BlockersScreens.EarnerUpsellBlockerScreen(blockersData, earnerUpsellBlocker);
    }

    public static BlockersScreens.VerifyAliasScreen asScreen(EmailVerificationBlocker emailVerificationBlocker, BlockersData blockersData, BlockerAction blockerAction, BlockerDescriptor blockerDescriptor, EmailVerificationBlockerSupplement emailVerificationBlockerSupplement) {
        Boolean bool;
        BlockersData copy$default = BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, new RedactedString(emailVerificationBlocker.email), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -1048577, 65535);
        BlockersScreens.VerifyAliasScreen.AliasType aliasType = BlockersScreens.VerifyAliasScreen.AliasType.EMAIL;
        String str = emailVerificationBlocker.email;
        str.getClass();
        return new BlockersScreens.VerifyAliasScreen(copy$default, aliasType, new RedactedString(str), emailVerificationBlockerSupplement != null ? emailVerificationBlockerSupplement.skip_message : null, new RedactedString(emailVerificationBlockerSupplement != null ? emailVerificationBlockerSupplement.main_text : null), emailVerificationBlockerSupplement != null ? emailVerificationBlockerSupplement.additional_help_items : null, (emailVerificationBlockerSupplement == null || (bool = emailVerificationBlockerSupplement.suppress_edit_email_address) == null) ? false : bool.booleanValue(), emailVerificationBlockerSupplement != null ? emailVerificationBlockerSupplement.headline : null, (blockerAction == null || !isCancellable(blockerDescriptor, blockersData.clientScenario)) ? null : blockerAction);
    }

    public static BlockersScreens.PasscodeScreen asScreen(PasscodeVerificationBlocker passcodeVerificationBlocker, BlockersData blockersData, BlockerAction blockerAction, BlockerDescriptor blockerDescriptor, PasscodeVerificationBlockerSupplement passcodeVerificationBlockerSupplement) {
        Boolean bool;
        String str;
        BlockersScreens.PasscodeScreen.Type type2 = BlockersScreens.PasscodeScreen.Type.VERIFY;
        Instrument instrument = passcodeVerificationBlocker.instrument;
        instrument.getClass();
        String str2 = instrument.suffix;
        Instrument instrument2 = passcodeVerificationBlocker.instrument;
        instrument2.getClass();
        InstrumentType instrumentType = instrument2.card_brand;
        Instrument instrument3 = passcodeVerificationBlocker.instrument;
        instrument3.getClass();
        return new BlockersScreens.PasscodeScreen(blockersData, instrumentType, str2, instrument3.token, isCancellable(blockerDescriptor, blockersData.clientScenario) ? blockerAction : null, type2, (passcodeVerificationBlockerSupplement == null || (str = passcodeVerificationBlockerSupplement.main_text) == null) ? null : new RedactedString(str), (passcodeVerificationBlockerSupplement == null || (bool = passcodeVerificationBlockerSupplement.suppress_forgot_passcode_button) == null) ? false : bool.booleanValue(), passcodeVerificationBlockerSupplement != null ? passcodeVerificationBlockerSupplement.additional_help_items : null, passcodeVerificationBlockerSupplement != null ? passcodeVerificationBlockerSupplement.sub_text : null);
    }

    public static BlockersScreens asScreen(InstrumentVerificationBlocker instrumentVerificationBlocker, BlockersData blockersData, InstrumentVerificationBlockerSupplement instrumentVerificationBlockerSupplement) {
        String str;
        RedactedString redactedString = (instrumentVerificationBlockerSupplement == null || (str = instrumentVerificationBlockerSupplement.main_text) == null) ? null : new RedactedString(str);
        CashInstrumentType cashInstrumentType = instrumentVerificationBlocker.instrument_type.get(0);
        int i = WhenMappings.$EnumSwitchMapping$1[cashInstrumentType.ordinal()];
        if (i == 1 || i == 2) {
            return new BlockersScreens.VerifyCardScreen(blockersData, redactedString, instrumentVerificationBlockerSupplement != null ? instrumentVerificationBlockerSupplement.additional_help_items : null, instrumentVerificationBlockerSupplement != null ? instrumentVerificationBlockerSupplement.input_hint_text : null);
        }
        if (i == 3) {
            return new BlockersScreens.BankAccountLinkingScreen(blockersData, redactedString, false, true, instrumentVerificationBlockerSupplement != null ? instrumentVerificationBlockerSupplement.additional_help_items : null, instrumentVerificationBlockerSupplement != null ? instrumentVerificationBlockerSupplement.input_hint_text : null);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) cashInstrumentType, "Unexpected instrument type: ");
        return null;
    }

    public static BlockersScreens.ReferralCodeScreen asScreen(RewardCodeBlocker rewardCodeBlocker, BlockersData blockersData, BlockerDescriptor blockerDescriptor) {
        String str = rewardCodeBlocker.suggested_code;
        Integer num = rewardCodeBlocker.minimum_code_length;
        boolean z = false;
        int intValue = num != null ? num.intValue() : 0;
        Boolean bool = blockerDescriptor.skippable;
        if (bool != null) {
            z = bool.booleanValue();
        } else if (blockersData.flow != BlockersData.Flow.ONBOARDING) {
            z = true;
        }
        return new BlockersScreens.ReferralCodeScreen(blockersData, str, z, intValue);
    }

    public static BlockersScreens asScreen(IdentityVerificationBlocker identityVerificationBlocker, Screen screen, BlockersData blockersData, BlockersData blockersData2, IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement) {
        if ((screen instanceof BlockersScreens.SetNameScreen) && ((BlockersScreens.SetNameScreen) screen).nameType == BlockersScreens.SetNameScreen.NameType.LEGAL) {
            return new BlockersScreens.BirthdayScreen(blockersData2, new RedactedString(identityVerificationBlockerSupplement.birthdate_main_text), new RedactedString((String) blockersData.birthday.getValue()));
        }
        if (screen instanceof BlockersScreens.BirthdayScreen) {
            if (Intrinsics.areEqual(identityVerificationBlocker.requires_address, Boolean.TRUE)) {
                return new BlockersScreens.StreetAddressScreen(blockersData2, BlockersScreens.StreetAddressScreen.FormType.FULL_ADDRESS, blockersData2.address, null, null, null, blockersData.addressTypeaheadEnabled, identityVerificationBlockerSupplement.additional_help_items, false, false, 1024);
            }
            Boolean bool = identityVerificationBlocker.requires_full_ssn;
            return new BlockersScreens.SsnScreen(blockersData2, bool != null ? bool.booleanValue() : false, blockersData.ssn, new RedactedString(identityVerificationBlockerSupplement.ssn_main_text), identityVerificationBlockerSupplement.additional_help_items);
        }
        Boolean bool2 = identityVerificationBlocker.requires_full_name;
        boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = identityVerificationBlocker.requires_birthdate;
        boolean booleanValue2 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = identityVerificationBlocker.requires_last_four_ssn;
        boolean booleanValue3 = bool4 != null ? bool4.booleanValue() : false;
        Boolean bool5 = identityVerificationBlocker.requires_full_ssn;
        boolean booleanValue4 = bool5 != null ? bool5.booleanValue() : false;
        Boolean bool6 = identityVerificationBlocker.requires_address;
        boolean booleanValue5 = bool6 != null ? bool6.booleanValue() : false;
        if (booleanValue && booleanValue2 && (booleanValue3 || booleanValue4 || booleanValue5)) {
            String str = (String) blockersData.legalName.getValue();
            if (str == null) {
                str = identityVerificationBlockerSupplement.name_prefill;
            }
            return new BlockersScreens.SetNameScreen(blockersData, BlockersScreens.SetNameScreen.NameType.LEGAL, new RedactedString(identityVerificationBlockerSupplement.name_main_text), new RedactedString(str), new RedactedString(identityVerificationBlockerSupplement.name_hint_text), 0, 0, identityVerificationBlockerSupplement.additional_help_items, null, false, null, false, BlockersScreens.SetNameScreen.SetNameType.SetNameOnly.INSTANCE);
        }
        if (!booleanValue && !booleanValue2 && (booleanValue3 || booleanValue4)) {
            return new BlockersScreens.SsnScreen(blockersData, booleanValue4, false, new RedactedString(null), new RedactedString(identityVerificationBlockerSupplement.ssn_main_text), identityVerificationBlockerSupplement.additional_help_items);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(blockersData, "Cannot handle identity verification blocker ");
        return null;
    }

    public static BlockersScreens.RegisterAliasScreen asScreen(BlockersData blockersData, PhoneNumberBlockerSupplement phoneNumberBlockerSupplement, Boolean bool) {
        return new BlockersScreens.RegisterAliasScreen(blockersData, BlockersScreens.RegisterAliasScreen.Mode.REGISTER_SMS, new RedactedString(phoneNumberBlockerSupplement != null ? phoneNumberBlockerSupplement.main_text : null), null, phoneNumberBlockerSupplement != null ? phoneNumberBlockerSupplement.input_hint_text : null, null, null, null, bool != null ? bool.booleanValue() : false, false, null, 1768);
    }

    public static BlockersScreens.VerifyAliasScreen asScreen(PhoneVerificationBlocker phoneVerificationBlocker, BlockersData blockersData, BlockerAction blockerAction, BlockerDescriptor blockerDescriptor, PhoneVerificationBlockerSupplement phoneVerificationBlockerSupplement) {
        Boolean bool;
        BlockersData copy$default = BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, new RedactedString(phoneVerificationBlocker.number), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -524289, 65535);
        BlockersScreens.VerifyAliasScreen.AliasType aliasType = BlockersScreens.VerifyAliasScreen.AliasType.SMS;
        String str = phoneVerificationBlocker.number;
        str.getClass();
        return new BlockersScreens.VerifyAliasScreen(copy$default, aliasType, new RedactedString(str), phoneVerificationBlockerSupplement != null ? phoneVerificationBlockerSupplement.skip_message : null, new RedactedString(phoneVerificationBlockerSupplement != null ? phoneVerificationBlockerSupplement.main_text : null), phoneVerificationBlockerSupplement != null ? phoneVerificationBlockerSupplement.additional_help_items : null, (phoneVerificationBlockerSupplement == null || (bool = phoneVerificationBlockerSupplement.suppress_edit_phone_number) == null) ? false : bool.booleanValue(), null, (blockerAction == null || !isCancellable(blockerDescriptor, blockersData.clientScenario)) ? null : blockerAction);
    }

    public static BlockersScreens.SetNameScreen asScreen(BlockersData blockersData, NameBlockerSupplement nameBlockerSupplement) {
        Integer num;
        Integer num2;
        String str = nameBlockerSupplement != null ? nameBlockerSupplement.name_prefill : null;
        BlockersScreens.SetNameScreen.NameType nameType = BlockersScreens.SetNameScreen.NameType.DISPLAY;
        RedactedString redactedString = new RedactedString(nameBlockerSupplement != null ? nameBlockerSupplement.main_text : null);
        RedactedString redactedString2 = new RedactedString(str);
        RedactedString redactedString3 = new RedactedString(nameBlockerSupplement != null ? nameBlockerSupplement.hint_text : null);
        int i = 0;
        int intValue = (nameBlockerSupplement == null || (num2 = nameBlockerSupplement.min_length) == null) ? 0 : num2.intValue();
        if (nameBlockerSupplement != null && (num = nameBlockerSupplement.max_length) != null) {
            i = num.intValue();
        }
        return new BlockersScreens.SetNameScreen(blockersData, nameType, redactedString, redactedString2, redactedString3, intValue, i, null, nameBlockerSupplement != null ? nameBlockerSupplement.footer_text : null, false, null, false, BlockersScreens.SetNameScreen.SetNameType.SetNameOnly.INSTANCE);
    }

    public static BlockersScreens.ThreeDsAuthenticationScreen asScreen(ThreeDsAuthenticationBlocker threeDsAuthenticationBlocker, BlockersData blockersData) {
        String str = threeDsAuthenticationBlocker.directory_server_id;
        str.getClass();
        String str2 = threeDsAuthenticationBlocker.message_version;
        str2.getClass();
        return new BlockersScreens.ThreeDsAuthenticationScreen(blockersData, str, str2, threeDsAuthenticationBlocker.progress_message, threeDsAuthenticationBlocker.issuer_logo, threeDsAuthenticationBlocker.minimum_delay_ms != null ? Long.valueOf(r0.intValue()) : null, threeDsAuthenticationBlocker.client_timeout_seconds != null ? Long.valueOf(TimeUnit.SECONDS.toMillis(r0.intValue())) : null, threeDsAuthenticationBlocker.ip_address);
    }

    public static BlockersScreens.GooglePayCompleteProvisioningScreen asScreen(BlockersData blockersData) {
        return new BlockersScreens.GooglePayCompleteProvisioningScreen(blockersData);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BlockersScreens.FormScreen asScreen(FormBlocker formBlocker, BlockersData blockersData, BlockerAction blockerAction, BlockerDescriptor blockerDescriptor, BlockerDescriptor.HideableBlockerAction hideableBlockerAction, List list) {
        FormBlocker.OnDisplayEffect onDisplayEffect;
        FormBlocker.Effect effect;
        FormBlocker.RemoteOnDisplayEffect remoteOnDisplayEffect;
        FormBlocker.Element.ButtonElement.Type type2;
        FormBlocker.Element.ButtonElement.Style style;
        FormBlocker.Element.ButtonElement.Style style2;
        List<FormBlocker.Element> list2 = formBlocker.elements;
        BlockerAction blockerAction2 = formBlocker.primary_action;
        FormBlocker.Icon icon = formBlocker.primary_action_icon;
        BlockerAction blockerAction3 = formBlocker.secondary_action;
        String str = formBlocker.disclaimer_text;
        BlockerAction blockerAction4 = formBlocker.help_action;
        FormBlocker.Effect effect2 = formBlocker.effect;
        if (effect2 != null) {
            FormBlocker.Effect.OnDisplayEffect onDisplayEffect2 = effect2 instanceof FormBlocker.Effect.OnDisplayEffect ? (FormBlocker.Effect.OnDisplayEffect) effect2 : null;
            if (onDisplayEffect2 != null) {
                onDisplayEffect = onDisplayEffect2.getValue();
                effect = formBlocker.effect;
                if (effect != null) {
                    FormBlocker.Effect.RemoteOnDisplayEffect remoteOnDisplayEffect2 = effect instanceof FormBlocker.Effect.RemoteOnDisplayEffect ? (FormBlocker.Effect.RemoteOnDisplayEffect) effect : null;
                    if (remoteOnDisplayEffect2 != null) {
                        remoteOnDisplayEffect = remoteOnDisplayEffect2.getValue();
                        Boolean bool = formBlocker.requires_full_scroll;
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        type2 = formBlocker.primary_action_type;
                        if (type2 == null) {
                            type2 = FormBlocker.Element.ButtonElement.Type.NORMAL;
                        }
                        style = formBlocker.primary_action_style;
                        if (style == null) {
                            style = FormBlocker.Element.ButtonElement.Style.PRIMARY;
                        }
                        style2 = formBlocker.secondary_action_style;
                        if (style2 == null) {
                            style2 = FormBlocker.Element.ButtonElement.Style.SECONDARY;
                        }
                        boolean isCancellable = isCancellable(blockerDescriptor, blockersData.clientScenario);
                        BlockerAction blockerAction5 = hideableBlockerAction != null ? hideableBlockerAction.action : null;
                        BlockerDescriptor.TitleBarAccessoryText titleBarAccessoryText = blockerDescriptor.title_bar_accessory_text;
                        return new BlockersScreens.FormScreen(blockersData, list2, blockerAction2, icon, blockerAction3, str, blockerAction4, blockerAction, onDisplayEffect, remoteOnDisplayEffect, booleanValue, type2, style, style2, isCancellable, blockerAction5, titleBarAccessoryText != null ? titleBarAccessoryText.text : null, list, formBlocker.subforms);
                    }
                }
                remoteOnDisplayEffect = null;
                Boolean bool2 = formBlocker.requires_full_scroll;
                if (bool2 != null) {
                }
                type2 = formBlocker.primary_action_type;
                if (type2 == null) {
                }
                style = formBlocker.primary_action_style;
                if (style == null) {
                }
                style2 = formBlocker.secondary_action_style;
                if (style2 == null) {
                }
                boolean isCancellable2 = isCancellable(blockerDescriptor, blockersData.clientScenario);
                if (hideableBlockerAction != null) {
                }
                BlockerDescriptor.TitleBarAccessoryText titleBarAccessoryText2 = blockerDescriptor.title_bar_accessory_text;
                return new BlockersScreens.FormScreen(blockersData, list2, blockerAction2, icon, blockerAction3, str, blockerAction4, blockerAction, onDisplayEffect, remoteOnDisplayEffect, booleanValue, type2, style, style2, isCancellable2, blockerAction5, titleBarAccessoryText2 != null ? titleBarAccessoryText2.text : null, list, formBlocker.subforms);
            }
        }
        onDisplayEffect = null;
        effect = formBlocker.effect;
        if (effect != null) {
        }
        remoteOnDisplayEffect = null;
        Boolean bool22 = formBlocker.requires_full_scroll;
        if (bool22 != null) {
        }
        type2 = formBlocker.primary_action_type;
        if (type2 == null) {
        }
        style = formBlocker.primary_action_style;
        if (style == null) {
        }
        style2 = formBlocker.secondary_action_style;
        if (style2 == null) {
        }
        boolean isCancellable22 = isCancellable(blockerDescriptor, blockersData.clientScenario);
        if (hideableBlockerAction != null) {
        }
        BlockerDescriptor.TitleBarAccessoryText titleBarAccessoryText22 = blockerDescriptor.title_bar_accessory_text;
        return new BlockersScreens.FormScreen(blockersData, list2, blockerAction2, icon, blockerAction3, str, blockerAction4, blockerAction, onDisplayEffect, remoteOnDisplayEffect, booleanValue, type2, style, style2, isCancellable22, blockerAction5, titleBarAccessoryText22 != null ? titleBarAccessoryText22.text : null, list, formBlocker.subforms);
    }

    public static BlockersScreens.SelectionFullScreen asScreen(SelectionBlocker selectionBlocker, BlockersData blockersData, SelectionBlockerSupplement selectionBlockerSupplement) {
        SelectionBlocker.Icon icon = selectionBlocker.icon;
        String str = selectionBlocker.header_text;
        String str2 = selectionBlocker.main_text;
        return new BlockersScreens.SelectionFullScreen(blockersData, icon, str, str2 != null ? new RedactedString(str2) : null, selectionBlocker.footer_text, selectionBlocker.primary_option, selectionBlocker.secondary_option, selectionBlocker.options, selectionBlocker.amount, selectionBlockerSupplement != null ? selectionBlockerSupplement.additional_help_items : null, selectionBlocker.detail_rows);
    }

    public static BlockersScreens asScreen(PasscodeCreationBlocker passcodeCreationBlocker, BlockersData blockersData, PasscodeCreationBlockerSupplement passcodeCreationBlockerSupplement) {
        Boolean bool;
        ClientScenario clientScenario = blockersData.clientScenario;
        boolean z = clientScenario == ClientScenario.CHANGE_PASSCODE;
        boolean z2 = clientScenario == ClientScenario.RESET_PASSCODE;
        BlockersScreens.SetPinScreen.TextOverrides textOverrides = new BlockersScreens.SetPinScreen.TextOverrides(passcodeCreationBlockerSupplement != null ? passcodeCreationBlockerSupplement.prompt_main_text : null, passcodeCreationBlockerSupplement != null ? passcodeCreationBlockerSupplement.confirmation_main_text : null, passcodeCreationBlockerSupplement != null ? passcodeCreationBlockerSupplement.prompt_sub_text : null, passcodeCreationBlockerSupplement != null ? passcodeCreationBlockerSupplement.confirmation_sub_text : null);
        boolean booleanValue = (passcodeCreationBlockerSupplement == null || (bool = passcodeCreationBlockerSupplement.skippable) == null) ? false : bool.booleanValue();
        Boolean bool2 = passcodeCreationBlocker.requires_existing_passcode;
        if (bool2 != null ? bool2.booleanValue() : false) {
            String str = passcodeCreationBlocker.instrument_token;
            if (Intrinsics.areEqual(str, blockersData.customerPasscodeInstrumentToken)) {
                return new BlockersScreens.SetPinScreen(blockersData, z, z2, str, textOverrides, booleanValue);
            }
            return new BlockersScreens.ConfirmCvvScreen(blockersData, str, textOverrides);
        }
        return new BlockersScreens.SetPinScreen(blockersData, z, z2, null, textOverrides, booleanValue);
    }

    public static SelectSponsorScreen asScreen(SelectSponsorsBlocker selectSponsorsBlocker, BlockersData blockersData) {
        String str = selectSponsorsBlocker.title;
        str.getClass();
        String str2 = selectSponsorsBlocker.to_hint;
        str2.getClass();
        Boolean bool = selectSponsorsBlocker.should_only_recommend_cash_users;
        return new SelectSponsorScreen(blockersData, str, str2, bool != null ? bool.booleanValue() : true, selectSponsorsBlocker.contacts_card, selectSponsorsBlocker.contacts_dialog, selectSponsorsBlocker.invite_contact_action);
    }

    public static BlockersScreens.SelectAllowlistCustomerBlockerScreen asScreen(SelectAllowlistCustomerBlocker selectAllowlistCustomerBlocker, BlockersData blockersData) {
        return new BlockersScreens.SelectAllowlistCustomerBlockerScreen(blockersData, selectAllowlistCustomerBlocker.for_customer_token, selectAllowlistCustomerBlocker.back_action, selectAllowlistCustomerBlocker.managed_account_first_name, selectAllowlistCustomerBlocker.allowlist_limit);
    }

    public static SelectDependentScreen asScreen(SelectDependentsBlocker selectDependentsBlocker, BlockersData blockersData) {
        String str = selectDependentsBlocker.title;
        str.getClass();
        String str2 = selectDependentsBlocker.to_hint;
        str2.getClass();
        SelectDependentsBlocker.AddContactsCard addContactsCard = selectDependentsBlocker.contacts_card;
        SelectDependentsBlocker.AddContactsDialog addContactsDialog = selectDependentsBlocker.contacts_dialog;
        Boolean bool = selectDependentsBlocker.allow_only_cash_users;
        return new SelectDependentScreen(blockersData, str, str2, addContactsCard, addContactsDialog, bool != null ? bool.booleanValue() : true);
    }

    public static SponsorSelectionDetailsScreen asScreen(BlockersData blockersData, SponsorSelectionDetailsBlocker sponsorSelectionDetailsBlocker) {
        return new SponsorSelectionDetailsScreen(blockersData, sponsorSelectionDetailsBlocker);
    }

    public static ScheduledReloadConfirmationScreen asScreen(ScheduledTransactionBlocker scheduledTransactionBlocker, BlockersData blockersData) {
        Money money = scheduledTransactionBlocker.maximum_amount;
        money.getClass();
        Money money2 = scheduledTransactionBlocker.minimum_amount;
        money2.getClass();
        return new ScheduledReloadConfirmationScreen(BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, new RecurringTransferData(null, money, money2, EmptyList.INSTANCE), null, null, null, null, null, null, null, null, false, null, null, null, -1, 65527));
    }

    public static BlockersScreens.ActivityPickerScreen asScreen(ActivityPickerBlocker activityPickerBlocker, BlockersData blockersData) {
        return new BlockersScreens.ActivityPickerScreen(blockersData, activityPickerBlocker.title, activityPickerBlocker.include_token_regex);
    }

    public static BlockersScreens.TaxWebViewScreen asScreen(TaxWebViewBlocker taxWebViewBlocker, BlockersData blockersData) {
        return new BlockersScreens.TaxWebViewScreen(blockersData, taxWebViewBlocker.url);
    }

    public static SetPasswordScreen asScreen(PasswordCreationBlocker passwordCreationBlocker, BlockersData blockersData) {
        return new SetPasswordScreen(blockersData, new PasswordScreenData(passwordCreationBlocker.header_text, passwordCreationBlocker.detail_text, passwordCreationBlocker.password_placeholder, passwordCreationBlocker.help_action));
    }

    public static VerifyPasswordScreen asScreen(PasswordVerificationBlocker passwordVerificationBlocker, BlockersData blockersData) {
        return new VerifyPasswordScreen(blockersData, new PasswordScreenData(passwordVerificationBlocker.header_text, passwordVerificationBlocker.detail_text, passwordVerificationBlocker.password_placeholder, passwordVerificationBlocker.help_action, passwordVerificationBlocker.should_suppress_password_token_storage));
    }

    public static BlockersScreens.PersonaDidvScreen asScreen(PersonaDidvBlocker personaDidvBlocker, BlockersData blockersData) {
        String str = personaDidvBlocker.inquiry_id;
        String str2 = personaDidvBlocker.session_token;
        Boolean bool = personaDidvBlocker.resolve_on_cancel;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        PersonaDidvBlocker.FlowType flowType = personaDidvBlocker.idv_flow_type;
        String str3 = personaDidvBlocker.flow_token;
        Boolean bool2 = personaDidvBlocker.is_fallback_mode;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        String str4 = personaDidvBlocker.fallback_template_id;
        Boolean bool3 = personaDidvBlocker.biometric_consent_collected;
        return new BlockersScreens.PersonaDidvScreen(blockersData, str2, str, booleanValue, flowType, str3, booleanValue2, str4, bool3 != null ? bool3.booleanValue() : false);
    }

    public static BlockersScreens.WebViewBlockerScreen asScreen(WebviewBlocker webviewBlocker, BlockersData blockersData) {
        String str = webviewBlocker.url;
        str.getClass();
        String str2 = webviewBlocker.callback_url;
        List<WebviewBlocker.CookieField> list = webviewBlocker.cookie_fields;
        Map<String, String> map = webviewBlocker.metadata;
        Boolean bool = webviewBlocker.allow_popups;
        return new BlockersScreens.WebViewBlockerScreen(blockersData, str, str2, list, map, bool != null ? bool.booleanValue() : false, webviewBlocker.navigation_header, webviewBlocker.navigation_footer);
    }

    public static BlockersScreens.TreehouseBlockerScreen asScreen(TreehouseBlocker treehouseBlocker, BlockersData blockersData) {
        String str = treehouseBlocker.path;
        str.getClass();
        ByteString byteString = treehouseBlocker.parameters;
        Integer num = treehouseBlocker.stack_size;
        return new BlockersScreens.TreehouseBlockerScreen(blockersData, str, byteString, num != null ? num.intValue() : 0, treehouseBlocker.proposed_treehouse_flow_token, treehouseBlocker.plasma_flow_token, 16);
    }

    public final CreateOrEditRecurringPaymentScreen asScreen(RecurringPaymentBlocker recurringPaymentBlocker, BlockersData blockersData, Screen screen) {
        return (CreateOrEditRecurringPaymentScreen) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new RealBlockersDescriptorNavigator$asScreen$11(this, blockersData, recurringPaymentBlocker, screen, null));
    }

    public static BlockersScreens.CreditMultiStepLoadingBlockerScreen asScreen(BlockersData blockersData, CreditMultiStepLoadingBlocker creditMultiStepLoadingBlocker) {
        return new BlockersScreens.CreditMultiStepLoadingBlockerScreen(blockersData, creditMultiStepLoadingBlocker);
    }

    public static BlockersScreens.CreditFirstTimeBorrowBlockerScreen asScreen(BlockersData blockersData, CreditFirstTimeBorrowBlocker creditFirstTimeBorrowBlocker) {
        return new BlockersScreens.CreditFirstTimeBorrowBlockerScreen(blockersData, creditFirstTimeBorrowBlocker);
    }

    public static BlockersScreens.StockSelectionBlockerScreen asScreen(InvestmentEntitySelectionBlocker investmentEntitySelectionBlocker, BlockersData blockersData) {
        Color color = blockersData.serverAccentColor;
        return new BlockersScreens.StockSelectionBlockerScreen(blockersData, investmentEntitySelectionBlocker, color != null ? MoshiJsonIntegration.toModel(color) : null);
    }

    public static BlockersScreens.OnboardingInternalRouteScreen asScreen(BlockersData blockersData, OnboardingInternalRouteBlocker onboardingInternalRouteBlocker) {
        return new BlockersScreens.OnboardingInternalRouteScreen(blockersData, onboardingInternalRouteBlocker);
    }

    public static BlockersScreens.PaymentPlanDataBlockerScreen asScreen(BlockersData blockersData, PaymentPlanDataBlocker paymentPlanDataBlocker) {
        return new BlockersScreens.PaymentPlanDataBlockerScreen(blockersData, paymentPlanDataBlocker);
    }

    public static BlockersScreens.SelectPaymentPlanBlockerScreen asScreen(BlockersData blockersData, SelectPaymentPlanBlocker selectPaymentPlanBlocker) {
        return new BlockersScreens.SelectPaymentPlanBlockerScreen(blockersData, selectPaymentPlanBlocker);
    }

    public static EditDistributionScreen asScreen(SetPaycheckAllocationAmountBlocker setPaycheckAllocationAmountBlocker, BlockersData blockersData) {
        Color color = blockersData.serverAccentColor;
        ColorModel.Accented model = color != null ? MoshiJsonIntegration.toModel(color) : null;
        setPaycheckAllocationAmountBlocker.getClass();
        EmptyObservability emptyObservability = EmptyObservability.INSTANCE;
        return new EditDistributionScreen(blockersData, EditDistributionConfigurationMappersKt.toEditDistributionConfiguration(setPaycheckAllocationAmountBlocker), null, true, model);
    }

    public static LocalOrderStatusScreen asScreen(CashAppLocalOrderBlocker cashAppLocalOrderBlocker) {
        LocalOrder localOrder = cashAppLocalOrderBlocker.order;
        localOrder.getClass();
        return new LocalOrderStatusScreen((LocalOrderStatusScreen.Type) new LocalOrderStatusScreen.Type.Preloaded(localOrder), false, 4);
    }

    public static SetPaycheckMultipleAllocationScreen asScreen(SetPaycheckMultiAllocationBlocker setPaycheckMultiAllocationBlocker, BlockersData blockersData) {
        Color color = blockersData.serverAccentColor;
        return new SetPaycheckMultipleAllocationScreen(blockersData, setPaycheckMultiAllocationBlocker, color != null ? MoshiJsonIntegration.toModel(color) : null);
    }

    public static BlockersScreens.GpsLocationConsentBlockerScreen asScreen(BlockersData blockersData, BlockerAction blockerAction, GpsLocationConsentBlocker gpsLocationConsentBlocker) {
        return new BlockersScreens.GpsLocationConsentBlockerScreen(blockersData, blockerAction, gpsLocationConsentBlocker);
    }

    public static BlockersScreens.SavingsTransferOptionSelectionScreen asScreen(TransferOptionSelectionBlocker transferOptionSelectionBlocker, BlockersData blockersData, BlockerDescriptor.PresentationMode presentationMode, BlockerDescriptor.HideableBlockerAction hideableBlockerAction) {
        if ((presentationMode == null ? -1 : WhenMappings.$EnumSwitchMapping$3[presentationMode.ordinal()]) == 1) {
            return new BlockersScreens.SavingsTransferOptionSelectionFullScreen(blockersData, transferOptionSelectionBlocker, hideableBlockerAction != null ? hideableBlockerAction.action : null);
        }
        return new BlockersScreens.SavingsTransferOptionSelectionSheet(blockersData, transferOptionSelectionBlocker, hideableBlockerAction != null ? hideableBlockerAction.action : null);
    }

    public static BlockersScreens.AtmPickerAmountBlockerScreen asScreen(AtmPickerAmountBlocker atmPickerAmountBlocker, BlockersData blockersData, BlockerDescriptor.HideableBlockerAction hideableBlockerAction, BlockerDescriptor.PresentationMode presentationMode, BlockerAction blockerAction) {
        if ((presentationMode == null ? -1 : WhenMappings.$EnumSwitchMapping$3[presentationMode.ordinal()]) == 1) {
            return new BlockersScreens.AtmPickerAmountBlockerScreen.Fullscreen(blockersData, atmPickerAmountBlocker, hideableBlockerAction != null ? hideableBlockerAction.action : null, blockerAction);
        }
        return new BlockersScreens.AtmPickerAmountBlockerScreen.BottomSheet(blockersData, atmPickerAmountBlocker, hideableBlockerAction != null ? hideableBlockerAction.action : null, blockerAction);
    }

    public static BlockersScreens.CalendarBlockerScreen asScreen(CalendarBlocker calendarBlocker, BlockersData blockersData, BlockerDescriptor.HideableBlockerAction hideableBlockerAction, BlockerAction blockerAction) {
        return new BlockersScreens.CalendarBlockerScreen(blockersData, calendarBlocker, hideableBlockerAction != null ? hideableBlockerAction.action : null, blockerAction);
    }

    public static WirelessProviderListBlockerScreen asScreen(WirelessProviderListBlocker wirelessProviderListBlocker, BlockersData blockersData, BlockerDescriptor.HideableBlockerAction hideableBlockerAction, BlockerAction blockerAction) {
        return new WirelessProviderListBlockerScreen(blockersData, wirelessProviderListBlocker, hideableBlockerAction != null ? hideableBlockerAction.action : null, blockerAction, wirelessProviderListBlocker.get_help);
    }

    public static BlockersScreens.AuthorizeGooglePayScreen asScreen(AuthorizeDigitalWalletPaymentBlocker authorizeDigitalWalletPaymentBlocker, BlockersData blockersData) {
        Money money = authorizeDigitalWalletPaymentBlocker.authorization_amount;
        money.getClass();
        String str = authorizeDigitalWalletPaymentBlocker.title;
        str.getClass();
        return new BlockersScreens.AuthorizeGooglePayScreen(blockersData, money, str, authorizeDigitalWalletPaymentBlocker.subtitle);
    }

    public static BlockersScreens.RequestPushNotificationsBlockerScreen asScreen(RequestPushNotificationsBlocker requestPushNotificationsBlocker, BlockersData blockersData) {
        return new BlockersScreens.RequestPushNotificationsBlockerScreen(blockersData, requestPushNotificationsBlocker.request_push_notifications_screen);
    }

    public static BlockersScreens.AddMoneyBlockerScreen asScreen(BlockersData blockersData, AddMoneyBlocker addMoneyBlocker) {
        return new BlockersScreens.AddMoneyBlockerScreen(blockersData, addMoneyBlocker);
    }

    public static BlockersScreens.U13CelebrationBlockerScreen asScreen(U13CelebrationBlocker u13CelebrationBlocker, BlockersData blockersData) {
        String str = u13CelebrationBlocker.title;
        if (str != null) {
            BlockerAction blockerAction = u13CelebrationBlocker.cta_button;
            if (blockerAction != null) {
                String str2 = blockerAction.text;
                if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                    return new BlockersScreens.U13CelebrationBlockerScreen(blockersData, u13CelebrationBlocker.avatar, str, blockerAction);
                }
                a$$ExternalSyntheticBUOutline0.m$1("Missing cta_button text");
                return null;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Missing cta_button");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing title");
        return null;
    }

    public static PaymentDeviceCustomizationScreen asScreen(BlockersData blockersData, PaymentDeviceCustomizationBlocker paymentDeviceCustomizationBlocker) {
        return new PaymentDeviceCustomizationScreen(blockersData, paymentDeviceCustomizationBlocker);
    }

    public static TagOrderConfirmationScreen asScreen(BlockersData blockersData, TagConfirmationBlocker tagConfirmationBlocker) {
        return new TagOrderConfirmationScreen(blockersData, tagConfirmationBlocker);
    }

    public static BlockersScreens.ManagedAccountLoginQrCodeProviderBlockerScreen asScreen(ManagedAccountLoginQrCodeProviderBlocker managedAccountLoginQrCodeProviderBlocker, BlockersData blockersData) {
        return new BlockersScreens.ManagedAccountLoginQrCodeProviderBlockerScreen(blockersData, managedAccountLoginQrCodeProviderBlocker.avatar, managedAccountLoginQrCodeProviderBlocker.title_text, managedAccountLoginQrCodeProviderBlocker.body_text, managedAccountLoginQrCodeProviderBlocker.deep_link_qr_code_image_url, managedAccountLoginQrCodeProviderBlocker.button_text, managedAccountLoginQrCodeProviderBlocker.button_action);
    }

    public static MoneyTabBookletScreen asScreen(BlockersData blockersData, MoneyTabBookletBlocker moneyTabBookletBlocker) {
        return new MoneyTabBookletScreen(blockersData, moneyTabBookletBlocker);
    }

    public static PhonePlansEsimCheckBlockerScreen asScreen(PhonePlanESimCheckBlocker phonePlanESimCheckBlocker, BlockersData blockersData, BlockerDescriptor.HideableBlockerAction hideableBlockerAction, BlockerAction blockerAction) {
        return new PhonePlansEsimCheckBlockerScreen(blockersData, phonePlanESimCheckBlocker, hideableBlockerAction != null ? hideableBlockerAction.action : null, blockerAction);
    }

    public static PhonePlansNewLineLoadingBlockerScreen asScreen(PhonePlanNewLineLoadingBlocker phonePlanNewLineLoadingBlocker, BlockersData blockersData, BlockerDescriptor.HideableBlockerAction hideableBlockerAction, BlockerAction blockerAction) {
        return new PhonePlansNewLineLoadingBlockerScreen(blockersData, phonePlanNewLineLoadingBlocker, hideableBlockerAction != null ? hideableBlockerAction.action : null, blockerAction);
    }

    public static BlockersScreens.PrepurchaseCashCardFAQBlockerScreen asScreen(BlockersData blockersData, PrepurchaseCashCardFAQBlocker prepurchaseCashCardFAQBlocker) {
        return new BlockersScreens.PrepurchaseCashCardFAQBlockerScreen(blockersData, prepurchaseCashCardFAQBlocker);
    }
}
