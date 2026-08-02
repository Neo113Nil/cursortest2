package com.squareup.cash.paychecks.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.paychecks.viewmodels.HelpSheetViewModel;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class HelpSheetViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ HelpSheetViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ HelpSheetViewKt$$ExternalSyntheticLambda0(Modifier modifier, HelpSheetViewModel helpSheetViewModel, Function1 function1) {
        this.f$0 = modifier;
        this.f$1 = helpSheetViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$0;
        Function1 function1 = this.f$2;
        HelpSheetViewModel helpSheetViewModel = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier, 1.0f), MooncakeTheme.getColors(gapComposer).elevatedBackground, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, 18.0f, 1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).header4, (TextLineBalancing) null, helpSheetViewModel.title, (Map) null, (Function1) null, false);
                    gapComposer.startReplaceGroup(-2085251034);
                    Iterator it = helpSheetViewModel.rows.iterator();
                    int i2 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (hasNext) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            HelpSheetViewModel.Row row = (HelpSheetViewModel.Row) next;
                            if (i2 > 0) {
                                gapComposer.startReplaceGroup(354178363);
                                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(354233915);
                                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
                                gapComposer.end(false);
                            }
                            HelpSheetViewKt.HelpSheetRow(i3, row, gapComposer, 0);
                            i2 = i3;
                        } else {
                            gapComposer.end(false);
                            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 32.0f));
                            KeypadKt.m3642DivideraMcp0Q(null, 0L, RecyclerView.DECELERATION_RATE, gapComposer, 0, 7);
                            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 4.0f, 1);
                            String str = helpSheetViewModel.additionalHelpButton.text;
                            MooncakePillButton.Style style = MooncakePillButton.Style.TERTIARY;
                            boolean changed = gapComposer.changed(function1);
                            Object rememberedValue = gapComposer.rememberedValue();
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            if (changed || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(0, function1);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            KeypadKt.m3640ButtonGFipHI0(str, (Function0) rememberedValue, m300paddingVpY3zN4$default2, null, null, style, null, false, 0, null, null, gapComposer, 196992, 0, 4056);
                            KeypadKt.m3642DivideraMcp0Q(null, 0L, RecyclerView.DECELERATION_RATE, gapComposer, 0, 7);
                            Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 4.0f, 1);
                            String str2 = helpSheetViewModel.dismissButton.text;
                            boolean changed2 = gapComposer.changed(function1);
                            Object rememberedValue2 = gapComposer.rememberedValue();
                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new HelpSheetViewKt$$ExternalSyntheticLambda2(24, function1);
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            KeypadKt.m3640ButtonGFipHI0(str2, (Function0) rememberedValue2, m300paddingVpY3zN4$default3, null, null, style, null, false, 0, null, null, gapComposer, 196992, 0, 4056);
                            gapComposer.end(true);
                        }
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.HelpSheetView(helpSheetViewModel, function1, modifier, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ HelpSheetViewKt$$ExternalSyntheticLambda0(HelpSheetViewModel helpSheetViewModel, Function1 function1, Modifier modifier, int i) {
        this.f$1 = helpSheetViewModel;
        this.f$2 = function1;
        this.f$0 = modifier;
    }
}
