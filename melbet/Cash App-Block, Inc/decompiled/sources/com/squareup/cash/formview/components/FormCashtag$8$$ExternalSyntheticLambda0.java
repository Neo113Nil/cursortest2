package com.squareup.cash.formview.components;

import android.content.Context;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.core.graphics.PaintCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.observabilitynaming.ObservabilityView;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorLedInviteViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.U13CelebrationViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.SponsorDetailViewKt;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactMethod;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorErrorViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SponsorRowViewModel;
import com.squareup.cash.family.requestsponsorship.views.SelectSponsorErrorView;
import com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewModel;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.favorites.viewmodels.FavoriteAvatar;
import com.squareup.cash.favorites.viewmodels.FavoritesMessageViewModel;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormCallToActionKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormInstructionCardKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormLegalTextKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormListOrderedKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormListUnorderedKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormMerchantTransactionKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormMoneyKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormPaymentPlanScheduleKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormPaymentPlanSummaryKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormSectionHeaderElementKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormTimelineCardListElementKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormUpsellKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormUpsellKt$$ExternalSyntheticLambda7;
import com.squareup.cash.formview.presenters.FormCashtagPresenter;
import com.squareup.cash.formview.viewmodels.FormCashtagViewModel;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormCashtag$8$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ FormCashtag$8$$ExternalSyntheticLambda0(FormBlocker.Element.CashAppTagElement cashAppTagElement, SyncValueReader syncValueReader, int i) {
        this.$r8$classId = 15;
        WandPose wandPose = WandPose.Float;
        this.f$0 = cashAppTagElement;
        this.f$1 = syncValueReader;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier wrapContentHeight;
        String str;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i2 = 16;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        String str2 = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final int i3 = 1;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = (FlowKt__MergeKt$flatMapConcat$$inlined$map$1) obj3;
                ((Integer) obj2).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj);
                gapComposer.startReplaceGroup(-1427779326);
                FormCashtagPresenter formCashtagPresenter = ((FormCashtag) obj4).transformer;
                if (formCashtagPresenter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("transformer");
                    throw null;
                }
                FormCashtagViewModel formCashtagViewModel = (FormCashtagViewModel) formCashtagPresenter.models(flowKt__MergeKt$flatMapConcat$$inlined$map$1, gapComposer, 0);
                gapComposer.end(false);
                return formCashtagViewModel;
            case 1:
                SponsorDetailViewModel sponsorDetailViewModel = (SponsorDetailViewModel) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ObservabilityView[] observabilityViewArr = ObservabilityView.$VALUES;
                    SponsorDetailViewKt.SponsorDetail(ImageKt.verticalScroll$default(TestTagKt.testTag(companion, "sponsor_details_screen"), ImageKt.rememberScrollState(gapComposer2), false, 14), sponsorDetailViewModel, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                SponsorDetailViewKt.SponsorLedInviteContentLoaded((SponsorLedInviteViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                final SponsorResourcesViewModel sponsorResourcesViewModel = (SponsorResourcesViewModel) obj4;
                final Function1 function12 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (!gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                } else if (sponsorResourcesViewModel == null) {
                    gapComposer3.startReplaceGroup(945226574);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(945226575);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(companion), 1.0f);
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), null, null, Expect_jvmKt.rememberComposableLambda(36095820, new Function3() { // from class: com.squareup.cash.family.familyhub.views.SponsorResourcesViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i4 = r3;
                            Function1 function13 = function12;
                            SponsorResourcesViewModel sponsorResourcesViewModel2 = sponsorResourcesViewModel;
                            switch (i4) {
                                case 0:
                                    Composer composer3 = (Composer) obj6;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    ((ColumnScope) obj5).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str3 = sponsorResourcesViewModel2.toolbarTitle;
                                        NavigationType navigationType = NavigationType.BACK;
                                        boolean changed = gapComposer4.changed(function13);
                                        Object rememberedValue = gapComposer4.rememberedValue();
                                        if (changed || rememberedValue == Composer.Companion.Empty) {
                                            rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(6, function13);
                                            gapComposer4.updateRememberedValue(rememberedValue);
                                        }
                                        DBUtil.TitleBarSub(str3, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer4, 48, 108);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer4 = (Composer) obj6;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    ((ScrollingScaffoldContentScope) obj5).getClass();
                                    GapComposer gapComposer5 = (GapComposer) composer4;
                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                                        int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, fillMaxWidth);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer5.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer5.startReusableNode();
                                        if (gapComposer5.inserting) {
                                            gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer5.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                                        SponsorDetailViewKt.SponsorResourcesSection(sponsorResourcesViewModel2.resourcesSection, function13, gapComposer5, 0);
                                        gapComposer5.startReplaceGroup(-1804731243);
                                        gapComposer5.end(false);
                                        gapComposer5.end(true);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3), null, Expect_jvmKt.rememberComposableLambda(-458099678, new Function3() { // from class: com.squareup.cash.family.familyhub.views.SponsorResourcesViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i4 = i3;
                            Function1 function13 = function12;
                            SponsorResourcesViewModel sponsorResourcesViewModel2 = sponsorResourcesViewModel;
                            switch (i4) {
                                case 0:
                                    Composer composer3 = (Composer) obj6;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    ((ColumnScope) obj5).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str3 = sponsorResourcesViewModel2.toolbarTitle;
                                        NavigationType navigationType = NavigationType.BACK;
                                        boolean changed = gapComposer4.changed(function13);
                                        Object rememberedValue = gapComposer4.rememberedValue();
                                        if (changed || rememberedValue == Composer.Companion.Empty) {
                                            rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(6, function13);
                                            gapComposer4.updateRememberedValue(rememberedValue);
                                        }
                                        DBUtil.TitleBarSub(str3, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer4, 48, 108);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer4 = (Composer) obj6;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    ((ScrollingScaffoldContentScope) obj5).getClass();
                                    GapComposer gapComposer5 = (GapComposer) composer4;
                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                                        int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, fillMaxWidth);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer5.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer5.startReusableNode();
                                        if (gapComposer5.inserting) {
                                            gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer5.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                                        SponsorDetailViewKt.SponsorResourcesSection(sponsorResourcesViewModel2.resourcesSection, function13, gapComposer5, 0);
                                        gapComposer5.startReplaceGroup(-1804731243);
                                        gapComposer5.end(false);
                                        gapComposer5.end(true);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3), gapComposer3, 199680, 22);
                    gapComposer3.end(false);
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                SponsorDetailViewKt.SponsorResourcesSection((SponsorResourcesSectionViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                Function1 function13 = (Function1) obj4;
                U13CelebrationViewModel u13CelebrationViewModel = (U13CelebrationViewModel) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 6);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer4.changed(function13);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(7, function13);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer4, 54, 108);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    SpacerKt.Spacer(gapComposer4, columnScopeInstance.weight(1.0f, companion, true));
                    AllowanceViewKt.U13CelebrationHero(columnScopeInstance.align(companion, Alignment.Companion.CenterHorizontally), gapComposer4, 0);
                    SpacerKt.Spacer(gapComposer4, columnScopeInstance.weight(1.0f, companion, true));
                    ViewfinderKt.HeroHeader(u13CelebrationViewModel.title, (Modifier) null, (String) null, (TextStyle) null, gapComposer4, 0, 14);
                    SpacerKt.Spacer(gapComposer4, SizeKt.m277height3ABfNKs(companion, 32.0f));
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1777203676, new ArcadeModal2Kt$$ExternalSyntheticLambda0(i2, function13, u13CelebrationViewModel), gapComposer4), gapComposer4, 24576, 15);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer4, null);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                SponsorRowViewKt.ContactMethodRow((ContactMethod) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                SelectSponsorErrorViewModel selectSponsorErrorViewModel = (SelectSponsorErrorViewModel) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i4 = SelectSponsorErrorView.$r8$clinit;
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    SponsorRowViewKt.SelectSponsorErrorDialog(selectSponsorErrorViewModel, function14, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                SponsorRowViewKt.SponsorRow((SponsorRowViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                SafetyHubViewModel safetyHubViewModel = (SafetyHubViewModel) obj4;
                Function1 function15 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    SafetyHubViewKt.SafetyHubView(safetyHubViewModel, function15, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                FavoritesMessageViewModel favoritesMessageViewModel = (FavoritesMessageViewModel) obj4;
                Function1 function16 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    AddFavoritesViewKt.FavoritesMessage(favoritesMessageViewModel, function16, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                FavoriteAvatar favoriteAvatar = (FavoriteAvatar) obj4;
                Function0 function0 = (Function0) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Arrangement$Center$1 arrangement$Center$1 = SpacerKt.Center;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                    wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.m290width3ABfNKs(companion, 56.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer8, 54);
                    int hashCode2 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer8, wrapContentHeight);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Character ch = favoriteAvatar.monogram;
                    String themedUrl = ComposeUtilsKt.getThemedUrl(favoriteAvatar.photoImage, gapComposer8);
                    Color color = favoriteAvatar.accentColor;
                    gapComposer8.startReplaceGroup(51129483);
                    Integer forTheme = ThemablesKt.forTheme(color, ThemeHelpersKt.themeInfo((Context) gapComposer8.consume(AndroidCompositionLocals_androidKt.LocalContext)));
                    gapComposer8.end(false);
                    PaintCompat.m1090RecipientAvatarView_hDl4AY(null, ch, themedUrl, null, ColorKt.Color(forTheme != null ? forTheme.intValue() : 0), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, true, RecyclerView.DECELERATION_RATE, function0, gapComposer8, 12582912);
                    KeypadKt.m3651TextPdH14aY(2, 0, 3, 0, 196608, 0, 3794, MooncakeTheme.getColors(gapComposer8).tertiaryLabel, (Composer) gapComposer8, (Modifier) null, TextStyle.m994copyp1EtxEg$default(MooncakeTheme.getTypography(gapComposer8).caption, 0L, Room.getSp(12), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, favoriteAvatar.name, (Map) null, (Function1) null, false);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                FidesmoProvisioningViewKt.InstructionList((ListUnordered) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                FidesmoProvisioningViewKt.SuccessCard((FidesmoProvisioningViewModel.Success.Provisioned.Card) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ArcadeFormButtonView arcadeFormButtonView = (ArcadeFormButtonView) obj4;
                Function0 function02 = (Function0) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    arcadeFormButtonView.ElementButton(MLKEMEngine.KyberPolyBytes, gapComposer9, Expect_jvmKt.rememberComposableLambda(-1445430247, new ArcadeModal$$ExternalSyntheticLambda3(arcadeFormButtonView, 27), gapComposer9), null, function02);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                FormCashAppTagElementKt.FormCashAppTagElement((FormBlocker.Element.CashAppTagElement) obj4, (SyncValueReader) obj3, Modifier.Companion.$$INSTANCE, WandPose.Review, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                FormBlocker.Element.CashAppTagElement cashAppTagElement = (FormBlocker.Element.CashAppTagElement) obj4;
                FormElementViewBuilder formElementViewBuilder = (FormElementViewBuilder) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    FormCashAppTagElementKt.FormCashAppTagElement(cashAppTagElement, formElementViewBuilder.syncValueReader, null, null, gapComposer10, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                FormBlocker.Element.CallToActionElement callToActionElement = (FormBlocker.Element.CallToActionElement) obj4;
                FormElementViewBuilder formElementViewBuilder2 = (FormElementViewBuilder) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow = formElementViewBuilder2.viewEvents;
                    boolean changedInstance = gapComposer11.changedInstance(mutableSharedFlow);
                    Object rememberedValue2 = gapComposer11.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$8$1$1$1 formElementViewBuilder$toView$8$1$1$1 = new FormElementViewBuilder$toView$8$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer11.updateRememberedValue(formElementViewBuilder$toView$8$1$1$1);
                        rememberedValue2 = formElementViewBuilder$toView$8$1$1$1;
                    }
                    ArcadeFormCallToActionKt.ArcadeFormCallToAction(callToActionElement, (Function1) ((KFunction) rememberedValue2), formElementViewBuilder2.imageLoader, null, gapComposer11, 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                FormBlocker.Element.MoneyElement moneyElement = (FormBlocker.Element.MoneyElement) obj4;
                FormElementViewBuilder formElementViewBuilder3 = (FormElementViewBuilder) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    MoneyFormatter moneyFormatter = formElementViewBuilder3.moneyFormatter;
                    boolean changedInstance2 = gapComposer12.changedInstance(moneyFormatter);
                    Object rememberedValue3 = gapComposer12.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$7$1$1$1 formElementViewBuilder$toView$7$1$1$1 = new FormElementViewBuilder$toView$7$1$1$1(1, 0, MoneyFormatter.class, moneyFormatter, "format", "format(Lcom/squareup/protos/common/Money;)Ljava/lang/String;");
                        gapComposer12.updateRememberedValue(formElementViewBuilder$toView$7$1$1$1);
                        rememberedValue3 = formElementViewBuilder$toView$7$1$1$1;
                    }
                    ArcadeFormMoneyKt.ArcadeFormMoney(moneyElement, (Function1) ((KFunction) rememberedValue3), null, gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                FormBlocker.Element.TimelineCardListElement timelineCardListElement = (FormBlocker.Element.TimelineCardListElement) obj4;
                FormElementViewBuilder formElementViewBuilder4 = (FormElementViewBuilder) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow2 = formElementViewBuilder4.viewEvents;
                    boolean changedInstance3 = gapComposer13.changedInstance(mutableSharedFlow2);
                    Object rememberedValue4 = gapComposer13.rememberedValue();
                    if (changedInstance3 || rememberedValue4 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$26$1$1$1 formElementViewBuilder$toView$26$1$1$1 = new FormElementViewBuilder$toView$26$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow2, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer13.updateRememberedValue(formElementViewBuilder$toView$26$1$1$1);
                        rememberedValue4 = formElementViewBuilder$toView$26$1$1$1;
                    }
                    ArcadeFormTimelineCardListElementKt.ArcadeFormTimelineCardListElement(timelineCardListElement, (Function1) ((KFunction) rememberedValue4), formElementViewBuilder4.imageLoader, null, gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                FormBlocker.Element.UpsellElement upsellElement = (FormBlocker.Element.UpsellElement) obj4;
                FormElementViewBuilder formElementViewBuilder5 = (FormElementViewBuilder) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow3 = formElementViewBuilder5.viewEvents;
                    boolean changedInstance4 = gapComposer14.changedInstance(mutableSharedFlow3);
                    Object rememberedValue5 = gapComposer14.rememberedValue();
                    if (changedInstance4 || rememberedValue5 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$34$1$1$1 formElementViewBuilder$toView$34$1$1$1 = new FormElementViewBuilder$toView$34$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow3, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer14.updateRememberedValue(formElementViewBuilder$toView$34$1$1$1);
                        rememberedValue5 = formElementViewBuilder$toView$34$1$1$1;
                    }
                    ArcadeFormUpsellKt.ArcadeFormUpsell(upsellElement, (Function1) ((KFunction) rememberedValue5), formElementViewBuilder5.imageLoader, null, gapComposer14, 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                FormBlocker.Element.LegalTextElement legalTextElement = (FormBlocker.Element.LegalTextElement) obj4;
                FormElementViewBuilder formElementViewBuilder6 = (FormElementViewBuilder) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow4 = formElementViewBuilder6.viewEvents;
                    boolean changedInstance5 = gapComposer15.changedInstance(mutableSharedFlow4);
                    Object rememberedValue6 = gapComposer15.rememberedValue();
                    if (changedInstance5 || rememberedValue6 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$10$1$1$1 formElementViewBuilder$toView$10$1$1$1 = new FormElementViewBuilder$toView$10$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow4, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer15.updateRememberedValue(formElementViewBuilder$toView$10$1$1$1);
                        rememberedValue6 = formElementViewBuilder$toView$10$1$1$1;
                    }
                    ArcadeFormLegalTextKt.ArcadeFormLegalText(legalTextElement, (Function1) ((KFunction) rememberedValue6), null, gapComposer15, 0);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                FormElementViewBuilder formElementViewBuilder7 = (FormElementViewBuilder) obj4;
                FormBlocker.Element.MerchantTransactionElement merchantTransactionElement = (FormBlocker.Element.MerchantTransactionElement) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    LocalizedMoneyFormatter.Factory factory = formElementViewBuilder7.moneyFormatterFactory;
                    RealImageLoader realImageLoader = formElementViewBuilder7.imageLoader;
                    MutableSharedFlow mutableSharedFlow5 = formElementViewBuilder7.viewEvents;
                    boolean changedInstance6 = gapComposer16.changedInstance(mutableSharedFlow5);
                    Object rememberedValue7 = gapComposer16.rememberedValue();
                    if (changedInstance6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new FormElementViewBuilder$toView$37$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow5, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer16.updateRememberedValue(rememberedValue7);
                    }
                    ArcadeFormMerchantTransactionKt.ArcadeFormMerchantTransaction(factory, realImageLoader, merchantTransactionElement, null, false, (Function1) ((KFunction) rememberedValue7), gapComposer16, 27648, 0);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                FormBlocker.Element.InstructionCardElement instructionCardElement = (FormBlocker.Element.InstructionCardElement) obj4;
                FormElementViewBuilder formElementViewBuilder8 = (FormElementViewBuilder) obj3;
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow6 = formElementViewBuilder8.viewEvents;
                    boolean changedInstance7 = gapComposer17.changedInstance(mutableSharedFlow6);
                    Object rememberedValue8 = gapComposer17.rememberedValue();
                    if (changedInstance7 || rememberedValue8 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$45$1$1$1 formElementViewBuilder$toView$45$1$1$1 = new FormElementViewBuilder$toView$45$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow6, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer17.updateRememberedValue(formElementViewBuilder$toView$45$1$1$1);
                        rememberedValue8 = formElementViewBuilder$toView$45$1$1$1;
                    }
                    ArcadeFormInstructionCardKt.ArcadeFormInstructionCard(instructionCardElement, (Function1) ((KFunction) rememberedValue8), null, gapComposer17, 0);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                FormBlocker.Element.PaymentPlanScheduleElement paymentPlanScheduleElement = (FormBlocker.Element.PaymentPlanScheduleElement) obj4;
                FormElementViewBuilder formElementViewBuilder9 = (FormElementViewBuilder) obj3;
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow7 = formElementViewBuilder9.viewEvents;
                    boolean changedInstance8 = gapComposer18.changedInstance(mutableSharedFlow7);
                    Object rememberedValue9 = gapComposer18.rememberedValue();
                    if (changedInstance8 || rememberedValue9 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$38$1$1$1 formElementViewBuilder$toView$38$1$1$1 = new FormElementViewBuilder$toView$38$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow7, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer18.updateRememberedValue(formElementViewBuilder$toView$38$1$1$1);
                        rememberedValue9 = formElementViewBuilder$toView$38$1$1$1;
                    }
                    ArcadeFormPaymentPlanScheduleKt.ArcadeFormPaymentPlanSchedule(paymentPlanScheduleElement, (Function1) ((KFunction) rememberedValue9), null, gapComposer18, 0);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                FormBlocker.Element.ListOrderedElement listOrderedElement = (FormBlocker.Element.ListOrderedElement) obj4;
                FormElementViewBuilder formElementViewBuilder10 = (FormElementViewBuilder) obj3;
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow8 = formElementViewBuilder10.viewEvents;
                    boolean changedInstance9 = gapComposer19.changedInstance(mutableSharedFlow8);
                    Object rememberedValue10 = gapComposer19.rememberedValue();
                    if (changedInstance9 || rememberedValue10 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$44$1$1$1 formElementViewBuilder$toView$44$1$1$1 = new FormElementViewBuilder$toView$44$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow8, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer19.updateRememberedValue(formElementViewBuilder$toView$44$1$1$1);
                        rememberedValue10 = formElementViewBuilder$toView$44$1$1$1;
                    }
                    ArcadeFormListOrderedKt.ArcadeFormListOrdered(listOrderedElement, (Function1) ((KFunction) rememberedValue10), null, gapComposer19, 0);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                FormBlocker.Element.SectionHeaderElement sectionHeaderElement = (FormBlocker.Element.SectionHeaderElement) obj4;
                FormElementViewBuilder formElementViewBuilder11 = (FormElementViewBuilder) obj3;
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow9 = formElementViewBuilder11.viewEvents;
                    boolean changedInstance10 = gapComposer20.changedInstance(mutableSharedFlow9);
                    Object rememberedValue11 = gapComposer20.rememberedValue();
                    if (changedInstance10 || rememberedValue11 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$47$1$1$1 formElementViewBuilder$toView$47$1$1$1 = new FormElementViewBuilder$toView$47$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow9, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer20.updateRememberedValue(formElementViewBuilder$toView$47$1$1$1);
                        rememberedValue11 = formElementViewBuilder$toView$47$1$1$1;
                    }
                    ArcadeFormSectionHeaderElementKt.ArcadeFormSectionHeaderElement(sectionHeaderElement, (Function1) ((KFunction) rememberedValue11), gapComposer20, 0);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                FormBlocker.Element.PaymentPlanSummaryElement paymentPlanSummaryElement = (FormBlocker.Element.PaymentPlanSummaryElement) obj4;
                FormElementViewBuilder formElementViewBuilder12 = (FormElementViewBuilder) obj3;
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow10 = formElementViewBuilder12.viewEvents;
                    boolean changedInstance11 = gapComposer21.changedInstance(mutableSharedFlow10);
                    Object rememberedValue12 = gapComposer21.rememberedValue();
                    if (changedInstance11 || rememberedValue12 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$39$1$1$1 formElementViewBuilder$toView$39$1$1$1 = new FormElementViewBuilder$toView$39$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow10, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer21.updateRememberedValue(formElementViewBuilder$toView$39$1$1$1);
                        rememberedValue12 = formElementViewBuilder$toView$39$1$1$1;
                    }
                    ArcadeFormPaymentPlanSummaryKt.ArcadeFormPaymentPlanSummary(paymentPlanSummaryElement, (Function1) ((KFunction) rememberedValue12), null, gapComposer21, 0);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                FormBlocker.Element.ListUnorderedElement listUnorderedElement = (FormBlocker.Element.ListUnorderedElement) obj4;
                FormElementViewBuilder formElementViewBuilder13 = (FormElementViewBuilder) obj3;
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    MutableSharedFlow mutableSharedFlow11 = formElementViewBuilder13.viewEvents;
                    boolean changedInstance12 = gapComposer22.changedInstance(mutableSharedFlow11);
                    Object rememberedValue13 = gapComposer22.rememberedValue();
                    if (changedInstance12 || rememberedValue13 == neverEqualPolicy) {
                        FormElementViewBuilder$toView$43$1$1$1 formElementViewBuilder$toView$43$1$1$1 = new FormElementViewBuilder$toView$43$1$1$1(1, 1, StateFlowKt.class, mutableSharedFlow11, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
                        gapComposer22.updateRememberedValue(formElementViewBuilder$toView$43$1$1$1);
                        rememberedValue13 = formElementViewBuilder$toView$43$1$1$1;
                    }
                    ArcadeFormListUnorderedKt.ArcadeFormListUnordered(listUnorderedElement, (Function1) ((KFunction) rememberedValue13), null, gapComposer22, 0);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                FormBlocker.Element.CallToActionElement callToActionElement2 = (FormBlocker.Element.CallToActionElement) obj4;
                Function1 function17 = (Function1) obj3;
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m178borderxT4_qwU(companion, 1.0f, Strings.getColors(gapComposer23).semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer23, 0);
                    int hashCode3 = Long.hashCode(gapComposer23.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer23.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer23, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer23.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer23.startReusableNode();
                    if (gapComposer23.inserting) {
                        gapComposer23.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer23.useNode();
                    }
                    Updater.m576setimpl(gapComposer23, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer23, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer23, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer23, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer23, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    Image image = callToActionElement2.image;
                    String str3 = callToActionElement2.title;
                    if (str3 == null || StringsKt.isBlank(str3)) {
                        str3 = null;
                    }
                    String str4 = callToActionElement2.subtitle;
                    if (str4 != null && !StringsKt.isBlank(str4)) {
                        str2 = str4;
                    }
                    BlockerAction blockerAction = callToActionElement2.button_action;
                    if (image != null) {
                        gapComposer23.startReplaceGroup(-102780026);
                        ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer23, com.squareup.cash.arcade.util.ThemablesKt.urlForTheme(image, gapComposer23)), null, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 85.0f), Alignment.Companion.Center, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer23, 28080, 96);
                        re$$ExternalSyntheticOutline0.m(companion, 20.0f, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-102421573);
                        gapComposer23.end(false);
                    }
                    if (str3 != null) {
                        gapComposer23.startReplaceGroup(-102386853);
                        str = str3;
                        LazyDslKt.m304MarkdownTextpCuZGqc(str, null, null, Strings.getTypography(gapComposer23).sectionTitle, Strings.getColors(gapComposer23).semantic.text.standard, null, null, null, 0, 0, 0, gapComposer23, 48, 2020);
                        gapComposer23.end(false);
                    } else {
                        str = str3;
                        gapComposer23.startReplaceGroup(-102171589);
                        gapComposer23.end(false);
                    }
                    if (str2 != null) {
                        gapComposer23.startReplaceGroup(-102130359);
                        if (str != null) {
                            re$$ExternalSyntheticOutline0.m(gapComposer23, -102108349, companion, 12.0f, gapComposer23);
                            gapComposer23.end(false);
                        } else {
                            gapComposer23.startReplaceGroup(-102054533);
                            gapComposer23.end(false);
                        }
                        LazyDslKt.m304MarkdownTextpCuZGqc(str2, null, null, Strings.getTypography(gapComposer23).bodyMedium, Strings.getColors(gapComposer23).semantic.text.standard, null, null, null, 0, 10, 0, gapComposer23, 805306416, 1508);
                        gapComposer23.end(false);
                    } else {
                        gapComposer23.startReplaceGroup(-101805541);
                        gapComposer23.end(false);
                    }
                    if (blockerAction != null) {
                        re$$ExternalSyntheticOutline0.m(gapComposer23, -101762730, companion, 20.0f, gapComposer23);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed2 = gapComposer23.changed(function17) | gapComposer23.changedInstance(callToActionElement2);
                        Object rememberedValue14 = gapComposer23.rememberedValue();
                        if (changed2 || rememberedValue14 == neverEqualPolicy) {
                            rememberedValue14 = new GLSceneScope$$ExternalSyntheticLambda4(i2, function17, callToActionElement2);
                            gapComposer23.updateRememberedValue(rememberedValue14);
                        }
                        coil3.size.SizeKt.Button((Function0) rememberedValue14, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1100888856, new ArcadeFormUpsellKt$$ExternalSyntheticLambda7(i3, blockerAction), gapComposer23), gapComposer23, 1572912, 60);
                        gapComposer23.end(false);
                    } else {
                        gapComposer23.startReplaceGroup(-101511909);
                        gapComposer23.end(false);
                    }
                    gapComposer23.end(true);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FormCashtag$8$$ExternalSyntheticLambda0(FavoriteAvatar favoriteAvatar, Function0 function0) {
        this.$r8$classId = 11;
        this.f$0 = favoriteAvatar;
        this.f$1 = function0;
    }

    public /* synthetic */ FormCashtag$8$$ExternalSyntheticLambda0(FormBlocker.Element.CallToActionElement callToActionElement, Function1 function1) {
        this.$r8$classId = 29;
        this.f$0 = callToActionElement;
        this.f$1 = function1;
    }

    public /* synthetic */ FormCashtag$8$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ FormCashtag$8$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
