package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.math.MathKt;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a7\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00190\u001e¢\u0006\u0002\b\u001fH\u0003ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u0010(\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u0010+\u001a-\u0010,\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*H\u0003¢\u0006\u0002\u0010.\u001a\u0015\u0010/\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u00100\u001a\u001d\u00101\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u00102\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u00103\u001a1\u00104\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u00105\u001a=\u00106\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0003¢\u0006\u0002\u0010<\u001a)\u0010=\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010>\u001a%\u0010?\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010@\u001a8\u0010A\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010B\u001a\u00020CH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001ab\u0010F\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020G2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00190I2\u0006\u0010#\u001a\u00020$2\u0006\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a:\u0010R\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\u0006\u0010J\u001a\u00020K2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001aQ\u0010U\u001a\u00020\u00192\u0006\u0010V\u001a\u00020*2\u0006\u0010W\u001a\u00020:2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010%\u001a\u00020&2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00190I¢\u0006\u0002\b\u001f¢\u0006\u0002\bZH\u0003¢\u0006\u0002\u0010[\u001a\u001d\u0010\\\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u0010]\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u00103\u001a1\u0010^\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u00105\u001a\u0018\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tH\u0002\u001a(\u0010b\u001a\u00020\t2\u0006\u0010c\u001a\u00020\t2\u0006\u0010d\u001a\u00020\t2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u0007H\u0002\u001a*\u0010g\u001a\u00020h2\u0006\u0010J\u001a\u00020K2\u0006\u0010i\u001a\u00020*2\u0006\u0010j\u001a\u00020\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010l\u001a+\u0010m\u001a\u00020$2\b\b\u0002\u0010n\u001a\u00020\u00072\b\b\u0002\u0010o\u001a\u00020\u00072\b\b\u0002\u0010i\u001a\u00020*H\u0007¢\u0006\u0002\u0010p\u001a]\u0010q\u001a\u00020\u00192\u0006\u0010J\u001a\u00020K2\u0006\u0010#\u001a\u00020$2\u0006\u0010-\u001a\u00020G2\u0006\u0010r\u001a\u00020G2\u0006\u0010s\u001a\u00020\u00072!\u0010t\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00190IH\u0002ø\u0001\u0000¢\u0006\u0004\bw\u0010x\u001a$\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0z2\u0006\u0010{\u001a\u00020\t2\u0006\u0010|\u001a\u00020\tH\u0002\u001a\u001c\u0010}\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002\u001a\u0014\u0010~\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010~\u001a\u00020*H\u0003\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u007f²\u0006\u000b\u0010\u0080\u0001\u001a\u00020*X\u008a\u0084\u0002²\u0006\u000b\u0010\u0081\u0001\u001a\u00020GX\u008a\u008e\u0002²\u0006\u000b\u0010\u0082\u0001\u001a\u00020GX\u008a\u008e\u0002²\u0006\f\u0010\u0083\u0001\u001a\u00030\u0084\u0001X\u008a\u008e\u0002"}, d2 = {"ClockDisplayBottomMargin", "Landroidx/compose/ui/unit/Dp;", "F", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "ExtraHours", "", "", "FullCircle", "", "Hours", "InnerCircleRadius", "MaxDistance", "MinimumInteractiveSize", "Minutes", "OuterCircleSizeRadius", "PeriodToggleMargin", "QuarterCircle", "", "RadiansPerHour", "RadiansPerMinute", "SeparatorZIndex", "SupportLabelTop", "TimeInputBottomPadding", "CircularLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "radius", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "CircularLayout-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ClockDisplayNumbers", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/compose/material3/TimePickerState;", "colors", "Landroidx/compose/material3/TimePickerColors;", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ClockFace", "autoSwitchToMinute", "", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "ClockText", SDKConstants.PARAM_VALUE, "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "HorizontalTimePicker", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "PeriodToggleImpl", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "startShape", "Landroidx/compose/ui/graphics/Shape;", "endShape", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "TimePicker", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePickerTextField", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "selection", "Landroidx/compose/material3/Selection;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "TimePickerTextField-lxUZ_iY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeSelector", "TimeSelector-uXwN82Y", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ToggleItem", "checked", "shape", "onClick", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(ZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TimePickerColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "VerticalPeriodToggle", "VerticalTimePicker", "atan", "y", "x", "dist", "x1", "y1", "x2", "y2", "numberContentDescription", "", "is24Hour", "number", "numberContentDescription-YKJpE6Y", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "rememberTimePickerState", "initialHour", "initialMinute", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "timeInputOnChange", "prevValue", "max", "onNewValue", "Lkotlin/ParameterName;", "name", "timeInputOnChange-gIWD5Rc", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILkotlin/jvm/functions/Function1;)V", "valuesForAnimation", "Lkotlin/Pair;", "current", "new", "drawSelector", "visible", "material3_release", "touchExplorationServicesEnabled", "hourValue", "minuteValue", "center", "Landroidx/compose/ui/geometry/Offset;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt {
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;
    private static final List<Integer> ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final List<Integer> Hours;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimeInputBottomPadding;
    private static final float OuterCircleSizeRadius = Dp.m5734constructorimpl(101);
    private static final float InnerCircleRadius = Dp.m5734constructorimpl(69);
    private static final float ClockDisplayBottomMargin = Dp.m5734constructorimpl(36);
    private static final float SupportLabelTop = Dp.m5734constructorimpl(7);
    private static final float MaxDistance = Dp.m5734constructorimpl(74);
    private static final float MinimumInteractiveSize = Dp.m5734constructorimpl(48);
    private static final List<Integer> Minutes = CollectionsKt.listOf((Object[]) new Integer[]{0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55});

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        if ((r14 & 8) != 0) goto L67;
     */
    /* renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2152TimePickermT9BvqQ(final TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-619286452);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimePicker)P(3,2!,1:c#material3.TimePickerLayoutType)205@10952L8,206@11020L12,208@11081L23:TimePicker.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(timePickerColors)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(i)) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
            } else {
                if (i5 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    timePickerColors = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i = TimePickerDefaults.INSTANCE.m2150layoutTypesDNSZnc(startRestartGroup, 6);
                    i4 &= -7169;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-619286452, i4, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:207)");
                }
                State<Boolean> state = TouchExplorationStateProvider_androidKt.touchExplorationState(startRestartGroup, 0);
                if (TimePickerLayoutType.m2166equalsimpl0(i, TimePickerLayoutType.INSTANCE.m2171getVerticalQJTpgSE())) {
                    startRestartGroup.startReplaceableGroup(1318082425);
                    ComposerKt.sourceInformation(startRestartGroup, "211@11169L184");
                    VerticalTimePicker(timePickerState, modifier, timePickerColors, !TimePicker_mT9BvqQ$lambda$0(state), startRestartGroup, i4 & 1022, 0);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(1318082631);
                    ComposerKt.sourceInformation(startRestartGroup, "218@11375L186");
                    HorizontalTimePicker(timePickerState, modifier, timePickerColors, !TimePicker_mT9BvqQ$lambda$0(state), startRestartGroup, i4 & 1022, 0);
                    startRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final TimePickerColors timePickerColors2 = timePickerColors;
        final int i6 = i;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePicker$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    TimePickerKt.m2152TimePickermT9BvqQ(TimePickerState.this, modifier2, timePickerColors2, i6, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if ((r12 & 4) != 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeInput(final TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-760850373);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeInput)P(2,1)247@12451L8,249@12469L38:TimePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i;
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
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    timePickerColors = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                    i3 &= -897;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-760850373, i3, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:248)");
                }
                TimeInputImpl(modifier, timePickerColors, timePickerState, startRestartGroup, ((i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | ((i3 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final TimePickerColors timePickerColors2 = timePickerColors;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    TimePickerKt.TimeInput(TimePickerState.this, modifier2, timePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final TimePickerState rememberTimePickerState(int i, int i2, boolean z, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1237715277);
        ComposerKt.sourceInformation(composer, "C(rememberTimePickerState)555@27815L14,558@27908L133,556@27852L189:TimePicker.kt#uh7d8r");
        final int i5 = (i4 & 1) != 0 ? 0 : i;
        final int i6 = (i4 & 2) != 0 ? 0 : i2;
        final boolean is24HourFormat = (i4 & 4) != 0 ? TimeFormat_androidKt.is24HourFormat(composer, 0) : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i3, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:556)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerState, ?> Saver = TimePickerState.INSTANCE.Saver();
        composer.startReplaceableGroup(1737740702);
        ComposerKt.sourceInformation(composer, "CC(remember):TimePicker.kt#9igjgp");
        boolean z2 = ((((i3 & 14) ^ 6) > 4 && composer.changed(i5)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i6)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && composer.changed(is24HourFormat)) || (i3 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<TimePickerState>() { // from class: androidx.compose.material3.TimePickerKt$rememberTimePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TimePickerState invoke() {
                    return new TimePickerState(i5, i6, is24HourFormat);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TimePickerState timePickerState = (TimePickerState) RememberSaveableKt.m3024rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return timePickerState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if ((r15 & 4) != 0) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalTimePicker(final TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(310683247);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalTimePicker)P(3,2,1)781@35339L8,784@35389L379:TimePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i;
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
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    timePickerColors = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                    i3 &= -897;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(310683247, i3, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:783)");
                }
                Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalTimePicker$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                    }
                }, 1, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 37442688, "C788@35539L35,789@35583L60,790@35652L44,791@35705L57:TimePicker.kt#uh7d8r");
                int i5 = i3 & 14;
                int i6 = i3 >> 3;
                int i7 = i5 | (i6 & 112);
                VerticalClockDisplay(timePickerState, timePickerColors, startRestartGroup, i7);
                SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, ClockDisplayBottomMargin), startRestartGroup, 6);
                ClockFace(timePickerState, timePickerColors, z, startRestartGroup, i7 | (i6 & 896));
                SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, ClockFaceBottomMargin), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final TimePickerColors timePickerColors2 = timePickerColors;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalTimePicker$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    TimePickerKt.VerticalTimePicker(TimePickerState.this, modifier2, timePickerColors2, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalTimePicker(final TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m2937constructorimpl;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(5079681);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalTimePicker)P(3,2,1)799@35932L8,802@35982L309:TimePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    if (startRestartGroup.changed(timePickerColors2)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        timePickerColors2 = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = modifier2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(5079681, i3, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:801)");
                }
                Modifier m566paddingqDBjuR0$default = PaddingKt.m566paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, ClockFaceBottomMargin, 7, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m566paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -321629410, "C806@36127L37,807@36173L59,808@36241L44:TimePicker.kt#uh7d8r");
                int i6 = i3 & 14;
                int i7 = i3 >> 3;
                int i8 = i6 | (i7 & 112);
                HorizontalClockDisplay(timePickerState, timePickerColors2, startRestartGroup, i8);
                SpacerKt.Spacer(SizeKt.m616width3ABfNKs(Modifier.INSTANCE, ClockDisplayBottomMargin), startRestartGroup, 6);
                ClockFace(timePickerState, timePickerColors2, z, startRestartGroup, i8 | (i7 & 896));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            final TimePickerColors timePickerColors3 = timePickerColors2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalTimePicker$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        TimePickerKt.HorizontalTimePicker(TimePickerState.this, modifier3, timePickerColors3, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m566paddingqDBjuR0$default2 = PaddingKt.m566paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, ClockFaceBottomMargin, 7, null);
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m566paddingqDBjuR0$default2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
        Updater.m2944setimpl(m2937constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m2937constructorimpl.getInserting()) {
        }
        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -321629410, "C806@36127L37,807@36173L59,808@36241L44:TimePicker.kt#uh7d8r");
        int i62 = i3 & 14;
        int i72 = i3 >> 3;
        int i82 = i62 | (i72 & 112);
        HorizontalClockDisplay(timePickerState, timePickerColors2, startRestartGroup, i82);
        SpacerKt.Spacer(SizeKt.m616width3ABfNKs(Modifier.INSTANCE, ClockDisplayBottomMargin), startRestartGroup, 6);
        ClockFace(timePickerState, timePickerColors2, z, startRestartGroup, i82 | (i72 & 896));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        final TimePickerColors timePickerColors32 = timePickerColors2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimeInputImpl(final Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, final int i) {
        int i2;
        Composer composer2;
        TextStyle m5259copyp1EtxEg;
        Composer startRestartGroup = composer.startRestartGroup(-475657989);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeInputImpl)P(1)818@36493L104,818@36441L156,821@36673L96,821@36621L148,825@36775L3592:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerState) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i3, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:817)");
            }
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.INSTANCE.getSaver();
            startRestartGroup.startReplaceableGroup(565122579);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(ActualJvm_jvmKt.toLocalString$default(TimePickerState.this.getHourForDisplay$material3_release(), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, startRestartGroup, 0, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = TextFieldValue.INSTANCE.getSaver();
            startRestartGroup.startReplaceableGroup(565122759);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            boolean z2 = i4 == 256;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(ActualJvm_jvmKt.toLocalString$default(TimePickerState.this.getMinute(), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState rememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) rememberedValue2, startRestartGroup, 0, 4);
            composer2 = startRestartGroup;
            Modifier m566paddingqDBjuR0$default = PaddingKt.m566paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            Alignment.Vertical top = Alignment.INSTANCE.getTop();
            composer2.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m566paddingqDBjuR0$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
            Updater.m2944setimpl(m2937constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1230438189, "C829@36938L10,835@37149L2787:TimePicker.kt#uh7d8r");
            m5259copyp1EtxEg = r19.m5259copyp1EtxEg((r48 & 1) != 0 ? r19.spanStyle.m5192getColor0d7_KjU() : timePickerColors.m2148timeSelectorContentColorvNxB06k$material3_release(true), (r48 & 2) != 0 ? r19.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r19.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r19.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r19.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r19.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r19.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r19.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r19.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r19.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r19.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r19.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r19.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r19.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r19.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r19.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m5626getCentere0LSkKk(), (r48 & 65536) != 0 ? r19.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r19.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r19.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r19.platformStyle : null, (r48 & 1048576) != 0 ? r19.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r19.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r19.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), TimeInputTokens.INSTANCE.getTimeFieldLabelTextFont()).paragraphStyle.getTextMotion() : null);
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(m5259copyp1EtxEg), ComposableLambdaKt.composableLambda(composer2, 1306700887, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TextFieldValue TimeInputImpl$lambda$5;
                    float f;
                    TextFieldValue TimeInputImpl$lambda$8;
                    ComposerKt.sourceInformation(composer3, "C839@37313L411,851@37793L353,866@38455L38,837@37224L1318,869@38555L85,872@38749L376,885@39197L331,900@39839L38,870@38653L1273:TimePicker.kt#uh7d8r");
                    if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1306700887, i5, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:837)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composer3.startReplaceableGroup(-1645133303);
                        ComposerKt.sourceInformation(composer3, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changed = composer3.changed(rememberSaveable) | composer3.changed(timePickerState);
                        final TimePickerState timePickerState2 = timePickerState;
                        final MutableState<TextFieldValue> mutableState = rememberSaveable;
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                    return m2161invokeZmokQxo(keyEvent.m4405unboximpl());
                                }

                                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                public final Boolean m2161invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                    TextFieldValue TimeInputImpl$lambda$52;
                                    TextFieldValue TimeInputImpl$lambda$53;
                                    int m4418getUtf16CodePointZmokQxo = KeyEvent_androidKt.m4418getUtf16CodePointZmokQxo(keyEvent);
                                    if (48 <= m4418getUtf16CodePointZmokQxo && m4418getUtf16CodePointZmokQxo < 58) {
                                        TimeInputImpl$lambda$52 = TimePickerKt.TimeInputImpl$lambda$5(mutableState);
                                        if (TextRange.m5233getStartimpl(TimeInputImpl$lambda$52.getSelection()) == 2) {
                                            TimeInputImpl$lambda$53 = TimePickerKt.TimeInputImpl$lambda$5(mutableState);
                                            if (TimeInputImpl$lambda$53.getText().length() == 2) {
                                                TimePickerState.this.m2176setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1850getMinuteJiIwxys());
                                            }
                                        }
                                    }
                                    return false;
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion, (Function1) rememberedValue3);
                        TimeInputImpl$lambda$5 = TimePickerKt.TimeInputImpl$lambda$5(rememberSaveable);
                        composer3.startReplaceableGroup(-1645132823);
                        ComposerKt.sourceInformation(composer3, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changed2 = composer3.changed(timePickerState) | composer3.changed(rememberSaveable);
                        final TimePickerState timePickerState3 = timePickerState;
                        final MutableState<TextFieldValue> mutableState2 = rememberSaveable;
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                    invoke2(textFieldValue);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextFieldValue textFieldValue) {
                                    TextFieldValue TimeInputImpl$lambda$52;
                                    int m1849getHourJiIwxys = Selection.INSTANCE.m1849getHourJiIwxys();
                                    TimePickerState timePickerState4 = TimePickerState.this;
                                    TimeInputImpl$lambda$52 = TimePickerKt.TimeInputImpl$lambda$5(mutableState2);
                                    int i6 = TimePickerState.this.getIs24hour() ? 23 : 12;
                                    final MutableState<TextFieldValue> mutableState3 = mutableState2;
                                    TimePickerKt.m2160timeInputOnChangegIWD5Rc(m1849getHourJiIwxys, timePickerState4, textFieldValue, TimeInputImpl$lambda$52, i6, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                            invoke2(textFieldValue2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextFieldValue textFieldValue2) {
                                            mutableState3.setValue(textFieldValue2);
                                        }
                                    });
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        Function1 function1 = (Function1) rememberedValue4;
                        composer3.endReplaceableGroup();
                        TimePickerState timePickerState4 = timePickerState;
                        int m1849getHourJiIwxys = Selection.INSTANCE.m1849getHourJiIwxys();
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m5460getNumberPjHm6EE(), ImeAction.INSTANCE.m5412getNexteUduSuo(), null, 19, null);
                        composer3.startReplaceableGroup(-1645132161);
                        ComposerKt.sourceInformation(composer3, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changed3 = composer3.changed(timePickerState);
                        final TimePickerState timePickerState5 = timePickerState;
                        Object rememberedValue5 = composer3.rememberedValue();
                        if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (Function1) new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$3$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                    invoke2(keyboardActionScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(KeyboardActionScope keyboardActionScope) {
                                    TimePickerState.this.m2176setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1850getMinuteJiIwxys());
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        TimePickerKt.m2153TimePickerTextFieldlxUZ_iY(onKeyEvent, TimeInputImpl$lambda$5, function1, timePickerState4, m1849getHourJiIwxys, keyboardOptions, new KeyboardActions(null, null, (Function1) rememberedValue5, null, null, null, 59, null), timePickerColors, composer3, 24576, 0);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        f = TimePickerKt.DisplaySeparatorWidth;
                        TimePickerKt.DisplaySeparator(SizeKt.m613sizeVpY3zN4(companion2, f, TimeInputTokens.INSTANCE.m2828getPeriodSelectorContainerHeightD9Ej5fM()), composer3, 6);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        composer3.startReplaceableGroup(-1645131867);
                        ComposerKt.sourceInformation(composer3, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changed4 = composer3.changed(rememberSaveable2) | composer3.changed(timePickerState);
                        final TimePickerState timePickerState6 = timePickerState;
                        final MutableState<TextFieldValue> mutableState3 = rememberSaveable2;
                        Object rememberedValue6 = composer3.rememberedValue();
                        if (changed4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                    return m2162invokeZmokQxo(keyEvent.m4405unboximpl());
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Boolean m2162invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                    boolean z3;
                                    TextFieldValue TimeInputImpl$lambda$82;
                                    if (KeyEvent_androidKt.m4418getUtf16CodePointZmokQxo(keyEvent) == 0) {
                                        TimeInputImpl$lambda$82 = TimePickerKt.TimeInputImpl$lambda$8(mutableState3);
                                        if (TextRange.m5233getStartimpl(TimeInputImpl$lambda$82.getSelection()) == 0) {
                                            z3 = true;
                                            if (z3) {
                                                TimePickerState.this.m2176setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1849getHourJiIwxys());
                                            }
                                            return Boolean.valueOf(z3);
                                        }
                                    }
                                    z3 = false;
                                    if (z3) {
                                    }
                                    return Boolean.valueOf(z3);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue6);
                        }
                        composer3.endReplaceableGroup();
                        Modifier onPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion3, (Function1) rememberedValue6);
                        TimeInputImpl$lambda$8 = TimePickerKt.TimeInputImpl$lambda$8(rememberSaveable2);
                        composer3.startReplaceableGroup(-1645131419);
                        ComposerKt.sourceInformation(composer3, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changed5 = composer3.changed(timePickerState) | composer3.changed(rememberSaveable2);
                        final TimePickerState timePickerState7 = timePickerState;
                        final MutableState<TextFieldValue> mutableState4 = rememberSaveable2;
                        Object rememberedValue7 = composer3.rememberedValue();
                        if (changed5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                    invoke2(textFieldValue);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextFieldValue textFieldValue) {
                                    TextFieldValue TimeInputImpl$lambda$82;
                                    int m1850getMinuteJiIwxys = Selection.INSTANCE.m1850getMinuteJiIwxys();
                                    TimePickerState timePickerState8 = TimePickerState.this;
                                    TimeInputImpl$lambda$82 = TimePickerKt.TimeInputImpl$lambda$8(mutableState4);
                                    final MutableState<TextFieldValue> mutableState5 = mutableState4;
                                    TimePickerKt.m2160timeInputOnChangegIWD5Rc(m1850getMinuteJiIwxys, timePickerState8, textFieldValue, TimeInputImpl$lambda$82, 59, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                            invoke2(textFieldValue2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextFieldValue textFieldValue2) {
                                            mutableState5.setValue(textFieldValue2);
                                        }
                                    });
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue7);
                        }
                        Function1 function12 = (Function1) rememberedValue7;
                        composer3.endReplaceableGroup();
                        TimePickerState timePickerState8 = timePickerState;
                        int m1850getMinuteJiIwxys = Selection.INSTANCE.m1850getMinuteJiIwxys();
                        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m5460getNumberPjHm6EE(), ImeAction.INSTANCE.m5410getDoneeUduSuo(), null, 19, null);
                        composer3.startReplaceableGroup(-1645130777);
                        ComposerKt.sourceInformation(composer3, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changed6 = composer3.changed(timePickerState);
                        final TimePickerState timePickerState9 = timePickerState;
                        Object rememberedValue8 = composer3.rememberedValue();
                        if (changed6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = (Function1) new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$6$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                    invoke2(keyboardActionScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(KeyboardActionScope keyboardActionScope) {
                                    TimePickerState.this.m2176setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1850getMinuteJiIwxys());
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue8);
                        }
                        composer3.endReplaceableGroup();
                        TimePickerKt.m2153TimePickerTextFieldlxUZ_iY(onPreviewKeyEvent, TimeInputImpl$lambda$8, function12, timePickerState8, m1850getMinuteJiIwxys, keyboardOptions2, new KeyboardActions(null, null, (Function1) rememberedValue8, null, null, null, 59, null), timePickerColors, composer3, 24576, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ProvidedValue.$stable | 48);
            composer2.startReplaceableGroup(565126032);
            ComposerKt.sourceInformation(composer2, "906@39981L370");
            if (!timePickerState.getIs24hour()) {
                Modifier m566paddingqDBjuR0$default2 = PaddingKt.m566paddingqDBjuR0$default(Modifier.INSTANCE, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m566paddingqDBjuR0$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer2);
                Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1645130567, "C907@40049L288:TimePicker.kt#uh7d8r");
                VerticalPeriodToggle(SizeKt.m613sizeVpY3zN4(Modifier.INSTANCE, TimeInputTokens.INSTANCE.m2829getPeriodSelectorContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m2828getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composer2, ((i3 >> 3) & 112) | 6 | ((i3 << 3) & 896));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TimePickerKt.TimeInputImpl(Modifier.this, timePickerColors, timePickerState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$5(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$8(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(755539561);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalClockDisplay)P(1)922@40474L554:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i2, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:921)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -385983589, "C923@40533L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            startRestartGroup.startReplaceableGroup(-552392411);
            ComposerKt.sourceInformation(startRestartGroup, "925@40611L401");
            if (!timePickerState.getIs24hour()) {
                Modifier m566paddingqDBjuR0$default = PaddingKt.m566paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m566paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2937constructorimpl2 = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 34973015, "C926@40688L310:TimePicker.kt#uh7d8r");
                int i3 = i2 << 3;
                HorizontalPeriodToggle(SizeKt.m613sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m2840getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m2839getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i3 & 896) | (i3 & 112) | 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalClockDisplay$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    TimePickerKt.HorizontalClockDisplay(TimePickerState.this, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2054675515);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalClockDisplay)P(1)941@41133L549:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i2, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:940)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1085484635, "C942@41191L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            startRestartGroup.startReplaceableGroup(952914149);
            ComposerKt.sourceInformation(startRestartGroup, "944@41269L397");
            if (!timePickerState.getIs24hour()) {
                Modifier m566paddingqDBjuR0$default = PaddingKt.m566paddingqDBjuR0$default(Modifier.INSTANCE, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m566paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2937constructorimpl2 = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1130519783, "C945@41348L304:TimePicker.kt#uh7d8r");
                int i3 = i2 << 3;
                VerticalPeriodToggle(SizeKt.m613sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m2843getPeriodSelectorVerticalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m2842getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i3 & 896) | (i3 & 112) | 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalClockDisplay$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    TimePickerKt.VerticalClockDisplay(TimePickerState.this, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockDisplayNumbers(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-934561141);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockDisplayNumbers)P(1)964@41868L10,963@41796L1047:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i2, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:962)");
            }
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont())), ComposableLambdaKt.composableLambda(startRestartGroup, -477913269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    float f;
                    ComposerKt.sourceInformation(composer2, "C966@41932L905:TimePicker.kt#uh7d8r");
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-477913269, i3, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:966)");
                        }
                        TimePickerState timePickerState2 = TimePickerState.this;
                        TimePickerColors timePickerColors2 = timePickerColors;
                        composer2.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                        Updater.m2944setimpl(m2937constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 94470637, "C967@41950L338,977@42301L181,983@42495L332:TimePicker.kt#uh7d8r");
                        TimePickerKt.m2154TimeSelectoruXwN82Y(SizeKt.m613sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m2846getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m2845getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getHourForDisplay$material3_release(), timePickerState2, Selection.INSTANCE.m1849getHourJiIwxys(), timePickerColors2, composer2, 3078);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        f = TimePickerKt.DisplaySeparatorWidth;
                        TimePickerKt.DisplaySeparator(SizeKt.m613sizeVpY3zN4(companion2, f, TimePickerTokens.INSTANCE.m2842getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                        TimePickerKt.m2154TimeSelectoruXwN82Y(SizeKt.m613sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m2846getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m2845getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, Selection.INSTANCE.m1850getMinuteJiIwxys(), timePickerColors2, composer2, 3078);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    TimePickerKt.ClockDisplayNumbers(TimePickerState.this, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalPeriodToggle(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1261215927);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalPeriodToggle)P(1,2)1003@43005L958,1030@44010L5,1032@44041L206:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i2, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1002)");
            }
            startRestartGroup.startReplaceableGroup(759555873);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Measurable measurable = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable mo4678measureBRTryo0 = measurable.mo4678measureBRTryo0(Constraints.m5681copyZbe2FdA$default(j, 0, measureScope.mo307roundToPx0680j_4(TimePickerTokens.INSTANCE.m2841getPeriodSelectorOutlineWidthD9Ej5fM()), 0, 0, 12, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    Measurable measurable2 = list.get(i4);
                                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                                int size3 = arrayList2.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    arrayList3.add(((Measurable) arrayList2.get(i5)).mo4678measureBRTryo0(Constraints.m5681copyZbe2FdA$default(j, 0, Constraints.m5690getMaxWidthimpl(j) / 2, 0, 0, 12, null)));
                                }
                                final ArrayList arrayList4 = arrayList3;
                                return MeasureScope.layout$default(measureScope, Constraints.m5690getMaxWidthimpl(j), Constraints.m5689getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(1), arrayList4.get(0).getWidth(), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, mo4678measureBRTryo0, arrayList4.get(0).getWidth() - (mo4678measureBRTryo0.getWidth() / 2), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    TimePickerKt.HorizontalPeriodToggle(Modifier.this, timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalPeriodToggle(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1898918107);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalPeriodToggle)P(1,2)1048@44407L965,1075@45419L5,1077@45450L207:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i2, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1047)");
            }
            startRestartGroup.startReplaceableGroup(-2030104119);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Measurable measurable = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable mo4678measureBRTryo0 = measurable.mo4678measureBRTryo0(Constraints.m5681copyZbe2FdA$default(j, 0, 0, 0, measureScope.mo307roundToPx0680j_4(TimePickerTokens.INSTANCE.m2841getPeriodSelectorOutlineWidthD9Ej5fM()), 3, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    Measurable measurable2 = list.get(i4);
                                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                                int size3 = arrayList2.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    arrayList3.add(((Measurable) arrayList2.get(i5)).mo4678measureBRTryo0(Constraints.m5681copyZbe2FdA$default(j, 0, 0, 0, Constraints.m5689getMaxHeightimpl(j) / 2, 3, null)));
                                }
                                final ArrayList arrayList4 = arrayList3;
                                return MeasureScope.layout$default(measureScope, Constraints.m5690getMaxWidthimpl(j), Constraints.m5689getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(1), 0, arrayList4.get(0).getHeight(), 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, mo4678measureBRTryo0, 0, arrayList4.get(0).getHeight() - (mo4678measureBRTryo0.getHeight() / 2), 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    TimePickerKt.VerticalPeriodToggle(Modifier.this, timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PeriodToggleImpl(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, final MeasurePolicy measurePolicy, final Shape shape, final Shape shape2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1374241901);
        ComposerKt.sourceInformation(startRestartGroup, "C(PeriodToggleImpl)P(3,5!1,2,4)1101@46050L5,1102@46105L41,1105@46210L116,1103@46151L1158:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerState) ? 32 : 16;
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
            i2 |= startRestartGroup.changed(shape2) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i2, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1095)");
            }
            BorderStroke m237BorderStrokecXLIe8U = BorderStrokeKt.m237BorderStrokecXLIe8U(TimePickerTokens.INSTANCE.m2841getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.getPeriodSelectorBorderColor());
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            Strings.Companion companion = Strings.INSTANCE;
            final String m1967getStringNWtq28 = Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(R.string.m3c_time_picker_period_toggle_description), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-2008454294);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m1967getStringNWtq28);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m1967getStringNWtq28);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier border = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null)), m237BorderStrokecXLIe8U, cornerBasedShape);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(border);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1654477473, "C1116@46614L35,1113@46488L267,1119@46768L240,1130@47160L34,1126@47021L272:TimePicker.kt#uh7d8r");
            boolean z = !timePickerState.isAfternoonToggle$material3_release();
            startRestartGroup.startReplaceableGroup(1654477599);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TimePickerState.this.setAfternoonToggle$material3_release(false);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            int i4 = (i2 << 3) & 7168;
            ToggleItem(z, shape, (Function0) rememberedValue2, timePickerColors, ComposableSingletons$TimePickerKt.INSTANCE.m1443getLambda1$material3_release(), startRestartGroup, ((i2 >> 9) & 112) | 24576 | i4);
            SpacerKt.Spacer(BackgroundKt.m210backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.INSTANCE, "Spacer"), SeparatorZIndex), 0.0f, 1, null), timePickerColors.getPeriodSelectorBorderColor(), null, 2, null), startRestartGroup, 0);
            boolean isAfternoonToggle$material3_release = timePickerState.isAfternoonToggle$material3_release();
            startRestartGroup.startReplaceableGroup(1654478145);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            boolean z3 = i3 == 32;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TimePickerState.this.setAfternoonToggle$material3_release(true);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            ToggleItem(isAfternoonToggle$material3_release, shape2, (Function0) rememberedValue3, timePickerColors, ComposableSingletons$TimePickerKt.INSTANCE.m1444getLambda2$material3_release(), startRestartGroup, ((i2 >> 12) & 112) | 24576 | i4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    TimePickerKt.PeriodToggleImpl(Modifier.this, timePickerState, timePickerColors, measurePolicy, shape, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ToggleItem(final boolean z, final Shape shape, final Function0<Unit> function0, final TimePickerColors timePickerColors, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1937408098);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToggleItem)P(!1,4,3)1152@47770L22,1157@47949L112,1148@47635L432:TimePicker.kt#uh7d8r");
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
        if ((i2 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i2, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1144)");
            }
            long m2146periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m2146periodSelectorContentColorvNxB06k$material3_release(z);
            long m2145periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m2145periodSelectorContainerColorvNxB06k$material3_release(z);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, z ? 0.0f : 1.0f), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(526522672);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            ButtonKt.TextButton(function0, SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (Function1) rememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m1278textButtonColorsro_MJ88(m2145periodSelectorContainerColorvNxB06k$material3_release, m2146periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, startRestartGroup, 24576, 12), null, null, PaddingKt.m555PaddingValues0680j_4(Dp.m5734constructorimpl(0)), null, function3, startRestartGroup, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 7168) | ((i2 << 15) & 1879048192), 356);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    TimePickerKt.ToggleItem(z, shape, function0, timePickerColors, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisplaySeparator(final Modifier modifier, Composer composer, final int i) {
        int i2;
        TextStyle m5259copyp1EtxEg;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2100674302);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisplaySeparator)1166@48165L7,1174@48384L241:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i2, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1165)");
            }
            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localTextStyle);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            m5259copyp1EtxEg = r16.m5259copyp1EtxEg((r48 & 1) != 0 ? r16.spanStyle.m5192getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r16.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r16.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r16.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r16.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r16.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r16.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r16.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r16.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r16.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r16.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r16.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r16.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r16.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r16.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r16.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m5626getCentere0LSkKk(), (r48 & 65536) != 0 ? r16.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r16.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r16.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r16.platformStyle : null, (r48 & 1048576) != 0 ? r16.paragraphStyle.getLineHeightStyle() : new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m5603getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m5615getBothEVpEnUU(), null), (r48 & 2097152) != 0 ? r16.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r16.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? ((TextStyle) consume).paragraphStyle.getTextMotion() : null);
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$DisplaySeparator$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            });
            Alignment center = Alignment.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(clearAndSetSemantics);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -617588430, "C1180@48577L5,1178@48503L116:TimePicker.kt#uh7d8r");
            composer2 = startRestartGroup;
            TextKt.m2125Text4IGK_g(":", (Modifier) null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), startRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m5259copyp1EtxEg, composer2, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$DisplaySeparator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    TimePickerKt.DisplaySeparator(Modifier.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TimeSelector-uXwN82Y, reason: not valid java name */
    public static final void m2154TimeSelectoruXwN82Y(final Modifier modifier, final int i, final TimePickerState timePickerState, final int i2, final TimePickerColors timePickerColors, Composer composer, final int i3) {
        int i4;
        int m1898constructorimpl;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(21099367);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeSelector)P(1,4,3,2:c#material3.Selection)1196@48920L176,1206@49248L24,1209@49362L124,1222@49791L5,1213@49506L211,1207@49277L1056:TimePicker.kt#uh7d8r");
        if ((i3 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= startRestartGroup.changed(timePickerState) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= startRestartGroup.changed(timePickerColors) ? 16384 : 8192;
        }
        if ((i4 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21099367, i4, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1194)");
            }
            boolean m1845equalsimpl0 = Selection.m1845equalsimpl0(timePickerState.m2173getSelectionJiIwxys$material3_release(), i2);
            if (Selection.m1845equalsimpl0(i2, Selection.INSTANCE.m1849getHourJiIwxys())) {
                Strings.Companion companion = Strings.INSTANCE;
                m1898constructorimpl = Strings.m1898constructorimpl(R.string.m3c_time_picker_hour_selection);
            } else {
                Strings.Companion companion2 = Strings.INSTANCE;
                m1898constructorimpl = Strings.m1898constructorimpl(R.string.m3c_time_picker_minute_selection);
            }
            final String m1967getStringNWtq28 = Strings_androidKt.m1967getStringNWtq28(m1898constructorimpl, startRestartGroup, 0);
            long m2147timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m2147timeSelectorContainerColorvNxB06k$material3_release(m1845equalsimpl0);
            final long m2148timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m2148timeSelectorContentColorvNxB06k$material3_release(m1845equalsimpl0);
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-633372797);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m1967getStringNWtq28);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5065getRadioButtono7Vup1c());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m1967getStringNWtq28);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue2);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-633372653);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            boolean changedInstance = ((i4 & 7168) == 2048) | ((i4 & 896) == 256) | startRestartGroup.changedInstance(coroutineScope);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (Selection.m1845equalsimpl0(i2, timePickerState.m2173getSelectionJiIwxys$material3_release())) {
                            return;
                        }
                        timePickerState.m2176setSelectioniHAOin8$material3_release(i2);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(timePickerState, null), 3, null);
                    }

                    /* compiled from: TimePicker.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material3.TimePickerKt$TimeSelector$2$1$1", f = "TimePicker.kt", i = {}, l = {1218}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.TimePickerKt$TimeSelector$2$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ TimePickerState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(TimePickerState timePickerState, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$state = timePickerState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$state, continuation);
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
                                this.label = 1;
                                if (this.$state.animateToCurrent$material3_release(this) == coroutine_suspended) {
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
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            SurfaceKt.m1978Surfaced85dljk(m1845equalsimpl0, (Function0<Unit>) rememberedValue3, semantics, false, value, m2147timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -1338709103, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    ComposerKt.sourceInformation(composer3, "C1226@49888L152,1232@50050L277:TimePicker.kt#uh7d8r");
                    if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1338709103, i5, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1225)");
                        }
                        final String m2159numberContentDescriptionYKJpE6Y = TimePickerKt.m2159numberContentDescriptionYKJpE6Y(i2, timePickerState.getIs24hour(), i, composer3, 0);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        int i6 = i;
                        long j = m2148timeSelectorContentColorvNxB06k$material3_release;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m2937constructorimpl = Updater.m2937constructorimpl(composer3);
                        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 992582188, "C1234@50157L48,1233@50105L212:TimePicker.kt#uh7d8r");
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        composer3.startReplaceableGroup(992582240);
                        ComposerKt.sourceInformation(composer3, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changed2 = composer3.changed(m2159numberContentDescriptionYKJpE6Y);
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m2159numberContentDescriptionYKJpE6Y);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        TextKt.m2125Text4IGK_g(ActualJvm_jvmKt.toLocalString$default(i6, 2, 0, false, 6, null), SemanticsModifierKt.semantics$default(companion4, false, (Function1) rememberedValue4, 1, null), j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TimePickerKt.m2154TimeSelectoruXwN82Y(Modifier.this, i, timePickerState, i2, timePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    public static final void ClockFace(final TimePickerState timePickerState, final TimePickerColors timePickerColors, final boolean z, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1525091100);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockFace)P(2,1)1340@53355L2455:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525091100, i2, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1339)");
            }
            CrossfadeKt.Crossfade(timePickerState.getValues$material3_release(), SemanticsModifierKt.semantics$default(SizeKt.m611size3ABfNKs(BackgroundKt.m209backgroundbw27NRU(Modifier.INSTANCE, timePickerColors.getClockDialColor(), RoundedCornerShapeKt.getCircleShape()), TimePickerTokens.INSTANCE.m2834getClockDialContainerSizeD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
                }
            }, 1, null), AnimationSpecKt.tween$default(350, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1628166511, true, new Function3<List<? extends Integer>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list, Composer composer2, Integer num) {
                    invoke((List<Integer>) list, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final List<Integer> list, Composer composer2, int i3) {
                    Modifier drawSelector;
                    float f;
                    ComposerKt.sourceInformation(composer2, "C1348@53705L2099:TimePicker.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1628166511, i3, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1348)");
                    }
                    drawSelector = TimePickerKt.drawSelector(SizeKt.m611size3ABfNKs(Modifier.INSTANCE.then(new ClockDialModifier(TimePickerState.this, z)), TimePickerTokens.INSTANCE.m2834getClockDialContainerSizeD9Ej5fM()), TimePickerState.this, timePickerColors);
                    f = TimePickerKt.OuterCircleSizeRadius;
                    final TimePickerColors timePickerColors2 = timePickerColors;
                    final TimePickerState timePickerState2 = TimePickerState.this;
                    final boolean z2 = z;
                    TimePickerKt.m2151CircularLayoutuFdPcIQ(drawSelector, f, ComposableLambdaKt.composableLambda(composer2, -1385633737, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            ComposerKt.sourceInformation(composer3, "C1355@53981L1813:TimePicker.kt#uh7d8r");
                            if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1385633737, i4, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1355)");
                                }
                                ProvidedValue<Color> provides = ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(TimePickerColors.this.m2129clockDialContentColorvNxB06k$material3_release(false)));
                                final List<Integer> list2 = list;
                                final TimePickerState timePickerState3 = timePickerState2;
                                final boolean z3 = z2;
                                CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.composableLambda(composer3, -2018362505, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i5) {
                                        float f2;
                                        int intValue;
                                        ComposerKt.sourceInformation(composer4, "C1375@54838L924:TimePicker.kt#uh7d8r");
                                        if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2018362505, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                                            }
                                            composer4.startReplaceableGroup(-504293055);
                                            ComposerKt.sourceInformation(composer4, "*1365@54465L88,1364@54400L323");
                                            int size = list2.size();
                                            TimePickerState timePickerState4 = timePickerState3;
                                            List<Integer> list3 = list2;
                                            boolean z4 = z3;
                                            for (final int i6 = 0; i6 < size; i6++) {
                                                if (!timePickerState4.getIs24hour() || Selection.m1845equalsimpl0(timePickerState4.m2173getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1850getMinuteJiIwxys())) {
                                                    intValue = list3.get(i6).intValue();
                                                } else {
                                                    intValue = list3.get(i6).intValue() % 12;
                                                }
                                                int i7 = intValue;
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                composer4.startReplaceableGroup(-1916851139);
                                                ComposerKt.sourceInformation(composer4, "CC(remember):TimePicker.kt#9igjgp");
                                                boolean changed = composer4.changed(i6);
                                                Object rememberedValue = composer4.rememberedValue();
                                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i6);
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(rememberedValue);
                                                }
                                                composer4.endReplaceableGroup();
                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), timePickerState4, i7, z4, composer4, 0);
                                            }
                                            composer4.endReplaceableGroup();
                                            if (Selection.m1845equalsimpl0(timePickerState3.m2173getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1849getHourJiIwxys()) && timePickerState3.getIs24hour()) {
                                                Modifier m209backgroundbw27NRU = BackgroundKt.m209backgroundbw27NRU(SizeKt.m611size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m2834getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m3442getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                                                f2 = TimePickerKt.InnerCircleRadius;
                                                final TimePickerState timePickerState5 = timePickerState3;
                                                final boolean z5 = z3;
                                                TimePickerKt.m2151CircularLayoutuFdPcIQ(m209backgroundbw27NRU, f2, ComposableLambdaKt.composableLambda(composer4, -448649404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i8) {
                                                        List list4;
                                                        List list5;
                                                        ComposerKt.sourceInformation(composer5, "C*1385@55403L109,1384@55330L384:TimePicker.kt#uh7d8r");
                                                        if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                                            }
                                                            list4 = TimePickerKt.ExtraHours;
                                                            int size2 = list4.size();
                                                            TimePickerState timePickerState6 = TimePickerState.this;
                                                            boolean z6 = z5;
                                                            for (final int i9 = 0; i9 < size2; i9++) {
                                                                list5 = TimePickerKt.ExtraHours;
                                                                int intValue2 = ((Number) list5.get(i9)).intValue();
                                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                composer5.startReplaceableGroup(-1469917176);
                                                                ComposerKt.sourceInformation(composer5, "CC(remember):TimePicker.kt#9igjgp");
                                                                boolean changed2 = composer5.changed(i9);
                                                                Object rememberedValue2 = composer5.rememberedValue();
                                                                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                    rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                            invoke2(semanticsPropertyReceiver);
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                                        }
                                                                    };
                                                                    composer5.updateRememberedValue(rememberedValue2);
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue2, 1, null), timePickerState6, intValue2, z6, composer5, 0);
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }), composer4, 432, 0);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    TimePickerKt.ClockFace(TimePickerState.this, timePickerColors, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier drawSelector(Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$drawSelector$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                long Offset = OffsetKt.Offset(contentDrawScope.mo313toPx0680j_4(DpOffset.m5795getXD9Ej5fM(TimePickerState.this.m2174getSelectorPosRKDOV3M$material3_release())), contentDrawScope.mo313toPx0680j_4(DpOffset.m5797getYD9Ej5fM(TimePickerState.this.m2174getSelectorPosRKDOV3M$material3_release())));
                float f = 2;
                float f2 = contentDrawScope.mo313toPx0680j_4(TimePickerTokens.INSTANCE.m2836getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f;
                long selectorColor = timePickerColors.getSelectorColor();
                ContentDrawScope contentDrawScope2 = contentDrawScope;
                DrawScope.m3939drawCircleVaOC9Bg$default(contentDrawScope2, Color.INSTANCE.m3433getBlack0d7_KjU(), f2, Offset, 0.0f, null, null, BlendMode.INSTANCE.m3322getClear0nO6VwU(), 56, null);
                contentDrawScope.drawContent();
                DrawScope.m3939drawCircleVaOC9Bg$default(contentDrawScope2, selectorColor, f2, Offset, 0.0f, null, null, BlendMode.INSTANCE.m3350getXor0nO6VwU(), 56, null);
                DrawScope.m3944drawLineNGM6Ib0$default(contentDrawScope2, selectorColor, androidx.compose.ui.geometry.SizeKt.m3245getCenteruvyYCjk(contentDrawScope.mo3957getSizeNHjbRc()), Offset.m3170minusMKHz9U(Offset, OffsetKt.Offset(((float) Math.cos(TimePickerState.this.getCurrentAngle$material3_release().getValue().floatValue())) * f2, ((float) Math.sin(TimePickerState.this.getCurrentAngle$material3_release().getValue().floatValue())) * f2)), contentDrawScope.mo313toPx0680j_4(TimePickerTokens.INSTANCE.m2837getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, BlendMode.INSTANCE.m3349getSrcOver0nO6VwU(), 240, null);
                DrawScope.m3939drawCircleVaOC9Bg$default(contentDrawScope2, selectorColor, contentDrawScope.mo313toPx0680j_4(TimePickerTokens.INSTANCE.m2835getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f, androidx.compose.ui.geometry.SizeKt.m3245getCenteruvyYCjk(contentDrawScope.mo3957getSizeNHjbRc()), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                DrawScope.m3939drawCircleVaOC9Bg$default(contentDrawScope2, timePickerColors.m2129clockDialContentColorvNxB06k$material3_release(true), f2, Offset, 0.0f, null, null, BlendMode.INSTANCE.m3332getDstOver0nO6VwU(), 56, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText(final Modifier modifier, final TimePickerState timePickerState, final int i, final boolean z, Composer composer, final int i2) {
        int i3;
        boolean areEqual;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1420123631);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockText)P(1,2,3)1468@57704L10,*1469@57785L7,1470@57835L40,1471@57892L24,1473@57954L142,1491@58510L39,1493@58623L223,1486@58309L758:TimePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i4 = i3;
        if ((i4 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1420123631, i4, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1467)");
            }
            TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimePickerTokens.INSTANCE.getClockDialLabelTextFont());
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float mo313toPx0680j_4 = ((Density) consume).mo313toPx0680j_4(MaxDistance);
            startRestartGroup.startReplaceableGroup(-1652988653);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3155boximpl(Offset.INSTANCE.m3182getZeroF1C5BW0()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            final String m2159numberContentDescriptionYKJpE6Y = m2159numberContentDescriptionYKJpE6Y(timePickerState.m2173getSelectionJiIwxys$material3_release(), timePickerState.getIs24hour(), i, startRestartGroup, i4 & 896);
            String localString$default = ActualJvm_jvmKt.toLocalString$default(i, 0, 0, false, 7, null);
            if (Selection.m1845equalsimpl0(timePickerState.m2173getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1850getMinuteJiIwxys())) {
                areEqual = Intrinsics.areEqual(ActualJvm_jvmKt.toLocalString$default(timePickerState.getMinute(), 0, 0, false, 7, null), localString$default);
            } else {
                areEqual = Intrinsics.areEqual(ActualJvm_jvmKt.toLocalString$default(timePickerState.getHour(), 0, 0, false, 7, null), localString$default);
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), MinimumInteractiveSize);
            startRestartGroup.startReplaceableGroup(-1652987978);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates layoutCoordinates) {
                        TimePickerKt.ClockText$lambda$29(mutableState, LayoutCoordinatesKt.boundsInParent(layoutCoordinates).m3196getCenterF1C5BW0());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier focusable$default = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(m611size3ABfNKs, (Function1) rememberedValue3), false, null, 3, null);
            startRestartGroup.startReplaceableGroup(-1652987865);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(coroutineScope) | ((i4 & 112) == 32) | startRestartGroup.changed(mo313toPx0680j_4) | ((i4 & 7168) == 2048) | startRestartGroup.changed(areEqual);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                final boolean z2 = areEqual;
                rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final TimePickerState timePickerState2 = timePickerState;
                        final float f = mo313toPx0680j_4;
                        final boolean z3 = z;
                        final MutableState<Offset> mutableState2 = mutableState;
                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* compiled from: TimePicker.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", i = {}, l = {1496}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C00541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ boolean $autoSwitchToMinute;
                                final /* synthetic */ MutableState<Offset> $center$delegate;
                                final /* synthetic */ float $maxDist;
                                final /* synthetic */ TimePickerState $state;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00541(TimePickerState timePickerState, float f, boolean z, MutableState<Offset> mutableState, Continuation<? super C00541> continuation) {
                                    super(2, continuation);
                                    this.$state = timePickerState;
                                    this.$maxDist = f;
                                    this.$autoSwitchToMinute = z;
                                    this.$center$delegate = mutableState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C00541(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C00541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    long ClockText$lambda$28;
                                    long ClockText$lambda$282;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        TimePickerState timePickerState = this.$state;
                                        ClockText$lambda$28 = TimePickerKt.ClockText$lambda$28(this.$center$delegate);
                                        float m3166getXimpl = Offset.m3166getXimpl(ClockText$lambda$28);
                                        ClockText$lambda$282 = TimePickerKt.ClockText$lambda$28(this.$center$delegate);
                                        this.label = 1;
                                        if (timePickerState.onTap$material3_release(m3166getXimpl, Offset.m3167getYimpl(ClockText$lambda$282), this.$maxDist, this.$autoSwitchToMinute, this) == coroutine_suspended) {
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

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C00541(timePickerState2, f, z3, mutableState2, null), 3, null);
                                return true;
                            }
                        }, 1, null);
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(focusable$default, true, (Function1) rememberedValue4);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 859631416, "C1502@58922L76,1501@58863L198:TimePicker.kt#uh7d8r");
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceableGroup(859631475);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m2159numberContentDescriptionYKJpE6Y);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m2159numberContentDescriptionYKJpE6Y);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue5);
            composer2 = startRestartGroup;
            TextKt.m2125Text4IGK_g(localString$default, clearAndSetSemantics, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, fromToken, composer2, 0, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TimePickerKt.ClockText(Modifier.this, timePickerState, i, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$28(MutableState<Offset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$29(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m3155boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: timeInputOnChange-gIWD5Rc, reason: not valid java name */
    public static final void m2160timeInputOnChangegIWD5Rc(int i, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i2, Function1<? super TextFieldValue, Unit> function1) {
        int parseInt;
        if (Intrinsics.areEqual(textFieldValue.getText(), textFieldValue2.getText())) {
            function1.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            if (Selection.m1845equalsimpl0(i, Selection.INSTANCE.m1849getHourJiIwxys())) {
                timePickerState.setHour$material3_release(0);
            } else {
                timePickerState.setMinute$material3_release(0);
            }
            function1.invoke(TextFieldValue.m5467copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            if (textFieldValue.getText().length() == 3 && TextRange.m5233getStartimpl(textFieldValue.getSelection()) == 1) {
                parseInt = CharsKt.digitToInt(textFieldValue.getText().charAt(0));
            } else {
                parseInt = Integer.parseInt(textFieldValue.getText());
            }
            if (parseInt <= i2) {
                if (Selection.m1845equalsimpl0(i, Selection.INSTANCE.m1849getHourJiIwxys())) {
                    timePickerState.setHour$material3_release(parseInt);
                    if (parseInt > 1 && !timePickerState.getIs24hour()) {
                        timePickerState.m2176setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1850getMinuteJiIwxys());
                    }
                } else {
                    timePickerState.setMinute$material3_release(parseInt);
                }
                if (textFieldValue.getText().length() > 2) {
                    textFieldValue = TextFieldValue.m5467copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null);
                }
                function1.invoke(textFieldValue);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0677  */
    /* renamed from: TimePickerTextField-lxUZ_iY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2153TimePickerTextFieldlxUZ_iY(final Modifier modifier, final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, final TimePickerState timePickerState, final int i, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final TimePickerColors timePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        KeyboardOptions keyboardOptions2;
        int i5;
        KeyboardActions keyboardActions2;
        int i6;
        Object rememberedValue;
        Object rememberedValue2;
        boolean m1845equalsimpl0;
        int currentCompositeKeyHash;
        Composer m2937constructorimpl;
        FocusRequester focusRequester;
        int i7;
        String str;
        final MutableInteractionSource mutableInteractionSource;
        int i8;
        int m1898constructorimpl;
        int currentCompositeKeyHash2;
        Composer m2937constructorimpl2;
        boolean changed;
        Object rememberedValue3;
        int i9;
        int m1898constructorimpl2;
        Composer composer2;
        boolean z;
        TimePickerKt$TimePickerTextField$2$1 timePickerKt$TimePickerTextField$2$1;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-367523658);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimePickerTextField)P(3,7,4,6,5:c#material3.Selection,2,1)1574@60878L39,1575@60943L29,1576@61025L227,1582@61305L3266,1666@64609L103,1666@64577L135:TimePicker.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(timePickerState) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(i) ? 16384 : 8192;
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            keyboardOptions2 = keyboardOptions;
            i4 |= startRestartGroup.changed(keyboardOptions2) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
                keyboardActions2 = keyboardActions;
            } else {
                keyboardActions2 = keyboardActions;
                if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(keyboardActions2) ? 1048576 : 524288;
                }
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i4 |= startRestartGroup.changed(timePickerColors) ? 8388608 : 4194304;
            }
            i6 = i4;
            if ((4793491 & i6) == 4793490 || !startRestartGroup.getSkipping()) {
                KeyboardOptions keyboardOptions4 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                KeyboardActions keyboardActions4 = i5 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-367523658, i6, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1573)");
                }
                startRestartGroup.startReplaceableGroup(-525715937);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-525715872);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                FocusRequester focusRequester2 = (FocusRequester) rememberedValue2;
                startRestartGroup.endReplaceableGroup();
                final TextFieldColors m1727colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1727colors0hiis_0(timePickerColors.m2148timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m2147timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m2147timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
                m1845equalsimpl0 = Selection.m1845equalsimpl0(i, timePickerState.m2173getSelectionJiIwxys$material3_release());
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 896157841, "C1593@61737L202,1601@61949L2039,1652@64142L206,1659@64415L5,1661@64473L10,1648@63998L567:TimePicker.kt#uh7d8r");
                startRestartGroup.startReplaceableGroup(896157841);
                ComposerKt.sourceInformation(startRestartGroup, "1584@61372L320");
                if (m1845equalsimpl0) {
                    int i11 = i6 >> 3;
                    i8 = -1323940314;
                    mutableInteractionSource = mutableInteractionSource2;
                    focusRequester = focusRequester2;
                    str = "CC(remember):TimePicker.kt#9igjgp";
                    i7 = i6;
                    m2154TimeSelectoruXwN82Y(SizeKt.m613sizeVpY3zN4(Modifier.INSTANCE, TimeInputTokens.INSTANCE.m2832getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m2831getTimeFieldContainerHeightD9Ej5fM()), Selection.m1845equalsimpl0(i, Selection.INSTANCE.m1849getHourJiIwxys()) ? timePickerState.getHourForDisplay$material3_release() : timePickerState.getMinute(), timePickerState, i, timePickerColors, startRestartGroup, (i11 & 7168) | (i11 & 896) | 6 | ((i6 >> 9) & 57344));
                } else {
                    focusRequester = focusRequester2;
                    i7 = i6;
                    str = "CC(remember):TimePicker.kt#9igjgp";
                    mutableInteractionSource = mutableInteractionSource2;
                    i8 = -1323940314;
                }
                startRestartGroup.endReplaceableGroup();
                if (!Selection.m1845equalsimpl0(i, Selection.INSTANCE.m1850getMinuteJiIwxys())) {
                    Strings.Companion companion = Strings.INSTANCE;
                    m1898constructorimpl = Strings.m1898constructorimpl(R.string.m3c_time_picker_minute_text_field);
                } else {
                    Strings.Companion companion2 = Strings.INSTANCE;
                    m1898constructorimpl = Strings.m1898constructorimpl(R.string.m3c_time_picker_hour_text_field);
                }
                final String m1967getStringNWtq28 = Strings_androidKt.m1967getStringNWtq28(m1898constructorimpl, startRestartGroup, 0);
                Modifier visible = visible(Modifier.INSTANCE, m1845equalsimpl0);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(i8);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(visible);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m2937constructorimpl2 = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1694928322, "C1608@62285L92,1614@62579L7,1620@62848L11,1621@62912L11,1602@61995L1983:TimePicker.kt#uh7d8r");
                Modifier m613sizeVpY3zN4 = SizeKt.m613sizeVpY3zN4(FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester), TimeInputTokens.INSTANCE.m2832getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m2831getTimeFieldContainerHeightD9Ej5fM());
                startRestartGroup.startReplaceableGroup(-1694928032);
                String str2 = str;
                ComposerKt.sourceInformation(startRestartGroup, str2);
                changed = startRestartGroup.changed(m1967getStringNWtq28);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m1967getStringNWtq28);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier semantics$default = SemanticsModifierKt.semantics$default(m613sizeVpY3zN4, false, (Function1) rememberedValue3, 1, null);
                ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localTextStyle);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                i9 = i7;
                int i12 = i9 >> 3;
                int i13 = i9 << 3;
                FocusRequester focusRequester3 = focusRequester;
                BasicTextFieldKt.BasicTextField(textFieldValue, function1, semantics$default, true, false, (TextStyle) consume, keyboardOptions4, keyboardActions4, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, Brush.Companion.m3365verticalGradient8A3gB4$default(Brush.INSTANCE, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m3397boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getPrimary())), TuplesKt.to(Float.valueOf(0.9f), Color.m3397boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getPrimary())), TuplesKt.to(Float.valueOf(0.9f), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 2133555260, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer3, int i14) {
                        int i15;
                        ComposerKt.sourceInformation(composer3, "C1626@63104L860:TimePicker.kt#uh7d8r");
                        if ((i14 & 6) == 0) {
                            i15 = i14 | (composer3.changedInstance(function2) ? 4 : 2);
                        } else {
                            i15 = i14;
                        }
                        if ((i15 & 19) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2133555260, i15, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1626)");
                            }
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                            String text = TextFieldValue.this.getText();
                            VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                            PaddingValues m555PaddingValues0680j_4 = PaddingKt.m555PaddingValues0680j_4(Dp.m5734constructorimpl(0));
                            MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                            TextFieldColors textFieldColors = m1727colors0hiis_0;
                            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                            final TextFieldColors textFieldColors2 = m1727colors0hiis_0;
                            outlinedTextFieldDefaults.DecorationBox(text, function2, true, true, none, mutableInteractionSource3, false, null, null, null, null, null, null, null, textFieldColors, m555PaddingValues0680j_4, ComposableLambdaKt.composableLambda(composer3, -968963953, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i16) {
                                    ComposerKt.sourceInformation(composer4, "C1640@63838L5,1636@63592L332:TimePicker.kt#uh7d8r");
                                    if ((i16 & 3) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-968963953, i16, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1636)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m1726ContainerBoxnbWgWpA(true, false, MutableInteractionSource.this, textFieldColors2, ShapesKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer4, 6), 0.0f, 0.0f, composer4, 12583350, 96);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, ((i15 << 3) & 112) | 224640, 14352384, 16320);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), startRestartGroup, (i12 & 112) | (i12 & 14) | 100666368 | (i13 & 3670016) | (i13 & 29360128), 199680, 7696);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(androidx.compose.foundation.layout.OffsetKt.m523offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, SupportLabelTop, 1, null), new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                if (!Selection.m1845equalsimpl0(i, Selection.INSTANCE.m1849getHourJiIwxys())) {
                    Strings.Companion companion3 = Strings.INSTANCE;
                    m1898constructorimpl2 = Strings.m1898constructorimpl(R.string.m3c_time_picker_hour);
                } else {
                    Strings.Companion companion4 = Strings.INSTANCE;
                    m1898constructorimpl2 = Strings.m1898constructorimpl(R.string.m3c_time_picker_minute);
                }
                boolean z2 = true;
                TextKt.m2125Text4IGK_g(Strings_androidKt.m1967getStringNWtq28(m1898constructorimpl2, startRestartGroup, 0), clearAndSetSemantics, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextColor(), startRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimeInputTokens.INSTANCE.getTimeFieldSupportingTextFont()), startRestartGroup, 0, 0, 65528);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Selection m1842boximpl = Selection.m1842boximpl(timePickerState.m2173getSelectionJiIwxys$material3_release());
                composer2 = startRestartGroup;
                composer2.startReplaceableGroup(-525712206);
                ComposerKt.sourceInformation(composer2, str2);
                boolean z3 = (i9 & 7168) != 2048;
                if ((i9 & 57344) != 16384) {
                    z2 = false;
                }
                z = z3 | z2;
                Object rememberedValue4 = composer2.rememberedValue();
                if (!z || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    timePickerKt$TimePickerTextField$2$1 = new TimePickerKt$TimePickerTextField$2$1(timePickerState, i, focusRequester3, null);
                    composer2.updateRememberedValue(timePickerKt$TimePickerTextField$2$1);
                } else {
                    timePickerKt$TimePickerTextField$2$1 = rememberedValue4;
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(m1842boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) timePickerKt$TimePickerTextField$2$1, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                keyboardOptions3 = keyboardOptions4;
                keyboardActions3 = keyboardActions4;
            } else {
                startRestartGroup.skipToGroupEnd();
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i14) {
                        TimePickerKt.m2153TimePickerTextFieldlxUZ_iY(Modifier.this, textFieldValue, function1, timePickerState, i, keyboardOptions3, keyboardActions3, timePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        keyboardOptions2 = keyboardOptions;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        i6 = i4;
        if ((4793491 & i6) == 4793490) {
        }
        if (i10 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-525715937);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-525715872);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        FocusRequester focusRequester22 = (FocusRequester) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        final TextFieldColors m1727colors0hiis_02 = OutlinedTextFieldDefaults.INSTANCE.m1727colors0hiis_0(timePickerColors.m2148timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m2147timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m2147timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
        m1845equalsimpl0 = Selection.m1845equalsimpl0(i, timePickerState.m2173getSelectionJiIwxys$material3_release());
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
        Updater.m2944setimpl(m2937constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m2937constructorimpl.getInserting()) {
        }
        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        modifierMaterializerOf3.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 896157841, "C1593@61737L202,1601@61949L2039,1652@64142L206,1659@64415L5,1661@64473L10,1648@63998L567:TimePicker.kt#uh7d8r");
        startRestartGroup.startReplaceableGroup(896157841);
        ComposerKt.sourceInformation(startRestartGroup, "1584@61372L320");
        if (m1845equalsimpl0) {
        }
        startRestartGroup.endReplaceableGroup();
        if (!Selection.m1845equalsimpl0(i, Selection.INSTANCE.m1850getMinuteJiIwxys())) {
        }
        final String m1967getStringNWtq282 = Strings_androidKt.m1967getStringNWtq28(m1898constructorimpl, startRestartGroup, 0);
        Modifier visible2 = visible(Modifier.INSTANCE, m1845equalsimpl0);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(i8);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(visible2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2937constructorimpl2 = Updater.m2937constructorimpl(startRestartGroup);
        Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m2937constructorimpl2.getInserting()) {
        }
        m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1694928322, "C1608@62285L92,1614@62579L7,1620@62848L11,1621@62912L11,1602@61995L1983:TimePicker.kt#uh7d8r");
        Modifier m613sizeVpY3zN42 = SizeKt.m613sizeVpY3zN4(FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester), TimeInputTokens.INSTANCE.m2832getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m2831getTimeFieldContainerHeightD9Ej5fM());
        startRestartGroup.startReplaceableGroup(-1694928032);
        String str22 = str;
        ComposerKt.sourceInformation(startRestartGroup, str22);
        changed = startRestartGroup.changed(m1967getStringNWtq282);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m1967getStringNWtq282);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default2 = SemanticsModifierKt.semantics$default(m613sizeVpY3zN42, false, (Function1) rememberedValue3, 1, null);
        ProvidableCompositionLocal<TextStyle> localTextStyle2 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localTextStyle2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        i9 = i7;
        int i122 = i9 >> 3;
        int i132 = i9 << 3;
        FocusRequester focusRequester32 = focusRequester;
        BasicTextFieldKt.BasicTextField(textFieldValue, function1, semantics$default2, true, false, (TextStyle) consume2, keyboardOptions4, keyboardActions4, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, Brush.Companion.m3365verticalGradient8A3gB4$default(Brush.INSTANCE, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m3397boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getPrimary())), TuplesKt.to(Float.valueOf(0.9f), Color.m3397boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getPrimary())), TuplesKt.to(Float.valueOf(0.9f), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 2133555260, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer3, int i14) {
                int i15;
                ComposerKt.sourceInformation(composer3, "C1626@63104L860:TimePicker.kt#uh7d8r");
                if ((i14 & 6) == 0) {
                    i15 = i14 | (composer3.changedInstance(function2) ? 4 : 2);
                } else {
                    i15 = i14;
                }
                if ((i15 & 19) != 18 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2133555260, i15, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1626)");
                    }
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                    String text = TextFieldValue.this.getText();
                    VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                    PaddingValues m555PaddingValues0680j_4 = PaddingKt.m555PaddingValues0680j_4(Dp.m5734constructorimpl(0));
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    TextFieldColors textFieldColors = m1727colors0hiis_02;
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                    final TextFieldColors textFieldColors2 = m1727colors0hiis_02;
                    outlinedTextFieldDefaults.DecorationBox(text, function2, true, true, none, mutableInteractionSource3, false, null, null, null, null, null, null, null, textFieldColors, m555PaddingValues0680j_4, ComposableLambdaKt.composableLambda(composer3, -968963953, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i16) {
                            ComposerKt.sourceInformation(composer4, "C1640@63838L5,1636@63592L332:TimePicker.kt#uh7d8r");
                            if ((i16 & 3) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-968963953, i16, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1636)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m1726ContainerBoxnbWgWpA(true, false, MutableInteractionSource.this, textFieldColors2, ShapesKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer4, 6), 0.0f, 0.0f, composer4, 12583350, 96);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, ((i15 << 3) & 112) | 224640, 14352384, 16320);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), startRestartGroup, (i122 & 112) | (i122 & 14) | 100666368 | (i132 & 3670016) | (i132 & 29360128), 199680, 7696);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Modifier clearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(androidx.compose.foundation.layout.OffsetKt.m523offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, SupportLabelTop, 1, null), new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        });
        if (!Selection.m1845equalsimpl0(i, Selection.INSTANCE.m1849getHourJiIwxys())) {
        }
        boolean z22 = true;
        TextKt.m2125Text4IGK_g(Strings_androidKt.m1967getStringNWtq28(m1898constructorimpl2, startRestartGroup, 0), clearAndSetSemantics2, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextColor(), startRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimeInputTokens.INSTANCE.getTimeFieldSupportingTextFont()), startRestartGroup, 0, 0, 65528);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Selection m1842boximpl2 = Selection.m1842boximpl(timePickerState.m2173getSelectionJiIwxys$material3_release());
        composer2 = startRestartGroup;
        composer2.startReplaceableGroup(-525712206);
        ComposerKt.sourceInformation(composer2, str22);
        if ((i9 & 7168) != 2048) {
        }
        if ((i9 & 57344) != 16384) {
        }
        z = z3 | z22;
        Object rememberedValue42 = composer2.rememberedValue();
        if (z) {
        }
        timePickerKt$TimePickerTextField$2$1 = new TimePickerKt$TimePickerTextField$2$1(timePickerState, i, focusRequester32, null);
        composer2.updateRememberedValue(timePickerKt$TimePickerTextField$2$1);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(m1842boximpl2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) timePickerKt$TimePickerTextField$2$1, composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        keyboardOptions3 = keyboardOptions4;
        keyboardActions3 = keyboardActions4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularLayout-uFdPcIQ, reason: not valid java name */
    public static final void m2151CircularLayoutuFdPcIQ(Modifier modifier, final float f, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1548175696);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularLayout)P(1,2:c#ui.unit.Dp)1682@64971L1642,1680@64910L1703:TimePicker.kt#uh7d8r");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i3, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1679)");
            }
            startRestartGroup.startReplaceableGroup(1651957759);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TimePicker.kt#9igjgp");
            boolean z = (i3 & 112) == 32;
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, final long j) {
                        Measurable measurable;
                        Measurable measurable2;
                        final float f2 = measureScope.mo313toPx0680j_4(f);
                        long m5681copyZbe2FdA$default = Constraints.m5681copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i5 = 0;
                        for (int i6 = 0; i6 < size; i6++) {
                            Measurable measurable3 = list.get(i6);
                            Measurable measurable4 = measurable3;
                            if (LayoutIdKt.getLayoutId(measurable4) != LayoutId.Selector && LayoutIdKt.getLayoutId(measurable4) != LayoutId.InnerCircle) {
                                arrayList.add(measurable3);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        int size2 = arrayList2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            arrayList3.add(((Measurable) arrayList2.get(i7)).mo4678measureBRTryo0(m5681copyZbe2FdA$default));
                        }
                        final ArrayList arrayList4 = arrayList3;
                        int size3 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size3) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i8);
                            if (LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector) {
                                break;
                            }
                            i8++;
                        }
                        Measurable measurable5 = measurable;
                        int size4 = list.size();
                        while (true) {
                            if (i5 >= size4) {
                                measurable2 = null;
                                break;
                            }
                            measurable2 = list.get(i5);
                            if (LayoutIdKt.getLayoutId(measurable2) == LayoutId.InnerCircle) {
                                break;
                            }
                            i5++;
                        }
                        Measurable measurable6 = measurable2;
                        final float size5 = 6.2831855f / arrayList4.size();
                        Placeable mo4678measureBRTryo0 = measurable5 != null ? measurable5.mo4678measureBRTryo0(m5681copyZbe2FdA$default) : null;
                        final Placeable mo4678measureBRTryo02 = measurable6 != null ? measurable6.mo4678measureBRTryo0(m5681copyZbe2FdA$default) : null;
                        final Placeable placeable = mo4678measureBRTryo0;
                        return MeasureScope.layout$default(measureScope, Constraints.m5692getMinWidthimpl(j), Constraints.m5691getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Placeable placeable2 = Placeable.this;
                                if (placeable2 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList4;
                                long j2 = j;
                                float f3 = f2;
                                float f4 = size5;
                                int size6 = list2.size();
                                int i9 = 0;
                                while (i9 < size6) {
                                    Placeable placeable3 = list2.get(i9);
                                    double d = f3;
                                    double d2 = (i9 * f4) - 1.5707963267948966d;
                                    Placeable.PlacementScope.place$default(placementScope, placeable3, MathKt.roundToInt((Math.cos(d2) * d) + ((Constraints.m5690getMaxWidthimpl(j2) / 2) - (placeable3.getWidth() / 2))), MathKt.roundToInt((d * Math.sin(d2)) + ((Constraints.m5689getMaxHeightimpl(j2) / 2) - (placeable3.getHeight() / 2))), 0.0f, 4, null);
                                    i9++;
                                    list2 = list2;
                                    j2 = j2;
                                }
                                Placeable placeable4 = mo4678measureBRTryo02;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable4, (Constraints.m5692getMinWidthimpl(j) - mo4678measureBRTryo02.getWidth()) / 2, (Constraints.m5691getMinHeightimpl(j) - mo4678measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            int i5 = ((i3 >> 6) & 14) | ((i3 << 3) & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i6 = ((i5 << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    TimePickerKt.m2151CircularLayoutuFdPcIQ(Modifier.this, f, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* renamed from: numberContentDescription-YKJpE6Y, reason: not valid java name */
    public static final String m2159numberContentDescriptionYKJpE6Y(int i, boolean z, int i2, Composer composer, int i3) {
        int m1898constructorimpl;
        ComposerKt.sourceInformationMarkerStart(composer, 1826155772, "C(numberContentDescription)P(2:c#material3.Selection)1733@66988L21:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1826155772, i3, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1724)");
        }
        if (Selection.m1845equalsimpl0(i, Selection.INSTANCE.m1850getMinuteJiIwxys())) {
            Strings.Companion companion = Strings.INSTANCE;
            m1898constructorimpl = Strings.m1898constructorimpl(R.string.m3c_time_picker_minute_suffix);
        } else if (z) {
            Strings.Companion companion2 = Strings.INSTANCE;
            m1898constructorimpl = Strings.m1898constructorimpl(R.string.m3c_time_picker_hour_24h_suffix);
        } else {
            Strings.Companion companion3 = Strings.INSTANCE;
            m1898constructorimpl = Strings.m1898constructorimpl(R.string.m3c_time_picker_hour_suffix);
        }
        String m1968getStringiSCLEhQ = Strings_androidKt.m1968getStringiSCLEhQ(m1898constructorimpl, new Object[]{Integer.valueOf(i2)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m1968getStringiSCLEhQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Float, Float> valuesForAnimation(float f, float f2) {
        if (Math.abs(f - f2) <= 3.141592653589793d) {
            return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
        }
        double d = f;
        if (d > 3.141592653589793d && f2 < 3.141592653589793d) {
            f2 += FullCircle;
        } else if (d < 3.141592653589793d && f2 > 3.141592653589793d) {
            f += FullCircle;
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dist(float f, float f2, int i, int i2) {
        return (float) Math.hypot(i - f, i2 - f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float atan(float f, float f2) {
        float atan2 = ((float) Math.atan2(f, f2)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + FullCircle : atan2;
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

    static {
        float f = 24;
        ClockFaceBottomMargin = Dp.m5734constructorimpl(f);
        DisplaySeparatorWidth = Dp.m5734constructorimpl(f);
        TimeInputBottomPadding = Dp.m5734constructorimpl(f);
        List<Integer> listOf = CollectionsKt.listOf((Object[]) new Integer[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        Hours = listOf;
        ArrayList arrayList = new ArrayList(listOf.size());
        int size = listOf.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf((listOf.get(i).intValue() % 12) + 12));
        }
        ExtraHours = arrayList;
        PeriodToggleMargin = Dp.m5734constructorimpl(12);
    }
}
