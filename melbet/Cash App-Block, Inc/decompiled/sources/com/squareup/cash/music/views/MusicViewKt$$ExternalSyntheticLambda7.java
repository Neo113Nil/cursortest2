package com.squareup.cash.music.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.SectionHeaderScope;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.merchant.views.components.ActionNoticeKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionSheetPlaceholder;
import com.squareup.wire.AndroidMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class MusicViewKt$$ExternalSyntheticLambda7 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda7(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    private final Object invoke$com$squareup$cash$paymentpad$views$LitePaymentPadKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        titleBarActionScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            int i = intValue;
            Icons icons = Icons.NavigationScanQr;
            String stringResource = Room.stringResource(gapComposer, R.string.paymentpad_qr_button_description);
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HomeViewKt$$ExternalSyntheticLambda8(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, (i & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$ContactSyncDialogKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HomeViewKt$$ExternalSyntheticLambda8(18, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, QuickPayViewKt.lambda$867641571, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 20;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(15, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue, null, ButtonProminence.PROMINENT, false, false, null, TrackRowKt.f506lambda$1504506227, gapComposer, 1573248, 58);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(6, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue2, null, false, AppUpgradeViewKt.lambda$841213352, gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(8, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    modalButtonScope2.PrimaryModalButton((Function0) rememberedValue3, null, false, AppUpgradeViewKt.f439lambda$415131408, gapComposer3, ((intValue3 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean changed4 = gapComposer4.changed(function1);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(7, function1);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    modalButtonScope3.PrimaryModalButton((Function0) rememberedValue4, null, false, AppUpgradeViewKt.lambda$1728352753, gapComposer4, ((intValue4 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    boolean changed5 = gapComposer5.changed(function1);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(9, function1);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    modalButtonScope4.PrimaryModalButton((Function0) rememberedValue5, null, false, AppUpgradeViewKt.lambda$1185035021, gapComposer5, ((intValue5 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ModalButtonScope modalButtonScope5 = (ModalButtonScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                modalButtonScope5.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(modalButtonScope5) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    boolean changed6 = gapComposer6.changed(function1);
                    Object rememberedValue6 = gapComposer6.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(10, function1);
                        gapComposer6.updateRememberedValue(rememberedValue6);
                    }
                    modalButtonScope5.PrimaryModalButton((Function0) rememberedValue6, null, false, AppUpgradeViewKt.lambda$777011406, gapComposer6, ((intValue6 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ModalButtonScope modalButtonScope6 = (ModalButtonScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                modalButtonScope6.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(modalButtonScope6) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    boolean changed7 = gapComposer7.changed(function1);
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(21, function1);
                        gapComposer7.updateRememberedValue(rememberedValue7);
                    }
                    modalButtonScope6.SecondaryModalButton((Function0) rememberedValue7, null, false, ArcadeBordersKt.f444lambda$1926626053, gapComposer7, ((intValue7 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    int i3 = intValue8;
                    Icons icons = Icons.NavigationFilter;
                    String stringResource = Room.stringResource(gapComposer8, R.string.investing_components_category_details_navigation_filter);
                    boolean changed8 = gapComposer8.changed(function1);
                    Object rememberedValue8 = gapComposer8.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new InvestingNewsKt$$ExternalSyntheticLambda0(2, function1);
                        gapComposer8.updateRememberedValue(rememberedValue8);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue8, null, null, null, null, null, null, false, gapComposer8, (i3 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    int i4 = intValue9;
                    Icons icons2 = Icons.NavigationHelp;
                    String stringResource2 = Room.stringResource(gapComposer9, R.string.investing_components_order_type_selection_help);
                    boolean changed9 = gapComposer9.changed(function1);
                    Object rememberedValue9 = gapComposer9.rememberedValue();
                    if (changed9 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(6, function1);
                        gapComposer9.updateRememberedValue(rememberedValue9);
                    }
                    TransactorKt.IconAction(titleBarActionScope2, icons2, stringResource2, (Function0) rememberedValue9, null, null, null, null, null, null, false, gapComposer9, (i4 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                InviteContactsViewModel.InviteConsentBottomSheetViewModel inviteConsentBottomSheetViewModel = (InviteContactsViewModel.InviteConsentBottomSheetViewModel) obj;
                ((Integer) obj3).getClass();
                inviteConsentBottomSheetViewModel.getClass();
                GapComposer gapComposer10 = (GapComposer) ((Composer) obj2);
                boolean changed10 = gapComposer10.changed(function1) | gapComposer10.changedInstance(inviteConsentBottomSheetViewModel);
                Object rememberedValue10 = gapComposer10.rememberedValue();
                if (changed10 || rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = new IntentLauncher$$ExternalSyntheticLambda0(21, function1, inviteConsentBottomSheetViewModel);
                    gapComposer10.updateRememberedValue(rememberedValue10);
                }
                Function0 function0 = (Function0) rememberedValue10;
                boolean changed11 = gapComposer10.changed(function1);
                Object rememberedValue11 = gapComposer10.rememberedValue();
                if (changed11 || rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(24, function1);
                    gapComposer10.updateRememberedValue(rememberedValue11);
                }
                InviteErrorDialogKt.InviteConsentDialog(null, function0, (Function0) rememberedValue11, inviteConsentBottomSheetViewModel.title, inviteConsentBottomSheetViewModel.description, inviteConsentBottomSheetViewModel.buttonLabel, gapComposer10, 0, 1);
                return Unit.INSTANCE;
            case 10:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed12 = gapComposer11.changed(function1);
                    Object rememberedValue12 = gapComposer11.rememberedValue();
                    if (changed12 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new CashMapViewKt$$ExternalSyntheticLambda4(16, function1);
                        gapComposer11.updateRememberedValue(rememberedValue12);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue12, fillMaxWidth, null, false, false, null, MerchantProfileViewKt.f465lambda$1218660455, gapComposer11, 1572912, 60);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                GenericContainerViewModel.PlaceholderContainerViewModel placeholderContainerViewModel = (GenericContainerViewModel.PlaceholderContainerViewModel) obj;
                Composer composer11 = (Composer) obj2;
                ((Integer) obj3).getClass();
                placeholderContainerViewModel.getClass();
                AndroidMessage androidMessage = placeholderContainerViewModel.decodedProtoData;
                LoyaltyPromotionDetailsPlaceholder loyaltyPromotionDetailsPlaceholder = androidMessage instanceof LoyaltyPromotionDetailsPlaceholder ? (LoyaltyPromotionDetailsPlaceholder) androidMessage : null;
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (loyaltyPromotionDetailsPlaceholder == null) {
                    gapComposer12.startReplaceGroup(1427226876);
                    gapComposer12.end(false);
                } else {
                    gapComposer12.startReplaceGroup(1427226877);
                    ActionNoticeKt.SquareLoyaltyDetailsPlaceholder(null, loyaltyPromotionDetailsPlaceholder, function1, gapComposer12, 0);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            case 12:
                GenericContainerViewModel.PlaceholderContainerViewModel placeholderContainerViewModel2 = (GenericContainerViewModel.PlaceholderContainerViewModel) obj;
                Composer composer12 = (Composer) obj2;
                ((Integer) obj3).getClass();
                placeholderContainerViewModel2.getClass();
                AndroidMessage androidMessage2 = placeholderContainerViewModel2.decodedProtoData;
                LoyaltyPromotionSheetPlaceholder loyaltyPromotionSheetPlaceholder = androidMessage2 instanceof LoyaltyPromotionSheetPlaceholder ? (LoyaltyPromotionSheetPlaceholder) androidMessage2 : null;
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (loyaltyPromotionSheetPlaceholder == null) {
                    gapComposer13.startReplaceGroup(109601165);
                    gapComposer13.end(false);
                } else {
                    gapComposer13.startReplaceGroup(109601166);
                    ActionNoticeKt.SquareLoyaltySheetPlaceholder(null, loyaltyPromotionSheetPlaceholder, function1, gapComposer13, 0);
                    gapComposer13.end(false);
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer13 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed13 = gapComposer14.changed(function1);
                    Object rememberedValue13 = gapComposer14.rememberedValue();
                    if (changed13 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new CashMapViewKt$$ExternalSyntheticLambda4(21, function1);
                        gapComposer14.updateRememberedValue(rememberedValue13);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue13, fillMaxWidth2, null, false, false, null, ActionNoticeKt.f467lambda$1766412458, gapComposer14, 1572912, 60);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer14 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed14 = gapComposer15.changed(function1);
                    Object rememberedValue14 = gapComposer15.rememberedValue();
                    if (changed14 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new MoneyTabUIKt$$ExternalSyntheticLambda21(14, function1);
                        gapComposer15.updateRememberedValue(rememberedValue14);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue14, (Modifier) null, (Function3) null, gapComposer15, 54, 108);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer15 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Icons icons3 = Icons.Settings24;
                    String stringResource3 = Room.stringResource(gapComposer16, R.string.moneybot_overflow_menu_debug_tools);
                    String stringResource4 = Room.stringResource(gapComposer16, R.string.moneybot_overflow_menu_debug_tools);
                    boolean changed15 = gapComposer16.changed(function1);
                    Object rememberedValue15 = gapComposer16.rememberedValue();
                    if (changed15 || rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new MoneyTabUIKt$$ExternalSyntheticLambda21(27, function1);
                        gapComposer16.updateRememberedValue(rememberedValue15);
                    }
                    ExpandableContentKt.MoneybotOverflowMenuItem(null, icons3, stringResource3, stringResource4, false, (Function0) rememberedValue15, gapComposer16, 48);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer16 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    ExpandableContentKt.RecentChatHistoryPlaceholder(null, Expect_jvmKt.rememberComposableLambda(2003166151, new NfcNotAvailableKt$$ExternalSyntheticLambda0(i2, function1), gapComposer17), gapComposer17, 48);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                titleBarActionScope3.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer17).changed(titleBarActionScope3) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    Modifier titleBarIconBackground = LazyGridKt.titleBarIconBackground(gapComposer18, companion);
                    int i5 = intValue15;
                    Icons icons4 = Icons.Information24;
                    String stringResource5 = Room.stringResource(gapComposer18, R.string.moneybot_overflow_menu_terms_label);
                    boolean changed16 = gapComposer18.changed(function1);
                    Object rememberedValue16 = gapComposer18.rememberedValue();
                    if (changed16 || rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new MusicViewKt$$ExternalSyntheticLambda0(2, function1);
                        gapComposer18.updateRememberedValue(rememberedValue16);
                    }
                    TransactorKt.IconAction(titleBarActionScope3, icons4, stringResource5, (Function0) rememberedValue16, titleBarIconBackground, null, null, null, null, null, false, gapComposer18, (i5 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer18 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed17 = gapComposer19.changed(function1);
                    Object rememberedValue17 = gapComposer19.rememberedValue();
                    if (changed17 || rememberedValue17 == neverEqualPolicy) {
                        rememberedValue17 = new MusicViewKt$$ExternalSyntheticLambda0(16, function1);
                        gapComposer19.updateRememberedValue(rememberedValue17);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue17, (Modifier) null, (Function3) null, gapComposer19, 54, 108);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer19 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer19).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed18 = gapComposer20.changed(function1);
                    Object rememberedValue18 = gapComposer20.rememberedValue();
                    if (changed18 || rememberedValue18 == neverEqualPolicy) {
                        rememberedValue18 = new MusicViewKt$$ExternalSyntheticLambda0(18, function1);
                        gapComposer20.updateRememberedValue(rememberedValue18);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue18, horizontalWeight, null, false, false, null, NfcNotAvailableKt.f510lambda$977487790, gapComposer20, 1572864, 60);
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed19 = gapComposer20.changed(function1);
                    Object rememberedValue19 = gapComposer20.rememberedValue();
                    if (changed19 || rememberedValue19 == neverEqualPolicy) {
                        rememberedValue19 = new MusicViewKt$$ExternalSyntheticLambda0(19, function1);
                        gapComposer20.updateRememberedValue(rememberedValue19);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue19, horizontalWeight2, buttonProminence, false, false, null, NfcNotAvailableKt.f509lambda$101737669, gapComposer20, 1573248, 56);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer20 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    ComposableLambdaImpl composableLambdaImpl = AliasPickerViewKt.f525lambda$809852668;
                    ComposableLambdaImpl composableLambdaImpl2 = AliasPickerViewKt.f519lambda$2142651869;
                    boolean changed20 = gapComposer21.changed(function1);
                    Object rememberedValue20 = gapComposer21.rememberedValue();
                    if (changed20 || rememberedValue20 == neverEqualPolicy) {
                        rememberedValue20 = new P2PListViewKt$$ExternalSyntheticLambda0(13, function1);
                        gapComposer21.updateRememberedValue(rememberedValue20);
                    }
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(composableLambdaImpl, composableLambdaImpl2, null, (Function0) rememberedValue20, null, false, true, null, null, null, 0L, null, gapComposer21, 1572918, 0, 4020);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer21 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    PasskeyUpsellViewKt.PasskeyManagementTitleBar(function1, gapComposer22, 0);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer22 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    PasskeyUpsellViewKt.PasskeyManagementTitleBar(function1, gapComposer23, 0);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer23 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer23;
                if (gapComposer24.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed21 = gapComposer24.changed(function1);
                    Object rememberedValue21 = gapComposer24.rememberedValue();
                    if (changed21 || rememberedValue21 == neverEqualPolicy) {
                        rememberedValue21 = new HelpSheetViewKt$$ExternalSyntheticLambda2(10, function1);
                        gapComposer24.updateRememberedValue(rememberedValue21);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue21, fillMaxWidth3, buttonProminence2, false, false, null, PasskeyUpsellViewKt.f534lambda$1477876215, gapComposer24, 1573296, 56);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer24 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer24;
                if (gapComposer25.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    String stringResource6 = Room.stringResource(gapComposer25, R.string.paychecks_home_title);
                    NavigationType navigationType3 = NavigationType.BACK;
                    boolean changed22 = gapComposer25.changed(function1);
                    Object rememberedValue22 = gapComposer25.rememberedValue();
                    if (changed22 || rememberedValue22 == neverEqualPolicy) {
                        rememberedValue22 = new HelpSheetViewKt$$ExternalSyntheticLambda2(15, function1);
                        gapComposer25.updateRememberedValue(rememberedValue22);
                    }
                    DBUtil.TitleBarSub(stringResource6, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue22, (Modifier) null, (Function3) null, gapComposer25, 48, 108);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                TitleBarActionScope titleBarActionScope4 = (TitleBarActionScope) obj;
                Composer composer25 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                titleBarActionScope4.getClass();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((GapComposer) composer25).changed(titleBarActionScope4) ? 4 : 2;
                }
                GapComposer gapComposer26 = (GapComposer) composer25;
                if (gapComposer26.shouldExecute(intValue23 & 1, (intValue23 & 19) != 18)) {
                    int i6 = intValue23;
                    Icons icons5 = Icons.NavigationHelp;
                    String stringResource7 = Room.stringResource(gapComposer26, R.string.distribute_paycheck_help_button_accessibility_label);
                    boolean changed23 = gapComposer26.changed(function1);
                    Object rememberedValue23 = gapComposer26.rememberedValue();
                    if (changed23 || rememberedValue23 == neverEqualPolicy) {
                        rememberedValue23 = new HelpSheetViewKt$$ExternalSyntheticLambda2(20, function1);
                        gapComposer26.updateRememberedValue(rememberedValue23);
                    }
                    TransactorKt.IconAction(titleBarActionScope4, icons5, stringResource7, (Function0) rememberedValue23, null, null, null, null, null, null, false, gapComposer26, (i6 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                SectionHeaderScope sectionHeaderScope = (SectionHeaderScope) obj;
                Composer composer26 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                sectionHeaderScope.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer26).changed(sectionHeaderScope) ? 4 : 2;
                }
                GapComposer gapComposer27 = (GapComposer) composer26;
                if (gapComposer27.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    boolean changed24 = gapComposer27.changed(function1) | ((intValue24 & 14) == 4);
                    Object rememberedValue24 = gapComposer27.rememberedValue();
                    if (changed24 || rememberedValue24 == neverEqualPolicy) {
                        rememberedValue24 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(22, (Object) sectionHeaderScope, function1);
                        gapComposer27.updateRememberedValue(rememberedValue24);
                    }
                    sectionHeaderScope.DefaultHeaderContainer(ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) rememberedValue24, 15), Expect_jvmKt.rememberComposableLambda(-80996220, new SectionHeaderScope$$ExternalSyntheticLambda0(sectionHeaderScope, r4 ? 1 : 0), gapComposer27), gapComposer27, ((intValue24 << 6) & 896) | 48, 0);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                return invoke$com$squareup$cash$paymentpad$views$LitePaymentPadKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$payments$views$ContactSyncDialogKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            default:
                ModalButtonScope modalButtonScope7 = (ModalButtonScope) obj;
                Composer composer27 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                modalButtonScope7.getClass();
                if ((intValue25 & 6) == 0) {
                    intValue25 |= ((GapComposer) composer27).changed(modalButtonScope7) ? 4 : 2;
                }
                GapComposer gapComposer28 = (GapComposer) composer27;
                if (gapComposer28.shouldExecute(intValue25 & 1, (intValue25 & 19) != 18)) {
                    boolean changed25 = gapComposer28.changed(function1);
                    Object rememberedValue25 = gapComposer28.rememberedValue();
                    if (changed25 || rememberedValue25 == neverEqualPolicy) {
                        rememberedValue25 = new HomeViewKt$$ExternalSyntheticLambda8(19, function1);
                        gapComposer28.updateRememberedValue(rememberedValue25);
                    }
                    modalButtonScope7.SecondaryModalButton((Function0) rememberedValue25, null, false, QuickPayViewKt.lambda$204828496, gapComposer28, ((intValue25 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
