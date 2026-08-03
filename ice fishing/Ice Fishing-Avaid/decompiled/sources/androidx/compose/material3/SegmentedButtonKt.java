package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SegmentedButton.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0013\b\u0002\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0013\b\u0002\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001c\u001a\u0091\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0013\b\u0002\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001d\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0013\b\u0002\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001e\u001aA\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020!2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0016¢\u0006\u0002\b#H\u0007¢\u0006\u0004\b$\u0010%\u001aA\u0010&\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020!2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0016¢\u0006\u0002\b#H\u0007¢\u0006\u0004\b'\u0010%\u001a;\u0010(\u001a\u00020\u00012\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u00162\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010)\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+*\u00020-H\u0003¢\u0006\u0002\u0010.\u001a\"\u0010/\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002\"\u000e\u00101\u001a\u000202X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u00103\u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u00104¨\u00065"}, d2 = {"SegmentedButton", "", "Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "shape", "Landroidx/compose/ui/graphics/Shape;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/SegmentedButtonColors;", "border", "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;", "selected", "onClick", "(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "SingleChoiceSegmentedButtonRow", "space", "Landroidx/compose/ui/unit/Dp;", "content", "Lkotlin/ExtensionFunctionType;", "SingleChoiceSegmentedButtonRow-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MultiChoiceSegmentedButtonRow", "MultiChoiceSegmentedButtonRow-uFdPcIQ", "SegmentedButtonContent", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "interactionCountAsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "interactionZIndex", "interactionCount", "CheckedZIndexFactor", "", "IconSpacing", "F", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SegmentedButtonKt {
    private static final float CheckedZIndexFactor = 5.0f;
    private static final float IconSpacing = Dp.m9732constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$1(Modifier modifier, float f, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3918MultiChoiceSegmentedButtonRowuFdPcIQ(modifier, f, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$10(MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, boolean z, Function1 function1, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, Function2 function22, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedButton(multiChoiceSegmentedButtonRowScope, z, function1, shape, modifier, z2, segmentedButtonColors, borderStroke, mutableInteractionSource, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$12(SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, boolean z, Function0 function0, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, Function2 function22, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedButton(singleChoiceSegmentedButtonRowScope, z, function0, shape, modifier, z2, segmentedButtonColors, borderStroke, mutableInteractionSource, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$3(MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, boolean z, Function1 function1, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function2, Function2 function22, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedButton(multiChoiceSegmentedButtonRowScope, z, (Function1<? super Boolean, Unit>) function1, shape, modifier, z2, segmentedButtonColors, borderStroke, paddingValues, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$8(SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, boolean z, Function0 function0, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function2, Function2 function22, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedButton(singleChoiceSegmentedButtonRowScope, z, (Function0<Unit>) function0, shape, modifier, z2, segmentedButtonColors, borderStroke, paddingValues, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButtonContent$lambda$1(Function2 function2, Function2 function22, PaddingValues paddingValues, int i, Composer composer, int i2) {
        SegmentedButtonContent(function2, function22, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$1(Modifier modifier, float f, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3919SingleChoiceSegmentedButtonRowuFdPcIQ(modifier, f, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$0(boolean z, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C140@7134L13:SegmentedButton.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1181873313, i, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:140)");
            }
            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedButton(final MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, final boolean z, final Function1<? super Boolean, Unit> function1, final Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z4;
        final SegmentedButtonColors segmentedButtonColors3;
        final BorderStroke borderStroke3;
        final Modifier modifier3;
        final PaddingValues paddingValues2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope endRestartGroup;
        SegmentedButtonColors segmentedButtonColors4;
        BorderStroke borderStroke4;
        final PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        int i13;
        final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda;
        MutableInteractionSource mutableInteractionSource4;
        Composer startRestartGroup = composer.startRestartGroup(697872538);
        ComposerKt.sourceInformation(startRestartGroup, "C(SegmentedButton)N(checked,onCheckedChange,shape,modifier,enabled,colors,border,contentPadding,interactionSource,icon,label)147@7482L25,166@8085L101,149@7513L673:SegmentedButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(multiChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        int i14 = i3 & 8;
        if (i14 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                }
            }
            if ((i & 1572864) != 0) {
                segmentedButtonColors2 = segmentedButtonColors;
                i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(segmentedButtonColors2)) ? 1048576 : 524288;
            } else {
                segmentedButtonColors2 = segmentedButtonColors;
            }
            if ((i & 12582912) != 0) {
                borderStroke2 = borderStroke;
                i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(borderStroke2)) ? 8388608 : 4194304;
            } else {
                borderStroke2 = borderStroke;
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changed(paddingValues) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
            i7 = i3 & 256;
            if (i7 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i8 = i7;
                i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                i9 = i3 & 512;
                if (i9 != 0) {
                    i11 = i2 | 6;
                    i10 = i9;
                } else if ((i2 & 6) == 0) {
                    i10 = i9;
                    i11 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
                } else {
                    i10 = i9;
                    i11 = i2;
                }
                if ((i2 & 48) == 0) {
                    i11 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
                }
                i12 = i11;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "135@6819L8,140@7108L41");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i4 &= -3670017;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -29360129;
                        }
                        mutableInteractionSource3 = mutableInteractionSource;
                        segmentedButtonColors4 = segmentedButtonColors2;
                        borderStroke4 = borderStroke2;
                        paddingValues3 = paddingValues;
                    } else {
                        Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            segmentedButtonColors2 = SegmentedButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & 64) != 0) {
                            borderStroke2 = SegmentedButtonDefaults.m3912borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColors2.m3893borderColorWaAFU9c$material3(z3, z), 0.0f, 2, null);
                            i4 &= -29360129;
                        }
                        PaddingValues contentPadding = i6 != 0 ? SegmentedButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                        MutableInteractionSource mutableInteractionSource5 = i8 != 0 ? null : mutableInteractionSource;
                        if (i10 != 0) {
                            modifier2 = companion;
                            segmentedButtonColors4 = segmentedButtonColors2;
                            borderStroke4 = borderStroke2;
                            mutableInteractionSource3 = mutableInteractionSource5;
                            i13 = i4;
                            rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1181873313, true, new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SegmentedButton$lambda$0;
                                    SegmentedButton$lambda$0 = SegmentedButtonKt.SegmentedButton$lambda$0(z, (Composer) obj, ((Integer) obj2).intValue());
                                    return SegmentedButton$lambda$0;
                                }
                            }, startRestartGroup, 54);
                            paddingValues3 = contentPadding;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(697872538, i13, i12, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                            }
                            if (mutableInteractionSource3 != null) {
                                startRestartGroup.startReplaceGroup(-1615192863);
                                ComposerKt.sourceInformation(startRestartGroup, "144@7271L39");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 640633665, "CC(remember):SegmentedButton.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                            } else {
                                startRestartGroup.startReplaceGroup(640633014);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            int i15 = i13;
                            Modifier modifier4 = modifier2;
                            int i16 = ((i15 >> 3) & 126) | ((i15 >> 6) & 7168) | (57344 & (i15 << 3)) | (1879048192 & (i15 << 6));
                            Function2<? super Composer, ? super Integer, Unit> function24 = rememberComposableLambda;
                            boolean z5 = z3;
                            SegmentedButtonColors segmentedButtonColors5 = segmentedButtonColors4;
                            PaddingValues paddingValues4 = paddingValues3;
                            composer2 = startRestartGroup;
                            SurfaceKt.m4114Surfaced85dljk(z, function1, SizeKt.m1255defaultMinSizeVpY3zN4(interactionZIndex(RowScope.CC.weight$default(multiChoiceSegmentedButtonRowScope, modifier4, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource4, startRestartGroup, 0)), ButtonDefaults.INSTANCE.m2612getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM()), z5, shape, segmentedButtonColors4.m3894containerColorWaAFU9c$material3(z3, z), segmentedButtonColors4.m3895contentColorWaAFU9c$material3(z3, z), 0.0f, 0.0f, borderStroke4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(1717860164, true, new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SegmentedButton$lambda$2;
                                    SegmentedButton$lambda$2 = SegmentedButtonKt.SegmentedButton$lambda$2(Function2.this, function22, paddingValues3, (Composer) obj, ((Integer) obj2).intValue());
                                    return SegmentedButton$lambda$2;
                                }
                            }, startRestartGroup, 54), composer2, i16, 48, 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            segmentedButtonColors3 = segmentedButtonColors5;
                            paddingValues2 = paddingValues4;
                            z4 = z5;
                            borderStroke3 = borderStroke4;
                            modifier3 = modifier4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            function23 = function24;
                        } else {
                            modifier2 = companion;
                            segmentedButtonColors4 = segmentedButtonColors2;
                            borderStroke4 = borderStroke2;
                            paddingValues3 = contentPadding;
                            mutableInteractionSource3 = mutableInteractionSource5;
                        }
                    }
                    i13 = i4;
                    rememberComposableLambda = function2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (mutableInteractionSource3 != null) {
                    }
                    int i152 = i13;
                    Modifier modifier42 = modifier2;
                    int i162 = ((i152 >> 3) & 126) | ((i152 >> 6) & 7168) | (57344 & (i152 << 3)) | (1879048192 & (i152 << 6));
                    Function2<? super Composer, ? super Integer, Unit> function242 = rememberComposableLambda;
                    boolean z52 = z3;
                    SegmentedButtonColors segmentedButtonColors52 = segmentedButtonColors4;
                    PaddingValues paddingValues42 = paddingValues3;
                    composer2 = startRestartGroup;
                    SurfaceKt.m4114Surfaced85dljk(z, function1, SizeKt.m1255defaultMinSizeVpY3zN4(interactionZIndex(RowScope.CC.weight$default(multiChoiceSegmentedButtonRowScope, modifier42, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource4, startRestartGroup, 0)), ButtonDefaults.INSTANCE.m2612getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM()), z52, shape, segmentedButtonColors4.m3894containerColorWaAFU9c$material3(z3, z), segmentedButtonColors4.m3895contentColorWaAFU9c$material3(z3, z), 0.0f, 0.0f, borderStroke4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(1717860164, true, new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SegmentedButton$lambda$2;
                            SegmentedButton$lambda$2 = SegmentedButtonKt.SegmentedButton$lambda$2(Function2.this, function22, paddingValues3, (Composer) obj, ((Integer) obj2).intValue());
                            return SegmentedButton$lambda$2;
                        }
                    }, startRestartGroup, 54), composer2, i162, 48, 384);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    segmentedButtonColors3 = segmentedButtonColors52;
                    paddingValues2 = paddingValues42;
                    z4 = z52;
                    borderStroke3 = borderStroke4;
                    modifier3 = modifier42;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    function23 = function242;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    mutableInteractionSource2 = mutableInteractionSource;
                    z4 = z3;
                    segmentedButtonColors3 = segmentedButtonColors2;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                    paddingValues2 = paddingValues;
                    function23 = function2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SegmentedButton$lambda$3;
                            SegmentedButton$lambda$3 = SegmentedButtonKt.SegmentedButton$lambda$3(MultiChoiceSegmentedButtonRowScope.this, z, function1, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, paddingValues2, mutableInteractionSource2, function23, function22, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return SegmentedButton$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            i8 = i7;
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i12 = i11;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i12 = i11;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$2(Function2 function2, Function2 function22, PaddingValues paddingValues, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C167@8095L85:SegmentedButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1717860164, i, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:167)");
            }
            SegmentedButtonContent(function2, function22, paddingValues, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$4(boolean z, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C220@10921L14:SegmentedButton.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-643804033, i, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:220)");
            }
            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedButton(final SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, final boolean z, final Function0<Unit> function0, final Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z4;
        final SegmentedButtonColors segmentedButtonColors3;
        final BorderStroke borderStroke3;
        final Modifier modifier3;
        final PaddingValues paddingValues2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope endRestartGroup;
        SegmentedButtonColors segmentedButtonColors4;
        BorderStroke borderStroke4;
        final PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda;
        int i13;
        MutableInteractionSource mutableInteractionSource4;
        Object rememberedValue;
        Composer startRestartGroup = composer.startRestartGroup(1532041126);
        ComposerKt.sourceInformation(startRestartGroup, "C(SegmentedButton)N(selected,onClick,shape,modifier,enabled,colors,border,contentPadding,interactionSource,icon,label)227@11272L25,238@11635L27,247@11917L67,229@11303L681:SegmentedButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(singleChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        int i14 = i3 & 8;
        if (i14 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                }
            }
            if ((i & 1572864) != 0) {
                segmentedButtonColors2 = segmentedButtonColors;
                i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(segmentedButtonColors2)) ? 1048576 : 524288;
            } else {
                segmentedButtonColors2 = segmentedButtonColors;
            }
            if ((i & 12582912) != 0) {
                borderStroke2 = borderStroke;
                i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(borderStroke2)) ? 8388608 : 4194304;
            } else {
                borderStroke2 = borderStroke;
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changed(paddingValues) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
            i7 = i3 & 256;
            if (i7 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i8 = i7;
                i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                i9 = i3 & 512;
                if (i9 != 0) {
                    i11 = i2 | 6;
                    i10 = i9;
                } else if ((i2 & 6) == 0) {
                    i10 = i9;
                    i11 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
                } else {
                    i10 = i9;
                    i11 = i2;
                }
                if ((i2 & 48) == 0) {
                    i11 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
                }
                i12 = i11;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "215@10605L8,220@10895L42");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i4 &= -3670017;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -29360129;
                        }
                        mutableInteractionSource3 = mutableInteractionSource;
                        segmentedButtonColors4 = segmentedButtonColors2;
                        borderStroke4 = borderStroke2;
                        paddingValues3 = paddingValues;
                    } else {
                        Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            segmentedButtonColors2 = SegmentedButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                            i4 &= -3670017;
                        }
                        if ((i3 & 64) != 0) {
                            borderStroke2 = SegmentedButtonDefaults.m3912borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColors2.m3893borderColorWaAFU9c$material3(z3, z), 0.0f, 2, null);
                            i4 &= -29360129;
                        }
                        PaddingValues contentPadding = i6 != 0 ? SegmentedButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                        MutableInteractionSource mutableInteractionSource5 = i8 != 0 ? null : mutableInteractionSource;
                        if (i10 != 0) {
                            Modifier modifier4 = companion;
                            int i15 = i4;
                            rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-643804033, true, new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SegmentedButton$lambda$4;
                                    SegmentedButton$lambda$4 = SegmentedButtonKt.SegmentedButton$lambda$4(z, (Composer) obj, ((Integer) obj2).intValue());
                                    return SegmentedButton$lambda$4;
                                }
                            }, startRestartGroup, 54);
                            segmentedButtonColors4 = segmentedButtonColors2;
                            i13 = i15;
                            modifier2 = modifier4;
                            borderStroke4 = borderStroke2;
                            paddingValues3 = contentPadding;
                            mutableInteractionSource3 = mutableInteractionSource5;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1532041126, i13, i12, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                            }
                            if (mutableInteractionSource3 != null) {
                                startRestartGroup.startReplaceGroup(-1579573323);
                                ComposerKt.sourceInformation(startRestartGroup, "224@11059L39");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -882237971, "CC(remember):SegmentedButton.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue2;
                            } else {
                                startRestartGroup.startReplaceGroup(-882238622);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            long m3894containerColorWaAFU9c$material3 = segmentedButtonColors4.m3894containerColorWaAFU9c$material3(z3, z);
                            int i16 = i13;
                            long m3895contentColorWaAFU9c$material3 = segmentedButtonColors4.m3895contentColorWaAFU9c$material3(z3, z);
                            SegmentedButtonColors segmentedButtonColors5 = segmentedButtonColors4;
                            Modifier modifier5 = modifier2;
                            Modifier m1255defaultMinSizeVpY3zN4 = SizeKt.m1255defaultMinSizeVpY3zN4(interactionZIndex(RowScope.CC.weight$default(singleChoiceSegmentedButtonRowScope, modifier5, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource4, startRestartGroup, 0)), ButtonDefaults.INSTANCE.m2612getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -882219551, "CC(remember):SegmentedButton.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit SegmentedButton$lambda$6$0;
                                        SegmentedButton$lambda$6$0 = SegmentedButtonKt.SegmentedButton$lambda$6$0((SemanticsPropertyReceiver) obj);
                                        return SegmentedButton$lambda$6$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Function2<? super Composer, ? super Integer, Unit> function24 = rememberComposableLambda;
                            boolean z5 = z3;
                            PaddingValues paddingValues4 = paddingValues3;
                            composer2 = startRestartGroup;
                            SurfaceKt.m4113Surfaced85dljk(z, function0, SemanticsModifierKt.semantics$default(m1255defaultMinSizeVpY3zN4, false, (Function1) rememberedValue, 1, null), z5, shape, m3894containerColorWaAFU9c$material3, m3895contentColorWaAFU9c$material3, 0.0f, 0.0f, borderStroke4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-1208080836, true, new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SegmentedButton$lambda$7;
                                    SegmentedButton$lambda$7 = SegmentedButtonKt.SegmentedButton$lambda$7(Function2.this, function22, paddingValues3, (Composer) obj, ((Integer) obj2).intValue());
                                    return SegmentedButton$lambda$7;
                                }
                            }, startRestartGroup, 54), composer2, ((i16 >> 3) & 126) | ((i16 >> 6) & 7168) | (57344 & (i16 << 3)) | (1879048192 & (i16 << 6)), 48, 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function23 = function24;
                            z4 = z5;
                            borderStroke3 = borderStroke4;
                            segmentedButtonColors3 = segmentedButtonColors5;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            modifier3 = modifier5;
                            paddingValues2 = paddingValues4;
                        } else {
                            modifier2 = companion;
                            segmentedButtonColors4 = segmentedButtonColors2;
                            borderStroke4 = borderStroke2;
                            paddingValues3 = contentPadding;
                            mutableInteractionSource3 = mutableInteractionSource5;
                        }
                    }
                    i13 = i4;
                    rememberComposableLambda = function2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (mutableInteractionSource3 != null) {
                    }
                    long m3894containerColorWaAFU9c$material32 = segmentedButtonColors4.m3894containerColorWaAFU9c$material3(z3, z);
                    int i162 = i13;
                    long m3895contentColorWaAFU9c$material32 = segmentedButtonColors4.m3895contentColorWaAFU9c$material3(z3, z);
                    SegmentedButtonColors segmentedButtonColors52 = segmentedButtonColors4;
                    Modifier modifier52 = modifier2;
                    Modifier m1255defaultMinSizeVpY3zN42 = SizeKt.m1255defaultMinSizeVpY3zN4(interactionZIndex(RowScope.CC.weight$default(singleChoiceSegmentedButtonRowScope, modifier52, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource4, startRestartGroup, 0)), ButtonDefaults.INSTANCE.m2612getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -882219551, "CC(remember):SegmentedButton.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Function2<? super Composer, ? super Integer, Unit> function242 = rememberComposableLambda;
                    boolean z52 = z3;
                    PaddingValues paddingValues42 = paddingValues3;
                    composer2 = startRestartGroup;
                    SurfaceKt.m4113Surfaced85dljk(z, function0, SemanticsModifierKt.semantics$default(m1255defaultMinSizeVpY3zN42, false, (Function1) rememberedValue, 1, null), z52, shape, m3894containerColorWaAFU9c$material32, m3895contentColorWaAFU9c$material32, 0.0f, 0.0f, borderStroke4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-1208080836, true, new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SegmentedButton$lambda$7;
                            SegmentedButton$lambda$7 = SegmentedButtonKt.SegmentedButton$lambda$7(Function2.this, function22, paddingValues3, (Composer) obj, ((Integer) obj2).intValue());
                            return SegmentedButton$lambda$7;
                        }
                    }, startRestartGroup, 54), composer2, ((i162 >> 3) & 126) | ((i162 >> 6) & 7168) | (57344 & (i162 << 3)) | (1879048192 & (i162 << 6)), 48, 384);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function23 = function242;
                    z4 = z52;
                    borderStroke3 = borderStroke4;
                    segmentedButtonColors3 = segmentedButtonColors52;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    modifier3 = modifier52;
                    paddingValues2 = paddingValues42;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    mutableInteractionSource2 = mutableInteractionSource;
                    z4 = z3;
                    segmentedButtonColors3 = segmentedButtonColors2;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                    paddingValues2 = paddingValues;
                    function23 = function2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SegmentedButton$lambda$8;
                            SegmentedButton$lambda$8 = SegmentedButtonKt.SegmentedButton$lambda$8(SingleChoiceSegmentedButtonRowScope.this, z, function0, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, paddingValues2, mutableInteractionSource2, function23, function22, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return SegmentedButton$lambda$8;
                        }
                    });
                    return;
                }
                return;
            }
            i8 = i7;
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i12 = i11;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i12 = i11;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$6$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8886getRadioButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$7(Function2 function2, Function2 function22, PaddingValues paddingValues, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C248@11927L51:SegmentedButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1208080836, i, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:248)");
            }
            SegmentedButtonContent(function2, function22, paddingValues, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$9(boolean z, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C264@12587L13:SegmentedButton.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1867102712, i, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:264)");
            }
            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "kept for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SegmentedButton(final MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, final boolean z, final Function1 function1, final Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, final Function2 function22, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function1 function12;
        Modifier modifier2;
        int i5;
        boolean z3;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        int i8;
        int i9;
        final Function2 function23;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier3;
        final boolean z4;
        final SegmentedButtonColors segmentedButtonColors3;
        ScopeUpdateScope endRestartGroup;
        SegmentedButtonColors segmentedButtonColors4;
        Modifier modifier4;
        int i10;
        SegmentedButtonColors segmentedButtonColors5;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(2065856961);
        ComposerKt.sourceInformation(startRestartGroup, "C(SegmentedButton)N(checked,onCheckedChange,shape,modifier,enabled,colors,border,interactionSource,icon,label)267@12647L377:SegmentedButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(multiChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function12 = function1;
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        segmentedButtonColors2 = segmentedButtonColors;
                        if (startRestartGroup.changed(segmentedButtonColors2)) {
                            i11 = 1048576;
                            i4 |= i11;
                        }
                    } else {
                        segmentedButtonColors2 = segmentedButtonColors;
                    }
                    i11 = 524288;
                    i4 |= i11;
                } else {
                    segmentedButtonColors2 = segmentedButtonColors;
                }
                if ((i & 12582912) == 0) {
                    borderStroke2 = borderStroke;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(borderStroke2)) ? 8388608 : 4194304;
                } else {
                    borderStroke2 = borderStroke;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 100663296;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(mutableInteractionSource2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changedInstance(function2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function22) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "260@12348L8,264@12561L41");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 32) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -29360129;
                            }
                            function23 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i10 = i4;
                            modifier4 = modifier2;
                            segmentedButtonColors5 = segmentedButtonColors2;
                        } else {
                            Modifier.Companion companion = i12 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                segmentedButtonColors4 = SegmentedButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                                i4 &= -3670017;
                            } else {
                                segmentedButtonColors4 = segmentedButtonColors2;
                            }
                            if ((i3 & 64) != 0) {
                                borderStroke2 = SegmentedButtonDefaults.m3912borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColors4.m3893borderColorWaAFU9c$material3(z3, z), 0.0f, 2, null);
                                i4 = (-29360129) & i4;
                            }
                            MutableInteractionSource mutableInteractionSource4 = i6 != 0 ? null : mutableInteractionSource2;
                            if (i8 != 0) {
                                mutableInteractionSource3 = mutableInteractionSource4;
                                segmentedButtonColors5 = segmentedButtonColors4;
                                function23 = ComposableLambdaKt.rememberComposableLambda(-1867102712, true, new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit SegmentedButton$lambda$9;
                                        SegmentedButton$lambda$9 = SegmentedButtonKt.SegmentedButton$lambda$9(z, (Composer) obj, ((Integer) obj2).intValue());
                                        return SegmentedButton$lambda$9;
                                    }
                                }, startRestartGroup, 54);
                                modifier4 = companion;
                                i10 = i4;
                            } else {
                                modifier4 = companion;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                i10 = i4;
                                segmentedButtonColors5 = segmentedButtonColors4;
                                function23 = function2;
                            }
                        }
                        BorderStroke borderStroke4 = borderStroke2;
                        boolean z5 = z3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2065856961, i10, i9, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        SegmentedButton(multiChoiceSegmentedButtonRowScope, z, (Function1<? super Boolean, Unit>) function12, shape, modifier4, z5, segmentedButtonColors5, borderStroke4, SegmentedButtonDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function22, startRestartGroup, ((i10 << 3) & 1879048192) | (i10 & 14) | 100663296 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10), ((i10 >> 27) & 14) | ((i9 << 3) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        borderStroke3 = borderStroke4;
                        segmentedButtonColors3 = segmentedButtonColors5;
                        z4 = z5;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function23 = function2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        z4 = z3;
                        segmentedButtonColors3 = segmentedButtonColors2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SegmentedButton$lambda$10;
                                SegmentedButton$lambda$10 = SegmentedButtonKt.SegmentedButton$lambda$10(MultiChoiceSegmentedButtonRowScope.this, z, function1, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource3, function23, function22, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return SegmentedButton$lambda$10;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButton$lambda$11(boolean z, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C294@13615L14:SegmentedButton.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(61121126, i, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:294)");
            }
            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "kept for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SegmentedButton(final SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, final boolean z, final Function0 function0, final Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, final Function2 function22, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0 function02;
        Modifier modifier2;
        int i5;
        boolean z3;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        int i8;
        int i9;
        final Function2 function23;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier3;
        final boolean z4;
        final SegmentedButtonColors segmentedButtonColors3;
        ScopeUpdateScope endRestartGroup;
        SegmentedButtonColors segmentedButtonColors4;
        Modifier modifier4;
        int i10;
        SegmentedButtonColors segmentedButtonColors5;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1723786701);
        ComposerKt.sourceInformation(startRestartGroup, "C(SegmentedButton)N(selected,onClick,shape,modifier,enabled,colors,border,interactionSource,icon,label)297@13676L363:SegmentedButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(singleChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function02 = function0;
            i4 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        segmentedButtonColors2 = segmentedButtonColors;
                        if (startRestartGroup.changed(segmentedButtonColors2)) {
                            i11 = 1048576;
                            i4 |= i11;
                        }
                    } else {
                        segmentedButtonColors2 = segmentedButtonColors;
                    }
                    i11 = 524288;
                    i4 |= i11;
                } else {
                    segmentedButtonColors2 = segmentedButtonColors;
                }
                if ((i & 12582912) == 0) {
                    borderStroke2 = borderStroke;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(borderStroke2)) ? 8388608 : 4194304;
                } else {
                    borderStroke2 = borderStroke;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 100663296;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(mutableInteractionSource2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changedInstance(function2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function22) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "290@13375L8,294@13589L42");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 32) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -29360129;
                            }
                            function23 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i10 = i4;
                            modifier4 = modifier2;
                            segmentedButtonColors5 = segmentedButtonColors2;
                        } else {
                            Modifier.Companion companion = i12 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                segmentedButtonColors4 = SegmentedButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                                i4 &= -3670017;
                            } else {
                                segmentedButtonColors4 = segmentedButtonColors2;
                            }
                            if ((i3 & 64) != 0) {
                                borderStroke2 = SegmentedButtonDefaults.m3912borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColors4.m3893borderColorWaAFU9c$material3(z3, z), 0.0f, 2, null);
                                i4 = (-29360129) & i4;
                            }
                            MutableInteractionSource mutableInteractionSource4 = i6 != 0 ? null : mutableInteractionSource2;
                            if (i8 != 0) {
                                mutableInteractionSource3 = mutableInteractionSource4;
                                segmentedButtonColors5 = segmentedButtonColors4;
                                function23 = ComposableLambdaKt.rememberComposableLambda(61121126, true, new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit SegmentedButton$lambda$11;
                                        SegmentedButton$lambda$11 = SegmentedButtonKt.SegmentedButton$lambda$11(z, (Composer) obj, ((Integer) obj2).intValue());
                                        return SegmentedButton$lambda$11;
                                    }
                                }, startRestartGroup, 54);
                                modifier4 = companion;
                                i10 = i4;
                            } else {
                                modifier4 = companion;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                i10 = i4;
                                segmentedButtonColors5 = segmentedButtonColors4;
                                function23 = function2;
                            }
                        }
                        BorderStroke borderStroke4 = borderStroke2;
                        boolean z5 = z3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1723786701, i10, i9, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        SegmentedButton(singleChoiceSegmentedButtonRowScope, z, (Function0<Unit>) function02, shape, modifier4, z5, segmentedButtonColors5, borderStroke4, SegmentedButtonDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function22, startRestartGroup, ((i10 << 3) & 1879048192) | (i10 & 14) | 100663296 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10), ((i10 >> 27) & 14) | ((i9 << 3) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        borderStroke3 = borderStroke4;
                        segmentedButtonColors3 = segmentedButtonColors5;
                        z4 = z5;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function23 = function2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        z4 = z3;
                        segmentedButtonColors3 = segmentedButtonColors2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SegmentedButton$lambda$12;
                                SegmentedButton$lambda$12 = SegmentedButtonKt.SegmentedButton$lambda$12(SingleChoiceSegmentedButtonRowScope.this, z, function0, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource3, function23, function22, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return SegmentedButton$lambda$12;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: SingleChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m3919SingleChoiceSegmentedButtonRowuFdPcIQ(Modifier modifier, float f, final Function3<? super SingleChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(2041406825);
        ComposerKt.sourceInformation(startRestartGroup, "C(SingleChoiceSegmentedButtonRow)N(modifier,space:c#ui.unit.Dp,content)332@15021L448:SegmentedButton.kt#uh7d8r");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                f = SegmentedButtonDefaults.INSTANCE.m3915getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2041406825, i3, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:331)");
            }
            Modifier width = IntrinsicKt.width(SizeKt.m1256defaultMinSizeVpY3zN4$default(SelectableGroupKt.selectableGroup(modifier), 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m5420getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(-f));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m868spacedBy0680j_4, centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, width);
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
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1183792256, "C341@15381L58,342@15454L9:SegmentedButton.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 176734527, "CC(remember):SegmentedButton.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SingleChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            function3.invoke((SingleChoiceSegmentedButtonScopeWrapper) rememberedValue, startRestartGroup, Integer.valueOf(((i3 >> 3) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$1;
                    SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$1 = SegmentedButtonKt.SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$1(Modifier.this, f2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$1;
                }
            });
        }
    }

    /* renamed from: MultiChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m3918MultiChoiceSegmentedButtonRowuFdPcIQ(Modifier modifier, float f, final Function3<? super MultiChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1844783038);
        ComposerKt.sourceInformation(startRestartGroup, "C(MultiChoiceSegmentedButtonRow)N(modifier,space:c#ui.unit.Dp,content)368@16472L412:SegmentedButton.kt#uh7d8r");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                f = SegmentedButtonDefaults.INSTANCE.m3915getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1844783038, i3, -1, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:367)");
            }
            Modifier width = IntrinsicKt.width(SizeKt.m1256defaultMinSizeVpY3zN4$default(modifier, 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m5420getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(-f));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m868spacedBy0680j_4, centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, width);
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
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 714807460, "C376@16797L57,377@16869L9:SegmentedButton.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2101268635, "CC(remember):SegmentedButton.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MultiChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            function3.invoke((MultiChoiceSegmentedButtonScopeWrapper) rememberedValue, startRestartGroup, Integer.valueOf(((i3 >> 3) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$1;
                    MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$1 = SegmentedButtonKt.MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$1(Modifier.this, f2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$1;
                }
            });
        }
    }

    private static final void SegmentedButtonContent(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1069265073);
        ComposerKt.sourceInformation(startRestartGroup, "C(SegmentedButtonContent)N(icon,content,contentPadding)387@17050L743:SegmentedButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1069265073, i2, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:386)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 314731321, "C388@17207L5,390@17351L12,391@17401L386,391@17372L415:SegmentedButton.kt#uh7d8r");
            TextStyle value = TypographyKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getLabelTextFont(), startRestartGroup, 6);
            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            TextKt.ProvideTextStyle(value, ComposableLambdaKt.rememberComposableLambda(-1372614088, true, new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SegmentedButtonContent$lambda$0$0;
                    SegmentedButtonContent$lambda$0$0 = SegmentedButtonKt.SegmentedButtonContent$lambda$0$0(Function2.this, function22, value2, (Composer) obj, ((Integer) obj2).intValue());
                    return SegmentedButtonContent$lambda$0$0;
                }
            }, startRestartGroup, 54), startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SegmentedButtonContent$lambda$1;
                    SegmentedButtonContent$lambda$1 = SegmentedButtonKt.SegmentedButtonContent$lambda$1(Function2.this, function22, paddingValues, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SegmentedButtonContent$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedButtonContent$lambda$0$0(Function2 function2, Function2 function22, FiniteAnimationSpec finiteAnimationSpec, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C392@17427L24,393@17484L98,397@17596L181:SegmentedButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1372614088, i, -1, "androidx.compose.material3.SegmentedButtonContent.<anonymous>.<anonymous> (SegmentedButton.kt:392)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composer, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -527175942, "CC(remember):SegmentedButton.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new SegmentedButtonContentMeasurePolicy(coroutineScope, finiteAnimationSpec);
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier height = IntrinsicKt.height(Modifier.INSTANCE, IntrinsicSize.Min);
            List listOf = CollectionsKt.listOf((Object[]) new Function2[]{function2, function22});
            SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy = (SegmentedButtonContentMeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerStart(composer, 1399185516, "CC(Layout)N(contents,modifier,measurePolicy)172@7174L62,169@7060L183:Layout.kt#80mrfh");
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
            ComposerKt.sourceInformationMarkerStart(composer, 292526026, "CC(remember):Layout.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(segmentedButtonContentMeasurePolicy);
                composer.updateRememberedValue(rememberedValue3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, height);
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
            Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts.invoke(composer, 0);
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

    private static final State<Integer> interactionCountAsState(InteractionSource interactionSource, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 281890131, "C(interactionCountAsState)460@19960L33,461@20019L499,461@19998L520:SegmentedButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(281890131, i, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:459)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 313479124, "CC(remember):SegmentedButton.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableIntState mutableIntState = (MutableIntState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 313481478, "CC(remember):SegmentedButton.kt#9igjgp");
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        SegmentedButtonKt$interactionCountAsState$1$1 rememberedValue2 = composer.rememberedValue();
        if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new SegmentedButtonKt$interactionCountAsState$1$1(interactionSource, mutableIntState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableIntState;
    }

    private static final Modifier interactionZIndex(Modifier modifier, final boolean z, final State<Integer> state) {
        return LayoutModifierKt.layout(modifier, new Function3() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult interactionZIndex$lambda$0;
                interactionZIndex$lambda$0 = SegmentedButtonKt.interactionZIndex$lambda$0(State.this, z, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return interactionZIndex$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult interactionZIndex$lambda$0(final State state, final boolean z, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        return MeasureScope.CC.layout$default(measureScope, mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.SegmentedButtonKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit interactionZIndex$lambda$0$0;
                interactionZIndex$lambda$0$0 = SegmentedButtonKt.interactionZIndex$lambda$0$0(State.this, z, mo8285measureBRTryo0, (Placeable.PlacementScope) obj);
                return interactionZIndex$lambda$0$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit interactionZIndex$lambda$0$0(State state, boolean z, Placeable placeable, Placeable.PlacementScope placementScope) {
        placementScope.place(placeable, 0, 0, ((Number) state.getValue()).floatValue() + (z ? CheckedZIndexFactor : 0.0f));
        return Unit.INSTANCE;
    }
}
