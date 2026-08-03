package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.DragGestureDetectorCopyKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.PointerIconCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a³\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0007¢\u0006\u0002\u0010\u0019\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u001b\u001a}\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u001e\u001a\u007f\u0010\u001f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001aä\u0001\u0010\u001f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020\u00132\u0019\b\u0002\u0010#\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\b\b\u0003\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010&\u001a\u0098\u0001\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020$2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020\u00132\u0019\b\u0002\u0010#\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010'\u001a_\u0010(\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0017H\u0003¢\u0006\u0002\u0010)\u001an\u0010*\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0002\u001an\u0010/\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00010\u00052\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fH\u0002\u001a\u0080\u0001\u00104\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00132\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0017H\u0003¢\u0006\u0002\u00105\u001a?\u00106\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u00107\u001a\u0002082\u0006\u0010.\u001a\u00020\tH\u0003¢\u0006\u0004\b9\u0010:\u001a(\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u0003H\u0002\u001a2\u0010A\u001a\u0010\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u0003\u0018\u00010B*\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0082@¢\u0006\u0004\bI\u0010J\u001a\u0010\u0010K\u001a\u00020>2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a0\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u0003H\u0002\u001a?\u0010L\u001a\u0002032\u0006\u0010R\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u00032\u0006\u0010S\u001a\u0002032\u0006\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u0003H\u0002¢\u0006\u0004\bT\u0010U\u001a \u0010V\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u00032\u0006\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u0003H\u0002\u001a\u001c\u0010Z\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u001c\u0010[\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u001c\u0010\\\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\f\u0010]\u001a\u00020^*\u00020\u0003H\u0002\u001a$\u0010_\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0003\u001a,\u0010`\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0003\u001aC\u0010n\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0007¢\u0006\u0002\u0010o\u001aM\u0010p\u001a\u00020$2\b\b\u0002\u0010q\u001a\u00020\u00032\b\b\u0002\u0010r\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0007¢\u0006\u0002\u0010s\u001a\u001d\u0010t\u001a\u0002032\u0006\u0010u\u001a\u00020\u00032\u0006\u0010v\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010w\u001a\u001b\u0010t\u001a\u0002032\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0001¢\u0006\u0002\u0010y\"\u0016\u0010a\u001a\u00020bX\u0080\u0004¢\u0006\n\n\u0002\u0010e\u001a\u0004\bc\u0010d\"\u0016\u0010f\u001a\u00020bX\u0080\u0004¢\u0006\n\n\u0002\u0010e\u001a\u0004\bg\u0010d\"\u0010\u0010h\u001a\u00020bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010e\"\u0010\u0010i\u001a\u000208X\u0082\u0004¢\u0006\u0004\n\u0002\u0010j\"\u0010\u0010k\u001a\u000208X\u0082\u0004¢\u0006\u0004\n\u0002\u0010j\"\u0010\u0010l\u001a\u00020bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010e\"\u0010\u0010m\u001a\u00020bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010e\"\u001e\u0010z\u001a\u00020\t*\u0002038@X\u0081\u0004¢\u0006\f\u0012\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0017\u0010\u007f\u001a\u00030\u0080\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0083\u0001"}, d2 = {"Slider", "", "value", "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "colors", "Landroidx/compose/material3/SliderColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "thumb", "Landroidx/compose/material3/SliderState;", "Landroidx/compose/runtime/Composable;", "track", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/Composer;III)V", "state", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "VerticalSlider", "reverseDirection", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "RangeSlider", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "startInteractionSource", "endInteractionSource", "startThumb", "Landroidx/compose/material3/RangeSliderState;", "endThumb", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "slideOnKeyEvents", "onValueChangeState", "onValueChangeFinishedState", "isRtl", "isVertical", "rangeSliderOnKeyEvents", "valueStart", "valueEnd", "isStartThumb", "Landroidx/compose/material3/SliderRange;", "RangeSliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Thumb", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJZLandroidx/compose/runtime/Composer;I)V", "snapValueToTick", "current", "tickFractions", "", "minPx", "maxPx", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stepsToTickFractions", "scale", "a1", "b1", "x1", "a2", "b2", "isStart", "x", "scale-2geJ7wY", "(ZFFJFF)J", "calcFraction", "a", "b", "pos", "sliderSemantics", "rangeSliderStartThumbSemantics", "rangeSliderEndThumbSemantics", "formatForSemantics", "", "sliderTapModifier", "rangeSliderPressDragModifier", "TrackHeight", "Landroidx/compose/ui/unit/Dp;", "getTrackHeight", "()F", "F", "ThumbWidth", "getThumbWidth", "ThumbHeight", "ThumbSize", "J", "VerticalThumbSize", "ThumbTrackGapSize", "TrackInsideCornerSize", "rememberSliderState", "(FILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SliderState;", "rememberRangeSliderState", "activeRangeStart", "activeRangeEnd", "(FFILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RangeSliderState;", "SliderRange", "start", "endInclusive", "(FF)J", "range", "(Lkotlin/ranges/ClosedFloatingPointRange;)J", "isSpecified", "isSpecified-If1S1O4$annotations", "(J)V", "isSpecified-If1S1O4", "(J)Z", "CornerSizeAlignmentLine", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "getCornerSizeAlignmentLine", "()Landroidx/compose/ui/layout/VerticalAlignmentLine;", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SliderKt {
    private static final VerticalAlignmentLine CornerSizeAlignmentLine;
    private static final float ThumbHeight;
    private static final long ThumbSize;
    private static final float ThumbTrackGapSize;
    private static final float ThumbWidth;
    private static final float TrackHeight = SliderTokens.INSTANCE.m5579getInactiveTrackHeightD9Ej5fM();
    private static final float TrackInsideCornerSize;
    private static final long VerticalThumbSize;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$13(ClosedFloatingPointRange closedFloatingPointRange, Function1 function1, Modifier modifier, boolean z, ClosedFloatingPointRange closedFloatingPointRange2, Function0 function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3 function3, Function3 function32, Function3 function33, int i, int i2, int i3, int i4, Composer composer, int i5) {
        RangeSlider(closedFloatingPointRange, function1, modifier, z, closedFloatingPointRange2, function0, sliderColors, mutableInteractionSource, mutableInteractionSource2, function3, function32, function33, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$20(RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3 function3, Function3 function32, Function3 function33, int i, int i2, Composer composer, int i3) {
        RangeSlider(rangeSliderState, modifier, z, sliderColors, mutableInteractionSource, mutableInteractionSource2, function3, function32, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$5(ClosedFloatingPointRange closedFloatingPointRange, Function1 function1, Modifier modifier, boolean z, ClosedFloatingPointRange closedFloatingPointRange2, int i, Function0 function0, SliderColors sliderColors, int i2, int i3, Composer composer, int i4) {
        RangeSlider(closedFloatingPointRange, function1, modifier, z, closedFloatingPointRange2, i, function0, sliderColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$2(Modifier modifier, RangeSliderState rangeSliderState, boolean z, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3 function3, Function3 function32, Function3 function33, int i, Composer composer, int i2) {
        RangeSliderImpl(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource2, function3, function32, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$13(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        Slider(sliderState, modifier, z, sliderColors, mutableInteractionSource, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$3(float f, Function1 function1, Modifier modifier, boolean z, ClosedFloatingPointRange closedFloatingPointRange, int i, Function0 function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        Slider(f, function1, modifier, z, closedFloatingPointRange, i, function0, sliderColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$8(float f, Function1 function1, Modifier modifier, boolean z, Function0 function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i, Function3 function3, Function3 function32, ClosedFloatingPointRange closedFloatingPointRange, int i2, int i3, int i4, Composer composer, int i5) {
        Slider(f, function1, modifier, z, function0, sliderColors, mutableInteractionSource, i, function3, function32, closedFloatingPointRange, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SliderImpl$lambda$4(Modifier modifier, SliderState sliderState, boolean z, MutableInteractionSource mutableInteractionSource, Function3 function3, Function3 function32, int i, Composer composer, int i2) {
        SliderImpl(modifier, sliderState, z, mutableInteractionSource, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Thumb_9LiSoMs$lambda$2(MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, boolean z2, int i, Composer composer, int i2) {
        m4022Thumb9LiSoMs(mutableInteractionSource, modifier, sliderColors, z, j, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalSlider$lambda$4(SliderState sliderState, Modifier modifier, boolean z, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        VerticalSlider(sliderState, modifier, z, z2, sliderColors, mutableInteractionSource, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: isSpecified-If1S1O4$annotations, reason: not valid java name */
    public static /* synthetic */ void m4028isSpecifiedIf1S1O4$annotations(long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final Function1<? super Float, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function02;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final SliderColors sliderColors2;
        final Modifier modifier3;
        final boolean z3;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        final int i12;
        final Function0<Unit> function03;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i13;
        final SliderColors sliderColors3;
        final MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        int i14;
        Function0<Unit> function04;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(-202044027);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)N(value,onValueChange,modifier,enabled,valueRange,steps,onValueChangeFinished,colors,interactionSource)202@9711L182,209@9911L122,193@9419L654:Slider.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        if (startRestartGroup.changed(closedFloatingPointRange2)) {
                            i17 = 16384;
                            i4 |= i17;
                        }
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i17 = 8192;
                    i4 |= i17;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((1572864 & i2) == 0) {
                        function02 = function0;
                        i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & 128) == 0 && startRestartGroup.changed(sliderColors)) {
                                i16 = 8388608;
                                i4 |= i16;
                            }
                            i16 = 4194304;
                            i4 |= i16;
                        }
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i10 = i9;
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                            i11 = i4;
                            if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "190@9310L8,191@9370L39");
                                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i18 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i5 != 0) {
                                        z2 = true;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i13 = i11 & (-57345);
                                        closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                                    } else {
                                        i13 = i11;
                                    }
                                    if (i6 != 0) {
                                        i7 = 0;
                                    }
                                    if (i8 != 0) {
                                        function02 = null;
                                    }
                                    if ((i3 & 128) != 0) {
                                        sliderColors3 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        i13 = (-29360129) & i13;
                                    } else {
                                        sliderColors3 = sliderColors;
                                    }
                                    if (i10 != 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -890769460, "CC(remember):Slider.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                    modifier4 = modifier2;
                                    closedFloatingPointRange4 = closedFloatingPointRange2;
                                    i14 = i7;
                                    function04 = function02;
                                    i15 = -202044027;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    int i19 = (i3 & 16) != 0 ? i11 & (-57345) : i11;
                                    if ((i3 & 128) != 0) {
                                        i19 &= -29360129;
                                    }
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    i13 = i19;
                                    modifier4 = modifier2;
                                    closedFloatingPointRange4 = closedFloatingPointRange2;
                                    i14 = i7;
                                    function04 = function02;
                                    i15 = -202044027;
                                    sliderColors3 = sliderColors;
                                }
                                final boolean z4 = z2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i15, i13, -1, "androidx.compose.material3.Slider (Slider.kt:192)");
                                }
                                int i20 = i13 >> 6;
                                SliderColors sliderColors4 = sliderColors3;
                                composer2 = startRestartGroup;
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                Slider(f, function1, modifier4, z4, function04, sliderColors4, mutableInteractionSource4, i14, ComposableLambdaKt.rememberComposableLambda(308249025, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda26
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        Unit Slider$lambda$1;
                                        Slider$lambda$1 = SliderKt.Slider$lambda$1(MutableInteractionSource.this, sliderColors3, z4, (SliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                        return Slider$lambda$1;
                                    }
                                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda27
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        Unit Slider$lambda$2;
                                        Slider$lambda$2 = SliderKt.Slider$lambda$2(z4, sliderColors3, (SliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                        return Slider$lambda$2;
                                    }
                                }, startRestartGroup, 54), closedFloatingPointRange4, composer2, (i13 & 14) | 905969664 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i20) | (458752 & i20) | (i20 & 3670016) | ((i13 << 6) & 29360128), (i13 >> 12) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z3 = z4;
                                function03 = function04;
                                sliderColors2 = sliderColors4;
                                mutableInteractionSource2 = mutableInteractionSource4;
                                i12 = i14;
                                closedFloatingPointRange3 = closedFloatingPointRange4;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                sliderColors2 = sliderColors;
                                modifier3 = modifier2;
                                z3 = z2;
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                                i12 = i7;
                                function03 = function02;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda28
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Slider$lambda$3;
                                        Slider$lambda$3 = SliderKt.Slider$lambda$3(f, function1, modifier3, z3, closedFloatingPointRange3, i12, function03, sliderColors2, mutableInteractionSource2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return Slider$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i10 = i9;
                        i11 = i4;
                        if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function02 = function0;
                    if ((i2 & 12582912) == 0) {
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                function02 = function0;
                if ((i2 & 12582912) == 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            function02 = function0;
            if ((i2 & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        function02 = function0;
        if ((i2 & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$1(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, SliderState sliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(it)203@9740L143:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(308249025, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:203)");
        }
        SliderDefaults.INSTANCE.m3992Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$2(boolean z, SliderColors sliderColors, SliderState sliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(sliderState)210@9955L68:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1843234110, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:210)");
        }
        SliderDefaults.INSTANCE.m3995Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, (i & 14) | 100663296, 242);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$5(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, SliderState sliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(it)290@13881L127:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1689130945, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:290)");
        }
        SliderDefaults.INSTANCE.m3992Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$6(boolean z, SliderColors sliderColors, SliderState sliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(sliderState)297@14103L68:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-294493388, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:297)");
        }
        SliderDefaults.INSTANCE.m3995Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, (i & 14) | 100663296, 242);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final Function1<? super Float, Unit> function1, Modifier modifier, boolean z, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, ClosedFloatingPointRange<Float> closedFloatingPointRange, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        final boolean z2;
        int i7;
        Function0<Unit> function02;
        final SliderColors sliderColors2;
        int i8;
        final MutableInteractionSource mutableInteractionSource2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function33;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        final boolean z3;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function34;
        final MutableInteractionSource mutableInteractionSource3;
        final Function0<Unit> function03;
        final SliderColors sliderColors3;
        ScopeUpdateScope endRestartGroup;
        int i17;
        ComposableLambda rememberComposableLambda;
        int i18;
        ComposableLambda composableLambda;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i19;
        int i20;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function35;
        MutableInteractionSource mutableInteractionSource4;
        int i21;
        int i22;
        Composer startRestartGroup = composer.startRestartGroup(985901935);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)N(value,onValueChange,modifier,enabled,onValueChangeFinished,colors,interactionSource,steps,thumb,track,valueRange)302@14265L92,307@14483L185:Slider.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i23 = i4 & 4;
        if (i23 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i5 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function02 = function0;
                    i5 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    if ((196608 & i2) != 0) {
                        if ((i4 & 32) == 0) {
                            sliderColors2 = sliderColors;
                            if (startRestartGroup.changed(sliderColors2)) {
                                i22 = 131072;
                                i5 |= i22;
                            }
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i22 = 65536;
                        i5 |= i22;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                        mutableInteractionSource2 = mutableInteractionSource;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                        }
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i10 = i4 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i11 = i10;
                        i5 |= startRestartGroup.changedInstance(function3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i12 = i4 & 512;
                        if (i12 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i13 = i12;
                            i5 |= startRestartGroup.changedInstance(function32) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if ((i3 & 6) != 0) {
                                if ((i4 & 1024) == 0 && startRestartGroup.changed(closedFloatingPointRange)) {
                                    i21 = 4;
                                    i14 = i3 | i21;
                                }
                                i21 = 2;
                                i14 = i3 | i21;
                            } else {
                                i14 = i3;
                            }
                            i15 = i5;
                            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "286@13668L8,287@13728L39,289@13856L158,296@14063L114");
                                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 32) != 0) {
                                        i15 &= -458753;
                                    }
                                    if ((i4 & 1024) != 0) {
                                        i14 &= -15;
                                    }
                                    i16 = i;
                                    function35 = function32;
                                    closedFloatingPointRange3 = closedFloatingPointRange;
                                    i20 = i14;
                                    i19 = i15;
                                    rememberComposableLambda = function3;
                                } else {
                                    if (i23 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i6 != 0) {
                                        z2 = true;
                                    }
                                    if (i7 != 0) {
                                        function02 = null;
                                    }
                                    if ((i4 & 32) != 0) {
                                        i17 = i15 & (-458753);
                                        sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i8 != 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1736003850, "CC(remember):Slider.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    }
                                    int i24 = i9 != 0 ? 0 : i;
                                    rememberComposableLambda = i11 != 0 ? ComposableLambdaKt.rememberComposableLambda(-1689130945, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda21
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            Unit Slider$lambda$5;
                                            Slider$lambda$5 = SliderKt.Slider$lambda$5(MutableInteractionSource.this, sliderColors2, z2, (SliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                            return Slider$lambda$5;
                                        }
                                    }, startRestartGroup, 54) : function3;
                                    if (i13 != 0) {
                                        i18 = i24;
                                        composableLambda = ComposableLambdaKt.rememberComposableLambda(-294493388, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda32
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                Unit Slider$lambda$6;
                                                Slider$lambda$6 = SliderKt.Slider$lambda$6(z2, sliderColors2, (SliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                                return Slider$lambda$6;
                                            }
                                        }, startRestartGroup, 54);
                                    } else {
                                        i18 = i24;
                                        composableLambda = function32;
                                    }
                                    if ((i4 & 1024) != 0) {
                                        closedFloatingPointRange3 = RangesKt.rangeTo(0.0f, 1.0f);
                                        i14 &= -15;
                                    } else {
                                        closedFloatingPointRange3 = closedFloatingPointRange;
                                    }
                                    i19 = i17;
                                    i20 = i14;
                                    function35 = composableLambda;
                                    i16 = i18;
                                }
                                startRestartGroup.endDefaults();
                                Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function36 = rememberComposableLambda;
                                if (ComposerKt.isTraceInProgress()) {
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    ComposerKt.traceEventStart(985901935, i19, i20, "androidx.compose.material3.Slider (Slider.kt:300)");
                                } else {
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1735986613, "CC(remember):Slider.kt#9igjgp");
                                boolean z4 = ((29360128 & i19) == 8388608) | ((((i20 & 14) ^ 6) > 4 && startRestartGroup.changed(closedFloatingPointRange3)) || (i20 & 6) == 4);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new SliderState(f, i16, function02, closedFloatingPointRange3);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                SliderState sliderState = (SliderState) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                sliderState.setOnValueChangeFinished(function02);
                                sliderState.setOnValueChange(function1);
                                sliderState.setValue(f);
                                int i25 = ((i19 >> 3) & PointerIconCompat.TYPE_TEXT) | ((i19 >> 6) & 57344);
                                int i26 = i19 >> 9;
                                Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function37 = function35;
                                Slider(sliderState, modifier2, z2, null, mutableInteractionSource4, function36, function37, startRestartGroup, i25 | (458752 & i26) | (i26 & 3670016), 8);
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                closedFloatingPointRange2 = closedFloatingPointRange3;
                                function33 = function36;
                                z3 = z2;
                                function34 = function37;
                                mutableInteractionSource3 = mutableInteractionSource5;
                                sliderColors3 = sliderColors2;
                                function03 = function02;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i16 = i;
                                function33 = function3;
                                closedFloatingPointRange2 = closedFloatingPointRange;
                                z3 = z2;
                                function34 = function32;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function03 = function02;
                                sliderColors3 = sliderColors2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier3 = modifier2;
                                final int i27 = i16;
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda39
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Slider$lambda$8;
                                        Slider$lambda$8 = SliderKt.Slider$lambda$8(f, function1, modifier3, z3, function03, sliderColors3, mutableInteractionSource3, i27, function33, function34, closedFloatingPointRange2, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        return Slider$lambda$8;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i13 = i12;
                        if ((i3 & 6) != 0) {
                        }
                        i15 = i5;
                        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i4 & 512;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    if ((i3 & 6) != 0) {
                    }
                    i15 = i5;
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function02 = function0;
                if ((196608 & i2) != 0) {
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                i9 = i4 & 128;
                if (i9 == 0) {
                }
                i10 = i4 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i4 & 512;
                if (i12 != 0) {
                }
                i13 = i12;
                if ((i3 & 6) != 0) {
                }
                i15 = i5;
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            function02 = function0;
            if ((196608 & i2) != 0) {
            }
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i4 & 128;
            if (i9 == 0) {
            }
            i10 = i4 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i4 & 512;
            if (i12 != 0) {
            }
            i13 = i12;
            if ((i3 & 6) != 0) {
            }
            i15 = i5;
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        function02 = function0;
        if ((196608 & i2) != 0) {
        }
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i10 = i4 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i4 & 512;
        if (i12 != 0) {
        }
        i13 = i12;
        if ((i3 & 6) != 0) {
        }
        i15 = i5;
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$10(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, SliderState sliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(it)377@17498L127:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2100927368, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:377)");
        }
        SliderDefaults.INSTANCE.m3992Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$11(boolean z, SliderColors sliderColors, SliderState sliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(sliderState)384@17720L68:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-81224541, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:384)");
        }
        SliderDefaults.INSTANCE.m3995Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, (i & 14) | 100663296, 242);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        int i5;
        final MutableInteractionSource mutableInteractionSource2;
        int i6;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function33;
        int i7;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function34;
        final Modifier modifier2;
        final boolean z3;
        final SliderColors sliderColors3;
        final MutableInteractionSource mutableInteractionSource3;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function35;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function36;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier3;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(409861960);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)N(state,modifier,enabled,colors,interactionSource,thumb,track)389@17862L189:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
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
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function33 = function3;
                        i3 |= startRestartGroup.changedInstance(function33) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            function34 = function32;
                            i3 |= startRestartGroup.changedInstance(function34) ? 1048576 : 524288;
                            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "374@17325L8,375@17385L39,376@17473L158,383@17680L114");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    z4 = z2;
                                    function36 = function33;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    modifier3 = modifier;
                                } else {
                                    Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    }
                                    if (i5 != 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1259641169, "CC(remember):Slider.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    }
                                    if (i6 != 0) {
                                        function33 = ComposableLambdaKt.rememberComposableLambda(-2100927368, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                Unit Slider$lambda$10;
                                                Slider$lambda$10 = SliderKt.Slider$lambda$10(MutableInteractionSource.this, sliderColors2, z2, (SliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                                return Slider$lambda$10;
                                            }
                                        }, startRestartGroup, 54);
                                    }
                                    if (i7 != 0) {
                                        function34 = ComposableLambdaKt.rememberComposableLambda(-81224541, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                Unit Slider$lambda$11;
                                                Slider$lambda$11 = SliderKt.Slider$lambda$11(z2, sliderColors2, (SliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                                return Slider$lambda$11;
                                            }
                                        }, startRestartGroup, 54);
                                    }
                                    z4 = z2;
                                    function36 = function33;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    modifier3 = companion;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(409861960, i3, -1, "androidx.compose.material3.Slider (Slider.kt:386)");
                                }
                                if (sliderState.getSteps() < 0) {
                                    throw new IllegalArgumentException("steps should be >= 0".toString());
                                }
                                int i10 = i3 >> 3;
                                SliderImpl(modifier3, sliderState, z4, mutableInteractionSource4, function36, function34, startRestartGroup, (i3 & 896) | (i10 & 14) | ((i3 << 3) & 112) | (i10 & 7168) | (57344 & i10) | (i10 & 458752));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                sliderColors3 = sliderColors2;
                                modifier2 = modifier3;
                                z3 = z4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                function35 = function36;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z3 = z2;
                                sliderColors3 = sliderColors2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function35 = function33;
                            }
                            final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function37 = function34;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Slider$lambda$13;
                                        Slider$lambda$13 = SliderKt.Slider$lambda$13(SliderState.this, modifier2, z3, sliderColors3, mutableInteractionSource3, function35, function37, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return Slider$lambda$13;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function34 = function32;
                        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        final Function3 function372 = function34;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function33 = function3;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    function34 = function32;
                    if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    final Function3 function3722 = function34;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function33 = function3;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                function34 = function32;
                if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                final Function3 function37222 = function34;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function33 = function3;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            function34 = function32;
            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            final Function3 function372222 = function34;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function33 = function3;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        function34 = function32;
        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        final Function3 function3722222 = function34;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalSlider$lambda$1(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, SliderState sliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(sliderState)444@20464L209:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896624690, i, -1, "androidx.compose.material3.VerticalSlider.<anonymous> (Slider.kt:444)");
        }
        SliderDefaults.INSTANCE.m3993ThumbHwbPF3A(mutableInteractionSource, sliderState, null, sliderColors, z, VerticalThumbSize, composer, ((i << 3) & 112) | 1769472, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalSlider$lambda$2(boolean z, SliderColors sliderColors, SliderState sliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(sliderState)453@20768L161:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1702448035, i, -1, "androidx.compose.material3.VerticalSlider.<anonymous> (Slider.kt:453)");
        }
        SliderDefaults.INSTANCE.m3997TrackmnvyFg4(sliderState, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM(), (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, (i & 14) | 805306416, 484);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalSlider(final SliderState sliderState, Modifier modifier, boolean z, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z3;
        int i5;
        boolean z4;
        final SliderColors sliderColors2;
        int i6;
        final MutableInteractionSource mutableInteractionSource2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function33;
        final boolean z5;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function34;
        ScopeUpdateScope endRestartGroup;
        int i11;
        ComposableLambda rememberComposableLambda;
        ComposableLambda rememberComposableLambda2;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1841025790);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalSlider)N(state,modifier,enabled,reverseDirection,colors,interactionSource,thumb,track)466@21091L189:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
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
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            sliderColors2 = sliderColors;
                            if (startRestartGroup.changed(sliderColors2)) {
                                i12 = 16384;
                                i3 |= i12;
                            }
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i12 = 8192;
                        i3 |= i12;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i9 = i8;
                            i3 |= startRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                            i10 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                function33 = function32;
                                z5 = z3;
                                function34 = function3;
                            } else {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "441@20276L8,442@20336L39,443@20424L255,452@20728L207");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        rememberComposableLambda = function3;
                                        i11 = i10 & (-57345);
                                        rememberComposableLambda2 = function32;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (sliderState.getSteps() >= 0) {
                                        }
                                    } else {
                                        rememberComposableLambda = function3;
                                        rememberComposableLambda2 = function32;
                                        i11 = i10;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (sliderState.getSteps() >= 0) {
                                        }
                                    }
                                } else {
                                    if (i13 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z3 = true;
                                    }
                                    if (i5 != 0) {
                                        z4 = false;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i11 = i10 & (-57345);
                                        sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    } else {
                                        i11 = i10;
                                    }
                                    if (i6 != 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 300749769, "CC(remember):Slider.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    }
                                    rememberComposableLambda = i7 != 0 ? ComposableLambdaKt.rememberComposableLambda(1896624690, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda33
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            Unit VerticalSlider$lambda$1;
                                            VerticalSlider$lambda$1 = SliderKt.VerticalSlider$lambda$1(MutableInteractionSource.this, sliderColors2, z3, (SliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                            return VerticalSlider$lambda$1;
                                        }
                                    }, startRestartGroup, 54) : function3;
                                    if (i9 != 0) {
                                        rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1702448035, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda34
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                Unit VerticalSlider$lambda$2;
                                                VerticalSlider$lambda$2 = SliderKt.VerticalSlider$lambda$2(z3, sliderColors2, (SliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                                return VerticalSlider$lambda$2;
                                            }
                                        }, startRestartGroup, 54);
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1841025790, i11, -1, "androidx.compose.material3.VerticalSlider (Slider.kt:460)");
                                        }
                                        if (sliderState.getSteps() >= 0) {
                                            throw new IllegalArgumentException("steps should be >= 0".toString());
                                        }
                                        sliderState.setOrientation$material3(Orientation.Vertical);
                                        sliderState.setReverseVerticalDirection$material3(z4);
                                        int i14 = i11 >> 6;
                                        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function35 = rememberComposableLambda2;
                                        SliderImpl(modifier2, sliderState, z3, mutableInteractionSource2, rememberComposableLambda, function35, startRestartGroup, (i14 & 458752) | ((i11 >> 3) & 14) | ((i11 << 3) & 112) | (i11 & 896) | (i14 & 7168) | (57344 & i14));
                                        composer2 = startRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z5 = z3;
                                        function34 = rememberComposableLambda;
                                        function33 = function35;
                                    }
                                    rememberComposableLambda2 = function32;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (sliderState.getSteps() >= 0) {
                                    }
                                }
                            }
                            final Modifier modifier3 = modifier2;
                            final boolean z6 = z4;
                            final SliderColors sliderColors3 = sliderColors2;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda35
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit VerticalSlider$lambda$4;
                                        VerticalSlider$lambda$4 = SliderKt.VerticalSlider$lambda$4(SliderState.this, modifier3, z5, z6, sliderColors3, mutableInteractionSource3, function34, function33, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return VerticalSlider$lambda$4;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        i10 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
                        }
                        final Modifier modifier32 = modifier2;
                        final boolean z62 = z4;
                        final SliderColors sliderColors32 = sliderColors2;
                        final MutableInteractionSource mutableInteractionSource32 = mutableInteractionSource2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
                    }
                    final Modifier modifier322 = modifier2;
                    final boolean z622 = z4;
                    final SliderColors sliderColors322 = sliderColors2;
                    final MutableInteractionSource mutableInteractionSource322 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z4 = z2;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
                }
                final Modifier modifier3222 = modifier2;
                final boolean z6222 = z4;
                final SliderColors sliderColors3222 = sliderColors2;
                final MutableInteractionSource mutableInteractionSource3222 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
            }
            final Modifier modifier32222 = modifier2;
            final boolean z62222 = z4;
            final SliderColors sliderColors32222 = sliderColors2;
            final MutableInteractionSource mutableInteractionSource32222 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
        }
        final Modifier modifier322222 = modifier2;
        final boolean z622222 = z4;
        final SliderColors sliderColors322222 = sliderColors2;
        final MutableInteractionSource mutableInteractionSource322222 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final ClosedFloatingPointRange<Float> closedFloatingPointRange, final Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, Function0<Unit> function0, SliderColors sliderColors, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function02;
        int i9;
        Composer composer2;
        final SliderColors sliderColors2;
        final Modifier modifier3;
        final boolean z3;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        final int i10;
        final Function0<Unit> function03;
        ScopeUpdateScope endRestartGroup;
        int i11;
        final SliderColors sliderColors3;
        final boolean z4;
        int i12;
        Function0<Unit> function04;
        int i13;
        Modifier modifier4;
        int i14;
        ClosedFloatingPointRange<Float> closedFloatingPointRange5;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-743091416);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)N(value,onValueChange,modifier,enabled,valueRange,steps,onValueChangeFinished,colors)520@23735L39,521@23832L39,533@24250L187,540@24458L185,547@24661L200,523@23877L991:Slider.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(closedFloatingPointRange) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        if (startRestartGroup.changed(closedFloatingPointRange3)) {
                            i16 = 16384;
                            i4 |= i16;
                        }
                    } else {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                    }
                    i16 = 8192;
                    i4 |= i16;
                } else {
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((1572864 & i2) == 0) {
                        function02 = function0;
                        i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & 128) == 0 && startRestartGroup.changed(sliderColors)) {
                                i15 = 8388608;
                                i4 |= i15;
                            }
                            i15 = 4194304;
                            i4 |= i15;
                        }
                        i9 = i4;
                        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "518@23662L8");
                            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                i14 = (i3 & 16) != 0 ? i9 & (-57345) : i9;
                                if ((i3 & 128) != 0) {
                                    i14 &= -29360129;
                                }
                                z4 = z2;
                                i12 = i7;
                                function04 = function02;
                                i13 = -743091416;
                                modifier4 = modifier2;
                                closedFloatingPointRange5 = closedFloatingPointRange3;
                                sliderColors3 = sliderColors;
                            } else {
                                Modifier.Companion companion = i17 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    i11 = i9 & (-57345);
                                    closedFloatingPointRange3 = RangesKt.rangeTo(0.0f, 1.0f);
                                } else {
                                    i11 = i9;
                                }
                                if (i6 != 0) {
                                    i7 = 0;
                                }
                                if (i8 != 0) {
                                    function02 = null;
                                }
                                if ((i3 & 128) != 0) {
                                    sliderColors3 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    z4 = z2;
                                    i12 = i7;
                                    function04 = function02;
                                    modifier4 = companion;
                                    i14 = (-29360129) & i11;
                                    closedFloatingPointRange5 = closedFloatingPointRange3;
                                    i13 = -743091416;
                                } else {
                                    sliderColors3 = sliderColors;
                                    z4 = z2;
                                    i12 = i7;
                                    function04 = function02;
                                    i13 = -743091416;
                                    modifier4 = companion;
                                    i14 = i11;
                                    closedFloatingPointRange5 = closedFloatingPointRange3;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i13, i14, -1, "androidx.compose.material3.RangeSlider (Slider.kt:519)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1146265233, "CC(remember):Slider.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1146262129, "CC(remember):Slider.kt#9igjgp");
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            composer2 = startRestartGroup;
                            RangeSlider(closedFloatingPointRange, function1, modifier4, z4, closedFloatingPointRange5, function04, null, mutableInteractionSource, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-811582901, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit RangeSlider$lambda$2;
                                    RangeSlider$lambda$2 = SliderKt.RangeSlider$lambda$2(MutableInteractionSource.this, sliderColors3, z4, (RangeSliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return RangeSlider$lambda$2;
                                }
                            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit RangeSlider$lambda$3;
                                    RangeSlider$lambda$3 = SliderKt.RangeSlider$lambda$3(MutableInteractionSource.this, sliderColors3, z4, (RangeSliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return RangeSlider$lambda$3;
                                }
                            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit RangeSlider$lambda$4;
                                    RangeSlider$lambda$4 = SliderKt.RangeSlider$lambda$4(z4, sliderColors3, (RangeSliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return RangeSlider$lambda$4;
                                }
                            }, startRestartGroup, 54), i12, composer2, (i14 & 14) | 918552576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | ((i14 >> 3) & 458752), ((i14 >> 9) & 896) | 54, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            sliderColors2 = sliderColors3;
                            modifier3 = modifier4;
                            z3 = z4;
                            closedFloatingPointRange4 = closedFloatingPointRange5;
                            function03 = function04;
                            i10 = i12;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            sliderColors2 = sliderColors;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange4 = closedFloatingPointRange3;
                            i10 = i7;
                            function03 = function02;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit RangeSlider$lambda$5;
                                    RangeSlider$lambda$5 = SliderKt.RangeSlider$lambda$5(ClosedFloatingPointRange.this, function1, modifier3, z3, closedFloatingPointRange4, i10, function03, sliderColors2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return RangeSlider$lambda$5;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function02 = function0;
                    if ((i2 & 12582912) == 0) {
                    }
                    i9 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                function02 = function0;
                if ((i2 & 12582912) == 0) {
                }
                i9 = i4;
                if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            function02 = function0;
            if ((i2 & 12582912) == 0) {
            }
            i9 = i4;
            if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        function02 = function0;
        if ((i2 & 12582912) == 0) {
        }
        i9 = i4;
        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$2(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(it)534@24279L148:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-811582901, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:534)");
        }
        SliderDefaults.INSTANCE.m3992Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196614, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$3(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(it)541@24487L146:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1832060001, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:541)");
        }
        SliderDefaults.INSTANCE.m3992Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, 196614, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$4(boolean z, SliderColors sliderColors, RangeSliderState rangeSliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(rangeSliderState)548@24710L141:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(377064480, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:548)");
        }
        SliderDefaults.INSTANCE.m3994Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, (i & 14) | 100663296, 242);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$8(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(it)623@28876L132:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-743960051, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:623)");
        }
        SliderDefaults.INSTANCE.m3992Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$9(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(it)630@29096L130:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1306751174, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:630)");
        }
        SliderDefaults.INSTANCE.m3992Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$10(boolean z, SliderColors sliderColors, RangeSliderState rangeSliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(rangeSliderState)637@29331L125:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234185578, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:637)");
        }
        SliderDefaults.INSTANCE.m3994Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, (i & 14) | 100663296, 242);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final ClosedFloatingPointRange<Float> closedFloatingPointRange, final Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange2, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, int i, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i7;
        Function0<Unit> function02;
        final SliderColors sliderColors2;
        int i8;
        MutableInteractionSource mutableInteractionSource3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final boolean z2;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function34;
        int i20;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        final SliderColors sliderColors3;
        final Function0<Unit> function03;
        final MutableInteractionSource mutableInteractionSource4;
        final MutableInteractionSource mutableInteractionSource5;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function35;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function36;
        ScopeUpdateScope endRestartGroup;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource6;
        final MutableInteractionSource mutableInteractionSource7;
        Modifier modifier3;
        ClosedFloatingPointRange<Float> closedFloatingPointRange5;
        boolean z4;
        ComposableLambda composableLambda;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function37;
        ComposableLambda composableLambda2;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function38;
        ComposableLambda composableLambda3;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function39;
        int i21;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function310;
        int i22;
        ClosedFloatingPointRange<Float> closedFloatingPointRange6;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function311;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function312;
        int i23;
        Composer startRestartGroup = composer.startRestartGroup(1924256162);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)N(value,onValueChange,modifier,enabled,valueRange,onValueChangeFinished,colors,startInteractionSource,endInteractionSource,startThumb,endThumb,track,steps)646@29532L238,657@29854L44,661@29991L292:Slider.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(closedFloatingPointRange) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i24 = i4 & 4;
        if (i24 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i4 & 16) == 0) {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        if (startRestartGroup.changed(closedFloatingPointRange3)) {
                            i23 = 16384;
                            i5 |= i23;
                        }
                    } else {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                    }
                    i23 = 8192;
                    i5 |= i23;
                } else {
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function02 = function0;
                } else {
                    function02 = function0;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    sliderColors2 = sliderColors;
                    i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(sliderColors2)) ? 1048576 : 524288;
                } else {
                    sliderColors2 = sliderColors;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                    mutableInteractionSource3 = mutableInteractionSource;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                    if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(mutableInteractionSource3) ? 8388608 : 4194304;
                    }
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i10 = i9;
                    i5 |= startRestartGroup.changed(mutableInteractionSource2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    i11 = i4 & 512;
                    if (i11 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i12 = i11;
                        i5 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i13 = i4 & 1024;
                        if (i13 != 0) {
                            i15 = i3 | 6;
                            i14 = i13;
                        } else if ((i3 & 6) == 0) {
                            i14 = i13;
                            i15 = i3 | (startRestartGroup.changedInstance(function32) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i3;
                        }
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i3 & 48) == 0) {
                            i17 = i16;
                            i15 |= startRestartGroup.changedInstance(function33) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        i18 = i15;
                        i19 = i4 & 4096;
                        if (i19 != 0) {
                            i18 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i18 |= startRestartGroup.changed(i) ? 256 : 128;
                            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i18 & 147) != 146, i5 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "619@28594L8,620@28659L39,621@28753L39,622@28851L163,629@29071L161,636@29286L176");
                                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i4 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    z3 = z;
                                    function39 = function3;
                                    function310 = function33;
                                    i21 = i;
                                    closedFloatingPointRange6 = closedFloatingPointRange3;
                                    i22 = i5;
                                    mutableInteractionSource6 = mutableInteractionSource3;
                                    mutableInteractionSource7 = mutableInteractionSource2;
                                    function311 = function32;
                                } else {
                                    Modifier.Companion companion = i24 != 0 ? Modifier.INSTANCE : modifier2;
                                    z3 = i6 != 0 ? true : z;
                                    if ((i4 & 16) != 0) {
                                        closedFloatingPointRange3 = RangesKt.rangeTo(0.0f, 1.0f);
                                        i5 &= -57345;
                                    }
                                    if (i7 != 0) {
                                        function02 = null;
                                    }
                                    if ((i4 & 64) != 0) {
                                        sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        i5 &= -3670017;
                                    }
                                    if (i8 != 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1920720023, "CC(remember):Slider.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableInteractionSource6 = (MutableInteractionSource) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    } else {
                                        mutableInteractionSource6 = mutableInteractionSource3;
                                    }
                                    if (i10 != 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1920717015, "CC(remember):Slider.kt#9igjgp");
                                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        mutableInteractionSource7 = (MutableInteractionSource) rememberedValue2;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    } else {
                                        mutableInteractionSource7 = mutableInteractionSource2;
                                    }
                                    if (i12 != 0) {
                                        modifier3 = companion;
                                        closedFloatingPointRange5 = closedFloatingPointRange3;
                                        z4 = true;
                                        composableLambda = ComposableLambdaKt.rememberComposableLambda(-743960051, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda40
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                Unit RangeSlider$lambda$8;
                                                RangeSlider$lambda$8 = SliderKt.RangeSlider$lambda$8(MutableInteractionSource.this, sliderColors2, z3, (RangeSliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                                return RangeSlider$lambda$8;
                                            }
                                        }, startRestartGroup, 54);
                                    } else {
                                        modifier3 = companion;
                                        closedFloatingPointRange5 = closedFloatingPointRange3;
                                        z4 = true;
                                        composableLambda = function3;
                                    }
                                    if (i14 != 0) {
                                        function37 = composableLambda;
                                        composableLambda2 = ComposableLambdaKt.rememberComposableLambda(1306751174, z4, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda41
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                Unit RangeSlider$lambda$9;
                                                RangeSlider$lambda$9 = SliderKt.RangeSlider$lambda$9(MutableInteractionSource.this, sliderColors2, z3, (RangeSliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                                return RangeSlider$lambda$9;
                                            }
                                        }, startRestartGroup, 54);
                                    } else {
                                        function37 = composableLambda;
                                        composableLambda2 = function32;
                                    }
                                    if (i17 != 0) {
                                        function38 = composableLambda2;
                                        composableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1234185578, z4, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda42
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                Unit RangeSlider$lambda$10;
                                                RangeSlider$lambda$10 = SliderKt.RangeSlider$lambda$10(z3, sliderColors2, (RangeSliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                                return RangeSlider$lambda$10;
                                            }
                                        }, startRestartGroup, 54);
                                    } else {
                                        function38 = composableLambda2;
                                        composableLambda3 = function33;
                                    }
                                    modifier2 = modifier3;
                                    function39 = function37;
                                    if (i19 != 0) {
                                        function310 = composableLambda3;
                                        i22 = i5;
                                        i21 = 0;
                                    } else {
                                        i21 = i;
                                        function310 = composableLambda3;
                                        i22 = i5;
                                    }
                                    closedFloatingPointRange6 = closedFloatingPointRange5;
                                    function311 = function38;
                                }
                                startRestartGroup.endDefaults();
                                Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function313 = function39;
                                if (ComposerKt.isTraceInProgress()) {
                                    function312 = function311;
                                    ComposerKt.traceEventStart(1924256162, i22, i18, "androidx.compose.material3.RangeSlider (Slider.kt:644)");
                                } else {
                                    function312 = function311;
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1920691888, "CC(remember):Slider.kt#9igjgp");
                                int i25 = i18;
                                boolean z5 = ((((57344 & i22) ^ 24576) > 16384 && startRestartGroup.changed(closedFloatingPointRange6)) || (i22 & 24576) == 16384) | ((i18 & 896) == 256);
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (z5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    int i26 = i21;
                                    rememberedValue3 = new RangeSliderState(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i26, function02, closedFloatingPointRange6);
                                    i20 = i26;
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                } else {
                                    i20 = i21;
                                }
                                RangeSliderState rangeSliderState = (RangeSliderState) rememberedValue3;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                rangeSliderState.setOnValueChangeFinished(function02);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1920681778, "CC(remember):Slider.kt#9igjgp");
                                boolean z6 = (i22 & 112) == 32;
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (z6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda43
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit RangeSlider$lambda$12$0;
                                            RangeSlider$lambda$12$0 = SliderKt.RangeSlider$lambda$12$0(Function1.this, (SliderRange) obj);
                                            return RangeSlider$lambda$12$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                rangeSliderState.setOnValueChange$material3((Function1) rememberedValue4);
                                rangeSliderState.setActiveRangeStart(closedFloatingPointRange.getStart().floatValue());
                                rangeSliderState.setActiveRangeEnd(closedFloatingPointRange.getEndInclusive().floatValue());
                                int i27 = (i22 >> 3) & PointerIconCompat.TYPE_TEXT;
                                int i28 = i22 >> 9;
                                int i29 = i27 | (57344 & i28) | (458752 & i28) | (i28 & 3670016);
                                int i30 = i25 << 21;
                                Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function314 = function310;
                                RangeSlider(rangeSliderState, modifier2, z3, null, mutableInteractionSource6, mutableInteractionSource7, function313, function312, function314, startRestartGroup, i29 | (29360128 & i30) | (i30 & 234881024), 8);
                                Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function315 = function312;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                function34 = function313;
                                z2 = z3;
                                mutableInteractionSource4 = mutableInteractionSource8;
                                sliderColors3 = sliderColors2;
                                mutableInteractionSource5 = mutableInteractionSource7;
                                function36 = function314;
                                function03 = function02;
                                function35 = function315;
                                closedFloatingPointRange4 = closedFloatingPointRange6;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z2 = z;
                                function34 = function3;
                                i20 = i;
                                closedFloatingPointRange4 = closedFloatingPointRange3;
                                sliderColors3 = sliderColors2;
                                function03 = function02;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                mutableInteractionSource5 = mutableInteractionSource2;
                                function35 = function32;
                                function36 = function33;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier4 = modifier2;
                                final int i31 = i20;
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda44
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit RangeSlider$lambda$13;
                                        RangeSlider$lambda$13 = SliderKt.RangeSlider$lambda$13(ClosedFloatingPointRange.this, function1, modifier4, z2, closedFloatingPointRange4, function03, sliderColors3, mutableInteractionSource4, mutableInteractionSource5, function34, function35, function36, i31, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        return RangeSlider$lambda$13;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i18 & 147) != 146, i5 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    i18 = i15;
                    i19 = i4 & 4096;
                    if (i19 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i18 & 147) != 146, i5 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i10 = i9;
                i11 = i4 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 1024;
                if (i13 != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                i18 = i15;
                i19 = i4 & 4096;
                if (i19 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i18 & 147) != 146, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 24576) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            i9 = i4 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i4 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            i18 = i15;
            i19 = i4 & 4096;
            if (i19 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i18 & 147) != 146, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i8 = i4 & 128;
        if (i8 != 0) {
        }
        i9 = i4 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i4 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 1024;
        if (i13 != 0) {
        }
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        i18 = i15;
        i19 = i4 & 4096;
        if (i19 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i18 & 147) != 146, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$12$0(Function1 function1, SliderRange sliderRange) {
        function1.invoke(RangesKt.rangeTo(SliderRange.m4040getStartimpl(sliderRange.m4043unboximpl()), SliderRange.m4039getEndInclusiveimpl(sliderRange.m4043unboximpl())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$16(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(it)725@33212L132:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1597255314, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:725)");
        }
        SliderDefaults.INSTANCE.m3992Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$17(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, RangeSliderState rangeSliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(it)732@33432L130:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1348023737, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:732)");
        }
        SliderDefaults.INSTANCE.m3992Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$18(boolean z, SliderColors sliderColors, RangeSliderState rangeSliderState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(rangeSliderState)739@33667L125:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-453269015, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:739)");
        }
        SliderDefaults.INSTANCE.m3994Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, (i & 14) | 100663296, 242);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        final MutableInteractionSource mutableInteractionSource4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final Modifier modifier2;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function34;
        final boolean z3;
        final SliderColors sliderColors3;
        final MutableInteractionSource mutableInteractionSource5;
        final MutableInteractionSource mutableInteractionSource6;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function35;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function36;
        ScopeUpdateScope endRestartGroup;
        final MutableInteractionSource mutableInteractionSource7;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function37;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource8;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function38;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function39;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-781154979);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)N(state,modifier,enabled,colors,startInteractionSource,endInteractionSource,startThumb,endThumb,track)748@33866L296:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
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
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i12 = 2048;
                            i3 |= i12;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i12 = 1024;
                    i3 |= i12;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource3 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource3) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i3 |= startRestartGroup.changed(mutableInteractionSource4) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i9 = i8;
                            i3 |= startRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                            i10 = i2 & 256;
                            if (i10 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i11 = i10;
                                i3 |= startRestartGroup.changedInstance(function33) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "721@32930L8,722@32995L39,723@33089L39,724@33187L163,731@33407L161,738@33622L176");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 8) != 0) {
                                            i3 &= -7169;
                                        }
                                        modifier3 = modifier;
                                        function38 = function3;
                                        function39 = function32;
                                        function37 = function33;
                                        mutableInteractionSource8 = mutableInteractionSource3;
                                    } else {
                                        Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier;
                                        if (i4 != 0) {
                                            z2 = true;
                                        }
                                        if ((i2 & 8) != 0) {
                                            i3 &= -7169;
                                            sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        }
                                        if (i5 != 0) {
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 929348964, "CC(remember):Slider.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            mutableInteractionSource7 = (MutableInteractionSource) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            mutableInteractionSource7 = mutableInteractionSource3;
                                        }
                                        if (i6 != 0) {
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 929351972, "CC(remember):Slider.kt#9igjgp");
                                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue2;
                                        }
                                        ComposableLambda rememberComposableLambda = i7 != 0 ? ComposableLambdaKt.rememberComposableLambda(1597255314, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                Unit RangeSlider$lambda$16;
                                                RangeSlider$lambda$16 = SliderKt.RangeSlider$lambda$16(MutableInteractionSource.this, sliderColors2, z2, (RangeSliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                                return RangeSlider$lambda$16;
                                            }
                                        }, startRestartGroup, 54) : function3;
                                        ComposableLambda rememberComposableLambda2 = i9 != 0 ? ComposableLambdaKt.rememberComposableLambda(1348023737, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                Unit RangeSlider$lambda$17;
                                                RangeSlider$lambda$17 = SliderKt.RangeSlider$lambda$17(MutableInteractionSource.this, sliderColors2, z2, (RangeSliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                                return RangeSlider$lambda$17;
                                            }
                                        }, startRestartGroup, 54) : function32;
                                        if (i11 != 0) {
                                            modifier3 = companion;
                                            function37 = ComposableLambdaKt.rememberComposableLambda(-453269015, true, new Function3() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                    Unit RangeSlider$lambda$18;
                                                    RangeSlider$lambda$18 = SliderKt.RangeSlider$lambda$18(z2, sliderColors2, (RangeSliderState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                                    return RangeSlider$lambda$18;
                                                }
                                            }, startRestartGroup, 54);
                                        } else {
                                            function37 = function33;
                                            modifier3 = companion;
                                        }
                                        mutableInteractionSource8 = mutableInteractionSource7;
                                        function38 = rememberComposableLambda;
                                        function39 = rememberComposableLambda2;
                                    }
                                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource4;
                                    boolean z4 = z2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-781154979, i3, -1, "androidx.compose.material3.RangeSlider (Slider.kt:745)");
                                    }
                                    if (rangeSliderState.getSteps() < 0) {
                                        throw new IllegalArgumentException("steps should be >= 0".toString());
                                    }
                                    int i14 = i3 >> 3;
                                    composer2 = startRestartGroup;
                                    RangeSliderImpl(modifier3, rangeSliderState, z4, mutableInteractionSource8, mutableInteractionSource9, function38, function39, function37, composer2, (i3 & 896) | (i14 & 14) | ((i3 << 3) & 112) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    sliderColors3 = sliderColors2;
                                    modifier2 = modifier3;
                                    z3 = z4;
                                    mutableInteractionSource5 = mutableInteractionSource8;
                                    mutableInteractionSource6 = mutableInteractionSource9;
                                    function35 = function38;
                                    function34 = function39;
                                    function36 = function37;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    function34 = function32;
                                    z3 = z2;
                                    sliderColors3 = sliderColors2;
                                    mutableInteractionSource5 = mutableInteractionSource3;
                                    mutableInteractionSource6 = mutableInteractionSource4;
                                    function35 = function3;
                                    function36 = function33;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit RangeSlider$lambda$20;
                                            RangeSlider$lambda$20 = SliderKt.RangeSlider$lambda$20(RangeSliderState.this, modifier2, z3, sliderColors3, mutableInteractionSource5, mutableInteractionSource6, function35, function34, function36, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return RangeSlider$lambda$20;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i11 = i10;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i9 = i8;
                        i10 = i2 & 256;
                        if (i10 == 0) {
                        }
                        i11 = i10;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    mutableInteractionSource4 = mutableInteractionSource2;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource3 = mutableInteractionSource;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                mutableInteractionSource4 = mutableInteractionSource2;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            mutableInteractionSource4 = mutableInteractionSource2;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
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
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        mutableInteractionSource4 = mutableInteractionSource2;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void SliderImpl(final Modifier modifier, final SliderState sliderState, final boolean z, final MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i) {
        int i2;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function33;
        Modifier wrapContentWidth$default;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function34 = function32;
        Composer startRestartGroup = composer.startRestartGroup(898172835);
        ComposerKt.sourceInformation(startRestartGroup, "C(SliderImpl)N(modifier,state,enabled,interactionSource,thumb,track)769@34456L7,780@34977L28,819@36405L283,832@36905L3110,791@35345L4670:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(sliderState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function34) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            function33 = function3;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(898172835, i2, -1, "androidx.compose.material3.SliderImpl (Slider.kt:768)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            sliderState.setRtl$material3(consume == LayoutDirection.Rtl);
            boolean z2 = (sliderState.getOrientation() == Orientation.Horizontal && sliderState.getIsRtl()) || (sliderState.getOrientation() == Orientation.Vertical && sliderState.getReverseVerticalDirection());
            Modifier sliderTapModifier = sliderTapModifier(Modifier.INSTANCE, sliderState, mutableInteractionSource, z);
            Modifier.Companion companion = Modifier.INSTANCE;
            Orientation orientation = sliderState.getOrientation();
            boolean z3 = z2;
            boolean isDragging = sliderState.isDragging();
            Modifier.Companion companion2 = companion;
            SliderState sliderState2 = sliderState;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -144306721, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(sliderState);
            SliderKt$SliderImpl$drag$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SliderKt$SliderImpl$drag$1$1(sliderState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3 = i2;
            Modifier draggable$default = DraggableKt.draggable$default(companion2, sliderState2, orientation, z, mutableInteractionSource, isDragging, null, (Function3) rememberedValue, z3, 32, null);
            if (sliderState.getOrientation() == Orientation.Vertical) {
                wrapContentWidth$default = SizeKt.wrapContentHeight$default(LayoutIdKt.layoutId(Modifier.INSTANCE, SliderComponents.THUMB), null, false, 3, null);
            } else {
                wrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.INSTANCE, SliderComponents.THUMB), null, false, 3, null);
            }
            Modifier focusable = FocusableKt.focusable(sliderSemantics(SizeKt.m1267requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), sliderState.getOrientation() == Orientation.Vertical ? TrackHeight : ThumbWidth, sliderState.getOrientation() == Orientation.Vertical ? ThumbWidth : TrackHeight, 0.0f, 0.0f, 12, null), sliderState, z), z, mutableInteractionSource);
            int steps = sliderState.getSteps();
            ClosedFloatingPointRange<Float> valueRange = sliderState.getValueRange();
            float value = sliderState.getValue();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -144260770, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance2 = startRestartGroup.changedInstance(sliderState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SliderImpl$lambda$2$0;
                        SliderImpl$lambda$2$0 = SliderKt.SliderImpl$lambda$2$0(SliderState.this, ((Float) obj).floatValue());
                        return SliderImpl$lambda$2$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function1 function1 = (Function1) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier then = slideOnKeyEvents(focusable, z, steps, valueRange, value, z3, function1, sliderState.getOnValueChangeFinished(), sliderState.getIsRtl(), sliderState.getOrientation() == Orientation.Vertical).then(sliderTapModifier).then(draggable$default);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -144241943, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance3 = startRestartGroup.changedInstance(sliderState);
            SliderKt$SliderImpl$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new SliderKt$SliderImpl$3$1(sliderState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1885666906, "C795@35455L129,793@35375L268,802@35656L74:Slider.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1878837019, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance4 = startRestartGroup.changedInstance(sliderState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SliderImpl$lambda$1$0$0;
                        SliderImpl$lambda$1$0$0 = SliderKt.SliderImpl$lambda$1$0$0(SliderState.this, (IntSize) obj);
                        return SliderImpl$lambda$1$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(wrapContentWidth$default, (Function1) rememberedValue4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onSizeChanged);
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
            Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -294052009, "C800@35617L12:Slider.kt#uh7d8r");
            int i4 = (i3 >> 3) & 14;
            function33 = function3;
            function33.invoke(sliderState, startRestartGroup, Integer.valueOf(((i3 >> 9) & 112) | i4));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, SliderComponents.TRACK);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl3 = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -836287744, "C802@35716L12:Slider.kt#uh7d8r");
            function34 = function32;
            function34.invoke(sliderState, startRestartGroup, Integer.valueOf(((i3 >> 12) & 112) | i4));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function35 = function34;
            final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function36 = function33;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SliderImpl$lambda$4;
                    SliderImpl$lambda$4 = SliderKt.SliderImpl$lambda$4(Modifier.this, sliderState, z, mutableInteractionSource, function36, function35, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SliderImpl$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SliderImpl$lambda$1$0$0(SliderState sliderState, IntSize intSize) {
        sliderState.setThumbWidth$material3((int) (intSize.m9911unboximpl() >> 32));
        sliderState.setThumbHeight$material3((int) (intSize.m9911unboximpl() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SliderImpl$lambda$2$0(SliderState sliderState, float f) {
        if (sliderState.getOnValueChange() != null) {
            Function1<Float, Unit> onValueChange = sliderState.getOnValueChange();
            Intrinsics.checkNotNull(onValueChange);
            onValueChange.invoke(Float.valueOf(f));
        } else {
            sliderState.setValue(f);
        }
        return Unit.INSTANCE;
    }

    private static final Modifier slideOnKeyEvents(Modifier modifier, final boolean z, final int i, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final float f, final boolean z2, final Function1<? super Float, Unit> function1, final Function0<Unit> function0, boolean z3, final boolean z4) {
        if (i < 0) {
            throw new IllegalArgumentException("steps should be >= 0".toString());
        }
        return KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.SliderKt$slideOnKeyEvents$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m4032invokeZmokQxo(keyEvent.m7966unboximpl());
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m4032invokeZmokQxo(android.view.KeyEvent keyEvent) {
                if (!z) {
                    return false;
                }
                int m7978getTypeZmokQxo = KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent);
                if (KeyEventType.m7970equalsimpl0(m7978getTypeZmokQxo, KeyEventType.INSTANCE.m7974getKeyDownCS__XNY())) {
                    float abs = Math.abs(closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue());
                    int i2 = i;
                    float f2 = abs / (i2 > 0 ? i2 + 1 : 100);
                    int i3 = z2 ? -1 : 1;
                    if (Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7810getMoveHomeEK5gGoQ())) {
                        function1.invoke(closedFloatingPointRange.getStart());
                        return true;
                    }
                    if (Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7809getMoveEndEK5gGoQ())) {
                        function1.invoke(closedFloatingPointRange.getEndInclusive());
                        return true;
                    }
                    if (z4) {
                        long m7977getKeyZmokQxo = KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent);
                        if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7736getDirectionUpEK5gGoQ())) {
                            function1.invoke(RangesKt.coerceIn(Float.valueOf(f - (i3 * f2)), closedFloatingPointRange));
                            return true;
                        }
                        if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7731getDirectionDownEK5gGoQ())) {
                            function1.invoke(RangesKt.coerceIn(Float.valueOf(f + (i3 * f2)), closedFloatingPointRange));
                            return true;
                        }
                        if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7857getPageUpEK5gGoQ())) {
                            function1.invoke(RangesKt.coerceIn(Float.valueOf(f - ((RangesKt.coerceIn(r2 / 10, 1, 10) * i3) * f2)), closedFloatingPointRange));
                            return true;
                        }
                        if (!Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7856getPageDownEK5gGoQ())) {
                            return false;
                        }
                        function1.invoke(RangesKt.coerceIn(Float.valueOf(f + (RangesKt.coerceIn(r2 / 10, 1, 10) * i3 * f2)), closedFloatingPointRange));
                        return true;
                    }
                    long m7977getKeyZmokQxo2 = KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent);
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.INSTANCE.m7735getDirectionRightEK5gGoQ())) {
                        function1.invoke(RangesKt.coerceIn(Float.valueOf(f + (i3 * f2)), closedFloatingPointRange));
                        return true;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.INSTANCE.m7734getDirectionLeftEK5gGoQ())) {
                        function1.invoke(RangesKt.coerceIn(Float.valueOf(f - (i3 * f2)), closedFloatingPointRange));
                        return true;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.INSTANCE.m7857getPageUpEK5gGoQ())) {
                        function1.invoke(RangesKt.coerceIn(Float.valueOf(f + (RangesKt.coerceIn(r2 / 10, 1, 10) * f2)), closedFloatingPointRange));
                        return true;
                    }
                    if (!Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.INSTANCE.m7856getPageDownEK5gGoQ())) {
                        return false;
                    }
                    function1.invoke(RangesKt.coerceIn(Float.valueOf(f - (RangesKt.coerceIn(r2 / 10, 1, 10) * f2)), closedFloatingPointRange));
                    return true;
                }
                if (!KeyEventType.m7970equalsimpl0(m7978getTypeZmokQxo, KeyEventType.INSTANCE.m7975getKeyUpCS__XNY())) {
                    return false;
                }
                if (z4) {
                    long m7977getKeyZmokQxo3 = KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent);
                    if (!Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7736getDirectionUpEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7731getDirectionDownEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7810getMoveHomeEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7809getMoveEndEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7857getPageUpEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7856getPageDownEK5gGoQ())) {
                        return false;
                    }
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return true;
                }
                long m7977getKeyZmokQxo4 = KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent);
                if (!Key.m7657equalsimpl0(m7977getKeyZmokQxo4, Key.INSTANCE.m7735getDirectionRightEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo4, Key.INSTANCE.m7734getDirectionLeftEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo4, Key.INSTANCE.m7810getMoveHomeEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo4, Key.INSTANCE.m7809getMoveEndEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo4, Key.INSTANCE.m7857getPageUpEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo4, Key.INSTANCE.m7856getPageDownEK5gGoQ())) {
                    return false;
                }
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
                return true;
            }
        });
    }

    private static final Modifier rangeSliderOnKeyEvents(Modifier modifier, final boolean z, final int i, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final float f, final float f2, final boolean z2, final boolean z3, final Function1<? super SliderRange, Unit> function1, final Function0<Unit> function0) {
        if (i < 0) {
            throw new IllegalArgumentException("steps should be >= 0".toString());
        }
        return KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.SliderKt$rangeSliderOnKeyEvents$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m4030invokeZmokQxo(keyEvent.m7966unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m4030invokeZmokQxo(android.view.KeyEvent keyEvent) {
                if (!z) {
                    return false;
                }
                int m7978getTypeZmokQxo = KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent);
                if (KeyEventType.m7970equalsimpl0(m7978getTypeZmokQxo, KeyEventType.INSTANCE.m7974getKeyDownCS__XNY())) {
                    float abs = Math.abs(closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue());
                    int i2 = i;
                    float f3 = abs / (i2 > 0 ? i2 + 1 : 100);
                    int i3 = z3 ? -1 : 1;
                    if (z2) {
                        ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(closedFloatingPointRange.getStart().floatValue(), f2);
                        long m7977getKeyZmokQxo = KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent);
                        if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7735getDirectionRightEK5gGoQ())) {
                            function1.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(((Number) RangesKt.coerceIn(Float.valueOf(f + (i3 * f3)), rangeTo)).floatValue(), f2)));
                            return true;
                        }
                        if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7734getDirectionLeftEK5gGoQ())) {
                            function1.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(((Number) RangesKt.coerceIn(Float.valueOf(f - (i3 * f3)), rangeTo)).floatValue(), f2)));
                            return true;
                        }
                        if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7857getPageUpEK5gGoQ())) {
                            function1.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(((Number) RangesKt.coerceIn(Float.valueOf(f + (RangesKt.coerceIn(r2 / 10, 1, 10) * f3)), rangeTo)).floatValue(), f2)));
                            return true;
                        }
                        if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7856getPageDownEK5gGoQ())) {
                            function1.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(((Number) RangesKt.coerceIn(Float.valueOf(f - (RangesKt.coerceIn(r2 / 10, 1, 10) * f3)), rangeTo)).floatValue(), f2)));
                            return true;
                        }
                        if (Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7810getMoveHomeEK5gGoQ())) {
                            function1.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(closedFloatingPointRange.getStart().floatValue(), f2)));
                            return true;
                        }
                        if (!Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7809getMoveEndEK5gGoQ())) {
                            return false;
                        }
                        Function1<SliderRange, Unit> function12 = function1;
                        float f4 = f2;
                        function12.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(f4, f4)));
                        return true;
                    }
                    ClosedFloatingPointRange<Float> rangeTo2 = RangesKt.rangeTo(f, closedFloatingPointRange.getEndInclusive().floatValue());
                    long m7977getKeyZmokQxo2 = KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent);
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.INSTANCE.m7735getDirectionRightEK5gGoQ())) {
                        function1.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(f, ((Number) RangesKt.coerceIn(Float.valueOf(f2 + (i3 * f3)), rangeTo2)).floatValue())));
                        return true;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.INSTANCE.m7734getDirectionLeftEK5gGoQ())) {
                        function1.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(f, ((Number) RangesKt.coerceIn(Float.valueOf(f2 - (i3 * f3)), rangeTo2)).floatValue())));
                        return true;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.INSTANCE.m7857getPageUpEK5gGoQ())) {
                        function1.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(f, ((Number) RangesKt.coerceIn(Float.valueOf(f2 + (RangesKt.coerceIn(r2 / 10, 1, 10) * f3)), rangeTo2)).floatValue())));
                        return true;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.INSTANCE.m7856getPageDownEK5gGoQ())) {
                        function1.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(f, ((Number) RangesKt.coerceIn(Float.valueOf(f2 - (RangesKt.coerceIn(r2 / 10, 1, 10) * f3)), rangeTo2)).floatValue())));
                        return true;
                    }
                    if (Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.INSTANCE.m7810getMoveHomeEK5gGoQ())) {
                        Function1<SliderRange, Unit> function13 = function1;
                        float f5 = f;
                        function13.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(f5, f5)));
                        return true;
                    }
                    if (!Key.m7657equalsimpl0(m7977getKeyZmokQxo2, Key.INSTANCE.m7809getMoveEndEK5gGoQ())) {
                        return false;
                    }
                    function1.invoke(SliderRange.m4035boximpl(SliderKt.SliderRange(f, closedFloatingPointRange.getEndInclusive().floatValue())));
                    return true;
                }
                if (!KeyEventType.m7970equalsimpl0(m7978getTypeZmokQxo, KeyEventType.INSTANCE.m7975getKeyUpCS__XNY())) {
                    return false;
                }
                long m7977getKeyZmokQxo3 = KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent);
                if (!Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7735getDirectionRightEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7734getDirectionLeftEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7810getMoveHomeEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7809getMoveEndEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7857getPageUpEK5gGoQ()) && !Key.m7657equalsimpl0(m7977getKeyZmokQxo3, Key.INSTANCE.m7856getPageDownEK5gGoQ())) {
                    return false;
                }
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
                return true;
            }
        });
    }

    private static final void RangeSliderImpl(final Modifier modifier, final RangeSliderState rangeSliderState, final boolean z, final MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i) {
        Modifier modifier2;
        int i2;
        final MutableInteractionSource mutableInteractionSource3;
        RangeSliderState rangeSliderState2;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function34;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function35;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-287468326);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSliderImpl)N(modifier,state,enabled,startInteractionSource,endInteractionSource,startThumb,endThumb,track)1192@52029L7,1202@52283L35,1203@52351L33,1280@55802L3284,1205@52390L6696:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(rangeSliderState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            mutableInteractionSource3 = mutableInteractionSource2;
            rangeSliderState2 = rangeSliderState;
            function34 = function32;
            function35 = function33;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-287468326, i2, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:1191)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            rangeSliderState.setRtl$material3(consume == LayoutDirection.Rtl);
            Modifier rangeSliderPressDragModifier = rangeSliderPressDragModifier(Modifier.INSTANCE, rangeSliderState, mutableInteractionSource, mutableInteractionSource2, z);
            Strings.Companion companion = Strings.INSTANCE;
            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.range_start), startRestartGroup, 0);
            Strings.Companion companion2 = Strings.INSTANCE;
            final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.range_end), startRestartGroup, 0);
            Modifier then = SizeKt.m1267requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null).then(rangeSliderPressDragModifier);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1379017138, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(rangeSliderState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (MeasurePolicy) new SliderKt$RangeSliderImpl$2$1(rangeSliderState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            int i3 = i2;
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1046382423, "C1211@52607L171,1216@52911L100,1227@53390L345,1207@52420L1531,1244@54149L167,1249@54447L98,1260@54925L350,1240@53964L1523,1273@55500L79:Slider.kt#uh7d8r");
            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.INSTANCE, RangeSliderComponents.STARTTHUMB), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1905911374, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance2 = startRestartGroup.changedInstance(rangeSliderState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RangeSliderImpl$lambda$0$0$0;
                        RangeSliderImpl$lambda$0$0$0 = SliderKt.RangeSliderImpl$lambda$0$0$0(RangeSliderState.this, (IntSize) obj);
                        return RangeSliderImpl$lambda$0$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier rangeSliderStartThumbSemantics = rangeSliderStartThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(wrapContentWidth$default, (Function1) rememberedValue2), rangeSliderState, z);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1905921031, "CC(remember):Slider.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m4895getString2EP1pXo);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RangeSliderImpl$lambda$0$1$0;
                        RangeSliderImpl$lambda$0$1$0 = SliderKt.RangeSliderImpl$lambda$0$1$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                        return RangeSliderImpl$lambda$0$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics = SemanticsModifierKt.semantics(rangeSliderStartThumbSemantics, true, (Function1) rememberedValue3);
            int steps = rangeSliderState.getSteps();
            ClosedFloatingPointRange<Float> valueRange = rangeSliderState.getValueRange();
            float activeRangeStart = rangeSliderState.getActiveRangeStart();
            float activeRangeEnd = rangeSliderState.getActiveRangeEnd();
            boolean isRtl$material3 = rangeSliderState.isRtl$material3();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1905936604, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance3 = startRestartGroup.changedInstance(rangeSliderState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RangeSliderImpl$lambda$0$2$0;
                        RangeSliderImpl$lambda$0$2$0 = SliderKt.RangeSliderImpl$lambda$0$2$0(RangeSliderState.this, (SliderRange) obj);
                        return RangeSliderImpl$lambda$0$2$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            Modifier focusable = FocusableKt.focusable(rangeSliderOnKeyEvents(semantics, z, steps, valueRange, activeRangeStart, activeRangeEnd, true, isRtl$material3, (Function1) rememberedValue4, rangeSliderState.getOnValueChangeFinished()), z, mutableInteractionSource);
            ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, focusable);
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
            Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 239610549, "C1238@53920L17:Slider.kt#uh7d8r");
            int i4 = (i3 >> 3) & 14;
            function3.invoke(rangeSliderState, composer2, Integer.valueOf(i4 | ((i3 >> 12) & 112)));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier wrapContentWidth$default2 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.INSTANCE, RangeSliderComponents.ENDTHUMB), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(composer2, 1905960714, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance4 = composer2.changedInstance(rangeSliderState);
            Object rememberedValue5 = composer2.rememberedValue();
            if (changedInstance4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RangeSliderImpl$lambda$0$4$0;
                        RangeSliderImpl$lambda$0$4$0 = SliderKt.RangeSliderImpl$lambda$0$4$0(RangeSliderState.this, (IntSize) obj);
                        return RangeSliderImpl$lambda$0$4$0;
                    }
                };
                composer2.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier rangeSliderEndThumbSemantics = rangeSliderEndThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(wrapContentWidth$default2, (Function1) rememberedValue5), rangeSliderState, z);
            ComposerKt.sourceInformationMarkerStart(composer2, 1905970181, "CC(remember):Slider.kt#9igjgp");
            boolean changed2 = composer2.changed(m4895getString2EP1pXo2);
            Object rememberedValue6 = composer2.rememberedValue();
            if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RangeSliderImpl$lambda$0$5$0;
                        RangeSliderImpl$lambda$0$5$0 = SliderKt.RangeSliderImpl$lambda$0$5$0(m4895getString2EP1pXo2, (SemanticsPropertyReceiver) obj);
                        return RangeSliderImpl$lambda$0$5$0;
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier semantics2 = SemanticsModifierKt.semantics(rangeSliderEndThumbSemantics, true, (Function1) rememberedValue6);
            int steps2 = rangeSliderState.getSteps();
            ClosedFloatingPointRange<Float> valueRange2 = rangeSliderState.getValueRange();
            float activeRangeStart2 = rangeSliderState.getActiveRangeStart();
            float activeRangeEnd2 = rangeSliderState.getActiveRangeEnd();
            boolean isRtl$material32 = rangeSliderState.isRtl$material3();
            ComposerKt.sourceInformationMarkerStart(composer2, 1905985729, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance5 = composer2.changedInstance(rangeSliderState);
            Object rememberedValue7 = composer2.rememberedValue();
            if (changedInstance5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RangeSliderImpl$lambda$0$6$0;
                        RangeSliderImpl$lambda$0$6$0 = SliderKt.RangeSliderImpl$lambda$0$6$0(RangeSliderState.this, (SliderRange) obj);
                        return RangeSliderImpl$lambda$0$6$0;
                    }
                };
                composer2.updateRememberedValue(rememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier rangeSliderOnKeyEvents = rangeSliderOnKeyEvents(semantics2, z, steps2, valueRange2, activeRangeStart2, activeRangeEnd2, false, isRtl$material32, (Function1) rememberedValue7, rangeSliderState.getOnValueChangeFinished());
            mutableInteractionSource3 = mutableInteractionSource2;
            Modifier focusable2 = FocusableKt.focusable(rangeSliderOnKeyEvents, z, mutableInteractionSource3);
            ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, focusable2);
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
            Updater.m5872setimpl(m5864constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 85810862, "C1271@55458L15:Slider.kt#uh7d8r");
            rangeSliderState2 = rangeSliderState;
            function34 = function32;
            function34.invoke(rangeSliderState2, composer2, Integer.valueOf(i4 | ((i3 >> 15) & 112)));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, RangeSliderComponents.TRACK);
            ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, layoutId);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
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
            Updater.m5872setimpl(m5864constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -979172334, "C1273@55565L12:Slider.kt#uh7d8r");
            function35 = function33;
            function35.invoke(rangeSliderState2, composer2, Integer.valueOf(i4 | ((i3 >> 18) & 112)));
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
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final RangeSliderState rangeSliderState3 = rangeSliderState2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RangeSliderImpl$lambda$2;
                    RangeSliderImpl$lambda$2 = SliderKt.RangeSliderImpl$lambda$2(Modifier.this, rangeSliderState3, z, mutableInteractionSource, mutableInteractionSource3, function3, function34, function35, i, (Composer) obj, ((Integer) obj2).intValue());
                    return RangeSliderImpl$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$0$0$0(RangeSliderState rangeSliderState, IntSize intSize) {
        rangeSliderState.setStartThumbWidth$material3((int) (intSize.m9911unboximpl() >> 32));
        rangeSliderState.setStartThumbHeight$material3((int) (intSize.m9911unboximpl() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$0$1$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$0$2$0(RangeSliderState rangeSliderState, SliderRange sliderRange) {
        if (rangeSliderState.getOnValueChange$material3() != null) {
            Function1<SliderRange, Unit> onValueChange$material3 = rangeSliderState.getOnValueChange$material3();
            Intrinsics.checkNotNull(onValueChange$material3);
            onValueChange$material3.invoke(sliderRange);
        } else {
            rangeSliderState.setActiveRangeStart(SliderRange.m4040getStartimpl(sliderRange.m4043unboximpl()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$0$4$0(RangeSliderState rangeSliderState, IntSize intSize) {
        rangeSliderState.setEndThumbWidth$material3((int) (intSize.m9911unboximpl() >> 32));
        rangeSliderState.setEndThumbHeight$material3((int) (intSize.m9911unboximpl() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$0$5$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$0$6$0(RangeSliderState rangeSliderState, SliderRange sliderRange) {
        if (rangeSliderState.getOnValueChange$material3() != null) {
            Function1<SliderRange, Unit> onValueChange$material3 = rangeSliderState.getOnValueChange$material3();
            Intrinsics.checkNotNull(onValueChange$material3);
            onValueChange$material3.invoke(sliderRange);
        } else {
            rangeSliderState.setActiveRangeEnd(SliderRange.m4039getEndInclusiveimpl(sliderRange.m4043unboximpl()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    public static final void m4022Thumb9LiSoMs(final MutableInteractionSource mutableInteractionSource, final Modifier modifier, SliderColors sliderColors, boolean z, final long j, final boolean z2, Composer composer, final int i) {
        int i2;
        SliderColors sliderColors2;
        boolean z3;
        int i3;
        long j2;
        long m9823copyDwJknco$default;
        Composer startRestartGroup = composer.startRestartGroup(2115331054);
        ComposerKt.sourceInformation(startRestartGroup, "C(Thumb)N(interactionSource,modifier,colors,enabled,thumbSize:c#ui.unit.DpSize,isVertical)2342@101549L46,2343@101634L775,2343@101600L809,2373@102950L5,2368@102707L255:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            sliderColors2 = sliderColors;
            i2 |= startRestartGroup.changed(sliderColors2) ? 256 : 128;
        } else {
            sliderColors2 = sliderColors;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= startRestartGroup.changed(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2115331054, i2, -1, "androidx.compose.material3.Thumb (Slider.kt:2341)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1313618556, "CC(remember):Slider.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1313622005, "CC(remember):Slider.kt#9igjgp");
            int i4 = i2 & 14;
            boolean z4 = i4 == 4;
            SliderKt$Thumb$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new SliderKt$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i4);
            if (snapshotStateList.isEmpty()) {
                i3 = 2;
                j2 = j;
            } else {
                if (z2) {
                    i3 = 2;
                    m9823copyDwJknco$default = DpSize.m9823copyDwJknco$default(j, 0.0f, Dp.m9732constructorimpl(DpSize.m9828getHeightD9Ej5fM(j) / 2), 1, null);
                } else {
                    i3 = 2;
                    m9823copyDwJknco$default = DpSize.m9823copyDwJknco$default(j, Dp.m9732constructorimpl(DpSize.m9830getWidthD9Ej5fM(j) / 2), 0.0f, 2, null);
                }
                j2 = m9823copyDwJknco$default;
            }
            SpacerKt.Spacer(BackgroundKt.m352backgroundbw27NRU(PointerIconKt.pointerHoverIcon$default(HoverableKt.hoverable$default(SizeKt.m1272size6HolHcs(modifier, j2), mutableInteractionSource, false, i3, null), PointerIcon.INSTANCE.getHand(), false, i3, null), sliderColors.m3977thumbColorvNxB06k$material3(z), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final SliderColors sliderColors3 = sliderColors2;
            final boolean z5 = z3;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Thumb_9LiSoMs$lambda$2;
                    Thumb_9LiSoMs$lambda$2 = SliderKt.Thumb_9LiSoMs$lambda$2(MutableInteractionSource.this, modifier, sliderColors3, z5, j, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Thumb_9LiSoMs$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4026awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        int i2;
        Ref.FloatRef floatRef;
        PointerInputChange pointerInputChange;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            if ((sliderKt$awaitSlop$1.label & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label -= Integer.MIN_VALUE;
                SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
                Object obj = sliderKt$awaitSlop$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sliderKt$awaitSlop$12.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    Function2 function2 = new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit awaitSlop_8vUncbI$lambda$0;
                            awaitSlop_8vUncbI$lambda$0 = SliderKt.awaitSlop_8vUncbI$lambda$0(Ref.FloatRef.this, (PointerInputChange) obj2, ((Float) obj3).floatValue());
                            return awaitSlop_8vUncbI$lambda$0;
                        }
                    };
                    sliderKt$awaitSlop$12.L$0 = floatRef2;
                    sliderKt$awaitSlop$12.label = 1;
                    Object m4781awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m4781awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, sliderKt$awaitSlop$12);
                    if (m4781awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = m4781awaitHorizontalPointerSlopOrCancellationgDDlDlE;
                    floatRef = floatRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef = (Ref.FloatRef) sliderKt$awaitSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
                }
                return null;
            }
        }
        sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$122 = sliderKt$awaitSlop$1;
        Object obj2 = sliderKt$awaitSlop$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sliderKt$awaitSlop$122.label;
        if (i2 != 0) {
        }
        pointerInputChange = (PointerInputChange) obj2;
        if (pointerInputChange == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit awaitSlop_8vUncbI$lambda$0(Ref.FloatRef floatRef, PointerInputChange pointerInputChange, float f) {
        pointerInputChange.consume();
        floatRef.element = f;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i) {
        if (i == 0) {
            return new float[0];
        }
        int i2 = i + 2;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = i3 / (i + 1);
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scale-2geJ7wY, reason: not valid java name */
    public static final long m4029scale2geJ7wY(boolean z, float f, float f2, long j, float f3, float f4) {
        float scale = scale(f, f2, SliderRange.m4040getStartimpl(j), f3, f4);
        float scale2 = scale(f, f2, SliderRange.m4039getEndInclusiveimpl(j), f3, f4);
        if (z) {
            return SliderRange(RangesKt.coerceAtMost(scale, scale2), scale2);
        }
        return SliderRange(scale, RangesKt.coerceAtLeast(scale2, scale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt.coerceIn(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    private static final Modifier sliderSemantics(Modifier modifier, final SliderState sliderState, final boolean z) {
        Modifier increaseHorizontalSemanticsBounds;
        Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit sliderSemantics$lambda$0;
                sliderSemantics$lambda$0 = SliderKt.sliderSemantics$lambda$0(z, sliderState, (SemanticsPropertyReceiver) obj);
                return sliderSemantics$lambda$0;
            }
        }, 1, null);
        if (sliderState.getOrientation() == Orientation.Vertical) {
            increaseHorizontalSemanticsBounds = AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds();
        } else {
            increaseHorizontalSemanticsBounds = AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds();
        }
        return ProgressSemanticsKt.progressSemantics(semantics$default.then(increaseHorizontalSemanticsBounds), sliderState.getValue(), RangesKt.rangeTo(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue()), sliderState.getSteps());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sliderSemantics$lambda$0(boolean z, final SliderState sliderState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, formatForSemantics(sliderState.getValue()));
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean sliderSemantics$lambda$0$0;
                sliderSemantics$lambda$0$0 = SliderKt.sliderSemantics$lambda$0$0(SliderState.this, ((Float) obj).floatValue());
                return Boolean.valueOf(sliderSemantics$lambda$0$0);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sliderSemantics$lambda$0$0(SliderState sliderState, float f) {
        int steps;
        float coerceIn = RangesKt.coerceIn(f, sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
        if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
            float f2 = coerceIn;
            float f3 = f2;
            int i = 0;
            while (true) {
                float lerp = MathHelpersKt.lerp(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue(), i / (sliderState.getSteps() + 1));
                float f4 = lerp - coerceIn;
                if (Math.abs(f4) <= f2) {
                    f2 = Math.abs(f4);
                    f3 = lerp;
                }
                if (i == steps) {
                    break;
                }
                i++;
            }
            coerceIn = f3;
        }
        if (coerceIn == sliderState.getValue()) {
            return false;
        }
        if (coerceIn != sliderState.getValue()) {
            if (sliderState.getOnValueChange() != null) {
                Function1<Float, Unit> onValueChange = sliderState.getOnValueChange();
                if (onValueChange != null) {
                    onValueChange.invoke(Float.valueOf(coerceIn));
                }
            } else {
                sliderState.setValue(coerceIn);
            }
        }
        Function0<Unit> onValueChangeFinished = sliderState.getOnValueChangeFinished();
        if (onValueChangeFinished != null) {
            onValueChangeFinished.invoke();
        }
        return true;
    }

    private static final Modifier rangeSliderStartThumbSemantics(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z) {
        final ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(rangeSliderState.getValueRange().getStart().floatValue(), rangeSliderState.getActiveRangeEnd());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit rangeSliderStartThumbSemantics$lambda$0;
                rangeSliderStartThumbSemantics$lambda$0 = SliderKt.rangeSliderStartThumbSemantics$lambda$0(z, rangeSliderState, rangeTo, (SemanticsPropertyReceiver) obj);
                return rangeSliderStartThumbSemantics$lambda$0;
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeStart(), rangeTo, rangeSliderState.getStartSteps$material3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rangeSliderStartThumbSemantics$lambda$0(boolean z, final RangeSliderState rangeSliderState, final ClosedFloatingPointRange closedFloatingPointRange, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, formatForSemantics(rangeSliderState.getActiveRangeStart()));
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean rangeSliderStartThumbSemantics$lambda$0$0;
                rangeSliderStartThumbSemantics$lambda$0$0 = SliderKt.rangeSliderStartThumbSemantics$lambda$0$0(ClosedFloatingPointRange.this, rangeSliderState, ((Float) obj).floatValue());
                return Boolean.valueOf(rangeSliderStartThumbSemantics$lambda$0$0);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean rangeSliderStartThumbSemantics$lambda$0$0(ClosedFloatingPointRange closedFloatingPointRange, RangeSliderState rangeSliderState, float f) {
        int startSteps$material3;
        float coerceIn = RangesKt.coerceIn(f, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
        if (rangeSliderState.getStartSteps$material3() > 0 && (startSteps$material3 = rangeSliderState.getStartSteps$material3() + 1) >= 0) {
            float f2 = coerceIn;
            float f3 = f2;
            int i = 0;
            while (true) {
                float lerp = MathHelpersKt.lerp(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), i / (rangeSliderState.getStartSteps$material3() + 1));
                float f4 = lerp - coerceIn;
                if (Math.abs(f4) <= f2) {
                    f2 = Math.abs(f4);
                    f3 = lerp;
                }
                if (i == startSteps$material3) {
                    break;
                }
                i++;
            }
            coerceIn = f3;
        }
        if (coerceIn == rangeSliderState.getActiveRangeStart()) {
            return false;
        }
        long SliderRange = SliderRange(coerceIn, rangeSliderState.getActiveRangeEnd());
        if (!SliderRange.m4038equalsimpl0(SliderRange, SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
            if (rangeSliderState.getOnValueChange$material3() != null) {
                Function1<SliderRange, Unit> onValueChange$material3 = rangeSliderState.getOnValueChange$material3();
                if (onValueChange$material3 != null) {
                    onValueChange$material3.invoke(SliderRange.m4035boximpl(SliderRange));
                }
            } else {
                rangeSliderState.setActiveRangeStart(SliderRange.m4040getStartimpl(SliderRange));
                rangeSliderState.setActiveRangeEnd(SliderRange.m4039getEndInclusiveimpl(SliderRange));
            }
        }
        Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
        if (onValueChangeFinished != null) {
            onValueChangeFinished.invoke();
        }
        return true;
    }

    private static final Modifier rangeSliderEndThumbSemantics(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z) {
        final ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(rangeSliderState.getActiveRangeStart(), rangeSliderState.getValueRange().getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit rangeSliderEndThumbSemantics$lambda$0;
                rangeSliderEndThumbSemantics$lambda$0 = SliderKt.rangeSliderEndThumbSemantics$lambda$0(z, rangeSliderState, rangeTo, (SemanticsPropertyReceiver) obj);
                return rangeSliderEndThumbSemantics$lambda$0;
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeEnd(), rangeTo, rangeSliderState.getEndSteps$material3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rangeSliderEndThumbSemantics$lambda$0(boolean z, final RangeSliderState rangeSliderState, final ClosedFloatingPointRange closedFloatingPointRange, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, formatForSemantics(rangeSliderState.getActiveRangeEnd()));
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean rangeSliderEndThumbSemantics$lambda$0$0;
                rangeSliderEndThumbSemantics$lambda$0$0 = SliderKt.rangeSliderEndThumbSemantics$lambda$0$0(ClosedFloatingPointRange.this, rangeSliderState, ((Float) obj).floatValue());
                return Boolean.valueOf(rangeSliderEndThumbSemantics$lambda$0$0);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean rangeSliderEndThumbSemantics$lambda$0$0(ClosedFloatingPointRange closedFloatingPointRange, RangeSliderState rangeSliderState, float f) {
        int endSteps$material3;
        float coerceIn = RangesKt.coerceIn(f, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
        if (rangeSliderState.getEndSteps$material3() > 0 && (endSteps$material3 = rangeSliderState.getEndSteps$material3() + 1) >= 0) {
            float f2 = coerceIn;
            float f3 = f2;
            int i = 0;
            while (true) {
                float lerp = MathHelpersKt.lerp(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), i / (rangeSliderState.getEndSteps$material3() + 1));
                float f4 = lerp - coerceIn;
                if (Math.abs(f4) <= f2) {
                    f2 = Math.abs(f4);
                    f3 = lerp;
                }
                if (i == endSteps$material3) {
                    break;
                }
                i++;
            }
            coerceIn = f3;
        }
        if (coerceIn == rangeSliderState.getActiveRangeEnd()) {
            return false;
        }
        long SliderRange = SliderRange(rangeSliderState.getActiveRangeStart(), coerceIn);
        if (!SliderRange.m4038equalsimpl0(SliderRange, SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
            if (rangeSliderState.getOnValueChange$material3() != null) {
                Function1<SliderRange, Unit> onValueChange$material3 = rangeSliderState.getOnValueChange$material3();
                if (onValueChange$material3 != null) {
                    onValueChange$material3.invoke(SliderRange.m4035boximpl(SliderRange));
                }
            } else {
                rangeSliderState.setActiveRangeStart(SliderRange.m4040getStartimpl(SliderRange));
                rangeSliderState.setActiveRangeEnd(SliderRange.m4039getEndInclusiveimpl(SliderRange));
            }
        }
        Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
        if (onValueChangeFinished != null) {
            onValueChangeFinished.invoke();
        }
        return true;
    }

    private static final String formatForSemantics(float f) {
        return String.valueOf(MathKt.roundToInt(f * 100) / 100.0f);
    }

    private static final Modifier sliderTapModifier(Modifier modifier, final SliderState sliderState, final MutableInteractionSource mutableInteractionSource, boolean z) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, sliderState, mutableInteractionSource, new PointerInputEventHandler() { // from class: androidx.compose.material3.SliderKt$sliderTapModifier$1

            /* compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
            @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", i = {}, l = {2620}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ SliderState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, SliderState sliderState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$this_pointerInput = pointerInputScope;
                    this.$interactionSource = mutableInteractionSource;
                    this.$state = sliderState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$this_pointerInput, this.$interactionSource, this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00211 c00211 = new C00211(this.$interactionSource, this.$state, null);
                        final SliderState sliderState = this.$state;
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00211, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.material3.SliderKt$sliderTapModifier$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                            	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                            	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:115)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            */
                        /*
                            this = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r9.label
                            r2 = 1
                            if (r1 == 0) goto L17
                            if (r1 != r2) goto Lf
                            kotlin.ResultKt.throwOnFailure(r10)
                            goto L40
                        Lf:
                            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r10.<init>(r0)
                            throw r10
                        L17:
                            kotlin.ResultKt.throwOnFailure(r10)
                            androidx.compose.ui.input.pointer.PointerInputScope r1 = r9.$this_pointerInput
                            androidx.compose.material3.SliderKt$sliderTapModifier$1$1$1 r10 = new androidx.compose.material3.SliderKt$sliderTapModifier$1$1$1
                            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r9.$interactionSource
                            androidx.compose.material3.SliderState r4 = r9.$state
                            r5 = 0
                            r10.<init>(r3, r4, r5)
                            r4 = r10
                            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
                            androidx.compose.material3.SliderState r10 = r9.$state
                            androidx.compose.material3.SliderKt$sliderTapModifier$1$1$$ExternalSyntheticLambda0 r5 = new androidx.compose.material3.SliderKt$sliderTapModifier$1$1$$ExternalSyntheticLambda0
                            r5.<init>(r10)
                            r6 = r9
                            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                            r9.label = r2
                            r2 = 0
                            r3 = 0
                            r7 = 3
                            r8 = 0
                            java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(r1, r2, r3, r4, r5, r6, r7, r8)
                            if (r10 != r0) goto L40
                            return r0
                        L40:
                            kotlin.Unit r10 = kotlin.Unit.INSTANCE
                            return r10
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt$sliderTapModifier$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    /* compiled from: Slider.kt */
                    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                    @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1$1", f = "Slider.kt", i = {0}, l = {2627, 2638, 2638}, m = "invokeSuspend", n = {"press"}, s = {"L$0"}, v = 1)
                    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00211 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ SliderState $state;
                        /* synthetic */ long J$0;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00211(MutableInteractionSource mutableInteractionSource, SliderState sliderState, Continuation<? super C00211> continuation) {
                            super(3, continuation);
                            this.$interactionSource = mutableInteractionSource;
                            this.$state = sliderState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                            return m4034invoked4ec7I(pressGestureScope, offset.m6529unboximpl(), continuation);
                        }

                        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                        public final Object m4034invoked4ec7I(PressGestureScope pressGestureScope, long j, Continuation<? super Unit> continuation) {
                            C00211 c00211 = new C00211(this.$interactionSource, this.$state, continuation);
                            c00211.L$0 = pressGestureScope;
                            c00211.J$0 = j;
                            return c00211.invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                        /* JADX WARN: Type inference failed for: r1v11, types: [androidx.compose.foundation.interaction.PressInteraction$Press] */
                        /* JADX WARN: Type inference failed for: r1v14 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Throwable th;
                            PressInteraction.Cancel cancel;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            PressInteraction.Press press = this.label;
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            if (press == 0) {
                                ResultKt.throwOnFailure(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                long j = this.J$0;
                                PressInteraction.Press press2 = new PressInteraction.Press(j, null);
                                try {
                                    this.$interactionSource.tryEmit(press2);
                                    this.$state.m4046onPressk4lQ0M$material3(j);
                                    this.L$0 = press2;
                                    this.label = 1;
                                    obj = pressGestureScope.tryAwaitRelease(this);
                                    if (obj != coroutine_suspended) {
                                        press = press2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    press = press2;
                                    if (press == 0) {
                                        throw th;
                                    }
                                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                    PressInteraction.Cancel cancel2 = new PressInteraction.Cancel(press);
                                    this.L$0 = th;
                                    this.label = 3;
                                    if (mutableInteractionSource.emit(cancel2, this) != coroutine_suspended) {
                                        th = th;
                                        throw th;
                                    }
                                    return coroutine_suspended;
                                }
                                return coroutine_suspended;
                            }
                            if (press != 1) {
                                if (press == 2) {
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                if (press != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                th = (Throwable) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                throw th;
                            }
                            PressInteraction.Press press3 = (PressInteraction.Press) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            press = press3;
                            if (((Boolean) obj).booleanValue()) {
                                cancel = new PressInteraction.Release(press);
                            } else {
                                cancel = new PressInteraction.Cancel(press);
                            }
                            this.$interactionSource.tryEmit(cancel);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invokeSuspend$lambda$0(SliderState sliderState, Offset offset) {
                        sliderState.dispatchRawDelta(0.0f);
                        sliderState.getGestureEndAction$material3().invoke();
                        return Unit.INSTANCE;
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    Object coroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass1(pointerInputScope, MutableInteractionSource.this, sliderState, null), continuation);
                    return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
                }
            }) : modifier;
        }

        private static final Modifier rangeSliderPressDragModifier(Modifier modifier, final RangeSliderState rangeSliderState, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, boolean z) {
            return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, rangeSliderState}, new PointerInputEventHandler() { // from class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1

                /* compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {2664}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    final /* synthetic */ RangeSliderState $state;
                    final /* synthetic */ PointerInputScope $this_pointerInput;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$this_pointerInput = pointerInputScope;
                        this.$state = rangeSliderState;
                        this.$rangeSliderLogic = rangeSliderLogic;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, this.$rangeSliderLogic, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: Slider.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {2670, 2688, 2722}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "draggingStart", "$this$awaitEachGesture", "draggingStart", "press", "down", "interactionSource", "posX", "overSlop", "pointerSlop", "activeDragInteraction", "draggingStart", "interactionSource", "interaction"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "J$0", "F$1", "L$0", "L$1", "L$2", "L$3"}, v = 1)
                    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00201 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ CoroutineScope $$this$coroutineScope;
                        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                        final /* synthetic */ RangeSliderState $state;
                        float F$0;
                        float F$1;
                        long J$0;
                        private /* synthetic */ Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00201(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, CoroutineScope coroutineScope, Continuation<? super C00201> continuation) {
                            super(2, continuation);
                            this.$state = rangeSliderState;
                            this.$rangeSliderLogic = rangeSliderLogic;
                            this.$$this$coroutineScope = coroutineScope;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C00201 c00201 = new C00201(this.$state, this.$rangeSliderLogic, this.$$this$coroutineScope, continuation);
                            c00201.L$0 = obj;
                            return c00201;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                            return ((C00201) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:129:0x00ce, code lost:
                        
                            if (r11 < 0) goto L33;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:113:0x02e3 A[Catch: all -> 0x0314, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0314, blocks: (B:41:0x0148, B:53:0x0121, B:100:0x0293, B:103:0x029b, B:113:0x02e3), top: B:40:0x0148 }] */
                        /* JADX WARN: Removed duplicated region for block: B:116:0x0168  */
                        /* JADX WARN: Removed duplicated region for block: B:13:0x0244 A[Catch: all -> 0x002c, TryCatch #7 {all -> 0x002c, blocks: (B:9:0x0024, B:11:0x0236, B:13:0x0244, B:14:0x0253, B:23:0x024c), top: B:8:0x0024 }] */
                        /* JADX WARN: Removed duplicated region for block: B:18:0x02fc  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x024c A[Catch: all -> 0x002c, TryCatch #7 {all -> 0x002c, blocks: (B:9:0x0024, B:11:0x0236, B:13:0x0244, B:14:0x0253, B:23:0x024c), top: B:8:0x0024 }] */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x0329  */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x0362  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
                        /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
                        /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
                        /* JADX WARN: Removed duplicated region for block: B:59:0x0188  */
                        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
                        /* JADX WARN: Type inference failed for: r2v1 */
                        /* JADX WARN: Type inference failed for: r2v13, types: [kotlin.jvm.internal.Ref$BooleanRef] */
                        /* JADX WARN: Type inference failed for: r2v49 */
                        /* JADX WARN: Type inference failed for: r2v50 */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x013e -> B:40:0x0148). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(Object obj) {
                            Ref.BooleanRef booleanRef;
                            DragInteraction.Start start;
                            PressInteraction.Press press;
                            char c;
                            AwaitPointerEventScope awaitPointerEventScope;
                            Object awaitFirstDown$default;
                            PointerInputChange pointerInputChange;
                            float totalWidth$material3;
                            boolean z;
                            MutableInteractionSource activeInteraction;
                            long m6535getZeroF1C5BW0;
                            PressInteraction.Press press2;
                            PointerInputChange pointerInputChange2;
                            Ref.BooleanRef booleanRef2;
                            float f;
                            DragInteraction.Start start2;
                            Object awaitPointerEvent$default;
                            MutableInteractionSource mutableInteractionSource;
                            Ref.BooleanRef booleanRef3;
                            long j;
                            Ref.BooleanRef booleanRef4;
                            final Ref.BooleanRef booleanRef5;
                            Object m616horizontalDragjO51t88;
                            DragInteraction.Start start3;
                            boolean booleanValue;
                            DragInteraction.Cancel cancel;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            ?? r2 = this.label;
                            int i = 2;
                            try {
                                try {
                                    if (r2 == 0) {
                                        c = ' ';
                                        ResultKt.throwOnFailure(obj);
                                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                        Ref.BooleanRef booleanRef6 = new Ref.BooleanRef();
                                        this.L$0 = awaitPointerEventScope;
                                        this.L$1 = booleanRef6;
                                        this.label = 1;
                                        awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                                        r2 = booleanRef6;
                                        if (awaitFirstDown$default == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else if (r2 == 1) {
                                        c = ' ';
                                        Ref.BooleanRef booleanRef7 = (Ref.BooleanRef) this.L$1;
                                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                        awaitPointerEventScope = awaitPointerEventScope2;
                                        awaitFirstDown$default = obj;
                                        r2 = booleanRef7;
                                    } else {
                                        if (r2 != 2) {
                                            if (r2 != 3) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            start3 = (DragInteraction.Start) this.L$3;
                                            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) this.L$2;
                                            booleanRef = (Ref.BooleanRef) this.L$1;
                                            start = (DragInteraction.Start) this.L$0;
                                            try {
                                                ResultKt.throwOnFailure(obj);
                                                mutableInteractionSource = mutableInteractionSource2;
                                                m616horizontalDragjO51t88 = obj;
                                                booleanValue = ((Boolean) m616horizontalDragjO51t88).booleanValue();
                                                this.$state.setDragging$material3(false);
                                                if (!booleanValue) {
                                                    cancel = new DragInteraction.Stop(start3);
                                                } else {
                                                    cancel = new DragInteraction.Cancel(start3);
                                                }
                                                this.$state.getGestureEndAction$material3().invoke(Boxing.boxBoolean(booleanRef.element));
                                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass4(mutableInteractionSource, cancel, null), 3, null);
                                                booleanRef4 = booleanRef;
                                                if (this.$state.isDragging$material3()) {
                                                    this.$state.getGestureEndAction$material3().invoke(Boxing.boxBoolean(booleanRef4.element));
                                                    this.$state.setDragging$material3(false);
                                                }
                                                return Unit.INSTANCE;
                                            } catch (Throwable th) {
                                                th = th;
                                                press = null;
                                                if (this.$state.isDragging$material3()) {
                                                }
                                                if (press != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        f = this.F$1;
                                        long j2 = this.J$0;
                                        float f2 = this.F$0;
                                        MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) this.L$4;
                                        PointerInputChange pointerInputChange3 = (PointerInputChange) this.L$3;
                                        press = (PressInteraction.Press) this.L$2;
                                        Ref.BooleanRef booleanRef8 = (Ref.BooleanRef) this.L$1;
                                        c = ' ';
                                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                                        try {
                                            ResultKt.throwOnFailure(obj);
                                            AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope3;
                                            booleanRef2 = booleanRef8;
                                            press2 = press;
                                            pointerInputChange2 = pointerInputChange3;
                                            mutableInteractionSource = mutableInteractionSource3;
                                            float f3 = f2;
                                            awaitPointerEvent$default = obj;
                                            start2 = null;
                                            try {
                                                PointerInputChange pointerInputChange4 = (PointerInputChange) CollectionsKt.firstOrNull((List) ((PointerEvent) awaitPointerEvent$default).getChanges());
                                                if (pointerInputChange4 == null) {
                                                    booleanRef3 = booleanRef2;
                                                    try {
                                                        j = Offset.m6524plusMKHz9U(j2, PointerEventKt.positionChange(pointerInputChange4));
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        start = start2;
                                                        press = press2;
                                                        booleanRef = booleanRef3;
                                                        if (this.$state.isDragging$material3()) {
                                                            if (start != null) {
                                                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new SliderKt$rangeSliderPressDragModifier$1$1$1$7$1(this.$rangeSliderLogic.activeInteraction(booleanRef.element), start, null), 3, null);
                                                            }
                                                            this.$state.getGestureEndAction$material3().invoke(Boxing.boxBoolean(booleanRef.element));
                                                            this.$state.setDragging$material3(false);
                                                        }
                                                        if (press != null) {
                                                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new SliderKt$rangeSliderPressDragModifier$1$1$1$8$1(this.$rangeSliderLogic.activeInteraction(booleanRef.element), press, null), 3, null);
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    booleanRef3 = booleanRef2;
                                                    j = j2;
                                                }
                                                if (pointerInputChange4 == null && pointerInputChange4.getPressed() && Offset.m6518getDistanceSquaredimpl(j) < f * f) {
                                                    awaitPointerEventScope = awaitPointerEventScope4;
                                                    totalWidth$material3 = f3;
                                                    activeInteraction = mutableInteractionSource;
                                                    m6535getZeroF1C5BW0 = j;
                                                    booleanRef2 = booleanRef3;
                                                    i = 2;
                                                    this.L$0 = awaitPointerEventScope;
                                                    this.L$1 = booleanRef2;
                                                    this.L$2 = press2;
                                                    this.L$3 = pointerInputChange2;
                                                    this.L$4 = activeInteraction;
                                                    this.F$0 = totalWidth$material3;
                                                    this.J$0 = m6535getZeroF1C5BW0;
                                                    this.F$1 = f;
                                                    this.label = i;
                                                    awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                                                    if (awaitPointerEvent$default != coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    MutableInteractionSource mutableInteractionSource4 = activeInteraction;
                                                    awaitPointerEventScope4 = awaitPointerEventScope;
                                                    long j3 = m6535getZeroF1C5BW0;
                                                    f3 = totalWidth$material3;
                                                    mutableInteractionSource = mutableInteractionSource4;
                                                    j2 = j3;
                                                    PointerInputChange pointerInputChange42 = (PointerInputChange) CollectionsKt.firstOrNull((List) ((PointerEvent) awaitPointerEvent$default).getChanges());
                                                    if (pointerInputChange42 == null) {
                                                    }
                                                    if (pointerInputChange42 == null) {
                                                    }
                                                    if (pointerInputChange42 != null) {
                                                    }
                                                    booleanRef4 = booleanRef3;
                                                    if (pointerInputChange42 == null) {
                                                    }
                                                    if (press2 != null) {
                                                    }
                                                    if (this.$state.isDragging$material3()) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                if (pointerInputChange42 != null) {
                                                    int i2 = (int) (j >> c);
                                                    try {
                                                        if (Math.abs(Float.intBitsToFloat(i2)) > Math.abs(Float.intBitsToFloat((int) (j & 4294967295L)))) {
                                                            if (press2 != null) {
                                                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new SliderKt$rangeSliderPressDragModifier$1$1$1$2$1(mutableInteractionSource, press2, null), 3, null);
                                                            }
                                                            try {
                                                                DragInteraction.Start start4 = new DragInteraction.Start();
                                                                try {
                                                                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass3(mutableInteractionSource, start4, null), 3, null);
                                                                    booleanRef5 = booleanRef3;
                                                                    try {
                                                                        this.$state.onDrag$material3(booleanRef5.element, (f3 - (booleanRef5.element ? this.$state.getRawOffsetStart$material3() : this.$state.getRawOffsetEnd$material3())) + (this.$state.isRtl$material3() ? -Float.intBitsToFloat(i2) : Float.intBitsToFloat(i2)));
                                                                        this.$state.setDragging$material3(true);
                                                                        long id = pointerInputChange2.getId();
                                                                        final RangeSliderState rangeSliderState = this.$state;
                                                                        this.L$0 = start4;
                                                                        this.L$1 = booleanRef5;
                                                                        this.L$2 = mutableInteractionSource;
                                                                        this.L$3 = start4;
                                                                        this.L$4 = null;
                                                                        this.label = 3;
                                                                        m616horizontalDragjO51t88 = DragGestureDetectorKt.m616horizontalDragjO51t88(awaitPointerEventScope4, id, 
                                                                        /*  JADX ERROR: Method code generation error
                                                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x022c: INVOKE (r2v29 'm616horizontalDragjO51t88' java.lang.Object) = 
                                                                              (r11v17 'awaitPointerEventScope4' androidx.compose.ui.input.pointer.AwaitPointerEventScope)
                                                                              (r6v8 'id' long)
                                                                              (wrap:kotlin.jvm.functions.Function1:0x0219: CONSTRUCTOR 
                                                                              (r2v26 'rangeSliderState' androidx.compose.material3.RangeSliderState A[DONT_INLINE])
                                                                              (r5v15 'booleanRef5' kotlin.jvm.internal.Ref$BooleanRef A[DONT_INLINE])
                                                                             A[Catch: all -> 0x027d, MD:(androidx.compose.material3.RangeSliderState, kotlin.jvm.internal.Ref$BooleanRef):void (m), WRAPPED] call: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.material3.RangeSliderState, kotlin.jvm.internal.Ref$BooleanRef):void type: CONSTRUCTOR)
                                                                              (r30v0 'this' androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1 A[IMMUTABLE_TYPE, THIS])
                                                                             STATIC call: androidx.compose.foundation.gestures.DragGestureDetectorKt.horizontalDrag-jO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object A[Catch: all -> 0x027d, MD:(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>, kotlin.coroutines.Continuation<? super java.lang.Boolean>):java.lang.Object (m), TRY_LEAVE] in method: androidx.compose.material3.SliderKt.rangeSliderPressDragModifier.1.1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes.dex
                                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                                                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                                            	... 91 more
                                                                            */
                                                                        /*
                                                                            Method dump skipped, instructions count: 897
                                                                            To view this dump add '--comments-level debug' option
                                                                        */
                                                                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00201.invokeSuspend(java.lang.Object):java.lang.Object");
                                                                    }

                                                                    /* compiled from: Slider.kt */
                                                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                                                                    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$3", f = "Slider.kt", i = {}, l = {2708}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                                                                    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$3, reason: invalid class name */
                                                                    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                        final /* synthetic */ DragInteraction.Start $interaction;
                                                                        final /* synthetic */ MutableInteractionSource $interactionSource;
                                                                        int label;

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        AnonymousClass3(MutableInteractionSource mutableInteractionSource, DragInteraction.Start start, Continuation<? super AnonymousClass3> continuation) {
                                                                            super(2, continuation);
                                                                            this.$interactionSource = mutableInteractionSource;
                                                                            this.$interaction = start;
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                            return new AnonymousClass3(this.$interactionSource, this.$interaction, continuation);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        public final Object invokeSuspend(Object obj) {
                                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                            int i = this.label;
                                                                            if (i == 0) {
                                                                                ResultKt.throwOnFailure(obj);
                                                                                this.label = 1;
                                                                                if (this.$interactionSource.emit(this.$interaction, this) == coroutine_suspended) {
                                                                                    return coroutine_suspended;
                                                                                }
                                                                            } else {
                                                                                if (i != 1) {
                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                }
                                                                                ResultKt.throwOnFailure(obj);
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invokeSuspend$lambda$2(RangeSliderState rangeSliderState, Ref.BooleanRef booleanRef, PointerInputChange pointerInputChange) {
                                                                        float intBitsToFloat = Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) >> 32));
                                                                        boolean z = booleanRef.element;
                                                                        if (rangeSliderState.isRtl$material3()) {
                                                                            intBitsToFloat = -intBitsToFloat;
                                                                        }
                                                                        rangeSliderState.onDrag$material3(z, intBitsToFloat);
                                                                        pointerInputChange.consume();
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* compiled from: Slider.kt */
                                                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                                                                    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$4", f = "Slider.kt", i = {}, l = {2740}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                                                                    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$4, reason: invalid class name */
                                                                    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                        final /* synthetic */ DragInteraction $finishInteraction;
                                                                        final /* synthetic */ MutableInteractionSource $interactionSource;
                                                                        int label;

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        AnonymousClass4(MutableInteractionSource mutableInteractionSource, DragInteraction dragInteraction, Continuation<? super AnonymousClass4> continuation) {
                                                                            super(2, continuation);
                                                                            this.$interactionSource = mutableInteractionSource;
                                                                            this.$finishInteraction = dragInteraction;
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                            return new AnonymousClass4(this.$interactionSource, this.$finishInteraction, continuation);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        public final Object invokeSuspend(Object obj) {
                                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                            int i = this.label;
                                                                            if (i == 0) {
                                                                                ResultKt.throwOnFailure(obj);
                                                                                this.label = 1;
                                                                                if (this.$interactionSource.emit(this.$finishInteraction, this) == coroutine_suspended) {
                                                                                    return coroutine_suspended;
                                                                                }
                                                                            } else {
                                                                                if (i != 1) {
                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                }
                                                                                ResultKt.throwOnFailure(obj);
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    }
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                                                                        this.label = 1;
                                                                        if (ForEachGestureKt.awaitEachGesture(this.$this_pointerInput, new C00201(this.$state, this.$rangeSliderLogic, coroutineScope, null), this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    } else {
                                                                        if (i != 1) {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        ResultKt.throwOnFailure(obj);
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }

                                                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                                            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                                                Object coroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass1(pointerInputScope, RangeSliderState.this, new RangeSliderLogic(RangeSliderState.this, mutableInteractionSource, mutableInteractionSource2), null), continuation);
                                                                return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
                                                            }
                                                        }) : modifier;
                                                    }

                                                    static {
                                                        float m5577getHandleWidthD9Ej5fM = SliderTokens.INSTANCE.m5577getHandleWidthD9Ej5fM();
                                                        ThumbWidth = m5577getHandleWidthD9Ej5fM;
                                                        float m5576getHandleHeightD9Ej5fM = SliderTokens.INSTANCE.m5576getHandleHeightD9Ej5fM();
                                                        ThumbHeight = m5576getHandleHeightD9Ej5fM;
                                                        ThumbSize = DpKt.m9754DpSizeYgX7TsA(m5577getHandleWidthD9Ej5fM, m5576getHandleHeightD9Ej5fM);
                                                        VerticalThumbSize = DpKt.m9754DpSizeYgX7TsA(m5576getHandleHeightD9Ej5fM, m5577getHandleWidthD9Ej5fM);
                                                        ThumbTrackGapSize = SliderTokens.INSTANCE.m5569getActiveHandleLeadingSpaceD9Ej5fM();
                                                        TrackInsideCornerSize = Dp.m9732constructorimpl(2);
                                                        CornerSizeAlignmentLine = new VerticalAlignmentLine(SliderKt$CornerSizeAlignmentLine$1.INSTANCE);
                                                    }

                                                    public static final float getTrackHeight() {
                                                        return TrackHeight;
                                                    }

                                                    public static final float getThumbWidth() {
                                                        return ThumbWidth;
                                                    }

                                                    public static final SliderState rememberSliderState(final float f, final int i, final Function0<Unit> function0, final ClosedFloatingPointRange<Float> closedFloatingPointRange, Composer composer, int i2, int i3) {
                                                        ComposerKt.sourceInformationMarkerStart(composer, 1193499219, "C(rememberSliderState)N(value,steps,onValueChangeFinished,valueRange)3200@137842L188,3200@137763L267:Slider.kt#uh7d8r");
                                                        if ((i3 & 1) != 0) {
                                                            f = 0.0f;
                                                        }
                                                        if ((i3 & 2) != 0) {
                                                            i = 0;
                                                        }
                                                        if ((i3 & 4) != 0) {
                                                            function0 = null;
                                                        }
                                                        if ((i3 & 8) != 0) {
                                                            closedFloatingPointRange = RangesKt.rangeTo(0.0f, 1.0f);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1193499219, i2, -1, "androidx.compose.material3.rememberSliderState (Slider.kt:3199)");
                                                        }
                                                        Object[] objArr = new Object[0];
                                                        Saver<SliderState, ?> Saver = SliderState.INSTANCE.Saver(function0, closedFloatingPointRange);
                                                        ComposerKt.sourceInformationMarkerStart(composer, 196491279, "CC(remember):Slider.kt#9igjgp");
                                                        boolean z = true;
                                                        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.changed(f)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(function0)) || (i2 & 384) == 256);
                                                        if ((((i2 & 7168) ^ 3072) <= 2048 || !composer.changed(closedFloatingPointRange)) && (i2 & 3072) != 2048) {
                                                            z = false;
                                                        }
                                                        boolean z3 = z2 | z;
                                                        Object rememberedValue = composer.rememberedValue();
                                                        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue = new Function0() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda31
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    SliderState rememberSliderState$lambda$0$0;
                                                                    rememberSliderState$lambda$0$0 = SliderKt.rememberSliderState$lambda$0$0(f, i, function0, closedFloatingPointRange);
                                                                    return rememberSliderState$lambda$0$0;
                                                                }
                                                            };
                                                            composer.updateRememberedValue(rememberedValue);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                                        SliderState sliderState = (SliderState) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue, composer, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                                        return sliderState;
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: private */
                                                    public static final SliderState rememberSliderState$lambda$0$0(float f, int i, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange) {
                                                        return new SliderState(f, i, function0, closedFloatingPointRange);
                                                    }

                                                    public static final RangeSliderState rememberRangeSliderState(float f, float f2, int i, Function0<Unit> function0, ClosedFloatingPointRange<Float> closedFloatingPointRange, Composer composer, int i2, int i3) {
                                                        ComposerKt.sourceInformationMarkerStart(composer, 756708139, "C(rememberRangeSliderState)N(activeRangeStart,activeRangeEnd,steps,onValueChangeFinished,valueRange)3414@147900L260,3414@147816L344:Slider.kt#uh7d8r");
                                                        final float f3 = (i3 & 1) != 0 ? 0.0f : f;
                                                        final float f4 = (i3 & 2) != 0 ? 1.0f : f2;
                                                        final int i4 = (i3 & 4) != 0 ? 0 : i;
                                                        final Function0<Unit> function02 = (i3 & 8) != 0 ? null : function0;
                                                        final ClosedFloatingPointRange<Float> rangeTo = (i3 & 16) != 0 ? RangesKt.rangeTo(0.0f, 1.0f) : closedFloatingPointRange;
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(756708139, i2, -1, "androidx.compose.material3.rememberRangeSliderState (Slider.kt:3413)");
                                                        }
                                                        Object[] objArr = new Object[0];
                                                        Saver<RangeSliderState, ?> Saver = RangeSliderState.INSTANCE.Saver(function02, rangeTo);
                                                        ComposerKt.sourceInformationMarkerStart(composer, 1347060335, "CC(remember):Slider.kt#9igjgp");
                                                        boolean z = true;
                                                        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.changed(f3)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(f4)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i4)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(function02)) || (i2 & 3072) == 2048);
                                                        if ((((57344 & i2) ^ 24576) <= 16384 || !composer.changed(rangeTo)) && (i2 & 24576) != 16384) {
                                                            z = false;
                                                        }
                                                        boolean z3 = z2 | z;
                                                        Object rememberedValue = composer.rememberedValue();
                                                        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                            Function0 function03 = new Function0() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda3
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    RangeSliderState rememberRangeSliderState$lambda$0$0;
                                                                    rememberRangeSliderState$lambda$0$0 = SliderKt.rememberRangeSliderState$lambda$0$0(f3, f4, i4, function02, rangeTo);
                                                                    return rememberRangeSliderState$lambda$0$0;
                                                                }
                                                            };
                                                            composer.updateRememberedValue(function03);
                                                            rememberedValue = function03;
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                                        RangeSliderState rangeSliderState = (RangeSliderState) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue, composer, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                                        return rangeSliderState;
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: private */
                                                    public static final RangeSliderState rememberRangeSliderState$lambda$0$0(float f, float f2, int i, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange) {
                                                        return new RangeSliderState(f, f2, i, function0, closedFloatingPointRange);
                                                    }

                                                    public static final long SliderRange(float f, float f2) {
                                                        if ((!Float.isNaN(f) || !Float.isNaN(f2)) && f > f2) {
                                                            throw new IllegalArgumentException(("start(" + f + ") must be <= endInclusive(" + f2 + ')').toString());
                                                        }
                                                        return SliderRange.m4036constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                                                    }

                                                    public static final long SliderRange(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
                                                        float floatValue = closedFloatingPointRange.getStart().floatValue();
                                                        float floatValue2 = closedFloatingPointRange.getEndInclusive().floatValue();
                                                        if ((!Float.isNaN(floatValue) || !Float.isNaN(floatValue2)) && floatValue > floatValue2) {
                                                            throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + floatValue + ") must be <= ClosedFloatingPoint.endInclusive(" + floatValue2 + ')').toString());
                                                        }
                                                        return SliderRange.m4036constructorimpl((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L));
                                                    }

                                                    /* renamed from: isSpecified-If1S1O4, reason: not valid java name */
                                                    public static final boolean m4027isSpecifiedIf1S1O4(long j) {
                                                        return j != SliderRange.INSTANCE.m4045getUnspecifiedFYbKRX4();
                                                    }

                                                    public static final VerticalAlignmentLine getCornerSizeAlignmentLine() {
                                                        return CornerSizeAlignmentLine;
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: private */
                                                    public static final float snapValueToTick(float f, float[] fArr, float f2, float f3) {
                                                        Float valueOf;
                                                        if (fArr.length == 0) {
                                                            valueOf = null;
                                                        } else {
                                                            float f4 = fArr[0];
                                                            int lastIndex = ArraysKt.getLastIndex(fArr);
                                                            if (lastIndex != 0) {
                                                                float abs = Math.abs(MathHelpersKt.lerp(f2, f3, f4) - f);
                                                                int i = 1;
                                                                if (1 <= lastIndex) {
                                                                    while (true) {
                                                                        float f5 = fArr[i];
                                                                        float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f5) - f);
                                                                        if (Float.compare(abs, abs2) > 0) {
                                                                            f4 = f5;
                                                                            abs = abs2;
                                                                        }
                                                                        if (i == lastIndex) {
                                                                            break;
                                                                        }
                                                                        i++;
                                                                    }
                                                                }
                                                                valueOf = Float.valueOf(f4);
                                                            } else {
                                                                valueOf = Float.valueOf(f4);
                                                            }
                                                        }
                                                        return valueOf != null ? MathHelpersKt.lerp(f2, f3, valueOf.floatValue()) : f;
                                                    }
                                                }
