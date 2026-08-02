package com.squareup.cash.blockers.views;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.blockers.viewmodels.ContactsPermissionExplanationSheetEvent;
import com.squareup.cash.blockers.viewmodels.GpsExplainerViewEvent;
import com.squareup.cash.blockers.viewmodels.SelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.SetNameEvent;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewEvent;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewEvent;
import com.squareup.cash.card.onboarding.DisclosureViewEvent;
import com.squareup.cash.cashapppay.viewmodels.GrantViewEvent;
import com.squareup.cash.checks.CaptureCheckFaceKt;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmPmdExplainerViewEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSetupEvent;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewEvent;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import com.squareup.cash.earningstracker.viewmodels.NetEarningsInfoSheetViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsViewEvent;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class SsnViewKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda12(int i, int i2, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(0, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, AmountBlockerViewKt.f294lambda$368426836, gapComposer, 1572912, 60);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                function1.invoke(new GpsExplainerViewEvent.UrlClicked(str));
                break;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Icons icons = Icons.CameraFill24;
                    String stringResource = Room.stringResource(gapComposer2, R.string.blockers_input_card_scan_card_button_content_description);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CashtagViewKt$$ExternalSyntheticLambda6(25, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    StorageUtil.ButtonIcon(icons, stringResource, (Function0) rememberedValue2, null, false, null, gapComposer2, 6, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                ((String) obj2).getClass();
                function1.invoke(new SelectionViewEvent.LinkClick(str2));
                break;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                ((String) obj2).getClass();
                function1.invoke(new SetNameEvent.FooterUrlClicked(str3));
                break;
            case 5:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new SsnViewKt$$ExternalSyntheticLambda14(9, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth2, null, false, false, null, AmountBlockerViewKt.lambda$1667681200, gapComposer3, 1572912, 60);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 6:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function1.invoke(ContactsPermissionExplanationSheetEvent.OnPrivacyNoticeClick.INSTANCE);
                break;
            case 7:
                String str4 = (String) obj;
                str4.getClass();
                ((String) obj2).getClass();
                function1.invoke(new FirstTimeBorrowViewEvent.NoticeLinkClick(str4));
                break;
            case 8:
                String str5 = (String) obj;
                str5.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BorrowLimitHubViewEvent.OpenUrl(str5));
                break;
            case 9:
                String str6 = (String) obj;
                str6.getClass();
                ((String) obj2).getClass();
                function1.invoke(new DisclosureViewEvent.OpenUrl(str6));
                break;
            case 10:
                String str7 = (String) obj;
                str7.getClass();
                ((String) obj2).getClass();
                function1.invoke(str7);
                break;
            case 11:
                String str8 = (String) obj;
                str8.getClass();
                ((String) obj2).getClass();
                function1.invoke(str8);
                break;
            case 12:
                String str9 = (String) obj;
                str9.getClass();
                ((String) obj2).getClass();
                function1.invoke(new GrantViewEvent.UrlClicked(str9));
                break;
            case 13:
                String str10 = (String) obj;
                str10.getClass();
                ((String) obj2).getClass();
                function1.invoke(new GrantViewEvent.UrlClicked(str10));
                break;
            case 14:
                String str11 = (String) obj;
                str11.getClass();
                ((String) obj2).getClass();
                function1.invoke(new GrantViewEvent.UrlClicked(str11));
                break;
            case 15:
                String str12 = (String) obj;
                str12.getClass();
                ((String) obj2).getClass();
                function1.invoke(new GrantViewEvent.UrlClicked(str12));
                break;
            case 16:
                String str13 = (String) obj;
                str13.getClass();
                ((String) obj2).getClass();
                function1.invoke(new GrantViewEvent.UrlClicked(str13));
                break;
            case 17:
                ((Integer) obj2).getClass();
                CaptureCheckFaceKt.PermissionDeniedPermanentlyDialog(function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 18:
                String str14 = (String) obj;
                str14.getClass();
                ((String) obj2).getClass();
                function1.invoke(new PaperMoneyDepositBarcodeEvent.OpenUrl(str14));
                break;
            case 19:
                String str15 = (String) obj;
                str15.getClass();
                ((String) obj2).getClass();
                function1.invoke(new AtmPmdExplainerViewEvent.LinkClicked(str15));
                break;
            case 20:
                String str16 = (String) obj;
                str16.getClass();
                ((String) obj2).getClass();
                function1.invoke(new AtmPmdExplainerViewEvent.LinkClicked(str16));
                break;
            case 21:
                String str17 = (String) obj;
                str17.getClass();
                ((String) obj2).getClass();
                function1.invoke(new DirectDepositSetupEvent.DisclosureUrlClicked(str17));
                break;
            case 22:
                ((Integer) obj2).getClass();
                DirectDepositFormErrorKt.SuccessContent(function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 23:
                String str18 = (String) obj;
                str18.getClass();
                ((String) obj2).getClass();
                function1.invoke(new EarningsHomeViewEvent.DisclosureUrlClicked(str18));
                break;
            case 24:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean changed4 = gapComposer4.changed(function1);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new EarningsHomeKt$$ExternalSyntheticLambda7(23, function1);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    SheetKt.Sheet((Function0) rememberedValue4, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-860174536, new ErrorView$$ExternalSyntheticLambda3(11, function1), gapComposer4), gapComposer4, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 25:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String stringResource2 = Room.stringResource(gapComposer5, R.string.earnings_tracker_net_earnings_info_sheet_message);
                    boolean changed5 = gapComposer5.changed(function1);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new SsnViewKt$$ExternalSyntheticLambda12(26, function1);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(stringResource2, (Function2) rememberedValue5, null, null, 0L, null, null, null, 0, 0, 0, gapComposer5, 0, 2044);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 26:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function1.invoke(NetEarningsInfoSheetViewEvent.ProcessingFeeClick.INSTANCE);
                break;
            case 27:
                String str19 = (String) obj;
                str19.getClass();
                ((String) obj2).getClass();
                function1.invoke(new DependentControlViewEvent.FooterLinkClicked(str19));
                break;
            case 28:
                String str20 = (String) obj;
                str20.getClass();
                ((String) obj2).getClass();
                function1.invoke(new DependentControlViewEvent.FooterLinkClicked(str20));
                break;
            default:
                String str21 = (String) obj;
                str21.getClass();
                ((String) obj2).getClass();
                function1.invoke(new DependentControlsAndLimitsViewEvent.LinkClicked(str21));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda12(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }
}
