package com.squareup.cash.family.familyhub.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.google.android.gms.internal.mlkit_genai_prompt.zzie;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.earnings.backend.api.mapper.EarningsAllocationDistributionMappersKt;
import com.squareup.cash.earnings.backend.api.model.EarningsAllocationDistribution;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewModel;
import com.squareup.cash.earningstracker.viewmodels.Timeframe;
import com.squareup.cash.earningstracker.viewmodels.TimeframeViewModel;
import com.squareup.cash.earningstracker.views.NetEarningsInfoSheetViewKt;
import com.squareup.cash.earningstracker.views.components.LoadingErrorKt;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class AllowanceViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AllowanceViewKt$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AllowanceViewKt.LoadingShimmer((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors.semantic.background.brand, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.Deposit32, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 199734, 0, 2000);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AvatarSize avatarSize2 = AvatarSize.Size48;
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    TextViewKt.Avatar(avatarSize2, new AvatarEntry("", colors2.semantic.background.danger, null, new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), Room.stringResource(gapComposer2, R.string.direct_deposit_manual_completion_failure_avatar_content_desc), null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer2, 6, 28);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AvatarSize avatarSize3 = AvatarSize.Size48;
                    Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    TextViewKt.Avatar(avatarSize3, new AvatarEntry("", colors3.semantic.background.brand, null, new AvatarImage.LocalIcon(Icons.Check32, 0L, 6), Room.stringResource(gapComposer3, R.string.direct_deposit_manual_completion_avatar_content_desc), null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.direct_deposit_manual_form_esign_form), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.CurrencyUsd24, (String) null, (Modifier) null, 0L, gapComposer5, 54, 12);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.DiscountPercentage24, (String) null, (Modifier) null, 0L, gapComposer6, 54, 12);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.direct_deposit_manual_form_esign_form), (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                zabr.BoostAddedDecoration(companion, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                EarningsAllocationDistribution.DestinationAndShare destinationAndShare = (EarningsAllocationDistribution.DestinationAndShare) obj;
                EarningsAllocationDistribution.DestinationAndShare destinationAndShare2 = (EarningsAllocationDistribution.DestinationAndShare) obj2;
                long j = destinationAndShare.shareInBasisPoints;
                long j2 = destinationAndShare2.shareInBasisPoints;
                return Integer.valueOf(j == j2 ? Intrinsics.compare(EarningsAllocationDistributionMappersKt.defaultSortOrder(destinationAndShare.destination), EarningsAllocationDistributionMappersKt.defaultSortOrder(destinationAndShare2.destination)) : Intrinsics.compare(j, j2));
            case 10:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (!gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    String stringResource = Room.stringResource(gapComposer9, R.string.activity_list_screen_title);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Object rememberedValue = gapComposer9.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda14(24);
                        gapComposer9.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3836, 0L, (Composer) gapComposer9, SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (!gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (!gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.earnings_tracker_timeframe_selector_sheet_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    EarningsTimeframeSelectorSheetViewModel earningsTimeframeSelectorSheetViewModel = new EarningsTimeframeSelectorSheetViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new TimeframeViewModel[]{new TimeframeViewModel(Timeframe.MONTHLY, "Month", true), new TimeframeViewModel(Timeframe.YEARLY, "Year", false), new TimeframeViewModel(Timeframe.ALL_TIME, "All time", false)}));
                    Object rememberedValue2 = gapComposer13.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new StoryQueries$$ExternalSyntheticLambda0(8);
                        gapComposer13.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function1 = (Function1) rememberedValue2;
                    Colors colors4 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    NetEarningsInfoSheetViewKt.EarningsTimeframeSelectorSheet(earningsTimeframeSelectorSheetViewModel, function1, ImageKt.m177backgroundbw27NRU(companion, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), gapComposer13, 48);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    EarningsTimeframeSelectorSheetViewModel earningsTimeframeSelectorSheetViewModel2 = new EarningsTimeframeSelectorSheetViewModel(EmptyList.INSTANCE);
                    Object rememberedValue3 = gapComposer14.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new StoryQueries$$ExternalSyntheticLambda0(7);
                        gapComposer14.updateRememberedValue(rememberedValue3);
                    }
                    Function1 function12 = (Function1) rememberedValue3;
                    Colors colors5 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    NetEarningsInfoSheetViewKt.EarningsTimeframeSelectorSheet(earningsTimeframeSelectorSheetViewModel2, function12, ImageKt.m177backgroundbw27NRU(companion, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), gapComposer14, 48);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3836, 0L, (Composer) gapComposer15, SizeKt.fillMaxWidth(companion, 1.0f), (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.earnings_tracker_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.earnings_tracker_net_earnings_info_sheet_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Object rememberedValue4 = gapComposer17.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new StoryQueries$$ExternalSyntheticLambda0(9);
                        gapComposer17.updateRememberedValue(rememberedValue4);
                    }
                    Function1 function13 = (Function1) rememberedValue4;
                    Colors colors6 = (Colors) gapComposer17.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer17, -1762997026, gapComposer17, false);
                    } else {
                        gapComposer17.startReplaceGroup(-1762997739);
                        gapComposer17.end(false);
                    }
                    NetEarningsInfoSheetViewKt.NetEarningsInfoSheet(6, gapComposer17, ImageKt.m177backgroundbw27NRU(companion, colors6.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), function13);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.earnings_tracker_key_stats_total_earnings_cell_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    String stringResource2 = Room.stringResource(gapComposer19, R.string.earnings_tracker_key_stats_net_earnings_cell_title);
                    Painter painter = Icons.InformationFill16.painter(gapComposer19);
                    Colors colors7 = (Colors) gapComposer19.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    zzacp.m2014InlineIconTextQqsJerU(stringResource2, painter, null, colors7.semantic.icon.subtle, null, null, 0L, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer19, Painter.$stable << 3, 0, 32756);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer20, R.string.earnings_tracker_key_stats_number_of_cash_app_payments_cell_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer21, R.string.earnings_tracker_key_stats_number_of_ttp_payments_cell_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                LoadingErrorKt.NoCustomer((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                zzie.LoadingIndicator((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                FamilyAppletTileKt.AllowanceRedesignedVisual((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    FamilyAppletTileKt.AllowanceRedesignedVisual(gapComposer22, 0);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                GapComposer gapComposer23 = (GapComposer) ((Composer) obj);
                gapComposer23.startReplaceGroup(924321957);
                TextStyle textStyle = ((Typography) gapComposer23.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                gapComposer23.end(false);
                return textStyle;
            default:
                ((Integer) obj2).getClass();
                GapComposer gapComposer24 = (GapComposer) ((Composer) obj);
                gapComposer24.startReplaceGroup(1650983086);
                TextStyle textStyle2 = ((Typography) gapComposer24.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                gapComposer24.end(false);
                return textStyle2;
        }
    }

    public /* synthetic */ AllowanceViewKt$$ExternalSyntheticLambda3(int i, int i2) {
        this.$r8$classId = i2;
    }
}
