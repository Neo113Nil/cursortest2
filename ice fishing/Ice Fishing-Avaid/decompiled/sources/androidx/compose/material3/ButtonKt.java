package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.internal.AnimatedShapeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001c\u001a\u008f\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001c\u001a\u008f\u0001\u0010\u001e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001c\u001a\u008f\u0001\u0010\u001f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001c\u001a\u008f\u0001\u0010 \u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010 \u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001c\u001a+\u0010)\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0003¢\u0006\u0002\u0010.\"\u001e\u0010!\u001a\u00020\u0007*\u00020\u001b8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u001e\u0010&\u001a\u00020\u0007*\u00020\u001b8@X\u0080\u0004¢\u0006\f\u0012\u0004\b'\u0010#\u001a\u0004\b(\u0010%¨\u0006/²\u0006\n\u0010*\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "shapes", "Landroidx/compose/material3/ButtonShapes;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ButtonShapes;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedButton", "FilledTonalButton", "OutlinedButton", "TextButton", "hasRoundedCornerShapes", "getHasRoundedCornerShapes$annotations", "(Landroidx/compose/material3/ButtonShapes;)V", "getHasRoundedCornerShapes", "(Landroidx/compose/material3/ButtonShapes;)Z", "hasCornerBasedShapes", "getHasCornerBasedShapes$annotations", "getHasCornerBasedShapes", "shapeByInteraction", "pressed", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "(Landroidx/compose/material3/ButtonShapes;ZLandroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$3(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        Button((Function0<Unit>) function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$8(Function0 function0, ButtonShapes buttonShapes, Modifier modifier, boolean z, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        Button((Function0<Unit>) function0, buttonShapes, modifier, z, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedButton$lambda$0(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        ElevatedButton((Function0<Unit>) function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedButton$lambda$1(Function0 function0, ButtonShapes buttonShapes, Modifier modifier, boolean z, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        ElevatedButton((Function0<Unit>) function0, buttonShapes, modifier, z, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalButton$lambda$0(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        FilledTonalButton((Function0<Unit>) function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalButton$lambda$1(Function0 function0, ButtonShapes buttonShapes, Modifier modifier, boolean z, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        FilledTonalButton((Function0<Unit>) function0, buttonShapes, modifier, z, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedButton$lambda$0(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        OutlinedButton((Function0<Unit>) function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedButton$lambda$1(Function0 function0, ButtonShapes buttonShapes, Modifier modifier, boolean z, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        OutlinedButton((Function0<Unit>) function0, buttonShapes, modifier, z, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextButton$lambda$0(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        TextButton((Function0<Unit>) function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextButton$lambda$1(Function0 function0, ButtonShapes buttonShapes, Modifier modifier, boolean z, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        TextButton((Function0<Unit>) function0, buttonShapes, modifier, z, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getHasCornerBasedShapes$annotations(ButtonShapes buttonShapes) {
    }

    public static /* synthetic */ void getHasRoundedCornerShapes$annotations(ButtonShapes buttonShapes) {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        int i9;
        final Modifier modifier2;
        final boolean z3;
        final Shape shape3;
        Composer composer2;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        Modifier modifier3;
        int i10;
        final PaddingValues contentPadding;
        BorderStroke borderStroke4;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        int i11;
        Shape shape5;
        int i12;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        State<Dp> shadowElevation$material3;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1310015664);
        ComposerKt.sourceInformation(startRestartGroup, "C(Button)N(onClick,modifier,enabled,shape,colors,elevation,border,contentPadding,interactionSource,content)158@7913L22,166@8177L590,156@7839L928:Button.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i15 = 2048;
                            i3 |= i15;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i15 = 1024;
                    i3 |= i15;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i14 = 16384;
                            i3 |= i14;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i14 = 8192;
                    i3 |= i14;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i13 = 131072;
                            i3 |= i13;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i13 = 65536;
                    i3 |= i13;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        i7 = i16;
                    } else {
                        i7 = i16;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "143@7169L5,144@7218L14,145@7283L17");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                i11 = i3;
                                shape5 = shape2;
                                borderStroke4 = borderStroke2;
                                modifier4 = modifier;
                                contentPadding = paddingValues;
                                z4 = z2;
                                i12 = -1310015664;
                            } else {
                                Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z5 = i4 != 0 ? true : z2;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape4 = ButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    buttonColors4 = ButtonDefaults.INSTANCE.buttonColors(startRestartGroup, 6);
                                } else {
                                    buttonColors4 = buttonColors2;
                                }
                                int i17 = i3;
                                if ((i2 & 32) != 0) {
                                    modifier3 = companion;
                                    buttonElevation2 = ButtonDefaults.INSTANCE.m2590buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i10 = i17 & (-458753);
                                } else {
                                    modifier3 = companion;
                                    i10 = i17;
                                }
                                if (i5 != 0) {
                                    borderStroke2 = null;
                                }
                                contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                boolean z6 = z5;
                                borderStroke4 = borderStroke2;
                                z4 = z6;
                                if (i9 != 0) {
                                    i11 = i10;
                                    buttonColors2 = buttonColors4;
                                    shape5 = shape4;
                                    mutableInteractionSource3 = null;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    i11 = i10;
                                    buttonColors2 = buttonColors4;
                                    shape5 = shape4;
                                }
                                i12 = -1310015664;
                                modifier4 = modifier3;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i12, i11, -1, "androidx.compose.material3.Button (Button.kt:150)");
                            }
                            if (mutableInteractionSource3 == null) {
                                startRestartGroup.startReplaceGroup(1691726283);
                                ComposerKt.sourceInformation(startRestartGroup, "152@7591L39");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -499617513, "CC(remember):Button.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                            } else {
                                startRestartGroup.startReplaceGroup(-499618164);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            long m2568containerColorvNxB06k$material3 = buttonColors2.m2568containerColorvNxB06k$material3(z4);
                            Modifier modifier5 = modifier4;
                            final long m2569contentColorvNxB06k$material3 = buttonColors2.m2569contentColorvNxB06k$material3(z4);
                            if (buttonElevation2 == null) {
                                startRestartGroup.startReplaceGroup(1691909926);
                                startRestartGroup.endReplaceGroup();
                                shadowElevation$material3 = null;
                            } else {
                                startRestartGroup.startReplaceGroup(-499611589);
                                ComposerKt.sourceInformation(startRestartGroup, "155@7776L43");
                                shadowElevation$material3 = buttonElevation2.shadowElevation$material3(z4, mutableInteractionSource4, startRestartGroup, ((i11 >> 6) & 14) | ((i11 >> 9) & 896));
                                startRestartGroup.endReplaceGroup();
                            }
                            float m9746unboximpl = shadowElevation$material3 != null ? shadowElevation$material3.getValue().m9746unboximpl() : Dp.m9732constructorimpl(0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -499607226, "CC(remember):Button.kt#9igjgp");
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit Button$lambda$1$0;
                                        Button$lambda$1$0 = ButtonKt.Button$lambda$1$0((SemanticsPropertyReceiver) obj);
                                        return Button$lambda$1$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                            ButtonColors buttonColors5 = buttonColors2;
                            ButtonElevation buttonElevation4 = buttonElevation2;
                            SurfaceKt.m4115Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(modifier5, false, (Function1) rememberedValue2, 1, null), z4, shape5, m2568containerColorvNxB06k$material3, m2569contentColorvNxB06k$material3, 0.0f, m9746unboximpl, borderStroke4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-535639973, true, new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit Button$lambda$2;
                                    Button$lambda$2 = ButtonKt.Button$lambda$2(m2569contentColorvNxB06k$material3, contentPadding, function3, (Composer) obj, ((Integer) obj2).intValue());
                                    return Button$lambda$2;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i11 & 8078) | (234881024 & (i11 << 6)), 6, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource2 = mutableInteractionSource5;
                            paddingValues2 = contentPadding;
                            modifier2 = modifier5;
                            composer2 = startRestartGroup;
                            z3 = z4;
                            shape3 = shape5;
                            borderStroke3 = borderStroke4;
                            buttonColors3 = buttonColors5;
                            buttonElevation3 = buttonElevation4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z3 = z2;
                            shape3 = shape2;
                            composer2 = startRestartGroup;
                            buttonColors3 = buttonColors2;
                            buttonElevation3 = buttonElevation2;
                            borderStroke3 = borderStroke2;
                            paddingValues2 = paddingValues;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit Button$lambda$3;
                                    Button$lambda$3 = ButtonKt.Button$lambda$3(Function0.this, modifier2, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return Button$lambda$3;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                borderStroke2 = borderStroke;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$2(long j, final PaddingValues paddingValues, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C169@8296L10,170@8329L432,167@8187L574:Button.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-535639973, i, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:167)");
            }
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(417635459, true, new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Button$lambda$2$0;
                    Button$lambda$2$0 = ButtonKt.Button$lambda$2$0(PaddingValues.this, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return Button$lambda$2$0;
                }
            }, composer, 54), composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$2$0(PaddingValues paddingValues, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C171@8343L408:Button.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(417635459, i, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:171)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m1255defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m2612getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM()), paddingValues);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, padding);
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
            function3.invoke(RowScopeInstance.INSTANCE, composer, 6);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final Function0<Unit> function0, final ButtonShapes buttonShapes, Modifier modifier, boolean z, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        Composer composer2;
        final BorderStroke borderStroke2;
        final Modifier modifier3;
        final boolean z3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Composer composer3;
        ButtonElevation buttonElevation4;
        PaddingValues paddingValues4;
        boolean z4;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        int i7;
        final PaddingValues paddingValues5;
        MutableInteractionSource mutableInteractionSource4;
        State<Boolean> state;
        State<Dp> shadowElevation$material3;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-311513973);
        ComposerKt.sourceInformation(startRestartGroup, "C(Button)N(onClick,shapes,modifier,enabled,colors,elevation,border,contentPadding,interactionSource,content)253@12638L14,254@12690L25,258@12942L57,262@13079L22,270@13349L590,260@13005L934:Button.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(buttonShapes) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i9 = 131072;
                            i3 |= i9;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i9 = 65536;
                    i3 |= i9;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    if ((12582912 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            paddingValues2 = paddingValues;
                            if (startRestartGroup.changed(paddingValues2)) {
                                i8 = 8388608;
                                i3 |= i8;
                            }
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        i8 = 4194304;
                        i3 |= i8;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "241@11944L14,242@12009L17");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                buttonColors2 = ButtonDefaults.INSTANCE.buttonColors(startRestartGroup, 6);
                            }
                            if ((i2 & 32) != 0) {
                                buttonElevation4 = ButtonDefaults.INSTANCE.m2590buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                composer3 = startRestartGroup;
                                i3 &= -458753;
                            } else {
                                composer3 = startRestartGroup;
                                buttonElevation4 = buttonElevation2;
                            }
                            BorderStroke borderStroke4 = i5 != 0 ? null : borderStroke;
                            if ((i2 & 128) != 0) {
                                paddingValues4 = ButtonDefaults.m2575contentPaddingFor8Feqmps$default(ButtonDefaults.INSTANCE, ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), false, false, 6, null);
                                i3 &= -29360129;
                            } else {
                                paddingValues4 = paddingValues;
                            }
                            z4 = z2;
                            borderStroke3 = borderStroke4;
                            mutableInteractionSource3 = i6 != 0 ? null : mutableInteractionSource;
                            i7 = i3;
                            paddingValues5 = paddingValues4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            borderStroke3 = borderStroke;
                            composer3 = startRestartGroup;
                            buttonElevation4 = buttonElevation2;
                            i7 = i3;
                            paddingValues5 = paddingValues2;
                            z4 = z2;
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-311513973, i7, -1, "androidx.compose.material3.Button (Button.kt:247)");
                        }
                        if (mutableInteractionSource3 == null) {
                            composer3.startReplaceGroup(1112124656);
                            ComposerKt.sourceInformation(composer3, "249@12346L39");
                            ComposerKt.sourceInformationMarkerStart(composer3, 1282800978, "CC(remember):Button.kt#9igjgp");
                            Object rememberedValue = composer3.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceGroup();
                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                        } else {
                            composer3.startReplaceGroup(1282800327);
                            composer3.endReplaceGroup();
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer3, 6);
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                        State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource5, composer3, 0);
                        long m2568containerColorvNxB06k$material3 = buttonColors2.m2568containerColorvNxB06k$material3(z4);
                        final long m2569contentColorvNxB06k$material3 = buttonColors2.m2569contentColorvNxB06k$material3(z4);
                        if (buttonElevation4 == null) {
                            composer3.startReplaceGroup(1112635659);
                            composer3.endReplaceGroup();
                            state = collectIsPressedAsState;
                            shadowElevation$material3 = null;
                        } else {
                            state = collectIsPressedAsState;
                            composer3.startReplaceGroup(1282817462);
                            ComposerKt.sourceInformation(composer3, "257@12861L43");
                            shadowElevation$material3 = buttonElevation4.shadowElevation$material3(z4, mutableInteractionSource5, composer3, (i7 >> 9) & 910);
                            composer3.endReplaceGroup();
                        }
                        float m9746unboximpl = shadowElevation$material3 != null ? shadowElevation$material3.getValue().m9746unboximpl() : Dp.m9732constructorimpl(0);
                        boolean Button$lambda$5 = Button$lambda$5(state);
                        int i12 = i7 >> 3;
                        ButtonElevation buttonElevation5 = buttonElevation4;
                        Shape shapeByInteraction = shapeByInteraction(buttonShapes, Button$lambda$5, value, composer3, i12 & 14);
                        ComposerKt.sourceInformationMarkerStart(composer3, 1282824417, "CC(remember):Button.kt#9igjgp");
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit Button$lambda$6$0;
                                    Button$lambda$6$0 = ButtonKt.Button$lambda$6$0((SemanticsPropertyReceiver) obj);
                                    return Button$lambda$6$0;
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Composer composer4 = composer3;
                        SurfaceKt.m4115Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue2, 1, null), z4, shapeByInteraction, m2568containerColorvNxB06k$material3, m2569contentColorvNxB06k$material3, 0.0f, m9746unboximpl, borderStroke3, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(1669820704, true, new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Button$lambda$7;
                                Button$lambda$7 = ButtonKt.Button$lambda$7(m2569contentColorvNxB06k$material3, paddingValues5, function3, (Composer) obj, ((Integer) obj2).intValue());
                                return Button$lambda$7;
                            }
                        }, composer3, 54), composer4, (i7 & 14) | (i12 & 896) | (234881024 & (i7 << 6)), 6, 64);
                        composer2 = composer4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        buttonColors3 = buttonColors2;
                        borderStroke2 = borderStroke3;
                        buttonElevation3 = buttonElevation5;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        paddingValues3 = paddingValues5;
                        z3 = z4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        borderStroke2 = borderStroke;
                        modifier3 = modifier2;
                        z3 = z2;
                        buttonColors3 = buttonColors2;
                        buttonElevation3 = buttonElevation2;
                        paddingValues3 = paddingValues;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Button$lambda$8;
                                Button$lambda$8 = ButtonKt.Button$lambda$8(Function0.this, buttonShapes, modifier3, z3, buttonColors3, buttonElevation3, borderStroke2, paddingValues3, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return Button$lambda$8;
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((12582912 & i) != 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((12582912 & i) != 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$6$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$7(long j, final PaddingValues paddingValues, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C273@13468L10,274@13501L432,271@13359L574:Button.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1669820704, i, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:271)");
            }
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(-2115100680, true, new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Button$lambda$7$0;
                    Button$lambda$7$0 = ButtonKt.Button$lambda$7$0(PaddingValues.this, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return Button$lambda$7$0;
                }
            }, composer, 54), composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$7$0(PaddingValues paddingValues, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C275@13515L408:Button.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2115100680, i, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:275)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m1255defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m2612getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM()), paddingValues);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, padding);
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
            function3.invoke(RowScopeInstance.INSTANCE, composer, 6);
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

    /* JADX WARN: Removed duplicated region for block: B:117:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        Composer composer2;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        BorderStroke borderStroke4;
        boolean z4;
        Shape shape5;
        ButtonColors buttonColors5;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        PaddingValues paddingValues3;
        ButtonElevation buttonElevation4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1943994298);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedButton)N(onClick,modifier,enabled,shape,colors,elevation,border,contentPadding,interactionSource,content)348@17272L315:Button.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = 2048;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = 1024;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "340@16903L13,341@16960L22,342@17033L25");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                                z4 = z2;
                                shape5 = shape2;
                                buttonColors5 = buttonColors2;
                                buttonElevation4 = buttonElevation2;
                                borderStroke4 = borderStroke2;
                                i9 = -1943994298;
                                modifier4 = modifier2;
                            } else {
                                Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i4 == 0 ? z2 : true;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape4 = ButtonDefaults.INSTANCE.getElevatedShape(startRestartGroup, 6);
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    buttonColors4 = ButtonDefaults.INSTANCE.elevatedButtonColors(startRestartGroup, 6);
                                } else {
                                    buttonColors4 = buttonColors2;
                                }
                                int i14 = i3;
                                if ((i2 & 32) != 0) {
                                    buttonElevation2 = ButtonDefaults.INSTANCE.m2594elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i3 = i14 & (-458753);
                                } else {
                                    i3 = i14;
                                }
                                if (i5 != 0) {
                                    borderStroke2 = null;
                                }
                                PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                borderStroke4 = borderStroke2;
                                z4 = z5;
                                shape5 = shape4;
                                if (i8 != 0) {
                                    buttonColors5 = buttonColors4;
                                    modifier4 = companion;
                                    mutableInteractionSource3 = null;
                                } else {
                                    buttonColors5 = buttonColors4;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier4 = companion;
                                }
                                paddingValues3 = contentPadding;
                                buttonElevation4 = buttonElevation2;
                                i9 = -1943994298;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.ElevatedButton (Button.kt:348)");
                            }
                            Button(function0, modifier4, z4, shape5, buttonColors5, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, function3, startRestartGroup, i3 & 2147483646, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier3 = modifier4;
                            z3 = z4;
                            shape3 = shape5;
                            buttonColors3 = buttonColors5;
                            buttonElevation3 = buttonElevation4;
                            borderStroke3 = borderStroke4;
                            paddingValues2 = paddingValues3;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            composer2 = startRestartGroup;
                            buttonColors3 = buttonColors2;
                            buttonElevation3 = buttonElevation2;
                            borderStroke3 = borderStroke2;
                            paddingValues2 = paddingValues;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ElevatedButton$lambda$0;
                                    ElevatedButton$lambda$0 = ButtonKt.ElevatedButton$lambda$0(Function0.this, modifier3, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return ElevatedButton$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                borderStroke2 = borderStroke;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedButton(final Function0<Unit> function0, final ButtonShapes buttonShapes, Modifier modifier, boolean z, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        BorderStroke borderStroke2;
        PaddingValues paddingValues2;
        int i6;
        int i7;
        int i8;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z3;
        final ButtonColors buttonColors3;
        Composer composer2;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        ButtonColors buttonColors4;
        PaddingValues paddingValues4;
        int i10;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues5;
        int i11;
        ButtonElevation buttonElevation4;
        boolean z4;
        BorderStroke borderStroke4;
        Modifier modifier3;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(1745980117);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedButton)N(onClick,shapes,modifier,enabled,colors,elevation,border,contentPadding,interactionSource,content)425@21332L317:Button.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(buttonShapes) ? 32 : 16;
        }
        int i16 = i2 & 4;
        if (i16 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i15 = 16384;
                            i3 |= i15;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i15 = 8192;
                    i3 |= i15;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i14 = 131072;
                            i3 |= i14;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i14 = 65536;
                    i3 |= i14;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    }
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        paddingValues2 = paddingValues;
                        if (startRestartGroup.changed(paddingValues2)) {
                            i13 = 8388608;
                            i3 |= i13;
                        }
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    i13 = 4194304;
                    i3 |= i13;
                } else {
                    paddingValues2 = paddingValues;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i3 |= 100663296;
                    i7 = i16;
                } else {
                    i7 = i16;
                    if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                }
                if ((i & 805306368) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                }
                i8 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "418@20991L22,419@21064L25");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        i11 = (i2 & 16) != 0 ? i8 & (-57345) : i8;
                        if ((i2 & 32) != 0) {
                            i11 &= -458753;
                        }
                        if ((i2 & 128) != 0) {
                            i11 &= -29360129;
                        }
                        mutableInteractionSource3 = mutableInteractionSource;
                        z4 = z2;
                        buttonColors4 = buttonColors2;
                        buttonElevation4 = buttonElevation2;
                        paddingValues5 = paddingValues2;
                        borderStroke4 = borderStroke2;
                        i12 = 1745980117;
                        modifier3 = modifier2;
                    } else {
                        Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                        boolean z5 = i4 == 0 ? z2 : true;
                        if ((i2 & 16) != 0) {
                            i9 = i8 & (-57345);
                            buttonColors4 = ButtonDefaults.INSTANCE.elevatedButtonColors(startRestartGroup, 6);
                        } else {
                            i9 = i8;
                            buttonColors4 = buttonColors2;
                        }
                        if ((i2 & 32) != 0) {
                            i9 &= -458753;
                            buttonElevation2 = ButtonDefaults.INSTANCE.m2594elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if (i5 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i2 & 128) != 0) {
                            paddingValues4 = ButtonDefaults.m2575contentPaddingFor8Feqmps$default(ButtonDefaults.INSTANCE, ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), false, false, 6, null);
                            i10 = i9 & (-29360129);
                        } else {
                            paddingValues4 = paddingValues;
                            i10 = i9;
                        }
                        mutableInteractionSource3 = i6 != 0 ? null : mutableInteractionSource;
                        paddingValues5 = paddingValues4;
                        i11 = i10;
                        buttonElevation4 = buttonElevation2;
                        z4 = z5;
                        borderStroke4 = borderStroke2;
                        modifier3 = companion;
                        i12 = 1745980117;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i12, i11, -1, "androidx.compose.material3.ElevatedButton (Button.kt:425)");
                    }
                    Button(function0, buttonShapes, modifier3, z4, buttonColors4, buttonElevation4, borderStroke4, paddingValues5, mutableInteractionSource3, function3, startRestartGroup, i11 & 2147483646, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier3;
                    z3 = z4;
                    buttonColors3 = buttonColors4;
                    buttonElevation3 = buttonElevation4;
                    borderStroke3 = borderStroke4;
                    paddingValues3 = paddingValues5;
                    mutableInteractionSource2 = mutableInteractionSource3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    mutableInteractionSource2 = mutableInteractionSource;
                    z3 = z2;
                    buttonColors3 = buttonColors2;
                    composer2 = startRestartGroup;
                    buttonElevation3 = buttonElevation2;
                    borderStroke3 = borderStroke2;
                    paddingValues3 = paddingValues;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ElevatedButton$lambda$1;
                            ElevatedButton$lambda$1 = ButtonKt.ElevatedButton$lambda$1(Function0.this, buttonShapes, modifier2, z3, buttonColors3, buttonElevation3, borderStroke3, paddingValues3, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ElevatedButton$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((12582912 & i) == 0) {
            }
            i6 = i2 & 256;
            if (i6 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i6 = i2 & 256;
        if (i6 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        Composer composer2;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        BorderStroke borderStroke4;
        boolean z4;
        Shape shape5;
        ButtonColors buttonColors5;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        PaddingValues paddingValues3;
        ButtonElevation buttonElevation4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-102343472);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalButton)N(onClick,modifier,enabled,shape,colors,elevation,border,contentPadding,interactionSource,content)498@25049L315:Button.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = 2048;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = 1024;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "490@24671L16,491@24731L25,492@24807L28");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                                z4 = z2;
                                shape5 = shape2;
                                buttonColors5 = buttonColors2;
                                buttonElevation4 = buttonElevation2;
                                borderStroke4 = borderStroke2;
                                i9 = -102343472;
                                modifier4 = modifier2;
                            } else {
                                Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i4 == 0 ? z2 : true;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape4 = ButtonDefaults.INSTANCE.getFilledTonalShape(startRestartGroup, 6);
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    buttonColors4 = ButtonDefaults.INSTANCE.filledTonalButtonColors(startRestartGroup, 6);
                                } else {
                                    buttonColors4 = buttonColors2;
                                }
                                int i14 = i3;
                                if ((i2 & 32) != 0) {
                                    buttonElevation2 = ButtonDefaults.INSTANCE.m2596filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i3 = i14 & (-458753);
                                } else {
                                    i3 = i14;
                                }
                                if (i5 != 0) {
                                    borderStroke2 = null;
                                }
                                PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                borderStroke4 = borderStroke2;
                                z4 = z5;
                                shape5 = shape4;
                                if (i8 != 0) {
                                    buttonColors5 = buttonColors4;
                                    modifier4 = companion;
                                    mutableInteractionSource3 = null;
                                } else {
                                    buttonColors5 = buttonColors4;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier4 = companion;
                                }
                                paddingValues3 = contentPadding;
                                buttonElevation4 = buttonElevation2;
                                i9 = -102343472;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:498)");
                            }
                            Button(function0, modifier4, z4, shape5, buttonColors5, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, function3, startRestartGroup, i3 & 2147483646, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier3 = modifier4;
                            z3 = z4;
                            shape3 = shape5;
                            buttonColors3 = buttonColors5;
                            buttonElevation3 = buttonElevation4;
                            borderStroke3 = borderStroke4;
                            paddingValues2 = paddingValues3;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            composer2 = startRestartGroup;
                            buttonColors3 = buttonColors2;
                            buttonElevation3 = buttonElevation2;
                            borderStroke3 = borderStroke2;
                            paddingValues2 = paddingValues;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit FilledTonalButton$lambda$0;
                                    FilledTonalButton$lambda$0 = ButtonKt.FilledTonalButton$lambda$0(Function0.this, modifier3, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return FilledTonalButton$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                borderStroke2 = borderStroke;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalButton(final Function0<Unit> function0, final ButtonShapes buttonShapes, Modifier modifier, boolean z, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i5;
        BorderStroke borderStroke2;
        PaddingValues paddingValues2;
        int i6;
        int i7;
        int i8;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z3;
        final ButtonColors buttonColors3;
        Composer composer2;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        ButtonColors buttonColors4;
        PaddingValues paddingValues4;
        int i10;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues5;
        int i11;
        ButtonElevation buttonElevation4;
        boolean z4;
        BorderStroke borderStroke4;
        Modifier modifier3;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-835789045);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalButton)N(onClick,shapes,modifier,enabled,colors,elevation,border,contentPadding,interactionSource,content)576@29179L317:Button.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(buttonShapes) ? 32 : 16;
        }
        int i16 = i2 & 4;
        if (i16 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i15 = 16384;
                            i3 |= i15;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i15 = 8192;
                    i3 |= i15;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i14 = 131072;
                            i3 |= i14;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i14 = 65536;
                    i3 |= i14;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    }
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        paddingValues2 = paddingValues;
                        if (startRestartGroup.changed(paddingValues2)) {
                            i13 = 8388608;
                            i3 |= i13;
                        }
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    i13 = 4194304;
                    i3 |= i13;
                } else {
                    paddingValues2 = paddingValues;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i3 |= 100663296;
                    i7 = i16;
                } else {
                    i7 = i16;
                    if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                }
                if ((i & 805306368) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                }
                i8 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "569@28832L25,570@28908L28");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        i11 = (i2 & 16) != 0 ? i8 & (-57345) : i8;
                        if ((i2 & 32) != 0) {
                            i11 &= -458753;
                        }
                        if ((i2 & 128) != 0) {
                            i11 &= -29360129;
                        }
                        mutableInteractionSource3 = mutableInteractionSource;
                        z4 = z2;
                        buttonColors4 = buttonColors2;
                        buttonElevation4 = buttonElevation2;
                        paddingValues5 = paddingValues2;
                        borderStroke4 = borderStroke2;
                        i12 = -835789045;
                        modifier3 = modifier2;
                    } else {
                        Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                        boolean z5 = i4 == 0 ? z2 : true;
                        if ((i2 & 16) != 0) {
                            i9 = i8 & (-57345);
                            buttonColors4 = ButtonDefaults.INSTANCE.filledTonalButtonColors(startRestartGroup, 6);
                        } else {
                            i9 = i8;
                            buttonColors4 = buttonColors2;
                        }
                        if ((i2 & 32) != 0) {
                            i9 &= -458753;
                            buttonElevation2 = ButtonDefaults.INSTANCE.m2596filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if (i5 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i2 & 128) != 0) {
                            paddingValues4 = ButtonDefaults.m2575contentPaddingFor8Feqmps$default(ButtonDefaults.INSTANCE, ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), false, false, 6, null);
                            i10 = i9 & (-29360129);
                        } else {
                            paddingValues4 = paddingValues;
                            i10 = i9;
                        }
                        mutableInteractionSource3 = i6 != 0 ? null : mutableInteractionSource;
                        paddingValues5 = paddingValues4;
                        i11 = i10;
                        buttonElevation4 = buttonElevation2;
                        z4 = z5;
                        borderStroke4 = borderStroke2;
                        modifier3 = companion;
                        i12 = -835789045;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i12, i11, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:576)");
                    }
                    Button(function0, buttonShapes, modifier3, z4, buttonColors4, buttonElevation4, borderStroke4, paddingValues5, mutableInteractionSource3, function3, startRestartGroup, i11 & 2147483646, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier3;
                    z3 = z4;
                    buttonColors3 = buttonColors4;
                    buttonElevation3 = buttonElevation4;
                    borderStroke3 = borderStroke4;
                    paddingValues3 = paddingValues5;
                    mutableInteractionSource2 = mutableInteractionSource3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    mutableInteractionSource2 = mutableInteractionSource;
                    z3 = z2;
                    buttonColors3 = buttonColors2;
                    composer2 = startRestartGroup;
                    buttonElevation3 = buttonElevation2;
                    borderStroke3 = borderStroke2;
                    paddingValues3 = paddingValues;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FilledTonalButton$lambda$1;
                            FilledTonalButton$lambda$1 = ButtonKt.FilledTonalButton$lambda$1(Function0.this, buttonShapes, modifier2, z3, buttonColors3, buttonElevation3, borderStroke3, paddingValues3, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return FilledTonalButton$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((12582912 & i) == 0) {
            }
            i6 = i2 & 256;
            if (i6 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i6 = i2 & 256;
        if (i6 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        int i5;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z3;
        final Shape shape3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        ButtonColors buttonColors4;
        BorderStroke borderStroke4;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        ButtonColors buttonColors5;
        BorderStroke borderStroke5;
        Shape shape5;
        boolean z4;
        PaddingValues paddingValues3;
        ButtonElevation buttonElevation4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(399974542);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedButton)N(onClick,modifier,enabled,shape,colors,elevation,border,contentPadding,interactionSource,content)648@32788L315:Button.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = 2048;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = 1024;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    buttonElevation2 = buttonElevation;
                    i3 |= startRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            if (startRestartGroup.changed(borderStroke2)) {
                                i10 = 1048576;
                                i3 |= i10;
                            }
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i10 = 524288;
                        i3 |= i10;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "640@32415L13,641@32472L22,643@32579L29");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                                z4 = z2;
                                shape5 = shape2;
                                buttonColors5 = buttonColors2;
                                buttonElevation4 = buttonElevation2;
                                borderStroke5 = borderStroke2;
                                i9 = 399974542;
                                modifier3 = modifier;
                            } else {
                                Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    shape4 = ButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                                    i3 &= -7169;
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i2 & 16) != 0) {
                                    buttonColors4 = ButtonDefaults.INSTANCE.outlinedButtonColors(startRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    buttonColors4 = buttonColors2;
                                }
                                if (i5 != 0) {
                                    buttonElevation2 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    borderStroke4 = ButtonDefaults.INSTANCE.outlinedButtonBorder(z2, startRestartGroup, ((i3 >> 6) & 14) | 48, 0);
                                    i3 &= -3670017;
                                } else {
                                    borderStroke4 = borderStroke2;
                                }
                                PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i8 != 0) {
                                    modifier3 = companion;
                                    buttonColors5 = buttonColors4;
                                    borderStroke5 = borderStroke4;
                                    shape5 = shape4;
                                    z4 = z2;
                                    mutableInteractionSource3 = null;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier3 = companion;
                                    buttonColors5 = buttonColors4;
                                    borderStroke5 = borderStroke4;
                                    shape5 = shape4;
                                    z4 = z2;
                                }
                                paddingValues3 = contentPadding;
                                buttonElevation4 = buttonElevation2;
                                i9 = 399974542;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.OutlinedButton (Button.kt:648)");
                            }
                            composer2 = startRestartGroup;
                            Button(function0, modifier3, z4, shape5, buttonColors5, buttonElevation4, borderStroke5, paddingValues3, mutableInteractionSource3, function3, composer2, i3 & 2147483646, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            z3 = z4;
                            shape3 = shape5;
                            buttonColors3 = buttonColors5;
                            buttonElevation3 = buttonElevation4;
                            borderStroke3 = borderStroke5;
                            paddingValues2 = paddingValues3;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z3 = z2;
                            shape3 = shape2;
                            buttonColors3 = buttonColors2;
                            buttonElevation3 = buttonElevation2;
                            borderStroke3 = borderStroke2;
                            paddingValues2 = paddingValues;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit OutlinedButton$lambda$0;
                                    OutlinedButton$lambda$0 = ButtonKt.OutlinedButton$lambda$0(Function0.this, modifier2, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return OutlinedButton$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedButton(final Function0<Unit> function0, final ButtonShapes buttonShapes, Modifier modifier, boolean z, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        ButtonColors buttonColors2;
        int i5;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke2;
        PaddingValues paddingValues2;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i9;
        BorderStroke borderStroke4;
        PaddingValues paddingValues4;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke5;
        Modifier modifier4;
        int i10;
        boolean z4;
        ButtonColors buttonColors4;
        PaddingValues paddingValues5;
        ButtonElevation buttonElevation4;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-1064564339);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedButton)N(onClick,shapes,modifier,enabled,colors,elevation,border,contentPadding,interactionSource,content)725@36808L317:Button.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(buttonShapes) ? 32 : 16;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i14 = 16384;
                            i3 |= i14;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i14 = 8192;
                    i3 |= i14;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    buttonElevation2 = buttonElevation;
                    i3 |= startRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            if (startRestartGroup.changed(borderStroke2)) {
                                i13 = 1048576;
                                i3 |= i13;
                            }
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i13 = 524288;
                        i3 |= i13;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((12582912 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            paddingValues2 = paddingValues;
                            if (startRestartGroup.changed(paddingValues2)) {
                                i12 = 8388608;
                                i3 |= i12;
                            }
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        i12 = 4194304;
                        i3 |= i12;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i7 = i6;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        i8 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "718@36463L22,720@36570L29");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i15 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    i9 = i8 & (-57345);
                                    buttonColors2 = ButtonDefaults.INSTANCE.outlinedButtonColors(startRestartGroup, 6);
                                } else {
                                    i9 = i8;
                                }
                                if (i5 != 0) {
                                    buttonElevation2 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    borderStroke4 = ButtonDefaults.INSTANCE.outlinedButtonBorder(z2, startRestartGroup, ((i9 >> 9) & 14) | 48, 0);
                                    i9 &= -3670017;
                                } else {
                                    borderStroke4 = borderStroke2;
                                }
                                if ((i2 & 128) != 0) {
                                    paddingValues4 = ButtonDefaults.m2575contentPaddingFor8Feqmps$default(ButtonDefaults.INSTANCE, ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), false, false, 6, null);
                                    i9 = (-29360129) & i9;
                                } else {
                                    paddingValues4 = paddingValues2;
                                }
                                mutableInteractionSource3 = i7 != 0 ? null : mutableInteractionSource;
                                borderStroke5 = borderStroke4;
                                modifier4 = modifier2;
                                i10 = i9;
                                z4 = z2;
                                buttonColors4 = buttonColors2;
                                paddingValues5 = paddingValues4;
                                buttonElevation4 = buttonElevation2;
                                i11 = -1064564339;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i10 = (i2 & 16) != 0 ? i8 & (-57345) : i8;
                                if ((i2 & 64) != 0) {
                                    i10 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                z4 = z2;
                                buttonColors4 = buttonColors2;
                                buttonElevation4 = buttonElevation2;
                                borderStroke5 = borderStroke2;
                                paddingValues5 = paddingValues2;
                                i11 = -1064564339;
                                modifier4 = modifier2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i11, i10, -1, "androidx.compose.material3.OutlinedButton (Button.kt:725)");
                            }
                            composer2 = startRestartGroup;
                            Button(function0, buttonShapes, modifier4, z4, buttonColors4, buttonElevation4, borderStroke5, paddingValues5, mutableInteractionSource3, function3, composer2, i10 & 2147483646, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            buttonColors3 = buttonColors4;
                            buttonElevation3 = buttonElevation4;
                            borderStroke3 = borderStroke5;
                            paddingValues3 = paddingValues5;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            buttonColors3 = buttonColors2;
                            buttonElevation3 = buttonElevation2;
                            borderStroke3 = borderStroke2;
                            paddingValues3 = paddingValues2;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit OutlinedButton$lambda$1;
                                    OutlinedButton$lambda$1 = ButtonKt.OutlinedButton$lambda$1(Function0.this, buttonShapes, modifier3, z3, buttonColors3, buttonElevation3, borderStroke3, paddingValues3, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return OutlinedButton$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = i6;
                    if ((i & 805306368) == 0) {
                    }
                    i8 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                if ((1572864 & i) != 0) {
                }
                if ((12582912 & i) != 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i & 805306368) == 0) {
                }
                i8 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            if ((1572864 & i) != 0) {
            }
            if ((12582912 & i) != 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i & 805306368) == 0) {
            }
            i8 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i & 805306368) == 0) {
        }
        i8 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        int i5;
        ButtonElevation buttonElevation2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        BorderStroke borderStroke4;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues3;
        Modifier modifier4;
        Shape shape4;
        ButtonColors buttonColors4;
        ButtonElevation buttonElevation4;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1061374109);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextButton)N(onClick,modifier,enabled,shape,colors,elevation,border,contentPadding,interactionSource,content)798@40516L315:Button.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i13 = 2048;
                            i3 |= i13;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i13 = 1024;
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i12 = 16384;
                            i3 |= i12;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    buttonElevation2 = buttonElevation;
                    i3 |= startRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        borderStroke2 = borderStroke;
                        i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                            i9 = i2 & 256;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i10 = i9;
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                if ((i & 805306368) == 0) {
                                    i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                }
                                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "790@40181L9,791@40234L18");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 8) != 0) {
                                            i3 &= -7169;
                                        }
                                        if ((i2 & 16) != 0) {
                                            i3 &= -57345;
                                        }
                                        paddingValues3 = paddingValues;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier4 = modifier2;
                                        shape4 = shape2;
                                        buttonColors4 = buttonColors2;
                                        buttonElevation4 = buttonElevation2;
                                        borderStroke4 = borderStroke2;
                                        i11 = -1061374109;
                                        z4 = z2;
                                    } else {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        boolean z5 = i4 == 0 ? z2 : true;
                                        if ((i2 & 8) != 0) {
                                            i3 &= -7169;
                                            shape2 = ButtonDefaults.INSTANCE.getTextShape(startRestartGroup, 6);
                                        }
                                        if ((i2 & 16) != 0) {
                                            i3 &= -57345;
                                            buttonColors2 = ButtonDefaults.INSTANCE.textButtonColors(startRestartGroup, 6);
                                        }
                                        if (i5 != 0) {
                                            buttonElevation2 = null;
                                        }
                                        if (i6 != 0) {
                                            borderStroke2 = null;
                                        }
                                        PaddingValues textButtonContentPadding = i8 != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
                                        if (i10 != 0) {
                                            boolean z6 = z5;
                                            borderStroke4 = borderStroke2;
                                            z4 = z6;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            boolean z7 = z5;
                                            borderStroke4 = borderStroke2;
                                            z4 = z7;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                        }
                                        paddingValues3 = textButtonContentPadding;
                                        modifier4 = modifier2;
                                        shape4 = shape2;
                                        buttonColors4 = buttonColors2;
                                        buttonElevation4 = buttonElevation2;
                                        i11 = -1061374109;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i11, i3, -1, "androidx.compose.material3.TextButton (Button.kt:798)");
                                    }
                                    composer2 = startRestartGroup;
                                    Button(function0, modifier4, z4, shape4, buttonColors4, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, function3, composer2, i3 & 2147483646, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    z3 = z4;
                                    shape3 = shape4;
                                    buttonColors3 = buttonColors4;
                                    buttonElevation3 = buttonElevation4;
                                    borderStroke3 = borderStroke4;
                                    paddingValues2 = paddingValues3;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    z3 = z2;
                                    shape3 = shape2;
                                    buttonColors3 = buttonColors2;
                                    buttonElevation3 = buttonElevation2;
                                    borderStroke3 = borderStroke2;
                                    paddingValues2 = paddingValues;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit TextButton$lambda$0;
                                            TextButton$lambda$0 = ButtonKt.TextButton$lambda$0(Function0.this, modifier3, z3, shape3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return TextButton$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i10 = i9;
                            if ((i & 805306368) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i8 = i7;
                        i9 = i2 & 256;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        if ((i & 805306368) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextButton(final Function0<Unit> function0, final ButtonShapes buttonShapes, Modifier modifier, boolean z, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        ButtonColors buttonColors2;
        int i5;
        ButtonElevation buttonElevation2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final PaddingValues paddingValues2;
        final Modifier modifier3;
        final boolean z3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        int i11;
        PaddingValues paddingValues4;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1700001512);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextButton)N(onClick,shapes,modifier,enabled,colors,elevation,border,contentPadding,interactionSource,content)876@44592L317:Button.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(buttonShapes) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i13 = 16384;
                            i3 |= i13;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i13 = 8192;
                    i3 |= i13;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    buttonElevation2 = buttonElevation;
                    i3 |= startRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        borderStroke2 = borderStroke;
                        i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(paddingValues)) {
                                i12 = 8388608;
                                i3 |= i12;
                            }
                            i12 = 4194304;
                            i3 |= i12;
                        }
                        i7 = i2 & 256;
                        if (i7 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                            if ((i & 805306368) == 0) {
                                i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            }
                            i9 = i3;
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "869@44291L18");
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i14 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i10 = i9 & (-57345);
                                        buttonColors2 = ButtonDefaults.INSTANCE.textButtonColors(startRestartGroup, 6);
                                    } else {
                                        i10 = i9;
                                    }
                                    if (i5 != 0) {
                                        buttonElevation2 = null;
                                    }
                                    if (i6 != 0) {
                                        borderStroke2 = null;
                                    }
                                    if ((i2 & 128) != 0) {
                                        paddingValues3 = ButtonDefaults.m2575contentPaddingFor8Feqmps$default(ButtonDefaults.INSTANCE, ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), false, false, 6, null);
                                        i10 = (-29360129) & i10;
                                    } else {
                                        paddingValues3 = paddingValues;
                                    }
                                    mutableInteractionSource3 = i8 != 0 ? null : mutableInteractionSource;
                                    i11 = i10;
                                    paddingValues4 = paddingValues3;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    i11 = (i2 & 16) != 0 ? i9 & (-57345) : i9;
                                    if ((i2 & 128) != 0) {
                                        i11 &= -29360129;
                                    }
                                    paddingValues4 = paddingValues;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                boolean z4 = z2;
                                ButtonColors buttonColors4 = buttonColors2;
                                ButtonElevation buttonElevation4 = buttonElevation2;
                                BorderStroke borderStroke4 = borderStroke2;
                                Modifier modifier4 = modifier2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1700001512, i11, -1, "androidx.compose.material3.TextButton (Button.kt:876)");
                                }
                                composer2 = startRestartGroup;
                                Button(function0, buttonShapes, modifier4, z4, buttonColors4, buttonElevation4, borderStroke4, paddingValues4, mutableInteractionSource3, function3, composer2, i11 & 2147483646, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z3 = z4;
                                buttonColors3 = buttonColors4;
                                buttonElevation3 = buttonElevation4;
                                borderStroke3 = borderStroke4;
                                paddingValues2 = paddingValues4;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                paddingValues2 = paddingValues;
                                modifier3 = modifier2;
                                z3 = z2;
                                buttonColors3 = buttonColors2;
                                buttonElevation3 = buttonElevation2;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit TextButton$lambda$1;
                                        TextButton$lambda$1 = ButtonKt.TextButton$lambda$1(Function0.this, buttonShapes, modifier3, z3, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return TextButton$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 = i7;
                        if ((i & 805306368) == 0) {
                        }
                        i9 = i3;
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    if ((i & 805306368) == 0) {
                    }
                    i9 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                i9 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            i9 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        i9 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final boolean getHasRoundedCornerShapes(ButtonShapes buttonShapes) {
        return (buttonShapes.getShape() instanceof RoundedCornerShape) && (buttonShapes.getPressedShape() instanceof RoundedCornerShape);
    }

    public static final boolean getHasCornerBasedShapes(ButtonShapes buttonShapes) {
        return (buttonShapes.getShape() instanceof CornerBasedShape) && (buttonShapes.getPressedShape() instanceof CornerBasedShape);
    }

    private static final Shape shapeByInteraction(ButtonShapes buttonShapes, boolean z, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i) {
        Shape shape;
        composer.startReplaceGroup(802092292);
        ComposerKt.sourceInformation(composer, "C(shapeByInteraction)N(shapes,pressed,animationSpec):Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(802092292, i, -1, "androidx.compose.material3.shapeByInteraction (Button.kt:2039)");
        }
        if (z) {
            shape = buttonShapes.getPressedShape();
        } else {
            shape = buttonShapes.getShape();
        }
        if (getHasRoundedCornerShapes(buttonShapes)) {
            composer.startReplaceGroup(-2066263642);
            ComposerKt.sourceInformation(composer, "");
            composer.startMovableGroup(2011556533, buttonShapes);
            ComposerKt.sourceInformation(composer, "2047@92454L65");
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
            Shape rememberAnimatedShape = AnimatedShapeKt.rememberAnimatedShape((RoundedCornerShape) shape, finiteAnimationSpec, composer, (i >> 3) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return rememberAnimatedShape;
        }
        if (getHasCornerBasedShapes(buttonShapes)) {
            composer.startReplaceGroup(-2066125816);
            ComposerKt.sourceInformation(composer, "");
            composer.startMovableGroup(2011560979, buttonShapes);
            ComposerKt.sourceInformation(composer, "2049@92593L63");
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            Shape rememberAnimatedShape2 = AnimatedShapeKt.rememberAnimatedShape((CornerBasedShape) shape, finiteAnimationSpec, composer, (i >> 3) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return rememberAnimatedShape2;
        }
        composer.startReplaceGroup(-2066043170);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shape;
    }

    private static final boolean Button$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
