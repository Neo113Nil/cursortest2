package com.squareup.cash.paychecks.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaychecksReceiptViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ PaychecksReceiptViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ PaychecksReceiptViewKt$$ExternalSyntheticLambda1(Modifier modifier, PaychecksReceiptViewModel paychecksReceiptViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = modifier;
        this.f$1 = paychecksReceiptViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PaychecksReceiptViewModel.Section section;
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        PaychecksReceiptViewModel paychecksReceiptViewModel = this.f$1;
        Modifier modifier = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1438298527, new PaychecksReceiptViewKt$$ExternalSyntheticLambda1(modifier, paychecksReceiptViewModel, function1, i2), gapComposer), gapComposer, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier, 1.0f), MooncakeTheme.getColors(gapComposer2).elevatedBackground, ColorKt.RectangleShape);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    float f = 40.0f;
                    HelpSheetViewKt.PaycheckDistributionWheel(paychecksReceiptViewModel.distributionWheel, PaycheckDistributionWheel$PlacementConfig.PAYCHECK_RECEIPT, SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 40.0f, 28.0f), null, null, null, null, gapComposer2, MLKEMEngine.KyberPolyBytes, 120);
                    gapComposer2.startReplaceGroup(1067643896);
                    int i3 = 0;
                    for (Object obj3 : paychecksReceiptViewModel.lineItemSections) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        PaychecksReceiptViewModel.Section section2 = (PaychecksReceiptViewModel.Section) obj3;
                        if (i3 > 0) {
                            gapComposer2.startReplaceGroup(295636953);
                            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, f, RecyclerView.DECELERATION_RATE, 2);
                            section = section2;
                            KeypadKt.m3642DivideraMcp0Q(m300paddingVpY3zN4$default, 0L, RecyclerView.DECELERATION_RATE, gapComposer2, 6, 6);
                            gapComposer2.end(false);
                        } else {
                            section = section2;
                            gapComposer2.startReplaceGroup(295715755);
                            gapComposer2.end(false);
                        }
                        HelpSheetViewKt.PaychecksReceiptSection(section, gapComposer2, 0);
                        i3 = i4;
                        f = 40.0f;
                    }
                    gapComposer2.end(false);
                    KeypadKt.m3642DivideraMcp0Q(null, 0L, RecyclerView.DECELERATION_RATE, gapComposer2, 0, 7);
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 4.0f, 1);
                    String str = paychecksReceiptViewModel.closeText;
                    MooncakePillButton.Style style = MooncakePillButton.Style.TERTIARY;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(29, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    KeypadKt.m3640ButtonGFipHI0(str, (Function0) rememberedValue, m300paddingVpY3zN4$default2, null, null, style, null, false, 0, null, null, gapComposer2, 196992, 0, 4056);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
