package com.squareup.cash.earnings.views.home;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzanv;
import com.google.android.gms.internal.mlkit_genai_prompt.zzie;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageDialogViewModel;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageFullScreenViewModel;
import com.squareup.cash.common.messaging.views.FailureMessageDialogView;
import com.squareup.cash.common.messaging.views.FailureMessageFullScreenView;
import com.squareup.cash.common.messaging.views.FailureMessageFullScreenViewKt;
import com.squareup.cash.common.observabilitynaming.ObservabilityView;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.views.BottomNavigationElementKeys;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import com.squareup.cash.datefilterbar.views.DateFilterBarKt;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.view.map.ComposableSingletons$PaperMoneyDepositMapViewKt;
import com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt;
import com.squareup.cash.deposits.physical.view.map.PmdClusterItem;
import com.squareup.cash.deposits.physical.view.map.PmdMarkerLocation;
import com.squareup.cash.deposits.physical.view.onboarding.PaperMoneyDepositOnboardingViewKt;
import com.squareup.cash.deposits.physical.view.onboarding.PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapViewModel;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingViewModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository;
import com.squareup.cash.family.applets.presenters.FamilyAppletTilePresenter$Factory$Impl;
import com.squareup.cash.family.applets.viewmodels.DependentActivityAppletTileViewModel;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import com.squareup.cash.family.familyhub.viewmodels.DependentAccessControlsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentBalancesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailIntroductionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMemberRowViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.DependentDetailToolbarModel;
import com.squareup.cash.family.familyhub.views.DependentDetailViewKt;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt;
import com.squareup.cash.family.familyhub.views.SponsorDetailViewKt;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.views.CashMapViewKt;
import com.squareup.cash.merchant.views.SquareLoyaltySheetView;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.moneybot.widgets.ComposerKt;
import com.squareup.cash.moneybot.widgets.ComposerSharedElementKeys;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.compose.PerformanceLoggingKt;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.work.applets.views.WorkAppletTile;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda11;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class EarningsHomeKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ EarningsHomeKt$$ExternalSyntheticLambda2(RealObservabilityManager realObservabilityManager, DependentDetailViewModel dependentDetailViewModel, Function1 function1) {
        this.$r8$classId = 23;
        this.f$1 = realObservabilityManager;
        this.f$2 = dependentDetailViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MutableState mutableState;
        int i = this.$r8$classId;
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i2 = 14;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj4;
                EarningsHomeViewModel earningsHomeViewModel = (EarningsHomeViewModel) obj5;
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)), null, null, Expect_jvmKt.rememberComposableLambda(-1546221246, new ErrorView$$ExternalSyntheticLambda3(3, function1), gapComposer), null, Expect_jvmKt.rememberComposableLambda(-377913940, new SectionKt$$ExternalSyntheticLambda2(22, earningsHomeViewModel, function1, factory), gapComposer), gapComposer, 199680, 22);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int i3 = FailureMessageDialogView.$r8$clinit;
                ((FailureMessageDialogView) obj5).Content((FailureMessageDialogViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int i4 = FailureMessageFullScreenView.$r8$clinit;
                ((FailureMessageFullScreenView) obj5).Content((FailureMessageFullScreenViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                FailureMessageFullScreenViewKt.FailureMessageFullScreen((FailureMessageFullScreenViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                Transition transition = (Transition) obj4;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj5;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier alpha = AlphaKt.alpha(SizeKt.fillMaxWidth(SpacerKt.navigationBarsPadding(SpacerKt.m302paddingqDBjuR0$default(boxScopeInstance.align(companion, Alignment.Companion.BottomCenter), 24.0f, RecyclerView.DECELERATION_RATE, 24.0f, 8.0f, 2)), 1.0f), transition.isRunning() ? 1.0f : RecyclerView.DECELERATION_RATE);
                    ComposerSharedElementKeys composerSharedElementKeys = new ComposerSharedElementKeys(BottomNavigationElementKeys.Background, null, null, BottomNavigationElementKeys.Bounds);
                    boolean z = !transition.isRunning() && transition.transitionState.getCurrentState() == NavigationModel.Ready.Swipe.Page.SidePanel;
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new FlowStarter$$ExternalSyntheticLambda0(7);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.Composer(alpha, null, null, false, false, z, null, null, sharedTransitionScope, animatedContentScopeImpl, composerSharedElementKeys, (Function1) rememberedValue, null, null, gapComposer2, 0, 56, 12510);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                DateFilterBarKt.DateFilterBar((DateFilterBarViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ((SquareLoyaltySheetView) obj5).Content((LocationDetailsViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                Function1 function12 = (Function1) obj4;
                final PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel = (PaperMoneyDepositMapViewModel) obj5;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, systemBarsPadding);
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
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    final int i5 = 0;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(956555068, new Function2() { // from class: com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            String str;
                            int i6 = i5;
                            PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel2 = paperMoneyDepositMapViewModel;
                            switch (i6) {
                                case 0:
                                    Composer composer4 = (Composer) obj6;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.Top, gapComposer4, 6);
                                        int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth);
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
                                        Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                        if (paperMoneyDepositMapViewModel2.forcedCameraUpdateViewModel instanceof PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel.CenterOnSelectedLocationViewModel) {
                                            str = "Deposit locations";
                                        } else {
                                            str = paperMoneyDepositMapViewModel2.viewTextViewModel.mapScreen.header_title;
                                            str.getClass();
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        gapComposer4.end(true);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer5 = (Composer) obj6;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                        Icons icons = Icons.Help24;
                                        String str2 = paperMoneyDepositMapViewModel2.viewTextViewModel.mapScreen.tutorial_button_accessibility_label;
                                        if (str2 == null) {
                                            str2 = re$$ExternalSyntheticOutline0.m(gapComposer5, 970873688, R.string.deposits_help_description, gapComposer5, false);
                                        } else {
                                            gapComposer5.startReplaceGroup(970870867);
                                            gapComposer5.end(false);
                                        }
                                        Trace.m1191Iconww6aTOc(icons, str2, (Modifier) null, 0L, gapComposer5, 6, 12);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer3.changed(function12);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda4(23, function12);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-823685225, new ShiftListViewKt$$ExternalSyntheticLambda11(function12, mutableState2, 3), gapComposer3), gapComposer3, 1572918, 44);
                    Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxSize(companion, 1.0f), true);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors3 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors3.semantic.background.subtle, rectangleShapeKt$RectangleShape$1);
                    CashMapViewModel cashMapViewModel = (CashMapViewModel) paperMoneyDepositMapViewModel.cashMapUiModel.model;
                    List list = paperMoneyDepositMapViewModel.mapDataViewModel.retailerLocations;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new PmdClusterItem(new PmdMarkerLocation((GetRetailerLocationsResponse.RetailerLocation) it.next())));
                    }
                    CashMapViewKt.CashMapView(m177backgroundbw27NRU, arrayList, cashMapViewModel, ComposableSingletons$PaperMoneyDepositMapViewKt.lambda$1021443168, ComposableSingletons$PaperMoneyDepositMapViewKt.lambda$408247536, null, null, null, null, null, null, true, false, paperMoneyDepositMapViewModel.cashMapUiModel.onEvent, gapComposer3, 221184, MLKEMEngine.KyberPolyBytes, 12232);
                    Modifier align = boxScopeInstance.align(companion, Alignment.Companion.BottomStart);
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(align, 16.0f);
                    boolean z2 = paperMoneyDepositMapViewModel.helpButtonEnabled;
                    boolean changed2 = gapComposer3.changed(function12);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ComposeDialogKt$$ExternalSyntheticLambda4(24, function12);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function0 = (Function0) rememberedValue3;
                    final int i6 = 1;
                    CashMapViewKt.ArcadeMapIconButton(MLKEMEngine.KyberPolyBytes, 0, gapComposer3, Expect_jvmKt.rememberComposableLambda(863579142, new Function2() { // from class: com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            String str;
                            int i62 = i6;
                            PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel2 = paperMoneyDepositMapViewModel;
                            switch (i62) {
                                case 0:
                                    Composer composer4 = (Composer) obj6;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.Top, gapComposer4, 6);
                                        int hashCode22 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer4.currentCompositionLocalScope();
                                        Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth);
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
                                        Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope22, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode22), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer4, materializeModifier22, ComposeUiNode.Companion.SetModifier);
                                        if (paperMoneyDepositMapViewModel2.forcedCameraUpdateViewModel instanceof PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel.CenterOnSelectedLocationViewModel) {
                                            str = "Deposit locations";
                                        } else {
                                            str = paperMoneyDepositMapViewModel2.viewTextViewModel.mapScreen.header_title;
                                            str.getClass();
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        gapComposer4.end(true);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer5 = (Composer) obj6;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                        Icons icons = Icons.Help24;
                                        String str2 = paperMoneyDepositMapViewModel2.viewTextViewModel.mapScreen.tutorial_button_accessibility_label;
                                        if (str2 == null) {
                                            str2 = re$$ExternalSyntheticOutline0.m(gapComposer5, 970873688, R.string.deposits_help_description, gapComposer5, false);
                                        } else {
                                            gapComposer5.startReplaceGroup(970870867);
                                            gapComposer5.end(false);
                                        }
                                        Trace.m1191Iconww6aTOc(icons, str2, (Modifier) null, 0L, gapComposer5, 6, 12);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3), m298padding3ABfNKs, function0, z2);
                    gapComposer3.end(true);
                    PaperMoneyDepositMapViewKt.Footer(paperMoneyDepositMapViewModel, function12, gapComposer3, 0);
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        gapComposer3.startReplaceGroup(658812887);
                        Object rememberedValue4 = gapComposer3.rememberedValue();
                        if (rememberedValue4 == neverEqualPolicy) {
                            mutableState = mutableState2;
                            rememberedValue4 = new DrawerViewKt$$ExternalSyntheticLambda2(14, mutableState);
                            gapComposer3.updateRememberedValue(rememberedValue4);
                        } else {
                            mutableState = mutableState2;
                        }
                        SheetKt.Sheet((Function0) rememberedValue4, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1745355282, new SectionKt$$ExternalSyntheticLambda2(20, paperMoneyDepositMapViewModel, function12, mutableState), gapComposer3), gapComposer3, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(659171340);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                PaperMoneyDepositMapViewKt.FeeInformation((Icon) obj4, (String) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                Function1 function13 = (Function1) obj4;
                PagerState pagerState = (PagerState) obj5;
                PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel = (PaperMoneyDepositOnboardingViewModel) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                boolean shouldExecute2 = gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2);
                Applier applier2 = gapComposer4.applier;
                if (shouldExecute2) {
                    Modifier fillMaxSize4 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors4 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier systemBarsPadding2 = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize4, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, systemBarsPadding2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer4, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer4, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                    NavigationType navigationType2 = NavigationType.CLOSE;
                    boolean changed3 = gapComposer4.changed(function13) | gapComposer4.changed(pagerState);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda3(function13, pagerState, r13 ? 1 : 0);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, (Function3) null, gapComposer4, 54, 108);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
                    int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer4, composeUiNode$Companion$SetModifier$17, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer4, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                    List list2 = paperMoneyDepositOnboardingViewModel.pages;
                    if (list2.size() > 1) {
                        gapComposer4.startReplaceGroup(-682661880);
                        PagerKt.m328HorizontalPager8jOkeI(pagerState, null, null, null, 0, RecyclerView.DECELERATION_RATE, null, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(1329597803, new ScoreUiFactory$$ExternalSyntheticLambda0(paperMoneyDepositOnboardingViewModel, 11), gapComposer4), gapComposer4, 0, 24576, 16382);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                        PaperMoneyDepositOnboardingViewKt.PagerDots(pagerState.getPageCount(), ((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue(), 0, gapComposer4, new HorizontalAlignElement(Alignment.Companion.CenterHorizontally));
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-682297630);
                        PaperMoneyDepositOnboardingViewKt.OnboardingPage((PaperCashDepositBlocker.TutorialCarousel.Page) CollectionsKt.first(list2), null, gapComposer4, 0);
                        gapComposer4.end(false);
                    }
                    gapComposer4.end(true);
                    DimensionKt.ButtonCtaGroup(null, list2.size() == 1, null, null, Expect_jvmKt.rememberComposableLambda(-698205189, new SectionKt$$ExternalSyntheticLambda2(21, function13, pagerState, paperMoneyDepositOnboardingViewModel), gapComposer4), gapComposer4, 24576, 13);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                EarningsHeaderViewModel.HeaderViewModel.Loaded loaded = (EarningsHeaderViewModel.HeaderViewModel.Loaded) obj4;
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj5;
                Function0 function02 = (Function0) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean changedInstance = gapComposer5.changedInstance(loaded);
                    Object rememberedValue6 = gapComposer5.rememberedValue();
                    if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new RecipientQueries$$ExternalSyntheticLambda0(loaded, i2);
                        gapComposer5.updateRememberedValue(rememberedValue6);
                    }
                    EarningsHeaderKt.AnimatedTotalEarningsAmountText(loaded, moneyFormatter, function02, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue6), gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                zzanv.InstalledUI((EarningsAppletTileModel.Installed) obj4, (AppletTile.AppletTileAppearance) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                zzie.LoadingError((Modifier) obj5, (EducationStoryViewModel.Error) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                RealActivitiesManager.MetroFactory metroFactory = ((FamilyAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) metroFactory.ioDispatcher.invoke();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) metroFactory.badger2.invoke();
                RealFamilyAppletTileRepository realFamilyAppletTileRepository = (RealFamilyAppletTileRepository) metroFactory.errorReporter.invoke();
                AegisService aegisService = (AegisService) metroFactory.appService.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.defaultGetRequestHandlerFactory.invoke();
                CoroutineScope coroutineScope2 = (CoroutineScope) metroFactory.formattingPageRequestHandlerFactory.value;
                moneyAnalyticsService.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                realFamilyAppletTileRepository.getClass();
                aegisService.getClass();
                realRouter$Factory$Impl.getClass();
                coroutineScope2.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(moneyAnalyticsService, promotedAppletTilePresenter$Factory$Impl, realFamilyAppletTileRepository, aegisService, realRouter$Factory$Impl, coroutineScope2, navigator)), coroutineScope, (LifecycleOwner) obj5);
                return new FamilyAppletTile((RealImageLoader) obj3, new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 12), ((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels());
            case 14:
                WorkAppletTile workAppletTile = (WorkAppletTile) obj4;
                AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) obj5;
                State state = (State) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    workAppletTile.UI((DependentActivityAppletTileViewModel) state.getValue(), appletTileAppearance, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((WorkAppletTile) obj4).UI((DependentActivityAppletTileViewModel) obj5, (AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                FamilyAppletTile familyAppletTile = (FamilyAppletTile) obj4;
                AppletTile.AppletTileAppearance appletTileAppearance2 = (AppletTile.AppletTileAppearance) obj5;
                State state2 = (State) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    familyAppletTile.UI((FamilyAppletTileViewModel) state2.getValue(), appletTileAppearance2, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj4).UI((FamilyAppletTileViewModel) obj5, (AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                FamilyAppletTileKt.InstalledUI((FamilyAppletTileViewModel.Installed) obj4, (AppletTile.AppletTileAppearance) obj5, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentAccessControls((Modifier) obj5, (DependentAccessControlsViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentDetailsBalanceSection((Modifier) obj5, (DependentBalancesViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                DependentDetailIntroductionViewModel dependentDetailIntroductionViewModel = (DependentDetailIntroductionViewModel) obj3;
                Function1 function14 = (Function1) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(627827120, new AllowanceViewKt$$ExternalSyntheticLambda0(18, dependentDetailIntroductionViewModel, function14), gapComposer8), gapComposer8, 56);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                AllowanceViewKt.ToolbarContent((Modifier) obj5, (DependentDetailToolbarModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) obj5;
                DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj3;
                Function1 function15 = (Function1) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier performanceLogging = PerformanceLoggingKt.performanceLogging(ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer9), false, 14), realObservabilityManager);
                    ObservabilityView[] observabilityViewArr = ObservabilityView.$VALUES;
                    DependentDetailViewKt.DependentDetail(0, gapComposer9, TestTagKt.testTag(performanceLogging, "dependents_details_screen"), dependentDetailViewModel, function15);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                AllowanceViewKt.AllowanceSelectionKeypadAmountPicker((AmountChooserViewModel.Content) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                RealImageLoader realImageLoader2 = (RealImageLoader) obj5;
                FamilyHomeViewModel familyHomeViewModel = (FamilyHomeViewModel) obj3;
                Function1 function16 = (Function1) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), Expect_jvmKt.rememberComposableLambda(239045594, new AllowanceViewKt$$ExternalSyntheticLambda0(26, familyHomeViewModel, function16), gapComposer10), gapComposer10, 56);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                FamilyHomeViewKt.FamilyHome((FamilyHomeViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                AllowanceViewKt.FamilyMemberRow((FamilyMemberRowViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                RealImageLoader realImageLoader3 = (RealImageLoader) obj5;
                FamilyPendingRequestsViewModel familyPendingRequestsViewModel = (FamilyPendingRequestsViewModel) obj3;
                Function1 function17 = (Function1) obj4;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader3), Expect_jvmKt.rememberComposableLambda(1808612896, new AllowanceViewKt$$ExternalSyntheticLambda0(28, familyPendingRequestsViewModel, function17), gapComposer11), gapComposer11, 56);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                SponsorDetailViewKt.FamilyPendingRequests((FamilyPendingRequestsViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ EarningsHomeKt$$ExternalSyntheticLambda2(Modifier modifier, Object obj, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = function1;
        this.f$2 = modifier;
    }

    public /* synthetic */ EarningsHomeKt$$ExternalSyntheticLambda2(RealImageLoader realImageLoader, Object obj, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = realImageLoader;
        this.f$2 = obj;
        this.f$0 = function1;
    }

    public /* synthetic */ EarningsHomeKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ EarningsHomeKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ EarningsHomeKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = function1;
    }
}
