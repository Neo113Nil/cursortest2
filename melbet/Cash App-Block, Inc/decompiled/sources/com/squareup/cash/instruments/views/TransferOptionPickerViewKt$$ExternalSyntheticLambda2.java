package com.squareup.cash.instruments.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.TransferOptionPickerViewModel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class TransferOptionPickerViewKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TransferOptionPickerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ TransferOptionPickerViewKt$$ExternalSyntheticLambda2(TransferOptionPickerViewModel transferOptionPickerViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = transferOptionPickerViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Function1 function1;
        int i;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        BiasAlignment.Horizontal horizontal;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        GapComposer gapComposer;
        ?? r13;
        Object obj5;
        int i2 = this.$r8$classId;
        Object obj6 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function12 = this.f$1;
        TransferOptionPickerViewModel transferOptionPickerViewModel = this.f$0;
        switch (i2) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.padding(companion, paddingValues), 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$15);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$16);
                    String str = transferOptionPickerViewModel.title;
                    if (str == null) {
                        gapComposer2.startReplaceGroup(-1512965539);
                        gapComposer2.end(false);
                        obj4 = obj6;
                        function1 = function12;
                        gapComposer = gapComposer2;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        i = -1762997026;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        r13 = 0;
                        horizontal = horizontal2;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                    } else {
                        gapComposer2.startReplaceGroup(-1512965538);
                        obj4 = obj6;
                        function1 = function12;
                        i = -1762997026;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        horizontal = horizontal2;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                        Countries.PageHeader(str, (Modifier) null, (Function2) null, (String) null, gapComposer2, 0, 14);
                        gapComposer = gapComposer2;
                        r13 = 0;
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    }
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, r13), 1.0f), ImageKt.rememberScrollState(gapComposer), r13, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, r13);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$1, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$16);
                    gapComposer.startReplaceGroup(-689799580);
                    for (TransferOptionPickerViewModel.Option option : transferOptionPickerViewModel.options) {
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        InstrumentCellViewModel instrumentCellViewModel = option.instrument;
                        boolean z = option.selected;
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, i, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        Color color = new Color(colors2.semantic.text.subtle);
                        Function1 function13 = function1;
                        boolean changed = gapComposer.changed(function13) | gapComposer.changedInstance(option);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed) {
                            obj5 = obj4;
                        } else {
                            obj5 = obj4;
                            if (rememberedValue != obj5) {
                                GapComposer gapComposer3 = gapComposer;
                                InstrumentCellKt.m3578InstrumentRowjM_yU8I(fillMaxWidth2, instrumentCellViewModel, null, z, color, (Function0) rememberedValue, gapComposer3, 6, 4);
                                function1 = function13;
                                obj4 = obj5;
                                gapComposer = gapComposer3;
                            }
                        }
                        rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(3, function13, option);
                        gapComposer.updateRememberedValue(rememberedValue);
                        GapComposer gapComposer32 = gapComposer;
                        InstrumentCellKt.m3578InstrumentRowjM_yU8I(fillMaxWidth2, instrumentCellViewModel, null, z, color, (Function0) rememberedValue, gapComposer32, 6, 4);
                        function1 = function13;
                        obj4 = obj5;
                        gapComposer = gapComposer32;
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    GapComposer gapComposer4 = gapComposer;
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-556020122, new TransferOptionPickerViewKt$$ExternalSyntheticLambda2(transferOptionPickerViewModel, function1, 1), gapComposer), gapComposer4, 24576, 15);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer4, null);
                    gapComposer4.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer2;
                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean z2 = transferOptionPickerViewModel.continueEnabled;
                    boolean changed2 = gapComposer5.changed(function12);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue2 == obj6) {
                        rememberedValue2 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(18, function12);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth3, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(1297080203, new FormView$$ExternalSyntheticLambda0(transferOptionPickerViewModel, 14), gapComposer5), gapComposer5, 1573296, 40);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
