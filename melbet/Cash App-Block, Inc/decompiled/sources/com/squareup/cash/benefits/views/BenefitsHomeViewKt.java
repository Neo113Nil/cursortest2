package com.squareup.cash.benefits.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda1;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda16;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadq;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.viewmodels.BenefitsExplanationViewModel;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.cash.benefits.components.views.Style;
import com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.viewmodels.GreenEligibleTransactionsViewModel;
import com.squareup.cash.benefits.viewmodels.PdsaBenefitsExplainerViewModel$Loaded;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.stablecoin.views.StablecoinHomeViewKt$$ExternalSyntheticLambda7;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.ProgressBarKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BenefitsHomeViewKt {
    public static final ComposableLambdaImpl lambda$2116069063 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(8), false, 2116069063);

    /* renamed from: lambda$-1562289354, reason: not valid java name */
    public static final ComposableLambdaImpl f243lambda$1562289354 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(12), false, -1562289354);

    /* renamed from: lambda$-1250725136, reason: not valid java name */
    public static final ComposableLambdaImpl f242lambda$1250725136 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(13), false, -1250725136);
    public static final ComposableLambdaImpl lambda$1435542859 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(14), false, 1435542859);

    /* renamed from: lambda$-907484794, reason: not valid java name */
    public static final ComposableLambdaImpl f244lambda$907484794 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(15), false, -907484794);

    public static final void ActivitySection(BenefitsHomeViewModel.Content.ActivitySection activitySection, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-569812137);
        int i2 = (gapComposer.changedInstance(activitySection) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            UiCallbackModel uiCallbackModel = activitySection.embedded;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(304119155, new BankingDialogKt$$ExternalSyntheticLambda8(activitySection, 16), gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AvatarsKt.ActivityEmbeddedView(uiCallbackModel, companion, rememberComposableLambda, null, null, gapComposer, 432, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(activitySection, modifier, i, 23);
        }
    }

    public static final void BankingBenefitsBookletView(BankingBenefitsBookletViewModel bankingBenefitsBookletViewModel, Function1 function1, Composer composer, int i) {
        BankingBenefitsBookletViewModel bankingBenefitsBookletViewModel2;
        bankingBenefitsBookletViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1663683251);
        int i2 = (gapComposer.changedInstance(bankingBenefitsBookletViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = bankingBenefitsBookletViewModel instanceof BankingBenefitsBookletViewModel.Loading;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda2(11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            bankingBenefitsBookletViewModel2 = bankingBenefitsBookletViewModel;
            Strings.LoadableFullScreenContent(bankingBenefitsBookletViewModel2, z, null, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-372797365, new SetPinViewKt$$ExternalSyntheticLambda4(10, function1), gapComposer), gapComposer, (i2 & 14) | 199680, 20);
        } else {
            bankingBenefitsBookletViewModel2 = bankingBenefitsBookletViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsUiFactory$$ExternalSyntheticLambda4(bankingBenefitsBookletViewModel2, function1, i);
        }
    }

    public static final void BenefitsExplanationView(BenefitsExplanationViewModel benefitsExplanationViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        benefitsExplanationViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1668778288);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(benefitsExplanationViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1533075269, new BadgeKt$$ExternalSyntheticLambda2(22, benefitsExplanationViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(benefitsExplanationViewModel, function1, i, 18);
        }
    }

    public static final void BenefitsHeader(BenefitsHomeViewModel.Content.HeaderViewModel headerViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(891483614);
        int i2 = (gapComposer.changedInstance(headerViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ExtensionsKt.CashGreenRectangleRow(headerViewModel.greenStatus, SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, Style.LARGE, Expect_jvmKt.rememberComposableLambda(455498136, new BankingDialogKt$$ExternalSyntheticLambda8(headerViewModel, 17), gapComposer), gapComposer, 27648, 4);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashtagViewKt$$ExternalSyntheticLambda10(headerViewModel, i, 10);
        }
    }

    public static final void BenefitsHome(RealImageLoader realImageLoader, BenefitsHomeViewModel benefitsHomeViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        benefitsHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1887874485);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(benefitsHomeViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(634369803, new BenefitsHomeViewKt$$ExternalSyntheticLambda0(function1, benefitsHomeViewModel, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(realImageLoader, benefitsHomeViewModel, function1, i, 20);
        }
    }

    public static final void BenefitsHomeContent(BenefitsHomeViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-860481873);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            BenefitsHeader(content.headerViewModel, gapComposer, 0);
            int i4 = i3 & 112;
            StatusPathInformationSection(content.statusPathInfoSection, function1, gapComposer, i4);
            BenefitsTable(content.benefitsComparisonTable, gapComposer, 0);
            BenefitsHomeViewModel.Content.ActivitySection activitySection = content.activitySection;
            if (activitySection == null) {
                gapComposer.startReplaceGroup(767299993);
            } else {
                gapComposer.startReplaceGroup(767299994);
                ActivitySection(activitySection, null, gapComposer, 0);
            }
            gapComposer.end(false);
            DisclosureSection(content.disclosures, function1, gapComposer, i4);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(i, 21, modifier2, content, function1);
        }
    }

    public static final void BenefitsHubError(BenefitsHubViewModel.Error error, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        error.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(487105472);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(error) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier align = boxScopeInstance.align(companion, biasAlignment);
            int i3 = i2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, align);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.TitleBarSub((String) null, NavigationType.CLOSE, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, (Function3) null, gapComposer, ((i3 << 9) & 57344) | 54, 108);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Countries.PageHeader(error.title, (Modifier) null, lambda$2116069063, error.subtitle, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            gapComposer.end(true);
            if (error.retryable) {
                gapComposer.startReplaceGroup(148014631);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                coil3.size.SizeKt.ButtonCta(function02, boxScopeInstance.align(SpacerKt.m298padding3ABfNKs(fillMaxWidth, 16.0f), Alignment.Companion.BottomCenter), buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-734883066, new BankingDialogKt$$ExternalSyntheticLambda8(error, 19), gapComposer), gapComposer, ((i3 >> 6) & 14) | 1573248, 56);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(148286780);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(error, function0, function02, i, 22);
        }
    }

    public static final void BenefitsHubExplanation(Modifier modifier, BenefitsExplanationViewModel benefitsExplanationViewModel, Function1 function1, Composer composer, int i) {
        char c;
        int i2;
        benefitsExplanationViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2004560009);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(benefitsExplanationViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            NavigationType navigationType = NavigationType.BACK;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda4(2, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i5 = i4;
            NeverEqualPolicy neverEqualPolicy2 = neverEqualPolicy;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            int i6 = 14;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, rememberScrollState, false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(benefitsExplanationViewModel.title, (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            float f = 16.0f;
            float f2 = RecyclerView.DECELERATION_RATE;
            int i7 = 2;
            ExplanationBody(0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), benefitsExplanationViewModel.contents);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(1069573718);
            for (String str : benefitsExplanationViewModel.footers) {
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, f, f2, i7);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    c = 51733;
                } else {
                    c = 51733;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors2.semantic.text.subtle;
                int i8 = i5;
                boolean z2 = i8 == 256;
                Object rememberedValue2 = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy2;
                if (z2 || rememberedValue2 == neverEqualPolicy3) {
                    i2 = 0;
                    rememberedValue2 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, false, i6);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    i2 = 0;
                }
                GapComposer gapComposer2 = gapComposer;
                i5 = i8;
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue2, m300paddingVpY3zN4$default, textStyle, j, null, null, null, 0, 0, 0, gapComposer2, 0, 2016);
                gapComposer = gapComposer2;
                DBUtil.SpacerWithinSectionSmall(i2, 1, gapComposer, null);
                neverEqualPolicy2 = neverEqualPolicy3;
                companion = companion;
                i6 = i6;
                i7 = 2;
                f = 16.0f;
                f2 = RecyclerView.DECELERATION_RATE;
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1(modifier, benefitsExplanationViewModel, function1, i, 16);
        }
    }

    public static final void BenefitsTable(BenefitsComparisonTableViewModel benefitsComparisonTableViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-823206619);
        int i2 = (gapComposer.changedInstance(benefitsComparisonTableViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            zzadq.BenefitsComparisonTable(benefitsComparisonTableViewModel, gapComposer, i2 & 14);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsHomeViewKt$$ExternalSyntheticLambda18(benefitsComparisonTableViewModel, i, 0);
        }
    }

    public static final void DisclosureSection(List list, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1378968667);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (list == null) {
            gapComposer.startReplaceGroup(-506513500);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-506513499);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
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
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            gapComposer.startReplaceGroup(514016152);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.text.subtle;
                boolean z2 = (i3 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == Composer.Companion.Empty) {
                    z = false;
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, false, 15);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    z = false;
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m300paddingVpY3zN4$default, textStyle, j, null, null, null, 0, 0, 0, gapComposer, 0, 2016);
                companion = companion;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda16(list, function1, i, 2);
        }
    }

    public static final void ExplanationBody(int i, Composer composer, Modifier modifier, ArrayList arrayList) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(60902976);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(arrayList) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.CompositionLocalProvider(ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium), Expect_jvmKt.rememberComposableLambda(-1447359754, new BenefitsExplanationViewKt$$ExternalSyntheticLambda5(arrayList), gapComposer), gapComposer, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StablecoinHomeViewKt$$ExternalSyntheticLambda7(modifier, arrayList, i);
        }
    }

    public static final void GreenEligibleTransactions(GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel, Function1 function1, Composer composer, int i) {
        greenEligibleTransactionsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-230938561);
        int i2 = (gapComposer.changedInstance(greenEligibleTransactionsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1930868116, new BenefitsUiFactory$$ExternalSyntheticLambda3(greenEligibleTransactionsViewModel, function1, 1, (byte) 0), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsUiFactory$$ExternalSyntheticLambda3(greenEligibleTransactionsViewModel, function1, i);
        }
    }

    public static final void GreenEligibleTransactionsSectionHeader(String str, String str2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1750714197);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(1314324007, new TransfersViewKt$$ExternalSyntheticLambda5(str, 28), gapComposer), SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, null, 0L, new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-2063647984, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str2, 12), gapComposer), 0), null, gapComposer, 54, 1532);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PreviewActivity$$ExternalSyntheticLambda1(str, i, 3, str2);
        }
    }

    public static final void PdsaBenefitsExplainerSheet(Modifier modifier, final PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded, Function1 function1, Composer composer, int i) {
        Function1 function12 = function1;
        modifier.getClass();
        pdsaBenefitsExplainerViewModel$Loaded.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(832019141);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(pdsaBenefitsExplainerViewModel$Loaded) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128);
        final int i3 = 1;
        final int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startReplaceGroup(706482423);
            float mo233toDpu2uoSUM = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM((int) (((LazyWindowInfo) ((WindowInfo) gapComposer.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g() & BodyPartID.bodyIdMax));
            gapComposer.end(false);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, mo233toDpu2uoSUM * 0.9f, 1);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.component.sheet.background;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier then = ImageKt.m177backgroundbw27NRU(m279heightInVpY3zN4$default, j, rectangleShapeKt$RectangleShape$1).then(modifier);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda2(13);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(NestedScrollModifierKt.nestedScroll(SemanticsModifierKt.semantics(then, false, (Function1) rememberedValue), zzagn.rememberNestedScrollInteropConnection(gapComposer), null), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            ImageKt.Image(Countries.painterResource(R.drawable.benefits_booklet_hero_image, 0, gapComposer), null, SizeKt.fillMaxWidth(companion, 1.0f), null, ContentScale.Companion.FillWidth, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 25008, 104);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(-751639258, new Function2() { // from class: com.squareup.cash.benefits.views.PdsaBenefitsExplainerViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded2 = pdsaBenefitsExplainerViewModel$Loaded;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).headlineSmall, (TextLineBalancing) null, pdsaBenefitsExplainerViewModel$Loaded2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pdsaBenefitsExplainerViewModel$Loaded2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(87228547, new Function2() { // from class: com.squareup.cash.benefits.views.PdsaBenefitsExplainerViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded2 = pdsaBenefitsExplainerViewModel$Loaded;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).headlineSmall, (TextLineBalancing) null, pdsaBenefitsExplainerViewModel$Loaded2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pdsaBenefitsExplainerViewModel$Loaded2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3078, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            function12 = function1;
            DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(companion, colors2.component.sheet.background, rectangleShapeKt$RectangleShape$1), false, null, null, Expect_jvmKt.rememberComposableLambda(-1322579891, new PdsaBenefitsExplainerViewKt$$ExternalSyntheticLambda4(function12, pdsaBenefitsExplainerViewModel$Loaded), gapComposer), gapComposer, 24576, 14);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1(modifier, pdsaBenefitsExplainerViewModel$Loaded, function12, i, 18);
        }
    }

    public static final void PdsaBenefitsExplainerView(PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded, Function1 function1, Composer composer, int i) {
        int i2;
        pdsaBenefitsExplainerViewModel$Loaded.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1842379307);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(pdsaBenefitsExplainerViewModel$Loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-433899478, new BitcoinUiFactory$$ExternalSyntheticLambda12(1, (Object) pdsaBenefitsExplainerViewModel$Loaded, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(pdsaBenefitsExplainerViewModel$Loaded, function1, i, 24);
        }
    }

    public static final void StatusPathInformationSection(BenefitsHomeViewModel.StatusPathInfoSection statusPathInfoSection, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        BenefitsHomeViewModel.StatusPathInfoSection.ProgressBarViewModel progressBarViewModel;
        Function0 function0;
        Modifier.Companion companion;
        NeverEqualPolicy neverEqualPolicy;
        GapComposer gapComposer2;
        boolean z;
        Modifier modifier;
        boolean z2;
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(2114918465);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer3.changedInstance(statusPathInfoSection) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
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
            BenefitsHomeViewModel.StatusPathInfoSection.ProgressBarViewModel progressBarViewModel2 = statusPathInfoSection.progressBarViewModel;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (progressBarViewModel2 == null) {
                gapComposer3.startReplaceGroup(-1397701664);
                gapComposer3.end(false);
                neverEqualPolicy = neverEqualPolicy2;
                z = false;
                gapComposer2 = gapComposer3;
                companion = companion2;
                modifier = null;
                z2 = true;
            } else {
                gapComposer3.startReplaceGroup(-1397701663);
                String str = progressBarViewModel2.currentSpendDescription;
                String str2 = progressBarViewModel2.deadlineDescription;
                String str3 = statusPathInfoSection.viewTransactionsButtonText;
                if (str3 == null) {
                    gapComposer3.startReplaceGroup(81216847);
                    gapComposer3.end(false);
                    progressBarViewModel = progressBarViewModel2;
                    function0 = null;
                } else {
                    gapComposer3.startReplaceGroup(81216848);
                    progressBarViewModel = progressBarViewModel2;
                    boolean z3 = (i3 & 112) == 32;
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (z3 || rememberedValue == neverEqualPolicy2) {
                        rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda4(3, function1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    function0 = (Function0) rememberedValue;
                    gapComposer3.end(false);
                }
                companion = companion2;
                BenefitsHomeViewModel.StatusPathInfoSection.ProgressBarViewModel progressBarViewModel3 = progressBarViewModel;
                neverEqualPolicy = neverEqualPolicy2;
                ViewfinderDefaults.SectionHeader(str, (Modifier) null, str3, function0, str2, gapComposer3, 0, 2);
                gapComposer2 = gapComposer3;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                z = false;
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(fillMaxWidth3, 16.0f);
                float f = progressBarViewModel3.progress;
                float f2 = progressBarViewModel3.animationEnabled ? RecyclerView.DECELERATION_RATE : f;
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                ProgressBarKt.m3992ProgressBarjt2gSs(m277height3ABfNKs, f2, f, 16.0f, gapComposer2, 0, 0);
                modifier = null;
                z2 = true;
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                gapComposer2.end(true);
                gapComposer2.end(false);
            }
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            String str4 = statusPathInfoSection.statusRequirementDescription;
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(z);
            }
            boolean z4 = z;
            Modifier modifier2 = modifier;
            GapComposer gapComposer4 = gapComposer2;
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer4, m300paddingVpY3zN4$default2, textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
            gapComposer = gapComposer4;
            String str5 = statusPathInfoSection.otherWaysToQualifyText;
            if (str5 == null) {
                gapComposer.startReplaceGroup(-1396536560);
                gapComposer.end(z4);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(-1396536559);
                DBUtil.SpacerWithinSectionMedium(z4 ? 1 : 0, 1, gapComposer, modifier2);
                boolean z5 = (i3 & 112) == 32 ? true : z4 ? 1 : 0;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z5 || rememberedValue2 == neverEqualPolicy3) {
                    function12 = function1;
                    rememberedValue2 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(4, function12);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    function12 = function1;
                }
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue2, null, ButtonProminence.SUBTLE, false, false, null, Expect_jvmKt.rememberComposableLambda(1935014328, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str5, 11), gapComposer), gapComposer, 1573248, 58);
                gapComposer = gapComposer;
                gapComposer.end(z4);
            }
            DBUtil.SpacerBetweenSectionLarge(z4 ? 1 : 0, 1, gapComposer, modifier2);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(statusPathInfoSection, function12, i, 19);
        }
    }
}
