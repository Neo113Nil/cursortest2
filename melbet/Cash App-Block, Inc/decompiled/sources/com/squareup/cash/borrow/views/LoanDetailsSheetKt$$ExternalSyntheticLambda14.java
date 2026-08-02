package com.squareup.cash.borrow.views;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.WindowInfoImpl;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zza;
import com.knotapi.knot.utilities.Constants;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Illustrations;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.booklet.ui.BookletGridKt;
import com.squareup.cash.booklet.ui.BookletStyle;
import com.squareup.cash.booklet.ui.BookletStyleKt;
import com.squareup.cash.borrow.fixtures.BorrowCommonTestDataKt;
import com.squareup.cash.borrow.fixtures.BorrowHomeTestDataKt;
import com.squareup.cash.borrow.fixtures.BorrowOverlaysTestDataKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.bugreporting.views.BugReportingViewKt;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Illustration;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.LoanRepaymentSelectionData$Choice$Routing$ActionUrl;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.util.cash.Countries;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.pseudolocalization.MaybePseudoLocalizeKt;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes5.dex */
public final /* synthetic */ class LoanDetailsSheetKt$$ExternalSyntheticLambda14 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LoanDetailsSheetKt$$ExternalSyntheticLambda14(int i) {
        this.$r8$classId = i;
    }

    private final Object invoke$com$squareup$cash$bugreporting$views$ComposableSingletons$BugReportingViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.bug_reporting_add_more), (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bugreporting$views$ComposableSingletons$BugReportingViewKt$$ExternalSyntheticLambda9(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.bug_reporting_diagnostic_view_hierarchy), (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet createBulletinInfoSheet$default;
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet createBulletinInfoSheet$default2;
        int i = this.$r8$classId;
        int i2 = 5;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        switch (i) {
            case 0:
                return AnimatableKt.tween$default(20, 0, null, 6);
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BookletGridKt.m3424BookletTileeHTjO5g(null, "Lorem ipsum dolor sit amet consectetur", "Nulla fermentum malesuada commodo. Praesent tincidunt commodo ante ut elementum.", new Image("fake:///bufo-art.png", (String) null, 6), RecyclerView.DECELERATION_RATE, null, null, gapComposer, 25008, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Updater.CompositionLocalProvider(BookletStyleKt.LocalBookletStyle.defaultProvidedValue$runtime(BookletStyle.Default), BookletGridKt.lambda$886873452, gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    BookletGridKt.m3424BookletTileeHTjO5g(null, "Lorem ipsum dolor sit amet consectetur", "Nulla fermentum malesuada commodo. Praesent tincidunt commodo ante ut elementum.", new Image("fake:///bufo-art.png", (String) null, 6), RecyclerView.DECELERATION_RATE, null, null, gapComposer3, 25008, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Updater.CompositionLocalProvider(BookletStyleKt.LocalBookletStyle.defaultProvidedValue$runtime(BookletStyle.Evolution), BookletGridKt.f318lambda$471221710, gapComposer4, 56);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    BookletGridKt.m3424BookletTileeHTjO5g(null, "Lorem ipsum dolor sit amet consectetur", "Nulla fermentum malesuada commodo. Praesent tincidunt commodo ante ut elementum.", new Image("fake:///shrek.png", (String) null, 6), RecyclerView.DECELERATION_RATE, null, null, gapComposer5, 25008, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Updater.CompositionLocalProvider(BookletStyleKt.LocalBookletStyle.defaultProvidedValue$runtime(BookletStyle.Default), BookletGridKt.f316lambda$1436969450, gapComposer6, 56);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                BorrowHomeKt.Loading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    BoxKt.Box(SizeKt.m285size3ABfNKs(companion, 24.0f), gapComposer7, 6);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    Object rememberedValue = gapComposer8.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(i2);
                        gapComposer8.updateRememberedValue(rememberedValue);
                    }
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer8, SemanticsModifierKt.clearAndSetSemantics(m285size3ABfNKs, (Function1) rememberedValue));
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    Colors colors = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Trace.m1191Iconww6aTOc(Icons.Check24, (String) null, m285size3ABfNKs2, colors.semantic.icon.brand, gapComposer9, 438, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    BorrowAppletBulletinsTile.Data.Bulletin.Icon icon = BorrowAppletBulletinsTile.Data.Bulletin.Icon.BORROW_LOGO;
                    BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet createBulletinInfoSheet$default3 = BorrowOverlaysTestDataKt.createBulletinInfoSheet$default(null, null, 8191);
                    UiControl.Type.Companion companion2 = BorrowAppletBulletinsTile.Data.Bulletin.IconShape.Companion;
                    List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new SegmentedCircle.Segment[]{new SegmentedCircle.Segment(BorrowCommonTestDataKt.cashGreenColorProto), new SegmentedCircle.Segment(new Color(new Color.ModeVariant("#E8E8E8", null, null, null, null, 30, null), new Color.ModeVariant("#232323", null, null, null, null, 30, null), 4))});
                    ByteString byteString = ByteString.EMPTY;
                    BorrowAppletBulletinsTile.Data.Bulletin createBulletin$default = BorrowHomeTestDataKt.createBulletin$default(icon, "Borrow limit", "$200.00", createBulletinInfoSheet$default3, "bulletin-3", null, new SegmentedCircle(null, listOf, byteString), 424);
                    BorrowAppletBulletinsTile.Data.Bulletin createBulletin$default2 = BorrowHomeTestDataKt.createBulletin$default(null, null, null, null, "bulletin-0", null, null, 8095);
                    BorrowAppletBulletinsTile.Data.Bulletin.Icon icon2 = BorrowAppletBulletinsTile.Data.Bulletin.Icon.LIMIT_DECREASE;
                    createBulletinInfoSheet$default = BorrowOverlaysTestDataKt.createBulletinInfoSheet$default(BorrowAppletBulletinsTile.Data.Bulletin.Icon.LIMIT_DECREASE, BorrowCommonTestDataKt.dangerColorProto, 498);
                    BorrowAppletBulletinsTile.Data.Bulletin createBulletin$default3 = BorrowHomeTestDataKt.createBulletin$default(icon2, "Limit decreased", "$150 borrow limit", createBulletinInfoSheet$default, "bulletin-1", null, null, 7976);
                    BorrowAppletBulletinsTile.Data.Bulletin.Icon icon3 = BorrowAppletBulletinsTile.Data.Bulletin.Icon.ALERT;
                    createBulletinInfoSheet$default2 = BorrowOverlaysTestDataKt.createBulletinInfoSheet$default(BorrowAppletBulletinsTile.Data.Bulletin.Icon.LIMIT_DECREASE, BorrowCommonTestDataKt.dangerColorProto, 498);
                    BorrowAppletBulletinsTile.Data data = (BorrowAppletBulletinsTile.Data) MaybePseudoLocalizeKt.maybePseudoLocalize$default(new BorrowAppletBulletinsTile.Data(CollectionsKt__CollectionsKt.listOf((Object[]) new BorrowAppletBulletinsTile.Data.Bulletin[]{createBulletin$default, createBulletin$default2, createBulletin$default3, BorrowHomeTestDataKt.createBulletin$default(icon3, "Borrow unavailable", "{unavailable reason}", BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.copy$default(createBulletinInfoSheet$default2, null, null, null, null, null, null, StringsKt.localized("Repay now"), new LoanRepaymentSelectionData(StringsKt.localized("Select an amount to repay"), StringsKt.localized(Constants.META_CLOSE), CollectionsKt__CollectionsKt.listOf((Object[]) new LoanRepaymentSelectionData.Choice[]{new LoanRepaymentSelectionData.Choice(StringsKt.localized("Next repayment"), LoanRepaymentSelectionData.Choice.Icon.DATE, new LoanRepaymentSelectionData$Choice$Routing$ActionUrl("https://example.com/repayment-choice"), StringsKt.localized("$13.12"), Long.valueOf(LocalDate.of(2023, Month.MARCH, 28).atTime(12, 0).toInstant(ZoneOffset.ofHours(-7)).toEpochMilli()), 66), new LoanRepaymentSelectionData.Choice(StringsKt.localized("Remaining balance"), LoanRepaymentSelectionData.Choice.Icon.REMAINING, new LoanRepaymentSelectionData$Choice$Routing$ActionUrl("https://example.com/repayment-choice"), StringsKt.localized("$52.50"), null, 98), new LoanRepaymentSelectionData.Choice(StringsKt.localized("Other amount"), LoanRepaymentSelectionData.Choice.Icon.OTHER, new LoanRepaymentSelectionData$Choice$Routing$ActionUrl("https://example.com/repayment-choice"), StringsKt.localized("Other"), null, 98), new LoanRepaymentSelectionData.Choice(StringsKt.localized("Skip"), LoanRepaymentSelectionData.Choice.Icon.SKIP, new LoanRepaymentSelectionData$Choice$Routing$ActionUrl("https://example.com"), null, null, 114)}), byteString), null, null, null, 62975), "bulletin-2", BorrowCommonTestDataKt.dangerColorProto, null, 7720)}), null, byteString));
                    zza zzaVar = Illustrations.Companion;
                    LocalizedString localized = StringsKt.localized("Increase your Borrow limit to $300 with direct deposit");
                    LocalizedString localized2 = StringsKt.localized("Get higher limit");
                    ByteString byteString2 = ByteString.EMPTY;
                    BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = (BorrowAppletBulletinsTile.Data.UpsellCard) MaybePseudoLocalizeKt.maybePseudoLocalize$default(new BorrowAppletBulletinsTile.Data.UpsellCard(localized, null, new Illustration("CJljQU", null, byteString2), localized2, "https://example.com", "PDSA_UPSELL", byteString2));
                    List list = data.bulletins;
                    ByteString unknownFields = data.unknownFields();
                    list.getClass();
                    unknownFields.getClass();
                    BorrowHomeViewModel.Tile.BulletinTileModel bulletinTileModel = new BorrowHomeViewModel.Tile.BulletinTileModel(new BorrowAppletBulletinsTile.Data(list, upsellCard, unknownFields));
                    Object rememberedValue2 = gapComposer10.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(6);
                        gapComposer10.updateRememberedValue(rememberedValue2);
                    }
                    BorrowHomeKt.BulletinTile(bulletinTileModel, (Function1) rememberedValue2, null, gapComposer10, 48);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, 1);
                    Icons icons = Icons.Borrow32;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors2 = (Colors) gapComposer11.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(icons, colors2.component.avatar.text, 4);
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Colors colors3 = (Colors) gapComposer11.consume(staticProvidableCompositionLocal);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors3.semantic.background.brand, (String) null, m300paddingVpY3zN4$default, (AvatarImage) localIcon, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer11, 27702, 0, 1984);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    BorrowHomeOverlayViewModel.LoanDetails sheet = WindowInfoImpl.Companion.toSheet(BorrowHomeTestDataKt.createHistoryTileLoanDetails(true), "abc123");
                    Object rememberedValue3 = gapComposer12.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(8);
                        gapComposer12.updateRememberedValue(rememberedValue3);
                    }
                    LoanDetailsSheetKt.LoanDetailsSheet(sheet, (Function1) rememberedValue3, LoanDetailsSheetState.Details, null, gapComposer12, 432, 8);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    BorrowHomeOverlayViewModel.LoanDetails sheet2 = WindowInfoImpl.Companion.toSheet(BorrowHomeTestDataKt.createHistoryTileLoanDetails(true), "abc123");
                    Object rememberedValue4 = gapComposer13.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(7);
                        gapComposer13.updateRememberedValue(rememberedValue4);
                    }
                    LoanDetailsSheetKt.LoanDetailsSheet(sheet2, (Function1) rememberedValue4, LoanDetailsSheetState.Timeline, null, gapComposer13, 432, 8);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    BorrowAppletLoanHistoryTile.Data.Loan.Details createHistoryTileLoanDetails = BorrowHomeTestDataKt.createHistoryTileLoanDetails(true);
                    Timeline.Event.Icon icon4 = Timeline.Event.Icon.COMPLETED;
                    Timeline.Event event = new Timeline.Event(icon4, "Fri, Jan 31", "$13.12", null, null, null, null, null, null, "event1", null, null, null, null, null, null, 65016, null);
                    Timeline.Event event2 = new Timeline.Event(icon4, "Fri, Feb 7", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null);
                    Timeline.Event event3 = new Timeline.Event(icon4, "Fri, Feb 14", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null);
                    Timeline.Event event4 = new Timeline.Event(Timeline.Event.Icon.HIGHLIGHT, "Fri, Feb 21", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null);
                    Timeline.Event.Icon icon5 = Timeline.Event.Icon.NORMAL;
                    BorrowHomeOverlayViewModel.LoanDetails sheet3 = WindowInfoImpl.Companion.toSheet(BorrowAppletLoanHistoryTile.Data.Loan.Details.copy$default(createHistoryTileLoanDetails, null, null, null, (Timeline) MaybePseudoLocalizeKt.maybePseudoLocalize$default(new Timeline(CollectionsKt__CollectionsKt.listOf((Object[]) new Timeline.Event[]{event, event2, event3, event4, new Timeline.Event(icon5, "Fri, Feb 28", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null), new Timeline.Event(icon5, "Fri, Mar 6", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null), new Timeline.Event(icon5, "Fri, Mar 13", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null), new Timeline.Event(icon5, "Fri, Mar 20", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null), new Timeline.Event(icon5, "Fri, Mar 28", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null), new Timeline.Event(icon5, "Fri, Apr 4", "$13.12", null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null)}))), null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC), "abc123");
                    Object rememberedValue5 = gapComposer14.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(9);
                        gapComposer14.updateRememberedValue(rememberedValue5);
                    }
                    LoanDetailsSheetKt.LoanDetailsSheet(sheet3, (Function1) rememberedValue5, LoanDetailsSheetState.Timeline, null, gapComposer14, 432, 8);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    BorrowAppletLoanHistoryTile.Data.Loan.Details details = ((BorrowAppletLoanHistoryTile.Data.Loan) MaybePseudoLocalizeKt.maybePseudoLocalize$default(new BorrowAppletLoanHistoryTile.Data.Loan(StringsKt.localized("Dec 1"), StringsKt.localized("Canceled"), StringsKt.localized("+ $25"), new BorrowAppletLoanHistoryTile.Data.Loan.Details(StringsKt.localized("$25 on Dec 1"), StringsKt.localized("Canceled"), CollectionsKt__CollectionsKt.listOf((Object[]) new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row[]{new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Amount borrowed"), StringsKt.localized("$25"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("5% flat fee"), StringsKt.localized("$1.25"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Overdue interest"), StringsKt.localized("1.25%"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Canceled"), StringsKt.localized("Sun, Dec 1"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Repayment"), StringsKt.localized("4 Weekly"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(StringsKt.localized("Loan ID"), StringsKt.localized("X62EVCX1B"), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)}), new Timeline(CollectionsKt__CollectionsJVMKt.listOf(new Timeline.Event(Timeline.Event.Icon.CANCELED, "Sun, Dec 1", "$0", null, "Canceled", Timeline.Event.InlineTextFormat.SECONDARY, null, null, null, null, null, null, null, null, null, null, JpegConstants.SOF8_MARKER, null))), StringsKt.localized("Timeline"), StringsKt.localized("Details"), null, 960), (112 & 16) != 0 ? null : "loan-with-token", null, ByteString.EMPTY))).loan_details;
                    details.getClass();
                    BorrowHomeOverlayViewModel.LoanDetails sheet4 = WindowInfoImpl.Companion.toSheet(details, "abc123");
                    Object rememberedValue6 = gapComposer15.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(10);
                        gapComposer15.updateRememberedValue(rememberedValue6);
                    }
                    LoanDetailsSheetKt.LoanDetailsSheet(sheet4, (Function1) rememberedValue6, LoanDetailsSheetState.Timeline, null, gapComposer15, 432, 8);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Icons icons2 = Icons.Borrow24;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors4 = (Colors) gapComposer16.consume(staticProvidableCompositionLocal2);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    AvatarImage.LocalIcon localIcon2 = new AvatarImage.LocalIcon(icons2, colors4.component.avatar.text, 4);
                    AvatarSize avatarSize2 = AvatarSize.Size48;
                    Colors colors5 = (Colors) gapComposer16.consume(staticProvidableCompositionLocal2);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize2, "", colors5.semantic.icon.brand, (String) null, (Modifier) null, (AvatarImage) localIcon2, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer16, 3126, 0, 2000);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                BugReportingViewKt.TriangleShape((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.bug_reporting_diagnostic_back_stack), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.bug_reporting_diagnostic_logs), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer19, R.string.bug_reporting_diagnostic_database), (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer20, R.string.bug_reporting_diagnostic_preferences), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer21, R.string.bug_reporting_diagnostic_debug_preferences), (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer22, R.string.bug_reporting_diagnostic_sam_eligibility), (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    Modifier m285size3ABfNKs3 = SizeKt.m285size3ABfNKs(companion, 48.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalColors;
                    Colors colors6 = (Colors) gapComposer23.consume(staticProvidableCompositionLocal3);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs3, colors6.semantic.background.subtle, RoundedCornerShapeKt.CircleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer23.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer23.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer23, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer23.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer23.startReusableNode();
                    if (gapComposer23.inserting) {
                        gapComposer23.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer23.useNode();
                    }
                    Updater.m576setimpl(gapComposer23, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer23, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer23, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer23, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer23, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Icons icons3 = Icons.Add24;
                    Modifier m285size3ABfNKs4 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    Colors colors7 = (Colors) gapComposer23.consume(staticProvidableCompositionLocal3);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons3, "Add", m285size3ABfNKs4, colors7.semantic.icon.standard, gapComposer23, 438, 0);
                    gapComposer23.end(true);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                return invoke$com$squareup$cash$bugreporting$views$ComposableSingletons$BugReportingViewKt$$ExternalSyntheticLambda5(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$bugreporting$views$ComposableSingletons$BugReportingViewKt$$ExternalSyntheticLambda9(obj, obj2);
            case 28:
                ((Integer) obj2).getClass();
                CardStudioViewV2Kt.LoadingContent((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer24 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    Painter painterResource = Countries.painterResource(R.drawable.pattern_one_dot, 0, gapComposer24);
                    Colors colors8 = (Colors) gapComposer24.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer24, -1762997026, gapComposer24, false);
                    } else {
                        gapComposer24.startReplaceGroup(-1762997739);
                        gapComposer24.end(false);
                    }
                    long j = colors8.component.segmentedControl.button.text;
                    ImageKt.Image(painterResource, null, null, null, ContentScale.Companion.Inside, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer24, Painter.$stable | 24624, 44);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LoanDetailsSheetKt$$ExternalSyntheticLambda14(int i, int i2) {
        this.$r8$classId = i2;
    }
}
