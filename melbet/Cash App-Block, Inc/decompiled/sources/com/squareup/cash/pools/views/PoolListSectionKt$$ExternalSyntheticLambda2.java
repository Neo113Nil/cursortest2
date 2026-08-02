package com.squareup.cash.pools.views;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.account.components.ProfilePreviewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.account.settings.viewmodels.ProfilePasswordDialogViewModel$MessageDialog;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestHelpViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayersSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPermissionsPromptSheetViewModel;
import com.squareup.cash.payments.viewmodels.NoteRequiredViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayDetailsViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.viewmodels.RecipientSelectionWarningViewModel;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewModel;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileModel;
import com.squareup.cash.pools.applets.presenters.ActivePool;
import com.squareup.cash.pools.applets.presenters.PoolIcon;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import com.squareup.cash.pools.viewmodels.PoolRow;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewModel;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutViewModel;
import com.squareup.cash.profile.viewmodels.TrustElementWidget;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.util.compose.StableHolder;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolListSectionKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PoolListSectionKt$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final Object invoke$com$squareup$cash$profile$views$TaxesPasswordDialogKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        ProfilePasswordDialogViewModel$MessageDialog profilePasswordDialogViewModel$MessageDialog = (ProfilePasswordDialogViewModel$MessageDialog) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            if (profilePasswordDialogViewModel$MessageDialog == null) {
                profilePasswordDialogViewModel$MessageDialog = null;
            }
            String str = profilePasswordDialogViewModel$MessageDialog != null ? profilePasswordDialogViewModel$MessageDialog.message : null;
            if (str == null) {
                gapComposer.startReplaceGroup(-1649497033);
            } else {
                gapComposer.startReplaceGroup(-1649497032);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        Icons icons;
        int i;
        Iterator it;
        long j2;
        Function2 function2;
        Icons icons2;
        Function2 function22;
        Function2 rememberComposableLambda;
        int i2 = this.$r8$classId;
        int i3 = 458752;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i4 = 6;
        Object obj4 = this.f$0;
        char c = 1;
        switch (i2) {
            case 0:
                PoolCategory poolCategory = (PoolCategory) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    PoolToastKt.NoPoolsPlaceholder(poolCategory, null, gapComposer, 0, 2);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                DistributionWheelViewModel.Content.EditSingleDistributionScreen editSingleDistributionScreen = (DistributionWheelViewModel.Content.EditSingleDistributionScreen) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    DistributionWheelViewModel.Content.EditSingleDistributionScreen.WheelIcon wheelIcon = editSingleDistributionScreen.icon;
                    if (wheelIcon == null) {
                        gapComposer2.startReplaceGroup(1380120501);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1380120502);
                        if (wheelIcon instanceof DistributionWheelViewModel.Content.EditSingleDistributionScreen.WheelIcon.Emoji) {
                            gapComposer2.startReplaceGroup(112276830);
                            VisibleKt.m3489EmojiIconDzVHIIc(((DistributionWheelViewModel.Content.EditSingleDistributionScreen.WheelIcon.Emoji) wheelIcon).iconId, 44.0f, null, null, gapComposer2, 48, 12);
                            gapComposer2.end(false);
                        } else {
                            if (!(wheelIcon instanceof DistributionWheelViewModel.Content.EditSingleDistributionScreen.WheelIcon.Image)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 112275645, false);
                            }
                            gapComposer2.startReplaceGroup(-814288069);
                            AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(((DistributionWheelViewModel.Content.EditSingleDistributionScreen.WheelIcon.Image) wheelIcon).image, gapComposer2), null, ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 36.0f), RoundedCornerShapeKt.CircleShape), null, null, null, gapComposer2, 48, 2040);
                            gapComposer2.end(false);
                        }
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                NoteRequiredViewModel noteRequiredViewModel = (NoteRequiredViewModel) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, noteRequiredViewModel.positiveButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                QuickPayDetailsViewModel quickPayDetailsViewModel = (QuickPayDetailsViewModel) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, quickPayDetailsViewModel.changePaymentOrientationButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                QuickPayViewModel.ToolbarWithAvatarViewModel toolbarWithAvatarViewModel = (QuickPayViewModel.ToolbarWithAvatarViewModel) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Icons icons3 = !toolbarWithAvatarViewModel.isInstrumentSelectionOpen ? Icons.Expand24 : Icons.Collapse24;
                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons3, (String) null, (Modifier) null, colors.semantic.icon.subtle, gapComposer5, 48, 4);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                RecipientSelectionWarningViewModel recipientSelectionWarningViewModel = (RecipientSelectionWarningViewModel) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recipientSelectionWarningViewModel.positiveButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                SchedulePaymentViewModel schedulePaymentViewModel = (SchedulePaymentViewModel) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, schedulePaymentViewModel.disclaimerText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Reaction reaction = (Reaction) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    String str = reaction.data;
                    str.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(R.string.replied_with, new Object[]{str}, gapComposer8), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                PaymentConfigurationViewModel.InputAmount inputAmount = (PaymentConfigurationViewModel.InputAmount) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, inputAmount.buttonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                SectionViewModel sectionViewModel = (SectionViewModel) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(-1337813952, new PdfPreviewViewKt$$ExternalSyntheticLambda2(sectionViewModel, 5), gapComposer10), (Modifier) null, (Function2) null, (Function0) null, (Function2) null, gapComposer10, 6, 30);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                NearbyPayRequestHelpViewModel nearbyPayRequestHelpViewModel = (NearbyPayRequestHelpViewModel) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPayRequestHelpViewModel.moreInfoButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    NearbyPayRequestViewKt.NearbyPayersSheetContent(nearbyPayersSheetViewModel, SpacerKt.padding(companion, paddingValues), gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                NearbyPermissionsPromptSheetViewModel.Ready ready = (NearbyPermissionsPromptSheetViewModel.Ready) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ready.buttonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                WirelessProviderListViewModel.Content content = (WirelessProviderListViewModel.Content) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                PhonePlansAppletTileModel.Installed.Status status = ((PhonePlansAppletTileModel.Installed) obj4).status;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    switch (status.ordinal()) {
                        case 0:
                        case 5:
                            gapComposer15.startReplaceGroup(1022421050);
                            Colors colors2 = (Colors) gapComposer15.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                            } else {
                                gapComposer15.startReplaceGroup(-1762997739);
                                gapComposer15.end(false);
                            }
                            j = colors2.semantic.background.warning;
                            gapComposer15.end(false);
                            break;
                        case 1:
                            gapComposer15.startReplaceGroup(1022423706);
                            Colors colors3 = (Colors) gapComposer15.consume(ArcadeThemeKt.LocalColors);
                            if (colors3 == null) {
                                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                            } else {
                                gapComposer15.startReplaceGroup(-1762997739);
                                gapComposer15.end(false);
                            }
                            j = colors3.semantic.background.inverse;
                            gapComposer15.end(false);
                            break;
                        case 2:
                        case 7:
                            gapComposer15.startReplaceGroup(1022431897);
                            Colors colors4 = (Colors) gapComposer15.consume(ArcadeThemeKt.LocalColors);
                            if (colors4 == null) {
                                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                            } else {
                                gapComposer15.startReplaceGroup(-1762997739);
                                gapComposer15.end(false);
                            }
                            j = colors4.semantic.background.danger;
                            gapComposer15.end(false);
                            break;
                        case 3:
                        case 4:
                        case 6:
                            gapComposer15.startReplaceGroup(1022428216);
                            Colors colors5 = (Colors) gapComposer15.consume(ArcadeThemeKt.LocalColors);
                            if (colors5 == null) {
                                colors5 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                            } else {
                                gapComposer15.startReplaceGroup(-1762997739);
                                gapComposer15.end(false);
                            }
                            j = colors5.semantic.background.brand;
                            gapComposer15.end(false);
                            break;
                        default:
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer15, 1022417657, false);
                    }
                    long j3 = j;
                    switch (status.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            icons = Icons.Next24;
                            break;
                        case 4:
                        case 6:
                            icons = Icons.DeviceTap24;
                            break;
                        case 5:
                        case 7:
                            icons = Icons.Alert32;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                    }
                    Icons icons4 = icons;
                    Colors colors6 = (Colors) gapComposer15.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                    } else {
                        gapComposer15.startReplaceGroup(-1762997739);
                        gapComposer15.end(false);
                    }
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j3, icons4, colors6.semantic.icon.inverse, RecyclerView.DECELERATION_RATE, gapComposer15, 0, 8);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                PoolIcon.Pool pool = ((ActivePool) obj4).icon;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    ImmutableList avatarEntries = PoolsAppletTileKt.toAvatarEntries(pool.participants, gapComposer16);
                    PoolAvatarSize poolAvatarSize = PoolAvatarSize.SizeServiceApplet;
                    float f = pool.progressPercent;
                    Colors colors7 = (Colors) gapComposer16.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    PoolToastKt.m3717PoolAvatarnxwB2Kw(avatarEntries, poolAvatarSize, null, 0L, f, 4.0f, 4.0f, 0L, colors7.surface.money.applet.data.inactive.border, null, gapComposer16, 1769520, 652);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                PoolRow poolRow = (PoolRow) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RealCellActivityAvatarScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    ImmutableList avatarEntries2 = PoolToastKt.toAvatarEntries(poolRow.participants, gapComposer17);
                    PoolAvatarSize poolAvatarSize2 = PoolAvatarSize.Size48;
                    float f2 = poolRow.goalProgressPercent;
                    Colors colors8 = (Colors) gapComposer17.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer17, -1762997026, gapComposer17, false);
                    } else {
                        gapComposer17.startReplaceGroup(-1762997739);
                        gapComposer17.end(false);
                    }
                    PoolToastKt.m3717PoolAvatarnxwB2Kw(avatarEntries2, poolAvatarSize2, null, 0L, f2, 2.5f, 2.5f, colors8.semantic.background.brand, 0L, null, gapComposer17, 1769520, 780);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                TextIndentKt textIndentKt = (TextIndentKt) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (!gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    gapComposer18.skipToGroupEnd();
                } else if (textIndentKt instanceof InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData) {
                    gapComposer18.startReplaceGroup(1829348269);
                    InvestingGraphTabsViewKt.UpToDateSubtitle((InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData) textIndentKt, gapComposer18, 0);
                    gapComposer18.end(false);
                } else {
                    if (!(textIndentKt instanceof InvestingHomePortfolioHeaderContentModel$Subtitle$StaleData)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer18, -1465011014, false);
                    }
                    gapComposer18.startReplaceGroup(1829429272);
                    InvestingGraphTabsViewKt.StaleSubtitle(gapComposer18, 0);
                    gapComposer18.end(false);
                }
                return Unit.INSTANCE;
            case 18:
                PrepurchaseCashCardPlanningViewModel.LoadableButton loadableButton = (PrepurchaseCashCardPlanningViewModel.LoadableButton) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((PrepurchaseCashCardPlanningViewModel.LoadableButton.Loaded) loadableButton).text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ButtonProminence buttonProminence = (ButtonProminence) obj4;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Colors colors9 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                    if (colors9 == null) {
                        colors9 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    long j4 = colors9.semantic.background.subtle;
                    ((DefaultSizes) gapComposer20.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj5 = DefaultSizes.border.entries;
                    Modifier alpha = AlphaKt.alpha(ImageKt.m177backgroundbw27NRU(fillMaxWidth, j4, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), RecyclerView.DECELERATION_RATE);
                    Object rememberedValue = gapComposer20.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new DateScrubber$$ExternalSyntheticLambda0(14);
                        gapComposer20.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, alpha, buttonProminence, false, false, null, LocaleToggleKt.f578lambda$645750843, gapComposer20, 1597446, 40);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlock textBlock = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlock) obj4;
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((GapComposer) composer21).changed(listUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                    Iterator it2 = textBlock.listItems.iterator();
                    while (it2.hasNext()) {
                        PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlockListItem textBlockListItem = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlockListItem) it2.next();
                        int ordinal = textBlockListItem.style.ordinal();
                        if (ordinal == 0) {
                            i = i3;
                            it = it2;
                            gapComposer21.startReplaceGroup(-850953788);
                            Colors colors10 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                            if (colors10 == null) {
                                colors10 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                            } else {
                                gapComposer21.startReplaceGroup(-1762997739);
                                gapComposer21.end(false);
                            }
                            j2 = colors10.semantic.text.subtle;
                            gapComposer21.end(false);
                        } else {
                            if (ordinal != 1) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer21, -850957114, false);
                            }
                            gapComposer21.startReplaceGroup(-850950746);
                            Colors colors11 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                            if (colors11 == null) {
                                colors11 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                            } else {
                                gapComposer21.startReplaceGroup(-1762997739);
                                gapComposer21.end(false);
                            }
                            i = i3;
                            it = it2;
                            j2 = colors11.semantic.text.standard;
                            gapComposer21.end(false);
                        }
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1478463584, new LoanDetailsSheetKt$$ExternalSyntheticLambda8(textBlockListItem, j2, i4), gapComposer21);
                        String str2 = textBlockListItem.trailingText;
                        if (str2 == null) {
                            gapComposer21.startReplaceGroup(-609076691);
                            gapComposer21.end(false);
                            function2 = null;
                        } else {
                            gapComposer21.startReplaceGroup(-609076690);
                            Function2 rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-358813928, new PoolListSectionKt$$ExternalSyntheticLambda17(str2, j2, c == true ? 1 : 0), gapComposer21);
                            gapComposer21.end(false);
                            function2 = rememberComposableLambda3;
                        }
                        listUnorderedScope.ListUnorderedItem(rememberComposableLambda2, (Modifier) null, (Function2) null, function2, (Function2) null, gapComposer21, ((intValue21 << 15) & i) | 6, 22);
                        it2 = it;
                        i3 = i;
                    }
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet prepurchaseCardPaymentPlanOptionsSheet = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, prepurchaseCardPaymentPlanOptionsSheet.primaryButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                DeviceManagerConfirmRemoveDevicesScreen deviceManagerConfirmRemoveDevicesScreen = (DeviceManagerConfirmRemoveDevicesScreen) obj4;
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Object value = deviceManagerConfirmRemoveDevicesScreen.deviceName.getValue();
                    value.getClass();
                    String format2 = new MessageFormat(Room.stringResource(gapComposer23, R.string.device_manager_confirm_remove_device_message)).format(new Object[]{value});
                    format2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                DeviceManagerListViewModel.DeviceListSection deviceListSection = (DeviceManagerListViewModel.DeviceListSection) obj4;
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    ViewfinderDefaults.SectionHeader(deviceListSection.sectionHeader, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer24, 0, 30);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                DeviceManagerListViewModel.DeviceAction deviceAction = (DeviceManagerListViewModel.DeviceAction) obj4;
                Composer composer25 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deviceAction.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                DeviceManagerListViewModel deviceManagerListViewModel = (DeviceManagerListViewModel) obj4;
                Composer composer26 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer26, null);
                    ((DefaultSizes) gapComposer26.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    String str3 = deviceManagerListViewModel.subtitle;
                    TextStyle textStyle = ((Typography) gapComposer26.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors12 = (Colors) gapComposer26.consume(ArcadeThemeKt.LocalColors);
                    if (colors12 == null) {
                        colors12 = re$$ExternalSyntheticOutline0.m(gapComposer26, -1762997026, gapComposer26, false);
                    } else {
                        gapComposer26.startReplaceGroup(-1762997739);
                        gapComposer26.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors12.semantic.text.subtle, (Composer) gapComposer26, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer26, null);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ProfileConfirmSignOutViewModel profileConfirmSignOutViewModel = (ProfileConfirmSignOutViewModel) obj4;
                Composer composer27 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer27;
                if (gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer27, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, profileConfirmSignOutViewModel.message, (Map) null, (Function1) null, false);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                GenericProfileElementViewModel.TrustIndicatorsWidget trustIndicatorsWidget = (GenericProfileElementViewModel.TrustIndicatorsWidget) obj4;
                ListUnorderedScope listUnorderedScope2 = (ListUnorderedScope) obj;
                Composer composer28 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                listUnorderedScope2.getClass();
                if ((intValue28 & 6) == 0) {
                    intValue28 |= ((GapComposer) composer28).changed(listUnorderedScope2) ? 4 : 2;
                }
                GapComposer gapComposer28 = (GapComposer) composer28;
                if (gapComposer28.shouldExecute(intValue28 & 1, (intValue28 & 19) != 18)) {
                    for (TrustElementWidget trustElementWidget : trustIndicatorsWidget.trustIndicators) {
                        String str4 = trustElementWidget.arcadeIconId;
                        if (str4 != null) {
                            Icons.Companion.getClass();
                            icons2 = zzd.get(str4);
                        } else {
                            icons2 = null;
                        }
                        StableHolder stableHolder = trustElementWidget.icon;
                        Image image = stableHolder != null ? (Image) stableHolder.model : null;
                        ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(1703264406, new PdfPreviewViewKt$$ExternalSyntheticLambda2(trustElementWidget, 17), gapComposer28);
                        if (icons2 != null) {
                            gapComposer28.startReplaceGroup(-2100436144);
                            rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1538743664, new InfoSectionKt$$ExternalSyntheticLambda6(icons2, 21), gapComposer28);
                            gapComposer28.end(false);
                        } else if (image != null) {
                            gapComposer28.startReplaceGroup(-2100295280);
                            rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1863094215, new ProfilePreviewKt$$ExternalSyntheticLambda9(image, r6), gapComposer28);
                            gapComposer28.end(false);
                        } else {
                            gapComposer28.startReplaceGroup(-2099898295);
                            gapComposer28.end(false);
                            function22 = null;
                            listUnorderedScope2.ListUnorderedItem(rememberComposableLambda4, (Modifier) null, function22, (Function2) null, (Function2) null, gapComposer28, ((intValue28 << 15) & 458752) | 6, 26);
                        }
                        function22 = rememberComposableLambda;
                        listUnorderedScope2.ListUnorderedItem(rememberComposableLambda4, (Modifier) null, function22, (Function2) null, (Function2) null, gapComposer28, ((intValue28 << 15) & 458752) | 6, 26);
                    }
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                return invoke$com$squareup$cash$profile$views$TaxesPasswordDialogKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            default:
                ContactMethodDetailsViewModel contactMethodDetailsViewModel = (ContactMethodDetailsViewModel) obj4;
                Composer composer29 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer29;
                if (gapComposer29.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer29, null);
                    ViewfinderDefaults.SectionHeader(contactMethodDetailsViewModel.title, (Modifier) null, (String) null, (Function0) null, contactMethodDetailsViewModel.body, gapComposer29, 0, 14);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
