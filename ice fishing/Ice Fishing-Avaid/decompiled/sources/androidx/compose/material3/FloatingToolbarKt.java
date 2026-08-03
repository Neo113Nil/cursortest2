package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedRange;

/* compiled from: FloatingToolbar.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÁ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aª\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b!\u0010\"\u001aÁ\u0001\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b%\u0010\u0019\u001aª\u0001\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020&2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b'\u0010\"\u001a+\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020 2\b\b\u0002\u0010+\u001a\u00020 2\b\b\u0002\u0010,\u001a\u00020 H\u0007¢\u0006\u0002\u0010-\u001a \u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020 H\u0007\u001a:\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020 2\f\u00103\u001a\b\u0012\u0004\u0012\u00020 042\f\u00105\u001a\b\u0012\u0004\u0012\u00020 06H\u0082@¢\u0006\u0002\u00107\u001a\f\u00108\u001a\u00020 *\u00020)H\u0002\u001aÃ\u0001\u00109\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0003¢\u0006\u0004\b;\u0010<\u001a´\u0001\u0010=\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010@\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0011\u0010A\u001a\r\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0002\b\u00112\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010C\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0003¢\u0006\u0004\bD\u0010E\u001aÃ\u0001\u0010F\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0003¢\u0006\u0004\bG\u0010<\u001a´\u0001\u0010H\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010@\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0011\u0010A\u001a\r\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0002\b\u00112\u0006\u0010B\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010C\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0003¢\u0006\u0004\bI\u0010E\u001a*\u0010J\u001a\u00020\u0005*\u00020\u00052\u0006\u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 04H\u0002\u001aB\u0010M\u001a\b\u0012\u0004\u0012\u00020O0N2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020SH\u0002\u001a\u001f\u0010U\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00150V2\u0006\u0010W\u001a\u00020 H\u0002¢\u0006\u0002\u0010X\u001a\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00030ZH\u0003¢\u0006\u0002\u0010[\"\"\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\"\u0010c\u001a\b\u0012\u0004\u0012\u00020d0]8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\be\u0010`\u001a\u0004\bf\u0010b\"\"\u0010g\u001a\b\u0012\u0004\u0012\u00020h0]8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bi\u0010`\u001a\u0004\bj\u0010b\"\"\u0010k\u001a\b\u0012\u0004\u0012\u00020l0]8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bm\u0010`\u001a\u0004\bn\u0010b¨\u0006o²\u0006\n\u0010p\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010q\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\n\u0010p\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010p\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010q\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\n\u0010p\u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"HorizontalFloatingToolbar", "", "expanded", "", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "Landroidx/compose/material3/FloatingToolbarColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "scrollBehavior", "Landroidx/compose/material3/FloatingToolbarScrollBehavior;", "shape", "Landroidx/compose/ui/graphics/Shape;", "leadingContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "trailingContent", "expandedShadowElevation", "Landroidx/compose/ui/unit/Dp;", "collapsedShadowElevation", "content", "HorizontalFloatingToolbar-LJWHXA8", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/material3/FloatingToolbarColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/FloatingToolbarScrollBehavior;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "floatingActionButton", "Lkotlin/Function0;", "floatingActionButtonPosition", "Landroidx/compose/material3/FloatingToolbarHorizontalFabPosition;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "HorizontalFloatingToolbar-ekznXB8", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/FloatingToolbarColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/FloatingToolbarScrollBehavior;Landroidx/compose/ui/graphics/Shape;ILandroidx/compose/animation/core/FiniteAnimationSpec;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "VerticalFloatingToolbar", "Landroidx/compose/foundation/layout/ColumnScope;", "VerticalFloatingToolbar-LJWHXA8", "Landroidx/compose/material3/FloatingToolbarVerticalFabPosition;", "VerticalFloatingToolbar-NTTHHFE", "rememberFloatingToolbarState", "Landroidx/compose/material3/FloatingToolbarState;", "initialOffsetLimit", "initialOffset", "initialContentOffset", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingToolbarState;", "FloatingToolbarState", "settleFloatingToolbar", "Landroidx/compose/ui/unit/Velocity;", "state", "velocity", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/material3/FloatingToolbarState;FLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collapsedFraction", "HorizontalFloatingToolbarLayout", "onA11yForceCollapse", "HorizontalFloatingToolbarLayout-yndP2WQ", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/FloatingToolbarColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/FloatingToolbarScrollBehavior;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "HorizontalFloatingToolbarWithFabLayout", "toolbarToFabGap", "toolbarContentPadding", "toolbarShape", "fab", "fabPosition", "toolbar", "HorizontalFloatingToolbarWithFabLayout-z3vpotQ", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/FloatingToolbarColors;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/FloatingToolbarScrollBehavior;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function2;IFFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "VerticalFloatingToolbarLayout", "VerticalFloatingToolbarLayout-yndP2WQ", "VerticalFloatingToolbarWithFabLayout", "VerticalFloatingToolbarWithFabLayout-Nur2B3k", "minimumInteractiveBalancedPadding", "hasVisibleLeadingContent", "hasVisibleTrailingContent", "customToolbarActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "expandAction", "collapseAction", "expandActionLabel", "", "collapseActionLabel", "lerp", "Lkotlin/ranges/ClosedRange;", NotificationCompat.CATEGORY_PROGRESS, "(Lkotlin/ranges/ClosedRange;F)F", "rememberTouchExplorationService", "Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "LocalHorizontalFloatingToolbarOverride", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/HorizontalFloatingToolbarOverride;", "getLocalHorizontalFloatingToolbarOverride$annotations", "()V", "getLocalHorizontalFloatingToolbarOverride", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalHorizontalFloatingToolbarWithFabOverride", "Landroidx/compose/material3/HorizontalFloatingToolbarWithFabOverride;", "getLocalHorizontalFloatingToolbarWithFabOverride$annotations", "getLocalHorizontalFloatingToolbarWithFabOverride", "LocalVerticalToolbarOverride", "Landroidx/compose/material3/VerticalFloatingToolbarOverride;", "getLocalVerticalToolbarOverride$annotations", "getLocalVerticalToolbarOverride", "LocalVerticalToolbarWithFabOverride", "Landroidx/compose/material3/VerticalFloatingToolbarWithFabOverride;", "getLocalVerticalToolbarWithFabOverride$annotations", "getLocalVerticalToolbarWithFabOverride", "material3", "expandedState", "shadowElevationState"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class FloatingToolbarKt {
    private static final ProvidableCompositionLocal<HorizontalFloatingToolbarOverride> LocalHorizontalFloatingToolbarOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            HorizontalFloatingToolbarOverride LocalHorizontalFloatingToolbarOverride$lambda$0;
            LocalHorizontalFloatingToolbarOverride$lambda$0 = FloatingToolbarKt.LocalHorizontalFloatingToolbarOverride$lambda$0();
            return LocalHorizontalFloatingToolbarOverride$lambda$0;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<HorizontalFloatingToolbarWithFabOverride> LocalHorizontalFloatingToolbarWithFabOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            HorizontalFloatingToolbarWithFabOverride LocalHorizontalFloatingToolbarWithFabOverride$lambda$0;
            LocalHorizontalFloatingToolbarWithFabOverride$lambda$0 = FloatingToolbarKt.LocalHorizontalFloatingToolbarWithFabOverride$lambda$0();
            return LocalHorizontalFloatingToolbarWithFabOverride$lambda$0;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<VerticalFloatingToolbarOverride> LocalVerticalToolbarOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            VerticalFloatingToolbarOverride LocalVerticalToolbarOverride$lambda$0;
            LocalVerticalToolbarOverride$lambda$0 = FloatingToolbarKt.LocalVerticalToolbarOverride$lambda$0();
            return LocalVerticalToolbarOverride$lambda$0;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<VerticalFloatingToolbarWithFabOverride> LocalVerticalToolbarWithFabOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            VerticalFloatingToolbarWithFabOverride LocalVerticalToolbarWithFabOverride$lambda$0;
            LocalVerticalToolbarWithFabOverride$lambda$0 = FloatingToolbarKt.LocalVerticalToolbarWithFabOverride$lambda$0();
            return LocalVerticalToolbarWithFabOverride$lambda$0;
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$5(Modifier modifier, boolean z, Function1 function1, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, Function3 function3, Function3 function32, float f, float f2, Function3 function33, int i, int i2, Composer composer, int i3) {
        m3252HorizontalFloatingToolbarLayoutyndP2WQ(modifier, z, function1, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, function3, function32, f, f2, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$6(Modifier modifier, boolean z, Function1 function1, FloatingToolbarColors floatingToolbarColors, float f, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, FiniteAnimationSpec finiteAnimationSpec, Function2 function2, int i, float f2, float f3, Function3 function3, int i2, int i3, Composer composer, int i4) {
        m3253HorizontalFloatingToolbarWithFabLayoutz3vpotQ(modifier, z, function1, floatingToolbarColors, f, paddingValues, floatingToolbarScrollBehavior, shape, finiteAnimationSpec, function2, i, f2, f3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbar_LJWHXA8$lambda$1(boolean z, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, Function3 function3, Function3 function32, float f, float f2, Function3 function33, int i, int i2, int i3, Composer composer, int i4) {
        m3250HorizontalFloatingToolbarLJWHXA8(z, modifier, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, function3, function32, f, f2, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbar_ekznXB8$lambda$1(boolean z, Function2 function2, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, int i, FiniteAnimationSpec finiteAnimationSpec, float f, float f2, Function3 function3, int i2, int i3, int i4, Composer composer, int i5) {
        m3251HorizontalFloatingToolbarekznXB8(z, function2, modifier, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, i, finiteAnimationSpec, f, f2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$5(Modifier modifier, boolean z, Function1 function1, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, Function3 function3, Function3 function32, float f, float f2, Function3 function33, int i, int i2, Composer composer, int i3) {
        m3256VerticalFloatingToolbarLayoutyndP2WQ(modifier, z, function1, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, function3, function32, f, f2, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$6(Modifier modifier, boolean z, Function1 function1, FloatingToolbarColors floatingToolbarColors, float f, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, FiniteAnimationSpec finiteAnimationSpec, Function2 function2, int i, float f2, float f3, Function3 function3, int i2, int i3, Composer composer, int i4) {
        m3257VerticalFloatingToolbarWithFabLayoutNur2B3k(modifier, z, function1, floatingToolbarColors, f, paddingValues, floatingToolbarScrollBehavior, shape, finiteAnimationSpec, function2, i, f2, f3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbar_LJWHXA8$lambda$1(boolean z, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, Function3 function3, Function3 function32, float f, float f2, Function3 function33, int i, int i2, int i3, Composer composer, int i4) {
        m3254VerticalFloatingToolbarLJWHXA8(z, modifier, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, function3, function32, f, f2, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbar_NTTHHFE$lambda$1(boolean z, Function2 function2, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, int i, FiniteAnimationSpec finiteAnimationSpec, float f, float f2, Function3 function3, int i2, int i3, int i4, Composer composer, int i5) {
        m3255VerticalFloatingToolbarNTTHHFE(z, function2, modifier, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, i, finiteAnimationSpec, f, f2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLocalHorizontalFloatingToolbarOverride$annotations() {
    }

    public static /* synthetic */ void getLocalHorizontalFloatingToolbarWithFabOverride$annotations() {
    }

    public static /* synthetic */ void getLocalVerticalToolbarOverride$annotations() {
    }

    public static /* synthetic */ void getLocalVerticalToolbarWithFabOverride$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: HorizontalFloatingToolbar-LJWHXA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3250HorizontalFloatingToolbarLJWHXA8(final boolean z, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, float f, float f2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        FloatingToolbarColors floatingToolbarColors2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        FloatingToolbarScrollBehavior floatingToolbarScrollBehavior2;
        Shape shape2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final float f3;
        final Modifier modifier3;
        final FloatingToolbarColors floatingToolbarColors3;
        final PaddingValues paddingValues3;
        final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior3;
        final Shape shape3;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function35;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        FloatingToolbarColors floatingToolbarColors4;
        Shape shape4;
        float f5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function36;
        FloatingToolbarColors floatingToolbarColors5;
        Shape shape5;
        PaddingValues paddingValues4;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function37;
        float f6;
        FloatingToolbarScrollBehavior floatingToolbarScrollBehavior4;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(711446191);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalFloatingToolbar)N(expanded,modifier,colors,contentPadding,scrollBehavior,shape,leadingContent,trailingContent,expandedShadowElevation:c#ui.unit.Dp,collapsedShadowElevation:c#ui.unit.Dp,content)198@10586L7,*198@10603L27:FloatingToolbar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    floatingToolbarColors2 = floatingToolbarColors;
                    if (startRestartGroup.changed(floatingToolbarColors2)) {
                        i15 = 256;
                        i4 |= i15;
                    }
                } else {
                    floatingToolbarColors2 = floatingToolbarColors;
                }
                i15 = 128;
                i4 |= i15;
            } else {
                floatingToolbarColors2 = floatingToolbarColors;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i4 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior;
                    i4 |= startRestartGroup.changed(floatingToolbarScrollBehavior2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i3 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i14 = 131072;
                                i4 |= i14;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i14 = 65536;
                        i4 |= i14;
                    } else {
                        shape2 = shape;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(f) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i11 = i3 & 512;
                        if (i11 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i12 = i11;
                            i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if ((i2 & 6) != 0) {
                                i13 = i2 | (startRestartGroup.changedInstance(function33) ? 4 : 2);
                            } else {
                                i13 = i2;
                            }
                            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "174@9421L31,177@9632L14");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i4 &= -458753;
                                    }
                                    function36 = function3;
                                    function37 = function32;
                                    f6 = f;
                                    f5 = f2;
                                    companion = modifier2;
                                    floatingToolbarColors5 = floatingToolbarColors2;
                                    paddingValues4 = paddingValues2;
                                    floatingToolbarScrollBehavior4 = floatingToolbarScrollBehavior2;
                                    shape5 = shape2;
                                } else {
                                    companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                                    if ((i3 & 4) != 0) {
                                        floatingToolbarColors4 = FloatingToolbarDefaults.INSTANCE.standardFloatingToolbarColors(startRestartGroup, 6);
                                        i4 &= -897;
                                    } else {
                                        floatingToolbarColors4 = floatingToolbarColors2;
                                    }
                                    PaddingValues contentPadding = i5 != 0 ? FloatingToolbarDefaults.INSTANCE.getContentPadding() : paddingValues2;
                                    if (i6 != 0) {
                                        floatingToolbarScrollBehavior2 = null;
                                    }
                                    if ((i3 & 32) != 0) {
                                        shape4 = FloatingToolbarDefaults.INSTANCE.getContainerShape(startRestartGroup, 6);
                                        i4 = (-458753) & i4;
                                    } else {
                                        shape4 = shape2;
                                    }
                                    Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function38 = i7 != 0 ? null : function3;
                                    Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function39 = i8 == 0 ? function32 : null;
                                    float m3201getContainerExpandedElevationD9Ej5fM = i10 != 0 ? FloatingToolbarDefaults.INSTANCE.m3201getContainerExpandedElevationD9Ej5fM() : f;
                                    if (i12 != 0) {
                                        function36 = function38;
                                        floatingToolbarColors5 = floatingToolbarColors4;
                                        shape5 = shape4;
                                        paddingValues4 = contentPadding;
                                        function37 = function39;
                                        f6 = m3201getContainerExpandedElevationD9Ej5fM;
                                        f5 = FloatingToolbarDefaults.INSTANCE.m3199getContainerCollapsedElevationD9Ej5fM();
                                    } else {
                                        f5 = f2;
                                        function36 = function38;
                                        floatingToolbarColors5 = floatingToolbarColors4;
                                        shape5 = shape4;
                                        paddingValues4 = contentPadding;
                                        function37 = function39;
                                        f6 = m3201getContainerExpandedElevationD9Ej5fM;
                                    }
                                    floatingToolbarScrollBehavior4 = floatingToolbarScrollBehavior2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(711446191, i4, i13, "androidx.compose.material3.HorizontalFloatingToolbar (FloatingToolbar.kt:183)");
                                }
                                Modifier modifier4 = companion;
                                HorizontalFloatingToolbarOverrideScope horizontalFloatingToolbarOverrideScope = new HorizontalFloatingToolbarOverrideScope(z, modifier4, floatingToolbarColors5, paddingValues4, floatingToolbarScrollBehavior4, shape5, function36, function37, f6, f5, function33, null);
                                ProvidableCompositionLocal<HorizontalFloatingToolbarOverride> providableCompositionLocal = LocalHorizontalFloatingToolbarOverride;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(providableCompositionLocal);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ((HorizontalFloatingToolbarOverride) consume).HorizontalFloatingToolbar(horizontalFloatingToolbarOverrideScope, startRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                floatingToolbarColors3 = floatingToolbarColors5;
                                paddingValues3 = paddingValues4;
                                floatingToolbarScrollBehavior3 = floatingToolbarScrollBehavior4;
                                shape3 = shape5;
                                function34 = function36;
                                function35 = function37;
                                f3 = f6;
                                f4 = f5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                f3 = f;
                                modifier3 = modifier2;
                                floatingToolbarColors3 = floatingToolbarColors2;
                                paddingValues3 = paddingValues2;
                                floatingToolbarScrollBehavior3 = floatingToolbarScrollBehavior2;
                                shape3 = shape2;
                                function34 = function3;
                                function35 = function32;
                                f4 = f2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit HorizontalFloatingToolbar_LJWHXA8$lambda$1;
                                        HorizontalFloatingToolbar_LJWHXA8$lambda$1 = FloatingToolbarKt.HorizontalFloatingToolbar_LJWHXA8$lambda$1(z, modifier3, floatingToolbarColors3, paddingValues3, floatingToolbarScrollBehavior3, shape3, function34, function35, f3, f4, function33, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return HorizontalFloatingToolbar_LJWHXA8$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i12 = i11;
                        if ((i2 & 6) != 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if ((i2 & 6) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior;
                if ((196608 & i) != 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior;
            if ((196608 & i) != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior;
        if ((196608 & i) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: HorizontalFloatingToolbar-ekznXB8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3251HorizontalFloatingToolbarekznXB8(final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, int i, FiniteAnimationSpec<Float> finiteAnimationSpec, float f, float f2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Modifier modifier2;
        FloatingToolbarColors floatingToolbarColors2;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        int i8;
        final int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior2;
        final Shape shape2;
        final FiniteAnimationSpec<Float> finiteAnimationSpec2;
        final Modifier modifier3;
        final FloatingToolbarColors floatingToolbarColors3;
        final PaddingValues paddingValues3;
        final float f3;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        FloatingToolbarColors floatingToolbarColors4;
        Shape shape3;
        FiniteAnimationSpec<Float> finiteAnimationSpec3;
        float f5;
        Modifier modifier4;
        float f6;
        int i16;
        FiniteAnimationSpec<Float> finiteAnimationSpec4;
        FloatingToolbarColors floatingToolbarColors5;
        PaddingValues paddingValues4;
        FloatingToolbarScrollBehavior floatingToolbarScrollBehavior3;
        Shape shape4;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(1843793851);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalFloatingToolbar)N(expanded,floatingActionButton,modifier,colors,contentPadding,scrollBehavior,shape,floatingActionButtonPosition:c#material3.FloatingToolbarHorizontalFabPosition,animationSpec,expandedShadowElevation:c#ui.unit.Dp,collapsedShadowElevation:c#ui.unit.Dp,content)331@18250L7,*332@18275L34:FloatingToolbar.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            function22 = function2;
            i5 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        } else {
            function22 = function2;
        }
        int i19 = i4 & 4;
        if (i19 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i4 & 8) == 0) {
                    floatingToolbarColors2 = floatingToolbarColors;
                    if (startRestartGroup.changed(floatingToolbarColors2)) {
                        i18 = 2048;
                        i5 |= i18;
                    }
                } else {
                    floatingToolbarColors2 = floatingToolbarColors;
                }
                i18 = 1024;
                i5 |= i18;
            } else {
                floatingToolbarColors2 = floatingToolbarColors;
            }
            i6 = i4 & 16;
            if (i6 == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                paddingValues2 = paddingValues;
                i5 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i5 |= startRestartGroup.changed(floatingToolbarScrollBehavior) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                    i9 = i;
                } else {
                    i9 = i;
                    if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(i9) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 100663296) == 0) {
                    if ((i4 & 256) == 0 && startRestartGroup.changedInstance(finiteAnimationSpec)) {
                        i17 = 67108864;
                        i5 |= i17;
                    }
                    i17 = GroupFlagsKt.HasAuxSlotFlag;
                    i5 |= i17;
                }
                i10 = i4 & 512;
                if (i10 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i11 = i10;
                    i5 |= startRestartGroup.changed(f) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i12 = i4 & 1024;
                    if (i12 == 0) {
                        i14 = i3 | 6;
                        i13 = i12;
                    } else if ((i3 & 6) == 0) {
                        i13 = i12;
                        i14 = i3 | (startRestartGroup.changed(f2) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i14 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                    }
                    i15 = i14;
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i15 & 19) != 18, i5 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "305@16891L31,308@17102L14,311@17313L15");
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i4 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            floatingToolbarScrollBehavior3 = floatingToolbarScrollBehavior;
                            shape4 = shape;
                            finiteAnimationSpec4 = finiteAnimationSpec;
                            f6 = f;
                            f5 = f2;
                            i16 = i9;
                            modifier4 = modifier2;
                            floatingToolbarColors5 = floatingToolbarColors2;
                            paddingValues4 = paddingValues2;
                        } else {
                            Modifier.Companion companion = i19 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i4 & 8) != 0) {
                                floatingToolbarColors4 = FloatingToolbarDefaults.INSTANCE.standardFloatingToolbarColors(startRestartGroup, 6);
                                i5 &= -7169;
                            } else {
                                floatingToolbarColors4 = floatingToolbarColors2;
                            }
                            PaddingValues contentPadding = i6 != 0 ? FloatingToolbarDefaults.INSTANCE.getContentPadding() : paddingValues2;
                            FloatingToolbarScrollBehavior floatingToolbarScrollBehavior4 = i7 != 0 ? null : floatingToolbarScrollBehavior;
                            if ((i4 & 64) != 0) {
                                shape3 = FloatingToolbarDefaults.INSTANCE.getContainerShape(startRestartGroup, 6);
                                i5 &= -3670017;
                            } else {
                                shape3 = shape;
                            }
                            int m3234getEndEdPuMIg = i8 != 0 ? FloatingToolbarHorizontalFabPosition.INSTANCE.m3234getEndEdPuMIg() : i9;
                            if ((i4 & 256) != 0) {
                                finiteAnimationSpec3 = FloatingToolbarDefaults.INSTANCE.animationSpec(startRestartGroup, 6);
                                i5 = (-234881025) & i5;
                            } else {
                                finiteAnimationSpec3 = finiteAnimationSpec;
                            }
                            float m3202getContainerExpandedElevationWithFabD9Ej5fM = i11 != 0 ? FloatingToolbarDefaults.INSTANCE.m3202getContainerExpandedElevationWithFabD9Ej5fM() : f;
                            if (i13 != 0) {
                                modifier4 = companion;
                                f6 = m3202getContainerExpandedElevationWithFabD9Ej5fM;
                                i16 = m3234getEndEdPuMIg;
                                finiteAnimationSpec4 = finiteAnimationSpec3;
                                floatingToolbarColors5 = floatingToolbarColors4;
                                f5 = FloatingToolbarDefaults.INSTANCE.m3200getContainerCollapsedElevationWithFabD9Ej5fM();
                            } else {
                                f5 = f2;
                                modifier4 = companion;
                                f6 = m3202getContainerExpandedElevationWithFabD9Ej5fM;
                                i16 = m3234getEndEdPuMIg;
                                finiteAnimationSpec4 = finiteAnimationSpec3;
                                floatingToolbarColors5 = floatingToolbarColors4;
                            }
                            paddingValues4 = contentPadding;
                            floatingToolbarScrollBehavior3 = floatingToolbarScrollBehavior4;
                            shape4 = shape3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1843793851, i5, i15, "androidx.compose.material3.HorizontalFloatingToolbar (FloatingToolbar.kt:315)");
                        }
                        HorizontalFloatingToolbarWithFabOverrideScope horizontalFloatingToolbarWithFabOverrideScope = new HorizontalFloatingToolbarWithFabOverrideScope(z, function22, modifier4, floatingToolbarColors5, paddingValues4, floatingToolbarScrollBehavior3, shape4, i16, finiteAnimationSpec4, f6, f5, function3, null);
                        ProvidableCompositionLocal<HorizontalFloatingToolbarWithFabOverride> providableCompositionLocal = LocalHorizontalFloatingToolbarWithFabOverride;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(providableCompositionLocal);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ((HorizontalFloatingToolbarWithFabOverride) consume).HorizontalFloatingToolbarWithFab(horizontalFloatingToolbarWithFabOverrideScope, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        floatingToolbarColors3 = floatingToolbarColors5;
                        paddingValues3 = paddingValues4;
                        floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior3;
                        shape2 = shape4;
                        i9 = i16;
                        finiteAnimationSpec2 = finiteAnimationSpec4;
                        f3 = f6;
                        f4 = f5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior;
                        shape2 = shape;
                        finiteAnimationSpec2 = finiteAnimationSpec;
                        modifier3 = modifier2;
                        floatingToolbarColors3 = floatingToolbarColors2;
                        paddingValues3 = paddingValues2;
                        f3 = f;
                        f4 = f2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda38
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HorizontalFloatingToolbar_ekznXB8$lambda$1;
                                HorizontalFloatingToolbar_ekznXB8$lambda$1 = FloatingToolbarKt.HorizontalFloatingToolbar_ekznXB8$lambda$1(z, function2, modifier3, floatingToolbarColors3, paddingValues3, floatingToolbarScrollBehavior2, shape2, i9, finiteAnimationSpec2, f3, f4, function3, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                return HorizontalFloatingToolbar_ekznXB8$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                i11 = i10;
                i12 = i4 & 1024;
                if (i12 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                i15 = i14;
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i15 & 19) != 18, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i10 = i4 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i4 & 1024;
            if (i12 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            i15 = i14;
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i15 & 19) != 18, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 3072) != 0) {
        }
        i6 = i4 & 16;
        if (i6 == 0) {
        }
        paddingValues2 = paddingValues;
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i8 = i4 & 128;
        if (i8 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i10 = i4 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i4 & 1024;
        if (i12 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        i15 = i14;
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i15 & 19) != 18, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: VerticalFloatingToolbar-LJWHXA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3254VerticalFloatingToolbarLJWHXA8(final boolean z, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, float f, float f2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        FloatingToolbarColors floatingToolbarColors2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        FloatingToolbarScrollBehavior floatingToolbarScrollBehavior2;
        Shape shape2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final float f3;
        final Modifier modifier3;
        final FloatingToolbarColors floatingToolbarColors3;
        final PaddingValues paddingValues3;
        final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior3;
        final Shape shape3;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function35;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        FloatingToolbarColors floatingToolbarColors4;
        Shape shape4;
        float f5;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function36;
        FloatingToolbarColors floatingToolbarColors5;
        Shape shape5;
        PaddingValues paddingValues4;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37;
        float f6;
        FloatingToolbarScrollBehavior floatingToolbarScrollBehavior4;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(169328641);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalFloatingToolbar)N(expanded,modifier,colors,contentPadding,scrollBehavior,shape,leadingContent,trailingContent,expandedShadowElevation:c#ui.unit.Dp,collapsedShadowElevation:c#ui.unit.Dp,content)429@23548L7,*429@23565L25:FloatingToolbar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    floatingToolbarColors2 = floatingToolbarColors;
                    if (startRestartGroup.changed(floatingToolbarColors2)) {
                        i15 = 256;
                        i4 |= i15;
                    }
                } else {
                    floatingToolbarColors2 = floatingToolbarColors;
                }
                i15 = 128;
                i4 |= i15;
            } else {
                floatingToolbarColors2 = floatingToolbarColors;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i4 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior;
                    i4 |= startRestartGroup.changed(floatingToolbarScrollBehavior2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i3 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i14 = 131072;
                                i4 |= i14;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i14 = 65536;
                        i4 |= i14;
                    } else {
                        shape2 = shape;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(f) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i11 = i3 & 512;
                        if (i11 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i12 = i11;
                            i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if ((i2 & 6) != 0) {
                                i13 = i2 | (startRestartGroup.changedInstance(function33) ? 4 : 2);
                            } else {
                                i13 = i2;
                            }
                            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "405@22386L31,408@22597L14");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i4 &= -458753;
                                    }
                                    function36 = function3;
                                    function37 = function32;
                                    f6 = f;
                                    f5 = f2;
                                    companion = modifier2;
                                    floatingToolbarColors5 = floatingToolbarColors2;
                                    paddingValues4 = paddingValues2;
                                    floatingToolbarScrollBehavior4 = floatingToolbarScrollBehavior2;
                                    shape5 = shape2;
                                } else {
                                    companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                                    if ((i3 & 4) != 0) {
                                        floatingToolbarColors4 = FloatingToolbarDefaults.INSTANCE.standardFloatingToolbarColors(startRestartGroup, 6);
                                        i4 &= -897;
                                    } else {
                                        floatingToolbarColors4 = floatingToolbarColors2;
                                    }
                                    PaddingValues contentPadding = i5 != 0 ? FloatingToolbarDefaults.INSTANCE.getContentPadding() : paddingValues2;
                                    if (i6 != 0) {
                                        floatingToolbarScrollBehavior2 = null;
                                    }
                                    if ((i3 & 32) != 0) {
                                        shape4 = FloatingToolbarDefaults.INSTANCE.getContainerShape(startRestartGroup, 6);
                                        i4 = (-458753) & i4;
                                    } else {
                                        shape4 = shape2;
                                    }
                                    Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = i7 != 0 ? null : function3;
                                    Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = i8 == 0 ? function32 : null;
                                    float m3201getContainerExpandedElevationD9Ej5fM = i10 != 0 ? FloatingToolbarDefaults.INSTANCE.m3201getContainerExpandedElevationD9Ej5fM() : f;
                                    if (i12 != 0) {
                                        function36 = function38;
                                        floatingToolbarColors5 = floatingToolbarColors4;
                                        shape5 = shape4;
                                        paddingValues4 = contentPadding;
                                        function37 = function39;
                                        f6 = m3201getContainerExpandedElevationD9Ej5fM;
                                        f5 = FloatingToolbarDefaults.INSTANCE.m3199getContainerCollapsedElevationD9Ej5fM();
                                    } else {
                                        f5 = f2;
                                        function36 = function38;
                                        floatingToolbarColors5 = floatingToolbarColors4;
                                        shape5 = shape4;
                                        paddingValues4 = contentPadding;
                                        function37 = function39;
                                        f6 = m3201getContainerExpandedElevationD9Ej5fM;
                                    }
                                    floatingToolbarScrollBehavior4 = floatingToolbarScrollBehavior2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(169328641, i4, i13, "androidx.compose.material3.VerticalFloatingToolbar (FloatingToolbar.kt:414)");
                                }
                                Modifier modifier4 = companion;
                                VerticalFloatingToolbarOverrideScope verticalFloatingToolbarOverrideScope = new VerticalFloatingToolbarOverrideScope(z, modifier4, floatingToolbarColors5, paddingValues4, floatingToolbarScrollBehavior4, shape5, function36, function37, f6, f5, function33, null);
                                ProvidableCompositionLocal<VerticalFloatingToolbarOverride> providableCompositionLocal = LocalVerticalToolbarOverride;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(providableCompositionLocal);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ((VerticalFloatingToolbarOverride) consume).VerticalFloatingToolbar(verticalFloatingToolbarOverrideScope, startRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                floatingToolbarColors3 = floatingToolbarColors5;
                                paddingValues3 = paddingValues4;
                                floatingToolbarScrollBehavior3 = floatingToolbarScrollBehavior4;
                                shape3 = shape5;
                                function34 = function36;
                                function35 = function37;
                                f3 = f6;
                                f4 = f5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                f3 = f;
                                modifier3 = modifier2;
                                floatingToolbarColors3 = floatingToolbarColors2;
                                paddingValues3 = paddingValues2;
                                floatingToolbarScrollBehavior3 = floatingToolbarScrollBehavior2;
                                shape3 = shape2;
                                function34 = function3;
                                function35 = function32;
                                f4 = f2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda32
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit VerticalFloatingToolbar_LJWHXA8$lambda$1;
                                        VerticalFloatingToolbar_LJWHXA8$lambda$1 = FloatingToolbarKt.VerticalFloatingToolbar_LJWHXA8$lambda$1(z, modifier3, floatingToolbarColors3, paddingValues3, floatingToolbarScrollBehavior3, shape3, function34, function35, f3, f4, function33, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return VerticalFloatingToolbar_LJWHXA8$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i12 = i11;
                        if ((i2 & 6) != 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if ((i2 & 6) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior;
                if ((196608 & i) != 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior;
            if ((196608 & i) != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior;
        if ((196608 & i) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: VerticalFloatingToolbar-NTTHHFE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3255VerticalFloatingToolbarNTTHHFE(final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, int i, FiniteAnimationSpec<Float> finiteAnimationSpec, float f, float f2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Modifier modifier2;
        FloatingToolbarColors floatingToolbarColors2;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        int i8;
        final int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior2;
        final Shape shape2;
        final FiniteAnimationSpec<Float> finiteAnimationSpec2;
        final Modifier modifier3;
        final FloatingToolbarColors floatingToolbarColors3;
        final PaddingValues paddingValues3;
        final float f3;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        FloatingToolbarColors floatingToolbarColors4;
        Shape shape3;
        FiniteAnimationSpec<Float> finiteAnimationSpec3;
        float f5;
        Modifier modifier4;
        float f6;
        int i16;
        FiniteAnimationSpec<Float> finiteAnimationSpec4;
        FloatingToolbarColors floatingToolbarColors5;
        PaddingValues paddingValues4;
        FloatingToolbarScrollBehavior floatingToolbarScrollBehavior3;
        Shape shape4;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(-1335596201);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalFloatingToolbar)N(expanded,floatingActionButton,modifier,colors,contentPadding,scrollBehavior,shape,floatingActionButtonPosition:c#material3.FloatingToolbarVerticalFabPosition,animationSpec,expandedShadowElevation:c#ui.unit.Dp,collapsedShadowElevation:c#ui.unit.Dp,content)555@30751L7,*555@30768L32:FloatingToolbar.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            function22 = function2;
            i5 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        } else {
            function22 = function2;
        }
        int i19 = i4 & 4;
        if (i19 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i4 & 8) == 0) {
                    floatingToolbarColors2 = floatingToolbarColors;
                    if (startRestartGroup.changed(floatingToolbarColors2)) {
                        i18 = 2048;
                        i5 |= i18;
                    }
                } else {
                    floatingToolbarColors2 = floatingToolbarColors;
                }
                i18 = 1024;
                i5 |= i18;
            } else {
                floatingToolbarColors2 = floatingToolbarColors;
            }
            i6 = i4 & 16;
            if (i6 == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                paddingValues2 = paddingValues;
                i5 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i5 |= startRestartGroup.changed(floatingToolbarScrollBehavior) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                    i9 = i;
                } else {
                    i9 = i;
                    if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(i9) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 100663296) == 0) {
                    if ((i4 & 256) == 0 && startRestartGroup.changedInstance(finiteAnimationSpec)) {
                        i17 = 67108864;
                        i5 |= i17;
                    }
                    i17 = GroupFlagsKt.HasAuxSlotFlag;
                    i5 |= i17;
                }
                i10 = i4 & 512;
                if (i10 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i11 = i10;
                    i5 |= startRestartGroup.changed(f) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i12 = i4 & 1024;
                    if (i12 == 0) {
                        i14 = i3 | 6;
                        i13 = i12;
                    } else if ((i3 & 6) == 0) {
                        i13 = i12;
                        i14 = i3 | (startRestartGroup.changed(f2) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i14 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                    }
                    i15 = i14;
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i15 & 19) != 18, i5 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "529@29402L31,532@29613L14,535@29823L15");
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i4 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            floatingToolbarScrollBehavior3 = floatingToolbarScrollBehavior;
                            shape4 = shape;
                            finiteAnimationSpec4 = finiteAnimationSpec;
                            f6 = f;
                            f5 = f2;
                            i16 = i9;
                            modifier4 = modifier2;
                            floatingToolbarColors5 = floatingToolbarColors2;
                            paddingValues4 = paddingValues2;
                        } else {
                            Modifier.Companion companion = i19 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i4 & 8) != 0) {
                                floatingToolbarColors4 = FloatingToolbarDefaults.INSTANCE.standardFloatingToolbarColors(startRestartGroup, 6);
                                i5 &= -7169;
                            } else {
                                floatingToolbarColors4 = floatingToolbarColors2;
                            }
                            PaddingValues contentPadding = i6 != 0 ? FloatingToolbarDefaults.INSTANCE.getContentPadding() : paddingValues2;
                            FloatingToolbarScrollBehavior floatingToolbarScrollBehavior4 = i7 != 0 ? null : floatingToolbarScrollBehavior;
                            if ((i4 & 64) != 0) {
                                shape3 = FloatingToolbarDefaults.INSTANCE.getContainerShape(startRestartGroup, 6);
                                i5 &= -3670017;
                            } else {
                                shape3 = shape;
                            }
                            int m3272getBottomdDJPGzU = i8 != 0 ? FloatingToolbarVerticalFabPosition.INSTANCE.m3272getBottomdDJPGzU() : i9;
                            if ((i4 & 256) != 0) {
                                finiteAnimationSpec3 = FloatingToolbarDefaults.INSTANCE.animationSpec(startRestartGroup, 6);
                                i5 = (-234881025) & i5;
                            } else {
                                finiteAnimationSpec3 = finiteAnimationSpec;
                            }
                            float m3202getContainerExpandedElevationWithFabD9Ej5fM = i11 != 0 ? FloatingToolbarDefaults.INSTANCE.m3202getContainerExpandedElevationWithFabD9Ej5fM() : f;
                            if (i13 != 0) {
                                modifier4 = companion;
                                f6 = m3202getContainerExpandedElevationWithFabD9Ej5fM;
                                i16 = m3272getBottomdDJPGzU;
                                finiteAnimationSpec4 = finiteAnimationSpec3;
                                floatingToolbarColors5 = floatingToolbarColors4;
                                f5 = FloatingToolbarDefaults.INSTANCE.m3200getContainerCollapsedElevationWithFabD9Ej5fM();
                            } else {
                                f5 = f2;
                                modifier4 = companion;
                                f6 = m3202getContainerExpandedElevationWithFabD9Ej5fM;
                                i16 = m3272getBottomdDJPGzU;
                                finiteAnimationSpec4 = finiteAnimationSpec3;
                                floatingToolbarColors5 = floatingToolbarColors4;
                            }
                            paddingValues4 = contentPadding;
                            floatingToolbarScrollBehavior3 = floatingToolbarScrollBehavior4;
                            shape4 = shape3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1335596201, i5, i15, "androidx.compose.material3.VerticalFloatingToolbar (FloatingToolbar.kt:539)");
                        }
                        VerticalFloatingToolbarWithFabOverrideScope verticalFloatingToolbarWithFabOverrideScope = new VerticalFloatingToolbarWithFabOverrideScope(z, function22, modifier4, floatingToolbarColors5, paddingValues4, floatingToolbarScrollBehavior3, shape4, i16, finiteAnimationSpec4, f6, f5, function3, null);
                        ProvidableCompositionLocal<VerticalFloatingToolbarWithFabOverride> providableCompositionLocal = LocalVerticalToolbarWithFabOverride;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(providableCompositionLocal);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ((VerticalFloatingToolbarWithFabOverride) consume).VerticalFloatingToolbarWithFab(verticalFloatingToolbarWithFabOverrideScope, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        floatingToolbarColors3 = floatingToolbarColors5;
                        paddingValues3 = paddingValues4;
                        floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior3;
                        shape2 = shape4;
                        i9 = i16;
                        finiteAnimationSpec2 = finiteAnimationSpec4;
                        f3 = f6;
                        f4 = f5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        floatingToolbarScrollBehavior2 = floatingToolbarScrollBehavior;
                        shape2 = shape;
                        finiteAnimationSpec2 = finiteAnimationSpec;
                        modifier3 = modifier2;
                        floatingToolbarColors3 = floatingToolbarColors2;
                        paddingValues3 = paddingValues2;
                        f3 = f;
                        f4 = f2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit VerticalFloatingToolbar_NTTHHFE$lambda$1;
                                VerticalFloatingToolbar_NTTHHFE$lambda$1 = FloatingToolbarKt.VerticalFloatingToolbar_NTTHHFE$lambda$1(z, function2, modifier3, floatingToolbarColors3, paddingValues3, floatingToolbarScrollBehavior2, shape2, i9, finiteAnimationSpec2, f3, f4, function3, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                return VerticalFloatingToolbar_NTTHHFE$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                i11 = i10;
                i12 = i4 & 1024;
                if (i12 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                i15 = i14;
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i15 & 19) != 18, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i10 = i4 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i4 & 1024;
            if (i12 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            i15 = i14;
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i15 & 19) != 18, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 3072) != 0) {
        }
        i6 = i4 & 16;
        if (i6 == 0) {
        }
        paddingValues2 = paddingValues;
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i8 = i4 & 128;
        if (i8 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i10 = i4 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i4 & 1024;
        if (i12 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        i15 = i14;
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i15 & 19) != 18, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final FloatingToolbarState rememberFloatingToolbarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1765068805, "C(rememberFloatingToolbarState)N(initialOffsetLimit,initialOffset,initialContentOffset)1389@67277L93,1389@67245L125:FloatingToolbar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1765068805, i, -1, "androidx.compose.material3.rememberFloatingToolbarState (FloatingToolbar.kt:1388)");
        }
        Object[] objArr = new Object[0];
        Saver<FloatingToolbarState, ?> saver$material3 = FloatingToolbarState.INSTANCE.getSaver$material3();
        ComposerKt.sourceInformationMarkerStart(composer, -280953118, "CC(remember):FloatingToolbar.kt#9igjgp");
        boolean z = true;
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(f3)) && (i & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    FloatingToolbarState FloatingToolbarState;
                    FloatingToolbarState = FloatingToolbarKt.FloatingToolbarState(f, f2, f3);
                    return FloatingToolbarState;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        FloatingToolbarState floatingToolbarState = (FloatingToolbarState) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) saver$material3, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return floatingToolbarState;
    }

    public static final FloatingToolbarState FloatingToolbarState(float f, float f2, float f3) {
        return new FloatingToolbarStateImpl(f, f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r5, r24, false, r6, r7, 2, null) == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleFloatingToolbar(FloatingToolbarState floatingToolbarState, float f, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Continuation<? super Velocity> continuation) {
        FloatingToolbarKt$settleFloatingToolbar$1 floatingToolbarKt$settleFloatingToolbar$1;
        FloatingToolbarKt$settleFloatingToolbar$1 floatingToolbarKt$settleFloatingToolbar$12;
        Object coroutine_suspended;
        int i;
        final Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        AnimationSpec<Float> animationSpec3;
        AnimationState AnimationState$default;
        Float boxFloat;
        Function1 function1;
        Ref.FloatRef floatRef2;
        final FloatingToolbarState floatingToolbarState2 = floatingToolbarState;
        if (continuation instanceof FloatingToolbarKt$settleFloatingToolbar$1) {
            floatingToolbarKt$settleFloatingToolbar$1 = (FloatingToolbarKt$settleFloatingToolbar$1) continuation;
            if ((floatingToolbarKt$settleFloatingToolbar$1.label & Integer.MIN_VALUE) != 0) {
                floatingToolbarKt$settleFloatingToolbar$1.label -= Integer.MIN_VALUE;
                floatingToolbarKt$settleFloatingToolbar$12 = floatingToolbarKt$settleFloatingToolbar$1;
                Object obj = floatingToolbarKt$settleFloatingToolbar$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = floatingToolbarKt$settleFloatingToolbar$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    float collapsedFraction = collapsedFraction(floatingToolbarState2);
                    if (collapsedFraction < 0.01f || collapsedFraction == 1.0f) {
                        return Velocity.m9965boximpl(Velocity.INSTANCE.m9985getZero9UxMQ8M());
                    }
                    floatRef = new Ref.FloatRef();
                    floatRef.element = f;
                    if (Math.abs(f) > 1.0f) {
                        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                        AnimationState AnimationState$default2 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        Function1 function12 = new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda33
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit unit;
                                unit = FloatingToolbarKt.settleFloatingToolbar$lambda$0(Ref.FloatRef.this, floatingToolbarState2, floatRef, (AnimationScope) obj2);
                                return unit;
                            }
                        };
                        floatingToolbarKt$settleFloatingToolbar$12.L$0 = floatingToolbarState2;
                        animationSpec2 = animationSpec;
                        floatingToolbarKt$settleFloatingToolbar$12.L$1 = animationSpec2;
                        floatingToolbarKt$settleFloatingToolbar$12.L$2 = floatRef;
                        floatingToolbarKt$settleFloatingToolbar$12.label = 1;
                    } else {
                        animationSpec2 = animationSpec;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        floatRef2 = (Ref.FloatRef) floatingToolbarKt$settleFloatingToolbar$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        floatRef = floatRef2;
                        return Velocity.m9965boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
                    }
                    Ref.FloatRef floatRef4 = (Ref.FloatRef) floatingToolbarKt$settleFloatingToolbar$12.L$2;
                    AnimationSpec<Float> animationSpec4 = (AnimationSpec) floatingToolbarKt$settleFloatingToolbar$12.L$1;
                    FloatingToolbarState floatingToolbarState3 = (FloatingToolbarState) floatingToolbarKt$settleFloatingToolbar$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    floatRef = floatRef4;
                    animationSpec2 = animationSpec4;
                    floatingToolbarState2 = floatingToolbarState3;
                }
                animationSpec3 = animationSpec2;
                if (floatingToolbarState2.getOffset() < 0.0f && floatingToolbarState2.getOffset() > floatingToolbarState2.getOffsetLimit()) {
                    AnimationState$default = AnimationStateKt.AnimationState$default(floatingToolbarState2.getOffset(), 0.0f, 0L, 0L, false, 30, null);
                    boxFloat = Boxing.boxFloat(collapsedFraction(floatingToolbarState2) >= 0.5f ? 0.0f : floatingToolbarState2.getOffsetLimit());
                    function1 = new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit unit;
                            unit = FloatingToolbarKt.settleFloatingToolbar$lambda$1(FloatingToolbarState.this, (AnimationScope) obj2);
                            return unit;
                        }
                    };
                    floatingToolbarKt$settleFloatingToolbar$12.L$0 = floatRef;
                    floatingToolbarKt$settleFloatingToolbar$12.L$1 = null;
                    floatingToolbarKt$settleFloatingToolbar$12.L$2 = null;
                    floatingToolbarKt$settleFloatingToolbar$12.label = 2;
                    if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec3, false, function1, floatingToolbarKt$settleFloatingToolbar$12, 4, null) != coroutine_suspended) {
                        floatRef2 = floatRef;
                        floatRef = floatRef2;
                    }
                    return coroutine_suspended;
                }
                return Velocity.m9965boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
            }
        }
        floatingToolbarKt$settleFloatingToolbar$1 = new FloatingToolbarKt$settleFloatingToolbar$1(continuation);
        floatingToolbarKt$settleFloatingToolbar$12 = floatingToolbarKt$settleFloatingToolbar$1;
        Object obj2 = floatingToolbarKt$settleFloatingToolbar$12.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = floatingToolbarKt$settleFloatingToolbar$12.label;
        if (i != 0) {
        }
        animationSpec3 = animationSpec2;
        if (floatingToolbarState2.getOffset() < 0.0f) {
            AnimationState$default = AnimationStateKt.AnimationState$default(floatingToolbarState2.getOffset(), 0.0f, 0L, 0L, false, 30, null);
            boxFloat = Boxing.boxFloat(collapsedFraction(floatingToolbarState2) >= 0.5f ? 0.0f : floatingToolbarState2.getOffsetLimit());
            function1 = new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj22) {
                    Unit unit;
                    unit = FloatingToolbarKt.settleFloatingToolbar$lambda$1(FloatingToolbarState.this, (AnimationScope) obj22);
                    return unit;
                }
            };
            floatingToolbarKt$settleFloatingToolbar$12.L$0 = floatRef;
            floatingToolbarKt$settleFloatingToolbar$12.L$1 = null;
            floatingToolbarKt$settleFloatingToolbar$12.L$2 = null;
            floatingToolbarKt$settleFloatingToolbar$12.label = 2;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec3, false, function1, floatingToolbarKt$settleFloatingToolbar$12, 4, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        return Velocity.m9965boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit settleFloatingToolbar$lambda$0(Ref.FloatRef floatRef, FloatingToolbarState floatingToolbarState, Ref.FloatRef floatRef2, AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.getValue()).floatValue() - floatRef.element;
        float offset = floatingToolbarState.getOffset();
        floatingToolbarState.setOffset(offset + floatValue);
        float abs = Math.abs(offset - floatingToolbarState.getOffset());
        floatRef.element = ((Number) animationScope.getValue()).floatValue();
        floatRef2.element = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit settleFloatingToolbar$lambda$1(FloatingToolbarState floatingToolbarState, AnimationScope animationScope) {
        floatingToolbarState.setOffset(((Number) animationScope.getValue()).floatValue());
        return Unit.INSTANCE;
    }

    private static final float collapsedFraction(FloatingToolbarState floatingToolbarState) {
        if (floatingToolbarState.getOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return floatingToolbarState.getOffset() / floatingToolbarState.getOffsetLimit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HorizontalFloatingToolbarLayout-yndP2WQ, reason: not valid java name */
    public static final void m3252HorizontalFloatingToolbarLayoutyndP2WQ(final Modifier modifier, final boolean z, final Function1<? super Boolean, Unit> function1, final FloatingToolbarColors floatingToolbarColors, final PaddingValues paddingValues, final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, final Shape shape, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, final float f, final float f2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(1009218538);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalFloatingToolbarLayout)N(modifier,expanded,onA11yForceCollapse,colors,contentPadding,scrollBehavior,shape,leadingContent,trailingContent,expandedShadowElevation:c#ui.unit.Dp,collapsedShadowElevation:c#ui.unit.Dp,content)1594@74671L40,1595@74749L42,1596@74817L30,1600@75039L15,1598@74888L177,1609@75314L166,1602@75070L2966:FloatingToolbar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(floatingToolbarColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(floatingToolbarScrollBehavior) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changedInstance(function32) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(f) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(f2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function33) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute(((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1009218538, i3, i4, "androidx.compose.material3.HorizontalFloatingToolbarLayout (FloatingToolbar.kt:1593)");
            }
            Strings.Companion companion2 = Strings.INSTANCE;
            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_floating_toolbar_expand), startRestartGroup, 0);
            Strings.Companion companion3 = Strings.INSTANCE;
            final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_floating_toolbar_collapse), startRestartGroup, 0);
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), startRestartGroup, (i3 >> 3) & 14);
            int i5 = i3;
            final State<Dp> m227animateDpAsStateAjpBEmI = AnimateAsStateKt.m227animateDpAsStateAjpBEmI(z ? f : f2, FloatingToolbarDefaults.INSTANCE.animationSpec(startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
            if (floatingToolbarScrollBehavior == null || (companion = floatingToolbarScrollBehavior.floatingScrollBehavior(Modifier.INSTANCE)) == null) {
                companion = Modifier.INSTANCE;
            }
            Modifier then = modifier.then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -803556080, "CC(remember):FloatingToolbar.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m227animateDpAsStateAjpBEmI) | ((i5 & 3670016) == 1048576);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$3$0;
                        HorizontalFloatingToolbarLayout_yndP2WQ$lambda$3$0 = FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$3$0(Shape.this, m227animateDpAsStateAjpBEmI, (GraphicsLayerScope) obj);
                        return HorizontalFloatingToolbarLayout_yndP2WQ$lambda$3$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier padding = PaddingKt.padding(BackgroundKt.m352backgroundbw27NRU(SizeKt.m1259heightInVpY3zN4$default(GraphicsLayerModifierKt.graphicsLayer(then, (Function1) rememberedValue), FloatingToolbarDefaults.INSTANCE.m3203getContainerSizeD9Ej5fM(), 0.0f, 2, null), floatingToolbarColors.getToolbarContainerColor(), shape), paddingValues);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
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
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 670300710, "C1620@75879L2151,1620@75799L2231:FloatingToolbar.kt#uh7d8r");
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(floatingToolbarColors.getToolbarContentColor())), ComposableLambdaKt.rememberComposableLambda(-113592250, true, new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0;
                    HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0 = FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0(Function3.this, rememberUpdatedState, function1, m4895getString2EP1pXo, m4895getString2EP1pXo2, z, function32, function33, rowScopeInstance, (Composer) obj, ((Integer) obj2).intValue());
                    return HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0;
                }
            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$5;
                    HorizontalFloatingToolbarLayout_yndP2WQ$lambda$5 = FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$5(Modifier.this, z, function1, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, function3, function32, f, f2, function33, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HorizontalFloatingToolbarLayout_yndP2WQ$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$3$0(Shape shape, State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo528toPx0680j_4(HorizontalFloatingToolbarLayout_yndP2WQ$lambda$1(state)));
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0(final Function3 function3, final State state, final Function1 function1, final String str, final String str2, boolean z, final Function3 function32, Function3 function33, RowScope rowScope, Composer composer, int i) {
        int i2;
        Composer composer2 = composer;
        ComposerKt.sourceInformation(composer2, "C1632@76344L803,1652@77535L12,1630@76267L1378:FloatingToolbar.kt#uh7d8r");
        if (!composer2.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-113592250, i, -1, "androidx.compose.material3.HorizontalFloatingToolbarLayout.<anonymous>.<anonymous> (FloatingToolbar.kt:1621)");
            }
            if (function3 == null) {
                composer2.startReplaceGroup(407549954);
                composer2.endReplaceGroup();
                i2 = 0;
            } else {
                composer2.startReplaceGroup(407549955);
                ComposerKt.sourceInformation(composer2, "*1624@76024L55,1625@76108L55,1626@76183L57,1622@75931L309");
                i2 = 0;
                AnimatedVisibilityKt.AnimatedVisibility(rowScope, HorizontalFloatingToolbarLayout_yndP2WQ$lambda$0(state), (Modifier) null, FloatingToolbarDefaults.INSTANCE.horizontalEnterTransition(Alignment.INSTANCE.getStart(), composer2, 54), FloatingToolbarDefaults.INSTANCE.horizontalExitTransition(Alignment.INSTANCE.getEnd(), composer2, 54), (String) null, ComposableLambdaKt.rememberComposableLambda(-119614617, true, new Function3() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0;
                        HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0 = FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0(Function3.this, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0;
                    }
                }, composer2, 54), composer, 1572864, 18);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1787954167, "CC(remember):FloatingToolbar.kt#9igjgp");
            boolean changed = composer2.changed(state) | composer2.changed(function1) | composer2.changed(str) | composer2.changed(str2);
            Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0;
                        HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0 = FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0(str, str2, state, function1, (SemanticsPropertyReceiver) obj);
                        return HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0;
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier minimumInteractiveBalancedPadding = minimumInteractiveBalancedPadding(ChildParentSemanticsKt.parentSemantics(companion, (Function1) rememberedValue), (!z || function3 == null) ? i2 : 1, (!z || function32 == null) ? i2 : 1, MaterialTheme.INSTANCE.getMotionScheme(composer2, 6).defaultEffectsSpec());
            ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, i2);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i2));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, minimumInteractiveBalancedPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            function33.invoke(RowScopeInstance.INSTANCE, composer2, 6);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (function32 == null) {
                composer2.startReplaceGroup(409301826);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(409301827);
                ComposerKt.sourceInformation(composer2, "*1659@77790L53,1660@77872L57,1661@77949L57,1657@77697L309");
                AnimatedVisibilityKt.AnimatedVisibility(rowScope, HorizontalFloatingToolbarLayout_yndP2WQ$lambda$0(state), (Modifier) null, FloatingToolbarDefaults.INSTANCE.horizontalEnterTransition(Alignment.INSTANCE.getEnd(), composer2, 54), FloatingToolbarDefaults.INSTANCE.horizontalExitTransition(Alignment.INSTANCE.getStart(), composer2, 54), (String) null, ComposableLambdaKt.rememberComposableLambda(-1208541936, true, new Function3() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0;
                        HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0 = FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0(Function3.this, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0;
                    }
                }, composer2, 54), composer2, 1572864, 18);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0(Function3 function3, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1627@76205L17:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-119614617, i, -1, "androidx.compose.material3.HorizontalFloatingToolbarLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1627)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
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
        function3.invoke(RowScopeInstance.INSTANCE, composer, 6);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0(String str, String str2, State state, final Function1 function1, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, customToolbarActions(HorizontalFloatingToolbarLayout_yndP2WQ$lambda$0(state), new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0;
                HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0 = FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0(Function1.this);
                return Boolean.valueOf(HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0);
            }
        }, new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1;
                HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1 = FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1(Function1.this);
                return Boolean.valueOf(HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1);
            }
        }, str, str2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0(Function1 function1) {
        function1.invoke(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1(Function1 function1) {
        function1.invoke(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0(Function3 function3, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1662@77971L17:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1208541936, i, -1, "androidx.compose.material3.HorizontalFloatingToolbarLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1662)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
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
        function3.invoke(RowScopeInstance.INSTANCE, composer, 6);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HorizontalFloatingToolbarWithFabLayout-z3vpotQ, reason: not valid java name */
    public static final void m3253HorizontalFloatingToolbarWithFabLayoutz3vpotQ(final Modifier modifier, final boolean z, final Function1<? super Boolean, Unit> function1, final FloatingToolbarColors floatingToolbarColors, final float f, final PaddingValues paddingValues, final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, final Shape shape, final FiniteAnimationSpec<Float> finiteAnimationSpec, Function2<? super Composer, ? super Integer, Unit> function2, final int i, final float f2, final float f3, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        Object currentState;
        Modifier.Companion companion;
        final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        Composer startRestartGroup = composer.startRestartGroup(1184580879);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalFloatingToolbarWithFabLayout)N(modifier,expanded,onA11yForceCollapse,colors,toolbarToFabGap:c#ui.unit.Dp,toolbarContentPadding,scrollBehavior,toolbarShape,animationSpec,fab,fabPosition:c#material3.FloatingToolbarHorizontalFabPosition,expandedShadowElevation:c#ui.unit.Dp,collapsedShadowElevation:c#ui.unit.Dp,toolbar)1688@78780L68,1689@78893L55,1690@78984L40,1691@79062L42,1692@79130L30,1735@80865L2952,1693@79165L4652:FloatingToolbar.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(floatingToolbarColors) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(floatingToolbarScrollBehavior) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(finiteAnimationSpec) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(i) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changed(f3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        int i6 = i5;
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1184580879, i4, i6, "androidx.compose.material3.HorizontalFloatingToolbarWithFabLayout (FloatingToolbar.kt:1687)");
            }
            final Transition updateTransition = TransitionKt.updateTransition(Float.valueOf(z ? 1.0f : 0.0f), "expanded state", startRestartGroup, 48, 0);
            Function3 function32 = new Function3() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$0;
                    HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$0 = FloatingToolbarKt.HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$0(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$0;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                startRestartGroup.startReplaceGroup(1666827533);
                startRestartGroup.endReplaceGroup();
                currentState = updateTransition.getCurrentState();
            } else {
                startRestartGroup.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed = startRestartGroup.changed(updateTransition);
                currentState = startRestartGroup.rememberedValue();
                if (changed || currentState == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion2 = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot = companion2.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = companion2.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState2 = updateTransition.getCurrentState();
                        companion2.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState2);
                        currentState = currentState2;
                    } catch (Throwable th) {
                        companion2.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            float floatValue = ((Number) currentState).floatValue();
            startRestartGroup.startReplaceGroup(-1645362842);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):FloatingToolbar.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1645362842, 0, -1, "androidx.compose.material3.HorizontalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1689)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf = Float.valueOf(floatValue);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(updateTransition);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout-z3vpotQ$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Float, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float floatValue2 = ((Number) ((State) rememberedValue).getValue()).floatValue();
            startRestartGroup.startReplaceGroup(-1645362842);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):FloatingToolbar.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1645362842, 0, -1, "androidx.compose.material3.HorizontalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1689)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf2 = Float.valueOf(floatValue2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(updateTransition);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Float>>() { // from class: androidx.compose.material3.FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout-z3vpotQ$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<Float> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, (FiniteAnimationSpec) function32.invoke(((State) rememberedValue2).getValue(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Strings.Companion companion3 = Strings.INSTANCE;
            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_floating_toolbar_expand), composer2, 0);
            Strings.Companion companion4 = Strings.INSTANCE;
            final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_floating_toolbar_collapse), composer2, 0);
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer2, (i4 >> 3) & 14);
            Modifier m1256defaultMinSizeVpY3zN4$default = SizeKt.m1256defaultMinSizeVpY3zN4$default(modifier, 0.0f, FloatingToolbarDefaults.INSTANCE.getFabSizeRange$material3().getEndInclusive().m9746unboximpl(), 1, null);
            if (floatingToolbarScrollBehavior == null || (companion = floatingToolbarScrollBehavior.floatingScrollBehavior(Modifier.INSTANCE)) == null) {
                companion = Modifier.INSTANCE;
            }
            Modifier then = m1256defaultMinSizeVpY3zN4$default.then(companion);
            ComposerKt.sourceInformationMarkerStart(composer2, 215979927, "CC(remember):FloatingToolbar.kt#9igjgp");
            boolean changed4 = ((i6 & 112) == 32) | composer2.changed(createTransitionAnimation) | ((57344 & i4) == 16384) | ((i6 & 14) == 4) | ((i6 & 896) == 256) | ((29360128 & i4) == 8388608);
            FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1 rememberedValue3 = composer2.rememberedValue();
            if (changed4 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1(createTransitionAnimation, f, i, f3, f2, shape);
                composer2.updateRememberedValue(rememberedValue3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, then);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -554035591, "C1699@79395L21,1695@79195L463,1708@79748L743,1706@79671L872:FloatingToolbar.kt#uh7d8r");
            Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(PaddingKt.padding(BackgroundKt.m353backgroundbw27NRU$default(Modifier.INSTANCE, floatingToolbarColors.getToolbarContainerColor(), null, 2, null), paddingValues), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, horizontalScroll$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -2008176520, "C1702@79595L49,1702@79515L129:FloatingToolbar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(floatingToolbarColors.getToolbarContentColor())), ComposableLambdaKt.rememberComposableLambda(-1494029974, true, new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$0$0;
                    HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$0$0 = FloatingToolbarKt.HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$0$0(Function3.this, rowScopeInstance, (Composer) obj, ((Integer) obj2).intValue());
                    return HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$0$0;
                }
            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 2060354957, "CC(remember):FloatingToolbar.kt#9igjgp");
            boolean changed5 = composer2.changed(rememberUpdatedState) | ((i4 & 896) == 256) | composer2.changed(m4895getString2EP1pXo) | composer2.changed(m4895getString2EP1pXo2);
            Object rememberedValue4 = composer2.rememberedValue();
            if (changed5 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0;
                        HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0 = FloatingToolbarKt.HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0(m4895getString2EP1pXo, m4895getString2EP1pXo2, rememberUpdatedState, function1, (SemanticsPropertyReceiver) obj);
                        return HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0;
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier parentSemantics = ChildParentSemanticsKt.parentSemantics(companion5, (Function1) rememberedValue4);
            ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, parentSemantics);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl3 = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 403896850, "C1725@80524L5:FloatingToolbar.kt#uh7d8r");
            function22 = function2;
            function22.invoke(composer2, Integer.valueOf((i4 >> 27) & 14));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$6;
                    HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$6 = FloatingToolbarKt.HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$6(Modifier.this, z, function1, floatingToolbarColors, f, paddingValues, floatingToolbarScrollBehavior, shape, finiteAnimationSpec, function22, i, f2, f3, function3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-1765630817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1765630817, i, -1, "androidx.compose.material3.HorizontalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1689)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$0$0(Function3 function3, RowScope rowScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1703@79617L9:FloatingToolbar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1494029974, i, -1, "androidx.compose.material3.HorizontalFloatingToolbarWithFabLayout.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1703)");
            }
            function3.invoke(rowScope, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0(String str, String str2, State state, final Function1 function1, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, customToolbarActions(HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$2(state), new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$0;
                HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$0 = FloatingToolbarKt.HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$0(Function1.this);
                return Boolean.valueOf(HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$0);
            }
        }, new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$1;
                HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$1 = FloatingToolbarKt.HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$1(Function1.this);
                return Boolean.valueOf(HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$1);
            }
        }, str, str2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$0(Function1 function1) {
        function1.invoke(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$1(Function1 function1) {
        function1.invoke(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VerticalFloatingToolbarLayout-yndP2WQ, reason: not valid java name */
    public static final void m3256VerticalFloatingToolbarLayoutyndP2WQ(final Modifier modifier, final boolean z, final Function1<? super Boolean, Unit> function1, final FloatingToolbarColors floatingToolbarColors, final PaddingValues paddingValues, final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, final Shape shape, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, final float f, final float f2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-1640070852);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalFloatingToolbarLayout)N(modifier,expanded,onA11yForceCollapse,colors,contentPadding,scrollBehavior,shape,leadingContent,trailingContent,expandedShadowElevation:c#ui.unit.Dp,collapsedShadowElevation:c#ui.unit.Dp,content)1825@84480L40,1826@84558L42,1827@84626L30,1831@84848L15,1829@84697L177,1841@85127L166,1834@84880L2973:FloatingToolbar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(floatingToolbarColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(floatingToolbarScrollBehavior) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changedInstance(function32) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(f) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(f2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function33) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute(((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1640070852, i3, i4, "androidx.compose.material3.VerticalFloatingToolbarLayout (FloatingToolbar.kt:1824)");
            }
            Strings.Companion companion2 = Strings.INSTANCE;
            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_floating_toolbar_expand), startRestartGroup, 0);
            Strings.Companion companion3 = Strings.INSTANCE;
            final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_floating_toolbar_collapse), startRestartGroup, 0);
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), startRestartGroup, (i3 >> 3) & 14);
            int i5 = i3;
            final State<Dp> m227animateDpAsStateAjpBEmI = AnimateAsStateKt.m227animateDpAsStateAjpBEmI(z ? f : f2, FloatingToolbarDefaults.INSTANCE.animationSpec(startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
            if (floatingToolbarScrollBehavior == null || (companion = floatingToolbarScrollBehavior.floatingScrollBehavior(Modifier.INSTANCE)) == null) {
                companion = Modifier.INSTANCE;
            }
            Modifier then = modifier.then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 144947010, "CC(remember):FloatingToolbar.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m227animateDpAsStateAjpBEmI) | ((i5 & 3670016) == 1048576);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$3$0;
                        VerticalFloatingToolbarLayout_yndP2WQ$lambda$3$0 = FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$3$0(Shape.this, m227animateDpAsStateAjpBEmI, (GraphicsLayerScope) obj);
                        return VerticalFloatingToolbarLayout_yndP2WQ$lambda$3$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier padding = PaddingKt.padding(BackgroundKt.m352backgroundbw27NRU(SizeKt.m1278widthInVpY3zN4$default(GraphicsLayerModifierKt.graphicsLayer(then, (Function1) rememberedValue), FloatingToolbarDefaults.INSTANCE.m3203getContainerSizeD9Ej5fM(), 0.0f, 2, null), floatingToolbarColors.getToolbarContainerColor(), shape), paddingValues);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
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
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 543337219, "C1852@85693L2154,1852@85613L2234:FloatingToolbar.kt#uh7d8r");
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(floatingToolbarColors.getToolbarContentColor())), ComposableLambdaKt.rememberComposableLambda(-2087045178, true, new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0;
                    VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0 = FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0(Function3.this, rememberUpdatedState, function1, m4895getString2EP1pXo, m4895getString2EP1pXo2, z, function32, function33, columnScopeInstance, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0;
                }
            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$5;
                    VerticalFloatingToolbarLayout_yndP2WQ$lambda$5 = FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$5(Modifier.this, z, function1, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, function3, function32, f, f2, function33, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalFloatingToolbarLayout_yndP2WQ$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$3$0(Shape shape, State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo528toPx0680j_4(VerticalFloatingToolbarLayout_yndP2WQ$lambda$1(state)));
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0(final Function3 function3, final State state, final Function1 function1, final String str, final String str2, boolean z, final Function3 function32, Function3 function33, ColumnScope columnScope, Composer composer, int i) {
        int i2;
        Composer composer2 = composer;
        ComposerKt.sourceInformation(composer2, "C1864@86164L803,1884@87355L12,1862@86084L1381:FloatingToolbar.kt#uh7d8r");
        if (!composer2.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2087045178, i, -1, "androidx.compose.material3.VerticalFloatingToolbarLayout.<anonymous>.<anonymous> (FloatingToolbar.kt:1853)");
            }
            if (function3 == null) {
                composer2.startReplaceGroup(-1216280353);
                composer2.endReplaceGroup();
                i2 = 0;
            } else {
                composer2.startReplaceGroup(-1216280352);
                ComposerKt.sourceInformation(composer2, "*1856@85838L54,1857@85921L56,1858@85997L60,1854@85745L312");
                i2 = 0;
                AnimatedVisibilityKt.AnimatedVisibility(columnScope, VerticalFloatingToolbarLayout_yndP2WQ$lambda$0(state), (Modifier) null, FloatingToolbarDefaults.INSTANCE.verticalEnterTransition(Alignment.INSTANCE.getBottom(), composer2, 54), FloatingToolbarDefaults.INSTANCE.verticalExitTransition(Alignment.INSTANCE.getBottom(), composer2, 54), (String) null, ComposableLambdaKt.rememberComposableLambda(-1886791065, true, new Function3() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0;
                        VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0 = FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0(Function3.this, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0;
                    }
                }, composer2, 54), composer, 1572864, 18);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 99327049, "CC(remember):FloatingToolbar.kt#9igjgp");
            boolean changed = composer2.changed(state) | composer2.changed(function1) | composer2.changed(str) | composer2.changed(str2);
            Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0;
                        VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0 = FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0(str, str2, state, function1, (SemanticsPropertyReceiver) obj);
                        return VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0;
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier minimumInteractiveBalancedPadding = minimumInteractiveBalancedPadding(ChildParentSemanticsKt.parentSemantics(companion, (Function1) rememberedValue), (!z || function3 == null) ? i2 : 1, (!z || function32 == null) ? i2 : 1, MaterialTheme.INSTANCE.getMotionScheme(composer2, 6).defaultEffectsSpec());
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, i2);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i2));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, minimumInteractiveBalancedPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            function33.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (function32 == null) {
                composer2.startReplaceGroup(-1214522715);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1214522714);
                ComposerKt.sourceInformation(composer2, "*1891@87610L51,1892@87690L53,1893@87763L60,1889@87517L306");
                AnimatedVisibilityKt.AnimatedVisibility(columnScope, VerticalFloatingToolbarLayout_yndP2WQ$lambda$0(state), (Modifier) null, FloatingToolbarDefaults.INSTANCE.verticalEnterTransition(Alignment.INSTANCE.getTop(), composer2, 54), FloatingToolbarDefaults.INSTANCE.verticalExitTransition(Alignment.INSTANCE.getTop(), composer2, 54), (String) null, ComposableLambdaKt.rememberComposableLambda(279127952, true, new Function3() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0;
                        VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0 = FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0(Function3.this, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0;
                    }
                }, composer2, 54), composer2, 1572864, 18);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0(Function3 function3, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1859@86019L20:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1886791065, i, -1, "androidx.compose.material3.VerticalFloatingToolbarLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1859)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
        Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        function3.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0(String str, String str2, State state, final Function1 function1, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, customToolbarActions(VerticalFloatingToolbarLayout_yndP2WQ$lambda$0(state), new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0;
                VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0 = FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0(Function1.this);
                return Boolean.valueOf(VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0);
            }
        }, new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1;
                VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1 = FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1(Function1.this);
                return Boolean.valueOf(VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1);
            }
        }, str, str2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0(Function1 function1) {
        function1.invoke(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1(Function1 function1) {
        function1.invoke(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0(Function3 function3, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1894@87785L20:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(279127952, i, -1, "androidx.compose.material3.VerticalFloatingToolbarLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1894)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
        Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        function3.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VerticalFloatingToolbarWithFabLayout-Nur2B3k, reason: not valid java name */
    public static final void m3257VerticalFloatingToolbarWithFabLayoutNur2B3k(final Modifier modifier, final boolean z, final Function1<? super Boolean, Unit> function1, final FloatingToolbarColors floatingToolbarColors, final float f, final PaddingValues paddingValues, final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, final Shape shape, final FiniteAnimationSpec<Float> finiteAnimationSpec, Function2<? super Composer, ? super Integer, Unit> function2, final int i, final float f2, final float f3, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        Object currentState;
        Modifier.Companion companion;
        final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        Composer startRestartGroup = composer.startRestartGroup(-1909369813);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalFloatingToolbarWithFabLayout)N(modifier,expanded,onA11yForceCollapse,colors,toolbarToFabGap:c#ui.unit.Dp,toolbarContentPadding,scrollBehavior,toolbarShape,animationSpec,fab,fabPosition:c#material3.FloatingToolbarVerticalFabPosition,expandedShadowElevation:c#ui.unit.Dp,collapsedShadowElevation:c#ui.unit.Dp,toolbar)1920@88601L68,1921@88714L55,1922@88805L40,1923@88883L42,1924@88951L30,1967@90685L2996,1925@88986L4695:FloatingToolbar.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(floatingToolbarColors) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(floatingToolbarScrollBehavior) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(finiteAnimationSpec) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(i) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changed(f3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        int i6 = i5;
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1909369813, i4, i6, "androidx.compose.material3.VerticalFloatingToolbarWithFabLayout (FloatingToolbar.kt:1919)");
            }
            final Transition updateTransition = TransitionKt.updateTransition(Float.valueOf(z ? 1.0f : 0.0f), "expanded state", startRestartGroup, 48, 0);
            Function3 function32 = new Function3() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$0;
                    VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$0 = FloatingToolbarKt.VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$0(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$0;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                startRestartGroup.startReplaceGroup(1666827533);
                startRestartGroup.endReplaceGroup();
                currentState = updateTransition.getCurrentState();
            } else {
                startRestartGroup.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed = startRestartGroup.changed(updateTransition);
                currentState = startRestartGroup.rememberedValue();
                if (changed || currentState == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion2 = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot = companion2.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = companion2.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState2 = updateTransition.getCurrentState();
                        companion2.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState2);
                        currentState = currentState2;
                    } catch (Throwable th) {
                        companion2.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            float floatValue = ((Number) currentState).floatValue();
            startRestartGroup.startReplaceGroup(1541772290);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):FloatingToolbar.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1541772290, 0, -1, "androidx.compose.material3.VerticalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1921)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf = Float.valueOf(floatValue);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(updateTransition);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout-Nur2B3k$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Float, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float floatValue2 = ((Number) ((State) rememberedValue).getValue()).floatValue();
            startRestartGroup.startReplaceGroup(1541772290);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):FloatingToolbar.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1541772290, 0, -1, "androidx.compose.material3.VerticalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1921)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf2 = Float.valueOf(floatValue2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(updateTransition);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Float>>() { // from class: androidx.compose.material3.FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout-Nur2B3k$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<Float> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, (FiniteAnimationSpec) function32.invoke(((State) rememberedValue2).getValue(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Strings.Companion companion3 = Strings.INSTANCE;
            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_floating_toolbar_expand), composer2, 0);
            Strings.Companion companion4 = Strings.INSTANCE;
            final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_floating_toolbar_collapse), composer2, 0);
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer2, (i4 >> 3) & 14);
            Modifier m1256defaultMinSizeVpY3zN4$default = SizeKt.m1256defaultMinSizeVpY3zN4$default(modifier, FloatingToolbarDefaults.INSTANCE.getFabSizeRange$material3().getEndInclusive().m9746unboximpl(), 0.0f, 2, null);
            if (floatingToolbarScrollBehavior == null || (companion = floatingToolbarScrollBehavior.floatingScrollBehavior(Modifier.INSTANCE)) == null) {
                companion = Modifier.INSTANCE;
            }
            Modifier then = m1256defaultMinSizeVpY3zN4$default.then(companion);
            ComposerKt.sourceInformationMarkerStart(composer2, -953266273, "CC(remember):FloatingToolbar.kt#9igjgp");
            boolean changed4 = ((i6 & 112) == 32) | composer2.changed(createTransitionAnimation) | ((57344 & i4) == 16384) | ((i6 & 14) == 4) | ((i6 & 896) == 256) | ((29360128 & i4) == 8388608);
            FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1 rememberedValue3 = composer2.rememberedValue();
            if (changed4 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1(createTransitionAnimation, f, i, f3, f2, shape);
                composer2.updateRememberedValue(rememberedValue3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, then);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -389743011, "C1931@89217L21,1927@89016L468,1940@89574L738,1938@89497L867:FloatingToolbar.kt#uh7d8r");
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(BackgroundKt.m353backgroundbw27NRU$default(Modifier.INSTANCE, floatingToolbarColors.getToolbarContainerColor(), null, 2, null), paddingValues), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, verticalScroll$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1967841162, "C1934@89421L49,1934@89341L129:FloatingToolbar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(floatingToolbarColors.getToolbarContentColor())), ComposableLambdaKt.rememberComposableLambda(-845993064, true, new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$0$0;
                    VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$0$0 = FloatingToolbarKt.VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$0$0(Function3.this, columnScopeInstance, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$0$0;
                }
            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1372918212, "CC(remember):FloatingToolbar.kt#9igjgp");
            boolean changed5 = composer2.changed(rememberUpdatedState) | ((i4 & 896) == 256) | composer2.changed(m4895getString2EP1pXo) | composer2.changed(m4895getString2EP1pXo2);
            Object rememberedValue4 = composer2.rememberedValue();
            if (changed5 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0;
                        VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0 = FloatingToolbarKt.VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0(m4895getString2EP1pXo, m4895getString2EP1pXo2, rememberUpdatedState, function1, (SemanticsPropertyReceiver) obj);
                        return VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0;
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier parentSemantics = ChildParentSemanticsKt.parentSemantics(companion5, (Function1) rememberedValue4);
            ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, parentSemantics);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl3 = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1665814262, "C1957@90345L5:FloatingToolbar.kt#uh7d8r");
            function22 = function2;
            function22.invoke(composer2, Integer.valueOf((i4 >> 27) & 14));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$6;
                    VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$6 = FloatingToolbarKt.VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$6(Modifier.this, z, function1, floatingToolbarColors, f, paddingValues, floatingToolbarScrollBehavior, shape, finiteAnimationSpec, function22, i, f2, f3, function3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(240317371);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(240317371, i, -1, "androidx.compose.material3.VerticalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1921)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$0$0(Function3 function3, ColumnScope columnScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1935@89443L9:FloatingToolbar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-845993064, i, -1, "androidx.compose.material3.VerticalFloatingToolbarWithFabLayout.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1935)");
            }
            function3.invoke(columnScope, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0(String str, String str2, State state, final Function1 function1, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, customToolbarActions(VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$2(state), new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$0;
                VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$0 = FloatingToolbarKt.VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$0(Function1.this);
                return Boolean.valueOf(VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$0);
            }
        }, new Function0() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$1;
                VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$1 = FloatingToolbarKt.VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$1(Function1.this);
                return Boolean.valueOf(VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$1);
            }
        }, str, str2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$0(Function1 function1) {
        function1.invoke(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$1(Function1 function1) {
        function1.invoke(true);
        return true;
    }

    private static final Modifier minimumInteractiveBalancedPadding(Modifier modifier, boolean z, boolean z2, AnimationSpec<Float> animationSpec) {
        return modifier.then(new MinimumInteractiveBalancedPaddingElement(z, z2, animationSpec));
    }

    private static final List<CustomAccessibilityAction> customToolbarActions(boolean z, Function0<Boolean> function0, Function0<Boolean> function02, String str, String str2) {
        CustomAccessibilityAction customAccessibilityAction;
        if (z) {
            customAccessibilityAction = new CustomAccessibilityAction(str2, function02);
        } else {
            customAccessibilityAction = new CustomAccessibilityAction(str, function0);
        }
        return CollectionsKt.listOf(customAccessibilityAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lerp(ClosedRange<Dp> closedRange, float f) {
        return DpKt.m9775lerpMdfbLM(closedRange.getStart().m9746unboximpl(), closedRange.getEndInclusive().m9746unboximpl(), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Boolean> rememberTouchExplorationService(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1073697211, "C(rememberTouchExplorationService)2184@99618L171:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1073697211, i, -1, "androidx.compose.material3.rememberTouchExplorationService (FloatingToolbar.kt:2184)");
        }
        State<Boolean> rememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(true, false, false, composer, 438, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return rememberAccessibilityServiceState;
    }

    public static final ProvidableCompositionLocal<HorizontalFloatingToolbarOverride> getLocalHorizontalFloatingToolbarOverride() {
        return LocalHorizontalFloatingToolbarOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HorizontalFloatingToolbarOverride LocalHorizontalFloatingToolbarOverride$lambda$0() {
        return DefaultHorizontalFloatingToolbarOverride.INSTANCE;
    }

    public static final ProvidableCompositionLocal<HorizontalFloatingToolbarWithFabOverride> getLocalHorizontalFloatingToolbarWithFabOverride() {
        return LocalHorizontalFloatingToolbarWithFabOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HorizontalFloatingToolbarWithFabOverride LocalHorizontalFloatingToolbarWithFabOverride$lambda$0() {
        return DefaultHorizontalFloatingToolbarWithFabOverride.INSTANCE;
    }

    public static final ProvidableCompositionLocal<VerticalFloatingToolbarOverride> getLocalVerticalToolbarOverride() {
        return LocalVerticalToolbarOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerticalFloatingToolbarOverride LocalVerticalToolbarOverride$lambda$0() {
        return DefaultVerticalFloatingToolbarOverride.INSTANCE;
    }

    public static final ProvidableCompositionLocal<VerticalFloatingToolbarWithFabOverride> getLocalVerticalToolbarWithFabOverride() {
        return LocalVerticalToolbarWithFabOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerticalFloatingToolbarWithFabOverride LocalVerticalToolbarWithFabOverride$lambda$0() {
        return DefaultVerticalFloatingToolbarWithFabOverride.INSTANCE;
    }

    private static final boolean HorizontalFloatingToolbarLayout_yndP2WQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final float HorizontalFloatingToolbarLayout_yndP2WQ$lambda$1(State<Dp> state) {
        return state.getValue().m9746unboximpl();
    }

    private static final boolean HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean VerticalFloatingToolbarLayout_yndP2WQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final float VerticalFloatingToolbarLayout_yndP2WQ$lambda$1(State<Dp> state) {
        return state.getValue().m9746unboximpl();
    }

    private static final boolean VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
