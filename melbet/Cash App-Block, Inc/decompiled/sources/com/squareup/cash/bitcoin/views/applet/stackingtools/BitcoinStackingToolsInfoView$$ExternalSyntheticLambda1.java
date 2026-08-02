package com.squareup.cash.bitcoin.views.applet.stackingtools;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsInfoViewModel;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinStackingToolsInfoView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BitcoinStackingToolsInfoViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BitcoinStackingToolsInfoView$$ExternalSyntheticLambda1(BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = bitcoinStackingToolsInfoViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        NavigationType navigationType;
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    BitmapPainterKt.BitcoinStackingToolsInfoViewContent(bitcoinStackingToolsInfoViewModel, function1, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j = colors.semantic.background.f1047app;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean z = bitcoinStackingToolsInfoViewModel.useBackArrow;
                    if (z) {
                        navigationType = NavigationType.BACK;
                    } else {
                        if (z) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        navigationType = NavigationType.CLOSE;
                    }
                    NavigationType navigationType2 = navigationType;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(14, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 6, 108);
                    BitmapPainterKt.StackingToolsInfoContent(bitcoinStackingToolsInfoViewModel, function1, new LayoutWeightElement(1.0f, true), gapComposer2, 0);
                    String str = bitcoinStackingToolsInfoViewModel.buttonText;
                    if (str == null) {
                        gapComposer2.startReplaceGroup(1396361968);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1396361969);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(fillMaxWidth, 16.0f);
                        boolean changed2 = gapComposer2.changed(function1) | gapComposer2.changed(bitcoinStackingToolsInfoViewModel);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new BulletinTileKt$$ExternalSyntheticLambda12(3, function1, bitcoinStackingToolsInfoViewModel);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        coil3.size.SizeKt.Button((Function0) rememberedValue2, m298padding3ABfNKs, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1681528279, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 15), gapComposer2), gapComposer2, 1573248, 56);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
