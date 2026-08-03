package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: ButtonGroup.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r\u001a]\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0010\u001ag\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0082@¢\u0006\u0002\u0010#\u001a:\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050(H\u0003¢\u0006\u0002\u0010)\"\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u0019\u001a\u00020\u0005*\u0004\u0018\u00010\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u000e\u0010*\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000¨\u0006,²\u0006\n\u0010-\u001a\u00020&X\u008a\u0084\u0002"}, d2 = {"ButtonGroup", "", "modifier", "Landroidx/compose/ui/Modifier;", "expandedRatio", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/material3/ButtonGroupScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "overflowIndicator", "Landroidx/compose/material3/ButtonGroupMenuState;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "buttonGroupParentData", "Landroidx/compose/material3/ButtonGroupParentData;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getButtonGroupParentData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/material3/ButtonGroupParentData;", "weight", "getWeight", "(Landroidx/compose/material3/ButtonGroupParentData;)F", "rememberOverflowState", "Landroidx/compose/material3/ButtonGroupOverflowState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonGroupOverflowState;", "waitUntil", "condition", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rememberButtonGroupScopeState", "Landroidx/compose/runtime/State;", "Landroidx/compose/material3/ButtonGroupScopeImpl;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "MAX_WAIT_TIME_MILLIS", "", "material3", "scope"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ButtonGroupKt {
    private static final long MAX_WAIT_TIME_MILLIS = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonGroup$lambda$10(Function3 function3, Modifier modifier, float f, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Function1 function1, int i, int i2, Composer composer, int i3) {
        ButtonGroup(function3, modifier, f, horizontal, vertical, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonGroup$lambda$3(Modifier modifier, float f, Arrangement.Horizontal horizontal, Function3 function3, int i, int i2, Composer composer, int i3) {
        ButtonGroup(modifier, f, horizontal, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonGroup$lambda$4(Function3 function3, Modifier modifier, float f, Arrangement.Horizontal horizontal, Function1 function1, int i, int i2, Composer composer, int i3) {
        ButtonGroup(function3, modifier, f, horizontal, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long waitUntil$lambda$0(long j) {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long waitUntil$lambda$1(long j) {
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0055  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the overload with overflowIndicator parameter. This overload will create a composable that is cut off if there are too many items to fit on the screen neatly.", replaceWith = @ReplaceWith(expression = "ButtonGroup(overflowIndicator, modifier, expandedRatio, horizontalArrangement, content)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonGroup(Modifier modifier, float f, Arrangement.Horizontal horizontal, final Function3<? super ButtonGroupScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        int i4;
        Arrangement.Horizontal horizontal2;
        Modifier.Companion companion;
        float f3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-231123238);
        ComposerKt.sourceInformation(startRestartGroup, "C(ButtonGroup)N(modifier,expandedRatio,horizontalArrangement,content)130@6486L14,131@6517L55,134@6606L216,141@6828L89:ButtonGroup.kt#uh7d8r");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                horizontal2 = horizontal;
                i3 |= startRestartGroup.changed(horizontal2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    f3 = f2;
                } else {
                    companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    f3 = i6 != 0 ? ButtonGroupDefaults.INSTANCE.getExpandedRatio() : f2;
                    if (i4 != 0) {
                        horizontal2 = ButtonGroupDefaults.INSTANCE.getHorizontalArrangement();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-231123238, i3, -1, "androidx.compose.material3.ButtonGroup (ButtonGroup.kt:128)");
                    }
                    FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1228882193, "CC(remember):ButtonGroup.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new ButtonGroupScopeImpl(value);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ButtonGroupScopeImpl buttonGroupScopeImpl = (ButtonGroupScopeImpl) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1228885202, "CC(remember):ButtonGroup.kt#9igjgp");
                    boolean z = (i3 & 896) == 256;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new NonAdaptiveButtonGroupMeasurePolicy(horizontal2, f3);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    NonAdaptiveButtonGroupMeasurePolicy nonAdaptiveButtonGroupMeasurePolicy = (NonAdaptiveButtonGroupMeasurePolicy) rememberedValue2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                    Updater.m5872setimpl(m5864constructorimpl, nonAdaptiveButtonGroupMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1007632733, "C141@6905L9:ButtonGroup.kt#uh7d8r");
                    function3.invoke(buttonGroupScopeImpl, startRestartGroup, Integer.valueOf((i3 >> 6) & 112));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    final float f4 = f3;
                    final Arrangement.Horizontal horizontal3 = horizontal2;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ButtonGroup$lambda$3;
                            ButtonGroup$lambda$3 = ButtonGroupKt.ButtonGroup$lambda$3(Modifier.this, f4, horizontal3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ButtonGroup$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            horizontal2 = horizontal;
            if ((i & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        horizontal2 = horizontal;
        if ((i & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0047  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with `verticalAlignment` parameter", replaceWith = @ReplaceWith(expression = "ButtonGroup(overflowIndicator, modifier, expandedRatio, horizontalArrangement, verticalAlignment, content)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ButtonGroup(final Function3 function3, Modifier modifier, float f, Arrangement.Horizontal horizontal, final Function1 function1, Composer composer, final int i, final int i2) {
        Function3 function32;
        int i3;
        Modifier modifier2;
        int i4;
        float f2;
        int i5;
        final Modifier modifier3;
        final float f3;
        final Arrangement.Horizontal horizontal2;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-1908613913);
        ComposerKt.sourceInformation(startRestartGroup, "C(ButtonGroup)N(overflowIndicator,modifier,expandedRatio,horizontalArrangement,content)194@9970L258:ButtonGroup.kt#uh7d8r");
        if ((i & 6) == 0) {
            function32 = function3;
            i3 = (startRestartGroup.changedInstance(function32) ? 4 : 2) | i;
        } else {
            function32 = function3;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(horizontal) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        f3 = f2;
                        horizontal2 = horizontal;
                    } else {
                        if (i7 != 0) {
                            modifier4 = Modifier.INSTANCE;
                            i6 = i5;
                        } else {
                            i6 = i5;
                            modifier4 = modifier2;
                        }
                        float expandedRatio = i4 != 0 ? ButtonGroupDefaults.INSTANCE.getExpandedRatio() : f2;
                        Arrangement.Horizontal horizontalArrangement = i6 != 0 ? ButtonGroupDefaults.INSTANCE.getHorizontalArrangement() : horizontal;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1908613913, i3, -1, "androidx.compose.material3.ButtonGroup (ButtonGroup.kt:193)");
                        }
                        ButtonGroup(function32, modifier4, expandedRatio, horizontalArrangement, Alignment.INSTANCE.getTop(), function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i3 << 3) & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        f3 = expandedRatio;
                        horizontal2 = horizontalArrangement;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ButtonGroup$lambda$4;
                                ButtonGroup$lambda$4 = ButtonGroupKt.ButtonGroup$lambda$4(Function3.this, modifier3, f3, horizontal2, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return ButtonGroup$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i & 24576) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonGroup(final Function3<? super ButtonGroupMenuState, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, float f, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, final Function1<? super ButtonGroupScope, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f2;
        int i5;
        Arrangement.Horizontal horizontal2;
        int i6;
        Alignment.Vertical vertical2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-928854167);
        ComposerKt.sourceInformation(startRestartGroup, "C(ButtonGroup)N(overflowIndicator,modifier,expandedRatio,horizontalArrangement,verticalAlignment,content)249@13268L14,251@13330L86,252@13437L35,253@13497L23,256@13554L322,268@13945L55,269@14018L583,265@13882L809:ButtonGroup.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        vertical2 = vertical;
                        i3 |= startRestartGroup.changed(vertical2) ? 16384 : 8192;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                        } else {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                f2 = ButtonGroupDefaults.INSTANCE.getExpandedRatio();
                            }
                            if (i5 != 0) {
                                horizontal2 = ButtonGroupDefaults.INSTANCE.getHorizontalArrangement();
                            }
                            if (i6 != 0) {
                                vertical2 = Alignment.INSTANCE.getTop();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-928854167, i3, -1, "androidx.compose.material3.ButtonGroup (ButtonGroup.kt:247)");
                            }
                            final State<ButtonGroupScopeImpl> rememberButtonGroupScopeState = rememberButtonGroupScopeState(function1, MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), startRestartGroup, (i3 >> 15) & 14);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 724365644, "CC(remember):ButtonGroup.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new ButtonGroupMenuState(false, 1, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final ButtonGroupMenuState buttonGroupMenuState = (ButtonGroupMenuState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final ButtonGroupOverflowState rememberOverflowState = rememberOverflowState(startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 724369675, "CC(remember):ButtonGroup.kt#9igjgp");
                            boolean changed = startRestartGroup.changed(rememberOverflowState) | ((i3 & 7168) == 2048);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new ButtonGroupMeasurePolicy(rememberOverflowState, horizontal2, vertical2, f2);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            List listOf = CollectionsKt.listOf((Object[]) new Function2[]{ComposableLambdaKt.rememberComposableLambda(1700074793, true, new Function2() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ButtonGroup$lambda$8;
                                    ButtonGroup$lambda$8 = ButtonGroupKt.ButtonGroup$lambda$8(State.this, (Composer) obj, ((Integer) obj2).intValue());
                                    return ButtonGroup$lambda$8;
                                }
                            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(431404714, true, new Function2() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ButtonGroup$lambda$9;
                                    ButtonGroup$lambda$9 = ButtonGroupKt.ButtonGroup$lambda$9(Function3.this, buttonGroupMenuState, rememberOverflowState, rememberButtonGroupScopeState, (Composer) obj, ((Integer) obj2).intValue());
                                    return ButtonGroup$lambda$9;
                                }
                            }, startRestartGroup, 54)});
                            ButtonGroupMeasurePolicy buttonGroupMeasurePolicy = (ButtonGroupMeasurePolicy) rememberedValue2;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)N(contents,modifier,measurePolicy)172@7174L62,169@7060L183:Layout.kt#80mrfh");
                            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 292526026, "CC(remember):Layout.kt#9igjgp");
                            boolean changed2 = startRestartGroup.changed(buttonGroupMeasurePolicy);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(buttonGroupMeasurePolicy);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
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
                            Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        final float f3 = f2;
                        final Arrangement.Horizontal horizontal3 = horizontal2;
                        final Alignment.Vertical vertical3 = vertical2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ButtonGroup$lambda$10;
                                    ButtonGroup$lambda$10 = ButtonGroupKt.ButtonGroup$lambda$10(Function3.this, modifier3, f3, horizontal3, vertical3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return ButtonGroup$lambda$10;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    vertical2 = vertical;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                    }
                    final float f32 = f2;
                    final Arrangement.Horizontal horizontal32 = horizontal2;
                    final Alignment.Vertical vertical32 = vertical2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                horizontal2 = horizontal;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                vertical2 = vertical;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                }
                final float f322 = f2;
                final Arrangement.Horizontal horizontal322 = horizontal2;
                final Alignment.Vertical vertical322 = vertical2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            vertical2 = vertical;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
            }
            final float f3222 = f2;
            final Arrangement.Horizontal horizontal3222 = horizontal2;
            final Alignment.Vertical vertical3222 = vertical2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        vertical2 = vertical;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
        }
        final float f32222 = f2;
        final Arrangement.Horizontal horizontal32222 = horizontal2;
        final Alignment.Vertical vertical32222 = vertical2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonGroup$lambda$8(State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C*268@13976L20:ButtonGroup.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1700074793, i, -1, "androidx.compose.material3.ButtonGroup.<anonymous> (ButtonGroup.kt:268)");
            }
            List<ButtonGroupItem> items = ButtonGroup$lambda$5(state).getItems();
            int size = items.size();
            for (int i2 = 0; i2 < size; i2++) {
                items.get(i2).ButtonGroupContent(composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonGroup$lambda$9(Function3 function3, final ButtonGroupMenuState buttonGroupMenuState, final ButtonGroupOverflowState buttonGroupOverflowState, final State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C270@14040L543:ButtonGroup.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431404714, i, -1, "androidx.compose.material3.ButtonGroup.<anonymous> (ButtonGroup.kt:270)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 649804808, "C271@14070L28,274@14244L23,275@14295L266,272@14123L438:ButtonGroup.kt#uh7d8r");
            function3.invoke(buttonGroupMenuState, composer, 0);
            boolean isExpanded = buttonGroupMenuState.isExpanded();
            ComposerKt.sourceInformationMarkerStart(composer, 1822081863, "CC(remember):ButtonGroup.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(buttonGroupMenuState);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ButtonGroup$lambda$9$0$0$0;
                        ButtonGroup$lambda$9$0$0$0 = ButtonGroupKt.ButtonGroup$lambda$9$0$0$0(ButtonGroupMenuState.this);
                        return ButtonGroup$lambda$9$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            AndroidMenu_androidKt.m2485DropdownMenuIlH_yew(isExpanded, (Function0) rememberedValue, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1656627541, true, new Function3() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit ButtonGroup$lambda$9$0$1;
                    ButtonGroup$lambda$9$0$1 = ButtonGroupKt.ButtonGroup$lambda$9$0$1(ButtonGroupOverflowState.this, buttonGroupMenuState, state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return ButtonGroup$lambda$9$0$1;
                }
            }, composer, 54), composer, 0, 48, 2044);
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonGroup$lambda$9$0$0$0(ButtonGroupMenuState buttonGroupMenuState) {
        buttonGroupMenuState.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonGroup$lambda$9$0$1(ButtonGroupOverflowState buttonGroupOverflowState, ButtonGroupMenuState buttonGroupMenuState, State state, ColumnScope columnScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C*278@14483L22:ButtonGroup.kt#uh7d8r");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1656627541, i, -1, "androidx.compose.material3.ButtonGroup.<anonymous>.<anonymous>.<anonymous> (ButtonGroup.kt:276)");
            }
            int totalItemCount = buttonGroupOverflowState.getTotalItemCount();
            for (int visibleItemCount = buttonGroupOverflowState.getVisibleItemCount(); visibleItemCount < totalItemCount; visibleItemCount++) {
                ButtonGroup$lambda$5(state).getItems().get(visibleItemCount).MenuContent(buttonGroupMenuState, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final ButtonGroupParentData getButtonGroupParentData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof ButtonGroupParentData) {
            return (ButtonGroupParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(ButtonGroupParentData buttonGroupParentData) {
        if (buttonGroupParentData != null) {
            return buttonGroupParentData.getWeight();
        }
        return 0.0f;
    }

    private static final ButtonGroupOverflowState rememberOverflowState(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1571410000, "C(rememberOverflowState)1338@56993L23,1338@56943L73:ButtonGroup.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1571410000, i, -1, "androidx.compose.material3.rememberOverflowState (ButtonGroup.kt:1337)");
        }
        Object[] objArr = new Object[0];
        Saver<OverflowStateImpl, ?> saver = OverflowStateImpl.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, -1703474425, "CC(remember):ButtonGroup.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    OverflowStateImpl rememberOverflowState$lambda$0$0;
                    rememberOverflowState$lambda$0$0 = ButtonGroupKt.rememberOverflowState$lambda$0$0();
                    return rememberOverflowState$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        OverflowStateImpl overflowStateImpl = (OverflowStateImpl) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) saver, (Function0) rememberedValue, composer, 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return overflowStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OverflowStateImpl rememberOverflowState$lambda$0$0() {
        return new OverflowStateImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0077 -> B:11:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitUntil(Function0<Boolean> function0, Continuation<? super Unit> continuation) {
        ButtonGroupKt$waitUntil$1 buttonGroupKt$waitUntil$1;
        int i;
        long longValue;
        if (continuation instanceof ButtonGroupKt$waitUntil$1) {
            buttonGroupKt$waitUntil$1 = (ButtonGroupKt$waitUntil$1) continuation;
            if ((buttonGroupKt$waitUntil$1.label & Integer.MIN_VALUE) != 0) {
                buttonGroupKt$waitUntil$1.label -= Integer.MIN_VALUE;
                Object obj = buttonGroupKt$waitUntil$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = buttonGroupKt$waitUntil$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Function1 function1 = new Function1() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            long waitUntil$lambda$0;
                            waitUntil$lambda$0 = ButtonGroupKt.waitUntil$lambda$0(((Long) obj2).longValue());
                            return Long.valueOf(waitUntil$lambda$0);
                        }
                    };
                    buttonGroupKt$waitUntil$1.L$0 = function0;
                    buttonGroupKt$waitUntil$1.label = 1;
                    obj = MonotonicFrameClockKt.withFrameMillis(function1, buttonGroupKt$waitUntil$1);
                } else if (i == 1) {
                    function0 = (Function0) buttonGroupKt$waitUntil$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    longValue = buttonGroupKt$waitUntil$1.J$0;
                    function0 = (Function0) buttonGroupKt$waitUntil$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Number) obj).longValue() - longValue > 1000) {
                        return Unit.INSTANCE;
                    }
                    if (!function0.invoke().booleanValue()) {
                        Function1 function12 = new Function1() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long waitUntil$lambda$1;
                                waitUntil$lambda$1 = ButtonGroupKt.waitUntil$lambda$1(((Long) obj2).longValue());
                                return Long.valueOf(waitUntil$lambda$1);
                            }
                        };
                        buttonGroupKt$waitUntil$1.L$0 = function0;
                        buttonGroupKt$waitUntil$1.J$0 = longValue;
                        buttonGroupKt$waitUntil$1.label = 2;
                        obj = MonotonicFrameClockKt.withFrameMillis(function12, buttonGroupKt$waitUntil$1);
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                longValue = ((Number) obj).longValue();
                if (!function0.invoke().booleanValue()) {
                }
            }
        }
        buttonGroupKt$waitUntil$1 = new ButtonGroupKt$waitUntil$1(continuation);
        Object obj2 = buttonGroupKt$waitUntil$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buttonGroupKt$waitUntil$1.label;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        if (!function0.invoke().booleanValue()) {
        }
    }

    private static final State<ButtonGroupScopeImpl> rememberButtonGroupScopeState(Function1<? super ButtonGroupScope, Unit> function1, final AnimationSpec<Float> animationSpec, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 97726316, "C(rememberButtonGroupScopeState)N(content,animationSpec)1380@58334L29,1381@58375L142:ButtonGroup.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(97726316, i, -1, "androidx.compose.material3.rememberButtonGroupScopeState (ButtonGroup.kt:1379)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        ComposerKt.sourceInformationMarkerStart(composer, -574283782, "CC(remember):ButtonGroup.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ButtonGroupScopeImpl rememberButtonGroupScopeState$lambda$0$0;
                    rememberButtonGroupScopeState$lambda$0$0 = ButtonGroupKt.rememberButtonGroupScopeState$lambda$0$0(AnimationSpec.this, rememberUpdatedState);
                    return rememberButtonGroupScopeState$lambda$0$0;
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        State<ButtonGroupScopeImpl> state = (State) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonGroupScopeImpl rememberButtonGroupScopeState$lambda$0$0(AnimationSpec animationSpec, State state) {
        ButtonGroupScopeImpl buttonGroupScopeImpl = new ButtonGroupScopeImpl(animationSpec);
        ((Function1) state.getValue()).invoke(buttonGroupScopeImpl);
        return buttonGroupScopeImpl;
    }

    private static final ButtonGroupScopeImpl ButtonGroup$lambda$5(State<ButtonGroupScopeImpl> state) {
        return state.getValue();
    }
}
