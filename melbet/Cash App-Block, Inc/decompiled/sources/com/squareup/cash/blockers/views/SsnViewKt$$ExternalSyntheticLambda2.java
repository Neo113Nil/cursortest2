package com.squareup.cash.blockers.views;

import android.icu.text.MessageFormat;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.UiScope;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.WalletAddressOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.deposits.copy.BitcoinDepositCopyViewModel;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinCardUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewModel$Loaded;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinOnboardingViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsViewKt;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewModel;
import com.squareup.cash.blockers.viewmodels.ConfirmableOptionViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.GpsExplainerViewModel;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.blockers.viewmodels.UnselectableOptionViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.common.composeui.InfoUpsellContentScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.util.compose.TransitionsKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.LocalDate;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class SsnViewKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda2(BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem) {
        this.$r8$classId = 5;
        this.f$0 = bitcoinPerformanceDetailsSectionInfoItem;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Icons icons;
        String str;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Icons icons2 = null;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                FocusRequester focusRequester = (FocusRequester) obj4;
                UiScope uiScope = (UiScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    gapComposer.skipToGroupEnd();
                } else if (TransitionsKt.isVisibleAndSettled(uiScope.$$delegate_0.getTransition())) {
                    gapComposer.startReplaceGroup(755402812);
                    Unit unit = Unit.INSTANCE;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new SsnViewKt$SsnContent$3$1$1(focusRequester, null, 0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(755468160);
                    gapComposer.end(false);
                }
                break;
            case 1:
                WalletAddressOptionsViewModel.Content content = (WalletAddressOptionsViewModel.Content) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content.copyAddressText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                BitcoinDepositCopyViewModel.Error error = (BitcoinDepositCopyViewModel.Error) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    String str2 = error.retryButtonText;
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.prominent, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((BitcoinTransferViewModel.Content) bitcoinTransferViewModel).getSubmitLabel(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel = (PaidInBitcoinCardUpsellViewModel) obj4;
                InfoUpsellContentScope infoUpsellContentScope = (InfoUpsellContentScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                infoUpsellContentScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(infoUpsellContentScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    for (PaidInBitcoinCardUpsellViewModel.SubItem subItem : paidInBitcoinCardUpsellViewModel.subItems) {
                        int i2 = subItem.iconRes;
                        if (i2 == R.drawable.ic_paid_in_bitcoin_deposit) {
                            icons = Icons.Investing24;
                        } else if (i2 != R.drawable.ic_percent) {
                            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Unrecognized icon resource: "));
                            break;
                        } else {
                            icons = Icons.DiscountPercentage24;
                        }
                        infoUpsellContentScope.InfoCell(icons, subItem.title, subItem.body, gapComposer5, (intValue5 << 15) & 458752);
                    }
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem = (BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    BitcoinPerformanceDetailsViewKt.InfoItemBottomSheetContent(bitcoinPerformanceDetailsSectionInfoItem, companion, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 6:
                StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stablecoinDepositViewModel$Loaded.networkName, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 7:
                StablecoinOnboardingViewModel stablecoinOnboardingViewModel = (StablecoinOnboardingViewModel) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stablecoinOnboardingViewModel.buttonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 8:
                BitcoinTransferViewModel.Content.FullScreenContent fullScreenContent = (BitcoinTransferViewModel.Content.FullScreenContent) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, fullScreenContent.submitLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 9:
                FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj4;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 0, gapComposer10, LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, companion));
                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, companion);
                    String format2 = new MessageFormat(Room.stringResource(gapComposer10, R.string.fileset_upload_attached_arcade)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(filesetUploadViewModel.attachedFiles.size()), InquiryField.FloatField.TYPE2));
                    format2.getClass();
                    ViewfinderDefaults.SectionHeader(format2, animateItem$default, (String) null, (Function0) null, (String) null, gapComposer10, 0, 28);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 10:
                AtmPickerAmountBlockerViewModel.AtmPicker atmPicker = (AtmPickerAmountBlockerViewModel.AtmPicker) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, atmPicker.buttonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 11:
                BankAccountLinkingViewModel bankAccountLinkingViewModel = (BankAccountLinkingViewModel) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    String str3 = (String) bankAccountLinkingViewModel.errorMessage.value;
                    if (str3 == null) {
                        gapComposer12.startReplaceGroup(-1506588876);
                    } else {
                        gapComposer12.startReplaceGroup(-1506588875);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    }
                    gapComposer12.end(false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 12:
                LocalDate localDate = (LocalDate) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyGridItemScopeImpl) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    CalendarDatePickerKt.CalendarMonth(CalendarDatePickerKt.getYearMonth(localDate), gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 13:
                CardActivationQrViewModel cardActivationQrViewModel = (CardActivationQrViewModel) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardActivationQrViewModel.button, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 14:
                ConfirmableOptionViewModel confirmableOptionViewModel = (ConfirmableOptionViewModel) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                int i3 = ConfirmableOptionView.$r8$clinit;
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, confirmableOptionViewModel.positiveButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 15:
                EarnerEnrollmentBlockerViewModel.Form form = (EarnerEnrollmentBlockerViewModel.Form) obj4;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, form.continueButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 16:
                EarnerEnrollmentBlockerViewModel.Success success = (EarnerEnrollmentBlockerViewModel.Success) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, success.doneButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 17:
                EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection = (EarnerEnrollmentBlockerViewModel.CategorySelection) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, categorySelection.continueButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 18:
                GpsExplainerViewModel gpsExplainerViewModel = (GpsExplainerViewModel) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, gpsExplainerViewModel.buttonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 19:
                GpsLocationConsentBlockerViewModel.Loaded loaded = (GpsLocationConsentBlockerViewModel.Loaded) obj4;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Icon icon = loaded.primaryButton.icon;
                    if (icon != null && (str = icon.arcade_id) != null) {
                        Icons.Companion.getClass();
                        icons2 = zzd.get(str);
                    }
                    Icons icons3 = icons2;
                    if (icons3 == null) {
                        gapComposer20.startReplaceGroup(-1501176672);
                    } else {
                        gapComposer20.startReplaceGroup(-1501176671);
                        Trace.m1191Iconww6aTOc(icons3, (String) null, (Modifier) null, 0L, gapComposer20, 48, 12);
                    }
                    gapComposer20.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded.primaryButton.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                break;
            case 20:
                OnboardingInternalRouteViewModel onboardingInternalRouteViewModel = (OnboardingInternalRouteViewModel) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, onboardingInternalRouteViewModel.errorButton, (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
            case 21:
                RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel = (RequestPushNotificationsBlockerViewModel) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, requestPushNotificationsBlockerViewModel.primaryButton, (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                break;
            case 22:
                HelpItem helpItem = (HelpItem) obj4;
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    String str4 = helpItem.text;
                    str4.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                break;
            case 23:
                SetNameViewModel setNameViewModel = (SetNameViewModel) obj4;
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    String str5 = setNameViewModel.buttonText;
                    if (str5 == null) {
                        str5 = re$$ExternalSyntheticOutline0.m(gapComposer24, 72799946, R.string.blockers_next, gapComposer24, false);
                    } else {
                        gapComposer24.startReplaceGroup(72799109);
                        gapComposer24.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                break;
            case 24:
                StatusResultViewModel statusResultViewModel = (StatusResultViewModel) obj4;
                Composer composer25 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    String str6 = ((StatusResultViewModel.Ready) statusResultViewModel).primaryButton.text;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str6 == null ? "" : str6, (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                break;
            case 25:
                StatusResultButton statusResultButton = (StatusResultButton) obj4;
                Composer composer26 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    String str7 = statusResultButton.text;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str7 == null ? "" : str7, (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                break;
            case 26:
                UnselectableOptionViewModel unselectableOptionViewModel = (UnselectableOptionViewModel) obj4;
                Composer composer27 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer27;
                if (gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer27, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, unselectableOptionViewModel.message, (Map) null, (Function1) null, false);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                break;
            case 27:
                BorrowHomeOverlayViewModel.InfoSheet infoSheet = (BorrowHomeOverlayViewModel.InfoSheet) obj4;
                Composer composer28 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer28;
                if (gapComposer28.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    BorrowHomeOverlayViewModel.SheetButton sheetButton = infoSheet.sheetButton;
                    sheetButton.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer28, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sheetButton.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                break;
            case 28:
                BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = (BorrowAppletBulletinsTile.Data.UpsellCard) obj4;
                Composer composer29 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer29;
                if (gapComposer29.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    LocalizedString localizedString = upsellCard.button_text;
                    if (localizedString == null) {
                        gapComposer29.startReplaceGroup(-92315282);
                    } else {
                        gapComposer29.startReplaceGroup(-92315281);
                        String str8 = localizedString.translated_value;
                        str8.getClass();
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer29, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                    }
                    gapComposer29.end(false);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                break;
            default:
                BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel creditLimitAndBorrowButtonTileModel = (BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel) obj4;
                Composer composer30 = (Composer) obj2;
                int intValue30 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer30 = (GapComposer) composer30;
                if (gapComposer30.shouldExecute(intValue30 & 1, (intValue30 & 17) != 16)) {
                    LocalizedString localizedString2 = creditLimitAndBorrowButtonTileModel.tileData.button_title;
                    localizedString2.getClass();
                    String str9 = localizedString2.translated_value;
                    str9.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer30, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                } else {
                    gapComposer30.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
