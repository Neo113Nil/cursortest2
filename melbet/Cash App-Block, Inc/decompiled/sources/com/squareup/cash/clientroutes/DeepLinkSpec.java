package com.squareup.cash.clientroutes;

import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DeepLinkSpec {
    public static final List allSpecs;
    public static final DeepLinkSpec completeScenario_launchScenario;
    public static final DeepLinkSpec deactivateTag_deactivateTag;
    public static final DeepLinkSpec deprecatedCashAppPaySandbox_sandbox;
    public static final DeepLinkSpec deprecatedViewAddress_launchAddress;
    public static final DeepLinkSpec deprecatedViewAutoSelectBoost_widgetBoostInAutoSelect;
    public static final DeepLinkSpec deprecatedViewBoostDetailsByMerchant_launchBoostDetailsByMerchant;
    public static final DeepLinkSpec deprecatedViewEarningsTracker_launchEarningsTracker;
    public static final DeepLinkSpec deprecatedViewGiftCardStore_launchGiftCardStore;
    public static final DeepLinkSpec deprecatedViewLocalBrandCollection_viewLocalBrandCollection;
    public static final DeepLinkSpec deprecatedViewLoyaltyProgram_loyaltyProgram;
    public static final DeepLinkSpec deprecatedViewLoyalty_loyalty;
    public static final DeepLinkSpec deprecatedViewSavingsAddCash_widgetSavingsTransferCash;
    public static final DeepLinkSpec deprecatedViewSettings_viewSettings;
    public static final DeepLinkSpec deprecatedViewShopHub_launchShopHub;
    public static final DeepLinkSpec deprecatedViewShopInfo_launchShopInfo;
    public static final DeepLinkSpec flowHalfSheet_flowHalfSheet;
    public static final DeepLinkSpec flow_flow;
    public static final DeepLinkSpec initiateBitcoinPartnerAction_launchInitiateBitcoinPartnerAction;
    public static final DeepLinkSpec initiateBitcoinTransferDeprecated_launchInitiateBitcoinWithdrawal;
    public static final DeepLinkSpec initiateBitkeyAutoWithdraw_launchInitiateBitkeyAutoWithdraw;
    public static final DeepLinkSpec internalBenchmarking_internalBenchmarking;
    public static final DeepLinkSpec joinGameTrivia_launchJoinGame;
    public static final DeepLinkSpec noOperationWithPromptIfNeededAccount_launch;
    public static final DeepLinkSpec noOperationWithQueryParameter_launch;
    public static final DeepLinkSpec noOperationWithRequiredAccount_launch;
    public static final DeepLinkSpec noOperation_launch;
    public static final DeepLinkSpec noOperation_widget;
    public static final DeepLinkSpec payLightningInvoice_launchPayLightningInvoice;
    public static final DeepLinkSpec treehouseAppLink_launchTreehouseAppLink;
    public static final DeepLinkSpec verifyEmail_verifyEmailLink;
    public static final DeepLinkSpec verifyMagicLink_verifyMagicLink;
    public static final DeepLinkSpec verifyPlaidOauth_verifyPlaidOauth;
    public static final DeepLinkSpec verifyStripeRedirect_verifyStripeRedirect;
    public static final DeepLinkSpec viewAccountStatus_viewAccountStatusSummary;
    public static final DeepLinkSpec viewActivateCashCard_launchActivateCashCard;
    public static final DeepLinkSpec viewActivityReceiptOnRequestV2_launchActivityReceiptOnRequestV2;
    public static final DeepLinkSpec viewActivityReceiptOnRequest_launchActivityReceiptOnRequest;
    public static final DeepLinkSpec viewActivitySearch_launchActivitySearch;
    public static final DeepLinkSpec viewActivity_launchActivity;
    public static final DeepLinkSpec viewAddCash_launchAddCash;
    public static final DeepLinkSpec viewAddToDigitalWallet_addToDigitalWalletFlow;
    public static final DeepLinkSpec viewAfterpayAppletHome_launchAfterpayAppletHome;
    public static final DeepLinkSpec viewAfterpayAppletOrder_launchAfterpayAppletOrder;
    public static final DeepLinkSpec viewAfterpayAppletPurchases_launchAfterpayAppletPurchases;
    public static final DeepLinkSpec viewAfterpayAppletRetroOrderSelection_launchAfterpayAppletRetroOrderSelection;
    public static final DeepLinkSpec viewAfterpayAppletSearch_launchAfterpayAppletSearch;
    public static final DeepLinkSpec viewAfterpayHub_launchAfterpayHub;
    public static final DeepLinkSpec viewAfterpayInAppBrowserV2_launchAfterpayInAppBrowserV2;
    public static final DeepLinkSpec viewAfterpayMerchantSheet_launchAfterpayMerchantSheet;
    public static final DeepLinkSpec viewAfterpayOrderDetails_launchAfterpayOrderDetails;
    public static final DeepLinkSpec viewAfterpayOrderDocument_launchAfterpayOrderDocument;
    public static final DeepLinkSpec viewAllowList_launchAllowList;
    public static final DeepLinkSpec viewAtmWithdrawalMap_launchAtmWithdrawalMap;
    public static final DeepLinkSpec viewAutoAddCash_launchAutoAddCash;
    public static final DeepLinkSpec viewBalanceAddCash_widgetAddCash;
    public static final DeepLinkSpec viewBalanceHome_launchBalanceHome;
    public static final DeepLinkSpec viewBalance_imessageShowBalance;
    public static final DeepLinkSpec viewBalance_launchBalance;
    public static final DeepLinkSpec viewBalance_todayviewShowBalance;
    public static final DeepLinkSpec viewBalance_widgetCashBalance;
    public static final DeepLinkSpec viewBankTransferSetup_launchBankTransfersSetup;
    public static final DeepLinkSpec viewBenefitsBooklet_launchBenefitsBooklet;
    public static final DeepLinkSpec viewBenefitsHome_launchBenefitsHome;
    public static final DeepLinkSpec viewBenefitsHub_launchBenefitsHub;
    public static final DeepLinkSpec viewBenefitsLeaflet_launchBenefitsLeaflet;
    public static final DeepLinkSpec viewBitcoinAutoInvest_launchBitcoinAutoInvest;
    public static final DeepLinkSpec viewBitcoinBuy_launchBitcoinBuy;
    public static final DeepLinkSpec viewBitcoinBuy_widgetBitcoinBuy;
    public static final DeepLinkSpec viewBitcoinInvoice_launchBitcoinInvoice;
    public static final DeepLinkSpec viewBitcoinMap_launchBitcoinMap;
    public static final DeepLinkSpec viewBitcoinSell_launchBitcoinSell;
    public static final DeepLinkSpec viewBitcoinSell_widgetBitcoinSell;
    public static final DeepLinkSpec viewBitcoin_launchBitcoin;
    public static final DeepLinkSpec viewBitcoin_widgetBitcoin;
    public static final DeepLinkSpec viewBooklet_launchBooklet;
    public static final DeepLinkSpec viewBoostDetails_launchBoostDetails;
    public static final DeepLinkSpec viewBoostPicker_launchBoostPicker;
    public static final DeepLinkSpec viewBoostPicker_widgetBoostPicker;
    public static final DeepLinkSpec viewBorrowDeprecated_launchBorrow;
    public static final DeepLinkSpec viewCardBlockedBusinesses_viewCardBlockedBusinesses;
    public static final DeepLinkSpec viewCardNfc_tap;
    public static final DeepLinkSpec viewCardSpendingInsightsHome_viewSpendingInsightsHome;
    public static final DeepLinkSpec viewCard_launchCardDrawer;
    public static final DeepLinkSpec viewCard_widgetCard;
    public static final DeepLinkSpec viewCashAppScore_launchCashAppScore;
    public static final DeepLinkSpec viewCashCardStylePicker_launchCashCardStylePicker;
    public static final DeepLinkSpec viewCashOut_widgetCashOut;
    public static final DeepLinkSpec viewClaimPayment_imessageNoAccount;
    public static final DeepLinkSpec viewConfirmDeposit_depositLong;
    public static final DeepLinkSpec viewConfirmDeposit_depositShort;
    public static final DeepLinkSpec viewContinueApplePay_continueApplePay;
    public static final DeepLinkSpec viewCustomerInvestingProfileForCashtag_customerInvestingProfileForCashtag;
    public static final DeepLinkSpec viewCustomerProfileCashtag_payCashtag;
    public static final DeepLinkSpec viewCustomerProfileUsingCashtag_viewCustomerProfileByCashtag;
    public static final DeepLinkSpec viewDependentControls_launchDependentControls;
    public static final DeepLinkSpec viewDependent_launchDependent;
    public static final DeepLinkSpec viewDetailsPage_launchDetailspage;
    public static final DeepLinkSpec viewDirectDepositForm_directDepositForm;
    public static final DeepLinkSpec viewDirectDepositNuxDeprecated_directDepositNux;
    public static final DeepLinkSpec viewDirectDepositSetup_directDepositSetup;
    public static final DeepLinkSpec viewDocumentAfterpayMonthlyStatement_documentAfterpayMonthlyStatement;
    public static final DeepLinkSpec viewDocumentAfterpayStatements_documentAfterpayStatements;
    public static final DeepLinkSpec viewDocumentAllBtcTaxForms_documentAllBtcTaxForms;
    public static final DeepLinkSpec viewDocumentAllSavingsTaxForms_documentAllSavingsTaxForms;
    public static final DeepLinkSpec viewDocumentBankingMonthlyStatement_documentBankingMonthlyStatement;
    public static final DeepLinkSpec viewDocumentBankingStatements_documentBankingStatements;
    public static final DeepLinkSpec viewDocumentBtcTaxForm_documentBtcTaxForm;
    public static final DeepLinkSpec viewDocumentBtcTaxForm_launchDocumentBtcTaxForm;
    public static final DeepLinkSpec viewDocumentCategory_documentCategory;
    public static final DeepLinkSpec viewDocumentSavingsTaxForm_documentSavingsTaxForm;
    public static final DeepLinkSpec viewDocumentStockMonthlyStatementList_documentStockMonthlyStatementList;
    public static final DeepLinkSpec viewDocumentStockMonthlyStatement_documentStockMonthlyStatement;
    public static final DeepLinkSpec viewDocumentStockTaxFormList_documentStockTaxFormList;
    public static final DeepLinkSpec viewDocumentStockTaxForm_documentStockTaxForm;
    public static final DeepLinkSpec viewEarningsTrackerWithParams_launchEarningsTrackerWithParams;
    public static final DeepLinkSpec viewEditProfile_editProfile;
    public static final DeepLinkSpec viewEquity_viewEquity;
    public static final DeepLinkSpec viewFamilySafetyEducationHubPage_launchSafetyEducationHubPage;
    public static final DeepLinkSpec viewFamilySafetyEducationHub_launchSafetyEducationHub;
    public static final DeepLinkSpec viewGenieScene_genieScene;
    public static final DeepLinkSpec viewInitiateBitcoinDepositReversal_launchViewInitiateDepositReversal;
    public static final DeepLinkSpec viewInternationalPaymentStart_launchInternationalPayment;
    public static final DeepLinkSpec viewInvestingRoundupsOnboarding_launchInvestingRoundupsOnboarding;
    public static final DeepLinkSpec viewInvesting_launchInvesting;
    public static final DeepLinkSpec viewInviteFriends_launchReferrals;
    public static final DeepLinkSpec viewLimits_launchLimits;
    public static final DeepLinkSpec viewLinkBankAccount_imessageInsufficientFunds;
    public static final DeepLinkSpec viewLinkedBankAccounts_linkedBankAccounts;
    public static final DeepLinkSpec viewListing_viewListing;
    public static final DeepLinkSpec viewLocalBrandCheckoutWithCashtag_viewLocalBrandCheckoutWithCashtag;
    public static final DeepLinkSpec viewLocalBrandProfileQrOrdering_viewLocalBrandProfileQrOrdering;
    public static final DeepLinkSpec viewLocalBrandProfileShortlink_viewLocalBrandProfileShortlink;
    public static final DeepLinkSpec viewLocalBrandProfileWithCashtagAndLocationSlug_viewLocalBrandProfileWithCashtagAndLocationSlug;
    public static final DeepLinkSpec viewLocalBrandProfileWithDefaultLocation_viewLocalBrandProfileWithDefaultLocation;
    public static final DeepLinkSpec viewLocalBrandProfile_viewLocalBrandProfile;
    public static final DeepLinkSpec viewLocalEditorial_viewLocalEditorial;
    public static final DeepLinkSpec viewLocalHome_viewLocalHome;
    public static final DeepLinkSpec viewLocalMarketingMessage_viewLocalMarketingMessage;
    public static final DeepLinkSpec viewLocalMenuShortlink_viewLocalMenuShortlink;
    public static final DeepLinkSpec viewLocalOrderShortlink_viewLocalOrderShortlink;
    public static final DeepLinkSpec viewLocalOrderStatusFromLocalHome_viewLocalOrderStatusFromLocalHome;
    public static final DeepLinkSpec viewLocalShortlink_viewLocalInStoreOrderShortlink;
    public static final DeepLinkSpec viewLocalShortlink_viewLocalShortlink;
    public static final DeepLinkSpec viewMerchantProfileOpenBottomSheet_launchBrandProfile;
    public static final DeepLinkSpec viewMerchantProfile_launchBrandProfile;
    public static final DeepLinkSpec viewMoneyBooklet_launchMoneyBooklet;
    public static final DeepLinkSpec viewMoneybotResumeChat_launchMoneybotResumeChat;
    public static final DeepLinkSpec viewNotificationPreferences_launchNotificationPreferences;
    public static final DeepLinkSpec viewOfferDetailsSheetByMerchant_launchOfferDetailsSheetByMerchant;
    public static final DeepLinkSpec viewOfferDetailsSheetWithSingleUsePaymentTokenDeprecated_launchOfferDetailsSheetWithSingleUsePaymentToken;
    public static final DeepLinkSpec viewOfferDetailsSheet_launchOfferDetailsSheet;
    public static final DeepLinkSpec viewOffersBrowse_viewOffersBrowse;
    public static final DeepLinkSpec viewOffersCollection_viewOffersCollection;
    public static final DeepLinkSpec viewOverdraftCoverage_launchOverdraftCoverage;
    public static final DeepLinkSpec viewPaperMoney_viewPaperMoney;
    public static final DeepLinkSpec viewPayCashtagAmountNote_payCashtagNote;
    public static final DeepLinkSpec viewPayCashtagAmount_payCashtag;
    public static final DeepLinkSpec viewPayLink_payLink;
    public static final DeepLinkSpec viewPayWithOptions_payWithOptions;
    public static final DeepLinkSpec viewPaychecksDistributionSummary_viewPaychecksDistributionSummary;
    public static final DeepLinkSpec viewPaychecksHome_viewPaychecksHome;
    public static final DeepLinkSpec viewPaymentDetails_payment;
    public static final DeepLinkSpec viewPaymentPad_imessageShowPaymentPad;
    public static final DeepLinkSpec viewPaymentPad_showPaymentPad;
    public static final DeepLinkSpec viewPaymentPersonalizationSend_viewPaymentPersonalizationSend;
    public static final DeepLinkSpec viewPaymentPersonalization_viewPaymentPersonalization;
    public static final DeepLinkSpec viewPhonePlansHome_launchPhonePlansHome;
    public static final DeepLinkSpec viewPoolDetails_launchPoolDetails;
    public static final DeepLinkSpec viewPoolsList_launchPoolDetails;
    public static final DeepLinkSpec viewPrivacy_launchPrivacy;
    public static final DeepLinkSpec viewProfileDirectory_launchProfileDirectory;
    public static final DeepLinkSpec viewProfilePersonal_viewProfilePersonal;
    public static final DeepLinkSpec viewProfileSwitcher_viewProfileSwitcher;
    public static final DeepLinkSpec viewProfileWithAccountSwitchOnboarding_viewProfileWithAccountSwitchOnboarding;
    public static final DeepLinkSpec viewProfile_viewProfile;
    public static final DeepLinkSpec viewPromotionDetails_launchPromotionDetails;
    public static final DeepLinkSpec viewPromotionsHome_launchPromotionsHome;
    public static final DeepLinkSpec viewQrCodeScanner_launchQrCodeScanner;
    public static final DeepLinkSpec viewQrCode_launchQrCode;
    public static final DeepLinkSpec viewQrCode_widgetCashQrCode;
    public static final DeepLinkSpec viewRecurringDeposits_launchBalanceRecurringDeposits;
    public static final DeepLinkSpec viewRequestCashtagAmountNote_requestCashtagNote;
    public static final DeepLinkSpec viewRequestCashtagAmount_requestCashtag;
    public static final DeepLinkSpec viewRequestPhysicalCashCard_bankingCashCard;
    public static final DeepLinkSpec viewRequestWithOptions_requestWithOptions;
    public static final DeepLinkSpec viewSavingsHome_widgetSavings;
    public static final DeepLinkSpec viewSavingsNuxOrHome_viewSavingsNuxOrHome;
    public static final DeepLinkSpec viewSecurityAndPrivacy_launchSecurityAndPrivacy;
    public static final DeepLinkSpec viewSecurityHub_launchSecurityHub;
    public static final DeepLinkSpec viewSecurity_launchSecurity;
    public static final DeepLinkSpec viewSendBitcoin_widgetBitcoinSend;
    public static final DeepLinkSpec viewShiftsClockIn_launchShiftsClockin;
    public static final DeepLinkSpec viewShiftsHome_launchShiftsHome;
    public static final DeepLinkSpec viewShiftsSchedule_launchShiftsSchedule;
    public static final DeepLinkSpec viewShiftsTimecards_launchShiftsTimecards;
    public static final DeepLinkSpec viewShopDynamicScreenSearch_launchDynamicShopHubSearch;
    public static final DeepLinkSpec viewShopDynamicScreen_launchDynamicShopHub;
    public static final DeepLinkSpec viewShoppingSettings_launchShoppingSettings;
    public static final DeepLinkSpec viewStablecoinReceive_launchStablecoinReceive;
    public static final DeepLinkSpec viewStablecoin_launchStablecoin;
    public static final DeepLinkSpec viewSupportChatFromMoneybot_launchSupportChatFromMoneybot;
    public static final DeepLinkSpec viewSupportChatNewUnreadMessage_launchSupportChat;
    public static final DeepLinkSpec viewSupportNode_launchSupportNode;
    public static final DeepLinkSpec viewSupport_launchSupport;
    public static final DeepLinkSpec viewSystemNotificationsSettings_launchSystemNotificationSettings;
    public static final DeepLinkSpec viewTaxesHubWithDeepLink_launchTaxesWebApp;
    public static final DeepLinkSpec viewTaxesHub_launchViewTaxesHub;
    public static final DeepLinkSpec viewTaxesWebAppRoot_launchTaxesWebAppRoot;
    public static final DeepLinkSpec viewTaxesWebApp_launchTaxesWebApp;
    public static final DeepLinkSpec viewThemeSwitcher_launchThemeSwitcher;
    public static final DeepLinkSpec viewWireTransferSetup_launchWireTransferSetup;
    public final ClientRouteSpec clientRouteSpec;
    public final String name;
    public final String pathFormat;

    public abstract class Companion {
        public static ViewEvent.Account fromJsonObject(JsonObject jsonObject) {
            try {
                String asString = jsonObject.get("id").getAsString();
                JsonElement jsonElement = jsonObject.get("name");
                String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    if (!ArraysKt___ArraysKt.contains(ViewEvent.Account.RESERVED_PROPERTIES, entry.getKey())) {
                        String key = entry.getKey();
                        key.getClass();
                        linkedHashMap.put(key, entry.getValue());
                    }
                }
                asString.getClass();
                return new ViewEvent.Account(asString, asString2, linkedHashMap);
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Account", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Account", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Account", e3);
                return null;
            }
        }

        public static DeepLinkSpec getCompleteScenario_launchScenario() {
            return DeepLinkSpec.completeScenario_launchScenario;
        }

        public static DeepLinkSpec getDeactivateTag_deactivateTag() {
            return DeepLinkSpec.deactivateTag_deactivateTag;
        }

        public static DeepLinkSpec getDeprecatedCashAppPaySandbox_sandbox() {
            return DeepLinkSpec.deprecatedCashAppPaySandbox_sandbox;
        }

        public static DeepLinkSpec getDeprecatedViewAddress_launchAddress() {
            return DeepLinkSpec.deprecatedViewAddress_launchAddress;
        }

        public static DeepLinkSpec getDeprecatedViewBoostDetailsByMerchant_launchBoostDetailsByMerchant() {
            return DeepLinkSpec.deprecatedViewBoostDetailsByMerchant_launchBoostDetailsByMerchant;
        }

        public static DeepLinkSpec getDeprecatedViewEarningsTracker_launchEarningsTracker() {
            return DeepLinkSpec.deprecatedViewEarningsTracker_launchEarningsTracker;
        }

        public static DeepLinkSpec getDeprecatedViewGiftCardStore_launchGiftCardStore() {
            return DeepLinkSpec.deprecatedViewGiftCardStore_launchGiftCardStore;
        }

        public static DeepLinkSpec getDeprecatedViewLocalBrandCollection_viewLocalBrandCollection() {
            return DeepLinkSpec.deprecatedViewLocalBrandCollection_viewLocalBrandCollection;
        }

        public static DeepLinkSpec getDeprecatedViewLoyaltyProgram_loyaltyProgram() {
            return DeepLinkSpec.deprecatedViewLoyaltyProgram_loyaltyProgram;
        }

        public static DeepLinkSpec getDeprecatedViewLoyalty_loyalty() {
            return DeepLinkSpec.deprecatedViewLoyalty_loyalty;
        }

        public static DeepLinkSpec getDeprecatedViewSettings_viewSettings() {
            return DeepLinkSpec.deprecatedViewSettings_viewSettings;
        }

        public static DeepLinkSpec getDeprecatedViewShopHub_launchShopHub() {
            return DeepLinkSpec.deprecatedViewShopHub_launchShopHub;
        }

        public static DeepLinkSpec getDeprecatedViewShopInfo_launchShopInfo() {
            return DeepLinkSpec.deprecatedViewShopInfo_launchShopInfo;
        }

        public static DeepLinkSpec getFlowHalfSheet_flowHalfSheet() {
            return DeepLinkSpec.flowHalfSheet_flowHalfSheet;
        }

        public static DeepLinkSpec getFlow_flow() {
            return DeepLinkSpec.flow_flow;
        }

        public static DeepLinkSpec getInitiateBitcoinPartnerAction_launchInitiateBitcoinPartnerAction() {
            return DeepLinkSpec.initiateBitcoinPartnerAction_launchInitiateBitcoinPartnerAction;
        }

        public static DeepLinkSpec getInitiateBitcoinTransferDeprecated_launchInitiateBitcoinWithdrawal() {
            return DeepLinkSpec.initiateBitcoinTransferDeprecated_launchInitiateBitcoinWithdrawal;
        }

        public static DeepLinkSpec getInitiateBitkeyAutoWithdraw_launchInitiateBitkeyAutoWithdraw() {
            return DeepLinkSpec.initiateBitkeyAutoWithdraw_launchInitiateBitkeyAutoWithdraw;
        }

        public static DeepLinkSpec getInternalBenchmarking_internalBenchmarking() {
            return DeepLinkSpec.internalBenchmarking_internalBenchmarking;
        }

        public static DeepLinkSpec getJoinGameTrivia_launchJoinGame() {
            return DeepLinkSpec.joinGameTrivia_launchJoinGame;
        }

        public static DeepLinkSpec getNoOperationWithPromptIfNeededAccount_launch() {
            return DeepLinkSpec.noOperationWithPromptIfNeededAccount_launch;
        }

        public static DeepLinkSpec getNoOperationWithQueryParameter_launch() {
            return DeepLinkSpec.noOperationWithQueryParameter_launch;
        }

        public static DeepLinkSpec getNoOperationWithRequiredAccount_launch() {
            return DeepLinkSpec.noOperationWithRequiredAccount_launch;
        }

        public static DeepLinkSpec getNoOperation_launch() {
            return DeepLinkSpec.noOperation_launch;
        }

        public static DeepLinkSpec getNoOperation_widget() {
            return DeepLinkSpec.noOperation_widget;
        }

        public static DeepLinkSpec getPayLightningInvoice_launchPayLightningInvoice() {
            return DeepLinkSpec.payLightningInvoice_launchPayLightningInvoice;
        }

        public static DeepLinkSpec getTreehouseAppLink_launchTreehouseAppLink() {
            return DeepLinkSpec.treehouseAppLink_launchTreehouseAppLink;
        }

        public static DeepLinkSpec getVerifyEmail_verifyEmailLink() {
            return DeepLinkSpec.verifyEmail_verifyEmailLink;
        }

        public static DeepLinkSpec getVerifyMagicLink_verifyMagicLink() {
            return DeepLinkSpec.verifyMagicLink_verifyMagicLink;
        }

        public static DeepLinkSpec getVerifyPlaidOauth_verifyPlaidOauth() {
            return DeepLinkSpec.verifyPlaidOauth_verifyPlaidOauth;
        }

        public static DeepLinkSpec getVerifyStripeRedirect_verifyStripeRedirect() {
            return DeepLinkSpec.verifyStripeRedirect_verifyStripeRedirect;
        }

        public static DeepLinkSpec getViewAccountStatus_viewAccountStatusSummary() {
            return DeepLinkSpec.viewAccountStatus_viewAccountStatusSummary;
        }

        public static DeepLinkSpec getViewActivateCashCard_launchActivateCashCard() {
            return DeepLinkSpec.viewActivateCashCard_launchActivateCashCard;
        }

        public static DeepLinkSpec getViewActivityReceiptOnRequestV2_launchActivityReceiptOnRequestV2() {
            return DeepLinkSpec.viewActivityReceiptOnRequestV2_launchActivityReceiptOnRequestV2;
        }

        public static DeepLinkSpec getViewActivityReceiptOnRequest_launchActivityReceiptOnRequest() {
            return DeepLinkSpec.viewActivityReceiptOnRequest_launchActivityReceiptOnRequest;
        }

        public static DeepLinkSpec getViewActivitySearch_launchActivitySearch() {
            return DeepLinkSpec.viewActivitySearch_launchActivitySearch;
        }

        public static DeepLinkSpec getViewActivity_launchActivity() {
            return DeepLinkSpec.viewActivity_launchActivity;
        }

        public static DeepLinkSpec getViewAddCash_launchAddCash() {
            return DeepLinkSpec.viewAddCash_launchAddCash;
        }

        public static DeepLinkSpec getViewAddToDigitalWallet_addToDigitalWalletFlow() {
            return DeepLinkSpec.viewAddToDigitalWallet_addToDigitalWalletFlow;
        }

        public static DeepLinkSpec getViewAfterpayAppletHome_launchAfterpayAppletHome() {
            return DeepLinkSpec.viewAfterpayAppletHome_launchAfterpayAppletHome;
        }

        public static DeepLinkSpec getViewAfterpayAppletOrder_launchAfterpayAppletOrder() {
            return DeepLinkSpec.viewAfterpayAppletOrder_launchAfterpayAppletOrder;
        }

        public static DeepLinkSpec getViewAfterpayAppletPurchases_launchAfterpayAppletPurchases() {
            return DeepLinkSpec.viewAfterpayAppletPurchases_launchAfterpayAppletPurchases;
        }

        public static DeepLinkSpec getViewAfterpayAppletRetroOrderSelection_launchAfterpayAppletRetroOrderSelection() {
            return DeepLinkSpec.viewAfterpayAppletRetroOrderSelection_launchAfterpayAppletRetroOrderSelection;
        }

        public static DeepLinkSpec getViewAfterpayAppletSearch_launchAfterpayAppletSearch() {
            return DeepLinkSpec.viewAfterpayAppletSearch_launchAfterpayAppletSearch;
        }

        public static DeepLinkSpec getViewAfterpayHub_launchAfterpayHub() {
            return DeepLinkSpec.viewAfterpayHub_launchAfterpayHub;
        }

        public static DeepLinkSpec getViewAfterpayInAppBrowserV2_launchAfterpayInAppBrowserV2() {
            return DeepLinkSpec.viewAfterpayInAppBrowserV2_launchAfterpayInAppBrowserV2;
        }

        public static DeepLinkSpec getViewAfterpayMerchantSheet_launchAfterpayMerchantSheet() {
            return DeepLinkSpec.viewAfterpayMerchantSheet_launchAfterpayMerchantSheet;
        }

        public static DeepLinkSpec getViewAfterpayOrderDetails_launchAfterpayOrderDetails() {
            return DeepLinkSpec.viewAfterpayOrderDetails_launchAfterpayOrderDetails;
        }

        public static DeepLinkSpec getViewAfterpayOrderDocument_launchAfterpayOrderDocument() {
            return DeepLinkSpec.viewAfterpayOrderDocument_launchAfterpayOrderDocument;
        }

        public static DeepLinkSpec getViewAllowList_launchAllowList() {
            return DeepLinkSpec.viewAllowList_launchAllowList;
        }

        public static DeepLinkSpec getViewAtmWithdrawalMap_launchAtmWithdrawalMap() {
            return DeepLinkSpec.viewAtmWithdrawalMap_launchAtmWithdrawalMap;
        }

        public static DeepLinkSpec getViewAutoAddCash_launchAutoAddCash() {
            return DeepLinkSpec.viewAutoAddCash_launchAutoAddCash;
        }

        public static DeepLinkSpec getViewBalanceHome_launchBalanceHome() {
            return DeepLinkSpec.viewBalanceHome_launchBalanceHome;
        }

        public static DeepLinkSpec getViewBalance_launchBalance() {
            return DeepLinkSpec.viewBalance_launchBalance;
        }

        public static DeepLinkSpec getViewBankTransferSetup_launchBankTransfersSetup() {
            return DeepLinkSpec.viewBankTransferSetup_launchBankTransfersSetup;
        }

        public static DeepLinkSpec getViewBenefitsBooklet_launchBenefitsBooklet() {
            return DeepLinkSpec.viewBenefitsBooklet_launchBenefitsBooklet;
        }

        public static DeepLinkSpec getViewBenefitsHome_launchBenefitsHome() {
            return DeepLinkSpec.viewBenefitsHome_launchBenefitsHome;
        }

        public static DeepLinkSpec getViewBenefitsHub_launchBenefitsHub() {
            return DeepLinkSpec.viewBenefitsHub_launchBenefitsHub;
        }

        public static DeepLinkSpec getViewBenefitsLeaflet_launchBenefitsLeaflet() {
            return DeepLinkSpec.viewBenefitsLeaflet_launchBenefitsLeaflet;
        }

        public static DeepLinkSpec getViewBitcoinAutoInvest_launchBitcoinAutoInvest() {
            return DeepLinkSpec.viewBitcoinAutoInvest_launchBitcoinAutoInvest;
        }

        public static DeepLinkSpec getViewBitcoinBuy_launchBitcoinBuy() {
            return DeepLinkSpec.viewBitcoinBuy_launchBitcoinBuy;
        }

        public static DeepLinkSpec getViewBitcoinInvoice_launchBitcoinInvoice() {
            return DeepLinkSpec.viewBitcoinInvoice_launchBitcoinInvoice;
        }

        public static DeepLinkSpec getViewBitcoinMap_launchBitcoinMap() {
            return DeepLinkSpec.viewBitcoinMap_launchBitcoinMap;
        }

        public static DeepLinkSpec getViewBitcoinSell_launchBitcoinSell() {
            return DeepLinkSpec.viewBitcoinSell_launchBitcoinSell;
        }

        public static DeepLinkSpec getViewBitcoin_launchBitcoin() {
            return DeepLinkSpec.viewBitcoin_launchBitcoin;
        }

        public static DeepLinkSpec getViewBitcoin_widgetBitcoin() {
            return DeepLinkSpec.viewBitcoin_widgetBitcoin;
        }

        public static DeepLinkSpec getViewBooklet_launchBooklet() {
            return DeepLinkSpec.viewBooklet_launchBooklet;
        }

        public static DeepLinkSpec getViewBoostDetails_launchBoostDetails() {
            return DeepLinkSpec.viewBoostDetails_launchBoostDetails;
        }

        public static DeepLinkSpec getViewBoostPicker_launchBoostPicker() {
            return DeepLinkSpec.viewBoostPicker_launchBoostPicker;
        }

        public static DeepLinkSpec getViewBorrowDeprecated_launchBorrow() {
            return DeepLinkSpec.viewBorrowDeprecated_launchBorrow;
        }

        public static DeepLinkSpec getViewCardBlockedBusinesses_viewCardBlockedBusinesses() {
            return DeepLinkSpec.viewCardBlockedBusinesses_viewCardBlockedBusinesses;
        }

        public static DeepLinkSpec getViewCardNfc_tap() {
            return DeepLinkSpec.viewCardNfc_tap;
        }

        public static DeepLinkSpec getViewCardSpendingInsightsHome_viewSpendingInsightsHome() {
            return DeepLinkSpec.viewCardSpendingInsightsHome_viewSpendingInsightsHome;
        }

        public static DeepLinkSpec getViewCard_launchCardDrawer() {
            return DeepLinkSpec.viewCard_launchCardDrawer;
        }

        public static DeepLinkSpec getViewCashAppScore_launchCashAppScore() {
            return DeepLinkSpec.viewCashAppScore_launchCashAppScore;
        }

        public static DeepLinkSpec getViewCashCardStylePicker_launchCashCardStylePicker() {
            return DeepLinkSpec.viewCashCardStylePicker_launchCashCardStylePicker;
        }

        public static DeepLinkSpec getViewConfirmDeposit_depositLong() {
            return DeepLinkSpec.viewConfirmDeposit_depositLong;
        }

        public static DeepLinkSpec getViewConfirmDeposit_depositShort() {
            return DeepLinkSpec.viewConfirmDeposit_depositShort;
        }

        public static DeepLinkSpec getViewCustomerInvestingProfileForCashtag_customerInvestingProfileForCashtag() {
            return DeepLinkSpec.viewCustomerInvestingProfileForCashtag_customerInvestingProfileForCashtag;
        }

        public static DeepLinkSpec getViewCustomerProfileCashtag_payCashtag() {
            return DeepLinkSpec.viewCustomerProfileCashtag_payCashtag;
        }

        public static DeepLinkSpec getViewCustomerProfileUsingCashtag_viewCustomerProfileByCashtag() {
            return DeepLinkSpec.viewCustomerProfileUsingCashtag_viewCustomerProfileByCashtag;
        }

        public static DeepLinkSpec getViewDependentControls_launchDependentControls() {
            return DeepLinkSpec.viewDependentControls_launchDependentControls;
        }

        public static DeepLinkSpec getViewDependent_launchDependent() {
            return DeepLinkSpec.viewDependent_launchDependent;
        }

        public static DeepLinkSpec getViewDetailsPage_launchDetailspage() {
            return DeepLinkSpec.viewDetailsPage_launchDetailspage;
        }

        public static DeepLinkSpec getViewDirectDepositForm_directDepositForm() {
            return DeepLinkSpec.viewDirectDepositForm_directDepositForm;
        }

        public static DeepLinkSpec getViewDirectDepositNuxDeprecated_directDepositNux() {
            return DeepLinkSpec.viewDirectDepositNuxDeprecated_directDepositNux;
        }

        public static DeepLinkSpec getViewDirectDepositSetup_directDepositSetup() {
            return DeepLinkSpec.viewDirectDepositSetup_directDepositSetup;
        }

        public static DeepLinkSpec getViewDocumentAfterpayMonthlyStatement_documentAfterpayMonthlyStatement() {
            return DeepLinkSpec.viewDocumentAfterpayMonthlyStatement_documentAfterpayMonthlyStatement;
        }

        public static DeepLinkSpec getViewDocumentAfterpayStatements_documentAfterpayStatements() {
            return DeepLinkSpec.viewDocumentAfterpayStatements_documentAfterpayStatements;
        }

        public static DeepLinkSpec getViewDocumentAllBtcTaxForms_documentAllBtcTaxForms() {
            return DeepLinkSpec.viewDocumentAllBtcTaxForms_documentAllBtcTaxForms;
        }

        public static DeepLinkSpec getViewDocumentAllSavingsTaxForms_documentAllSavingsTaxForms() {
            return DeepLinkSpec.viewDocumentAllSavingsTaxForms_documentAllSavingsTaxForms;
        }

        public static DeepLinkSpec getViewDocumentBankingMonthlyStatement_documentBankingMonthlyStatement() {
            return DeepLinkSpec.viewDocumentBankingMonthlyStatement_documentBankingMonthlyStatement;
        }

        public static DeepLinkSpec getViewDocumentBankingStatements_documentBankingStatements() {
            return DeepLinkSpec.viewDocumentBankingStatements_documentBankingStatements;
        }

        public static DeepLinkSpec getViewDocumentBtcTaxForm_documentBtcTaxForm() {
            return DeepLinkSpec.viewDocumentBtcTaxForm_documentBtcTaxForm;
        }

        public static DeepLinkSpec getViewDocumentBtcTaxForm_launchDocumentBtcTaxForm() {
            return DeepLinkSpec.viewDocumentBtcTaxForm_launchDocumentBtcTaxForm;
        }

        public static DeepLinkSpec getViewDocumentCategory_documentCategory() {
            return DeepLinkSpec.viewDocumentCategory_documentCategory;
        }

        public static DeepLinkSpec getViewDocumentSavingsTaxForm_documentSavingsTaxForm() {
            return DeepLinkSpec.viewDocumentSavingsTaxForm_documentSavingsTaxForm;
        }

        public static DeepLinkSpec getViewDocumentStockMonthlyStatementList_documentStockMonthlyStatementList() {
            return DeepLinkSpec.viewDocumentStockMonthlyStatementList_documentStockMonthlyStatementList;
        }

        public static DeepLinkSpec getViewDocumentStockMonthlyStatement_documentStockMonthlyStatement() {
            return DeepLinkSpec.viewDocumentStockMonthlyStatement_documentStockMonthlyStatement;
        }

        public static DeepLinkSpec getViewDocumentStockTaxFormList_documentStockTaxFormList() {
            return DeepLinkSpec.viewDocumentStockTaxFormList_documentStockTaxFormList;
        }

        public static DeepLinkSpec getViewDocumentStockTaxForm_documentStockTaxForm() {
            return DeepLinkSpec.viewDocumentStockTaxForm_documentStockTaxForm;
        }

        public static DeepLinkSpec getViewEarningsTrackerWithParams_launchEarningsTrackerWithParams() {
            return DeepLinkSpec.viewEarningsTrackerWithParams_launchEarningsTrackerWithParams;
        }

        public static DeepLinkSpec getViewEditProfile_editProfile() {
            return DeepLinkSpec.viewEditProfile_editProfile;
        }

        public static DeepLinkSpec getViewEquity_viewEquity() {
            return DeepLinkSpec.viewEquity_viewEquity;
        }

        public static DeepLinkSpec getViewFamilySafetyEducationHubPage_launchSafetyEducationHubPage() {
            return DeepLinkSpec.viewFamilySafetyEducationHubPage_launchSafetyEducationHubPage;
        }

        public static DeepLinkSpec getViewFamilySafetyEducationHub_launchSafetyEducationHub() {
            return DeepLinkSpec.viewFamilySafetyEducationHub_launchSafetyEducationHub;
        }

        public static DeepLinkSpec getViewGenieScene_genieScene() {
            return DeepLinkSpec.viewGenieScene_genieScene;
        }

        public static DeepLinkSpec getViewInitiateBitcoinDepositReversal_launchViewInitiateDepositReversal() {
            return DeepLinkSpec.viewInitiateBitcoinDepositReversal_launchViewInitiateDepositReversal;
        }

        public static DeepLinkSpec getViewInternationalPaymentStart_launchInternationalPayment() {
            return DeepLinkSpec.viewInternationalPaymentStart_launchInternationalPayment;
        }

        public static DeepLinkSpec getViewInvestingRoundupsOnboarding_launchInvestingRoundupsOnboarding() {
            return DeepLinkSpec.viewInvestingRoundupsOnboarding_launchInvestingRoundupsOnboarding;
        }

        public static DeepLinkSpec getViewInvesting_launchInvesting() {
            return DeepLinkSpec.viewInvesting_launchInvesting;
        }

        public static DeepLinkSpec getViewInviteFriends_launchReferrals() {
            return DeepLinkSpec.viewInviteFriends_launchReferrals;
        }

        public static DeepLinkSpec getViewLimits_launchLimits() {
            return DeepLinkSpec.viewLimits_launchLimits;
        }

        public static DeepLinkSpec getViewLinkedBankAccounts_linkedBankAccounts() {
            return DeepLinkSpec.viewLinkedBankAccounts_linkedBankAccounts;
        }

        public static DeepLinkSpec getViewListing_viewListing() {
            return DeepLinkSpec.viewListing_viewListing;
        }

        public static DeepLinkSpec getViewLocalBrandCheckoutWithCashtag_viewLocalBrandCheckoutWithCashtag() {
            return DeepLinkSpec.viewLocalBrandCheckoutWithCashtag_viewLocalBrandCheckoutWithCashtag;
        }

        public static DeepLinkSpec getViewLocalBrandProfileQrOrdering_viewLocalBrandProfileQrOrdering() {
            return DeepLinkSpec.viewLocalBrandProfileQrOrdering_viewLocalBrandProfileQrOrdering;
        }

        public static DeepLinkSpec getViewLocalBrandProfileShortlink_viewLocalBrandProfileShortlink() {
            return DeepLinkSpec.viewLocalBrandProfileShortlink_viewLocalBrandProfileShortlink;
        }

        public static DeepLinkSpec getViewLocalBrandProfileWithCashtagAndLocationSlug_viewLocalBrandProfileWithCashtagAndLocationSlug() {
            return DeepLinkSpec.viewLocalBrandProfileWithCashtagAndLocationSlug_viewLocalBrandProfileWithCashtagAndLocationSlug;
        }

        public static DeepLinkSpec getViewLocalBrandProfileWithDefaultLocation_viewLocalBrandProfileWithDefaultLocation() {
            return DeepLinkSpec.viewLocalBrandProfileWithDefaultLocation_viewLocalBrandProfileWithDefaultLocation;
        }

        public static DeepLinkSpec getViewLocalBrandProfile_viewLocalBrandProfile() {
            return DeepLinkSpec.viewLocalBrandProfile_viewLocalBrandProfile;
        }

        public static DeepLinkSpec getViewLocalEditorial_viewLocalEditorial() {
            return DeepLinkSpec.viewLocalEditorial_viewLocalEditorial;
        }

        public static DeepLinkSpec getViewLocalHome_viewLocalHome() {
            return DeepLinkSpec.viewLocalHome_viewLocalHome;
        }

        public static DeepLinkSpec getViewLocalMarketingMessage_viewLocalMarketingMessage() {
            return DeepLinkSpec.viewLocalMarketingMessage_viewLocalMarketingMessage;
        }

        public static DeepLinkSpec getViewLocalMenuShortlink_viewLocalMenuShortlink() {
            return DeepLinkSpec.viewLocalMenuShortlink_viewLocalMenuShortlink;
        }

        public static DeepLinkSpec getViewLocalOrderShortlink_viewLocalOrderShortlink() {
            return DeepLinkSpec.viewLocalOrderShortlink_viewLocalOrderShortlink;
        }

        public static DeepLinkSpec getViewLocalOrderStatusFromLocalHome_viewLocalOrderStatusFromLocalHome() {
            return DeepLinkSpec.viewLocalOrderStatusFromLocalHome_viewLocalOrderStatusFromLocalHome;
        }

        public static DeepLinkSpec getViewLocalShortlink_viewLocalInStoreOrderShortlink() {
            return DeepLinkSpec.viewLocalShortlink_viewLocalInStoreOrderShortlink;
        }

        public static DeepLinkSpec getViewLocalShortlink_viewLocalShortlink() {
            return DeepLinkSpec.viewLocalShortlink_viewLocalShortlink;
        }

        public static DeepLinkSpec getViewMerchantProfileOpenBottomSheet_launchBrandProfile() {
            return DeepLinkSpec.viewMerchantProfileOpenBottomSheet_launchBrandProfile;
        }

        public static DeepLinkSpec getViewMerchantProfile_launchBrandProfile() {
            return DeepLinkSpec.viewMerchantProfile_launchBrandProfile;
        }

        public static DeepLinkSpec getViewMoneyBooklet_launchMoneyBooklet() {
            return DeepLinkSpec.viewMoneyBooklet_launchMoneyBooklet;
        }

        public static DeepLinkSpec getViewMoneybotResumeChat_launchMoneybotResumeChat() {
            return DeepLinkSpec.viewMoneybotResumeChat_launchMoneybotResumeChat;
        }

        public static DeepLinkSpec getViewNotificationPreferences_launchNotificationPreferences() {
            return DeepLinkSpec.viewNotificationPreferences_launchNotificationPreferences;
        }

        public static DeepLinkSpec getViewOfferDetailsSheetByMerchant_launchOfferDetailsSheetByMerchant() {
            return DeepLinkSpec.viewOfferDetailsSheetByMerchant_launchOfferDetailsSheetByMerchant;
        }

        public static DeepLinkSpec getViewOfferDetailsSheetWithSingleUsePaymentTokenDeprecated_launchOfferDetailsSheetWithSingleUsePaymentToken() {
            return DeepLinkSpec.viewOfferDetailsSheetWithSingleUsePaymentTokenDeprecated_launchOfferDetailsSheetWithSingleUsePaymentToken;
        }

        public static DeepLinkSpec getViewOfferDetailsSheet_launchOfferDetailsSheet() {
            return DeepLinkSpec.viewOfferDetailsSheet_launchOfferDetailsSheet;
        }

        public static DeepLinkSpec getViewOffersBrowse_viewOffersBrowse() {
            return DeepLinkSpec.viewOffersBrowse_viewOffersBrowse;
        }

        public static DeepLinkSpec getViewOffersCollection_viewOffersCollection() {
            return DeepLinkSpec.viewOffersCollection_viewOffersCollection;
        }

        public static DeepLinkSpec getViewOverdraftCoverage_launchOverdraftCoverage() {
            return DeepLinkSpec.viewOverdraftCoverage_launchOverdraftCoverage;
        }

        public static DeepLinkSpec getViewPaperMoney_viewPaperMoney() {
            return DeepLinkSpec.viewPaperMoney_viewPaperMoney;
        }

        public static DeepLinkSpec getViewPayCashtagAmountNote_payCashtagNote() {
            return DeepLinkSpec.viewPayCashtagAmountNote_payCashtagNote;
        }

        public static DeepLinkSpec getViewPayCashtagAmount_payCashtag() {
            return DeepLinkSpec.viewPayCashtagAmount_payCashtag;
        }

        public static DeepLinkSpec getViewPayLink_payLink() {
            return DeepLinkSpec.viewPayLink_payLink;
        }

        public static DeepLinkSpec getViewPayWithOptions_payWithOptions() {
            return DeepLinkSpec.viewPayWithOptions_payWithOptions;
        }

        public static DeepLinkSpec getViewPaychecksDistributionSummary_viewPaychecksDistributionSummary() {
            return DeepLinkSpec.viewPaychecksDistributionSummary_viewPaychecksDistributionSummary;
        }

        public static DeepLinkSpec getViewPaychecksHome_viewPaychecksHome() {
            return DeepLinkSpec.viewPaychecksHome_viewPaychecksHome;
        }

        public static DeepLinkSpec getViewPaymentDetails_payment() {
            return DeepLinkSpec.viewPaymentDetails_payment;
        }

        public static DeepLinkSpec getViewPaymentPad_imessageShowPaymentPad() {
            return DeepLinkSpec.viewPaymentPad_imessageShowPaymentPad;
        }

        public static DeepLinkSpec getViewPaymentPad_showPaymentPad() {
            return DeepLinkSpec.viewPaymentPad_showPaymentPad;
        }

        public static DeepLinkSpec getViewPaymentPersonalizationSend_viewPaymentPersonalizationSend() {
            return DeepLinkSpec.viewPaymentPersonalizationSend_viewPaymentPersonalizationSend;
        }

        public static DeepLinkSpec getViewPaymentPersonalization_viewPaymentPersonalization() {
            return DeepLinkSpec.viewPaymentPersonalization_viewPaymentPersonalization;
        }

        public static DeepLinkSpec getViewPhonePlansHome_launchPhonePlansHome() {
            return DeepLinkSpec.viewPhonePlansHome_launchPhonePlansHome;
        }

        public static DeepLinkSpec getViewPoolDetails_launchPoolDetails() {
            return DeepLinkSpec.viewPoolDetails_launchPoolDetails;
        }

        public static DeepLinkSpec getViewPoolsList_launchPoolDetails() {
            return DeepLinkSpec.viewPoolsList_launchPoolDetails;
        }

        public static DeepLinkSpec getViewPrivacy_launchPrivacy() {
            return DeepLinkSpec.viewPrivacy_launchPrivacy;
        }

        public static DeepLinkSpec getViewProfileDirectory_launchProfileDirectory() {
            return DeepLinkSpec.viewProfileDirectory_launchProfileDirectory;
        }

        public static DeepLinkSpec getViewProfilePersonal_viewProfilePersonal() {
            return DeepLinkSpec.viewProfilePersonal_viewProfilePersonal;
        }

        public static DeepLinkSpec getViewProfileSwitcher_viewProfileSwitcher() {
            return DeepLinkSpec.viewProfileSwitcher_viewProfileSwitcher;
        }

        public static DeepLinkSpec getViewProfileWithAccountSwitchOnboarding_viewProfileWithAccountSwitchOnboarding() {
            return DeepLinkSpec.viewProfileWithAccountSwitchOnboarding_viewProfileWithAccountSwitchOnboarding;
        }

        public static DeepLinkSpec getViewProfile_viewProfile() {
            return DeepLinkSpec.viewProfile_viewProfile;
        }

        public static DeepLinkSpec getViewPromotionDetails_launchPromotionDetails() {
            return DeepLinkSpec.viewPromotionDetails_launchPromotionDetails;
        }

        public static DeepLinkSpec getViewPromotionsHome_launchPromotionsHome() {
            return DeepLinkSpec.viewPromotionsHome_launchPromotionsHome;
        }

        public static DeepLinkSpec getViewQrCodeScanner_launchQrCodeScanner() {
            return DeepLinkSpec.viewQrCodeScanner_launchQrCodeScanner;
        }

        public static DeepLinkSpec getViewQrCode_launchQrCode() {
            return DeepLinkSpec.viewQrCode_launchQrCode;
        }

        public static DeepLinkSpec getViewRecurringDeposits_launchBalanceRecurringDeposits() {
            return DeepLinkSpec.viewRecurringDeposits_launchBalanceRecurringDeposits;
        }

        public static DeepLinkSpec getViewRequestCashtagAmountNote_requestCashtagNote() {
            return DeepLinkSpec.viewRequestCashtagAmountNote_requestCashtagNote;
        }

        public static DeepLinkSpec getViewRequestCashtagAmount_requestCashtag() {
            return DeepLinkSpec.viewRequestCashtagAmount_requestCashtag;
        }

        public static DeepLinkSpec getViewRequestPhysicalCashCard_bankingCashCard() {
            return DeepLinkSpec.viewRequestPhysicalCashCard_bankingCashCard;
        }

        public static DeepLinkSpec getViewRequestWithOptions_requestWithOptions() {
            return DeepLinkSpec.viewRequestWithOptions_requestWithOptions;
        }

        public static DeepLinkSpec getViewSavingsNuxOrHome_viewSavingsNuxOrHome() {
            return DeepLinkSpec.viewSavingsNuxOrHome_viewSavingsNuxOrHome;
        }

        public static DeepLinkSpec getViewSecurityAndPrivacy_launchSecurityAndPrivacy() {
            return DeepLinkSpec.viewSecurityAndPrivacy_launchSecurityAndPrivacy;
        }

        public static DeepLinkSpec getViewSecurityHub_launchSecurityHub() {
            return DeepLinkSpec.viewSecurityHub_launchSecurityHub;
        }

        public static DeepLinkSpec getViewSecurity_launchSecurity() {
            return DeepLinkSpec.viewSecurity_launchSecurity;
        }

        public static DeepLinkSpec getViewSendBitcoin_widgetBitcoinSend() {
            return DeepLinkSpec.viewSendBitcoin_widgetBitcoinSend;
        }

        public static DeepLinkSpec getViewShiftsClockIn_launchShiftsClockin() {
            return DeepLinkSpec.viewShiftsClockIn_launchShiftsClockin;
        }

        public static DeepLinkSpec getViewShiftsHome_launchShiftsHome() {
            return DeepLinkSpec.viewShiftsHome_launchShiftsHome;
        }

        public static DeepLinkSpec getViewShiftsSchedule_launchShiftsSchedule() {
            return DeepLinkSpec.viewShiftsSchedule_launchShiftsSchedule;
        }

        public static DeepLinkSpec getViewShiftsTimecards_launchShiftsTimecards() {
            return DeepLinkSpec.viewShiftsTimecards_launchShiftsTimecards;
        }

        public static DeepLinkSpec getViewShopDynamicScreenSearch_launchDynamicShopHubSearch() {
            return DeepLinkSpec.viewShopDynamicScreenSearch_launchDynamicShopHubSearch;
        }

        public static DeepLinkSpec getViewShopDynamicScreen_launchDynamicShopHub() {
            return DeepLinkSpec.viewShopDynamicScreen_launchDynamicShopHub;
        }

        public static DeepLinkSpec getViewShoppingSettings_launchShoppingSettings() {
            return DeepLinkSpec.viewShoppingSettings_launchShoppingSettings;
        }

        public static DeepLinkSpec getViewStablecoinReceive_launchStablecoinReceive() {
            return DeepLinkSpec.viewStablecoinReceive_launchStablecoinReceive;
        }

        public static DeepLinkSpec getViewStablecoin_launchStablecoin() {
            return DeepLinkSpec.viewStablecoin_launchStablecoin;
        }

        public static DeepLinkSpec getViewSupportChatFromMoneybot_launchSupportChatFromMoneybot() {
            return DeepLinkSpec.viewSupportChatFromMoneybot_launchSupportChatFromMoneybot;
        }

        public static DeepLinkSpec getViewSupportChatNewUnreadMessage_launchSupportChat() {
            return DeepLinkSpec.viewSupportChatNewUnreadMessage_launchSupportChat;
        }

        public static DeepLinkSpec getViewSupportNode_launchSupportNode() {
            return DeepLinkSpec.viewSupportNode_launchSupportNode;
        }

        public static DeepLinkSpec getViewSupport_launchSupport() {
            return DeepLinkSpec.viewSupport_launchSupport;
        }

        public static DeepLinkSpec getViewSystemNotificationsSettings_launchSystemNotificationSettings() {
            return DeepLinkSpec.viewSystemNotificationsSettings_launchSystemNotificationSettings;
        }

        public static DeepLinkSpec getViewTaxesHubWithDeepLink_launchTaxesWebApp() {
            return DeepLinkSpec.viewTaxesHubWithDeepLink_launchTaxesWebApp;
        }

        public static DeepLinkSpec getViewTaxesHub_launchViewTaxesHub() {
            return DeepLinkSpec.viewTaxesHub_launchViewTaxesHub;
        }

        public static DeepLinkSpec getViewTaxesWebAppRoot_launchTaxesWebAppRoot() {
            return DeepLinkSpec.viewTaxesWebAppRoot_launchTaxesWebAppRoot;
        }

        public static DeepLinkSpec getViewTaxesWebApp_launchTaxesWebApp() {
            return DeepLinkSpec.viewTaxesWebApp_launchTaxesWebApp;
        }

        public static DeepLinkSpec getViewThemeSwitcher_launchThemeSwitcher() {
            return DeepLinkSpec.viewThemeSwitcher_launchThemeSwitcher;
        }

        public static DeepLinkSpec getViewWireTransferSetup_launchWireTransferSetup() {
            return DeepLinkSpec.viewWireTransferSetup_launchWireTransferSetup;
        }
    }

    static {
        DeepLinkSpec deepLinkSpec = new DeepLinkSpec("Deactivate Tag", "/launch/deactivate-tag", ClientRouteSpec.deactivateTag);
        deactivateTag_deactivateTag = deepLinkSpec;
        DeepLinkSpec deepLinkSpec2 = new DeepLinkSpec("Launch Address", "/launch/address", ClientRouteSpec.deprecatedViewAddress);
        deprecatedViewAddress_launchAddress = deepLinkSpec2;
        DeepLinkSpec deepLinkSpec3 = new DeepLinkSpec("Launch Earnings Tracker", "/launch/earnings-tracker", ClientRouteSpec.deprecatedViewEarningsTracker);
        deprecatedViewEarningsTracker_launchEarningsTracker = deepLinkSpec3;
        DeepLinkSpec deepLinkSpec4 = new DeepLinkSpec("Launch Gift Card Store", "/launch/gift-card-store", ClientRouteSpec.deprecatedViewGiftCardStore);
        deprecatedViewGiftCardStore_launchGiftCardStore = deepLinkSpec4;
        DeepLinkSpec deepLinkSpec5 = new DeepLinkSpec("Loyalty", "/loyalty", ClientRouteSpec.deprecatedViewLoyalty);
        deprecatedViewLoyalty_loyalty = deepLinkSpec5;
        DeepLinkSpec deepLinkSpec6 = new DeepLinkSpec("View Settings", "/launch/settings", ClientRouteSpec.deprecatedViewSettings);
        deprecatedViewSettings_viewSettings = deepLinkSpec6;
        DeepLinkSpec deepLinkSpec7 = new DeepLinkSpec("Launch Shop Hub", "/launch/shop", ClientRouteSpec.deprecatedViewShopHub);
        deprecatedViewShopHub_launchShopHub = deepLinkSpec7;
        DeepLinkSpec deepLinkSpec8 = new DeepLinkSpec("Internal Benchmarking", "/internal-benchmarking", ClientRouteSpec.internalBenchmarking);
        internalBenchmarking_internalBenchmarking = deepLinkSpec8;
        ClientRouteSpec clientRouteSpec = ClientRouteSpec.noOperation;
        DeepLinkSpec deepLinkSpec9 = new DeepLinkSpec("Launch", "/launch", clientRouteSpec);
        noOperation_launch = deepLinkSpec9;
        DeepLinkSpec deepLinkSpec10 = new DeepLinkSpec("Widget", "/widget", clientRouteSpec);
        noOperation_widget = deepLinkSpec10;
        DeepLinkSpec deepLinkSpec11 = new DeepLinkSpec("Launch", "/launch/prompt-if-needed-account", ClientRouteSpec.noOperationWithPromptIfNeededAccount);
        noOperationWithPromptIfNeededAccount_launch = deepLinkSpec11;
        DeepLinkSpec deepLinkSpec12 = new DeepLinkSpec("Launch", "/launch/required-account", ClientRouteSpec.noOperationWithRequiredAccount);
        noOperationWithRequiredAccount_launch = deepLinkSpec12;
        DeepLinkSpec deepLinkSpec13 = new DeepLinkSpec("Verify Stripe Redirect", "/verify/stripe/redirect", ClientRouteSpec.verifyStripeRedirect);
        verifyStripeRedirect_verifyStripeRedirect = deepLinkSpec13;
        DeepLinkSpec deepLinkSpec14 = new DeepLinkSpec("View Account Status Summary", "/launch/account-status/summary", ClientRouteSpec.viewAccountStatus);
        viewAccountStatus_viewAccountStatusSummary = deepLinkSpec14;
        DeepLinkSpec deepLinkSpec15 = new DeepLinkSpec("Launch Activity", "/launch/activity", ClientRouteSpec.viewActivity);
        viewActivity_launchActivity = deepLinkSpec15;
        DeepLinkSpec deepLinkSpec16 = new DeepLinkSpec("Launch Add Cash", "/launch/add-cash", ClientRouteSpec.viewAddCash);
        viewAddCash_launchAddCash = deepLinkSpec16;
        DeepLinkSpec deepLinkSpec17 = new DeepLinkSpec("Add To Digital Wallet Flow", "/launch/add-to-digital-wallet", ClientRouteSpec.viewAddToDigitalWallet);
        viewAddToDigitalWallet_addToDigitalWalletFlow = deepLinkSpec17;
        DeepLinkSpec deepLinkSpec18 = new DeepLinkSpec("Launch Afterpay Applet Home", "/launch/afterpay-applet/home", ClientRouteSpec.viewAfterpayAppletHome);
        viewAfterpayAppletHome_launchAfterpayAppletHome = deepLinkSpec18;
        DeepLinkSpec deepLinkSpec19 = new DeepLinkSpec("Launch Afterpay Applet Purchases", "/launch/afterpay-applet/purchases", ClientRouteSpec.viewAfterpayAppletPurchases);
        viewAfterpayAppletPurchases_launchAfterpayAppletPurchases = deepLinkSpec19;
        DeepLinkSpec deepLinkSpec20 = new DeepLinkSpec("Launch Afterpay Applet Retro Order Selection", "/launch/afterpay-applet/retro-order-selection", ClientRouteSpec.viewAfterpayAppletRetroOrderSelection);
        viewAfterpayAppletRetroOrderSelection_launchAfterpayAppletRetroOrderSelection = deepLinkSpec20;
        DeepLinkSpec deepLinkSpec21 = new DeepLinkSpec("Launch Afterpay Hub", "/launch/afterpay-hub", ClientRouteSpec.viewAfterpayHub);
        viewAfterpayHub_launchAfterpayHub = deepLinkSpec21;
        DeepLinkSpec deepLinkSpec22 = new DeepLinkSpec("Launch Atm Withdrawal Map", "/launch/atm-withdrawal-map", ClientRouteSpec.viewAtmWithdrawalMap);
        viewAtmWithdrawalMap_launchAtmWithdrawalMap = deepLinkSpec22;
        DeepLinkSpec deepLinkSpec23 = new DeepLinkSpec("Launch Auto Add Cash", "/launch/auto-add-cash", ClientRouteSpec.viewAutoAddCash);
        viewAutoAddCash_launchAutoAddCash = deepLinkSpec23;
        ClientRouteSpec clientRouteSpec2 = ClientRouteSpec.viewBalance;
        DeepLinkSpec deepLinkSpec24 = new DeepLinkSpec("Launch Balance", "/launch/money", clientRouteSpec2);
        viewBalance_launchBalance = deepLinkSpec24;
        DeepLinkSpec deepLinkSpec25 = new DeepLinkSpec("iMessage Show Balance", "/imessage/showBalance", clientRouteSpec2);
        viewBalance_imessageShowBalance = deepLinkSpec25;
        DeepLinkSpec deepLinkSpec26 = new DeepLinkSpec("TodayView Show Balance", "/todayView/showBalance", clientRouteSpec2);
        viewBalance_todayviewShowBalance = deepLinkSpec26;
        DeepLinkSpec deepLinkSpec27 = new DeepLinkSpec("Widget Cash Balance", "/widget/cashBalance", clientRouteSpec2);
        viewBalance_widgetCashBalance = deepLinkSpec27;
        DeepLinkSpec deepLinkSpec28 = new DeepLinkSpec("Widget Add Cash", "/widget/addCash", ClientRouteSpec.viewBalanceAddCash);
        viewBalanceAddCash_widgetAddCash = deepLinkSpec28;
        DeepLinkSpec deepLinkSpec29 = new DeepLinkSpec("Launch Bank Transfers Setup", "/launch/bank-transfer-setup", ClientRouteSpec.viewBankTransferSetup);
        viewBankTransferSetup_launchBankTransfersSetup = deepLinkSpec29;
        DeepLinkSpec deepLinkSpec30 = new DeepLinkSpec("Launch Benefits Booklet", "/launch/benefits-booklet", ClientRouteSpec.viewBenefitsBooklet);
        viewBenefitsBooklet_launchBenefitsBooklet = deepLinkSpec30;
        DeepLinkSpec deepLinkSpec31 = new DeepLinkSpec("Launch Benefits Home", "/launch/benefits-home", ClientRouteSpec.viewBenefitsHome);
        viewBenefitsHome_launchBenefitsHome = deepLinkSpec31;
        DeepLinkSpec deepLinkSpec32 = new DeepLinkSpec("Launch Benefits Hub", "/launch/benefits-hub", ClientRouteSpec.viewBenefitsHub);
        viewBenefitsHub_launchBenefitsHub = deepLinkSpec32;
        ClientRouteSpec clientRouteSpec3 = ClientRouteSpec.viewBitcoin;
        DeepLinkSpec deepLinkSpec33 = new DeepLinkSpec("Launch Bitcoin", "/launch/bitcoin", clientRouteSpec3);
        viewBitcoin_launchBitcoin = deepLinkSpec33;
        DeepLinkSpec deepLinkSpec34 = new DeepLinkSpec("Widget Bitcoin", "/widget/bitcoin", clientRouteSpec3);
        viewBitcoin_widgetBitcoin = deepLinkSpec34;
        DeepLinkSpec deepLinkSpec35 = new DeepLinkSpec("Launch Bitcoin Auto Invest", "/launch/bitcoin/auto-invest", ClientRouteSpec.viewBitcoinAutoInvest);
        viewBitcoinAutoInvest_launchBitcoinAutoInvest = deepLinkSpec35;
        ClientRouteSpec clientRouteSpec4 = ClientRouteSpec.viewBitcoinBuy;
        DeepLinkSpec deepLinkSpec36 = new DeepLinkSpec("Launch Bitcoin Buy", "/launch/bitcoin/buy", clientRouteSpec4);
        viewBitcoinBuy_launchBitcoinBuy = deepLinkSpec36;
        DeepLinkSpec deepLinkSpec37 = new DeepLinkSpec("Widget Bitcoin Buy", "/widget/bitcoin/buy", clientRouteSpec4);
        viewBitcoinBuy_widgetBitcoinBuy = deepLinkSpec37;
        DeepLinkSpec deepLinkSpec38 = new DeepLinkSpec("Launch Bitcoin Map", "/launch/bitcoin/map", ClientRouteSpec.viewBitcoinMap);
        viewBitcoinMap_launchBitcoinMap = deepLinkSpec38;
        ClientRouteSpec clientRouteSpec5 = ClientRouteSpec.viewBitcoinSell;
        DeepLinkSpec deepLinkSpec39 = new DeepLinkSpec("Launch Bitcoin Sell", "/launch/bitcoin/sell", clientRouteSpec5);
        viewBitcoinSell_launchBitcoinSell = deepLinkSpec39;
        DeepLinkSpec deepLinkSpec40 = new DeepLinkSpec("Widget Bitcoin Sell", "/widget/bitcoin/sell", clientRouteSpec5);
        viewBitcoinSell_widgetBitcoinSell = deepLinkSpec40;
        ClientRouteSpec clientRouteSpec6 = ClientRouteSpec.viewBoostPicker;
        DeepLinkSpec deepLinkSpec41 = new DeepLinkSpec("Launch Boost Picker", "/launch/boost-picker", clientRouteSpec6);
        viewBoostPicker_launchBoostPicker = deepLinkSpec41;
        DeepLinkSpec deepLinkSpec42 = new DeepLinkSpec("Widget Boost Picker", "/widget/boost", clientRouteSpec6);
        viewBoostPicker_widgetBoostPicker = deepLinkSpec42;
        DeepLinkSpec deepLinkSpec43 = new DeepLinkSpec("Launch Borrow", "/launch/borrow", ClientRouteSpec.viewBorrowDeprecated);
        viewBorrowDeprecated_launchBorrow = deepLinkSpec43;
        ClientRouteSpec clientRouteSpec7 = ClientRouteSpec.viewCard;
        DeepLinkSpec deepLinkSpec44 = new DeepLinkSpec("Launch Card Drawer", "/launch/card-drawer", clientRouteSpec7);
        viewCard_launchCardDrawer = deepLinkSpec44;
        DeepLinkSpec deepLinkSpec45 = new DeepLinkSpec("Widget Card", "/widget/card", clientRouteSpec7);
        viewCard_widgetCard = deepLinkSpec45;
        DeepLinkSpec deepLinkSpec46 = new DeepLinkSpec("View Card Blocked Businesses", "/launch/card-blocked-businesses", ClientRouteSpec.viewCardBlockedBusinesses);
        viewCardBlockedBusinesses_viewCardBlockedBusinesses = deepLinkSpec46;
        DeepLinkSpec deepLinkSpec47 = new DeepLinkSpec("View Spending Insights Home", "/launch/card-spending-insights/home", ClientRouteSpec.viewCardSpendingInsightsHome);
        viewCardSpendingInsightsHome_viewSpendingInsightsHome = deepLinkSpec47;
        DeepLinkSpec deepLinkSpec48 = new DeepLinkSpec("Launch Cash App Score", "/launch/cash-app-score", ClientRouteSpec.viewCashAppScore);
        viewCashAppScore_launchCashAppScore = deepLinkSpec48;
        DeepLinkSpec deepLinkSpec49 = new DeepLinkSpec("Launch Cash Card Style Picker", "/banking/cash-card/style-picker", ClientRouteSpec.viewCashCardStylePicker);
        viewCashCardStylePicker_launchCashCardStylePicker = deepLinkSpec49;
        DeepLinkSpec deepLinkSpec50 = new DeepLinkSpec("Widget Cash Out", "/widget/cashOut", ClientRouteSpec.viewCashOut);
        viewCashOut_widgetCashOut = deepLinkSpec50;
        DeepLinkSpec deepLinkSpec51 = new DeepLinkSpec("Continue Apple Pay", "/app/continue-apple-pay", ClientRouteSpec.viewContinueApplePay);
        viewContinueApplePay_continueApplePay = deepLinkSpec51;
        DeepLinkSpec deepLinkSpec52 = new DeepLinkSpec("Direct Deposit Setup", "/launch/direct-deposit-setup", ClientRouteSpec.viewDirectDepositSetup);
        viewDirectDepositSetup_directDepositSetup = deepLinkSpec52;
        DeepLinkSpec deepLinkSpec53 = new DeepLinkSpec("Document Afterpay Statements", "/launch/documents/afterpay_statements", ClientRouteSpec.viewDocumentAfterpayStatements);
        viewDocumentAfterpayStatements_documentAfterpayStatements = deepLinkSpec53;
        DeepLinkSpec deepLinkSpec54 = new DeepLinkSpec("Document All BTC Tax Forms", "/launch/documents/btc_tax_form", ClientRouteSpec.viewDocumentAllBtcTaxForms);
        viewDocumentAllBtcTaxForms_documentAllBtcTaxForms = deepLinkSpec54;
        DeepLinkSpec deepLinkSpec55 = new DeepLinkSpec("Document All Savings Tax Forms", "/launch/documents/savings_tax_form", ClientRouteSpec.viewDocumentAllSavingsTaxForms);
        viewDocumentAllSavingsTaxForms_documentAllSavingsTaxForms = deepLinkSpec55;
        DeepLinkSpec deepLinkSpec56 = new DeepLinkSpec("Document Banking Statements", "/launch/documents/banking_statements", ClientRouteSpec.viewDocumentBankingStatements);
        viewDocumentBankingStatements_documentBankingStatements = deepLinkSpec56;
        DeepLinkSpec deepLinkSpec57 = new DeepLinkSpec("Document Stock Monthly Statement List", "/documents/stock_monthly_statement", ClientRouteSpec.viewDocumentStockMonthlyStatementList);
        viewDocumentStockMonthlyStatementList_documentStockMonthlyStatementList = deepLinkSpec57;
        DeepLinkSpec deepLinkSpec58 = new DeepLinkSpec("Document Stock Tax Form List", "/documents/stock_tax_form", ClientRouteSpec.viewDocumentStockTaxFormList);
        viewDocumentStockTaxFormList_documentStockTaxFormList = deepLinkSpec58;
        DeepLinkSpec deepLinkSpec59 = new DeepLinkSpec("Edit Profile", "/launch/edit/profile", ClientRouteSpec.viewEditProfile);
        viewEditProfile_editProfile = deepLinkSpec59;
        DeepLinkSpec deepLinkSpec60 = new DeepLinkSpec("Launch Safety Education Hub", "/launch/family-safety-education-hub", ClientRouteSpec.viewFamilySafetyEducationHub);
        viewFamilySafetyEducationHub_launchSafetyEducationHub = deepLinkSpec60;
        DeepLinkSpec deepLinkSpec61 = new DeepLinkSpec("Launch Investing", "/launch/investing", ClientRouteSpec.viewInvesting);
        viewInvesting_launchInvesting = deepLinkSpec61;
        DeepLinkSpec deepLinkSpec62 = new DeepLinkSpec("Launch Investing RoundUps Onboarding", "/launch/investing/round_ups_onboarding", ClientRouteSpec.viewInvestingRoundupsOnboarding);
        viewInvestingRoundupsOnboarding_launchInvestingRoundupsOnboarding = deepLinkSpec62;
        DeepLinkSpec deepLinkSpec63 = new DeepLinkSpec("Launch Referrals", "/launch/referrals", ClientRouteSpec.viewInviteFriends);
        viewInviteFriends_launchReferrals = deepLinkSpec63;
        DeepLinkSpec deepLinkSpec64 = new DeepLinkSpec("Launch Limits", "/launch/limits", ClientRouteSpec.viewLimits);
        viewLimits_launchLimits = deepLinkSpec64;
        DeepLinkSpec deepLinkSpec65 = new DeepLinkSpec("iMessage Insufficient Funds", "/imessage/insufficientFunds", ClientRouteSpec.viewLinkBankAccount);
        viewLinkBankAccount_imessageInsufficientFunds = deepLinkSpec65;
        DeepLinkSpec deepLinkSpec66 = new DeepLinkSpec("Linked Bank Accounts", "/launch/linked-bank-accounts", ClientRouteSpec.viewLinkedBankAccounts);
        viewLinkedBankAccounts_linkedBankAccounts = deepLinkSpec66;
        DeepLinkSpec deepLinkSpec67 = new DeepLinkSpec("View Local Home", "/l/view/home", ClientRouteSpec.viewLocalHome);
        viewLocalHome_viewLocalHome = deepLinkSpec67;
        DeepLinkSpec deepLinkSpec68 = new DeepLinkSpec("Launch Notification Preferences", "/launch/notification-preferences", ClientRouteSpec.viewNotificationPreferences);
        viewNotificationPreferences_launchNotificationPreferences = deepLinkSpec68;
        DeepLinkSpec deepLinkSpec69 = new DeepLinkSpec("View Offers Browse", "/launch/offers-browse", ClientRouteSpec.viewOffersBrowse);
        viewOffersBrowse_viewOffersBrowse = deepLinkSpec69;
        DeepLinkSpec deepLinkSpec70 = new DeepLinkSpec("Launch Overdraft Coverage", "/launch/overdraft-coverage", ClientRouteSpec.viewOverdraftCoverage);
        viewOverdraftCoverage_launchOverdraftCoverage = deepLinkSpec70;
        DeepLinkSpec deepLinkSpec71 = new DeepLinkSpec("View Paper Money", "/launch/paper_money", ClientRouteSpec.viewPaperMoney);
        viewPaperMoney_viewPaperMoney = deepLinkSpec71;
        DeepLinkSpec deepLinkSpec72 = new DeepLinkSpec("View Paychecks Distribution Summary", "/launch/paychecks/distribution-summary", ClientRouteSpec.viewPaychecksDistributionSummary);
        viewPaychecksDistributionSummary_viewPaychecksDistributionSummary = deepLinkSpec72;
        DeepLinkSpec deepLinkSpec73 = new DeepLinkSpec("View Paychecks Home", "/launch/paychecks", ClientRouteSpec.viewPaychecksHome);
        viewPaychecksHome_viewPaychecksHome = deepLinkSpec73;
        ClientRouteSpec clientRouteSpec8 = ClientRouteSpec.viewPaymentPad;
        DeepLinkSpec deepLinkSpec74 = new DeepLinkSpec("iMessage Show Payment Pad", "/imessage/showPaymentPad", clientRouteSpec8);
        viewPaymentPad_imessageShowPaymentPad = deepLinkSpec74;
        DeepLinkSpec deepLinkSpec75 = new DeepLinkSpec("Show Payment Pad", "/launch/payment-pad", clientRouteSpec8);
        viewPaymentPad_showPaymentPad = deepLinkSpec75;
        DeepLinkSpec deepLinkSpec76 = new DeepLinkSpec("Launch Phone Plans Home", "/launch/phone-plans/home", ClientRouteSpec.viewPhonePlansHome);
        viewPhonePlansHome_launchPhonePlansHome = deepLinkSpec76;
        DeepLinkSpec deepLinkSpec77 = new DeepLinkSpec("Launch Privacy", "/launch/privacy", ClientRouteSpec.viewPrivacy);
        viewPrivacy_launchPrivacy = deepLinkSpec77;
        DeepLinkSpec deepLinkSpec78 = new DeepLinkSpec("View Profile", "/launch/profile", ClientRouteSpec.viewProfile);
        viewProfile_viewProfile = deepLinkSpec78;
        DeepLinkSpec deepLinkSpec79 = new DeepLinkSpec("Launch Profile Directory", "/launch/profile-directory", ClientRouteSpec.viewProfileDirectory);
        viewProfileDirectory_launchProfileDirectory = deepLinkSpec79;
        DeepLinkSpec deepLinkSpec80 = new DeepLinkSpec("View Profile Personal", "/launch/profile-personal", ClientRouteSpec.viewProfilePersonal);
        viewProfilePersonal_viewProfilePersonal = deepLinkSpec80;
        DeepLinkSpec deepLinkSpec81 = new DeepLinkSpec("View Profile Switcher", "/launch/profiles/switcher", ClientRouteSpec.viewProfileSwitcher);
        viewProfileSwitcher_viewProfileSwitcher = deepLinkSpec81;
        DeepLinkSpec deepLinkSpec82 = new DeepLinkSpec("View Profile With Account Switch Onboarding", "/launch/profile-switch-onboarding", ClientRouteSpec.viewProfileWithAccountSwitchOnboarding);
        viewProfileWithAccountSwitchOnboarding_viewProfileWithAccountSwitchOnboarding = deepLinkSpec82;
        DeepLinkSpec deepLinkSpec83 = new DeepLinkSpec("Launch Promotions Home", "/launch/promotions/home", ClientRouteSpec.viewPromotionsHome);
        viewPromotionsHome_launchPromotionsHome = deepLinkSpec83;
        ClientRouteSpec clientRouteSpec9 = ClientRouteSpec.viewQrCode;
        DeepLinkSpec deepLinkSpec84 = new DeepLinkSpec("Widget Cash QR Code", "/widget/qr-code", clientRouteSpec9);
        viewQrCode_widgetCashQrCode = deepLinkSpec84;
        DeepLinkSpec deepLinkSpec85 = new DeepLinkSpec("Launch QR Code", "/launch/qr-code", clientRouteSpec9);
        viewQrCode_launchQrCode = deepLinkSpec85;
        DeepLinkSpec deepLinkSpec86 = new DeepLinkSpec("Launch QR Code Scanner", "/launch/qr-code/scanner", ClientRouteSpec.viewQrCodeScanner);
        viewQrCodeScanner_launchQrCodeScanner = deepLinkSpec86;
        DeepLinkSpec deepLinkSpec87 = new DeepLinkSpec("Launch Balance Recurring Deposits", "/launch/balance/recurring-deposits", ClientRouteSpec.viewRecurringDeposits);
        viewRecurringDeposits_launchBalanceRecurringDeposits = deepLinkSpec87;
        DeepLinkSpec deepLinkSpec88 = new DeepLinkSpec("View Savings NUX Or Home", "/launch/savings", ClientRouteSpec.viewSavingsNuxOrHome);
        viewSavingsNuxOrHome_viewSavingsNuxOrHome = deepLinkSpec88;
        DeepLinkSpec deepLinkSpec89 = new DeepLinkSpec("Launch Security", "/launch/security", ClientRouteSpec.viewSecurity);
        viewSecurity_launchSecurity = deepLinkSpec89;
        DeepLinkSpec deepLinkSpec90 = new DeepLinkSpec("Launch Security and Privacy", "/launch/security-privacy", ClientRouteSpec.viewSecurityAndPrivacy);
        viewSecurityAndPrivacy_launchSecurityAndPrivacy = deepLinkSpec90;
        DeepLinkSpec deepLinkSpec91 = new DeepLinkSpec("Launch Security Hub", "/launch/security-hub", ClientRouteSpec.viewSecurityHub);
        viewSecurityHub_launchSecurityHub = deepLinkSpec91;
        DeepLinkSpec deepLinkSpec92 = new DeepLinkSpec("Widget Bitcoin Send", "/widget/bitcoin/send", ClientRouteSpec.viewSendBitcoin);
        viewSendBitcoin_widgetBitcoinSend = deepLinkSpec92;
        DeepLinkSpec deepLinkSpec93 = new DeepLinkSpec("Launch Shifts Home", "/launch/shifts/home", ClientRouteSpec.viewShiftsHome);
        viewShiftsHome_launchShiftsHome = deepLinkSpec93;
        DeepLinkSpec deepLinkSpec94 = new DeepLinkSpec("Launch Shopping Settings", "/launch/shopping-settings", ClientRouteSpec.viewShoppingSettings);
        viewShoppingSettings_launchShoppingSettings = deepLinkSpec94;
        DeepLinkSpec deepLinkSpec95 = new DeepLinkSpec("Launch Stablecoin", "/launch/stablecoin", ClientRouteSpec.viewStablecoin);
        viewStablecoin_launchStablecoin = deepLinkSpec95;
        DeepLinkSpec deepLinkSpec96 = new DeepLinkSpec("Launch Stablecoin Receive", "/launch/stablecoin/receive", ClientRouteSpec.viewStablecoinReceive);
        viewStablecoinReceive_launchStablecoinReceive = deepLinkSpec96;
        DeepLinkSpec deepLinkSpec97 = new DeepLinkSpec("Launch Support", "/launch/support", ClientRouteSpec.viewSupport);
        viewSupport_launchSupport = deepLinkSpec97;
        DeepLinkSpec deepLinkSpec98 = new DeepLinkSpec("Launch Support Chat", "/launch/support/chat", ClientRouteSpec.viewSupportChatNewUnreadMessage);
        viewSupportChatNewUnreadMessage_launchSupportChat = deepLinkSpec98;
        DeepLinkSpec deepLinkSpec99 = new DeepLinkSpec("Launch System Notification Settings", "/launch/system-settings/notifications", ClientRouteSpec.viewSystemNotificationsSettings);
        viewSystemNotificationsSettings_launchSystemNotificationSettings = deepLinkSpec99;
        DeepLinkSpec deepLinkSpec100 = new DeepLinkSpec("Launch View Taxes Hub", "/launch/tax/hub", ClientRouteSpec.viewTaxesHub);
        viewTaxesHub_launchViewTaxesHub = deepLinkSpec100;
        DeepLinkSpec deepLinkSpec101 = new DeepLinkSpec("Launch Taxes Web App Root", "/launch/taxes", ClientRouteSpec.viewTaxesWebAppRoot);
        viewTaxesWebAppRoot_launchTaxesWebAppRoot = deepLinkSpec101;
        DeepLinkSpec deepLinkSpec102 = new DeepLinkSpec("Launch Theme Switcher", "/launch/theme-switcher", ClientRouteSpec.viewThemeSwitcher);
        viewThemeSwitcher_launchThemeSwitcher = deepLinkSpec102;
        DeepLinkSpec deepLinkSpec103 = new DeepLinkSpec("Launch Wire Transfer Setup", "/launch/wire-transfer-setup", ClientRouteSpec.viewWireTransferSetup);
        viewWireTransferSetup_launchWireTransferSetup = deepLinkSpec103;
        DeepLinkSpec deepLinkSpec104 = new DeepLinkSpec("Launch Scenario", "/launch/scenario/$client_scenario/$flow_token", ClientRouteSpec.completeScenario);
        completeScenario_launchScenario = deepLinkSpec104;
        DeepLinkSpec deepLinkSpec105 = new DeepLinkSpec("Sandbox", "/sandbox/v1/$token", ClientRouteSpec.deprecatedCashAppPaySandbox);
        deprecatedCashAppPaySandbox_sandbox = deepLinkSpec105;
        DeepLinkSpec deepLinkSpec106 = new DeepLinkSpec("Widget Boost In Auto Select", "/widget/boost/auto-select/$boost_token", ClientRouteSpec.deprecatedViewAutoSelectBoost);
        deprecatedViewAutoSelectBoost_widgetBoostInAutoSelect = deepLinkSpec106;
        DeepLinkSpec deepLinkSpec107 = new DeepLinkSpec("Launch Boost Details By Merchant", "/launch/boost/merchant/$merchant_token", ClientRouteSpec.deprecatedViewBoostDetailsByMerchant);
        deprecatedViewBoostDetailsByMerchant_launchBoostDetailsByMerchant = deepLinkSpec107;
        DeepLinkSpec deepLinkSpec108 = new DeepLinkSpec("View Local Brand Collection", "/l/$brand_collection_short_token/c/$attribution_key", ClientRouteSpec.deprecatedViewLocalBrandCollection);
        deprecatedViewLocalBrandCollection_viewLocalBrandCollection = deepLinkSpec108;
        DeepLinkSpec deepLinkSpec109 = new DeepLinkSpec("Loyalty Program", "/loyalty/$loyalty_program_deep_link_token", ClientRouteSpec.deprecatedViewLoyaltyProgram);
        deprecatedViewLoyaltyProgram_loyaltyProgram = deepLinkSpec109;
        DeepLinkSpec deepLinkSpec110 = new DeepLinkSpec("Widget Savings Transfer Cash", "/widget/savings/transfer-cash/$context", ClientRouteSpec.deprecatedViewSavingsAddCash);
        deprecatedViewSavingsAddCash_widgetSavingsTransferCash = deepLinkSpec110;
        DeepLinkSpec deepLinkSpec111 = new DeepLinkSpec("Launch Shop Info", "/launch/shop/info", ClientRouteSpec.deprecatedViewShopInfo);
        deprecatedViewShopInfo_launchShopInfo = deepLinkSpec111;
        DeepLinkSpec deepLinkSpec112 = new DeepLinkSpec("Flow", "/f/$initiation_data", ClientRouteSpec.flow);
        flow_flow = deepLinkSpec112;
        DeepLinkSpec deepLinkSpec113 = new DeepLinkSpec("Flow Half Sheet", "/fhs/$initiation_data", ClientRouteSpec.flowHalfSheet);
        flowHalfSheet_flowHalfSheet = deepLinkSpec113;
        DeepLinkSpec deepLinkSpec114 = new DeepLinkSpec("Launch Initiate Bitcoin Partner Action", "/launch/bitcoin/partner/$action/$token", ClientRouteSpec.initiateBitcoinPartnerAction);
        initiateBitcoinPartnerAction_launchInitiateBitcoinPartnerAction = deepLinkSpec114;
        DeepLinkSpec deepLinkSpec115 = new DeepLinkSpec("Launch Initiate Bitcoin Withdrawal", "/launch/bitcoin/transfer/$token", ClientRouteSpec.initiateBitcoinTransferDeprecated);
        initiateBitcoinTransferDeprecated_launchInitiateBitcoinWithdrawal = deepLinkSpec115;
        DeepLinkSpec deepLinkSpec116 = new DeepLinkSpec("Launch Initiate Bitkey Auto Withdraw", "/launch/bitkey/auto-withdraw", ClientRouteSpec.initiateBitkeyAutoWithdraw);
        initiateBitkeyAutoWithdraw_launchInitiateBitkeyAutoWithdraw = deepLinkSpec116;
        DeepLinkSpec deepLinkSpec117 = new DeepLinkSpec("Launch Join Game", "/launch/join/$game_id", ClientRouteSpec.joinGameTrivia);
        joinGameTrivia_launchJoinGame = deepLinkSpec117;
        DeepLinkSpec deepLinkSpec118 = new DeepLinkSpec("Launch", "/launch/query", ClientRouteSpec.noOperationWithQueryParameter);
        noOperationWithQueryParameter_launch = deepLinkSpec118;
        DeepLinkSpec deepLinkSpec119 = new DeepLinkSpec("Launch Pay Lightning Invoice", "/launch/lightning/$invoice", ClientRouteSpec.payLightningInvoice);
        payLightningInvoice_launchPayLightningInvoice = deepLinkSpec119;
        DeepLinkSpec deepLinkSpec120 = new DeepLinkSpec("Launch Treehouse App Link", "/launch/treehouse/$app/$link", ClientRouteSpec.treehouseAppLink);
        treehouseAppLink_launchTreehouseAppLink = deepLinkSpec120;
        DeepLinkSpec deepLinkSpec121 = new DeepLinkSpec("Verify Email Link", "/app/verify-email/$code", ClientRouteSpec.verifyEmail);
        verifyEmail_verifyEmailLink = deepLinkSpec121;
        DeepLinkSpec deepLinkSpec122 = new DeepLinkSpec("Verify Magic Link", "/verify/$magic_link_token", ClientRouteSpec.verifyMagicLink);
        verifyMagicLink_verifyMagicLink = deepLinkSpec122;
        DeepLinkSpec deepLinkSpec123 = new DeepLinkSpec("Verify Plaid OAuth", "/oauth2/authorization/plaid$oauth_params", ClientRouteSpec.verifyPlaidOauth);
        verifyPlaidOauth_verifyPlaidOauth = deepLinkSpec123;
        DeepLinkSpec deepLinkSpec124 = new DeepLinkSpec("Launch Activate Cash Card", "/launch/cash-card/activate/$activation_code", ClientRouteSpec.viewActivateCashCard);
        viewActivateCashCard_launchActivateCashCard = deepLinkSpec124;
        DeepLinkSpec deepLinkSpec125 = new DeepLinkSpec("Launch Activity Receipt On Request", "/launch/activity/receipt/$activity_get_request", ClientRouteSpec.viewActivityReceiptOnRequest);
        viewActivityReceiptOnRequest_launchActivityReceiptOnRequest = deepLinkSpec125;
        DeepLinkSpec deepLinkSpec126 = new DeepLinkSpec("Launch Activity Receipt On Request V2", "/launch/activity/receipt-v2/$route_parameters", ClientRouteSpec.viewActivityReceiptOnRequestV2);
        viewActivityReceiptOnRequestV2_launchActivityReceiptOnRequestV2 = deepLinkSpec126;
        DeepLinkSpec deepLinkSpec127 = new DeepLinkSpec("Launch Activity Search", "/launch/activity/search/$query", ClientRouteSpec.viewActivitySearch);
        viewActivitySearch_launchActivitySearch = deepLinkSpec127;
        DeepLinkSpec deepLinkSpec128 = new DeepLinkSpec("Launch Afterpay Applet Order", "/launch/afterpay-applet/order", ClientRouteSpec.viewAfterpayAppletOrder);
        viewAfterpayAppletOrder_launchAfterpayAppletOrder = deepLinkSpec128;
        DeepLinkSpec deepLinkSpec129 = new DeepLinkSpec("Launch Afterpay Applet Search", "/launch/afterpay-applet/search", ClientRouteSpec.viewAfterpayAppletSearch);
        viewAfterpayAppletSearch_launchAfterpayAppletSearch = deepLinkSpec129;
        DeepLinkSpec deepLinkSpec130 = new DeepLinkSpec("Launch Afterpay In App Browser v2", "/launch/afterpay-merchant/$base64_encoded_merchant_info", ClientRouteSpec.viewAfterpayInAppBrowserV2);
        viewAfterpayInAppBrowserV2_launchAfterpayInAppBrowserV2 = deepLinkSpec130;
        DeepLinkSpec deepLinkSpec131 = new DeepLinkSpec("Launch Afterpay Merchant Sheet", "/launch/afterpay-applet/sheet/$merchant_token", ClientRouteSpec.viewAfterpayMerchantSheet);
        viewAfterpayMerchantSheet_launchAfterpayMerchantSheet = deepLinkSpec131;
        DeepLinkSpec deepLinkSpec132 = new DeepLinkSpec("Launch Afterpay Order Details", "/launch/afterpay-order-details/$order_id", ClientRouteSpec.viewAfterpayOrderDetails);
        viewAfterpayOrderDetails_launchAfterpayOrderDetails = deepLinkSpec132;
        DeepLinkSpec deepLinkSpec133 = new DeepLinkSpec("Launch Afterpay Order Document", "/launch/afterpay-order-document/$document_id", ClientRouteSpec.viewAfterpayOrderDocument);
        viewAfterpayOrderDocument_launchAfterpayOrderDocument = deepLinkSpec133;
        DeepLinkSpec deepLinkSpec134 = new DeepLinkSpec("Launch Allow List", "/launch/allow-list/$customer_token", ClientRouteSpec.viewAllowList);
        viewAllowList_launchAllowList = deepLinkSpec134;
        DeepLinkSpec deepLinkSpec135 = new DeepLinkSpec("Launch Balance Home", "/launch/balance-home", ClientRouteSpec.viewBalanceHome);
        viewBalanceHome_launchBalanceHome = deepLinkSpec135;
        DeepLinkSpec deepLinkSpec136 = new DeepLinkSpec("Launch Benefits Leaflet", "/launch/benefits-leaflet", ClientRouteSpec.viewBenefitsLeaflet);
        viewBenefitsLeaflet_launchBenefitsLeaflet = deepLinkSpec136;
        DeepLinkSpec deepLinkSpec137 = new DeepLinkSpec("Launch Bitcoin Invoice", "/launch/bitcoin/$currency$name/$invoice_id", ClientRouteSpec.viewBitcoinInvoice);
        viewBitcoinInvoice_launchBitcoinInvoice = deepLinkSpec137;
        DeepLinkSpec deepLinkSpec138 = new DeepLinkSpec("Launch Booklet", "/launch/booklet/$treehouse_path", ClientRouteSpec.viewBooklet);
        viewBooklet_launchBooklet = deepLinkSpec138;
        DeepLinkSpec deepLinkSpec139 = new DeepLinkSpec("Launch Boost Details", "/launch/boost/$boost_token", ClientRouteSpec.viewBoostDetails);
        viewBoostDetails_launchBoostDetails = deepLinkSpec139;
        DeepLinkSpec deepLinkSpec140 = new DeepLinkSpec("Tap", "/launch/cash-card/ndef/$token", ClientRouteSpec.viewCardNfc);
        viewCardNfc_tap = deepLinkSpec140;
        DeepLinkSpec deepLinkSpec141 = new DeepLinkSpec("iMessage No Account", "/imessage/noAccount", ClientRouteSpec.viewClaimPayment);
        viewClaimPayment_imessageNoAccount = deepLinkSpec141;
        ClientRouteSpec clientRouteSpec10 = ClientRouteSpec.viewConfirmDeposit;
        DeepLinkSpec deepLinkSpec142 = new DeepLinkSpec("Deposit Long", "/deposit/$token", clientRouteSpec10);
        viewConfirmDeposit_depositLong = deepLinkSpec142;
        DeepLinkSpec deepLinkSpec143 = new DeepLinkSpec("Deposit Short", "/d/$token", clientRouteSpec10);
        viewConfirmDeposit_depositShort = deepLinkSpec143;
        DeepLinkSpec deepLinkSpec144 = new DeepLinkSpec("Customer Investing Profile For Cashtag", "/launch/profile/$currency$name/invest", ClientRouteSpec.viewCustomerInvestingProfileForCashtag);
        viewCustomerInvestingProfileForCashtag_customerInvestingProfileForCashtag = deepLinkSpec144;
        DeepLinkSpec deepLinkSpec145 = new DeepLinkSpec("Pay Cashtag", "/$currency$name", ClientRouteSpec.viewCustomerProfileCashtag);
        viewCustomerProfileCashtag_payCashtag = deepLinkSpec145;
        DeepLinkSpec deepLinkSpec146 = new DeepLinkSpec("View Customer Profile By Cashtag", "/launch/cashtag/$currency$name", ClientRouteSpec.viewCustomerProfileUsingCashtag);
        viewCustomerProfileUsingCashtag_viewCustomerProfileByCashtag = deepLinkSpec146;
        DeepLinkSpec deepLinkSpec147 = new DeepLinkSpec("Launch Dependent", "/launch/dependent/$customer_token", ClientRouteSpec.viewDependent);
        viewDependent_launchDependent = deepLinkSpec147;
        DeepLinkSpec deepLinkSpec148 = new DeepLinkSpec("Launch Dependent Controls", "/launch/dependent-controls/$customer_token/$display_name", ClientRouteSpec.viewDependentControls);
        viewDependentControls_launchDependentControls = deepLinkSpec148;
        DeepLinkSpec deepLinkSpec149 = new DeepLinkSpec("Launch DetailsPage", "/launch/details_page/$template_token/$version", ClientRouteSpec.viewDetailsPage);
        viewDetailsPage_launchDetailspage = deepLinkSpec149;
        DeepLinkSpec deepLinkSpec150 = new DeepLinkSpec("Direct Deposit Form", "/launch/documents/direct-deposit-form/$document_token", ClientRouteSpec.viewDirectDepositForm);
        viewDirectDepositForm_directDepositForm = deepLinkSpec150;
        DeepLinkSpec deepLinkSpec151 = new DeepLinkSpec("Direct Deposit NUX", "/launch/direct-deposit-nux", ClientRouteSpec.viewDirectDepositNuxDeprecated);
        viewDirectDepositNuxDeprecated_directDepositNux = deepLinkSpec151;
        DeepLinkSpec deepLinkSpec152 = new DeepLinkSpec("Document Afterpay Monthly Statement", "/documents/afterpay_monthly_statement/$token", ClientRouteSpec.viewDocumentAfterpayMonthlyStatement);
        viewDocumentAfterpayMonthlyStatement_documentAfterpayMonthlyStatement = deepLinkSpec152;
        ClientRouteSpec clientRouteSpec11 = ClientRouteSpec.viewDocumentBtcTaxForm;
        DeepLinkSpec deepLinkSpec153 = new DeepLinkSpec("Document BTC Tax Form", "/documents/btc_tax_form/$key", clientRouteSpec11);
        viewDocumentBtcTaxForm_documentBtcTaxForm = deepLinkSpec153;
        DeepLinkSpec deepLinkSpec154 = new DeepLinkSpec("Launch Document BTC Tax Form", "/launch/documents/btc_tax_form/$key", clientRouteSpec11);
        viewDocumentBtcTaxForm_launchDocumentBtcTaxForm = deepLinkSpec154;
        DeepLinkSpec deepLinkSpec155 = new DeepLinkSpec("Document Banking Monthly Statement", "/documents/banking_monthly_statement/$token", ClientRouteSpec.viewDocumentBankingMonthlyStatement);
        viewDocumentBankingMonthlyStatement_documentBankingMonthlyStatement = deepLinkSpec155;
        DeepLinkSpec deepLinkSpec156 = new DeepLinkSpec("Document Category", "/launch/documents/category/$category", ClientRouteSpec.viewDocumentCategory);
        viewDocumentCategory_documentCategory = deepLinkSpec156;
        DeepLinkSpec deepLinkSpec157 = new DeepLinkSpec("Document Savings Tax Form", "/documents/savings_tax_form/$key", ClientRouteSpec.viewDocumentSavingsTaxForm);
        viewDocumentSavingsTaxForm_documentSavingsTaxForm = deepLinkSpec157;
        DeepLinkSpec deepLinkSpec158 = new DeepLinkSpec("Document Stock Monthly Statement", "/documents/stock_monthly_statement/$key", ClientRouteSpec.viewDocumentStockMonthlyStatement);
        viewDocumentStockMonthlyStatement_documentStockMonthlyStatement = deepLinkSpec158;
        DeepLinkSpec deepLinkSpec159 = new DeepLinkSpec("Document Stock Tax Form", "/documents/stock_tax_form/$key", ClientRouteSpec.viewDocumentStockTaxForm);
        viewDocumentStockTaxForm_documentStockTaxForm = deepLinkSpec159;
        DeepLinkSpec deepLinkSpec160 = new DeepLinkSpec("Launch Earnings Tracker With Params", "/launch/earnings-tracker/$encoded_earnings_notice_params", ClientRouteSpec.viewEarningsTrackerWithParams);
        viewEarningsTrackerWithParams_launchEarningsTrackerWithParams = deepLinkSpec160;
        DeepLinkSpec deepLinkSpec161 = new DeepLinkSpec("View Equity", "/launch/equity/$entity_token", ClientRouteSpec.viewEquity);
        viewEquity_viewEquity = deepLinkSpec161;
        DeepLinkSpec deepLinkSpec162 = new DeepLinkSpec("Launch Safety Education Hub Page", "/launch/family-safety-education-hub-page/$page_id", ClientRouteSpec.viewFamilySafetyEducationHubPage);
        viewFamilySafetyEducationHubPage_launchSafetyEducationHubPage = deepLinkSpec162;
        DeepLinkSpec deepLinkSpec163 = new DeepLinkSpec("Genie Scene", "/scene/$scene_slug", ClientRouteSpec.viewGenieScene);
        viewGenieScene_genieScene = deepLinkSpec163;
        DeepLinkSpec deepLinkSpec164 = new DeepLinkSpec("Launch View Initiate Deposit Reversal", "/launch/bitcoin/deposit_reversal/$token/$type", ClientRouteSpec.viewInitiateBitcoinDepositReversal);
        viewInitiateBitcoinDepositReversal_launchViewInitiateDepositReversal = deepLinkSpec164;
        DeepLinkSpec deepLinkSpec165 = new DeepLinkSpec("Launch International Payment", "/launch/international_payment", ClientRouteSpec.viewInternationalPaymentStart);
        viewInternationalPaymentStart_launchInternationalPayment = deepLinkSpec165;
        DeepLinkSpec deepLinkSpec166 = new DeepLinkSpec("View Listing", "/$currency$name/listing/$listing_token", ClientRouteSpec.viewListing);
        viewListing_viewListing = deepLinkSpec166;
        DeepLinkSpec deepLinkSpec167 = new DeepLinkSpec("View Local Brand Checkout With Cashtag", "/$currency$name/checkout/$cart_token", ClientRouteSpec.viewLocalBrandCheckoutWithCashtag);
        viewLocalBrandCheckoutWithCashtag_viewLocalBrandCheckoutWithCashtag = deepLinkSpec167;
        DeepLinkSpec deepLinkSpec168 = new DeepLinkSpec("View Local Brand Profile", "/launch/local/profile/brand/$brand_token/location/$location_token", ClientRouteSpec.viewLocalBrandProfile);
        viewLocalBrandProfile_viewLocalBrandProfile = deepLinkSpec168;
        DeepLinkSpec deepLinkSpec169 = new DeepLinkSpec("View Local Brand Profile QR Ordering", "/$currency$name/l/$location_token/in-store/$in_store_ordering_token", ClientRouteSpec.viewLocalBrandProfileQrOrdering);
        viewLocalBrandProfileQrOrdering_viewLocalBrandProfileQrOrdering = deepLinkSpec169;
        DeepLinkSpec deepLinkSpec170 = new DeepLinkSpec("View Local Brand Profile Shortlink", "/l/$brand_short_token/p/$location_short_token/$attribution_key", ClientRouteSpec.viewLocalBrandProfileShortlink);
        viewLocalBrandProfileShortlink_viewLocalBrandProfileShortlink = deepLinkSpec170;
        DeepLinkSpec deepLinkSpec171 = new DeepLinkSpec("View Local Brand Profile With Cashtag and Location Slug", "/$currency$name/l/$location_slug", ClientRouteSpec.viewLocalBrandProfileWithCashtagAndLocationSlug);
        viewLocalBrandProfileWithCashtagAndLocationSlug_viewLocalBrandProfileWithCashtagAndLocationSlug = deepLinkSpec171;
        DeepLinkSpec deepLinkSpec172 = new DeepLinkSpec("View Local Brand Profile With Default Location", "/l/$brand_short_token/pd/$attribution_key", ClientRouteSpec.viewLocalBrandProfileWithDefaultLocation);
        viewLocalBrandProfileWithDefaultLocation_viewLocalBrandProfileWithDefaultLocation = deepLinkSpec172;
        DeepLinkSpec deepLinkSpec173 = new DeepLinkSpec("View Local Editorial", "/l/$editorial_token/e/$attribution_key", ClientRouteSpec.viewLocalEditorial);
        viewLocalEditorial_viewLocalEditorial = deepLinkSpec173;
        DeepLinkSpec deepLinkSpec174 = new DeepLinkSpec("View Local Marketing Message", "/l/$brand_token/mm/$message_token/$attribution_key", ClientRouteSpec.viewLocalMarketingMessage);
        viewLocalMarketingMessage_viewLocalMarketingMessage = deepLinkSpec174;
        DeepLinkSpec deepLinkSpec175 = new DeepLinkSpec("View Local Menu Shortlink", "/l/$brand_short_token/m/$location_short_token/$attribution_key", ClientRouteSpec.viewLocalMenuShortlink);
        viewLocalMenuShortlink_viewLocalMenuShortlink = deepLinkSpec175;
        DeepLinkSpec deepLinkSpec176 = new DeepLinkSpec("View Local Order Shortlink", "/l/$brand_short_token/o/$order_short_token/$attribution_key", ClientRouteSpec.viewLocalOrderShortlink);
        viewLocalOrderShortlink_viewLocalOrderShortlink = deepLinkSpec176;
        DeepLinkSpec deepLinkSpec177 = new DeepLinkSpec("View Local Order Status From Local Home", "/launch/home/order/$order_token/$attribution_key", ClientRouteSpec.viewLocalOrderStatusFromLocalHome);
        viewLocalOrderStatusFromLocalHome_viewLocalOrderStatusFromLocalHome = deepLinkSpec177;
        ClientRouteSpec clientRouteSpec12 = ClientRouteSpec.viewLocalShortlink;
        DeepLinkSpec deepLinkSpec178 = new DeepLinkSpec("View Local Shortlink", "/l/$shortlink_key", clientRouteSpec12);
        viewLocalShortlink_viewLocalShortlink = deepLinkSpec178;
        DeepLinkSpec deepLinkSpec179 = new DeepLinkSpec("View Local In Store Order Shortlink", "/order/in-store/$shortlink_key", clientRouteSpec12);
        viewLocalShortlink_viewLocalInStoreOrderShortlink = deepLinkSpec179;
        DeepLinkSpec deepLinkSpec180 = new DeepLinkSpec("Launch Brand Profile", "/launch/view/profile/brand/$merchant_or_brand_token/$generic_elements_context", ClientRouteSpec.viewMerchantProfile);
        viewMerchantProfile_launchBrandProfile = deepLinkSpec180;
        DeepLinkSpec deepLinkSpec181 = new DeepLinkSpec("Launch Brand Profile", "/launch/view/profile/brand/$merchant_or_brand_token/$generic_elements_context/$gte_sheet_context", ClientRouteSpec.viewMerchantProfileOpenBottomSheet);
        viewMerchantProfileOpenBottomSheet_launchBrandProfile = deepLinkSpec181;
        DeepLinkSpec deepLinkSpec182 = new DeepLinkSpec("Launch Money Booklet", "/launch/money/booklet/$booklet_token", ClientRouteSpec.viewMoneyBooklet);
        viewMoneyBooklet_launchMoneyBooklet = deepLinkSpec182;
        DeepLinkSpec deepLinkSpec183 = new DeepLinkSpec("Launch Moneybot Resume Chat", "/launch/moneybot/resume/$session_id", ClientRouteSpec.viewMoneybotResumeChat);
        viewMoneybotResumeChat_launchMoneybotResumeChat = deepLinkSpec183;
        DeepLinkSpec deepLinkSpec184 = new DeepLinkSpec("Launch Offer Details Sheet", "/launch/offers/details/$offer_type/$offer_token", ClientRouteSpec.viewOfferDetailsSheet);
        viewOfferDetailsSheet_launchOfferDetailsSheet = deepLinkSpec184;
        DeepLinkSpec deepLinkSpec185 = new DeepLinkSpec("Launch Offer Details Sheet By Merchant", "/launch/offers/details/$offer_type/merchant/$merchant_token", ClientRouteSpec.viewOfferDetailsSheetByMerchant);
        viewOfferDetailsSheetByMerchant_launchOfferDetailsSheetByMerchant = deepLinkSpec185;
        DeepLinkSpec deepLinkSpec186 = new DeepLinkSpec("Launch Offer Details Sheet With Single Use Payment Token", "/launch/offers/details/$offer_type/$offer_token/$sup_token", ClientRouteSpec.viewOfferDetailsSheetWithSingleUsePaymentTokenDeprecated);
        viewOfferDetailsSheetWithSingleUsePaymentTokenDeprecated_launchOfferDetailsSheetWithSingleUsePaymentToken = deepLinkSpec186;
        DeepLinkSpec deepLinkSpec187 = new DeepLinkSpec("View Offers Collection", "/launch/offers/collection/$collection_token", ClientRouteSpec.viewOffersCollection);
        viewOffersCollection_viewOffersCollection = deepLinkSpec187;
        DeepLinkSpec deepLinkSpec188 = new DeepLinkSpec("Pay Cashtag", "/$currency$name/$amount", ClientRouteSpec.viewPayCashtagAmount);
        viewPayCashtagAmount_payCashtag = deepLinkSpec188;
        DeepLinkSpec deepLinkSpec189 = new DeepLinkSpec("Pay Cashtag Note", "/$currency$name/$amount/note/$base64InitiatorNote", ClientRouteSpec.viewPayCashtagAmountNote);
        viewPayCashtagAmountNote_payCashtagNote = deepLinkSpec189;
        DeepLinkSpec deepLinkSpec190 = new DeepLinkSpec("Pay Link", "/pay/link/$token", ClientRouteSpec.viewPayLink);
        viewPayLink_payLink = deepLinkSpec190;
        DeepLinkSpec deepLinkSpec191 = new DeepLinkSpec("Pay With Options", "/launch/pay-with-options", ClientRouteSpec.viewPayWithOptions);
        viewPayWithOptions_payWithOptions = deepLinkSpec191;
        DeepLinkSpec deepLinkSpec192 = new DeepLinkSpec("Payment", "/p/$payment_token", ClientRouteSpec.viewPaymentDetails);
        viewPaymentDetails_payment = deepLinkSpec192;
        DeepLinkSpec deepLinkSpec193 = new DeepLinkSpec("View Payment Personalization", "/launch/personalization", ClientRouteSpec.viewPaymentPersonalization);
        viewPaymentPersonalization_viewPaymentPersonalization = deepLinkSpec193;
        DeepLinkSpec deepLinkSpec194 = new DeepLinkSpec("View Payment Personalization Send", "/launch/send-personalization-payment", ClientRouteSpec.viewPaymentPersonalizationSend);
        viewPaymentPersonalizationSend_viewPaymentPersonalizationSend = deepLinkSpec194;
        DeepLinkSpec deepLinkSpec195 = new DeepLinkSpec("Launch pool details", "/launch/view/pools/$pool_token/$origin", ClientRouteSpec.viewPoolDetails);
        viewPoolDetails_launchPoolDetails = deepLinkSpec195;
        DeepLinkSpec deepLinkSpec196 = new DeepLinkSpec("Launch pool details", "/launch/view/pools_list/$origin", ClientRouteSpec.viewPoolsList);
        viewPoolsList_launchPoolDetails = deepLinkSpec196;
        DeepLinkSpec deepLinkSpec197 = new DeepLinkSpec("Launch Promotion Details", "/launch/promotion_details/$details_page_token", ClientRouteSpec.viewPromotionDetails);
        viewPromotionDetails_launchPromotionDetails = deepLinkSpec197;
        DeepLinkSpec deepLinkSpec198 = new DeepLinkSpec("Request Cashtag", "/request/$currency$name/$amount", ClientRouteSpec.viewRequestCashtagAmount);
        viewRequestCashtagAmount_requestCashtag = deepLinkSpec198;
        DeepLinkSpec deepLinkSpec199 = new DeepLinkSpec("Request Cashtag Note", "/request/$currency$name/$amount/note/$base64InitiatorNote", ClientRouteSpec.viewRequestCashtagAmountNote);
        viewRequestCashtagAmountNote_requestCashtagNote = deepLinkSpec199;
        DeepLinkSpec deepLinkSpec200 = new DeepLinkSpec("Banking Cash Card", "/banking/cash-card/$styleIdentifier", ClientRouteSpec.viewRequestPhysicalCashCard);
        viewRequestPhysicalCashCard_bankingCashCard = deepLinkSpec200;
        DeepLinkSpec deepLinkSpec201 = new DeepLinkSpec("Request With Options", "/launch/request-with-options", ClientRouteSpec.viewRequestWithOptions);
        viewRequestWithOptions_requestWithOptions = deepLinkSpec201;
        DeepLinkSpec deepLinkSpec202 = new DeepLinkSpec("Widget Savings", "/widget/savings/home", ClientRouteSpec.viewSavingsHome);
        viewSavingsHome_widgetSavings = deepLinkSpec202;
        DeepLinkSpec deepLinkSpec203 = new DeepLinkSpec("Launch Shifts Clockin", "/launch/shifts/clockin", ClientRouteSpec.viewShiftsClockIn);
        viewShiftsClockIn_launchShiftsClockin = deepLinkSpec203;
        DeepLinkSpec deepLinkSpec204 = new DeepLinkSpec("Launch Shifts Schedule", "/launch/shifts/schedule", ClientRouteSpec.viewShiftsSchedule);
        viewShiftsSchedule_launchShiftsSchedule = deepLinkSpec204;
        DeepLinkSpec deepLinkSpec205 = new DeepLinkSpec("Launch Shifts Timecards", "/launch/shifts/timecards", ClientRouteSpec.viewShiftsTimecards);
        viewShiftsTimecards_launchShiftsTimecards = deepLinkSpec205;
        DeepLinkSpec deepLinkSpec206 = new DeepLinkSpec("Launch Dynamic Shop Hub", "/launch/shop/dynamic-screen", ClientRouteSpec.viewShopDynamicScreen);
        viewShopDynamicScreen_launchDynamicShopHub = deepLinkSpec206;
        DeepLinkSpec deepLinkSpec207 = new DeepLinkSpec("Launch Dynamic Shop Hub Search", "/launch/shop/dynamic-screen/search", ClientRouteSpec.viewShopDynamicScreenSearch);
        viewShopDynamicScreenSearch_launchDynamicShopHubSearch = deepLinkSpec207;
        DeepLinkSpec deepLinkSpec208 = new DeepLinkSpec("Launch Support Chat From Moneybot", "/launch/support/chat/from-moneybot", ClientRouteSpec.viewSupportChatFromMoneybot);
        viewSupportChatFromMoneybot_launchSupportChatFromMoneybot = deepLinkSpec208;
        DeepLinkSpec deepLinkSpec209 = new DeepLinkSpec("Launch Support Node", "/launch/support/$support_node_token", ClientRouteSpec.viewSupportNode);
        viewSupportNode_launchSupportNode = deepLinkSpec209;
        DeepLinkSpec deepLinkSpec210 = new DeepLinkSpec("Launch Taxes Web App", "/launch/tax/hub/$taxes_deep_link", ClientRouteSpec.viewTaxesHubWithDeepLink);
        viewTaxesHubWithDeepLink_launchTaxesWebApp = deepLinkSpec210;
        DeepLinkSpec deepLinkSpec211 = new DeepLinkSpec("Launch Taxes Web App", "/launch/taxes/$taxes_deep_link", ClientRouteSpec.viewTaxesWebApp);
        viewTaxesWebApp_launchTaxesWebApp = deepLinkSpec211;
        allSpecs = CollectionsKt__CollectionsKt.listOf((Object[]) new DeepLinkSpec[]{deepLinkSpec, deepLinkSpec2, deepLinkSpec3, deepLinkSpec4, deepLinkSpec5, deepLinkSpec6, deepLinkSpec7, deepLinkSpec8, deepLinkSpec9, deepLinkSpec10, deepLinkSpec11, deepLinkSpec12, deepLinkSpec13, deepLinkSpec14, deepLinkSpec15, deepLinkSpec16, deepLinkSpec17, deepLinkSpec18, deepLinkSpec19, deepLinkSpec20, deepLinkSpec21, deepLinkSpec22, deepLinkSpec23, deepLinkSpec24, deepLinkSpec25, deepLinkSpec26, deepLinkSpec27, deepLinkSpec28, deepLinkSpec29, deepLinkSpec30, deepLinkSpec31, deepLinkSpec32, deepLinkSpec33, deepLinkSpec34, deepLinkSpec35, deepLinkSpec36, deepLinkSpec37, deepLinkSpec38, deepLinkSpec39, deepLinkSpec40, deepLinkSpec41, deepLinkSpec42, deepLinkSpec43, deepLinkSpec44, deepLinkSpec45, deepLinkSpec46, deepLinkSpec47, deepLinkSpec48, deepLinkSpec49, deepLinkSpec50, deepLinkSpec51, deepLinkSpec52, deepLinkSpec53, deepLinkSpec54, deepLinkSpec55, deepLinkSpec56, deepLinkSpec57, deepLinkSpec58, deepLinkSpec59, deepLinkSpec60, deepLinkSpec61, deepLinkSpec62, deepLinkSpec63, deepLinkSpec64, deepLinkSpec65, deepLinkSpec66, deepLinkSpec67, deepLinkSpec68, deepLinkSpec69, deepLinkSpec70, deepLinkSpec71, deepLinkSpec72, deepLinkSpec73, deepLinkSpec74, deepLinkSpec75, deepLinkSpec76, deepLinkSpec77, deepLinkSpec78, deepLinkSpec79, deepLinkSpec80, deepLinkSpec81, deepLinkSpec82, deepLinkSpec83, deepLinkSpec84, deepLinkSpec85, deepLinkSpec86, deepLinkSpec87, deepLinkSpec88, deepLinkSpec89, deepLinkSpec90, deepLinkSpec91, deepLinkSpec92, deepLinkSpec93, deepLinkSpec94, deepLinkSpec95, deepLinkSpec96, deepLinkSpec97, deepLinkSpec98, deepLinkSpec99, deepLinkSpec100, deepLinkSpec101, deepLinkSpec102, deepLinkSpec103, deepLinkSpec104, deepLinkSpec105, deepLinkSpec106, deepLinkSpec107, deepLinkSpec108, deepLinkSpec109, deepLinkSpec110, deepLinkSpec111, deepLinkSpec112, deepLinkSpec113, deepLinkSpec114, deepLinkSpec115, deepLinkSpec116, deepLinkSpec117, deepLinkSpec118, deepLinkSpec119, deepLinkSpec120, deepLinkSpec121, deepLinkSpec122, deepLinkSpec123, deepLinkSpec124, deepLinkSpec125, deepLinkSpec126, deepLinkSpec127, deepLinkSpec128, deepLinkSpec129, deepLinkSpec130, deepLinkSpec131, deepLinkSpec132, deepLinkSpec133, deepLinkSpec134, deepLinkSpec135, deepLinkSpec136, deepLinkSpec137, deepLinkSpec138, deepLinkSpec139, deepLinkSpec140, deepLinkSpec141, deepLinkSpec142, deepLinkSpec143, deepLinkSpec144, deepLinkSpec145, deepLinkSpec146, deepLinkSpec147, deepLinkSpec148, deepLinkSpec149, deepLinkSpec150, deepLinkSpec151, deepLinkSpec152, deepLinkSpec153, deepLinkSpec154, deepLinkSpec155, deepLinkSpec156, deepLinkSpec157, deepLinkSpec158, deepLinkSpec159, deepLinkSpec160, deepLinkSpec161, deepLinkSpec162, deepLinkSpec163, deepLinkSpec164, deepLinkSpec165, deepLinkSpec166, deepLinkSpec167, deepLinkSpec168, deepLinkSpec169, deepLinkSpec170, deepLinkSpec171, deepLinkSpec172, deepLinkSpec173, deepLinkSpec174, deepLinkSpec175, deepLinkSpec176, deepLinkSpec177, deepLinkSpec178, deepLinkSpec179, deepLinkSpec180, deepLinkSpec181, deepLinkSpec182, deepLinkSpec183, deepLinkSpec184, deepLinkSpec185, deepLinkSpec186, deepLinkSpec187, deepLinkSpec188, deepLinkSpec189, deepLinkSpec190, deepLinkSpec191, deepLinkSpec192, deepLinkSpec193, deepLinkSpec194, deepLinkSpec195, deepLinkSpec196, deepLinkSpec197, deepLinkSpec198, deepLinkSpec199, deepLinkSpec200, deepLinkSpec201, deepLinkSpec202, deepLinkSpec203, deepLinkSpec204, deepLinkSpec205, deepLinkSpec206, deepLinkSpec207, deepLinkSpec208, deepLinkSpec209, deepLinkSpec210, deepLinkSpec211});
    }

    public DeepLinkSpec(String str, String str2, ClientRouteSpec clientRouteSpec) {
        str.getClass();
        str2.getClass();
        clientRouteSpec.getClass();
        this.name = str;
        this.pathFormat = str2;
        this.clientRouteSpec = clientRouteSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkSpec)) {
            return false;
        }
        DeepLinkSpec deepLinkSpec = (DeepLinkSpec) obj;
        return Intrinsics.areEqual(this.name, deepLinkSpec.name) && Intrinsics.areEqual(this.pathFormat, deepLinkSpec.pathFormat) && Intrinsics.areEqual(this.clientRouteSpec, deepLinkSpec.clientRouteSpec);
    }

    public final ClientRouteSpec getClientRouteSpec() {
        return this.clientRouteSpec;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPathFormat() {
        return this.pathFormat;
    }

    public final int hashCode() {
        return this.clientRouteSpec.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.pathFormat);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeepLinkSpec(name=", this.name, ", pathFormat=", this.pathFormat, ", clientRouteSpec=");
        m.append(this.clientRouteSpec);
        m.append(")");
        return m.toString();
    }
}
