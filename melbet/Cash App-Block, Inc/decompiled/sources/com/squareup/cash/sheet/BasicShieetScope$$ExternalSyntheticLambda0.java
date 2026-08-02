package com.squareup.cash.sheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.ScaleToBoundsImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.FilterChain;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.MaxLengthFilter;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.brand.checkout.CheckoutCouponSectionKt$$ExternalSyntheticLambda6;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.common.zzai;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.google.mlkit.common.internal.zzc;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.input.SelectionCardStyle;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.card.onboarding.CardPillTheme;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.genie.DatePickerViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewModel;
import com.squareup.cash.moneybot.views.card.CardUiKt;
import com.squareup.cash.moneybot.views.plugins.ActionCardKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.moneybot.views.textinput.MoneybotTextInputViewKt$MoneybotTextInputView$4$1$3;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.MultipleAllocationViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.paychecks.views.PaycheckDistributionWheel$PlacementConfig;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda8;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.tabs.views.MoneybotToolbarSharedElementConfig;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.views.CardAppletTileKt;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda5;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.ButtonKt$$ExternalSyntheticLambda1;
import com.stripe.android.uicore.elements.OTPElement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.MdocHelperKt;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda9;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import dev.chrisbanes.haze.HazeState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda6;
import xyz.block.genie.state.GenieStateBinding;

/* loaded from: classes6.dex */
public final /* synthetic */ class BasicShieetScope$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda0(ComposableLambdaImpl composableLambdaImpl, RealSheetState realSheetState, Function0 function0, Function0 function02) {
        this.$r8$classId = 10;
        this.f$3 = composableLambdaImpl;
        this.f$0 = realSheetState;
        this.f$1 = function0;
        this.f$2 = function02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object invoke$com$squareup$cash$paychecks$views$MultipleAllocationViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        Function2 function2;
        int i;
        boolean z;
        MultipleAllocationViewModel.Active active = (MultipleAllocationViewModel.Active) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Function1 function12 = (Function1) this.f$2;
        EducationalSheetKt$$ExternalSyntheticLambda8 educationalSheetKt$$ExternalSyntheticLambda8 = (EducationalSheetKt$$ExternalSyntheticLambda8) this.f$3;
        ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        scrollingScaffoldContentScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(scrollingScaffoldContentScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(active.title, SizeKt.fillMaxWidth(ScreenScaffoldKt.markAsScaffoldTitle(companion, scrollingScaffoldContentScope, gapComposer, ((intValue << 3) & 112) | 6), 1.0f), (Function2) null, (String) null, gapComposer, 0, 12);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            DistributionWheelViewModel distributionWheelViewModel = active.wheel;
            PaycheckDistributionWheel$PlacementConfig paycheckDistributionWheel$PlacementConfig = PaycheckDistributionWheel$PlacementConfig.ARCADE_DISTRIBUTION_FLOW;
            Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, SizeKt.m291widthInVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 24.0f, 8.0f, 2), 200.0f, 300.0f), false);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new UtilKt$$ExternalSyntheticLambda0(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function13 = (Function1) rememberedValue;
            boolean changed2 = gapComposer.changed(function12) | gapComposer.changed(educationalSheetKt$$ExternalSyntheticLambda8) | gapComposer.changedInstance(active);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new HelpSheetView$$ExternalSyntheticLambda0(function12, educationalSheetKt$$ExternalSyntheticLambda8, active);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function2 function22 = (Function2) rememberedValue2;
            boolean changed3 = gapComposer.changed(function1);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                function2 = function22;
                i = 0;
                rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, (boolean) (0 == true ? 1 : 0), 2);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                function2 = function22;
                i = 0;
            }
            HelpSheetViewKt.PaycheckDistributionWheel(distributionWheelViewModel, paycheckDistributionWheel$PlacementConfig, aspectRatio, function13, null, function2, (Function2) rememberedValue3, gapComposer, 0, 16);
            GapComposer gapComposer2 = gapComposer;
            DBUtil.SpacerBetweenSectionLarge(i, 1, gapComposer2, null);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer2, i);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
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
            gapComposer2.startReplaceGroup(1332029862);
            for (final MultipleAllocationViewModel.Active.AllocationRow allocationRow : active.rows) {
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                long j = colors.component.cell.body.f172default;
                boolean changedInstance = gapComposer2.changedInstance(allocationRow) | gapComposer2.changed(function1);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                    z = true;
                    rememberedValue4 = new OpenSourceKt$$ExternalSyntheticLambda11(1 == true ? 1 : 0, allocationRow, function1);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                } else {
                    z = true;
                }
                Modifier semantics = SemanticsModifierKt.semantics(companion, z, (Function1) rememberedValue4);
                Badge.Small small = allocationRow.badged ? Badge.Small.INSTANCE : null;
                CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(224095149, new PoolListSectionKt$$ExternalSyntheticLambda8(allocationRow, j, 7), gapComposer2), 2);
                final int i2 = 0;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1854548139, new Function2() { // from class: com.squareup.cash.paychecks.views.MultipleAllocationViewKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int i3 = i2;
                        MultipleAllocationViewModel.Active.AllocationRow allocationRow2 = allocationRow;
                        switch (i3) {
                            case 0:
                                Composer composer2 = (Composer) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 12.0f), RoundedCornerShapeKt.CircleShape);
                                    Color forTheme = ThemablesKt.forTheme(allocationRow2.color, gapComposer3);
                                    forTheme.getClass();
                                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, forTheme.value, ColorKt.RectangleShape), gapComposer3, 0);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj4;
                                int intValue3 = ((Integer) obj5).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allocationRow2.name, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2);
                final int i3 = 1;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-791359530, new Function2() { // from class: com.squareup.cash.paychecks.views.MultipleAllocationViewKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int i32 = i3;
                        MultipleAllocationViewModel.Active.AllocationRow allocationRow2 = allocationRow;
                        switch (i32) {
                            case 0:
                                Composer composer2 = (Composer) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 12.0f), RoundedCornerShapeKt.CircleShape);
                                    Color forTheme = ThemablesKt.forTheme(allocationRow2.color, gapComposer3);
                                    forTheme.getClass();
                                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, forTheme.value, ColorKt.RectangleShape), gapComposer3, 0);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj4;
                                int intValue3 = ((Integer) obj5).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allocationRow2.name, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2);
                boolean changed4 = gapComposer2.changed(function1) | gapComposer2.changedInstance(allocationRow);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (changed4 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new MultipleAllocationViewKt$$ExternalSyntheticLambda15(function1, allocationRow, 0);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                GapComposer gapComposer3 = gapComposer2;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, semantics, (Function0) rememberedValue5, false, false, null, small, label, 0L, gapComposer3, 54, 3312);
                gapComposer2 = gapComposer3;
            }
            gapComposer2.end(false);
            gapComposer2.end(true);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            gapComposer2.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$work$views$clockin$DeclareCashTipContentKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        TextFieldState textFieldState = (TextFieldState) this.f$0;
        String str = (String) this.f$1;
        InputTransformation inputTransformation = (InputTransformation) this.f$2;
        OutputTransformation outputTransformation = (OutputTransformation) this.f$3;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ScrollingScaffoldContentScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ComposableLambdaImpl composableLambdaImpl = null;
            String str2 = textFieldState.getValue$foundation().text.length() == 0 ? str : null;
            if (textFieldState.getValue$foundation().text.length() > 0) {
                gapComposer.startReplaceGroup(656696383);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1890930635, new PastPaySectionKt$$ExternalSyntheticLambda1(str, 10), gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(656750508);
                gapComposer.end(false);
            }
            InputFieldKt.InputField(textFieldState, m300paddingVpY3zN4$default, false, false, false, null, composableLambdaImpl, null, null, str2, new KeyboardOptions(0, (Boolean) null, 9, 0, (Boolean) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), null, inputTransformation, outputTransformation, null, null, gapComposer, 0, 6, 51644);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$stripe$android$financialconnections$features$networkinglinkverification$NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3) {
        FocusRequester focusRequester = (FocusRequester) this.f$0;
        NetworkingLinkVerificationState.Payload payload = (NetworkingLinkVerificationState.Payload) this.f$1;
        Async async = (Async) this.f$2;
        MutableState mutableState = (MutableState) this.f$3;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            OTPElement oTPElement = payload.otpElement;
            boolean z = !(async instanceof Async.Loading);
            Throwable error = zzai.getError(async);
            boolean changed = gapComposer.changed(mutableState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HeroTagViewKt$$ExternalSyntheticLambda7(17, mutableState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ListItemKt.VerificationSection(focusRequester, oTPElement, z, error, ValueInsets.onGloballyPositioned(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), gapComposer, 70);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$stripe$android$financialconnections$features$networkingsavetolinkverification$NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda11(Object obj, Object obj2, Object obj3) {
        FocusRequester focusRequester = (FocusRequester) this.f$0;
        NetworkingSaveToLinkVerificationState.Payload payload = (NetworkingSaveToLinkVerificationState.Payload) this.f$1;
        Async async = (Async) this.f$2;
        MutableState mutableState = (MutableState) this.f$3;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            OTPElement oTPElement = payload.otpElement;
            boolean z = !(async instanceof Async.Loading);
            Throwable error = zzai.getError(async);
            boolean changed = gapComposer.changed(mutableState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HeroTagViewKt$$ExternalSyntheticLambda7(18, mutableState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ListItemKt.VerificationSection(focusRequester, oTPElement, z, error, ValueInsets.onGloballyPositioned(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), gapComposer, 70);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$stripe$android$financialconnections$features$success$SuccessContentKt$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3) {
        Async async = (Async) this.f$0;
        Function0 function0 = (Function0) this.f$1;
        MutableState mutableState = (MutableState) this.f$2;
        MutableState mutableState2 = (MutableState) this.f$3;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        ((AnimatedVisibilityScope) obj).getClass();
        SuccessState.Payload payload = (SuccessState.Payload) mutableState.getValue();
        SuccessContentKt.SuccessFooter(null, async instanceof Async.Loading, !((Boolean) mutableState2.getValue()).booleanValue(), payload != null ? payload.businessName : null, function0, composer, 0);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$stripe$android$financialconnections$features$success$SuccessContentKt$$ExternalSyntheticLambda17(Object obj, Object obj2, Object obj3) {
        TextResource textResource = (TextResource) this.f$0;
        TextResource textResource2 = (TextResource) this.f$1;
        Density density = (Density) this.f$2;
        MutableState mutableState = (MutableState) this.f$3;
        ((Integer) obj3).getClass();
        ((AnimatedVisibilityScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) ((Composer) obj2);
        boolean changed = gapComposer.changed(density);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new ButtonKt$$ExternalSyntheticLambda1(density, mutableState, 5);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        SuccessContentKt.SuccessBody(textResource, textResource2, ValueInsets.onGloballyPositioned(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), gapComposer, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Modifier wrapContentHeight;
        GapComposer gapComposer;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Function0 function0;
        boolean z2;
        Icons icons;
        boolean z3;
        ?? r0;
        GapComposer gapComposer2;
        CellActionCardViewModel.ButtonGroup buttonGroup;
        int i = this.$r8$classId;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        Object obj4 = Composer.Companion.Empty;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj8;
                AnimatedCornerShape animatedCornerShape = (AnimatedCornerShape) obj7;
                BasicShieetScope basicShieetScope = (BasicShieetScope) obj6;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    AddedPaddingValues addedPaddingValues = new AddedPaddingValues(insetsPaddingValues, paddingValues);
                    Modifier clip = ClipKt.clip(modifier, animatedCornerShape);
                    boolean changed = gapComposer3.changed(basicShieetScope);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new BasicShieetScope$$ExternalSyntheticLambda3(basicShieetScope, 1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    Modifier graphicsLayer = ColorKt.graphicsLayer(clip, (Function1) rememberedValue);
                    if (basicShieetScope.state.getSettledPosition() == SheetPosition.Collapsed) {
                        gapComposer3.startReplaceGroup(-1969503952);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (rememberedValue2 == obj4) {
                            rememberedValue2 = new RealSheetState$$ExternalSyntheticLambda0(4);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        modifier = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue2);
                        z = false;
                        gapComposer3.end(false);
                    } else {
                        z = false;
                        gapComposer3.startReplaceGroup(-1969433272);
                        gapComposer3.end(false);
                    }
                    Modifier then = graphicsLayer.then(modifier);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, then);
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
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke((Object) addedPaddingValues, (Object) gapComposer3, (Object) 0);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ArrayList arrayList = (ArrayList) obj8;
                Function0 function02 = (Function0) obj7;
                Function1 function1 = (Function1) obj6;
                Function0 function03 = (Function0) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer2;
                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion3, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(wrapContentHeight, 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m298padding3ABfNKs);
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
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    if (arrayList.isEmpty()) {
                        gapComposer4.startReplaceGroup(-429778063);
                        AddFavoritesViewKt.EmptyFavoritesBody(6, gapComposer4, companion3, function02);
                        gapComposer4.end(false);
                        gapComposer = gapComposer4;
                    } else {
                        gapComposer4.startReplaceGroup(-429679421);
                        gapComposer = gapComposer4;
                        AddFavoritesViewKt.FavoritesBody(companion3, function1, function03, arrayList, gapComposer, 6);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                List<String> list = (List) obj8;
                GenieStateBinding genieStateBinding = (GenieStateBinding) obj7;
                TextStyle textStyle = (TextStyle) obj6;
                MutableState mutableState = (MutableState) obj5;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                ?? r1 = (GapComposer) composer3;
                if (r1.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    for (String str : list) {
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-902916496, new DatePickerViewKt$$ExternalSyntheticLambda4(str, textStyle, 1), r1);
                        boolean changedInstance = r1.changedInstance(genieStateBinding) | r1.changed(str);
                        Object rememberedValue3 = r1.rememberedValue();
                        if (changedInstance || rememberedValue3 == obj4) {
                            rememberedValue3 = new GLSceneScope$$ExternalSyntheticLambda2(28, genieStateBinding, str, mutableState);
                            r1.updateRememberedValue(rememberedValue3);
                        }
                        AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) rememberedValue3, null, null, null, false, null, null, r1, 6, 508);
                    }
                } else {
                    r1.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                MoneybotChatViewModel moneybotChatViewModel = (MoneybotChatViewModel) obj8;
                MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig = (MoneybotToolbarSharedElementConfig) obj7;
                Function1 function12 = (Function1) obj6;
                Function1 function13 = (Function1) obj5;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (!gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    gapComposer5.skipToGroupEnd();
                } else if ((moneybotChatViewModel instanceof MoneybotChatViewModel.Content) || (moneybotChatViewModel instanceof MoneybotChatViewModel.Error)) {
                    gapComposer5.startReplaceGroup(70841603);
                    Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                    if (moneybotToolbarSharedElementConfig == null) {
                        gapComposer5.startReplaceGroup(70875392);
                        gapComposer5.end(false);
                        companion = null;
                    } else {
                        gapComposer5.startReplaceGroup(70875393);
                        gapComposer5.startReplaceGroup(-2075922763);
                        SharedTransitionScope sharedTransitionScope = moneybotToolbarSharedElementConfig.sharedTransitionScope;
                        SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope.rememberSharedContentState(moneybotToolbarSharedElementConfig.trailingButtonKey, gapComposer5, 0);
                        AnimatedVisibilityScope animatedVisibilityScope = moneybotToolbarSharedElementConfig.animatedVisibilityScope;
                        ScaleToBoundsImpl scaleToBounds$default = RemeasureImpl.scaleToBounds$default(SharedTransitionScope.ResizeMode.Companion, ContentScale.Companion.None);
                        SharedTransitionScope.PlaceholderSize.Companion.getClass();
                        ?? sharedBounds$default = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, companion4, rememberSharedContentState, animatedVisibilityScope, EnterTransitionImpl.None, EnterExitTransitionKt.fadeOut$default(null, 3).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, Alignment.Companion.Start, 13)), null, scaleToBounds$default, null, 912);
                        gapComposer5.end(false);
                        gapComposer5.end(false);
                        companion = sharedBounds$default;
                    }
                    if (companion != null) {
                        companion4 = companion;
                    }
                    TransactorKt.CustomAction(titleBarActionScope, companion4, null, Expect_jvmKt.rememberComposableLambda(1961997717, new PoolToastKt$$ExternalSyntheticLambda0(13, moneybotChatViewModel, function12, function13), gapComposer5), gapComposer5, (intValue4 & 14) | 3072, 2);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(72765525);
                    gapComposer5.end(false);
                }
                return Unit.INSTANCE;
            case 4:
                ActionCardViewModel actionCardViewModel = (ActionCardViewModel) obj8;
                RealHapticVibrator realHapticVibrator = (RealHapticVibrator) obj7;
                Haptics haptics = (Haptics) obj6;
                Function1 function14 = (Function1) obj5;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                ?? r12 = (GapComposer) composer5;
                if (r12.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ActionCardViewModel.Icon icon = actionCardViewModel.icon;
                    ActionCardViewModel.ButtonGroup buttonGroup2 = actionCardViewModel.buttonGroup;
                    ActionCardViewEvent actionCardViewEvent = actionCardViewModel.action;
                    Modifier.Companion companion5 = Modifier.Companion.$$INSTANCE;
                    if (icon == null) {
                        r12.startReplaceGroup(2125153224);
                        r12.end(false);
                        companion2 = companion5;
                    } else {
                        r12.startReplaceGroup(2125153225);
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion5, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                        companion2 = companion5;
                        ActionCardViewEvent actionCardViewEvent2 = actionCardViewModel.iconTapAction;
                        if (actionCardViewEvent2 == null) {
                            r12.startReplaceGroup(-1065232670);
                            z2 = false;
                            r12.end(false);
                            function0 = null;
                        } else {
                            r12.startReplaceGroup(-1065232669);
                            boolean changedInstance2 = r12.changedInstance(realHapticVibrator) | r12.changed(haptics) | r12.changed(function14) | r12.changedInstance(actionCardViewEvent2);
                            Object rememberedValue4 = r12.rememberedValue();
                            if (changedInstance2 || rememberedValue4 == obj4) {
                                rememberedValue4 = new UiWorkflow$$ExternalSyntheticLambda25(realHapticVibrator, haptics, function14, actionCardViewEvent2, 1);
                                r12.updateRememberedValue(rememberedValue4);
                            }
                            function0 = (Function0) rememberedValue4;
                            z2 = false;
                            r12.end(false);
                        }
                        ActionCardKt.ActionCardIcon(icon, m302paddingqDBjuR0$default, function0, r12, 48);
                        re$$ExternalSyntheticOutline0.m(companion2, 40.0f, (GapComposer) r12, z2);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(r12).semantic.text.standard, (Composer) r12, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(r12).sectionTitle, (TextLineBalancing) null, actionCardViewModel.title, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, r12, null);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    float f = RecyclerView.DECELERATION_RATE;
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, r12, 48);
                    int hashCode3 = Long.hashCode(r12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r12.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(r12, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (r12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    r12.startReusableNode();
                    if (r12.inserting) {
                        r12.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        r12.useNode();
                    }
                    Updater.m576setimpl(r12, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(r12, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(r12, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(r12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(r12, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    ActionCardViewModel.Accessory accessory = actionCardViewModel.accessory;
                    if (accessory == null) {
                        r12.startReplaceGroup(620912817);
                        z3 = false;
                        r12.end(false);
                    } else {
                        r12.startReplaceGroup(620912818);
                        String str2 = accessory.icon.arcade_id;
                        if (str2 != null) {
                            Icons.Companion.getClass();
                            icons = zzd.get(str2);
                        } else {
                            icons = null;
                        }
                        if (icons == null) {
                            r12.startReplaceGroup(1707551420);
                            z3 = false;
                            r12.end(false);
                        } else {
                            r12.startReplaceGroup(1707551421);
                            Trace.m1191Iconww6aTOc(icons, accessory.accessibilityText, (Modifier) null, 0L, (Composer) r12, 0, 12);
                            Strings.getSizes(r12).getClass();
                            DefaultSizes.spacing.getClass();
                            SpacerKt.Spacer(r12, SizeKt.m290width3ABfNKs(companion2, 4.0f));
                            z3 = false;
                            r12.end(false);
                        }
                        r12.end(z3);
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z3);
                    if (actionCardViewEvent != null) {
                        f = 2.0f;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(r12).semantic.text.standard, (Composer) r12, SpacerKt.m302paddingqDBjuR0$default(layoutWeightElement, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, 7), Strings.getTypography(r12).bodySmall, (TextLineBalancing) null, actionCardViewModel.description, (Map) null, (Function1) null, false);
                    if (buttonGroup2 != null || actionCardViewEvent == null) {
                        r0 = 0;
                        r12.startReplaceGroup(621905779);
                        r12.end(false);
                    } else {
                        r12.startReplaceGroup(621673217);
                        Strings.getSizes(r12).getClass();
                        Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion2, 4.0f, r12);
                        Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, (Modifier) null, Strings.getColors(r12).semantic.icon.subtle, (Composer) r12, 54, 4);
                        r0 = 0;
                        r12.end(false);
                    }
                    r12.end(true);
                    if (buttonGroup2 == null) {
                        r12.startReplaceGroup(2126997166);
                        r12.end(r0);
                    } else {
                        r12.startReplaceGroup(2126997167);
                        DBUtil.SpacerWithinSectionMedium(r0, 1, r12, null);
                        zzabx.ButtonDefaultGroupHorizontal(SizeKt.fillMaxWidth(companion2, 1.0f), Expect_jvmKt.rememberComposableLambda(-1414543524, new BasicShieetScope$$ExternalSyntheticLambda0(buttonGroup2, realHapticVibrator, haptics, function14, 5), r12), r12, 54, r0);
                        r12.end(r0);
                    }
                } else {
                    r12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ActionCardViewModel.ButtonGroup buttonGroup3 = (ActionCardViewModel.ButtonGroup) obj8;
                RealHapticVibrator realHapticVibrator2 = (RealHapticVibrator) obj7;
                Haptics haptics2 = (Haptics) obj6;
                Function1 function15 = (Function1) obj5;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 19) != 18)) {
                    ActionCardViewModel.ButtonGroup.Button button = buttonGroup3.secondaryButton;
                    if (button != null) {
                        gapComposer6.startReplaceGroup(1553091665);
                        ButtonProminence buttonProminence = CardUiKt.toButtonProminence(button.prominence);
                        Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(modifier, 1.0f);
                        boolean changedInstance3 = gapComposer6.changedInstance(realHapticVibrator2) | gapComposer6.changed(haptics2) | gapComposer6.changedInstance(button) | gapComposer6.changed(function15);
                        Object rememberedValue5 = gapComposer6.rememberedValue();
                        if (changedInstance3 || rememberedValue5 == obj4) {
                            rememberedValue5 = new UiWorkflow$$ExternalSyntheticLambda25(realHapticVibrator2, haptics2, button, function15, 2);
                            gapComposer6.updateRememberedValue(rememberedValue5);
                        }
                        coil3.size.SizeKt.Button((Function0) rememberedValue5, horizontalWeight, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(2032679828, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(button, 28), gapComposer6), gapComposer6, 1572864, 56);
                        gapComposer2 = gapComposer6;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2 = gapComposer6;
                        gapComposer2.startReplaceGroup(1553429286);
                        gapComposer2.end(false);
                    }
                    ButtonProminence buttonProminence2 = CardUiKt.toButtonProminence(buttonGroup3.primaryButton.prominence);
                    Modifier horizontalWeight2 = button != null ? adaptiveStackScope.horizontalWeight(modifier, 1.0f) : SizeKt.fillMaxWidth(modifier, 1.0f);
                    boolean changedInstance4 = gapComposer2.changedInstance(realHapticVibrator2) | gapComposer2.changed(haptics2) | gapComposer2.changedInstance(buttonGroup3) | gapComposer2.changed(function15);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changedInstance4 || rememberedValue6 == obj4) {
                        rememberedValue6 = new UiWorkflow$$ExternalSyntheticLambda25(realHapticVibrator2, haptics2, buttonGroup3, function15, 3);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue6, horizontalWeight2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-768418865, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(buttonGroup3, 27), gapComposer2), gapComposer2, 1572864, 56);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                CellActionCardViewModel.ButtonGroup buttonGroup4 = (CellActionCardViewModel.ButtonGroup) obj8;
                RealHapticVibrator realHapticVibrator3 = (RealHapticVibrator) obj7;
                Haptics haptics3 = (Haptics) obj6;
                Function1 function16 = (Function1) obj5;
                AdaptiveStackScope adaptiveStackScope2 = (AdaptiveStackScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                adaptiveStackScope2.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(adaptiveStackScope2) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    CellActionCardViewModel.ButtonGroup.Button button2 = buttonGroup4.secondaryButton;
                    if (button2 == null) {
                        gapComposer7.startReplaceGroup(-1379499661);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-1379499660);
                        ButtonProminence buttonProminence3 = CardUiKt.toButtonProminence(button2.prominence);
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(adaptiveStackScope2.horizontalWeight(modifier, 1.0f), 1.0f);
                        boolean changedInstance5 = gapComposer7.changedInstance(realHapticVibrator3) | gapComposer7.changed(haptics3) | gapComposer7.changedInstance(button2) | gapComposer7.changed(function16);
                        Object rememberedValue7 = gapComposer7.rememberedValue();
                        if (changedInstance5 || rememberedValue7 == obj4) {
                            rememberedValue7 = new UiWorkflow$$ExternalSyntheticLambda25(realHapticVibrator3, haptics3, button2, function16, 4);
                            gapComposer7.updateRememberedValue(rememberedValue7);
                        }
                        coil3.size.SizeKt.Button((Function0) rememberedValue7, fillMaxWidth2, buttonProminence3, false, false, null, Expect_jvmKt.rememberComposableLambda(937837517, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(button2, 29), gapComposer7), gapComposer7, 1572864, 56);
                        gapComposer7.end(false);
                    }
                    ButtonProminence buttonProminence4 = CardUiKt.toButtonProminence(buttonGroup4.primaryButton.prominence);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(adaptiveStackScope2.horizontalWeight(modifier, 1.0f), 1.0f);
                    boolean changedInstance6 = gapComposer7.changedInstance(realHapticVibrator3) | gapComposer7.changed(haptics3) | gapComposer7.changedInstance(buttonGroup4) | gapComposer7.changed(function16);
                    Object rememberedValue8 = gapComposer7.rememberedValue();
                    if (changedInstance6 || rememberedValue8 == obj4) {
                        buttonGroup = buttonGroup4;
                        UiWorkflow$$ExternalSyntheticLambda25 uiWorkflow$$ExternalSyntheticLambda25 = new UiWorkflow$$ExternalSyntheticLambda25(realHapticVibrator3, haptics3, buttonGroup, function16, 5);
                        gapComposer7.updateRememberedValue(uiWorkflow$$ExternalSyntheticLambda25);
                        rememberedValue8 = uiWorkflow$$ExternalSyntheticLambda25;
                    } else {
                        buttonGroup = buttonGroup4;
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue8, fillMaxWidth3, buttonProminence4, false, false, null, Expect_jvmKt.rememberComposableLambda(-2106720426, new P2PListViewKt$$ExternalSyntheticLambda12(buttonGroup, i3), gapComposer7), gapComposer7, 1572864, 56);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                TemplateCardViewModel.TapBehavior.ButtonGroup buttonGroup5 = (TemplateCardViewModel.TapBehavior.ButtonGroup) obj8;
                RealHapticVibrator realHapticVibrator4 = (RealHapticVibrator) obj7;
                Haptics haptics4 = (Haptics) obj6;
                Function1 function17 = (Function1) obj5;
                AdaptiveStackScope adaptiveStackScope3 = (AdaptiveStackScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                adaptiveStackScope3.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(adaptiveStackScope3) ? 4 : 2;
                }
                boolean z4 = (intValue8 & 19) != 18;
                int i4 = 1 & intValue8;
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(i4, z4)) {
                    TemplateCardViewModel.TapBehavior.ButtonGroup.Button button3 = buttonGroup5.secondaryButton;
                    if (button3 != null) {
                        gapComposer8.startReplaceGroup(-828301546);
                        Modifier horizontalWeight3 = adaptiveStackScope3.horizontalWeight(modifier, 1.0f);
                        boolean changedInstance7 = gapComposer8.changedInstance(realHapticVibrator4) | gapComposer8.changed(haptics4) | gapComposer8.changedInstance(button3) | gapComposer8.changed(function17);
                        Object rememberedValue9 = gapComposer8.rememberedValue();
                        if (changedInstance7 || rememberedValue9 == obj4) {
                            rememberedValue9 = new UiWorkflow$$ExternalSyntheticLambda25(realHapticVibrator4, haptics4, button3, function17, 7);
                            gapComposer8.updateRememberedValue(rememberedValue9);
                        }
                        TextCardKt.TemplateCardButton(button3, horizontalWeight3, (Function0) rememberedValue9, gapComposer8, 0);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(-828068984);
                        gapComposer8.end(false);
                    }
                    TemplateCardViewModel.TapBehavior.ButtonGroup.Button button4 = buttonGroup5.primaryButton;
                    Modifier horizontalWeight4 = button3 != null ? adaptiveStackScope3.horizontalWeight(modifier, 1.0f) : SizeKt.fillMaxWidth(modifier, 1.0f);
                    boolean changedInstance8 = gapComposer8.changedInstance(realHapticVibrator4) | gapComposer8.changed(haptics4) | gapComposer8.changedInstance(buttonGroup5) | gapComposer8.changed(function17);
                    Object rememberedValue10 = gapComposer8.rememberedValue();
                    if (changedInstance8 || rememberedValue10 == obj4) {
                        UiWorkflow$$ExternalSyntheticLambda25 uiWorkflow$$ExternalSyntheticLambda252 = new UiWorkflow$$ExternalSyntheticLambda25(realHapticVibrator4, haptics4, buttonGroup5, function17, 8);
                        gapComposer8.updateRememberedValue(uiWorkflow$$ExternalSyntheticLambda252);
                        rememberedValue10 = uiWorkflow$$ExternalSyntheticLambda252;
                    }
                    TextCardKt.TemplateCardButton(button4, horizontalWeight4, (Function0) rememberedValue10, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                FocusRequester focusRequester = (FocusRequester) obj8;
                TextFieldState textFieldState = (TextFieldState) obj7;
                Function1 function18 = (Function1) obj6;
                MoneybotTextInputViewModel moneybotTextInputViewModel = (MoneybotTextInputViewModel) obj5;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    Modifier padding = SpacerKt.padding(modifier, paddingValues2);
                    Strings.getSizes(gapComposer9).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(padding, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7), 1.0f);
                    Strings.getSizes(gapComposer9).getClass();
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer9, 48);
                    int hashCode4 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer9, fillMaxWidth4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Modifier focusRequester2 = FocusTraversalKt.focusRequester(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer9, materializeModifier4, ComposeUiNode.Companion.SetModifier, 1.0f, true), focusRequester);
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer9).bodyMedium, Strings.getColors(gapComposer9).component.input.text.f195default, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                    SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer9).component.input.cursor);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 7, (Boolean) null, 119);
                    boolean changed2 = gapComposer9.changed(textFieldState) | gapComposer9.changed(function18);
                    Object rememberedValue11 = gapComposer9.rememberedValue();
                    if (changed2 || rememberedValue11 == obj4) {
                        rememberedValue11 = new CheckoutCouponSectionKt$$ExternalSyntheticLambda6(i3, textFieldState, function18);
                        gapComposer9.updateRememberedValue(rememberedValue11);
                    }
                    KeyboardActionHandler keyboardActionHandler = (KeyboardActionHandler) rememberedValue11;
                    Integer num = moneybotTextInputViewModel.maxLength;
                    BasicTextFieldKt.BasicTextField(textFieldState, focusRequester2, false, false, num != null ? new FilterChain(InputTransformation.Companion.$$INSTANCE, new MaxLengthFilter(num.intValue())) : null, m994copyp1EtxEg$default, keyboardOptions, keyboardActionHandler, TextFieldLineLimits.SingleLine.INSTANCE, null, solidColor, null, new MoneybotTextInputViewKt$MoneybotTextInputView$4$1$3(textFieldState, moneybotTextInputViewModel), null, gapComposer9, 102236160, 0, 22028);
                    ButtonProminence buttonProminence5 = ButtonProminence.PROMINENT;
                    boolean z5 = textFieldState.getValue$foundation().text.length() > 0;
                    boolean changed3 = gapComposer9.changed(function18) | gapComposer9.changed(textFieldState);
                    Object rememberedValue12 = gapComposer9.rememberedValue();
                    if (changed3 || rememberedValue12 == obj4) {
                        rememberedValue12 = new CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7(2, textFieldState, function18);
                        gapComposer9.updateRememberedValue(rememberedValue12);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue12, null, buttonProminence5, false, z5, null, Expect_jvmKt.rememberComposableLambda(-1689527675, new P2PListViewKt$$ExternalSyntheticLambda12(moneybotTextInputViewModel, 9), gapComposer9), gapComposer9, 1573248, 42);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                return invoke$com$squareup$cash$paychecks$views$MultipleAllocationViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 10:
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj5;
                RealSheetState realSheetState = (RealSheetState) obj8;
                Function0 function04 = (Function0) obj7;
                Function0 function05 = (Function0) obj6;
                PaddingValues paddingValues3 = (PaddingValues) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                paddingValues3.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(paddingValues3) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    composableLambdaImpl2.invoke(Float.valueOf(realSheetState.getExpandProgress()), paddingValues3, function04, function05, gapComposer10, Integer.valueOf((intValue10 << 3) & 112));
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                State state = (State) obj8;
                State state2 = (State) obj7;
                State state3 = (State) obj6;
                HazeState hazeState = (HazeState) obj5;
                Pair pair = (Pair) obj;
                Composer composer11 = (Composer) obj2;
                ((Integer) obj3).getClass();
                pair.getClass();
                CardAppletTileViewModel.CardPillViewModel cardPillViewModel = (CardAppletTileViewModel.CardPillViewModel) pair.first;
                CardPillTheme cardPillTheme = (CardPillTheme) pair.second;
                Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                GapComposer gapComposer11 = (GapComposer) composer11;
                int hashCode5 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer11.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(composer11, fillMaxSize);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer12.startReusableNode();
                if (gapComposer12.inserting) {
                    gapComposer12.createNode(layoutNode$Companion$Constructor$15);
                } else {
                    gapComposer12.useNode();
                }
                Updater.m576setimpl(composer11, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer11, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer11, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer11, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(modifier, 0.90670556f), 0.8657408f), Alignment.Companion.TopStart, 2);
                boolean changed4 = gapComposer12.changed(state) | gapComposer12.changed(state2) | gapComposer12.changed(state3);
                Object rememberedValue13 = gapComposer12.rememberedValue();
                if (changed4 || rememberedValue13 == obj4) {
                    rememberedValue13 = new CardAppletTileKt$$ExternalSyntheticLambda5(state, state2, state3, 2);
                    gapComposer12.updateRememberedValue(rememberedValue13);
                }
                CardAppletTileKt.PillUi(ColorKt.graphicsLayer(wrapContentSize$default, (Function1) rememberedValue13), hazeState, cardPillTheme, cardPillViewModel, composer11, 0);
                gapComposer12.end(true);
                return Unit.INSTANCE;
            case 12:
                List<ClockInOverlayViewModel.PickerItem> list2 = (List) obj8;
                Function1 function19 = (Function1) obj7;
                String str3 = (String) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((ScrollingScaffoldContentScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    ((DefaultSizes) gapComposer13.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    zzc zzcVar = DefaultSizes.spacing;
                    for (final ClockInOverlayViewModel.PickerItem pickerItem : list2) {
                        zzcVar.getClass();
                        Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(modifier, 16.0f, 8.0f);
                        SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
                        boolean z6 = pickerItem.isEnabled;
                        boolean areEqual = Intrinsics.areEqual(function19.invoke(pickerItem.identifier), str3);
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1347209005, new Function2() { // from class: com.squareup.cash.work.views.clockin.ClockedOutOverlayContentKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj9, Object obj10) {
                                int i5 = i2;
                                ClockInOverlayViewModel.PickerItem pickerItem2 = pickerItem;
                                switch (i5) {
                                    case 0:
                                        Composer composer13 = (Composer) obj9;
                                        int intValue12 = ((Integer) obj10).intValue();
                                        GapComposer gapComposer14 = (GapComposer) composer13;
                                        if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pickerItem2.name, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer14.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer14 = (Composer) obj9;
                                        int intValue13 = ((Integer) obj10).intValue();
                                        GapComposer gapComposer15 = (GapComposer) composer14;
                                        if (gapComposer15.shouldExecute(1 & intValue13, (intValue13 & 3) != 2)) {
                                            String str4 = pickerItem2.body;
                                            if (str4 == null) {
                                                gapComposer15.startReplaceGroup(647746045);
                                            } else {
                                                gapComposer15.startReplaceGroup(647746046);
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                            }
                                            gapComposer15.end(false);
                                        } else {
                                            gapComposer15.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer13);
                        ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1432018476, new Function2() { // from class: com.squareup.cash.work.views.clockin.ClockedOutOverlayContentKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj9, Object obj10) {
                                int i5 = i3;
                                ClockInOverlayViewModel.PickerItem pickerItem2 = pickerItem;
                                switch (i5) {
                                    case 0:
                                        Composer composer13 = (Composer) obj9;
                                        int intValue12 = ((Integer) obj10).intValue();
                                        GapComposer gapComposer14 = (GapComposer) composer13;
                                        if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pickerItem2.name, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer14.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer14 = (Composer) obj9;
                                        int intValue13 = ((Integer) obj10).intValue();
                                        GapComposer gapComposer15 = (GapComposer) composer14;
                                        if (gapComposer15.shouldExecute(1 & intValue13, (intValue13 & 3) != 2)) {
                                            String str4 = pickerItem2.body;
                                            if (str4 == null) {
                                                gapComposer15.startReplaceGroup(647746045);
                                            } else {
                                                gapComposer15.startReplaceGroup(647746046);
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                            }
                                            gapComposer15.end(false);
                                        } else {
                                            gapComposer15.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer13);
                        boolean changed5 = gapComposer13.changed(mutableState2) | gapComposer13.changedInstance(pickerItem);
                        Object rememberedValue14 = gapComposer13.rememberedValue();
                        if (changed5 || rememberedValue14 == obj4) {
                            rememberedValue14 = new HeroCardViewKt$$ExternalSyntheticLambda0(10, pickerItem, mutableState2);
                            gapComposer13.updateRememberedValue(rememberedValue14);
                        }
                        InputChipKt.SelectionCard(rememberComposableLambda2, rememberComposableLambda3, areEqual, m299paddingVpY3zN4, z6, (Function1) rememberedValue14, gapComposer13, 3126, 0);
                    }
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                return invoke$com$squareup$cash$work$views$clockin$DeclareCashTipContentKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 14:
                return invoke$com$stripe$android$financialconnections$features$networkinglinkverification$NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda10(obj, obj2, obj3);
            case 15:
                return invoke$com$stripe$android$financialconnections$features$networkingsavetolinkverification$NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda11(obj, obj2, obj3);
            case 16:
                return invoke$com$stripe$android$financialconnections$features$success$SuccessContentKt$$ExternalSyntheticLambda10(obj, obj2, obj3);
            case 17:
                return invoke$com$stripe$android$financialconnections$features$success$SuccessContentKt$$ExternalSyntheticLambda17(obj, obj2, obj3);
            default:
                UiWorkflow uiWorkflow = (UiWorkflow) obj8;
                UiState uiState = (UiState) obj7;
                UiWorkflow.Input input = (UiWorkflow.Input) obj6;
                BaseRenderContext baseRenderContext = ((StatefulWorkflow.RenderContext) obj5).$$delegate_0;
                UiComponent uiComponent = (UiComponent) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Map map = (Map) obj3;
                uiComponent.getClass();
                map.getClass();
                UiStepButtonType buttonType = MdocHelperKt.toButtonType(uiComponent);
                if (buttonType != null) {
                    TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, buttonType, uiComponent.getName(), ((UiState.Displaying) uiState).stepName, false, 8, null);
                }
                UiState.Displaying displaying = (UiState.Displaying) uiState;
                UiWorkflow.recurse(displaying.components, new UiWorkflow$$ExternalSyntheticLambda9(booleanValue, uiComponent, 0));
                if (input.inquirySessionConfig.gpsCollectionRequirement == GpsCollectionRequirement.NONE || displaying.hasRequestedGpsPermissions) {
                    baseRenderContext.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(map, uiComponent, uiWorkflow)));
                } else {
                    baseRenderContext.getActionSink().send(Workflows.action$default(uiWorkflow, new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(15, uiState, map, uiComponent)));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }
}
