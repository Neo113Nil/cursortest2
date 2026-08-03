package com.emeraldpulse.kyra;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ProgressIndicatorKt;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class MainActivityKt$MetricCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ float $progress;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;
    final /* synthetic */ String $value;

    MainActivityKt$MetricCard$1(String str, String str2, String str3, float f) {
        this.$title = str;
        this.$value = str2;
        this.$subtitle = str3;
        this.$progress = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$2$lambda$1$lambda$0(float f) {
        return RangesKt.coerceIn(f, 0.0f, 1.0f);
    }

    public final void invoke(ColumnScope Card, Composer composer, int i) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation(composer, "C634@26503L436:MainActivity.kt#f5odrr");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-855941036, i, -1, "com.emeraldpulse.kyra.MetricCard.<anonymous> (MainActivity.kt:634)");
        }
        Modifier m1201padding3ABfNKs = PaddingKt.m1201padding3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(16));
        Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(8));
        String str = this.$title;
        String str2 = this.$value;
        String str3 = this.$subtitle;
        final float f = this.$progress;
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
        ComposerKt.sourceInformationMarkerStart(composer, -1320522577, "C635@26599L55,636@26667L81,637@26761L50,638@26859L29,638@26824L105:MainActivity.kt#f5odrr");
        FontWeight black = FontWeight.INSTANCE.getBlack();
        j = MainActivityKt.Ink;
        TextKt.m4292TextNvy7gAk(str, null, j, null, 0L, null, black, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1573248, 0, 262074);
        FontWeight black2 = FontWeight.INSTANCE.getBlack();
        long sp = TextUnitKt.getSp(26);
        j2 = MainActivityKt.DeepEmerald;
        TextKt.m4292TextNvy7gAk(str2, null, j2, null, sp, null, black2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597824, 0, 262058);
        j3 = MainActivityKt.MutedInk;
        TextKt.m4292TextNvy7gAk(str3, null, j3, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24960, 0, 262122);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        boolean changed = composer.changed(f);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$MetricCard$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float invoke$lambda$2$lambda$1$lambda$0;
                    invoke$lambda$2$lambda$1$lambda$0 = MainActivityKt$MetricCard$1.invoke$lambda$2$lambda$1$lambda$0(f);
                    return Float.valueOf(invoke$lambda$2$lambda$1$lambda$0);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        j4 = MainActivityKt.DeepEmerald;
        j5 = MainActivityKt.Line;
        ProgressIndicatorKt.m3762LinearProgressIndicatorGJbTh5U((Function0) rememberedValue, null, j4, j5, 0, 0.0f, null, composer, 3456, 114);
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
