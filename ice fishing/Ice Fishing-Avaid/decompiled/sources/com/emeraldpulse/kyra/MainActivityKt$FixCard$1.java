package com.emeraldpulse.kyra;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.createyourself.policy.PolicyGateKt$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class MainActivityKt$FixCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ FixTask $fix;
    final /* synthetic */ Function1<FixTask, Unit> $onComplete;
    final /* synthetic */ Function1<FixTask, Unit> $onSnooze;

    /* JADX WARN: Multi-variable type inference failed */
    MainActivityKt$FixCard$1(FixTask fixTask, Function1<? super FixTask, Unit> function1, Function1<? super FixTask, Unit> function12) {
        this.$fix = fixTask;
        this.$onComplete = function1;
        this.$onSnooze = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$3$lambda$2(Function1 function1, FixTask fixTask) {
        function1.invoke(fixTask);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4(Function1 function1, FixTask fixTask) {
        function1.invoke(fixTask);
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope Card, Composer composer, int i) {
        long j;
        long j2;
        StringBuilder sb;
        String str;
        long j3;
        long j4;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation(composer, "C591@24164L1141:MainActivity.kt#f5odrr");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1573404548, i, -1, "com.emeraldpulse.kyra.FixCard.<anonymous> (MainActivity.kt:591)");
        }
        Modifier m1201padding3ABfNKs = PaddingKt.m1201padding3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(16));
        float f = 10;
        Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(f));
        final FixTask fixTask = this.$fix;
        final Function1<FixTask, Unit> function1 = this.$onComplete;
        final Function1<FixTask, Unit> function12 = this.$onSnooze;
        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m868spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
        int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1201padding3ABfNKs);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
        Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -910173369, "C592@24261L452,599@24726L122,600@24861L434:MainActivity.kt#f5odrr");
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
        int m2 = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m5864constructorimpl2 = Updater.m5864constructorimpl(composer);
        Updater.m5872setimpl(m5864constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 1563613176, "C593@24358L278,597@24653L46:MainActivity.kt#f5odrr");
        Modifier weight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
        int m3 = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, weight$default);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m5864constructorimpl3 = Updater.m5864constructorimpl(composer);
        Updater.m5872setimpl(m5864constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 1917787877, "C594@24408L77,595@24506L112:MainActivity.kt#f5odrr");
        String title = fixTask.getTitle();
        FontWeight black = FontWeight.INSTANCE.getBlack();
        long sp = TextUnitKt.getSp(18);
        j = MainActivityKt.Ink;
        TextKt.m4292TextNvy7gAk(title, null, j, null, sp, null, black, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597824, 0, 262058);
        String str2 = fixTask.getArea() + " • repeats every " + fixTask.getIntervalDays() + " days • " + fixTask.getEffort();
        j2 = MainActivityKt.MutedInk;
        TextKt.m4292TextNvy7gAk(str2, null, j2, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24960, 0, 262122);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        MainActivityKt.StatusChip(fixTask.getUrgency(), fixTask.getDaysUntilDue() <= 0, composer, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (fixTask.getDaysUntilDue() < 0) {
            int i2 = -fixTask.getDaysUntilDue();
            sb = new StringBuilder();
            sb.append(i2);
            str = " days overdue";
        } else {
            int daysUntilDue = fixTask.getDaysUntilDue();
            sb = new StringBuilder();
            sb.append(daysUntilDue);
            str = " days until due";
        }
        sb.append(str);
        String sb2 = sb.toString();
        j3 = MainActivityKt.Ink;
        TextKt.m4292TextNvy7gAk(sb2, null, j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 384, 0, 262138);
        Arrangement.HorizontalOrVertical m868spacedBy0680j_42 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(f));
        ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m868spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
        int m4 = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor4);
        } else {
            composer.useNode();
        }
        Composer m5864constructorimpl4 = Updater.m5864constructorimpl(composer);
        Updater.m5872setimpl(m5864constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1218708387, "C601@24998L42,601@24953L19,601@24936L195,604@25173L17,604@25148L133:MainActivity.kt#f5odrr");
        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
        j4 = MainActivityKt.DeepEmerald;
        ButtonColors m2589buttonColorsro_MJ88 = buttonDefaults.m2589buttonColorsro_MJ88(j4, 0L, 0L, 0L, composer, 6 | (ButtonDefaults.$stable << 12), 14);
        Modifier weight$default2 = RowScope.CC.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
        composer.startReplaceGroup(-1633490746);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        boolean changed = composer.changed(function1) | composer.changed(fixTask);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$FixCard$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$6$lambda$3$lambda$2;
                    invoke$lambda$7$lambda$6$lambda$3$lambda$2 = MainActivityKt$FixCard$1.invoke$lambda$7$lambda$6$lambda$3$lambda$2(Function1.this, fixTask);
                    return invoke$lambda$7$lambda$6$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0<Unit>) rememberedValue, weight$default2, false, (Shape) null, m2589buttonColorsro_MJ88, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableSingletons$MainActivityKt.INSTANCE.m10376getLambda$252865539$app_release(), composer, 805306368, 492);
        composer.startReplaceGroup(-1633490746);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        boolean changed2 = composer.changed(function12) | composer.changed(fixTask);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$FixCard$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4;
                    invoke$lambda$7$lambda$6$lambda$5$lambda$4 = MainActivityKt$FixCard$1.invoke$lambda$7$lambda$6$lambda$5$lambda$4(Function1.this, fixTask);
                    return invoke$lambda$7$lambda$6$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        ButtonKt.OutlinedButton((Function0<Unit>) rememberedValue2, RowScope.CC.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableSingletons$MainActivityKt.INSTANCE.getLambda$1824038271$app_release(), composer, 805306368, 508);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
