package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.PointerIconCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000ô\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a \u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a3\u0010 \u001a\u00020\u0001*\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(\u001aJ\u0010)\u001a\u00020\u0001*\u00020*2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0-H\u0082@¢\u0006\u0004\b.\u0010/\u001a1\u00104\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020*2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0013H\u0001¢\u0006\u0002\u00105\u001a1\u00106\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020*2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0013H\u0001¢\u0006\u0002\u00105\u001a%\u00107\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00108\u001a\u001d\u00109\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010:\u001a\u001d\u0010;\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010:\u001a\u001d\u0010<\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010:\u001a%\u0010=\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010>\u001a%\u0010?\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010>\u001a=\u0010@\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020DH\u0003¢\u0006\u0002\u0010F\u001aQ\u0010G\u001a\u00020\u00012\u0006\u0010H\u001a\u00020\u00132\u0006\u0010I\u001a\u00020D2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00010K2\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010L\u001a\u0018\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00010M¢\u0006\u0002\bO¢\u0006\u0002\bPH\u0003¢\u0006\u0002\u0010Q\u001a\u0015\u0010R\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010S\u001a?\u0010T\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010V\u001a\u00020W2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0013H\u0003¢\u0006\u0004\bY\u0010Z\u001a-\u0010[\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\\\u001a\u001c\u0010]\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a5\u0010^\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020*2\u0006\u0010U\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00132\u0006\u0010_\u001a\u00020`H\u0003¢\u0006\u0002\u0010a\u001ap\u0010b\u001a\u00020\u00012\u0006\u0010V\u001a\u00020W2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010U\u001a\u00020c2\u0006\u0010d\u001a\u00020c2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00130f2\u0006\u0010g\u001a\u00020\u00132\u0006\u0010h\u001a\u00020i2!\u0010j\u001a\u001d\u0012\u0013\u0012\u00110c¢\u0006\f\bk\u0012\b\bl\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00010MH\u0002¢\u0006\u0004\bm\u0010n\u001a/\u0010o\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010V\u001a\u00020W2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010X\u001a\u00020\u0013H\u0003¢\u0006\u0004\bp\u0010q\u001a_\u0010r\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010U\u001a\u00020c2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020\u00010M2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010V\u001a\u00020W2\b\b\u0002\u0010t\u001a\u00020u2\b\b\u0002\u0010v\u001a\u00020w2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\bx\u0010y\u001a4\u0010z\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010{\u001a\u00020\"2\u0011\u0010L\u001a\r\u0012\u0004\u0012\u00020\u00010K¢\u0006\u0002\bOH\u0003¢\u0006\u0002\u0010|\u001a)\u0010}\u001a\u00020~2\u0006\u0010V\u001a\u00020W2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u007f\u001a\u00020\u0010H\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a-\u0010\u0082\u0001\u001a\u00020\"2\u0007\u0010\u0083\u0001\u001a\u00020\"2\u0007\u0010\u0084\u0001\u001a\u00020\"2\u0007\u0010\u0085\u0001\u001a\u00020\u00102\u0007\u0010\u0086\u0001\u001a\u00020\u0010H\u0002\u001a\u0019\u0010\u0087\u0001\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"H\u0002\u001a\u0016\u0010®\u0001\u001a\u00020\u0005*\u00020\u00052\u0007\u0010®\u0001\u001a\u00020\u0013H\u0003\"\u000e\u0010\u0015\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0017\u001a\u00020\u0013*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u0019\u001a\u00020\u0013*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018\"\u0015\u0010\u001a\u001a\u00020\u0013*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\"\u0015\u0010\u001b\u001a\u00020\u0013*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018\"\u0018\u0010\u001d\u001a\u00020\u0010*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0018\u00100\u001a\u000201*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\"\u001c\u0010\u0088\u0001\u001a\u00020\u0013*\u00030\u0089\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u001c\u0010\u008c\u0001\u001a\u00020\u0013*\u00030\u0089\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008b\u0001\"\u0017\u0010\u008e\u0001\u001a\u00020\t8AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u000f\u0010\u0091\u0001\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000\"\u000f\u0010\u0092\u0001\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0093\u0001\u001a\u00030\u0094\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000f\u0010\u0095\u0001\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000\"\u000f\u0010\u0096\u0001\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000\"\u000f\u0010\u0097\u0001\u001a\u00020\"X\u0082T¢\u0006\u0002\n\u0000\"\u000f\u0010\u0098\u0001\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000f\u0010\u0099\u0001\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000f\u0010\u009a\u0001\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u009b\u0001\u001a\u00030\u009c\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009d\u0001\"\u0013\u0010\u009e\u0001\u001a\u00030\u009c\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009d\u0001\"\u0013\u0010\u009f\u0001\u001a\u00030\u009c\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009d\u0001\"\u0013\u0010 \u0001\u001a\u00030\u009c\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009d\u0001\"\u0013\u0010¡\u0001\u001a\u00030\u009c\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009d\u0001\"\u0013\u0010¢\u0001\u001a\u00030\u009c\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009d\u0001\"\u0010\u0010£\u0001\u001a\u00030¤\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010¥\u0001\u001a\u00030¤\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010¦\u0001\u001a\u00030¤\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010§\u0001\u001a\u00030\u009c\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009d\u0001\"\u0013\u0010¨\u0001\u001a\u00030\u009c\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009d\u0001\"\u0013\u0010©\u0001\u001a\u00030\u009c\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009d\u0001\"\u0013\u0010ª\u0001\u001a\u00030\u009c\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009d\u0001\"\u001b\u0010«\u0001\u001a\u00030\u009c\u0001X\u0080\u0004¢\u0006\r\n\u0003\u0010\u009d\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006¯\u0001²\u0006\n\u0010g\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\u000b\u0010°\u0001\u001a\u00020cX\u008a\u008e\u0002²\u0006\u000b\u0010±\u0001\u001a\u00020cX\u008a\u008e\u0002²\u0006\n\u0010g\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\u000b\u0010%\u001a\u00030²\u0001X\u008a\u008e\u0002²\u0006\u000b\u0010³\u0001\u001a\u00020&X\u008a\u008e\u0002²\u0006\f\u0010´\u0001\u001a\u00030µ\u0001X\u008a\u008e\u0002²\u0006\u000b\u0010¶\u0001\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"TimePicker", "", "state", "Landroidx/compose/material3/TimePickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "Landroidx/compose/material3/TimePickerColors;", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "rememberTimePickerState", "initialHour", "", "initialMinute", "is24Hour", "", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "MaxHourValue", "MaxMinuteValue", "isPm", "(Landroidx/compose/material3/TimePickerState;)Z", "isHourInputValid", "isMinuteInputValid", "isInputValid", "TimePickerState", "hourForDisplay", "getHourForDisplay", "(Landroidx/compose/material3/TimePickerState;)I", "moveSelector", "x", "", "y", "maxDist", "center", "Landroidx/compose/ui/unit/IntOffset;", "moveSelector-d3b8Pxo", "(Landroidx/compose/material3/TimePickerState;FFFJ)V", "onTap", "Landroidx/compose/material3/AnalogTimePickerState;", "autoSwitchToMinute", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "onTap-uYHVD98", "(Landroidx/compose/material3/AnalogTimePickerState;FFFZJLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectorPos", "Landroidx/compose/ui/unit/DpOffset;", "getSelectorPos", "(Landroidx/compose/material3/AnalogTimePickerState;)J", "VerticalTimePicker", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "HorizontalTimePicker", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "ClockDisplayNumbers", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalPeriodToggle", "PeriodToggleImpl", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "startShape", "Landroidx/compose/ui/graphics/Shape;", "endShape", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "ToggleItem", "checked", "shape", "onClick", "Lkotlin/Function0;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TimePickerColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "TimeSelector", "value", "selection", "Landroidx/compose/material3/TimePickerSelectionMode;", "isValid", "TimeSelector-u8A1Dfs", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "ClockFace", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "drawSelector", "ClockText", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnalogTimePickerState;IZLandroidx/compose/ui/focus/FocusManager;Landroidx/compose/runtime/Composer;I)V", "timeInputOnChange", "Landroidx/compose/ui/text/input/TextFieldValue;", "prevValue", "userOverride", "Landroidx/compose/ui/node/Ref;", "a11yServicesEnabled", "errorHandler", "Landroidx/compose/material3/TimeInputErrorHandler;", "onNewValue", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "timeInputOnChange-Eb28HvY", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/node/Ref;ZLandroidx/compose/material3/TimeInputErrorHandler;Lkotlin/jvm/functions/Function1;)V", "SupportingText", "SupportingText-73flGVI", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ZLandroidx/compose/runtime/Composer;I)V", "TimePickerTextField", "onValueChange", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "TimePickerTextField-1vLObsk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "CircularLayout", "radiusToSizeRatio", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "numberContentDescription", "", "number", "numberContentDescription-dSwYdS4", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "dist", "x1", "y1", "x2", "y2", "atan", "isClick", "Landroidx/compose/ui/input/key/KeyEvent;", "isClick-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isEnter", "isEnter-ZmokQxo", "defaultTimePickerLayoutType", "getDefaultTimePickerLayoutType", "(Landroidx/compose/runtime/Composer;I)I", "FullCircle", "HalfCircle", "QuarterCircle", "", "RadiansPerMinute", "RadiansPerHour", "SeparatorZIndex", "MaxValueForTextField", "OuterCircleToSizeRatio", "InnerCircleToSizeRatio", "ClockDisplayBottomMargin", "Landroidx/compose/ui/unit/Dp;", "F", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "SupportLabelTop", "MaxDistance", "MinimumInteractiveSize", "Minutes", "Landroidx/collection/IntList;", "Hours", "ExtraHours", "PeriodToggleMargin", "TimePickerMaxHeight", "TimePickerMidHeight", "ClockDialMidContainerSize", "ClockDialMinContainerSize", "getClockDialMinContainerSize", "()F", "visible", "material3", "hourValue", "minuteValue", "Landroidx/compose/ui/geometry/Offset;", "parentCenter", "boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "selected"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TimePickerKt {
    private static final float ClockDialMidContainerSize;
    private static final float ClockDialMinContainerSize;
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;
    private static final IntList ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final float HalfCircle = 3.1415927f;
    private static final IntList Hours;
    private static final int MaxHourValue = 23;
    private static final int MaxMinuteValue = 59;
    private static final int MaxValueForTextField = 99;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimePickerMaxHeight;
    private static final float TimePickerMidHeight;
    private static final float OuterCircleToSizeRatio = Dp.m9732constructorimpl(101) / TimePickerTokens.INSTANCE.m5663getClockDialContainerSizeD9Ej5fM();
    private static final float InnerCircleToSizeRatio = Dp.m9732constructorimpl(69) / TimePickerTokens.INSTANCE.m5663getClockDialContainerSizeD9Ej5fM();
    private static final float ClockDisplayBottomMargin = Dp.m9732constructorimpl(36);
    private static final float SupportLabelTop = Dp.m9732constructorimpl(7);
    private static final float MaxDistance = Dp.m9732constructorimpl(74);
    private static final float MinimumInteractiveSize = Dp.m9732constructorimpl(48);
    private static final IntList Minutes = IntListKt.intListOf(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularLayout$lambda$1(Modifier modifier, float f, Function2 function2, int i, int i2, Composer composer, int i3) {
        CircularLayout(modifier, f, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockDisplayNumbers$lambda$1(TimePickerState timePickerState, TimePickerColors timePickerColors, int i, Composer composer, int i2) {
        ClockDisplayNumbers(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockFace$lambda$1(Modifier modifier, AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, boolean z, int i, Composer composer, int i2) {
        ClockFace(modifier, analogTimePickerState, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockText$lambda$18(Modifier modifier, AnalogTimePickerState analogTimePickerState, int i, boolean z, FocusManager focusManager, int i2, Composer composer, int i3) {
        ClockText(modifier, analogTimePickerState, i, z, focusManager, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySeparator$lambda$2(Modifier modifier, int i, Composer composer, int i2) {
        DisplaySeparator(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalClockDisplay$lambda$1(TimePickerState timePickerState, TimePickerColors timePickerColors, int i, Composer composer, int i2) {
        HorizontalClockDisplay(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalPeriodToggle$lambda$1(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, int i, Composer composer, int i2) {
        HorizontalPeriodToggle(modifier, timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalTimePicker$lambda$2(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, int i, int i2, Composer composer, int i3) {
        HorizontalTimePicker(analogTimePickerState, modifier, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PeriodToggleImpl$lambda$2(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, int i, Composer composer, int i2) {
        PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportingText_73flGVI$lambda$1(Modifier modifier, int i, TimePickerState timePickerState, boolean z, int i2, Composer composer, int i3) {
        m4354SupportingText73flGVI(modifier, i, timePickerState, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInput$lambda$0(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i, int i2, Composer composer, int i3) {
        TimeInput(timePickerState, modifier, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInputImpl$lambda$10(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, int i, Composer composer, int i2) {
        TimeInputImpl(modifier, timePickerColors, timePickerState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerTextField_1vLObsk$lambda$3(Modifier modifier, TextFieldValue textFieldValue, Function1 function1, TimePickerState timePickerState, int i, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors timePickerColors, int i2, int i3, Composer composer, int i4) {
        m4356TimePickerTextField1vLObsk(modifier, textFieldValue, function1, timePickerState, i, keyboardOptions, keyboardActions, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePicker_mT9BvqQ$lambda$4(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i, int i2, int i3, Composer composer, int i4) {
        m4355TimePickermT9BvqQ(timePickerState, modifier, timePickerColors, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeSelector_u8A1Dfs$lambda$4(Modifier modifier, int i, TimePickerState timePickerState, int i2, TimePickerColors timePickerColors, boolean z, int i3, Composer composer, int i4) {
        m4357TimeSelectoru8A1Dfs(modifier, i, timePickerState, i2, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleItem$lambda$1(boolean z, Shape shape, Function0 function0, TimePickerColors timePickerColors, Function3 function3, int i, Composer composer, int i2) {
        ToggleItem(z, shape, function0, timePickerColors, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalClockDisplay$lambda$1(TimePickerState timePickerState, TimePickerColors timePickerColors, int i, Composer composer, int i2) {
        VerticalClockDisplay(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalPeriodToggle$lambda$1(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, int i, Composer composer, int i2) {
        VerticalPeriodToggle(modifier, timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalTimePicker$lambda$2(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, int i, int i2, Composer composer, int i3) {
        VerticalTimePicker(analogTimePickerState, modifier, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cf  */
    /* renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4355TimePickermT9BvqQ(final TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        final TimePickerColors timePickerColors3;
        final int i6;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        TimePickerColors timePickerColors4;
        int i7;
        TimePickerColors timePickerColors5;
        int m4318layoutTypesDNSZnc;
        Object rememberedValue;
        boolean z;
        Object rememberedValue2;
        AnalogTimePickerState analogTimePickerState;
        boolean changedInstance;
        TimePickerKt$TimePicker$1$1 rememberedValue3;
        TimePickerColors timePickerColors6;
        Modifier modifier4;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-619286452);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimePicker)N(state,modifier,colors,layoutType:c#material3.TimePickerLayoutType)244@12758L35,245@12817L27,247@12868L62,249@12977L181,249@12936L222:TimePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    if (startRestartGroup.changed(timePickerColors2)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    i5 = i;
                    if (startRestartGroup.changed(i5)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    i5 = i;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                i5 = i;
            }
            if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "241@12641L8,242@12709L12");
                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    i7 = i4;
                    companion = modifier2;
                    timePickerColors5 = timePickerColors2;
                } else {
                    companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) != 0) {
                        timePickerColors4 = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                        i4 &= -897;
                    } else {
                        timePickerColors4 = timePickerColors2;
                    }
                    if ((i3 & 8) != 0) {
                        i7 = i4 & (-7169);
                        timePickerColors5 = timePickerColors4;
                        m4318layoutTypesDNSZnc = TimePickerDefaults.INSTANCE.m4318layoutTypesDNSZnc(startRestartGroup, 6);
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-619286452, i7, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:243)");
                        }
                        State<Boolean> rememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, false, startRestartGroup, 0, 7);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1866183559, "CC(remember):TimePicker.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Ref();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        Ref ref = (Ref) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1866185226, "CC(remember):TimePicker.kt#9igjgp");
                        int i11 = i7 & 14;
                        z = i11 != 4 || ((i7 & 8) != 0 && startRestartGroup.changed(timePickerState));
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new AnalogTimePickerState(timePickerState, ref);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        analogTimePickerState = (AnalogTimePickerState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Integer valueOf = Integer.valueOf(timePickerState.getHour());
                        Integer valueOf2 = Integer.valueOf(timePickerState.getMinute());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1866188833, "CC(remember):TimePicker.kt#9igjgp");
                        changedInstance = (i11 != 4 || ((i7 & 8) != 0 && startRestartGroup.changedInstance(timePickerState))) | startRestartGroup.changedInstance(ref) | startRestartGroup.changedInstance(analogTimePickerState);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new TimePickerKt$TimePicker$1$1(ref, analogTimePickerState, timePickerState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue3, startRestartGroup, 0);
                        if (!TimePickerLayoutType.m4375equalsimpl0(m4318layoutTypesDNSZnc, TimePickerLayoutType.INSTANCE.m4380getVerticalQJTpgSE())) {
                            startRestartGroup.startReplaceGroup(2017513523);
                            ComposerKt.sourceInformation(startRestartGroup, "258@13223L179");
                            timePickerColors6 = timePickerColors5;
                            modifier4 = companion;
                            VerticalTimePicker(analogTimePickerState, modifier4, timePickerColors6, !TimePicker_mT9BvqQ$lambda$0(rememberAccessibilityServiceState), startRestartGroup, i7 & PointerIconCompat.TYPE_TEXT, 0);
                            composer2 = startRestartGroup;
                            composer2.endReplaceGroup();
                        } else {
                            timePickerColors6 = timePickerColors5;
                            modifier4 = companion;
                            startRestartGroup.startReplaceGroup(2017712977);
                            ComposerKt.sourceInformation(startRestartGroup, "265@13424L181");
                            HorizontalTimePicker(analogTimePickerState, modifier4, timePickerColors6, !TimePicker_mT9BvqQ$lambda$0(rememberAccessibilityServiceState), startRestartGroup, i7 & PointerIconCompat.TYPE_TEXT, 0);
                            composer2 = startRestartGroup;
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        timePickerColors3 = timePickerColors6;
                        i6 = m4318layoutTypesDNSZnc;
                    } else {
                        i7 = i4;
                        timePickerColors5 = timePickerColors4;
                    }
                }
                m4318layoutTypesDNSZnc = i5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                State<Boolean> rememberAccessibilityServiceState2 = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, false, startRestartGroup, 0, 7);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1866183559, "CC(remember):TimePicker.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                Ref ref2 = (Ref) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1866185226, "CC(remember):TimePicker.kt#9igjgp");
                int i112 = i7 & 14;
                if (i112 != 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue2 = new AnalogTimePickerState(timePickerState, ref2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                analogTimePickerState = (AnalogTimePickerState) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Integer valueOf3 = Integer.valueOf(timePickerState.getHour());
                Integer valueOf22 = Integer.valueOf(timePickerState.getMinute());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1866188833, "CC(remember):TimePicker.kt#9igjgp");
                changedInstance = (i112 != 4 || ((i7 & 8) != 0 && startRestartGroup.changedInstance(timePickerState))) | startRestartGroup.changedInstance(ref2) | startRestartGroup.changedInstance(analogTimePickerState);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue3 = new TimePickerKt$TimePicker$1$1(ref2, analogTimePickerState, timePickerState, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.LaunchedEffect(valueOf3, valueOf22, (Function2) rememberedValue3, startRestartGroup, 0);
                if (!TimePickerLayoutType.m4375equalsimpl0(m4318layoutTypesDNSZnc, TimePickerLayoutType.INSTANCE.m4380getVerticalQJTpgSE())) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                timePickerColors3 = timePickerColors6;
                i6 = m4318layoutTypesDNSZnc;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                timePickerColors3 = timePickerColors2;
                i6 = i5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TimePicker_mT9BvqQ$lambda$4;
                        TimePicker_mT9BvqQ$lambda$4 = TimePickerKt.TimePicker_mT9BvqQ$lambda$4(TimePickerState.this, modifier3, timePickerColors3, i6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return TimePicker_mT9BvqQ$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if ((r12 & 4) != 0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeInput(final TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-760850373);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeInput)N(state,modifier,colors)294@14511L38:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(timePickerColors)) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "292@14493L8");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    timePickerColors = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                    i3 &= -897;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-760850373, i3, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:293)");
                }
                TimeInputImpl(modifier, timePickerColors, timePickerState, startRestartGroup, ((i3 >> 3) & 126) | ((i3 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final TimePickerColors timePickerColors2 = timePickerColors;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TimeInput$lambda$0;
                    TimeInput$lambda$0 = TimePickerKt.TimeInput$lambda$0(TimePickerState.this, modifier2, timePickerColors2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TimeInput$lambda$0;
                }
            });
        }
    }

    public static final TimePickerState rememberTimePickerState(final int i, final int i2, final boolean z, Composer composer, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, 1237715277, "C(rememberTimePickerState)N(initialHour,initialMinute,is24Hour)605@30373L14,608@30509L185,608@30455L239:TimePicker.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = TimeFormat_androidKt.is24HourFormat(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i3, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:606)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerStateImpl, ?> Saver = TimePickerStateImpl.INSTANCE.Saver();
        ComposerKt.sourceInformationMarkerStart(composer, -261551834, "CC(remember):TimePicker.kt#9igjgp");
        boolean z2 = true;
        boolean z3 = ((((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i2)) || (i3 & 48) == 32);
        if ((((i3 & 896) ^ 384) <= 256 || !composer.changed(z)) && (i3 & 384) != 256) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    TimePickerStateImpl rememberTimePickerState$lambda$0$0;
                    rememberTimePickerState$lambda$0$0 = TimePickerKt.rememberTimePickerState$lambda$0$0(i, i2, z);
                    return rememberTimePickerState$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TimePickerStateImpl timePickerStateImpl = (TimePickerStateImpl) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return timePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimePickerStateImpl rememberTimePickerState$lambda$0$0(int i, int i2, boolean z) {
        return new TimePickerStateImpl(i, i2, z);
    }

    public static final boolean isPm(TimePickerState timePickerState) {
        return timePickerState.getHour() >= 12;
    }

    public static final boolean isHourInputValid(TimePickerState timePickerState) {
        int hourInput = timePickerState.getHourInput();
        return hourInput >= 0 && hourInput < 24;
    }

    public static final boolean isMinuteInputValid(TimePickerState timePickerState) {
        int minuteInput = timePickerState.getMinuteInput();
        return minuteInput >= 0 && minuteInput < 60;
    }

    public static final boolean isInputValid(TimePickerState timePickerState) {
        return isMinuteInputValid(timePickerState) && isHourInputValid(timePickerState);
    }

    public static final TimePickerState TimePickerState(int i, int i2, boolean z) {
        return new TimePickerStateImpl(i, i2, z);
    }

    public static final int getHourForDisplay(TimePickerState timePickerState) {
        if (timePickerState.getIs24hour()) {
            return timePickerState.getHour() % 24;
        }
        if (timePickerState.getHour() % 12 == 0) {
            return 12;
        }
        return isPm(timePickerState) ? timePickerState.getHour() - 12 : timePickerState.getHour();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveSelector-d3b8Pxo, reason: not valid java name */
    public static final void m4364moveSelectord3b8Pxo(TimePickerState timePickerState, float f, float f2, float f3, long j) {
        if (TimePickerSelectionMode.m4384equalsimpl0(timePickerState.mo2470getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI()) && timePickerState.getIs24hour()) {
            float dist = dist(f, f2, IntOffset.m9864getXimpl(j), IntOffset.m9865getYimpl(j));
            if (isPm(timePickerState)) {
                timePickerState.setHour(timePickerState.getHour() - (dist < f3 ? 0 : 12));
            } else {
                timePickerState.setHour(timePickerState.getHour() + (dist >= f3 ? 0 : 12));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        if (r13.rotateTo(r0 * r3, r20, true, r1) == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: onTap-uYHVD98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4366onTapuYHVD98(AnalogTimePickerState analogTimePickerState, float f, float f2, float f3, boolean z, long j, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        TimePickerKt$onTap$1 timePickerKt$onTap$1;
        Object coroutine_suspended;
        int i;
        float f4;
        float rint;
        boolean z2;
        AnalogTimePickerState analogTimePickerState2;
        boolean z3;
        if (continuation instanceof TimePickerKt$onTap$1) {
            timePickerKt$onTap$1 = (TimePickerKt$onTap$1) continuation;
            if ((timePickerKt$onTap$1.label & Integer.MIN_VALUE) != 0) {
                timePickerKt$onTap$1.label -= Integer.MIN_VALUE;
                Object obj = timePickerKt$onTap$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = timePickerKt$onTap$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    float atan = atan(f2 - IntOffset.m9865getYimpl(j), f - IntOffset.m9864getXimpl(j));
                    if (TimePickerSelectionMode.m4384equalsimpl0(analogTimePickerState.mo2470getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI())) {
                        f4 = RadiansPerMinute;
                        rint = ((float) Math.rint((atan / RadiansPerMinute) / 5.0f)) * 5.0f;
                    } else {
                        f4 = RadiansPerHour;
                        rint = (float) Math.rint(atan / RadiansPerHour);
                    }
                    m4364moveSelectord3b8Pxo(analogTimePickerState, f, f2, f3, j);
                    timePickerKt$onTap$1.L$0 = analogTimePickerState;
                    z2 = z;
                    timePickerKt$onTap$1.Z$0 = z2;
                    timePickerKt$onTap$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = timePickerKt$onTap$1.Z$0;
                        analogTimePickerState2 = (AnalogTimePickerState) timePickerKt$onTap$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        AnalogTimePickerState analogTimePickerState3 = analogTimePickerState2;
                        z2 = z3;
                        analogTimePickerState = analogTimePickerState3;
                        if (z2) {
                            analogTimePickerState.mo2472setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI());
                        }
                        return Unit.INSTANCE;
                    }
                    boolean z4 = timePickerKt$onTap$1.Z$0;
                    AnalogTimePickerState analogTimePickerState4 = (AnalogTimePickerState) timePickerKt$onTap$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    z2 = z4;
                    analogTimePickerState = analogTimePickerState4;
                }
                if (TimePickerSelectionMode.m4384equalsimpl0(analogTimePickerState.mo2470getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI()) && z2) {
                    timePickerKt$onTap$1.L$0 = analogTimePickerState;
                    timePickerKt$onTap$1.Z$0 = z2;
                    timePickerKt$onTap$1.label = 2;
                    if (DelayKt.delay(100L, timePickerKt$onTap$1) != coroutine_suspended) {
                        boolean z5 = z2;
                        analogTimePickerState2 = analogTimePickerState;
                        z3 = z5;
                        AnalogTimePickerState analogTimePickerState32 = analogTimePickerState2;
                        z2 = z3;
                        analogTimePickerState = analogTimePickerState32;
                    }
                    return coroutine_suspended;
                }
                if (z2) {
                }
                return Unit.INSTANCE;
            }
        }
        timePickerKt$onTap$1 = new TimePickerKt$onTap$1(continuation);
        Object obj2 = timePickerKt$onTap$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = timePickerKt$onTap$1.label;
        if (i != 0) {
        }
        if (TimePickerSelectionMode.m4384equalsimpl0(analogTimePickerState.mo2470getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI())) {
            timePickerKt$onTap$1.L$0 = analogTimePickerState;
            timePickerKt$onTap$1.Z$0 = z2;
            timePickerKt$onTap$1.label = 2;
            if (DelayKt.delay(100L, timePickerKt$onTap$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (z2) {
        }
        return Unit.INSTANCE;
    }

    public static final long getSelectorPos(AnalogTimePickerState analogTimePickerState) {
        float m9732constructorimpl;
        float m9732constructorimpl2 = Dp.m9732constructorimpl(Dp.m9732constructorimpl(TimePickerTokens.INSTANCE.m5665getClockDialSelectorHandleContainerSizeD9Ej5fM() / SeparatorZIndex) * (analogTimePickerState.m2469getCurrentDiameterD9Ej5fM() / TimePickerTokens.INSTANCE.m5663getClockDialContainerSizeD9Ej5fM()));
        if (analogTimePickerState.getIs24hour() && isPm(analogTimePickerState) && TimePickerSelectionMode.m4384equalsimpl0(analogTimePickerState.mo2470getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI())) {
            m9732constructorimpl = Dp.m9732constructorimpl(analogTimePickerState.m2469getCurrentDiameterD9Ej5fM() * InnerCircleToSizeRatio);
        } else {
            m9732constructorimpl = Dp.m9732constructorimpl(analogTimePickerState.m2469getCurrentDiameterD9Ej5fM() * OuterCircleToSizeRatio);
        }
        float m9732constructorimpl3 = Dp.m9732constructorimpl(((Dp) RangesKt.coerceAtLeast(Dp.m9730boximpl(Dp.m9732constructorimpl(m9732constructorimpl - m9732constructorimpl2)), Dp.m9730boximpl(Dp.m9732constructorimpl(0)))).m9746unboximpl() + m9732constructorimpl2);
        float f = 2;
        float m9732constructorimpl4 = Dp.m9732constructorimpl(Dp.m9732constructorimpl(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * m9732constructorimpl3) + Dp.m9732constructorimpl(analogTimePickerState.m2469getCurrentDiameterD9Ej5fM() / f));
        float m9732constructorimpl5 = Dp.m9732constructorimpl(Dp.m9732constructorimpl(m9732constructorimpl3 * ((float) Math.sin(analogTimePickerState.getCurrentAngle()))) + Dp.m9732constructorimpl(analogTimePickerState.m2469getCurrentDiameterD9Ej5fM() / f));
        return DpOffset.m9788constructorimpl((Float.floatToRawIntBits(m9732constructorimpl4) << 32) | (Float.floatToRawIntBits(m9732constructorimpl5) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalTimePicker(final AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        boolean z2;
        final Modifier modifier3;
        final TimePickerColors timePickerColors3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        TimePickerColors timePickerColors4;
        Modifier modifier4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1249591487);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalTimePicker)N(state,modifier,colors,autoSwitchToMinute)1048@44370L27,1047@44324L544:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(analogTimePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    if (startRestartGroup.changed(timePickerColors2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i & 3072) != 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
            } else {
                z2 = z;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "1044@44273L8");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    timePickerColors4 = timePickerColors2;
                    modifier4 = modifier2;
                } else {
                    Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        modifier4 = companion;
                        i4 = i3 & (-897);
                        timePickerColors4 = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                    } else {
                        Modifier modifier5 = companion;
                        i4 = i3;
                        timePickerColors4 = timePickerColors2;
                        modifier4 = modifier5;
                    }
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1249591487, i4, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:1046)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1733416166, "CC(remember):TimePicker.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit VerticalTimePicker$lambda$0$0;
                            VerticalTimePicker$lambda$0$0 = TimePickerKt.VerticalTimePicker$lambda$0$0((SemanticsPropertyReceiver) obj);
                            return VerticalTimePicker$lambda$0$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier4, false, (Function1) rememberedValue, 1, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
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
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1720573003, "C1051@44475L52,1052@44536L60,1053@44605L191,1059@44805L57:TimePicker.kt#uh7d8r");
                VerticalClockDisplay(analogTimePickerState, timePickerColors4, startRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
                SpacerKt.Spacer(SizeKt.m1257height3ABfNKs(Modifier.INSTANCE, ClockDisplayBottomMargin), startRestartGroup, 6);
                ClockFace(SizeKt.m1271size3ABfNKs(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m5663getClockDialContainerSizeD9Ej5fM()), analogTimePickerState, timePickerColors4, z2, startRestartGroup, ((i4 << 3) & 112) | 6 | (i4 & 896) | (i4 & 7168));
                SpacerKt.Spacer(SizeKt.m1257height3ABfNKs(Modifier.INSTANCE, ClockFaceBottomMargin), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                timePickerColors3 = timePickerColors4;
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                timePickerColors3 = timePickerColors2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit VerticalTimePicker$lambda$2;
                        VerticalTimePicker$lambda$2 = TimePickerKt.VerticalTimePicker$lambda$2(AnalogTimePickerState.this, modifier3, timePickerColors3, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return VerticalTimePicker$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalTimePicker$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalTimePicker(final AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        boolean z2;
        final Modifier modifier3;
        final TimePickerColors timePickerColors3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        TimePickerColors timePickerColors4;
        Modifier modifier4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1432307537);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalTimePicker)N(state,modifier,colors,autoSwitchToMinute)1071@45132L27,1070@45089L418:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(analogTimePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    if (startRestartGroup.changed(timePickerColors2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i & 3072) != 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
            } else {
                z2 = z;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "1067@45038L8");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    timePickerColors4 = timePickerColors2;
                    modifier4 = modifier2;
                } else {
                    Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        modifier4 = companion;
                        i4 = i3 & (-897);
                        timePickerColors4 = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                    } else {
                        Modifier modifier5 = companion;
                        i4 = i3;
                        timePickerColors4 = timePickerColors2;
                        modifier4 = modifier5;
                    }
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1432307537, i4, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:1069)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2058016012, "CC(remember):TimePicker.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda56
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit HorizontalTimePicker$lambda$0$0;
                            HorizontalTimePicker$lambda$0$0 = TimePickerKt.HorizontalTimePicker$lambda$0$0((SemanticsPropertyReceiver) obj);
                            return HorizontalTimePicker$lambda$0$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier4, false, (Function1) rememberedValue, 1, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1443384930, "C1074@45233L37,1075@45279L59,1076@45347L154:TimePicker.kt#uh7d8r");
                HorizontalClockDisplay(analogTimePickerState, timePickerColors4, startRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
                SpacerKt.Spacer(SizeKt.m1276width3ABfNKs(Modifier.INSTANCE, ClockDisplayBottomMargin), startRestartGroup, 6);
                ClockFace(Modifier.INSTANCE.then(new ClockFaceSizeModifier()), analogTimePickerState, timePickerColors4, z2, startRestartGroup, ((i4 << 3) & 112) | (i4 & 896) | (i4 & 7168));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                timePickerColors3 = timePickerColors4;
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                timePickerColors3 = timePickerColors2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HorizontalTimePicker$lambda$2;
                        HorizontalTimePicker$lambda$2 = TimePickerKt.HorizontalTimePicker$lambda$2(AnalogTimePickerState.this, modifier3, timePickerColors3, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HorizontalTimePicker$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalTimePicker$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    private static final void TimeInputImpl(final Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-475657989);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeInputImpl)N(modifier,colors,state)1102@46186L35,1102@46134L87,1105@46306L37,1105@46254L89,1107@46368L27,1109@46481L133,1109@46454L160,1117@46705L137,1117@46676L166,1124@46848L4371:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i2, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:1086)");
            }
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.INSTANCE.getSaver();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1840773058, "CC(remember):TimePicker.kt#9igjgp");
            int i3 = i2 & 896;
            boolean z = i3 == 256 || ((i2 & 512) != 0 && startRestartGroup.changedInstance(timePickerState));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda59
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState TimeInputImpl$lambda$0$0;
                        TimeInputImpl$lambda$0$0 = TimePickerKt.TimeInputImpl$lambda$0$0(TimePickerState.this);
                        return TimeInputImpl$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (Function0) rememberedValue, startRestartGroup, 0);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = TextFieldValue.INSTANCE.getSaver();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1840769216, "CC(remember):TimePicker.kt#9igjgp");
            boolean z2 = i3 == 256 || ((i2 & 512) != 0 && startRestartGroup.changedInstance(timePickerState));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState TimeInputImpl$lambda$3$0;
                        TimeInputImpl$lambda$3$0 = TimePickerKt.TimeInputImpl$lambda$3$0(TimePickerState.this);
                        return TimeInputImpl$lambda$3$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState rememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (Function0) rememberedValue2, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1840767242, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Ref();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final Ref ref = (Ref) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Integer valueOf = Integer.valueOf(timePickerState.getHour());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1840763520, "CC(remember):TimePicker.kt#9igjgp");
            boolean changedInstance = (i3 == 256 || ((i2 & 512) != 0 && startRestartGroup.changedInstance(timePickerState))) | startRestartGroup.changedInstance(ref) | startRestartGroup.changed(rememberSaveable);
            TimePickerKt$TimeInputImpl$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new TimePickerKt$TimeInputImpl$1$1(ref, timePickerState, rememberSaveable, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
            Integer valueOf2 = Integer.valueOf(timePickerState.getMinute());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1840756348, "CC(remember):TimePicker.kt#9igjgp");
            boolean changedInstance2 = (i3 == 256 || ((i2 & 512) != 0 && startRestartGroup.changedInstance(timePickerState))) | startRestartGroup.changedInstance(ref) | startRestartGroup.changed(rememberSaveable2);
            TimePickerKt$TimeInputImpl$2$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new TimePickerKt$TimeInputImpl$2$1(ref, timePickerState, rememberSaveable2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
            Alignment.Vertical top = Alignment.INSTANCE.getTop();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1385919899, "C1126@46985L5,1131@47156L35,1132@47219L50,1138@47501L3333,1134@47279L3555:TimePicker.kt#uh7d8r");
            TextStyle m9154copyp1EtxEg$default = TextStyle.m9154copyp1EtxEg$default(TypographyKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldLabelTextFont(), startRestartGroup, 6), timePickerColors.m4316timeSelectorContentColorvNxB06k$material3(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m9600getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
            final State<Boolean> rememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, false, startRestartGroup, 0, 7);
            final TimeInputErrorHandler rememberTimeInputErrorHandler = TimePicker_androidKt.rememberTimeInputErrorHandler(TimeInputImpl$lambda$9$0(rememberAccessibilityServiceState), startRestartGroup, 0);
            int i4 = i2;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(m9154copyp1EtxEg$default), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(1306700887, true, new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TimeInputImpl$lambda$9$1;
                    TimeInputImpl$lambda$9$1 = TimePickerKt.TimeInputImpl$lambda$9$1(MutableState.this, timePickerState, rememberAccessibilityServiceState, ref, rememberTimeInputErrorHandler, timePickerColors, rememberSaveable2, (Composer) obj, ((Integer) obj2).intValue());
                    return TimeInputImpl$lambda$9$1;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (!timePickerState.getIs24hour()) {
                startRestartGroup.startReplaceGroup(-1382126833);
                ComposerKt.sourceInformation(startRestartGroup, "1217@50879L324");
                Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1205paddingqDBjuR0$default);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1377011131, "C1218@50947L242:TimePicker.kt#uh7d8r");
                VerticalPeriodToggle(SizeKt.m1273sizeVpY3zN4(Modifier.INSTANCE, TimeInputTokens.INSTANCE.m5658getPeriodSelectorContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m5657getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, ((i4 >> 3) & 112) | 6 | ((i4 << 3) & 896));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1381792405);
                startRestartGroup.endReplaceGroup();
            }
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TimeInputImpl$lambda$10;
                    TimeInputImpl$lambda$10 = TimePickerKt.TimeInputImpl$lambda$10(Modifier.this, timePickerColors, timePickerState, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TimeInputImpl$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$hourTextValue(TimePickerState timePickerState) {
        if (isHourInputValid(timePickerState)) {
            return new TextFieldValue(CalendarLocale_jvmAndAndroidKt.toLocalString$default(getHourForDisplay(timePickerState), 2, 0, false, null, 14, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null);
        }
        return new TextFieldValue(CalendarLocale_jvmAndAndroidKt.toLocalString$default(timePickerState.getHourInput(), 2, 0, false, null, 14, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$minuteTextValue(TimePickerState timePickerState) {
        if (isMinuteInputValid(timePickerState)) {
            return new TextFieldValue(CalendarLocale_jvmAndAndroidKt.toLocalString$default(timePickerState.getMinute(), 2, 0, false, null, 14, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null);
        }
        return new TextFieldValue(CalendarLocale_jvmAndAndroidKt.toLocalString$default(timePickerState.getMinuteInput(), 2, 0, false, null, 14, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TimeInputImpl$lambda$0$0(TimePickerState timePickerState) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TimeInputImpl$hourTextValue(timePickerState), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$1(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TimeInputImpl$lambda$3$0(TimePickerState timePickerState) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TimeInputImpl$minuteTextValue(timePickerState), null, 2, null);
    }

    private static final TextFieldValue TimeInputImpl$lambda$4(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInputImpl$lambda$9$1(final MutableState mutableState, final TimePickerState timePickerState, final State state, final Ref ref, final TimeInputErrorHandler timeInputErrorHandler, TimePickerColors timePickerColors, final MutableState mutableState2, Composer composer, int i) {
        Ref ref2;
        TimeInputErrorHandler timeInputErrorHandler2;
        State state2;
        ComposerKt.sourceInformation(composer, "C1139@47515L3309:TimePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306700887, i, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:1139)");
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 587475143, "C1142@47633L529,1156@48239L570,1178@49250L52,1140@47537L1847,1182@49401L123,1188@49680L553,1209@50676L52,1185@49541L1269:TimePicker.kt#uh7d8r");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1127329796, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = composer.changed(mutableState) | composer.changedInstance(timePickerState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$3$1$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m4371invokeZmokQxo(keyEvent.m7966unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m4371invokeZmokQxo(android.view.KeyEvent keyEvent) {
                        TextFieldValue TimeInputImpl$lambda$1;
                        TextFieldValue TimeInputImpl$lambda$12;
                        int m7979getUtf16CodePointZmokQxo = KeyEvent_androidKt.m7979getUtf16CodePointZmokQxo(keyEvent);
                        if (48 <= m7979getUtf16CodePointZmokQxo && m7979getUtf16CodePointZmokQxo < 58) {
                            TimeInputImpl$lambda$1 = TimePickerKt.TimeInputImpl$lambda$1(mutableState);
                            if (TextRange.m9141getStartimpl(TimeInputImpl$lambda$1.getSelection()) == 2) {
                                TimeInputImpl$lambda$12 = TimePickerKt.TimeInputImpl$lambda$1(mutableState);
                                if (TimeInputImpl$lambda$12.getText().length() == 2) {
                                    TimePickerState.this.mo2472setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI());
                                }
                            }
                        }
                        return false;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (Function1) rememberedValue);
            TextFieldValue TimeInputImpl$lambda$1 = TimeInputImpl$lambda$1(mutableState);
            ComposerKt.sourceInformationMarkerStart(composer, 1127349229, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed2 = composer.changed(mutableState) | composer.changed(state) | composer.changedInstance(timePickerState) | composer.changedInstance(ref) | composer.changedInstance(timeInputErrorHandler);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TimeInputImpl$lambda$9$1$0$1$0;
                        TimeInputImpl$lambda$9$1$0$1$0 = TimePickerKt.TimeInputImpl$lambda$9$1$0$1$0(TimePickerState.this, ref, timeInputErrorHandler, mutableState, state, (TextFieldValue) obj);
                        return TimeInputImpl$lambda$9$1$0$1$0;
                    }
                };
                ref2 = ref;
                timeInputErrorHandler2 = timeInputErrorHandler;
                state2 = state;
                composer.updateRememberedValue(function1);
                rememberedValue2 = function1;
            } else {
                ref2 = ref;
                timeInputErrorHandler2 = timeInputErrorHandler;
                state2 = state;
            }
            Function1 function12 = (Function1) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            int m4388getHouryecRtBI = TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m9407getNumberPjHm6EE(), ImeAction.INSTANCE.m9353getNexteUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            ComposerKt.sourceInformationMarkerStart(composer, 1127381063, "CC(remember):TimePicker.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(timePickerState);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TimeInputImpl$lambda$9$1$0$2$0;
                        TimeInputImpl$lambda$9$1$0$2$0 = TimePickerKt.TimeInputImpl$lambda$9$1$0$2$0(TimePickerState.this, (KeyboardActionScope) obj);
                        return TimeInputImpl$lambda$9$1$0$2$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            m4356TimePickerTextField1vLObsk(onKeyEvent, TimeInputImpl$lambda$1, function12, timePickerState, m4388getHouryecRtBI, keyboardOptions, new KeyboardActions(null, null, (Function1) rememberedValue3, null, null, null, MaxMinuteValue, null), timePickerColors, composer, 24576, 0);
            DisplaySeparator(SizeKt.m1273sizeVpY3zN4(Modifier.INSTANCE, DisplaySeparatorWidth, TimeInputTokens.INSTANCE.m5657getPeriodSelectorContainerHeightD9Ej5fM()), composer, 6);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            TextFieldValue TimeInputImpl$lambda$4 = TimeInputImpl$lambda$4(mutableState2);
            ComposerKt.sourceInformationMarkerStart(composer, 1127395324, "CC(remember):TimePicker.kt#9igjgp");
            boolean changedInstance2 = composer.changedInstance(timePickerState) | composer.changed(mutableState2) | composer.changedInstance(ref2) | composer.changed(state2) | composer.changedInstance(timeInputErrorHandler2);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                final State state3 = state2;
                final Ref ref3 = ref2;
                final TimeInputErrorHandler timeInputErrorHandler3 = timeInputErrorHandler2;
                Function1 function13 = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TimeInputImpl$lambda$9$1$0$3$0;
                        TimeInputImpl$lambda$9$1$0$3$0 = TimePickerKt.TimeInputImpl$lambda$9$1$0$3$0(TimePickerState.this, ref3, timeInputErrorHandler3, mutableState2, state3, (TextFieldValue) obj);
                        return TimeInputImpl$lambda$9$1$0$3$0;
                    }
                };
                composer.updateRememberedValue(function13);
                rememberedValue4 = function13;
            }
            Function1 function14 = (Function1) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composer);
            int m4389getMinuteyecRtBI = TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI();
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m9407getNumberPjHm6EE(), ImeAction.INSTANCE.m9351getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            ComposerKt.sourceInformationMarkerStart(composer, 1127426695, "CC(remember):TimePicker.kt#9igjgp");
            boolean changedInstance3 = composer.changedInstance(timePickerState);
            Object rememberedValue5 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TimeInputImpl$lambda$9$1$0$4$0;
                        TimeInputImpl$lambda$9$1$0$4$0 = TimePickerKt.TimeInputImpl$lambda$9$1$0$4$0(TimePickerState.this, (KeyboardActionScope) obj);
                        return TimeInputImpl$lambda$9$1$0$4$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            m4356TimePickerTextField1vLObsk(companion3, TimeInputImpl$lambda$4, function14, timePickerState, m4389getMinuteyecRtBI, keyboardOptions2, new KeyboardActions(null, null, (Function1) rememberedValue5, null, null, null, MaxMinuteValue, null), timePickerColors, composer, 24582, 0);
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
    public static final Unit TimeInputImpl$lambda$9$1$0$1$0(TimePickerState timePickerState, Ref ref, TimeInputErrorHandler timeInputErrorHandler, final MutableState mutableState, State state, TextFieldValue textFieldValue) {
        m4367timeInputOnChangeEb28HvY(TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI(), timePickerState, textFieldValue, TimeInputImpl$lambda$1(mutableState), ref, TimeInputImpl$lambda$9$0(state), timeInputErrorHandler, new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TimeInputImpl$lambda$9$1$0$1$0$0;
                TimeInputImpl$lambda$9$1$0$1$0$0 = TimePickerKt.TimeInputImpl$lambda$9$1$0$1$0$0(MutableState.this, (TextFieldValue) obj);
                return TimeInputImpl$lambda$9$1$0$1$0$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInputImpl$lambda$9$1$0$1$0$0(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInputImpl$lambda$9$1$0$2$0(TimePickerState timePickerState, KeyboardActionScope keyboardActionScope) {
        timePickerState.mo2472setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInputImpl$lambda$9$1$0$3$0(TimePickerState timePickerState, Ref ref, TimeInputErrorHandler timeInputErrorHandler, final MutableState mutableState, State state, TextFieldValue textFieldValue) {
        m4367timeInputOnChangeEb28HvY(TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI(), timePickerState, textFieldValue, TimeInputImpl$lambda$4(mutableState), ref, TimeInputImpl$lambda$9$0(state), timeInputErrorHandler, new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TimeInputImpl$lambda$9$1$0$3$0$0;
                TimeInputImpl$lambda$9$1$0$3$0$0 = TimePickerKt.TimeInputImpl$lambda$9$1$0$3$0$0(MutableState.this, (TextFieldValue) obj);
                return TimeInputImpl$lambda$9$1$0$3$0$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInputImpl$lambda$9$1$0$3$0$0(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInputImpl$lambda$9$1$0$4$0(TimePickerState timePickerState, KeyboardActionScope keyboardActionScope) {
        timePickerState.mo2472setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI());
        return Unit.INSTANCE;
    }

    private static final void HorizontalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(755539561);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalClockDisplay)N(state,colors)1231@51326L591:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i2, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1230)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 998514658, "C1232@51385L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, i2 & 126);
            if (!timePickerState.getIs24hour()) {
                startRestartGroup.startReplaceGroup(998576161);
                ComposerKt.sourceInformation(startRestartGroup, "1234@51463L438");
                Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1205paddingqDBjuR0$default);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1710314390, "C1235@51540L347:TimePicker.kt#uh7d8r");
                int i3 = i2 << 3;
                HorizontalPeriodToggle(SizeKt.m1273sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m5669getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m5668getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i3 & 896) | (i3 & 112) | 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(999020143);
                startRestartGroup.endReplaceGroup();
            }
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HorizontalClockDisplay$lambda$1;
                    HorizontalClockDisplay$lambda$1 = TimePickerKt.HorizontalClockDisplay$lambda$1(TimePickerState.this, timePickerColors, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HorizontalClockDisplay$lambda$1;
                }
            });
        }
    }

    private static final void VerticalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2054675515);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalClockDisplay)N(state,colors)1251@52022L586:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i2, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1250)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
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
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1364225858, "C1252@52080L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, i2 & 126);
            if (!timePickerState.getIs24hour()) {
                startRestartGroup.startReplaceGroup(1364287361);
                ComposerKt.sourceInformation(startRestartGroup, "1254@52158L434");
                Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1205paddingqDBjuR0$default);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2145741896, "C1255@52237L341:TimePicker.kt#uh7d8r");
                int i3 = i2 << 3;
                VerticalPeriodToggle(SizeKt.m1273sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m5672getPeriodSelectorVerticalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m5671getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i3 & 896) | (i3 & 112) | 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1364727499);
                startRestartGroup.endReplaceGroup();
            }
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalClockDisplay$lambda$1;
                    VerticalClockDisplay$lambda$1 = TimePickerKt.VerticalClockDisplay$lambda$1(TimePickerState.this, timePickerColors, i, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalClockDisplay$lambda$1;
                }
            });
        }
    }

    private static final void ClockDisplayNumbers(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-934561141);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockDisplayNumbers)N(state,colors)1272@52796L5,1275@52932L839,1271@52712L1059:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i2, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1270)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont(), startRestartGroup, 6)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(-477913269, true, new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ClockDisplayNumbers$lambda$0;
                    ClockDisplayNumbers$lambda$0 = TimePickerKt.ClockDisplayNumbers$lambda$0(TimePickerState.this, timePickerColors, (Composer) obj, ((Integer) obj2).intValue());
                    return ClockDisplayNumbers$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ClockDisplayNumbers$lambda$1;
                    ClockDisplayNumbers$lambda$1 = TimePickerKt.ClockDisplayNumbers$lambda$1(TimePickerState.this, timePickerColors, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ClockDisplayNumbers$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockDisplayNumbers$lambda$0(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1276@52942L823:TimePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-477913269, i, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1276)");
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 2065728633, "C1277@52960L326,1285@53299L123,1288@53435L320:TimePicker.kt#uh7d8r");
            m4357TimeSelectoru8A1Dfs(SizeKt.m1273sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m5675getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m5674getTimeSelectorContainerHeightD9Ej5fM()), getHourForDisplay(timePickerState), timePickerState, TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI(), timePickerColors, true, composer, 199686);
            DisplaySeparator(SizeKt.m1273sizeVpY3zN4(Modifier.INSTANCE, DisplaySeparatorWidth, TimePickerTokens.INSTANCE.m5671getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer, 6);
            m4357TimeSelectoru8A1Dfs(SizeKt.m1273sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m5675getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m5674getTimeSelectorContainerHeightD9Ej5fM()), timePickerState.getMinute(), timePickerState, TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI(), timePickerColors, true, composer, 199686);
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

    private static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        Composer startRestartGroup = composer.startRestartGroup(1261215927);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalPeriodToggle)N(modifier,state,colors)1306@53933L1014,1334@54994L5,1336@55025L207:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i2, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1305)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 847733805, "CC(remember):TimePicker.kt#9igjgp");
            TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            PeriodToggleImpl(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.start$default(cornerBasedShape, null, 1, null), ShapesKt.end$default(cornerBasedShape, null, 1, null), startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HorizontalPeriodToggle$lambda$1;
                    HorizontalPeriodToggle$lambda$1 = TimePickerKt.HorizontalPeriodToggle$lambda$1(Modifier.this, timePickerState2, timePickerColors2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HorizontalPeriodToggle$lambda$1;
                }
            });
        }
    }

    private static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        Composer startRestartGroup = composer.startRestartGroup(-1898918107);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalPeriodToggle)N(modifier,state,colors)1352@55392L1022,1380@56461L5,1382@56492L208:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i2, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1351)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 500805347, "CC(remember):TimePicker.kt#9igjgp");
            TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            PeriodToggleImpl(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.top$default(cornerBasedShape, null, 1, null), ShapesKt.bottom$default(cornerBasedShape, null, 1, null), startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalPeriodToggle$lambda$1;
                    VerticalPeriodToggle$lambda$1 = TimePickerKt.VerticalPeriodToggle$lambda$1(Modifier.this, timePickerState2, timePickerColors2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalPeriodToggle$lambda$1;
                }
            });
        }
    }

    private static final void PeriodToggleImpl(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, final MeasurePolicy measurePolicy, final Shape shape, final Shape shape2, Composer composer, final int i) {
        int i2;
        Shape shape3;
        Composer startRestartGroup = composer.startRestartGroup(1374241901);
        ComposerKt.sourceInformation(startRestartGroup, "C(PeriodToggleImpl)N(modifier,state,colors,measurePolicy,startShape,endShape)1403@57078L5,1404@57148L5,1405@57183L41,1409@57304L128,1406@57229L1449:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(measurePolicy) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            shape3 = shape2;
            i2 |= startRestartGroup.changed(shape3) ? 131072 : 65536;
        } else {
            shape3 = shape2;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i2, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1400)");
            }
            BorderStroke m388BorderStrokecXLIe8U = BorderStrokeKt.m388BorderStrokecXLIe8U(TimePickerTokens.INSTANCE.m5670getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.getPeriodSelectorBorderColor());
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            final TextStyle value2 = TypographyKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorLabelTextFont(), startRestartGroup, 6);
            Strings.Companion companion = Strings.INSTANCE;
            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_time_picker_period_toggle_description), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2091525677, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m4895getString2EP1pXo);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PeriodToggleImpl$lambda$0$0;
                        PeriodToggleImpl$lambda$0$0 = TimePickerKt.PeriodToggleImpl$lambda$0$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                        return PeriodToggleImpl$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier border = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null)), m388BorderStrokecXLIe8U, cornerBasedShape);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, border);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1677877212, "C1420@57715L146,1426@57910L100,1417@57602L408,1429@58023L219,1438@58365L147,1444@58561L100,1435@58255L406:TimePicker.kt#uh7d8r");
            boolean z = !isPm(timePickerState);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -222966890, "CC(remember):TimePicker.kt#9igjgp");
            int i3 = i2 & 112;
            boolean z2 = i3 == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(timePickerState));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit PeriodToggleImpl$lambda$1$0$0;
                        PeriodToggleImpl$lambda$1$0$0 = TimePickerKt.PeriodToggleImpl$lambda$1$0$0(TimePickerState.this);
                        return PeriodToggleImpl$lambda$1$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i4 = (i2 << 3) & 7168;
            ToggleItem(z, shape, (Function0) rememberedValue2, timePickerColors, ComposableLambdaKt.rememberComposableLambda(1425358052, true, new Function3() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit PeriodToggleImpl$lambda$1$1;
                    PeriodToggleImpl$lambda$1$1 = TimePickerKt.PeriodToggleImpl$lambda$1$1(TextStyle.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return PeriodToggleImpl$lambda$1$1;
                }
            }, startRestartGroup, 54), startRestartGroup, ((i2 >> 9) & 112) | 24576 | i4);
            SpacerKt.Spacer(BackgroundKt.m353backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.INSTANCE, "Spacer"), SeparatorZIndex), 0.0f, 1, null), timePickerColors.getPeriodSelectorBorderColor(), null, 2, null), startRestartGroup, 0);
            boolean isPm = isPm(timePickerState);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -222946089, "CC(remember):TimePicker.kt#9igjgp");
            boolean z3 = i3 == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(timePickerState));
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit PeriodToggleImpl$lambda$1$2$0;
                        PeriodToggleImpl$lambda$1$2$0 = TimePickerKt.PeriodToggleImpl$lambda$1$2$0(TimePickerState.this);
                        return PeriodToggleImpl$lambda$1$2$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ToggleItem(isPm, shape3, (Function0) rememberedValue3, timePickerColors, ComposableLambdaKt.rememberComposableLambda(-1179219109, true, new Function3() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit PeriodToggleImpl$lambda$1$3;
                    PeriodToggleImpl$lambda$1$3 = TimePickerKt.PeriodToggleImpl$lambda$1$3(TextStyle.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return PeriodToggleImpl$lambda$1$3;
                }
            }, startRestartGroup, 54), startRestartGroup, ((i2 >> 12) & 112) | 24576 | i4);
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PeriodToggleImpl$lambda$2;
                    PeriodToggleImpl$lambda$2 = TimePickerKt.PeriodToggleImpl$lambda$2(Modifier.this, timePickerState, timePickerColors, measurePolicy, shape, shape2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PeriodToggleImpl$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PeriodToggleImpl$lambda$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PeriodToggleImpl$lambda$1$0$0(TimePickerState timePickerState) {
        if (isPm(timePickerState) && isHourInputValid(timePickerState)) {
            timePickerState.setHour(timePickerState.getHour() - 12);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PeriodToggleImpl$lambda$1$1(TextStyle textStyle, RowScope rowScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1427@57955L40,1427@57928L68:TimePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1425358052, i, -1, "androidx.compose.material3.PeriodToggleImpl.<anonymous>.<anonymous> (TimePicker.kt:1427)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            TextKt.m4292TextNvy7gAk(Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_time_picker_am), composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PeriodToggleImpl$lambda$1$2$0(TimePickerState timePickerState) {
        if (!isPm(timePickerState) && isHourInputValid(timePickerState)) {
            timePickerState.setHour(timePickerState.getHour() + 12);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PeriodToggleImpl$lambda$1$3(TextStyle textStyle, RowScope rowScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1445@58606L40,1445@58579L68:TimePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1179219109, i, -1, "androidx.compose.material3.PeriodToggleImpl.<anonymous>.<anonymous> (TimePicker.kt:1445)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            TextKt.m4292TextNvy7gAk(Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_time_picker_pm), composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void ToggleItem(final boolean z, final Shape shape, final Function0<Unit> function0, final TimePickerColors timePickerColors, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1523811083);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToggleItem)N(checked,shape,onClick,colors,content)1464@59112L22,1470@59303L125,1462@59004L431:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1523811083, i2, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1458)");
            }
            long m4314periodSelectorContentColorvNxB06k$material3 = timePickerColors.m4314periodSelectorContentColorvNxB06k$material3(z);
            long m4313periodSelectorContainerColorvNxB06k$material3 = timePickerColors.m4313periodSelectorContainerColorvNxB06k$material3(z);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, z ? 0.0f : 1.0f), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -201384031, "CC(remember):TimePicker.kt#9igjgp");
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ToggleItem$lambda$0$0;
                        ToggleItem$lambda$0$0 = TimePickerKt.ToggleItem$lambda$0$0(z, (SemanticsPropertyReceiver) obj);
                        return ToggleItem$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ButtonKt.TextButton(function0, SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (Function1) rememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m2618textButtonColorsro_MJ88(m4313periodSelectorContainerColorvNxB06k$material3, m4314periodSelectorContentColorvNxB06k$material3, 0L, 0L, startRestartGroup, 24576, 12), (ButtonElevation) null, (BorderStroke) null, PaddingKt.m1194PaddingValues0680j_4(Dp.m9732constructorimpl(0)), (MutableInteractionSource) null, function3, startRestartGroup, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 7168) | ((i2 << 15) & 1879048192), 356);
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ToggleItem$lambda$1;
                    ToggleItem$lambda$1 = TimePickerKt.ToggleItem$lambda$1(z, shape, function0, timePickerColors, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ToggleItem$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleItem$lambda$0$0(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
        return Unit.INSTANCE;
    }

    private static final void DisplaySeparator(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2100674302);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisplaySeparator)N(modifier)1480@59541L7,1489@59859L2,1489@59814L172:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i2, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1478)");
            }
            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localTextStyle);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextStyle m9154copyp1EtxEg$default = TextStyle.m9154copyp1EtxEg$default((TextStyle) consume, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m9600getCentere0LSkKk(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m9567getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m9589getBothEVpEnUU(), (DefaultConstructorMarker) null), 0, 0, null, 15695871, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 113387904, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit DisplaySeparator$lambda$0$0;
                        DisplaySeparator$lambda$0$0 = TimePickerKt.DisplaySeparator$lambda$0$0((SemanticsPropertyReceiver) obj);
                        return DisplaySeparator$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2101554693, "C1490@59959L5,1490@59910L70:TimePicker.kt#uh7d8r");
            composer2 = startRestartGroup;
            TextKt.m4292TextNvy7gAk(":", null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), startRestartGroup, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, m9154copyp1EtxEg$default, composer2, 6, 0, 131066);
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DisplaySeparator$lambda$2;
                    DisplaySeparator$lambda$2 = TimePickerKt.DisplaySeparator$lambda$2(Modifier.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DisplaySeparator$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySeparator$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* renamed from: TimeSelector-u8A1Dfs, reason: not valid java name */
    private static final void m4357TimeSelectoru8A1Dfs(final Modifier modifier, final int i, final TimePickerState timePickerState, final int i2, final TimePickerColors timePickerColors, final boolean z, Composer composer, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        int m4811constructorimpl;
        long errorContainer;
        long onErrorContainer;
        Composer startRestartGroup = composer.startRestartGroup(-883324461);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeSelector)N(modifier,value,state,selection:c#material3.TimePickerSelectionMode,colors,isValid)1504@60260L20,1504@60236L44,1508@60375L214,1525@60966L124,1535@61301L5,1529@61110L117,1537@61346L498,1523@60882L962:TimePicker.kt#uh7d8r");
        if ((i3 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 32 : 16;
        } else {
            i5 = i;
        }
        if ((i3 & 384) == 0) {
            i4 |= (i3 & 512) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= startRestartGroup.changed(timePickerColors) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-883324461, i4, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1503)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1528724327, "CC(remember):TimePicker.kt#9igjgp");
            boolean z2 = (458752 & i4) == 131072;
            TimePickerKt$TimeSelector$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TimePickerKt$TimeSelector$1$1(z, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, (i4 >> 15) & 14);
            boolean m4384equalsimpl0 = TimePickerSelectionMode.m4384equalsimpl0(timePickerState.mo2470getSelectionyecRtBI(), i2);
            if (TimePickerSelectionMode.m4384equalsimpl0(i2, TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI())) {
                Strings.Companion companion = Strings.INSTANCE;
                m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_hour_selection);
            } else {
                Strings.Companion companion2 = Strings.INSTANCE;
                m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_minute_selection);
            }
            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(m4811constructorimpl, startRestartGroup, 0);
            if (z) {
                startRestartGroup.startReplaceGroup(1528736631);
                startRestartGroup.endReplaceGroup();
                errorContainer = timePickerColors.m4315timeSelectorContainerColorvNxB06k$material3(m4384equalsimpl0);
            } else {
                startRestartGroup.startReplaceGroup(1528739041);
                ComposerKt.sourceInformation(startRestartGroup, "1518@60708L11");
                errorContainer = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getErrorContainer();
                startRestartGroup.endReplaceGroup();
            }
            if (z) {
                startRestartGroup.startReplaceGroup(1528741173);
                startRestartGroup.endReplaceGroup();
                onErrorContainer = timePickerColors.m4316timeSelectorContentColorvNxB06k$material3(m4384equalsimpl0);
            } else {
                startRestartGroup.startReplaceGroup(1528743523);
                ComposerKt.sourceInformation(startRestartGroup, "1521@60848L11");
                onErrorContainer = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getOnErrorContainer();
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1528747023, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m4895getString2EP1pXo);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TimeSelector_u8A1Dfs$lambda$1$0;
                        TimeSelector_u8A1Dfs$lambda$1$0 = TimePickerKt.TimeSelector_u8A1Dfs$lambda$1$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                        return TimeSelector_u8A1Dfs$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue2);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1528751624, "CC(remember):TimePicker.kt#9igjgp");
            boolean z3 = ((i4 & 7168) == 2048) | ((i4 & 896) == 256 || ((i4 & 512) != 0 && startRestartGroup.changedInstance(timePickerState)));
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TimeSelector_u8A1Dfs$lambda$2$0;
                        TimeSelector_u8A1Dfs$lambda$2$0 = TimePickerKt.TimeSelector_u8A1Dfs$lambda$2$0(i2, timePickerState);
                        return TimeSelector_u8A1Dfs$lambda$2$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final int i6 = i5;
            final long j = onErrorContainer;
            composer2 = startRestartGroup;
            SurfaceKt.m4113Surfaced85dljk(m4384equalsimpl0, (Function0<Unit>) function0, semantics, false, value, errorContainer, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(291874429, true, new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TimeSelector_u8A1Dfs$lambda$3;
                    TimeSelector_u8A1Dfs$lambda$3 = TimePickerKt.TimeSelector_u8A1Dfs$lambda$3(i2, timePickerState, i6, j, (Composer) obj, ((Integer) obj2).intValue());
                    return TimeSelector_u8A1Dfs$lambda$3;
                }
            }, startRestartGroup, 54), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TimeSelector_u8A1Dfs$lambda$4;
                    TimeSelector_u8A1Dfs$lambda$4 = TimePickerKt.TimeSelector_u8A1Dfs$lambda$4(Modifier.this, i, timePickerState, i2, timePickerColors, z, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return TimeSelector_u8A1Dfs$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeSelector_u8A1Dfs$lambda$1$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8886getRadioButtono7Vup1c());
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeSelector_u8A1Dfs$lambda$2$0(int i, TimePickerState timePickerState) {
        if (!TimePickerSelectionMode.m4384equalsimpl0(i, timePickerState.mo2470getSelectionyecRtBI())) {
            timePickerState.mo2472setSelection6_8s6DQ(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeSelector_u8A1Dfs$lambda$3(int i, TimePickerState timePickerState, int i2, long j, Composer composer, int i3) {
        ComposerKt.sourceInformation(composer, "C1539@61398L153,1545@61561L277:TimePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(291874429, i3, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1538)");
            }
            final String m4365numberContentDescriptiondSwYdS4 = m4365numberContentDescriptiondSwYdS4(i, timePickerState.getIs24hour(), i2, composer, 0);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            ComposerKt.sourceInformationMarkerStart(composer, 208686604, "C1547@61668L48,1546@61616L212:TimePicker.kt#uh7d8r");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1253659315, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = composer.changed(m4365numberContentDescriptiondSwYdS4);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TimeSelector_u8A1Dfs$lambda$3$0$0$0;
                        TimeSelector_u8A1Dfs$lambda$3$0$0$0 = TimePickerKt.TimeSelector_u8A1Dfs$lambda$3$0$0$0(m4365numberContentDescriptiondSwYdS4, (SemanticsPropertyReceiver) obj);
                        return TimeSelector_u8A1Dfs$lambda$3$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.m4292TextNvy7gAk(CalendarLocale_jvmAndAndroidKt.toLocalString$default(i2, 2, 0, false, null, 14, null), SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue, 1, null), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262136);
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
    public static final Unit TimeSelector_u8A1Dfs$lambda$3$0$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    public static final void ClockFace(final Modifier modifier, AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors, final boolean z, Composer composer, final int i) {
        int i2;
        final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
        Composer startRestartGroup = composer.startRestartGroup(-478841003);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockFace)N(modifier,state,colors,autoSwitchToMinute)1701@66705L7,1712@67159L7,1717@67360L7,1718@67375L2168,1703@66789L2754:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(analogTimePickerState2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-478841003, i2, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1700)");
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final FocusManager focusManager = (FocusManager) consume;
            analogTimePickerState2 = analogTimePickerState;
            CrossfadeKt.Crossfade(analogTimePickerState2.getClockFaceValues(), drawSelector(BackgroundKt.m352backgroundbw27NRU(modifier, timePickerColors.getClockDialColor(), RoundedCornerShapeKt.getCircleShape()).then(new ClockDialModifier(analogTimePickerState, z, analogTimePickerState.mo2470getSelectionyecRtBI(), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6), null)), analogTimePickerState2, timePickerColors), (FiniteAnimationSpec<Float>) MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), (String) null, ComposableLambdaKt.rememberComposableLambda(747010833, true, new Function3() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda54
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit ClockFace$lambda$0;
                    ClockFace$lambda$0 = TimePickerKt.ClockFace$lambda$0(TimePickerColors.this, analogTimePickerState2, z, focusManager, (IntList) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return ClockFace$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ClockFace$lambda$1;
                    ClockFace$lambda$1 = TimePickerKt.ClockFace$lambda$1(Modifier.this, analogTimePickerState2, timePickerColors, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ClockFace$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockFace$lambda$0(final TimePickerColors timePickerColors, final AnalogTimePickerState analogTimePickerState, final boolean z, final FocusManager focusManager, final IntList intList, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(screen)1720@67482L21,1722@67571L1966,1719@67395L2142:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(747010833, i, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1719)");
        }
        Modifier m1271size3ABfNKs = SizeKt.m1271size3ABfNKs(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m5663getClockDialContainerSizeD9Ej5fM());
        ComposerKt.sourceInformationMarkerStart(composer, 617875526, "CC(remember):TimePicker.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit ClockFace$lambda$0$0$0;
                    ClockFace$lambda$0$0$0 = TimePickerKt.ClockFace$lambda$0$0$0((SemanticsPropertyReceiver) obj);
                    return ClockFace$lambda$0$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        CircularLayout(SemanticsModifierKt.semantics$default(m1271size3ABfNKs, false, (Function1) rememberedValue, 1, null), OuterCircleToSizeRatio, ComposableLambdaKt.rememberComposableLambda(-99063847, true, new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit ClockFace$lambda$0$1;
                ClockFace$lambda$0$1 = TimePickerKt.ClockFace$lambda$0$1(TimePickerColors.this, intList, analogTimePickerState, z, focusManager, (Composer) obj, ((Integer) obj2).intValue());
                return ClockFace$lambda$0$1;
            }
        }, composer, 54), composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockFace$lambda$0$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockFace$lambda$0$1(TimePickerColors timePickerColors, final IntList intList, final AnalogTimePickerState analogTimePickerState, final boolean z, final FocusManager focusManager, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1725@67704L1823,1723@67585L1942:TimePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-99063847, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1723)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(timePickerColors.m4297clockDialContentColorvNxB06k$material3(false))), ComposableLambdaKt.rememberComposableLambda(-596940007, true, new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ClockFace$lambda$0$1$0;
                    ClockFace$lambda$0$1$0 = TimePickerKt.ClockFace$lambda$0$1$0(IntList.this, analogTimePickerState, z, focusManager, (Composer) obj, ((Integer) obj2).intValue());
                    return ClockFace$lambda$0$1$0;
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockFace$lambda$0$1$0(IntList intList, final AnalogTimePickerState analogTimePickerState, final boolean z, final FocusManager focusManager, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C:TimePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596940007, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1726)");
            }
            composer.startReplaceGroup(1866272197);
            ComposerKt.sourceInformation(composer, "*1734@68123L41,1733@68058L330");
            int i3 = intList._size;
            for (final int i4 = 0; i4 < i3; i4++) {
                if (!analogTimePickerState.getIs24hour() || TimePickerSelectionMode.m4384equalsimpl0(analogTimePickerState.mo2470getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI())) {
                    i2 = intList.get(i4);
                } else {
                    i2 = intList.get(i4) % 12;
                }
                int i5 = i2;
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -121641742, "CC(remember):TimePicker.kt#9igjgp");
                boolean changed = composer.changed(i4);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ClockFace$lambda$0$1$0$0$0$0;
                            ClockFace$lambda$0$1$0$0$0$0 = TimePickerKt.ClockFace$lambda$0$1$0$0$0$0(i4, (SemanticsPropertyReceiver) obj);
                            return ClockFace$lambda$0$1$0$0$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), analogTimePickerState, i5, z, focusManager, composer, 0);
            }
            composer.endReplaceGroup();
            if (TimePickerSelectionMode.m4384equalsimpl0(analogTimePickerState.mo2470getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI()) && analogTimePickerState.getIs24hour()) {
                composer.startReplaceGroup(2020640431);
                ComposerKt.sourceInformation(composer, "1749@68881L614,1743@68517L978");
                CircularLayout(BackgroundKt.m352backgroundbw27NRU(SizeKt.m1271size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m5663getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m6821getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), InnerCircleToSizeRatio, ComposableLambdaKt.rememberComposableLambda(-1385767514, true, new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ClockFace$lambda$0$1$0$1;
                        ClockFace$lambda$0$1$0$1 = TimePickerKt.ClockFace$lambda$0$1$0$1(AnalogTimePickerState.this, z, focusManager, (Composer) obj, ((Integer) obj2).intValue());
                        return ClockFace$lambda$0$1$0$1;
                    }
                }, composer, 54), composer, 432, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2021618729);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockFace$lambda$0$1$0$0$0$0(int i, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i + 1.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockFace$lambda$0$1$0$1(AnalogTimePickerState analogTimePickerState, boolean z, FocusManager focusManager, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C*1754@69142L41,1752@69033L414:TimePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1385767514, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1750)");
            }
            int i2 = ExtraHours._size;
            for (final int i3 = 0; i3 < i2; i3++) {
                int i4 = ExtraHours.get(i3);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1870016769, "CC(remember):TimePicker.kt#9igjgp");
                boolean changed = composer.changed(i3);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ClockFace$lambda$0$1$0$1$0$0$0;
                            ClockFace$lambda$0$1$0$1$0$0$0 = TimePickerKt.ClockFace$lambda$0$1$0$1$0$0$0(i3, (SemanticsPropertyReceiver) obj);
                            return ClockFace$lambda$0$1$0$1$0$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), analogTimePickerState, i4, z, focusManager, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockFace$lambda$0$1$0$1$0$0$0(int i, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i);
        return Unit.INSTANCE;
    }

    private static final Modifier drawSelector(Modifier modifier, final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit drawSelector$lambda$0;
                drawSelector$lambda$0 = TimePickerKt.drawSelector$lambda$0(AnalogTimePickerState.this, timePickerColors, (ContentDrawScope) obj);
                return drawSelector$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawSelector$lambda$0(AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, ContentDrawScope contentDrawScope) {
        float f = contentDrawScope.mo528toPx0680j_4(DpOffset.m9793getXD9Ej5fM(getSelectorPos(analogTimePickerState)));
        float f2 = contentDrawScope.mo528toPx0680j_4(DpOffset.m9795getYD9Ej5fM(getSelectorPos(analogTimePickerState)));
        long m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float f3 = ((contentDrawScope.mo528toPx0680j_4(TimePickerTokens.INSTANCE.m5665getClockDialSelectorHandleContainerSizeD9Ej5fM()) / SeparatorZIndex) * contentDrawScope.mo522roundToPx0680j_4(analogTimePickerState.m2469getCurrentDiameterD9Ej5fM())) / contentDrawScope.mo522roundToPx0680j_4(TimePickerTokens.INSTANCE.m5663getClockDialContainerSizeD9Ej5fM());
        long selectorColor = timePickerColors.getSelectorColor();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawScope.CC.m7366drawCircleVaOC9Bg$default(contentDrawScope2, Color.INSTANCE.m6812getBlack0d7_KjU(), f3, m6511constructorimpl, 0.0f, null, null, BlendMode.INSTANCE.m6699getClear0nO6VwU(), 56, null);
        contentDrawScope.drawContent();
        DrawScope.CC.m7366drawCircleVaOC9Bg$default(contentDrawScope2, selectorColor, f3, m6511constructorimpl, 0.0f, null, null, BlendMode.INSTANCE.m6727getXor0nO6VwU(), 56, null);
        float f4 = contentDrawScope.mo528toPx0680j_4(TimePickerTokens.INSTANCE.m5666getClockDialSelectorTrackContainerWidthD9Ej5fM());
        float cos = ((float) Math.cos(analogTimePickerState.getCurrentAngle())) * f3;
        float sin = ((float) Math.sin(analogTimePickerState.getCurrentAngle())) * f3;
        DrawScope.CC.m7371drawLineNGM6Ib0$default(contentDrawScope2, selectorColor, androidx.compose.ui.geometry.SizeKt.m6598getCenteruvyYCjk(contentDrawScope.mo7294getSizeNHjbRc()), Offset.m6523minusMKHz9U(m6511constructorimpl, Offset.m6511constructorimpl((Float.floatToRawIntBits(sin) & 4294967295L) | (Float.floatToRawIntBits(cos) << 32))), f4, 0, null, 0.0f, null, BlendMode.INSTANCE.m6726getSrcOver0nO6VwU(), 240, null);
        DrawScope.CC.m7366drawCircleVaOC9Bg$default(contentDrawScope2, selectorColor, contentDrawScope.mo528toPx0680j_4(TimePickerTokens.INSTANCE.m5664getClockDialSelectorCenterContainerSizeD9Ej5fM()) / 2, androidx.compose.ui.geometry.SizeKt.m6598getCenteruvyYCjk(contentDrawScope.mo7294getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
        DrawScope.CC.m7366drawCircleVaOC9Bg$default(contentDrawScope2, timePickerColors.m4297clockDialContentColorvNxB06k$material3(true), f3, m6511constructorimpl, 0.0f, null, null, BlendMode.INSTANCE.m6709getDstOver0nO6VwU(), 56, null);
        return Unit.INSTANCE;
    }

    private static final void ClockText(Modifier modifier, final AnalogTimePickerState analogTimePickerState, final int i, final boolean z, final FocusManager focusManager, Composer composer, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final CoroutineScope coroutineScope;
        final MutableState mutableState;
        final MutableState mutableState2;
        final MutableInteractionSource mutableInteractionSource;
        Object obj;
        Composer startRestartGroup = composer.startRestartGroup(-228814986);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockText)N(modifier,state,value,autoSwitchToMinute,focusManager)1841@71813L5,1842@71859L7,1844@71940L40,1845@72005L43,1846@72075L38,1847@72142L39,1848@72198L24,1850@72260L143,1858@72470L268,1866@72779L314,1878@73136L7,1885@73378L215,1892@73719L1455,1923@75376L188,1881@73250L2524:TimePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(analogTimePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(focusManager) ? 16384 : 8192;
        }
        int i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            modifier2 = modifier;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-228814986, i4, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1840)");
            }
            TextStyle value = TypographyKt.getValue(TimePickerTokens.INSTANCE.getClockDialLabelTextFont(), startRestartGroup, 6);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density = (Density) consume;
            final float mo528toPx0680j_4 = density.mo528toPx0680j_4(MaxDistance);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -847859042, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m6508boximpl(Offset.INSTANCE.m6535getZeroF1C5BW0()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -847856959, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m9855boximpl(IntOffset.INSTANCE.m9875getZeronOccac()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -847854724, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Rect.INSTANCE.getZero(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState5 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -847852579, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final String m4365numberContentDescriptiondSwYdS4 = m4365numberContentDescriptiondSwYdS4(analogTimePickerState.mo2470getSelectionyecRtBI(), analogTimePickerState.getIs24hour(), i, startRestartGroup, i4 & 896);
            String localString$default = CalendarLocale_jvmAndAndroidKt.toLocalString$default(i, 0, 0, false, null, 15, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -847841854, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(analogTimePickerState);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean ClockText$lambda$11$0;
                        ClockText$lambda$11$0 = TimePickerKt.ClockText$lambda$11$0(AnalogTimePickerState.this, density, mutableState5);
                        return Boolean.valueOf(ClockText$lambda$11$0);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            final State state = (State) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -847831920, "CC(remember):TimePicker.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(analogTimePickerState) | startRestartGroup.changed(mo528toPx0680j_4) | ((i4 & 7168) == 2048);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                coroutineScope = coroutineScope2;
                mutableState = mutableState3;
                mutableState2 = mutableState4;
                Object obj2 = new Function0() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ClockText$lambda$13$0;
                        ClockText$lambda$13$0 = TimePickerKt.ClockText$lambda$13$0(CoroutineScope.this, analogTimePickerState, mo528toPx0680j_4, z, mutableState, mutableState2);
                        return ClockText$lambda$13$0;
                    }
                };
                startRestartGroup.updateRememberedValue(obj2);
                rememberedValue7 = obj2;
            } else {
                coroutineScope = coroutineScope2;
                mutableState = mutableState3;
                mutableState2 = mutableState4;
            }
            final Function0 function0 = (Function0) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<InputModeManager> localInputModeManager = CompositionLocalsKt.getLocalInputModeManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localInputModeManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean z2 = !InputMode.m7614equalsimpl0(((InputModeManager) consume2).mo7621getInputModeaOaMEAU(), InputMode.INSTANCE.m7619getTouchaOaMEAU());
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -847812851, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit ClockText$lambda$14$0;
                        ClockText$lambda$14$0 = TimePickerKt.ClockText$lambda$14$0(MutableState.this, mutableState5, mutableState, (LayoutCoordinates) obj3);
                        return ClockText$lambda$14$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            modifier2 = modifier;
            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, (Function1) rememberedValue8));
            float f = MinimumInteractiveSize;
            Modifier m1271size3ABfNKs = SizeKt.m1271size3ABfNKs(minimumInteractiveComponentSize, f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -847800699, "CC(remember):TimePicker.kt#9igjgp");
            boolean changedInstance2 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changed(function0) | startRestartGroup.changedInstance(focusManager);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                mutableInteractionSource = mutableInteractionSource2;
                obj = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m4369invokeZmokQxo(keyEvent.m7966unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m4369invokeZmokQxo(android.view.KeyEvent keyEvent) {
                        boolean m4362isClickZmokQxo;
                        boolean m4363isEnterZmokQxo;
                        if (KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7974getKeyDownCS__XNY())) {
                            m4363isEnterZmokQxo = TimePickerKt.m4363isEnterZmokQxo(keyEvent);
                            if (m4363isEnterZmokQxo) {
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(mutableInteractionSource, mutableState, null), 3, null);
                            }
                        }
                        m4362isClickZmokQxo = TimePickerKt.m4362isClickZmokQxo(keyEvent);
                        if (m4362isClickZmokQxo) {
                            function0.invoke();
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass2(mutableInteractionSource, mutableState, null), 3, null);
                            return true;
                        }
                        if (KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7974getKeyDownCS__XNY())) {
                            if (Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7731getDirectionDownEK5gGoQ()) || Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7735getDirectionRightEK5gGoQ())) {
                                focusManager.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6402getNextdhqQ8s());
                                return true;
                            }
                            if (Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7736getDirectionUpEK5gGoQ()) || Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7734getDirectionLeftEK5gGoQ())) {
                                focusManager.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6403getPreviousdhqQ8s());
                                return true;
                            }
                        }
                        return false;
                    }

                    /* compiled from: TimePicker.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                    @DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1", f = "TimePicker.kt", i = {}, l = {1896}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                    /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ MutableState<Offset> $center$delegate;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(MutableInteractionSource mutableInteractionSource, MutableState<Offset> mutableState, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$interactionSource = mutableInteractionSource;
                            this.$center$delegate = mutableState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$interactionSource, this.$center$delegate, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            long ClockText$lambda$2;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                ClockText$lambda$2 = TimePickerKt.ClockText$lambda$2(this.$center$delegate);
                                this.label = 1;
                                if (mutableInteractionSource.emit(new PressInteraction.Press(ClockText$lambda$2, null), this) == coroutine_suspended) {
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

                    /* compiled from: TimePicker.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                    @DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$2", f = "TimePicker.kt", i = {}, l = {1902}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                    /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ MutableState<Offset> $center$delegate;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(MutableInteractionSource mutableInteractionSource, MutableState<Offset> mutableState, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$interactionSource = mutableInteractionSource;
                            this.$center$delegate = mutableState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(this.$interactionSource, this.$center$delegate, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            long ClockText$lambda$2;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                ClockText$lambda$2 = TimePickerKt.ClockText$lambda$2(this.$center$delegate);
                                this.label = 1;
                                if (mutableInteractionSource.emit(new PressInteraction.Release(new PressInteraction.Press(ClockText$lambda$2, null)), this) == coroutine_suspended) {
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
                };
                startRestartGroup.updateRememberedValue(obj);
            } else {
                obj = rememberedValue9;
                mutableInteractionSource = mutableInteractionSource2;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier focusable = FocusableKt.focusable(IndicationKt.indication(KeyInputModifierKt.onKeyEvent(m1271size3ABfNKs, (Function1) obj), mutableInteractionSource, RippleKt.m3792rippleH2RKhps$default(false, Dp.m9732constructorimpl(f / 2), 0L, 5, null)), z2, mutableInteractionSource);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -847748942, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(function0) | startRestartGroup.changed(state);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit ClockText$lambda$16$0;
                        ClockText$lambda$16$0 = TimePickerKt.ClockText$lambda$16$0(Function0.this, state, (SemanticsPropertyReceiver) obj3);
                        return ClockText$lambda$16$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics = SemanticsModifierKt.semantics(focusable, true, (Function1) rememberedValue10);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 737770137, "C1933@75657L48,1931@75582L186:TimePicker.kt#uh7d8r");
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1547821952, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(m4365numberContentDescriptiondSwYdS4);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit ClockText$lambda$17$0$0;
                        ClockText$lambda$17$0$0 = TimePickerKt.ClockText$lambda$17$0$0(m4365numberContentDescriptiondSwYdS4, (SemanticsPropertyReceiver) obj3);
                        return ClockText$lambda$17$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            TextKt.m4292TextNvy7gAk(localString$default, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue11), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, composer2, 0, 0, 131068);
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
            final Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Unit ClockText$lambda$18;
                    ClockText$lambda$18 = TimePickerKt.ClockText$lambda$18(Modifier.this, analogTimePickerState, i, z, focusManager, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    return ClockText$lambda$18;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$2(MutableState<Offset> mutableState) {
        return mutableState.getValue().m6529unboximpl();
    }

    private static final void ClockText$lambda$3(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m6508boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$5(MutableState<IntOffset> mutableState) {
        return mutableState.getValue().m9873unboximpl();
    }

    private static final void ClockText$lambda$6(MutableState<IntOffset> mutableState, long j) {
        mutableState.setValue(IntOffset.m9855boximpl(j));
    }

    private static final Rect ClockText$lambda$8(MutableState<Rect> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ClockText$lambda$11$0(AnalogTimePickerState analogTimePickerState, Density density, MutableState mutableState) {
        long selectorPos = getSelectorPos(analogTimePickerState);
        float mo528toPx0680j_4 = density.mo528toPx0680j_4(DpOffset.m9793getXD9Ej5fM(selectorPos));
        float mo528toPx0680j_42 = density.mo528toPx0680j_4(DpOffset.m9795getYD9Ej5fM(selectorPos));
        return ClockText$lambda$8(mutableState).m6545containsk4lQ0M(Offset.m6511constructorimpl((Float.floatToRawIntBits(mo528toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(mo528toPx0680j_4) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockText$lambda$13$0(CoroutineScope coroutineScope, AnalogTimePickerState analogTimePickerState, float f, boolean z, MutableState mutableState, MutableState mutableState2) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TimePickerKt$ClockText$onClockTextClick$1$1$1(analogTimePickerState, f, z, mutableState, mutableState2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockText$lambda$14$0(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentCoordinates = layoutCoordinates.getParentCoordinates();
        ClockText$lambda$6(mutableState, parentCoordinates != null ? IntSizeKt.m9913getCenterozmzZPI(parentCoordinates.mo8287getSizeYbymL2g()) : IntOffset.INSTANCE.m9875getZeronOccac());
        mutableState2.setValue(LayoutCoordinatesKt.boundsInParent(layoutCoordinates));
        ClockText$lambda$3(mutableState3, ClockText$lambda$8(mutableState2).m6549getCenterF1C5BW0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockText$lambda$16$0(final Function0 function0, State state, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean ClockText$lambda$16$0$0;
                ClockText$lambda$16$0$0 = TimePickerKt.ClockText$lambda$16$0$0(Function0.this);
                return Boolean.valueOf(ClockText$lambda$16$0$0);
            }
        }, 1, null);
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, ClockText$lambda$12(state));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ClockText$lambda$16$0$0(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClockText$lambda$17$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* renamed from: timeInputOnChange-Eb28HvY, reason: not valid java name */
    private static final void m4367timeInputOnChangeEb28HvY(int i, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, Ref<Boolean> ref, boolean z, TimeInputErrorHandler timeInputErrorHandler, Function1<? super TextFieldValue, Unit> function1) {
        int parseInt;
        int i2 = 0;
        ref.setValue(false);
        if (Intrinsics.areEqual(textFieldValue.getText(), textFieldValue2.getText())) {
            function1.invoke(textFieldValue);
            return;
        }
        int i3 = 12;
        if (textFieldValue.getText().length() == 0) {
            if (TimePickerSelectionMode.m4384equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI())) {
                if (isPm(timePickerState) && !timePickerState.getIs24hour()) {
                    i2 = 12;
                }
                timePickerState.setHourInput(i2);
            } else {
                timePickerState.setMinuteInput(0);
            }
            function1.invoke(TextFieldValue.m9415copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            if (textFieldValue.getText().length() == 3 && TextRange.m9141getStartimpl(textFieldValue.getSelection()) == 1) {
                parseInt = CharsKt.digitToInt(textFieldValue.getText().charAt(0));
            } else {
                parseInt = Integer.parseInt(textFieldValue.getText());
            }
            if (parseInt <= MaxValueForTextField) {
                if (TimePickerSelectionMode.m4384equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI())) {
                    if (parseInt != 12 || !isPm(timePickerState)) {
                        if (parseInt != 12 || isPm(timePickerState) || timePickerState.getIs24hour()) {
                            if (!isPm(timePickerState) || timePickerState.getIs24hour()) {
                                i3 = 0;
                            }
                            i3 += parseInt;
                        } else {
                            i3 = 0;
                        }
                    }
                    timePickerState.setHourInput(i3);
                    if (parseInt > 1 && !timePickerState.getIs24hour() && !z) {
                        timePickerState.mo2472setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI());
                    }
                } else {
                    timePickerState.setMinuteInput(parseInt);
                }
                function1.invoke(textFieldValue.getText().length() <= 2 ? textFieldValue : TextFieldValue.m9415copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null));
                return;
            }
            timeInputErrorHandler.onError();
        } catch (NumberFormatException unused) {
        } catch (IllegalArgumentException unused2) {
            timeInputErrorHandler.onError();
        }
    }

    /* renamed from: SupportingText-73flGVI, reason: not valid java name */
    private static final void m4354SupportingText73flGVI(final Modifier modifier, final int i, final TimePickerState timePickerState, final boolean z, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int m4811constructorimpl;
        long value;
        Composer startRestartGroup = composer.startRestartGroup(474051149);
        ComposerKt.sourceInformation(startRestartGroup, "C(SupportingText)N(modifier,selection:c#material3.TimePickerSelectionMode,state,isValid)2025@78478L16,2032@78721L2,2036@78851L5,2031@78635L228:TimePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(474051149, i3, -1, "androidx.compose.material3.SupportingText (TimePicker.kt:2013)");
            }
            if (z && TimePickerSelectionMode.m4384equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI())) {
                Strings.Companion companion = Strings.INSTANCE;
                m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_hour);
            } else if (z) {
                Strings.Companion companion2 = Strings.INSTANCE;
                m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_minute);
            } else if (TimePickerSelectionMode.m4384equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI()) && timePickerState.getIs24hour()) {
                Strings.Companion companion3 = Strings.INSTANCE;
                m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_hour_error_24h);
            } else if (!TimePickerSelectionMode.m4384equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI())) {
                Strings.Companion companion4 = Strings.INSTANCE;
                m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_minute_error);
            } else {
                Strings.Companion companion5 = Strings.INSTANCE;
                m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_hour_error);
            }
            String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(m4811constructorimpl, startRestartGroup, 0);
            if (!z) {
                startRestartGroup.startReplaceGroup(296642354);
                ComposerKt.sourceInformation(startRestartGroup, "2028@78548L11");
                value = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getError();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(296644402);
                ComposerKt.sourceInformation(startRestartGroup, "2029@78624L5");
                value = ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextColor(), startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            }
            long j = value;
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(modifier, 0.0f, SupportLabelTop, 0.0f, 0.0f, 13, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 296647503, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SupportingText_73flGVI$lambda$0$0;
                        SupportingText_73flGVI$lambda$0$0 = TimePickerKt.SupportingText_73flGVI$lambda$0$0((SemanticsPropertyReceiver) obj);
                        return SupportingText_73flGVI$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            TextKt.m4292TextNvy7gAk(m4895getString2EP1pXo, SemanticsModifierKt.clearAndSetSemantics(m1205paddingqDBjuR0$default, (Function1) rememberedValue), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 2, null, TypographyKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextFont(), startRestartGroup, 6), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 98296);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SupportingText_73flGVI$lambda$1;
                    SupportingText_73flGVI$lambda$1 = TimePickerKt.SupportingText_73flGVI$lambda$1(Modifier.this, i, timePickerState, z, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return SupportingText_73flGVI$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportingText_73flGVI$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* renamed from: TimePickerTextField-1vLObsk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m4356TimePickerTextField1vLObsk(final Modifier modifier, final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, TimePickerState timePickerState, int i, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final TimePickerColors timePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        KeyboardActions keyboardActions2;
        Composer composer2;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions3;
        ScopeUpdateScope endRestartGroup;
        boolean isMinuteInputValid;
        int i6;
        long j;
        int i7;
        FocusRequester focusRequester;
        int i8;
        final boolean z;
        int i9;
        ?? r15;
        int m4811constructorimpl;
        int minuteInput;
        final TimePickerState timePickerState2 = timePickerState;
        final int i10 = i;
        Composer startRestartGroup = composer.startRestartGroup(1299172990);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimePickerTextField)N(modifier,value,onValueChange,state,selection:c#material3.TimePickerSelectionMode,keyboardOptions,keyboardActions,colors)2052@79303L29,2053@79372L11,2054@79434L11,2056@79523L335,2077@80250L3461,2162@83749L103,2162@83717L135:TimePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & 4096) == 0 ? startRestartGroup.changed(timePickerState2) : startRestartGroup.changedInstance(timePickerState2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(i10) ? 16384 : 8192;
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                keyboardActions2 = keyboardActions;
                i4 |= startRestartGroup.changed(keyboardActions2) ? 1048576 : 524288;
                if ((i2 & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(timePickerColors) ? 8388608 : 4194304;
                }
                if (!startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    keyboardOptions2 = keyboardOptions;
                    keyboardActions3 = keyboardActions2;
                } else {
                    KeyboardOptions keyboardOptions3 = i11 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                    KeyboardActions keyboardActions4 = i5 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1299172990, i4, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:2051)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1330227685, "CC(remember):TimePicker.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    FocusRequester focusRequester2 = (FocusRequester) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i12 = i4;
                    final TextFieldColors m3711colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m3711colors0hiis_0(timePickerColors.m4316timeSelectorContentColorvNxB06k$material3(true), 0L, 0L, 0L, timePickerColors.m4315timeSelectorContainerColorvNxB06k$material3(true), timePickerColors.m4315timeSelectorContainerColorvNxB06k$material3(true), 0L, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getErrorContainer(), 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getOnErrorContainer(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, 3072, 2080374606, 4095);
                    boolean m4384equalsimpl0 = TimePickerSelectionMode.m4384equalsimpl0(i10, timePickerState2.mo2470getSelectionyecRtBI());
                    if (TimePickerSelectionMode.m4384equalsimpl0(i10, TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI())) {
                        isMinuteInputValid = isHourInputValid(timePickerState2);
                    } else {
                        isMinuteInputValid = isMinuteInputValid(timePickerState2);
                    }
                    if (isMinuteInputValid) {
                        startRestartGroup.startReplaceGroup(1713428167);
                        startRestartGroup.endReplaceGroup();
                        j = timePickerColors.m4316timeSelectorContentColorvNxB06k$material3(true);
                        i6 = 6;
                    } else {
                        startRestartGroup.startReplaceGroup(1713494445);
                        ComposerKt.sourceInformation(startRestartGroup, "2074@80217L11");
                        i6 = 6;
                        long error = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getError();
                        startRestartGroup.endReplaceGroup();
                        j = error;
                    }
                    Modifier width = IntrinsicKt.width(modifier, IntrinsicSize.Min);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int i13 = i6;
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
                    Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023500047, "C2095@80938L240,2102@81211L39,2104@81260L2220,2155@83563L38,2154@83490L215:TimePicker.kt#uh7d8r");
                    if (!m4384equalsimpl0) {
                        startRestartGroup.startReplaceGroup(2023427227);
                        ComposerKt.sourceInformation(startRestartGroup, "2079@80342L539");
                        Modifier m1273sizeVpY3zN4 = SizeKt.m1273sizeVpY3zN4(Modifier.INSTANCE, TimeInputTokens.INSTANCE.m5661getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m5660getTimeFieldContainerHeightD9Ej5fM());
                        if (TimePickerSelectionMode.m4384equalsimpl0(i10, TimePickerSelectionMode.INSTANCE.m4388getHouryecRtBI())) {
                            minuteInput = isHourInputValid(timePickerState2) ? getHourForDisplay(timePickerState2) : timePickerState2.getHourInput();
                        } else {
                            minuteInput = timePickerState2.getMinuteInput();
                        }
                        i9 = i12;
                        int i14 = i9 >> 3;
                        int i15 = (i14 & 7168) | (i14 & 896) | 6 | ((i9 >> 9) & 57344);
                        focusRequester = focusRequester2;
                        i7 = 57344;
                        r15 = 0;
                        m4357TimeSelectoru8A1Dfs(m1273sizeVpY3zN4, minuteInput, timePickerState2, i10, timePickerColors, isMinuteInputValid, startRestartGroup, i15);
                        i8 = i10;
                        z = isMinuteInputValid;
                        startRestartGroup.endReplaceGroup();
                    } else {
                        i7 = 57344;
                        focusRequester = focusRequester2;
                        i8 = i10;
                        z = isMinuteInputValid;
                        i9 = i12;
                        r15 = 0;
                        startRestartGroup.startReplaceGroup(2023968270);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (TimePickerSelectionMode.m4384equalsimpl0(i8, TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI())) {
                        Strings.Companion companion = Strings.INSTANCE;
                        m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_minute_text_field);
                    } else {
                        Strings.Companion companion2 = Strings.INSTANCE;
                        m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_hour_text_field);
                    }
                    final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(m4811constructorimpl, startRestartGroup, r15);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1173678235, "CC(remember):TimePicker.kt#9igjgp");
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier visible = visible(Modifier.INSTANCE, m4384equalsimpl0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r15);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r15));
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, visible);
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
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1787857941, "C2111@81603L151,2118@81956L7,2125@82281L11,2126@82349L11,2130@82511L959,2105@81306L2164:TimePicker.kt#uh7d8r");
                    Modifier m1273sizeVpY3zN42 = SizeKt.m1273sizeVpY3zN4(FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester), TimeInputTokens.INSTANCE.m5661getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m5660getTimeFieldContainerHeightD9Ej5fM());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1443153649, "CC(remember):TimePicker.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(m4895getString2EP1pXo);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TimePickerTextField_1vLObsk$lambda$1$1$0$0;
                                TimePickerTextField_1vLObsk$lambda$1$1$0$0 = TimePickerKt.TimePickerTextField_1vLObsk$lambda$1$1$0$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                                return TimePickerTextField_1vLObsk$lambda$1$1$0$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(m1273sizeVpY3zN42, false, (Function1) rememberedValue3, 1, null);
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    TextStyle m9154copyp1EtxEg$default = TextStyle.m9154copyp1EtxEg$default((TextStyle) consume, j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    Brush.Companion companion3 = Brush.INSTANCE;
                    Pair[] pairArr = new Pair[i13];
                    pairArr[0] = TuplesKt.to(Float.valueOf(0.0f), Color.m6776boximpl(Color.INSTANCE.m6821getTransparent0d7_KjU()));
                    pairArr[1] = TuplesKt.to(Float.valueOf(0.1f), Color.m6776boximpl(Color.INSTANCE.m6821getTransparent0d7_KjU()));
                    pairArr[2] = TuplesKt.to(Float.valueOf(0.1f), Color.m6776boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getPrimary()));
                    pairArr[3] = TuplesKt.to(Float.valueOf(0.9f), Color.m6776boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getPrimary()));
                    pairArr[4] = TuplesKt.to(Float.valueOf(0.9f), Color.m6776boximpl(Color.INSTANCE.m6821getTransparent0d7_KjU()));
                    pairArr[5] = TuplesKt.to(Float.valueOf(1.0f), Color.m6776boximpl(Color.INSTANCE.m6821getTransparent0d7_KjU()));
                    Brush m6742verticalGradient8A3gB4$default = Brush.Companion.m6742verticalGradient8A3gB4$default(companion3, pairArr, 0.0f, 0.0f, 0, 14, (Object) null);
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1007938103, true, new Function3() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Unit TimePickerTextField_1vLObsk$lambda$1$1$1;
                            TimePickerTextField_1vLObsk$lambda$1$1$1 = TimePickerKt.TimePickerTextField_1vLObsk$lambda$1$1$1(TextFieldValue.this, z, mutableInteractionSource, m3711colors0hiis_0, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return TimePickerTextField_1vLObsk$lambda$1$1$1;
                        }
                    }, startRestartGroup, 54);
                    int i16 = i9 >> 3;
                    int i17 = (i16 & 14) | 100666368 | (i16 & 112);
                    int i18 = i9 << 3;
                    FocusRequester focusRequester3 = focusRequester;
                    boolean z2 = z;
                    KeyboardOptions keyboardOptions4 = keyboardOptions3;
                    int i19 = i9;
                    KeyboardActions keyboardActions5 = keyboardActions4;
                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, semantics$default, true, false, m9154copyp1EtxEg$default, keyboardOptions4, keyboardActions5, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, m6742verticalGradient8A3gB4$default, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) rememberComposableLambda, startRestartGroup, i17 | (3670016 & i18) | (i18 & 29360128), 199680, 7696);
                    composer2 = startRestartGroup;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1173753498, "CC(remember):TimePicker.kt#9igjgp");
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TimePickerTextField_1vLObsk$lambda$1$2$0;
                                TimePickerTextField_1vLObsk$lambda$1$2$0 = TimePickerKt.TimePickerTextField_1vLObsk$lambda$1$2$0((SemanticsPropertyReceiver) obj);
                                return TimePickerTextField_1vLObsk$lambda$1$2$0;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    timePickerState2 = timePickerState;
                    m4354SupportingText73flGVI(SemanticsModifierKt.semantics$default(fillMaxWidth$default, false, (Function1) rememberedValue4, 1, null), i, timePickerState2, z2, composer2, ((i19 >> 9) & 112) | (i16 & 896));
                    i10 = i;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    TimePickerSelectionMode m4381boximpl = TimePickerSelectionMode.m4381boximpl(timePickerState2.mo2470getSelectionyecRtBI());
                    ComposerKt.sourceInformationMarkerStart(composer2, -1330085339, "CC(remember):TimePicker.kt#9igjgp");
                    boolean z3 = ((i19 & 7168) == 2048 || ((i19 & 4096) != 0 && composer2.changedInstance(timePickerState2))) | ((i19 & i7) == 16384);
                    TimePickerKt$TimePickerTextField$2$1 rememberedValue5 = composer2.rememberedValue();
                    if (z3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new TimePickerKt$TimePickerTextField$2$1(timePickerState2, i10, focusRequester3, null);
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    EffectsKt.LaunchedEffect(m4381boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    keyboardOptions2 = keyboardOptions4;
                    keyboardActions3 = keyboardActions5;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TimePickerTextField_1vLObsk$lambda$3;
                            TimePickerTextField_1vLObsk$lambda$3 = TimePickerKt.TimePickerTextField_1vLObsk$lambda$3(Modifier.this, textFieldValue, function1, timePickerState2, i10, keyboardOptions2, keyboardActions3, timePickerColors, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return TimePickerTextField_1vLObsk$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            keyboardActions2 = keyboardActions;
            if ((i2 & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        keyboardActions2 = keyboardActions;
        if ((i2 & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerTextField_1vLObsk$lambda$1$1$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setMaxTextLength(semanticsPropertyReceiver, 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerTextField_1vLObsk$lambda$1$1$1(TextFieldValue textFieldValue, final boolean z, final MutableInteractionSource mutableInteractionSource, final TextFieldColors textFieldColors, Function2 function2, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(it)2141@83031L406,2131@82555L901:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changedInstance(function2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1007938103, i2, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:2131)");
            }
            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function2, true, true, VisualTransformation.INSTANCE.getNone(), mutableInteractionSource, !z, null, null, null, null, null, null, null, textFieldColors, PaddingKt.m1194PaddingValues0680j_4(Dp.m9732constructorimpl(0)), ComposableLambdaKt.rememberComposableLambda(769667466, true, new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TimePickerTextField_1vLObsk$lambda$1$1$1$0;
                    TimePickerTextField_1vLObsk$lambda$1$1$1$0 = TimePickerKt.TimePickerTextField_1vLObsk$lambda$1$1$1$0(z, mutableInteractionSource, textFieldColors, (Composer) obj, ((Integer) obj2).intValue());
                    return TimePickerTextField_1vLObsk$lambda$1$1$1$0;
                }
            }, composer, 54), composer, ((i2 << 3) & 112) | 224640, 14352384, 16256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerTextField_1vLObsk$lambda$1$1$1$0(boolean z, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2146@83329L5,2142@83083L332:TimePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(769667466, i, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:2142)");
            }
            OutlinedTextFieldDefaults.INSTANCE.m3709Container4EFweAY(true, !z, mutableInteractionSource, null, textFieldColors, ShapesKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer, 6), 0.0f, 0.0f, composer, 100663686, ComposerKt.invocationKey);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePickerTextField_1vLObsk$lambda$1$2$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8899setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m8873getPolite0phEisY());
        return Unit.INSTANCE;
    }

    private static final void CircularLayout(Modifier modifier, final float f, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1041042571);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularLayout)N(modifier,radiusToSizeRatio,content)2179@84212L1660,2179@84165L1707:TimePicker.kt#uh7d8r");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1041042571, i3, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:2178)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 285477649, "CC(remember):TimePicker.kt#9igjgp");
            boolean z = (i3 & 112) == 32;
            TimePickerKt$CircularLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TimePickerKt$CircularLayout$1$1(f);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i5 = ((i3 >> 6) & 14) | ((i3 << 3) & 112);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((i5 << 6) & 896) | 6;
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
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TimePickerKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CircularLayout$lambda$1;
                    CircularLayout$lambda$1 = TimePickerKt.CircularLayout$lambda$1(Modifier.this, f, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CircularLayout$lambda$1;
                }
            });
        }
    }

    /* renamed from: numberContentDescription-dSwYdS4, reason: not valid java name */
    public static final String m4365numberContentDescriptiondSwYdS4(int i, boolean z, int i2, Composer composer, int i3) {
        int m4811constructorimpl;
        ComposerKt.sourceInformationMarkerStart(composer, 194237364, "C(numberContentDescription)N(selection:c#material3.TimePickerSelectionMode,is24Hour,number)2229@86308L21:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(194237364, i3, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:2219)");
        }
        if (TimePickerSelectionMode.m4384equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m4389getMinuteyecRtBI())) {
            Strings.Companion companion = Strings.INSTANCE;
            m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_minute_suffix);
        } else if (z) {
            Strings.Companion companion2 = Strings.INSTANCE;
            m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_hour_24h_suffix);
        } else {
            Strings.Companion companion3 = Strings.INSTANCE;
            m4811constructorimpl = Strings.m4811constructorimpl(R.string.m3c_time_picker_hour_suffix);
        }
        String m4896getStringqBjtwXw = Strings_androidKt.m4896getStringqBjtwXw(m4811constructorimpl, new Object[]{Integer.valueOf(i2)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m4896getStringqBjtwXw;
    }

    private static final float dist(float f, float f2, int i, int i2) {
        return (float) Math.hypot(i - f, i2 - f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float atan(float f, float f2) {
        float atan2 = ((float) Math.atan2(f, f2)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + FullCircle : atan2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m4362isClickZmokQxo(android.view.KeyEvent keyEvent) {
        return KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7975getKeyUpCS__XNY()) && m4363isEnterZmokQxo(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    public static final boolean m4363isEnterZmokQxo(android.view.KeyEvent keyEvent) {
        long m7977getKeyZmokQxo = KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent);
        return Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7730getDirectionCenterEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7744getEnterEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7841getNumPadEnterEK5gGoQ()) || Key.m7657equalsimpl0(m7977getKeyZmokQxo, Key.INSTANCE.m7892getSpacebarEK5gGoQ());
    }

    public static final int getDefaultTimePickerLayoutType(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 435687004, "C(<get-defaultTimePickerLayoutType>)2263@87222L29:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(435687004, i, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.kt:2263)");
        }
        int defaultTimePickerLayoutType = TimePicker_androidKt.defaultTimePickerLayoutType(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTimePickerLayoutType;
    }

    public static final float getClockDialMinContainerSize() {
        return ClockDialMinContainerSize;
    }

    private static final Modifier visible(Modifier modifier, final boolean z) {
        return modifier.then(new VisibleModifier(z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("visible");
                inspectorInfo.getProperties().set("visible", Boolean.valueOf(z));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean TimeInputImpl$lambda$9$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean ClockText$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static {
        float f = 24;
        ClockFaceBottomMargin = Dp.m9732constructorimpl(f);
        DisplaySeparatorWidth = Dp.m9732constructorimpl(f);
        IntList intListOf = IntListKt.intListOf(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = intListOf;
        MutableIntList mutableIntList = new MutableIntList(intListOf._size);
        int[] iArr = intListOf.content;
        int i = intListOf._size;
        for (int i2 = 0; i2 < i; i2++) {
            mutableIntList.add((iArr[i2] % 12) + 12);
        }
        ExtraHours = mutableIntList;
        PeriodToggleMargin = Dp.m9732constructorimpl(12);
        TimePickerMaxHeight = Dp.m9732constructorimpl(384);
        TimePickerMidHeight = Dp.m9732constructorimpl(330);
        ClockDialMidContainerSize = Dp.m9732constructorimpl(238);
        ClockDialMinContainerSize = Dp.m9732constructorimpl(ComposerKt.invocationKey);
    }
}
