package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/DefaultTwoRowsTopAppBarOverride;", "Landroidx/compose/material3/TwoRowsTopAppBarOverride;", "<init>", "()V", "TwoRowsTopAppBar", "", "Landroidx/compose/material3/TwoRowsTopAppBarOverrideScope;", "(Landroidx/compose/material3/TwoRowsTopAppBarOverrideScope;Landroidx/compose/runtime/Composer;I)V", "material3", "hideTopRowSemantics", ""}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class DefaultTwoRowsTopAppBarOverride implements TwoRowsTopAppBarOverride {
    public static final int $stable = 0;
    public static final DefaultTwoRowsTopAppBarOverride INSTANCE = new DefaultTwoRowsTopAppBarOverride();

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TwoRowsTopAppBar$lambda$16$0$0$0() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar$lambda$17(DefaultTwoRowsTopAppBarOverride defaultTwoRowsTopAppBarOverride, TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, int i, Composer composer, int i2) {
        defaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar(twoRowsTopAppBarOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private DefaultTwoRowsTopAppBarOverride() {
    }

    @Override // androidx.compose.material3.TwoRowsTopAppBarOverride
    public void TwoRowsTopAppBar(final TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Modifier.Companion companion;
        Modifier adjustHeightOffsetLimit;
        Composer startRestartGroup = composer.startRestartGroup(-1640665680);
        ComposerKt.sourceInformation(startRestartGroup, "C(TwoRowsTopAppBar)3025@144412L7,3032@144903L50,3033@144989L52,3037@145136L222,3044@145387L60,3045@145479L34,3049@145740L117,3080@146960L44,3081@147036L27,3082@147104L2,3076@146829L3296:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (startRestartGroup.changed(twoRowsTopAppBarOverrideScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1640665680, i2, -1, "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar (AppBar.kt:3015)");
            }
            if (Float.isNaN(twoRowsTopAppBarOverrideScope.getCollapsedHeight()) || (Float.floatToRawIntBits(twoRowsTopAppBarOverrideScope.getCollapsedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite".toString());
            }
            if (Float.isNaN(twoRowsTopAppBarOverrideScope.getExpandedHeight()) || (Float.floatToRawIntBits(twoRowsTopAppBarOverrideScope.getExpandedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
            }
            if (Dp.m9731compareTo0680j_4(twoRowsTopAppBarOverrideScope.getExpandedHeight(), twoRowsTopAppBarOverrideScope.getCollapsedHeight()) < 0) {
                throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight".toString());
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int mo522roundToPx0680j_4 = ((Density) consume).mo522roundToPx0680j_4(twoRowsTopAppBarOverrideScope.getTitleBottomPadding());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -426686686, "CC(remember):AppBar.kt#9igjgp");
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float TwoRowsTopAppBar$lambda$4$0;
                        TwoRowsTopAppBar$lambda$4$0 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$4$0(TwoRowsTopAppBarOverrideScope.this);
                        return Float.valueOf(TwoRowsTopAppBar$lambda$4$0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Function0 function0 = (Function0) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -426683932, "CC(remember):AppBar.kt#9igjgp");
            boolean changed = (i3 == 4) | startRestartGroup.changed(function0);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Color>() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarContainerColor$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Color invoke() {
                        return Color.m6776boximpl(m3034invoke0d7_KjU());
                    }

                    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                    public final long m3034invoke0d7_KjU() {
                        return TwoRowsTopAppBarOverrideScope.this.getColors().m4556containerColorvNxB06k$material3(function0.invoke().floatValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final Function0 function02 = (Function0) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1333673671, true, new Function2() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TwoRowsTopAppBar$lambda$6;
                    TwoRowsTopAppBar$lambda$6 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$6(TwoRowsTopAppBarOverrideScope.this, (Composer) obj, ((Integer) obj2).intValue());
                    return TwoRowsTopAppBar$lambda$6;
                }
            }, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -426671188, "CC(remember):AppBar.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(function0);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float TwoRowsTopAppBar$lambda$7$0;
                        TwoRowsTopAppBar$lambda$7$0 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$7$0(Function0.this);
                        return Float.valueOf(TwoRowsTopAppBar$lambda$7$0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Function0 function03 = (Function0) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -426668270, "CC(remember):AppBar.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(function0);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float TwoRowsTopAppBar$lambda$8$0;
                        TwoRowsTopAppBar$lambda$8$0 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$8$0(Function0.this);
                        return Float.valueOf(TwoRowsTopAppBar$lambda$8$0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Function0 function04 = (Function0) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -426659835, "CC(remember):AppBar.kt#9igjgp");
            boolean changed4 = startRestartGroup.changed(function0);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean TwoRowsTopAppBar$lambda$9$0;
                        TwoRowsTopAppBar$lambda$9$0 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$9$0(Function0.this);
                        return Boolean.valueOf(TwoRowsTopAppBar$lambda$9$0);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            State state = (State) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean z2 = !TwoRowsTopAppBar$lambda$10(state);
            if (twoRowsTopAppBarOverrideScope.getScrollBehavior() != null && !twoRowsTopAppBarOverrideScope.getScrollBehavior().getIsPinned()) {
                startRestartGroup.startReplaceGroup(-341139672);
                ComposerKt.sourceInformation(startRestartGroup, "3060@146283L107,3060@146260L130,3063@146428L312");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Orientation orientation = Orientation.Vertical;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -426642469, "CC(remember):AppBar.kt#9igjgp");
                boolean z3 = i3 == 4;
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function1() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit TwoRowsTopAppBar$lambda$11$0;
                            TwoRowsTopAppBar$lambda$11$0 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$11$0(TwoRowsTopAppBarOverrideScope.this, ((Float) obj).floatValue());
                            return TwoRowsTopAppBar$lambda$11$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue6, startRestartGroup, 0);
                Modifier.Companion companion3 = companion2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -426637624, "CC(remember):AppBar.kt#9igjgp");
                boolean z4 = i3 == 4;
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = (Function3) new DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1(twoRowsTopAppBarOverrideScope, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                companion = DraggableKt.draggable$default(companion3, rememberDraggableState, orientation, false, null, false, null, (Function3) rememberedValue7, false, 188, null);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-340524694);
                startRestartGroup.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier then = twoRowsTopAppBarOverrideScope.getModifier().then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -426620868, "CC(remember):AppBar.kt#9igjgp");
            boolean changed5 = startRestartGroup.changed(function02);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function1() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TwoRowsTopAppBar$lambda$13$0;
                        TwoRowsTopAppBar$lambda$13$0 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$13$0(Function0.this, (DrawScope) obj);
                        return TwoRowsTopAppBar$lambda$13$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier drawBehind = DrawModifierKt.drawBehind(then, (Function1) rememberedValue8);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -426618453, "CC(remember):AppBar.kt#9igjgp");
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new Function1() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TwoRowsTopAppBar$lambda$14$0;
                        TwoRowsTopAppBar$lambda$14$0 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$14$0((SemanticsPropertyReceiver) obj);
                        return TwoRowsTopAppBar$lambda$14$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(drawBehind, false, (Function1) rememberedValue9, 1, null);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -426616302, "CC(remember):AppBar.kt#9igjgp");
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$6$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        return Unit.INSTANCE;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(semantics$default, unit, (PointerInputEventHandler) rememberedValue10);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, pointerInput);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1325281167, "C3084@147131L2984:AppBar.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion4 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -200560210, "C3090@147450L6,3085@147156L1331,3117@149023L45,3109@148504L1597:AppBar.kt#uh7d8r");
            Modifier clipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, twoRowsTopAppBarOverrideScope.getWindowInsets()));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1379010106, "CC(remember):AppBar.kt#9igjgp");
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new FloatProducer() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda3
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        float TwoRowsTopAppBar$lambda$16$0$0$0;
                        TwoRowsTopAppBar$lambda$16$0$0$0 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$16$0$0$0();
                        return TwoRowsTopAppBar$lambda$16$0$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AppBarKt.m2523TopAppBarLayout_5F1rQI(clipToBounds, (FloatProducer) rememberedValue11, twoRowsTopAppBarOverrideScope.getColors().getNavigationIconContentColor(), twoRowsTopAppBarOverrideScope.getColors().getTitleContentColor(), twoRowsTopAppBarOverrideScope.getColors().getSubtitleContentColor(), twoRowsTopAppBarOverrideScope.getColors().getActionIconContentColor(), twoRowsTopAppBarOverrideScope.getSmallTitle(), twoRowsTopAppBarOverrideScope.getSmallTitleTextStyle(), twoRowsTopAppBarOverrideScope.getSmallSubtitle(), twoRowsTopAppBarOverrideScope.getSmallSubtitleTextStyle(), function03, Arrangement.INSTANCE.getCenter(), twoRowsTopAppBarOverrideScope.getTitleHorizontalAlignment(), 0, TwoRowsTopAppBar$lambda$10(state), twoRowsTopAppBarOverrideScope.getNavigationIcon(), rememberComposableLambda, twoRowsTopAppBarOverrideScope.getCollapsedHeight(), TopAppBarDefaults.INSTANCE.getContentPadding(), startRestartGroup, 0, 102239280);
            adjustHeightOffsetLimit = AppBarKt.adjustHeightOffsetLimit(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, WindowInsetsKt.m1300onlybOOhFvg(twoRowsTopAppBarOverrideScope.getWindowInsets(), WindowInsetsSides.INSTANCE.m1324getHorizontalJoeWqyM()))), twoRowsTopAppBarOverrideScope.getScrollBehavior());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1379060481, "CC(remember):AppBar.kt#9igjgp");
            boolean z5 = i3 == 4;
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new FloatProducer() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda4
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        float TwoRowsTopAppBar$lambda$16$0$1$0;
                        TwoRowsTopAppBar$lambda$16$0$1$0 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$16$0$1$0(TwoRowsTopAppBarOverrideScope.this);
                        return TwoRowsTopAppBar$lambda$16$0$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            AppBarKt.m2523TopAppBarLayout_5F1rQI(adjustHeightOffsetLimit, (FloatProducer) rememberedValue12, twoRowsTopAppBarOverrideScope.getColors().getNavigationIconContentColor(), twoRowsTopAppBarOverrideScope.getColors().getTitleContentColor(), twoRowsTopAppBarOverrideScope.getColors().getSubtitleContentColor(), twoRowsTopAppBarOverrideScope.getColors().getActionIconContentColor(), twoRowsTopAppBarOverrideScope.getTitle(), twoRowsTopAppBarOverrideScope.getTitleTextStyle(), twoRowsTopAppBarOverrideScope.getSubtitle(), twoRowsTopAppBarOverrideScope.getSubtitleTextStyle(), function04, Arrangement.INSTANCE.getBottom(), twoRowsTopAppBarOverrideScope.getTitleHorizontalAlignment(), mo522roundToPx0680j_4, z2, ComposableSingletons$AppBarKt.INSTANCE.m2812getLambda$2101264077$material3(), ComposableSingletons$AppBarKt.INSTANCE.getLambda$37575796$material3(), Dp.m9732constructorimpl(twoRowsTopAppBarOverrideScope.getExpandedHeight() - twoRowsTopAppBarOverrideScope.getCollapsedHeight()), TopAppBarDefaults.INSTANCE.getContentPadding(), composer2, 0, 102432816);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TwoRowsTopAppBar$lambda$17;
                    TwoRowsTopAppBar$lambda$17 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$17(DefaultTwoRowsTopAppBarOverride.this, twoRowsTopAppBarOverrideScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TwoRowsTopAppBar$lambda$17;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TwoRowsTopAppBar$lambda$4$0(TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope) {
        TopAppBarState state;
        TopAppBarScrollBehavior scrollBehavior = twoRowsTopAppBarOverrideScope.getScrollBehavior();
        if (scrollBehavior == null || (state = scrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.getCollapsedFraction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar$lambda$6(TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C3038@145154L190:AppBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1333673671, i, -1, "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar.<anonymous> (AppBar.kt:3038)");
            }
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Function3<RowScope, Composer, Integer, Unit> actions = twoRowsTopAppBarOverrideScope.getActions();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            actions.invoke(RowScopeInstance.INSTANCE, composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TwoRowsTopAppBar$lambda$7$0(Function0 function0) {
        return AppBarKt.getTopTitleAlphaEasing().transform(((Number) function0.invoke()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TwoRowsTopAppBar$lambda$8$0(Function0 function0) {
        return 1.0f - ((Number) function0.invoke()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TwoRowsTopAppBar$lambda$9$0(Function0 function0) {
        return ((Number) function0.invoke()).floatValue() < 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar$lambda$11$0(TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, float f) {
        TopAppBarState state = twoRowsTopAppBarOverrideScope.getScrollBehavior().getState();
        state.setHeightOffset(state.getHeightOffset() + f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar$lambda$13$0(Function0 function0, DrawScope drawScope) {
        DrawScope.CC.m7379drawRectnJ9OG0$default(drawScope, ((Color) function0.invoke()).m6796unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar$lambda$14$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TwoRowsTopAppBar$lambda$16$0$1$0(TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope) {
        TopAppBarState state;
        TopAppBarScrollBehavior scrollBehavior = twoRowsTopAppBarOverrideScope.getScrollBehavior();
        if (scrollBehavior == null || (state = scrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.getHeightOffset();
    }

    private static final boolean TwoRowsTopAppBar$lambda$10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
