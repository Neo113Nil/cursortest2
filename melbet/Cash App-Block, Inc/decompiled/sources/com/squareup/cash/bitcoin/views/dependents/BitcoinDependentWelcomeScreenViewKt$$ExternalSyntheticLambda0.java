package com.squareup.cash.bitcoin.views.dependents;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaet;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.viewmodels.dependents.BitcoinDependentWelcomeViewModel;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.TransitionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BitcoinDependentWelcomeViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0(BitcoinDependentWelcomeViewModel bitcoinDependentWelcomeViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = bitcoinDependentWelcomeViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        BitcoinDependentWelcomeViewModel bitcoinDependentWelcomeViewModel = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zzaet.BitcoinWelcomeScreenContent(bitcoinDependentWelcomeViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(companion), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
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
                    String str = bitcoinDependentWelcomeViewModel.toolbarTitle;
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(23, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
                    Painter painterResource = Countries.painterResource(2131231128, 0, gapComposer);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    TransitionsKt.NullStateWidgetView(painterResource, bitcoinDependentWelcomeViewModel.title, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), fillMaxWidth, bitcoinDependentWelcomeViewModel.subTitle, gapComposer, Painter.$stable | 3072, 0);
                    SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1727893392, new BankingDialogKt$$ExternalSyntheticLambda2(29, function1, bitcoinDependentWelcomeViewModel), gapComposer), gapComposer, 24576, 15);
                    gapComposer.end(true);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zzaet.BitcoinWelcomeScreenContent(bitcoinDependentWelcomeViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0(BitcoinDependentWelcomeViewModel bitcoinDependentWelcomeViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = bitcoinDependentWelcomeViewModel;
        this.f$1 = function1;
    }
}
