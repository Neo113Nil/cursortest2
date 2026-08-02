package com.squareup.cash.sharesheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.InlineMessageButtonScope;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.applets.common.views.InstalledBalanceAppletTileLayoutConfig;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.ChannelListViewModel;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.profile.views.personal.PersonalInfoView$$ExternalSyntheticLambda0;
import com.squareup.cash.qrcodes.viewmodels.CashQrShortcutsOnboardingViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.qrcodes.views.CashQrShortcutsOnboardingView;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.savings.viewmodels.HeroNumericsBodyTextViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.views.SavingsUpsellCardKt$$ExternalSyntheticLambda6;
import com.squareup.cash.savings.views.SavingsUpsellCardKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.CalloutKt;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSectionUiModel;
import com.squareup.cash.securityhub.viewmodels.SecurityHubUiModel;
import com.squareup.cash.securityhub.views.ProtectionsSectionKt;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewModel;
import com.squareup.cash.shopping.autofill.views.content.ErrorContentKt;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCancelPlanDialogViewModel;
import com.squareup.cash.shopping.viewmodels.PillStage;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShareSheetViewKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ShareSheetViewKt$$ExternalSyntheticLambda1(Function1 function1, LazyListState lazyListState) {
        this.$r8$classId = 2;
        this.f$1 = function1;
        this.f$0 = lazyListState;
    }

    private final Object invoke$com$squareup$cash$score$views$CollapsingItemKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        CashCreditScoreHomeData.InfoSection.CollapsingItem collapsingItem = (CashCreditScoreHomeData.InfoSection.CollapsingItem) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        ((AnimatedVisibilityScope) obj).getClass();
        boolean z = false;
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, companion);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
        } else {
            gapComposer2.useNode();
        }
        Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        DBUtil.SpacerWithinSectionSmall(0, 1, composer, null);
        LocalizedString localizedString = collapsingItem.body;
        localizedString.getClass();
        String str = localizedString.translated_value;
        str.getClass();
        TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
        } else {
            gapComposer2.startReplaceGroup(-1762997739);
            gapComposer2.end(false);
        }
        long j = colors.semantic.text.subtle;
        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 11);
        boolean changed = gapComposer2.changed(function1);
        Object rememberedValue = gapComposer2.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, z, 17);
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m302paddingqDBjuR0$default, textStyle, j, null, null, null, 0, 0, 0, composer, MLKEMEngine.KyberPolyBytes, 2016);
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$score$views$ScoreSummarySheetKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData = (CashCreditScoreHomeData.ScoreSummaryOverlayData) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        int i = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda5(i, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CalloutKt.ScoreSummarySheetContent(scoreSummaryOverlayData, (Function1) rememberedValue, SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValues), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$score$views$ScoreVisualizationKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        MutableState mutableState = (MutableState) this.f$0;
        MutableState mutableState2 = (MutableState) this.f$1;
        ((Integer) obj3).getClass();
        ((AnimatedVisibilityScope) obj).getClass();
        CalloutKt.ScoreLockLabeledLine(MLKEMEngine.KyberPolyBytes, (Composer) obj2, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 80.0f), (String) mutableState.getValue(), ((Boolean) mutableState2.getValue()).booleanValue());
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$securityhub$views$SecurityHubViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        SecurityHubUiModel securityHubUiModel = (SecurityHubUiModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ProtectionsSectionUiModel protectionsSectionUiModel = securityHubUiModel.protections;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda5(9, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ProtectionsSectionKt.ProtectionsSection((Function1) rememberedValue, null, protectionsSectionUiModel, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$autofill$views$EditAutofillViewKt$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3) {
        EditAutofillViewModel.Content content = (EditAutofillViewModel.Content) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = content.buttonEnabled;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(-1214362773, new ButtonGroupKt$$ExternalSyntheticLambda11(content, 25), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$autofill$views$EditAutofillViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        EditAutofillViewModel editAutofillViewModel = (EditAutofillViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue, fillMaxWidth, null, false, true, null, Expect_jvmKt.rememberComposableLambda(-864109201, new ButtonGroupKt$$ExternalSyntheticLambda11(editAutofillViewModel, 24), gapComposer), gapComposer, 1597488, 44);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$autofill$views$content$LoadedContentKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        AutofillViewModel.Loaded loaded = (AutofillViewModel.Loaded) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean z = loaded.editable;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(1624968664);
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(18, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, ErrorContentKt.f659lambda$631491338, gapComposer, 1572912, 60);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1625141644);
                gapComposer.end(false);
            }
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda0(19, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(724771867, new ButtonGroupKt$$ExternalSyntheticLambda11(loaded, 26), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$sup$views$SingleUsePaymentCancelPlanDialogKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        SingleUsePaymentCancelPlanDialogViewModel singleUsePaymentCancelPlanDialogViewModel = (SingleUsePaymentCancelPlanDialogViewModel) this.f$0;
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButtonDestructive(((intValue << 12) & 57344) | 3072, 6, gapComposer, Expect_jvmKt.rememberComposableLambda(1359957214, new ButtonGroupKt$$ExternalSyntheticLambda11(singleUsePaymentCancelPlanDialogViewModel, 27), gapComposer), null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v53, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Color m;
        long j;
        Unit unit;
        int i = this.$r8$classId;
        int i2 = 10;
        int i3 = 12;
        Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ShareSheetViewModel shareSheetViewModel = (ShareSheetViewModel) obj5;
                Function1 function1 = (Function1) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    ShareSheetViewKt.ShareSheet(shareSheetViewModel, function1, SpacerKt.padding(companion3, paddingValues), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Function1 function12 = (Function1) obj4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj5;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion3, 1.0f);
                    boolean changed = gapComposer2.changed(function12);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LocalShortlinkSheetKt$$ExternalSyntheticLambda1(function12, parcelableSnapshotMutableIntState, 2);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, buttonProminence, false, false, null, ChannelListViewKt.f608lambda$366887297, gapComposer2, 1573248, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Function1 function13 = (Function1) obj4;
                LazyListState lazyListState = (LazyListState) obj5;
                ChannelListViewModel channelListViewModel = (ChannelListViewModel) obj;
                Composer composer3 = (Composer) obj2;
                ((Integer) obj3).getClass();
                channelListViewModel.getClass();
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion3, 1.0f);
                GapComposer gapComposer3 = (GapComposer) composer3;
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer3, 0);
                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer3, m177backgroundbw27NRU);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer4 = (GapComposer) composer3;
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer3, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                if (channelListViewModel instanceof ChannelListViewModel.Loading) {
                    gapComposer4.startReplaceGroup(206635495);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion3, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(composer3, fillMaxSize2);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(composer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(composer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Request$Priority$EnumUnboxingLocalUtility.m(hashCode2, composer3, composeUiNode$Companion$SetModifier$13, composer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(composer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    ProgressCircularKt.ProgressCircular(6, 0, composer3, SpacerKt.m298padding3ABfNKs(companion3, 24.0f));
                    gapComposer4.end(true);
                    gapComposer4.end(false);
                } else {
                    if (!(channelListViewModel instanceof ChannelListViewModel.Loaded)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 2084876988, false);
                    }
                    gapComposer4.startReplaceGroup(206914247);
                    Category.CategoryType categoryType = ((ChannelListViewModel.Loaded) channelListViewModel).category.categoryType;
                    if (!(categoryType instanceof Category.CategoryType.ChannelList)) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    }
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed2 = gapComposer4.changed(function13);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new PersonalInfoView$$ExternalSyntheticLambda0(5, function13);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, composer3, 54, 108);
                    Category.CategoryType.ChannelList channelList = (Category.CategoryType.ChannelList) categoryType;
                    boolean changedInstance = gapComposer4.changedInstance(channelListViewModel) | gapComposer4.changedInstance(channelList) | gapComposer4.changed(function13);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CardTransitionKt$$ExternalSyntheticLambda4(3, channelList, channelListViewModel, function13);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    LazyDslKt.LazyColumn(null, lazyListState, null, null, null, null, false, null, (Function1) rememberedValue3, composer3, 0, 509);
                    gapComposer4.end(false);
                }
                gapComposer4.end(true);
                return Unit.INSTANCE;
            case 3:
                Function1 function14 = (Function1) obj4;
                Category.CategoryType.ChannelList channelList2 = (Category.CategoryType.ChannelList) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Category.AdjustableThreshold adjustableThreshold = channelList2.adjustableThreshold;
                    adjustableThreshold.getClass();
                    ChannelListViewKt.AdjustableThresholdCellItem(function14, adjustableThreshold, channelList2.notificationCategory, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ChannelListViewModel channelListViewModel2 = (ChannelListViewModel) obj5;
                Category.CategoryType.ChannelList channelList3 = (Category.CategoryType.ChannelList) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer6, null);
                    ViewfinderDefaults.SectionHeader(((ChannelListViewModel.Loaded) channelListViewModel2).category.title, (Modifier) null, (String) null, (Function0) null, channelList3.detailedDescription, gapComposer6, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer6, null);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ProfileNotificationsViewModel.Loaded.NotificationMessage notificationMessage = (ProfileNotificationsViewModel.Loaded.NotificationMessage) obj5;
                Function1 function15 = (Function1) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    boolean changed3 = gapComposer7.changed(function15);
                    Object rememberedValue4 = gapComposer7.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new PersonalInfoView$$ExternalSyntheticLambda0(10, function15);
                        gapComposer7.updateRememberedValue(rememberedValue4);
                    }
                    ChannelListViewKt.NotificationMessageSection(notificationMessage, (Function0) rememberedValue4, gapComposer7, 0);
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer7, null);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ArcadeAutofillSettingsDetailViewModel.Content content = (ArcadeAutofillSettingsDetailViewModel.Content) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
                    boolean z = content.buttonEnabled;
                    boolean changed4 = gapComposer8.changed(function16);
                    Object rememberedValue5 = gapComposer8.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new PersonalInfoView$$ExternalSyntheticLambda0(13, function16);
                        gapComposer8.updateRememberedValue(rememberedValue5);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue5, fillMaxWidth, buttonProminence2, false, z, null, Expect_jvmKt.rememberComposableLambda(-816826954, new ButtonGroupKt$$ExternalSyntheticLambda11(content, 4), gapComposer8), gapComposer8, 1573296, 40);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function17 = (Function1) obj4;
                ArcadeAutofillSettingsDetailViewModel arcadeAutofillSettingsDetailViewModel = (ArcadeAutofillSettingsDetailViewModel) obj5;
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion3, 1.0f);
                    boolean changed5 = gapComposer9.changed(function17);
                    Object rememberedValue6 = gapComposer9.rememberedValue();
                    if (changed5 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new PersonalInfoView$$ExternalSyntheticLambda0(11, function17);
                        gapComposer9.updateRememberedValue(rememberedValue6);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue6, fillMaxWidth2, null, false, true, null, Expect_jvmKt.rememberComposableLambda(372908482, new ButtonGroupKt$$ExternalSyntheticLambda11(arcadeAutofillSettingsDetailViewModel, 3), gapComposer9), gapComposer9, 1597488, 44);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                CashQrShortcutsOnboardingViewModel cashQrShortcutsOnboardingViewModel = (CashQrShortcutsOnboardingViewModel) obj5;
                Function1 function18 = (Function1) obj4;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                int i4 = CashQrShortcutsOnboardingView.$r8$clinit;
                paddingValues2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer9).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    CameraXPreviewKt.CashQrShortcutsOnboardingContent(paddingValues2, cashQrShortcutsOnboardingViewModel.widgetSupported, cashQrShortcutsOnboardingViewModel.tileSupported, function18, null, gapComposer10, intValue8 & 14, 16);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Shape shape = (Shape) obj4;
                Modifier modifier = (Modifier) obj;
                ((Integer) obj3).getClass();
                modifier.getClass();
                GapComposer gapComposer11 = (GapComposer) ((Composer) obj2);
                gapComposer11.startReplaceGroup(1110023907);
                float floatValue = ((Number) AnimateAsStateKt.animateFloatAsState(((ScrollState) obj5).value$delegate.getIntValue() > 0 ? 1.0f : 0.0f, null, "elevationLevel", null, gapComposer11, 3072, 22).getValue()).floatValue();
                Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                if (floatValue > RecyclerView.DECELERATION_RATE) {
                    float f = 2.0f * floatValue;
                    modifier2 = KeypadKt.m3658mooncakeShadowWMci_g0$default(modifier2, f, f, 0.2f, shape, 16);
                }
                Modifier then = modifier.then(modifier2);
                gapComposer11.end(false);
                return then;
            case 10:
                PaymentPlanSummaryViewModel.BottomSheetData bottomSheetData = (PaymentPlanSummaryViewModel.BottomSheetData) obj5;
                Function1 function19 = (Function1) obj4;
                PaddingValues paddingValues3 = (PaddingValues) obj;
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                paddingValues3.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer10).changed(paddingValues3) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer10;
                if (gapComposer12.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1704787178, new RetroUiFactory$$ExternalSyntheticLambda3(bottomSheetData, function19, paddingValues3), gapComposer12), gapComposer12, 6);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Function1 function110 = (Function1) obj4;
                SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet = (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet) obj5;
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion3, 1.0f);
                    boolean changed6 = gapComposer13.changed(function110);
                    Object rememberedValue7 = gapComposer13.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(15, function110);
                        gapComposer13.updateRememberedValue(rememberedValue7);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue7, fillMaxWidth3, buttonProminence3, false, false, null, Expect_jvmKt.rememberComposableLambda(1531954637, new ButtonGroupKt$$ExternalSyntheticLambda11(infoHalfSheet, 14), gapComposer13), gapComposer13, 1573296, 56);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet optionsConfigSheet = (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet) obj5;
                Function1 function111 = (Function1) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (gapComposer14.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion3, 1.0f);
                    String str = optionsConfigSheet.updateButtonTitle;
                    SelectPaymentPlanViewModel.ButtonState buttonState = optionsConfigSheet.updateButtonState;
                    boolean changed7 = gapComposer14.changed(function111);
                    Object rememberedValue8 = gapComposer14.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(16, function111);
                        gapComposer14.updateRememberedValue(rememberedValue8);
                    }
                    SelectPaymentPlanViewKt.SubmitButton((Function0) rememberedValue8, str, buttonState, fillMaxWidth4, gapComposer14, 3072);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                SelectPaymentPlanViewModel.ButtonState buttonState2 = (SelectPaymentPlanViewModel.ButtonState) obj5;
                String str2 = (String) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer13;
                if (!gapComposer15.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    gapComposer15.skipToGroupEnd();
                } else if (buttonState2 instanceof SelectPaymentPlanViewModel.ButtonState.Loaded) {
                    gapComposer15.startReplaceGroup(1377880364);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer15.end(false);
                } else {
                    if (!(buttonState2 instanceof SelectPaymentPlanViewModel.ButtonState.Loading)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer15, 1377879219, false);
                    }
                    gapComposer15.startReplaceGroup(1377881879);
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer15, VisibleKt.scaleHeightToTextLineHeight(companion3, gapComposer15, 6));
                    gapComposer15.end(false);
                }
                return Unit.INSTANCE;
            case 14:
                SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet selectPaymentPlanHalfSheet = (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet) obj5;
                Function1 function112 = (Function1) obj4;
                PaddingValues paddingValues4 = (PaddingValues) obj;
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                paddingValues4.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer14).changed(paddingValues4) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer14;
                if (gapComposer16.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    boolean z2 = selectPaymentPlanHalfSheet instanceof SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet;
                    Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                    if (z2) {
                        gapComposer16.startReplaceGroup(1547636933);
                        SelectPaymentPlanViewKt.SelectPaymentPlanInfoSheet(SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, paddingValues4.mo267calculateTopPaddingD9Ej5fM(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet) selectPaymentPlanHalfSheet, function112, gapComposer16, 0);
                        gapComposer16.end(false);
                    } else {
                        if (!(selectPaymentPlanHalfSheet instanceof SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer16, 1547635384, false);
                        }
                        gapComposer16.startReplaceGroup(1547644366);
                        SelectPaymentPlanViewKt.SelectPaymentPlanOptionsConfigSheet(SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, paddingValues4.mo267calculateTopPaddingD9Ej5fM(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet) selectPaymentPlanHalfSheet, function112, gapComposer16, 0);
                        gapComposer16.end(false);
                    }
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                SavingsAppletTileViewModel.Installed installed = (SavingsAppletTileViewModel.Installed) obj5;
                InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig = (InstalledBalanceAppletTileLayoutConfig) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer15;
                if (gapComposer17.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    TypedValueCompat.m1100SavingsVisualziNgDLE(installed, installedBalanceAppletTileLayoutConfig.iconSize, gapComposer17, 0);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj5;
                Function1 function113 = (Function1) obj4;
                PaddingValues paddingValues5 = (PaddingValues) obj;
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                paddingValues5.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer16).changed(paddingValues5) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer16;
                if (!gapComposer18.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    gapComposer18.skipToGroupEnd();
                } else if ((amountPickerViewModel instanceof AmountPickerViewModel.InitialLoading) || (amountPickerViewModel instanceof AmountPickerViewModel.Loading)) {
                    gapComposer18.startReplaceGroup(-2055596562);
                    Modifier padding = SpacerKt.padding(SizeKt.fillMaxWidth(companion3, 1.0f), paddingValues5);
                    ((DefaultSizes) gapComposer18.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(padding, 16.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode3 = Long.hashCode(gapComposer18.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer18.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer18, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer18.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer18.startReusableNode();
                    if (gapComposer18.inserting) {
                        gapComposer18.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer18.useNode();
                    }
                    Updater.m576setimpl(gapComposer18, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer18, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer18, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer18, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer18, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer18, null);
                    gapComposer18.end(true);
                    gapComposer18.end(false);
                } else {
                    if (!(amountPickerViewModel instanceof AmountPickerViewModel.Ready)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer18, -1590333408, false);
                    }
                    gapComposer18.startReplaceGroup(-2055267993);
                    ButtonGroupKt.TransferInPicker((AmountPickerViewModel.Ready) amountPickerViewModel, SpacerKt.padding(companion3, paddingValues5), function113, gapComposer18, 0);
                    gapComposer18.end(false);
                }
                return Unit.INSTANCE;
            case 17:
                SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance) obj5;
                Function1 function114 = (Function1) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer17;
                if (gapComposer19.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    HeroNumericsBodyTextViewModel heroNumericsBodyTextViewModel = savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.body;
                    if (heroNumericsBodyTextViewModel == null) {
                        gapComposer19.startReplaceGroup(456429652);
                        gapComposer19.end(false);
                    } else {
                        gapComposer19.startReplaceGroup(456429653);
                        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                        ViewGroupKt viewGroupKt = savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.action;
                        Modifier.Companion companion5 = Modifier.Companion.$$INSTANCE;
                        if (viewGroupKt == null) {
                            gapComposer19.startReplaceGroup(-1837578068);
                            gapComposer19.end(false);
                            companion = companion5;
                            companion2 = null;
                        } else {
                            gapComposer19.startReplaceGroup(-1837578067);
                            Role role = new Role(0);
                            boolean changed8 = gapComposer19.changed(function114) | gapComposer19.changedInstance(viewGroupKt);
                            Object rememberedValue9 = gapComposer19.rememberedValue();
                            Object obj6 = rememberedValue9;
                            if (changed8 || rememberedValue9 == neverEqualPolicy) {
                                ShareSheetViewKt$$ExternalSyntheticLambda5 shareSheetViewKt$$ExternalSyntheticLambda5 = new ShareSheetViewKt$$ExternalSyntheticLambda5(i3, function114, viewGroupKt);
                                gapComposer19.updateRememberedValue(shareSheetViewKt$$ExternalSyntheticLambda5);
                                obj6 = shareSheetViewKt$$ExternalSyntheticLambda5;
                            }
                            ?? m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion5, false, null, role, (Function0) obj6, 11);
                            companion = companion5;
                            gapComposer19.end(false);
                            companion2 = m183clickableoSLSa3U$default;
                        }
                        Modifier.Companion companion6 = companion2 == null ? companion : companion2;
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer19, 48);
                        int hashCode4 = Long.hashCode(gapComposer19.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer19.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer19, companion6);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer19.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer19.startReusableNode();
                        if (gapComposer19.inserting) {
                            gapComposer19.createNode(layoutNode$Companion$Constructor$13);
                        } else {
                            gapComposer19.useNode();
                        }
                        Updater.m576setimpl(gapComposer19, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer19, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer19, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer19, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer19, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                        ColorModel colorModel = heroNumericsBodyTextViewModel.tint;
                        if (colorModel == null) {
                            gapComposer19.startReplaceGroup(-1243689556);
                            gapComposer19.end(false);
                            m = null;
                        } else {
                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer19, -1148497675, colorModel, gapComposer19, false);
                        }
                        long j2 = m != null ? m.value : Color.Unspecified;
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
                        boolean changedInstance2 = gapComposer19.changedInstance(heroNumericsBodyTextViewModel);
                        Object rememberedValue10 = gapComposer19.rememberedValue();
                        Object obj7 = rememberedValue10;
                        if (changedInstance2 || rememberedValue10 == neverEqualPolicy) {
                            RealSandboxer$$ExternalSyntheticLambda0 realSandboxer$$ExternalSyntheticLambda0 = new RealSandboxer$$ExternalSyntheticLambda0(heroNumericsBodyTextViewModel, i2);
                            gapComposer19.updateRememberedValue(realSandboxer$$ExternalSyntheticLambda0);
                            obj7 = realSandboxer$$ExternalSyntheticLambda0;
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(layoutWeightElement, false, (Function1) obj7);
                        String str3 = heroNumericsBodyTextViewModel.markdownText;
                        if (str3 == null) {
                            gapComposer19.startReplaceGroup(-1243453987);
                            gapComposer19.end(false);
                            unit = null;
                            j = j2;
                        } else {
                            gapComposer19.startReplaceGroup(-1243453986);
                            j = j2;
                            LazyDslKt.m304MarkdownTextpCuZGqc(str3, null, semantics, null, j, null, null, null, 0, 0, 0, gapComposer19, 48, 2024);
                            gapComposer19.end(false);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            gapComposer19.startReplaceGroup(-1243331846);
                            long j3 = j;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4084, j3, (Composer) gapComposer19, semantics, (TextStyle) null, (TextLineBalancing) null, heroNumericsBodyTextViewModel.text, (Map) null, (Function1) null, false);
                            j = j3;
                        } else {
                            gapComposer19.startReplaceGroup(-1148490600);
                        }
                        gapComposer19.end(false);
                        Icon icon = heroNumericsBodyTextViewModel.icon;
                        String str4 = icon != null ? icon.arcade_id : null;
                        if (str4 == null) {
                            gapComposer19.startReplaceGroup(-1243232058);
                            gapComposer19.end(false);
                        } else {
                            gapComposer19.startReplaceGroup(-1243232057);
                            Icons.Companion.getClass();
                            Icons icons = zzd.get(str4);
                            if (icons == null) {
                                gapComposer19.startReplaceGroup(628093224);
                                gapComposer19.end(false);
                            } else {
                                gapComposer19.startReplaceGroup(628093225);
                                ((DefaultSizes) gapComposer19.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 8.0f, gapComposer19);
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j, gapComposer19, 48, 4);
                                gapComposer19.end(false);
                            }
                            gapComposer19.end(false);
                        }
                        gapComposer19.end(true);
                        gapComposer19.end(false);
                    }
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement = (SavingsScreenViewModel.Content.SavingsScreenElement) obj5;
                Function1 function115 = (Function1) obj4;
                EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
                Composer composer18 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                embeddedHeaderScope.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer18).changed(embeddedHeaderScope) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer18;
                if (gapComposer20.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    String str5 = ((SavingsScreenViewModel.Content.SavingsScreenElement.ActivitySection) savingsScreenElement).title;
                    boolean changed9 = gapComposer20.changed(function115);
                    Object rememberedValue11 = gapComposer20.rememberedValue();
                    if (changed9 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(28, function115);
                        gapComposer20.updateRememberedValue(rememberedValue11);
                    }
                    embeddedHeaderScope.DefaultHeader((intValue17 << 9) & 7168, 2, gapComposer20, str5, null, (Function0) rememberedValue11);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                SavingsScreenViewModel.Content content2 = (SavingsScreenViewModel.Content) obj5;
                Function1 function116 = (Function1) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer19;
                if (gapComposer21.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    String str6 = content2.title;
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed10 = gapComposer21.changed(function116);
                    Object rememberedValue12 = gapComposer21.rememberedValue();
                    if (changed10 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(27, function116);
                        gapComposer21.updateRememberedValue(rememberedValue12);
                    }
                    DBUtil.TitleBarSub(str6, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue12, (Modifier) null, (Function3) null, gapComposer21, 48, 108);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                UpsellCardModel$Loaded.Button button = (UpsellCardModel$Loaded.Button) obj5;
                Function1 function117 = (Function1) obj4;
                InlineMessageButtonScope inlineMessageButtonScope = (InlineMessageButtonScope) obj;
                Composer composer20 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                inlineMessageButtonScope.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((GapComposer) composer20).changed(inlineMessageButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer20;
                if (gapComposer22.shouldExecute(intValue19 & 1, (intValue19 & 19) != 18)) {
                    boolean changedInstance3 = gapComposer22.changedInstance(button) | gapComposer22.changed(function117);
                    Object rememberedValue13 = gapComposer22.rememberedValue();
                    if (changedInstance3 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new SavingsUpsellCardKt$$ExternalSyntheticLambda6(button, function117, 0);
                        gapComposer22.updateRememberedValue(rememberedValue13);
                    }
                    inlineMessageButtonScope.SecondaryButton((57344 & (intValue19 << 12)) | 3072, gapComposer22, Expect_jvmKt.rememberComposableLambda(413272873, new SavingsUpsellCardKt$$ExternalSyntheticLambda7(button, r14 ? 1 : 0), gapComposer22), null, (Function0) rememberedValue13, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                return invoke$com$squareup$cash$score$views$CollapsingItemKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$score$views$ScoreSummarySheetKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$score$views$ScoreVisualizationKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$securityhub$views$SecurityHubViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$shopping$autofill$views$EditAutofillViewKt$$ExternalSyntheticLambda15(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$shopping$autofill$views$EditAutofillViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$shopping$autofill$views$content$LoadedContentKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$shopping$sup$views$SingleUsePaymentCancelPlanDialogKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            default:
                String str7 = (String) obj5;
                PillStage pillStage = (PillStage) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer21;
                if (gapComposer23.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                    boolean areEqual = Intrinsics.areEqual(pillStage, PillStage.Confirmed.INSTANCE);
                    Modifier.Companion companion7 = Modifier.Companion.$$INSTANCE;
                    if (areEqual) {
                        gapComposer23.startReplaceGroup(-1556704539);
                        Icons icons2 = Icons.CheckFill16;
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion7, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                        Colors colors2 = (Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                        } else {
                            gapComposer23.startReplaceGroup(-1762997739);
                            gapComposer23.end(false);
                        }
                        Trace.m1191Iconww6aTOc(icons2, (String) null, m302paddingqDBjuR0$default, colors2.semantic.icon.standard, gapComposer23, 438, 0);
                        gapComposer23.end(false);
                    } else {
                        gapComposer23.startReplaceGroup(-1556419928);
                        Trace.m1191Iconww6aTOc(Icons.InformationFill16, (String) null, SpacerKt.m302paddingqDBjuR0$default(companion7, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 0L, gapComposer23, 438, 8);
                        gapComposer23.end(false);
                    }
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ShareSheetViewKt$$ExternalSyntheticLambda1(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = obj;
    }

    public /* synthetic */ ShareSheetViewKt$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
