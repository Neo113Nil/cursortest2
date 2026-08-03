package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/DefaultSingleRowTopAppBarOverride;", "Landroidx/compose/material3/SingleRowTopAppBarOverride;", "<init>", "()V", "SingleRowTopAppBar", "", "Landroidx/compose/material3/SingleRowTopAppBarOverrideScope;", "(Landroidx/compose/material3/SingleRowTopAppBarOverrideScope;Landroidx/compose/runtime/Composer;I)V", "material3", "targetColor", "Landroidx/compose/ui/graphics/Color;"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class DefaultSingleRowTopAppBarOverride implements SingleRowTopAppBarOverride {
    public static final int $stable = 0;
    public static final DefaultSingleRowTopAppBarOverride INSTANCE = new DefaultSingleRowTopAppBarOverride();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleRowTopAppBar$lambda$10(DefaultSingleRowTopAppBarOverride defaultSingleRowTopAppBarOverride, SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, int i, Composer composer, int i2) {
        defaultSingleRowTopAppBarOverride.SingleRowTopAppBar(singleRowTopAppBarOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SingleRowTopAppBar$lambda$9$1$0() {
        return 1.0f;
    }

    private DefaultSingleRowTopAppBarOverride() {
    }

    @Override // androidx.compose.material3.SingleRowTopAppBarOverride
    public void SingleRowTopAppBar(final SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Modifier.Companion companion;
        Modifier adjustHeightOffsetLimit;
        Composer startRestartGroup = composer.startRestartGroup(2137486921);
        ComposerKt.sourceInformation(startRestartGroup, "C(SingleRowTopAppBar)2795@134254L280,2805@134778L7,2803@134659L141,2810@134895L222,2848@136481L222,2854@136735L27,2855@136803L2,2844@136350L1773:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(singleRowTopAppBarOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2137486921, i2, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar (AppBar.kt:2785)");
            }
            if (Float.isNaN(singleRowTopAppBarOverrideScope.getExpandedHeight()) || (Float.floatToRawIntBits(singleRowTopAppBarOverrideScope.getExpandedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
            }
            Object colors = singleRowTopAppBarOverrideScope.getColors();
            Object scrollBehavior = singleRowTopAppBarOverrideScope.getScrollBehavior();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130584129, "CC(remember):AppBar.kt#9igjgp");
            boolean changed = startRestartGroup.changed(colors) | startRestartGroup.changed(scrollBehavior);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Color>() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$targetColor$2$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Color invoke() {
                        return Color.m6776boximpl(m3029invoke0d7_KjU());
                    }

                    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                    public final long m3029invoke0d7_KjU() {
                        TopAppBarState state;
                        TopAppBarScrollBehavior scrollBehavior2 = SingleRowTopAppBarOverrideScope.this.getScrollBehavior();
                        return SingleRowTopAppBarOverrideScope.this.getColors().m4556containerColorvNxB06k$material3(((scrollBehavior2 == null || (state = scrollBehavior2.getState()) == null) ? 0.0f : state.getOverlappedFraction()) > 0.01f ? 1.0f : 0.0f);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State<Color> m200animateColorAsStateeuL9pac = SingleValueAnimationKt.m200animateColorAsStateeuL9pac(SingleRowTopAppBar$lambda$2((State) rememberedValue), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1658896622, true, new Function2() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleRowTopAppBar$lambda$3;
                    SingleRowTopAppBar$lambda$3 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$3(SingleRowTopAppBarOverrideScope.this, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleRowTopAppBar$lambda$3;
                }
            }, startRestartGroup, 54);
            if (singleRowTopAppBarOverrideScope.getScrollBehavior() != null && !singleRowTopAppBarOverrideScope.getScrollBehavior().getIsPinned()) {
                startRestartGroup.startReplaceGroup(689460399);
                ComposerKt.sourceInformation(startRestartGroup, "2824@135485L107,2824@135462L130,2827@135630L312");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Orientation orientation = Orientation.Vertical;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130623348, "CC(remember):AppBar.kt#9igjgp");
                int i3 = i2 & 14;
                boolean z = i3 == 4;
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit SingleRowTopAppBar$lambda$4$0;
                            SingleRowTopAppBar$lambda$4$0 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$4$0(SingleRowTopAppBarOverrideScope.this, ((Float) obj).floatValue());
                            return SingleRowTopAppBar$lambda$4$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue2, startRestartGroup, 0);
                Modifier.Companion companion3 = companion2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130628193, "CC(remember):AppBar.kt#9igjgp");
                boolean z2 = i3 == 4;
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function3) new DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1(singleRowTopAppBarOverrideScope, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                companion = DraggableKt.draggable$default(companion3, rememberDraggableState, orientation, false, null, false, null, (Function3) rememberedValue3, false, 188, null);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(690075377);
                startRestartGroup.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier then = singleRowTopAppBarOverrideScope.getModifier().then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130655335, "CC(remember):AppBar.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m200animateColorAsStateeuL9pac);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SingleRowTopAppBar$lambda$6$0;
                        SingleRowTopAppBar$lambda$6$0 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$6$0(State.this, (DrawScope) obj);
                        return SingleRowTopAppBar$lambda$6$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier drawBehind = DrawModifierKt.drawBehind(then, (Function1) rememberedValue4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130663268, "CC(remember):AppBar.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SingleRowTopAppBar$lambda$7$0;
                        SingleRowTopAppBar$lambda$7$0 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$7$0((SemanticsPropertyReceiver) obj);
                        return SingleRowTopAppBar$lambda$7$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(drawBehind, false, (Function1) rememberedValue5, 1, null);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130665419, "CC(remember):AppBar.kt#9igjgp");
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$4$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        return Unit.INSTANCE;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(semantics$default, unit, (PointerInputEventHandler) rememberedValue6);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1199732035, "C2863@137169L45,2872@137699L6,2857@136830L1283:AppBar.kt#uh7d8r");
            adjustHeightOffsetLimit = AppBarKt.adjustHeightOffsetLimit(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, singleRowTopAppBarOverrideScope.getWindowInsets())), singleRowTopAppBarOverrideScope.getScrollBehavior());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -592880752, "CC(remember):AppBar.kt#9igjgp");
            boolean z3 = (i2 & 14) == 4;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new FloatProducer() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda4
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        float SingleRowTopAppBar$lambda$9$0$0;
                        SingleRowTopAppBar$lambda$9$0$0 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$9$0$0(SingleRowTopAppBarOverrideScope.this);
                        return SingleRowTopAppBar$lambda$9$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            FloatProducer floatProducer = (FloatProducer) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long navigationIconContentColor = singleRowTopAppBarOverrideScope.getColors().getNavigationIconContentColor();
            long titleContentColor = singleRowTopAppBarOverrideScope.getColors().getTitleContentColor();
            long actionIconContentColor = singleRowTopAppBarOverrideScope.getColors().getActionIconContentColor();
            long subtitleContentColor = singleRowTopAppBarOverrideScope.getColors().getSubtitleContentColor();
            Function2<Composer, Integer, Unit> title = singleRowTopAppBarOverrideScope.getTitle();
            TextStyle titleTextStyle = singleRowTopAppBarOverrideScope.getTitleTextStyle();
            Function2<Composer, Integer, Unit> subtitle = singleRowTopAppBarOverrideScope.getSubtitle();
            TextStyle subtitleTextStyle = singleRowTopAppBarOverrideScope.getSubtitleTextStyle();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal titleHorizontalAlignment = singleRowTopAppBarOverrideScope.getTitleHorizontalAlignment();
            Function2<Composer, Integer, Unit> navigationIcon = singleRowTopAppBarOverrideScope.getNavigationIcon();
            float expandedHeight = singleRowTopAppBarOverrideScope.getExpandedHeight();
            PaddingValues contentPadding = singleRowTopAppBarOverrideScope.getContentPadding();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -592863831, "CC(remember):AppBar.kt#9igjgp");
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function0() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float SingleRowTopAppBar$lambda$9$1$0;
                        SingleRowTopAppBar$lambda$9$1$0 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$9$1$0();
                        return Float.valueOf(SingleRowTopAppBar$lambda$9$1$0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AppBarKt.m2523TopAppBarLayout_5F1rQI(adjustHeightOffsetLimit, floatProducer, navigationIconContentColor, titleContentColor, subtitleContentColor, actionIconContentColor, title, titleTextStyle, subtitle, subtitleTextStyle, (Function0) rememberedValue8, center, titleHorizontalAlignment, 0, false, navigationIcon, rememberComposableLambda, expandedHeight, contentPadding, startRestartGroup, 0, 1600566);
            Composer composer3 = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleRowTopAppBar$lambda$10;
                    SingleRowTopAppBar$lambda$10 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$10(DefaultSingleRowTopAppBarOverride.this, singleRowTopAppBarOverrideScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleRowTopAppBar$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleRowTopAppBar$lambda$3(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2811@134913L190:AppBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1658896622, i, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar.<anonymous> (AppBar.kt:2811)");
            }
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Function3<RowScope, Composer, Integer, Unit> actions = singleRowTopAppBarOverrideScope.getActions();
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
    public static final Unit SingleRowTopAppBar$lambda$4$0(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, float f) {
        TopAppBarState state = singleRowTopAppBarOverrideScope.getScrollBehavior().getState();
        state.setHeightOffset(state.getHeightOffset() + f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleRowTopAppBar$lambda$6$0(State state, DrawScope drawScope) {
        long m6796unboximpl = ((Color) state.getValue()).m6796unboximpl();
        if (!Color.m6787equalsimpl0(m6796unboximpl, Color.INSTANCE.m6822getUnspecified0d7_KjU())) {
            DrawScope.CC.m7379drawRectnJ9OG0$default(drawScope, m6796unboximpl, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleRowTopAppBar$lambda$7$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SingleRowTopAppBar$lambda$9$0$0(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope) {
        TopAppBarState state;
        TopAppBarScrollBehavior scrollBehavior = singleRowTopAppBarOverrideScope.getScrollBehavior();
        if (scrollBehavior == null || (state = scrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.getHeightOffset();
    }

    private static final long SingleRowTopAppBar$lambda$2(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }
}
