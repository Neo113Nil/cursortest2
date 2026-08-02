package com.google.android.gms.internal.mlkit_vision_face;

import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRouteSpec;

/* loaded from: classes4.dex */
public abstract class zzjo {
    public static ViewEvent.Accessibility fromJsonObject(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("text_size");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("screen_reader_enabled");
            Boolean valueOf = jsonElement2 != null ? Boolean.valueOf(jsonElement2.getAsBoolean()) : null;
            JsonElement jsonElement3 = jsonObject.get("bold_text_enabled");
            Boolean valueOf2 = jsonElement3 != null ? Boolean.valueOf(jsonElement3.getAsBoolean()) : null;
            JsonElement jsonElement4 = jsonObject.get("reduce_transparency_enabled");
            Boolean valueOf3 = jsonElement4 != null ? Boolean.valueOf(jsonElement4.getAsBoolean()) : null;
            JsonElement jsonElement5 = jsonObject.get("reduce_motion_enabled");
            Boolean valueOf4 = jsonElement5 != null ? Boolean.valueOf(jsonElement5.getAsBoolean()) : null;
            JsonElement jsonElement6 = jsonObject.get("button_shapes_enabled");
            Boolean valueOf5 = jsonElement6 != null ? Boolean.valueOf(jsonElement6.getAsBoolean()) : null;
            JsonElement jsonElement7 = jsonObject.get("invert_colors_enabled");
            Boolean valueOf6 = jsonElement7 != null ? Boolean.valueOf(jsonElement7.getAsBoolean()) : null;
            JsonElement jsonElement8 = jsonObject.get("increase_contrast_enabled");
            Boolean valueOf7 = jsonElement8 != null ? Boolean.valueOf(jsonElement8.getAsBoolean()) : null;
            JsonElement jsonElement9 = jsonObject.get("assistive_switch_enabled");
            Boolean valueOf8 = jsonElement9 != null ? Boolean.valueOf(jsonElement9.getAsBoolean()) : null;
            JsonElement jsonElement10 = jsonObject.get("assistive_touch_enabled");
            Boolean valueOf9 = jsonElement10 != null ? Boolean.valueOf(jsonElement10.getAsBoolean()) : null;
            JsonElement jsonElement11 = jsonObject.get("video_autoplay_enabled");
            Boolean valueOf10 = jsonElement11 != null ? Boolean.valueOf(jsonElement11.getAsBoolean()) : null;
            JsonElement jsonElement12 = jsonObject.get("closed_captioning_enabled");
            Boolean valueOf11 = jsonElement12 != null ? Boolean.valueOf(jsonElement12.getAsBoolean()) : null;
            JsonElement jsonElement13 = jsonObject.get("mono_audio_enabled");
            Boolean valueOf12 = jsonElement13 != null ? Boolean.valueOf(jsonElement13.getAsBoolean()) : null;
            JsonElement jsonElement14 = jsonObject.get("shake_to_undo_enabled");
            Boolean valueOf13 = jsonElement14 != null ? Boolean.valueOf(jsonElement14.getAsBoolean()) : null;
            JsonElement jsonElement15 = jsonObject.get("reduced_animations_enabled");
            Boolean valueOf14 = jsonElement15 != null ? Boolean.valueOf(jsonElement15.getAsBoolean()) : null;
            JsonElement jsonElement16 = jsonObject.get("should_differentiate_without_color");
            Boolean valueOf15 = jsonElement16 != null ? Boolean.valueOf(jsonElement16.getAsBoolean()) : null;
            JsonElement jsonElement17 = jsonObject.get("grayscale_enabled");
            Boolean valueOf16 = jsonElement17 != null ? Boolean.valueOf(jsonElement17.getAsBoolean()) : null;
            JsonElement jsonElement18 = jsonObject.get("single_app_mode_enabled");
            Boolean valueOf17 = jsonElement18 != null ? Boolean.valueOf(jsonElement18.getAsBoolean()) : null;
            JsonElement jsonElement19 = jsonObject.get("on_off_switch_labels_enabled");
            Boolean valueOf18 = jsonElement19 != null ? Boolean.valueOf(jsonElement19.getAsBoolean()) : null;
            JsonElement jsonElement20 = jsonObject.get("speak_screen_enabled");
            Boolean valueOf19 = jsonElement20 != null ? Boolean.valueOf(jsonElement20.getAsBoolean()) : null;
            JsonElement jsonElement21 = jsonObject.get("speak_selection_enabled");
            Boolean valueOf20 = jsonElement21 != null ? Boolean.valueOf(jsonElement21.getAsBoolean()) : null;
            JsonElement jsonElement22 = jsonObject.get("rtl_enabled");
            return new ViewEvent.Accessibility(asString, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, jsonElement22 != null ? Boolean.valueOf(jsonElement22.getAsBoolean()) : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Accessibility", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Accessibility", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Accessibility", e3);
            return null;
        }
    }

    public static ClientRouteSpec getCashInReview() {
        return ClientRouteSpec.cashInReview;
    }

    public static ClientRouteSpec getClientScenario() {
        return ClientRouteSpec.clientScenario;
    }

    public static ClientRouteSpec getCollectGpsLocationData() {
        return ClientRouteSpec.collectGpsLocationData;
    }

    public static ClientRouteSpec getCompleteScenario() {
        return ClientRouteSpec.completeScenario;
    }

    public static ClientRouteSpec getDeactivateTag() {
        return ClientRouteSpec.deactivateTag;
    }

    public static ClientRouteSpec getDeprecatedCashAppPaySandbox() {
        return ClientRouteSpec.deprecatedCashAppPaySandbox;
    }

    public static ClientRouteSpec getDeprecatedUpdateDiscover() {
        return ClientRouteSpec.deprecatedUpdateDiscover;
    }

    public static ClientRouteSpec getDeprecatedViewActivityThread() {
        return ClientRouteSpec.deprecatedViewActivityThread;
    }

    public static ClientRouteSpec getDeprecatedViewAddress() {
        return ClientRouteSpec.deprecatedViewAddress;
    }

    public static ClientRouteSpec getDeprecatedViewAutoSelectBoost() {
        return ClientRouteSpec.deprecatedViewAutoSelectBoost;
    }

    public static ClientRouteSpec getDeprecatedViewBankingDetails() {
        return ClientRouteSpec.deprecatedViewBankingDetails;
    }

    public static ClientRouteSpec getDeprecatedViewBoostDetailsByMerchant() {
        return ClientRouteSpec.deprecatedViewBoostDetailsByMerchant;
    }

    public static ClientRouteSpec getDeprecatedViewBoostInBoostPicker() {
        return ClientRouteSpec.deprecatedViewBoostInBoostPicker;
    }

    public static ClientRouteSpec getDeprecatedViewBoostsPicker() {
        return ClientRouteSpec.deprecatedViewBoostsPicker;
    }

    public static ClientRouteSpec getDeprecatedViewBusinessProfile() {
        return ClientRouteSpec.deprecatedViewBusinessProfile;
    }

    public static ClientRouteSpec getDeprecatedViewCancelPendingSingleUsePayment() {
        return ClientRouteSpec.deprecatedViewCancelPendingSingleUsePayment;
    }

    public static ClientRouteSpec getDeprecatedViewCashAppPayOfferInAppBrowser() {
        return ClientRouteSpec.deprecatedViewCashAppPayOfferInAppBrowser;
    }

    public static ClientRouteSpec getDeprecatedViewCashAppPayOfferInAppBrowserV2() {
        return ClientRouteSpec.deprecatedViewCashAppPayOfferInAppBrowserV2;
    }

    public static ClientRouteSpec getDeprecatedViewCustomerProfileEmail() {
        return ClientRouteSpec.deprecatedViewCustomerProfileEmail;
    }

    public static ClientRouteSpec getDeprecatedViewCustomerProfileSms() {
        return ClientRouteSpec.deprecatedViewCustomerProfileSms;
    }

    public static ClientRouteSpec getDeprecatedViewEarningsTracker() {
        return ClientRouteSpec.deprecatedViewEarningsTracker;
    }

    public static ClientRouteSpec getDeprecatedViewGiftCardStore() {
        return ClientRouteSpec.deprecatedViewGiftCardStore;
    }

    public static ClientRouteSpec getDeprecatedViewGroupDetails() {
        return ClientRouteSpec.deprecatedViewGroupDetails;
    }

    public static ClientRouteSpec getDeprecatedViewGroupExpense() {
        return ClientRouteSpec.deprecatedViewGroupExpense;
    }

    public static ClientRouteSpec getDeprecatedViewGroups() {
        return ClientRouteSpec.deprecatedViewGroups;
    }

    public static ClientRouteSpec getDeprecatedViewLocalBrandCollection() {
        return ClientRouteSpec.deprecatedViewLocalBrandCollection;
    }

    public static ClientRouteSpec getDeprecatedViewLoyalty() {
        return ClientRouteSpec.deprecatedViewLoyalty;
    }

    public static ClientRouteSpec getDeprecatedViewLoyaltyProgram() {
        return ClientRouteSpec.deprecatedViewLoyaltyProgram;
    }

    public static ClientRouteSpec getDeprecatedViewLoyaltyReward() {
        return ClientRouteSpec.deprecatedViewLoyaltyReward;
    }

    public static ClientRouteSpec getDeprecatedViewMyMoney() {
        return ClientRouteSpec.deprecatedViewMyMoney;
    }

    public static ClientRouteSpec getDeprecatedViewOffersSheet() {
        return ClientRouteSpec.deprecatedViewOffersSheet;
    }

    public static ClientRouteSpec getDeprecatedViewPayEmail() {
        return ClientRouteSpec.deprecatedViewPayEmail;
    }

    public static ClientRouteSpec getDeprecatedViewPaySms() {
        return ClientRouteSpec.deprecatedViewPaySms;
    }

    public static ClientRouteSpec getDeprecatedViewPrepurchaseAfterpayApplet() {
        return ClientRouteSpec.deprecatedViewPrepurchaseAfterpayApplet;
    }

    public static ClientRouteSpec getDeprecatedViewProfileSwitcherToRerouteDestination() {
        return ClientRouteSpec.deprecatedViewProfileSwitcherToRerouteDestination;
    }

    public static ClientRouteSpec getDeprecatedViewReviewPrompt() {
        return ClientRouteSpec.deprecatedViewReviewPrompt;
    }

    public static ClientRouteSpec getDeprecatedViewSavingsAddCash() {
        return ClientRouteSpec.deprecatedViewSavingsAddCash;
    }

    public static ClientRouteSpec getDeprecatedViewSettings() {
        return ClientRouteSpec.deprecatedViewSettings;
    }

    public static ClientRouteSpec getDeprecatedViewShopCategory() {
        return ClientRouteSpec.deprecatedViewShopCategory;
    }

    public static ClientRouteSpec getDeprecatedViewShopHub() {
        return ClientRouteSpec.deprecatedViewShopHub;
    }

    public static ClientRouteSpec getDeprecatedViewShopInfo() {
        return ClientRouteSpec.deprecatedViewShopInfo;
    }

    public static ClientRouteSpec getDeprecatedViewShopSearch() {
        return ClientRouteSpec.deprecatedViewShopSearch;
    }

    public static ClientRouteSpec getDeprecatedViewSingleUsePaymentMerchant() {
        return ClientRouteSpec.deprecatedViewSingleUsePaymentMerchant;
    }

    public static ClientRouteSpec getDeprecatedViewSquareOfferSheet() {
        return ClientRouteSpec.deprecatedViewSquareOfferSheet;
    }

    public static ClientRouteSpec getDeprecatedViewSquareOnlineShopping() {
        return ClientRouteSpec.deprecatedViewSquareOnlineShopping;
    }

    public static ClientRouteSpec getDeviceLocationConsent() {
        return ClientRouteSpec.deviceLocationConsent;
    }

    public static ClientRouteSpec getFlow() {
        return ClientRouteSpec.flow;
    }

    public static ClientRouteSpec getFlowHalfSheet() {
        return ClientRouteSpec.flowHalfSheet;
    }

    public static ClientRouteSpec getFlowType() {
        return ClientRouteSpec.flowType;
    }

    public static ClientRouteSpec getGetAppMessageByToken() {
        return ClientRouteSpec.getAppMessageByToken;
    }

    public static ClientRouteSpec getInitiateBitcoinPartnerAction() {
        return ClientRouteSpec.initiateBitcoinPartnerAction;
    }

    public static ClientRouteSpec getInitiateBitcoinTransferDeprecated() {
        return ClientRouteSpec.initiateBitcoinTransferDeprecated;
    }

    public static ClientRouteSpec getInitiateBitkeyAutoWithdraw() {
        return ClientRouteSpec.initiateBitkeyAutoWithdraw;
    }

    public static ClientRouteSpec getInitiateDirectDepositManualForm() {
        return ClientRouteSpec.initiateDirectDepositManualForm;
    }

    public static ClientRouteSpec getInitiateSingleUsePayment() {
        return ClientRouteSpec.initiateSingleUsePayment;
    }

    public static ClientRouteSpec getInternalBenchmarking() {
        return ClientRouteSpec.internalBenchmarking;
    }

    public static ClientRouteSpec getInvestingFlow() {
        return ClientRouteSpec.investingFlow;
    }

    public static ClientRouteSpec getJoinGameTrivia() {
        return ClientRouteSpec.joinGameTrivia;
    }

    public static ClientRouteSpec getNoOperation() {
        return ClientRouteSpec.noOperation;
    }

    public static ClientRouteSpec getNoOperationWithCallback() {
        return ClientRouteSpec.noOperationWithCallback;
    }

    public static ClientRouteSpec getNoOperationWithPathParameter() {
        return ClientRouteSpec.noOperationWithPathParameter;
    }

    public static ClientRouteSpec getNoOperationWithPromptIfNeededAccount() {
        return ClientRouteSpec.noOperationWithPromptIfNeededAccount;
    }

    public static ClientRouteSpec getNoOperationWithQueryParameter() {
        return ClientRouteSpec.noOperationWithQueryParameter;
    }

    public static ClientRouteSpec getNoOperationWithRequiredAccount() {
        return ClientRouteSpec.noOperationWithRequiredAccount;
    }

    public static ClientRouteSpec getPayLightningInvoice() {
        return ClientRouteSpec.payLightningInvoice;
    }

    public static ClientRouteSpec getPreauthedCompleteScenario() {
        return ClientRouteSpec.preauthedCompleteScenario;
    }

    public static ClientRouteSpec getProcessNextLocalAutoDisplayShortlink() {
        return ClientRouteSpec.processNextLocalAutoDisplayShortlink;
    }

    public static ClientRouteSpec getRefreshAllAppMessagesInBackground() {
        return ClientRouteSpec.refreshAllAppMessagesInBackground;
    }

    public static ClientRouteSpec getRefreshBitcoinInvoice() {
        return ClientRouteSpec.refreshBitcoinInvoice;
    }

    public static ClientRouteSpec getRefreshWeaverRecommendationsInBackground() {
        return ClientRouteSpec.refreshWeaverRecommendationsInBackground;
    }

    public static ClientRouteSpec getRemoveAllAppMessagesInBackground() {
        return ClientRouteSpec.removeAllAppMessagesInBackground;
    }

    public static ClientRouteSpec getRemoveAppMessageByTokenInBackground() {
        return ClientRouteSpec.removeAppMessageByTokenInBackground;
    }

    public static ClientRouteSpec getRemoveAppMessageInBackground() {
        return ClientRouteSpec.removeAppMessageInBackground;
    }

    public static ClientRouteSpec getRemoveApplePayCard() {
        return ClientRouteSpec.removeApplePayCard;
    }

    public static ClientRouteSpec getRequestContactsPermission() {
        return ClientRouteSpec.requestContactsPermission;
    }

    public static ClientRouteSpec getRequestReviewPrompt() {
        return ClientRouteSpec.requestReviewPrompt;
    }

    public static ClientRouteSpec getSelectEquity() {
        return ClientRouteSpec.selectEquity;
    }

    public static ClientRouteSpec getSelectP2pFiatPaymentInstrument() {
        return ClientRouteSpec.selectP2pFiatPaymentInstrument;
    }

    public static ClientRouteSpec getSerializedFlow() {
        return ClientRouteSpec.serializedFlow;
    }

    public static ClientRouteSpec getSessionReplayRecord() {
        return ClientRouteSpec.sessionReplayRecord;
    }

    public static ClientRouteSpec getShareText() {
        return ClientRouteSpec.shareText;
    }

    public static ClientRouteSpec getSquareStaffSwitchAccount() {
        return ClientRouteSpec.squareStaffSwitchAccount;
    }

    public static ClientRouteSpec getSwitchAccount() {
        return ClientRouteSpec.switchAccount;
    }

    public static ClientRouteSpec getSwitchAccountFromFlow() {
        return ClientRouteSpec.switchAccountFromFlow;
    }

    public static ClientRouteSpec getSwitchToManagedAccount() {
        return ClientRouteSpec.switchToManagedAccount;
    }

    public static ClientRouteSpec getSwitchToPrincipalAccount() {
        return ClientRouteSpec.switchToPrincipalAccount;
    }

    public static ClientRouteSpec getTreehouseApp() {
        return ClientRouteSpec.treehouseApp;
    }

    public static ClientRouteSpec getTreehouseAppLink() {
        return ClientRouteSpec.treehouseAppLink;
    }

    public static ClientRouteSpec getUpdateAfterpayApplet() {
        return ClientRouteSpec.updateAfterpayApplet;
    }

    public static ClientRouteSpec getUpdateOffers() {
        return ClientRouteSpec.updateOffers;
    }

    public static ClientRouteSpec getVerifyEmail() {
        return ClientRouteSpec.verifyEmail;
    }

    public static ClientRouteSpec getVerifyMagicLink() {
        return ClientRouteSpec.verifyMagicLink;
    }

    public static ClientRouteSpec getVerifyPlaidOauth() {
        return ClientRouteSpec.verifyPlaidOauth;
    }

    public static ClientRouteSpec getVerifyStripeRedirect() {
        return ClientRouteSpec.verifyStripeRedirect;
    }

    public static ClientRouteSpec getViewAccountStatus() {
        return ClientRouteSpec.viewAccountStatus;
    }

    public static ClientRouteSpec getViewActivateCashCard() {
        return ClientRouteSpec.viewActivateCashCard;
    }

    public static ClientRouteSpec getViewActivity() {
        return ClientRouteSpec.viewActivity;
    }

    public static ClientRouteSpec getViewActivityReceiptOnRequest() {
        return ClientRouteSpec.viewActivityReceiptOnRequest;
    }

    public static ClientRouteSpec getViewActivityReceiptOnRequestV2() {
        return ClientRouteSpec.viewActivityReceiptOnRequestV2;
    }

    public static ClientRouteSpec getViewActivitySearch() {
        return ClientRouteSpec.viewActivitySearch;
    }

    public static ClientRouteSpec getViewAddCash() {
        return ClientRouteSpec.viewAddCash;
    }

    public static ClientRouteSpec getViewAddCashAmount() {
        return ClientRouteSpec.viewAddCashAmount;
    }

    public static ClientRouteSpec getViewAddCashAmountDigitalWallet() {
        return ClientRouteSpec.viewAddCashAmountDigitalWallet;
    }

    public static ClientRouteSpec getViewAddCashAmountWithInstrument() {
        return ClientRouteSpec.viewAddCashAmountWithInstrument;
    }

    public static ClientRouteSpec getViewAddCashHalfSheet() {
        return ClientRouteSpec.viewAddCashHalfSheet;
    }

    public static ClientRouteSpec getViewAddCashHalfSheetWithEntry() {
        return ClientRouteSpec.viewAddCashHalfSheetWithEntry;
    }

    public static ClientRouteSpec getViewAddCashKeypad() {
        return ClientRouteSpec.viewAddCashKeypad;
    }

    public static ClientRouteSpec getViewAddFavorites() {
        return ClientRouteSpec.viewAddFavorites;
    }

    public static ClientRouteSpec getViewAddMoneyBottomSheet() {
        return ClientRouteSpec.viewAddMoneyBottomSheet;
    }

    public static ClientRouteSpec getViewAddMoneyWithParams() {
        return ClientRouteSpec.viewAddMoneyWithParams;
    }

    public static ClientRouteSpec getViewAddToDigitalWallet() {
        return ClientRouteSpec.viewAddToDigitalWallet;
    }

    public static ClientRouteSpec getViewAfterpayAppletHome() {
        return ClientRouteSpec.viewAfterpayAppletHome;
    }

    public static ClientRouteSpec getViewAfterpayAppletOrder() {
        return ClientRouteSpec.viewAfterpayAppletOrder;
    }

    public static ClientRouteSpec getViewAfterpayAppletPurchases() {
        return ClientRouteSpec.viewAfterpayAppletPurchases;
    }

    public static ClientRouteSpec getViewAfterpayAppletRetroOrderSelection() {
        return ClientRouteSpec.viewAfterpayAppletRetroOrderSelection;
    }

    public static ClientRouteSpec getViewAfterpayAppletSearch() {
        return ClientRouteSpec.viewAfterpayAppletSearch;
    }

    public static ClientRouteSpec getViewAfterpayHub() {
        return ClientRouteSpec.viewAfterpayHub;
    }

    public static ClientRouteSpec getViewAfterpayInAppBrowser() {
        return ClientRouteSpec.viewAfterpayInAppBrowser;
    }

    public static ClientRouteSpec getViewAfterpayInAppBrowserV2() {
        return ClientRouteSpec.viewAfterpayInAppBrowserV2;
    }

    public static ClientRouteSpec getViewAfterpayMerchantSheet() {
        return ClientRouteSpec.viewAfterpayMerchantSheet;
    }

    public static ClientRouteSpec getViewAfterpayOrderDetails() {
        return ClientRouteSpec.viewAfterpayOrderDetails;
    }

    public static ClientRouteSpec getViewAfterpayOrderDocument() {
        return ClientRouteSpec.viewAfterpayOrderDocument;
    }

    public static ClientRouteSpec getViewAllowCustomerSearch() {
        return ClientRouteSpec.viewAllowCustomerSearch;
    }

    public static ClientRouteSpec getViewAllowList() {
        return ClientRouteSpec.viewAllowList;
    }

    public static ClientRouteSpec getViewAppMessage() {
        return ClientRouteSpec.viewAppMessage;
    }

    public static ClientRouteSpec getViewAppStoreUpdate() {
        return ClientRouteSpec.viewAppStoreUpdate;
    }

    public static ClientRouteSpec getViewAtmWithdrawalMap() {
        return ClientRouteSpec.viewAtmWithdrawalMap;
    }

    public static ClientRouteSpec getViewAutoAddCash() {
        return ClientRouteSpec.viewAutoAddCash;
    }

    public static ClientRouteSpec getViewBalance() {
        return ClientRouteSpec.viewBalance;
    }

    public static ClientRouteSpec getViewBalanceAddCash() {
        return ClientRouteSpec.viewBalanceAddCash;
    }

    public static ClientRouteSpec getViewBalanceHome() {
        return ClientRouteSpec.viewBalanceHome;
    }

    public static ClientRouteSpec getViewBankTransferSetup() {
        return ClientRouteSpec.viewBankTransferSetup;
    }

    public static ClientRouteSpec getViewBenefitsBooklet() {
        return ClientRouteSpec.viewBenefitsBooklet;
    }

    public static ClientRouteSpec getViewBenefitsHome() {
        return ClientRouteSpec.viewBenefitsHome;
    }

    public static ClientRouteSpec getViewBenefitsHub() {
        return ClientRouteSpec.viewBenefitsHub;
    }

    public static ClientRouteSpec getViewBenefitsLeaflet() {
        return ClientRouteSpec.viewBenefitsLeaflet;
    }

    public static ClientRouteSpec getViewBills() {
        return ClientRouteSpec.viewBills;
    }

    public static ClientRouteSpec getViewBillsSearch() {
        return ClientRouteSpec.viewBillsSearch;
    }

    public static ClientRouteSpec getViewBillsSubscriptionsHome() {
        return ClientRouteSpec.viewBillsSubscriptionsHome;
    }

    public static ClientRouteSpec getViewBillsSubscriptionsMerchantList() {
        return ClientRouteSpec.viewBillsSubscriptionsMerchantList;
    }

    public static ClientRouteSpec getViewBitcoin() {
        return ClientRouteSpec.viewBitcoin;
    }

    public static ClientRouteSpec getViewBitcoinAutoInvest() {
        return ClientRouteSpec.viewBitcoinAutoInvest;
    }

    public static ClientRouteSpec getViewBitcoinBuy() {
        return ClientRouteSpec.viewBitcoinBuy;
    }

    public static ClientRouteSpec getViewBitcoinBuyWithParams() {
        return ClientRouteSpec.viewBitcoinBuyWithParams;
    }

    public static ClientRouteSpec getViewBitcoinDeposit() {
        return ClientRouteSpec.viewBitcoinDeposit;
    }

    public static ClientRouteSpec getViewBitcoinInvoice() {
        return ClientRouteSpec.viewBitcoinInvoice;
    }

    public static ClientRouteSpec getViewBitcoinLightningDeposit() {
        return ClientRouteSpec.viewBitcoinLightningDeposit;
    }

    public static ClientRouteSpec getViewBitcoinMap() {
        return ClientRouteSpec.viewBitcoinMap;
    }

    public static ClientRouteSpec getViewBitcoinReward() {
        return ClientRouteSpec.viewBitcoinReward;
    }

    public static ClientRouteSpec getViewBitcoinSell() {
        return ClientRouteSpec.viewBitcoinSell;
    }

    public static ClientRouteSpec getViewBitcoinUri() {
        return ClientRouteSpec.viewBitcoinUri;
    }

    public static ClientRouteSpec getViewBlockCustomer() {
        return ClientRouteSpec.viewBlockCustomer;
    }

    public static ClientRouteSpec getViewBlockList() {
        return ClientRouteSpec.viewBlockList;
    }

    public static ClientRouteSpec getViewBnplLoan() {
        return ClientRouteSpec.viewBnplLoan;
    }

    public static ClientRouteSpec getViewBooklet() {
        return ClientRouteSpec.viewBooklet;
    }

    public static ClientRouteSpec getViewBoostDetails() {
        return ClientRouteSpec.viewBoostDetails;
    }

    public static ClientRouteSpec getViewBoostPicker() {
        return ClientRouteSpec.viewBoostPicker;
    }

    public static ClientRouteSpec getViewBorrowAccessDeprecated() {
        return ClientRouteSpec.viewBorrowAccessDeprecated;
    }

    public static ClientRouteSpec getViewBorrowAmountPicker() {
        return ClientRouteSpec.viewBorrowAmountPicker;
    }

    public static ClientRouteSpec getViewBorrowAmountPickerDeprecated() {
        return ClientRouteSpec.viewBorrowAmountPickerDeprecated;
    }

    public static ClientRouteSpec getViewBorrowApplet() {
        return ClientRouteSpec.viewBorrowApplet;
    }

    public static ClientRouteSpec getViewBorrowBenefitsLeaflet() {
        return ClientRouteSpec.viewBorrowBenefitsLeaflet;
    }

    public static ClientRouteSpec getViewBorrowBulletin() {
        return ClientRouteSpec.viewBorrowBulletin;
    }

    public static ClientRouteSpec getViewBorrowCreditLimit() {
        return ClientRouteSpec.viewBorrowCreditLimit;
    }

    public static ClientRouteSpec getViewBorrowDeprecated() {
        return ClientRouteSpec.viewBorrowDeprecated;
    }

    public static ClientRouteSpec getViewBorrowFirstTimeFlowDeprecated() {
        return ClientRouteSpec.viewBorrowFirstTimeFlowDeprecated;
    }

    public static ClientRouteSpec getViewBorrowLanding() {
        return ClientRouteSpec.viewBorrowLanding;
    }

    public static ClientRouteSpec getViewBorrowLimitHub() {
        return ClientRouteSpec.viewBorrowLimitHub;
    }

    public static ClientRouteSpec getViewBorrowLimitHubBulletinInfo() {
        return ClientRouteSpec.viewBorrowLimitHubBulletinInfo;
    }

    public static ClientRouteSpec getViewBorrowLoadCreditLimitDeprecated() {
        return ClientRouteSpec.viewBorrowLoadCreditLimitDeprecated;
    }

    public static ClientRouteSpec getViewBorrowRepay() {
        return ClientRouteSpec.viewBorrowRepay;
    }

    public static ClientRouteSpec getViewBorrowRepayCustomAmount() {
        return ClientRouteSpec.viewBorrowRepayCustomAmount;
    }

    public static ClientRouteSpec getViewCard() {
        return ClientRouteSpec.viewCard;
    }

    public static ClientRouteSpec getViewCardBlockedBusinesses() {
        return ClientRouteSpec.viewCardBlockedBusinesses;
    }

    public static ClientRouteSpec getViewCardMerchantInfoFeedback() {
        return ClientRouteSpec.viewCardMerchantInfoFeedback;
    }

    public static ClientRouteSpec getViewCardMerchantInfoFeedbackWithAddress() {
        return ClientRouteSpec.viewCardMerchantInfoFeedbackWithAddress;
    }

    public static ClientRouteSpec getViewCardNfc() {
        return ClientRouteSpec.viewCardNfc;
    }

    public static ClientRouteSpec getViewCardSpendingInsight() {
        return ClientRouteSpec.viewCardSpendingInsight;
    }

    public static ClientRouteSpec getViewCardSpendingInsightsHome() {
        return ClientRouteSpec.viewCardSpendingInsightsHome;
    }

    public static ClientRouteSpec getViewCardSpendingRecurringPaymentsInfo() {
        return ClientRouteSpec.viewCardSpendingRecurringPaymentsInfo;
    }

    public static ClientRouteSpec getViewCashAppScore() {
        return ClientRouteSpec.viewCashAppScore;
    }

    public static ClientRouteSpec getViewCashBalance() {
        return ClientRouteSpec.viewCashBalance;
    }

    public static ClientRouteSpec getViewCashCardStylePicker() {
        return ClientRouteSpec.viewCashCardStylePicker;
    }

    public static ClientRouteSpec getViewCashOfferInAppBrowser() {
        return ClientRouteSpec.viewCashOfferInAppBrowser;
    }

    public static ClientRouteSpec getViewCashOut() {
        return ClientRouteSpec.viewCashOut;
    }

    public static ClientRouteSpec getViewCashOutAmount() {
        return ClientRouteSpec.viewCashOutAmount;
    }

    public static ClientRouteSpec getViewCashOutAmountWithInstrument() {
        return ClientRouteSpec.viewCashOutAmountWithInstrument;
    }

    public static ClientRouteSpec getViewChangeCardDesign() {
        return ClientRouteSpec.viewChangeCardDesign;
    }

    public static ClientRouteSpec getViewChatForRecipient() {
        return ClientRouteSpec.viewChatForRecipient;
    }

    public static ClientRouteSpec getViewClaimPayment() {
        return ClientRouteSpec.viewClaimPayment;
    }

    public static ClientRouteSpec getViewConfirmDeposit() {
        return ClientRouteSpec.viewConfirmDeposit;
    }

    public static ClientRouteSpec getViewContactSupport() {
        return ClientRouteSpec.viewContactSupport;
    }

    public static ClientRouteSpec getViewContinueApplePay() {
        return ClientRouteSpec.viewContinueApplePay;
    }

    public static ClientRouteSpec getViewCreatePoolNote() {
        return ClientRouteSpec.viewCreatePoolNote;
    }

    public static ClientRouteSpec getViewCustomerInvestingProfile() {
        return ClientRouteSpec.viewCustomerInvestingProfile;
    }

    public static ClientRouteSpec getViewCustomerInvestingProfileForCashtag() {
        return ClientRouteSpec.viewCustomerInvestingProfileForCashtag;
    }

    public static ClientRouteSpec getViewCustomerProfile() {
        return ClientRouteSpec.viewCustomerProfile;
    }

    public static ClientRouteSpec getViewCustomerProfileCashtag() {
        return ClientRouteSpec.viewCustomerProfileCashtag;
    }

    public static ClientRouteSpec getViewCustomerProfileEmail() {
        return ClientRouteSpec.viewCustomerProfileEmail;
    }

    public static ClientRouteSpec getViewCustomerProfileLoyaltyDetails() {
        return ClientRouteSpec.viewCustomerProfileLoyaltyDetails;
    }

    public static ClientRouteSpec getViewCustomerProfileSms() {
        return ClientRouteSpec.viewCustomerProfileSms;
    }

    public static ClientRouteSpec getViewCustomerProfileUsingCashtag() {
        return ClientRouteSpec.viewCustomerProfileUsingCashtag;
    }

    public static ClientRouteSpec getViewCustomerProfileWithButtonsConfig() {
        return ClientRouteSpec.viewCustomerProfileWithButtonsConfig;
    }

    public static ClientRouteSpec getViewDependent() {
        return ClientRouteSpec.viewDependent;
    }

    public static ClientRouteSpec getViewDependentControls() {
        return ClientRouteSpec.viewDependentControls;
    }

    public static ClientRouteSpec getViewDependentPayWithParams() {
        return ClientRouteSpec.viewDependentPayWithParams;
    }

    public static ClientRouteSpec getViewDependentSavingsGeneralFolder() {
        return ClientRouteSpec.viewDependentSavingsGeneralFolder;
    }

    public static ClientRouteSpec getViewDependentSavingsGoal() {
        return ClientRouteSpec.viewDependentSavingsGoal;
    }

    public static ClientRouteSpec getViewDependentSavingsHome() {
        return ClientRouteSpec.viewDependentSavingsHome;
    }

    public static ClientRouteSpec getViewDependentWithParams() {
        return ClientRouteSpec.viewDependentWithParams;
    }

    public static ClientRouteSpec getViewDetailsPage() {
        return ClientRouteSpec.viewDetailsPage;
    }

    public static ClientRouteSpec getViewDeviceManager() {
        return ClientRouteSpec.viewDeviceManager;
    }

    public static ClientRouteSpec getViewDeviceManagerDeviceDetails() {
        return ClientRouteSpec.viewDeviceManagerDeviceDetails;
    }

    public static ClientRouteSpec getViewDirectDepositAccount() {
        return ClientRouteSpec.viewDirectDepositAccount;
    }

    public static ClientRouteSpec getViewDirectDepositForm() {
        return ClientRouteSpec.viewDirectDepositForm;
    }

    public static ClientRouteSpec getViewDirectDepositNuxDeprecated() {
        return ClientRouteSpec.viewDirectDepositNuxDeprecated;
    }

    public static ClientRouteSpec getViewDirectDepositSetup() {
        return ClientRouteSpec.viewDirectDepositSetup;
    }

    public static ClientRouteSpec getViewDirectDepositSetupWithStatusRedirect() {
        return ClientRouteSpec.viewDirectDepositSetupWithStatusRedirect;
    }

    public static ClientRouteSpec getViewDirectDepositSetupWithoutNuxDeprecated() {
        return ClientRouteSpec.viewDirectDepositSetupWithoutNuxDeprecated;
    }

    public static ClientRouteSpec getViewDocumentAfterpayMonthlyStatement() {
        return ClientRouteSpec.viewDocumentAfterpayMonthlyStatement;
    }

    public static ClientRouteSpec getViewDocumentAfterpayStatements() {
        return ClientRouteSpec.viewDocumentAfterpayStatements;
    }

    public static ClientRouteSpec getViewDocumentAllBtcTaxForms() {
        return ClientRouteSpec.viewDocumentAllBtcTaxForms;
    }

    public static ClientRouteSpec getViewDocumentAllSavingsTaxForms() {
        return ClientRouteSpec.viewDocumentAllSavingsTaxForms;
    }

    public static ClientRouteSpec getViewDocumentBankingMonthlyStatement() {
        return ClientRouteSpec.viewDocumentBankingMonthlyStatement;
    }

    public static ClientRouteSpec getViewDocumentBankingStatements() {
        return ClientRouteSpec.viewDocumentBankingStatements;
    }

    public static ClientRouteSpec getViewDocumentBtcTaxForm() {
        return ClientRouteSpec.viewDocumentBtcTaxForm;
    }

    public static ClientRouteSpec getViewDocumentCategory() {
        return ClientRouteSpec.viewDocumentCategory;
    }

    public static ClientRouteSpec getViewDocumentSavingsTaxForm() {
        return ClientRouteSpec.viewDocumentSavingsTaxForm;
    }

    public static ClientRouteSpec getViewDocumentStock() {
        return ClientRouteSpec.viewDocumentStock;
    }

    public static ClientRouteSpec getViewDocumentStockMonthlyStatement() {
        return ClientRouteSpec.viewDocumentStockMonthlyStatement;
    }

    public static ClientRouteSpec getViewDocumentStockMonthlyStatementList() {
        return ClientRouteSpec.viewDocumentStockMonthlyStatementList;
    }

    public static ClientRouteSpec getViewDocumentStockTaxForm() {
        return ClientRouteSpec.viewDocumentStockTaxForm;
    }

    public static ClientRouteSpec getViewDocumentStockTaxFormList() {
        return ClientRouteSpec.viewDocumentStockTaxFormList;
    }

    public static ClientRouteSpec getViewDocuments() {
        return ClientRouteSpec.viewDocuments;
    }

    public static ClientRouteSpec getViewDraftPayment() {
        return ClientRouteSpec.viewDraftPayment;
    }

    public static ClientRouteSpec getViewEarnerCustomerTagging() {
        return ClientRouteSpec.viewEarnerCustomerTagging;
    }

    public static ClientRouteSpec getViewEarnerCustomerTaggingWithToken() {
        return ClientRouteSpec.viewEarnerCustomerTaggingWithToken;
    }

    public static ClientRouteSpec getViewEarningsActivity() {
        return ClientRouteSpec.viewEarningsActivity;
    }

    public static ClientRouteSpec getViewEarningsActivityForStream() {
        return ClientRouteSpec.viewEarningsActivityForStream;
    }

    public static ClientRouteSpec getViewEarningsHome() {
        return ClientRouteSpec.viewEarningsHome;
    }

    public static ClientRouteSpec getViewEarningsStreamDetail() {
        return ClientRouteSpec.viewEarningsStreamDetail;
    }

    public static ClientRouteSpec getViewEarningsTrackerWithParams() {
        return ClientRouteSpec.viewEarningsTrackerWithParams;
    }

    public static ClientRouteSpec getViewEditProfile() {
        return ClientRouteSpec.viewEditProfile;
    }

    public static ClientRouteSpec getViewEquities() {
        return ClientRouteSpec.viewEquities;
    }

    public static ClientRouteSpec getViewEquity() {
        return ClientRouteSpec.viewEquity;
    }

    public static ClientRouteSpec getViewExternalMapApplication() {
        return ClientRouteSpec.viewExternalMapApplication;
    }

    public static ClientRouteSpec getViewFamilyAccountSponsor() {
        return ClientRouteSpec.viewFamilyAccountSponsor;
    }

    public static ClientRouteSpec getViewFamilyAccounts() {
        return ClientRouteSpec.viewFamilyAccounts;
    }

    public static ClientRouteSpec getViewFamilyHome() {
        return ClientRouteSpec.viewFamilyHome;
    }

    public static ClientRouteSpec getViewFamilyHomeForNewDependent() {
        return ClientRouteSpec.viewFamilyHomeForNewDependent;
    }

    public static ClientRouteSpec getViewFamilyPendingInvitations() {
        return ClientRouteSpec.viewFamilyPendingInvitations;
    }

    public static ClientRouteSpec getViewFamilyPendingRequests() {
        return ClientRouteSpec.viewFamilyPendingRequests;
    }

    public static ClientRouteSpec getViewFamilyPendingRequestsWithoutParams() {
        return ClientRouteSpec.viewFamilyPendingRequestsWithoutParams;
    }

    public static ClientRouteSpec getViewFamilySafetyEducationHub() {
        return ClientRouteSpec.viewFamilySafetyEducationHub;
    }

    public static ClientRouteSpec getViewFamilySafetyEducationHubPage() {
        return ClientRouteSpec.viewFamilySafetyEducationHubPage;
    }

    public static ClientRouteSpec getViewFavorites() {
        return ClientRouteSpec.viewFavorites;
    }

    public static ClientRouteSpec getViewFullScreenAd() {
        return ClientRouteSpec.viewFullScreenAd;
    }

    public static ClientRouteSpec getViewGenieScene() {
        return ClientRouteSpec.viewGenieScene;
    }

    public static ClientRouteSpec getViewGiftBitcoinDeprecated() {
        return ClientRouteSpec.viewGiftBitcoinDeprecated;
    }

    public static ClientRouteSpec getViewGiftStocks() {
        return ClientRouteSpec.viewGiftStocks;
    }

    public static ClientRouteSpec getViewIncomingRequestsSettings() {
        return ClientRouteSpec.viewIncomingRequestsSettings;
    }

    public static ClientRouteSpec getViewInitiateBitcoinDepositReversal() {
        return ClientRouteSpec.viewInitiateBitcoinDepositReversal;
    }

    public static ClientRouteSpec getViewInternationalPaymentStart() {
        return ClientRouteSpec.viewInternationalPaymentStart;
    }

    public static ClientRouteSpec getViewInvesting() {
        return ClientRouteSpec.viewInvesting;
    }

    public static ClientRouteSpec getViewInvestingCategory() {
        return ClientRouteSpec.viewInvestingCategory;
    }

    public static ClientRouteSpec getViewInvestingContactSettings() {
        return ClientRouteSpec.viewInvestingContactSettings;
    }

    public static ClientRouteSpec getViewInvestingDividendReinvestmentSettings() {
        return ClientRouteSpec.viewInvestingDividendReinvestmentSettings;
    }

    public static ClientRouteSpec getViewInvestingRoundups() {
        return ClientRouteSpec.viewInvestingRoundups;
    }

    public static ClientRouteSpec getViewInvestingRoundupsFailedConfirmation() {
        return ClientRouteSpec.viewInvestingRoundupsFailedConfirmation;
    }

    public static ClientRouteSpec getViewInvestingRoundupsOnboarding() {
        return ClientRouteSpec.viewInvestingRoundupsOnboarding;
    }

    public static ClientRouteSpec getViewInvestingRoundupsPayments() {
        return ClientRouteSpec.viewInvestingRoundupsPayments;
    }

    public static ClientRouteSpec getViewInvestingRoundupsSkippedConfirmation() {
        return ClientRouteSpec.viewInvestingRoundupsSkippedConfirmation;
    }

    public static ClientRouteSpec getViewInviteFriends() {
        return ClientRouteSpec.viewInviteFriends;
    }

    public static ClientRouteSpec getViewKnotMerchantList() {
        return ClientRouteSpec.viewKnotMerchantList;
    }

    public static ClientRouteSpec getViewLightningUri() {
        return ClientRouteSpec.viewLightningUri;
    }

    public static ClientRouteSpec getViewLimits() {
        return ClientRouteSpec.viewLimits;
    }

    public static ClientRouteSpec getViewLinkBankAccount() {
        return ClientRouteSpec.viewLinkBankAccount;
    }

    public static ClientRouteSpec getViewLinkedBankAccounts() {
        return ClientRouteSpec.viewLinkedBankAccounts;
    }

    public static ClientRouteSpec getViewListing() {
        return ClientRouteSpec.viewListing;
    }

    public static ClientRouteSpec getViewListingCreate() {
        return ClientRouteSpec.viewListingCreate;
    }

    public static ClientRouteSpec getViewLoan() {
        return ClientRouteSpec.viewLoan;
    }

    public static ClientRouteSpec getViewLoanRepayDeprecated() {
        return ClientRouteSpec.viewLoanRepayDeprecated;
    }

    public static ClientRouteSpec getViewLoanRepayOverdueDeprecated() {
        return ClientRouteSpec.viewLoanRepayOverdueDeprecated;
    }

    public static ClientRouteSpec getViewLoanRepayUpcomingDeprecated() {
        return ClientRouteSpec.viewLoanRepayUpcomingDeprecated;
    }

    public static ClientRouteSpec getViewLocalBrandBrowser() {
        return ClientRouteSpec.viewLocalBrandBrowser;
    }

    public static ClientRouteSpec getViewLocalBrandCard() {
        return ClientRouteSpec.viewLocalBrandCard;
    }

    public static ClientRouteSpec getViewLocalBrandCheckoutWithCashtag() {
        return ClientRouteSpec.viewLocalBrandCheckoutWithCashtag;
    }

    public static ClientRouteSpec getViewLocalBrandProfile() {
        return ClientRouteSpec.viewLocalBrandProfile;
    }

    public static ClientRouteSpec getViewLocalBrandProfileQrOrdering() {
        return ClientRouteSpec.viewLocalBrandProfileQrOrdering;
    }

    public static ClientRouteSpec getViewLocalBrandProfileShortlink() {
        return ClientRouteSpec.viewLocalBrandProfileShortlink;
    }

    public static ClientRouteSpec getViewLocalBrandProfileWithCashtagAndLocationSlug() {
        return ClientRouteSpec.viewLocalBrandProfileWithCashtagAndLocationSlug;
    }

    public static ClientRouteSpec getViewLocalBrandProfileWithDefaultLocation() {
        return ClientRouteSpec.viewLocalBrandProfileWithDefaultLocation;
    }

    public static ClientRouteSpec getViewLocalCashDetail() {
        return ClientRouteSpec.viewLocalCashDetail;
    }

    public static ClientRouteSpec getViewLocalEditorial() {
        return ClientRouteSpec.viewLocalEditorial;
    }

    public static ClientRouteSpec getViewLocalHome() {
        return ClientRouteSpec.viewLocalHome;
    }

    public static ClientRouteSpec getViewLocalHomeForceRefresh() {
        return ClientRouteSpec.viewLocalHomeForceRefresh;
    }

    public static ClientRouteSpec getViewLocalMarketingMessage() {
        return ClientRouteSpec.viewLocalMarketingMessage;
    }

    public static ClientRouteSpec getViewLocalMenuShortlink() {
        return ClientRouteSpec.viewLocalMenuShortlink;
    }

    public static ClientRouteSpec getViewLocalOrderShortlink() {
        return ClientRouteSpec.viewLocalOrderShortlink;
    }

    public static ClientRouteSpec getViewLocalOrderStatus() {
        return ClientRouteSpec.viewLocalOrderStatus;
    }

    public static ClientRouteSpec getViewLocalOrderStatusFromLocalHome() {
        return ClientRouteSpec.viewLocalOrderStatusFromLocalHome;
    }

    public static ClientRouteSpec getViewLocalShortlink() {
        return ClientRouteSpec.viewLocalShortlink;
    }

    public static ClientRouteSpec getViewMerchantProfile() {
        return ClientRouteSpec.viewMerchantProfile;
    }

    public static ClientRouteSpec getViewMerchantProfileOpenBottomSheet() {
        return ClientRouteSpec.viewMerchantProfileOpenBottomSheet;
    }

    public static ClientRouteSpec getViewMoneyBooklet() {
        return ClientRouteSpec.viewMoneyBooklet;
    }

    public static ClientRouteSpec getViewMoneybotChat() {
        return ClientRouteSpec.viewMoneybotChat;
    }

    public static ClientRouteSpec getViewMoneybotResumeChat() {
        return ClientRouteSpec.viewMoneybotResumeChat;
    }

    public static ClientRouteSpec getViewNearbyPayment() {
        return ClientRouteSpec.viewNearbyPayment;
    }

    public static ClientRouteSpec getViewNeighborhoodsCheckInScanner() {
        return ClientRouteSpec.viewNeighborhoodsCheckInScanner;
    }

    public static ClientRouteSpec getViewNeighborhoodsLocalEarningCards() {
        return ClientRouteSpec.viewNeighborhoodsLocalEarningCards;
    }

    public static ClientRouteSpec getViewNeighborhoodsTableQrCodeScanner() {
        return ClientRouteSpec.viewNeighborhoodsTableQrCodeScanner;
    }

    public static ClientRouteSpec getViewNewPaymentRequestToCustomerid() {
        return ClientRouteSpec.viewNewPaymentRequestToCustomerid;
    }

    public static ClientRouteSpec getViewNewPaymentSendToCustomerid() {
        return ClientRouteSpec.viewNewPaymentSendToCustomerid;
    }

    public static ClientRouteSpec getViewNotificationCategoryDetails() {
        return ClientRouteSpec.viewNotificationCategoryDetails;
    }

    public static ClientRouteSpec getViewNotificationPreferences() {
        return ClientRouteSpec.viewNotificationPreferences;
    }

    public static ClientRouteSpec getViewOfferDetails() {
        return ClientRouteSpec.viewOfferDetails;
    }

    public static ClientRouteSpec getViewOfferDetailsSheet() {
        return ClientRouteSpec.viewOfferDetailsSheet;
    }

    public static ClientRouteSpec getViewOfferDetailsSheetByMerchant() {
        return ClientRouteSpec.viewOfferDetailsSheetByMerchant;
    }

    public static ClientRouteSpec getViewOfferDetailsSheetWithSingleUsePaymentTokenDeprecated() {
        return ClientRouteSpec.viewOfferDetailsSheetWithSingleUsePaymentTokenDeprecated;
    }

    public static ClientRouteSpec getViewOffersBrowse() {
        return ClientRouteSpec.viewOffersBrowse;
    }

    public static ClientRouteSpec getViewOffersCollection() {
        return ClientRouteSpec.viewOffersCollection;
    }

    public static ClientRouteSpec getViewOffersSearch() {
        return ClientRouteSpec.viewOffersSearch;
    }

    public static ClientRouteSpec getViewOffersSheetV2() {
        return ClientRouteSpec.viewOffersSheetV2;
    }

    public static ClientRouteSpec getViewOverdraftCoverage() {
        return ClientRouteSpec.viewOverdraftCoverage;
    }

    public static ClientRouteSpec getViewPaperMoney() {
        return ClientRouteSpec.viewPaperMoney;
    }

    public static ClientRouteSpec getViewPasskeyCreation() {
        return ClientRouteSpec.viewPasskeyCreation;
    }

    public static ClientRouteSpec getViewPasskeyManager() {
        return ClientRouteSpec.viewPasskeyManager;
    }

    public static ClientRouteSpec getViewPayCashtag() {
        return ClientRouteSpec.viewPayCashtag;
    }

    public static ClientRouteSpec getViewPayCashtagAmount() {
        return ClientRouteSpec.viewPayCashtagAmount;
    }

    public static ClientRouteSpec getViewPayCashtagAmountNote() {
        return ClientRouteSpec.viewPayCashtagAmountNote;
    }

    public static ClientRouteSpec getViewPayEmail() {
        return ClientRouteSpec.viewPayEmail;
    }

    public static ClientRouteSpec getViewPayLink() {
        return ClientRouteSpec.viewPayLink;
    }

    public static ClientRouteSpec getViewPayProfile() {
        return ClientRouteSpec.viewPayProfile;
    }

    public static ClientRouteSpec getViewPaySms() {
        return ClientRouteSpec.viewPaySms;
    }

    public static ClientRouteSpec getViewPayWithOptions() {
        return ClientRouteSpec.viewPayWithOptions;
    }

    public static ClientRouteSpec getViewPaychecksDistributionSummary() {
        return ClientRouteSpec.viewPaychecksDistributionSummary;
    }

    public static ClientRouteSpec getViewPaychecksHome() {
        return ClientRouteSpec.viewPaychecksHome;
    }

    public static ClientRouteSpec getViewPaymentDetails() {
        return ClientRouteSpec.viewPaymentDetails;
    }

    public static ClientRouteSpec getViewPaymentDetailsReceipt() {
        return ClientRouteSpec.viewPaymentDetailsReceipt;
    }

    public static ClientRouteSpec getViewPaymentPad() {
        return ClientRouteSpec.viewPaymentPad;
    }

    public static ClientRouteSpec getViewPaymentPersonalization() {
        return ClientRouteSpec.viewPaymentPersonalization;
    }

    public static ClientRouteSpec getViewPaymentPersonalizationSend() {
        return ClientRouteSpec.viewPaymentPersonalizationSend;
    }

    public static ClientRouteSpec getViewPendingInvestmentOrderRollupActivity() {
        return ClientRouteSpec.viewPendingInvestmentOrderRollupActivity;
    }

    public static ClientRouteSpec getViewPendingReferralsRollupActivity() {
        return ClientRouteSpec.viewPendingReferralsRollupActivity;
    }

    public static ClientRouteSpec getViewPendingTransactionsRollupActivity() {
        return ClientRouteSpec.viewPendingTransactionsRollupActivity;
    }

    public static ClientRouteSpec getViewPermissionRequest() {
        return ClientRouteSpec.viewPermissionRequest;
    }

    public static ClientRouteSpec getViewPhonePlansHome() {
        return ClientRouteSpec.viewPhonePlansHome;
    }

    public static ClientRouteSpec getViewPin() {
        return ClientRouteSpec.viewPin;
    }

    public static ClientRouteSpec getViewPoolDetails() {
        return ClientRouteSpec.viewPoolDetails;
    }

    public static ClientRouteSpec getViewPoolsList() {
        return ClientRouteSpec.viewPoolsList;
    }

    public static ClientRouteSpec getViewPrepurchaseCashCardApplet() {
        return ClientRouteSpec.viewPrepurchaseCashCardApplet;
    }

    public static ClientRouteSpec getViewPrivacy() {
        return ClientRouteSpec.viewPrivacy;
    }

    public static ClientRouteSpec getViewProfile() {
        return ClientRouteSpec.viewProfile;
    }

    public static ClientRouteSpec getViewProfileDirectory() {
        return ClientRouteSpec.viewProfileDirectory;
    }

    public static ClientRouteSpec getViewProfilePersonal() {
        return ClientRouteSpec.viewProfilePersonal;
    }

    public static ClientRouteSpec getViewProfileSwitcher() {
        return ClientRouteSpec.viewProfileSwitcher;
    }

    public static ClientRouteSpec getViewProfileWithAccountSwitchOnboarding() {
        return ClientRouteSpec.viewProfileWithAccountSwitchOnboarding;
    }

    public static ClientRouteSpec getViewProfileWithParams() {
        return ClientRouteSpec.viewProfileWithParams;
    }

    public static ClientRouteSpec getViewPromotionDetails() {
        return ClientRouteSpec.viewPromotionDetails;
    }

    public static ClientRouteSpec getViewPromotionsHome() {
        return ClientRouteSpec.viewPromotionsHome;
    }

    public static ClientRouteSpec getViewQrCode() {
        return ClientRouteSpec.viewQrCode;
    }

    public static ClientRouteSpec getViewQrCodeScanner() {
        return ClientRouteSpec.viewQrCodeScanner;
    }

    public static ClientRouteSpec getViewRandomReimbursement() {
        return ClientRouteSpec.viewRandomReimbursement;
    }

    public static ClientRouteSpec getViewRecipientChooserAmount() {
        return ClientRouteSpec.viewRecipientChooserAmount;
    }

    public static ClientRouteSpec getViewRecurringDeposits() {
        return ClientRouteSpec.viewRecurringDeposits;
    }

    public static ClientRouteSpec getViewRequestCashtag() {
        return ClientRouteSpec.viewRequestCashtag;
    }

    public static ClientRouteSpec getViewRequestCashtagAmount() {
        return ClientRouteSpec.viewRequestCashtagAmount;
    }

    public static ClientRouteSpec getViewRequestCashtagAmountNote() {
        return ClientRouteSpec.viewRequestCashtagAmountNote;
    }

    public static ClientRouteSpec getViewRequestEmail() {
        return ClientRouteSpec.viewRequestEmail;
    }

    public static ClientRouteSpec getViewRequestPhysicalCashCard() {
        return ClientRouteSpec.viewRequestPhysicalCashCard;
    }

    public static ClientRouteSpec getViewRequestSms() {
        return ClientRouteSpec.viewRequestSms;
    }

    public static ClientRouteSpec getViewRequestWithOptions() {
        return ClientRouteSpec.viewRequestWithOptions;
    }

    public static ClientRouteSpec getViewSavingsGeneralFolder() {
        return ClientRouteSpec.viewSavingsGeneralFolder;
    }

    public static ClientRouteSpec getViewSavingsGoal() {
        return ClientRouteSpec.viewSavingsGoal;
    }

    public static ClientRouteSpec getViewSavingsHome() {
        return ClientRouteSpec.viewSavingsHome;
    }

    public static ClientRouteSpec getViewSavingsHomeWithModalHalfSheet() {
        return ClientRouteSpec.viewSavingsHomeWithModalHalfSheet;
    }

    public static ClientRouteSpec getViewSavingsNuxOrHome() {
        return ClientRouteSpec.viewSavingsNuxOrHome;
    }

    public static ClientRouteSpec getViewScanChecks() {
        return ClientRouteSpec.viewScanChecks;
    }

    public static ClientRouteSpec getViewSearchVisibilitySettings() {
        return ClientRouteSpec.viewSearchVisibilitySettings;
    }

    public static ClientRouteSpec getViewSecurity() {
        return ClientRouteSpec.viewSecurity;
    }

    public static ClientRouteSpec getViewSecurityAndPrivacy() {
        return ClientRouteSpec.viewSecurityAndPrivacy;
    }

    public static ClientRouteSpec getViewSecurityHub() {
        return ClientRouteSpec.viewSecurityHub;
    }

    public static ClientRouteSpec getViewSecurityLockSettings() {
        return ClientRouteSpec.viewSecurityLockSettings;
    }

    public static ClientRouteSpec getViewSendBitcoin() {
        return ClientRouteSpec.viewSendBitcoin;
    }

    public static ClientRouteSpec getViewSetDefaultInstrument() {
        return ClientRouteSpec.viewSetDefaultInstrument;
    }

    public static ClientRouteSpec getViewShiftsClockIn() {
        return ClientRouteSpec.viewShiftsClockIn;
    }

    public static ClientRouteSpec getViewShiftsHome() {
        return ClientRouteSpec.viewShiftsHome;
    }

    public static ClientRouteSpec getViewShiftsSchedule() {
        return ClientRouteSpec.viewShiftsSchedule;
    }

    public static ClientRouteSpec getViewShiftsTimecards() {
        return ClientRouteSpec.viewShiftsTimecards;
    }

    public static ClientRouteSpec getViewShopBrandsSearch() {
        return ClientRouteSpec.viewShopBrandsSearch;
    }

    public static ClientRouteSpec getViewShopDynamicScreen() {
        return ClientRouteSpec.viewShopDynamicScreen;
    }

    public static ClientRouteSpec getViewShopDynamicScreenSearch() {
        return ClientRouteSpec.viewShopDynamicScreenSearch;
    }

    public static ClientRouteSpec getViewShopProductsSearch() {
        return ClientRouteSpec.viewShopProductsSearch;
    }

    public static ClientRouteSpec getViewShopSearchFilters() {
        return ClientRouteSpec.viewShopSearchFilters;
    }

    public static ClientRouteSpec getViewShoppingSettings() {
        return ClientRouteSpec.viewShoppingSettings;
    }

    public static ClientRouteSpec getViewSponsorResources() {
        return ClientRouteSpec.viewSponsorResources;
    }

    public static ClientRouteSpec getViewSquareLoyaltyDetails() {
        return ClientRouteSpec.viewSquareLoyaltyDetails;
    }

    public static ClientRouteSpec getViewSquareLoyaltySheet() {
        return ClientRouteSpec.viewSquareLoyaltySheet;
    }

    public static ClientRouteSpec getViewSquareLoyaltyStatusTierDetails() {
        return ClientRouteSpec.viewSquareLoyaltyStatusTierDetails;
    }

    public static ClientRouteSpec getViewStablecoin() {
        return ClientRouteSpec.viewStablecoin;
    }

    public static ClientRouteSpec getViewStablecoinReceive() {
        return ClientRouteSpec.viewStablecoinReceive;
    }

    public static ClientRouteSpec getViewStablecoinUri() {
        return ClientRouteSpec.viewStablecoinUri;
    }

    public static ClientRouteSpec getViewSupport() {
        return ClientRouteSpec.viewSupport;
    }

    public static ClientRouteSpec getViewSupportChat() {
        return ClientRouteSpec.viewSupportChat;
    }

    public static ClientRouteSpec getViewSupportChatFromMoneybot() {
        return ClientRouteSpec.viewSupportChatFromMoneybot;
    }

    public static ClientRouteSpec getViewSupportChatNewUnreadMessage() {
        return ClientRouteSpec.viewSupportChatNewUnreadMessage;
    }

    public static ClientRouteSpec getViewSupportForTransaction() {
        return ClientRouteSpec.viewSupportForTransaction;
    }

    public static ClientRouteSpec getViewSupportHome() {
        return ClientRouteSpec.viewSupportHome;
    }

    public static ClientRouteSpec getViewSupportIncident() {
        return ClientRouteSpec.viewSupportIncident;
    }

    public static ClientRouteSpec getViewSupportNode() {
        return ClientRouteSpec.viewSupportNode;
    }

    public static ClientRouteSpec getViewSupportPhone() {
        return ClientRouteSpec.viewSupportPhone;
    }

    public static ClientRouteSpec getViewSupportPhoneVerification() {
        return ClientRouteSpec.viewSupportPhoneVerification;
    }

    public static ClientRouteSpec getViewSupportScreenshotRequest() {
        return ClientRouteSpec.viewSupportScreenshotRequest;
    }

    public static ClientRouteSpec getViewSupportSurvey() {
        return ClientRouteSpec.viewSupportSurvey;
    }

    public static ClientRouteSpec getViewSystemNotificationsSettings() {
        return ClientRouteSpec.viewSystemNotificationsSettings;
    }

    public static ClientRouteSpec getViewSystemSettings() {
        return ClientRouteSpec.viewSystemSettings;
    }

    public static ClientRouteSpec getViewSystemSettingsLocation() {
        return ClientRouteSpec.viewSystemSettingsLocation;
    }

    public static ClientRouteSpec getViewTapToPayActivation() {
        return ClientRouteSpec.viewTapToPayActivation;
    }

    public static ClientRouteSpec getViewTapToPayActivationWithToken() {
        return ClientRouteSpec.viewTapToPayActivationWithToken;
    }

    public static ClientRouteSpec getViewTaxesHub() {
        return ClientRouteSpec.viewTaxesHub;
    }

    public static ClientRouteSpec getViewTaxesHubWithDeepLink() {
        return ClientRouteSpec.viewTaxesHubWithDeepLink;
    }

    public static ClientRouteSpec getViewTaxesWebApp() {
        return ClientRouteSpec.viewTaxesWebApp;
    }

    public static ClientRouteSpec getViewTaxesWebAppRoot() {
        return ClientRouteSpec.viewTaxesWebAppRoot;
    }

    public static ClientRouteSpec getViewThemeSwitcher() {
        return ClientRouteSpec.viewThemeSwitcher;
    }

    public static ClientRouteSpec getViewThreadedCustomerActivity() {
        return ClientRouteSpec.viewThreadedCustomerActivity;
    }

    public static ClientRouteSpec getViewTransfersSetup() {
        return ClientRouteSpec.viewTransfersSetup;
    }

    public static ClientRouteSpec getViewUnblockCustomer() {
        return ClientRouteSpec.viewUnblockCustomer;
    }

    public static ClientRouteSpec getViewUnifiedThreadedCustomerActivity() {
        return ClientRouteSpec.viewUnifiedThreadedCustomerActivity;
    }

    public static ClientRouteSpec getViewWireTransferSetup() {
        return ClientRouteSpec.viewWireTransferSetup;
    }

    public static ClientRouteSpec getViewWithdrawWithParams() {
        return ClientRouteSpec.viewWithdrawWithParams;
    }
}
