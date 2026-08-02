package com.squareup.cash.score.views;

import app.cash.broadway.ui.compose.DialogListenerEvent;
import com.squareup.cash.account.settings.viewmodels.AllowedAccountsSectionViewEvent$TapViewAll;
import com.squareup.cash.account.settings.viewmodels.BlockedAccountsSectionViewEvent$TapViewAll;
import com.squareup.cash.account.settings.viewmodels.PersonalizedAdsSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityPrivacyViewEvent$ManageIncomingRequests;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewEvent;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemSelected;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewEvent;
import com.squareup.cash.qrcodes.viewmodels.CashtagQrScanViewEvent;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewEvent;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.UpsellCardEvent;
import com.squareup.cash.score.viewmodels.ScoreHomeViewEvent;
import com.squareup.lending.CashCreditScoreHomeData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.ByteString;

/* loaded from: classes7.dex */
public final /* synthetic */ class InfoSectionKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ InfoSectionKt$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new ScoreHomeViewEvent.Action(new CashCreditScoreHomeData.Action(str, null, null, ByteString.EMPTY), null));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new ProfilePrivacyViewEvent.PersonalizedAdsEvent(new PersonalizedAdsSectionViewEvent.OpenUrl(str2)));
                break;
            case 2:
                function1.invoke(new ProfilePrivacyViewEvent.ToggleContactsSync(((Boolean) obj).booleanValue()));
                break;
            case 3:
                AllowedAccountsSectionViewEvent$TapViewAll allowedAccountsSectionViewEvent$TapViewAll = (AllowedAccountsSectionViewEvent$TapViewAll) obj;
                allowedAccountsSectionViewEvent$TapViewAll.getClass();
                function1.invoke(new ProfilePrivacyViewEvent.AllowedAccountsEvent(allowedAccountsSectionViewEvent$TapViewAll));
                break;
            case 4:
                BlockedAccountsSectionViewEvent$TapViewAll blockedAccountsSectionViewEvent$TapViewAll = (BlockedAccountsSectionViewEvent$TapViewAll) obj;
                blockedAccountsSectionViewEvent$TapViewAll.getClass();
                function1.invoke(new ProfilePrivacyViewEvent.BlockedAccountsEvent(blockedAccountsSectionViewEvent$TapViewAll));
                break;
            case 5:
                ((ProfileSecurityPrivacyViewEvent$ManageIncomingRequests) obj).getClass();
                function1.invoke(ProfilePrivacyViewEvent.ManageIncomingRequests.INSTANCE);
                break;
            case 6:
                ((ProfilePrivacyViewEvent) obj).getClass();
                function1.invoke(ProfilePrivacyViewEvent.ManageSearchVisibility.INSTANCE);
                break;
            case 7:
                ((ProfileSecurityViewEvent) obj).getClass();
                function1.invoke(ProfileSecurityViewEvent.ManageSecurityLock.INSTANCE);
                break;
            case 8:
                ProfilePasscodeSectionViewEvent profilePasscodeSectionViewEvent = (ProfilePasscodeSectionViewEvent) obj;
                profilePasscodeSectionViewEvent.getClass();
                function1.invoke(new ProfileSecurityViewEvent.PasscodeEventWrapper(profilePasscodeSectionViewEvent));
                break;
            case 9:
                TrustedContactSettingViewEvent trustedContactSettingViewEvent = (TrustedContactSettingViewEvent) obj;
                trustedContactSettingViewEvent.getClass();
                function1.invoke(new ProfileSecurityViewEvent.TrustedContactViewEventWrapper(trustedContactSettingViewEvent));
                break;
            case 10:
                ProfileSecurityViewEvent profileSecurityViewEvent = (ProfileSecurityViewEvent) obj;
                profileSecurityViewEvent.getClass();
                function1.invoke(profileSecurityViewEvent);
                break;
            case 11:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                boolean z = dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled;
                CashQrScannerViewEvent.Exit exit = CashQrScannerViewEvent.Exit.INSTANCE;
                if (!z) {
                    if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else if (((DialogListenerEvent.OnDialogResult) dialogListenerEvent).screen instanceof FailureMessageBlockerScreen) {
                        function1.invoke(exit);
                    }
                } else if (((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent).screen instanceof FailureMessageBlockerScreen) {
                    function1.invoke(exit);
                }
                break;
            case 12:
                if (((Integer) obj).intValue() == 0) {
                    function1.invoke(CashQrScannerViewEvent.MyCode.INSTANCE);
                }
                break;
            case 13:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new CashQrScannerViewEvent.CodeScanned(str3));
                break;
            case 14:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new CashtagQrScanViewEvent.CodeScanned(str4));
                break;
            case 15:
                DialogListenerEvent dialogListenerEvent2 = (DialogListenerEvent) obj;
                dialogListenerEvent2.getClass();
                function1.invoke(new QrAddressScannerViewEvent.DialogClosed(dialogListenerEvent2.getScreen()));
                break;
            case 16:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new QrAddressScannerViewEvent.ScanComplete(str5));
                break;
            case 17:
                PaymentPlanSummaryViewEvent.Submit submit = (PaymentPlanSummaryViewEvent.Submit) obj;
                submit.getClass();
                function1.invoke(submit);
                break;
            case 18:
                PaymentPlanSummaryViewEvent.Submit submit2 = (PaymentPlanSummaryViewEvent.Submit) obj;
                submit2.getClass();
                function1.invoke(submit2);
                break;
            case 19:
                String str6 = (String) obj;
                str6.getClass();
                function1.invoke(new PaymentPlanSummaryViewEvent.OpenUri(str6));
                break;
            case 20:
                String str7 = (String) obj;
                str7.getClass();
                function1.invoke(new PaymentPlanSummaryViewEvent.OpenUri(str7));
                break;
            case 21:
                String str8 = (String) obj;
                str8.getClass();
                function1.invoke(new PaymentPlanSummaryViewEvent.OpenUri(str8));
                break;
            case 22:
                PaymentPlanSummaryViewEvent.Submit submit3 = (PaymentPlanSummaryViewEvent.Submit) obj;
                submit3.getClass();
                function1.invoke(submit3);
                break;
            case 23:
                PaymentPlanSummaryViewEvent.Submit submit4 = (PaymentPlanSummaryViewEvent.Submit) obj;
                submit4.getClass();
                function1.invoke(submit4);
                break;
            case 24:
                String str9 = (String) obj;
                str9.getClass();
                function1.invoke(new PaymentPlanSummaryViewEvent.OpenUri(str9));
                break;
            case 25:
                AmountSelectorWidgetModel.Item item = (AmountSelectorWidgetModel.Item) obj;
                item.getClass();
                function1.invoke(new AmountPickerViewEvent$Condensed$ItemSelected(item));
                break;
            case 26:
                ((Float) obj).floatValue();
                function1.invoke(Boolean.TRUE);
                break;
            case 27:
                DialogListenerEvent dialogListenerEvent3 = (DialogListenerEvent) obj;
                dialogListenerEvent3.getClass();
                if (dialogListenerEvent3.getScreen() instanceof FailureMessageScreen) {
                    function1.invoke(SavingsScreenViewEvent.Exit.INSTANCE);
                }
                break;
            case 28:
                UpsellCardEvent upsellCardEvent = (UpsellCardEvent) obj;
                upsellCardEvent.getClass();
                function1.invoke(new SavingsScreenViewEvent.SavingsCardEvent(upsellCardEvent, SavingsScreenViewEvent.SavingsCardEvent.CardType.FULL));
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke(ScoreHomeViewEvent.FaqSectionVisible.INSTANCE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
