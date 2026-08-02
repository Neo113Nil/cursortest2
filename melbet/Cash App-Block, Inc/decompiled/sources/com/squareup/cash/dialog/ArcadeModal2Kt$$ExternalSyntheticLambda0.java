package com.squareup.cash.dialog;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListOrderedColors$Subtle;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.viewmodels.map.LimitReachedDialogViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositEditPaycheckAmountViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormDetailsViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSetupViewModel;
import com.squareup.cash.directdeposit.viewmodels.PaycheckDepositAllocationType;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import com.squareup.cash.earnings.views.home.EarningsToolsSectionKt;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewModel;
import com.squareup.cash.earningstracker.views.NetEarningsInfoSheetViewKt;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.elementboundsregistry.core.BoundsRegistry$Bounds;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.family.familyhub.viewmodels.DependentActivityEmbeddedSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListSection;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMemberRowViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMemberSection;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsSection;
import com.squareup.cash.family.familyhub.viewmodels.U13CelebrationViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.DependentDetailToolbarModel;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorErrorViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewModel;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyEducationPageViewModel;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.favorites.components.FavoriteAddedViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.favorites.viewmodels.FavoriteAddedViewModel;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.formview.components.ArcadeFormViewTitleBar;
import com.squareup.cash.formview.components.ArcadeFormViewTitleBar$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormViewCtaButtons;
import com.squareup.cash.formview.components.FormViewCtaButtons$$ExternalSyntheticLambda1;
import com.squareup.cash.genericelements.viewmodels.IconViewModel;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda4;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeModal2Kt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ArcadeModal2Kt$$ExternalSyntheticLambda0(FormBlocker.Element.TimelineCardListElement.Item item, Function0 function0) {
        this.$r8$classId = 28;
        this.f$1 = item;
        this.f$0 = function0;
    }

    private final Object invoke$com$squareup$cash$fidesmo$views$FidesmoProvisioningViewKt$$ExternalSyntheticLambda61(Object obj, Object obj2, Object obj3) {
        float f;
        FidesmoProvisioningViewModel.Success.Provisioned.Card card = (FidesmoProvisioningViewModel.Success.Provisioned.Card) this.f$0;
        String str = (String) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            if (card.imageUrl != null) {
                gapComposer.startReplaceGroup(1237076792);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                gapComposer.end(false);
                f = 144.0f;
            } else {
                gapComposer.startReplaceGroup(1237174256);
                gapComposer.end(false);
                f = RecyclerView.DECELERATION_RATE;
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).headlineSmall, (TextLineBalancing) null, card.header, (Map) null, (Function1) null, false);
            if (str != null) {
                gapComposer.startReplaceGroup(-2083545111);
                String str2 = card.buttonText;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(-165389000);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-165388999);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, str2.concat(" →"), (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-165178292);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$formview$components$ArcadeFormViewTitleBar$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f$0;
        ArcadeFormViewTitleBar arcadeFormViewTitleBar = (ArcadeFormViewTitleBar) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean changedInstance = gapComposer.changedInstance(arcadeFormViewTitleBar);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeFormViewTitleBar$$ExternalSyntheticLambda0(arcadeFormViewTitleBar, i);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, 0L, null, null, null, 0, 1, 0, gapComposer, 805306368, 1524);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$formview$components$FormViewCtaButtons$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f$0;
        FormViewCtaButtons formViewCtaButtons = (FormViewCtaButtons) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = FormViewCtaButtons.$r8$clinit;
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean changedInstance = gapComposer.changedInstance(formViewCtaButtons);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new FormViewCtaButtons$$ExternalSyntheticLambda1(formViewCtaButtons);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, null, null, 0L, null, null, null, 0, 0, 0, gapComposer, 0, 2044);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$formview$components$arcade$ArcadeFormInstructionCardKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        FormBlocker.Element.InstructionCardElement instructionCardElement = (FormBlocker.Element.InstructionCardElement) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = instructionCardElement.title;
            if (str == null) {
                gapComposer.startReplaceGroup(1141047879);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1141047880);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            String str2 = instructionCardElement.markdown;
            if (str2 == null) {
                gapComposer.startReplaceGroup(1141175568);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1141175569);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                ListOrderedColors$Subtle listOrderedColors$Subtle = ListOrderedColors$Subtle.INSTANCE;
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(i, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.m305MultiblockMarkdown1kVgcOc(str2, (Function2) rememberedValue, null, textStyle, 0L, null, 0, listOrderedColors$Subtle, gapComposer, 12582912, 116);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$formview$components$arcade$ArcadeFormTimelineCardListElementKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        String m;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        GapComposer gapComposer;
        FormBlocker.Element.TimelineCardListElement.Item item = (FormBlocker.Element.TimelineCardListElement.Item) this.f$1;
        Function0 function0 = (Function0) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16);
        Applier applier = gapComposer2.applier;
        if (shouldExecute) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            String str = null;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$16);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$17);
            Image image = item.image;
            if (image == null) {
                gapComposer2.startReplaceGroup(1868954571);
                gapComposer2.end(false);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, 1030120182, image, gapComposer2, false);
            }
            if (m != null && !StringsKt.isBlank(m)) {
                str = m;
            }
            if (str != null) {
                gapComposer2.startReplaceGroup(1869034583);
                gapComposer = gapComposer2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, SizeKt.m285size3ABfNKs(companion, 48.0f), null, ContentScale.Companion.Fit, null, gapComposer, 1573296, 1976);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
                gapComposer.end(false);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(1869313273);
                gapComposer.end(false);
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$12, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$13);
            String str2 = item.title;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1891673474);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1891673473);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                GapComposer gapComposer3 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer3;
                gapComposer.end(false);
            }
            String str3 = item.subtitle;
            if (str3 == null) {
                gapComposer.startReplaceGroup(-1891441253);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1891441252);
                TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                GapComposer gapComposer4 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, textStyle2, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer = gapComposer4;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            if (function0 != null) {
                gapComposer.startReplaceGroup(1869916936);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 8.0f, gapComposer);
                Icons icons = Icons.Push24;
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                GapComposer gapComposer5 = gapComposer;
                Trace.m1191Iconww6aTOc(icons, (String) null, new VerticalAlignElement(Alignment.Companion.Top), colors3.semantic.icon.standard, gapComposer5, 54, 0);
                gapComposer = gapComposer5;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1870210041);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 8;
        int i3 = 25;
        int i4 = 12;
        int i5 = 15;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        char c5 = 1;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj5;
                Function2 function2 = (Function2) obj4;
                UiScope uiScope = (UiScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    ArcadeModal2Kt.ArcadeModal2(uiScope, function0, function2, gapComposer, intValue & 14);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                LimitReachedDialogViewModel limitReachedDialogViewModel = (LimitReachedDialogViewModel) obj5;
                Function1 function1 = (Function1) obj4;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    String str = limitReachedDialogViewModel.dialog.dismiss_button_text;
                    if (str == null) {
                        gapComposer2.startReplaceGroup(-133256814);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-133256813);
                        boolean changed = gapComposer2.changed(function1);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(19, function1);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(-15442051, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str, 3), gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                DirectDepositSetupViewModel directDepositSetupViewModel = (DirectDepositSetupViewModel) obj5;
                Function1 function12 = (Function1) obj4;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    Icons icons = Icons.Help24;
                    String str2 = directDepositSetupViewModel.helpActionLabel;
                    boolean changed2 = gapComposer3.changed(function12);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new EarningsHeaderKt$$ExternalSyntheticLambda2(1, function12);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, str2, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer3, (intValue3 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                DirectDepositEditPaycheckAmountViewModel directDepositEditPaycheckAmountViewModel = (DirectDepositEditPaycheckAmountViewModel) obj5;
                Function1 function13 = (Function1) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Countries.PageHeader(Room.stringResource(gapComposer4, R.string.direct_deposit_edit_paycheck_amount_title), (Modifier) null, (Function2) null, Room.stringResource(gapComposer4, R.string.direct_deposit_edit_paycheck_amount_description), gapComposer4, 0, 6);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer4, null);
                    DirectDepositFormErrorKt.PaycheckInputCard(directDepositEditPaycheckAmountViewModel, PaycheckDepositAllocationType.ALL, R.string.direct_deposit_edit_paycheck_amount_full_paycheck_title, R.string.direct_deposit_edit_paycheck_amount_full_paycheck_desc, function13, gapComposer4, 48);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                    DirectDepositFormErrorKt.PaycheckInputCard(directDepositEditPaycheckAmountViewModel, PaycheckDepositAllocationType.CURRENCY_AMOUNT, R.string.direct_deposit_edit_paycheck_amount_dollar_amount_title, R.string.direct_deposit_edit_paycheck_amount_dollar_amount_desc, function13, gapComposer4, 48);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                    DirectDepositFormErrorKt.PaycheckInputCard(directDepositEditPaycheckAmountViewModel, PaycheckDepositAllocationType.PERCENTAGE, R.string.direct_deposit_edit_paycheck_amount_percentage_title, R.string.direct_deposit_edit_paycheck_amount_percentage_desc, function13, gapComposer4, 48);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                DirectDepositManualFormDetailsViewModel directDepositManualFormDetailsViewModel = (DirectDepositManualFormDetailsViewModel) obj5;
                Function1 function14 = (Function1) obj4;
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    Countries.PageHeader(Room.stringResource(gapComposer5, R.string.direct_deposit_manual_form_details_title), (Modifier) null, (Function2) null, (String) null, gapComposer5, 0, 14);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer5, null);
                    String str3 = directDepositManualFormDetailsViewModel.name;
                    boolean changed3 = gapComposer5.changed(function14);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new EarningsHeaderKt$$ExternalSyntheticLambda2(14, function14);
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    DirectDepositFormErrorKt.FormField(R.string.direct_deposit_manual_form_title_name, str3, (Function0) rememberedValue3, gapComposer5, 0);
                    String str4 = directDepositManualFormDetailsViewModel.companyName;
                    boolean changed4 = gapComposer5.changed(function14);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new EarningsHeaderKt$$ExternalSyntheticLambda2(15, function14);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    DirectDepositFormErrorKt.FormField(R.string.direct_deposit_manual_form_title_company_name, str4, (Function0) rememberedValue4, gapComposer5, 0);
                    String str5 = directDepositManualFormDetailsViewModel.paycheckAmount;
                    boolean changed5 = gapComposer5.changed(function14);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new EarningsHeaderKt$$ExternalSyntheticLambda2(16, function14);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    DirectDepositFormErrorKt.FormField(R.string.direct_deposit_manual_form_title_paycheck_amount, str5, (Function0) rememberedValue5, gapComposer5, 0);
                    SpacerKt.Spacer(gapComposer5, columnScope.weight(1.0f, companion, true));
                    CellDefaultAccessory.Checkbox checkbox = new CellDefaultAccessory.Checkbox(directDepositManualFormDetailsViewModel.addSignature);
                    ComposableLambdaImpl composableLambdaImpl = DirectDepositFormErrorKt.f383lambda$1744581099;
                    boolean changed6 = gapComposer5.changed(function14) | gapComposer5.changedInstance(directDepositManualFormDetailsViewModel);
                    Object rememberedValue6 = gapComposer5.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new ArcadeModal2Kt$$ExternalSyntheticLambda2(i5, function14, directDepositManualFormDetailsViewModel);
                        gapComposer5.updateRememberedValue(rememberedValue6);
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(composableLambdaImpl, null, (Function0) rememberedValue6, false, false, null, null, 0L, checkbox, null, gapComposer5, 6, 1530);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                EarningsHomeViewModel.EarnerModeSheet earnerModeSheet = (EarningsHomeViewModel.EarnerModeSheet) obj5;
                Function1 function15 = (Function1) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    boolean changed7 = gapComposer6.changed(function15);
                    Object rememberedValue7 = gapComposer6.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ComposeDialogKt$$ExternalSyntheticLambda3(7, function15);
                        gapComposer6.updateRememberedValue(rememberedValue7);
                    }
                    EarningsToolsSectionKt.EarnerModeSheetContent(earnerModeSheet, (Function1) rememberedValue7, paddingValues, null, gapComposer6, (intValue6 << 6) & 896);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                EarningsTimeframeSelectorSheetViewModel earningsTimeframeSelectorSheetViewModel = (EarningsTimeframeSelectorSheetViewModel) obj5;
                Function1 function16 = (Function1) obj4;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    NetEarningsInfoSheetViewKt.EarningsTimeframeSelectorSheet(earningsTimeframeSelectorSheetViewModel, function16, SpacerKt.padding(companion, paddingValues2), gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function17 = (Function1) obj5;
                EducationStoryViewModel.Error error = (EducationStoryViewModel.Error) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    boolean changed8 = gapComposer8.changed(function17);
                    Object rememberedValue8 = gapComposer8.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new EarningsHomeKt$$ExternalSyntheticLambda7(25, function17);
                        gapComposer8.updateRememberedValue(rememberedValue8);
                    }
                    coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue8, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(636438539, new ArcadeModal$$ExternalSyntheticLambda3(error, i4), gapComposer8), gapComposer8, 1572864, 62);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                final ElementBoundsRegistry.Element element = (ElementBoundsRegistry.Element) obj5;
                final ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj4;
                Modifier modifier = (Modifier) obj;
                ((Integer) obj3).getClass();
                modifier.getClass();
                GapComposer gapComposer9 = (GapComposer) ((Composer) obj2);
                gapComposer9.startReplaceGroup(-19879732);
                boolean changedInstance = gapComposer9.changedInstance(elementBoundsRegistry) | gapComposer9.changed(element.ordinal());
                Object rememberedValue9 = gapComposer9.rememberedValue();
                if (changedInstance || rememberedValue9 == neverEqualPolicy) {
                    final int i6 = r7 ? 1 : 0;
                    rememberedValue9 = new Function1() { // from class: com.squareup.cash.elementboundsregistry.compose.ComposeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i7 = i6;
                            ElementBoundsRegistry.Element element2 = element;
                            ElementBoundsRegistry elementBoundsRegistry2 = elementBoundsRegistry;
                            switch (i7) {
                                case 0:
                                    ((DisposableEffectScope) obj6).getClass();
                                    return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(27, elementBoundsRegistry2, element2);
                                default:
                                    LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj6;
                                    layoutCoordinates.getClass();
                                    long mo843localToWindowMKHz9U = layoutCoordinates.mo843localToWindowMKHz9U(0L);
                                    int i8 = (int) (mo843localToWindowMKHz9U >> 32);
                                    float intBitsToFloat = Float.intBitsToFloat(i8);
                                    int i9 = (int) (mo843localToWindowMKHz9U & BodyPartID.bodyIdMax);
                                    elementBoundsRegistry2.set(element2, new BoundsRegistry$Bounds(intBitsToFloat, Float.intBitsToFloat(i9), Float.intBitsToFloat(i8) + ((int) (layoutCoordinates.mo838getSizeYbymL2g() >> 32)), Float.intBitsToFloat(i9) + ((int) (BodyPartID.bodyIdMax & layoutCoordinates.mo838getSizeYbymL2g()))));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    gapComposer9.updateRememberedValue(rememberedValue9);
                }
                Updater.DisposableEffect(element, (Function1) rememberedValue9, gapComposer9);
                boolean changedInstance2 = gapComposer9.changedInstance(elementBoundsRegistry) | gapComposer9.changed(element.ordinal());
                Object rememberedValue10 = gapComposer9.rememberedValue();
                if (changedInstance2 || rememberedValue10 == neverEqualPolicy) {
                    final char c6 = c == true ? 1 : 0;
                    rememberedValue10 = new Function1() { // from class: com.squareup.cash.elementboundsregistry.compose.ComposeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i7 = c6;
                            ElementBoundsRegistry.Element element2 = element;
                            ElementBoundsRegistry elementBoundsRegistry2 = elementBoundsRegistry;
                            switch (i7) {
                                case 0:
                                    ((DisposableEffectScope) obj6).getClass();
                                    return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(27, elementBoundsRegistry2, element2);
                                default:
                                    LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj6;
                                    layoutCoordinates.getClass();
                                    long mo843localToWindowMKHz9U = layoutCoordinates.mo843localToWindowMKHz9U(0L);
                                    int i8 = (int) (mo843localToWindowMKHz9U >> 32);
                                    float intBitsToFloat = Float.intBitsToFloat(i8);
                                    int i9 = (int) (mo843localToWindowMKHz9U & BodyPartID.bodyIdMax);
                                    elementBoundsRegistry2.set(element2, new BoundsRegistry$Bounds(intBitsToFloat, Float.intBitsToFloat(i9), Float.intBitsToFloat(i8) + ((int) (layoutCoordinates.mo838getSizeYbymL2g() >> 32)), Float.intBitsToFloat(i9) + ((int) (BodyPartID.bodyIdMax & layoutCoordinates.mo838getSizeYbymL2g()))));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    gapComposer9.updateRememberedValue(rememberedValue10);
                }
                Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier, (Function1) rememberedValue10);
                gapComposer9.end(false);
                return onGloballyPositioned;
            case 9:
                DependentDetailToolbarModel dependentDetailToolbarModel = (DependentDetailToolbarModel) obj5;
                Function1 function18 = (Function1) obj4;
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (!gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    gapComposer10.skipToGroupEnd();
                } else if (dependentDetailToolbarModel.showQrCodeButton) {
                    gapComposer10.startReplaceGroup(-1930132401);
                    Icons icons2 = Icons.NavigationScanQr;
                    String stringResource = Room.stringResource(gapComposer10, R.string.dependent_detail_show_qr_code);
                    boolean changed9 = gapComposer10.changed(function18);
                    Object rememberedValue11 = gapComposer10.rememberedValue();
                    if (changed9 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(15, function18);
                        gapComposer10.updateRememberedValue(rememberedValue11);
                    }
                    TransactorKt.IconAction(titleBarActionScope2, icons2, stringResource, (Function0) rememberedValue11, null, null, null, null, null, null, false, gapComposer10, (intValue9 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    gapComposer10.end(false);
                } else {
                    gapComposer10.startReplaceGroup(-1929891190);
                    gapComposer10.end(false);
                }
                return Unit.INSTANCE;
            case 10:
                DependentActivityEmbeddedSectionViewModel dependentActivityEmbeddedSectionViewModel = (DependentActivityEmbeddedSectionViewModel) obj5;
                Function1 function19 = (Function1) obj4;
                EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                embeddedHeaderScope.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(embeddedHeaderScope) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    String str6 = dependentActivityEmbeddedSectionViewModel.sectionTitle;
                    boolean changed10 = gapComposer11.changed(function19) | gapComposer11.changed(dependentActivityEmbeddedSectionViewModel);
                    Object rememberedValue12 = gapComposer11.rememberedValue();
                    if (changed10 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new GLSceneScope$$ExternalSyntheticLambda4(c2 == true ? 1 : 0, function19, dependentActivityEmbeddedSectionViewModel);
                        gapComposer11.updateRememberedValue(rememberedValue12);
                    }
                    embeddedHeaderScope.DefaultHeader((intValue10 << 9) & 7168, 2, gapComposer11, str6, null, (Function0) rememberedValue12);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                AllowanceViewKt.AllowanceSelectionKeypadAmountPicker((AmountChooserViewModel.Content) obj5, (Function1) obj4, null, (Composer) obj2, 0);
                return Unit.INSTANCE;
            case 12:
                FamilyMemberSection familyMemberSection = (FamilyMemberSection) obj5;
                Function1 function110 = (Function1) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer12.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer12.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10), null, 3);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer12, 6);
                    int hashCode = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer12, animateContentSize$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer12, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer12.startReplaceGroup(552751009);
                    for (FamilyMemberRowViewModel familyMemberRowViewModel : familyMemberSection.familyMemberRows) {
                        String str7 = familyMemberRowViewModel.customerToken;
                        if (str7 == null && (str7 = familyMemberRowViewModel.fullName) == null) {
                            str7 = "family_member_loading";
                        }
                        gapComposer12.startMovableGroup(-352655394, str7);
                        AllowanceViewKt.FamilyMemberRow(familyMemberRowViewModel, function110, null, gapComposer12, 0);
                        gapComposer12.end(false);
                    }
                    gapComposer12.end(false);
                    gapComposer12.end(true);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                FamilyListSection familyListSection = (FamilyListSection) obj5;
                Function1 function111 = (Function1) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    AllowanceViewKt.FamilyHomeListSection(familyListSection, function111, gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                FamilyPendingRequestsSection familyPendingRequestsSection = (FamilyPendingRequestsSection) obj5;
                Function1 function112 = (Function1) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    FamilyHomeViewKt.PendingRequestsSectionContent(familyPendingRequestsSection, function112, gapComposer14, 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                AllowanceViewKt.FamilyMemberCard((FamilyMemberRowViewModel) obj5, (Function1) obj4, null, (Composer) obj2, 0, 4);
                return Unit.INSTANCE;
            case 16:
                Function1 function113 = (Function1) obj5;
                U13CelebrationViewModel u13CelebrationViewModel = (U13CelebrationViewModel) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed11 = gapComposer15.changed(function113);
                    Object rememberedValue13 = gapComposer15.rememberedValue();
                    if (changed11 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new SafetyHubViewKt$$ExternalSyntheticLambda9(8, function113);
                        gapComposer15.updateRememberedValue(rememberedValue13);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue13, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1883167361, new ArcadeModal$$ExternalSyntheticLambda3(u13CelebrationViewModel, 20), gapComposer15), gapComposer15, 1573248, 58);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                SelectSponsorErrorViewModel selectSponsorErrorViewModel = (SelectSponsorErrorViewModel) obj5;
                Function1 function114 = (Function1) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, "", selectSponsorErrorViewModel.message, Expect_jvmKt.rememberComposableLambda(-2138355124, new ErrorView$$ExternalSyntheticLambda3(14, function114), gapComposer16), (Function3) null, (Function3) null, gapComposer16, 3120, 49);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Function1 function115 = (Function1) obj5;
                SelectSponsorViewModel.SelectSponsor selectSponsor = (SelectSponsorViewModel.SelectSponsor) obj4;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    boolean changed12 = gapComposer17.changed(function115);
                    Object rememberedValue14 = gapComposer17.rememberedValue();
                    if (changed12 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new SafetyHubViewKt$$ExternalSyntheticLambda9(15, function115);
                        gapComposer17.updateRememberedValue(rememberedValue14);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue14, null, ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(270948665, new ArcadeModal$$ExternalSyntheticLambda3(selectSponsor, 21), gapComposer17), gapComposer17, 1573248, 58);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                SafetyEducationPageViewModel safetyEducationPageViewModel = (SafetyEducationPageViewModel) obj5;
                Function1 function116 = (Function1) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    LocalizedString localizedString = safetyEducationPageViewModel.page.navigation_title;
                    String translated = localizedString != null ? com.squareup.util.cash.StringsKt.translated(localizedString) : null;
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed13 = gapComposer18.changed(function116);
                    Object rememberedValue15 = gapComposer18.rememberedValue();
                    if (changed13 || rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new SafetyHubViewKt$$ExternalSyntheticLambda9(16, function116);
                        gapComposer18.updateRememberedValue(rememberedValue15);
                    }
                    DBUtil.TitleBarSub(translated, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue15, (Modifier) null, (Function3) null, gapComposer18, 48, 108);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                FavoriteAddedViewModel favoriteAddedViewModel = (FavoriteAddedViewModel) obj5;
                Function1 function117 = (Function1) obj4;
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer18).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue18 & 1, (intValue18 & 19) != 18)) {
                    boolean changedInstance3 = gapComposer19.changedInstance(favoriteAddedViewModel) | gapComposer19.changed(function117);
                    Object rememberedValue16 = gapComposer19.rememberedValue();
                    if (changedInstance3 || rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new GLSceneScope$$ExternalSyntheticLambda4(i2, favoriteAddedViewModel, function117);
                        gapComposer19.updateRememberedValue(rememberedValue16);
                    }
                    modalButtonScope2.PrimaryModalButton((Function0) rememberedValue16, null, false, Expect_jvmKt.rememberComposableLambda(1420420199, new FavoriteAddedViewKt$$ExternalSyntheticLambda2(favoriteAddedViewModel, c3 == true ? 1 : 0), gapComposer19), gapComposer19, (57344 & (intValue18 << 12)) | 3072, 6);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                final FidesmoProvisioningViewModel.Error error2 = (FidesmoProvisioningViewModel.Error) obj5;
                final Function1 function118 = (Function1) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    String str8 = error2.secondaryButtonText;
                    if (str8 == null) {
                        gapComposer20.startReplaceGroup(1704860865);
                        gapComposer20.end(false);
                    } else {
                        gapComposer20.startReplaceGroup(1704860866);
                        ButtonProminence buttonProminence2 = ButtonProminence.SUBTLE;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed14 = gapComposer20.changed(function118) | gapComposer20.changedInstance(error2);
                        Object rememberedValue17 = gapComposer20.rememberedValue();
                        if (changed14 || rememberedValue17 == neverEqualPolicy) {
                            final int i7 = r7 ? 1 : 0;
                            rememberedValue17 = new Function0() { // from class: com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$$ExternalSyntheticLambda50
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i8 = i7;
                                    FidesmoProvisioningViewModel.Error error3 = error2;
                                    Function1 function119 = function118;
                                    switch (i8) {
                                        case 0:
                                            FidesmoProvisioningViewModel.ButtonAction buttonAction = error3.secondaryButtonAction;
                                            if (buttonAction == null) {
                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                break;
                                            } else {
                                                function119.invoke(FidesmoProvisioningViewKt.toViewEvent(buttonAction));
                                                break;
                                            }
                                        default:
                                            FidesmoProvisioningViewModel.ButtonAction buttonAction2 = error3.primaryButtonAction;
                                            if (buttonAction2 == null) {
                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                break;
                                            } else {
                                                function119.invoke(FidesmoProvisioningViewKt.toViewEvent(buttonAction2));
                                                break;
                                            }
                                    }
                                    return null;
                                }
                            };
                            gapComposer20.updateRememberedValue(rememberedValue17);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue17, fillMaxWidth, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-1708860991, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str8, 11), gapComposer20), gapComposer20, 1573296, 56);
                        gapComposer20.end(false);
                    }
                    String str9 = error2.primaryButtonText;
                    if (str9 == null) {
                        gapComposer20.startReplaceGroup(1705213924);
                        gapComposer20.end(false);
                    } else {
                        gapComposer20.startReplaceGroup(1705213925);
                        ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed15 = gapComposer20.changed(function118) | gapComposer20.changedInstance(error2);
                        Object rememberedValue18 = gapComposer20.rememberedValue();
                        if (changed15 || rememberedValue18 == neverEqualPolicy) {
                            final char c7 = c4 == true ? 1 : 0;
                            rememberedValue18 = new Function0() { // from class: com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$$ExternalSyntheticLambda50
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i8 = c7;
                                    FidesmoProvisioningViewModel.Error error3 = error2;
                                    Function1 function119 = function118;
                                    switch (i8) {
                                        case 0:
                                            FidesmoProvisioningViewModel.ButtonAction buttonAction = error3.secondaryButtonAction;
                                            if (buttonAction == null) {
                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                break;
                                            } else {
                                                function119.invoke(FidesmoProvisioningViewKt.toViewEvent(buttonAction));
                                                break;
                                            }
                                        default:
                                            FidesmoProvisioningViewModel.ButtonAction buttonAction2 = error3.primaryButtonAction;
                                            if (buttonAction2 == null) {
                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                break;
                                            } else {
                                                function119.invoke(FidesmoProvisioningViewKt.toViewEvent(buttonAction2));
                                                break;
                                            }
                                    }
                                    return null;
                                }
                            };
                            gapComposer20.updateRememberedValue(rememberedValue18);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue18, fillMaxWidth2, buttonProminence3, false, false, null, Expect_jvmKt.rememberComposableLambda(-1856757654, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str9, i4), gapComposer20), gapComposer20, 1573296, 56);
                        gapComposer20.end(false);
                    }
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Function1 function119 = (Function1) obj5;
                FidesmoProvisioningViewModel.Success.Deprovisioned deprovisioned = (FidesmoProvisioningViewModel.Success.Deprovisioned) obj4;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed16 = gapComposer21.changed(function119);
                    Object rememberedValue19 = gapComposer21.rememberedValue();
                    if (changed16 || rememberedValue19 == neverEqualPolicy) {
                        rememberedValue19 = new SafetyHubViewKt$$ExternalSyntheticLambda9(28, function119);
                        gapComposer21.updateRememberedValue(rememberedValue19);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue19, fillMaxWidth3, buttonProminence4, false, false, null, Expect_jvmKt.rememberComposableLambda(-938207728, new ArcadeModal$$ExternalSyntheticLambda3(deprovisioned, 24), gapComposer21), gapComposer21, 1573296, 56);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                FidesmoProvisioningViewModel.Failed failed = (FidesmoProvisioningViewModel.Failed) obj5;
                Function1 function120 = (Function1) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    String str10 = failed.retryButtonText;
                    if (str10 != null) {
                        gapComposer22.startReplaceGroup(1228835750);
                        ButtonProminence buttonProminence5 = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed17 = gapComposer22.changed(function120);
                        Object rememberedValue20 = gapComposer22.rememberedValue();
                        if (changed17 || rememberedValue20 == neverEqualPolicy) {
                            rememberedValue20 = new ErrorView$$ExternalSyntheticLambda4(c5 == true ? 1 : 0, function120);
                            gapComposer22.updateRememberedValue(rememberedValue20);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue20, fillMaxWidth4, buttonProminence5, false, false, null, Expect_jvmKt.rememberComposableLambda(1266419942, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str10, i5), gapComposer22), gapComposer22, 1573296, 56);
                        gapComposer22.end(false);
                    } else {
                        gapComposer22.startReplaceGroup(1229051324);
                        gapComposer22.end(false);
                    }
                    gapComposer22.startReplaceGroup(1229407452);
                    gapComposer22.end(false);
                    ButtonProminence buttonProminence6 = ButtonProminence.STANDARD;
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed18 = gapComposer22.changed(function120);
                    Object rememberedValue21 = gapComposer22.rememberedValue();
                    if (changed18 || rememberedValue21 == neverEqualPolicy) {
                        rememberedValue21 = new ErrorView$$ExternalSyntheticLambda4(r14, function120);
                        gapComposer22.updateRememberedValue(rememberedValue21);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue21, fillMaxWidth5, buttonProminence6, false, false, null, Expect_jvmKt.rememberComposableLambda(1855846177, new ArcadeModal$$ExternalSyntheticLambda3(failed, i3), gapComposer22), gapComposer22, 1573296, 56);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                return invoke$com$squareup$cash$fidesmo$views$FidesmoProvisioningViewKt$$ExternalSyntheticLambda61(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$formview$components$ArcadeFormViewTitleBar$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$formview$components$FormViewCtaButtons$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$formview$components$arcade$ArcadeFormInstructionCardKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$formview$components$arcade$ArcadeFormTimelineCardListElementKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            default:
                Modifier modifier2 = (Modifier) obj5;
                IconViewModel.ProgressMeterViewModel progressMeterViewModel = (IconViewModel.ProgressMeterViewModel) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier2, 1.0f);
                    String themedUrl = ComposeUtilsKt.getThemedUrl(progressMeterViewModel.image, gapComposer23);
                    long j = Color.White;
                    AsyncImageKt.m1438AsyncImage10Xjiaw(themedUrl, null, fillMaxSize, null, null, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer23, 100663344, 1784);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ArcadeModal2Kt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
