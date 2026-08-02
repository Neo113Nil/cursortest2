package defpackage;

import android.net.Uri;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.loading.b;
import com.yandex.passport.internal.social.esia.EsiaBindWebClient;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.deeplink.generated.A3RequisitesAction;
import com.ybsdk.deeplink.generated.AccountDetailsAction;
import com.ybsdk.deeplink.generated.AccountTariffAction;
import com.ybsdk.deeplink.generated.AddAccountForTopupAction;
import com.ybsdk.deeplink.generated.AddCardForTopupAction;
import com.ybsdk.deeplink.generated.AftTopupAction;
import com.ybsdk.deeplink.generated.AllMobileProvidersAction;
import com.ybsdk.deeplink.generated.AuthLandingAction;
import com.ybsdk.deeplink.generated.AutoTopupAction;
import com.ybsdk.deeplink.generated.AutoTopupEditBottomSheetAction;
import com.ybsdk.deeplink.generated.AutoTopupEnableSettingAction;
import com.ybsdk.deeplink.generated.AutoTopupSaveSettingsAction;
import com.ybsdk.deeplink.generated.AutoTopupSelectPaymentMethodAction;
import com.ybsdk.deeplink.generated.AutopaymentTestPaymentAction;
import com.ybsdk.deeplink.generated.AutotopupPaymentResultAction;
import com.ybsdk.deeplink.generated.AutotopupRegularAction;
import com.ybsdk.deeplink.generated.AutotopupResolveConflictAction;
import com.ybsdk.deeplink.generated.AutotopupRetryAction;
import com.ybsdk.deeplink.generated.AutotopupSaveAction;
import com.ybsdk.deeplink.generated.AutotopupTestPaymentAction;
import com.ybsdk.deeplink.generated.BudgetChargesAction;
import com.ybsdk.deeplink.generated.BudgetInvoiceRequisitesAction;
import com.ybsdk.deeplink.generated.BudgetResolveUinAction;
import com.ybsdk.deeplink.generated.BuyPlusAction;
import com.ybsdk.deeplink.generated.CardActivationAction;
import com.ybsdk.deeplink.generated.CardDeletionAction;
import com.ybsdk.deeplink.generated.CardDeletionReissueProcessingAction;
import com.ybsdk.deeplink.generated.CardDetailsAction;
import com.ybsdk.deeplink.generated.CardIssueAction;
import com.ybsdk.deeplink.generated.CardLandingAction;
import com.ybsdk.deeplink.generated.CardLimitAction;
import com.ybsdk.deeplink.generated.CardPinAction;
import com.ybsdk.deeplink.generated.CardReissueAction;
import com.ybsdk.deeplink.generated.ChangePhoneNumberAction;
import com.ybsdk.deeplink.generated.ChooseAppIconAction;
import com.ybsdk.deeplink.generated.CloseAction;
import com.ybsdk.deeplink.generated.CloseEsiaAction;
import com.ybsdk.deeplink.generated.CloseFlowAction;
import com.ybsdk.deeplink.generated.CloseSdkAction;
import com.ybsdk.deeplink.generated.ConfirmFundOperationAction;
import com.ybsdk.deeplink.generated.CopyTextAction;
import com.ybsdk.deeplink.generated.CreateCreditAction;
import com.ybsdk.deeplink.generated.CreateNfcShortcutAction;
import com.ybsdk.deeplink.generated.CreateSavingsAccountAction;
import com.ybsdk.deeplink.generated.CreditAccountAction;
import com.ybsdk.deeplink.generated.CreditDepositAction;
import com.ybsdk.deeplink.generated.CreditLimitDashboardAction;
import com.ybsdk.deeplink.generated.CreditLimitDepositAction;
import com.ybsdk.deeplink.generated.CreditLimitSettingsTermAction;
import com.ybsdk.deeplink.generated.CreditLimitSettingsTermFromCardAction;
import com.ybsdk.deeplink.generated.CreditResultAction;
import com.ybsdk.deeplink.generated.CrossBorderTransferAction;
import com.ybsdk.deeplink.generated.DashboardAction;
import com.ybsdk.deeplink.generated.DashboardExternalAction;
import com.ybsdk.deeplink.generated.DropPreConfirmActionAction;
import com.ybsdk.deeplink.generated.ErrorScreenAction;
import com.ybsdk.deeplink.generated.EsiaApp2appAction;
import com.ybsdk.deeplink.generated.EsiaSdkAction;
import com.ybsdk.deeplink.generated.ExternalMemberBindingDisableAction;
import com.ybsdk.deeplink.generated.ExternalMemberBindingSaveAction;
import com.ybsdk.deeplink.generated.ExternalMemberBindingSelectionAction;
import com.ybsdk.deeplink.generated.FaqAction;
import com.ybsdk.deeplink.generated.FinalizePaymentChoiceAction;
import com.ybsdk.deeplink.generated.FinishEsiaAction;
import com.ybsdk.deeplink.generated.FinishUpgradeSplitAction;
import com.ybsdk.deeplink.generated.FullscreenAction;
import com.ybsdk.deeplink.generated.FundOperationAction;
import com.ybsdk.deeplink.generated.InfoScreenAction;
import com.ybsdk.deeplink.generated.IntentAction;
import com.ybsdk.deeplink.generated.InternetPaymentAction;
import com.ybsdk.deeplink.generated.InternetPaymentFormAction;
import com.ybsdk.deeplink.generated.KycOnlineCameraAction;
import com.ybsdk.deeplink.generated.LandingRegistrationFromStartSessionAction;
import com.ybsdk.deeplink.generated.LocalVariablesChangedAction;
import com.ybsdk.deeplink.generated.LogoutAccountAction;
import com.ybsdk.deeplink.generated.LogoutSuggestAction;
import com.ybsdk.deeplink.generated.MarkEventReadAction;
import com.ybsdk.deeplink.generated.Me2meConfirmAction;
import com.ybsdk.deeplink.generated.Me2meDebitAutopullSettingsAction;
import com.ybsdk.deeplink.generated.Me2meDebitTransferAction;
import com.ybsdk.deeplink.generated.Me2meTopupAction;
import com.ybsdk.deeplink.generated.MerchantOffersAction;
import com.ybsdk.deeplink.generated.MerchantOffersSearchAction;
import com.ybsdk.deeplink.generated.MerchantOffersSearchSuggestAction;
import com.ybsdk.deeplink.generated.MerchantOffersTestSearchAction;
import com.ybsdk.deeplink.generated.MkkDepositAction;
import com.ybsdk.deeplink.generated.MobilePaymentAction;
import com.ybsdk.deeplink.generated.NativeCreditAccountAction;
import com.ybsdk.deeplink.generated.NeedToConnectToSrtToAddAccountForTopupCurtainAction;
import com.ybsdk.deeplink.generated.NextStoryAction;
import com.ybsdk.deeplink.generated.NfcDefaultCartShortcutAction;
import com.ybsdk.deeplink.generated.NfcEnqueueTokenizationAction;
import com.ybsdk.deeplink.generated.NfcOldUserPromoAction;
import com.ybsdk.deeplink.generated.NfcPaymentAction;
import com.ybsdk.deeplink.generated.NfcProductSettingsAction;
import com.ybsdk.deeplink.generated.NfcRestartApplicationAction;
import com.ybsdk.deeplink.generated.NfcSystemSettingsAction;
import com.ybsdk.deeplink.generated.NfcTokenizationAction;
import com.ybsdk.deeplink.generated.NfcTroubleshootingAction;
import com.ybsdk.deeplink.generated.NotificationsSettingsAction;
import com.ybsdk.deeplink.generated.OfflineSplitLandingAction;
import com.ybsdk.deeplink.generated.OnboardingAction;
import com.ybsdk.deeplink.generated.OpenCameraAction;
import com.ybsdk.deeplink.generated.OpenCashbackAction;
import com.ybsdk.deeplink.generated.OpenCashbackCategoriesAction;
import com.ybsdk.deeplink.generated.OpenEsiaIdentificationAction;
import com.ybsdk.deeplink.generated.OpenFundAction;
import com.ybsdk.deeplink.generated.OpenMainScreenAction;
import com.ybsdk.deeplink.generated.OpenOnceAction;
import com.ybsdk.deeplink.generated.OpenProAcquireCardAction;
import com.ybsdk.deeplink.generated.OpenProductAction;
import com.ybsdk.deeplink.generated.OpenQrPaymentAction;
import com.ybsdk.deeplink.generated.OpenSdkAction;
import com.ybsdk.deeplink.generated.PassportAccountManagementAction;
import com.ybsdk.deeplink.generated.PaymentMethodsSheetAction;
import com.ybsdk.deeplink.generated.PaymentSdkScreenAction;
import com.ybsdk.deeplink.generated.PaymentsdkAction;
import com.ybsdk.deeplink.generated.PdfLoadAction;
import com.ybsdk.deeplink.generated.PdfPreviewAction;
import com.ybsdk.deeplink.generated.PersonalWalletAction;
import com.ybsdk.deeplink.generated.PfmAction;
import com.ybsdk.deeplink.generated.PfmResetFiltersAction;
import com.ybsdk.deeplink.generated.PfmTestCalendarBottomSheetAction;
import com.ybsdk.deeplink.generated.PhoneTransferAction;
import com.ybsdk.deeplink.generated.PickPhotoAction;
import com.ybsdk.deeplink.generated.PlusHomeAction;
import com.ybsdk.deeplink.generated.ProTopupBottomSheetAction;
import com.ybsdk.deeplink.generated.ProfileAction;
import com.ybsdk.deeplink.generated.QrCreditLimitTermAction;
import com.ybsdk.deeplink.generated.QrPaymentAgreementSelectedAction;
import com.ybsdk.deeplink.generated.QrScanAction;
import com.ybsdk.deeplink.generated.QrSubscriptionsAction;
import com.ybsdk.deeplink.generated.RebindPaymentMethodAction;
import com.ybsdk.deeplink.generated.RedirectAction;
import com.ybsdk.deeplink.generated.ReloadPaymentMethodSheetAction;
import com.ybsdk.deeplink.generated.ReloadScreenAction;
import com.ybsdk.deeplink.generated.RenameCardAction;
import com.ybsdk.deeplink.generated.RequisitesTransferAction;
import com.ybsdk.deeplink.generated.ResolveQrDetailedAction;
import com.ybsdk.deeplink.generated.ResultSelectedTermAction;
import com.ybsdk.deeplink.generated.RoundingAction;
import com.ybsdk.deeplink.generated.SavingTransferAction;
import com.ybsdk.deeplink.generated.SavingsAccountAction;
import com.ybsdk.deeplink.generated.SavingsAccountCloseAction;
import com.ybsdk.deeplink.generated.SavingsAccountGoalAction;
import com.ybsdk.deeplink.generated.SavingsAccountLockMoneyAction;
import com.ybsdk.deeplink.generated.SavingsAccountLockMoneyRemoveAction;
import com.ybsdk.deeplink.generated.SavingsAccountRenameAction;
import com.ybsdk.deeplink.generated.SavingsAccountThemeSelectorAction;
import com.ybsdk.deeplink.generated.SavingsAutotopupNoticeAction;
import com.ybsdk.deeplink.generated.SavingsDashboardAction;
import com.ybsdk.deeplink.generated.SbpAccountDetailsAction;
import com.ybsdk.deeplink.generated.SbpSubscriptionConsentAction;
import com.ybsdk.deeplink.generated.SecondFactorAuthAction;
import com.ybsdk.deeplink.generated.SelfTopupAction;
import com.ybsdk.deeplink.generated.SelfTransferAction;
import com.ybsdk.deeplink.generated.SendAnalyticsAction;
import com.ybsdk.deeplink.generated.SendProOpenScreenRequestAction;
import com.ybsdk.deeplink.generated.SetAppIconAction;
import com.ybsdk.deeplink.generated.SetHeaderClickableAction;
import com.ybsdk.deeplink.generated.ShareAction;
import com.ybsdk.deeplink.generated.SharePdfAction;
import com.ybsdk.deeplink.generated.ShowAboutAction;
import com.ybsdk.deeplink.generated.ShowAccountStatusAction;
import com.ybsdk.deeplink.generated.ShowDocumentsAction;
import com.ybsdk.deeplink.generated.ShowFundDocsNoticeAction;
import com.ybsdk.deeplink.generated.ShowPinAction;
import com.ybsdk.deeplink.generated.ShowSettingsAction;
import com.ybsdk.deeplink.generated.ShowTransferCheckNoticeAction;
import com.ybsdk.deeplink.generated.SimplifiedIdentificationFormAction;
import com.ybsdk.deeplink.generated.SimplifiedIdentificationInfoAction;
import com.ybsdk.deeplink.generated.SingleCardDetailsAction;
import com.ybsdk.deeplink.generated.SkipRegistrationAction;
import com.ybsdk.deeplink.generated.SnackbarAction;
import com.ybsdk.deeplink.generated.SnackbarPrizesAction;
import com.ybsdk.deeplink.generated.SplitDepositAction;
import com.ybsdk.deeplink.generated.SplitDepositAutoTopupAction;
import com.ybsdk.deeplink.generated.SplitDepositAutoTopupSaveRetryAction;
import com.ybsdk.deeplink.generated.SplitDepositProcessingAction;
import com.ybsdk.deeplink.generated.SplitDepositRepaymentAction;
import com.ybsdk.deeplink.generated.SplitFuturePaymentsAction;
import com.ybsdk.deeplink.generated.SplitMerchantsAction;
import com.ybsdk.deeplink.generated.SplitQrTooltipAction;
import com.ybsdk.deeplink.generated.StartSessionAction;
import com.ybsdk.deeplink.generated.StatusCheckAction;
import com.ybsdk.deeplink.generated.SupportChatAction;
import com.ybsdk.deeplink.generated.TokenIntentAction;
import com.ybsdk.deeplink.generated.TransactionAction;
import com.ybsdk.deeplink.generated.TransactionFeedFilterSelectedAction;
import com.ybsdk.deeplink.generated.TransactionsAction;
import com.ybsdk.deeplink.generated.TransactionsFeedAction;
import com.ybsdk.deeplink.generated.TransferAction;
import com.ybsdk.deeplink.generated.TransferItemsSheetAction;
import com.ybsdk.deeplink.generated.TransferSectionsSheetAction;
import com.ybsdk.deeplink.generated.TransfersDashboardAction;
import com.ybsdk.deeplink.generated.UnbindSbpAccountAction;
import com.ybsdk.deeplink.generated.UserCardsAction;
import com.ybsdk.deeplink.generated.VerticalStoriesAction;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import kotlin.collections.EmptyList;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes3.dex */
public abstract class t691 {
    public static final void a(f530 f530Var, lna lnaVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(136184304);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.e(lnaVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            String str = lnaVar.b;
            if (str == null) {
                str = "";
            }
            Integer num = lnaVar.c;
            up2 up2Var = new up2(zp2.a);
            if (num != null) {
                up2Var = new up2(rzo.d(num.intValue()));
            }
            Integer num2 = lnaVar.d;
            up2 up2Var2 = new up2(rzo.e(0, 173, 255, 255));
            if (num2 != null) {
                up2Var2 = new up2(rzo.d(num2.intValue()));
            }
            int i3 = ((i2 << 18) & 3670016) | 224256;
            hpb1.c(str, up2Var, up2Var2, vvb1.x, 4.0f, ldc.b(ldc.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), f530Var, btsVar, i3, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(f530Var, lnaVar, i, 28);
        }
    }

    public static final void b(f530 f530Var, lna lnaVar, String str, long j, fid fidVar, int i) {
        String str2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(471458716);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.e(lnaVar) ? 32 : 16) | (btsVar.k(str) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            lna lnaVar2 = null;
            if (lnaVar != null && (str2 = lnaVar.b) != null && str2.length() != 0) {
                lnaVar2 = lnaVar;
            }
            if (lnaVar2 != null) {
                btsVar.e0(683803367);
                a(ira1.i(sm91.f(an91.o(f530Var, 0.0f, 0.0f, 6.0f, 0.0f, 11), 0.0f, -8.0f, 1), -7.5f), lnaVar, btsVar, i2 & 112);
                btsVar.t(false);
            } else if (str != null) {
                btsVar.e0(684066030);
                f530 o = an91.o(f530Var, 0.0f, 0.0f, 0.0f, 10.0f, 7);
                k3r k3rVar = ljs0.a;
                f530 j2 = ljs0.j(o, c8m.b(j), c8m.a(j));
                qbv qbvVar = new qbv(str);
                uo5 uo5Var = x4c.y;
                ywy ywyVar = (ywy) ffb1.e(qbvVar, btsVar).getValue();
                if (jl40.l(ywyVar, wwy.a)) {
                    btsVar.e0(-1188024354);
                    b.a(ljs0.a(j2, 24.0f, 24.0f), null, false, null, null, null, false, btsVar, 0, 254);
                    btsVar.t(false);
                } else if (ywyVar instanceof xwy) {
                    btsVar.e0(-1187955534);
                    j4b1.c(((xwy) ywyVar).a, j2, null, null, uo5Var, mhe.f, 1.0f, 1, btsVar, ImageMetadata.EDGE_MODE, 0);
                    btsVar = btsVar;
                    btsVar.t(false);
                } else {
                    if (!jl40.l(ywyVar, vwy.a)) {
                        throw unr0.y(-1839441359, btsVar, false);
                    }
                    btsVar.e0(-1187881568);
                    btsVar.t(false);
                }
                btsVar.t(false);
            } else {
                btsVar.e0(684283526);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new k7a(f530Var, lnaVar, str, j, i);
        }
    }

    public static gb2 c(String str, ety0 ety0Var, long j, fwi fwiVar, dyr dyrVar, int i, int i2) {
        EmptyList emptyList = EmptyList.a;
        return new gb2(new ib2(str, ety0Var, emptyList, emptyList, dyrVar, fwiVar), i, 1, j);
    }

    public static BaseDeeplinkAction d(Uri uri, xz3 xz3Var) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        Boolean j0;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        Boolean j02;
        String queryParameter8;
        String queryParameter9;
        String queryParameter10;
        String queryParameter11;
        String queryParameter12;
        String queryParameter13;
        String queryParameter14;
        String queryParameter15;
        String queryParameter16;
        String queryParameter17;
        String queryParameter18;
        Boolean j03;
        String queryParameter19;
        String queryParameter20;
        String queryParameter21;
        String queryParameter22;
        String queryParameter23;
        String queryParameter24;
        String queryParameter25;
        String queryParameter26;
        Boolean j04;
        String queryParameter27;
        String queryParameter28;
        String queryParameter29;
        String queryParameter30;
        String queryParameter31;
        String queryParameter32;
        String queryParameter33;
        String queryParameter34;
        String queryParameter35;
        Boolean j05;
        String queryParameter36;
        String queryParameter37;
        String queryParameter38;
        Boolean j06;
        String queryParameter39;
        Boolean j07;
        Boolean j08;
        String queryParameter40;
        String queryParameter41;
        String queryParameter42;
        String queryParameter43;
        String queryParameter44;
        String queryParameter45;
        String queryParameter46;
        String queryParameter47;
        String queryParameter48;
        String queryParameter49;
        Boolean j09;
        Boolean j010;
        String queryParameter50;
        String queryParameter51;
        String queryParameter52;
        String queryParameter53;
        String queryParameter54;
        String queryParameter55;
        String queryParameter56;
        String queryParameter57;
        String queryParameter58;
        Boolean j011;
        String queryParameter59;
        String queryParameter60;
        Boolean j012;
        String queryParameter61;
        String queryParameter62;
        String queryParameter63;
        String queryParameter64;
        Boolean j013;
        String queryParameter65;
        String queryParameter66;
        String queryParameter67;
        String queryParameter68;
        String queryParameter69;
        String queryParameter70;
        String queryParameter71;
        String queryParameter72;
        String queryParameter73;
        String queryParameter74;
        String queryParameter75;
        String queryParameter76;
        String queryParameter77;
        Boolean j014;
        Boolean j015;
        String queryParameter78;
        String queryParameter79;
        String queryParameter80;
        String queryParameter81;
        String queryParameter82;
        String queryParameter83;
        String queryParameter84;
        String queryParameter85;
        String queryParameter86;
        String queryParameter87;
        String queryParameter88;
        String queryParameter89;
        String queryParameter90;
        String queryParameter91;
        Double i;
        String queryParameter92;
        String queryParameter93;
        String queryParameter94;
        String queryParameter95;
        String queryParameter96;
        String queryParameter97;
        String queryParameter98;
        String queryParameter99;
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        boolean z = false;
        switch (path.hashCode()) {
            case -2138204392:
                if (path.equals("/add_card_for_topup")) {
                    return AddCardForTopupAction.INSTANCE;
                }
                return null;
            case -2128893302:
                if (path.equals("/autotopup_save")) {
                    return AutotopupSaveAction.INSTANCE;
                }
                return null;
            case -2125638379:
                if (!path.equals("/plus_home")) {
                    return null;
                }
                String queryParameter100 = uri.getQueryParameter("url");
                String queryParameter101 = uri.getQueryParameter("present_modally");
                return new PlusHomeAction(queryParameter100, queryParameter101 != null ? evu0.j0(queryParameter101) : null);
            case -2106161350:
                if (path.equals("/finish_upgrade_split")) {
                    return FinishUpgradeSplitAction.INSTANCE;
                }
                return null;
            case -2094485574:
                if (path.equals("/me2me_debit_transfer") && (queryParameter = uri.getQueryParameter("permission_request_id")) != null) {
                    return new Me2meDebitTransferAction(queryParameter);
                }
                return null;
            case -2071285038:
                if (path.equals("/all_mobile_providers")) {
                    return new AllMobileProvidersAction(uri.getQueryParameter("phone"));
                }
                return null;
            case -2066287672:
                if (path.equals("/split_deposit_processing") && (queryParameter2 = uri.getQueryParameter("transaction_parameters")) != null) {
                    return new SplitDepositProcessingAction(queryParameter2);
                }
                return null;
            case -2065098470:
                if (!path.equals("/transfer")) {
                    return null;
                }
                String queryParameter102 = uri.getQueryParameter("direction");
                if (queryParameter102 == null) {
                    queryParameter102 = "transfer";
                }
                String str = queryParameter102;
                String queryParameter103 = uri.getQueryParameter("source_agreement_id");
                String queryParameter104 = uri.getQueryParameter("target_agreement_id");
                String queryParameter105 = uri.getQueryParameter("scenario");
                String queryParameter106 = uri.getQueryParameter("type");
                String queryParameter107 = uri.getQueryParameter("amount");
                return new TransferAction(str, queryParameter103, queryParameter104, queryParameter105, queryParameter106, queryParameter107 != null ? avu0.i(queryParameter107) : null);
            case -2026338836:
                if (!path.equals("/pdf_preview") || (queryParameter3 = uri.getQueryParameter("url")) == null) {
                    return null;
                }
                if (!((Boolean) xz3Var.invoke(Uri.parse(queryParameter3))).booleanValue()) {
                    queryParameter3 = null;
                }
                if (queryParameter3 == null) {
                    return null;
                }
                String queryParameter108 = uri.getQueryParameter("is_sharing_enabled");
                if (queryParameter108 != null && (j0 = evu0.j0(queryParameter108)) != null) {
                    z = j0.booleanValue();
                }
                return new PdfPreviewAction(queryParameter3, z, uri.getQueryParameter("file_name"));
            case -1993205808:
                if (path.equals("/cross_border_transfer")) {
                    return CrossBorderTransferAction.INSTANCE;
                }
                return null;
            case -1960124089:
                if (!path.equals("/credit_deposit") || (queryParameter4 = uri.getQueryParameter("agreement_id")) == null || (queryParameter5 = uri.getQueryParameter("credit_type")) == null) {
                    return null;
                }
                return new CreditDepositAction(queryParameter4, queryParameter5, uri.getQueryParameter("scenario"));
            case -1960023939:
                if (path.equals("/simplified_identification_form")) {
                    return SimplifiedIdentificationFormAction.INSTANCE;
                }
                return null;
            case -1959935897:
                if (path.equals("/simplified_identification_info")) {
                    return SimplifiedIdentificationInfoAction.INSTANCE;
                }
                return null;
            case -1949105116:
                if (path.equals("/nfc_default_cart_shortcut")) {
                    return new NfcDefaultCartShortcutAction(uri.getQueryParameter("card_id"));
                }
                return null;
            case -1887694770:
                if (!path.equals("/card_deletion") || (queryParameter6 = uri.getQueryParameter("card_id")) == null || (queryParameter7 = uri.getQueryParameter("last_pan_digits")) == null) {
                    return null;
                }
                String queryParameter109 = uri.getQueryParameter("pop_card_scenario");
                if (queryParameter109 != null && (j02 = evu0.j0(queryParameter109)) != null) {
                    z = j02.booleanValue();
                }
                boolean z2 = z;
                String queryParameter110 = uri.getQueryParameter("image_url");
                return new CardDeletionAction(queryParameter6, queryParameter7, z2, queryParameter110 != null ? new ThemedImageUrlEntity(queryParameter110, uri.getQueryParameter("image_url_dark")) : null);
            case -1868510119:
                if (path.equals("/card_issue")) {
                    return new CardIssueAction(uri.getQueryParameter("agreement_id"));
                }
                return null;
            case -1866043589:
                if (path.equals("/card_limit") && (queryParameter8 = uri.getQueryParameter("card_id")) != null) {
                    return new CardLimitAction(queryParameter8);
                }
                return null;
            case -1841678457:
                if (path.equals("/qr_credit_limit_term") && (queryParameter9 = uri.getQueryParameter("select_term_id")) != null) {
                    return new QrCreditLimitTermAction(queryParameter9, uri.getQueryParameter("header_title"), uri.getQueryParameter("header_subtitle"), uri.getQueryParameter("footer_today_payment"), uri.getQueryParameter("footer_plan_payment"), uri.getQueryParameter("action_title"));
                }
                return null;
            case -1839063749:
                if (path.equals("/pro_topup_bottom_sheet")) {
                    return ProTopupBottomSheetAction.INSTANCE;
                }
                return null;
            case -1794641840:
                if (path.equals("/autopayment_test_payment") && (queryParameter10 = uri.getQueryParameter("flow")) != null) {
                    return new AutopaymentTestPaymentAction(queryParameter10, uri.getQueryParameter("agreement_id"), uri.getQueryParameter("member_id"));
                }
                return null;
            case -1794058744:
                if (path.equals("/need_to_connect_to_srt_to_add_account_for_topup_curtain")) {
                    return NeedToConnectToSrtToAddAccountForTopupCurtainAction.INSTANCE;
                }
                return null;
            case -1743699654:
                if (path.equals("/show_about")) {
                    return ShowAboutAction.INSTANCE;
                }
                return null;
            case -1740536748:
                if (!path.equals("/credit_result") || (queryParameter11 = uri.getQueryParameter(TarifficatorScenarioActivity.RESULT_KEY)) == null) {
                    return null;
                }
                String queryParameter111 = uri.getQueryParameter("on_fail");
                return new CreditResultAction(queryParameter11, (queryParameter111 == null || !((Boolean) xz3Var.invoke(Uri.parse(queryParameter111))).booleanValue()) ? null : queryParameter111);
            case -1718218600:
                if (path.equals("/savings_account") && (queryParameter12 = uri.getQueryParameter("agreement_id")) != null) {
                    return new SavingsAccountAction(queryParameter12, twy0.a(uri, "background_color"));
                }
                return null;
            case -1709549046:
                if (path.equals("/default_payment_method_set")) {
                    return n891.r(uri);
                }
                return null;
            case -1694060731:
                if (path.equals("/dashboard")) {
                    return new DashboardAction(uri.getQueryParameter("product_id"), uri.getQueryParameter("agreement_id"), uri.getQueryParameter("product_type"), uri.getQueryParameter("product_item"));
                }
                return null;
            case -1692990894:
                if (path.equals("/autotopup_resolve_conflict") && (queryParameter13 = uri.getQueryParameter("agreement_id")) != null) {
                    return new AutotopupResolveConflictAction(queryParameter13);
                }
                return null;
            case -1683087946:
                if (path.equals("/pfm_test_calendar_bottom_sheet")) {
                    return new PfmTestCalendarBottomSheetAction(uri.getQueryParameter("start_date"), uri.getQueryParameter("end_date"), uri.getQueryParameter("first_available_date"));
                }
                return null;
            case -1625374352:
                if (path.equals("/show_transfer_check_notice")) {
                    return ShowTransferCheckNoticeAction.INSTANCE;
                }
                return null;
            case -1611193536:
                if (path.equals("/native_credit_account")) {
                    return NativeCreditAccountAction.INSTANCE;
                }
                return null;
            case -1598819837:
                if (path.equals("/reload_screen")) {
                    return ReloadScreenAction.INSTANCE;
                }
                return null;
            case -1576559292:
                if (path.equals("/stories")) {
                    return ygb1.e(uri);
                }
                return null;
            case -1571988677:
                if (path.equals("/autotopup_retry")) {
                    return AutotopupRetryAction.INSTANCE;
                }
                return null;
            case -1556357124:
                if (path.equals("/budget_resolve_uin")) {
                    return new BudgetResolveUinAction(uri.getQueryParameter("uin"), uri.getQueryParameter("qr_string"));
                }
                return null;
            case -1525292005:
                if (path.equals("/close_sdk_with_result")) {
                    return snb1.b(uri);
                }
                return null;
            case -1525079152:
                if (path.equals("/savings_account_lock_money_remove")) {
                    return SavingsAccountLockMoneyRemoveAction.INSTANCE;
                }
                return null;
            case -1448823752:
                if (path.equals("/a3_requisites") && (queryParameter14 = uri.getQueryParameter("invoice_id")) != null) {
                    return new A3RequisitesAction(queryParameter14);
                }
                return null;
            case -1408589945:
                if (path.equals("/qr_subscriptions")) {
                    return QrSubscriptionsAction.INSTANCE;
                }
                return null;
            case -1373441038:
                if (path.equals("/drop_pre_confirm_action")) {
                    return DropPreConfirmActionAction.INSTANCE;
                }
                return null;
            case -1354381818:
                if (!path.equals("/card_reissue") || (queryParameter15 = uri.getQueryParameter("card_id")) == null || (queryParameter16 = uri.getQueryParameter("title")) == null || (queryParameter17 = uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)) == null || (queryParameter18 = uri.getQueryParameter("image_url")) == null) {
                    return null;
                }
                ThemedImageUrlEntity themedImageUrlEntity = new ThemedImageUrlEntity(queryParameter18, uri.getQueryParameter("image_url_dark"));
                String queryParameter112 = uri.getQueryParameter("pop_card_scenario");
                if (queryParameter112 != null && (j03 = evu0.j0(queryParameter112)) != null) {
                    z = j03.booleanValue();
                }
                return new CardReissueAction(queryParameter15, queryParameter16, queryParameter17, themedImageUrlEntity, z);
            case -1348062154:
                if (path.equals("/nfc_product_settings")) {
                    return NfcProductSettingsAction.INSTANCE;
                }
                return null;
            case -1333501968:
                if (!path.equals("/esia_sdk") || (queryParameter19 = uri.getQueryParameter(ClidProvider.STATE)) == null || (queryParameter20 = uri.getQueryParameter("scope")) == null || (queryParameter21 = uri.getQueryParameter("client_id")) == null || (queryParameter22 = uri.getQueryParameter(ClidProvider.TIMESTAMP)) == null || (queryParameter23 = uri.getQueryParameter("access_type")) == null || (queryParameter24 = uri.getQueryParameter(EsiaBindWebClient.REDIRECT_PARAM_NAME)) == null || (queryParameter25 = uri.getQueryParameter("response_type")) == null || (queryParameter26 = uri.getQueryParameter("client_secret")) == null) {
                    return null;
                }
                return new EsiaSdkAction(queryParameter19, queryParameter20, queryParameter21, queryParameter22, queryParameter23, queryParameter24, queryParameter25, queryParameter26);
            case -1328558699:
                if (path.equals("/merchant_offers_test_search")) {
                    return MerchantOffersTestSearchAction.INSTANCE;
                }
                return null;
            case -1326346858:
                if (path.equals("/card_activation")) {
                    return new CardActivationAction(uri.getQueryParameter("agreement_id"), uri.getQueryParameter("promo_id"));
                }
                return null;
            case -1290250651:
                if (!path.equals("/nfc_enqueue_tokenization")) {
                    return null;
                }
                String queryParameter113 = uri.getQueryParameter("wipe_data");
                if (queryParameter113 != null && (j04 = evu0.j0(queryParameter113)) != null) {
                    z = j04.booleanValue();
                }
                return new NfcEnqueueTokenizationAction(z);
            case -1278668443:
                if (path.equals("/account_tariff")) {
                    return AccountTariffAction.INSTANCE;
                }
                return null;
            case -1239427613:
                if (path.equals("/paymentsdk") && (queryParameter27 = uri.getQueryParameter("url")) != null) {
                    return new PaymentsdkAction(queryParameter27);
                }
                return null;
            case -1221755983:
                if (path.equals("/finish-esia")) {
                    return FinishEsiaAction.INSTANCE;
                }
                return null;
            case -1216048841:
                if (path.equals("/internet_payment")) {
                    return new InternetPaymentAction(uri.getQueryParameter("agreement_id"));
                }
                return null;
            case -1177949128:
                if (path.equals("/kyc_online_camera") && (queryParameter28 = uri.getQueryParameter("application_id")) != null) {
                    return new KycOnlineCameraAction(queryParameter28, uri.getQueryParameter("application_type"));
                }
                return null;
            case -1172469240:
                if (path.equals("/merchant_offers_search")) {
                    return MerchantOffersSearchAction.INSTANCE;
                }
                return null;
            case -1161461185:
                if (path.equals("/savings_dashboard")) {
                    return SavingsDashboardAction.INSTANCE;
                }
                return null;
            case -1142568763:
                if (path.equals("/savings_account_rename") && (queryParameter29 = uri.getQueryParameter("agreement_id")) != null) {
                    return new SavingsAccountRenameAction(queryParameter29, uri.getQueryParameter("title"), uri.getQueryParameter("subtitle"), uri.getQueryParameter("name"), uri.getQueryParameter("type"));
                }
                return null;
            case -1128345052:
                if (path.equals("/close_sdk")) {
                    return CloseSdkAction.INSTANCE;
                }
                return null;
            case -1125763304:
                if (!path.equals("/qr_payment_agreement_selected") || (queryParameter30 = uri.getQueryParameter("id")) == null || (queryParameter31 = uri.getQueryParameter("product_code")) == null) {
                    return null;
                }
                return new QrPaymentAgreementSelectedAction(queryParameter30, queryParameter31, uri.getQueryParameter("autopayment_id"), uri.getQueryParameter("member_id"));
            case -1075625142:
                if (path.equals("/payment_methods_sheet") && (queryParameter32 = uri.getQueryParameter("scenario")) != null) {
                    return new PaymentMethodsSheetAction(queryParameter32, uri.getQueryParameter("selected_payment_method_id"), uri.getQueryParameter("success_action"), uri.getQueryParameter("fail_action"), uri.getQueryParameter("cancel_action"));
                }
                return null;
            case -991142132:
                if (!path.equals("/snackbar_prizes") || (queryParameter33 = uri.getQueryParameter("ids")) == null || (queryParameter34 = uri.getQueryParameter("texts")) == null) {
                    return null;
                }
                String queryParameter114 = uri.getQueryParameter("duration");
                return new SnackbarPrizesAction(queryParameter33, queryParameter34, queryParameter114 != null ? bvu0.l(10, queryParameter114) : null);
            case -932854946:
                if (path.equals("/user_cards")) {
                    return new UserCardsAction(uri.getQueryParameter("snackbar_title"), uri.getQueryParameter("snackbar_subtitle"));
                }
                return null;
            case -912384642:
                if (path.equals("/send_analytics") && (queryParameter35 = uri.getQueryParameter("event_name")) != null) {
                    return new SendAnalyticsAction(queryParameter35, uri.getQueryParameter("params"));
                }
                return null;
            case -884918846:
                if (!path.equals("/card_details")) {
                    return null;
                }
                String queryParameter115 = uri.getQueryParameter("scroll_to_promo");
                if (queryParameter115 != null && (j05 = evu0.j0(queryParameter115)) != null) {
                    z = j05.booleanValue();
                }
                return new CardDetailsAction(z, uri.getQueryParameter("agreement_id"), uri.getQueryParameter("card_id"), uri.getQueryParameter("promo_id"), uri.getQueryParameter("scroll_to_product_type"));
            case -880745635:
                if (path.equals("/mkk_deposit") && (queryParameter36 = uri.getQueryParameter("agreement_id")) != null) {
                    return new MkkDepositAction(queryParameter36, uri.getQueryParameter("scenario"));
                }
                return null;
            case -878935967:
                if (path.equals("/requisites_transfer")) {
                    return RequisitesTransferAction.INSTANCE;
                }
                return null;
            case -870779745:
                if (path.equals("/me2me_debit_autopull_settings")) {
                    return Me2meDebitAutopullSettingsAction.INSTANCE;
                }
                return null;
            case -849443906:
                if (path.equals("/logout_suggest")) {
                    return LogoutSuggestAction.INSTANCE;
                }
                return null;
            case -832369420:
                if (path.equals("/tooltip")) {
                    return grb1.c(uri);
                }
                return null;
            case -828429923:
                if (path.equals("/result_selected_term")) {
                    return new ResultSelectedTermAction(uri.getQueryParameter("select_term_id"), uri.getQueryParameter("result_text"), uri.getQueryParameter("terms_token"));
                }
                return null;
            case -754804937:
                if (path.equals("/nfc_troubleshooting")) {
                    return NfcTroubleshootingAction.INSTANCE;
                }
                return null;
            case -741846842:
                if (path.equals("/pdf_load_by_id")) {
                    return gh91.c(uri);
                }
                return null;
            case -727588439:
                if (path.equals("/open_product")) {
                    return OpenProductAction.INSTANCE;
                }
                return null;
            case -706988510:
                if (path.equals("/activate")) {
                    return mka1.e(uri);
                }
                return null;
            case -676930617:
                if (!path.equals("/offline_split_landing") || (queryParameter37 = uri.getQueryParameter("url")) == null) {
                    return null;
                }
                if (!((Boolean) xz3Var.invoke(Uri.parse(queryParameter37))).booleanValue()) {
                    queryParameter37 = null;
                }
                if (queryParameter37 == null) {
                    return null;
                }
                return new OfflineSplitLandingAction(queryParameter37);
            case -658659145:
                if (path.equals("/split_merchants")) {
                    return SplitMerchantsAction.INSTANCE;
                }
                return null;
            case -647996743:
                if (path.equals("/vertical_stories") && (queryParameter38 = uri.getQueryParameter("start_story_id")) != null) {
                    return new VerticalStoriesAction(queryParameter38);
                }
                return null;
            case -619360868:
                if (path.equals("/close_esia")) {
                    return new CloseEsiaAction(uri.getQueryParameter("application_id"));
                }
                return null;
            case -619337596:
                if (path.equals("/close_flow")) {
                    return CloseFlowAction.INSTANCE;
                }
                return null;
            case -520600526:
                if (!path.equals("/error_screen")) {
                    return null;
                }
                String queryParameter116 = uri.getQueryParameter("title");
                String queryParameter117 = uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
                String queryParameter118 = uri.getQueryParameter("button_text");
                String queryParameter119 = uri.getQueryParameter("button_action");
                String queryParameter120 = uri.getQueryParameter("hyperlink_text");
                String queryParameter121 = uri.getQueryParameter("hyperlink_action");
                String queryParameter122 = uri.getQueryParameter("image_url");
                return new ErrorScreenAction(queryParameter116, queryParameter117, queryParameter118, queryParameter119, queryParameter120, queryParameter121, queryParameter122 != null ? new ThemedImageUrlEntity(queryParameter122, uri.getQueryParameter("image_url_dark")) : null);
            case -513490111:
                if (!path.equals("/open_esia_identification")) {
                    return null;
                }
                String queryParameter123 = uri.getQueryParameter("isCredit");
                if (queryParameter123 != null && (j06 = evu0.j0(queryParameter123)) != null) {
                    z = j06.booleanValue();
                }
                boolean z3 = z;
                String queryParameter124 = uri.getQueryParameter("esiaStart");
                if (queryParameter124 == null || !((Boolean) xz3Var.invoke(Uri.parse(queryParameter124))).booleanValue()) {
                    queryParameter124 = null;
                }
                return new OpenEsiaIdentificationAction(z3, queryParameter124, uri.getQueryParameter("application_id"));
            case -508147667:
                if (path.equals("/auto_topup_select_payment_method")) {
                    return AutoTopupSelectPaymentMethodAction.INSTANCE;
                }
                return null;
            case -492834125:
                if (path.equals("/savings_account_lock_money") && (queryParameter39 = uri.getQueryParameter("agreement_id")) != null) {
                    return new SavingsAccountLockMoneyAction(queryParameter39, uri.getQueryParameter("title"), uri.getQueryParameter("subtitle"));
                }
                return null;
            case -482086756:
                if (!path.equals("/set_header_clickable")) {
                    return null;
                }
                String queryParameter125 = uri.getQueryParameter("is_clickable");
                return new SetHeaderClickableAction(queryParameter125 != null ? evu0.j0(queryParameter125) : null);
            case -464312839:
                if (!path.equals("/transactions_feed")) {
                    return null;
                }
                String queryParameter126 = uri.getQueryParameter("show_tabbar");
                boolean booleanValue = (queryParameter126 == null || (j08 = evu0.j0(queryParameter126)) == null) ? false : j08.booleanValue();
                String queryParameter127 = uri.getQueryParameter("hide_filters");
                if (queryParameter127 != null && (j07 = evu0.j0(queryParameter127)) != null) {
                    z = j07.booleanValue();
                }
                return new TransactionsFeedAction(booleanValue, z, uri.getQueryParameter(CreateApplicationWithProductJsonAdapter.productKey), uri.getQueryParameter("header_style"), uri.getQueryParameter("filters_style"), uri.getQueryParameter("agreement_id"));
            case -453019689:
                if (path.equals("/budget_invoice_requisites") && (queryParameter40 = uri.getQueryParameter("invoice_id")) != null) {
                    return new BudgetInvoiceRequisitesAction(queryParameter40);
                }
                return null;
            case -412506850:
                if (!path.equals("/split_deposit_repayment") || (queryParameter41 = uri.getQueryParameter("order_id")) == null) {
                    return null;
                }
                String queryParameter128 = uri.getQueryParameter("previous_payment_index");
                return new SplitDepositRepaymentAction(queryParameter41, queryParameter128 != null ? bvu0.l(10, queryParameter128) : null, uri.getQueryParameter("scenario"));
            case -407014060:
                if (path.equals("/me2me_topup")) {
                    return Me2meTopupAction.INSTANCE;
                }
                return null;
            case -400548541:
                if (!path.equals("/autotopup_payment_result") || (queryParameter42 = uri.getQueryParameter("agreement_id")) == null || (queryParameter43 = uri.getQueryParameter("type")) == null) {
                    return null;
                }
                return new AutotopupPaymentResultAction(queryParameter42, queryParameter43, uri.getQueryParameter("source"));
            case -396929834:
                if (path.equals("/credit_account")) {
                    return CreditAccountAction.INSTANCE;
                }
                return null;
            case -381800625:
                if (path.equals("/transaction") && (queryParameter44 = uri.getQueryParameter("id")) != null) {
                    return new TransactionAction(queryParameter44);
                }
                return null;
            case -348375091:
                if (path.equals("/create_credit")) {
                    return CreateCreditAction.INSTANCE;
                }
                return null;
            case -332381074:
                if (!path.equals("/transfers_dashboard")) {
                    return null;
                }
                String queryParameter129 = uri.getQueryParameter("origin");
                if (queryParameter129 == null) {
                    queryParameter129 = "unknown";
                }
                return new TransfersDashboardAction(queryParameter129, uri.getQueryParameter("agreement_id"), uri.getQueryParameter("autopayment_id"), uri.getQueryParameter("tokenization_product_id"));
            case -308528230:
                if (path.equals("/rebind_payment_method")) {
                    return RebindPaymentMethodAction.INSTANCE;
                }
                return null;
            case -258598835:
                if (path.equals("/merchant_offers_search_suggest") && (queryParameter45 = uri.getQueryParameter("query")) != null) {
                    return new MerchantOffersSearchSuggestAction(queryParameter45);
                }
                return null;
            case -188904589:
                if (path.equals("/credit_limit_settings_term_from_card") && (queryParameter46 = uri.getQueryParameter("agreement_id")) != null) {
                    return new CreditLimitSettingsTermFromCardAction(queryParameter46, uri.getQueryParameter("initial_screen_id"), uri.getQueryParameter("bottom_sheet_url"));
                }
                return null;
            case -168065748:
                if (path.equals("/transfer_state")) {
                    return htb1.d(uri);
                }
                return null;
            case -163406233:
                if (path.equals("/logout_account")) {
                    return LogoutAccountAction.INSTANCE;
                }
                return null;
            case -151611901:
                if (path.equals("/pick_photo")) {
                    return PickPhotoAction.INSTANCE;
                }
                return null;
            case -132054573:
                if (path.equals("/transfer_sections_sheet")) {
                    return TransferSectionsSheetAction.INSTANCE;
                }
                return null;
            case -111600445:
                if (path.equals("/set_app_icon") && (queryParameter47 = uri.getQueryParameter("icon_id")) != null) {
                    return new SetAppIconAction(queryParameter47);
                }
                return null;
            case -66706160:
                if (path.equals("/nfc_system_settings") && (queryParameter48 = uri.getQueryParameter("target")) != null) {
                    return new NfcSystemSettingsAction(queryParameter48);
                }
                return null;
            case -63588978:
                if (!path.equals("/info_screen") || (queryParameter49 = uri.getQueryParameter("target")) == null) {
                    return null;
                }
                String queryParameter130 = uri.getQueryParameter("show_back");
                if (queryParameter130 != null && (j010 = evu0.j0(queryParameter130)) != null) {
                    z = j010.booleanValue();
                }
                boolean z4 = z;
                String queryParameter131 = uri.getQueryParameter("show_close_button");
                return new InfoScreenAction(queryParameter49, z4, (queryParameter131 == null || (j09 = evu0.j0(queryParameter131)) == null) ? true : j09.booleanValue(), uri.getQueryParameter("agreement_id"), uri.getQueryParameter("progress"), uri.getQueryParameter("start_story_id"));
            case -52154080:
                if (path.equals("/open_cashback") && (queryParameter50 = uri.getQueryParameter("agreement_id")) != null) {
                    return new OpenCashbackAction(queryParameter50);
                }
                return null;
            case -35930571:
                if (path.equals("/split_future_payments")) {
                    return SplitFuturePaymentsAction.INSTANCE;
                }
                return null;
            case -35238686:
                if (!path.equals("/buy_plus") || (queryParameter51 = uri.getQueryParameter("offer_id")) == null || (queryParameter52 = uri.getQueryParameter("product_target")) == null) {
                    return null;
                }
                return new BuyPlusAction(queryParameter51, queryParameter52, uri.getQueryParameter("success"), uri.getQueryParameter("fail"));
            case -28461678:
                if (path.equals("/external_member_binding_selection")) {
                    return ExternalMemberBindingSelectionAction.INSTANCE;
                }
                return null;
            case -18672455:
                if (path.equals("/credit_limit_dashboard")) {
                    return CreditLimitDashboardAction.INSTANCE;
                }
                return null;
            case -12980563:
                if (!path.equals("/credit_limit_settings_term")) {
                    return null;
                }
                String queryParameter132 = uri.getQueryParameter("initial_screen_id");
                String queryParameter133 = uri.getQueryParameter("fit_window_top");
                return new CreditLimitSettingsTermAction(queryParameter132, queryParameter133 != null ? evu0.j0(queryParameter133) : null);
            case -11855258:
                if (path.equals("/tokenIntent")) {
                    return TokenIntentAction.INSTANCE;
                }
                return null;
            case -1718630:
                if (path.equals("/profile")) {
                    return ProfileAction.INSTANCE;
                }
                return null;
            case 1501319:
                if (path.equals("/faq")) {
                    return FaqAction.INSTANCE;
                }
                return null;
            case 1511080:
                if (path.equals("/pfm")) {
                    return PfmAction.INSTANCE;
                }
                return null;
            case 26182236:
                if (!path.equals("/fund_operation") || (queryParameter53 = uri.getQueryParameter("type")) == null || (queryParameter54 = uri.getQueryParameter("agreement_id")) == null) {
                    return null;
                }
                return new FundOperationAction(queryParameter53, queryParameter54);
            case 66443773:
                if (!path.equals("/card_deletion_reissue_processing") || (queryParameter55 = uri.getQueryParameter("card_id")) == null || (queryParameter56 = uri.getQueryParameter("set_card_status_action_type")) == null || (queryParameter57 = uri.getQueryParameter("card_type")) == null) {
                    return null;
                }
                return new CardDeletionReissueProcessingAction(queryParameter55, queryParameter56, queryParameter57, uri.getQueryParameter("processing_text"));
            case 83700056:
                if (path.equals("/mobile_payment")) {
                    return new MobilePaymentAction(uri.getQueryParameter("agreement_id"));
                }
                return null;
            case 88047505:
                if (!path.equals("/savings_account_close") || (queryParameter58 = uri.getQueryParameter("agreement_id")) == null) {
                    return null;
                }
                String queryParameter134 = uri.getQueryParameter("show_secondary");
                return new SavingsAccountCloseAction(queryParameter58, (queryParameter134 == null || (j011 = evu0.j0(queryParameter134)) == null) ? true : j011.booleanValue(), uri.getQueryParameter("type"), uri.getQueryParameter("title"), uri.getQueryParameter("subtitle"), uri.getQueryParameter("image"), uri.getQueryParameter("action_button_title"), uri.getQueryParameter("secondary_button_title"));
            case 98259643:
                if (path.equals("/confirm_fund_operation")) {
                    return ConfirmFundOperationAction.INSTANCE;
                }
                return null;
            case 103103516:
                if (path.equals("/savings_account_theme_selector")) {
                    return SavingsAccountThemeSelectorAction.INSTANCE;
                }
                return null;
            case 120414809:
                if (path.equals("/payment_sdk_screen") && (queryParameter59 = uri.getQueryParameter("url")) != null) {
                    return new PaymentSdkScreenAction(queryParameter59);
                }
                return null;
            case 142538050:
                if (!path.equals("/pdf_load") || (queryParameter60 = uri.getQueryParameter("type")) == null) {
                    return null;
                }
                String queryParameter135 = uri.getQueryParameter("is_sharing_enabled");
                if (queryParameter135 != null && (j012 = evu0.j0(queryParameter135)) != null) {
                    z = j012.booleanValue();
                }
                return new PdfLoadAction(queryParameter60, z, uri.getQueryParameter("agreement_id"), uri.getQueryParameter("file_name"), uri.getQueryParameter("report_type"), uri.getQueryParameter("report_version"), uri.getQueryParameter("operation_id"), uri.getQueryParameter("operation_timestamp"));
            case 164655834:
                if (path.equals("/change_phone_number")) {
                    return ChangePhoneNumberAction.INSTANCE;
                }
                return null;
            case 171109249:
                if (path.equals("/saving_transfer")) {
                    return SavingTransferAction.INSTANCE;
                }
                return null;
            case 172841227:
                if (!path.equals("/redirect") || (queryParameter61 = uri.getQueryParameter("url")) == null) {
                    return null;
                }
                if (!((Boolean) xz3Var.invoke(Uri.parse(queryParameter61))).booleanValue()) {
                    queryParameter61 = null;
                }
                if (queryParameter61 == null) {
                    return null;
                }
                String queryParameter136 = uri.getQueryParameter("auth");
                if (queryParameter136 == null) {
                    queryParameter136 = "none";
                }
                return new RedirectAction(queryParameter61, queryParameter136, uri.getQueryParameter("ymevent"));
            case 203931665:
                if (path.equals("/aft_topup")) {
                    return AftTopupAction.INSTANCE;
                }
                return null;
            case 206652204:
                if (!path.equals("/finalize_payment_choice") || (queryParameter62 = uri.getQueryParameter("payment_method_id")) == null) {
                    return null;
                }
                String queryParameter137 = uri.getQueryParameter("payment_method_type");
                String queryParameter138 = uri.getQueryParameter("image_url_light");
                return new FinalizePaymentChoiceAction(queryParameter62, queryParameter137, queryParameter138 != null ? new ThemedImageUrlEntity(queryParameter138, uri.getQueryParameter("image_url_light_dark")) : null, uri.getQueryParameter("title"), uri.getQueryParameter("amount"), uri.getQueryParameter("trust_id"));
            case 231046538:
                if (path.equals("/status_screen")) {
                    return dgb1.b(uri);
                }
                return null;
            case 232621571:
                if (path.equals("/credit_limit_deposit") && (queryParameter63 = uri.getQueryParameter("agreement_id")) != null) {
                    return new CreditLimitDepositAction(queryParameter63, uri.getQueryParameter("scenario"));
                }
                return null;
            case 280511365:
                if (path.equals("/dashboard_external") && (queryParameter64 = uri.getQueryParameter("member_id")) != null) {
                    return new DashboardExternalAction(queryParameter64);
                }
                return null;
            case 308817646:
                if (path.equals("/open_qr_payment")) {
                    return OpenQrPaymentAction.INSTANCE;
                }
                return null;
            case 348279165:
                if (!path.equals("/nfc_restart_application")) {
                    return null;
                }
                String queryParameter139 = uri.getQueryParameter("wipe_data");
                if (queryParameter139 != null && (j013 = evu0.j0(queryParameter139)) != null) {
                    z = j013.booleanValue();
                }
                return new NfcRestartApplicationAction(z);
            case 354427562:
                if (path.equals("/split_deposit") && (queryParameter65 = uri.getQueryParameter("order_id")) != null) {
                    return new SplitDepositAction(queryParameter65, uri.getQueryParameter("scenario"));
                }
                return null;
            case 358357493:
                if (path.equals("/unbind_sbp_account") && (queryParameter66 = uri.getQueryParameter("account_id")) != null) {
                    return new UnbindSbpAccountAction(queryParameter66);
                }
                return null;
            case 407777387:
                if (path.equals("/savings_autotopup_notice")) {
                    return SavingsAutotopupNoticeAction.INSTANCE;
                }
                return null;
            case 431722935:
                if (path.equals("/external_member_binding_save") && (queryParameter67 = uri.getQueryParameter("member_id")) != null) {
                    return new ExternalMemberBindingSaveAction(queryParameter67);
                }
                return null;
            case 444677620:
                if (path.equals("/open_sdk")) {
                    return OpenSdkAction.INSTANCE;
                }
                return null;
            case 444681486:
                if (path.equals("/open_web")) {
                    return uub1.b(uri, xz3Var);
                }
                return null;
            case 489067439:
                if (path.equals("/self_transfer")) {
                    return SelfTransferAction.INSTANCE;
                }
                return null;
            case 521303576:
                if (path.equals("/next_story")) {
                    return new NextStoryAction(uri.getQueryParameter("target"));
                }
                return null;
            case 550238054:
                if (path.equals("/autotopup_test_payment") && (queryParameter68 = uri.getQueryParameter("agreement_id")) != null) {
                    return new AutotopupTestPaymentAction(queryParameter68);
                }
                return null;
            case 550302577:
                if (path.equals("/reload_payment_method_sheet")) {
                    return new ReloadPaymentMethodSheetAction(uri.getQueryParameter("payment_method_id"), uri.getQueryParameter("trust_id"));
                }
                return null;
            case 554024369:
                if (path.equals("/open_pro_acquire_card")) {
                    return OpenProAcquireCardAction.INSTANCE;
                }
                return null;
            case 560474476:
                if (path.equals("/self_topup")) {
                    return SelfTopupAction.INSTANCE;
                }
                return null;
            case 566693797:
                if (path.equals("/sbp_subscription_consent")) {
                    return SbpSubscriptionConsentAction.INSTANCE;
                }
                return null;
            case 599175095:
                if (path.equals("/send_pro_open_screen_request") && (queryParameter69 = uri.getQueryParameter("action")) != null) {
                    return new SendProOpenScreenRequestAction(queryParameter69);
                }
                return null;
            case 610489986:
                if (path.equals("/show_pin")) {
                    return ShowPinAction.INSTANCE;
                }
                return null;
            case 641063735:
                if (path.equals("/show_account_status")) {
                    return ShowAccountStatusAction.INSTANCE;
                }
                return null;
            case 674413907:
                if (path.equals("/passport_account_management")) {
                    return PassportAccountManagementAction.INSTANCE;
                }
                return null;
            case 705886004:
                if (path.equals("/budget_charges")) {
                    return BudgetChargesAction.INSTANCE;
                }
                return null;
            case 710928574:
                if (path.equals("/mark_event_read")) {
                    return MarkEventReadAction.INSTANCE;
                }
                return null;
            case 721395132:
                if (path.equals("/second_factor_auth")) {
                    return SecondFactorAuthAction.INSTANCE;
                }
                return null;
            case 754147020:
                if (path.equals("/internet_payment_form") && (queryParameter70 = uri.getQueryParameter("provider_id")) != null) {
                    return new InternetPaymentFormAction(queryParameter70, uri.getQueryParameter("account"), uri.getQueryParameter("agreement_id"));
                }
                return null;
            case 759831536:
                if (path.equals("/savings_account_close_deposit")) {
                    return cya1.a(uri);
                }
                return null;
            case 831786975:
                if (path.equals("/merchant_offers")) {
                    return MerchantOffersAction.INSTANCE;
                }
                return null;
            case 852250544:
                if (path.equals("/auto_topup_edit_bottom_sheet") && (queryParameter71 = uri.getQueryParameter("setting")) != null) {
                    return new AutoTopupEditBottomSheetAction(queryParameter71);
                }
                return null;
            case 859468904:
                if (path.equals("/copy_text") && (queryParameter72 = uri.getQueryParameter("text")) != null) {
                    return new CopyTextAction(queryParameter72);
                }
                return null;
            case 871389900:
                if (!path.equals("/qr_scan")) {
                    return null;
                }
                String queryParameter140 = uri.getQueryParameter("origin");
                if (queryParameter140 == null) {
                    queryParameter140 = "unknown";
                }
                return new QrScanAction(queryParameter140, uri.getQueryParameter("agreement_id"), uri.getQueryParameter("autopayment_id"));
            case 877678352:
                if (path.equals("/split_deposit_auto_topup_save_retry")) {
                    return SplitDepositAutoTopupSaveRetryAction.INSTANCE;
                }
                return null;
            case 878098486:
                if (path.equals("/nfc_old_user_promo")) {
                    return NfcOldUserPromoAction.INSTANCE;
                }
                return null;
            case 881044844:
                if (path.equals("/open_main_screen")) {
                    return OpenMainScreenAction.INSTANCE;
                }
                return null;
            case 888415062:
                if (path.equals("/show_settings")) {
                    return ShowSettingsAction.INSTANCE;
                }
                return null;
            case 888430734:
                if (path.equals("/nfc_tokenization")) {
                    return new NfcTokenizationAction(uri.getQueryParameter("tokenization_product_id"), uri.getQueryParameter("nfc_token_reference"));
                }
                return null;
            case 899733579:
                if (path.equals("/open_fund") && (queryParameter73 = uri.getQueryParameter("fund_id")) != null) {
                    return new OpenFundAction(queryParameter73);
                }
                return null;
            case 899994631:
                if (!path.equals("/open_once") || (queryParameter74 = uri.getQueryParameter("id")) == null || (queryParameter75 = uri.getQueryParameter("once_url")) == null) {
                    return null;
                }
                if (!((Boolean) xz3Var.invoke(Uri.parse(queryParameter75))).booleanValue()) {
                    queryParameter75 = null;
                }
                if (queryParameter75 == null) {
                    return null;
                }
                String queryParameter141 = uri.getQueryParameter("next_url");
                if (queryParameter141 == null || !((Boolean) xz3Var.invoke(Uri.parse(queryParameter141))).booleanValue()) {
                    queryParameter141 = null;
                }
                return new OpenOnceAction(queryParameter74, queryParameter75, queryParameter141);
            case 929810479:
                if (path.equals("/auth_landing")) {
                    return AuthLandingAction.INSTANCE;
                }
                return null;
            case 941077781:
                if (path.equals("/card_pin") && (queryParameter76 = uri.getQueryParameter("card_id")) != null) {
                    return new CardPinAction(queryParameter76);
                }
                return null;
            case 944339067:
                if (path.equals("/transfer_items_sheet")) {
                    return TransferItemsSheetAction.INSTANCE;
                }
                return null;
            case 948843715:
                if (path.equals("/rounding") && (queryParameter77 = uri.getQueryParameter("agreement_id")) != null) {
                    return new RoundingAction(queryParameter77);
                }
                return null;
            case 948857227:
                if (path.equals("/phone_transfer")) {
                    return new PhoneTransferAction(uri.getQueryParameter("agreement_id"));
                }
                return null;
            case 990831057:
                if (!path.equals("/transaction_feed_filter_selected")) {
                    return null;
                }
                String queryParameter142 = uri.getQueryParameter("show_tabbar");
                boolean booleanValue2 = (queryParameter142 == null || (j015 = evu0.j0(queryParameter142)) == null) ? false : j015.booleanValue();
                String queryParameter143 = uri.getQueryParameter("hide_filters");
                if (queryParameter143 != null && (j014 = evu0.j0(queryParameter143)) != null) {
                    z = j014.booleanValue();
                }
                return new TransactionFeedFilterSelectedAction(booleanValue2, z, uri.getQueryParameter(CreateApplicationWithProductJsonAdapter.productKey), uri.getQueryParameter("header_style"), uri.getQueryParameter("filters_style"), uri.getQueryParameter("agreement_id"));
            case 994314480:
                if (path.equals("/choose_app_icon")) {
                    return ChooseAppIconAction.INSTANCE;
                }
                return null;
            case 1034219875:
                if (path.equals("/sbp_account_details") && (queryParameter78 = uri.getQueryParameter("account_id")) != null) {
                    return new SbpAccountDetailsAction(queryParameter78);
                }
                return null;
            case 1049082628:
                if (path.equals("/transactions")) {
                    return new TransactionsAction(uri.getQueryParameter("agreement_id"));
                }
                return null;
            case 1135443823:
                if (path.equals("/autotopup_regular") && (queryParameter79 = uri.getQueryParameter("agreement_id")) != null) {
                    return new AutotopupRegularAction(queryParameter79);
                }
                return null;
            case 1161605678:
                if (path.equals("/create_nfc_shortcut")) {
                    return CreateNfcShortcutAction.INSTANCE;
                }
                return null;
            case 1190711781:
                if (path.equals("/show_documents")) {
                    return ShowDocumentsAction.INSTANCE;
                }
                return null;
            case 1221610036:
                if (!path.equals("/snackbar") || (queryParameter80 = uri.getQueryParameter("text")) == null) {
                    return null;
                }
                String queryParameter144 = uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
                String queryParameter145 = uri.getQueryParameter("duration");
                return new SnackbarAction(queryParameter80, queryParameter144, queryParameter145 != null ? bvu0.l(10, queryParameter145) : null);
            case 1249887834:
                if (!path.equals("/savings_account_goal") || (queryParameter81 = uri.getQueryParameter("agreement_id")) == null) {
                    return null;
                }
                String queryParameter146 = uri.getQueryParameter("currency");
                String str2 = queryParameter146 == null ? "RUB" : queryParameter146;
                String queryParameter147 = uri.getQueryParameter("title");
                String queryParameter148 = uri.getQueryParameter("subtitle");
                String queryParameter149 = uri.getQueryParameter("amount");
                return new SavingsAccountGoalAction(queryParameter81, str2, queryParameter147, queryParameter148, queryParameter149 != null ? avu0.i(queryParameter149) : null, uri.getQueryParameter(MetaDataField.DATE_FIELD));
            case 1251159851:
                if (!path.equals("/open_camera") || (queryParameter82 = uri.getQueryParameter("application_id")) == null || (queryParameter83 = uri.getQueryParameter("application_type")) == null) {
                    return null;
                }
                return new OpenCameraAction(queryParameter82, queryParameter83, uri.getQueryParameter("document_group"));
            case 1320024051:
                if (path.equals("/landing_registration_from_start_session")) {
                    return LandingRegistrationFromStartSessionAction.INSTANCE;
                }
                return null;
            case 1369274011:
                if (!path.equals("/open_cashback_categories") || (queryParameter84 = uri.getQueryParameter("promo_id")) == null || (queryParameter85 = uri.getQueryParameter("agreement_id")) == null) {
                    return null;
                }
                return new OpenCashbackCategoriesAction(queryParameter84, queryParameter85);
            case 1403429263:
                if (!path.equals("/auto_topup")) {
                    return null;
                }
                String queryParameter150 = uri.getQueryParameter("auto_topup_id");
                String queryParameter151 = uri.getQueryParameter("agreement_id");
                String queryParameter152 = uri.getQueryParameter("type");
                String queryParameter153 = uri.getQueryParameter("amount");
                Double i2 = queryParameter153 != null ? avu0.i(queryParameter153) : null;
                String queryParameter154 = uri.getQueryParameter("threshold");
                return new AutoTopupAction(queryParameter150, queryParameter151, queryParameter152, i2, queryParameter154 != null ? avu0.i(queryParameter154) : null, uri.getQueryParameter("source"), uri.getQueryParameter("only"));
            case 1419658308:
                if (path.equals("/auto_topup_enable_setting") && (queryParameter86 = uri.getQueryParameter("setting")) != null) {
                    return new AutoTopupEnableSettingAction(queryParameter86);
                }
                return null;
            case 1440326441:
                if (path.equals("/close")) {
                    return new CloseAction(uri.getQueryParameter("ymevent"));
                }
                return null;
            case 1454970128:
                if (path.equals("/share") && (queryParameter87 = uri.getQueryParameter("text")) != null) {
                    return new ShareAction(queryParameter87);
                }
                return null;
            case 1456116705:
                if (path.equals("/topup")) {
                    return lrb1.a(uri);
                }
                return null;
            case 1463748490:
                if (path.equals("/onboarding")) {
                    return OnboardingAction.INSTANCE;
                }
                return null;
            case 1516833834:
                if (path.equals("/status_check")) {
                    return StatusCheckAction.INSTANCE;
                }
                return null;
            case 1533474387:
                if (!path.equals("/create_savings_account")) {
                    return null;
                }
                String queryParameter155 = uri.getQueryParameter("currency");
                if (queryParameter155 == null) {
                    queryParameter155 = "RUB";
                }
                String queryParameter156 = uri.getQueryParameter("tariff_id");
                String queryParameter157 = uri.getQueryParameter("source_agreement_id");
                String queryParameter158 = uri.getQueryParameter("amount");
                return new CreateSavingsAccountAction(queryParameter155, queryParameter156, queryParameter157, queryParameter158 != null ? avu0.i(queryParameter158) : null);
            case 1552698666:
                if (!path.equals("/fullscreen") || (queryParameter88 = uri.getQueryParameter("url")) == null) {
                    return null;
                }
                if (!((Boolean) xz3Var.invoke(Uri.parse(queryParameter88))).booleanValue()) {
                    queryParameter88 = null;
                }
                if (queryParameter88 == null) {
                    return null;
                }
                return new FullscreenAction(queryParameter88, uri.getQueryParameter("NOTIFICATION_ID_PARAM"));
            case 1579221726:
                if (path.equals("/open_notice")) {
                    return tub1.b(uri);
                }
                return null;
            case 1622786996:
                if (path.equals("/pfm_reset_filters")) {
                    return PfmResetFiltersAction.INSTANCE;
                }
                return null;
            case 1643261922:
                if (path.equals("/rename_card") && (queryParameter89 = uri.getQueryParameter("trust_card_id")) != null) {
                    return new RenameCardAction(queryParameter89);
                }
                return null;
            case 1667383049:
                if (path.equals("/local_variables_changed")) {
                    return LocalVariablesChangedAction.INSTANCE;
                }
                return null;
            case 1691222010:
                if (path.equals("/bottom_sheet")) {
                    return hab1.c(uri);
                }
                return null;
            case 1716426229:
                if (path.equals("/auto_topup_save_settings") && (queryParameter90 = uri.getQueryParameter("api_version")) != null) {
                    return new AutoTopupSaveSettingsAction(queryParameter90);
                }
                return null;
            case 1726506388:
                if (path.equals("/divkit")) {
                    return vj91.a(uri);
                }
                return null;
            case 1767281877:
                if (path.equals("/split_deposit_auto_topup")) {
                    return SplitDepositAutoTopupAction.INSTANCE;
                }
                return null;
            case 1791521892:
                if (path.equals("/me2me_confirm")) {
                    return new Me2meConfirmAction(uri.getQueryParameter("id"));
                }
                return null;
            case 1800174999:
                if (path.equals("/card_landing")) {
                    return CardLandingAction.INSTANCE;
                }
                return null;
            case 1833436131:
                if (path.equals("/nfc_payment")) {
                    return new NfcPaymentAction(uri.getQueryParameter("nfc_payment_scenario"), uri.getQueryParameter(CreateApplicationWithProductJsonAdapter.productKey), uri.getQueryParameter("agreement_id"), uri.getQueryParameter("nfc_error_type"));
                }
                return null;
            case 1844938615:
                if (path.equals("/support_chat")) {
                    return SupportChatAction.INSTANCE;
                }
                return null;
            case 1858965269:
                if (!path.equals("/show_fund_docs_notice") || (queryParameter91 = uri.getQueryParameter("amount")) == null || (i = avu0.i(queryParameter91)) == null) {
                    return null;
                }
                double doubleValue = i.doubleValue();
                String queryParameter159 = uri.getQueryParameter("currency");
                if (queryParameter159 == null || (queryParameter92 = uri.getQueryParameter("transfer_id")) == null || (queryParameter93 = uri.getQueryParameter("target_agreement_id")) == null || (queryParameter94 = uri.getQueryParameter("source_agreement_id")) == null) {
                    return null;
                }
                return new ShowFundDocsNoticeAction(doubleValue, queryParameter159, queryParameter92, queryParameter93, queryParameter94);
            case 1874204555:
                if (!path.equals("/intent") || (queryParameter95 = uri.getQueryParameter("url")) == null) {
                    return null;
                }
                if (!((Boolean) xz3Var.invoke(Uri.parse(queryParameter95))).booleanValue()) {
                    queryParameter95 = null;
                }
                if (queryParameter95 == null) {
                    return null;
                }
                return new IntentAction(queryParameter95);
            case 1910553689:
                if (path.equals("/split_qr_tooltip")) {
                    return SplitQrTooltipAction.INSTANCE;
                }
                return null;
            case 1931185926:
                if (!path.equals("/esia_app2app") || (queryParameter96 = uri.getQueryParameter("url")) == null) {
                    return null;
                }
                if (!((Boolean) xz3Var.invoke(Uri.parse(queryParameter96))).booleanValue()) {
                    queryParameter96 = null;
                }
                if (queryParameter96 == null) {
                    return null;
                }
                return new EsiaApp2appAction(queryParameter96);
            case 1936557740:
                if (path.equals("/resolve_qr_detailed") && (queryParameter97 = uri.getQueryParameter("qr")) != null) {
                    return new ResolveQrDetailedAction(queryParameter97);
                }
                return null;
            case 1994489993:
                if (path.equals("/notifications_settings")) {
                    return NotificationsSettingsAction.INSTANCE;
                }
                return null;
            case 2033784618:
                if (path.equals("/skip_registration")) {
                    return new SkipRegistrationAction(uri.getQueryParameter("ymevent"));
                }
                return null;
            case 2065456841:
                if (path.equals("/personal_wallet")) {
                    return PersonalWalletAction.INSTANCE;
                }
                return null;
            case 2067066179:
                if (path.equals("/share_pdf")) {
                    return SharePdfAction.INSTANCE;
                }
                return null;
            case 2070860603:
                if (path.equals("/add_account_for_topup")) {
                    return AddAccountForTopupAction.INSTANCE;
                }
                return null;
            case 2108127771:
                if (path.equals("/single_card_details")) {
                    return new SingleCardDetailsAction(uri.getQueryParameter("card_id"), uri.getQueryParameter("product_id"));
                }
                return null;
            case 2111922721:
                if (path.equals("/account_details") && (queryParameter98 = uri.getQueryParameter("agreement_id")) != null) {
                    return new AccountDetailsAction(queryParameter98);
                }
                return null;
            case 2119266282:
                if (path.equals("/start_session")) {
                    return StartSessionAction.INSTANCE;
                }
                return null;
            case 2124460142:
                if (path.equals("/external_member_binding_disable") && (queryParameter99 = uri.getQueryParameter("member_id")) != null) {
                    return new ExternalMemberBindingDisableAction(queryParameter99);
                }
                return null;
            default:
                return null;
        }
    }
}
