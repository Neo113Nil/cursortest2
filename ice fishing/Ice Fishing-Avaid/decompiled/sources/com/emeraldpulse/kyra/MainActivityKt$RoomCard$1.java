package com.emeraldpulse.kyra;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class MainActivityKt$RoomCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<RoomChecklist, Unit> $onReset;
    final /* synthetic */ Function2<RoomChecklist, Integer, Unit> $onToggle;
    final /* synthetic */ RoomChecklist $room;

    /* JADX WARN: Multi-variable type inference failed */
    MainActivityKt$RoomCard$1(RoomChecklist roomChecklist, Function1<? super RoomChecklist, Unit> function1, Function2<? super RoomChecklist, ? super Integer, Unit> function2) {
        this.$room = roomChecklist;
        this.$onReset = function1;
        this.$onToggle = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$8$lambda$5$lambda$4(Function2 function2, RoomChecklist roomChecklist, int i) {
        function2.invoke(roomChecklist, Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10$lambda$9(Function1 function1, RoomChecklist roomChecklist) {
        function1.invoke(roomChecklist);
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope Card, Composer composer, int i) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation(composer, "C528@20599L1903:MainActivity.kt#f5odrr");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-373378676, i, -1, "com.emeraldpulse.kyra.RoomCard.<anonymous> (MainActivity.kt:528)");
        }
        Modifier m1201padding3ABfNKs = PaddingKt.m1201padding3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(16));
        float f = 10;
        Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(f));
        RoomChecklist roomChecklist = this.$room;
        final Function1<RoomChecklist, Unit> function1 = this.$onReset;
        Function2<RoomChecklist, Integer, Unit> function2 = this.$onToggle;
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
        ComposerKt.sourceInformationMarkerStart(composer, 1850941865, "C529@20696L441,536@21185L17,536@21150L93,560@22374L17,560@22353L139:MainActivity.kt#f5odrr");
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
        ComposerKt.sourceInformationMarkerStart(composer, 746915591, "C530@20793L218,534@21028L95:MainActivity.kt#f5odrr");
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
        ComposerKt.sourceInformationMarkerStart(composer, -630074831, "C531@20843L77,532@20941L52:MainActivity.kt#f5odrr");
        String room = roomChecklist.getRoom();
        FontWeight black = FontWeight.INSTANCE.getBlack();
        long sp = TextUnitKt.getSp(19);
        j = MainActivityKt.Ink;
        Function2<RoomChecklist, Integer, Unit> function22 = function2;
        String str = "C101@5233L9:Row.kt#2w3rfo";
        String str2 = "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
        String str3 = "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
        String str4 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
        Object obj = null;
        TextKt.m4292TextNvy7gAk(room, null, j, null, sp, null, black, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597824, 0, 262058);
        String focus = roomChecklist.getFocus();
        j2 = MainActivityKt.MutedInk;
        TextKt.m4292TextNvy7gAk(focus, null, j2, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24960, 0, 262122);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        String str5 = roomChecklist.getCompleted() + "/" + roomChecklist.getItems().size();
        j3 = MainActivityKt.DeepEmerald;
        TextKt.m4292TextNvy7gAk(str5, null, j3, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1573248, 0, 262074);
        Composer composer2 = composer;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.startReplaceGroup(5004770);
        String str6 = "CC(remember):MainActivity.kt#9igjgp";
        ComposerKt.sourceInformation(composer2, "CC(remember):MainActivity.kt#9igjgp");
        final RoomChecklist roomChecklist2 = roomChecklist;
        boolean changedInstance = composer2.changedInstance(roomChecklist2);
        Object rememberedValue = composer2.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$RoomCard$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float progress;
                    progress = RoomChecklist.this.getProgress();
                    return Float.valueOf(progress);
                }
            };
            composer2.updateRememberedValue(rememberedValue);
        }
        composer2.endReplaceGroup();
        j4 = MainActivityKt.DeepEmerald;
        j5 = MainActivityKt.Line;
        ProgressIndicatorKt.m3762LinearProgressIndicatorGJbTh5U((Function0) rememberedValue, null, j4, j5, 0, 0.0f, null, composer2, 3456, 114);
        composer2.startReplaceGroup(59725351);
        ComposerKt.sourceInformation(composer2, "*542@21491L25,538@21315L1011");
        final int i2 = 0;
        for (Object obj2 : roomChecklist2.getItems()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RoomCheckItem roomCheckItem = (RoomCheckItem) obj2;
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8)));
            composer2.startReplaceGroup(-1746271574);
            ComposerKt.sourceInformation(composer2, str6);
            final Function2<RoomChecklist, Integer, Unit> function23 = function22;
            boolean changed = composer2.changed(function23) | composer2.changedInstance(roomChecklist2) | composer2.changed(i2);
            Object rememberedValue2 = composer2.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$RoomCard$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$11$lambda$8$lambda$5$lambda$4;
                        invoke$lambda$11$lambda$8$lambda$5$lambda$4 = MainActivityKt$RoomCard$1.invoke$lambda$11$lambda$8$lambda$5$lambda$4(Function2.this, roomChecklist2, i2);
                        return invoke$lambda$11$lambda$8$lambda$5$lambda$4;
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            composer2.endReplaceGroup();
            Modifier m399clickableoSLSa3U$default = ClickableKt.m399clickableoSLSa3U$default(clip, false, null, null, null, (Function0) rememberedValue2, 15, null);
            if (roomCheckItem.getDone()) {
                j8 = MainActivityKt.Mint;
                j6 = Color.m6785copywmQWz5c$default(j8, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                j6 = MainActivityKt.Field;
            }
            Modifier m1201padding3ABfNKs2 = PaddingKt.m1201padding3ABfNKs(BackgroundKt.m353backgroundbw27NRU$default(m399clickableoSLSa3U$default, j6, null, 2, null), Dp.m9732constructorimpl(f));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            String str7 = str4;
            ComposerKt.sourceInformationMarkerStart(composer2, 844473419, str7);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
            String str8 = str2;
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str8);
            int m4 = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m1201padding3ABfNKs2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            function22 = function23;
            String str9 = str3;
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str9);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl4 = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            String str10 = str;
            ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, str10);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 189013636, "C547@21752L424,556@22197L29,557@22247L61:MainActivity.kt#f5odrr");
            Modifier m353backgroundbw27NRU$default = BackgroundKt.m353backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1271size3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(22)), RoundedCornerShapeKt.getCircleShape()), roomCheckItem.getDone() ? MainActivityKt.DeepEmerald : Color.INSTANCE.m6823getWhite0d7_KjU(), null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str8);
            int m5 = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, m353backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str9);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl5 = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl5, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl5, Integer.valueOf(m5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1861697283, "C554@22083L71:MainActivity.kt#f5odrr");
            str = str10;
            str2 = str8;
            str4 = str7;
            str3 = str9;
            TextKt.m4292TextNvy7gAk(roomCheckItem.getDone() ? "✓" : "", null, Color.INSTANCE.m6823getWhite0d7_KjU(), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24960, 0, 262122);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m1276width3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(f)), composer, 6);
            String label = roomCheckItem.getLabel();
            j7 = MainActivityKt.Ink;
            TextKt.m4292TextNvy7gAk(label, RowScope.CC.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), j7, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 384, 0, 262136);
            composer2 = composer;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            str6 = str6;
            i2 = i3;
            roomChecklist2 = roomChecklist2;
            obj = null;
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-1633490746);
        ComposerKt.sourceInformation(composer2, str6);
        boolean changed2 = composer2.changed(function1) | composer2.changedInstance(roomChecklist2);
        Object rememberedValue3 = composer2.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$RoomCard$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$11$lambda$10$lambda$9;
                    invoke$lambda$11$lambda$10$lambda$9 = MainActivityKt$RoomCard$1.invoke$lambda$11$lambda$10$lambda$9(Function1.this, roomChecklist2);
                    return invoke$lambda$11$lambda$10$lambda$9;
                }
            };
            composer2.updateRememberedValue(rememberedValue3);
        }
        composer2.endReplaceGroup();
        ButtonKt.TextButton((Function0<Unit>) rememberedValue3, columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableSingletons$MainActivityKt.INSTANCE.getLambda$884247033$app_release(), composer2, 805306368, 508);
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
