package com.squareup.cash.family.familyhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
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
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.libraries.places.api.model.zzco;
import com.squareup.cash.R;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.observabilitynaming.ObservabilityView;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewModel;
import com.squareup.cash.family.familyhub.viewmodels.ControlErrorViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentAccessControlsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentBalancesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$Enabled;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsFooterViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsPrivacySectionModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailIntroductionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListItem;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListSection;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMultiplePendingRequestsRowModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingInvitesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SetDependentCustomLimitErrorViewModel;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class AllowanceViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AllowanceViewKt$$ExternalSyntheticLambda0(DependentBalancesViewModel dependentBalancesViewModel, Function1 function1) {
        this.$r8$classId = 16;
        this.f$0 = dependentBalancesViewModel;
        this.f$1 = function1;
    }

    private final Object invoke$com$squareup$cash$family$familyhub$views$FamilyPendingRequestsViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        FamilyPendingRequestsViewModel familyPendingRequestsViewModel = (FamilyPendingRequestsViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else if (familyPendingRequestsViewModel == null) {
            gapComposer.startReplaceGroup(22074521);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(22074522);
            SponsorDetailViewKt.FamilyPendingRequests(familyPendingRequestsViewModel, function1, ImageKt.verticalScroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(gapComposer), false, 14), gapComposer, 0);
            gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05bb  */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ?? r7;
        boolean z2;
        Modifier.Companion companion;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Modifier wrapContentHeight;
        int i = this.$r8$classId;
        int i2 = 14;
        Object obj3 = Composer.Companion.Empty;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                AllowanceViewModel allowanceViewModel = (AllowanceViewModel) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (allowanceViewModel == null) {
                    gapComposer.startReplaceGroup(1568325315);
                    gapComposer.end(false);
                } else if (allowanceViewModel instanceof AllowanceViewModel.Loading) {
                    gapComposer.startReplaceGroup(1568326127);
                    AllowanceViewKt.LoadingShimmer(gapComposer, 0);
                    gapComposer.end(false);
                } else if (allowanceViewModel instanceof AllowanceViewModel.NoAllowanceInDependentDetail) {
                    gapComposer.startReplaceGroup(1568328015);
                    AllowanceViewKt.NoAllowanceInDependentDetailView((AllowanceViewModel.NoAllowanceInDependentDetail) allowanceViewModel, function1, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    if (!(allowanceViewModel instanceof AllowanceViewModel.AllowanceDetail)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1568324695, false);
                    }
                    gapComposer.startReplaceGroup(1568333214);
                    AllowanceViewKt.AllowanceDetail((AllowanceViewModel.AllowanceDetail) allowanceViewModel, function1, gapComposer, 0);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                FamilyAppletTileKt.UninstalledUI((FamilyAppletTileViewModel.Uninstalled) obj5, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AllowanceViewKt.NoAllowanceInDependentDetailView((AllowanceViewModel.NoAllowanceInDependentDetail) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AllowanceViewKt.AllowanceDetail((AllowanceViewModel.AllowanceDetail) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ControlErrorViewModel controlErrorViewModel = (ControlErrorViewModel) obj5;
                Function1 function12 = (Function1) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                } else if (controlErrorViewModel == null) {
                    gapComposer2.startReplaceGroup(-639166815);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-639166814);
                    AnimatedContentKt.AnimatedVisibility(true, (Modifier) null, (EnterTransitionImpl) null, (ExitTransitionImpl) null, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(79215622, new ControlErrorDialogKt$$ExternalSyntheticLambda2(controlErrorViewModel, function12), gapComposer2), (Composer) gapComposer2, 196614, 30);
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentControlManagedAccountContent((DependentControlViewModel.ManagedAccount) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentControlApprovedContactsContent((DependentControlViewModel.ApprovedContacts) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentControlCashCardWithTagsContent((DependentControlViewModel.CashCardWithTags) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentControlToggleContent((DependentControlViewModel.Toggle) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                Function1 function13 = (Function1) obj4;
                DependentControlViewModel dependentControlViewModel = (DependentControlViewModel) obj5;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean changed2 = gapComposer3.changed(function13);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue3 == obj3) {
                        rememberedValue3 = new ComposeDialogKt$$ExternalSyntheticLambda3(18, function13);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue3, gapComposer3, 0);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    ObservabilityView[] observabilityViewArr = ObservabilityView.$VALUES;
                    Modifier testTag = TestTagKt.testTag(systemBarsPadding, "dependents_controls_limits_toggle_screen");
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, testTag);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String toolbarTitle = dependentControlViewModel.getToolbarTitle();
                    String str = toolbarTitle.length() > 0 ? toolbarTitle : null;
                    NavigationType navigationType = NavigationType.BACK;
                    Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    boolean changed3 = gapComposer3.changed(function13);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue4 == obj3) {
                        rememberedValue4 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(8, function13);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub(str, navigationType, m177backgroundbw27NRU, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer3, 48, 104);
                    if (dependentControlViewModel instanceof DependentControlViewModel.Toggle) {
                        gapComposer3.startReplaceGroup(26755132);
                        AllowanceViewKt.DependentControlToggleContent((DependentControlViewModel.Toggle) dependentControlViewModel, function13, gapComposer3, 0);
                        gapComposer3.end(false);
                    } else if (dependentControlViewModel instanceof DependentControlViewModel.CashCardWithTags) {
                        gapComposer3.startReplaceGroup(26758758);
                        AllowanceViewKt.DependentControlCashCardWithTagsContent((DependentControlViewModel.CashCardWithTags) dependentControlViewModel, function13, gapComposer3, 0);
                        gapComposer3.end(false);
                    } else if (dependentControlViewModel instanceof DependentControlViewModel.ApprovedContacts) {
                        gapComposer3.startReplaceGroup(26762694);
                        AllowanceViewKt.DependentControlApprovedContactsContent((DependentControlViewModel.ApprovedContacts) dependentControlViewModel, function13, gapComposer3, 0);
                        gapComposer3.end(false);
                    } else {
                        if (!(dependentControlViewModel instanceof DependentControlViewModel.ManagedAccount)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 26753583, false);
                        }
                        gapComposer3.startReplaceGroup(26766564);
                        AllowanceViewKt.DependentControlManagedAccountContent((DependentControlViewModel.ManagedAccount) dependentControlViewModel, function13, gapComposer3, 0);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                AllowanceViewKt.AllowlistToggleSection((DependentControlsToggleViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                DependentControlsAndLimitsViewModel dependentControlsAndLimitsViewModel = (DependentControlsAndLimitsViewModel) obj5;
                Function1 function14 = (Function1) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                boolean shouldExecute = gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2);
                Applier applier = gapComposer4.applier;
                if (!shouldExecute) {
                    gapComposer4.skipToGroupEnd();
                } else if (dependentControlsAndLimitsViewModel == null) {
                    gapComposer4.startReplaceGroup(1280737824);
                    gapComposer4.end(false);
                } else {
                    DependentControlsAndLimitsFooterViewModel dependentControlsAndLimitsFooterViewModel = dependentControlsAndLimitsViewModel.footer;
                    gapComposer4.startReplaceGroup(1280737825);
                    Modifier systemBarsPadding2 = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getColors(gapComposer4).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    ObservabilityView[] observabilityViewArr2 = ObservabilityView.$VALUES;
                    Modifier testTag2 = TestTagKt.testTag(systemBarsPadding2, "dependents_controls_limits_screen");
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, testTag2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    String str2 = dependentControlsAndLimitsViewModel.toolbarTitle;
                    NavigationType navigationType2 = NavigationType.BACK;
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(companion2, Strings.getColors(gapComposer4).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    boolean changed4 = gapComposer4.changed(function14);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue5 == obj3) {
                        rememberedValue5 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(11, function14);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    DBUtil.TitleBarSub(str2, navigationType2, m177backgroundbw27NRU2, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, (Function3) null, gapComposer4, 48, 104);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion2, 1.0f), ImageKt.rememberScrollState(gapComposer4), false, 14);
                    Strings.getSizes(gapComposer4).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(verticalScroll$default, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, m302paddingqDBjuR0$default);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer4, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                    ViewfinderDefaults.SectionHeader(dependentControlsAndLimitsViewModel.title, (Modifier) null, (String) null, (Function0) null, dependentControlsAndLimitsViewModel.subtitle, gapComposer4, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                    AllowanceViewKt.ControlRow(Icons.TransferP2P24, R.string.profile_family_account_detail_screen_payments, ControlType.P2P, dependentControlsAndLimitsViewModel.paymentsControl, function14, gapComposer4, 390);
                    AllowanceViewKt.ControlRow(Icons.CardBasic24, R.string.profile_family_account_detail_screen_cash_card_spending, ControlType.CASH_CARD, dependentControlsAndLimitsViewModel.cardControl, function14, gapComposer4, 390);
                    zzco zzcoVar = dependentControlsAndLimitsViewModel.stockInvestingStatus;
                    if (zzcoVar == null) {
                        gapComposer4.startReplaceGroup(1059288128);
                        z = false;
                        gapComposer4.end(false);
                    } else {
                        z = false;
                        gapComposer4.startReplaceGroup(1059288129);
                        AllowanceViewKt.ControlRow(Icons.Investing24, R.string.profile_family_account_detail_screen_stock_investing, ControlType.STOCKS, zzcoVar, function14, gapComposer4, 390);
                        gapComposer4.end(false);
                    }
                    zzco zzcoVar2 = dependentControlsAndLimitsViewModel.bitcoinInvestingStatus;
                    if (zzcoVar2 == null) {
                        gapComposer4.startReplaceGroup(1059628663);
                        gapComposer4.end(z);
                    } else {
                        gapComposer4.startReplaceGroup(1059628664);
                        AllowanceViewKt.ControlRow(Icons.NavigationBitcoin, R.string.profile_family_account_detail_screen_bitcoin_investing, ControlType.BITCOIN, zzcoVar2, function14, gapComposer4, 390);
                        gapComposer4.end(z);
                    }
                    AllowanceViewKt.ControlRow(Icons.CategoryDesigner24, R.string.profile_family_account_detail_screen_promotions, ControlType.PROMOTIONS, dependentControlsAndLimitsViewModel.promotionsStatus, function14, gapComposer4, 390);
                    if (dependentControlsAndLimitsFooterViewModel.isAllowlistStyle) {
                        gapComposer4.startReplaceGroup(1060255918);
                        SpacerKt.Spacer(gapComposer4, new LayoutWeightElement(1.0f, true));
                        r7 = 0;
                        gapComposer4.end(false);
                    } else {
                        r7 = 0;
                        gapComposer4.startReplaceGroup(1060317422);
                        gapComposer4.end(false);
                    }
                    AllowanceViewKt.FooterComponent(dependentControlsAndLimitsFooterViewModel, function14, gapComposer4, r7);
                    DependentControlsAndLimitsPrivacySectionModel dependentControlsAndLimitsPrivacySectionModel = dependentControlsAndLimitsViewModel.privacySection;
                    if (dependentControlsAndLimitsPrivacySectionModel == null) {
                        gapComposer4.startReplaceGroup(1060430912);
                        gapComposer4.end(r7);
                        z2 = true;
                    } else {
                        gapComposer4.startReplaceGroup(1060430913);
                        z2 = true;
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(r7, 1, gapComposer4, null);
                        AllowanceViewKt.PrivacySection(dependentControlsAndLimitsPrivacySectionModel.title, dependentControlsAndLimitsPrivacySectionModel.label, dependentControlsAndLimitsPrivacySectionModel.body, dependentControlsAndLimitsPrivacySectionModel.numOfBlockedAccounts, function14, gapComposer4, 0);
                        gapComposer4.end(r7);
                    }
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer4, z2, z2, (boolean) r7);
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                AllowanceViewKt.FooterComponent((DependentControlsAndLimitsFooterViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                String str3 = (String) obj5;
                Integer num = (Integer) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer5, 48);
                    int hashCode4 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer5, companion2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer5, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer5, materializeModifier4, ComposeUiNode.Companion.SetModifier, 1.0f, true), (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    if (num == null) {
                        gapComposer5.startReplaceGroup(-166845854);
                        AllowanceViewKt.ShimmeringDetails(gapComposer5, 0);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(-166793154);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer5, (Modifier) null, ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, String.valueOf(num.intValue()), (Map) null, (Function1) null, false);
                        gapComposer5.end(false);
                    }
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Icons icons = (Icons) obj5;
                zzco zzcoVar3 = (zzco) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    DependentControlRowState$Enabled dependentControlRowState$Enabled = zzcoVar3 instanceof DependentControlRowState$Enabled ? (DependentControlRowState$Enabled) zzcoVar3 : null;
                    Trace.m1191Iconww6aTOc(icons, dependentControlRowState$Enabled != null ? dependentControlRowState$Enabled.description : null, (Modifier) null, 0L, gapComposer6, 0, 12);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj5;
                Function1 function15 = (Function1) obj4;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    Modifier m177backgroundbw27NRU3 = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion3, 1.0f), Strings.getColors(gapComposer7).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer7, 48);
                    int hashCode5 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer7, m177backgroundbw27NRU3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    if (dependentDetailViewModel != null) {
                        DependentBalancesViewModel dependentBalancesViewModel = dependentDetailViewModel.balances;
                        if (!dependentBalancesViewModel.getCashBalance().showLoadingIndicator) {
                            gapComposer7.startReplaceGroup(-683302328);
                            Object rememberedValue6 = gapComposer7.rememberedValue();
                            if (rememberedValue6 == obj3) {
                                rememberedValue6 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(3);
                                gapComposer7.updateRememberedValue(rememberedValue6);
                            }
                            Room.m1165Text25TpFw(2, 1, 0, 3, 1769472, 0, 3728, Strings.getColors(gapComposer7).semantic.text.standard, (Composer) gapComposer7, SemanticsModifierKt.semantics(companion3, false, (Function1) rememberedValue6), Strings.getTypography(gapComposer7).numeralLarge, (TextLineBalancing) null, dependentBalancesViewModel.getCashBalance().balance, (Map) null, (Function1) null, false);
                            gapComposer7.end(false);
                            companion = companion3;
                            rememberedValue = gapComposer7.rememberedValue();
                            if (rememberedValue == obj3) {
                                rememberedValue = new FamilyActivityFixtures$$ExternalSyntheticLambda0(4);
                                gapComposer7.updateRememberedValue(rememberedValue);
                            }
                            Room.m1165Text25TpFw(2, 1, 0, 3, 1769472, 0, 3728, Strings.getColors(gapComposer7).semantic.text.subtle, (Composer) gapComposer7, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), Strings.getTypography(gapComposer7).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.dependent_detail_cash_balance_subtitle), (Map) null, (Function1) null, false);
                            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(SizeKt.fillMaxWidth(companion, 1.0f), 24.0f, 32.0f, 24.0f, 16.0f);
                            changed = gapComposer7.changed(function15);
                            rememberedValue2 = gapComposer7.rememberedValue();
                            if (!changed || rememberedValue2 == obj3) {
                                rememberedValue2 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(12, function15);
                                gapComposer7.updateRememberedValue(rememberedValue2);
                            }
                            coil3.size.SizeKt.Button((Function0) rememberedValue2, m301paddingqDBjuR0, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(2138461677, new ArcadeModal$$ExternalSyntheticLambda3(dependentDetailViewModel, i2), gapComposer7), gapComposer7, 1573248, 56);
                            gapComposer7.end(true);
                        }
                    }
                    gapComposer7.startReplaceGroup(-683540532);
                    Strings.getSizes(gapComposer7).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(gapComposer7).getClass();
                    companion = companion3;
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer7, SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5));
                    gapComposer7.end(false);
                    rememberedValue = gapComposer7.rememberedValue();
                    if (rememberedValue == obj3) {
                    }
                    Room.m1165Text25TpFw(2, 1, 0, 3, 1769472, 0, 3728, Strings.getColors(gapComposer7).semantic.text.subtle, (Composer) gapComposer7, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), Strings.getTypography(gapComposer7).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.dependent_detail_cash_balance_subtitle), (Map) null, (Function1) null, false);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier m301paddingqDBjuR02 = SpacerKt.m301paddingqDBjuR0(SizeKt.fillMaxWidth(companion, 1.0f), 24.0f, 32.0f, 24.0f, 16.0f);
                    changed = gapComposer7.changed(function15);
                    rememberedValue2 = gapComposer7.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(12, function15);
                    gapComposer7.updateRememberedValue(rememberedValue2);
                    coil3.size.SizeKt.Button((Function0) rememberedValue2, m301paddingqDBjuR02, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(2138461677, new ArcadeModal$$ExternalSyntheticLambda3(dependentDetailViewModel, i2), gapComposer7), gapComposer7, 1573248, 56);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                DependentBalancesViewModel dependentBalancesViewModel2 = (DependentBalancesViewModel) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Colors colors3 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier m177backgroundbw27NRU4 = ImageKt.m177backgroundbw27NRU(companion2, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode6 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer8, m177backgroundbw27NRU4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    if (dependentBalancesViewModel2 == null) {
                        gapComposer8.startReplaceGroup(1579066461);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(1579066462);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer8, null);
                        gapComposer8.startReplaceGroup(328034439);
                        List list = dependentBalancesViewModel2.balances;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj6 : list) {
                            if (!Intrinsics.areEqual(((DependentBalancesViewModel.BalanceStatModel) obj6).balanceName, "Cash")) {
                                arrayList.add(obj6);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            DependentBalancesViewModel.BalanceStatModel balanceStatModel = (DependentBalancesViewModel.BalanceStatModel) it.next();
                            if (balanceStatModel.showLoadingIndicator) {
                                gapComposer8.startReplaceGroup(-276854021);
                                AllowanceViewKt.DependentDetailLoadingState(gapComposer8, 0);
                                gapComposer8.end(false);
                            } else {
                                gapComposer8.startReplaceGroup(-276792858);
                                AllowanceViewKt.DependentDetailsBalanceItem(balanceStatModel, function16, gapComposer8, 0);
                                gapComposer8.end(false);
                            }
                        }
                        gapComposer8.end(false);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer8, null);
                        gapComposer8.end(false);
                    }
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentDetailsBalanceItem((DependentBalancesViewModel.BalanceStatModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                DependentDetailIntroductionViewModel dependentDetailIntroductionViewModel = (DependentDetailIntroductionViewModel) obj5;
                Function1 function17 = (Function1) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (!gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    gapComposer9.skipToGroupEnd();
                } else if (dependentDetailIntroductionViewModel == null) {
                    gapComposer9.startReplaceGroup(-984807067);
                    gapComposer9.end(false);
                } else {
                    gapComposer9.startReplaceGroup(-984807066);
                    AnimatedContentKt.AnimatedVisibility(true, (Modifier) null, (EnterTransitionImpl) null, (ExitTransitionImpl) null, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1685707965, new DependentDetailIntroductionDialogViewKt$$ExternalSyntheticLambda3(dependentDetailIntroductionViewModel, function17), gapComposer9), (Composer) gapComposer9, 196614, 30);
                    gapComposer9.end(false);
                }
                return Unit.INSTANCE;
            case 19:
                DependentAccessControlsViewModel dependentAccessControlsViewModel = (DependentAccessControlsViewModel) obj5;
                Function1 function18 = (Function1) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Colors colors4 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    Modifier m177backgroundbw27NRU5 = ImageKt.m177backgroundbw27NRU(companion2, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer10, 0);
                    int hashCode7 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer10, m177backgroundbw27NRU5);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$16);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy6, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer10, R.string.dependent_detail_settings_section_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer10, 0, 30);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                    AllowanceViewKt.DependentAccessControls(null, dependentAccessControlsViewModel, function18, gapComposer10, 0);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                DependentDetailToolbarModel dependentDetailToolbarModel = (DependentDetailToolbarModel) obj5;
                Function1 function19 = (Function1) obj4;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    wrapContentHeight = SizeKt.wrapContentHeight(companion2, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Colors colors5 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    Modifier statusBarsPadding = SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(wrapContentHeight, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode8 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer11, statusBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$17 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$17);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                    BiasAlignment biasAlignment2 = Alignment.Companion.TopCenter;
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    AllowanceViewKt.ToolbarContent(boxScopeInstance.align(companion2, biasAlignment2), dependentDetailToolbarModel, function19, gapComposer11, 0);
                    Modifier align = boxScopeInstance.align(companion2, biasAlignment);
                    NavigationType navigationType3 = NavigationType.BACK;
                    boolean changed5 = gapComposer11.changed(function19);
                    Object rememberedValue7 = gapComposer11.rememberedValue();
                    if (changed5 || rememberedValue7 == obj3) {
                        rememberedValue7 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(14, function19);
                        gapComposer11.updateRememberedValue(rememberedValue7);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType3, align, (DynamicColorConfiguration) null, (Function0) rememberedValue7, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1606118152, new ArcadeModal2Kt$$ExternalSyntheticLambda0(9, dependentDetailToolbarModel, function19), gapComposer11), gapComposer11, 1572918, 40);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                AmountChooserViewModel amountChooserViewModel = (AmountChooserViewModel) obj5;
                Function1 function110 = (Function1) obj4;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                int i3 = FamilyAmountSelectionBottomSheet.$r8$clinit;
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    AllowanceViewKt.AllowanceSelectionBottomSheetContent(amountChooserViewModel, function110, null, gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                AllowanceViewKt.FamilyHomePendingInviteSection((FamilyPendingInvitesViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                AllowanceViewKt.FamilyHomeListSection((FamilyListSection) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                AllowanceViewKt.FamilyHomeListItem((FamilyListItem) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                AllowanceViewKt.LoadedFamilyHomeListItem((FamilyListItem.Loaded) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                FamilyHomeViewModel familyHomeViewModel = (FamilyHomeViewModel) obj5;
                Function1 function111 = (Function1) obj4;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    ObservabilityView[] observabilityViewArr3 = ObservabilityView.$VALUES;
                    FamilyHomeViewKt.FamilyHome(familyHomeViewModel, function111, TestTagKt.testTag(companion2, "family_home_screen"), gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                AllowanceViewKt.FamilyMultiplePendingRequestsRow((FamilyMultiplePendingRequestsRowModel) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                return invoke$com$squareup$cash$family$familyhub$views$FamilyPendingRequestsViewKt$$ExternalSyntheticLambda2(obj, obj2);
            default:
                SetDependentCustomLimitErrorViewModel setDependentCustomLimitErrorViewModel = (SetDependentCustomLimitErrorViewModel) obj5;
                Function1 function112 = (Function1) obj4;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (!gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    gapComposer14.skipToGroupEnd();
                } else if (setDependentCustomLimitErrorViewModel == null) {
                    gapComposer14.startReplaceGroup(1114479516);
                    gapComposer14.end(false);
                } else {
                    gapComposer14.startReplaceGroup(1114479517);
                    boolean changed6 = gapComposer14.changed(function112);
                    Object rememberedValue8 = gapComposer14.rememberedValue();
                    if (changed6 || rememberedValue8 == obj3) {
                        rememberedValue8 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(27, function112);
                        gapComposer14.updateRememberedValue(rememberedValue8);
                    }
                    ModalKt.Dimmer(null, (Function0) rememberedValue8, null, Expect_jvmKt.rememberComposableLambda(-748354805, new SetDependentCustomLimitErrorViewKt$$ExternalSyntheticLambda3(setDependentCustomLimitErrorViewModel, function112), gapComposer14), gapComposer14, 3072, 5);
                    gapComposer14.end(false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AllowanceViewKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ AllowanceViewKt$$ExternalSyntheticLambda0(DependentControlsAndLimitsViewModel dependentControlsAndLimitsViewModel, Function1 function1) {
        this.$r8$classId = 11;
        this.f$0 = dependentControlsAndLimitsViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ AllowanceViewKt$$ExternalSyntheticLambda0(DependentDetailViewModel dependentDetailViewModel, Function1 function1) {
        this.$r8$classId = 15;
        this.f$0 = dependentDetailViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ AllowanceViewKt$$ExternalSyntheticLambda0(Object obj, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = function;
    }

    public /* synthetic */ AllowanceViewKt$$ExternalSyntheticLambda0(Function1 function1, DependentControlViewModel dependentControlViewModel) {
        this.$r8$classId = 9;
        this.f$1 = function1;
        this.f$0 = dependentControlViewModel;
    }
}
