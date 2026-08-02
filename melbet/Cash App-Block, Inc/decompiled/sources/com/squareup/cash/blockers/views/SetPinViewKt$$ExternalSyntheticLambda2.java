package com.squareup.cash.blockers.views;

import android.content.Context;
import android.text.SpannedString;
import android.util.Size;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.BackwardsCompatNodeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzage;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.views.AddressTypeaheadKt;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinOnboardingViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinInstrumentRecommendationViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.viewmodels.unavailable.BitcoinFeatureUnavailableViewModel;
import com.squareup.cash.bitcoin.views.transfer.BitcoinInstrumentRecommendationViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionDialogActionViewModel;
import com.squareup.cash.blockers.actions.views.BlockerActionDialogActionView;
import com.squareup.cash.blockers.actions.views.BlockerActionDialogActionViewKt;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanErrorViewModel;
import com.squareup.cash.blockers.scenarioplan.views.ScenarioPlanErrorView;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.AuthorizeGooglePayViewModel;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorViewModel;
import com.squareup.cash.blockers.viewmodels.GpsExplainerViewModel;
import com.squareup.cash.blockers.viewmodels.HelpOptionsViewModel;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewModel;
import com.squareup.cash.blockers.viewmodels.InstrumentDetailModel$InstrumentDetailListModel;
import com.squareup.cash.blockers.viewmodels.InstrumentDetailRowModel;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.blockers.viewmodels.LoadingAnimationDirection;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.blockers.viewmodels.SelectionViewModel;
import com.squareup.cash.blockers.viewmodels.SetAddressViewModel;
import com.squareup.cash.blockers.viewmodels.SetPinViewModel;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.blockers.viewmodels.UnselectableOptionViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyHelpViewModel;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.applets.presenters.BorrowAppletTilePresenter$Factory$Impl;
import com.squareup.cash.borrow.applets.presenters.RealBorrowAppletRepository;
import com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.StepStatus;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.android.Views$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InputEventTrigger;

/* loaded from: classes4.dex */
public final /* synthetic */ class SetPinViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(OnboardingInternalRouteViewModel onboardingInternalRouteViewModel, Function1 function1) {
        this.$r8$classId = 17;
        this.f$1 = onboardingInternalRouteViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Function1 function1;
        long j;
        int i = this.$r8$classId;
        int i2 = 9;
        int i3 = 26;
        int i4 = 25;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        switch (i) {
            case 0:
                SetPinViewModel setPinViewModel = (SetPinViewModel) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    int i5 = 0;
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Strings.LoadableFullScreenContent(setPinViewModel, setPinViewModel.isLoading, SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)), null, null, Expect_jvmKt.rememberComposableLambda(163869517, new SetPinViewKt$$ExternalSyntheticLambda4(i5, function12), gapComposer), gapComposer, 196608, 24);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Function1 function13 = (Function1) obj3;
                StablecoinOnboardingViewModel stablecoinOnboardingViewModel = (StablecoinOnboardingViewModel) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer2.changed(function13);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(2, function13);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), ImageKt.rememberScrollState(gapComposer2), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    ImageKt.Image(Countries.painterResource(2131233498, 0, gapComposer2), null, new HorizontalAlignElement(horizontal), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer2, Painter.$stable | 48, 120);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                    ViewfinderKt.HeroHeader(stablecoinOnboardingViewModel.title, (Modifier) null, (String) null, (TextStyle) null, gapComposer2, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    String str = stablecoinOnboardingViewModel.body;
                    TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    boolean changed2 = gapComposer2.changed(function13);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function13, false, 25);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue2, m300paddingVpY3zN4$default, textStyle, 0L, null, null, null, 0, 0, 0, gapComposer2, 0, 2032);
                    DBUtil.SpacerWithinSectionMedium(0, 0, gapComposer2, new LayoutWeightElement(1.0f, true));
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1833034444, new BorrowHomeKt$$ExternalSyntheticLambda0(function13, stablecoinOnboardingViewModel, false, 8), gapComposer2), gapComposer2, 24576, 15);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                } else if (bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.FullScreenContent) {
                    gapComposer3.startReplaceGroup(-802055083);
                    BackwardsCompatNodeKt.Content((BitcoinTransferViewModel.Content.FullScreenContent) bitcoinTransferViewModel, function14, gapComposer3, 0);
                    gapComposer3.end(false);
                } else {
                    if (bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.BottomSheetContent) {
                        throw NavAction$$ExternalSyntheticOutline0.m(gapComposer3, 1775246949, false, "BottomSheetContent not supported");
                    }
                    if (!Intrinsics.areEqual(bitcoinTransferViewModel, BitcoinTransferViewModel.DefaultInitialModel.INSTANCE) && !Intrinsics.areEqual(bitcoinTransferViewModel, BitcoinTransferViewModel.Loading.INSTANCE) && bitcoinTransferViewModel != null) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1775241287, false);
                    }
                    gapComposer3.startReplaceGroup(-801796326);
                    gapComposer3.end(false);
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                BackwardsCompatNodeKt.Content((BitcoinTransferViewModel.Content.FullScreenContent) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                Function1 function15 = (Function1) obj3;
                BitcoinInstrumentRecommendationViewModel bitcoinInstrumentRecommendationViewModel = (BitcoinInstrumentRecommendationViewModel) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean changed3 = gapComposer4.changed(function15);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(6, function15);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    SheetKt.Sheet((Function0) rememberedValue3, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1547528106, new BitcoinInstrumentRecommendationViewKt$$ExternalSyntheticLambda4(bitcoinInstrumentRecommendationViewModel, function15), gapComposer4), gapComposer4, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                BitcoinFeatureUnavailableViewModel bitcoinFeatureUnavailableViewModel = (BitcoinFeatureUnavailableViewModel) obj4;
                Function1 function16 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String str2 = bitcoinFeatureUnavailableViewModel.bodyText;
                    String str3 = bitcoinFeatureUnavailableViewModel.buttonText;
                    AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(Icons.Information32, 0L, 6);
                    Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    AvatarEntry avatarEntry = new AvatarEntry("", colors3.semantic.background.brand, null, localIcon, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                    boolean changed4 = gapComposer5.changed(function16);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(9, function16);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    VisibleKt.ArcadeInfoBlocker(str2, str3, avatarEntry, (Function0) rememberedValue4, null, null, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                BlockerActionDialogActionViewModel blockerActionDialogActionViewModel = (BlockerActionDialogActionViewModel) obj4;
                Function1 function17 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i6 = BlockerActionDialogActionView.$r8$clinit;
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    BlockerActionDialogActionViewKt.BlockerActionDialog(blockerActionDialogActionViewModel, function17, null, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ScenarioPlanErrorView scenarioPlanErrorView = (ScenarioPlanErrorView) obj4;
                ScenarioPlanErrorViewModel scenarioPlanErrorViewModel = (ScenarioPlanErrorViewModel) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean changedInstance = gapComposer7.changedInstance(scenarioPlanErrorView);
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new BadgeQueries$$ExternalSyntheticLambda5(scenarioPlanErrorView, i4);
                        gapComposer7.updateRememberedValue(rememberedValue5);
                    }
                    Function1 function18 = (Function1) rememberedValue5;
                    boolean changedInstance2 = gapComposer7.changedInstance(scenarioPlanErrorViewModel);
                    Object rememberedValue6 = gapComposer7.rememberedValue();
                    if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new BadgeQueries$$ExternalSyntheticLambda5(scenarioPlanErrorViewModel, i3);
                        gapComposer7.updateRememberedValue(rememberedValue6);
                    }
                    AndroidView_androidKt.AndroidView(function18, null, (Function1) rememberedValue6, gapComposer7, 0, 2);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                FilesetUploadErrorViewModel filesetUploadErrorViewModel = (FilesetUploadErrorViewModel) obj4;
                Function1 function19 = (Function1) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i7 = ArcadeFilesetUploadErrorDialogView.$r8$clinit;
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    AmountBlockerViewKt.ArcadeFilesetUploadErrorDialog(filesetUploadErrorViewModel, function19, null, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Function1 function110 = (Function1) obj3;
                AtmPickerAmountBlockerViewModel atmPickerAmountBlockerViewModel = (AtmPickerAmountBlockerViewModel) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    boolean changed5 = gapComposer9.changed(function110);
                    Object rememberedValue7 = gapComposer9.rememberedValue();
                    if (changed5 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(0, function110);
                        gapComposer9.updateRememberedValue(rememberedValue7);
                    }
                    SheetKt.Sheet((Function0) rememberedValue7, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(2025585816, new BorrowHomeKt$$ExternalSyntheticLambda0(14, atmPickerAmountBlockerViewModel, function110), gapComposer9), gapComposer9, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Function1 function111 = (Function1) obj3;
                AuthorizeGooglePayViewModel authorizeGooglePayViewModel = (AuthorizeGooglePayViewModel) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    boolean changed6 = gapComposer10.changed(function111);
                    Object rememberedValue8 = gapComposer10.rememberedValue();
                    if (changed6 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new AvatarsKt$$ExternalSyntheticLambda1(23, function111);
                        gapComposer10.updateRememberedValue(rememberedValue8);
                    }
                    DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue8, gapComposer10, 0);
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors4 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode3 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer10, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    if (authorizeGooglePayViewModel instanceof AuthorizeGooglePayViewModel.Loading) {
                        gapComposer10.startReplaceGroup(-301154695);
                        z = true;
                        ProgressCircularKt.ProgressCircular(0, 1, gapComposer10, null);
                        gapComposer10.end(false);
                    } else {
                        z = true;
                        gapComposer10.startReplaceGroup(-301120099);
                        gapComposer10.end(false);
                    }
                    gapComposer10.end(z);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ConfirmCvvViewModel confirmCvvViewModel = (ConfirmCvvViewModel) obj4;
                Function1 function112 = (Function1) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                int i8 = ConfirmCvvView.$r8$clinit;
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    SsnViewKt.ConfirmCvv(confirmCvvViewModel, function112, null, gapComposer11, 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                SsnViewKt.EarnerEnrollmentCategoryTitle((EarnerEnrollmentBlockerViewModel.CategorySelection) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                SsnViewKt.GpsExplainerSheet((GpsExplainerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                HelpOptionsViewModel helpOptionsViewModel = (HelpOptionsViewModel) obj4;
                Function1 function113 = (Function1) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                int i9 = HelpOptionsSheet.$r8$clinit;
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    SsnViewKt.HelpOptions(helpOptionsViewModel, function113, null, gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                SsnViewKt.InputCardInfo((InputCardInfoViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                InstrumentSelectionView instrumentSelectionView = (InstrumentSelectionView) obj3;
                int intValue13 = ((Integer) obj).intValue();
                LabelValueView labelValueView = (LabelValueView) obj2;
                labelValueView.getClass();
                InstrumentDetailRowModel instrumentDetailRowModel = (InstrumentDetailRowModel) ((InstrumentDetailModel$InstrumentDetailListModel) ((zzage) obj4)).detailRows.get(intValue13);
                instrumentDetailRowModel.getClass();
                Size size = new Size((int) Views.dip((View) labelValueView, 4.5f), Views.dip((View) labelValueView, 6));
                String str4 = instrumentDetailRowModel.detailText;
                boolean z2 = instrumentDetailRowModel.hasDialog;
                ColorPalette colorPalette = labelValueView.colorPalette;
                SpannedString access$renderClickableDetail = SsnViewKt.access$renderClickableDetail(labelValueView, str4, z2, colorPalette.icon, size);
                FigmaTextView figmaTextView = labelValueView.label;
                String str5 = instrumentDetailRowModel.title;
                Context context = labelValueView.getContext();
                context.getClass();
                figmaTextView.setText(InputEventTrigger.Companion.markdownToSpanned$default(str5, context, null, 30));
                figmaTextView.setTextColor(z2 ? colorPalette.label : colorPalette.secondaryLabel);
                FigmaTextView figmaTextView2 = labelValueView.value;
                figmaTextView2.setText(access$renderClickableDetail);
                figmaTextView2.setTextColor(z2 ? colorPalette.label : colorPalette.secondaryLabel);
                int dip = Views.dip((View) instrumentSelectionView, 4);
                int dip2 = Views.dip((View) instrumentSelectionView, 4);
                Object parent = labelValueView.getParent();
                parent.getClass();
                View view = (View) parent;
                view.post(new Views$$ExternalSyntheticLambda0(view, labelValueView, 0, dip, 0, dip2));
                instrumentSelectionView.handleClickEvents(labelValueView, z2, new InstrumentSelectionViewEvent.DetailRowClicked(intValue13));
                return Unit.INSTANCE;
            case 17:
                OnboardingInternalRouteViewModel onboardingInternalRouteViewModel = (OnboardingInternalRouteViewModel) obj4;
                Function1 function114 = (Function1) obj3;
                Composer composer13 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Modifier fillMaxSize4 = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(companion), 1.0f);
                    Colors colors5 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxSize4, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer13, 0);
                    int hashCode4 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer13, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer13.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer13, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer13, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer13, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer13, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer13, null);
                    Countries.PageHeader(onboardingInternalRouteViewModel.errorTitle, (Modifier) null, AmountBlockerViewKt.f304lambda$732949431, onboardingInternalRouteViewModel.errorBody, gapComposer13, MLKEMEngine.KyberPolyBytes, 2);
                    SpacerKt.Spacer(gapComposer13, new LayoutWeightElement(1.0f, true));
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-578675264, new BorrowHomeKt$$ExternalSyntheticLambda0(function114, onboardingInternalRouteViewModel, r4, 21), gapComposer13), gapComposer13, 24576, 15);
                    gapComposer13.end(true);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ((PasscodeKt$PasscodeInput$3) obj4).Decoration((ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 19:
                SelectionViewModel selectionViewModel = (SelectionViewModel) obj4;
                Function1 function115 = (Function1) obj3;
                Composer composer14 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Modifier fillMaxSize5 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors6 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    Strings.LoadableFullScreenContent(selectionViewModel, selectionViewModel.loading, ImageKt.m177backgroundbw27NRU(fillMaxSize5, colors6.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), null, null, Expect_jvmKt.rememberComposableLambda(1194816843, new SetPinViewKt$$ExternalSyntheticLambda4(22, function115), gapComposer14), gapComposer14, 196608, 24);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj4;
                AddressTypeaheadState addressTypeaheadState = (AddressTypeaheadState) obj3;
                Composer composer15 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    ((DefaultSizes) gapComposer15.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    AddressTypeaheadKt.AddressTypeahead(addressTypeaheadState, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), setAddressViewModel.hint, gapComposer15, 0, 0);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj4;
                Function1 function116 = (Function1) obj3;
                Composer composer16 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean z3 = !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning();
                    boolean changed7 = gapComposer16.changed(function116);
                    Object rememberedValue9 = gapComposer16.rememberedValue();
                    if (changed7 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new SsnViewKt$$ExternalSyntheticLambda14(8, function116);
                        gapComposer16.updateRememberedValue(rememberedValue9);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, fillMaxWidth, null, false, z3, null, AmountBlockerViewKt.lambda$1964991230, gapComposer16, 1572912, 44);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                StatusResultViewModel statusResultViewModel = (StatusResultViewModel) obj4;
                Function1 function117 = (Function1) obj3;
                Composer composer17 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (!gapComposer17.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    gapComposer17.skipToGroupEnd();
                } else if (statusResultViewModel instanceof StatusResultViewModel.Hidden) {
                    gapComposer17.startReplaceGroup(625053580);
                    gapComposer17.end(false);
                } else {
                    gapComposer17.startReplaceGroup(625009374);
                    StatusResultViewKt.StatusResult(statusResultViewModel, function117, null, gapComposer17, 0);
                    gapComposer17.end(false);
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                StatusResultViewKt.Render((LayoutUpdate.PromoText) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                UnselectableOptionViewModel unselectableOptionViewModel = (UnselectableOptionViewModel) obj4;
                Function1 function118 = (Function1) obj3;
                Composer composer18 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, AmountBlockerViewKt.lambda$167891077, Expect_jvmKt.rememberComposableLambda(-869119324, new SsnViewKt$$ExternalSyntheticLambda2(unselectableOptionViewModel, i3), gapComposer18), Expect_jvmKt.rememberComposableLambda(-1122228400, new BookletGridKt$$ExternalSyntheticLambda1(i2, function118), gapComposer18), (Function3) null, (Function3) null, gapComposer18, 3504, 48);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                VerifyContactsViewModel verifyContactsViewModel = (VerifyContactsViewModel) obj4;
                Function1 function119 = (Function1) obj3;
                Composer composer19 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Colors colors7 = (Colors) gapComposer19.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, colors7.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1, 1.0f);
                    boolean z4 = verifyContactsViewModel.isLoading;
                    if (verifyContactsViewModel.animationDirection == LoadingAnimationDirection.BACKWARD) {
                        gapComposer19.startReplaceGroup(1264054222);
                        Object rememberedValue10 = gapComposer19.rememberedValue();
                        if (rememberedValue10 == neverEqualPolicy) {
                            rememberedValue10 = new RewardQueries$$ExternalSyntheticLambda4(2);
                            gapComposer19.updateRememberedValue(rememberedValue10);
                        }
                        function1 = (Function1) rememberedValue10;
                        gapComposer19.end(false);
                    } else {
                        gapComposer19.startReplaceGroup(1264112719);
                        Object rememberedValue11 = gapComposer19.rememberedValue();
                        if (rememberedValue11 == neverEqualPolicy) {
                            rememberedValue11 = new RewardQueries$$ExternalSyntheticLambda4(3);
                            gapComposer19.updateRememberedValue(rememberedValue11);
                        }
                        function1 = (Function1) rememberedValue11;
                        gapComposer19.end(false);
                    }
                    Strings.LoadableFullScreenContent(verifyContactsViewModel, z4, m, function1, null, Expect_jvmKt.rememberComposableLambda(-1798196869, new SetPinViewKt$$ExternalSyntheticLambda4(i4, function119), gapComposer19), gapComposer19, 196608, 16);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                VerifyHelpViewModel verifyHelpViewModel = (VerifyHelpViewModel) obj4;
                Function1 function120 = (Function1) obj3;
                Composer composer20 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                int i10 = VerifyHelpSheetView.$r8$clinit;
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (!gapComposer20.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    gapComposer20.skipToGroupEnd();
                } else if (verifyHelpViewModel != null) {
                    gapComposer20.startReplaceGroup(-1193554893);
                    SsnViewKt.VerifyHelpOptions(function120, null, verifyHelpViewModel.helpItems, verifyHelpViewModel.verifyHelpItems, gapComposer20, 0);
                    gapComposer20.end(false);
                } else {
                    gapComposer20.startReplaceGroup(-1193405690);
                    gapComposer20.end(false);
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj4).UninstalledUI((BorrowAppletTileModel.Uninstalled) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                RealBrandFollowPresenter.MetroFactory metroFactory = ((BorrowAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                RealBorrowAppletRepository realBorrowAppletRepository = (RealBorrowAppletRepository) metroFactory.syncer.invoke();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) metroFactory.store.invoke();
                LendingAppService lendingAppService = (LendingAppService) metroFactory.service.invoke();
                RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) metroFactory.repository.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) metroFactory.analytics.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.responseContextHandlerFactory.invoke();
                realBorrowAppletRepository.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                lendingAppService.getClass();
                realMoneyNavigatorHelper.getClass();
                moneyAnalyticsService.getClass();
                realRouter$Factory$Impl.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(realBorrowAppletRepository, promotedAppletTilePresenter$Factory$Impl, lendingAppService, realMoneyNavigatorHelper, moneyAnalyticsService, realRouter$Factory$Impl, navigator)), coroutineScope, (LifecycleOwner) obj3);
                return new TaxesAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 7), (char) 0);
            default:
                StepStatus stepStatus = (StepStatus) obj4;
                String str6 = (String) obj3;
                Composer composer21 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    if (stepStatus == StepStatus.PENDING) {
                        gapComposer21.startReplaceGroup(810529348);
                        Colors colors8 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                        if (colors8 == null) {
                            colors8 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                        } else {
                            gapComposer21.startReplaceGroup(-1762997739);
                            gapComposer21.end(false);
                        }
                        j = colors8.semantic.text.placeholder;
                        gapComposer21.end(false);
                    } else {
                        gapComposer21.startReplaceGroup(810604647);
                        Colors colors9 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                        if (colors9 == null) {
                            colors9 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                        } else {
                            gapComposer21.startReplaceGroup(-1762997739);
                            gapComposer21.end(false);
                        }
                        j = colors9.semantic.text.standard;
                        gapComposer21.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$2 = function1;
        this.f$1 = obj;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(BitcoinTransferViewModel bitcoinTransferViewModel, Function1 function1) {
        this.$r8$classId = 2;
        this.f$1 = bitcoinTransferViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(BitcoinFeatureUnavailableViewModel bitcoinFeatureUnavailableViewModel, Function1 function1) {
        this.$r8$classId = 5;
        this.f$1 = bitcoinFeatureUnavailableViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(SelectionViewModel selectionViewModel, Function1 function1) {
        this.$r8$classId = 19;
        this.f$1 = selectionViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(SetPinViewModel setPinViewModel, Function1 function1) {
        this.$r8$classId = 0;
        this.f$1 = setPinViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(UnselectableOptionViewModel unselectableOptionViewModel, Function1 function1) {
        this.$r8$classId = 24;
        this.f$1 = unselectableOptionViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(VerifyContactsViewModel verifyContactsViewModel, Function1 function1) {
        this.$r8$classId = 25;
        this.f$1 = verifyContactsViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda2(Function1 function1, StablecoinOnboardingViewModel stablecoinOnboardingViewModel) {
        this.$r8$classId = 1;
        this.f$2 = function1;
        this.f$1 = stablecoinOnboardingViewModel;
    }
}
