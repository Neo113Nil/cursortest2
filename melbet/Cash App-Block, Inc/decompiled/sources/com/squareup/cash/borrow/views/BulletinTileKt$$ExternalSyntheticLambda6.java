package com.squareup.cash.borrow.views;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.spatial.ThrottledCallbacksKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.ManagedAccountFlipDirection;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.text.InlineIconPosition;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.WelcomeViewModel;
import com.squareup.cash.blockers.views.WelcomeViewKt;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerHeaderModel;
import com.squareup.cash.booklet.ui.RealBookletGridScope;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewModel;
import com.squareup.cash.buynowpaylater.components.AfterPayOrderDetailsRemainingView;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderTransaction;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderTransactions;
import com.squareup.cash.buynowpaylater.viewmodels.StackableRow;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.card.onboarding.CardPreviewSheet;
import com.squareup.cash.card.onboarding.CardPreviewViewKt;
import com.squareup.cash.card.onboarding.HeaderSection;
import com.squareup.cash.card.onboarding.HeroSection;
import com.squareup.cash.card.onboarding.IconGridSection;
import com.squareup.cash.card.onboarding.ImageCarouselSection;
import com.squareup.cash.card.onboarding.LabelsSection;
import com.squareup.cash.card.onboarding.StampSheetViewModel;
import com.squareup.cash.card.onboarding.StyledCardView;
import com.squareup.cash.card.onboarding.TileCarouselSection;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewModel;
import com.squareup.cash.cashapppay.views.CashAppPayStackedAvatarKt;
import com.squareup.cash.charting.components.SegmentedBarChartKt;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.checks.ConfirmBackOfCheckViewModel;
import com.squareup.cash.checks.ConfirmFrontOfCheckViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.protos.cash.cashapproxy.api.SemanticColor;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.SelectionOption;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final /* synthetic */ class BulletinTileKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda6(SUPOrderTransaction sUPOrderTransaction) {
        this.$r8$classId = 11;
        this.f$0 = sUPOrderTransaction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x07fb, code lost:
    
        if (r0 != 2) goto L217;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Color color;
        TextAlign textAlign;
        Color color2;
        Color color3;
        Painter painterResource;
        long j;
        Icons icons;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 2;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = (BorrowAppletBulletinsTile.Data.UpsellCard) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LocalizedString localizedString = upsellCard.title_text;
                    localizedString.getClass();
                    String str = localizedString.translated_value;
                    str.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                SelectionOption selectionOption = (SelectionOption) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str2 = selectionOption.label;
                    str2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                WelcomeViewModel welcomeViewModel = (WelcomeViewModel) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 24.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, false, new StreamSharing$$ExternalSyntheticLambda1(Alignment.Companion.CenterVertically, 17)), Alignment.Companion.CenterHorizontally, gapComposer3, 54);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    if (welcomeViewModel instanceof WelcomeViewModel.Standard) {
                        gapComposer3.startReplaceGroup(-71136042);
                        WelcomeViewKt.WelcomeIconCircle(null, gapComposer3, 0);
                        KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3322, 0L, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).header, new TextLineBalancing(1), ((WelcomeViewModel.Standard) welcomeViewModel).title, (Map) null, (Function1) null, false);
                        gapComposer3.end(false);
                    } else {
                        if (!(welcomeViewModel instanceof WelcomeViewModel.ManagedAccount)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -972127021, false);
                        }
                        gapComposer3.startReplaceGroup(-70806512);
                        WelcomeViewModel.ManagedAccount managedAccount = (WelcomeViewModel.ManagedAccount) welcomeViewModel;
                        ImageKt.Image(Countries.painterResource(managedAccount.flipDirection == ManagedAccountFlipDirection.TO_KID ? R.drawable.account_switch_frame_60 : R.drawable.account_switch_frame_00, 0, gapComposer3), null, SizeKt.m285size3ABfNKs(companion, 126.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer3, Painter.$stable | 432, 120);
                        KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3322, 0L, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, new TextLineBalancing(1), managedAccount.welcomeMessage, (Map) null, (Function1) null, false);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(true);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                WebViewBlockerHeaderModel webViewBlockerHeaderModel = (WebViewBlockerHeaderModel) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    String str3 = webViewBlockerHeaderModel.titleText;
                    if (str3 == null) {
                        gapComposer4.startReplaceGroup(956543913);
                    } else {
                        gapComposer4.startReplaceGroup(956543914);
                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    }
                    gapComposer4.end(false);
                    String str4 = webViewBlockerHeaderModel.urlText;
                    if (str4 == null) {
                        gapComposer4.startReplaceGroup(956623800);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(956623801);
                        zzacp.m2014InlineIconTextQqsJerU(str4, Icons.LockLockedFill16.painter(gapComposer4), null, Strings.getColors(gapComposer4).semantic.icon.subtle, InlineIconPosition.START, Strings.getTypography(gapComposer4).bodyXSmall, Strings.getColors(gapComposer4).semantic.text.subtle, null, 0, 1, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer4, (Painter.$stable << 3) | 805330944, 0, 32132);
                        gapComposer4.end(false);
                    }
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((RealBookletGridScope) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                String str5 = (String) obj;
                str5.getClass();
                ((String) obj2).getClass();
                ((BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj3).invoke(str5);
                return Unit.INSTANCE;
            case 6:
                BorrowLimitHubViewModel.CtaBullet ctaBullet = (BorrowLimitHubViewModel.CtaBullet) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ctaBullet.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                BorrowHomeViewModel.Tile.LoanHistoryTileModel loanHistoryTileModel = (BorrowHomeViewModel.Tile.LoanHistoryTileModel) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    LocalizedString localizedString2 = loanHistoryTileModel.tileData.title;
                    localizedString2.getClass();
                    String str6 = localizedString2.translated_value;
                    str6.getClass();
                    Object rememberedValue = gapComposer6.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(14);
                        gapComposer6.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer6, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                BugReportingViewModel.Success success = (BugReportingViewModel.Success) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, success.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                TextModel textModel = (TextModel) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i3 = AfterPayOrderDetailsRemainingView.$r8$clinit;
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode4 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer8, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    SpacerKt.Spacer(gapComposer8, ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 1.0f), MooncakeTheme.getColors(gapComposer8).hairline, rectangleShapeKt$RectangleShape$1));
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 20.0f);
                    String str7 = textModel.text;
                    str7.getClass();
                    TextStyle moonCakeThemeStyle = ThrottledCallbacksKt.toMoonCakeThemeStyle(textModel.style, gapComposer8);
                    SemanticColor semanticColor = textModel.color;
                    if (semanticColor == null) {
                        gapComposer8.startReplaceGroup(1799186542);
                        gapComposer8.end(false);
                        color = null;
                    } else {
                        gapComposer8.startReplaceGroup(-496151053);
                        long moonCakeColor = ThrottledCallbacksKt.toMoonCakeColor(semanticColor, gapComposer8);
                        gapComposer8.end(false);
                        color = new Color(moonCakeColor);
                    }
                    long j2 = color != null ? color.value : Color.Unspecified;
                    com.squareup.cash.buynowpaylater.viewmodels.Alignment alignment = textModel.alignment;
                    if (alignment == null) {
                        gapComposer8.startReplaceGroup(1799264786);
                        gapComposer8.end(false);
                        textAlign = null;
                    } else {
                        gapComposer8.startReplaceGroup(-496148529);
                        int ordinal = alignment.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                i2 = 3;
                            }
                            gapComposer8.end(false);
                            textAlign = new TextAlign(i2);
                        }
                        i2 = 1;
                        gapComposer8.end(false);
                        textAlign = new TextAlign(i2);
                    }
                    KeypadKt.m3651TextPdH14aY(0, 0, textAlign != null ? textAlign.value : 0, 0, 0, 0, 3824, j2, (Composer) gapComposer8, m299paddingVpY3zN4, moonCakeThemeStyle, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer8, ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 1.0f), MooncakeTheme.getColors(gapComposer8).hairline, rectangleShapeKt$RectangleShape$1));
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                SUPOrderTransactions sUPOrderTransactions = (SUPOrderTransactions) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    KeypadKt.m3641CardIkByU14(SizeKt.fillMaxWidth(companion, 1.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f), 0L, false, null, null, null, Expect_jvmKt.rememberComposableLambda(1672961485, new CheckDepositAmountKt$$ExternalSyntheticLambda8(sUPOrderTransactions), gapComposer9), gapComposer9, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                SUPOrderTransaction sUPOrderTransaction = (SUPOrderTransaction) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                boolean shouldExecute2 = gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2);
                Applier applier2 = gapComposer10.applier;
                if (shouldExecute2) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer10, 0);
                    int hashCode5 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer10, fillMaxWidth2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    gapComposer10.startReplaceGroup(-2009674840);
                    for (StackableRow.RowItem rowItem : sUPOrderTransaction.rowItems) {
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer10, 0);
                        int hashCode6 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer10.currentCompositionLocalScope();
                        Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer10, fillMaxWidth3);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                        gapComposer10.startReusableNode();
                        if (gapComposer10.inserting) {
                            gapComposer10.createNode(layoutNode$Companion$Constructor$15);
                        } else {
                            gapComposer10.useNode();
                        }
                        Updater.m576setimpl(gapComposer10, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer10, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer10, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                        TextModel textModel2 = rowItem.title;
                        if (textModel2 == null) {
                            gapComposer10.startReplaceGroup(-104810525);
                            gapComposer10.end(false);
                        } else {
                            gapComposer10.startReplaceGroup(-104810524);
                            String str8 = textModel2.text;
                            str8.getClass();
                            TextStyle moonCakeThemeStyle2 = ThrottledCallbacksKt.toMoonCakeThemeStyle(textModel2.style, gapComposer10);
                            SemanticColor semanticColor2 = textModel2.color;
                            if (semanticColor2 == null) {
                                gapComposer10.startReplaceGroup(-1407704741);
                                gapComposer10.end(false);
                                color2 = null;
                            } else {
                                gapComposer10.startReplaceGroup(370232166);
                                long moonCakeColor2 = ThrottledCallbacksKt.toMoonCakeColor(semanticColor2, gapComposer10);
                                gapComposer10.end(false);
                                color2 = new Color(moonCakeColor2);
                            }
                            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, color2 != null ? color2.value : Color.Unspecified, (Composer) gapComposer10, (Modifier) null, moonCakeThemeStyle2, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                            gapComposer10.end(false);
                        }
                        SpacerKt.Spacer(gapComposer10, new LayoutWeightElement(1.0f, true));
                        TextModel textModel3 = rowItem.detail;
                        if (textModel3 == null) {
                            gapComposer10.startReplaceGroup(-104510941);
                            gapComposer10.end(false);
                        } else {
                            gapComposer10.startReplaceGroup(-104510940);
                            String str9 = textModel3.text;
                            str9.getClass();
                            TextStyle moonCakeThemeStyle3 = ThrottledCallbacksKt.toMoonCakeThemeStyle(textModel3.style, gapComposer10);
                            SemanticColor semanticColor3 = textModel3.color;
                            if (semanticColor3 == null) {
                                gapComposer10.startReplaceGroup(-1200483118);
                                gapComposer10.end(false);
                                color3 = null;
                            } else {
                                gapComposer10.startReplaceGroup(931106063);
                                long moonCakeColor3 = ThrottledCallbacksKt.toMoonCakeColor(semanticColor3, gapComposer10);
                                gapComposer10.end(false);
                                color3 = new Color(moonCakeColor3);
                            }
                            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, color3 != null ? color3.value : Color.Unspecified, (Composer) gapComposer10, (Modifier) null, moonCakeThemeStyle3, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                            gapComposer10.end(false);
                        }
                        gapComposer10.end(true);
                    }
                    gapComposer10.end(false);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer10).secondaryLabel, (Composer) gapComposer10, (Modifier) null, MooncakeTheme.getTypography(gapComposer10).strongCaption, (TextLineBalancing) null, sUPOrderTransaction.transactionTime, (Map) null, (Function1) null, false);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                CardPreviewSheet cardPreviewSheet = (CardPreviewSheet) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    long j3 = Strings.getColors(gapComposer11).semantic.background.f1047app;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion2, j3, rectangleShapeKt$RectangleShape$1);
                    Strings.getSizes(gapComposer11).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer11, 0);
                    int hashCode7 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer11, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$16);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer11, (Modifier) null, Strings.getTypography(gapComposer11).header, (TextLineBalancing) null, cardPreviewSheet.title, (Map) null, (Function1) null, false);
                    Strings.getSizes(gapComposer11).getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer11).semantic.text.subtle, (Composer) gapComposer11, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getTypography(gapComposer11).bodyMedium, (TextLineBalancing) null, cardPreviewSheet.body, (Map) null, (Function1) null, false);
                    int i4 = CardPreviewViewKt.WhenMappings.$EnumSwitchMapping$0[cardPreviewSheet.image.ordinal()];
                    if (i4 == 1 || i4 == 2) {
                        throw NavAction$$ExternalSyntheticOutline0.m(gapComposer11, 473993222, false, "Unexpected image enum");
                    }
                    if (i4 == 3) {
                        gapComposer11.startReplaceGroup(473995935);
                        painterResource = Countries.painterResource(R.drawable.pink_theme_banner, 0, gapComposer11);
                        gapComposer11.end(false);
                    } else if (i4 == 4) {
                        gapComposer11.startReplaceGroup(473998498);
                        painterResource = Countries.painterResource(R.drawable.glitter_theme_banner, 0, gapComposer11);
                        gapComposer11.end(false);
                    } else {
                        if (i4 != 5) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer11, 473990626, false);
                        }
                        gapComposer11.startReplaceGroup(474001187);
                        painterResource = Countries.painterResource(R.drawable.tortoise_theme_banner, 0, gapComposer11);
                        gapComposer11.end(false);
                    }
                    Painter painter = painterResource;
                    Strings.getSizes(gapComposer11).getClass();
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 32.0f, 1);
                    Strings.getSizes(gapComposer11).getClass();
                    Object obj4 = DefaultSizes.border.entries;
                    ImageKt.Image(painter, null, ClipKt.clip(m300paddingVpY3zN4$default2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), null, ContentScale.Companion.FillWidth, RecyclerView.DECELERATION_RATE, null, gapComposer11, Painter.$stable | 24624, 104);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                pointerInputChange.getClass();
                long j4 = pointerInputChange.position;
                ((HeatRenderer) obj3).applyHeat(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & BodyPartID.bodyIdMax)));
                return Unit.INSTANCE;
            case 14:
                StampSheetViewModel stampSheetViewModel = (StampSheetViewModel) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer12, SizeKt.fillMaxWidth(companion, 1.0f), ((Typography) gapComposer12.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, Room.stringResource(R.string.stamp_sheet_v2_selected, new Object[]{Integer.valueOf(stampSheetViewModel.selectedStamps.size()), 5}, gapComposer12), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i5 = StyledCardView.$r8$clinit;
                ((StyledCardView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                HeroSectionKt.HeaderSection((HeaderSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                HeroSectionKt.HeroSection((HeroSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                HeroSectionKt.IconGridSection((IconGridSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                HeroSectionKt.ImageCarouselSection((ImageCarouselSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                HeroSectionKt.LabelsSection((LabelsSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                HeroSectionKt.TileCarouselSection((TileCarouselSection) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                HeroSectionKt.Tile((TileCarouselSection.Tile) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                SpendingInsightsHomeViewModel.Content.InsightsSection.InsightsRow insightsRow = (SpendingInsightsHomeViewModel.Content.InsightsSection.InsightsRow) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, insightsRow.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                KycAppletTileKt.ActivityAppletTileUI((ActivityAppletTileViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                UnlinkResultViewModel unlinkResultViewModel = (UnlinkResultViewModel) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    boolean z = unlinkResultViewModel instanceof UnlinkResultViewModel.Success;
                    if (z) {
                        gapComposer14.startReplaceGroup(265855046);
                        Colors colors2 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                        } else {
                            gapComposer14.startReplaceGroup(-1762997739);
                            gapComposer14.end(false);
                        }
                        j = colors2.semantic.background.brand;
                        gapComposer14.end(false);
                    } else {
                        if (!(unlinkResultViewModel instanceof UnlinkResultViewModel.Failure)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer14, 265852360, false);
                        }
                        gapComposer14.startReplaceGroup(265857639);
                        Colors colors3 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                        } else {
                            gapComposer14.startReplaceGroup(-1762997739);
                            gapComposer14.end(false);
                        }
                        j = colors3.semantic.background.danger;
                        gapComposer14.end(false);
                    }
                    long j5 = j;
                    if (z) {
                        icons = Icons.Check32;
                    } else {
                        if (!(unlinkResultViewModel instanceof UnlinkResultViewModel.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        icons = Icons.Failed32;
                    }
                    TextViewKt.Avatar(avatarSize, new AvatarEntry("", j5, null, new AvatarImage.LocalIcon(icons, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer14, 6, 28);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                CashAppPayStackedAvatarKt.CashAppPayStackedAvatar((AvatarViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(9));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                SegmentedBarChartKt.LegendItem((SegmentedBarChartViewModel.Legend.Label) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ConfirmBackOfCheckViewModel confirmBackOfCheckViewModel = (ConfirmBackOfCheckViewModel) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, confirmBackOfCheckViewModel.confirmation, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ConfirmFrontOfCheckViewModel confirmFrontOfCheckViewModel = (ConfirmFrontOfCheckViewModel) obj3;
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, confirmFrontOfCheckViewModel.confirmation, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda6(WelcomeViewModel welcomeViewModel) {
        this.$r8$classId = 2;
        this.f$0 = welcomeViewModel;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda6(SUPOrderTransactions sUPOrderTransactions) {
        this.$r8$classId = 10;
        this.f$0 = sUPOrderTransactions;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda6(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
